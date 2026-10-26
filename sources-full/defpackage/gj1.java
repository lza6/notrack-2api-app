package defpackage;

import app.template.extension.BuildConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class gj1 {
    public static final rh1[] a;
    public static final Map b;

    static {
        rh1 rh1Var = new rh1(rh1.i, BuildConfig.VERSION_NAME);
        lz lzVar = rh1.f;
        rh1 rh1Var2 = new rh1(lzVar, "GET");
        rh1 rh1Var3 = new rh1(lzVar, "POST");
        lz lzVar2 = rh1.g;
        rh1 rh1Var4 = new rh1(lzVar2, "/");
        rh1 rh1Var5 = new rh1(lzVar2, "/index.html");
        lz lzVar3 = rh1.h;
        rh1 rh1Var6 = new rh1(lzVar3, "http");
        rh1 rh1Var7 = new rh1(lzVar3, "https");
        lz lzVar4 = rh1.e;
        rh1[] rh1VarArr = {rh1Var, rh1Var2, rh1Var3, rh1Var4, rh1Var5, rh1Var6, rh1Var7, new rh1(lzVar4, "200"), new rh1(lzVar4, "204"), new rh1(lzVar4, "206"), new rh1(lzVar4, "304"), new rh1(lzVar4, "400"), new rh1(lzVar4, "404"), new rh1(lzVar4, "500"), new rh1("accept-charset", BuildConfig.VERSION_NAME), new rh1("accept-encoding", "gzip, deflate"), new rh1("accept-language", BuildConfig.VERSION_NAME), new rh1("accept-ranges", BuildConfig.VERSION_NAME), new rh1("accept", BuildConfig.VERSION_NAME), new rh1("access-control-allow-origin", BuildConfig.VERSION_NAME), new rh1("age", BuildConfig.VERSION_NAME), new rh1("allow", BuildConfig.VERSION_NAME), new rh1("authorization", BuildConfig.VERSION_NAME), new rh1("cache-control", BuildConfig.VERSION_NAME), new rh1("content-disposition", BuildConfig.VERSION_NAME), new rh1("content-encoding", BuildConfig.VERSION_NAME), new rh1("content-language", BuildConfig.VERSION_NAME), new rh1("content-length", BuildConfig.VERSION_NAME), new rh1("content-location", BuildConfig.VERSION_NAME), new rh1("content-range", BuildConfig.VERSION_NAME), new rh1("content-type", BuildConfig.VERSION_NAME), new rh1("cookie", BuildConfig.VERSION_NAME), new rh1("date", BuildConfig.VERSION_NAME), new rh1("etag", BuildConfig.VERSION_NAME), new rh1("expect", BuildConfig.VERSION_NAME), new rh1("expires", BuildConfig.VERSION_NAME), new rh1("from", BuildConfig.VERSION_NAME), new rh1("host", BuildConfig.VERSION_NAME), new rh1("if-match", BuildConfig.VERSION_NAME), new rh1("if-modified-since", BuildConfig.VERSION_NAME), new rh1("if-none-match", BuildConfig.VERSION_NAME), new rh1("if-range", BuildConfig.VERSION_NAME), new rh1("if-unmodified-since", BuildConfig.VERSION_NAME), new rh1("last-modified", BuildConfig.VERSION_NAME), new rh1("link", BuildConfig.VERSION_NAME), new rh1("location", BuildConfig.VERSION_NAME), new rh1("max-forwards", BuildConfig.VERSION_NAME), new rh1("proxy-authenticate", BuildConfig.VERSION_NAME), new rh1("proxy-authorization", BuildConfig.VERSION_NAME), new rh1("range", BuildConfig.VERSION_NAME), new rh1("referer", BuildConfig.VERSION_NAME), new rh1("refresh", BuildConfig.VERSION_NAME), new rh1("retry-after", BuildConfig.VERSION_NAME), new rh1("server", BuildConfig.VERSION_NAME), new rh1("set-cookie", BuildConfig.VERSION_NAME), new rh1("strict-transport-security", BuildConfig.VERSION_NAME), new rh1("transfer-encoding", BuildConfig.VERSION_NAME), new rh1("user-agent", BuildConfig.VERSION_NAME), new rh1("vary", BuildConfig.VERSION_NAME), new rh1("via", BuildConfig.VERSION_NAME), new rh1("www-authenticate", BuildConfig.VERSION_NAME)};
        a = rh1VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(rh1VarArr[i].a)) {
                linkedHashMap.put(rh1VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(lz lzVar) throws IOException {
        lzVar.getClass();
        int iC = lzVar.c();
        for (int i = 0; i < iC; i++) {
            byte bH = lzVar.h(i);
            if (65 <= bH && bH < 91) {
                m51.l("PROTOCOL_ERROR response malformed: mixed case name: ".concat(lzVar.p()));
                return;
            }
        }
    }
}
