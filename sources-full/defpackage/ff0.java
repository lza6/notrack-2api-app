package defpackage;

import ai.notrack.app.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ff0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        int i;
        int iF;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = e23.a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i2, i2);
                int resourceId = ObtainAttributes.getResourceId(i2, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    int i4 = typedValue.type;
                    if (i4 < 28 || i4 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i2, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i2, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i2, -65281);
                }
                if (ObtainAttributes.hasValue(r4)) {
                    f = ObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r4;
                float f2 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i5 = i2;
                int i6 = i5;
                while (i5 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i7 = i6 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i6] = attributeNameResource;
                        i6 = i7;
                    }
                    i5++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i6);
                float f3 = 100.0f;
                boolean z = (f2 < 0.0f || f2 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f != 1.0f || z) {
                    int iAlpha = (int) ((Color.alpha(color) * f) + 0.5f);
                    if (iAlpha < 0) {
                        i = 0;
                    } else {
                        i = KotlinVersion.MAX_COMPONENT_VALUE;
                        if (iAlpha <= 255) {
                            i = iAlpha;
                        }
                    }
                    if (z) {
                        k00 k00VarA = k00.a(color);
                        float f4 = k00VarA.a;
                        float f5 = k00VarA.b;
                        zd4 zd4Var = zd4.k;
                        if (f5 >= 1.0d && Math.round(f2) > 0.0d && Math.round(f2) < 100.0d) {
                            float fMin = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
                            float f6 = 0.0f;
                            float f7 = f5;
                            boolean z2 = r16 == true ? 1 : 0;
                            k00 k00Var = null;
                            while (true) {
                                if (Math.abs(f6 - f5) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (k00Var != null) {
                                        iF = k00Var.c(zd4Var);
                                        break;
                                    }
                                    iF = p23.F(f2);
                                    break;
                                }
                                float f8 = 1000.0f;
                                float f9 = f3;
                                float f10 = 0.0f;
                                float f11 = 1000.0f;
                                k00 k00Var2 = null;
                                while (true) {
                                    if (Math.abs(f10 - f9) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f3 = f3;
                                        break;
                                    }
                                    f3 = f3;
                                    float f12 = ((f9 - f10) / 2.0f) + f10;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iC = k00.b(f12, f7, fMin).c(zd4.k);
                                    float fI = p23.I(Color.red(iC));
                                    float fI2 = p23.I(Color.green(iC));
                                    float fI3 = p23.I(Color.blue(iC));
                                    float[] fArr = p23.d[r16 == true ? 1 : 0];
                                    float f13 = ((fI3 * fArr[2]) + ((fI2 * fArr[r16 == true ? 1 : 0]) + (fI * fArr[0]))) / f3;
                                    float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f2 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        k00 k00VarA2 = k00.a(iC);
                                        k00 k00VarB = k00.b(k00VarA2.c, k00VarA2.b, fMin);
                                        float f14 = k00VarA2.d - k00VarB.d;
                                        float f15 = k00VarA2.e - k00VarB.e;
                                        float f16 = k00VarA2.f - k00VarB.f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f16 * f16) + (f15 * f15) + (f14 * f14)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f11 = fPow;
                                            f8 = fAbs;
                                            k00Var2 = k00VarA2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f8 == 0.0f && f11 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f2) {
                                        f10 = f12;
                                    } else {
                                        f9 = f12;
                                    }
                                    f3 = f3;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                k00 k00Var3 = k00Var2;
                                if (!z2) {
                                    if (k00Var3 == null) {
                                        f5 = f7;
                                    } else {
                                        k00Var = k00Var3;
                                        f6 = f7;
                                    }
                                    f7 = ((f5 - f6) / 2.0f) + f6;
                                } else {
                                    if (k00Var3 != null) {
                                        iF = k00Var3.c(zd4Var);
                                        break;
                                    }
                                    f7 = ((f5 - f6) / 2.0f) + f6;
                                    z2 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iF = p23.F(f2);
                        }
                        color = iF;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i8 = i3 + 1;
                if (i8 > iArr.length) {
                    int[] iArr4 = new int[i3 <= 4 ? 8 : i3 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i3);
                    iArr = iArr4;
                }
                iArr[i3] = color;
                if (i8 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3 > 4 ? i3 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i3);
                    objArr = objArr2;
                }
                objArr[i3] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i3 = i8;
                r4 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i2 = 0;
            } else {
                int i9 = depth2;
                r4 = r4 == true ? 1 : 0;
                depth2 = i9;
                i2 = 0;
            }
        }
        int[] iArr5 = new int[i3];
        int[][] iArr6 = new int[i3][];
        System.arraycopy(iArr, 0, iArr5, 0, i3);
        System.arraycopy(objArr, 0, iArr6, 0, i3);
        return new ColorStateList(iArr6, iArr5);
    }
}
