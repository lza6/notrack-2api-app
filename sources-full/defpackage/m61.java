package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m61 extends x83 {
    public final HashMap m = new HashMap();

    @Override // defpackage.x83
    public final u83 b(Object obj) {
        return (u83) this.m.get(obj);
    }

    @Override // defpackage.x83
    public final Object d(Object obj) {
        Object objD = super.d(obj);
        this.m.remove(obj);
        return objD;
    }
}
