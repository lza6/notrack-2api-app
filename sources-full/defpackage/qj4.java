package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qj4 {
    public static final bq4 a(Object obj, Object obj2) {
        bq4 bq4Var = (bq4) obj;
        bq4 bq4Var2 = (bq4) obj2;
        if (!bq4Var2.isEmpty()) {
            if (!bq4Var.c) {
                if (bq4Var.isEmpty()) {
                    bq4Var = new bq4();
                } else {
                    bq4 bq4Var3 = new bq4(bq4Var);
                    bq4Var3.c = true;
                    bq4Var = bq4Var3;
                }
            }
            bq4Var.b();
            if (!bq4Var2.isEmpty()) {
                bq4Var.putAll(bq4Var2);
            }
        }
        return bq4Var;
    }
}
