package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class rr {
    public static final pr c = new pr(-1, false, false);
    public final boolean a;
    public final boolean b;

    static {
        new rr(-1, true, false);
        new rr(76, false, true);
        new rr(64, false, true);
    }

    public rr(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && z2) {
            u41.k("Failed requirement.");
            throw null;
        }
    }
}
