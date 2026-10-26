package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eq implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;

    public /* synthetic */ eq(int i, Object obj, boolean z) {
        this.c = i;
        this.d = z;
        this.h = obj;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        Object obj4 = this.h;
        boolean z = this.d;
        switch (i) {
            case 0:
                return qq.AvatarCropDialog$lambda$42$lambda$41$lambda$40$lambda$39$lambda$38(z, (mi2) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 1:
                return q10.CarrySheet$lambda$21$lambda$20$lambda$19$lambda$18(z, (r10) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 2:
                return w40.ChatBgSheet$lambda$56$lambda$55$lambda$54$lambda$53(z, (qt) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            default:
                return wa0.InstructionsDialog$lambda$450$lambda$446$lambda$445$lambda$444(z, (String) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
        }
    }
}
