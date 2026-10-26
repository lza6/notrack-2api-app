package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class de {
    public final XmlPullParser a;
    public int b = 0;
    public final m4 c;

    public de(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        m4 m4Var = new m4();
        m4Var.b = new float[64];
        this.c = m4Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    public final kn4 a(TypedArray typedArray, Resources.Theme theme, String str, int i) throws XmlPullParserException, IOException {
        kn4 kn4Var;
        int i2 = 3;
        Object obj = null;
        int i3 = 0;
        if (sf3.I(this.a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i4 = typedValue.type;
            if (i4 < 28 || i4 > 31) {
                try {
                    kn4Var = kn4.g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    kn4Var = null;
                }
                if (kn4Var == null) {
                    kn4Var = new kn4(i3, i2, obj);
                }
            } else {
                kn4Var = new kn4(typedValue.data, i2, obj);
            }
        } else {
            kn4Var = new kn4(i3, i2, obj);
        }
        c(typedArray.getChangingConfigurations());
        return kn4Var;
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        if (sf3.I(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        c(typedArray.getChangingConfigurations());
        return f;
    }

    public final void c(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de)) {
            return false;
        }
        de deVar = (de) obj;
        return kr1.n(this.a, deVar.a) && this.b == deVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return fq2.p(sb, this.b, ')');
    }
}
