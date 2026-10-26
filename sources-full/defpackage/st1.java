package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class st1 extends z {
    public final JsonElement f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st1(rs1 rs1Var, JsonElement jsonElement, String str) {
        super(rs1Var, str);
        rs1Var.getClass();
        jsonElement.getClass();
        this.f = jsonElement;
        this.a.add("primitive");
    }

    @Override // defpackage.z
    public final JsonElement D(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        u41.k("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.z
    public final JsonElement R() {
        return this.f;
    }

    @Override // defpackage.nk0
    public final int h(tf3 tf3Var) {
        tf3Var.getClass();
        return 0;
    }
}
