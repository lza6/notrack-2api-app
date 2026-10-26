package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends ClickableSpan {
    public final int c;
    public final p1 d;
    public final int h;

    public a1(int i, p1 p1Var, int i2) {
        this.c = i;
        this.d = p1Var;
        this.h = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.c);
        this.d.a.performAction(this.h, bundle);
    }
}
