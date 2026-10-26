package defpackage;

import kotlinx.serialization.json.JsonNull;

/* JADX INFO: loaded from: classes.dex */
public final class pt1 implements qu1 {
    public static final pt1 a = new pt1();
    public static final vf3 b;

    static {
        yf3 yf3Var = yf3.n;
        tf3[] tf3VarArr = new tf3[0];
        if (mo3.C0("kotlinx.serialization.json.JsonNull")) {
            u41.k("Blank serial names are prohibited");
        } else if (yf3Var == zo3.n) {
            u41.k("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        } else {
            wc0 wc0Var = new wc0("kotlinx.serialization.json.JsonNull");
            b = new vf3("kotlinx.serialization.json.JsonNull", yf3Var, wc0Var.c.size(), vl.y0(tf3VarArr), wc0Var);
        }
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        py.n(hs0Var);
        if (hs0Var.e()) {
            throw new dt1("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ((JsonNull) obj).getClass();
        py.l(do3Var);
        do3Var.o();
    }
}
