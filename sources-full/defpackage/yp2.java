package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yp2 extends yo4 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp2(int i) {
        super(20);
        this.n = i;
    }

    @Override // defpackage.yo4
    public final String toString() {
        switch (this.n) {
            case 0:
                return "IN_PROGRESS";
            default:
                return "SUCCESS";
        }
    }
}
