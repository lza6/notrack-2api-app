package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends Throwable {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.c) {
            case 0:
                synchronized (this) {
                    break;
                }
                break;
            case 1:
                synchronized (this) {
                    break;
                }
                break;
            case 2:
                synchronized (this) {
                    break;
                }
                break;
            default:
                synchronized (this) {
                    break;
                }
                break;
        }
        return this;
    }
}
