package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ws3 extends ts3 {
    public final Runnable h;

    public ws3(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(xr0.a0(runnable));
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return ud2.r(sb, this.d ? "Blocking" : "Non-blocking", ']');
    }
}
