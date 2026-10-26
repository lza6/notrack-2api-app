package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class pi4 {
    public static final LinkedHashSet a(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new sm0(z, uri));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        jr1.i(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jr1.i(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        u41.k(ud2.q("Could not convert ", " to BackoffPolicy", i));
        return 0;
    }

    public static final int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        u41.k(ud2.q("Could not convert ", " to NetworkType", i));
        return 0;
    }

    public static final int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        u41.k(ud2.q("Could not convert ", " to OutOfQuotaPolicy", i));
        return 0;
    }

    public static final int e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        u41.k(ud2.q("Could not convert ", " to State", i));
        return 0;
    }

    public static final int f(int i) {
        if (i == 0) {
            throw null;
        }
        int iZ = fq2.z(i);
        if (iZ == 0) {
            return 0;
        }
        int i2 = 1;
        if (iZ != 1) {
            i2 = 2;
            if (iZ != 2) {
                i2 = 3;
                if (iZ != 3) {
                    i2 = 4;
                    if (iZ != 4) {
                        if (iZ == 5) {
                            return 5;
                        }
                        u41.e();
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static final dl2 g(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new dl2(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                dl2 dl2VarO = jr1.o(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return dl2VarO;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    jr1.i(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jr1.i(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static int h(byte[] bArr, int i, hp4 hp4Var) throws zp4 {
        int iM = m(bArr, i, hp4Var);
        int i2 = hp4Var.a;
        if (i2 < 0) {
            j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM) {
            j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            hp4Var.c = jp4.d;
            return iM;
        }
        hp4Var.c = jp4.o(bArr, iM, i2);
        return iM + i2;
    }

    public static int i(int i, byte[] bArr) {
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = bArr[i + 1] & UByte.MAX_VALUE;
        int i4 = bArr[i + 2] & UByte.MAX_VALUE;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int j(jq4 jq4Var, int i, byte[] bArr, int i2, int i3, vp4 vp4Var, hp4 hp4Var) throws zp4 {
        sp4 sp4VarF = jq4Var.f();
        jq4 jq4Var2 = jq4Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        hp4 hp4Var2 = hp4Var;
        int iR = r(sp4VarF, jq4Var2, bArr2, i2, i4, hp4Var2);
        jq4Var2.a(sp4VarF);
        hp4Var2.c = sp4VarF;
        vp4Var.add(sp4VarF);
        while (iR < i4) {
            hp4 hp4Var3 = hp4Var2;
            int i5 = i4;
            int iM = m(bArr2, iR, hp4Var3);
            if (i != hp4Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            jq4 jq4Var3 = jq4Var2;
            sp4 sp4VarF2 = jq4Var3.f();
            iR = r(sp4VarF2, jq4Var3, bArr3, iM, i5, hp4Var3);
            jq4Var2 = jq4Var3;
            bArr2 = bArr3;
            i4 = i5;
            hp4Var2 = hp4Var3;
            jq4Var2.a(sp4VarF2);
            hp4Var2.c = sp4VarF2;
            vp4Var.add(sp4VarF2);
        }
        return iR;
    }

    public static int k(byte[] bArr, int i, vp4 vp4Var, hp4 hp4Var) throws zp4 {
        tp4 tp4Var = (tp4) vp4Var;
        int iM = m(bArr, i, hp4Var);
        int i2 = hp4Var.a;
        if (i2 < 0) {
            j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM) {
            j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i3 = i2 + iM;
        while (iM < i3) {
            iM = m(bArr, iM, hp4Var);
            tp4Var.j(hp4Var.a);
        }
        if (iM == i3) {
            return iM;
        }
        j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int l(int i, byte[] bArr, int i2, int i3, mq4 mq4Var, hp4 hp4Var) throws zp4 {
        if ((i >>> 3) == 0) {
            j93.l("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iP = p(bArr, i2, hp4Var);
            mq4Var.c(i, Long.valueOf(hp4Var.b));
            return iP;
        }
        if (i4 == 1) {
            mq4Var.c(i, Long.valueOf(s(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM = m(bArr, i2, hp4Var);
            int i5 = hp4Var.a;
            if (i5 < 0) {
                j93.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iM) {
                j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                mq4Var.c(i, jp4.d);
            } else {
                mq4Var.c(i, jp4.o(bArr, iM, i5));
            }
            return iM + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                mq4Var.c(i, Integer.valueOf(i(i2, bArr)));
                return i2 + 4;
            }
            j93.l("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        mq4 mq4VarB = mq4.b();
        int i7 = hp4Var.d + 1;
        hp4Var.d = i7;
        t(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iM2 = m(bArr, i2, hp4Var);
            int i9 = hp4Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM2;
                break;
            }
            i2 = l(i9, bArr, iM2, i3, mq4VarB, hp4Var);
            i8 = i9;
        }
        hp4Var.d--;
        if (i2 > i3 || i8 != i6) {
            j93.l("Failed to parse the message.");
            return 0;
        }
        mq4Var.c(i, mq4VarB);
        return i2;
    }

    public static int m(byte[] bArr, int i, hp4 hp4Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return n(b, bArr, i2, hp4Var);
        }
        hp4Var.a = b;
        return i2;
    }

    public static int n(int i, byte[] bArr, int i2, hp4 hp4Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            hp4Var.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            hp4Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            hp4Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            hp4Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                hp4Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int o(int i, byte[] bArr, int i2, int i3, vp4 vp4Var, hp4 hp4Var) {
        tp4 tp4Var = (tp4) vp4Var;
        int iM = m(bArr, i2, hp4Var);
        tp4Var.j(hp4Var.a);
        while (iM < i3) {
            int iM2 = m(bArr, iM, hp4Var);
            if (i != hp4Var.a) {
                break;
            }
            iM = m(bArr, iM2, hp4Var);
            tp4Var.j(hp4Var.a);
        }
        return iM;
    }

    public static int p(byte[] bArr, int i, hp4 hp4Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            hp4Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & ByteCompanionObject.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i4;
            b = b2;
            i3 = i5;
        }
        hp4Var.b = j2;
        return i3;
    }

    public static int q(Object obj, jq4 jq4Var, byte[] bArr, int i, int i2, int i3, hp4 hp4Var) throws zp4 {
        int i4 = hp4Var.d + 1;
        hp4Var.d = i4;
        t(i4);
        int iT = ((dq4) jq4Var).t(obj, bArr, i, i2, i3, hp4Var);
        hp4Var.d--;
        hp4Var.c = obj;
        return iT;
    }

    public static int r(Object obj, jq4 jq4Var, byte[] bArr, int i, int i2, hp4 hp4Var) throws zp4 {
        int iN = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iN = n(i3, bArr, iN, hp4Var);
            i3 = hp4Var.a;
        }
        int i4 = iN;
        if (i3 < 0 || i3 > i2 - i4) {
            j93.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = hp4Var.d + 1;
        hp4Var.d = i5;
        t(i5);
        int i6 = i4 + i3;
        jq4Var.e(obj, bArr, i4, i6, hp4Var);
        hp4Var.d--;
        hp4Var.c = obj;
        return i6;
    }

    public static long s(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static void t(int i) throws zp4 {
        if (i < 100) {
            return;
        }
        j93.l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
