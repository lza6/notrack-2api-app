package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class n21 extends vl0 {
    public final m21 h;

    public n21(TextView textView) {
        this.h = new m21(textView);
    }

    @Override // defpackage.vl0
    public final InputFilter[] M(InputFilter[] inputFilterArr) {
        return !y11.d() ? inputFilterArr : this.h.M(inputFilterArr);
    }

    @Override // defpackage.vl0
    public final void a0(boolean z) {
        if (y11.d()) {
            this.h.a0(z);
        }
    }

    @Override // defpackage.vl0
    public final void b0(boolean z) {
        boolean zD = y11.d();
        m21 m21Var = this.h;
        if (zD) {
            m21Var.b0(z);
        } else {
            m21Var.j = z;
        }
    }
}
