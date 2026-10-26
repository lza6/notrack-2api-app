package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final lz a;
    public static final lz b;
    public static final lz c;
    public static final lz d;
    public static final lz e;

    static {
        lz lzVar = lz.l;
        a = Path$Companion.encodeUtf8("/");
        b = Path$Companion.encodeUtf8("\\");
        c = Path$Companion.encodeUtf8("/\\");
        d = Path$Companion.encodeUtf8(".");
        e = Path$Companion.encodeUtf8("..");
    }

    public static final int a(mt2 mt2Var) {
        lz lzVar = mt2Var.c;
        if (lzVar.c() != 0) {
            if (lzVar.h(0) != 47) {
                if (lzVar.h(0) == 92) {
                    if (lzVar.c() > 2 && lzVar.h(1) == 92) {
                        lz lzVar2 = b;
                        lzVar2.getClass();
                        int iE = lzVar.e(2, lzVar2.g());
                        return iE == -1 ? lzVar.c() : iE;
                    }
                } else if (lzVar.c() > 2 && lzVar.h(1) == 58 && lzVar.h(2) == 92) {
                    char cH = (char) lzVar.h(0);
                    if ('a' <= cH && cH < '{') {
                        return 3;
                    }
                    if ('A' <= cH && cH < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final mt2 b(mt2 mt2Var, mt2 mt2Var2, boolean z) {
        mt2Var2.getClass();
        if (a(mt2Var2) != -1 || mt2Var2.f() != null) {
            return mt2Var2;
        }
        lz lzVarC = c(mt2Var);
        if (lzVarC == null && (lzVarC = c(mt2Var2)) == null) {
            lzVarC = f(mt2.d);
        }
        dy dyVar = new dy();
        dyVar.T(mt2Var.c);
        if (dyVar.d > 0) {
            dyVar.T(lzVarC);
        }
        dyVar.T(mt2Var2.c);
        return d(dyVar, z);
    }

    public static final lz c(mt2 mt2Var) {
        lz lzVar = mt2Var.c;
        lz lzVar2 = a;
        if (lz.f(lzVar, lzVar2) != -1) {
            return lzVar2;
        }
        lz lzVar3 = mt2Var.c;
        lz lzVar4 = b;
        if (lz.f(lzVar3, lzVar4) != -1) {
            return lzVar4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011c A[EDGE_INSN: B:101:0x011c->B:84:0x011c BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x013a  */
    public static final mt2 d(dy dyVar, boolean z) throws EOFException {
        lz lzVar;
        long j;
        char cL;
        boolean z2;
        ArrayList arrayList;
        boolean zR;
        lz lzVar2;
        int size;
        int i;
        long jX;
        lz lzVarG;
        lz lzVar3;
        dy dyVar2 = new dy();
        lz lzVarE = null;
        int i2 = 0;
        while (true) {
            if (!dyVar.G(0L, a)) {
                lzVar = b;
                if (!dyVar.G(0L, lzVar)) {
                    break;
                }
            }
            byte b2 = dyVar.readByte();
            if (lzVarE == null) {
                lzVarE = e(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && kr1.n(lzVarE, lzVar);
        lz lzVar4 = c;
        if (z3) {
            lzVarE.getClass();
            dyVar2.T(lzVarE);
            dyVar2.T(lzVarE);
        } else {
            if (i2 <= 0) {
                long jX2 = dyVar.x(lzVar4);
                if (lzVarE == null) {
                    lzVarE = jX2 == -1 ? f(mt2.d) : e(dyVar.l(jX2));
                }
                if (kr1.n(lzVarE, lzVar) && dyVar.d >= 2) {
                    j = -1;
                    if (dyVar.l(1L) == 58 && (('a' <= (cL = (char) dyVar.l(0L)) && cL < '{') || ('A' <= cL && cL < '['))) {
                        if (jX2 == 2) {
                            dyVar2.d(dyVar, 3L);
                        } else {
                            dyVar2.d(dyVar, 2L);
                        }
                    }
                }
                if (dyVar2.d > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zR = dyVar.r();
                    lzVar2 = d;
                    if (!zR) {
                        break;
                    }
                    jX = dyVar.x(lzVar4);
                    if (jX == j) {
                        lzVarG = dyVar.g(dyVar.d);
                    } else {
                        lzVarG = dyVar.g(jX);
                        dyVar.readByte();
                    }
                    lzVar3 = e;
                    if (kr1.n(lzVarG, lzVar3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || kr1.n(ke0.E0(arrayList), lzVar3)))) {
                                arrayList.add(lzVarG);
                            } else if (!z3 || arrayList.size() != 1) {
                                if (!arrayList.isEmpty()) {
                                    arrayList.remove(arrayList.size() - 1);
                                }
                            }
                        }
                    } else if (kr1.n(lzVarG, lzVar2) && !kr1.n(lzVarG, lz.l)) {
                        arrayList.add(lzVarG);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        dyVar2.T(lzVarE);
                    }
                    dyVar2.T((lz) arrayList.get(i));
                }
                if (dyVar2.d == 0) {
                    dyVar2.T(lzVar2);
                }
                return new mt2(dyVar2.g(dyVar2.d));
            }
            lzVarE.getClass();
            dyVar2.T(lzVarE);
        }
        j = -1;
        if (dyVar2.d > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zR = dyVar.r();
            lzVar2 = d;
            if (!zR) {
                break;
                break;
            }
            jX = dyVar.x(lzVar4);
            if (jX == j) {
                lzVarG = dyVar.g(dyVar.d);
            } else {
                lzVarG = dyVar.g(jX);
                dyVar.readByte();
            }
            lzVar3 = e;
            if (kr1.n(lzVarG, lzVar3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(lzVarG);
            } else if (kr1.n(lzVarG, lzVar2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                dyVar2.T(lzVarE);
            }
            dyVar2.T((lz) arrayList.get(i));
        }
        if (dyVar2.d == 0) {
            dyVar2.T(lzVar2);
        }
        return new mt2(dyVar2.g(dyVar2.d));
    }

    public static final lz e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        u41.k(ud2.m(b2, "not a directory separator: "));
        return null;
    }

    public static final lz f(String str) {
        if (kr1.n(str, "/")) {
            return a;
        }
        if (kr1.n(str, "\\")) {
            return b;
        }
        u41.k(fq2.m("not a directory separator: ", str));
        return null;
    }
}
