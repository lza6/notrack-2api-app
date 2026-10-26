package defpackage;

import java.io.File;
import java.util.ArrayList;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class mt2 implements Comparable {
    public static final String d;
    public final lz c;

    static {
        String str = File.separator;
        str.getClass();
        d = str;
    }

    public mt2(lz lzVar) {
        lzVar.getClass();
        this.c = lzVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = c.a(this);
        lz lzVar = this.c;
        if (iA == -1) {
            iA = 0;
        } else if (iA < lzVar.c() && lzVar.h(iA) == 92) {
            iA++;
        }
        int iC = lzVar.c();
        int i = iA;
        while (iA < iC) {
            if (lzVar.h(iA) == 47 || lzVar.h(iA) == 92) {
                arrayList.add(lzVar.m(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < lzVar.c()) {
            arrayList.add(lzVar.m(i, lzVar.c()));
        }
        return arrayList;
    }

    public final String b() {
        lz lzVar = c.a;
        lz lzVarN = this.c;
        int iJ = lz.j(lzVarN, lzVar);
        if (iJ == -1) {
            iJ = lz.j(lzVarN, c.b);
        }
        if (iJ != -1) {
            lzVarN = lz.n(lzVarN, iJ + 1, 0, 2);
        } else if (f() != null && lzVarN.c() == 2) {
            lzVarN = lz.l;
        }
        return lzVarN.p();
    }

    public final mt2 c() {
        lz lzVar = c.d;
        lz lzVar2 = this.c;
        if (kr1.n(lzVar2, lzVar)) {
            return null;
        }
        lz lzVar3 = c.a;
        if (kr1.n(lzVar2, lzVar3)) {
            return null;
        }
        lz lzVar4 = c.b;
        if (kr1.n(lzVar2, lzVar4)) {
            return null;
        }
        lz lzVar5 = c.e;
        lzVar2.getClass();
        lzVar5.getClass();
        int iC = lzVar2.c();
        byte[] bArr = lzVar5.c;
        if (lzVar2.k(iC - bArr.length, lzVar5, bArr.length) && (lzVar2.c() == 2 || lzVar2.k(lzVar2.c() - 3, lzVar3, 1) || lzVar2.k(lzVar2.c() - 3, lzVar4, 1))) {
            return null;
        }
        int iJ = lz.j(lzVar2, lzVar3);
        if (iJ == -1) {
            iJ = lz.j(lzVar2, lzVar4);
        }
        if (iJ == 2 && f() != null) {
            if (lzVar2.c() == 3) {
                return null;
            }
            return new mt2(lz.n(lzVar2, 0, 3, 1));
        }
        if (iJ == 1) {
            lzVar4.getClass();
            if (lzVar2.k(0, lzVar4, lzVar4.c())) {
                return null;
            }
        }
        if (iJ != -1 || f() == null) {
            if (iJ == -1) {
                return new mt2(lzVar);
            }
            return iJ == 0 ? new mt2(lz.n(lzVar2, 0, 1, 1)) : new mt2(lz.n(lzVar2, 0, iJ, 1));
        }
        if (lzVar2.c() == 2) {
            return null;
        }
        return new mt2(lz.n(lzVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mt2 mt2Var = (mt2) obj;
        mt2Var.getClass();
        return this.c.compareTo(mt2Var.c);
    }

    public final mt2 d(mt2 mt2Var) {
        mt2Var.getClass();
        lz lzVar = mt2Var.c;
        int iA = c.a(this);
        lz lzVar2 = this.c;
        mt2 mt2Var2 = iA == -1 ? null : new mt2(lzVar2.m(0, iA));
        int iA2 = c.a(mt2Var);
        if (!kr1.n(mt2Var2, iA2 != -1 ? new mt2(lzVar.m(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + mt2Var).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = mt2Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && kr1.n(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && lzVar2.c() == lzVar.c()) {
            return Path$Companion.get(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(c.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + mt2Var).toString());
        }
        if (kr1.n(lzVar, c.d)) {
            return this;
        }
        dy dyVar = new dy();
        lz lzVarC = c.c(mt2Var);
        if (lzVarC == null && (lzVarC = c.c(this)) == null) {
            lzVarC = c.f(d);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            dyVar.T(c.e);
            dyVar.T(lzVarC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            dyVar.T((lz) arrayListA.get(i));
            dyVar.T(lzVarC);
            i++;
        }
        return c.d(dyVar, false);
    }

    public final mt2 e(String str) {
        str.getClass();
        dy dyVar = new dy();
        dyVar.b0(str);
        return c.b(this, c.d(dyVar, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mt2) && kr1.n(((mt2) obj).c, this.c);
    }

    public final Character f() {
        lz lzVar = c.a;
        lz lzVar2 = this.c;
        if (lz.f(lzVar2, lzVar) != -1 || lzVar2.c() < 2 || lzVar2.h(1) != 58) {
            return null;
        }
        char cH = (char) lzVar2.h(0);
        if (('a' > cH || cH >= '{') && ('A' > cH || cH >= '[')) {
            return null;
        }
        return Character.valueOf(cH);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final File toFile() {
        return new File(this.c.p());
    }

    public final String toString() {
        return this.c.p();
    }
}
