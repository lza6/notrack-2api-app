package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e74 extends c74 {
    public final Method A;
    public final Method B;
    public final Method C;
    public final Class w;
    public final Constructor x;
    public final Method y;
    public final Method z;

    public e74() throws NoSuchMethodException {
        Method methodZ;
        Constructor<?> constructor;
        Method methodY;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodY = Y(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodZ = Z(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodZ = null;
            constructor = null;
            methodY = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.w = cls;
        this.x = constructor;
        this.y = methodY;
        this.z = method;
        this.A = method2;
        this.B = method3;
        this.C = methodZ;
    }

    public static Method Y(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean V(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.y.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface W(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.w, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.C.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean X(Object obj) {
        try {
            return ((Boolean) this.A.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method Z(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.c74, defpackage.gm4
    public final Typeface p(Context context, ac1 ac1Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.y;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.p(context, ac1Var, resources, i);
        }
        try {
            objNewInstance = this.x.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            bc1[] bc1VarArr = ac1Var.a;
            int length = bc1VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                bc1 bc1Var = bc1VarArr[i2];
                String str = bc1Var.a;
                int i3 = bc1Var.e;
                int i4 = bc1Var.b;
                boolean z = bc1Var.c;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(bc1Var.d);
                e74 e74Var = this;
                Context context2 = context;
                if (e74Var.V(context2, objNewInstance, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    i2++;
                    this = e74Var;
                    context = context2;
                } else {
                    try {
                        e74Var.B.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            e74 e74Var2 = this;
            if (e74Var2.X(objNewInstance)) {
                return e74Var2.W(objNewInstance);
            }
        }
        return null;
    }

    @Override // defpackage.c74, defpackage.gm4
    public final Typeface q(Context context, lc1[] lc1VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceW;
        boolean zBooleanValue;
        if (lc1VarArr.length >= 1) {
            Method method = this.y;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (lc1 lc1Var : lc1VarArr) {
                        if (lc1Var.e == 0) {
                            Uri uri = lc1Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, yo4.K(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.x.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = lc1VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.B;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!X(objNewInstance) || (typefaceW = W(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceW, i);
                            }
                            lc1 lc1Var2 = lc1VarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(lc1Var2.a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.z.invoke(objNewInstance, byteBuffer, Integer.valueOf(lc1Var2.b), null, Integer.valueOf(lc1Var2.c), Integer.valueOf(lc1Var2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    lc1 lc1VarW = gm4.w(lc1VarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(lc1VarW.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(lc1VarW.c).setItalic(lc1VarW.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.gm4
    public final Typeface s(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.y;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.s(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.x.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!V(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.B.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (X(objNewInstance)) {
                return W(objNewInstance);
            }
        }
        return null;
    }
}
