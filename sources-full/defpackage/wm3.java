package defpackage;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class wm3 implements uu0 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public wm3(char c) {
        this.a = c;
    }

    @Override // defpackage.uu0
    public final char a() {
        return this.a;
    }

    @Override // defpackage.uu0
    public final int b() {
        return this.b;
    }

    @Override // defpackage.uu0
    public final int c(tu0 tu0Var, tu0 tu0Var2) {
        int i = tu0Var.g;
        LinkedList<uu0> linkedList = this.c;
        for (uu0 uu0Var : linkedList) {
            if (uu0Var.b() <= i) {
                return uu0Var.c(tu0Var, tu0Var2);
            }
        }
        uu0Var = (uu0) linkedList.getFirst();
        return uu0Var.c(tu0Var, tu0Var2);
    }

    @Override // defpackage.uu0
    public final void d(it3 it3Var, it3 it3Var2, int i) {
        LinkedList<uu0> linkedList = this.c;
        for (uu0 uu0Var : linkedList) {
            if (uu0Var.b() <= i) {
                uu0Var.d(it3Var, it3Var2, i);
            }
        }
        uu0Var = (uu0) linkedList.getFirst();
        uu0Var.d(it3Var, it3Var2, i);
    }

    @Override // defpackage.uu0
    public final char e() {
        return this.a;
    }

    public final void f(uu0 uu0Var) {
        int iB = uu0Var.b();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iB2 = ((uu0) listIterator.next()).b();
            if (iB > iB2) {
                listIterator.previous();
                listIterator.add(uu0Var);
                return;
            } else if (iB == iB2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + iB);
            }
        }
        linkedList.add(uu0Var);
        this.b = iB;
    }
}
