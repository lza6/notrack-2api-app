package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import java.net.IDN;
import java.net.InetAddress;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public abstract class y64 {
    public static final d5 a = new d5("RESUME_TOKEN", 16);
    public static final int[] b = new int[2];
    public static final byte[] c = {48, 49, 53, 0};
    public static final byte[] d = {48, 49, 48, 0};
    public static final byte[] e = {48, 48, 57, 0};
    public static final byte[] f = {48, 48, 53, 0};
    public static final byte[] g = {48, 48, 49, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 50, 0};
    public static final nc j = new nc(1008);
    public static final nc k = new nc(1022);

    public static final Object A(jq2 jq2Var, f61 f61Var) {
        Object obj = jq2Var.j.a.get(f61Var);
        return obj == null ? f61Var.c : obj;
    }

    public static final Object B(ue3 ue3Var, ff3 ff3Var) {
        Object objG = ue3Var.c.g(ff3Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final long C(xy3 xy3Var, int i2, boolean z, boolean z2) {
        pg2 pg2Var = xy3Var.b;
        long j2 = xy3Var.c;
        int iD = pg2Var.d(i2);
        if (iD >= pg2Var.f) {
            return 9205357640488583168L;
        }
        boolean z3 = xy3Var.a(((!z || z2) && (z || !z2)) ? Math.max(i2 + (-1), 0) : i2) == xy3Var.h(i2);
        pg2Var.l(i2);
        int length = ((hg) pg2Var.a.c).d.length();
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(i2 == length ? kr1.H(arrayList) : vl0.E(i2, arrayList));
        dc dcVar = ss2Var.a;
        int iD2 = ss2Var.d(i2);
        vy3 vy3Var = dcVar.d;
        return (((long) Float.floatToRawIntBits(py.w(z3 ? vy3Var.h(iD2, false) : vy3Var.i(iD2, false), 0.0f, (int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(py.w(pg2Var.b(iD), 0.0f, (int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final int D(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static boolean E(int i2, Object obj) {
        int arity;
        if (obj instanceof se1) {
            if (obj instanceof ue1) {
                arity = ((ue1) obj).getArity();
            } else if (obj instanceof je1) {
                arity = 0;
            } else if (obj instanceof le1) {
                arity = 1;
            } else if (obj instanceof ne1) {
                arity = 2;
            } else if (obj instanceof oe1) {
                arity = 3;
            } else if (obj instanceof pe1) {
                arity = 4;
            } else {
                boolean z = obj instanceof wg0;
                if (z) {
                    arity = 5;
                } else if (obj instanceof qe1) {
                    arity = 6;
                } else if (obj instanceof re1) {
                    arity = 7;
                } else if (z) {
                    arity = 8;
                } else if (z) {
                    arity = 9;
                } else if (z) {
                    arity = 10;
                } else if (z) {
                    arity = 11;
                } else if (z) {
                    arity = 13;
                } else if (z) {
                    arity = 14;
                } else if (z) {
                    arity = 15;
                } else if (z) {
                    arity = 16;
                } else if (z) {
                    arity = 17;
                } else if (z) {
                    arity = 18;
                } else if (z) {
                    arity = 19;
                } else if (z) {
                    arity = 20;
                } else {
                    arity = z ? 21 : -1;
                }
            }
            if (arity == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean F(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long G(long j2, long j3, float f2) {
        float F = g13.F(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float F2 = g13.F(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f2);
        return (((long) Float.floatToRawIntBits(F)) << 32) | (((long) Float.floatToRawIntBits(F2)) & 4294967295L);
    }

    public static xp0 H(vp0 vp0Var, wp0 wp0Var) {
        wp0Var.getClass();
        return kr1.n(vp0Var.getKey(), wp0Var) ? x21.c : vp0Var;
    }

    public static xp0 I(vp0 vp0Var, xp0 xp0Var) {
        xp0Var.getClass();
        return xp0Var == x21.c ? vp0Var : (xp0) xp0Var.fold(vp0Var, new oj0(4));
    }

    public static final void J(iu0 iu0Var) {
        ux1 ux1VarM = M(iu0Var);
        if (ux1VarM.B) {
            return;
        }
        xx1.a(ux1VarM).requestAutofill(ux1VarM);
    }

    public static final wl2 K(iu0 iu0Var, int i2) {
        wl2 coordinator$ui_release = iu0Var.getNode().getCoordinator$ui_release();
        coordinator$ui_release.getClass();
        if (coordinator$ui_release.P0() != iu0Var || !xl2.h(i2)) {
            return coordinator$ui_release;
        }
        wl2 wl2Var = coordinator$ui_release.u;
        wl2Var.getClass();
        return wl2Var;
    }

    public static final wl2 L(iu0 iu0Var) {
        if (!iu0Var.getNode().isAttached()) {
            po1.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        wl2 wl2VarK = K(iu0Var, 2);
        if (!wl2VarK.z()) {
            po1.b("LayoutCoordinates is not attached.");
        }
        return wl2VarK;
    }

    public static final ux1 M(iu0 iu0Var) {
        wl2 coordinator$ui_release = iu0Var.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.t;
        }
        throw fq2.i("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final yr2 N(iu0 iu0Var) {
        yr2 yr2Var = M(iu0Var).v;
        if (yr2Var != null) {
            return yr2Var;
        }
        throw fq2.i("This node does not have an owner.");
    }

    public static final c O(c cVar, float f2) {
        return f2 == 0.0f ? cVar : a.b(cVar, 0.0f, 0.0f, f2, null, false, 130815);
    }

    public static final void P(zt3 zt3Var, int i2, int i3) {
        zt3Var.f(p23.d(py.x(i2, 0, zt3Var.d.length()), py.x(i3, 0, zt3Var.d.length())));
    }

    public static final int Q(ch2 ch2Var) {
        int iA;
        int i2 = ch2Var.b;
        int iA2 = ch2Var.a(0);
        while (ch2Var.b != 0 && ch2Var.a(0) == iA2) {
            ch2Var.f(0, ch2Var.b());
            ch2Var.e(ch2Var.b - 1);
            int i3 = ch2Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iA3 = ch2Var.a(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iA4 = ch2Var.a(i7);
                if (i6 < i3 && (iA = ch2Var.a(i6)) > iA4) {
                    if (iA <= iA3) {
                        break;
                    }
                    ch2Var.f(i5, iA);
                    ch2Var.f(i6, iA3);
                    i5 = i6;
                } else {
                    if (iA4 <= iA3) {
                        break;
                    }
                    ch2Var.f(i5, iA4);
                    ch2Var.f(i7, iA3);
                    i5 = i7;
                }
            }
        }
        return iA2;
    }

    public static void R(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        kr1.g0(classCastException, y64.class.getName());
        throw classCastException;
    }

    public static final ps2 S(Object obj, String str) {
        return new ps2(str, obj);
    }

    public static int T(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final String U(String str) {
        str.getClass();
        int i2 = 0;
        int i3 = -1;
        if (!mo3.u0(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = lowerCase.charAt(i4);
                    if (kr1.z(cCharAt, 31) <= 0 || kr1.z(cCharAt, 127) >= 0 || mo3.z0(cCharAt, 0, 6, " #%/:?@[\\]") != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressQ = (to3.q0(str, "[", false) && to3.j0(str, "]", false)) ? q(1, str.length() - 1, str) : q(0, str.length(), str);
        if (inetAddressQ == null) {
            return null;
        }
        byte[] address = inetAddressQ.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressQ.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        dy dyVar = new dy();
        while (i2 < address.length) {
            if (i2 == i3) {
                dyVar.V(58);
                i2 += i6;
                if (i2 == 16) {
                    dyVar.V(58);
                }
            } else {
                if (i2 > 0) {
                    dyVar.V(58);
                }
                byte b2 = address[i2];
                byte[] bArr = ka4.a;
                dyVar.X(((b2 & UByte.MAX_VALUE) << 8) | (address[i2 + 1] & UByte.MAX_VALUE));
                i2 += 2;
            }
        }
        return dyVar.O(dyVar.d, q30.a);
    }

    public static final void V(List list, nt2 nt2Var) {
        ju2 ju2Var;
        ju2 ju2Var2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        ic icVar = (ic) nt2Var;
        Path path = icVar.a;
        Path path2 = icVar.a;
        int i2 = path.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        path2.rewind();
        icVar.f(i2);
        ju2 ju2Var3 = list2.isEmpty() ? rt2.c : (ju2) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i3 < size) {
            ju2 ju2Var4 = (ju2) list2.get(i3);
            if (ju2Var4 instanceof rt2) {
                path2.close();
                path2 = path2;
                size = size;
                f10 = f10;
                i3 = i3;
                ju2Var2 = ju2Var4;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (ju2Var4 instanceof du2) {
                    du2 du2Var = (du2) ju2Var4;
                    float f17 = du2Var.c;
                    f13 += f17;
                    float f18 = du2Var.d;
                    f14 += f18;
                    path2.rMoveTo(f17, f18);
                    path2 = path2;
                    f15 = f13;
                    f16 = f14;
                } else if (ju2Var4 instanceof vt2) {
                    vt2 vt2Var = (vt2) ju2Var4;
                    float f19 = vt2Var.c;
                    float f20 = vt2Var.d;
                    path2.moveTo(f19, f20);
                    f14 = f20;
                    f16 = f14;
                    f13 = f19;
                    f15 = f13;
                } else if (ju2Var4 instanceof cu2) {
                    cu2 cu2Var = (cu2) ju2Var4;
                    float f21 = cu2Var.d;
                    float f22 = cu2Var.c;
                    path2.rLineTo(f22, f21);
                    f13 += f22;
                    f14 += f21;
                } else if (ju2Var4 instanceof ut2) {
                    ut2 ut2Var = (ut2) ju2Var4;
                    float f23 = ut2Var.d;
                    float f24 = ut2Var.c;
                    path2.lineTo(f24, f23);
                    f13 = f24;
                    f14 = f23;
                } else if (ju2Var4 instanceof bu2) {
                    float f25 = ((bu2) ju2Var4).c;
                    path2.rLineTo(f25, f10);
                    f13 += f25;
                } else if (ju2Var4 instanceof tt2) {
                    float f26 = ((tt2) ju2Var4).c;
                    path2.lineTo(f26, f14);
                    f13 = f26;
                } else {
                    if (ju2Var4 instanceof hu2) {
                        f9 = ((hu2) ju2Var4).c;
                        path2.rLineTo(f10, f9);
                    } else if (ju2Var4 instanceof iu2) {
                        float f27 = ((iu2) ju2Var4).c;
                        path2.lineTo(f13, f27);
                        f14 = f27;
                    } else if (ju2Var4 instanceof au2) {
                        au2 au2Var = (au2) ju2Var4;
                        path2.rCubicTo(au2Var.c, au2Var.d, au2Var.e, au2Var.f, au2Var.g, au2Var.h);
                        f11 = au2Var.e + f13;
                        f12 = au2Var.f + f14;
                        f13 += au2Var.g;
                        f9 = au2Var.h;
                    } else {
                        if (ju2Var4 instanceof st2) {
                            st2 st2Var = (st2) ju2Var4;
                            path2.cubicTo(st2Var.c, st2Var.d, st2Var.e, st2Var.f, st2Var.g, st2Var.h);
                            f11 = st2Var.e;
                            f12 = st2Var.f;
                            f5 = st2Var.g;
                            f6 = st2Var.h;
                        } else if (ju2Var4 instanceof fu2) {
                            if (ju2Var3.a) {
                                f8 = f14 - f12;
                                f7 = f13 - f11;
                            } else {
                                f7 = f10;
                                f8 = f7;
                            }
                            fu2 fu2Var = (fu2) ju2Var4;
                            path2.rCubicTo(f7, f8, fu2Var.c, fu2Var.d, fu2Var.e, fu2Var.f);
                            f11 = fu2Var.c + f13;
                            f12 = fu2Var.d + f14;
                            f13 += fu2Var.e;
                            f9 = fu2Var.f;
                        } else if (ju2Var4 instanceof xt2) {
                            if (ju2Var3.a) {
                                f13 = (f13 * 2.0f) - f11;
                                f14 = (2.0f * f14) - f12;
                            }
                            xt2 xt2Var = (xt2) ju2Var4;
                            path2.cubicTo(f13, f14, xt2Var.c, xt2Var.d, xt2Var.e, xt2Var.f);
                            f11 = xt2Var.c;
                            f12 = xt2Var.d;
                            f5 = xt2Var.e;
                            f6 = xt2Var.f;
                        } else if (ju2Var4 instanceof eu2) {
                            eu2 eu2Var = (eu2) ju2Var4;
                            float f28 = eu2Var.f;
                            float f29 = eu2Var.e;
                            float f30 = eu2Var.d;
                            float f31 = eu2Var.c;
                            path2.rQuadTo(f31, f30, f29, f28);
                            float f32 = f31 + f13;
                            float f33 = f30 + f14;
                            f13 += f29;
                            f14 += f28;
                            f11 = f32;
                            f12 = f33;
                        } else {
                            if (ju2Var4 instanceof wt2) {
                                wt2 wt2Var = (wt2) ju2Var4;
                                float f34 = wt2Var.f;
                                float f35 = wt2Var.e;
                                float f36 = wt2Var.d;
                                f4 = wt2Var.c;
                                path2.quadTo(f4, f36, f35, f34);
                                f14 = f34;
                                f13 = f35;
                                f12 = f36;
                            } else if (ju2Var4 instanceof gu2) {
                                if (ju2Var3.b) {
                                    f2 = f13 - f11;
                                    f3 = f14 - f12;
                                } else {
                                    f2 = f10;
                                    f3 = f2;
                                }
                                gu2 gu2Var = (gu2) ju2Var4;
                                float f37 = gu2Var.d;
                                float f38 = gu2Var.c;
                                path2.rQuadTo(f2, f3, f38, f37);
                                f4 = f2 + f13;
                                float f39 = f3 + f14;
                                f13 += f38;
                                f14 += f37;
                                f12 = f39;
                            } else if (ju2Var4 instanceof yt2) {
                                if (ju2Var3.b) {
                                    f13 = (f13 * 2.0f) - f11;
                                    f14 = (2.0f * f14) - f12;
                                }
                                yt2 yt2Var = (yt2) ju2Var4;
                                float f40 = yt2Var.d;
                                float f41 = yt2Var.c;
                                path2.quadTo(f13, f14, f41, f40);
                                path2 = path2;
                                size = size;
                                f10 = f10;
                                i3 = i3;
                                f12 = f14;
                                ju2Var2 = ju2Var4;
                                f14 = f40;
                                f11 = f13;
                                f13 = f41;
                            } else {
                                if (ju2Var4 instanceof zt2) {
                                    zt2 zt2Var = (zt2) ju2Var4;
                                    float f42 = zt2Var.h + f13;
                                    float f43 = zt2Var.i + f14;
                                    path2 = path2;
                                    i3 = i3;
                                    f10 = 0.0f;
                                    size = size;
                                    ju2Var = ju2Var4;
                                    icVar = icVar;
                                    s(icVar, f13, f14, f42, f43, zt2Var.c, zt2Var.d, zt2Var.e, zt2Var.f, zt2Var.g);
                                    f11 = f42;
                                    f13 = f11;
                                    f12 = f43;
                                    f14 = f12;
                                } else {
                                    path2 = path2;
                                    size = size;
                                    f10 = f10;
                                    i3 = i3;
                                    ju2Var = ju2Var4;
                                    if (ju2Var instanceof qt2) {
                                        qt2 qt2Var = (qt2) ju2Var;
                                        float f44 = qt2Var.i;
                                        float f45 = qt2Var.h;
                                        ju2Var2 = ju2Var;
                                        icVar = icVar;
                                        s(icVar, f13, f14, f45, f44, qt2Var.c, qt2Var.d, qt2Var.e, qt2Var.f, qt2Var.g);
                                        f12 = f44;
                                        f14 = f12;
                                        f11 = f45;
                                        f13 = f11;
                                    }
                                }
                                ju2Var2 = ju2Var;
                            }
                            size = size;
                            f10 = f10;
                            i3 = i3;
                            ju2Var2 = ju2Var4;
                            f11 = f4;
                        }
                        f14 = f6;
                        f13 = f5;
                    }
                    f14 += f9;
                }
                ju2Var2 = ju2Var4;
            }
            i3++;
            list2 = list;
            path2 = path2;
            size = size;
            ju2Var3 = ju2Var2;
            f10 = f10;
        }
    }

    public static final long W(long j2) {
        return (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static hv a(bm1 bm1Var, int i2) {
        hv hvVar = new hv(bm1Var, (((long) ((ib) bm1Var).b.getHeight()) & 4294967295L) | (((long) ((ib) bm1Var).b.getWidth()) << 32));
        hvVar.p = i2;
        return hvVar;
    }

    public static final long b(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static float c(EdgeEffect edgeEffect, float f2, float f3, wu0 wu0Var) {
        float f4 = f11.a;
        double density = wu0Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f2) * 0.35f;
        double d2 = ((double) f11.a) * density;
        float fExp = (float) (Math.exp((f11.b / f11.c) * Math.log(dAbs / d2)) * d2);
        int i2 = Build.VERSION.SDK_INT;
        if (fExp > (i2 >= 31 ? pg.b(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int iR = gb2.R(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(iR);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iR);
        }
        return f2;
    }

    public static final void d(oi2 oi2Var, of2 of2Var) {
        oi2 oi2VarX = M(of2Var).x();
        int i2 = oi2VarX.h - 1;
        Object[] objArr = oi2VarX.c;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                oi2Var.c((of2) ((ux1) objArr[i2]).N.f);
                i2--;
            }
        }
    }

    public static final of2 e(oi2 oi2Var) {
        int i2;
        if (oi2Var == null || (i2 = oi2Var.h) == 0) {
            return null;
        }
        return (of2) oi2Var.m(i2 - 1);
    }

    public static final void f(ch2 ch2Var, int i2) {
        if (ch2Var.b == 0 || !(ch2Var.a(0) == i2 || ch2Var.a(ch2Var.b - 1) == i2)) {
            int i3 = ch2Var.b;
            ch2Var.c(i2);
            while (i3 > 0) {
                int i4 = ((i3 + 1) >>> 1) - 1;
                int iA = ch2Var.a(i4);
                if (i2 <= iA) {
                    break;
                }
                ch2Var.f(i3, iA);
                i3 = i4;
            }
            ch2Var.f(i3, i2);
        }
    }

    public static final long g(long j2, int i2, int i3, int i4) {
        int i5;
        int iF = jz3.f(j2);
        int iE = jz3.e(j2);
        if (iE < i2) {
            return j2;
        }
        if (iF <= i2 && i3 <= iE) {
            i5 = i4 - (i3 - i2);
            if (iF == iE) {
            }
            i2 = iE + i5;
            return p23.d(iF, i2);
        }
        if (iF > i2 && iE < i3) {
            i2 += i4;
            iF = i2;
        } else if (iF >= i3) {
            i5 = i4 - (i3 - i2);
        } else if (i2 < iF) {
            iF = i2 + i4;
            i2 = (i4 - (i3 - i2)) + iE;
        }
        return p23.d(iF, i2);
        iF += i5;
        i2 = iE + i5;
        return p23.d(iF, i2);
    }

    public static int h(int i2, int i3) {
        return (i2 & 16777215) | (i3 << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final lx1 i(of2 of2Var) {
        if ((of2Var.getKindSet$ui_release() & 2) != 0) {
            if (of2Var instanceof lx1) {
                return (lx1) of2Var;
            }
            if (of2Var instanceof ju0) {
                of2 child$ui_release = ((ju0) of2Var).d;
                while (child$ui_release != 0) {
                    if (child$ui_release instanceof lx1) {
                        return (lx1) child$ui_release;
                    }
                    child$ui_release = (!(child$ui_release instanceof ju0) || (child$ui_release.getKindSet$ui_release() & 2) == 0) ? child$ui_release.getChild$ui_release() : ((ju0) child$ui_release).d;
                }
            }
        }
        return null;
    }

    public static Collection j(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof gu1) || (abstractCollection instanceof hu1)) {
            return abstractCollection;
        }
        R(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Map k(Object obj) {
        if ((obj instanceof gu1) && !(obj instanceof iu1)) {
            R(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            kr1.g0(e2, y64.class.getName());
            throw e2;
        }
    }

    public static void l(int i2, Object obj) {
        if (obj == null || E(i2, obj)) {
            return;
        }
        R(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final h43 m(cx1 cx1Var) {
        cx1 cx1VarJ = cx1Var.j();
        return cx1VarJ != null ? cx1VarJ.G(cx1Var, true) : new h43(0.0f, 0.0f, (int) (cx1Var.J() >> 32), (int) (cx1Var.J() & 4294967295L));
    }

    public static final h43 n(cx1 cx1Var) {
        cx1 cx1VarU = u(cx1Var);
        float fJ = (int) (cx1VarU.J() >> 32);
        float fJ2 = (int) (cx1VarU.J() & 4294967295L);
        h43 h43VarG = cx1VarU.G(cx1Var, true);
        float f2 = h43VarG.a;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > fJ) {
            f2 = fJ;
        }
        float f3 = h43VarG.b;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > fJ2) {
            f3 = fJ2;
        }
        float f4 = h43VarG.c;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= fJ) {
            fJ = f4;
        }
        float f5 = h43VarG.d;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 <= fJ2) {
            fJ2 = f6;
        }
        if (f2 == fJ || f3 == fJ2) {
            return h43.e;
        }
        long jG = cx1VarU.g((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jG2 = cx1VarU.g((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
        long jG3 = cx1VarU.g((((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fJ2)) & 4294967295L));
        long jG4 = cx1VarU.g((((long) Float.floatToRawIntBits(fJ2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jG4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jG3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jG & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jG2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jG4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jG3 & 4294967295L));
        return new h43(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final void o(int i2) {
        if (i2 >= 1) {
            return;
        }
        u41.h(ud2.m(i2, "Expected positive parallelism level, but got "));
    }

    public static StaticLayout p(CharSequence charSequence, TextPaint textPaint, int i2, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, boolean z, int i7, int i8, int i9, int i10) {
        if (i3 < 0) {
            qo1.a("invalid start value");
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            qo1.a("invalid end value");
        }
        if (i4 < 0) {
            qo1.a("invalid maxLines value");
        }
        if (i2 < 0) {
            qo1.a("invalid width value");
        }
        if (i5 < 0) {
            qo1.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i3, textPaint, i2);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i4);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i5);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i7);
        builderObtain.setHyphenationFrequency(i10);
        builderObtain.setIndents(null, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            builderObtain.setJustificationMode(i6);
        }
        if (i11 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i11 >= 33) {
            builderObtain.setLineBreakConfig(i1.a().setLineBreakStyle(i8).setLineBreakWordStyle(i9).build());
        }
        if (i11 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    public static final InetAddress q(int i2, int i3, String str) {
        int i4;
        int i5;
        int iQ;
        byte[] bArr = new byte[16];
        int i6 = i2;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        while (i6 < i3) {
            if (i7 == 16) {
                return null;
            }
            int i10 = i6 + 2;
            if (i10 <= i3 && to3.p0(str, "::", i6, false)) {
                if (i8 != -1) {
                    return null;
                }
                i7 += 2;
                i8 = i7;
                if (i10 == i3) {
                    break;
                }
                i9 = i10;
                i4 = 0;
                i6 = i9;
                while (i6 < i3) {
                    iQ = ka4.q(str.charAt(i6));
                    if (iQ != -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + iQ;
                    i6++;
                }
                i5 = i6 - i9;
                return i5 == 0 ? null : null;
            }
            if (i7 != 0) {
                if (!to3.p0(str, ":", i6, false)) {
                    if (!to3.p0(str, ".", i6, false)) {
                        return null;
                    }
                    int i11 = i7 - 2;
                    int i12 = i11;
                    while (i9 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i9) != '.') {
                                return null;
                            }
                            i9++;
                        }
                        int i13 = 0;
                        int i14 = i9;
                        while (i14 < i3) {
                            char cCharAt = str.charAt(i14);
                            if (kr1.z(cCharAt, 48) < 0 || kr1.z(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i9 != i14) || (i13 = ((i13 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i9 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i9 = i14;
                    }
                    if (i12 != i7 + 2) {
                        return null;
                    }
                    i7 += 2;
                    break;
                }
                i6++;
            }
            i9 = i6;
            i4 = 0;
            i6 = i9;
            while (i6 < i3) {
                iQ = ka4.q(str.charAt(i6));
                if (iQ != -1) {
                    break;
                }
                i4 = (i4 << 4) + iQ;
                i6++;
            }
            i5 = i6 - i9;
            if (i5 == 0 && i5 <= 4) {
                int i15 = i7 + 1;
                bArr[i7] = (byte) (255 & (i4 >>> 8));
                i7 += 2;
                bArr[i15] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        if (i7 != 16) {
            if (i8 == -1) {
                return null;
            }
            int i16 = i7 - i8;
            System.arraycopy(bArr, i8, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i8, (16 - i7) + i8, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static void r(fa faVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        ze3 semanticsNode;
        le1 le1Var;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jKeyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse viewTranslationResponseN = s9.n(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseN != null && (value = viewTranslationResponseN.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) faVar.c().b((int) jKeyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                Object objG = semanticsNode.d.c.g(te3.k);
                if (objG == null) {
                    objG = null;
                }
                z0 z0Var = (z0) objG;
                if (z0Var != null && (le1Var = (le1) z0Var.b) != null) {
                }
            }
        }
    }

    public static final void s(nt2 nt2Var, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            s(nt2Var, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d17 * dSqrt2;
        double d24 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan3 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d11;
        double d30 = d29 * dCos2;
        double d31 = d7 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d7 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan3 / ((double) iCeil);
        double d37 = dAtan2;
        double d38 = d32;
        int i2 = 0;
        double d39 = d35;
        double d40 = d3;
        while (i2 < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            int i3 = iCeil;
            double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
            double d44 = (d30 * dSin4) - (d31 * dCos4);
            double d45 = (dCos4 * d34) + (dSin4 * d33);
            double d46 = d41 - d37;
            double dTan = Math.tan(d46 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            ((ic) nt2Var).a.cubicTo((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            dSin2 = dSin2;
            d27 = d27;
            d2 = d42;
            i2++;
            d33 = d33;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            iCeil = i3;
            d40 = d43;
            d11 = d6;
        }
    }

    public static final String t(String str, ps2... ps2VarArr) {
        for (ps2 ps2Var : ps2VarArr) {
            str = to3.o0(str, fq2.n("{", (String) ps2Var.c, "}"), ps2Var.d.toString());
        }
        return str;
    }

    public static final cx1 u(cx1 cx1Var) {
        cx1 cx1Var2;
        cx1 cx1VarJ = cx1Var.j();
        while (true) {
            cx1 cx1Var3 = cx1VarJ;
            cx1Var2 = cx1Var;
            cx1Var = cx1Var3;
            if (cx1Var == null) {
                break;
            }
            cx1VarJ = cx1Var.j();
        }
        wl2 wl2Var = cx1Var2 instanceof wl2 ? (wl2) cx1Var2 : null;
        if (wl2Var == null) {
            return cx1Var2;
        }
        wl2 wl2Var2 = wl2Var.v;
        while (true) {
            wl2 wl2Var3 = wl2Var2;
            wl2 wl2Var4 = wl2Var;
            wl2Var = wl2Var3;
            if (wl2Var == null) {
                return wl2Var4;
            }
            wl2Var2 = wl2Var.v;
        }
    }

    public static Object v(vp0 vp0Var, Object obj, ne1 ne1Var) {
        ne1Var.getClass();
        return ne1Var.invoke(obj, vp0Var);
    }

    public static vp0 w(vp0 vp0Var, wp0 wp0Var) {
        wp0Var.getClass();
        if (kr1.n(vp0Var.getKey(), wp0Var)) {
            return vp0Var;
        }
        return null;
    }

    public static ColorStateList x(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        z53 z53Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        a63 a63Var = new a63(resources, theme);
        synchronized (b63.c) {
            try {
                SparseArray sparseArray = (SparseArray) b63.b.get(a63Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (z53Var = (z53) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (z53Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || z53Var.c != 0) {
                            if (theme == null || z53Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = z53Var.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = b63.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = ff0.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (b63.c) {
            try {
                WeakHashMap weakHashMap = b63.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(a63Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(a63Var, sparseArray2);
                }
                sparseArray2.append(i2, new z53(colorStateListA, a63Var.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static Drawable y(Context context, int i2) {
        return x53.c().d(context, i2);
    }

    public static final Object z(pm1 pm1Var, f61 f61Var) {
        Object obj = pm1Var.t.a.get(f61Var);
        if (obj != null) {
            return obj;
        }
        Object obj2 = pm1Var.v.n.a.get(f61Var);
        return obj2 == null ? f61Var.c : obj2;
    }
}
