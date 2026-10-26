package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class xc3 {
    public static final uc3 a = new uc3(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(uc3 uc3Var) {
        uc3Var.getClass();
        if (uc3Var.f != null || uc3Var.g != null) {
            u41.k("Failed requirement.");
            return;
        }
        if (uc3Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        uc3 uc3Var2 = a;
        uc3 uc3Var3 = (uc3) atomicReference.getAndSet(uc3Var2);
        if (uc3Var3 == uc3Var2) {
            return;
        }
        int i = uc3Var3 != null ? uc3Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(uc3Var3);
            return;
        }
        uc3Var.f = uc3Var3;
        uc3Var.b = 0;
        uc3Var.c = i + ConstantsKt.DEFAULT_BUFFER_SIZE;
        atomicReference.set(uc3Var);
    }

    public static final uc3 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        uc3 uc3Var = a;
        uc3 uc3Var2 = (uc3) atomicReference.getAndSet(uc3Var);
        if (uc3Var2 == uc3Var) {
            return new uc3();
        }
        if (uc3Var2 == null) {
            atomicReference.set(null);
            return new uc3();
        }
        atomicReference.set(uc3Var2.f);
        uc3Var2.f = null;
        uc3Var2.c = 0;
        return uc3Var2;
    }
}
