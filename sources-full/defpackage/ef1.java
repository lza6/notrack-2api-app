package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ef1 extends g0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, ef1> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected y84 unknownFields;

    public ef1() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = y84.f;
    }

    public static void g(ef1 ef1Var) throws sr1 {
        if (!m(ef1Var, true)) {
            throw new sr1(new u84().getMessage());
        }
    }

    public static ef1 j(Class cls) {
        ef1 ef1Var = defaultInstanceMap.get(cls);
        if (ef1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ef1Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ef1Var != null) {
            return ef1Var;
        }
        ef1 ef1VarA = ((ef1) o94.b(cls)).a();
        if (ef1VarA == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, ef1VarA);
        return ef1VarA;
    }

    public static Object l(Method method, ef1 ef1Var, Object... objArr) {
        try {
            return method.invoke(ef1Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean m(ef1 ef1Var, boolean z) {
        byte bByteValue = ((Byte) ef1Var.i(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        j13 j13Var = j13.c;
        j13Var.getClass();
        boolean zF = j13Var.a(ef1Var.getClass()).f(ef1Var);
        if (z) {
            ef1Var.i(2);
        }
        return zF;
    }

    public static ef1 r(ef1 ef1Var, mz mzVar, b61 b61Var) throws sr1 {
        kz kzVar = (kz) mzVar;
        zd0 zd0VarI = be0.i(kzVar.l, kzVar.l(), kzVar.size(), true);
        ef1 ef1VarS = s(ef1Var, zd0VarI, b61Var);
        zd0VarI.b(0);
        g(ef1VarS);
        return ef1VarS;
    }

    public static ef1 s(ef1 ef1Var, be0 be0Var, b61 b61Var) throws sr1 {
        ef1 ef1VarQ = ef1Var.q();
        try {
            j13 j13Var = j13.c;
            j13Var.getClass();
            za3 za3VarA = j13Var.a(ef1VarQ.getClass());
            ce0 ce0Var = (ce0) be0Var.d;
            if (ce0Var == null) {
                ce0Var = new ce0(be0Var);
            }
            za3VarA.i(ef1VarQ, ce0Var, b61Var);
            za3VarA.d(ef1VarQ);
            return ef1VarQ;
        } catch (IOException e) {
            if (e.getCause() instanceof sr1) {
                throw ((sr1) e.getCause());
            }
            throw new sr1(e.getMessage(), e);
        } catch (u84 e2) {
            throw new sr1(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof sr1) {
                throw ((sr1) e3.getCause());
            }
            throw e3;
        } catch (sr1 e4) {
            if (e4.c) {
                throw new sr1(e4.getMessage(), e4);
            }
            throw e4;
        }
    }

    public static void t(Class cls, ef1 ef1Var) {
        ef1Var.o();
        defaultInstanceMap.put(cls, ef1Var);
    }

    @Override // defpackage.g0
    public final int b(za3 za3Var) {
        int iE;
        int iE2;
        if (n()) {
            if (za3Var == null) {
                j13 j13Var = j13.c;
                j13Var.getClass();
                iE2 = j13Var.a(getClass()).e(this);
            } else {
                iE2 = za3Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            u41.r(ud2.m(iE2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & IntCompanionObject.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & IntCompanionObject.MAX_VALUE;
        }
        if (za3Var == null) {
            j13 j13Var2 = j13.c;
            j13Var2.getClass();
            iE = j13Var2.a(getClass()).e(this);
        } else {
            iE = za3Var.e(this);
        }
        u(iE);
        return iE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j13 j13Var = j13.c;
        j13Var.getClass();
        return j13Var.a(getClass()).h(this, (ef1) obj);
    }

    @Override // defpackage.g0
    public final void f(de0 de0Var) {
        j13 j13Var = j13.c;
        j13Var.getClass();
        za3 za3VarA = j13Var.a(getClass());
        jb jbVar = de0Var.a;
        if (jbVar == null) {
            jbVar = new jb(de0Var);
        }
        za3VarA.a(this, jbVar);
    }

    public final cf1 h() {
        return (cf1) i(5);
    }

    public final int hashCode() {
        if (n()) {
            j13 j13Var = j13.c;
            j13Var.getClass();
            return j13Var.a(getClass()).b(this);
        }
        if (this.memoizedHashCode == 0) {
            j13 j13Var2 = j13.c;
            j13Var2.getClass();
            this.memoizedHashCode = j13Var2.a(getClass()).b(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(int i);

    @Override // defpackage.sd2
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ef1 a() {
        return (ef1) i(6);
    }

    public final boolean n() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= IntCompanionObject.MAX_VALUE;
    }

    @Override // defpackage.g0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final cf1 d() {
        return (cf1) i(5);
    }

    public final ef1 q() {
        return (ef1) i(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = td2.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        td2.c(this, sb, 0);
        return sb.toString();
    }

    public final void u(int i) {
        if (i < 0) {
            u41.r(ud2.m(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & IntCompanionObject.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final cf1 v() {
        cf1 cf1Var = (cf1) i(5);
        if (!cf1Var.c.equals(this)) {
            cf1Var.e();
            cf1.f(cf1Var.d, this);
        }
        return cf1Var;
    }
}
