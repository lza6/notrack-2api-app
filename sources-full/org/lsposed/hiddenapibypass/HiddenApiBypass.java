package org.lsposed.hiddenapibypass;

import android.util.Log;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.streams.jdk8.StreamsKt$$ExternalSyntheticApiModelOutline0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class HiddenApiBypass {
    private static final Unsafe a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final Set n = new HashSet();

    static {
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            a = unsafe;
            b = unsafe.objectFieldOffset(Helper$Executable.class.getDeclaredField("artMethod"));
            c = unsafe.objectFieldOffset(Helper$Executable.class.getDeclaredField("declaringClass"));
            long jObjectFieldOffset = unsafe.objectFieldOffset(Helper$MethodHandle.class.getDeclaredField("artFieldOrMethod"));
            d = jObjectFieldOffset;
            e = unsafe.objectFieldOffset(Helper$MethodHandleImpl.class.getDeclaredField("info"));
            long jObjectFieldOffset2 = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("methods"));
            f = jObjectFieldOffset2;
            long jObjectFieldOffset3 = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("iFields"));
            g = jObjectFieldOffset3;
            h = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("sFields"));
            i = unsafe.objectFieldOffset(Helper$HandleInfo.class.getDeclaredField("member"));
            Method declaredMethod = Helper$NeverCall.class.getDeclaredMethod("a", null);
            Method declaredMethod2 = Helper$NeverCall.class.getDeclaredMethod("b", null);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j2 = unsafe.getLong(methodHandleUnreflect, jObjectFieldOffset);
            long j3 = unsafe.getLong(methodHandleUnreflect2, jObjectFieldOffset);
            long j4 = unsafe.getLong(Helper$NeverCall.class, jObjectFieldOffset2);
            long j5 = j3 - j2;
            j = j5;
            k = (j2 - j4) - j5;
            Field declaredField = Helper$NeverCall.class.getDeclaredField("i");
            Field declaredField2 = Helper$NeverCall.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j6 = unsafe.getLong(methodHandleUnreflectGetter, jObjectFieldOffset);
            long j7 = unsafe.getLong(methodHandleUnreflectGetter2, jObjectFieldOffset);
            long j8 = unsafe.getLong(Helper$NeverCall.class, jObjectFieldOffset3);
            l = j7 - j6;
            m = j6 - j8;
        } catch (ReflectiveOperationException e2) {
            Log.e("HiddenApiBypass", "Initialize error", e2);
            throw new ExceptionInInitializerError(e2);
        }
    }

    static boolean a(Class[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!clsArr[i2].isPrimitive()) {
                Object obj = objArr[i2];
                if (obj != null && !clsArr[i2].isInstance(obj)) {
                    return false;
                }
            } else {
                if (clsArr[i2] == Integer.TYPE && !(objArr[i2] instanceof Integer)) {
                    return false;
                }
                if (clsArr[i2] == Byte.TYPE && !(objArr[i2] instanceof Byte)) {
                    return false;
                }
                if (clsArr[i2] == Character.TYPE && !(objArr[i2] instanceof Character)) {
                    return false;
                }
                if (clsArr[i2] == Boolean.TYPE && !(objArr[i2] instanceof Boolean)) {
                    return false;
                }
                if (clsArr[i2] == Double.TYPE && !(objArr[i2] instanceof Double)) {
                    return false;
                }
                if (clsArr[i2] == Float.TYPE && !(objArr[i2] instanceof Float)) {
                    return false;
                }
                if (clsArr[i2] == Long.TYPE && !(objArr[i2] instanceof Long)) {
                    return false;
                }
                if (clsArr[i2] == Short.TYPE && !(objArr[i2] instanceof Short)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean addHiddenApiExemptions(String... strArr) {
        Set set = n;
        set.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[((HashSet) set).size()];
        set.toArray(strArr2);
        return setHiddenApiExemptions(strArr2);
    }

    public static boolean clearHiddenApiExemptions() {
        ((HashSet) n).clear();
        return setHiddenApiExemptions(new String[0]);
    }

    public static Constructor getDeclaredConstructor(Class cls, Class... clsArr) throws NoSuchMethodException {
        Iterator it = getDeclaredMethods(cls).iterator();
        while (it.hasNext()) {
            Executable executableM1584m = StreamsKt$$ExternalSyntheticApiModelOutline0.m1584m(it.next());
            if (executableM1584m instanceof Constructor) {
                Class[] parameterTypes = executableM1584m.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i2 = 0; i2 < clsArr.length; i2++) {
                        if (clsArr[i2] == parameterTypes[i2]) {
                        }
                    }
                    return (Constructor) executableM1584m;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static Method getDeclaredMethod(Class cls, String str, Class... clsArr) throws NoSuchMethodException {
        Iterator it = getDeclaredMethods(cls).iterator();
        while (it.hasNext()) {
            Executable executableM1584m = StreamsKt$$ExternalSyntheticApiModelOutline0.m1584m(it.next());
            if (executableM1584m.getName().equals(str) && (executableM1584m instanceof Method)) {
                Class[] parameterTypes = executableM1584m.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i2 = 0; i2 < clsArr.length; i2++) {
                        if (clsArr[i2] == parameterTypes[i2]) {
                        }
                    }
                    return (Method) executableM1584m;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static List getDeclaredMethods(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Method declaredMethod = Helper$NeverCall.class.getDeclaredMethod("a", null);
                declaredMethod.setAccessible(true);
                MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
                Unsafe unsafe = a;
                long j2 = unsafe.getLong(cls, f);
                if (j2 != 0) {
                    int i2 = unsafe.getInt(j2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        long j3 = k + (((long) i3) * j) + j2;
                        Unsafe unsafe2 = a;
                        unsafe2.putLong(methodHandleUnreflect, d, j3);
                        unsafe2.putObject(methodHandleUnreflect, e, (Object) null);
                        try {
                            MethodHandles.lookup().revealDirect(methodHandleUnreflect);
                        } catch (Throwable unused) {
                        }
                        Unsafe unsafe3 = a;
                        arrayList.add(StreamsKt$$ExternalSyntheticApiModelOutline0.m1584m(unsafe3.getObject(StreamsKt$$ExternalSyntheticApiModelOutline0.m(unsafe3.getObject(methodHandleUnreflect, e)), i)));
                    }
                }
            } catch (IllegalAccessException | NoSuchMethodException unused2) {
            }
        }
        return arrayList;
    }

    public static List getInstanceFields(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Field declaredField = Helper$NeverCall.class.getDeclaredField("i");
                declaredField.setAccessible(true);
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = a;
                long j2 = unsafe.getLong(cls, g);
                if (j2 != 0) {
                    int i2 = unsafe.getInt(j2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        long j3 = (((long) i3) * l) + j2 + m;
                        Unsafe unsafe2 = a;
                        unsafe2.putLong(methodHandleUnreflectGetter, d, j3);
                        unsafe2.putObject(methodHandleUnreflectGetter, e, (Object) null);
                        try {
                            MethodHandles.lookup().revealDirect(methodHandleUnreflectGetter);
                        } catch (Throwable unused) {
                        }
                        Unsafe unsafe3 = a;
                        arrayList.add((Field) unsafe3.getObject(StreamsKt$$ExternalSyntheticApiModelOutline0.m(unsafe3.getObject(methodHandleUnreflectGetter, e)), i));
                    }
                }
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
            }
        }
        return arrayList;
    }

    public static List getStaticFields(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Field declaredField = Helper$NeverCall.class.getDeclaredField("s");
                declaredField.setAccessible(true);
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = a;
                long j2 = unsafe.getLong(cls, h);
                if (j2 != 0) {
                    int i2 = unsafe.getInt(j2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        long j3 = (((long) i3) * l) + j2 + m;
                        Unsafe unsafe2 = a;
                        unsafe2.putLong(methodHandleUnreflectGetter, d, j3);
                        unsafe2.putObject(methodHandleUnreflectGetter, e, (Object) null);
                        try {
                            MethodHandles.lookup().revealDirect(methodHandleUnreflectGetter);
                        } catch (Throwable unused) {
                        }
                        Unsafe unsafe3 = a;
                        arrayList.add((Field) unsafe3.getObject(StreamsKt$$ExternalSyntheticApiModelOutline0.m(unsafe3.getObject(methodHandleUnreflectGetter, e)), i));
                    }
                }
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
            }
        }
        return arrayList;
    }

    public static Object invoke(Class cls, Object obj, String str, Object... objArr) throws NoSuchMethodException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = Helper$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        Unsafe unsafe = a;
        long j2 = unsafe.getLong(cls, f);
        if (j2 == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int i2 = unsafe.getInt(j2);
        for (int i3 = 0; i3 < i2; i3++) {
            a.putLong(declaredMethod, b, k + (((long) i3) * j) + j2);
            if (str.equals(declaredMethod.getName()) && a(declaredMethod.getParameterTypes(), objArr)) {
                return declaredMethod.invoke(obj, objArr);
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static Object newInstance(Class cls, Object... objArr) throws NoSuchMethodException {
        Constructor constructor;
        int i2 = 0;
        Method declaredMethod = Helper$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        Constructor declaredConstructor = Helper$InvokeStub.class.getDeclaredConstructor(Object[].class);
        declaredConstructor.setAccessible(true);
        Unsafe unsafe = a;
        long j2 = unsafe.getLong(cls, f);
        if (j2 == 0) {
            throw new NoSuchMethodException("Cannot find matching constructor");
        }
        int i3 = unsafe.getInt(j2);
        while (i2 < i3) {
            long j3 = k + (((long) i2) * j) + j2;
            Unsafe unsafe2 = a;
            long j4 = b;
            unsafe2.putLong(declaredMethod, j4, j3);
            if ("<init>".equals(declaredMethod.getName())) {
                constructor = declaredConstructor;
                unsafe2.putLong(constructor, j4, j3);
                unsafe2.putObject(constructor, c, cls);
                if (a(constructor.getParameterTypes(), objArr)) {
                    return constructor.newInstance(objArr);
                }
            } else {
                constructor = declaredConstructor;
            }
            i2++;
            j2 = j2;
            declaredConstructor = constructor;
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static boolean setHiddenApiExemptions(String... strArr) {
        try {
            invoke(VMRuntime.class, invoke(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable th) {
            Log.w("HiddenApiBypass", "setHiddenApiExemptions", th);
            return false;
        }
    }
}
