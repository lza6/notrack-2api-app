package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class co3 extends xr0 implements bt1 {
    public final rs1 h;
    public final gj4 i;
    public final tz1 j;
    public final zf3 k;
    public int l;
    public d5 m;
    public final ws1 n;
    public final ft1 o;

    public co3(rs1 rs1Var, gj4 gj4Var, tz1 tz1Var, tf3 tf3Var, d5 d5Var) {
        tf3Var.getClass();
        this.h = rs1Var;
        this.i = gj4Var;
        this.j = tz1Var;
        this.k = rs1Var.b;
        this.l = -1;
        this.m = d5Var;
        ws1 ws1Var = rs1Var.a;
        this.n = ws1Var;
        this.o = ws1Var.c ? null : new ft1(tf3Var);
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final nk0 B(tf3 tf3Var) {
        tf3Var.getClass();
        rs1 rs1Var = this.h;
        gj4 gj4VarB = hj4.b(rs1Var, tf3Var);
        tz1 tz1Var = this.j;
        gj gjVar = (gj) tz1Var.c;
        int i = gjVar.b + 1;
        gjVar.b = i;
        Object[] objArr = (Object[]) gjVar.c;
        if (i == objArr.length) {
            int i2 = i * 2;
            gjVar.c = Arrays.copyOf(objArr, i2);
            gjVar.d = Arrays.copyOf((int[]) gjVar.d, i2);
        }
        ((Object[]) gjVar.c)[i] = tf3Var;
        tz1Var.g(gj4VarB.c);
        if (tz1Var.s() == 4) {
            tz1.l(tz1Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = gj4VarB.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new co3(rs1Var, gj4VarB, tz1Var, tf3Var, this.m);
        }
        return (this.i == gj4VarB && rs1Var.a.c) ? this : new co3(rs1Var, gj4VarB, tz1Var, tf3Var, this.m);
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final double C() {
        tz1 tz1Var = this.j;
        String strJ = tz1Var.j();
        try {
            double d = Double.parseDouble(strJ);
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            vl0.d0(tz1Var, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            tz1.l(tz1Var, "Failed to parse type 'double' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:37:0x0116  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0116, please report this as an issue */
    @Override // defpackage.xr0, defpackage.hs0
    public final Object a(qu1 qu1Var) {
        String message;
        rs1 rs1Var = this.h;
        tz1 tz1Var = this.j;
        gj gjVar = (gj) tz1Var.c;
        qu1Var.getClass();
        try {
            if (!(qu1Var instanceof rc3)) {
                return qu1Var.deserialize(this);
            }
            String strW = kr1.w(rs1Var, ((rc3) qu1Var).getDescriptor());
            String strR = tz1Var.r(strW);
            String content = null;
            if (strR != null) {
                try {
                    qu1 qu1VarR = av1.r((rc3) qu1Var, this, strR);
                    d5 d5Var = new d5(15);
                    d5Var.d = strW;
                    this.m = d5Var;
                    return qu1VarR.deserialize(this);
                } catch (ag3 e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strK0 = mo3.K0(mo3.R0('\n', message2), ".");
                    String message3 = e.getMessage();
                    message3.getClass();
                    tz1.l(tz1Var, strK0, 0, mo3.O0(message3, '\n', BuildConfig.VERSION_NAME), 2);
                    throw null;
                }
            }
            String strW2 = kr1.w(rs1Var, ((rc3) qu1Var).getDescriptor());
            JsonElement jsonElementL = l();
            String strB = ((rc3) qu1Var).getDescriptor().b();
            if (!(jsonElementL instanceof JsonObject)) {
                throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonObject.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementL.getClass()).c) + " as the serialized body of " + strB + " at element: " + gjVar.j(), jsonElementL.toString());
            }
            JsonObject jsonObject = (JsonObject) jsonElementL;
            JsonElement jsonElement = (JsonElement) jsonObject.get(strW2);
            if (jsonElement != null) {
                JsonPrimitive jsonPrimitiveB = et1.b(jsonElement);
                if (!(jsonPrimitiveB instanceof JsonNull)) {
                    content = jsonPrimitiveB.getContent();
                }
            }
            try {
                return g13.L(rs1Var, strW2, jsonObject, av1.r((rc3) qu1Var, this, content));
            } catch (ag3 e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw vl0.e(-1, message4, jsonObject.toString());
            }
            message = e.getMessage();
            message.getClass();
            if (mo3.u0(message, "at path", false)) {
                throw e;
            }
            throw new ke2(e.c, e.getMessage() + " at path: " + gjVar.j(), e);
        } catch (ke2 e3) {
            message = e3.getMessage();
            message.getClass();
            if (mo3.u0(message, "at path", false)) {
                throw e3;
            }
            throw new ke2(e3.c, e3.getMessage() + " at path: " + gjVar.j(), e3);
        }
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final long b() {
        return this.j.h();
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final boolean d() {
        boolean z;
        boolean z2;
        tz1 tz1Var = this.j;
        int iV = tz1Var.v();
        String str = (String) tz1Var.f;
        if (iV == str.length()) {
            tz1.l(tz1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iV) == '\"') {
            iV++;
            z = true;
        } else {
            z = false;
        }
        int iU = tz1Var.u(iV);
        if (iU >= str.length() || iU == -1) {
            tz1.l(tz1Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = iU + 1;
        int iCharAt = str.charAt(iU) | ' ';
        if (iCharAt == 102) {
            tz1Var.c(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                tz1.l(tz1Var, "Expected valid boolean literal prefix, but had '" + tz1Var.j() + '\'', 0, null, 6);
                throw null;
            }
            tz1Var.c(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (tz1Var.b == str.length()) {
            tz1.l(tz1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(tz1Var.b) == '\"') {
            tz1Var.b++;
            return z2;
        }
        tz1.l(tz1Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final boolean e() {
        boolean z;
        ft1 ft1Var = this.o;
        if (!(ft1Var != null ? ft1Var.b : false)) {
            tz1 tz1Var = this.j;
            int iU = tz1Var.u(tz1Var.v());
            String str = (String) tz1Var.f;
            int length = str.length() - iU;
            if (length >= 4 && iU != -1) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        if (length <= 4 || xp1.f(str.charAt(iU + 4)) != 0) {
                            tz1Var.b = iU + 4;
                            z = true;
                            break;
                        }
                    } else if ("null".charAt(i) == str.charAt(iU + i)) {
                        i++;
                    }
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final char f() {
        tz1 tz1Var = this.j;
        String strJ = tz1Var.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        tz1.l(tz1Var, "Expected single char, but got '" + strJ + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0292 A[EDGE_INSN: B:139:0x0292->B:140:0x0293 BREAK  A[LOOP:0: B:45:0x0096->B:119:0x0218]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // defpackage.nk0
    public final int h(tf3 tf3Var) {
        byte b;
        boolean z;
        tz1 tz1Var = this.j;
        gj gjVar = (gj) tz1Var.c;
        String str = (String) tz1Var.f;
        tf3Var.getClass();
        gj4 gj4Var = this.i;
        int iOrdinal = gj4Var.ordinal();
        char c = ':';
        boolean zX = false;
        byte b2 = 1;
        int i = -1;
        if (iOrdinal == 0) {
            boolean zX2 = tz1Var.x();
            while (true) {
                boolean zB = tz1Var.b();
                byte b3 = b2;
                ft1 ft1Var = this.o;
                if (zB) {
                    String strD = tz1Var.d();
                    tz1Var.g(c);
                    tf3Var.getClass();
                    rs1 rs1Var = this.h;
                    rs1Var.getClass();
                    strD.getClass();
                    ot1.a(rs1Var, tf3Var);
                    int iA = tf3Var.a(strD);
                    if (iA == -3 && rs1Var.a.f) {
                        jb jbVar = rs1Var.c;
                        ye yeVar = new ye(tf3Var, 17, rs1Var);
                        jbVar.getClass();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jbVar.d;
                        Map map = (Map) concurrentHashMap.get(tf3Var);
                        rn0 rn0Var = ot1.a;
                        Object objInvoke = map != null ? map.get(rn0Var) : null;
                        if (objInvoke == null) {
                            objInvoke = null;
                        }
                        if (objInvoke == null) {
                            objInvoke = yeVar.invoke();
                            Object concurrentHashMap2 = concurrentHashMap.get(tf3Var);
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap(2);
                                concurrentHashMap.put(tf3Var, concurrentHashMap2);
                            }
                            ((Map) concurrentHashMap2).put(rn0Var, objInvoke);
                        }
                        Integer num = (Integer) ((Map) objInvoke).get(strD);
                        iA = num != null ? num.intValue() : -3;
                    }
                    if (iA != -3) {
                        if (ft1Var != null) {
                            s11 s11Var = ft1Var.a;
                            if (iA < 64) {
                                s11Var.a |= 1 << iA;
                            } else {
                                int i2 = (iA >>> 6) - 1;
                                long[] jArr = (long[]) s11Var.d;
                                jArr[i2] = jArr[i2] | (1 << (iA & 63));
                            }
                        }
                        i = iA;
                        break;
                    }
                    if (!this.n.b) {
                        d5 d5Var = this.m;
                        if (d5Var == null || !kr1.n(d5Var.d, strD)) {
                            tz1Var.k("Encountered an unknown key '" + strD + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.", mo3.F0(str.subSequence(0, tz1Var.b).toString(), strD, 6));
                            throw null;
                        }
                        d5Var.d = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bS = tz1Var.s();
                    byte b4 = 6;
                    if (bS == 8 || bS == 6) {
                        while (true) {
                            byte bS2 = tz1Var.s();
                            b = b3;
                            if (bS2 == b) {
                                tz1Var.d();
                            } else {
                                if (bS2 == 8 || bS2 == b4) {
                                    z = false;
                                    arrayList.add(Byte.valueOf(bS2));
                                } else {
                                    if (bS2 == 9) {
                                        if (((Number) ke0.E0(arrayList)).byteValue() != 8) {
                                            throw vl0.e(tz1Var.b, "found ] instead of } at path: " + gjVar, str);
                                        }
                                        pe0.t0(arrayList);
                                    } else if (bS2 == 7) {
                                        if (((Number) ke0.E0(arrayList)).byteValue() != 6) {
                                            throw vl0.e(tz1Var.b, "found } instead of ] at path: " + gjVar, str);
                                        }
                                        pe0.t0(arrayList);
                                    } else if (bS2 == 10) {
                                        tz1.l(tz1Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    b4 = 6;
                                    z = false;
                                }
                                tz1Var.e();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                            b3 = b;
                        }
                    } else {
                        tz1Var.j();
                        b = b3;
                        z = false;
                    }
                    zX2 = tz1Var.x();
                    b2 = b;
                    zX = z;
                    c = ':';
                } else {
                    boolean z2 = zX;
                    if (!zX2) {
                        if (ft1Var == null) {
                            i = -1;
                            break;
                        }
                        s11 s11Var2 = ft1Var.a;
                        ca0 ca0Var = (ca0) s11Var2.c;
                        tf3 tf3Var2 = (tf3) s11Var2.b;
                        int iD = tf3Var2.d();
                        while (true) {
                            long j = s11Var2.a;
                            if (j == -1) {
                                if (iD <= 64) {
                                    i = -1;
                                    break;
                                }
                                long[] jArr2 = (long[]) s11Var2.d;
                                int length = jArr2.length;
                                ?? r10 = z2;
                                loop3: while (true) {
                                    if (r10 >= length) {
                                        i = -1;
                                        break;
                                    }
                                    int i3 = r10 + 1;
                                    int i4 = i3 * 64;
                                    long j2 = jArr2[r10];
                                    while (true) {
                                        if (j2 != -1) {
                                            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                            j2 |= 1 << iNumberOfTrailingZeros;
                                            i = iNumberOfTrailingZeros + i4;
                                            if (((Boolean) ca0Var.invoke(tf3Var2, Integer.valueOf(i))).booleanValue()) {
                                                jArr2[r10] = j2;
                                                break;
                                            }
                                        } else {
                                            jArr2[r10] = j2;
                                            r10 = i3;
                                        }
                                    }
                                }
                            } else {
                                int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                                s11Var2.a |= 1 << iNumberOfTrailingZeros2;
                                if (((Boolean) ca0Var.invoke(tf3Var2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                    i = iNumberOfTrailingZeros2;
                                    break;
                                }
                            }
                        }
                    } else {
                        vl0.U(tz1Var, "object");
                        throw null;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zX3 = tz1Var.x();
            if (tz1Var.b()) {
                int i5 = this.l;
                if (i5 != -1 && !zX3) {
                    tz1.l(tz1Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i = i5 + 1;
                this.l = i;
            } else if (zX3) {
                vl0.U(tz1Var, "array");
                throw null;
            }
        } else {
            int i6 = this.l;
            boolean z3 = i6 % 2 != 0;
            if (!z3) {
                tz1Var.g(':');
            } else if (i6 != -1) {
                zX = tz1Var.x();
            }
            if (tz1Var.b()) {
                if (z3) {
                    int i7 = this.l;
                    int i8 = tz1Var.b;
                    if (i7 == -1) {
                        if (zX) {
                            tz1.l(tz1Var, "Unexpected leading comma", i8, null, 4);
                            throw null;
                        }
                    } else if (!zX) {
                        tz1.l(tz1Var, "Expected comma after the key-value pair", i8, null, 4);
                        throw null;
                    }
                }
                i = this.l + 1;
                this.l = i;
            } else if (zX) {
                vl0.U(tz1Var, "object");
                throw null;
            }
        }
        if (gj4Var != gj4.MAP) {
            ((int[]) gjVar.d)[gjVar.b] = i;
        }
        return i;
    }

    @Override // defpackage.bt1
    public final JsonElement l() {
        return new kn4(this.h.a, this.j).j();
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final int o() {
        tz1 tz1Var = this.j;
        long jH = tz1Var.h();
        int i = (int) jH;
        if (jH == i) {
            return i;
        }
        tz1.l(tz1Var, "Failed to parse int for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.xr0, defpackage.nk0
    public final void q(tf3 tf3Var) {
        tf3Var.getClass();
        if (this.h.a.b && tf3Var.d() == 0) {
            while (h(tf3Var) != -1) {
            }
        }
        tz1 tz1Var = this.j;
        if (tz1Var.x()) {
            vl0.U(tz1Var, BuildConfig.VERSION_NAME);
            throw null;
        }
        tz1Var.g(this.i.d);
        gj gjVar = (gj) tz1Var.c;
        int i = gjVar.b;
        int[] iArr = (int[]) gjVar.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            gjVar.b = i - 1;
        }
        int i2 = gjVar.b;
        if (i2 != -1) {
            gjVar.b = i2 - 1;
        }
    }

    @Override // defpackage.nk0
    public final zf3 r() {
        return this.k;
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final byte t() {
        tz1 tz1Var = this.j;
        long jH = tz1Var.h();
        byte b = (byte) jH;
        if (jH == b) {
            return b;
        }
        tz1.l(tz1Var, "Failed to parse byte for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final hs0 u(tf3 tf3Var) {
        tf3Var.getClass();
        return eo3.a(tf3Var) ? new ct1(this.j, this.h) : this;
    }

    @Override // defpackage.xr0, defpackage.nk0
    public final Object v(tf3 tf3Var, int i, qu1 qu1Var, Object obj) {
        gj gjVar = (gj) this.j.c;
        tf3Var.getClass();
        qu1Var.getClass();
        boolean z = this.i == gj4.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) gjVar.d;
            int i2 = gjVar.b;
            if (iArr[i2] == -2) {
                ((Object[]) gjVar.c)[i2] = t73.r;
            }
        }
        Object objA = a(qu1Var);
        if (z) {
            int[] iArr2 = (int[]) gjVar.d;
            int i3 = gjVar.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                gjVar.b = i4;
                Object[] objArr = (Object[]) gjVar.c;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    gjVar.c = Arrays.copyOf(objArr, i5);
                    gjVar.d = Arrays.copyOf((int[]) gjVar.d, i5);
                }
            }
            Object[] objArr2 = (Object[]) gjVar.c;
            int i6 = gjVar.b;
            objArr2[i6] = objA;
            ((int[]) gjVar.d)[i6] = -2;
        }
        return objA;
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final short x() {
        tz1 tz1Var = this.j;
        long jH = tz1Var.h();
        short s = (short) jH;
        if (jH == s) {
            return s;
        }
        tz1.l(tz1Var, "Failed to parse short for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final String y() {
        return this.j.i();
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final float z() {
        tz1 tz1Var = this.j;
        String strJ = tz1Var.j();
        try {
            float f = Float.parseFloat(strJ);
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            vl0.d0(tz1Var, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            tz1.l(tz1Var, "Failed to parse type 'float' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }
}
