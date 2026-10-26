package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class gt1 implements qu1 {
    public static final gt1 a = new gt1();
    public static final vf3 b = gm4.i("kotlinx.serialization.json.JsonElement", nx2.n, new tf3[0], new s80(10));

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return py.n(hs0Var).l();
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        jsonElement.getClass();
        py.l(do3Var);
        if (jsonElement instanceof JsonPrimitive) {
            do3Var.r(tt1.a, jsonElement);
            return;
        }
        if (jsonElement instanceof JsonObject) {
            do3Var.r(rt1.a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            do3Var.r(ts1.a, jsonElement);
        } else {
            u41.e();
        }
    }
}
