package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class yu1 {
    public final KeyEvent a;

    public /* synthetic */ yu1(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yu1) {
            return kr1.n(this.a, ((yu1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
