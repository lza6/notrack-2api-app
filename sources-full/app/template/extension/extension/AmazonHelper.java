package app.template.extension.extension;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AmazonHelper {
    private static final String[] AD_SELECTORS = {".a-cardui[class*=\"_new-detail-faceout-box_\"]:has(.dynamicSponsoredLabelClass)", ".a-carousel-card:has(.p13n-sc-sponsored-label)", ".amzn-safe-frame-container", ".ape-wrapper", ".dp-widget-card-deck:has([data-ad-placement-metadata])", ".s-result-item.AdHolder", ".s-result-item:has([data-ad-feedback])", ".s-result-item:has([data-ad-feedback-label-id])", ".s-result-item:has(.puis-sponsored-label-text)", ".s-result-item:has(div[cel_widget_id^=\"MAIN-FEATURED_ASINS_LIST-\"])", ".s-result-list > .a-section:has(.sbv-ad-content-container)", ".p13n-sc-unified-ad-label", ".sbv-video-single-product", ".sponsored-products-detail-mobile", "#detailILM_feature_div", "#faceoutContainer:has(> [class$=\"sponsored-label\"])", "#mobile-mshop-ad", "#nav-swmslot", "#sc-rec-bottom", "#sc-rec-right", "#similarities_feature_div:has(span.sponsored_label_tap_space)", "#sponsoredProducts2_feature_div", "#sponsoredProducts_feature_div", "#sponsored-proofPoint-section", "#typ-recommendations-stripe-1", "#typ-recommendations-stripe-2", "#widget-rightUpsellSlot", ".AdsCard_container__K6vmo", "[cel_widget_id*=\"-creative-desktop_loom-desktop-\"]", "[class*=\"_adFeedbackWrapper_\"]", "[data-ad-id]", "[data-component-type^=\"aspa-asin-ajax\"]", "[id^=\"ape_\"]", "[id^=\"mobile-dp-ilm\"]", "div.s-inner-result-item > div.sg-col-inner:has(a.puis-sponsored-label-text)", "div[cel_widget_id*=\"_ad-placements-\"]", "div[cel_widget_id*=\"Deals3Ads\"]", "div[cel_widget_id*=\"desktop-dp-\"]", "div[cel_widget_id=\"sp-orderdetails-desktop-carousel_desktop-yo-orderdetails_0\"]", "div[cel_widget_id=\"sp-orderdetails-mobile-list_mobile-yo-orderdetails_0\"]", "div[cel_widget_id=\"sp-pop-mobile-carousel_mobile-yo-postdelivery_0\"]", "div[cel_widget_id=\"sp-rhf-desktop-carousel_desktop-rhf_0\"]", "div[cel_widget_id=\"sp-shiptrack-desktop-carousel_desktop-yo-shiptrack_0\"]", "div[cel_widget_id=\"sp-shiptrack-mobile-list_mobile-yo-shiptrack_0\"]", "div[cel_widget_id=\"sp-typ-mobile-carousel_mobile-typ-carousels_2\"]", "div[cel_widget_id=\"sp_phone_detail_thematic\"]", "div[cel_widget_id=\"typ-ads\"]", "div[cel_widget_id^=\"LEFT-SAFE_FRAME-\"]", "div[cel_widget_id^=\"MAIN-FEATURED_ASINS_LIST-\"]", "div[cel_widget_id^=\"MAIN-VIDEO_SINGLE_PRODUCT-\"]", "div[cel_widget_id^=\"adplacements:\"]", "div[cel_widget_id^=\"multi-brand-\"]", "div[cel_widget_id^=\"sb-\"]", "div[cel_widget_id^=\"sb-themed-collection\"]", "div[cel_widget_id^=\"sp-desktop-carousel_handsfree-browse\"]", "div[cel_widget_id^=\"sp-mobile-thematic-bundle\"]", "div[class*=\"SponsoredProducts\"]", "div[class*=\"_dpNoOverflow_\"][data-idt]", "div[data-a-carousel-options*='\"isSponsoredProduct\":\"true\"']", "div[data-cel-widget*=\"-mobile_loom-mobile-inline-slot\"]", "div[data-cel-widget=\"sp-rhf-desktop-carousel_desktop-rhf_1\"]", "div[data-cel-widget=\"sp-shiptrack-desktop-carousel_desktop-yo-shiptrack_0\"]", "div[data-cel-widget^=\"mobile-ads-\"]", "div[data-cel-widget^=\"multi-brand-video-mobile_DPSims_\"]", "div[data-cel-widget^=\"multi-brand-video-mobile_DetailPage_\"]", "div[data-cel-widget^=\"multi-card-creative-desktop_loom-desktop-top-slot_\"]", "div[data-cel-widget^=\"sb-\"]", "div[data-cel-widget^=\"sp-mobile-thematic-bundle\"]", "div[data-csa-c-painter=\"single-creative-card\"]:has([data-ad-feedback-label-id])", "div[data-csa-c-painter=\"single-video-card\"]:has([data-ad-feedback-label-id])", "div[data-csa-c-painter=\"sp-cart-mobile-carousel-cards\"]", "div[data-csa-c-slot-id^=\"loom-mobile-brand-footer-slot_hsa-id-\"]", "div[data-csa-c-slot-id^=\"loom-mobile-top-slot_hsa-id-\"]", "li.gwm-window-tile:has(div[data-csa-c-painter=\"single-creative-card\"] [data-ad-feedback-label-id])", "li.gwm-window-tile:has(div[data-csa-c-painter=\"single-video-card\"] [data-ad-feedback-label-id])", "div[id^=\"sims-simsContainer_feature_div_\"]:has(.sp_info_link)", "div[id^=\"sp_detail\"]", "span[cel_widget_id^=\"MAIN-FEATURED_ASINS_LIST-\"]", "span[cel_widget_id^=\"MAIN-loom-desktop-brand-footer-slot_hsa-id-CARDS-\"]", "span[cel_widget_id^=\"MAIN-loom-desktop-top-slot_hsa-id-CARDS-\"]", "#sims-fbt-content", "#sims-fbt", "div[cel_widget_id*=\"fbt\"]", "div[data-cel-widget*=\"fbt\"]", "[cel_widget_id^=\"MAIN-sims-fbt\"]"};
    private static final Set<String> CCC_CODES;
    private static final Map<String, String> CCC_PNG;
    private static final String DARK_FIX_CSS = "[class*=image-container] img{mix-blend-mode:normal!important}img[style*=\"mix-blend-mode\"]{mix-blend-mode:normal!important}[class*=asin-metadata]{mix-blend-mode:normal!important}html{background-color:#1a1a1a!important}body{background-color:#1a1a1a!important}[class*=asin-container],[class*=asin-image-wrapper]{background-color:white!important}[class*=badgeMessage]{background-color:transparent!important}.a-button-primary,.a-button-oneclick{color-scheme:only light!important}";
    private static final Map<String, Integer> KEEPA_IDS;
    private static final List<String> PERIODS;
    private static final Map<String, String> PERIOD_LABELS;
    private static final Map<String, Integer> PERIOD_RANGES;
    private static final String[] PLACEMENT_TARGETS;
    private static final String PRICE_HISTORY_JS = "function(cfg){var ID='morphe-price-history';var ASIN_RE=new RegExp('/(?:dp|gp/product|gp/aw/d)/([A-Za-z0-9]{10})(?![A-Za-z0-9])');function toLink(a,label){if(!a.querySelector('img'))return;a.textContent='Open price history on '+label;a.style.cssText='font-size:13px;color:#0066c0;text-decoration:underline';}function keepaChart(asin,period){if(!cfg.keepa)return null;var range=cfg.keepa.ranges[period];return cfg.keepa.chart+asin+(range?'&range='+range:'');}function camelChart(asin,period){if(!cfg.camel)return null;return cfg.camel.chart+asin+'/'+cfg.camel.png+'.png?force=1&legend=1&w='+cfg.camel.width+'&h=400'+cfg.camel.zero+'&tp='+period;}function addChart(parent,label,href,chartUrl,asin){var wrap=document.createElement('div');wrap.style.marginBottom='8px';var cap=document.createElement('div');cap.style.cssText='font-size:12px;color:#666;margin-bottom:4px';cap.textContent=label;wrap.appendChild(cap);var a=document.createElement('a');a.href=href;a.target='_blank';a.rel='noopener noreferrer';var img=document.createElement('img');img.referrerPolicy='no-referrer';img.style.cssText='width:100%;height:auto;border-radius:4px';img.onerror=function(){toLink(a,label);};img.src=chartUrl(asin,cfg.period)+'&t='+Date.now();a.appendChild(img);wrap.appendChild(a);parent.appendChild(wrap);if(cfg.showToggle&&cfg.periods.length){var row=document.createElement('div');row.style.marginTop='4px';cfg.periods.forEach(function(p){var b=document.createElement('button');b.type='button';b.textContent=p.label;b.style.cssText='margin-right:6px;padding:2px 8px;border:1px solid #ccc;border-radius:3px;background:#fff;font-size:11px;color:#333;cursor:pointer';b.onclick=function(){img.onerror=function(){toLink(a,label);};img.src=chartUrl(asin,p.value)+'&t='+Date.now();};row.appendChild(b);});wrap.appendChild(row);}}function loadCharts(parent,asin){if(cfg.keepa)addChart(parent,'Keepa',cfg.keepa.link+asin,keepaChart,asin);if(cfg.camel)addChart(parent,'CamelCamelCamel',cfg.camel.link+asin,camelChart,asin);}function place(box){for(var i=0;i<cfg.targets.length;i++){var el=document.querySelector(cfg.targets[i]);if(el&&el.parentNode){el.parentNode.insertBefore(box,el.nextSibling);return true;}}return false;}function build(asin){var old=document.getElementById(ID);if(old&&old.getAttribute('data-asin')===asin)return;if(old)old.remove();var box=document.createElement(cfg.collapsed?'details':'div');box.id=ID;box.setAttribute('data-asin',asin);box.style.cssText='margin:16px 0;padding:12px;border:1px solid #ddd;border-radius:8px;background:#fafafa';var head=document.createElement(cfg.collapsed?'summary':'div');head.style.cssText='font-weight:bold;font-size:14px;color:#333'+(cfg.collapsed?';cursor:pointer':';margin-bottom:8px');head.textContent='Price History';box.appendChild(head);var note=document.createElement('div');note.style.cssText='font-size:12px;color:#666;margin:6px 0';note.textContent=cfg.notice;box.appendChild(note);var charts=document.createElement('div');var btn=document.createElement('button');btn.type='button';btn.textContent=cfg.loadLabel;btn.style.cssText='padding:6px 12px;border:1px solid #ccc;border-radius:4px;background:#fff;font-size:13px;color:#333;cursor:pointer';btn.onclick=function(){btn.remove();loadCharts(charts,asin);};box.appendChild(btn);box.appendChild(charts);if(!place(box)){var fb=document.getElementById('dp')||document.getElementById('ppd');if(fb)fb.appendChild(box);else{var obs=new MutationObserver(function(_,o){if(place(box))o.disconnect();});obs.observe(document.body||document.documentElement,{childList:true,subtree:true});setTimeout(function(){obs.disconnect();if(!box.parentNode)document.body.appendChild(box);},10000);}}}function currentAsin(){var m=window.location.pathname.match(ASIN_RE);return m?m[1].toUpperCase():null;}build(currentAsin()||cfg.asin);if(!window.__morphePriceHistoryNav){window.__morphePriceHistoryNav=true;var onNav=function(){var a=currentAsin();if(a)build(a);};var ps=history.pushState,rs=history.replaceState;history.pushState=function(){ps.apply(this,arguments);setTimeout(onNav,0);};history.replaceState=function(){rs.apply(this,arguments);setTimeout(onNav,0);};window.addEventListener('popstate',onNav);}}";
    private static volatile String adCss;

    static {
        HashMap map = new HashMap();
        KEEPA_IDS = map;
        map.put("us", 1);
        map.put("uk", 2);
        map.put("de", 3);
        map.put("fr", 4);
        map.put("jp", 5);
        map.put("ca", 6);
        map.put("it", 8);
        map.put("es", 9);
        map.put("in", 10);
        map.put("mx", 11);
        map.put("br", 12);
        map.put("nl", 14);
        CCC_CODES = new LinkedHashSet(Arrays.asList("us", "uk", "de", "fr", "jp", "ca", "it", "es", "au"));
        PERIODS = Arrays.asList("1m", "6m", "1y", "3y", "5y", "all");
        HashMap map2 = new HashMap();
        PERIOD_LABELS = map2;
        HashMap map3 = new HashMap();
        PERIOD_RANGES = map3;
        map2.put("1m", "1M");
        map2.put("6m", "6M");
        map2.put("1y", "1Y");
        map2.put("3y", "3Y");
        map2.put("5y", "5Y");
        map2.put("all", "ALL");
        map3.put("1m", 30);
        map3.put("6m", 180);
        map3.put("1y", 365);
        map3.put("3y", 1095);
        map3.put("5y", 1826);
        HashMap map4 = new HashMap();
        CCC_PNG = map4;
        map4.put("new_used", "amazon-new-used");
        map4.put("new", "amazon-new");
        map4.put("used", "amazon-used");
        PLACEMENT_TARGETS = new String[]{"#buyBoxAccordion", "#corePriceDisplay_desktop_feature_div", "#corePrice_feature_div", "#unifiedPrice_feature_div", "#mobileapp_buybox_feature_div", "#desktop_buybox", "#buybox", "#price_feature_div", "#newAccordionRow", "#productOverview_feature_div", "#centerCol", "#mobileapp_accordion_feature_div", "#apex_mobile", "#apex_desktop", "[id^=corePrice]"};
    }

    private static String adCss() {
        String str = adCss;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : AD_SELECTORS) {
            String strTrim = str2.trim();
            if (!strTrim.isEmpty() && strTrim.indexOf(123) < 0 && strTrim.indexOf(125) < 0 && strTrim.indexOf(59) < 0 && strTrim.indexOf(64) < 0 && !strTrim.contains("/*") && !strTrim.contains("*/")) {
                sb.append(strTrim);
                sb.append("{display:none!important}");
            }
        }
        String string = sb.toString();
        adCss = string;
        return string;
    }

    public static void injectAdBlock(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript("(function(css){var id='morphe-amazon-ads';var s=document.getElementById(id);if(!s){s=document.createElement('style');s.id=id;(document.head||document.documentElement).appendChild(s);}s.textContent=css;})(" + jsonString(adCss()) + ");", null);
    }

    public static void injectDarkMode(WebView webView, String str) {
        if (webView == null || !isDarkEnabled(str, webView)) {
            return;
        }
        webView.evaluateJavascript("(function(css){var id='morphe-amazon-dark';var s=document.getElementById(id);if(!s){s=document.createElement('style');s.id=id;(document.head||document.documentElement).appendChild(s);}s.textContent=css;})(" + jsonString(DARK_FIX_CSS) + ");", null);
    }

    public static void injectPriceCharts(WebView webView, String str, String str2) {
        String strProductAsin;
        String strMarketplaceCode;
        String str3;
        if (webView == null || (strProductAsin = AmazonUrls.productAsin(str)) == null || (strMarketplaceCode = AmazonUrls.marketplaceCode(AmazonUrls.webHost(str))) == null) {
            return;
        }
        String[] strArrSplit = str2 == null ? new String[0] : str2.split("\\|", -1);
        String strOneOf = oneOf(part(strArrSplit, 0), PERIODS, "1y");
        boolean z = !"0".equals(part(strArrSplit, 1));
        String strOneOf2 = oneOf(part(strArrSplit, 3), Arrays.asList("new", "new_used", "all"), "all");
        String strOneOf3 = oneOf(part(strArrSplit, 4), Arrays.asList("new_used", "new", "used"), "new_used");
        boolean zEquals = "1".equals(part(strArrSplit, 5));
        String strOneOf4 = oneOf(part(strArrSplit, 6), Arrays.asList("500", "625", "750"), "625");
        boolean z2 = !"0".equals(part(strArrSplit, 7));
        Integer num = KEEPA_IDS.get(strMarketplaceCode);
        boolean zContains = CCC_CODES.contains(strMarketplaceCode);
        if (num != null || zContains) {
            ArrayList arrayList = new ArrayList();
            if (num != null) {
                arrayList.add("Keepa");
            }
            if (zContains) {
                arrayList.add("CamelCamelCamel");
            }
            StringBuilder sb = new StringBuilder("{\"asin\":");
            sb.append(jsonString(strProductAsin));
            sb.append(",\"period\":");
            sb.append(jsonString(strOneOf));
            sb.append(",\"showToggle\":");
            sb.append(z);
            sb.append(",\"collapsed\":");
            sb.append(z2);
            sb.append(",\"periods\":");
            sb.append(periodsJson(part(strArrSplit, 2)));
            sb.append(",\"targets\":");
            sb.append(jsonArray(PLACEMENT_TARGETS));
            sb.append(",\"loadLabel\":");
            sb.append(jsonString("Load price history"));
            sb.append(",\"notice\":");
            StringBuilder sb2 = new StringBuilder("Price history is not loaded. Loading it requests charts directly from ");
            sb2.append(join(arrayList, " and "));
            sb2.append(", which shares this product's ASIN with ");
            sb2.append(arrayList.size() > 1 ? "those providers." : "that provider.");
            sb.append(jsonString(sb2.toString()));
            if (num != null) {
                sb.append(",\"keepa\":{\"chart\":");
                StringBuilder sb3 = new StringBuilder("https://graph.keepa.com/pricehistory.png?new=1&used=");
                sb3.append("new".equals(strOneOf2) ? "0" : "1");
                sb3.append("&amazon=");
                sb3.append("all".equals(strOneOf2) ? "1" : "0");
                sb3.append("&domain=");
                sb3.append(strMarketplaceCode);
                sb3.append("&asin=");
                sb.append(jsonString(sb3.toString()));
                sb.append(",\"link\":");
                sb.append(jsonString("https://keepa.com/#!product/" + num + "-"));
                sb.append(",\"ranges\":");
                sb.append(rangesJson());
                sb.append("}");
            } else {
                sb.append(",\"keepa\":null");
            }
            if (zContains) {
                sb.append(",\"camel\":{\"chart\":");
                sb.append(jsonString("https://charts.camelcamelcamel.com/" + strMarketplaceCode + "/"));
                sb.append(",\"link\":");
                StringBuilder sb4 = new StringBuilder("https://");
                boolean zEquals2 = "us".equals(strMarketplaceCode);
                String str4 = BuildConfig.VERSION_NAME;
                if (zEquals2) {
                    str3 = BuildConfig.VERSION_NAME;
                } else {
                    str3 = strMarketplaceCode + ".";
                }
                sb4.append(str3);
                sb4.append("camelcamelcamel.com/product/");
                sb.append(jsonString(sb4.toString()));
                sb.append(",\"png\":");
                sb.append(jsonString(CCC_PNG.get(strOneOf3)));
                sb.append(",\"width\":");
                sb.append(jsonString(strOneOf4));
                sb.append(",\"zero\":");
                if (zEquals) {
                    str4 = "&zero=0";
                }
                sb.append(jsonString(str4));
                sb.append("}");
            } else {
                sb.append(",\"camel\":null");
            }
            sb.append("}");
            webView.evaluateJavascript("(function(cfg){var ID='morphe-price-history';var ASIN_RE=new RegExp('/(?:dp|gp/product|gp/aw/d)/([A-Za-z0-9]{10})(?![A-Za-z0-9])');function toLink(a,label){if(!a.querySelector('img'))return;a.textContent='Open price history on '+label;a.style.cssText='font-size:13px;color:#0066c0;text-decoration:underline';}function keepaChart(asin,period){if(!cfg.keepa)return null;var range=cfg.keepa.ranges[period];return cfg.keepa.chart+asin+(range?'&range='+range:'');}function camelChart(asin,period){if(!cfg.camel)return null;return cfg.camel.chart+asin+'/'+cfg.camel.png+'.png?force=1&legend=1&w='+cfg.camel.width+'&h=400'+cfg.camel.zero+'&tp='+period;}function addChart(parent,label,href,chartUrl,asin){var wrap=document.createElement('div');wrap.style.marginBottom='8px';var cap=document.createElement('div');cap.style.cssText='font-size:12px;color:#666;margin-bottom:4px';cap.textContent=label;wrap.appendChild(cap);var a=document.createElement('a');a.href=href;a.target='_blank';a.rel='noopener noreferrer';var img=document.createElement('img');img.referrerPolicy='no-referrer';img.style.cssText='width:100%;height:auto;border-radius:4px';img.onerror=function(){toLink(a,label);};img.src=chartUrl(asin,cfg.period)+'&t='+Date.now();a.appendChild(img);wrap.appendChild(a);parent.appendChild(wrap);if(cfg.showToggle&&cfg.periods.length){var row=document.createElement('div');row.style.marginTop='4px';cfg.periods.forEach(function(p){var b=document.createElement('button');b.type='button';b.textContent=p.label;b.style.cssText='margin-right:6px;padding:2px 8px;border:1px solid #ccc;border-radius:3px;background:#fff;font-size:11px;color:#333;cursor:pointer';b.onclick=function(){img.onerror=function(){toLink(a,label);};img.src=chartUrl(asin,p.value)+'&t='+Date.now();};row.appendChild(b);});wrap.appendChild(row);}}function loadCharts(parent,asin){if(cfg.keepa)addChart(parent,'Keepa',cfg.keepa.link+asin,keepaChart,asin);if(cfg.camel)addChart(parent,'CamelCamelCamel',cfg.camel.link+asin,camelChart,asin);}function place(box){for(var i=0;i<cfg.targets.length;i++){var el=document.querySelector(cfg.targets[i]);if(el&&el.parentNode){el.parentNode.insertBefore(box,el.nextSibling);return true;}}return false;}function build(asin){var old=document.getElementById(ID);if(old&&old.getAttribute('data-asin')===asin)return;if(old)old.remove();var box=document.createElement(cfg.collapsed?'details':'div');box.id=ID;box.setAttribute('data-asin',asin);box.style.cssText='margin:16px 0;padding:12px;border:1px solid #ddd;border-radius:8px;background:#fafafa';var head=document.createElement(cfg.collapsed?'summary':'div');head.style.cssText='font-weight:bold;font-size:14px;color:#333'+(cfg.collapsed?';cursor:pointer':';margin-bottom:8px');head.textContent='Price History';box.appendChild(head);var note=document.createElement('div');note.style.cssText='font-size:12px;color:#666;margin:6px 0';note.textContent=cfg.notice;box.appendChild(note);var charts=document.createElement('div');var btn=document.createElement('button');btn.type='button';btn.textContent=cfg.loadLabel;btn.style.cssText='padding:6px 12px;border:1px solid #ccc;border-radius:4px;background:#fff;font-size:13px;color:#333;cursor:pointer';btn.onclick=function(){btn.remove();loadCharts(charts,asin);};box.appendChild(btn);box.appendChild(charts);if(!place(box)){var fb=document.getElementById('dp')||document.getElementById('ppd');if(fb)fb.appendChild(box);else{var obs=new MutationObserver(function(_,o){if(place(box))o.disconnect();});obs.observe(document.body||document.documentElement,{childList:true,subtree:true});setTimeout(function(){obs.disconnect();if(!box.parentNode)document.body.appendChild(box);},10000);}}}function currentAsin(){var m=window.location.pathname.match(ASIN_RE);return m?m[1].toUpperCase():null;}build(currentAsin()||cfg.asin);if(!window.__morphePriceHistoryNav){window.__morphePriceHistoryNav=true;var onNav=function(){var a=currentAsin();if(a)build(a);};var ps=history.pushState,rs=history.replaceState;history.pushState=function(){ps.apply(this,arguments);setTimeout(onNav,0);};history.replaceState=function(){rs.apply(this,arguments);setTimeout(onNav,0);};window.addEventListener('popstate',onNav);}})(" + ((Object) sb) + ");", null);
        }
    }

    private static boolean isDarkEnabled(String str, View view) {
        if ("on".equals(str)) {
            return true;
        }
        return "follow_system".equals(str) && view != null && (view.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static String join(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    private static String jsonArray(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(jsonString(strArr[i]));
        }
        sb.append("]");
        return sb.toString();
    }

    private static String jsonString(String str) {
        if (str == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '<' || cCharAt == '>' || cCharAt == '&' || cCharAt == '\'' || cCharAt == 8232 || cCharAt == 8233) {
                sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append("\"");
        return sb.toString();
    }

    private static String oneOf(String str, List<String> list, String str2) {
        return (str == null || !list.contains(str)) ? str2 : str;
    }

    public static boolean openExternally(WebView webView, String str) {
        String strWebHost;
        if (webView == null || (strWebHost = AmazonUrls.webHost(str)) == null) {
            return true;
        }
        if (AmazonUrls.isAmazonHost(strWebHost)) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str.trim()));
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setFlags(268435456);
            webView.getContext().startActivity(intent);
        } catch (Exception unused) {
        }
        return true;
    }

    private static String part(String[] strArr, int i) {
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    private static String periodsJson(String str) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        if (str != null) {
            for (String str2 : str.split(",")) {
                String strTrim = str2.trim();
                if (PERIODS.contains(strTrim)) {
                    linkedHashSet.add(strTrim);
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            linkedHashSet.addAll(PERIODS);
        }
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (String str3 : linkedHashSet) {
            if (!z) {
                sb.append(",");
            }
            sb.append("{\"label\":");
            sb.append(jsonString(PERIOD_LABELS.get(str3)));
            sb.append(",\"value\":");
            sb.append(jsonString(str3));
            sb.append("}");
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    private static String rangesJson() {
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Map.Entry<String, Integer> entry : PERIOD_RANGES.entrySet()) {
            if (!z) {
                sb.append(",");
            }
            sb.append(jsonString(entry.getKey()));
            sb.append(":");
            sb.append(entry.getValue());
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    public static String sanitizeAmazonUrl(String str) {
        String strCanonicalProductUrl = AmazonUrls.canonicalProductUrl(str);
        return strCanonicalProductUrl != null ? strCanonicalProductUrl : str;
    }

    public static void tintTabIconIfDark(ImageView imageView, String str) {
        if (imageView == null || !isDarkEnabled(str, imageView)) {
            return;
        }
        imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }
}
