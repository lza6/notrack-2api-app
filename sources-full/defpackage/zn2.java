package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class zn2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ go2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn2(go2 go2Var, int i) {
        super(1);
        this.c = i;
        this.d = go2Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        yn2 yn2Var;
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = null;
        go2 go2Var = this.d;
        switch (i) {
            case 0:
                zq zqVar = (zq) obj;
                zqVar.getClass();
                kl klVar = go2Var.b;
                ListIterator listIterator = klVar.listIterator(klVar.b());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((yn2) objPrevious).a) {
                        obj2 = objPrevious;
                        yn2Var = (yn2) obj2;
                        if (go2Var.c != null) {
                            go2Var.b();
                        }
                        go2Var.c = yn2Var;
                        if (yn2Var != null) {
                            yn2Var.d(zqVar);
                        }
                        break;
                    }
                }
                yn2Var = (yn2) obj2;
                if (go2Var.c != null) {
                    go2Var.b();
                }
                go2Var.c = yn2Var;
                if (yn2Var != null) {
                    yn2Var.d(zqVar);
                }
                break;
            default:
                zq zqVar2 = (zq) obj;
                zqVar2.getClass();
                yn2 yn2Var2 = go2Var.c;
                if (yn2Var2 == null) {
                    kl klVar2 = go2Var.b;
                    ListIterator listIterator2 = klVar2.listIterator(klVar2.b());
                    while (listIterator2.hasPrevious()) {
                        Object objPrevious2 = listIterator2.previous();
                        if (((yn2) objPrevious2).a) {
                            obj2 = objPrevious2;
                            yn2Var2 = (yn2) obj2;
                        }
                    }
                    yn2Var2 = (yn2) obj2;
                }
                if (yn2Var2 != null) {
                    yn2Var2.c(zqVar2);
                }
                break;
        }
        return w84Var;
    }
}
