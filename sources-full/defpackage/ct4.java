package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ct4 {
    public final int a;

    public ct4(int i) {
        this.a = i;
    }

    public static at4 a(int i) {
        at4 at4Var = new at4();
        at4Var.a = i;
        at4Var.b = (byte) (((byte) (at4Var.b | 1)) | 2);
        return at4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ct4) && this.a == ((ct4) obj).a;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return ud2.q("AppUpdateOptions{appUpdateType=", ", allowAssetPackDeletion=false}", this.a);
    }
}
