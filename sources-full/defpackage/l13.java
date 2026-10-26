package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class l13 implements bn2 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final u61 g;
    public static final u61 h;
    public static final xs1 i;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final an2 d;
    public final m13 e = new m13(this);

    static {
        bn bnVar = new bn(1);
        HashMap map = new HashMap();
        map.put(i13.class, bnVar);
        g = new u61("key", Collections.unmodifiableMap(new HashMap(map)));
        bn bnVar2 = new bn(2);
        HashMap map2 = new HashMap();
        map2.put(i13.class, bnVar2);
        h = new u61("value", Collections.unmodifiableMap(new HashMap(map2)));
        i = new xs1(1);
    }

    public l13(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, an2 an2Var) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = an2Var;
    }

    public static int g(u61 u61Var) {
        i13 i13Var = (i13) ((Annotation) u61Var.b.get(i13.class));
        if (i13Var != null) {
            return i13Var.tag();
        }
        throw new k31("Field has no @Protobuf config");
    }

    @Override // defpackage.bn2
    public final bn2 a(u61 u61Var, Object obj) {
        e(u61Var, obj, true);
        return this;
    }

    public final void b(u61 u61Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        i13 i13Var = (i13) ((Annotation) u61Var.b.get(i13.class));
        if (i13Var == null) {
            throw new k31("Field has no @Protobuf config");
        }
        int iOrdinal = i13Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            h(i13Var.tag() << 3);
            h(i2);
        } else if (iOrdinal == 1) {
            h(i13Var.tag() << 3);
            h((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            h((i13Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(u61 u61Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        i13 i13Var = (i13) ((Annotation) u61Var.b.get(i13.class));
        if (i13Var == null) {
            throw new k31("Field has no @Protobuf config");
        }
        int iOrdinal = i13Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            h(i13Var.tag() << 3);
            i(j);
        } else if (iOrdinal == 1) {
            h(i13Var.tag() << 3);
            i((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            h((i13Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // defpackage.bn2
    public final bn2 d(u61 u61Var, long j) throws IOException {
        c(u61Var, j, true);
        return this;
    }

    public final void e(u61 u61Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            h((g(u61Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            h(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(u61Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(i, u61Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            h((g(u61Var) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            h((g(u61Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(u61Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(u61Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            h((g(u61Var) << 3) | 2);
            h(bArr.length);
            this.a.write(bArr);
            return;
        }
        an2 an2Var = (an2) this.b.get(obj.getClass());
        if (an2Var != null) {
            f(an2Var, u61Var, obj, z);
            return;
        }
        za4 za4Var = (za4) this.c.get(obj.getClass());
        if (za4Var != null) {
            m13 m13Var = this.e;
            m13Var.a = false;
            m13Var.c = u61Var;
            m13Var.b = z;
            za4Var.a(obj, m13Var);
            return;
        }
        if (obj instanceof q72) {
            b(u61Var, ((q72) obj).c, true);
        } else if (obj instanceof Enum) {
            b(u61Var, ((Enum) obj).ordinal(), true);
        } else {
            f(this.d, u61Var, obj, z);
        }
    }

    public final void f(an2 an2Var, u61 u61Var, Object obj, boolean z) throws IOException {
        b32 b32Var = new b32();
        b32Var.c = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = b32Var;
            try {
                an2Var.a(obj, this);
                this.a = outputStream;
                long j = b32Var.c;
                b32Var.close();
                if (z && j == 0) {
                    return;
                }
                h((g(u61Var) << 3) | 2);
                i(j);
                an2Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                b32Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | Uuid.SIZE_BITS);
                i2 >>>= 7;
            }
        }
    }

    public final void i(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | Uuid.SIZE_BITS);
                j >>>= 7;
            }
        }
    }
}
