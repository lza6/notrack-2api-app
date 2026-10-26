package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c74 extends gm4 {
    public static Class r;
    public static Constructor s;
    public static Method t;
    public static Method u;
    public static boolean v;

    public static boolean T(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        U();
        try {
            return ((Boolean) t.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            m51.n(e);
            return false;
        }
    }

    public static void U() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (v) {
            return;
        }
        v = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        s = constructor;
        r = cls;
        t = method2;
        u = method;
    }

    @Override // defpackage.gm4
    public Typeface p(Context context, ac1 ac1Var, Resources resources, int i) throws NoSuchMethodException {
        U();
        try {
            Object objNewInstance = s.newInstance(null);
            for (bc1 bc1Var : ac1Var.a) {
                File fileA = yo4.A(context);
                if (fileA == null) {
                    return null;
                }
                try {
                    if (!yo4.o(fileA, resources, bc1Var.f)) {
                        return null;
                    }
                    if (!T(objNewInstance, fileA.getPath(), bc1Var.b, bc1Var.c)) {
                        return null;
                    }
                    fileA.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileA.delete();
                }
            }
            U();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) r, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) u.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                m51.n(e);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            m51.n(e2);
            return null;
        }
    }

    @Override // defpackage.gm4
    public Typeface q(Context context, lc1[] lc1VarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (lc1VarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(gm4.w(lc1VarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileA = yo4.A(context);
                        if (fileA == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (yo4.p(fileA, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
                                    fileA.delete();
                                } else {
                                    fileA.delete();
                                    typefaceCreateFromFile = null;
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th3) {
                                fileA.delete();
                                throw th3;
                            }
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
