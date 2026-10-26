package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf1 implements rd2 {
    public static final bf1 b = new bf1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ bf1(int i) {
        this.a = i;
    }

    @Override // defpackage.rd2
    public final o23 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!ef1.class.isAssignableFrom(cls)) {
                    u41.k("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (o23) ef1.j(cls.asSubclass(ef1.class)).i(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.rd2
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return ef1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
