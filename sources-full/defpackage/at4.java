package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class at4 {
    public int a;
    public byte b;

    public final ct4 a() {
        if (this.b == 3) {
            return new ct4(this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.b & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        u41.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
