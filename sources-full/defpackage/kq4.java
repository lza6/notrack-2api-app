package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq4 {
    public static final zf3 a;

    static {
        int i = gp4.a;
        a = new zf3(14);
    }

    public static void a(int i, List list, sk3 sk3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!(list instanceof tp4)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    bkVar.B(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            bkVar.A(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iF += bk.F((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            bkVar.C(iF);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                bkVar.C((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        tp4 tp4Var = (tp4) list;
        if (!z) {
            while (i2 < tp4Var.h) {
                int iD = tp4Var.d(i2);
                bkVar.B(i, (iD >> 31) ^ (iD + iD));
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < tp4Var.h; i4++) {
            int iD2 = tp4Var.d(i4);
            iF2 += bk.F((iD2 >> 31) ^ (iD2 + iD2));
        }
        bkVar.C(iF2);
        while (i2 < tp4Var.h) {
            int iD3 = tp4Var.d(i2);
            bkVar.C((iD3 >> 31) ^ (iD3 + iD3));
            i2++;
        }
    }

    public static void b(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                bkVar.D((jLongValue >> 63) ^ (jLongValue + jLongValue), i);
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int iG = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iG += bk.G((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        bkVar.C(iG);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            bkVar.E((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void c(int i, List list, sk3 sk3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!(list instanceof tp4)) {
            if (!z) {
                while (i2 < list.size()) {
                    bkVar.B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bkVar.A(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += bk.F(((Integer) list.get(i3)).intValue());
            }
            bkVar.C(iF);
            while (i2 < list.size()) {
                bkVar.C(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tp4 tp4Var = (tp4) list;
        if (!z) {
            while (i2 < tp4Var.h) {
                bkVar.B(i, tp4Var.d(i2));
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < tp4Var.h; i4++) {
            iF2 += bk.F(tp4Var.d(i4));
        }
        bkVar.C(iF2);
        while (i2 < tp4Var.h) {
            bkVar.C(tp4Var.d(i2));
            i2++;
        }
    }

    public static void d(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bkVar.D(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int iG = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG += bk.G(((Long) list.get(i3)).longValue());
        }
        bkVar.C(iG);
        while (i2 < list.size()) {
            bkVar.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tp4)) {
            int iG = 0;
            while (i < size) {
                iG += bk.G(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        tp4 tp4Var = (tp4) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += bk.G(tp4Var.d(i));
            i++;
        }
        return iG2;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (bk.F(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (bk.F(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tp4)) {
            int iG = 0;
            while (i < size) {
                iG += bk.G(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        tp4 tp4Var = (tp4) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += bk.G(tp4Var.d(i));
            i++;
        }
        return iG2;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG = 0;
        for (int i = 0; i < size; i++) {
            iG += bk.G(((Long) list.get(i)).longValue());
        }
        return iG;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tp4)) {
            int iF = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iF += bk.F((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iF;
        }
        tp4 tp4Var = (tp4) list;
        int iF2 = 0;
        while (i < size) {
            int iD = tp4Var.d(i);
            iF2 += bk.F((iD >> 31) ^ (iD + iD));
            i++;
        }
        return iF2;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iG += bk.G((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iG;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tp4)) {
            int iF = 0;
            while (i < size) {
                iF += bk.F(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        tp4 tp4Var = (tp4) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += bk.F(tp4Var.d(i));
            i++;
        }
        return iF2;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG = 0;
        for (int i = 0; i < size; i++) {
            iG += bk.G(((Long) list.get(i)).longValue());
        }
        return iG;
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
    public static void o(Object obj, Object obj2) {
        sp4 sp4Var = (sp4) obj;
        mq4 mq4Var = sp4Var.zzc;
        mq4 mq4Var2 = ((sp4) obj2).zzc;
        mq4 mq4Var3 = mq4.f;
        if (!mq4Var3.equals(mq4Var2)) {
            if (mq4Var3.equals(mq4Var)) {
                int i = mq4Var.a + mq4Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(mq4Var.b, i);
                System.arraycopy(mq4Var2.b, 0, iArrCopyOf, mq4Var.a, mq4Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(mq4Var.c, i);
                System.arraycopy(mq4Var2.c, 0, objArrCopyOf, mq4Var.a, mq4Var2.a);
                mq4Var = new mq4(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                mq4Var.getClass();
                if (!mq4Var2.equals(mq4Var3)) {
                    if (!mq4Var.e) {
                        m51.e();
                        return;
                    }
                    int i2 = mq4Var.a + mq4Var2.a;
                    mq4Var.e(i2);
                    System.arraycopy(mq4Var2.b, 0, mq4Var.b, mq4Var.a, mq4Var2.a);
                    System.arraycopy(mq4Var2.c, 0, mq4Var.c, mq4Var.a, mq4Var2.a);
                    mq4Var.a = i2;
                }
            }
        }
        sp4Var.zzc = mq4Var;
    }

    public static void p(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                bkVar.C(i << 3);
                bkVar.s(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        bkVar.C(i3);
        while (i2 < list.size()) {
            bkVar.s(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void q(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bkVar.w(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()), i);
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        bkVar.C(i3);
        while (i2 < list.size()) {
            bkVar.x(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!(list instanceof tp4)) {
            if (!z) {
                while (i2 < list.size()) {
                    bkVar.y(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bkVar.A(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += bk.G(((Integer) list.get(i3)).intValue());
            }
            bkVar.C(iG);
            while (i2 < list.size()) {
                bkVar.z(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tp4 tp4Var = (tp4) list;
        if (!z) {
            while (i2 < tp4Var.h) {
                bkVar.y(i, tp4Var.d(i2));
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < tp4Var.h; i4++) {
            iG2 += bk.G(tp4Var.d(i4));
        }
        bkVar.C(iG2);
        while (i2 < tp4Var.h) {
            bkVar.z(tp4Var.d(i2));
            i2++;
        }
    }

    public static void s(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!(list instanceof tp4)) {
            if (!z) {
                while (i2 < list.size()) {
                    bkVar.u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bkVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            bkVar.C(i3);
            while (i2 < list.size()) {
                bkVar.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tp4 tp4Var = (tp4) list;
        if (!z) {
            while (i2 < tp4Var.h) {
                bkVar.u(i, tp4Var.d(i2));
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tp4Var.h; i6++) {
            tp4Var.d(i6);
            i5 += 4;
        }
        bkVar.C(i5);
        while (i2 < tp4Var.h) {
            bkVar.v(tp4Var.d(i2));
            i2++;
        }
    }

    public static void t(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bkVar.w(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        bkVar.C(i3);
        while (i2 < list.size()) {
            bkVar.x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bkVar.u(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        bkVar.C(i3);
        while (i2 < list.size()) {
            bkVar.v(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!(list instanceof tp4)) {
            if (!z) {
                while (i2 < list.size()) {
                    bkVar.y(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bkVar.A(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += bk.G(((Integer) list.get(i3)).intValue());
            }
            bkVar.C(iG);
            while (i2 < list.size()) {
                bkVar.z(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tp4 tp4Var = (tp4) list;
        if (!z) {
            while (i2 < tp4Var.h) {
                bkVar.y(i, tp4Var.d(i2));
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < tp4Var.h; i4++) {
            iG2 += bk.G(tp4Var.d(i4));
        }
        bkVar.C(iG2);
        while (i2 < tp4Var.h) {
            bkVar.z(tp4Var.d(i2));
            i2++;
        }
    }

    public static void w(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bkVar.D(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int iG = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG += bk.G(((Long) list.get(i3)).longValue());
        }
        bkVar.C(iG);
        while (i2 < list.size()) {
            bkVar.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!(list instanceof tp4)) {
            if (!z) {
                while (i2 < list.size()) {
                    bkVar.u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bkVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            bkVar.C(i3);
            while (i2 < list.size()) {
                bkVar.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tp4 tp4Var = (tp4) list;
        if (!z) {
            while (i2 < tp4Var.h) {
                bkVar.u(i, tp4Var.d(i2));
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tp4Var.h; i6++) {
            tp4Var.d(i6);
            i5 += 4;
        }
        bkVar.C(i5);
        while (i2 < tp4Var.h) {
            bkVar.v(tp4Var.d(i2));
            i2++;
        }
    }

    public static void y(int i, List list, sk3 sk3Var, boolean z) throws ee0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        bk bkVar = (bk) sk3Var.d;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                bkVar.w(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        bkVar.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        bkVar.C(i3);
        while (i2 < list.size()) {
            bkVar.x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
