package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class vt1 extends z {
    public final JsonArray f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(rs1 rs1Var, JsonArray jsonArray) {
        super(rs1Var, null);
        rs1Var.getClass();
        this.f = jsonArray;
        this.g = jsonArray.size();
        this.h = -1;
    }

    @Override // defpackage.z
    public final JsonElement D(String str) {
        str.getClass();
        return this.f.get(Integer.parseInt(str));
    }

    @Override // defpackage.z
    public final String P(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.z
    public final JsonElement R() {
        return this.f;
    }

    @Override // defpackage.nk0
    public final int h(tf3 tf3Var) {
        tf3Var.getClass();
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
