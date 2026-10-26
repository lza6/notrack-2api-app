package defpackage;

import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class rt1 implements qu1 {
    public static final rt1 a = new rt1();
    public static final qt1 b = qt1.b;

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        py.n(hs0Var);
        lo3 lo3Var = lo3.a;
        return new JsonObject((Map) new t42(gt1.a).deserialize(hs0Var));
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        jsonObject.getClass();
        py.l(do3Var);
        lo3 lo3Var = lo3.a;
        new t42(gt1.a).serialize(do3Var, jsonObject);
    }
}
