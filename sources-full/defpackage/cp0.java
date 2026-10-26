package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
        this.m = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0157  */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = 1;
        Object obj2 = this.m;
        Object obj3 = this.l;
        int i3 = 0;
        Object obj4 = this.h;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                z22 z22Var = (z22) obj5;
                if (z22Var.b()) {
                    ly3 ly3Var = (ly3) obj4;
                    fp1 fp1Var = z22Var.d;
                    ip0 ip0Var = z22Var.v;
                    ip0 ip0Var2 = z22Var.w;
                    q43 q43Var = new q43();
                    ie ieVar = new ie(fp1Var, ip0Var, q43Var, 23);
                    iw2 iw2Var = ly3Var.a;
                    iw2Var.a((ey3) obj3, (in1) obj2, ieVar, ip0Var2);
                    py3 py3Var = new py3(ly3Var, iw2Var);
                    ly3Var.b.set(py3Var);
                    q43Var.c = py3Var;
                    z22Var.e = py3Var;
                }
                return new qc(1);
            case 1:
                long jLongValue = ((Number) obj).longValue();
                gq0 gq0Var = (gq0) obj2;
                n43 n43Var = (n43) obj3;
                go1 go1Var = (go1) obj4;
                gn3 gn3Var = (gn3) ((mi2) obj5).getValue();
                long jLongValue2 = gn3Var != null ? ((Number) gn3Var.getValue()).longValue() : jLongValue;
                long j = go1Var.c;
                oi2 oi2Var = go1Var.a;
                if (j == Long.MIN_VALUE || n43Var.c != vl0.L(gq0Var.getCoroutineContext())) {
                    go1Var.c = jLongValue;
                    Object[] objArr = oi2Var.c;
                    int i4 = oi2Var.h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((eo1) objArr[i5]).o = true;
                    }
                    n43Var.c = vl0.L(gq0Var.getCoroutineContext());
                }
                float f = n43Var.c;
                if (f == 0.0f) {
                    Object[] objArr2 = oi2Var.c;
                    int i6 = oi2Var.h;
                    while (i3 < i6) {
                        eo1 eo1Var = (eo1) objArr2[i3];
                        eo1Var.l.setValue(eo1Var.m.c);
                        eo1Var.o = true;
                        i3++;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - go1Var.c) / f);
                    Object[] objArr3 = oi2Var.c;
                    int i7 = oi2Var.h;
                    boolean z = true;
                    for (int i8 = 0; i8 < i7; i8++) {
                        eo1 eo1Var2 = (eo1) objArr3[i8];
                        if (!eo1Var2.n) {
                            eo1Var2.q.b.setValue(Boolean.FALSE);
                            if (eo1Var2.o) {
                                eo1Var2.o = false;
                                eo1Var2.p = j2;
                            }
                            long j3 = j2 - eo1Var2.p;
                            eo1Var2.l.setValue(eo1Var2.m.b(j3));
                            eo1Var2.n = eo1Var2.m.g(j3);
                        }
                        if (!eo1Var2.n) {
                            z = false;
                        }
                    }
                    go1Var.d.setValue(Boolean.valueOf(!z));
                }
                return w84Var;
            case 2:
                b12 b12Var = (b12) obj5;
                b12Var.c = new iy2((n02) obj4, (ip3) obj3, (jy2) obj2, 0);
                return new g4(7, b12Var);
            case 3:
                vf vfVar = (vf) obj;
                n43 n43Var2 = (n43) obj5;
                float fFloatValue = ((Number) vfVar.e.getValue()).floatValue() - n43Var2.c;
                if (py.k(fFloatValue)) {
                    if (((Boolean) ((h4) obj2).invoke(Float.valueOf(n43Var2.c))).booleanValue()) {
                        vfVar.a();
                    }
                } else if (py.k(fFloatValue - lv0.a((lv0) obj4, (mc3) obj3, fFloatValue))) {
                    n43Var2.c += fFloatValue;
                    if (((Boolean) ((h4) obj2).invoke(Float.valueOf(n43Var2.c))).booleanValue()) {
                        vfVar.a();
                    }
                } else {
                    vfVar.a();
                }
                return w84Var;
            case 4:
                mv2 mv2Var = (mv2) obj;
                ji4 ji4Var = ((h01) obj5).a;
                r92 r92VarF = ji4Var.f();
                i01 i01Var = i01.c;
                float fD = r92VarF.d(i01Var);
                nv2 nv2Var = (nv2) obj4;
                float f2 = -nv2Var.c;
                mi2 mi2Var = (mi2) obj2;
                t64 t64Var = uj2.a;
                if (!((Boolean) mi2Var.getValue()).booleanValue() || fD != f2) {
                    if (!((Boolean) mi2Var.getValue()).booleanValue()) {
                        mi2Var.setValue(Boolean.TRUE);
                    }
                    kj2 kj2Var = new kj2(f2, 0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(i01Var, Float.valueOf(kj2Var.d));
                    linkedHashMap.put(i01.d, Float.valueOf(0.0f));
                    ji4.z(ji4Var, new r92(linkedHashMap));
                }
                mv2.f(mv2Var, (nv2) obj3, gb2.R(ji4Var.p()) + nv2Var.c, 0);
                mv2.f(mv2Var, nv2Var, gb2.R(ji4Var.p()), 0);
                return w84Var;
            default:
                co0 co0Var = (co0) obj;
                int i9 = ((rc2) ((gn3) obj5).getValue()).a;
                ho0 ho0Var = (ho0) obj4;
                st3 st3Var = st3.Cut;
                int i10 = 4;
                ne1 ne1Var = (ne1) obj3;
                wx3 wx3Var = (wx3) obj2;
                if ((i9 & 4) == 4) {
                    co0.a(co0Var, new mo0(st3Var), new xx3(ho0Var, ne1Var, wx3Var, i3));
                }
                st3 st3Var2 = st3.Copy;
                if ((i9 & 1) == 1) {
                    co0.a(co0Var, new mo0(st3Var2), new xx3(ho0Var, ne1Var, wx3Var, i2));
                }
                st3 st3Var3 = st3.Paste;
                int i11 = 2;
                if ((i9 & 2) == 2) {
                    co0.a(co0Var, new mo0(st3Var3), new xx3(ho0Var, ne1Var, wx3Var, i11));
                }
                st3 st3Var4 = st3.SelectAll;
                if ((i9 & 8) == 8) {
                    co0.a(co0Var, new mo0(st3Var4), new xx3(ho0Var, ne1Var, wx3Var, 3));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    st3 st3Var5 = st3.Autofill;
                    if ((i9 & 16) == 16) {
                        co0.a(co0Var, new mo0(st3Var5), new xx3(ho0Var, ne1Var, wx3Var, i10));
                    }
                }
                return w84Var;
        }
    }
}
