package defpackage;

import kotlinx.serialization.json.JsonElement;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class mt1 implements qu1 {
    public static final mt1 a = new mt1();
    public static final gz2 b;

    static {
        cz2 cz2Var = cz2.v;
        if (mo3.C0("kotlinx.serialization.json.JsonLiteral")) {
            u41.k("Blank serial names are prohibited");
            return;
        }
        Object it = ((q92) kz2.a.values()).iterator();
        while (((n92) it).hasNext()) {
            qu1 qu1Var = (qu1) ((l92) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(qu1Var.getDescriptor().b())) {
                u41.k(no3.e0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + Options$Companion.getClassSimpleName(r43.a(qu1Var.getClass()).c) + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        b = new gz2("kotlinx.serialization.json.JsonLiteral", cz2Var);
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        JsonElement jsonElementL = py.n(hs0Var).l();
        if (jsonElementL instanceof lt1) {
            return (lt1) jsonElementL;
        }
        throw vl0.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + r43.a(jsonElementL.getClass()), jsonElementL.toString());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        Boolean bool;
        lt1 lt1Var = (lt1) obj;
        lt1Var.getClass();
        String str = lt1Var.d;
        py.l(do3Var);
        if (lt1Var.c) {
            do3Var.t(str);
            return;
        }
        Long lT0 = to3.t0(str);
        if (lT0 != null) {
            do3Var.m(lT0.longValue());
            return;
        }
        b84 b84VarV = py.V(str);
        if (b84VarV != null) {
            do3Var.i(f84.b).m(b84VarV.c);
            return;
        }
        Double dH0 = so3.h0(str);
        if (dH0 != null) {
            do3Var.f(dH0.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            do3Var.b(bool.booleanValue());
        } else {
            do3Var.t(str);
        }
    }
}
