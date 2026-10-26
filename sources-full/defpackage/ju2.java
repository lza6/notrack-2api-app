package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ju2 {
    public final boolean a;
    public final boolean b;

    public ju2(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        this.a = z;
        this.b = z2;
    }
}
