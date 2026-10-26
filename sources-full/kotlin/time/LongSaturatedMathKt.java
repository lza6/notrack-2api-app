package kotlin.time;

import app.template.extension.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"saturatingAdd", BuildConfig.VERSION_NAME, "value", "unit", "Lkotlin/time/DurationUnit;", "duration", "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", BuildConfig.VERSION_NAME, "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m1731x95b37088(long j, long j2, long j3) {
        if (!Duration.m1655x20ab9d2f(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j) {
        return j < 0 ? Duration.INSTANCE.m1720x8e871b() : Duration.INSTANCE.m1719xe4505090();
    }

    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == LongCompanionObject.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m1732x1cabbb63(long j, DurationUnit unit, long j2) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM1669xdfc89696 = Duration.m1669xdfc89696(j2, unit);
        if (((j - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1731x95b37088(j, j2, jM1669xdfc89696);
        }
        if (((jM1669xdfc89696 - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m1733xc32e5639(j, unit, j2);
        }
        long j3 = j + jM1669xdfc89696;
        if (((j ^ j3) & (jM1669xdfc89696 ^ j3)) >= 0) {
            return j3;
        }
        if (j < 0) {
            return Long.MIN_VALUE;
        }
        return LongCompanionObject.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m1733xc32e5639(long j, DurationUnit durationUnit, long j2) {
        long jM1633x57e58ab7 = Duration.m1633x57e58ab7(j2, 2);
        long jM1669xdfc89696 = Duration.m1669xdfc89696(jM1633x57e58ab7, durationUnit);
        return (1 | (jM1669xdfc89696 - 1)) == LongCompanionObject.MAX_VALUE ? jM1669xdfc89696 : m1732x1cabbb63(m1732x1cabbb63(j, durationUnit, jM1633x57e58ab7), durationUnit, Duration.m1658x77098cc2(j2, jM1633x57e58ab7));
    }

    public static final long saturatingDiff(long j, long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j2 - 1)) == LongCompanionObject.MAX_VALUE ? Duration.m1674x8236baa7(infinityOfSign(j2)) : saturatingFiniteDiff(j, j2, unit);
    }

    private static final long saturatingFiniteDiff(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return DurationKt.toDuration(j3, durationUnit);
        }
        if (durationUnit.compareTo(DurationUnit.MILLISECONDS) >= 0) {
            return Duration.m1674x8236baa7(infinityOfSign(j3));
        }
        long jConvertDurationUnit = DurationUnitKt.convertDurationUnit(1L, DurationUnit.MILLISECONDS, durationUnit);
        long j4 = (j / jConvertDurationUnit) - (j2 / jConvertDurationUnit);
        long j5 = (j % jConvertDurationUnit) - (j2 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m1659xf551e7ec(DurationKt.toDuration(j4, DurationUnit.MILLISECONDS), DurationKt.toDuration(j5, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j, long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j2 - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return j == j2 ? Duration.INSTANCE.m1721xd2c93424() : Duration.m1674x8236baa7(infinityOfSign(j2));
        }
        return (1 | (j - 1)) == LongCompanionObject.MAX_VALUE ? infinityOfSign(j) : saturatingFiniteDiff(j, j2, unit);
    }
}
