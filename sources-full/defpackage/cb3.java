package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb3 {
    public static final Class a;
    public static final z84 b;
    public static final z84 c;
    public static final z84 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = v(false);
        c = v(true);
        d = new z84();
    }

    public static void A(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                de0Var.getClass();
                de0Var.o(Double.doubleToRawLongBits(dDoubleValue), i);
                i2++;
            }
            return;
        }
        de0Var.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = de0.e;
            i3 += 8;
        }
        de0Var.s(i3);
        while (i2 < list.size()) {
            de0Var.p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void B(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                de0Var.r(i, 0);
                de0Var.q(iIntValue);
            }
            return;
        }
        de0Var.r(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += de0.f(((Integer) list.get(i3)).intValue());
        }
        de0Var.s(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            de0Var.q(((Integer) list.get(i4)).intValue());
        }
    }

    public static void C(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                de0Var.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        de0Var.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = de0.e;
            i3 += 4;
        }
        de0Var.s(i3);
        while (i2 < list.size()) {
            de0Var.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                de0Var.o(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        de0Var.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = de0.e;
            i3 += 8;
        }
        de0Var.s(i3);
        while (i2 < list.size()) {
            de0Var.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void E(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                de0Var.getClass();
                de0Var.m(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        de0Var.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = de0.e;
            i3 += 4;
        }
        de0Var.s(i3);
        while (i2 < list.size()) {
            de0Var.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void F(int i, List list, jb jbVar, za3 za3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jbVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            jbVar.D(i, list.get(i2), za3Var);
        }
    }

    public static void G(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                de0Var.r(i, 0);
                de0Var.q(iIntValue);
            }
            return;
        }
        de0Var.r(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += de0.f(((Integer) list.get(i3)).intValue());
        }
        de0Var.s(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            de0Var.q(((Integer) list.get(i4)).intValue());
        }
    }

    public static void H(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                de0Var.t(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        de0Var.r(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += de0.j(((Long) list.get(i3)).longValue());
        }
        de0Var.s(iJ);
        while (i2 < list.size()) {
            de0Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void I(int i, List list, jb jbVar, za3 za3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jbVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            jbVar.E(i, list.get(i2), za3Var);
        }
    }

    public static void J(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                de0Var.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        de0Var.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = de0.e;
            i3 += 4;
        }
        de0Var.s(i3);
        while (i2 < list.size()) {
            de0Var.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                de0Var.o(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        de0Var.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = de0.e;
            i3 += 8;
        }
        de0Var.s(i3);
        while (i2 < list.size()) {
            de0Var.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, jb jbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                de0Var.r(i, 0);
                de0Var.s((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        de0Var.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += de0.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        de0Var.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            de0Var.s((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void M(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                de0Var.t((jLongValue >> 63) ^ (jLongValue << 1), i);
                i2++;
            }
            return;
        }
        de0Var.r(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += de0.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        de0Var.s(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            de0Var.u((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void N(int i, List list, jb jbVar) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        if (!(list instanceof p22)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                de0Var.r(i, 2);
                int i3 = de0Var.c;
                byte[] bArr = de0Var.b;
                int i4 = de0Var.d;
                try {
                    int i5 = de0.i(str.length() * 3);
                    int i6 = de0.i(str.length());
                    if (i6 == i5) {
                        int i7 = i4 + i6;
                        de0Var.d = i7;
                        int iP = ha4.a.p(str, bArr, i7, i3 - i7);
                        de0Var.d = i4;
                        de0Var.s((iP - i4) - i6);
                        de0Var.d = iP;
                    } else {
                        de0Var.s(ha4.b(str));
                        int i8 = de0Var.d;
                        de0Var.d = ha4.a.p(str, bArr, i8, i3 - i8);
                    }
                } catch (ga4 e) {
                    de0Var.d = i4;
                    de0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(zq1.a);
                    try {
                        de0Var.s(bytes.length);
                        de0Var.l(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new ee0(e2);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    throw new ee0(e3);
                }
            }
            return;
        }
        p22 p22Var = (p22) list;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object objH = p22Var.h(i9);
            if (objH instanceof String) {
                String str2 = (String) objH;
                de0Var.r(i, 2);
                int i10 = de0Var.c;
                byte[] bArr2 = de0Var.b;
                int i11 = de0Var.d;
                try {
                    int i12 = de0.i(str2.length() * 3);
                    int i13 = de0.i(str2.length());
                    if (i13 == i12) {
                        int i14 = i11 + i13;
                        de0Var.d = i14;
                        int iP2 = ha4.a.p(str2, bArr2, i14, i10 - i14);
                        de0Var.d = i11;
                        de0Var.s((iP2 - i11) - i13);
                        de0Var.d = iP2;
                    } else {
                        de0Var.s(ha4.b(str2));
                        int i15 = de0Var.d;
                        de0Var.d = ha4.a.p(str2, bArr2, i15, i10 - i15);
                    }
                } catch (ga4 e4) {
                    de0Var.d = i11;
                    de0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                    byte[] bytes2 = str2.getBytes(zq1.a);
                    try {
                        de0Var.s(bytes2.length);
                        de0Var.l(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e5) {
                        throw new ee0(e5);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    throw new ee0(e6);
                }
            } else {
                mz mzVar = (mz) objH;
                de0Var.r(i, 2);
                de0Var.s(mzVar.size());
                kz kzVar = (kz) mzVar;
                de0Var.l(kzVar.l, kzVar.l(), kzVar.size());
            }
        }
    }

    public static void O(int i, List list, jb jbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                de0Var.r(i, 0);
                de0Var.s(iIntValue);
            }
            return;
        }
        de0Var.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += de0.i(((Integer) list.get(i4)).intValue());
        }
        de0Var.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            de0Var.s(((Integer) list.get(i5)).intValue());
        }
    }

    public static void P(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                de0Var.t(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        de0Var.r(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += de0.j(((Long) list.get(i3)).longValue());
        }
        de0Var.s(iJ);
        while (i2 < list.size()) {
            de0Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = de0.h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iH += de0.b((mz) list.get(i2));
        }
        return iH;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (de0.h(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq1) {
            bq1 bq1Var = (bq1) list;
            if (size <= 0) {
                return 0;
            }
            bq1Var.g(0);
            throw null;
        }
        int iF = 0;
        for (int i = 0; i < size; i++) {
            iF += de0.f(((Integer) list.get(i)).intValue());
        }
        return iF;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return de0.c(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return de0.d(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (de0.h(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq1) {
            bq1 bq1Var = (bq1) list;
            if (size <= 0) {
                return 0;
            }
            bq1Var.g(0);
            throw null;
        }
        int iF = 0;
        for (int i = 0; i < size; i++) {
            iF += de0.f(((Integer) list.get(i)).intValue());
        }
        return iF;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (de0.h(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x72) {
            x72 x72Var = (x72) list;
            if (size <= 0) {
                return 0;
            }
            x72Var.g(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += de0.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int l(int i, List list, za3 za3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = de0.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iB = ((g0) list.get(i2)).b(za3Var);
            iH += de0.i(iB) + iB;
        }
        return iH;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (de0.h(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq1) {
            bq1 bq1Var = (bq1) list;
            if (size <= 0) {
                return 0;
            }
            bq1Var.g(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += de0.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (de0.h(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x72) {
            x72 x72Var = (x72) list;
            if (size <= 0) {
                return 0;
            }
            x72Var.g(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += de0.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iH = de0.h(i) * size;
        if (!(list instanceof p22)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof mz) {
                    int size2 = ((mz) obj).size();
                    iH = de0.i(size2) + size2 + iH;
                } else {
                    iH = de0.g((String) obj) + iH;
                }
                i2++;
            }
            return iH;
        }
        p22 p22Var = (p22) list;
        while (i2 < size) {
            Object objH = p22Var.h(i2);
            if (objH instanceof mz) {
                int size3 = ((mz) objH).size();
                iH = de0.i(size3) + size3 + iH;
            } else {
                iH = de0.g((String) objH) + iH;
            }
            i2++;
        }
        return iH;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (de0.h(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof bq1) {
            bq1 bq1Var = (bq1) list;
            if (size <= 0) {
                return 0;
            }
            bq1Var.g(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += de0.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (de0.h(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x72) {
            x72 x72Var = (x72) list;
            if (size <= 0) {
                return 0;
            }
            x72Var.g(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += de0.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static z84 v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (z84) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void w(z84 z84Var, Object obj, Object obj2) {
        z84Var.getClass();
        ef1 ef1Var = (ef1) obj;
        y84 y84Var = ef1Var.unknownFields;
        y84 y84Var2 = ((ef1) obj2).unknownFields;
        y84 y84Var3 = y84.f;
        if (!y84Var3.equals(y84Var2)) {
            if (y84Var3.equals(y84Var)) {
                int i = y84Var.a + y84Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(y84Var.b, i);
                System.arraycopy(y84Var2.b, 0, iArrCopyOf, y84Var.a, y84Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(y84Var.c, i);
                System.arraycopy(y84Var2.c, 0, objArrCopyOf, y84Var.a, y84Var2.a);
                y84Var = new y84(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                y84Var.getClass();
                if (!y84Var2.equals(y84Var3)) {
                    if (!y84Var.e) {
                        m51.e();
                        return;
                    }
                    int i2 = y84Var.a + y84Var2.a;
                    y84Var.a(i2);
                    System.arraycopy(y84Var2.b, 0, y84Var.b, y84Var.a, y84Var2.a);
                    System.arraycopy(y84Var2.c, 0, y84Var.c, y84Var.a, y84Var2.a);
                    y84Var.a = i2;
                }
            }
        }
        ef1Var.unknownFields = y84Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i, List list, jb jbVar, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        de0 de0Var = (de0) jbVar.d;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                de0Var.r(i, 0);
                de0Var.k(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        de0Var.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = de0.e;
            i3++;
        }
        de0Var.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            de0Var.k(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void z(int i, List list, jb jbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jbVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            de0 de0Var = (de0) jbVar.d;
            mz mzVar = (mz) list.get(i2);
            de0Var.r(i, 2);
            de0Var.s(mzVar.size());
            kz kzVar = (kz) mzVar;
            de0Var.l(kzVar.l, kzVar.l(), kzVar.size());
        }
    }
}
