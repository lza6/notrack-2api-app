package kotlin.time;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import app.template.extension.BuildConfig;
import java.io.IOException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0003\u001a'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a\u0010\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0015H\u0000\u001a\u0014\u0010'\u001a\u00020\u0015*\u00020\u00152\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u0014\u0010-\u001a\u00020\u0012*\u00020\u00102\u0006\u0010.\u001a\u00020\u0015H\u0002\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0006\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0015X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"isDistantPast", BuildConfig.VERSION_NAME, "Lkotlin/time/Instant;", "isDistantPast$annotations", "(Lkotlin/time/Instant;)V", "(Lkotlin/time/Instant;)Z", "isDistantFuture", "isDistantFuture$annotations", "DISTANT_PAST_SECONDS", BuildConfig.VERSION_NAME, "DISTANT_FUTURE_SECONDS", "MIN_SECOND", "MAX_SECOND", "parseIso", "Lkotlin/time/InstantParseResult;", "isoString", BuildConfig.VERSION_NAME, "formatIso", BuildConfig.VERSION_NAME, "instant", "DAYS_PER_CYCLE", BuildConfig.VERSION_NAME, "DAYS_0000_TO_1970", "safeAddOrElse", "a", "b", "action", "Lkotlin/Function0;", BuildConfig.VERSION_NAME, "safeMultiplyOrElse", "SECONDS_PER_HOUR", "SECONDS_PER_MINUTE", "HOURS_PER_DAY", "SECONDS_PER_DAY", "NANOS_PER_SECOND", "NANOS_PER_MILLI", "MILLIS_PER_SECOND", "isLeapYear", "year", "monthLength", "POWERS_OF_TEN", BuildConfig.VERSION_NAME, "asciiDigitPositionsInIsoStringAfterYear", "colonsInIsoOffsetString", "asciiDigitsInIsoOffsetString", "truncateForErrorMessage", "maxLength", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class InstantKt {
    private static final int DAYS_0000_TO_1970 = 719528;
    private static final int DAYS_PER_CYCLE = 146097;
    private static final long DISTANT_FUTURE_SECONDS = 3093527980800L;
    private static final long DISTANT_PAST_SECONDS = -3217862419201L;
    private static final int HOURS_PER_DAY = 24;
    private static final long MAX_SECOND = 31556889864403199L;
    private static final long MIN_SECOND = -31557014167219200L;
    private static final int NANOS_PER_MILLI = 1000000;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MILLIS_PER_SECOND = 1000;
    public static final int NANOS_PER_SECOND = 1000000000;
    private static final int[] POWERS_OF_TEN = {1, 10, 100, MILLIS_PER_SECOND, 10000, AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, 10000000, 100000000, NANOS_PER_SECOND};
    private static final int[] asciiDigitPositionsInIsoStringAfterYear = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    private static final int[] colonsInIsoOffsetString = {3, 6};
    private static final int[] asciiDigitsInIsoOffsetString = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatIso(Instant instant) throws IOException {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        UnboundLocalDateTime unboundLocalDateTimeFromInstant = UnboundLocalDateTime.INSTANCE.fromInstant(instant);
        int year = unboundLocalDateTimeFromInstant.getYear();
        int i = 0;
        if (Math.abs(year) < MILLIS_PER_SECOND) {
            StringBuilder sb2 = new StringBuilder();
            if (year >= 0) {
                sb2.append(year + 10000);
                Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb2.append(year - 10000);
                Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (year >= 10000) {
                sb.append('+');
            }
            sb.append(year);
        }
        sb.append('-');
        StringBuilder sb3 = sb;
        formatIso$lambda$0$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getMonth());
        sb.append('-');
        formatIso$lambda$0$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getDay());
        sb.append('T');
        formatIso$lambda$0$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getHour());
        sb.append(':');
        formatIso$lambda$0$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getMinute());
        sb.append(':');
        formatIso$lambda$0$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getSecond());
        if (unboundLocalDateTimeFromInstant.getNanosecond() != 0) {
            sb.append('.');
            while (true) {
                int nanosecond = unboundLocalDateTimeFromInstant.getNanosecond();
                iArr = POWERS_OF_TEN;
                int i2 = i + 1;
                if (nanosecond % iArr[i2] != 0) {
                    break;
                }
                i = i2;
            }
            int i3 = i - (i % 3);
            String strValueOf = String.valueOf((unboundLocalDateTimeFromInstant.getNanosecond() / iArr[i3]) + iArr[9 - i3]);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb.append(strSubstring);
        }
        sb.append('Z');
        return sb.toString();
    }

    private static final void formatIso$lambda$0$appendTwoDigits(Appendable appendable, StringBuilder sb, int i) throws IOException {
        if (i < 10) {
            appendable.append('0');
        }
        sb.append(i);
    }

    private static final boolean isDistantFuture(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return instant.compareTo(Instant.INSTANCE.getDISTANT_FUTURE()) >= 0;
    }

    public static /* synthetic */ void isDistantFuture$annotations(Instant instant) {
    }

    private static final boolean isDistantPast(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return instant.compareTo(Instant.INSTANCE.getDISTANT_PAST()) <= 0;
    }

    public static /* synthetic */ void isDistantPast$annotations(Instant instant) {
    }

    public static final boolean isLeapYear(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    private static final int monthLength(int i, boolean z) {
        if (i != 2) {
            return (i == 4 || i == 6 || i == 9 || i == 11) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstantParseResult parseIso(CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char cCharAt2;
        if (charSequence.length() == 0) {
            return new InstantParseResult.Failure("An empty string is not a valid Instant", charSequence);
        }
        char cCharAt3 = charSequence.charAt(0);
        if (cCharAt3 == '+' || cCharAt3 == '-') {
            i = 1;
        } else {
            i = 0;
            cCharAt3 = ' ';
        }
        int iCharAt = 0;
        int i5 = i;
        while (i5 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i5)) && cCharAt2 < ':') {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i5) - '0');
            i5++;
        }
        int i6 = i5 - i;
        if (i6 > 10) {
            return parseIso$parseFailure(charSequence, "Expected at most 10 digits for the year number, got " + i6 + " digits");
        }
        if (i6 == 10 && Intrinsics.compare((int) charSequence.charAt(i), 50) >= 0) {
            return parseIso$parseFailure(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
        }
        if (i6 < 4) {
            return parseIso$parseFailure(charSequence, "The year number must be padded to 4 digits, got " + i6 + " digits");
        }
        if (cCharAt3 == '+' && i6 == 4) {
            return parseIso$parseFailure(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (cCharAt3 == ' ' && i6 != 4) {
            return parseIso$parseFailure(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i7 = iCharAt;
        int i8 = i5 + 16;
        if (charSequence.length() < i8) {
            return parseIso$parseFailure(charSequence, "The input string is too short");
        }
        InstantParseResult.Failure iso$expect = parseIso$expect(charSequence, "'-'", i5, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$0(((Character) obj).charValue()));
            }
        });
        if (iso$expect != null) {
            return iso$expect;
        }
        InstantParseResult.Failure iso$expect2 = parseIso$expect(charSequence, "'-'", i5 + 3, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$2(((Character) obj).charValue()));
            }
        });
        if (iso$expect2 != null) {
            return iso$expect2;
        }
        InstantParseResult.Failure iso$expect3 = parseIso$expect(charSequence, "'T' or 't'", i5 + 6, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$4(((Character) obj).charValue()));
            }
        });
        if (iso$expect3 != null) {
            return iso$expect3;
        }
        InstantParseResult.Failure iso$expect4 = parseIso$expect(charSequence, "':'", i5 + 9, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$6(((Character) obj).charValue()));
            }
        });
        if (iso$expect4 != null) {
            return iso$expect4;
        }
        InstantParseResult.Failure iso$expect5 = parseIso$expect(charSequence, "':'", i5 + 12, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$8(((Character) obj).charValue()));
            }
        });
        if (iso$expect5 != null) {
            return iso$expect5;
        }
        for (int i9 : asciiDigitPositionsInIsoStringAfterYear) {
            InstantParseResult.Failure iso$expect6 = parseIso$expect(charSequence, "an ASCII digit", i9 + i5, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(InstantKt.parseIso$lambda$10(((Character) obj).charValue()));
                }
            });
            if (iso$expect6 != null) {
                return iso$expect6;
            }
        }
        int iso$twoDigitNumber = parseIso$twoDigitNumber(charSequence, i5 + 1);
        int iso$twoDigitNumber2 = parseIso$twoDigitNumber(charSequence, i5 + 4);
        int iso$twoDigitNumber3 = parseIso$twoDigitNumber(charSequence, i5 + 7);
        int iso$twoDigitNumber4 = parseIso$twoDigitNumber(charSequence, i5 + 10);
        int iso$twoDigitNumber5 = parseIso$twoDigitNumber(charSequence, i5 + 13);
        int i10 = i5 + 15;
        if (charSequence.charAt(i10) == '.') {
            i10 = i8;
            int iCharAt2 = 0;
            while (i10 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i10)) && cCharAt < ':') {
                iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i10) - '0');
                i10++;
            }
            int i11 = i10 - i8;
            if (1 > i11 || i11 >= 10) {
                return parseIso$parseFailure(charSequence, "1..9 digits are supported for the fraction of the second, got " + i11 + " digits");
            }
            i2 = iCharAt2 * POWERS_OF_TEN[9 - i11];
        } else {
            i2 = 0;
        }
        if (i10 >= charSequence.length()) {
            return parseIso$parseFailure(charSequence, "The UTC offset at the end of the string is missing");
        }
        char cCharAt4 = charSequence.charAt(i10);
        if (cCharAt4 == '+' || cCharAt4 == '-') {
            int length = charSequence.length() - i10;
            if (length > 9) {
                return parseIso$parseFailure(charSequence, "The UTC offset string \"" + truncateForErrorMessage(charSequence.subSequence(i10, charSequence.length()).toString(), 16) + "\" is too long");
            }
            if (length % 3 != 0) {
                return parseIso$parseFailure(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i10, charSequence.length()).toString() + Typography.quote);
            }
            for (int i12 : colonsInIsoOffsetString) {
                int i13 = i10 + i12;
                if (i13 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i13) != ':') {
                    return parseIso$parseFailure(charSequence, "Expected ':' at index " + i13 + ", got '" + charSequence.charAt(i13) + '\'');
                }
            }
            int[] iArr = asciiDigitsInIsoOffsetString;
            int length2 = iArr.length;
            int i14 = 0;
            while (i14 < length2) {
                int i15 = iArr[i14] + i10;
                if (i15 >= charSequence.length()) {
                    break;
                }
                char cCharAt5 = charSequence.charAt(i15);
                int[] iArr2 = iArr;
                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                    return parseIso$parseFailure(charSequence, "Expected an ASCII digit at index " + i15 + ", got '" + charSequence.charAt(i15) + '\'');
                }
                i14++;
                iArr = iArr2;
            }
            int iso$twoDigitNumber6 = parseIso$twoDigitNumber(charSequence, i10 + 1);
            int iso$twoDigitNumber7 = length > 3 ? parseIso$twoDigitNumber(charSequence, i10 + 4) : 0;
            int iso$twoDigitNumber8 = length > 6 ? parseIso$twoDigitNumber(charSequence, i10 + 7) : 0;
            if (iso$twoDigitNumber7 > 59) {
                return parseIso$parseFailure(charSequence, "Expected offset-minute-of-hour in 0..59, got " + iso$twoDigitNumber7);
            }
            if (iso$twoDigitNumber8 > 59) {
                return parseIso$parseFailure(charSequence, "Expected offset-second-of-minute in 0..59, got " + iso$twoDigitNumber8);
            }
            if (iso$twoDigitNumber6 > 17 && (iso$twoDigitNumber6 != 18 || iso$twoDigitNumber7 != 0 || iso$twoDigitNumber8 != 0)) {
                return parseIso$parseFailure(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i10, charSequence.length()).toString());
            }
            i3 = (cCharAt4 == '-' ? -1 : 1) * ((iso$twoDigitNumber6 * SECONDS_PER_HOUR) + (iso$twoDigitNumber7 * SECONDS_PER_MINUTE) + iso$twoDigitNumber8);
            i4 = 1;
        } else {
            if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                return parseIso$parseFailure(charSequence, "Expected the UTC offset at position " + i10 + ", got '" + cCharAt4 + '\'');
            }
            int i16 = i10 + 1;
            if (charSequence.length() != i16) {
                return parseIso$parseFailure(charSequence, "Extra text after the instant at position " + i16);
            }
            i4 = 1;
            i3 = 0;
        }
        if (i4 > iso$twoDigitNumber || iso$twoDigitNumber >= 13) {
            return parseIso$parseFailure(charSequence, "Expected a month number in 1..12, got " + iso$twoDigitNumber);
        }
        if (i4 > iso$twoDigitNumber2 || iso$twoDigitNumber2 > monthLength(iso$twoDigitNumber, isLeapYear(i7))) {
            return parseIso$parseFailure(charSequence, "Expected a valid day-of-month for month " + iso$twoDigitNumber + " of year " + i7 + ", got " + iso$twoDigitNumber2);
        }
        if (iso$twoDigitNumber3 > 23) {
            return parseIso$parseFailure(charSequence, "Expected hour in 0..23, got " + iso$twoDigitNumber3);
        }
        if (iso$twoDigitNumber4 > 59) {
            return parseIso$parseFailure(charSequence, "Expected minute-of-hour in 0..59, got " + iso$twoDigitNumber4);
        }
        if (iso$twoDigitNumber5 > 59) {
            return parseIso$parseFailure(charSequence, "Expected second-of-minute in 0..59, got " + iso$twoDigitNumber5);
        }
        UnboundLocalDateTime unboundLocalDateTime = new UnboundLocalDateTime(i7, iso$twoDigitNumber, iso$twoDigitNumber2, iso$twoDigitNumber3, iso$twoDigitNumber4, iso$twoDigitNumber5, i2);
        long year = unboundLocalDateTime.getYear();
        long j = 365 * year;
        long month = (year >= 0 ? j + (((3 + year) / 4) - ((99 + year) / 100)) + ((year + 399) / 400) : j - (((year / (-4)) - (year / (-100))) + (year / (-400)))) + ((long) (((unboundLocalDateTime.getMonth() * 367) - 362) / 12)) + ((long) (unboundLocalDateTime.getDay() - 1));
        if (unboundLocalDateTime.getMonth() > 2) {
            month = !isLeapYear(unboundLocalDateTime.getYear()) ? month - 2 : (-1) + month;
        }
        return new InstantParseResult.Success((((month - 719528) * 86400) + ((long) (((unboundLocalDateTime.getHour() * SECONDS_PER_HOUR) + (unboundLocalDateTime.getMinute() * SECONDS_PER_MINUTE)) + unboundLocalDateTime.getSecond()))) - ((long) i3), unboundLocalDateTime.getNanosecond());
    }

    private static final InstantParseResult.Failure parseIso$expect(CharSequence charSequence, String str, int i, Function1<? super Character, Boolean> function1) {
        char cCharAt = charSequence.charAt(i);
        if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
            return null;
        }
        return parseIso$parseFailure(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i);
    }

    static final boolean parseIso$lambda$0(char c) {
        return c == '-';
    }

    static final boolean parseIso$lambda$10(char c) {
        return '0' <= c && c < ':';
    }

    static final boolean parseIso$lambda$2(char c) {
        return c == '-';
    }

    static final boolean parseIso$lambda$4(char c) {
        return c == 'T' || c == 't';
    }

    static final boolean parseIso$lambda$6(char c) {
        return c == ':';
    }

    static final boolean parseIso$lambda$8(char c) {
        return c == ':';
    }

    private static final InstantParseResult.Failure parseIso$parseFailure(CharSequence charSequence, String str) {
        return new InstantParseResult.Failure(str + " when parsing an Instant from \"" + truncateForErrorMessage(charSequence, 64) + Typography.quote, charSequence);
    }

    private static final int parseIso$twoDigitNumber(CharSequence charSequence, int i) {
        return ((charSequence.charAt(i) - '0') * 10) + (charSequence.charAt(i + 1) - '0');
    }

    private static final long safeAddOrElse(long j, long j2, Function0 function0) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    private static final long safeMultiplyOrElse(long j, long j2, Function0 function0) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage(CharSequence charSequence, int i) {
        if (charSequence.length() <= i) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i).toString() + "...";
    }
}
