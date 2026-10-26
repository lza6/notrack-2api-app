package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a81 extends CancellationException {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a81(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.c) {
            case 0:
                setStackTrace(py.r);
                break;
            case 1:
                setStackTrace(xp1.i);
                break;
            case 2:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 3:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(g13.g);
                break;
        }
        return this;
    }
}
