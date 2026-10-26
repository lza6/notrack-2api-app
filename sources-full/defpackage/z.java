package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class z implements bt1, hs0, nk0 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final rs1 c;
    public final String d;
    public final ws1 e;

    public z(rs1 rs1Var, String str) {
        this.c = rs1Var;
        this.d = str;
        this.e = rs1Var.a;
    }

    @Override // defpackage.nk0
    public final long A(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return M(Q(tf3Var, i));
    }

    @Override // defpackage.hs0
    public nk0 B(tf3 tf3Var) {
        tf3Var.getClass();
        JsonElement jsonElementE = E();
        yo4 yo4VarC = tf3Var.c();
        boolean zN = kr1.n(yo4VarC, zo3.o);
        rs1 rs1Var = this.c;
        if (zN || (yo4VarC instanceof nx2)) {
            String strB = tf3Var.b();
            if (jsonElementE instanceof JsonArray) {
                return new vt1(rs1Var, (JsonArray) jsonElementE);
            }
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonArray.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementE.getClass()).c) + " as the serialized body of " + strB + " at element: " + T(), jsonElementE.toString());
        }
        if (!kr1.n(yo4VarC, zo3.p)) {
            String strB2 = tf3Var.b();
            if (jsonElementE instanceof JsonObject) {
                return new ut1(rs1Var, (JsonObject) jsonElementE, this.d, 8);
            }
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonObject.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementE.getClass()).c) + " as the serialized body of " + strB2 + " at element: " + T(), jsonElementE.toString());
        }
        tf3 tf3VarA = hj4.a(tf3Var.i(0), rs1Var.b);
        yo4 yo4VarC2 = tf3VarA.c();
        if (!(yo4VarC2 instanceof cz2) && !kr1.n(yo4VarC2, yf3.n)) {
            throw vl0.c(tf3VarA);
        }
        String strB3 = tf3Var.b();
        if (jsonElementE instanceof JsonObject) {
            return new wt1(rs1Var, (JsonObject) jsonElementE);
        }
        throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonObject.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementE.getClass()).c) + " as the serialized body of " + strB3 + " at element: " + T(), jsonElementE.toString());
    }

    @Override // defpackage.hs0
    public final double C() {
        return I(S());
    }

    public abstract JsonElement D(String str);

    public final JsonElement E() {
        JsonElement jsonElementD;
        String str = (String) ke0.F0(this.a);
        return (str == null || (jsonElementD = D(str)) == null) ? R() : jsonElementD;
    }

    public final boolean F(Object obj) {
        Boolean bool;
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementD = D(str);
        if (!(jsonElementD instanceof JsonPrimitive)) {
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of boolean at element: " + U(str), jsonElementD.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementD;
        try {
            lo1 lo1Var = et1.a;
            String content = jsonPrimitive.getContent();
            String[] strArr = jo3.a;
            content.getClass();
            if (content.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = content.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            V(jsonPrimitive, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            V(jsonPrimitive, "boolean", str);
            throw null;
        }
    }

    public final byte G(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementD = D(str);
        if (!(jsonElementD instanceof JsonPrimitive)) {
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of byte at element: " + U(str), jsonElementD.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementD;
        try {
            int iA = et1.a(jsonPrimitive);
            Byte bValueOf = (-128 > iA || iA > 127) ? null : Byte.valueOf((byte) iA);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            V(jsonPrimitive, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            V(jsonPrimitive, "byte", str);
            throw null;
        }
    }

    public final char H(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementD = D(str);
        if (!(jsonElementD instanceof JsonPrimitive)) {
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of char at element: " + U(str), jsonElementD.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementD;
        try {
            String content = jsonPrimitive.getContent();
            content.getClass();
            int length = content.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return content.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            V(jsonPrimitive, "char", str);
            throw null;
        }
    }

    public final double I(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementD = D(str);
        if (!(jsonElementD instanceof JsonPrimitive)) {
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of double at element: " + U(str), jsonElementD.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementD;
        try {
            lo1 lo1Var = et1.a;
            double d = Double.parseDouble(jsonPrimitive.getContent());
            ws1 ws1Var = this.c.a;
            if (Double.isInfinite(d) || Double.isNaN(d)) {
                throw vl0.a(Double.valueOf(d), str, E().toString());
            }
            return d;
        } catch (IllegalArgumentException unused) {
            V(jsonPrimitive, "double", str);
            throw null;
        }
    }

    public final float J(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementD = D(str);
        if (!(jsonElementD instanceof JsonPrimitive)) {
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of float at element: " + U(str), jsonElementD.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementD;
        try {
            lo1 lo1Var = et1.a;
            float f = Float.parseFloat(jsonPrimitive.getContent());
            ws1 ws1Var = this.c.a;
            if (Float.isInfinite(f) || Float.isNaN(f)) {
                throw vl0.a(Float.valueOf(f), str, E().toString());
            }
            return f;
        } catch (IllegalArgumentException unused) {
            V(jsonPrimitive, "float", str);
            throw null;
        }
    }

    public final hs0 K(Object obj, tf3 tf3Var) {
        String str = (String) obj;
        str.getClass();
        tf3Var.getClass();
        if (!eo3.a(tf3Var)) {
            this.a.add(str);
            return this;
        }
        JsonElement jsonElementD = D(str);
        String strB = tf3Var.b();
        if (jsonElementD instanceof JsonPrimitive) {
            String content = ((JsonPrimitive) jsonElementD).getContent();
            rs1 rs1Var = this.c;
            rs1Var.getClass();
            content.getClass();
            return new ct1(new tz1(content), rs1Var);
        }
        throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of " + strB + " at element: " + U(str), jsonElementD.toString());
    }

    public final int L(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementD = D(str);
        if (jsonElementD instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementD;
            try {
                return et1.a(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                V(jsonPrimitive, "int", str);
                throw null;
            }
        }
        throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of int at element: " + U(str), jsonElementD.toString());
    }

    public final long M(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementD = D(str);
        if (jsonElementD instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementD;
            try {
                lo1 lo1Var = et1.a;
                try {
                    return new tz1(jsonPrimitive.getContent()).h();
                } catch (dt1 e) {
                    throw new NumberFormatException(e.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                V(jsonPrimitive, "long", str);
                throw null;
            }
        }
        throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of long at element: " + U(str), jsonElementD.toString());
    }

    public final short N(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementD = D(str);
        if (!(jsonElementD instanceof JsonPrimitive)) {
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of short at element: " + U(str), jsonElementD.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementD;
        try {
            int iA = et1.a(jsonPrimitive);
            Short shValueOf = (-32768 > iA || iA > 32767) ? null : Short.valueOf((short) iA);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            V(jsonPrimitive, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            V(jsonPrimitive, "short", str);
            throw null;
        }
    }

    public final String O(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementD = D(str);
        if (!(jsonElementD instanceof JsonPrimitive)) {
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonPrimitive.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementD.getClass()).c) + " as the serialized body of string at element: " + U(str), jsonElementD.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementD;
        if (!(jsonPrimitive instanceof lt1)) {
            StringBuilder sbS = fq2.s("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbS.append(U(str));
            throw vl0.e(-1, sbS.toString(), E().toString());
        }
        lt1 lt1Var = (lt1) jsonPrimitive;
        if (lt1Var.c) {
            return lt1Var.d;
        }
        ws1 ws1Var = this.c.a;
        StringBuilder sbS2 = fq2.s("String literal for key '", str, "' should be quoted at element: ");
        sbS2.append(U(str));
        sbS2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw vl0.e(-1, sbS2.toString(), E().toString());
    }

    public String P(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return tf3Var.e(i);
    }

    public final String Q(tf3 tf3Var, int i) {
        tf3Var.getClass();
        String strP = P(tf3Var, i);
        strP.getClass();
        return strP;
    }

    public abstract JsonElement R();

    public final Object S() {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(kr1.H(arrayList));
        this.b = true;
        return objRemove;
    }

    public final String T() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : ke0.D0(arrayList, ".", "$.", null, null, 60);
    }

    public final String U(String str) {
        str.getClass();
        return T() + '.' + str;
    }

    public final void V(JsonPrimitive jsonPrimitive, String str, String str2) {
        throw vl0.e(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + (to3.q0(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + U(str2), E().toString());
    }

    @Override // defpackage.hs0
    public final Object a(qu1 qu1Var) {
        qu1Var.getClass();
        if (!(qu1Var instanceof rc3)) {
            return qu1Var.deserialize(this);
        }
        rs1 rs1Var = this.c;
        ws1 ws1Var = rs1Var.a;
        rc3 rc3Var = (rc3) qu1Var;
        String strW = kr1.w(rs1Var, rc3Var.getDescriptor());
        JsonElement jsonElementE = E();
        String strB = rc3Var.getDescriptor().b();
        if (!(jsonElementE instanceof JsonObject)) {
            throw vl0.e(-1, "Expected " + Options$Companion.getClassSimpleName(r43.a(JsonObject.class).c) + ", but had " + Options$Companion.getClassSimpleName(r43.a(jsonElementE.getClass()).c) + " as the serialized body of " + strB + " at element: " + T(), jsonElementE.toString());
        }
        JsonObject jsonObject = (JsonObject) jsonElementE;
        JsonElement jsonElement = (JsonElement) jsonObject.get(strW);
        String content = null;
        if (jsonElement != null) {
            JsonPrimitive jsonPrimitiveB = et1.b(jsonElement);
            if (!(jsonPrimitiveB instanceof JsonNull)) {
                content = jsonPrimitiveB.getContent();
            }
        }
        try {
            return g13.L(rs1Var, strW, jsonObject, av1.r((rc3) qu1Var, this, content));
        } catch (ag3 e) {
            String message = e.getMessage();
            message.getClass();
            throw vl0.e(-1, message, jsonObject.toString());
        }
    }

    @Override // defpackage.hs0
    public final long b() {
        return M(S());
    }

    @Override // defpackage.nk0
    public final hs0 c(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return K(Q(yy2Var, i), yy2Var.i(i));
    }

    @Override // defpackage.hs0
    public final boolean d() {
        return F(S());
    }

    @Override // defpackage.hs0
    public boolean e() {
        return !(E() instanceof JsonNull);
    }

    @Override // defpackage.hs0
    public final char f() {
        return H(S());
    }

    @Override // defpackage.nk0
    public final Object g(tf3 tf3Var, int i, qu1 qu1Var, Object obj) {
        tf3Var.getClass();
        qu1Var.getClass();
        this.a.add(Q(tf3Var, i));
        Object objA = (qu1Var.getDescriptor().g() || e()) ? a(qu1Var) : null;
        if (!this.b) {
            S();
        }
        this.b = false;
        return objA;
    }

    @Override // defpackage.nk0
    public final double i(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return I(Q(yy2Var, i));
    }

    @Override // defpackage.nk0
    public final char j(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return H(Q(yy2Var, i));
    }

    @Override // defpackage.nk0
    public final float k(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return J(Q(yy2Var, i));
    }

    @Override // defpackage.bt1
    public final JsonElement l() {
        return E();
    }

    @Override // defpackage.nk0
    public final byte m(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return G(Q(yy2Var, i));
    }

    @Override // defpackage.nk0
    public final String n(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return O(Q(tf3Var, i));
    }

    @Override // defpackage.hs0
    public final int o() {
        return L(S());
    }

    @Override // defpackage.nk0
    public final short p(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return N(Q(yy2Var, i));
    }

    public void q(tf3 tf3Var) {
        tf3Var.getClass();
    }

    @Override // defpackage.nk0
    public final zf3 r() {
        return this.c.b;
    }

    @Override // defpackage.nk0
    public final boolean s(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return F(Q(tf3Var, i));
    }

    @Override // defpackage.hs0
    public final byte t() {
        return G(S());
    }

    @Override // defpackage.hs0
    public final hs0 u(tf3 tf3Var) {
        tf3Var.getClass();
        if (ke0.F0(this.a) != null) {
            return K(S(), tf3Var);
        }
        return new st1(this.c, R(), this.d).u(tf3Var);
    }

    @Override // defpackage.nk0
    public final Object v(tf3 tf3Var, int i, qu1 qu1Var, Object obj) {
        tf3Var.getClass();
        qu1Var.getClass();
        this.a.add(Q(tf3Var, i));
        qu1Var.getClass();
        Object objA = a(qu1Var);
        if (!this.b) {
            S();
        }
        this.b = false;
        return objA;
    }

    @Override // defpackage.nk0
    public final int w(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return L(Q(tf3Var, i));
    }

    @Override // defpackage.hs0
    public final short x() {
        return N(S());
    }

    @Override // defpackage.hs0
    public final String y() {
        return O(S());
    }

    @Override // defpackage.hs0
    public final float z() {
        return J(S());
    }
}
