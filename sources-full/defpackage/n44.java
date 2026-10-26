package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n44 extends sd4 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public n44(o44 o44Var, int i) {
        this.a = 0;
        this.d = o44Var;
        this.c = i;
        this.b = false;
    }

    public n44(qd4 qd4Var) {
        this.a = 1;
        this.d = qd4Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.rd4
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((o44) obj).a.setVisibility(this.c);
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                qd4 qd4Var = (qd4) obj;
                if (i2 == qd4Var.a.size()) {
                    rd4 rd4Var = qd4Var.d;
                    if (rd4Var != null) {
                        rd4Var.a();
                    }
                    this.c = 0;
                    this.b = false;
                    qd4Var.e = false;
                }
                break;
        }
    }

    @Override // defpackage.sd4, defpackage.rd4
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.sd4, defpackage.rd4
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((o44) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    rd4 rd4Var = ((qd4) obj).d;
                    if (rd4Var != null) {
                        rd4Var.c();
                    }
                    break;
                }
                break;
        }
    }
}
