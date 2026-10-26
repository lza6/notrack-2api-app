package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tw2 {
    public static final List g = kr1.U("notrack_plus", "notrack_pro");
    public final jb a;
    public final jn3 b;
    public final s23 c;
    public ag0 d;
    public final zi2 e;
    public final au f;

    public tw2(Context context, jb jbVar) {
        au fo4Var;
        context.getClass();
        this.a = jbVar;
        jn3 jn3VarF = gb2.f(z21.c);
        this.b = jn3VarF;
        this.c = new s23(jn3VarF);
        this.e = new zi2();
        Context applicationContext = context.getApplicationContext();
        zt ztVar = new zt(applicationContext);
        ztVar.c = this;
        ztVar.b = new qn0(21);
        if (applicationContext == null) {
            u41.k("Please provide a valid Context.");
            throw null;
        }
        if (((tw2) ztVar.c) == null) {
            u41.k("Please provide a valid listener for purchases updates.");
            throw null;
        }
        if (((qn0) ztVar.b) == null) {
            u41.k("Pending purchases for one-time products must be supported.");
            throw null;
        }
        ((qn0) ztVar.b).getClass();
        tw2 tw2Var = (tw2) ztVar.c;
        qn0 qn0Var = (qn0) ztVar.b;
        if (tw2Var != null) {
            tw2 tw2Var2 = (tw2) ztVar.c;
            fo4Var = ztVar.a() ? new fo4(qn0Var, applicationContext, tw2Var2, ztVar) : new au(qn0Var, applicationContext, tw2Var2, ztVar);
        } else {
            fo4Var = ztVar.a() ? new fo4(qn0Var, applicationContext, ztVar) : new au(qn0Var, applicationContext, ztVar);
        }
        this.f = fo4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r8 == r6) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4, types: [zi2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.uo0 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            au r0 = r7.f
            boolean r1 = r8 instanceof defpackage.mw2
            if (r1 == 0) goto L15
            r1 = r8
            mw2 r1 = (defpackage.mw2) r1
            int r2 = r1.m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.m = r2
            goto L1a
        L15:
            mw2 r1 = new mw2
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.h
            int r2 = r1.m
            r3 = 2
            r4 = 1
            r5 = 0
            hq0 r6 = defpackage.hq0.c
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            zi2 r7 = r1.c
            defpackage.g13.O(r8)     // Catch: java.lang.Throwable -> L2f
            goto L7f
        L2f:
            r8 = move-exception
            goto L8d
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r7)
            return r5
        L37:
            int r7 = r1.d
            zi2 r2 = r1.c
            defpackage.g13.O(r8)
            r8 = r7
            r7 = r2
            goto L54
        L41:
            defpackage.g13.O(r8)
            zi2 r7 = r7.e
            r1.c = r7
            r8 = 0
            r1.d = r8
            r1.m = r4
            java.lang.Object r2 = r7.f(r1)
            if (r2 != r6) goto L54
            goto L7e
        L54:
            r0.getClass()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r0.z()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L5e
            goto L85
        L5e:
            r1.c = r7     // Catch: java.lang.Throwable -> L2f
            r1.d = r8     // Catch: java.lang.Throwable -> L2f
            r1.m = r3     // Catch: java.lang.Throwable -> L2f
            t00 r8 = new t00     // Catch: java.lang.Throwable -> L2f
            so0 r1 = defpackage.gm4.G(r1)     // Catch: java.lang.Throwable -> L2f
            r8.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2f
            r8.u()     // Catch: java.lang.Throwable -> L2f
            sz0 r1 = new sz0     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            r0.c(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r8.s()     // Catch: java.lang.Throwable -> L2f
            if (r8 != r6) goto L7f
        L7e:
            return r6
        L7f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r8.booleanValue()     // Catch: java.lang.Throwable -> L2f
        L85:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
            r7.i(r5)
            return r8
        L8d:
            r7.i(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw2.a(uo0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, uo0 uo0Var) throws Throwable {
        nw2 nw2Var;
        char c;
        char c2;
        if (uo0Var instanceof nw2) {
            nw2Var = (nw2) uo0Var;
            int i = nw2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                nw2Var.l = i - Integer.MIN_VALUE;
            } else {
                nw2Var = new nw2(this, uo0Var);
            }
        } else {
            nw2Var = new nw2(this, uo0Var);
        }
        Object objJ = nw2Var.d;
        int i2 = nw2Var.l;
        if (i2 == 0) {
            g13.O(objJ);
            d5 d5Var = new d5(12);
            d5Var.d = "subs";
            d5 d5Var2 = new d5(d5Var);
            nw2Var.c = str;
            nw2Var.l = 1;
            objJ = g13.J(this.f, d5Var2, nw2Var);
            hq0 hq0Var = hq0.c;
            if (objJ == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = nw2Var.c;
            g13.O(objJ);
        }
        a23 a23Var = (a23) objJ;
        if (a23Var.a.a == 0) {
            String strT0 = mo3.T0(64, str);
            List list = a23Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((u13) obj).c.optInt("purchaseState", 1) != 4) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                JSONObject jSONObject = ((u13) obj2).c;
                String strOptString = jSONObject.optString("obfuscatedAccountId");
                d5 d5Var3 = (strOptString == null && jSONObject.optString("obfuscatedProfileId") == null) ? null : new d5(strOptString, 9);
                if (kr1.n(d5Var3 != null ? d5Var3.d : null, strT0)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                ArrayList arrayListA = ((u13) obj3).a();
                if (!arrayListA.isEmpty()) {
                    int size3 = arrayListA.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj4 = arrayListA.get(i5);
                        i5++;
                        if (g.contains((String) obj4)) {
                            arrayList3.add(obj3);
                            break;
                        }
                    }
                }
            }
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (!it.hasNext()) {
                    return next;
                }
                ArrayList arrayListA2 = ((u13) next).a();
                if (arrayListA2.isEmpty()) {
                    c = 0;
                    break;
                }
                int size4 = arrayListA2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        c = 0;
                        break;
                    }
                    Object obj5 = arrayListA2.get(i6);
                    i6++;
                    String str2 = (String) obj5;
                    str2.getClass();
                    if (to3.j0(str2, "_pro", false)) {
                        c = 1;
                        break;
                    }
                }
                do {
                    Object next2 = it.next();
                    ArrayList arrayListA3 = ((u13) next2).a();
                    if (arrayListA3.isEmpty()) {
                        c2 = 0;
                        break;
                    }
                    int size5 = arrayListA3.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            c2 = 0;
                            break;
                        }
                        Object obj6 = arrayListA3.get(i7);
                        i7++;
                        String str3 = (String) obj6;
                        str3.getClass();
                        if (to3.j0(str3, "_pro", false)) {
                            c2 = 1;
                            break;
                        }
                    }
                    if (c < c2) {
                        next = next2;
                        c = c2;
                    }
                } while (it.hasNext());
                return next;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(u13 u13Var, uo0 uo0Var) throws Throwable {
        ow2 ow2Var;
        if (uo0Var instanceof ow2) {
            ow2Var = (ow2) uo0Var;
            int i = ow2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ow2Var.h = i - Integer.MIN_VALUE;
            } else {
                ow2Var = new ow2(this, uo0Var);
            }
        } else {
            ow2Var = new ow2(this, uo0Var);
        }
        Object objY = ow2Var.c;
        int i2 = ow2Var.h;
        if (i2 == 0) {
            g13.O(objY);
            if (u13Var.c.optInt("purchaseState", 1) == 4) {
                return y13.a;
            }
            String str = (String) ke0.z0(u13Var.a());
            if (str == null) {
                return new w13("no_product");
            }
            JSONObject jSONObject = u13Var.c;
            String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
            strOptString.getClass();
            ow2Var.h = 1;
            k2 k2VarF = ((e60) this.a.d).f();
            k2VarF.getClass();
            jt0 jt0Var = sw0.a;
            objY = py.Y(at0.c, new i2(strOptString, str, k2VarF, null), ow2Var);
            hq0 hq0Var = hq0.c;
            if (objY == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objY);
        }
        String str2 = (String) objY;
        return str2 != null ? new x13(str2) : new w13("not_verified");
    }

    public final void d(fu fuVar, List list) {
        fuVar.getClass();
        ag0 ag0Var = this.d;
        if (ag0Var == null) {
            return;
        }
        int i = fuVar.a;
        if (i == 0) {
            if (list == null) {
                list = z21.c;
            }
            ag0Var.M(list);
        } else {
            if (i == 1 || i == 7) {
                ag0Var.M(null);
                return;
            }
            Log.w("PlayBilling", "purchase " + i + ": " + fuVar.c);
            ag0Var.M(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, uo0 uo0Var) throws Throwable {
        pw2 pw2Var;
        if (uo0Var instanceof pw2) {
            pw2Var = (pw2) uo0Var;
            int i = pw2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                pw2Var.l = i - Integer.MIN_VALUE;
            } else {
                pw2Var = new pw2(this, uo0Var);
            }
        } else {
            pw2Var = new pw2(this, uo0Var);
        }
        Object objN = pw2Var.d;
        int i2 = pw2Var.l;
        Object obj = null;
        if (i2 == 0) {
            g13.O(objN);
            c23 c23Var = new c23();
            bi4 bi4Var = new bi4();
            bi4Var.c = str;
            bi4Var.d = "subs";
            c23Var.a(kr1.T(bi4Var.c()));
            if (c23Var.a == null) {
                u41.k("Product list must be set to a non empty list.");
                return null;
            }
            c23 c23Var2 = new c23(c23Var);
            pw2Var.c = str;
            pw2Var.l = 1;
            ag0 ag0Var = new ag0(true);
            ag0Var.H(null);
            bu buVar = new bu();
            buVar.a = ag0Var;
            this.f.b(c23Var2, buVar);
            objN = ag0Var.n(pw2Var);
            hq0 hq0Var = hq0.c;
            if (objN == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = pw2Var.c;
            g13.O(objN);
        }
        List list = ((b03) objN).b;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (kr1.n(((a03) obj2).c, str)) {
                obj = obj2;
                break;
            }
        }
        return (a03) obj;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0271  */
    /* JADX WARN: Code duplicated, block: B:123:0x0276  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:150:0x0306  */
    /* JADX WARN: Code duplicated, block: B:152:0x0319 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:153:0x031a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x0321  */
    /* JADX WARN: Code duplicated, block: B:158:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    /* JADX WARN: Code duplicated, block: B:55:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0159  */
    /* JADX WARN: Code duplicated, block: B:58:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x0177 A[LOOP:2: B:57:0x015e->B:61:0x0177, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0189  */
    /* JADX WARN: Code duplicated, block: B:70:0x0190  */
    /* JADX WARN: Code duplicated, block: B:72:0x0196  */
    /* JADX WARN: Code duplicated, block: B:76:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.app.Activity, ci4, gs1, java.lang.String, so0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ag0, android.app.Activity, ci4, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ag0, android.app.Activity, ci4, java.lang.String, uw2] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object f(Activity activity, uw2 uw2Var, String str, uo0 uo0Var) throws Throwable {
        qw2 qw2Var;
        uw2 uw2Var2;
        String str2;
        Activity activity2;
        uw2 uw2Var3;
        String str3;
        a03 a03Var;
        ci4 ci4Var;
        mi4 mi4Var;
        String str4;
        ci4 ci4Var2;
        String str5;
        u13 u13Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList;
        Object obj;
        ArrayList arrayList2;
        Object objO;
        ag0 ag0Var;
        ?? r4;
        ag0 ag0Var2;
        uw2 uw2Var4;
        String strOptString;
        ArrayList arrayListA;
        int size;
        int i;
        boolean z;
        String str6;
        int i2;
        boolean z2;
        ?? r5;
        fu fuVar;
        int i3;
        uw2 uw2Var5;
        ?? r6;
        List list;
        Iterator it;
        Object next;
        u13 u13Var2;
        Object objC;
        if (uo0Var instanceof qw2) {
            qw2Var = (qw2) uo0Var;
            int i4 = qw2Var.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                qw2Var.p = i4 - Integer.MIN_VALUE;
            } else {
                qw2Var = new qw2(this, uo0Var);
            }
        } else {
            qw2Var = new qw2(this, uo0Var);
        }
        qw2 qw2Var2 = qw2Var;
        Object objE = qw2Var2.n;
        int i5 = qw2Var2.p;
        boolean z3 = false;
        CharSequence charSequence3 = null;
        Object obj2 = hq0.c;
        switch (i5) {
            case 0:
                g13.O(objE);
                if (mo3.C0(str)) {
                    return new w13("no_account");
                }
                qw2Var2.c = activity;
                uw2Var2 = uw2Var;
                qw2Var2.d = uw2Var2;
                str2 = str;
                qw2Var2.h = str2;
                qw2Var2.p = 1;
                Object objA = a(qw2Var2);
                if (objA != obj2) {
                    activity2 = activity;
                    objE = objA;
                    if (!((Boolean) objE).booleanValue()) {
                        return new w13("billing_unavailable");
                    }
                    String str7 = uw2Var2.a;
                    qw2Var2.c = activity2;
                    qw2Var2.d = uw2Var2;
                    qw2Var2.h = str2;
                    qw2Var2.p = 2;
                    objE = e(str7, qw2Var2);
                    if (objE != obj2) {
                        String str8 = str2;
                        uw2Var3 = uw2Var2;
                        str3 = str8;
                        a03Var = (a03) objE;
                        if (a03Var == null) {
                            return new w13("product_unavailable");
                        }
                        ci4Var = new ci4(11, z3);
                        e eVar = new e();
                        eVar.b = 0;
                        eVar.a = true;
                        ci4Var.l = eVar;
                        mi4Var = new mi4(2, false);
                        mi4Var.d = a03Var;
                        if (a03Var.a() != null) {
                            a03Var.a().getClass();
                            str5 = a03Var.a().a;
                            if (str5 != null) {
                                mi4Var.h = str5;
                            }
                        }
                        str4 = uw2Var3.f;
                        if (TextUtils.isEmpty(str4)) {
                            u41.k("offerToken can not be empty");
                            return null;
                        }
                        mi4Var.h = str4;
                        ci4Var.h = new ArrayList(kr1.T(new cu(mi4Var)));
                        ci4Var.d = mo3.T0(64, str3);
                        qw2Var2.c = activity2;
                        qw2Var2.d = uw2Var3;
                        qw2Var2.h = null;
                        qw2Var2.l = ci4Var;
                        qw2Var2.p = 3;
                        objE = b(str3, qw2Var2);
                        if (objE != obj2) {
                            ci4Var2 = ci4Var;
                            u13Var = (u13) objE;
                            if (u13Var != null) {
                                JSONObject jSONObject = u13Var.c;
                                charSequence = null;
                                strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                                arrayListA = u13Var.a();
                                if (arrayListA.isEmpty()) {
                                    z = false;
                                    charSequence2 = null;
                                } else {
                                    size = arrayListA.size();
                                    i = 0;
                                    while (true) {
                                        if (i < size) {
                                            Object obj3 = arrayListA.get(i);
                                            i++;
                                            charSequence2 = charSequence3;
                                            str6 = (String) obj3;
                                            str6.getClass();
                                            if (to3.j0(str6, "_pro", false)) {
                                                z = true;
                                            } else {
                                                charSequence3 = charSequence2;
                                            }
                                        } else {
                                            charSequence2 = charSequence3;
                                            z = false;
                                        }
                                    }
                                }
                                if (to3.j0(uw2Var3.a, "_pro", false) || z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                if (TextUtils.isEmpty(strOptString) || !TextUtils.isEmpty(charSequence2)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                boolean zIsEmpty = TextUtils.isEmpty(charSequence2);
                                if (!z2 && !zIsEmpty) {
                                    u41.k("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                    return null;
                                }
                                if (z2 && zIsEmpty) {
                                    u41.k("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                    return null;
                                }
                                du duVar = new du(0);
                                duVar.c = strOptString;
                                duVar.b = i2;
                                ci4Var2.getClass();
                                e eVar2 = new e();
                                eVar2.c = duVar.c;
                                eVar2.b = duVar.b;
                                ci4Var2.l = eVar2;
                            } else {
                                charSequence = null;
                                charSequence2 = null;
                            }
                            arrayList = (ArrayList) ci4Var2.h;
                            if (arrayList != null || arrayList.isEmpty()) {
                                u41.k("Details of the products must be provided.");
                                return charSequence;
                            }
                            ArrayList arrayList3 = (ArrayList) ci4Var2.h;
                            if (arrayList3 != null) {
                                int size2 = arrayList3.size();
                                int i6 = 0;
                                while (i6 < size2) {
                                    Object obj4 = arrayList3.get(i6);
                                    i6++;
                                    if (((cu) obj4) == null) {
                                        u41.k("ProductDetailsParams cannot be null.");
                                        return charSequence;
                                    }
                                }
                            }
                            sd sdVar = new sd();
                            sdVar.a = !((cu) ((ArrayList) ci4Var2.h).get(0)).a.b.optString("packageName").isEmpty();
                            sdVar.b = (String) ci4Var2.d;
                            e eVar3 = (e) ci4Var2.l;
                            boolean z4 = (TextUtils.isEmpty((String) eVar3.c) && TextUtils.isEmpty(charSequence)) ? false : true;
                            boolean zIsEmpty2 = TextUtils.isEmpty(charSequence);
                            if (!z4 || zIsEmpty2) {
                                if (eVar3.a || z4 || !zIsEmpty2) {
                                    du duVar2 = new du(0);
                                    duVar2.c = (String) eVar3.c;
                                    duVar2.b = eVar3.b;
                                    obj = duVar2;
                                } else {
                                    u41.k("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                }
                                sdVar.c = obj;
                                sdVar.e = new ArrayList();
                                arrayList2 = (ArrayList) ci4Var2.h;
                                if (arrayList2 != null) {
                                    objO = xm4.o(arrayList2);
                                } else {
                                    pm4 pm4Var = xm4.d;
                                    objO = cn4.m;
                                }
                                sdVar.d = objO;
                                ag0Var = new ag0(true);
                                r4 = charSequence2;
                                ag0Var.H(r4);
                                this.d = ag0Var;
                                jt0 jt0Var = sw0.a;
                                eh1 eh1Var = i92.a;
                                df dfVar = new df(this, activity2, sdVar, r4, 8);
                                qw2Var2.c = r4;
                                qw2Var2.d = uw2Var3;
                                qw2Var2.h = r4;
                                qw2Var2.l = r4;
                                qw2Var2.m = ag0Var;
                                qw2Var2.p = 4;
                                objE = py.Y(eh1Var, dfVar, qw2Var2);
                                if (objE != obj2) {
                                    ag0Var2 = ag0Var;
                                    uw2Var4 = uw2Var3;
                                    r5 = r4;
                                    objE.getClass();
                                    fuVar = (fu) objE;
                                    i3 = fuVar.a;
                                    if (i3 != 0) {
                                        this.d = r5;
                                        return new w13(ud2.m(i3, "launch_"), fuVar.c);
                                    }
                                    qw2Var2.c = r5;
                                    qw2Var2.d = uw2Var4;
                                    qw2Var2.h = r5;
                                    qw2Var2.l = r5;
                                    qw2Var2.m = r5;
                                    qw2Var2.p = 5;
                                    objE = ag0Var2.n(qw2Var2);
                                    if (objE != obj2) {
                                        uw2Var5 = uw2Var4;
                                        r6 = r5;
                                        list = (List) objE;
                                        this.d = r6;
                                        if (list != null) {
                                            it = list.iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                } else {
                                                    next = r6;
                                                }
                                                u13Var2 = (u13) next;
                                                if (u13Var2 != null) {
                                                    qw2Var2.c = r6;
                                                    qw2Var2.d = r6;
                                                    qw2Var2.h = r6;
                                                    qw2Var2.l = r6;
                                                    qw2Var2.m = r6;
                                                    qw2Var2.p = 6;
                                                    objC = c(u13Var2, qw2Var2);
                                                    if (objC == obj2) {
                                                        return objC;
                                                    }
                                                }
                                            } while (!((u13) next).a().contains(uw2Var5.a));
                                            u13Var2 = (u13) next;
                                            if (u13Var2 != null) {
                                                qw2Var2.c = r6;
                                                qw2Var2.d = r6;
                                                qw2Var2.h = r6;
                                                qw2Var2.l = r6;
                                                qw2Var2.m = r6;
                                                qw2Var2.p = 6;
                                                objC = c(u13Var2, qw2Var2);
                                                if (objC == obj2) {
                                                    return objC;
                                                }
                                            }
                                        }
                                        return v13.a;
                                    }
                                }
                            } else {
                                u41.k("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                            }
                            obj = charSequence;
                            sdVar.c = obj;
                            sdVar.e = new ArrayList();
                            arrayList2 = (ArrayList) ci4Var2.h;
                            if (arrayList2 != null) {
                                objO = xm4.o(arrayList2);
                            } else {
                                pm4 pm4Var2 = xm4.d;
                                objO = cn4.m;
                            }
                            sdVar.d = objO;
                            ag0Var = new ag0(true);
                            r4 = charSequence2;
                            ag0Var.H(r4);
                            this.d = ag0Var;
                            jt0 jt0Var2 = sw0.a;
                            eh1 eh1Var2 = i92.a;
                            df dfVar2 = new df(this, activity2, sdVar, r4, 8);
                            qw2Var2.c = r4;
                            qw2Var2.d = uw2Var3;
                            qw2Var2.h = r4;
                            qw2Var2.l = r4;
                            qw2Var2.m = ag0Var;
                            qw2Var2.p = 4;
                            objE = py.Y(eh1Var2, dfVar2, qw2Var2);
                            if (objE != obj2) {
                                ag0Var2 = ag0Var;
                                uw2Var4 = uw2Var3;
                                r5 = r4;
                                objE.getClass();
                                fuVar = (fu) objE;
                                i3 = fuVar.a;
                                if (i3 != 0) {
                                    this.d = r5;
                                    return new w13(ud2.m(i3, "launch_"), fuVar.c);
                                }
                                qw2Var2.c = r5;
                                qw2Var2.d = uw2Var4;
                                qw2Var2.h = r5;
                                qw2Var2.l = r5;
                                qw2Var2.m = r5;
                                qw2Var2.p = 5;
                                objE = ag0Var2.n(qw2Var2);
                                if (objE != obj2) {
                                    uw2Var5 = uw2Var4;
                                    r6 = r5;
                                    list = (List) objE;
                                    this.d = r6;
                                    if (list != null) {
                                        it = list.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = r6;
                                            }
                                            u13Var2 = (u13) next;
                                            if (u13Var2 != null) {
                                                qw2Var2.c = r6;
                                                qw2Var2.d = r6;
                                                qw2Var2.h = r6;
                                                qw2Var2.l = r6;
                                                qw2Var2.m = r6;
                                                qw2Var2.p = 6;
                                                objC = c(u13Var2, qw2Var2);
                                                if (objC == obj2) {
                                                    return objC;
                                                }
                                            }
                                        } while (!((u13) next).a().contains(uw2Var5.a));
                                        u13Var2 = (u13) next;
                                        if (u13Var2 != null) {
                                            qw2Var2.c = r6;
                                            qw2Var2.d = r6;
                                            qw2Var2.h = r6;
                                            qw2Var2.l = r6;
                                            qw2Var2.m = r6;
                                            qw2Var2.p = 6;
                                            objC = c(u13Var2, qw2Var2);
                                            if (objC == obj2) {
                                                return objC;
                                            }
                                        }
                                    }
                                    return v13.a;
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                String str9 = qw2Var2.h;
                uw2 uw2Var6 = qw2Var2.d;
                activity2 = qw2Var2.c;
                g13.O(objE);
                str2 = str9;
                uw2Var2 = uw2Var6;
                if (!((Boolean) objE).booleanValue()) {
                    return new w13("billing_unavailable");
                }
                String str10 = uw2Var2.a;
                qw2Var2.c = activity2;
                qw2Var2.d = uw2Var2;
                qw2Var2.h = str2;
                qw2Var2.p = 2;
                objE = e(str10, qw2Var2);
                if (objE != obj2) {
                    String str11 = str2;
                    uw2Var3 = uw2Var2;
                    str3 = str11;
                    a03Var = (a03) objE;
                    if (a03Var == null) {
                        return new w13("product_unavailable");
                    }
                    ci4Var = new ci4(11, z3);
                    e eVar4 = new e();
                    eVar4.b = 0;
                    eVar4.a = true;
                    ci4Var.l = eVar4;
                    mi4Var = new mi4(2, false);
                    mi4Var.d = a03Var;
                    if (a03Var.a() != null) {
                        a03Var.a().getClass();
                        str5 = a03Var.a().a;
                        if (str5 != null) {
                            mi4Var.h = str5;
                        }
                    }
                    str4 = uw2Var3.f;
                    if (TextUtils.isEmpty(str4)) {
                        u41.k("offerToken can not be empty");
                        return null;
                    }
                    mi4Var.h = str4;
                    ci4Var.h = new ArrayList(kr1.T(new cu(mi4Var)));
                    ci4Var.d = mo3.T0(64, str3);
                    qw2Var2.c = activity2;
                    qw2Var2.d = uw2Var3;
                    qw2Var2.h = null;
                    qw2Var2.l = ci4Var;
                    qw2Var2.p = 3;
                    objE = b(str3, qw2Var2);
                    if (objE != obj2) {
                        ci4Var2 = ci4Var;
                        u13Var = (u13) objE;
                        if (u13Var != null) {
                            JSONObject jSONObject2 = u13Var.c;
                            charSequence = null;
                            strOptString = jSONObject2.optString("token", jSONObject2.optString("purchaseToken"));
                            arrayListA = u13Var.a();
                            if (arrayListA.isEmpty()) {
                                z = false;
                                charSequence2 = null;
                            } else {
                                size = arrayListA.size();
                                i = 0;
                                while (true) {
                                    if (i < size) {
                                        Object obj5 = arrayListA.get(i);
                                        i++;
                                        charSequence2 = charSequence3;
                                        str6 = (String) obj5;
                                        str6.getClass();
                                        if (to3.j0(str6, "_pro", false)) {
                                            z = true;
                                        } else {
                                            charSequence3 = charSequence2;
                                        }
                                    } else {
                                        charSequence2 = charSequence3;
                                        z = false;
                                    }
                                }
                            }
                            if (to3.j0(uw2Var3.a, "_pro", false)) {
                                i2 = 1;
                            } else {
                                i2 = 1;
                            }
                            if (TextUtils.isEmpty(strOptString)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            boolean zIsEmpty3 = TextUtils.isEmpty(charSequence2);
                            if (!z2) {
                            }
                            if (z2) {
                            }
                            du duVar3 = new du(0);
                            duVar3.c = strOptString;
                            duVar3.b = i2;
                            ci4Var2.getClass();
                            e eVar5 = new e();
                            eVar5.c = duVar3.c;
                            eVar5.b = duVar3.b;
                            ci4Var2.l = eVar5;
                        } else {
                            charSequence = null;
                            charSequence2 = null;
                        }
                        arrayList = (ArrayList) ci4Var2.h;
                        if (arrayList != null) {
                            break;
                        }
                        u41.k("Details of the products must be provided.");
                        return charSequence;
                    }
                }
                return obj2;
            case 2:
                str3 = qw2Var2.h;
                uw2Var3 = qw2Var2.d;
                activity2 = qw2Var2.c;
                g13.O(objE);
                a03Var = (a03) objE;
                if (a03Var == null) {
                    return new w13("product_unavailable");
                }
                ci4Var = new ci4(11, z3);
                e eVar6 = new e();
                eVar6.b = 0;
                eVar6.a = true;
                ci4Var.l = eVar6;
                mi4Var = new mi4(2, false);
                mi4Var.d = a03Var;
                if (a03Var.a() != null) {
                    a03Var.a().getClass();
                    str5 = a03Var.a().a;
                    if (str5 != null) {
                        mi4Var.h = str5;
                    }
                }
                str4 = uw2Var3.f;
                if (TextUtils.isEmpty(str4)) {
                    u41.k("offerToken can not be empty");
                    return null;
                }
                mi4Var.h = str4;
                ci4Var.h = new ArrayList(kr1.T(new cu(mi4Var)));
                ci4Var.d = mo3.T0(64, str3);
                qw2Var2.c = activity2;
                qw2Var2.d = uw2Var3;
                qw2Var2.h = null;
                qw2Var2.l = ci4Var;
                qw2Var2.p = 3;
                objE = b(str3, qw2Var2);
                if (objE != obj2) {
                    ci4Var2 = ci4Var;
                    u13Var = (u13) objE;
                    if (u13Var != null) {
                        JSONObject jSONObject3 = u13Var.c;
                        charSequence = null;
                        strOptString = jSONObject3.optString("token", jSONObject3.optString("purchaseToken"));
                        arrayListA = u13Var.a();
                        if (arrayListA.isEmpty()) {
                            z = false;
                            charSequence2 = null;
                        } else {
                            size = arrayListA.size();
                            i = 0;
                            while (true) {
                                if (i < size) {
                                    Object obj6 = arrayListA.get(i);
                                    i++;
                                    charSequence2 = charSequence3;
                                    str6 = (String) obj6;
                                    str6.getClass();
                                    if (to3.j0(str6, "_pro", false)) {
                                        z = true;
                                    } else {
                                        charSequence3 = charSequence2;
                                    }
                                } else {
                                    charSequence2 = charSequence3;
                                    z = false;
                                }
                            }
                        }
                        if (to3.j0(uw2Var3.a, "_pro", false)) {
                            i2 = 1;
                        } else {
                            i2 = 1;
                        }
                        if (TextUtils.isEmpty(strOptString)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        boolean zIsEmpty4 = TextUtils.isEmpty(charSequence2);
                        if (!z2) {
                        }
                        if (z2) {
                        }
                        du duVar4 = new du(0);
                        duVar4.c = strOptString;
                        duVar4.b = i2;
                        ci4Var2.getClass();
                        e eVar7 = new e();
                        eVar7.c = duVar4.c;
                        eVar7.b = duVar4.b;
                        ci4Var2.l = eVar7;
                    } else {
                        charSequence = null;
                        charSequence2 = null;
                    }
                    arrayList = (ArrayList) ci4Var2.h;
                    if (arrayList != null) {
                        break;
                    }
                    u41.k("Details of the products must be provided.");
                    return charSequence;
                }
                return obj2;
            case 3:
                ci4Var2 = qw2Var2.l;
                uw2Var3 = qw2Var2.d;
                activity2 = qw2Var2.c;
                g13.O(objE);
                u13Var = (u13) objE;
                if (u13Var != null) {
                    JSONObject jSONObject4 = u13Var.c;
                    charSequence = null;
                    strOptString = jSONObject4.optString("token", jSONObject4.optString("purchaseToken"));
                    arrayListA = u13Var.a();
                    if (arrayListA.isEmpty()) {
                        z = false;
                        charSequence2 = null;
                    } else {
                        size = arrayListA.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                                Object obj7 = arrayListA.get(i);
                                i++;
                                charSequence2 = charSequence3;
                                str6 = (String) obj7;
                                str6.getClass();
                                if (to3.j0(str6, "_pro", false)) {
                                    z = true;
                                } else {
                                    charSequence3 = charSequence2;
                                }
                            } else {
                                charSequence2 = charSequence3;
                                z = false;
                            }
                        }
                    }
                    if (to3.j0(uw2Var3.a, "_pro", false)) {
                        i2 = 1;
                    } else {
                        i2 = 1;
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    boolean zIsEmpty5 = TextUtils.isEmpty(charSequence2);
                    if (!z2) {
                    }
                    if (z2) {
                    }
                    du duVar5 = new du(0);
                    duVar5.c = strOptString;
                    duVar5.b = i2;
                    ci4Var2.getClass();
                    e eVar8 = new e();
                    eVar8.c = duVar5.c;
                    eVar8.b = duVar5.b;
                    ci4Var2.l = eVar8;
                } else {
                    charSequence = null;
                    charSequence2 = null;
                }
                arrayList = (ArrayList) ci4Var2.h;
                if (arrayList != null) {
                    break;
                }
                u41.k("Details of the products must be provided.");
                return charSequence;
            case 4:
                ag0 ag0Var3 = qw2Var2.m;
                uw2Var4 = qw2Var2.d;
                g13.O(objE);
                r5 = 0;
                ag0Var2 = ag0Var3;
                objE.getClass();
                fuVar = (fu) objE;
                i3 = fuVar.a;
                if (i3 != 0) {
                    this.d = r5;
                    return new w13(ud2.m(i3, "launch_"), fuVar.c);
                }
                qw2Var2.c = r5;
                qw2Var2.d = uw2Var4;
                qw2Var2.h = r5;
                qw2Var2.l = r5;
                qw2Var2.m = r5;
                qw2Var2.p = 5;
                objE = ag0Var2.n(qw2Var2);
                if (objE != obj2) {
                    uw2Var5 = uw2Var4;
                    r6 = r5;
                    list = (List) objE;
                    this.d = r6;
                    if (list != null) {
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = r6;
                            }
                            u13Var2 = (u13) next;
                            if (u13Var2 != null) {
                                qw2Var2.c = r6;
                                qw2Var2.d = r6;
                                qw2Var2.h = r6;
                                qw2Var2.l = r6;
                                qw2Var2.m = r6;
                                qw2Var2.p = 6;
                                objC = c(u13Var2, qw2Var2);
                                if (objC == obj2) {
                                    return objC;
                                }
                            }
                        } while (!((u13) next).a().contains(uw2Var5.a));
                        u13Var2 = (u13) next;
                        if (u13Var2 != null) {
                            qw2Var2.c = r6;
                            qw2Var2.d = r6;
                            qw2Var2.h = r6;
                            qw2Var2.l = r6;
                            qw2Var2.m = r6;
                            qw2Var2.p = 6;
                            objC = c(u13Var2, qw2Var2);
                            if (objC == obj2) {
                                return objC;
                            }
                        }
                    }
                    return v13.a;
                }
                return obj2;
            case 5:
                uw2Var5 = qw2Var2.d;
                g13.O(objE);
                r6 = 0;
                list = (List) objE;
                this.d = r6;
                if (list != null) {
                    it = list.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = r6;
                        }
                        u13Var2 = (u13) next;
                        if (u13Var2 != null) {
                            qw2Var2.c = r6;
                            qw2Var2.d = r6;
                            qw2Var2.h = r6;
                            qw2Var2.l = r6;
                            qw2Var2.m = r6;
                            qw2Var2.p = 6;
                            objC = c(u13Var2, qw2Var2);
                            if (objC == obj2) {
                                return obj2;
                            }
                            return objC;
                        }
                    } while (!((u13) next).a().contains(uw2Var5.a));
                    u13Var2 = (u13) next;
                    if (u13Var2 != null) {
                        qw2Var2.c = r6;
                        qw2Var2.d = r6;
                        qw2Var2.h = r6;
                        qw2Var2.l = r6;
                        qw2Var2.m = r6;
                        qw2Var2.p = 6;
                        objC = c(u13Var2, qw2Var2);
                        if (objC == obj2) {
                            return obj2;
                        }
                        return objC;
                    }
                }
                return v13.a;
            case 6:
                g13.O(objE);
                return objE;
            default:
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (r1 == r8) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.uo0 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw2.g(uo0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:31:0x007f->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x009e -> B:38:0x00a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(defpackage.uo0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.sw2
            if (r0 == 0) goto L13
            r0 = r9
            sw2 r0 = (defpackage.sw2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            sw2 r0 = new sw2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.l
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            hq0 r6 = defpackage.hq0.c
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.util.Iterator r1 = r0.c
            defpackage.g13.O(r9)
            goto La1
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r8)
            return r5
        L37:
            defpackage.g13.O(r9)
            goto L6f
        L3b:
            defpackage.g13.O(r9)
            goto L4b
        L3f:
            defpackage.g13.O(r9)
            r0.l = r4
            java.lang.Object r9 = r8.a(r0)
            if (r9 != r6) goto L4b
            goto La0
        L4b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L54
            goto L77
        L54:
            d5 r9 = new d5
            r1 = 12
            r9.<init>(r1)
            java.lang.String r1 = "subs"
            r9.d = r1
            d5 r1 = new d5
            r1.<init>(r9)
            r0.l = r3
            au r9 = r8.f
            java.lang.Object r9 = defpackage.g13.J(r9, r1, r0)
            if (r9 != r6) goto L6f
            goto La0
        L6f:
            a23 r9 = (defpackage.a23) r9
            fu r1 = r9.a
            int r1 = r1.a
            if (r1 == 0) goto L78
        L77:
            return r5
        L78:
            java.util.List r9 = r9.b
            java.util.Iterator r9 = r9.iterator()
            r1 = r9
        L7f:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto La5
            java.lang.Object r9 = r1.next()
            u13 r9 = (defpackage.u13) r9
            org.json.JSONObject r3 = r9.c
            java.lang.String r7 = "purchaseState"
            int r3 = r3.optInt(r7, r4)
            r7 = 4
            if (r3 == r7) goto L7f
            r0.c = r1
            r0.l = r2
            java.lang.Object r9 = r8.c(r9, r0)
            if (r9 != r6) goto La1
        La0:
            return r6
        La1:
            r5 = r9
            z13 r5 = (defpackage.z13) r5
            goto L7f
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw2.h(uo0):java.lang.Object");
    }
}
