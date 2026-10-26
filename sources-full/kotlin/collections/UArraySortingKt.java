package kotlin.collections;

import app.template.extension.BuildConfig;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", BuildConfig.VERSION_NAME, "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", BuildConfig.VERSION_NAME, "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class UArraySortingKt {
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m686x73511b62(long[] jArr, int i, int i2) {
        long jM462xcfaa9a12 = ULongArray.m462xcfaa9a12(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compare(ULongArray.m462xcfaa9a12(jArr, i) ^ Long.MIN_VALUE, jM462xcfaa9a12 ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (Long.compare(ULongArray.m462xcfaa9a12(jArr, i2) ^ Long.MIN_VALUE, jM462xcfaa9a12 ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM462xcfaa9a13 = ULongArray.m462xcfaa9a12(jArr, i);
                ULongArray.m467x350d2dcc(jArr, i, ULongArray.m462xcfaa9a12(jArr, i2));
                ULongArray.m467x350d2dcc(jArr, i2, jM462xcfaa9a13);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m687xba0c0656(byte[] bArr, int i, int i2) {
        int i3;
        byte bM304xab4261c4 = UByteArray.m304xab4261c4(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM304xab4261c4 = UByteArray.m304xab4261c4(bArr, i) & UByte.MAX_VALUE;
                i3 = bM304xab4261c4 & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM304xab4261c4, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m304xab4261c4(bArr, i2) & UByte.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM304xab4261c5 = UByteArray.m304xab4261c4(bArr, i);
                UByteArray.m309x48c750dd(bArr, i, UByteArray.m304xab4261c4(bArr, i2));
                UByteArray.m309x48c750dd(bArr, i2, bM304xab4261c5);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m688x7bc6de6e(short[] sArr, int i, int i2) {
        int i3;
        short sM567x582c0dba = UShortArray.m567x582c0dba(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM567x582c0dba = UShortArray.m567x582c0dba(sArr, i) & UShort.MAX_VALUE;
                i3 = sM567x582c0dba & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM567x582c0dba, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m567x582c0dba(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM567x582c0dba2 = UShortArray.m567x582c0dba(sArr, i);
                UShortArray.m572xf833a555(sArr, i, UShortArray.m567x582c0dba(sArr, i2));
                UShortArray.m572xf833a555(sArr, i2, sM567x582c0dba2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m689xc954806c(int[] iArr, int i, int i2) {
        int iM383x77d3fd05 = UIntArray.m383x77d3fd05(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compare(UIntArray.m383x77d3fd05(iArr, i) ^ Integer.MIN_VALUE, iM383x77d3fd05 ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (Integer.compare(UIntArray.m383x77d3fd05(iArr, i2) ^ Integer.MIN_VALUE, iM383x77d3fd05 ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM383x77d3fd06 = UIntArray.m383x77d3fd05(iArr, i);
                UIntArray.m388x158a2ba1(iArr, i, UIntArray.m383x77d3fd05(iArr, i2));
                UIntArray.m388x158a2ba1(iArr, i2, iM383x77d3fd06);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m690xede208a3(long[] jArr, int i, int i2) {
        int iM686x73511b62 = m686x73511b62(jArr, i, i2);
        int i3 = iM686x73511b62 - 1;
        if (i < i3) {
            m690xede208a3(jArr, i, i3);
        }
        if (iM686x73511b62 < i2) {
            m690xede208a3(jArr, iM686x73511b62, i2);
        }
    }

    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m691x349cf397(byte[] bArr, int i, int i2) {
        int iM687xba0c0656 = m687xba0c0656(bArr, i, i2);
        int i3 = iM687xba0c0656 - 1;
        if (i < i3) {
            m691x349cf397(bArr, i, i3);
        }
        if (iM687xba0c0656 < i2) {
            m691x349cf397(bArr, iM687xba0c0656, i2);
        }
    }

    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m692xf657cbaf(short[] sArr, int i, int i2) {
        int iM688x7bc6de6e = m688x7bc6de6e(sArr, i, i2);
        int i3 = iM688x7bc6de6e - 1;
        if (i < i3) {
            m692xf657cbaf(sArr, i, i3);
        }
        if (iM688x7bc6de6e < i2) {
            m692xf657cbaf(sArr, iM688x7bc6de6e, i2);
        }
    }

    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m693x43e56dad(int[] iArr, int i, int i2) {
        int iM689xc954806c = m689xc954806c(iArr, i, i2);
        int i3 = iM689xc954806c - 1;
        if (i < i3) {
            m693x43e56dad(iArr, i, i3);
        }
        if (iM689xc954806c < i2) {
            m693x43e56dad(iArr, iM689xc954806c, i2);
        }
    }

    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m694xa66366d3(long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-array$0");
        m690xede208a3(jArr, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m695xed1e51c7(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-array$0");
        m691x349cf397(bArr, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m696xaed929df(short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-array$0");
        m692xf657cbaf(sArr, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m697xfc66cbdd(int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-array$0");
        m693x43e56dad(iArr, i, i2 - 1);
    }
}
