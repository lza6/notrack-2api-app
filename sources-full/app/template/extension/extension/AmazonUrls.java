package app.template.extension.extension;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonUrls {
    private static final Pattern ASIN_PATH;
    private static final String[] ASSET_DOMAINS;
    private static final Map<String, String> MARKETPLACES;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("amazon.com", "us");
        linkedHashMap.put("amazon.co.uk", "uk");
        linkedHashMap.put("amazon.de", "de");
        linkedHashMap.put("amazon.fr", "fr");
        linkedHashMap.put("amazon.co.jp", "jp");
        linkedHashMap.put("amazon.ca", "ca");
        linkedHashMap.put("amazon.it", "it");
        linkedHashMap.put("amazon.es", "es");
        linkedHashMap.put("amazon.in", "in");
        linkedHashMap.put("amazon.nl", "nl");
        linkedHashMap.put("amazon.se", "se");
        linkedHashMap.put("amazon.pl", "pl");
        linkedHashMap.put("amazon.ie", "ie");
        linkedHashMap.put("amazon.ae", "ae");
        linkedHashMap.put("amazon.sa", "sa");
        linkedHashMap.put("amazon.eg", "eg");
        linkedHashMap.put("amazon.sg", "sg");
        linkedHashMap.put("amazon.com.au", "au");
        linkedHashMap.put("amazon.com.br", "br");
        linkedHashMap.put("amazon.com.mx", "mx");
        linkedHashMap.put("amazon.com.be", "be");
        linkedHashMap.put("amazon.com.tr", "tr");
        MARKETPLACES = Collections.unmodifiableMap(linkedHashMap);
        ASSET_DOMAINS = new String[]{"media-amazon.com", "ssl-images-amazon.com"};
        ASIN_PATH = Pattern.compile("/(?:dp|gp/product|gp/aw/d)/([A-Za-z0-9]{10})(?![A-Za-z0-9])");
    }

    private AmazonUrls() {
    }

    public static String canonicalProductUrl(String str) {
        String strMarketplaceDomain;
        String strProductAsin = productAsin(str);
        if (strProductAsin == null || (strMarketplaceDomain = marketplaceDomain(webHost(str))) == null) {
            return null;
        }
        return "https://www." + strMarketplaceDomain + "/dp/" + strProductAsin;
    }

    public static boolean isAmazonHost(String str) {
        if (str == null) {
            return false;
        }
        if (marketplaceDomain(str) != null) {
            return true;
        }
        for (String str2 : ASSET_DOMAINS) {
            if (matches(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTrustedAmazonUrl(String str) {
        return isAmazonHost(webHost(str));
    }

    public static String marketplaceCode(String str) {
        String strMarketplaceDomain = marketplaceDomain(str);
        if (strMarketplaceDomain == null) {
            return null;
        }
        return MARKETPLACES.get(strMarketplaceDomain);
    }

    public static String marketplaceDomain(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : MARKETPLACES.keySet()) {
            if (matches(str, str2)) {
                return str2;
            }
        }
        return null;
    }

    private static boolean matches(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(".");
        sb.append(str2);
        return str.endsWith(sb.toString());
    }

    public static String productAsin(String str) {
        if (!isAmazonHost(webHost(str))) {
            return null;
        }
        try {
            String path = new URI(str.trim()).getPath();
            if (path == null) {
                return null;
            }
            Matcher matcher = ASIN_PATH.matcher(path);
            if (matcher.find()) {
                return matcher.group(1).toUpperCase(Locale.ROOT);
            }
            return null;
        } catch (URISyntaxException unused) {
        }
    }

    public static String webHost(String str) {
        String scheme;
        String host;
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            URI uri = new URI(strTrim);
            if (!uri.isAbsolute() || uri.isOpaque() || (scheme = uri.getScheme()) == null) {
                return null;
            }
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if ((!lowerCase.equals("http") && !lowerCase.equals("https")) || uri.getRawUserInfo() != null || (host = uri.getHost()) == null) {
                return null;
            }
            String lowerCase2 = host.toLowerCase(Locale.ROOT);
            while (lowerCase2.endsWith(".")) {
                lowerCase2 = lowerCase2.substring(0, lowerCase2.length() - 1);
            }
            if (lowerCase2.isEmpty()) {
                return null;
            }
            return lowerCase2;
        } catch (URISyntaxException unused) {
        }
        return null;
    }
}
