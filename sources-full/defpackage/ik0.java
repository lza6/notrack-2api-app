package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ik0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ik0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((kk0) obj).z--;
                break;
            default:
                ((nl3) obj).j--;
                break;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((kk0) obj).z++;
                break;
            default:
                ((nl3) obj).j++;
                break;
        }
    }
}
