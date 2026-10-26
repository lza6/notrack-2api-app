package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p84 {
    public final int a;
    public final ml3 b;
    public final ml3 c;

    public p84(List list, List list2, int i) {
        this.a = i;
        ml3 ml3Var = new ml3();
        ml3Var.addAll(list);
        this.b = ml3Var;
        ml3 ml3Var2 = new ml3();
        ml3Var2.addAll(list2);
        this.c = ml3Var2;
        if (i < 0) {
            so1.a("Capacity must be a positive integer");
        }
        if (ml3Var2.size() + ml3Var.size() <= i) {
            return;
        }
        so1.a("Initial list of undo and redo operations have a size greater than the given capacity.");
    }
}
