package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x80 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;

    public /* synthetic */ x80(int i, Object obj, boolean z) {
        this.c = i;
        this.d = z;
        this.h = obj;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return wa0.ThinkingBlock$lambda$557(this.d, (String) this.h, (ck0) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return uv2.PeriodSwitch$lambda$19(this.d, (le1) this.h, (ck0) obj, iIntValue2);
        }
    }
}
