package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class xz0 implements am1 {
    public final Drawable a;

    public xz0(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.am1
    public final boolean a() {
        return false;
    }

    @Override // defpackage.am1
    public final void b(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz0) && kr1.n(this.a, ((xz0) obj).a);
    }

    @Override // defpackage.am1
    public final int getHeight() {
        return ta4.a(this.a);
    }

    @Override // defpackage.am1
    public final long getSize() {
        Drawable drawable = this.a;
        long jB = ((long) ta4.b(drawable)) * 4 * ((long) ta4.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    @Override // defpackage.am1
    public final int getWidth() {
        return ta4.b(this.a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
