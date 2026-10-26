package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m10 implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    public /* synthetic */ m10(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        Object obj4 = this.h;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                return q10.CarryCard$lambda$55$lambda$54$lambda$53$lambda$51((r10) obj5, (mi2) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 1:
                return wa0.InstructionsDialog$lambda$450$lambda$449((oe1) obj5, (ne1) obj4, (dx) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 2:
                return wa0.ChatScreen$lambda$386$lambda$304$lambda$303$lambda$296((hb0) obj5, (gn3) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 3:
                return wa0.AccountSheet$lambda$1073$lambda$1072$lambda$1068((xa0) obj5, (mi2) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            default:
                return wa0.InstructionsDialog$lambda$450$lambda$437$lambda$433$lambda$432((String) obj5, (String) obj4, (ne1) obj, (ck0) obj2, ((Integer) obj3).intValue());
        }
    }
}
