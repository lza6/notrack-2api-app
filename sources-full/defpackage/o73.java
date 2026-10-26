package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o73 {
    public final Context a;
    public final String b;
    public Executor f;
    public Executor g;
    public f4 h;
    public boolean i;
    public boolean l;
    public HashSet p;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final int j = 1;
    public boolean k = true;
    public final long m = -1;
    public final nr0 n = new nr0(3);
    public final LinkedHashSet o = new LinkedHashSet();

    public o73(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final void a(ee2... ee2VarArr) {
        if (this.p == null) {
            this.p = new HashSet();
        }
        for (ee2 ee2Var : ee2VarArr) {
            HashSet hashSet = this.p;
            hashSet.getClass();
            hashSet.add(Integer.valueOf(ee2Var.a));
            HashSet hashSet2 = this.p;
            hashSet2.getClass();
            hashSet2.add(Integer.valueOf(ee2Var.b));
        }
        this.n.a((ee2[]) Arrays.copyOf(ee2VarArr, ee2VarArr.length));
    }
}
