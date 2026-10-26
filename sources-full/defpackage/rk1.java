package defpackage;

import java.util.List;
import java.util.regex.Pattern;
import okio.Options$Companion;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class rk1 {
    static {
        lz lzVar = lz.l;
        Path$Companion.encodeUtf8("\"\\");
        Path$Companion.encodeUtf8("\t ,=");
    }

    public static final boolean a(f63 f63Var) {
        if (kr1.n(f63Var.c.b, "HEAD")) {
            return false;
        }
        int i = f63Var.l;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && ka4.j(f63Var) == -1 && !"chunked".equalsIgnoreCase(f63.a(f63Var, "Transfer-Encoding"))) ? false : true;
    }

    public static final void b(wo0 wo0Var, tk1 tk1Var, th1 th1Var) {
        wo0Var.getClass();
        tk1Var.getClass();
        th1Var.getClass();
        if (wo0Var == wo0.b) {
            return;
        }
        Pattern pattern = vo0.j;
        List all = Options$Companion.parseAll(tk1Var, th1Var);
        if (all.isEmpty()) {
            return;
        }
        wo0Var.o(tk1Var, all);
    }
}
