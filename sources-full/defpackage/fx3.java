package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fx3 implements xt3 {
    public final c9 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public long d = 0;
    public ah1 e = ah1.h;
    public final /* synthetic */ wx3 f;

    public fx3(wx3 wx3Var, c9 c9Var) {
        this.f = wx3Var;
        this.a = c9Var;
    }

    @Override // defpackage.xt3
    public final void a() {
        f();
    }

    @Override // defpackage.xt3
    public final void b() {
    }

    @Override // defpackage.xt3
    public final void c(long j) {
        wx3 wx3Var = this.f;
        boolean z = wx3Var.d;
        c cVar = wx3Var.a;
        az3 az3Var = wx3Var.b;
        if (z) {
            wx3Var.z(this.e, j);
            wx3Var.w(false);
            wx3Var.q.setValue(dx3.d);
            this.c = j;
            this.d = 0L;
            wx3Var.u = -1;
            if (az3Var.b() == null) {
                return;
            }
            if (az3Var.e(j)) {
                if (cVar.d().d.length() == 0) {
                    return;
                }
                int iC = az3Var.c(j, true);
                long jA = wx3Var.A(new au3(wx3Var.a.d(), jz3.b, (jz3) null, (List) null, 28), iC, iC, false, SelectionAdjustment$Companion.getWord(), false, false);
                cVar.j(jA);
                wx3Var.x(vz3.h);
                this.b = (int) (jA >> 32);
                return;
            }
            int iC2 = az3Var.c(j, true);
            lh1 lh1Var = wx3Var.h;
            if (lh1Var != null) {
                lh1Var.mo63x70bb4fce(9);
            }
            cVar.getClass();
            cVar.j(p23.d(iC2, iC2));
            wx3Var.w(true);
            wx3Var.x(vz3.d);
        }
    }

    @Override // defpackage.xt3
    public final void d() {
    }

    @Override // defpackage.xt3
    public final void e(long j) {
        int iIntValue;
        int iC;
        gd3 word;
        long j2;
        wx3 wx3Var = this.f;
        boolean z = wx3Var.d;
        c cVar = wx3Var.a;
        az3 az3Var = wx3Var.b;
        if (!z || az3Var.b() == null || cVar.d().d.length() == 0) {
            return;
        }
        long jI = ln2.i(this.d, j);
        this.d = jI;
        long jI2 = ln2.i(this.c, jI);
        if (this.b >= 0 || az3Var.e(jI2)) {
            int i = this.b;
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : az3Var.c(this.c, false);
            iC = az3Var.c(jI2, false);
            if (this.b < 0 && iIntValue == iC) {
                return;
            }
            word = SelectionAdjustment$Companion.getWord();
            wx3Var.x(vz3.h);
        } else {
            iIntValue = az3Var.c(this.c, true);
            iC = az3Var.c(jI2, true);
            word = iIntValue == iC ? SelectionAdjustment$Companion.getNone() : SelectionAdjustment$Companion.getWord();
        }
        gd3 gd3Var = word;
        int i2 = iIntValue;
        int i3 = iC;
        long j3 = cVar.d().h;
        long jA = wx3Var.A(wx3Var.a.d(), i2, i3, false, gd3Var, false, false);
        if (this.b == -1 && !jz3.c(jA)) {
            this.b = (int) (jA >> 32);
        }
        if (jz3.g(jA)) {
            jA = p23.d((int) (jA & 4294967295L), (int) (jA >> 32));
        }
        if (!jz3.b(jA, j3)) {
            int i4 = (int) (jA >> 32);
            int i5 = (int) (j3 >> 32);
            ah1 ah1Var = ah1.d;
            if (i4 != i5) {
                j2 = 4294967295L;
                if (((int) (jA & 4294967295L)) != ((int) (j3 & 4294967295L))) {
                }
                this.e = ah1Var;
            } else {
                j2 = 4294967295L;
            }
            ah1 ah1Var2 = ah1.h;
            if ((i4 == i5 && ((int) (jA & j2)) != ((int) (j3 & j2))) || (i4 + ((int) (jA & j2))) / 2.0f > (i5 + ((int) (j3 & j2))) / 2.0f) {
                ah1Var = ah1Var2;
            }
            this.e = ah1Var;
        }
        if (jz3.c(j3) || !jz3.c(jA)) {
            cVar.j(jA);
        }
        wx3Var.z(this.e, jI2);
    }

    public final void f() {
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            wx3 wx3Var = this.f;
            wx3Var.e();
            this.b = -1;
            this.c = 9205357640488583168L;
            this.d = 0L;
            wx3Var.u = -1;
            wx3Var.q.setValue(dx3.c);
            this.a.invoke();
        }
    }

    @Override // defpackage.xt3
    public final void onCancel() {
        f();
    }
}
