package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cw0 implements Executor {
    public static final cw0 c;
    public static final /* synthetic */ cw0[] d;

    static {
        cw0 cw0Var = new cw0("INSTANCE", 0);
        c = cw0Var;
        d = new cw0[]{cw0Var};
    }

    public static cw0 valueOf(String str) {
        return (cw0) Enum.valueOf(cw0.class, str);
    }

    public static cw0[] values() {
        return (cw0[]) d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
