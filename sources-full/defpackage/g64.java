package defpackage;

import android.content.Context;
import app.template.extension.BuildConfig;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g64 {
    public static volatile kr0 e;
    public final ld0 a;
    public final ld0 b;
    public final kt0 c;
    public final ca4 d;

    public g64(ld0 ld0Var, ld0 ld0Var2, kt0 kt0Var, ca4 ca4Var, ir3 ir3Var) {
        this.a = ld0Var;
        this.b = ld0Var2;
        this.c = kt0Var;
        this.d = ca4Var;
        ((Executor) ir3Var.c).execute(new m3(14, ir3Var));
    }

    public static g64 a() {
        kr0 kr0Var = e;
        if (kr0Var != null) {
            return (g64) kr0Var.n.get();
        }
        u41.r("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (g64.class) {
                try {
                    if (e == null) {
                        tu tuVar = new tu();
                        context.getClass();
                        tuVar.a = context;
                        e = tuVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final iy2 c(oz ozVar) {
        Set setUnmodifiableSet = ozVar instanceof oz ? Collections.unmodifiableSet(oz.d) : Collections.singleton(new j31("proto"));
        ci4 ci4VarA = vo.a();
        ozVar.getClass();
        ci4VarA.d = "cct";
        String str = ozVar.a;
        String str2 = ozVar.b;
        if (str2 == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        ci4VarA.h = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new iy2(setUnmodifiableSet, ci4VarA.o(), this, 12);
    }
}
