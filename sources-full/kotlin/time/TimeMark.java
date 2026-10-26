package kotlin.time;

import app.template.extension.BuildConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lkotlin/time/TimeMark;", BuildConfig.VERSION_NAME, "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "minus", "minus-LRDsOJo", "hasPassedNow", BuildConfig.VERSION_NAME, "hasNotPassedNow", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TimeMark {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(TimeMark timeMark) {
            return Duration.m1656x59fc27ae(timeMark.mo1620xc96e6ce0());
        }

        public static boolean hasPassedNow(TimeMark timeMark) {
            return !Duration.m1656x59fc27ae(timeMark.mo1620xc96e6ce0());
        }

        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static TimeMark m1740x77098cc2(TimeMark timeMark, long j) {
            return timeMark.mo1623xf551e7ec(Duration.m1674x8236baa7(j));
        }

        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public static TimeMark m1741xf551e7ec(TimeMark timeMark, long j) {
            return new AdjustedTimeMark(timeMark, j, null);
        }
    }

    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    long mo1620xc96e6ce0();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    /* JADX INFO: renamed from: minus-LRDsOJo */
    TimeMark mo1621x77098cc2(long duration);

    /* JADX INFO: renamed from: plus-LRDsOJo */
    TimeMark mo1623xf551e7ec(long duration);
}
