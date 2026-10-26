package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qa2 {
    public static final Set g = Collections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = Collections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set i = Collections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final qn0 a;
    public final zf3 b;
    public final ArrayList c = new ArrayList(0);
    public rj1 d = new rj1(BuildConfig.VERSION_NAME, 0, Collections.EMPTY_MAP, null);
    public boolean e;
    public boolean f;

    public qa2(qn0 qn0Var, zf3 zf3Var) {
        this.a = qn0Var;
        this.b = zf3Var;
    }

    public static Map a(l14 l14Var) {
        kn knVar = l14Var.j;
        int i2 = knVar.c;
        if (i2 <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(i2);
        int i3 = 0;
        while (true) {
            if (!(i3 < knVar.c)) {
                return Collections.unmodifiableMap(map);
            }
            String str = knVar.h[i3];
            String str2 = knVar.d[i3];
            if (str == null) {
                str = BuildConfig.VERSION_NAME;
            }
            in inVar = new in();
            if (str2 == null) {
                u41.k("Object must not be null");
                return null;
            }
            inVar.c = str2.trim();
            if (str2.length() == 0) {
                u41.k("String must not be empty");
                return null;
            }
            inVar.d = str;
            inVar.h = knVar;
            i3++;
            map.put(inVar.c.toLowerCase(Locale.US), inVar.d);
        }
    }
}
