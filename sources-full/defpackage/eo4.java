package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eo4 implements Executor {
    public static final eo4 c;
    public static final /* synthetic */ eo4[] d;

    static {
        eo4 eo4Var = new eo4("INSTANCE", 0);
        c = eo4Var;
        d = new eo4[]{eo4Var};
    }

    public static eo4[] values() {
        return (eo4[]) d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
