package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u21 implements nn1 {
    public final boolean c;

    public u21(boolean z) {
        this.c = z;
    }

    @Override // defpackage.nn1
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.nn1
    public final yl2 c() {
        return null;
    }

    public final String toString() {
        return ud2.r(new StringBuilder("Empty{"), this.c ? "Active" : "New", '}');
    }
}
