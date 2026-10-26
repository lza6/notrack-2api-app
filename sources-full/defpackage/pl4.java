package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pl4 extends ul4 {
    public final transient ul4 h;

    public pl4(ul4 ul4Var) {
        this.h = ul4Var;
    }

    @Override // defpackage.ul4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.h.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        ul4 ul4Var = this.h;
        wd4.c(i, ul4Var.size());
        return ul4Var.get((ul4Var.size() - 1) - i);
    }

    @Override // defpackage.ul4, java.util.List
    public final int indexOf(Object obj) {
        ul4 ul4Var = this.h;
        int iLastIndexOf = ul4Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (ul4Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.ul4
    public final ul4 k() {
        return this.h;
    }

    @Override // defpackage.ul4, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ul4 subList(int i, int i2) {
        ul4 ul4Var = this.h;
        wd4.d(i, i2, ul4Var.size());
        return ul4Var.subList(ul4Var.size() - i2, ul4Var.size() - i).k();
    }

    @Override // defpackage.ul4, java.util.List
    public final int lastIndexOf(Object obj) {
        ul4 ul4Var = this.h;
        int iIndexOf = ul4Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (ul4Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.size();
    }
}
