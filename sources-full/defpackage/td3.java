package defpackage;

import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class td3 implements xt3 {
    public long a = 0;
    public long b = 0;
    public final /* synthetic */ rd3 c;
    public final /* synthetic */ qe3 d;
    public final /* synthetic */ long e;

    public td3(rd3 rd3Var, qe3 qe3Var, long j) {
        this.c = rd3Var;
        this.d = qe3Var;
        this.e = j;
    }

    @Override // defpackage.xt3
    public final void a() {
        kd3 kd3Var;
        long j = this.e;
        qe3 qe3Var = this.d;
        if (!re3.a(qe3Var, j) || (kd3Var = qe3Var.h) == null) {
            return;
        }
        kd3Var.invoke();
    }

    @Override // defpackage.xt3
    public final void b() {
    }

    @Override // defpackage.xt3
    public final void c(long j) {
        cx1 cx1Var = (cx1) this.c.invoke();
        qe3 qe3Var = this.d;
        if (cx1Var != null) {
            if (!cx1Var.z()) {
                return;
            }
            gd3 word = SelectionAdjustment$Companion.getWord();
            gc gcVar = qe3Var.f;
            if (gcVar != null) {
                gcVar.b(Boolean.TRUE, cx1Var, new ln2(j), word);
            }
            this.a = j;
        }
        if (re3.a(qe3Var, this.e)) {
            this.b = 0L;
        }
    }

    @Override // defpackage.xt3
    public final void d() {
    }

    @Override // defpackage.xt3
    public final void e(long j) {
        cx1 cx1Var = (cx1) this.c.invoke();
        if (cx1Var == null || !cx1Var.z()) {
            return;
        }
        qe3 qe3Var = this.d;
        if (re3.a(qe3Var, this.e)) {
            long jI = ln2.i(this.b, j);
            this.b = jI;
            long jI2 = ln2.i(this.a, jI);
            if (qe3Var.b(cx1Var, jI2, this.a, SelectionAdjustment$Companion.getWord(), true)) {
                this.a = jI2;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.xt3
    public final void onCancel() {
        kd3 kd3Var;
        long j = this.e;
        qe3 qe3Var = this.d;
        if (!re3.a(qe3Var, j) || (kd3Var = qe3Var.h) == null) {
            return;
        }
        kd3Var.invoke();
    }
}
