package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.graphics.vector.ImageVector$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.template.extension.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.ConstantsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class wb4 {
    /* JADX WARN: Code duplicated, block: B:132:0x0338  */
    /* JADX WARN: Code duplicated, block: B:133:0x033a  */
    /* JADX WARN: Code duplicated, block: B:136:0x034c  */
    /* JADX WARN: Code duplicated, block: B:138:0x034f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0352  */
    /* JADX WARN: Code duplicated, block: B:140:0x0355  */
    /* JADX WARN: Code duplicated, block: B:143:0x0393  */
    /* JADX WARN: Code duplicated, block: B:144:0x0398  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:151:0x03be  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:163:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    public static final zm1 a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        long jB;
        int i2;
        int i3;
        float f;
        int i4;
        TypedArray typedArrayObtainStyledAttributes;
        int i5;
        TypedArray typedArrayObtainStyledAttributes2;
        int i6;
        int i7;
        int i8;
        int i9;
        Shader shader;
        int i10;
        yx vl3Var;
        Shader shader2;
        int i11;
        yx vl3Var2;
        int i12;
        ColorStateList colorStateListA;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
        de deVar = new de(xmlResourceParser2);
        int[] iArr = xp1.c;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        deVar.c(typedArrayObtainAttributes.getChangingConfigurations());
        boolean z = !sf3.I(xmlResourceParser2, "autoMirrored") ? false : typedArrayObtainAttributes.getBoolean(5, false);
        deVar.c(typedArrayObtainAttributes.getChangingConfigurations());
        float fB = deVar.b(typedArrayObtainAttributes, "viewportWidth", 7, 0.0f);
        float fB2 = deVar.b(typedArrayObtainAttributes, "viewportHeight", 8, 0.0f);
        if (fB <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fB2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = typedArrayObtainAttributes.getDimension(3, 0.0f);
        deVar.c(typedArrayObtainAttributes.getChangingConfigurations());
        float dimension2 = typedArrayObtainAttributes.getDimension(2, 0.0f);
        deVar.c(typedArrayObtainAttributes.getChangingConfigurations());
        int i13 = 1;
        if (typedArrayObtainAttributes.hasValue(1)) {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainAttributes.getValue(1, typedValue);
            if (typedValue.type == 2) {
                jB = re0.i;
            } else {
                if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                    TypedValue typedValue2 = new TypedValue();
                    typedArrayObtainAttributes.getValue(1, typedValue2);
                    int i14 = typedValue2.type;
                    if (i14 == 2) {
                        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue2);
                    }
                    if (i14 < 28 || i14 > 31) {
                        Resources resources2 = typedArrayObtainAttributes.getResources();
                        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                        ThreadLocal threadLocal = ff0.a;
                        try {
                            colorStateListA = ff0.a(resources2, resources2.getXml(resourceId), theme);
                        } catch (Exception e) {
                            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                            colorStateListA = null;
                        }
                    } else {
                        colorStateListA = ColorStateList.valueOf(typedValue2.data);
                    }
                } else {
                    colorStateListA = null;
                }
                deVar.c(typedArrayObtainAttributes.getChangingConfigurations());
                jB = colorStateListA != null ? gb2.b(colorStateListA.getDefaultColor()) : re0.i;
            }
        } else {
            jB = re0.i;
        }
        int i15 = typedArrayObtainAttributes.getInt(6, -1);
        deVar.c(typedArrayObtainAttributes.getChangingConfigurations());
        if (i15 == -1) {
            i2 = 5;
        } else if (i15 == 3) {
            i2 = 3;
        } else if (i15 == 5) {
            i2 = 5;
        } else if (i15 != 9) {
            switch (i15) {
                case 14:
                    i2 = 13;
                    break;
                case 15:
                    i2 = 14;
                    break;
                case 16:
                    i2 = 12;
                    break;
                default:
                    i2 = 5;
                    break;
            }
        } else {
            i2 = 9;
        }
        float f2 = dimension / resources.getDisplayMetrics().density;
        float f3 = dimension2 / resources.getDisplayMetrics().density;
        typedArrayObtainAttributes.recycle();
        ArrayList arrayList = new ArrayList();
        xm1 xm1Var = new xm1(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        arrayList.add(xm1Var);
        int i16 = 0;
        for (int i17 = 3; xmlResourceParser2.getEventType() != i13 && (xmlResourceParser2.getDepth() >= i13 || xmlResourceParser2.getEventType() != i17); i17 = 3) {
            XmlPullParser xmlPullParser = deVar.a;
            int i18 = i13;
            int eventType = xmlPullParser.getEventType();
            if (eventType != 2) {
                if (eventType == i17 && "group".equals(xmlPullParser.getName())) {
                    int i19 = 0;
                    for (int i20 = i16 + 1; i19 < i20; i20 = i20) {
                        xm1 xm1Var2 = (xm1) arrayList.remove(arrayList.size() - 1);
                        ((xm1) arrayList.get(arrayList.size() - 1)).j.add(new ob4(xm1Var2.a, xm1Var2.b, xm1Var2.c, xm1Var2.d, xm1Var2.e, xm1Var2.f, xm1Var2.g, xm1Var2.h, xm1Var2.i, xm1Var2.j));
                        i19++;
                    }
                    i3 = i2;
                    f = f2;
                    i16 = 0;
                }
                xmlResourceParser.next();
                xmlResourceParser2 = xmlResourceParser;
                i2 = i3;
                f2 = f;
                i13 = 1;
            } else {
                String name = xmlPullParser.getName();
                if (name != null) {
                    int iHashCode = name.hashCode();
                    List listA = z21.c;
                    i3 = i2;
                    m4 m4Var = deVar.c;
                    if (iHashCode != -1649314686) {
                        f = f2;
                        if (iHashCode != 3433509) {
                            if (iHashCode == 98629247 && name.equals("group")) {
                                int[] iArr2 = xp1.d;
                                TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr2) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                deVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                float fB3 = deVar.b(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                float f4 = typedArrayObtainAttributes2.getFloat(i18, 0.0f);
                                deVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                float f5 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                deVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                float fB4 = deVar.b(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                float fB5 = deVar.b(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                float fB6 = deVar.b(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                float fB7 = deVar.b(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                String string = typedArrayObtainAttributes2.getString(0);
                                deVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                String str = string == null ? BuildConfig.VERSION_NAME : string;
                                typedArrayObtainAttributes2.recycle();
                                int i21 = pb4.a;
                                arrayList.add(new xm1(str, fB3, f4, f5, fB4, fB5, fB6, fB7, listA, ConstantsKt.MINIMUM_BLOCK_SIZE));
                            }
                        } else if (name.equals("path")) {
                            int[] iArr3 = xp1.e;
                            if (theme == null) {
                                typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                i5 = 0;
                            } else {
                                i5 = 0;
                                typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                            }
                            deVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                u41.k("No path data available");
                                return null;
                            }
                            String string2 = typedArrayObtainStyledAttributes2.getString(i5);
                            deVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                            String str2 = string2 == null ? BuildConfig.VERSION_NAME : string2;
                            String string3 = typedArrayObtainStyledAttributes2.getString(2);
                            deVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                            if (string3 == null) {
                                int i22 = pb4.a;
                            } else {
                                listA = m4.a(m4Var, string3);
                            }
                            List list = listA;
                            kn4 kn4VarA = deVar.a(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                            float fB8 = deVar.b(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                            int i23 = !sf3.I(xmlPullParser, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                            deVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                            if (i23 != 0) {
                                if (i23 == 1) {
                                    i6 = 1;
                                } else if (i23 == 2) {
                                    i6 = 2;
                                }
                                if (sf3.I(xmlPullParser, "strokeLineJoin")) {
                                    i7 = typedArrayObtainStyledAttributes2.getInt(9, -1);
                                } else {
                                    i7 = -1;
                                }
                                deVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i7 != 0) {
                                    i8 = 0;
                                } else if (i7 != 1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                float fB9 = deVar.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                kn4 kn4VarA2 = deVar.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                float fB10 = deVar.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                float fB11 = deVar.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                float fB12 = deVar.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                float fB13 = deVar.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                float fB14 = deVar.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                if (sf3.I(xmlPullParser, "fillType")) {
                                    i9 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                } else {
                                    i9 = 0;
                                }
                                deVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                typedArrayObtainStyledAttributes2.recycle();
                                shader = (Shader) kn4VarA.c;
                                i10 = kn4VarA.b;
                                if (shader == null && i10 == 0) {
                                    vl3Var = null;
                                } else if (shader != null) {
                                    vl3Var = new zx(shader);
                                } else {
                                    vl3Var = new vl3(gb2.b(i10));
                                }
                                shader2 = (Shader) kn4VarA2.c;
                                i11 = kn4VarA2.b;
                                if (shader2 == null && i11 == 0) {
                                    vl3Var2 = null;
                                } else if (shader2 != null) {
                                    vl3Var2 = new zx(shader2);
                                } else {
                                    vl3Var2 = new vl3(gb2.b(i11));
                                }
                                if (i9 == 0) {
                                    i12 = 0;
                                } else {
                                    i12 = 1;
                                }
                                ((xm1) arrayList.get(arrayList.size() - 1)).j.add(new vb4(str2, list, i12, vl3Var, fB8, vl3Var2, fB10, fB11, i6, i8, fB9, fB14, fB12, fB13));
                            }
                            i6 = 0;
                            if (sf3.I(xmlPullParser, "strokeLineJoin")) {
                                i7 = -1;
                            } else {
                                i7 = typedArrayObtainStyledAttributes2.getInt(9, -1);
                            }
                            deVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                            if (i7 != 0) {
                                i8 = 0;
                            } else if (i7 != 1) {
                                i8 = 2;
                            } else {
                                i8 = 1;
                            }
                            float fB15 = deVar.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                            kn4 kn4VarA3 = deVar.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                            float fB16 = deVar.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                            float fB17 = deVar.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                            float fB18 = deVar.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                            float fB19 = deVar.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                            float fB110 = deVar.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                            if (sf3.I(xmlPullParser, "fillType")) {
                                i9 = 0;
                            } else {
                                i9 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                            }
                            deVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                            typedArrayObtainStyledAttributes2.recycle();
                            shader = (Shader) kn4VarA.c;
                            i10 = kn4VarA.b;
                            if (shader == null) {
                                vl3Var = null;
                            } else if (shader != null) {
                                vl3Var = new zx(shader);
                            } else {
                                vl3Var = new vl3(gb2.b(i10));
                            }
                            shader2 = (Shader) kn4VarA3.c;
                            i11 = kn4VarA3.b;
                            if (shader2 == null) {
                                vl3Var2 = null;
                            } else if (shader2 != null) {
                                vl3Var2 = new zx(shader2);
                            } else {
                                vl3Var2 = new vl3(gb2.b(i11));
                            }
                            if (i9 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 1;
                            }
                            ((xm1) arrayList.get(arrayList.size() - 1)).j.add(new vb4(str2, list, i12, vl3Var, fB8, vl3Var2, fB16, fB17, i6, i8, fB15, fB110, fB18, fB19));
                        }
                    } else {
                        f = f2;
                        if (name.equals("clip-path")) {
                            int[] iArr4 = xp1.f;
                            if (theme == null) {
                                typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                                i4 = 0;
                            } else {
                                i4 = 0;
                                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                            }
                            deVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                            String string4 = typedArrayObtainStyledAttributes.getString(i4);
                            deVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                            String str3 = string4 == null ? BuildConfig.VERSION_NAME : string4;
                            String string5 = typedArrayObtainStyledAttributes.getString(1);
                            deVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                            if (string5 == null) {
                                int i24 = pb4.a;
                            } else {
                                listA = m4.a(m4Var, string5);
                            }
                            List list2 = listA;
                            typedArrayObtainStyledAttributes.recycle();
                            arrayList.add(new xm1(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, ConstantsKt.MINIMUM_BLOCK_SIZE));
                            i16++;
                        }
                    }
                    xmlResourceParser.next();
                    xmlResourceParser2 = xmlResourceParser;
                    i2 = i3;
                    f2 = f;
                    i13 = 1;
                }
                xmlResourceParser.next();
                xmlResourceParser2 = xmlResourceParser;
                i2 = i3;
                f2 = f;
                i13 = 1;
            }
            i3 = i2;
            f = f2;
            xmlResourceParser.next();
            xmlResourceParser2 = xmlResourceParser;
            i2 = i3;
            f2 = f;
            i13 = 1;
        }
        int i25 = i2;
        float f6 = f2;
        while (arrayList.size() > 1) {
            xm1 xm1Var3 = (xm1) arrayList.remove(arrayList.size() - 1);
            ((xm1) arrayList.get(arrayList.size() - 1)).j.add(new ob4(xm1Var3.a, xm1Var3.b, xm1Var3.c, xm1Var3.d, xm1Var3.e, xm1Var3.f, xm1Var3.g, xm1Var3.h, xm1Var3.i, xm1Var3.j));
        }
        return new zm1(new ym1(BuildConfig.VERSION_NAME, f6, f3, fB, fB2, new ob4(xm1Var.a, xm1Var.b, xm1Var.c, xm1Var.d, xm1Var.e, xm1Var.f, xm1Var.g, xm1Var.h, xm1Var.i, xm1Var.j), jB, i25, z), i);
    }

    public static final ym1 vectorResource(ImageVector$Companion imageVector$Companion, int i, ck0 ck0Var, int i2) throws XmlPullParserException, IOException {
        kk0 kk0Var = (kk0) ck0Var;
        Context context = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = d63.resources(kk0Var, 0);
        Resources.Theme theme = context.getTheme();
        boolean zH = kk0Var.h(resources) | ((((i2 & 112) ^ 48) > 32 && kk0Var.f(i)) || (i2 & 48) == 32) | kk0Var.h(theme) | kk0Var.h(resources.getConfiguration());
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            objP = a(theme, resources, xml, typedValue.changingConfigurations).a;
            kk0Var.l0(objP);
        }
        return (ym1) objP;
    }
}
