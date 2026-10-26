package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ly {
    public static final i30 a = new i30(-1, null, null, 0);
    public static final int b = xr0.t0(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = xr0.t0(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final d5 d = new d5("BUFFERED", 16);
    public static final d5 e = new d5("SHOULD_BUFFER", 16);
    public static final d5 f = new d5("S_RESUMING_BY_RCV", 16);
    public static final d5 g = new d5("RESUMING_BY_EB", 16);
    public static final d5 h = new d5("POISONED", 16);
    public static final d5 i = new d5("DONE_RCV", 16);
    public static final d5 j = new d5("INTERRUPTED_SEND", 16);
    public static final d5 k = new d5("INTERRUPTED_RCV", 16);
    public static final d5 l = new d5("CHANNEL_CLOSED", 16);
    public static final d5 m = new d5("SUSPEND", 16);
    public static final d5 n = new d5("SUSPEND_NO_WAITER", 16);
    public static final d5 o = new d5("FAILED", 16);
    public static final d5 p = new d5("NO_RECEIVE_RESULT", 16);
    public static final d5 q = new d5("CLOSE_HANDLER_CLOSED", 16);
    public static final d5 r = new d5("CLOSE_HANDLER_INVOKED", 16);
    public static final d5 s = new d5("NO_CLOSE_CAUSE", 16);

    public static final boolean a(r00 r00Var, Object obj, oe1 oe1Var) {
        d5 d5VarE = r00Var.e(obj, oe1Var);
        if (d5VarE == null) {
            return false;
        }
        r00Var.m(d5VarE);
        return true;
    }
}
