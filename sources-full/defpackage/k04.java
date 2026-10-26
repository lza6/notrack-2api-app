package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class k04 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(k04.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public y41[] a;

    public final void a(y41 y41Var) {
        y41Var.c((z41) this);
        y41[] y41VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (y41VarArr == null) {
            y41VarArr = new y41[4];
            this.a = y41VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= y41VarArr.length) {
            y41VarArr = (y41[]) Arrays.copyOf(y41VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = y41VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        y41VarArr[i] = y41Var;
        y41Var.d = i;
        c(i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final y41 b(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                y41 y41Var = objArr2[i];
                y41Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (y41Var.compareTo(obj2) < 0) {
                    d(i, i5);
                    c(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i, i4);
                    i = i4;
                }
            }
        }
        y41 y41Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        y41Var2.getClass();
        y41Var2.c(null);
        y41Var2.d = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return y41Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            y41[] y41VarArr = this.a;
            y41VarArr.getClass();
            int i2 = (i - 1) / 2;
            y41 y41Var = y41VarArr[i2];
            y41Var.getClass();
            y41 y41Var2 = y41VarArr[i];
            y41Var2.getClass();
            if (y41Var.compareTo(y41Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        y41[] y41VarArr = this.a;
        y41VarArr.getClass();
        y41 y41Var = y41VarArr[i2];
        y41Var.getClass();
        y41 y41Var2 = y41VarArr[i];
        y41Var2.getClass();
        y41VarArr[i] = y41Var;
        y41VarArr[i2] = y41Var2;
        y41Var.d = i;
        y41Var2.d = i2;
    }
}
