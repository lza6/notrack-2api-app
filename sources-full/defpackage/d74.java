package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d74 extends gm4 {
    public static final Class r;
    public static final Constructor s;
    public static final Method t;
    public static final Method u;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        s = constructor;
        r = cls;
        t = method2;
        u = method;
    }

    public static boolean T(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) t.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface U(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) r, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) u.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.gm4
    public final Typeface p(Context context, ac1 ac1Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = s.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (bc1 bc1Var : ac1Var.a) {
                int i2 = bc1Var.f;
                File fileA = yo4.A(context);
                if (fileA != null) {
                    try {
                        if (yo4.o(fileA, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileA);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileA.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileA.delete();
                        }
                        if (map != null && T(objNewInstance, map, bc1Var.e, bc1Var.b, bc1Var.c)) {
                        }
                    } catch (Throwable th3) {
                        fileA.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return U(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.gm4
    public final Typeface q(Context context, lc1[] lc1VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = s.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            ph3 ph3Var = new ph3(0);
            for (lc1 lc1Var : lc1VarArr) {
                Uri uri = lc1Var.a;
                ByteBuffer byteBufferK = (ByteBuffer) ph3Var.get(uri);
                if (byteBufferK == null) {
                    byteBufferK = yo4.K(context, uri);
                    ph3Var.put(uri, byteBufferK);
                }
                if (byteBufferK != null && T(objNewInstance, byteBufferK, lc1Var.b, lc1Var.c, lc1Var.d)) {
                }
            }
            Typeface typefaceU = U(objNewInstance);
            if (typefaceU != null) {
                return Typeface.create(typefaceU, i);
            }
        }
        return null;
    }
}
