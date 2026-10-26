package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ae4 {
    public static final h43 a;
    public static final Map b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        a = new h43(0.5f, 0.5f, 0.5f, 0.5f);
        x64 x64Var = mb4.b;
        Float fValueOf2 = Float.valueOf(1.0f);
        ps2 ps2Var = new ps2(x64Var, fValueOf2);
        ps2 ps2Var2 = new ps2(mb4.h, fValueOf2);
        ps2 ps2Var3 = new ps2(mb4.g, fValueOf2);
        ps2 ps2Var4 = new ps2(mb4.a, Float.valueOf(0.01f));
        ps2 ps2Var5 = new ps2(mb4.i, fValueOf);
        ps2 ps2Var6 = new ps2(mb4.e, fValueOf);
        ps2 ps2Var7 = new ps2(mb4.f, fValueOf);
        x64 x64Var2 = mb4.c;
        Float fValueOf3 = Float.valueOf(0.1f);
        b = y92.T(ps2Var, ps2Var2, ps2Var3, ps2Var4, ps2Var5, ps2Var6, ps2Var7, new ps2(x64Var2, fValueOf3), new ps2(mb4.d, fValueOf3));
    }
}
