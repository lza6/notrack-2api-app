package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dw0 implements Executor {
    public static final dw0 c;
    public static final /* synthetic */ dw0[] d;

    static {
        dw0 dw0Var = new dw0("INSTANCE", 0);
        c = dw0Var;
        d = new dw0[]{dw0Var};
    }

    public static dw0 valueOf(String str) {
        return (dw0) Enum.valueOf(dw0.class, str);
    }

    public static dw0[] values() {
        return (dw0[]) d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
