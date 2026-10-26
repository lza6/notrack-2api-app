package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class jc4 {
    public final sl a;
    public final sl b;
    public final sl c;

    public jc4(sl slVar, sl slVar2, sl slVar3) {
        this.a = slVar;
        this.b = slVar2;
        this.c = slVar3;
    }

    public abstract kc4 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        sl slVar = this.c;
        Class cls2 = (Class) slVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        slVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        sl slVar = this.a;
        Method method = (Method) slVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, jc4.class.getClassLoader()).getDeclaredMethod("read", jc4.class);
        slVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        sl slVar = this.b;
        Method method = (Method) slVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, jc4.class);
        slVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((kc4) this).e.readParcelable(kc4.class.getClassLoader());
    }

    public final lc4 g() {
        String string = ((kc4) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (lc4) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(lc4 lc4Var) {
        if (lc4Var == null) {
            ((kc4) this).e.writeString(null);
            return;
        }
        try {
            ((kc4) this).e.writeString(b(lc4Var.getClass()).getName());
            kc4 kc4VarA = a();
            try {
                d(lc4Var.getClass()).invoke(null, lc4Var, kc4VarA);
                Parcel parcel = kc4VarA.e;
                int i = kc4VarA.i;
                if (i >= 0) {
                    int i2 = kc4VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(lc4Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
