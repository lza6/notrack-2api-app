package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class la4 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static lw1 a(gw1 gw1Var) {
        iw1 iw1VarZ = lw1.z();
        int iB = gw1Var.B();
        iw1VarZ.e();
        lw1.w((lw1) iw1VarZ.d, iB);
        for (fw1 fw1Var : gw1Var.A()) {
            jw1 jw1VarB = kw1.B();
            String strB = fw1Var.A().B();
            jw1VarB.e();
            kw1.w((kw1) jw1VarB.d, strB);
            mv1 mv1VarD = fw1Var.D();
            jw1VarB.e();
            kw1.y((kw1) jw1VarB.d, mv1VarD);
            lr2 lr2VarC = fw1Var.C();
            jw1VarB.e();
            kw1.x((kw1) jw1VarB.d, lr2VarC);
            int iB2 = fw1Var.B();
            jw1VarB.e();
            kw1.z((kw1) jw1VarB.d, iB2);
            kw1 kw1Var = (kw1) jw1VarB.b();
            iw1VarZ.e();
            lw1.x((lw1) iw1VarZ.d, kw1Var);
        }
        return (lw1) iw1VarZ.b();
    }
}
