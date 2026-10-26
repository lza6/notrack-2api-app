package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mj1 extends f0 {
    public final wu a;
    public qa2 b;
    public gb2 c;
    public final qn0 d = new qn0(13);

    public mj1() {
        wu wuVar = new wu();
        wuVar.b = new HashMap(2);
        this.a = wuVar;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:185:0x02fd  */
    public static void k(mj1 mj1Var, ir3 ir3Var, String str) {
        n14 n14Var;
        rj1 rj1Var;
        StringBuilder sb;
        rj1 rj1Var2;
        boolean z;
        ArrayList arrayList;
        String strR;
        sj1 sj1Var;
        String str2;
        int length;
        if (str == null) {
            return;
        }
        qa2 qa2Var = mj1Var.b;
        jm3 jm3Var = (jm3) ir3Var.h;
        StringBuilder sb2 = jm3Var.c;
        qn0 qn0Var = qa2Var.a;
        qn0 qn0Var2 = qa2Var.a;
        Set set = qa2.h;
        Set set2 = qa2.i;
        ArrayList arrayList2 = qa2Var.c;
        Set set3 = qa2.g;
        boolean z2 = false;
        o14 o14Var = new o14(new p30(str), new ht2(0));
        while (true) {
            if (o14Var.e) {
                StringBuilder sb3 = o14Var.g;
                int length2 = sb3.length();
                g14 g14Var = o14Var.l;
                if (length2 > 0) {
                    String string = sb3.toString();
                    sb3.delete(z2 ? 1 : 0, sb3.length());
                    o14Var.f = null;
                    g14Var.b = string;
                    n14Var = g14Var;
                } else {
                    String str3 = o14Var.f;
                    if (str3 != null) {
                        g14Var.b = str3;
                        o14Var.f = null;
                        n14Var = g14Var;
                    } else {
                        o14Var.e = z2;
                        n14Var = o14Var.d;
                    }
                }
                int i = n14Var.a;
                if (6 == i) {
                    return;
                }
                int iZ = fq2.z(i);
                if (iZ == 1) {
                    l14 l14Var = (l14) n14Var;
                    boolean zContains = set3.contains(l14Var.c);
                    String str4 = l14Var.c;
                    if (zContains) {
                        sj1 sj1Var2 = new sj1(str4, sb2.length(), qa2.a(l14Var));
                        if (qa2Var.f) {
                            int length3 = jm3Var.length();
                            if (length3 > 0 && '\n' != jm3Var.charAt(length3 - 1)) {
                                yh4.m(jm3Var, '\n');
                            }
                            qa2Var.f = false;
                        }
                        if (set.contains(str4) || l14Var.i) {
                            qn0Var.getClass();
                            String strR2 = qn0.r(sj1Var2);
                            if (strR2 != null && strR2.length() > 0) {
                                try {
                                    jm3Var.append(strR2);
                                } catch (IOException e) {
                                    m51.n(e);
                                    return;
                                }
                            }
                            int length4 = sb2.length();
                            if (!sj1Var2.m()) {
                                sj1Var2.d = length4;
                            }
                        }
                        arrayList2.add(sj1Var2);
                    } else {
                        if ("p".equals((String) qa2Var.d.h)) {
                            qa2Var.d.n(sb2.length());
                            yh4.m(jm3Var, '\n');
                            qa2Var.d = qa2Var.d.m;
                        } else if ("li".equals(str4) && "li".equals((String) qa2Var.d.h)) {
                            qa2Var.d.n(sb2.length());
                            qa2Var.d = qa2Var.d.m;
                        }
                        if (set2.contains(str4)) {
                            qa2Var.e = "pre".equals(str4);
                            int length5 = jm3Var.length();
                            if (length5 > 0 && '\n' != jm3Var.charAt(length5 - 1)) {
                                yh4.m(jm3Var, '\n');
                            }
                        } else {
                            if (qa2Var.f) {
                                int length6 = jm3Var.length();
                                if (length6 > 0 && '\n' != jm3Var.charAt(length6 - 1)) {
                                    yh4.m(jm3Var, '\n');
                                }
                                qa2Var.f = false;
                            }
                            int length7 = sb2.length();
                            Map mapA = qa2.a(l14Var);
                            rj1Var = qa2Var.d;
                            sb = sb2;
                            rj1Var2 = new rj1(str4, length7, mapA, rj1Var);
                            if (!set.contains(str4) || l14Var.i) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                qn0Var.getClass();
                                strR = qn0.r(rj1Var2);
                                if (strR != null && strR.length() > 0) {
                                    try {
                                        jm3Var.append(strR);
                                    } catch (IOException e2) {
                                        m51.n(e2);
                                        return;
                                    }
                                }
                                rj1Var2.n(sb.length());
                            }
                            arrayList = rj1Var.n;
                            if (arrayList == null) {
                                arrayList = new ArrayList(2);
                                rj1Var.n = arrayList;
                            }
                            arrayList.add(rj1Var2);
                            if (!z) {
                                qa2Var.d = rj1Var2;
                            }
                        }
                        int length8 = sb2.length();
                        Map mapA2 = qa2.a(l14Var);
                        rj1Var = qa2Var.d;
                        sb = sb2;
                        rj1Var2 = new rj1(str4, length8, mapA2, rj1Var);
                        if (set.contains(str4)) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (z) {
                            qn0Var.getClass();
                            strR = qn0.r(rj1Var2);
                            if (strR != null) {
                                jm3Var.append(strR);
                            }
                            rj1Var2.n(sb.length());
                        }
                        arrayList = rj1Var.n;
                        if (arrayList == null) {
                            arrayList = new ArrayList(2);
                            rj1Var.n = arrayList;
                        }
                        arrayList.add(rj1Var2);
                        if (!z) {
                            qa2Var.d = rj1Var2;
                        }
                    }
                    n14Var.a();
                    sb2 = sb;
                    z2 = false;
                } else if (iZ == 2) {
                    k14 k14Var = (k14) n14Var;
                    boolean zContains2 = set3.contains(k14Var.c);
                    String str5 = k14Var.c;
                    if (zContains2) {
                        int size = arrayList2.size();
                        while (true) {
                            size--;
                            if (size <= -1) {
                                sj1Var = null;
                                break;
                            }
                            sj1 sj1Var3 = (sj1) arrayList2.get(size);
                            if (str5.equals((String) sj1Var3.h) && sj1Var3.d < 0) {
                                sj1Var = sj1Var3;
                                break;
                            }
                        }
                        if (sj1Var != null) {
                            if (sj1Var.c == jm3Var.length()) {
                                qn0Var2.getClass();
                                String strR3 = qn0.r(sj1Var);
                                if (strR3 != null) {
                                    try {
                                        jm3Var.append(strR3);
                                    } catch (IOException e3) {
                                        m51.n(e3);
                                        return;
                                    }
                                }
                            }
                            int length9 = sb2.length();
                            if (!sj1Var.m()) {
                                sj1Var.d = length9;
                            }
                        }
                    } else {
                        rj1 rj1Var3 = qa2Var.d;
                        while (rj1Var3 != null && !str5.equals((String) rj1Var3.h) && !rj1Var3.m()) {
                            rj1Var3 = rj1Var3.m;
                        }
                        if (rj1Var3 != null) {
                            int i2 = rj1Var3.c;
                            if ("pre".equals(str5)) {
                                qa2Var.e = false;
                            }
                            if (i2 == jm3Var.length()) {
                                qn0Var2.getClass();
                                String strR4 = qn0.r(rj1Var3);
                                if (strR4 != null) {
                                    try {
                                        jm3Var.append(strR4);
                                    } catch (IOException e4) {
                                        m51.n(e4);
                                        return;
                                    }
                                }
                            }
                            rj1Var3.n(sb2.length());
                            if (i2 != rj1Var3.d) {
                                qa2Var.f = set2.contains((String) rj1Var3.h);
                            }
                            if ("p".equals(str5)) {
                                yh4.m(jm3Var, '\n');
                            }
                            qa2Var.d = rj1Var3.m;
                        }
                    }
                } else if (iZ == 4) {
                    g14 g14Var2 = (g14) n14Var;
                    if (qa2Var.e) {
                        try {
                            jm3Var.append(g14Var2.b);
                        } catch (IOException e5) {
                            m51.n(e5);
                            return;
                        }
                    } else {
                        if (qa2Var.f) {
                            int length10 = jm3Var.length();
                            if (length10 > 0 && '\n' != jm3Var.charAt(length10 - 1)) {
                                yh4.m(jm3Var, '\n');
                            }
                            qa2Var.f = false;
                        }
                        zf3 zf3Var = qa2Var.b;
                        String str6 = g14Var2.b;
                        zf3Var.getClass();
                        int length11 = sb2.length();
                        int length12 = str6.length();
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < length12) {
                            char cCharAt = str6.charAt(i3);
                            if (Character.isWhitespace(cCharAt)) {
                                str2 = str6;
                                z3 = true;
                            } else {
                                if (!z3 || (length = sb2.length()) <= 0) {
                                    str2 = str6;
                                } else {
                                    str2 = str6;
                                    if (!Character.isWhitespace(sb2.charAt(length - 1))) {
                                        yh4.m(jm3Var, ' ');
                                    }
                                }
                                yh4.m(jm3Var, cCharAt);
                                z3 = false;
                            }
                            i3++;
                            str6 = str2;
                        }
                        if (z3 && length11 < sb2.length()) {
                            yh4.m(jm3Var, ' ');
                        }
                    }
                }
                sb = sb2;
                n14Var.a();
                sb2 = sb;
                z2 = false;
            } else {
                o14Var.c.d(o14Var, o14Var.a);
            }
        }
    }

    @Override // defpackage.f0
    public final void a(ir3 ir3Var) {
        gb2 gb2Var = this.c;
        if (gb2Var != null) {
            gb2Var.O(ir3Var, this.b);
        } else {
            u41.r("Unexpected state, html-renderer is not defined");
        }
    }

    @Override // defpackage.f0
    public final void f(pa2 pa2Var) {
        wu wuVar = this.a;
        wuVar.getClass();
        wuVar.a(new s21(new qn0(new rn0(2))));
        int i = 3;
        wuVar.a(new s21(i));
        int i2 = 0;
        wuVar.a(new vv(i2));
        wuVar.a(new s21(5));
        wuVar.a(new s21(6));
        wuVar.a(new s21(4));
        wuVar.a(new vv(2));
        wuVar.a(new vv(i));
        int i3 = 1;
        wuVar.a(new vv(i3));
        wuVar.a(new s21(i2));
        wuVar.a(new s21(i3));
        this.b = new qa2(this.d, new zf3(8));
        HashMap map = (HashMap) wuVar.b;
        if (wuVar.a) {
            u41.r("Builder has been already built");
        } else {
            wuVar.a = true;
            this.c = map.size() > 0 ? new ra2(Collections.unmodifiableMap(map)) : new sa2();
        }
    }

    @Override // defpackage.f0
    public final void j(ua2 ua2Var) {
        ua2Var.a(ij1.class, new lj1(this, 1));
        ua2Var.a(kj1.class, new lj1(this, 0));
    }
}
