package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sa1 extends bi2 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.c = i2;
    }

    @Override // defpackage.ou1
    public final Object get() {
        switch (this.c) {
            case 0:
                return ((va1) this.receiver).l;
            default:
                return ((mi2) this.receiver).getValue();
        }
    }
}
