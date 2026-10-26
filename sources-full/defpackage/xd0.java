package defpackage;

import app.template.extension.BuildConfig;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class xd0 {
    public static final u43 a = new u43("^ {0,3}(`{3,}|~{3,})\\s*([^`\\s]*)[^`]*$");
    public static final Map b = y92.T(new ps2("js", "javascript"), new ps2("py", "python"), new ps2("sh", "bash"), new ps2("yml", "yaml"), new ps2("md", "markdown"), new ps2("kt", "kotlin"), new ps2("rs", "rust"), new ps2("cs", "c#"), new ps2("cpp", "c++"), new ps2("rb", "ruby"));
    public static final Map c = y92.T(new ps2("html", "html"), new ps2("htm", "html"), new ps2("css", "css"), new ps2("javascript", "js"), new ps2("js", "js"), new ps2("jsx", "jsx"), new ps2("typescript", "ts"), new ps2("ts", "ts"), new ps2("tsx", "tsx"), new ps2("json", "json"), new ps2("python", "py"), new ps2("py", "py"), new ps2("bash", "sh"), new ps2("sh", "sh"), new ps2("shell", "sh"), new ps2("zsh", "sh"), new ps2("php", "php"), new ps2("java", "java"), new ps2("kotlin", "kt"), new ps2("kt", "kt"), new ps2("swift", "swift"), new ps2("go", "go"), new ps2("rust", "rs"), new ps2("rs", "rs"), new ps2("c", "c"), new ps2("c++", "cpp"), new ps2("cpp", "cpp"), new ps2("c#", "cs"), new ps2("cs", "cs"), new ps2("csharp", "cs"), new ps2("ruby", "rb"), new ps2("rb", "rb"), new ps2("sql", "sql"), new ps2("xml", "xml"), new ps2("svg", "svg"), new ps2("yaml", "yml"), new ps2("yml", "yml"), new ps2("markdown", "md"), new ps2("md", "md"), new ps2("lua", "lua"), new ps2("dart", "dart"), new ps2("r", "r"), new ps2("vue", "vue"), new ps2("toml", "toml"), new ps2("ini", "ini"), new ps2("csv", "csv"), new ps2("text", "txt"), new ps2("txt", "txt"), new ps2("plaintext", "txt"));
    public static final u43 d = new u43("[^<{}]+\\{[^{}]*\\}");
    public static final u43 e;
    public static final u43 f;
    public static final u43 g;
    public static final String h;

    static {
        v43 v43Var = v43.IGNORE_CASE;
        e = new u43("<link\\b[^>]*\\bhref\\s*=\\s*[\"']([^\"']+?\\.css)(?:[?#][^\"']*)?[\"'][^>]*>", v43Var);
        f = new u43("<script\\b[^>]*\\bsrc\\s*=\\s*[\"']([^\"']+?\\.js)(?:[?#][^\"']*)?[\"'][^>]*>\\s*</script\\s*>", v43Var);
        g = new u43("<style\\b|<link\\b[^>]*stylesheet", v43Var);
        h = "(function(){function S(){var d=Object.create(null);return{getItem:function(k){k=String(k);return k in d?d[k]:null},setItem:function(k,v){d[String(k)]=String(v)},removeItem:function(k){delete d[String(k)]},clear:function(){d=Object.create(null)},key:function(i){return Object.keys(d)[i]||null},get length(){return Object.keys(d).length}}}[\"localStorage\",\"sessionStorage\"].forEach(function(n){try{void window[n].length}catch(e){try{Object.defineProperty(window,n,{value:S(),configurable:true})}catch(_){}}});try{void document.cookie}catch(e){try{Object.defineProperty(document,\"cookie\",{get:function(){return\"\"},set:function(){},configurable:true})}catch(_){}}window.alert=function(m){console.log(String(m))};window.confirm=function(){return true};window.prompt=function(m,v){return v==null?\"\":String(v)};function fire(f,b){if(!f)return;var ev;try{ev=new SubmitEvent(\"submit\",{bubbles:true,cancelable:true,submitter:b||null})}catch(x){ev=new Event(\"submit\",{bubbles:true,cancelable:true})}f.dispatchEvent(ev)}document.addEventListener(\"click\",function(e){if(e.defaultPrevented)return;var b=e.target&&e.target.closest&&e.target.closest(\"button,input\");if(!b||!b.form)return;var t=(b.getAttribute(\"type\")||(b.tagName===\"BUTTON\"?\"submit\":\"text\")).toLowerCase();if(t!==\"submit\"&&t!==\"image\")return;e.preventDefault();fire(b.form,b)});document.addEventListener(\"keydown\",function(e){if(e.key!==\"Enter\"||e.isComposing||e.defaultPrevented)return;var i=e.target;if(!i||i.tagName!==\"INPUT\"||!i.form)return;if(/^(button|checkbox|radio|submit|reset|file|color|range|image)$/i.test(i.type))return;e.preventDefault();fire(i.form,null)});})();";
    }

    public static String a(String str, String str2) {
        String str3;
        str.getClass();
        str2.getClass();
        String strD = d(str, str2);
        Map map = c;
        String str4 = (String) map.get(strD);
        if (str4 == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            str4 = (String) map.get(lowerCase);
            if (str4 == null) {
                str4 = c(str2) ? "html" : "txt";
            }
        }
        if (!str4.equals("html")) {
            return "code.".concat(str4);
        }
        Iterator it = py.S(v43.IGNORE_CASE, v43.DOT_MATCHES_ALL).iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((v43) it.next()).c;
        }
        Pattern patternCompile = Pattern.compile("<title[^>]*>(.*?)</title>", Headers$Companion.access$ensureUnicodeCase(i));
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str2);
        matcher.getClass();
        za2 za2VarD = kr1.d(matcher, 0, str2);
        String string = (za2VarD == null || (str3 = (String) ((ya2) za2VarD.a()).get(1)) == null) ? null : mo3.U0(str3).toString();
        if (string == null) {
            string = BuildConfig.VERSION_NAME;
        }
        Pattern patternCompile2 = Pattern.compile("[^\\p{L}\\p{N}]+");
        patternCompile2.getClass();
        String strReplaceAll = patternCompile2.matcher(string).replaceAll("-");
        strReplaceAll.getClass();
        String strV0 = mo3.V0(mo3.T0(48, mo3.V0(strReplaceAll, '-')), '-');
        return strV0.length() > 0 ? strV0.concat(".html") : "page.html";
    }

    public static String b(String str, String str2) {
        for (String str3 : kr1.U("<head\\b[^>]*>", "<html\\b[^>]*>", "<!doctype[^>]*>")) {
            str3.getClass();
            Pattern patternCompile = Pattern.compile(str3, Headers$Companion.access$ensureUnicodeCase(2));
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            za2 za2VarD = kr1.d(matcher, 0, str);
            if (za2VarD != null) {
                return str.substring(0, za2VarD.b().d + 1) + str2 + str.substring(za2VarD.b().d + 1);
            }
        }
        return str2.concat(str);
    }

    public static boolean c(String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = BuildConfig.VERSION_NAME;
                break;
            }
            if (!yo4.G(str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        String lowerCase = mo3.T0(20, charSequenceSubSequence.toString()).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return to3.q0(lowerCase, "<!doctype html", false) || to3.q0(lowerCase, "<html", false);
    }

    public static String d(String str, String str2) {
        str.getClass();
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.length() <= 0) {
            return c(str2) ? "html" : BuildConfig.VERSION_NAME;
        }
        String str3 = (String) b.get(lowerCase);
        return str3 == null ? lowerCase : str3;
    }

    public static boolean e(String str) {
        return to3.q0(str, "http:", true) || to3.q0(str, "https:", true) || to3.q0(str, "//", false);
    }

    public static String f(String str, List list, String str2) {
        List<tn1> listQ0;
        StringBuilder sb = new StringBuilder(str);
        Iterable un1Var = new un1(0, new wl(8, list));
        if (!(un1Var instanceof Collection) || ((Collection) un1Var).size() > 1) {
            listQ0 = ke0.Q0(un1Var);
            Collections.reverse(listQ0);
        } else {
            listQ0 = ke0.O0(un1Var);
        }
        for (tn1 tn1Var : listQ0) {
            int i = tn1Var.a;
            za2 za2Var = (za2) tn1Var.b;
            sb.replace(za2Var.b().c, za2Var.b().d + 1, i == 0 ? str2 : BuildConfig.VERSION_NAME);
        }
        return sb.toString();
    }
}
