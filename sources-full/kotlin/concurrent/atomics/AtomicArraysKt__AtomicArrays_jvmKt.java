package kotlin.concurrent.atomics;

import app.template.extension.BuildConfig;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\nH\u0007¢\u0006\u0002\u0010\u000b\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\t0\n\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\bH\u0007¢\u0006\u0002\u0010\u000b\u001a>\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0012\u001a>\u0010\u0013\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0014\u001a>\u0010\u0015\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0014\u001a>\u0010\f\u001a\u00020\r*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0017\u001a>\u0010\u0013\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0018\u001a>\u0010\u0015\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0018\u001aJ\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0019\u001aJ\u0010\u0013\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001a\u001aJ\u0010\u0015\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"asJavaAtomicArray", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "Lkotlin/concurrent/atomics/AtomicIntArray;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "asKotlinAtomicArray", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Lkotlin/concurrent/atomics/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;)Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "T", "Lkotlin/concurrent/atomics/AtomicArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "updateAt", BuildConfig.VERSION_NAME, "index", BuildConfig.VERSION_NAME, "transform", "Lkotlin/Function1;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;ILkotlin/jvm/functions/Function1;)V", "updateAndFetchAt", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;ILkotlin/jvm/functions/Function1;)I", "fetchAndUpdateAt", BuildConfig.VERSION_NAME, "(Ljava/util/concurrent/atomic/AtomicLongArray;ILkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicLongArray;ILkotlin/jvm/functions/Function1;)J", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicArraysKt")
class AtomicArraysKt__AtomicArrays_jvmKt extends AtomicArraysKt__AtomicArrays_commonKt {
    public static final AtomicIntegerArray asJavaAtomicArray(AtomicIntegerArray atomicIntegerArray) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    public static final AtomicLongArray asJavaAtomicArray(AtomicLongArray atomicLongArray) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    public static final <T> AtomicReferenceArray<T> asJavaAtomicArray(AtomicReferenceArray<T> atomicReferenceArray) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    public static final AtomicIntegerArray asKotlinAtomicArray(AtomicIntegerArray atomicIntegerArray) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    public static final AtomicLongArray asKotlinAtomicArray(AtomicLongArray atomicLongArray) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    public static final <T> AtomicReferenceArray<T> asKotlinAtomicArray(AtomicReferenceArray<T> atomicReferenceArray) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    private static final int fetchAndUpdateAt(AtomicIntegerArray atomicIntegerArray, int i, Function1<? super Integer, Integer> transform) {
        int i2;
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i2 = atomicIntegerArray.get(i);
        } while (!atomicIntegerArray.compareAndSet(i, i2, transform.invoke(Integer.valueOf(i2)).intValue()));
        return i2;
    }

    private static final long fetchAndUpdateAt(AtomicLongArray atomicLongArray, int i, Function1<? super Long, Long> transform) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            long j = atomicLongArray.get(i);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i2 = i;
            if (atomicLongArray2.compareAndSet(i2, j, transform.invoke(Long.valueOf(j)).longValue())) {
                return j;
            }
            atomicLongArray = atomicLongArray2;
            i = i2;
        }
    }

    private static final <T> T fetchAndUpdateAt(AtomicReferenceArray<T> atomicReferenceArray, int i, Function1<? super T, ? extends T> transform) {
        T t;
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            t = atomicReferenceArray.get(i);
        } while (!AtomicsKt__Atomics_jvmKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i, t, transform.invoke(t)));
        return t;
    }

    private static final int updateAndFetchAt(AtomicIntegerArray atomicIntegerArray, int i, Function1<? super Integer, Integer> transform) {
        int i2;
        int iIntValue;
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i2 = atomicIntegerArray.get(i);
            iIntValue = transform.invoke(Integer.valueOf(i2)).intValue();
        } while (!atomicIntegerArray.compareAndSet(i, i2, iIntValue));
        return iIntValue;
    }

    private static final long updateAndFetchAt(AtomicLongArray atomicLongArray, int i, Function1<? super Long, Long> transform) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            long j = atomicLongArray.get(i);
            long jLongValue = transform.invoke(Long.valueOf(j)).longValue();
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i2 = i;
            if (atomicLongArray2.compareAndSet(i2, j, jLongValue)) {
                return jLongValue;
            }
            atomicLongArray = atomicLongArray2;
            i = i2;
        }
    }

    private static final <T> T updateAndFetchAt(AtomicReferenceArray<T> atomicReferenceArray, int i, Function1<? super T, ? extends T> transform) {
        T t;
        T tInvoke;
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            t = atomicReferenceArray.get(i);
            tInvoke = transform.invoke(t);
        } while (!AtomicsKt__Atomics_jvmKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i, t, tInvoke));
        return tInvoke;
    }

    private static final void updateAt(AtomicIntegerArray atomicIntegerArray, int i, Function1<? super Integer, Integer> transform) {
        int i2;
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i2 = atomicIntegerArray.get(i);
        } while (!atomicIntegerArray.compareAndSet(i, i2, transform.invoke(Integer.valueOf(i2)).intValue()));
    }

    private static final void updateAt(AtomicLongArray atomicLongArray, int i, Function1<? super Long, Long> transform) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            long j = atomicLongArray.get(i);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i2 = i;
            if (atomicLongArray2.compareAndSet(i2, j, transform.invoke(Long.valueOf(j)).longValue())) {
                return;
            }
            atomicLongArray = atomicLongArray2;
            i = i2;
        }
    }

    private static final <T> void updateAt(AtomicReferenceArray<T> atomicReferenceArray, int i, Function1<? super T, ? extends T> transform) {
        T t;
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            t = atomicReferenceArray.get(i);
        } while (!AtomicsKt__Atomics_jvmKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i, t, transform.invoke(t)));
    }
}
