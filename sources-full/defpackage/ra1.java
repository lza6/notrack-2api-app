package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra1 extends d13 implements ou1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.c = i2;
    }

    @Override // defpackage.b00
    public final du1 computeReflected() {
        r43.a.getClass();
        return this;
    }

    @Override // defpackage.ou1
    public final Object get() {
        switch (this.c) {
            case 0:
                return ((va1) this.receiver).f.x0();
            case 1:
                return ((gn3) this.receiver).getValue();
            case 2:
                return ((gn3) this.receiver).getValue();
            case 3:
                return this.receiver.getClass().getSimpleName();
            case 4:
                return ((gn3) this.receiver).getValue();
            default:
                return ((gn3) this.receiver).getValue();
        }
    }

    @Override // defpackage.je1
    public final Object invoke() {
        return get();
    }
}
