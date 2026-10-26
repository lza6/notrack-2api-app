package kotlin;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\b\u0010\u0004\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b\n\u0010\u0004\u001a\u0014\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b\f\u0010\u0004\u001a\u001c\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0014\u0010\t\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u000b\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001c\u0010\r\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u0011\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b!\u0010 \u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\"\u0010 \u001a\u0014\u0010\t\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010\u000b\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b%\u0010$\u001a\u001c\u0010\r\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010\u0011\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b(\u0010'\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b*\u0010+\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b,\u0010+\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b-\u0010+\u001a\u0014\u0010\t\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u0010\u000b\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b0\u0010/\u001a\u001c\u0010\r\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b1\u00102\u001a\u001c\u0010\u0011\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b3\u00102¨\u00064"}, d2 = {"countOneBits", BuildConfig.VERSION_NAME, "Lkotlin/UInt;", "countOneBits-WZ4Q5Ns", "(I)I", "countLeadingZeroBits", "countLeadingZeroBits-WZ4Q5Ns", "countTrailingZeroBits", "countTrailingZeroBits-WZ4Q5Ns", "takeHighestOneBit", "takeHighestOneBit-WZ4Q5Ns", "takeLowestOneBit", "takeLowestOneBit-WZ4Q5Ns", "rotateLeft", "bitCount", "rotateLeft-V7xB4Y4", "(II)I", "rotateRight", "rotateRight-V7xB4Y4", "Lkotlin/ULong;", "countOneBits-VKZWuLQ", "(J)I", "countLeadingZeroBits-VKZWuLQ", "countTrailingZeroBits-VKZWuLQ", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeLowestOneBit-VKZWuLQ", "rotateLeft-JSWoG40", "(JI)J", "rotateRight-JSWoG40", "Lkotlin/UByte;", "countOneBits-7apg3OU", "(B)I", "countLeadingZeroBits-7apg3OU", "countTrailingZeroBits-7apg3OU", "takeHighestOneBit-7apg3OU", "(B)B", "takeLowestOneBit-7apg3OU", "rotateLeft-LxnNnR4", "(BI)B", "rotateRight-LxnNnR4", "Lkotlin/UShort;", "countOneBits-xj2QHRw", "(S)I", "countLeadingZeroBits-xj2QHRw", "countTrailingZeroBits-xj2QHRw", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit-xj2QHRw", "rotateLeft-olVBNx4", "(SI)S", "rotateRight-olVBNx4", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class UNumbersKt {
    /* JADX INFO: renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m474xd74e9550(byte b) {
        return Integer.numberOfLeadingZeros(b & UByte.MAX_VALUE) - 24;
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m475x1868d0e0(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m476x64cc9632(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m477x51abdc54(short s) {
        return Integer.numberOfLeadingZeros(s & UShort.MAX_VALUE) - 16;
    }

    /* JADX INFO: renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m478xfd7735e8(byte b) {
        return Integer.bitCount(UInt.m323xf1229813(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m479x3e917178(long j) {
        return Long.bitCount(j);
    }

    /* JADX INFO: renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m480x8af536ca(int i) {
        return Integer.bitCount(i);
    }

    /* JADX INFO: renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m481x77d47cec(short s) {
        return Integer.bitCount(UInt.m323xf1229813(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m482x8a0190a4(byte b) {
        return Integer.numberOfTrailingZeros(b | UByte.MIN_VALUE);
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m483xcb1bcc34(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m484x177f9186(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m485x45ed7a8(short s) {
        return Integer.numberOfTrailingZeros(s | UShort.MIN_VALUE);
    }

    /* JADX INFO: renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m486xe2096c97(long j, int i) {
        return ULong.m402xf1229813(Long.rotateLeft(j, i));
    }

    /* JADX INFO: renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m487x8c2ee479(byte b, int i) {
        return UByte.m245xf1229813(NumbersKt.rotateLeft(b, i));
    }

    /* JADX INFO: renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m488x2ec8d259(int i, int i2) {
        return UInt.m323xf1229813(Integer.rotateLeft(i, i2));
    }

    /* JADX INFO: renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m489xb1d6bad6(short s, int i) {
        return UShort.m509xf1229813(NumbersKt.rotateLeft(s, i));
    }

    /* JADX INFO: renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m490xacbdc716(long j, int i) {
        return ULong.m402xf1229813(Long.rotateRight(j, i));
    }

    /* JADX INFO: renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m491x56e33ef8(byte b, int i) {
        return UByte.m245xf1229813(NumbersKt.rotateRight(b, i));
    }

    /* JADX INFO: renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m492xf97d2cd8(int i, int i2) {
        return UInt.m323xf1229813(Integer.rotateRight(i, i2));
    }

    /* JADX INFO: renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m493x7c8b1555(short s, int i) {
        return UShort.m509xf1229813(NumbersKt.rotateRight(s, i));
    }

    /* JADX INFO: renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m494xc6fde7af(byte b) {
        return UByte.m245xf1229813((byte) Integer.highestOneBit(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m495x818233f(long j) {
        return ULong.m402xf1229813(Long.highestOneBit(j));
    }

    /* JADX INFO: renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m496x547be891(int i) {
        return UInt.m323xf1229813(Integer.highestOneBit(i));
    }

    /* JADX INFO: renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m497x415b2eb3(short s) {
        return UShort.m509xf1229813((short) Integer.highestOneBit(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m498xf848d5ab(byte b) {
        return UByte.m245xf1229813((byte) Integer.lowestOneBit(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m499x3963113b(long j) {
        return ULong.m402xf1229813(Long.lowestOneBit(j));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m500x85c6d68d(int i) {
        return UInt.m323xf1229813(Integer.lowestOneBit(i));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m501x72a61caf(short s) {
        return UShort.m509xf1229813((short) Integer.lowestOneBit(s & UShort.MAX_VALUE));
    }
}
