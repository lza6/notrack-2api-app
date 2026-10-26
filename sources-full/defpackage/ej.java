package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class ej {
    public final TextView a;
    public final sz0 b;

    public ej(TextView textView) {
        this.a = textView;
        sz0 sz0Var = new sz0();
        sz0Var.c = new n21(textView);
        this.b = sz0Var;
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, g23.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        ((vl0) this.b.c).a0(z);
    }

    public final void c(boolean z) {
        ((vl0) this.b.c).b0(z);
    }
}
