package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class sj0 extends ClickableSpan {
    public final m42 c;

    public sj0(m42 m42Var) {
        this.c = m42Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.c.getClass();
    }
}
