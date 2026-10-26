package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sj1 extends x0 {
    @Override // defpackage.x0
    public final rj1 j() {
        throw new ClassCastException("Cannot cast Inline instance to Block");
    }

    @Override // defpackage.x0
    public final boolean l() {
        return false;
    }

    public final String toString() {
        return "InlineImpl{name='" + ((String) this.h) + "', start=" + this.c + ", end=" + this.d + ", attributes=" + ((Map) this.l) + '}';
    }
}
