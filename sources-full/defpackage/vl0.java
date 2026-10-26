package defpackage;

import ai.notrack.app.R;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.ExtractedText;
import android.widget.TextView;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import app.template.extension.BuildConfig;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class vl0 {
    public static final vt a = new vt(-1.0f);
    public static final vt b = new vt(1.0f);
    public static final ut c = new ut(-1.0f);
    public static final ut d = new ut(1.0f);
    public static final hq0 e = hq0.c;
    public static final lk0 f = new lk0(4);
    public static final h43 g = new h43(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static vu A() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = tq0.b("androidxBiometric", 3);
            tq0.d(builderB);
            tq0.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            tq0.c(keyGenerator, tq0.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new vu(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e2) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e2);
            return null;
        }
    }

    public static final void B(vf vfVar, long j, float f2, rf rfVar, xf xfVar, le1 le1Var) {
        long jC = f2 == 0.0f ? rfVar.c() : (long) ((j - vfVar.c) / f2);
        vfVar.g = j;
        vfVar.e.setValue(rfVar.b(jC));
        vfVar.f = rfVar.f(jC);
        if (rfVar.g(jC)) {
            vfVar.h = vfVar.g;
            vfVar.i.setValue(Boolean.FALSE);
        }
        h0(vfVar, xfVar);
        le1Var.invoke(vfVar);
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
    public static final void C(tz0 tz0Var, gg1 gg1Var) {
        boolean z;
        float f2;
        y00 y00VarY = tz0Var.A().y();
        gg1 gg1Var2 = (gg1) tz0Var.A().h;
        a aVar = gg1Var.a;
        if (gg1Var.s) {
            return;
        }
        gg1Var.a();
        if (!aVar.getHasDisplayList()) {
            try {
                gg1Var.a.m(gg1Var.b, gg1Var.c, gg1Var, gg1Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = aVar.s() > 0.0f;
        if (z2) {
            y00VarY.t();
        }
        Canvas canvasA = p9.a(y00VarY);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = gg1Var.t;
            float f3 = (int) (j >> 32);
            float f4 = (int) (j & 4294967295L);
            long j2 = gg1Var.u;
            float f5 = ((int) (j2 >> 32)) + f3;
            float f6 = ((int) (j2 & 4294967295L)) + f4;
            float alpha = aVar.getAlpha();
            int iT = aVar.t();
            if (alpha < 1.0f || iT != 3 || aVar.l() == 1) {
                bc bcVarF = gg1Var.p;
                if (bcVarF == null) {
                    bcVarF = f();
                    gg1Var.p = bcVarF;
                }
                bcVarF.d(alpha);
                bcVarF.e(iT);
                bcVarF.g(null);
                canvasA = canvasA;
                f2 = f3;
                canvasA.saveLayer(f2, f4, f5, f6, (Paint) bcVarF.d);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f2 = f3;
            }
            canvasA.translate(f2, f4);
            canvasA.concat(aVar.q());
        }
        boolean z3 = !zIsHardwareAccelerated && gg1Var.w;
        if (z3) {
            y00VarY.l();
            rq2 rq2VarD = gg1Var.d();
            if (rq2VarD instanceof pq2) {
                y00.k(y00VarY, ((pq2) rq2VarD).a);
            } else if (rq2VarD instanceof qq2) {
                ic icVarA = gg1Var.m;
                if (icVarA != null) {
                    icVarA.a.rewind();
                } else {
                    icVarA = kc.a();
                    gg1Var.m = icVarA;
                }
                nt2.b(icVarA, ((qq2) rq2VarD).a);
                y00VarY.o(icVarA);
            } else if (rq2VarD instanceof oq2) {
                y00VarY.o(((oq2) rq2VarD).a);
            }
        }
        if (gg1Var2 != null) {
            sd sdVar = gg1Var2.r;
            if (!sdVar.a) {
                oo1.a("Only add dependencies during a tracking");
            }
            gi2 gi2Var = (gi2) sdVar.d;
            if (gi2Var != null) {
                gi2Var.a(gg1Var);
            } else if (((gg1) sdVar.b) != null) {
                int i = sa3.a;
                gi2 gi2Var2 = new gi2();
                gg1 gg1Var3 = (gg1) sdVar.b;
                gg1Var3.getClass();
                gi2Var2.a(gg1Var3);
                gi2Var2.a(gg1Var);
                sdVar.d = gi2Var2;
                sdVar.b = null;
            } else {
                sdVar.b = gg1Var;
            }
            gi2 gi2Var3 = (gi2) sdVar.e;
            if (gi2Var3 != null) {
                z = !gi2Var3.l(gg1Var);
            } else if (((gg1) sdVar.c) != gg1Var) {
                z = true;
            } else {
                sdVar.c = null;
                z = false;
            }
            if (z) {
                gg1Var.q++;
            }
        }
        if (((o9) y00VarY).a.isHardwareAccelerated()) {
            aVar.j(y00VarY);
        } else {
            a10 a10Var = gg1Var.o;
            if (a10Var == null) {
                a10Var = new a10();
                gg1Var.o = a10Var;
            }
            ci4 ci4Var = a10Var.d;
            wu0 wu0Var = gg1Var.b;
            dx1 dx1Var = gg1Var.c;
            long jW = y64.W(gg1Var.u);
            z00 z00Var = ((a10) ci4Var.l).c;
            wu0 wu0Var2 = z00Var.a;
            dx1 dx1Var2 = z00Var.b;
            y00 y00VarY2 = ci4Var.y();
            long jC = ci4Var.C();
            gg1 gg1Var4 = (gg1) ci4Var.h;
            ci4Var.K(wu0Var);
            ci4Var.M(dx1Var);
            ci4Var.J(y00VarY);
            ci4Var.N(jW);
            ci4Var.h = gg1Var;
            y00VarY.l();
            try {
                gg1Var.c(a10Var);
                y00VarY.i();
                ci4Var.K(wu0Var2);
                ci4Var.M(dx1Var2);
                ci4Var.J(y00VarY2);
                ci4Var.N(jC);
                ci4Var.h = gg1Var4;
            } catch (Throwable th) {
                y00VarY.i();
                ci4Var.K(wu0Var2);
                ci4Var.M(dx1Var2);
                ci4Var.J(y00VarY2);
                ci4Var.N(jC);
                ci4Var.h = gg1Var4;
                throw th;
            }
        }
        if (z3) {
            y00VarY.i();
        }
        if (z2) {
            y00VarY.n();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }

    public static jm[] D(TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (jm[]) ((Spanned) text).getSpans(0, length, jm.class);
    }

    public static final int E(int i, List list) {
        int i2;
        byte b2;
        int i3 = ((ss2) ke0.E0(list)).c;
        if (i > ((ss2) ke0.E0(list)).c) {
            qo1.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            ss2 ss2Var = (ss2) list.get(i2);
            if (ss2Var.b > i) {
                b2 = 1;
            } else {
                b2 = ss2Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbS = ud2.s("Found paragraph index ", " should be in range [0, ", i2);
        sbS.append(list.size());
        sbS.append(").\nDebug info: index=");
        sbS.append(i);
        sbS.append(", paragraphs=[");
        sbS.append(k62.a(31, null, list));
        sbS.append(']');
        qo1.a(sbS.toString());
        return i2;
    }

    public static final int F(int i, List list) {
        byte b2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ss2 ss2Var = (ss2) list.get(i3);
            if (ss2Var.d > i) {
                b2 = 1;
            } else {
                b2 = ss2Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int G(ArrayList arrayList, float f2) {
        byte b2;
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((ss2) ke0.E0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ss2 ss2Var = (ss2) arrayList.get(i2);
            if (ss2Var.f > f2) {
                b2 = 1;
            } else {
                b2 = ss2Var.g <= f2 ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i = i2 + 1;
            } else {
                if (b2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void H(ArrayList arrayList, long j, le1 le1Var) {
        int size = arrayList.size();
        for (int iE = E(jz3.f(j), arrayList); iE < size; iE++) {
            ss2 ss2Var = (ss2) arrayList.get(iE);
            if (ss2Var.b >= jz3.e(j)) {
                return;
            }
            if (ss2Var.b != ss2Var.c) {
                le1Var.invoke(ss2Var);
            }
        }
    }

    public static final long I(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final float K(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float L(xp0 xp0Var) {
        zf2 zf2Var = (zf2) xp0Var.get(t73.s);
        float scaleFactor = zf2Var != null ? zf2Var.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        ay2.b("negative scale factor");
        return scaleFactor;
    }

    public static final long P(le3 le3Var, long j, ed3 ed3Var) {
        cx1 cx1VarC;
        long jD;
        long j2;
        pg2 pg2Var;
        int iD;
        float fW;
        pg2 pg2Var2;
        int iD2;
        pg2 pg2Var3;
        int iD3;
        float fB;
        pg2 pg2Var4;
        int iD4;
        vg2 vg2VarC = le3Var.c(ed3Var);
        if (vg2VarC == null) {
            return 9205357640488583168L;
        }
        rd3 rd3Var = vg2VarC.c;
        cx1 cx1Var = le3Var.k;
        if (cx1Var == null || (cx1VarC = vg2VarC.c()) == null) {
            return 9205357640488583168L;
        }
        int i = ed3Var.b;
        xy3 xy3Var = (xy3) rd3Var.invoke();
        if (i > (xy3Var == null ? 0 : vg2VarC.b(xy3Var))) {
            return 9205357640488583168L;
        }
        ln2 ln2Var = (ln2) le3Var.q.getValue();
        ln2Var.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cx1VarC.y(cx1Var, ln2Var.a) >> 32));
        xy3 xy3Var2 = (xy3) rd3Var.invoke();
        if (xy3Var2 == null) {
            jD = jz3.b;
        } else {
            pg2 pg2Var5 = xy3Var2.b;
            int iB = vg2VarC.b(xy3Var2);
            if (iB < 1) {
                jD = jz3.b;
            } else {
                int iD5 = pg2Var5.d(py.x(i, 0, iB - 1));
                jD = p23.d(xy3Var2.g(iD5), pg2Var5.c(iD5, true));
            }
        }
        if (jz3.c(jD)) {
            xy3 xy3Var3 = (xy3) rd3Var.invoke();
            fW = (xy3Var3 != null && (iD4 = (pg2Var4 = xy3Var3.b).d(i)) < pg2Var4.f) ? xy3Var3.e(iD4) : -1.0f;
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i2 = (int) (jD >> 32);
            xy3 xy3Var4 = (xy3) rd3Var.invoke();
            float fE = (xy3Var4 != null && (iD2 = (pg2Var2 = xy3Var4.b).d(i2)) < pg2Var2.f) ? xy3Var4.e(iD2) : -1.0f;
            int i3 = ((int) (jD & 4294967295L)) - 1;
            xy3 xy3Var5 = (xy3) rd3Var.invoke();
            float f2 = (xy3Var5 != null && (iD = (pg2Var = xy3Var5.b).d(i3)) < pg2Var.f) ? xy3Var5.f(iD) : -1.0f;
            fW = py.w(fIntBitsToFloat, Math.min(fE, f2), Math.max(fE, f2));
        }
        if (fW == -1.0f) {
            return 9205357640488583168L;
        }
        if (!qq1.a(j, 0L) && Math.abs(fIntBitsToFloat - fW) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        xy3 xy3Var6 = (xy3) rd3Var.invoke();
        if (xy3Var6 != null && (iD3 = (pg2Var3 = xy3Var6.b).d(i)) < pg2Var3.f) {
            float f3 = pg2Var3.f(iD3);
            fB = ((pg2Var3.b(iD3) - f3) / 2.0f) + f3;
        } else {
            fB = -1.0f;
        }
        if (fB == -1.0f) {
            return 9205357640488583168L;
        }
        return cx1Var.y(cx1VarC, (((long) Float.floatToRawIntBits(fW)) << 32) | (((long) Float.floatToRawIntBits(fB)) & j2));
    }

    public static final qu1 Q(qu1 qu1Var) {
        qu1Var.getClass();
        return qu1Var.getDescriptor().g() ? qu1Var : new zm2(qu1Var);
    }

    public static final hg R(ey3 ey3Var) {
        hg hgVar = ey3Var.a;
        long j = ey3Var.b;
        hgVar.getClass();
        return hgVar.subSequence(jz3.f(j), jz3.e(j));
    }

    public static final hg S(ey3 ey3Var, int i) {
        hg hgVar = ey3Var.a;
        long j = ey3Var.b;
        return hgVar.subSequence(jz3.e(j), Math.min(jz3.e(j) + i, ey3Var.a.d.length()));
    }

    public static final hg T(ey3 ey3Var, int i) {
        hg hgVar = ey3Var.a;
        long j = ey3Var.b;
        return hgVar.subSequence(Math.max(0, jz3.f(j) - i), jz3.f(j));
    }

    public static final void U(tz1 tz1Var, String str) {
        tz1Var.k("Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.", tz1Var.b - 1);
        throw null;
    }

    public static final boolean V(long j) {
        return (j & 2) != 0;
    }

    public static final boolean W(long j) {
        return (j & 1) != 0;
    }

    public static final CharSequence X(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? BuildConfig.VERSION_NAME : ".....";
                String str2 = i3 >= charSequence.length() ? BuildConfig.VERSION_NAME : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static c Y(c cVar, nc ncVar) {
        return cVar.then(new PointerHoverIconModifierElement(ncVar));
    }

    public static final void Z(bk3 bk3Var, xk xkVar, int i) {
        while (true) {
            int i2 = bk3Var.v;
            if (i > i2 && i < bk3Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            bk3Var.J();
            if (bk3Var.w(bk3Var.v)) {
                xkVar.l();
            }
            bk3Var.i();
        }
    }

    public static final dt1 a(Number number, String str, String str2) {
        str.getClass();
        str2.getClass();
        return d(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) X(-1, str2)));
    }

    public static final it1 b(Number number, String str) {
        return new it1("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) X(-1, str)));
    }

    public static final it1 c(tf3 tf3Var) {
        return new it1("Value of type '" + tf3Var.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + tf3Var.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final Object c0(db3 db3Var, boolean z, db3 db3Var2, ne1 ne1Var) throws Throwable {
        Object dg0Var;
        Object objN;
        try {
            if (ne1Var instanceof wr) {
                y64.l(2, ne1Var);
                dg0Var = ne1Var.invoke(db3Var2, db3Var);
            } else {
                dg0Var = gm4.S(ne1Var, db3Var2, db3Var);
            }
        } catch (mw0 e2) {
            Throwable th = e2.c;
            db3Var.M(new dg0(th, false));
            throw th;
        } catch (Throwable th2) {
            dg0Var = new dg0(th2, false);
        }
        hq0 hq0Var = hq0.c;
        if (dg0Var == hq0Var || (objN = db3Var.N(dg0Var)) == py.l) {
            return hq0Var;
        }
        db3Var.h0();
        if (!(objN instanceof dg0)) {
            return py.W(objN);
        }
        if (!z) {
            Throwable th3 = ((dg0) objN).a;
            if ((th3 instanceof v04) && ((v04) th3).c == db3Var) {
                if (dg0Var instanceof dg0) {
                    throw ((dg0) dg0Var).a;
                }
                return dg0Var;
            }
        }
        throw ((dg0) objN).a;
    }

    public static final dt1 d(int i, String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new dt1(str);
    }

    public static final void d0(tz1 tz1Var, Number number) {
        tz1.l(tz1Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final dt1 e(int i, String str, CharSequence charSequence) {
        charSequence.getClass();
        return d(i, str + "\nJSON input: " + ((Object) X(i, charSequence)));
    }

    public static final long e0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final bc f() {
        return new bc(new Paint(7));
    }

    public static final String f0(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = py.c;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        Protocol$Companion.checkBoundsIndexes$kotlin_stdlib(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    public static final long g(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static void g0(TextView textView) {
        if (textView.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode) == null) {
            return;
        }
        textView.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, null);
        jm[] jmVarArrD = D(textView);
        if (jmVarArrD == null || jmVarArrD.length <= 0) {
            return;
        }
        for (jm jmVar : jmVarArrD) {
            jmVar.d.c(null);
        }
    }

    public static final float h(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final void h0(vf vfVar, xf xfVar) {
        xfVar.d.setValue(vfVar.e.getValue());
        cg cgVar = xfVar.h;
        cg cgVar2 = vfVar.f;
        int iB = cgVar.b();
        for (int i = 0; i < iB; i++) {
            cgVar.e(cgVar2.a(i), i);
        }
        xfVar.m = vfVar.h;
        xfVar.l = vfVar.g;
        xfVar.n = ((Boolean) vfVar.i.getValue()).booleanValue();
    }

    public static final boolean i(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final List i0(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return z21.c;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            t02 t02Var = (t02) arrayList.get(i3);
            int index = t02Var.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(t02Var);
            }
        }
        oe0.r0(arrayList2, f);
        return arrayList2;
    }

    public static final Rect j(qa1 qa1Var, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        db1 db1VarQ = av1.q(((va1) qa1Var).f);
        h43 h43VarT = db1VarQ != null ? av1.t(db1VarQ) : null;
        if (h43VarT == null) {
            return null;
        }
        int i = (int) h43VarT.a;
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = (int) h43VarT.b;
        int i5 = iArr[1];
        int i6 = iArr2[1];
        return new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) h43VarT.c) + i2) - i3, (((int) h43VarT.d) + i5) - i6);
    }

    public static final h43 j0(cx1 cx1Var) {
        h43 h43VarN = y64.n(cx1Var);
        long jE = cx1Var.e(h43VarN.e());
        float f2 = h43VarN.c;
        float f3 = h43VarN.d;
        long jE2 = cx1Var.e((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        return new h43(Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jE & 4294967295L)), Float.intBitsToFloat((int) (jE2 >> 32)), Float.intBitsToFloat((int) (jE2 & 4294967295L)));
    }

    public static final View k(of2 of2Var) {
        bd4 bd4Var = y64.M(of2Var.getNode()).w;
        View interopView = bd4Var != null ? bd4Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        u41.r("Could not fetch interop view");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k0(long j, ne1 ne1Var, uo0 uo0Var) throws Throwable {
        x04 x04Var;
        q43 q43Var;
        if (uo0Var instanceof x04) {
            x04Var = (x04) uo0Var;
            int i = x04Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                x04Var.h = i - Integer.MIN_VALUE;
            } else {
                x04Var = new x04(uo0Var);
            }
        } else {
            x04Var = new x04(uo0Var);
        }
        Object obj = x04Var.d;
        int i2 = x04Var.h;
        if (i2 == 0) {
            g13.O(obj);
            if (j > 0) {
                q43 q43Var2 = new q43();
                try {
                    x04Var.c = q43Var2;
                    x04Var.h = 1;
                    w04 w04Var = new w04(j, x04Var);
                    q43Var2.c = w04Var;
                    try {
                        yo4.D(w04Var, true, new zw0(p23.y(w04Var.n.getContext()).h(w04Var.o, w04Var, w04Var.m)));
                        Object objC0 = c0(w04Var, false, w04Var, ne1Var);
                        hq0 hq0Var = hq0.c;
                        return objC0 == hq0Var ? hq0Var : objC0;
                    } catch (v04 e2) {
                        e = e2;
                        q43Var = q43Var2;
                        if (e.c != q43Var.c) {
                            throw e;
                        }
                        return null;
                    }
                } catch (v04 e3) {
                    e = e3;
                }
            }
            return null;
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        q43Var = x04Var.c;
        try {
            g13.O(obj);
            return obj;
        } catch (v04 e4) {
            e = e4;
        }
        if (e.c != q43Var.c) {
            throw e;
        }
        return null;
    }

    public static final ExtractedText l(ey3 ey3Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = ey3Var.a.d;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = ey3Var.b;
        extractedText.selectionStart = jz3.f(j);
        extractedText.selectionEnd = jz3.e(j);
        extractedText.flags = !mo3.v0(ey3Var.a.d, '\n') ? 1 : 0;
        return extractedText;
    }

    public static BiometricPrompt.CryptoObject l0(vu vuVar) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (vuVar == null) {
            return null;
        }
        Cipher cipher = (Cipher) vuVar.d;
        if (cipher != null) {
            return uq0.b(cipher);
        }
        Signature signature = (Signature) vuVar.c;
        if (signature != null) {
            return uq0.a(signature);
        }
        Mac mac = (Mac) vuVar.h;
        if (mac != null) {
            return uq0.c(mac);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && (identityCredential = (IdentityCredential) vuVar.l) != null) {
            return vq0.a(identityCredential);
        }
        if (i < 33 || (presentationSession = (PresentationSession) vuVar.m) == null) {
            return null;
        }
        return wq0.a(presentationSession);
    }

    public static final Object m(float f2, float f3, float f4, wf wfVar, ne1 ne1Var, mq3 mq3Var) throws Throwable {
        x64 x64Var = mb4.a;
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        yf yfVar = new yf(new Float(f4).floatValue());
        Object objN = n(new xf(x64Var, f5, yfVar, 56), new qs3(wfVar, x64Var, f5, f6, yfVar), Long.MIN_VALUE, new pj2(ne1Var), mq3Var);
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        if (objN != hq0Var) {
            objN = w84Var;
        }
        return objN == hq0Var ? objN : w84Var;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x016a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object n(xf xfVar, rf rfVar, long j, le1 le1Var, uo0 uo0Var) throws Throwable {
        iq3 iq3Var;
        q43 q43Var;
        xf xfVar2;
        xf xfVar3;
        q43 q43Var2;
        Object objWithFrameNanos;
        le1 le1Var2;
        vf vfVar;
        vf vfVar2;
        Object objWithFrameNanos2;
        rf rfVar2 = rfVar;
        if (uo0Var instanceof iq3) {
            iq3Var = (iq3) uo0Var;
            int i = iq3Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                iq3Var.n = i - Integer.MIN_VALUE;
            } else {
                iq3Var = new iq3(uo0Var);
            }
        } else {
            iq3Var = new iq3(uo0Var);
        }
        iq3 iq3Var2 = iq3Var;
        Object obj = iq3Var2.m;
        int i2 = iq3Var2.n;
        int i3 = 9;
        int i4 = 1;
        hq0 hq0Var = hq0.c;
        if (i2 == 0) {
            g13.O(obj);
            Object objB = rfVar2.b(0L);
            cg cgVarF = rfVar2.f(0L);
            q43Var = new q43();
            if (j == Long.MIN_VALUE) {
                try {
                    xfVar2 = xfVar;
                    try {
                        kq3 kq3Var = new kq3(q43Var, objB, rfVar2, cgVarF, xfVar2, L(iq3Var2.getContext()), le1Var);
                        q43Var2 = q43Var;
                        try {
                            iq3Var2.c = xfVar2;
                            iq3Var2.d = rfVar2;
                            iq3Var2.h = le1Var;
                            iq3Var2.l = q43Var2;
                            iq3Var2.n = 1;
                            if (rfVar2.a()) {
                                objWithFrameNanos = co1.a(kq3Var, iq3Var2);
                            } else {
                                objWithFrameNanos = yo4.z(iq3Var2.getContext()).withFrameNanos(new f01(kq3Var, i3), iq3Var2);
                            }
                            if (objWithFrameNanos != hq0Var) {
                                xfVar3 = xfVar2;
                                le1Var2 = le1Var;
                                q43Var = q43Var2;
                            }
                            return hq0Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            xfVar3 = xfVar2;
                            q43Var = q43Var2;
                            vfVar = (vf) q43Var.c;
                            if (vfVar != null) {
                                vfVar.i.setValue(Boolean.FALSE);
                            }
                            vfVar2 = (vf) q43Var.c;
                            if (vfVar2 != null) {
                                xfVar3.n = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        xfVar3 = xfVar2;
                        vfVar = (vf) q43Var.c;
                        if (vfVar != null) {
                            vfVar.i.setValue(Boolean.FALSE);
                        }
                        vfVar2 = (vf) q43Var.c;
                        if (vfVar2 != null) {
                            xfVar3.n = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    xfVar2 = xfVar;
                }
            } else {
                q43Var2 = q43Var;
                try {
                    vf vfVar3 = new vf(objB, rfVar2.d(), cgVarF, j, rfVar2.e(), j, new jq3(i4, xfVar));
                    B(vfVar3, j, L(iq3Var2.getContext()), rfVar2, xfVar, le1Var);
                    q43Var2.c = vfVar3;
                    xfVar3 = xfVar;
                    rfVar2 = rfVar;
                    le1Var2 = le1Var;
                    q43Var = q43Var2;
                } catch (CancellationException e5) {
                    e = e5;
                    xfVar3 = xfVar;
                    q43Var = q43Var2;
                    vfVar = (vf) q43Var.c;
                    if (vfVar != null) {
                        vfVar.i.setValue(Boolean.FALSE);
                    }
                    vfVar2 = (vf) q43Var.c;
                    if (vfVar2 != null && vfVar2.g == xfVar3.l) {
                        xfVar3.n = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q43Var = iq3Var2.l;
            le1Var2 = iq3Var2.h;
            rfVar2 = iq3Var2.d;
            xfVar3 = iq3Var2.c;
            try {
                g13.O(obj);
            } catch (CancellationException e6) {
                e = e6;
                vfVar = (vf) q43Var.c;
                if (vfVar != null) {
                    vfVar.i.setValue(Boolean.FALSE);
                }
                vfVar2 = (vf) q43Var.c;
                if (vfVar2 != null) {
                    xfVar3.n = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = q43Var.c;
            obj2.getClass();
            if (!((Boolean) ((vf) obj2).i.getValue()).booleanValue()) {
                return w84.a;
            }
            q43 q43Var3 = q43Var;
            le1 le1Var3 = le1Var2;
            rf rfVar3 = rfVar2;
            xf xfVar4 = xfVar3;
            try {
                lq3 lq3Var = new lq3(q43Var3, L(iq3Var2.getContext()), rfVar3, xfVar4, le1Var3);
                q43Var = q43Var3;
                rfVar2 = rfVar3;
                xfVar3 = xfVar4;
                le1Var2 = le1Var3;
                iq3Var2.c = xfVar3;
                iq3Var2.d = rfVar2;
                iq3Var2.h = le1Var2;
                iq3Var2.l = q43Var;
                iq3Var2.n = 2;
                if (rfVar2.a()) {
                    objWithFrameNanos2 = co1.a(lq3Var, iq3Var2);
                } else {
                    objWithFrameNanos2 = yo4.z(iq3Var2.getContext()).withFrameNanos(new f01(lq3Var, i3), iq3Var2);
                }
            } catch (CancellationException e7) {
                e = e7;
                q43Var = q43Var3;
                xfVar3 = xfVar4;
                vfVar = (vf) q43Var.c;
                if (vfVar != null) {
                    vfVar.i.setValue(Boolean.FALSE);
                }
                vfVar2 = (vf) q43Var.c;
                if (vfVar2 != null) {
                    xfVar3.n = false;
                }
                throw e;
            }
        } while (objWithFrameNanos2 != hq0Var);
        return hq0Var;
    }

    public static final Object p(xf xfVar, zr0 zr0Var, boolean z, le1 le1Var, uo0 uo0Var) throws Throwable {
        Object objN = n(xfVar, new yr0(zr0Var, xfVar.c, xfVar.d.getValue(), xfVar.h), z ? xfVar.l : Long.MIN_VALUE, le1Var, uo0Var);
        return objN == hq0.c ? objN : w84.a;
    }

    public static final Object q(xf xfVar, Float f2, wf wfVar, boolean z, le1 le1Var, uo0 uo0Var) throws Throwable {
        Object objN = n(xfVar, new qs3(wfVar, xfVar.c, xfVar.d.getValue(), f2, xfVar.h), z ? xfVar.l : Long.MIN_VALUE, le1Var, uo0Var);
        return objN == hq0.c ? objN : w84.a;
    }

    public static /* synthetic */ Object r(xf xfVar, Float f2, wf wfVar, boolean z, le1 le1Var, uo0 uo0Var, int i) {
        if ((i & 2) != 0) {
            wfVar = kr1.l0(7, null);
        }
        wf wfVar2 = wfVar;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            le1Var = ba3.I;
        }
        return q(xfVar, f2, wfVar2, z2, le1Var, uo0Var);
    }

    public static final boolean s(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final Drawable t(am1 am1Var, Resources resources) {
        if (am1Var instanceof xz0) {
            return ((xz0) am1Var).a;
        }
        return am1Var instanceof gv ? new BitmapDrawable(resources, ((gv) am1Var).a) : new t2(1, am1Var);
    }

    public static final am1 u(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new gv(((BitmapDrawable) drawable).getBitmap()) : new xz0(drawable);
    }

    public static final Object v(m62 m62Var, mq3 mq3Var) throws Throwable {
        try {
            if (m62Var.isDone()) {
                return u0.g(m62Var);
            }
            t00 t00Var = new t00(1, gm4.G(mq3Var));
            m62Var.a(new c14(m62Var, t00Var, 1), dw0.c);
            t00Var.w(new e8(28, m62Var));
            return t00Var.s();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            uw1 uw1Var = new uw1();
            kr1.g0(uw1Var, kr1.class.getName());
            throw uw1Var;
        }
    }

    public static final void w(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final void x(long j, nq2 nq2Var) {
        if (nq2Var == nq2.c) {
            if (um0.g(j) != Integer.MAX_VALUE) {
                return;
            }
            so1.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (um0.h(j) != Integer.MAX_VALUE) {
                return;
            }
            so1.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final int y(long j, long j2) {
        boolean zW = W(j);
        if (zW != W(j2)) {
            return zW ? -1 : 1;
        }
        int iSignum = (int) Math.signum(K(j) - K(j2));
        if (Math.min(K(j), K(j2)) >= 0.0f && V(j) != V(j2)) {
            return V(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static final boolean z(long j, h43 h43Var) {
        float f2 = h43Var.a;
        float f3 = h43Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = h43Var.b;
        float f5 = h43Var.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    public Object J(int i) {
        dr1 dr1VarH = N().h(i);
        return dr1VarH.c.a().invoke(Integer.valueOf(i - dr1VarH.a));
    }

    public abstract InputFilter[] M(InputFilter[] inputFilterArr);

    public abstract gj N();

    public Object O(int i) {
        Object objInvoke;
        dr1 dr1VarH = N().h(i);
        int i2 = i - dr1VarH.a;
        le1 key = dr1VarH.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new ct0(i) : objInvoke;
    }

    public abstract void a0(boolean z);

    public abstract void b0(boolean z);
}
