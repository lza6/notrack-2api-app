package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cg0 implements so0 {
    public static final cg0 d = new cg0(0);
    public static final cg0 h = new cg0(1);
    public final /* synthetic */ int c;

    public /* synthetic */ cg0(int i) {
        this.c = i;
    }

    private final void a(Object obj) {
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        switch (this.c) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return x21.c;
        }
    }

    @Override // defpackage.so0
    public final void resumeWith(Object obj) {
        switch (this.c) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.c) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
