package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class aa2 implements wa2 {
    public static final aa2 b = new aa2(0);
    public static final aa2 c = new aa2(1);
    public static final aa2 d = new aa2(2);
    public static final aa2 e = new aa2(3);
    public static final aa2 f = new aa2(4);
    public static final aa2 g = new aa2(5);
    public static final aa2 h = new aa2(6);
    public static final aa2 i = new aa2(7);
    public static final aa2 j = new aa2(8);
    public static final aa2 k = new aa2(9);
    public final /* synthetic */ int a;

    public /* synthetic */ aa2(int i2) {
        this.a = i2;
    }

    public /* synthetic */ aa2(ba2 ba2Var, int i2) {
        this.a = i2;
    }

    @Override // defpackage.wa2
    public final void a(ir3 ir3Var, im0 im0Var) {
        int i2 = 0;
        z = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                im0 im0Var2 = (nv) im0Var;
                ir3Var.K();
                int iA0 = ir3Var.a0();
                ir3Var.l0(im0Var2);
                ir3Var.i0(im0Var2, iA0);
                ir3Var.G(im0Var2);
                break;
            case 1:
                sd0 sd0Var = (sd0) im0Var;
                int iA1 = ir3Var.a0();
                jm3 jm3Var = (jm3) ir3Var.h;
                StringBuilder sb = jm3Var.c;
                sb.append(Typography.nbsp);
                sb.append(sd0Var.g);
                jm3Var.a(Typography.nbsp);
                ir3Var.i0(sd0Var, iA1);
                break;
            case 2:
                im0 im0Var3 = (r21) im0Var;
                int iA2 = ir3Var.a0();
                ir3Var.l0(im0Var3);
                ir3Var.i0(im0Var3, iA2);
                break;
            case 3:
                ir3Var.K();
                break;
            case 4:
                vh1 vh1Var = (vh1) im0Var;
                ir3Var.K();
                int iA3 = ir3Var.a0();
                ir3Var.l0(vh1Var);
                yo4.e.b((ua2) ir3Var.d, Integer.valueOf(vh1Var.g));
                ir3Var.i0(vh1Var, iA3);
                ir3Var.G(vh1Var);
                break;
            case 5:
                j42 j42Var = (j42) im0Var;
                int iA4 = ir3Var.a0();
                ir3Var.l0(j42Var);
                yo4.f.b((ua2) ir3Var.d, j42Var.g);
                ir3Var.i0(j42Var, iA4);
                break;
            case 6:
                ((jm3) ir3Var.h).a(' ');
                break;
            case 7:
                im0 im0Var4 = (yo3) im0Var;
                int iA5 = ir3Var.a0();
                ir3Var.l0(im0Var4);
                ir3Var.i0(im0Var4, iA5);
                break;
            case 8:
                im0 im0Var5 = (d04) im0Var;
                ir3Var.K();
                int iA6 = ir3Var.a0();
                ((jm3) ir3Var.h).a(Typography.nbsp);
                ir3Var.i0(im0Var5, iA6);
                ir3Var.G(im0Var5);
                break;
            case 9:
                im0 im0Var6 = (zq3) im0Var;
                int iA7 = ir3Var.a0();
                jm3 jm3Var2 = (jm3) ir3Var.h;
                jm3Var2.a(Typography.nbsp);
                ir3Var.l0(im0Var6);
                jm3Var2.a(Typography.nbsp);
                ir3Var.i0(im0Var6, iA7);
                break;
            case 10:
                p61 p61Var = (p61) im0Var;
                String str = p61Var.j;
                String str2 = p61Var.k;
                str2.getClass();
                ba2.k(ir3Var, str, str2, p61Var);
                break;
            case 11:
                rn1 rn1Var = (rn1) im0Var;
                String str3 = rn1Var.g;
                str3.getClass();
                ba2.k(ir3Var, null, str3, rn1Var);
                break;
            case 12:
                im0 im0Var7 = (h52) im0Var;
                c13 c13Var = yo4.b;
                ua2 ua2Var = (ua2) ir3Var.d;
                int iA8 = ir3Var.a0();
                ir3Var.l0(im0Var7);
                kv kvVar = (kv) ((im0) im0Var7.b);
                kvVar.getClass();
                if (kvVar instanceof kq2) {
                    kq2 kq2Var = (kq2) kvVar;
                    int i3 = kq2Var.h;
                    c13Var.b(ua2Var, yo0.d);
                    yo4.d.b(ua2Var, Integer.valueOf(i3));
                    kq2Var.h++;
                } else {
                    c13Var.b(ua2Var, yo0.c);
                    c13 c13Var2 = yo4.c;
                    for (im0 im0VarC = (kv) ((im0) im0Var7.b); im0VarC != null; im0VarC = im0VarC.c()) {
                        if (im0VarC instanceof h52) {
                            i2++;
                        }
                    }
                    c13Var2.b(ua2Var, Integer.valueOf(i2));
                }
                ir3Var.i0(im0Var7, iA8);
                if (((im0) im0Var7.f) != null) {
                    ir3Var.K();
                }
                break;
            case 13:
                im0 im0Var8 = (rs2) im0Var;
                kv kvVar2 = (kv) ((im0) im0Var8.b);
                if (kvVar2 != null) {
                    kv kvVar3 = (kv) ((im0) kvVar2.b);
                    if (kvVar3 instanceof y42) {
                        z = ((y42) kvVar3).g;
                    }
                }
                if (!z) {
                    ir3Var.K();
                }
                int iA9 = ir3Var.a0();
                ir3Var.l0(im0Var8);
                yo4.g.b((ua2) ir3Var.d, Boolean.valueOf(z));
                ir3Var.i0(im0Var8, iA9);
                if (!z) {
                    ir3Var.G(im0Var8);
                }
                break;
            case 14:
                ir3Var.K();
                int iA10 = ir3Var.a0();
                ir3Var.l0(im0Var);
                ir3Var.i0(im0Var, iA10);
                ir3Var.G(im0Var);
                break;
            case 15:
                ir3Var.K();
                break;
            case 16:
                im0 im0Var9 = (fo3) im0Var;
                int iA11 = ir3Var.a0();
                ir3Var.l0(im0Var9);
                ir3Var.i0(im0Var9, iA11);
                break;
            case 17:
                im0 im0Var10 = (mr3) im0Var;
                ir3Var.K();
                int iA12 = ir3Var.a0();
                ir3Var.l0(im0Var10);
                ir3Var.h0(iA12, new cs3());
                ir3Var.G(im0Var10);
                break;
            default:
                ys3 ys3Var = (ys3) im0Var;
                int iA13 = ir3Var.a0();
                ir3Var.l0(ys3Var);
                c13 c13Var3 = p23.h;
                ua2 ua2Var2 = (ua2) ir3Var.d;
                c13Var3.b(ua2Var2, Boolean.valueOf(ys3Var.g));
                pa2 pa2Var = (pa2) ir3Var.c;
                dm3 dm3VarJ = pa2Var.g.j(ys3.class);
                if (dm3VarJ != null) {
                    ir3Var.h0(iA13, dm3VarJ.a(pa2Var, ua2Var2));
                    if (((im0) ys3Var.f) != null) {
                        ir3Var.K();
                    }
                } else {
                    m51.x(ys3.class.getName());
                }
                break;
        }
    }
}
