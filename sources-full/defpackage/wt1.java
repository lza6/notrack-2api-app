package defpackage;

import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class wt1 extends ut1 {
    public final JsonObject j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt1(rs1 rs1Var, JsonObject jsonObject) {
        super(rs1Var, jsonObject, (String) null, 12);
        rs1Var.getClass();
        this.j = jsonObject;
        List listO0 = ke0.O0(jsonObject.keySet());
        this.k = listO0;
        this.l = listO0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.ut1, defpackage.z
    public final JsonElement D(String str) {
        str.getClass();
        if (this.m % 2 != 0) {
            return (JsonElement) y92.R(str, this.j);
        }
        lo1 lo1Var = et1.a;
        return new lt1(str, true);
    }

    @Override // defpackage.ut1, defpackage.z
    public final String P(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.ut1, defpackage.z
    public final JsonElement R() {
        return this.j;
    }

    @Override // defpackage.ut1
    /* JADX INFO: renamed from: W */
    public final JsonObject R() {
        return this.j;
    }

    @Override // defpackage.ut1, defpackage.nk0
    public final int h(tf3 tf3Var) {
        tf3Var.getClass();
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }

    @Override // defpackage.ut1, defpackage.z, defpackage.nk0
    public final void q(tf3 tf3Var) {
        tf3Var.getClass();
    }
}
