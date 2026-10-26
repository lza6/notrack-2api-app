package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.UriHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.text.Typography;
import notrack.ai.ui.components.HtmlPreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k60 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    public /* synthetic */ k60(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.c = i;
        this.l = obj;
        this.h = obj2;
        this.d = obj3;
    }

    public /* synthetic */ k60(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.h = obj;
        this.l = obj2;
        this.d = obj3;
    }

    public /* synthetic */ k60(se1 se1Var, mi2 mi2Var, mi2 mi2Var2, int i) {
        this.c = i;
        this.h = se1Var;
        this.d = mi2Var;
        this.l = mi2Var2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        Object value;
        String strF;
        String str;
        int i = 0;
        String str2 = null;
        switch (this.c) {
            case 0:
                hb0 hb0Var = (hb0) this.h;
                mi2 mi2Var = (mi2) this.d;
                hb0Var.d0(false);
                wa0.h1(mi2Var, true);
                return w84.a;
            case 1:
                le1 le1Var = (le1) this.h;
                String str3 = (String) this.l;
                ((mi2) this.d).setValue(Boolean.FALSE);
                le1Var.invoke(str3);
                return w84.a;
            case 2:
                gq0 gq0Var = (gq0) this.h;
                je1 je1Var = (je1) this.l;
                ah2 ah2Var = (ah2) this.d;
                if (((bt2) ah2Var).f() < -8.0f) {
                    py.F(gq0Var, null, null, new t90(ah2Var, null, 1), 3);
                } else {
                    je1Var.invoke();
                }
                return w84.a;
            case 3:
                vw2 vw2Var = (vw2) this.l;
                hb0 hb0Var2 = (hb0) this.h;
                w94 w94Var = ((xa0) ((gn3) this.d).getValue()).r;
                if (kr1.n(w94Var, u94.a)) {
                    if (vw2Var != null) {
                        ir3 ir3Var = (ir3) vw2Var;
                        sd sdVarA = ir3Var.V().a();
                        f4 f4Var = new f4(6, new s(9, ir3Var));
                        sdVarA.getClass();
                        ((cr1) sdVarA.c).g(new uq4(vs3.a, f4Var));
                        sdVarA.j();
                    }
                } else if (!kr1.n(w94Var, v94.a)) {
                    hb0Var2.getClass();
                } else if (vw2Var != null) {
                    np4 np4VarV = ((ir3) vw2Var).V();
                    ts4 ts4Var = np4VarV.a;
                    String packageName = np4VarV.c.getPackageName();
                    dt4 dt4Var = ts4Var.a;
                    if (dt4Var == null) {
                        ts4.c();
                    } else {
                        ts4.e.f("completeUpdate(%s)", packageName);
                        us3 us3Var = new us3();
                        dt4Var.a().post(new es4(dt4Var, us3Var, us3Var, new es4(ts4Var, us3Var, us3Var, packageName, 1), 2));
                    }
                }
                return w84.a;
            case 4:
                le1 le1Var2 = (le1) this.h;
                mi2 mi2Var2 = (mi2) this.d;
                mi2 mi2Var3 = (mi2) this.l;
                if (!((Boolean) mi2Var2.getValue()).booleanValue()) {
                    mi2Var2.setValue(Boolean.TRUE);
                    le1Var2.invoke(((ey3) mi2Var3.getValue()).a.d);
                }
                return w84.a;
            case 5:
                gq0 gq0Var2 = (gq0) this.h;
                gn3 gn3Var = (gn3) this.l;
                g22 g22Var = (g22) this.d;
                String str4 = ((xa0) gn3Var.getValue()).m0.b;
                Iterator it = ((xa0) gn3Var.getValue()).a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!kr1.n(((yd2) it.next()).a, str4)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    py.F(gq0Var2, null, null, new ja0(i, null, g22Var), 3);
                }
                return w84.a;
            case 6:
                hb0 hb0Var3 = (hb0) this.h;
                pa1 pa1Var = (pa1) this.l;
                SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) this.d;
                hb0Var3.Y(null);
                ((va1) pa1Var).b(8, false, true);
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                return w84.a;
            case 7:
                hb0 hb0Var4 = (hb0) this.h;
                String str5 = (String) this.l;
                mi2 mi2Var4 = (mi2) this.d;
                hb0Var4.getClass();
                str5.getClass();
                jn3 jn3Var = hb0Var4.c;
                do {
                    value = jn3Var.getValue();
                } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, str5, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -8193, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                String str6 = !mo3.C0(str5) ? str5 : null;
                if (ef4.r) {
                    py.F(id4.a(hb0Var4), null, null, new fb0(hb0Var4, str6, true, (so0) null), 3);
                }
                i72 i72VarA = i72.a(str5);
                i72VarA.getClass();
                wf3 wf3Var = li.c;
                if (Build.VERSION.SDK_INT < 33) {
                    if (!i72VarA.equals(li.h)) {
                        synchronized (li.p) {
                            li.h = i72VarA;
                            li.a();
                        }
                    }
                    break;
                } else {
                    Object objC = li.c();
                    if (objC != null) {
                        ji.b(objC, ii.a(i72VarA.a.a.toLanguageTags()));
                    }
                }
                mi2Var4.setValue(Boolean.FALSE);
                return w84.a;
            case 8:
                py.F((gq0) this.h, null, null, new ga0((g22) this.l, (mi2) this.d, null, 1), 3);
                return w84.a;
            case 9:
                String str7 = (String) this.h;
                je1 je1Var2 = (je1) this.l;
                ((mi2) this.d).setValue(str7);
                je1Var2.invoke();
                return w84.a;
            case 10:
                ne1 ne1Var = (ne1) this.h;
                mi2 mi2Var5 = (mi2) this.d;
                mi2 mi2Var6 = (mi2) this.l;
                ne1Var.invoke((String) mi2Var5.getValue(), null);
                mi2Var6.setValue(Boolean.FALSE);
                return w84.a;
            case 11:
                UriHandler uriHandler = (UriHandler) this.l;
                String str8 = (String) this.h;
                String str9 = (String) this.d;
                uriHandler.openUri(str8 == null ? fq2.m("https://notrack.ai/", str9) : "https://notrack.ai/" + str8 + "/" + str9);
                return w84.a;
            default:
                Context context = (Context) this.h;
                String str10 = (String) this.l;
                List list = (List) this.d;
                String str11 = HtmlPreviewActivity.D;
                u43 u43Var = xd0.a;
                str10.getClass();
                list.getClass();
                int iZ0 = mo3.z0(Typography.less, 0, 6, str10);
                if (iZ0 < 0) {
                    iZ0 = str10.length();
                }
                String strSubstring = str10.substring(0, iZ0);
                if (xd0.d.a(strSubstring)) {
                    String strSubstring2 = str10.substring(iZ0);
                    strF = to3.q0(strSubstring2, "</style", true) ? "<style>" + ((Object) str10) : "<style>" + strSubstring + "</style>" + strSubstring2;
                } else {
                    strF = str10;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    String lowerCase = ((ud0) obj).a.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (lowerCase.equals("css")) {
                        arrayList.add(obj);
                    }
                }
                String strD0 = ke0.D0(arrayList, "\n", null, null, new s80(2), 30);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    Set setS = py.S("js", "javascript");
                    String lowerCase2 = ((ud0) obj2).a.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    if (setS.contains(lowerCase2)) {
                        arrayList2.add(obj2);
                    }
                }
                String strD1 = ke0.D0(arrayList2, "\n", null, null, new s80(3), 30);
                if (!mo3.C0(strD0)) {
                    List listB0 = rf3.b0(new g71(u43.b(xd0.e, strF), true, new s80(4)));
                    if (!listB0.isEmpty()) {
                        strF = xd0.f(strF, listB0, "<style>\n" + strD0 + "\n</style>");
                    } else if (!xd0.g.a(strF)) {
                        strF = xd0.b(strF, "<style>\n" + strD0 + "\n</style>");
                    }
                }
                if (!mo3.C0(strD1)) {
                    List listB1 = rf3.b0(new g71(u43.b(xd0.f, strF), true, new s80(5)));
                    if (!listB1.isEmpty()) {
                        strF = xd0.f(strF, listB1, "<script>\n" + strD1 + "\n</script>");
                    }
                }
                String strB = xd0.b(strF, "<script>" + xd0.h + "</script>");
                context.getClass();
                HtmlPreviewActivity.D = strB;
                HtmlPreviewActivity.E = str10;
                Iterator it2 = py.S(v43.IGNORE_CASE, v43.DOT_MATCHES_ALL).iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    i2 |= ((v43) it2.next()).c;
                }
                if ((i2 & 2) != 0) {
                    i2 |= 64;
                }
                Pattern patternCompile = Pattern.compile("<title[^>]*>(.*?)</title>", i2);
                patternCompile.getClass();
                Matcher matcher = patternCompile.matcher(str10);
                matcher.getClass();
                za2 za2VarD = kr1.d(matcher, 0, str10);
                if (za2VarD != null && (str = (String) ((ya2) za2VarD.a()).get(1)) != null) {
                    Pattern patternCompile2 = Pattern.compile("\\s+");
                    patternCompile2.getClass();
                    String strReplaceAll = patternCompile2.matcher(str).replaceAll(" ");
                    strReplaceAll.getClass();
                    String string = mo3.U0(strReplaceAll).toString();
                    if (string != null && string.length() > 0) {
                        str2 = string;
                    }
                }
                HtmlPreviewActivity.F = str2;
                HtmlPreviewActivity.G = xd0.a("html", str10);
                context.startActivity(new Intent(context, (Class<?>) HtmlPreviewActivity.class));
                return w84.a;
        }
    }
}
