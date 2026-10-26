package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class bw3 implements gn3, ln3 {
    public ez3 h;
    public final ft2 c = new ft2(null, aw3.f);
    public final ft2 d = new ft2(null, zv3.g);
    public yv3 l = new yv3();

    @Override // defpackage.ln3
    public final nn3 b() {
        return this.l;
    }

    public final xy3 c(aw3 aw3Var, zv3 zv3Var) {
        f72 f72Var;
        CharSequence charSequence;
        uz3 uz3Var;
        au3 au3VarD = aw3Var.a.d();
        yv3 yv3Var = (yv3) vk3.i(this.l);
        xy3 xy3Var = yv3Var.n;
        if (xy3Var != null && (charSequence = yv3Var.c) != null && to3.i0(charSequence, au3VarD) && kr1.n(yv3Var.d, au3VarD.c) && kr1.n(yv3Var.e, au3VarD.l) && yv3Var.g == aw3Var.c && yv3Var.h == aw3Var.d && yv3Var.k == zv3Var.b && yv3Var.i == zv3Var.a.getDensity() && yv3Var.j == zv3Var.a.l() && um0.b(yv3Var.m, zv3Var.d) && kr1.n(yv3Var.l, zv3Var.c) && !xy3Var.b.a.b()) {
            uz3 uz3Var2 = yv3Var.f;
            boolean zC = uz3Var2 != null ? uz3Var2.c(aw3Var.b) : false;
            uz3 uz3Var3 = yv3Var.f;
            boolean z = uz3Var3 != null && (uz3Var3 == (uz3Var = aw3Var.b) || uz3Var3.a.b(uz3Var.a));
            if (zC && z) {
                return xy3Var;
            }
            if (zC) {
                wy3 wy3Var = xy3Var.a;
                return new xy3(new wy3(wy3Var.a, aw3Var.b, wy3Var.c, wy3Var.d, wy3Var.e, wy3Var.f, wy3Var.g, wy3Var.h, wy3Var.i, wy3Var.j), xy3Var.b, xy3Var.c);
            }
        }
        ez3 ez3Var = this.h;
        if (ez3Var == null) {
            ez3Var = new ez3(zv3Var.c, zv3Var.a, zv3Var.b, 1);
            this.h = ez3Var;
        }
        ez3 ez3Var2 = ez3Var;
        boolean z2 = aw3Var.e;
        uz3 uz3VarD = aw3Var.b;
        if (z2) {
            g72 g72Var = uz3VarD.a.k;
            if (g72Var == null || (f72Var = (f72) g72Var.c.get(0)) == null) {
                f72Var = (f72) yv2.a.z().c.get(0);
            }
            Locale locale = f72Var.a;
            byte directionality = Build.VERSION.SDK_INT >= 28 ? Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(locale).getDigitStrings()[0], 0)) : Character.getDirectionality(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
            uz3VarD = uz3VarD.d(new uz3(0L, 0L, null, 0L, 0, (directionality == 1 || directionality == 2) ? 2 : 1, 0L, 16711679));
        }
        uz3 uz3Var4 = uz3VarD;
        String string = au3VarD.d.toString();
        List list = au3VarD.c;
        if (list == null) {
            list = z21.c;
        }
        xy3 xy3VarA = ez3.a(ez3Var2, new hg(string, list), uz3Var4, aw3Var.d, aw3Var.c ? 1 : IntCompanionObject.MAX_VALUE, zv3Var.d, zv3Var.b, zv3Var.a, zv3Var.c, 1060);
        if (!xy3VarA.equals(xy3Var)) {
            pk3 pk3VarK = vk3.k();
            if (!pk3VarK.f()) {
                yv3 yv3Var2 = this.l;
                synchronized (vk3.b) {
                    yv3 yv3Var3 = (yv3) vk3.w(yv3Var2, this, pk3VarK);
                    yv3Var3.c = au3VarD;
                    yv3Var3.d = au3VarD.c;
                    yv3Var3.e = au3VarD.l;
                    yv3Var3.g = aw3Var.c;
                    yv3Var3.h = aw3Var.d;
                    yv3Var3.f = aw3Var.b;
                    yv3Var3.k = zv3Var.b;
                    yv3Var3.i = zv3Var.e;
                    yv3Var3.j = zv3Var.f;
                    yv3Var3.m = zv3Var.d;
                    yv3Var3.l = zv3Var.c;
                    yv3Var3.n = xy3VarA;
                }
                vk3.n(pk3VarK, this);
                return xy3VarA;
            }
        }
        return xy3VarA;
    }

    @Override // defpackage.ln3
    public final nn3 d(nn3 nn3Var, nn3 nn3Var2, nn3 nn3Var3) {
        return nn3Var3;
    }

    @Override // defpackage.ln3
    public final void g(nn3 nn3Var) {
        nn3Var.getClass();
        this.l = (yv3) nn3Var;
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        zv3 zv3Var;
        aw3 aw3Var = (aw3) this.c.getValue();
        if (aw3Var == null || (zv3Var = (zv3) this.d.getValue()) == null) {
            return null;
        }
        return c(aw3Var, zv3Var);
    }
}
