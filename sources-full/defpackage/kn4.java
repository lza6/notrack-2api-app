package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kn4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public kn4(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = 300;
                dh2 dh2Var = hq1.a;
                this.c = new dh2();
                break;
            case 7:
            default:
                this.b = 0;
                this.c = new StringBuilder();
                break;
            case 8:
                this.c = new LinkedHashMap();
                break;
        }
    }

    public /* synthetic */ kn4(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ kn4(int i, boolean z) {
        this.a = i;
    }

    public kn4(Context context) {
        this.a = 1;
        int iG = g7.g(context, 0);
        this.c = new c7(new ContextThemeWrapper(context, g7.g(context, iG)));
        this.b = iG;
    }

    public kn4(ArrayList arrayList) {
        this.a = 9;
        this.c = arrayList;
    }

    public kn4(ml0 ml0Var, int i) {
        this.a = 11;
        g13.s(ml0Var);
        this.c = ml0Var;
        this.b = i;
    }

    public kn4(ws1 ws1Var, tz1 tz1Var) {
        this.a = 5;
        this.c = tz1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(kn4 kn4Var, ks0 ks0Var, wr wrVar) throws Throwable {
        yt1 yt1Var;
        byte bF;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        kn4 kn4Var2;
        byte bE;
        tz1 tz1Var;
        tz1 tz1Var2 = (tz1) kn4Var.c;
        if (wrVar instanceof yt1) {
            yt1Var = (yt1) wrVar;
            int i = yt1Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                yt1Var.o = i - Integer.MIN_VALUE;
            } else {
                yt1Var = new yt1(kn4Var, wrVar);
            }
        } else {
            yt1Var = new yt1(kn4Var, wrVar);
        }
        Object obj = yt1Var.m;
        int i2 = yt1Var.o;
        if (i2 != 0) {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = yt1Var.l;
            linkedHashMap2 = yt1Var.h;
            kn4Var2 = yt1Var.d;
            ks0 ks0Var2 = yt1Var.c;
            g13.O(obj);
            linkedHashMap2.put(str, (JsonElement) obj);
            bE = ((tz1) kn4Var2.c).e();
            if (bE == 4) {
                bF = bE;
                kn4Var = kn4Var2;
                linkedHashMap = linkedHashMap2;
                ks0Var = ks0Var2;
            } else if (bE != 7) {
                tz1.l((tz1) kn4Var2.c, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            tz1Var = (tz1) kn4Var2.c;
            if (bE == 6) {
                tz1Var.f((byte) 7);
            } else if (bE == 4) {
                vl0.U(tz1Var, "object");
                throw null;
            }
            return new JsonObject(linkedHashMap2);
        }
        g13.O(obj);
        bF = tz1Var2.f((byte) 6);
        if (tz1Var2.s() == 4) {
            tz1.l(tz1Var2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        tz1 tz1Var3 = (tz1) kn4Var.c;
        if (tz1Var3.b()) {
            String strI = tz1Var3.i();
            tz1Var3.f((byte) 5);
            yt1Var.c = ks0Var;
            yt1Var.d = kn4Var;
            yt1Var.h = linkedHashMap;
            yt1Var.l = strI;
            yt1Var.o = 1;
            ks0Var.getClass();
            ks0Var.d = yt1Var;
            return hq0.c;
        }
        linkedHashMap2 = linkedHashMap;
        kn4Var2 = kn4Var;
        bE = bF;
        tz1Var = (tz1) kn4Var2.c;
        if (bE == 6) {
            tz1Var.f((byte) 7);
        } else if (bE == 4) {
            vl0.U(tz1Var, "object");
            throw null;
        }
        return new JsonObject(linkedHashMap2);
    }

    public static kn4 g(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f2;
        fp1 fp1Var;
        int i2;
        int i3;
        Object radialGradient;
        int i4;
        TypedArray typedArrayObtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        int i5 = 3;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new kn4(ff0.b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor(), i5, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = e23.d;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", TeXSymbolParser.TYPE_ATTR) != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayObtainAttributes.getColor(1, 0) : 0;
        int i7 = 1;
        int i8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
        typedArrayObtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i7) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = e23.e;
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                    i4 = 0;
                } else {
                    i4 = 0;
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                }
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i4);
                boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                float f11 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i7 = 1;
        }
        if (arrayList2.size() > 0) {
            fp1Var = new fp1();
            int size = arrayList2.size();
            fp1Var.c = new int[size];
            fp1Var.d = new float[size];
            for (int i9 = 0; i9 < size; i9++) {
                ((int[]) fp1Var.c)[i9] = ((Integer) arrayList2.get(i9)).intValue();
                ((float[]) fp1Var.d)[i9] = ((Float) arrayList.get(i9)).floatValue();
            }
        } else {
            fp1Var = null;
        }
        if (fp1Var != null) {
            i3 = 1;
            i2 = 2;
        } else if (z) {
            fp1Var = new fp1();
            fp1Var.c = new int[]{color, color2, color3};
            fp1Var.d = new float[]{0.0f, 0.5f, 1.0f};
            i3 = 1;
            i2 = 2;
        } else {
            fp1Var = new fp1();
            fp1Var.c = new int[]{color, color3};
            i2 = 2;
            fp1Var.d = new float[]{0.0f, 1.0f};
            i3 = 1;
        }
        if (i6 == i3) {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f7, f8, f10, (int[]) fp1Var.c, (float[]) fp1Var.d, i8 != 1 ? i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i6 != i2) {
            radialGradient = new LinearGradient(f, f2, f5, f6, (int[]) fp1Var.c, (float[]) fp1Var.d, i8 != i3 ? i8 != i2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            radialGradient = new SweepGradient(f7, f8, (int[]) fp1Var.c, (float[]) fp1Var.d);
        }
        return new kn4(0, 3, radialGradient);
    }

    public void b(long j) {
        if (e(j)) {
            return;
        }
        int i = this.b;
        long[] jArrCopyOf = (long[]) this.c;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.c = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.b) {
            this.b = i + 1;
        }
    }

    public aw1 c(Float f, int i) {
        aw1 aw1Var = new aw1(f, c11.d);
        ((dh2) this.c).h(i, aw1Var);
        return aw1Var;
    }

    public void d() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = ((LinkedHashMap) this.c).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    s33 s33Var = (s33) ke0.z0(arrayList);
                    if ((s33Var != null ? (am1) s33Var.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((s33) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public boolean e(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.c)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public g7 f() {
        c7 c7Var = (c7) this.c;
        g7 g7Var = new g7(c7Var.a, this.b);
        View view = c7Var.e;
        f7 f7Var = g7Var.n;
        if (view != null) {
            f7Var.r = view;
        } else {
            CharSequence charSequence = c7Var.d;
            if (charSequence != null) {
                f7Var.d = charSequence;
                TextView textView = f7Var.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c7Var.c;
            if (drawable != null) {
                f7Var.n = drawable;
                ImageView imageView = f7Var.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    f7Var.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c7Var.f;
        if (charSequence2 != null) {
            zu zuVar = c7Var.g;
            f7Var.getClass();
            Message messageObtainMessage = zuVar != null ? f7Var.z.obtainMessage(-2, zuVar) : null;
            f7Var.j = charSequence2;
            f7Var.k = messageObtainMessage;
        }
        if (c7Var.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c7Var.b.inflate(f7Var.v, (ViewGroup) null);
            int i = c7Var.l ? f7Var.w : f7Var.x;
            ListAdapter e7Var = c7Var.i;
            if (e7Var == null) {
                e7Var = new e7(c7Var.a, i, R.id.text1, null);
            }
            f7Var.s = e7Var;
            f7Var.t = c7Var.m;
            if (c7Var.j != null) {
                alertController$RecycleListView.setOnItemClickListener(new b7(c7Var, f7Var));
            }
            if (c7Var.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            f7Var.e = alertController$RecycleListView;
        }
        View view2 = c7Var.k;
        if (view2 != null) {
            f7Var.f = view2;
            f7Var.g = false;
        }
        g7Var.setCancelable(true);
        g7Var.setCanceledOnTouchOutside(true);
        g7Var.setOnCancelListener(null);
        g7Var.setOnDismissListener(null);
        jc2 jc2Var = c7Var.h;
        if (jc2Var != null) {
            g7Var.setOnKeyListener(jc2Var);
        }
        return g7Var;
    }

    public void h(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public boolean i() {
        return this.b < ((ArrayList) this.c).size();
    }

    public JsonElement j() throws Throwable {
        JsonElement jsonObject;
        Object obj;
        tz1 tz1Var = (tz1) this.c;
        byte bS = tz1Var.s();
        if (bS == 1) {
            return l(true);
        }
        if (bS == 0) {
            return l(false);
        }
        if (bS != 6) {
            if (bS == 8) {
                return k();
            }
            tz1.l(tz1Var, "Cannot read Json element because of unexpected ".concat(xp1.I(bS)), 0, null, 6);
            throw null;
        }
        int i = this.b + 1;
        this.b = i;
        if (i == 200) {
            xt1 xt1Var = new xt1(this, null);
            ks0 ks0Var = new ks0();
            ks0Var.c = xt1Var;
            ks0Var.d = ks0Var;
            hq0 hq0Var = vl0.e;
            ks0Var.h = hq0Var;
            while (true) {
                obj = ks0Var.h;
                so0 so0Var = ks0Var.d;
                if (so0Var == null) {
                    break;
                }
                if (kr1.n(hq0Var, obj)) {
                    try {
                        xt1 xt1Var2 = ks0Var.c;
                        y64.l(3, xt1Var2);
                        xt1 xt1Var3 = new xt1(xt1Var2.l, so0Var);
                        xt1Var3.h = ks0Var;
                        Object objInvokeSuspend = xt1Var3.invokeSuspend(w84.a);
                        if (objInvokeSuspend != hq0.c) {
                            so0Var.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        so0Var.resumeWith(new i63(th));
                    }
                } else {
                    ks0Var.h = hq0Var;
                    so0Var.resumeWith(obj);
                }
            }
            g13.O(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte bF = tz1Var.f((byte) 6);
            if (tz1Var.s() == 4) {
                tz1.l(tz1Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (tz1Var.b()) {
                String strI = tz1Var.i();
                tz1Var.f((byte) 5);
                linkedHashMap.put(strI, j());
                bF = tz1Var.e();
                if (bF != 4) {
                    if (bF == 7) {
                        break;
                    }
                    tz1.l(tz1Var, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bF == 6) {
                tz1Var.f((byte) 7);
            } else if (bF == 4) {
                vl0.U(tz1Var, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.b--;
        return jsonObject;
    }

    public JsonArray k() {
        tz1 tz1Var = (tz1) this.c;
        byte bE = tz1Var.e();
        if (tz1Var.s() == 4) {
            tz1.l(tz1Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (tz1Var.b()) {
            arrayList.add(j());
            bE = tz1Var.e();
            if (bE != 4) {
                boolean z = bE == 9;
                int i = tz1Var.b;
                if (!z) {
                    tz1.l(tz1Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bE == 8) {
            tz1Var.f((byte) 9);
        } else if (bE == 4) {
            vl0.U(tz1Var, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    public JsonPrimitive l(boolean z) {
        tz1 tz1Var = (tz1) this.c;
        String strJ = !z ? tz1Var.j() : tz1Var.i();
        return (z || !kr1.n(strJ, "null")) ? new lt1(strJ, z) : JsonNull.INSTANCE;
    }

    public void m() {
        k30 k30Var = k30.c;
        char[] cArr = (char[]) this.c;
        k30Var.getClass();
        cArr.getClass();
        synchronized (k30Var) {
            int i = k30Var.b;
            if (cArr.length + i < tl.a) {
                k30Var.b = i + cArr.length;
                k30Var.a.addLast(cArr);
            }
        }
    }

    public void n(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.c)[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public void o(cc2 cc2Var, am1 am1Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object arrayList = linkedHashMap.get(cc2Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(cc2Var, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        s33 s33Var = new s33(new WeakReference(am1Var), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(s33Var);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                s33 s33Var2 = (s33) arrayList2.get(i);
                if (j >= s33Var2.c) {
                    if (s33Var2.a.get() == am1Var) {
                        arrayList2.set(i, s33Var);
                        break;
                    } else {
                        arrayList2.add(i, s33Var);
                        break;
                    }
                }
            }
        }
        d();
    }

    public void p(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        h(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String q(ms4 ms4Var) {
        String str;
        fo4 fo4Var = (fo4) this.c;
        int i = this.b;
        try {
            if (fo4Var.F == null) {
                throw null;
            }
            hm4 hm4Var = fo4Var.F;
            String packageName = fo4Var.D.getPackageName();
            if (i == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i == 4) {
                str = "CONSUME_ASYNC";
            } else if (i != 5) {
                str = i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            xn4 xn4Var = new xn4(ms4Var);
            cm4 cm4Var = (cm4) hm4Var;
            Parcel parcelB = cm4Var.b();
            parcelB.writeString(packageName);
            parcelB.writeString(str);
            int i2 = bm4.a;
            parcelB.writeStrongBinder(xn4Var);
            try {
                cm4Var.e.transact(1, parcelB, null, 1);
                return "billingOverrideService.getBillingOverride";
            } finally {
                parcelB.recycle();
            }
        } catch (Exception e) {
            fo4Var.E(95, 28, jo4.q);
            tm4.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            ms4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }
}
