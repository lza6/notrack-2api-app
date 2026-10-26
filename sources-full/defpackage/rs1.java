package defpackage;

import kotlin.uuid.Uuid;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class rs1 {
    public static final qs1 d = new qs1(new ws1(false, false, true, "    ", TeXSymbolParser.TYPE_ATTR, true, uc0.d), eg3.a);
    public final ws1 a;
    public final zf3 b;
    public final jb c = new jb(27);

    public rs1(ws1 ws1Var, zf3 zf3Var) {
        this.a = ws1Var;
        this.b = zf3Var;
    }

    public final Object a(qu1 qu1Var, JsonElement jsonElement) {
        hs0 st1Var;
        qu1Var.getClass();
        String str = null;
        if (jsonElement instanceof JsonObject) {
            st1Var = new ut1(this, (JsonObject) jsonElement, str, 12);
        } else if (jsonElement instanceof JsonArray) {
            st1Var = new vt1(this, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof lt1) && !jsonElement.equals(JsonNull.INSTANCE)) {
                u41.e();
                return null;
            }
            st1Var = new st1(this, (JsonPrimitive) jsonElement, null);
        }
        return st1Var.a(qu1Var);
    }

    public final Object b(qu1 qu1Var, String str) {
        qu1Var.getClass();
        str.getClass();
        tz1 tz1Var = new tz1(str);
        Object objA = new co3(this, gj4.OBJ, tz1Var, qu1Var.getDescriptor(), null).a(qu1Var);
        if (tz1Var.e() == 10) {
            return objA;
        }
        tz1.l(tz1Var, "Expected EOF after parsing, but had " + str.charAt(tz1Var.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String c(qu1 qu1Var, Object obj) {
        char[] cArr;
        qu1Var.getClass();
        kn4 kn4Var = new kn4(4, false);
        k30 k30Var = k30.c;
        synchronized (k30Var) {
            kl klVar = k30Var.a;
            cArr = null;
            char[] cArr2 = (char[]) (klVar.isEmpty() ? null : klVar.removeLast());
            if (cArr2 != null) {
                k30Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[Uuid.SIZE_BITS];
        }
        kn4Var.c = cArr;
        try {
            new do3(new wu(kn4Var), this, gj4.OBJ, new do3[gj4.p.b()]).r(qu1Var, obj);
            return kn4Var.toString();
        } finally {
            kn4Var.m();
        }
    }
}
