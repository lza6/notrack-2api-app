package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class fu {
    public int a;
    public int b;
    public String c;

    public static eu a() {
        eu euVar = new eu();
        euVar.d = 0;
        euVar.h = BuildConfig.VERSION_NAME;
        return euVar;
    }

    public final String toString() {
        int i = this.a;
        int i2 = tm4.a;
        hn4 hn4Var = fm4.h;
        Integer numValueOf = Integer.valueOf(i);
        return "Response Code: " + (!hn4Var.containsKey(numValueOf) ? fm4.RESPONSE_CODE_UNSPECIFIED : (fm4) hn4Var.get(numValueOf)).toString() + ", Debug Message: " + this.c;
    }
}
