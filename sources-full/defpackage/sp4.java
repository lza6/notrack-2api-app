package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class sp4 extends ep4 {
    private static final Map zzb = new ConcurrentHashMap();
    protected mq4 zzc;
    private int zzd;

    public sp4() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = mq4.f;
    }

    public static void f(Class cls, sp4 sp4Var) {
        sp4Var.e();
        zzb.put(cls, sp4Var);
    }

    public static final boolean i(sp4 sp4Var, boolean z) {
        byte bByteValue = ((Byte) sp4Var.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = fq4.b.a(sp4Var.getClass()).g(sp4Var);
        if (z) {
            sp4Var.j(2);
        }
        return zG;
    }

    public static sp4 m(Class cls) {
        Map map = zzb;
        sp4 sp4Var = (sp4) map.get(cls);
        if (sp4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sp4Var = (sp4) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (sp4Var != null) {
            return sp4Var;
        }
        sp4 sp4Var2 = (sp4) ((sp4) rq4.c(cls)).j(6);
        if (sp4Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, sp4Var2);
        return sp4Var2;
    }

    public static Object o(Method method, sp4 sp4Var, Object... objArr) {
        try {
            return method.invoke(sp4Var, objArr);
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

    @Override // defpackage.ep4
    public final void a(bk bkVar) {
        jq4 jq4VarA = fq4.b.a(getClass());
        sk3 sk3Var = (sk3) bkVar.d;
        if (sk3Var == null) {
            sk3Var = new sk3(bkVar);
        }
        jq4VarA.c(this, sk3Var);
    }

    @Override // defpackage.ep4
    public final int c(jq4 jq4Var) {
        if (h()) {
            int i = jq4Var.i(this);
            if (i >= 0) {
                return i;
            }
            u41.r(ud2.m(i, "serialized size must be non-negative, was "));
            return 0;
        }
        int i2 = this.zzd & IntCompanionObject.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = jq4Var.i(this);
        if (i3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i3;
            return i3;
        }
        u41.r(ud2.m(i3, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // defpackage.ep4
    public final int d() {
        if (h()) {
            int i = fq4.b.a(getClass()).i(this);
            if (i >= 0) {
                return i;
            }
            u41.r(ud2.m(i, "serialized size must be non-negative, was "));
            return 0;
        }
        int i2 = this.zzd & IntCompanionObject.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = fq4.b.a(getClass()).i(this);
        if (i3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i3;
            return i3;
        }
        u41.r(ud2.m(i3, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void e() {
        this.zzd &= IntCompanionObject.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return fq4.b.a(getClass()).b(this, (sp4) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | IntCompanionObject.MAX_VALUE;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return fq4.b.a(getClass()).h(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iH = fq4.b.a(getClass()).h(this);
        this.zza = iH;
        return iH;
    }

    public abstract Object j(int i);

    public final rp4 k() {
        return (rp4) j(5);
    }

    public final rp4 l() {
        rp4 rp4Var = (rp4) j(5);
        sp4 sp4Var = rp4Var.c;
        if (!sp4Var.getClass().isInstance(this)) {
            u41.k("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        if (!sp4Var.equals(this)) {
            if (!rp4Var.d.h()) {
                sp4 sp4VarN = rp4Var.c.n();
                fq4.b.a(sp4VarN.getClass()).d(sp4VarN, rp4Var.d);
                rp4Var.d = sp4VarN;
            }
            sp4 sp4Var2 = rp4Var.d;
            fq4.b.a(sp4Var2.getClass()).d(sp4Var2, this);
        }
        return rp4Var;
    }

    public final sp4 n() {
        return (sp4) j(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = cq4.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        cq4.c(this, sb, 0);
        return sb.toString();
    }
}
