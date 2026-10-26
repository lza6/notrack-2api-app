package kotlin.concurrent.atomics;

import app.template.extension.BuildConfig;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0004*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0004*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0004*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\u0004*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\u0010\u000e\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\u0010\u000e\u001a\u0011\u0010\u0007\u001a\u00020\r*\u00020\fH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0011\u0010\t\u001a\u00020\r*\u00020\fH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0011\u0010\n\u001a\u00020\r*\u00020\fH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0011\u0010\u000b\u001a\u00020\r*\u00020\fH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"plusAssign", BuildConfig.VERSION_NAME, "Lkotlin/concurrent/atomics/AtomicInt;", "delta", BuildConfig.VERSION_NAME, "(Ljava/util/concurrent/atomic/AtomicInteger;I)V", "minusAssign", "fetchAndIncrement", "(Ljava/util/concurrent/atomic/AtomicInteger;)I", "incrementAndFetch", "decrementAndFetch", "fetchAndDecrement", "Lkotlin/concurrent/atomics/AtomicLong;", BuildConfig.VERSION_NAME, "(Ljava/util/concurrent/atomic/AtomicLong;J)V", "(Ljava/util/concurrent/atomic/AtomicLong;)J", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicsKt")
class AtomicsKt__Atomics_commonKt {
    public static final int decrementAndFetch(AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger.addAndGet(-1);
    }

    public static final long decrementAndFetch(AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong.addAndGet(-1L);
    }

    public static final int fetchAndDecrement(AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(-1);
    }

    public static final long fetchAndDecrement(AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong.getAndAdd(-1L);
    }

    public static final int fetchAndIncrement(AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(1);
    }

    public static final long fetchAndIncrement(AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong.getAndAdd(1L);
    }

    public static final int incrementAndFetch(AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger.addAndGet(1);
    }

    public static final long incrementAndFetch(AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong.addAndGet(1L);
    }

    public static final void minusAssign(AtomicInteger atomicInteger, int i) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        atomicInteger.addAndGet(-i);
    }

    public static final void minusAssign(AtomicLong atomicLong, long j) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        atomicLong.addAndGet(-j);
    }

    public static final void plusAssign(AtomicInteger atomicInteger, int i) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        atomicInteger.addAndGet(i);
    }

    public static final void plusAssign(AtomicLong atomicLong, long j) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        atomicLong.addAndGet(j);
    }
}
