package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class z90 implements l81 {
    public final /* synthetic */ gq0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ lh1 h;
    public final /* synthetic */ h01 l;
    public final /* synthetic */ gq0 m;
    public final /* synthetic */ mi2 n;
    public final /* synthetic */ gn3 o;
    public final /* synthetic */ g22 p;
    public final /* synthetic */ mi2 q;

    public z90(gq0 gq0Var, Context context, lh1 lh1Var, h01 h01Var, gq0 gq0Var2, mi2 mi2Var, gn3 gn3Var, g22 g22Var, mi2 mi2Var2) {
        this.c = gq0Var;
        this.d = context;
        this.h = lh1Var;
        this.l = h01Var;
        this.m = gq0Var2;
        this.n = mi2Var;
        this.o = gn3Var;
        this.p = g22Var;
        this.q = mi2Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if ((r6 != null ? r6.c : null) == defpackage.mm3.c) goto L12;
     */
    @Override // defpackage.l81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, defpackage.so0 r7) {
        /*
            r5 = this;
            f50 r6 = (defpackage.f50) r6
            boolean r0 = r6 instanceof defpackage.c50
            w84 r1 = defpackage.w84.a
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L40
            mi2 r6 = r5.n
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L32
            gn3 r6 = r5.o
            java.lang.Object r6 = r6.getValue()
            xa0 r6 = (defpackage.xa0) r6
            java.util.List r6 = r6.a
            java.lang.Object r6 = defpackage.ke0.F0(r6)
            yd2 r6 = (defpackage.yd2) r6
            if (r6 == 0) goto L2d
            mm3 r6 = r6.c
            goto L2e
        L2d:
            r6 = r3
        L2e:
            mm3 r7 = defpackage.mm3.c
            if (r6 != r7) goto Lb3
        L32:
            y90 r6 = new y90
            g22 r7 = r5.p
            r6.<init>(r2, r3, r7)
            r7 = 3
            gq0 r5 = r5.c
            defpackage.py.F(r5, r3, r3, r6, r7)
            return r1
        L40:
            boolean r0 = r6 instanceof defpackage.d50
            android.content.Context r4 = r5.d
            if (r0 == 0) goto L52
            d50 r6 = (defpackage.d50) r6
            java.lang.String r5 = r6.a
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r2)
            r5.show()
            return r1
        L52:
            boolean r0 = r6 instanceof defpackage.e50
            if (r0 == 0) goto L5e
            lh1 r5 = r5.h
            r6 = 9
            r5.mo63x70bb4fce(r6)
            return r1
        L5e:
            boolean r0 = r6 instanceof defpackage.z40
            if (r0 == 0) goto L71
            r5 = 2131755197(0x7f1000bd, float:1.9141266E38)
            java.lang.String r5 = r4.getString(r5)
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r2)
            r5.show()
            return r1
        L71:
            boolean r0 = r6 instanceof defpackage.y40
            if (r0 == 0) goto L80
            h01 r5 = r5.l
            java.lang.Object r5 = r5.b(r7)
            hq0 r6 = defpackage.hq0.c
            if (r5 != r6) goto Lb3
            return r5
        L80:
            boolean r7 = r6 instanceof defpackage.x40
            if (r7 != 0) goto Lb3
            boolean r7 = r6 instanceof defpackage.b50
            if (r7 == 0) goto La4
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> Lb3
            java.lang.String r7 = "android.intent.action.VIEW"
            b50 r6 = (defpackage.b50) r6     // Catch: java.lang.Exception -> Lb3
            java.lang.String r6 = r6.a     // Catch: java.lang.Exception -> Lb3
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> Lb3
            r5.<init>(r7, r6)     // Catch: java.lang.Exception -> Lb3
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r5 = r5.addFlags(r6)     // Catch: java.lang.Exception -> Lb3
            r5.getClass()     // Catch: java.lang.Exception -> Lb3
            r4.startActivity(r5)     // Catch: java.lang.Exception -> Lb3
            return r1
        La4:
            boolean r6 = r6 instanceof defpackage.a50
            if (r6 == 0) goto Laf
            mi2 r5 = r5.q
            r6 = 1
            defpackage.wa0.h1(r5, r6)
            return r1
        Laf:
            defpackage.u41.e()
            return r3
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z90.emit(java.lang.Object, so0):java.lang.Object");
    }
}
