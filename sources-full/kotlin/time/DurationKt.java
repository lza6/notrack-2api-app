package kotlin.time;

import app.template.extension.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0015\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015\u001a\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a)\u0010\u0017\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001aH\u0082\b\u001a)\u0010\u001c\u001a\u00020\u0002*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001aH\u0082\b\u001a\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002\u001a\u0010\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002\u001a\u0015\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\u001a\u001d\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010-\u001a\u0015\u0010.\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\u001a\u0015\u0010/\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'\"\u000e\u0010\u001d\u001a\u00020\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"toDuration", "Lkotlin/time/Duration;", BuildConfig.VERSION_NAME, "unit", "Lkotlin/time/DurationUnit;", "(ILkotlin/time/DurationUnit;)J", BuildConfig.VERSION_NAME, "(JLkotlin/time/DurationUnit;)J", BuildConfig.VERSION_NAME, "(DLkotlin/time/DurationUnit;)J", "times", "duration", "times-mvk6XK0", "(IJ)J", "times-kIfJnKk", "(DJ)J", "parseDuration", "value", BuildConfig.VERSION_NAME, "strictIso", BuildConfig.VERSION_NAME, "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "substringWhile", "startIndex", "predicate", "Lkotlin/Function1;", BuildConfig.VERSION_NAME, "skipWhile", "NANOS_IN_MILLIS", "MAX_NANOS", "MAX_MILLIS", "MAX_NANOS_IN_MILLIS", "nanosToMillis", "nanos", "millisToNanos", "millis", "durationOfNanos", "normalNanos", "(J)J", "durationOfMillis", "normalMillis", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfNanosNormalized", "durationOfMillisNormalized", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j, int i) {
        return Duration.m1630xf1229813((j << 1) + ((long) i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j) {
        return Duration.m1630xf1229813((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? durationOfMillis(RangesKt.coerceIn(j, -4611686018427387903L, MAX_MILLIS)) : durationOfNanos(millisToNanos(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j) {
        return Duration.m1630xf1229813(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? durationOfMillis(nanosToMillis(j)) : durationOfNanos(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j) {
        return j * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j) {
        return j / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z) {
        int i;
        char cCharAt;
        char cCharAt2;
        int i2;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        long jM1721xd2c93424 = Duration.INSTANCE.m1721xd2c93424();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z2 = length2 > 0;
        DurationUnit durationUnit = null;
        boolean z3 = z2 && StringsKt.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c = ':';
        char c2 = '0';
        if (str.charAt(length2) == 'P') {
            int i3 = length2 + 1;
            if (i3 == length) {
                throw new IllegalArgumentException();
            }
            DurationUnit durationUnit2 = null;
            boolean z4 = false;
            while (i3 < length) {
                if (str.charAt(i3) != 'T') {
                    int i4 = i3;
                    while (true) {
                        if (i4 >= str.length()) {
                            i2 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i4);
                        if (c2 > cCharAt4 || cCharAt4 >= c) {
                            i2 = length;
                            if (!StringsKt.contains$default((CharSequence) "+-.", cCharAt4, false, 2, (Object) null)) {
                                break;
                            }
                        } else {
                            i2 = length;
                        }
                        i4++;
                        length = i2;
                        c = ':';
                        c2 = '0';
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i3, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String str2 = strSubstring;
                    if (str2.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i3 + strSubstring.length();
                    String str3 = str;
                    if (length3 < 0 || length3 >= str3.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str3.charAt(length3);
                    i3 = length3 + 1;
                    DurationUnit durationUnitDurationUnitByIsoChar = DurationUnitKt.durationUnitByIsoChar(cCharAt5, z4);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, '.', 0, false, 6, (Object) null);
                    if (durationUnitDurationUnitByIsoChar != DurationUnit.SECONDS || iIndexOf$default <= 0) {
                        jM1721xd2c93424 = Duration.m1659xf551e7ec(jM1721xd2c93424, toDuration(parseOverLongIsoComponent(strSubstring), durationUnitDurationUnitByIsoChar));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jM1659xf551e7ec = Duration.m1659xf551e7ec(jM1721xd2c93424, toDuration(parseOverLongIsoComponent(strSubstring2), durationUnitDurationUnitByIsoChar));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM1721xd2c93424 = Duration.m1659xf551e7ec(jM1659xf551e7ec, toDuration(Double.parseDouble(strSubstring3), durationUnitDurationUnitByIsoChar));
                    }
                    durationUnit2 = durationUnitDurationUnitByIsoChar;
                    length = i2;
                    c = ':';
                    c2 = '0';
                } else {
                    if (z4 || (i3 = i3 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z4 = true;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            int iMax = Math.max(length - length2, 8);
            char c3 = ':';
            if (StringsKt.regionMatches(str, length2, "Infinity", 0, iMax, true)) {
                jM1721xd2c93424 = Duration.INSTANCE.m1719xe4505090();
            } else {
                boolean z5 = !z2;
                if (z2 && str.charAt(length2) == '(' && StringsKt.last(str) == ')') {
                    length2++;
                    int i5 = length - 1;
                    if (length2 == i5) {
                        throw new IllegalArgumentException("No components");
                    }
                    i = i5;
                    z5 = true;
                } else {
                    i = length;
                }
                boolean z6 = false;
                while (length2 < i) {
                    if (z6 && z5) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i6 = length2;
                    while (i6 < str.length() && (('0' <= (cCharAt2 = str.charAt(i6)) && cCharAt2 < c3) || cCharAt2 == '.')) {
                        i6++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i6);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    String str4 = strSubstring4;
                    if (str4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i7 = length4;
                    while (i7 < str.length() && 'a' <= (cCharAt = str.charAt(i7)) && cCharAt < '{') {
                        i7++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i7);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitDurationUnitByShortName = DurationUnitKt.durationUnitByShortName(strSubstring5);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str4, '.', 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jM1659xf551e7ec2 = Duration.m1659xf551e7ec(jM1721xd2c93424, toDuration(Long.parseLong(strSubstring6), durationUnitDurationUnitByShortName));
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jM1721xd2c93424 = Duration.m1659xf551e7ec(jM1659xf551e7ec2, toDuration(Double.parseDouble(strSubstring7), durationUnitDurationUnitByShortName));
                        if (length2 < i) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM1721xd2c93424 = Duration.m1659xf551e7ec(jM1721xd2c93424, toDuration(Long.parseLong(strSubstring4), durationUnitDurationUnitByShortName));
                    }
                    durationUnit = durationUnitDurationUnitByShortName;
                    z6 = true;
                    c3 = ':';
                }
            }
        }
        return z3 ? Duration.m1674x8236baa7(jM1721xd2c93424) : jM1721xd2c93424;
    }

    private static final long parseOverLongIsoComponent(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i >= length) {
                    if (length - i2 <= 16) {
                        break;
                    }
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return LongCompanionObject.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == '0') {
                    if (i2 == i) {
                        i2++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i++;
            }
        }
        return (!StringsKt.startsWith$default(str, "+", false, 2, (Object) null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(StringsKt.drop(str, 1));
    }

    private static final int skipWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        while (i < str.length() && function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    private static final String substringWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        int i2 = i;
        while (i2 < str.length() && function1.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m1726x7d757545(double d, long j) {
        return Duration.m1660x4138886c(j, d);
    }

    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m1727x34490b02(int i, long j) {
        return Duration.m1661x4138886c(j, i);
    }

    public static final long toDuration(double d, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dConvertDurationUnit = DurationUnitKt.convertDurationUnit(d, unit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(dConvertDurationUnit)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jRoundToLong = MathKt.roundToLong(dConvertDurationUnit);
        return (-4611686018426999999L > jRoundToLong || jRoundToLong >= 4611686018427000000L) ? durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt.convertDurationUnit(d, unit, DurationUnit.MILLISECONDS))) : durationOfNanos(jRoundToLong);
    }

    public static final long toDuration(int i, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(i, unit, DurationUnit.NANOSECONDS)) : toDuration(i, unit);
    }

    public static final long toDuration(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jConvertDurationUnitOverflow = DurationUnitKt.convertDurationUnitOverflow(MAX_NANOS, DurationUnit.NANOSECONDS, unit);
        return ((-jConvertDurationUnitOverflow) > j || j > jConvertDurationUnitOverflow) ? durationOfMillis(RangesKt.coerceIn(DurationUnitKt.convertDurationUnit(j, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS)) : durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(j, unit, DurationUnit.NANOSECONDS));
    }
}
