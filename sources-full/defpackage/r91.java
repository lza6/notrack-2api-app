package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r91 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ q43 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r91(int i, q43 q43Var) {
        super(1);
        this.c = i;
        this.d = q43Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.c;
        w84 w84Var = w84.a;
        q43 q43Var = this.d;
        switch (i) {
            case 0:
                q43Var.c = (nv2) obj;
                return w84Var;
            case 1:
                q43Var.c = (nv2) obj;
                return w84Var;
            case 2:
                wi1 wi1Var = (wi1) obj;
                Object obj2 = q43Var.c;
                if (obj2 == null && wi1Var.h) {
                    q43Var.c = wi1Var;
                } else if (obj2 != null) {
                    wi1Var.getClass();
                }
                return Boolean.TRUE;
            case 3:
                iu0 iu0Var = (i64) obj;
                if (((of2) iu0Var).getNode().isAttached()) {
                    q43Var.c = iu0Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                i64 i64Var = (i64) obj;
                i64Var.getClass();
                b12 b12Var = ((j64) i64Var).c;
                List listV = (List) q43Var.c;
                if (listV != null) {
                    listV.add(b12Var);
                } else {
                    listV = kr1.V(b12Var);
                }
                q43Var.c = listV;
                return h64.d;
        }
    }
}
