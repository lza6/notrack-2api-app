package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00020\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "mark", "adjustment", "Lkotlin/time/Duration;", "<init>", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMark", "()Lkotlin/time/TimeMark;", "getAdjustment-UwyO8pc", "()J", "J", "elapsedNow", "elapsedNow-UwyO8pc", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class AdjustedTimeMark implements TimeMark {
    private final long adjustment;
    private final TimeMark mark;

    private AdjustedTimeMark(TimeMark mark, long j) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.mark = mark;
        this.adjustment = j;
    }

    public /* synthetic */ AdjustedTimeMark(TimeMark timeMark, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j);
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo1620xc96e6ce0() {
        return Duration.m1658x77098cc2(this.mark.mo1620xc96e6ce0(), this.adjustment);
    }

    /* JADX INFO: renamed from: getAdjustment-UwyO8pc, reason: not valid java name and from getter */
    public final long getAdjustment() {
        return this.adjustment;
    }

    public final TimeMark getMark() {
        return this.mark;
    }

    @Override // kotlin.time.TimeMark
    public /* bridge */ boolean hasNotPassedNow() {
        return TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    public /* bridge */ boolean hasPassedNow() {
        return TimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public /* bridge */ TimeMark mo1621x77098cc2(long j) {
        return TimeMark.DefaultImpls.m1740x77098cc2(this, j);
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public TimeMark mo1623xf551e7ec(long duration) {
        return new AdjustedTimeMark(this.mark, Duration.m1659xf551e7ec(this.adjustment, duration), null);
    }
}
