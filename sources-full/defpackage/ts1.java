package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class ts1 implements qu1 {
    public static final ts1 a = new ts1();
    public static final ss1 b = ss1.b;

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        py.n(hs0Var);
        return new JsonArray((List) new ml(gt1.a).e(hs0Var));
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        jsonArray.getClass();
        py.l(do3Var);
        gt1 gt1Var = gt1.a;
        tf3 descriptor = gt1Var.getDescriptor();
        descriptor.getClass();
        ll llVar = new ll(descriptor);
        int size = jsonArray.size();
        do3 do3VarA = do3Var.a(llVar);
        Iterator<JsonElement> it = jsonArray.iterator();
        for (int i = 0; i < size; i++) {
            do3VarA.q(llVar, i, gt1Var, it.next());
        }
        do3VarA.v(llVar);
    }
}
