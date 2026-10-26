package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class tg extends SegmentFinder {
    public final /* synthetic */ bv0 a;

    public tg(bv0 bv0Var) {
        this.a = bv0Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.d(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.a(i);
    }
}
