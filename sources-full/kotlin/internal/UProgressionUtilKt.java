package kotlin.internal;

import app.template.extension.BuildConfig;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.UInt;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", BuildConfig.VERSION_NAME, "getProgressionLastElement-Nkh28Cs", BuildConfig.VERSION_NAME, "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1445xf635cc91(int i, int i2, int i3) {
        int iM$1 = UByte$$ExternalSyntheticBackport0.m$1(i, i3);
        int iM$2 = UByte$$ExternalSyntheticBackport0.m$1(i2, i3);
        int iCompare = Integer.compare(iM$1 ^ Integer.MIN_VALUE, iM$2 ^ Integer.MIN_VALUE);
        int iM323xf1229813 = UInt.m323xf1229813(iM$1 - iM$2);
        return iCompare >= 0 ? iM323xf1229813 : UInt.m323xf1229813(iM323xf1229813 + i3);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1446xce39889a(long j, long j2, long j3) {
        long jM296m = UByte$$ExternalSyntheticBackport0.m296m(j, j3);
        long jM296m2 = UByte$$ExternalSyntheticBackport0.m296m(j2, j3);
        int iCompare = Long.compare(jM296m ^ Long.MIN_VALUE, jM296m2 ^ Long.MIN_VALUE);
        long jM402xf1229813 = ULong.m402xf1229813(jM296m - jM296m2);
        return iCompare >= 0 ? jM402xf1229813 : ULong.m402xf1229813(jM402xf1229813 + j3);
    }

    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1447xb15464c6(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j2 : ULong.m402xf1229813(j2 - m1446xce39889a(j2, j, ULong.m402xf1229813(j3)));
        }
        if (j3 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j2 : ULong.m402xf1229813(j2 + m1446xce39889a(j, j2, ULong.m402xf1229813(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1448x79db1cf5(int i, int i2, int i3) {
        if (i3 > 0) {
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m323xf1229813(i2 - m1445xf635cc91(i2, i, UInt.m323xf1229813(i3)));
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m323xf1229813(i2 + m1445xf635cc91(i, i2, UInt.m323xf1229813(-i3)));
            }
        }
        return i2;
    }
}
