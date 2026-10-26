package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import app.template.extension.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class iy2 implements uy2, f93, i61, ql4 {
    public static iy2 m;
    public final /* synthetic */ int c;
    public final Object d;
    public Object h;
    public Object l;

    public iy2() {
        this.c = 9;
        this.d = new AtomicReference(kr1.k);
        this.h = new Object();
    }

    public iy2(int i) {
        this.c = 10;
        this.d = i != 1 ? new t82(i) : null;
    }

    public iy2(Context context, TypedArray typedArray) {
        this.c = 11;
        this.d = context;
        this.h = typedArray;
    }

    public iy2(Context context, LocationManager locationManager) {
        this.c = 15;
        this.l = new v64();
        this.d = context;
        this.h = locationManager;
    }

    public iy2(fo4 fo4Var, wb1 wb1Var, hm0 hm0Var) {
        this.c = 19;
        this.d = wb1Var;
        this.h = hm0Var;
        this.l = fo4Var;
    }

    public /* synthetic */ iy2(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    public iy2(String str) {
        this.c = 18;
        fp1 fp1Var = new fp1();
        this.h = fp1Var;
        this.l = fp1Var;
        this.d = str;
    }

    public iy2(ArrayList arrayList) {
        this.c = 5;
        this.d = arrayList;
        this.h = new ArrayList(arrayList.size());
        this.l = new HashSet(3);
    }

    public iy2(ConcurrentMap concurrentMap, hz2 hz2Var, uf2 uf2Var, Class cls) {
        this.c = 2;
        this.d = concurrentMap;
        this.h = hz2Var;
        this.l = uf2Var;
    }

    public iy2(k74 k74Var, iy2 iy2Var) {
        this.c = 16;
        this.d = k74Var;
        this.h = iy2Var;
        this.l = k74Var.c;
    }

    public iy2(md4 md4Var, kd4 kd4Var, qq4 qq4Var) {
        this.c = 17;
        md4Var.getClass();
        kd4Var.getClass();
        qq4Var.getClass();
        this.d = md4Var;
        this.h = kd4Var;
        this.l = qq4Var;
    }

    public iy2(r32 r32Var) {
        this.c = 8;
        this.d = new p32(r32Var);
        this.h = new Handler();
    }

    public iy2(vo voVar, j31 j31Var, sb3 sb3Var, g64 g64Var) {
        this.c = 13;
        this.d = voVar;
        this.h = j31Var;
        this.l = g64Var;
    }

    public iy2(byte[] bArr) throws GeneralSecurityException {
        this.c = 1;
        ya4.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.d = secretKeySpec;
        if (!ud2.a(1)) {
            m51.v("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) r31.b.a.a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrW = gb2.w(cipher.doFinal(new byte[16]));
        this.h = bArrW;
        this.l = gb2.w(bArrW);
    }

    public static iy2 l(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new iy2(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    @Override // defpackage.uy2
    public byte[] a(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrN;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!ud2.a(1)) {
            m51.v("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) r31.b.a.a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.d);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrN = xp1.M((iMax - 1) * 16, 0, 16, bArr, (byte[]) this.h);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                u41.k("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = ByteCompanionObject.MIN_VALUE;
            bArrN = xp1.N(bArrCopyOf, (byte[]) this.l);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(xp1.M(0, i2 * 16, 16, bArrDoFinal, bArr));
        }
        return Arrays.copyOf(cipher.doFinal(xp1.N(bArrN, bArrDoFinal)), i);
    }

    public void b(f0 f0Var) {
        HashSet hashSet = (HashSet) this.l;
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.contains(f0Var)) {
            return;
        }
        if (hashSet.contains(f0Var)) {
            m51.A(hashSet, "Cyclic dependency chain found: ");
            return;
        }
        hashSet.add(f0Var);
        f0Var.e(this);
        hashSet.remove(f0Var);
        if (arrayList.contains(f0Var)) {
            return;
        }
        if (ba2.class.isAssignableFrom(f0Var.getClass())) {
            arrayList.add(0, f0Var);
        } else {
            arrayList.add(f0Var);
        }
    }

    public void c(kd0 kd0Var, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.d;
        l13 l13Var = new l13(byteArrayOutputStream, map, (HashMap) this.h, (an2) this.l);
        an2 an2Var = (an2) map.get(kd0.class);
        if (an2Var != null) {
            an2Var.a(kd0Var, l13Var);
        } else {
            throw new k31("No encoder for " + kd0.class);
        }
    }

    public ColorStateList d(int i) {
        int resourceId;
        ColorStateList colorStateListX;
        TypedArray typedArray = (TypedArray) this.h;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListX = y64.x((Context) this.d, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListX;
    }

    public Drawable e(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.h;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : y64.y((Context) this.d, resourceId);
    }

    @Override // defpackage.ql4
    public Object f() {
        return new np4((ts4) ((ql4) this.d).f(), (um4) ((ql4) this.h).f(), ((tu) ((sk3) this.l).d).a);
    }

    public Drawable g(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.h).hasValue(i) || (resourceId = ((TypedArray) this.h).getResourceId(i, 0)) == 0) {
            return null;
        }
        bj bjVarA = bj.a();
        Context context = (Context) this.d;
        synchronized (bjVarA) {
            drawableE = bjVarA.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    @Override // defpackage.t13
    public Object get() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 7:
                return new ci4((Context) ((t13) obj).get(), (o83) ((t13) this.h).get(), (to) ((rn0) this.l).get(), 24);
            case 8:
            default:
                return new g64(new sb3(11), new zf3(9), (kt0) ((vu) obj).get(), (ca4) ((s44) this.h).get(), (ir3) ((ir3) this.l).get());
            case 9:
                long jA = py.A();
                if (jA == n04.a) {
                    return this.l;
                }
                j04 j04Var = (j04) ((AtomicReference) obj).get();
                int iA = j04Var.a(jA);
                if (iA >= 0) {
                    return j04Var.c[iA];
                }
                return null;
        }
    }

    public Typeface h(int i, int i2, bk bkVar) {
        int resourceId = ((TypedArray) this.h).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.l) == null) {
            this.l = new TypedValue();
        }
        Context context = (Context) this.d;
        TypedValue typedValue = (TypedValue) this.l;
        ThreadLocal threadLocal = b63.a;
        if (context.isRestricted()) {
            return null;
        }
        return b63.a(context, resourceId, typedValue, i2, bkVar, true);
    }

    public List i(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.d).get(new iz2(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public gd4 j(vc0 vc0Var, String str) {
        gd4 gd4VarA;
        kd4 kd4Var = (kd4) this.h;
        md4 md4Var = (md4) this.d;
        md4Var.getClass();
        LinkedHashMap linkedHashMap = md4Var.a;
        gd4 gd4Var = (gd4) linkedHashMap.get(str);
        if (vc0Var.b(gd4Var)) {
            if (kd4Var instanceof v93) {
                v93 v93Var = (v93) kd4Var;
                gd4Var.getClass();
                h32 h32Var = v93Var.d;
                if (h32Var != null) {
                    t93 t93Var = v93Var.e;
                    t93Var.getClass();
                    g13.m(gd4Var, t93Var, h32Var);
                }
            }
            gd4Var.getClass();
            return gd4Var;
        }
        zg2 zg2Var = new zg2((qq4) this.l);
        ((LinkedHashMap) zg2Var.a).put(t73.D, str);
        kd4Var.getClass();
        try {
            try {
                gd4VarA = kd4Var.c(vc0Var, zg2Var);
            } catch (AbstractMethodError unused) {
                gd4VarA = kd4Var.b(xp1.p(vc0Var), zg2Var);
            }
        } catch (AbstractMethodError unused2) {
            gd4VarA = kd4Var.a(xp1.p(vc0Var));
        }
        gd4VarA.getClass();
        gd4 gd4Var2 = (gd4) linkedHashMap.put(str, gd4VarA);
        if (gd4Var2 != null) {
            gd4Var2.b();
        }
        return gd4VarA;
    }

    public boolean k() {
        if (((gn3) this.d).getValue() != this.l) {
            return true;
        }
        iy2 iy2Var = (iy2) this.h;
        return iy2Var != null && iy2Var.k();
    }

    public void m(f32 f32Var) {
        fg3 fg3Var = (fg3) this.l;
        if (fg3Var != null) {
            fg3Var.run();
        }
        fg3 fg3Var2 = new fg3((p32) this.d, f32Var);
        this.l = fg3Var2;
        ((Handler) this.h).postAtFrontOfQueue(fg3Var2);
    }

    public void n() {
        ((TypedArray) this.h).recycle();
    }

    public void o(lo loVar) {
        j93 j93Var = new j93(6);
        g64 g64Var = (g64) this.l;
        vo voVar = (vo) this.d;
        j31 j31Var = (j31) this.h;
        kt0 kt0Var = g64Var.c;
        ci4 ci4VarA = vo.a();
        ci4VarA.I(voVar.a);
        ci4VarA.l = lz2.c;
        ci4VarA.h = voVar.b;
        vo voVarO = ci4VarA.o();
        f13 f13Var = new f13();
        f13Var.e = new HashMap();
        f13Var.c = Long.valueOf(g64Var.a.a());
        f13Var.d = Long.valueOf(g64Var.b.a());
        f13Var.a = "PLAY_BILLING_LIBRARY";
        f13Var.b = new g31(j31Var, loVar.a.b());
        f13Var.f = null;
        kt0Var.b.execute(new p00(kt0Var, voVarO, j93Var, f13Var.c()));
    }

    public void p(Object obj) {
        long jA = py.A();
        if (jA == n04.a) {
            this.l = obj;
            return;
        }
        synchronized (this.h) {
            j04 j04Var = (j04) ((AtomicReference) this.d).get();
            int iA = j04Var.a(jA);
            if (iA < 0) {
                ((AtomicReference) this.d).set(j04Var.b(obj, jA));
            } else {
                j04Var.c[iA] = obj;
            }
        }
    }

    public void q() {
        fi2 fi2Var = (fi2) this.d;
        String str = (String) this.h;
        List list = (List) fi2Var.j(str);
        if (list != null) {
            list.remove((je1) this.l);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        fi2Var.l(str, list);
    }

    public void r(Throwable th) {
        boolean z = th instanceof TimeoutException;
        fo4 fo4Var = (fo4) this.l;
        if (z) {
            fo4Var.E(102, 28, jo4.q);
            tm4.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            fo4Var.E(95, 28, jo4.q);
            tm4.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((hm0) this.h).run();
    }

    public String toString() {
        switch (this.c) {
            case 18:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.d);
                sb.append('{');
                fp1 fp1Var = (fp1) ((fp1) this.h).d;
                String str = BuildConfig.VERSION_NAME;
                while (fp1Var != null) {
                    Object obj = fp1Var.c;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    fp1Var = (fp1) fp1Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
