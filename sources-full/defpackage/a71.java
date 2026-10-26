package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.List;
import okio.Path$Companion;
import okio.internal.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a71 implements Closeable {
    public static final bu1 c;
    public static final mt2 d;

    static {
        bu1 bu1Var;
        try {
            Class.forName("java.nio.file.Files");
            bu1Var = new nl2();
        } catch (ClassNotFoundException unused) {
            bu1Var = new bu1();
        }
        c = bu1Var;
        String str = mt2.d;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        d = Path$Companion.get(property);
        ClassLoader classLoader = b.class.getClassLoader();
        classLoader.getClass();
        new b(classLoader);
    }

    public abstract List A(mt2 mt2Var);

    public final z61 K(mt2 mt2Var) throws FileNotFoundException {
        mt2Var.getClass();
        z61 z61VarL = L(mt2Var);
        if (z61VarL != null) {
            return z61VarL;
        }
        m51.r(mt2Var, "no such file: ");
        return null;
    }

    public abstract z61 L(mt2 mt2Var);

    public abstract au1 O(mt2 mt2Var);

    public abstract zh3 Q(mt2 mt2Var, boolean z);

    public abstract wl3 R(mt2 mt2Var);

    public abstract zh3 a(mt2 mt2Var);

    public abstract void c(mt2 mt2Var, mt2 mt2Var2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract void h(mt2 mt2Var);

    public abstract void l(mt2 mt2Var);

    public final void p(mt2 mt2Var) {
        mt2Var.getClass();
        l(mt2Var);
    }

    public final boolean x(mt2 mt2Var) {
        mt2Var.getClass();
        return L(mt2Var) != null;
    }
}
