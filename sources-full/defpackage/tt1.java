package defpackage;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class tt1 implements qu1 {
    public static final tt1 a = new tt1();
    public static final vf3 b;

    static {
        cz2 cz2Var = cz2.v;
        tf3[] tf3VarArr = new tf3[0];
        if (mo3.C0("kotlinx.serialization.json.JsonPrimitive")) {
            u41.k("Blank serial names are prohibited");
        } else if (cz2Var == zo3.n) {
            u41.k("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        } else {
            wc0 wc0Var = new wc0("kotlinx.serialization.json.JsonPrimitive");
            b = new vf3("kotlinx.serialization.json.JsonPrimitive", cz2Var, wc0Var.c.size(), vl.y0(tf3VarArr), wc0Var);
        }
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        JsonElement jsonElementL = py.n(hs0Var).l();
        if (jsonElementL instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementL;
        }
        throw vl0.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + r43.a(jsonElementL.getClass()), jsonElementL.toString());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        jsonPrimitive.getClass();
        py.l(do3Var);
        if (jsonPrimitive instanceof JsonNull) {
            do3Var.r(pt1.a, JsonNull.INSTANCE);
        } else {
            do3Var.r(mt1.a, (lt1) jsonPrimitive);
        }
    }
}
