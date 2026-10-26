package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ho1 implements vw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ho1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vw0
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((go1) obj2).a.l((eo1) obj);
                break;
            case 1:
                ((i22) obj2).c.k(obj);
                break;
            case 2:
                mi2 mi2Var = (mi2) obj2;
                ry2 ry2Var = (ry2) mi2Var.getValue();
                if (ry2Var != null) {
                    qy2 qy2Var = new qy2(ry2Var);
                    gh2 gh2Var = (gh2) obj;
                    if (gh2Var != null) {
                        ((hh2) gh2Var).b(qy2Var);
                    }
                    mi2Var.setValue(null);
                }
                break;
            case 3:
                ((cz3) obj2).c.remove((le1) obj);
                break;
            case 4:
                ((o54) obj2).j.remove((o54) obj);
                break;
            case 5:
                o54 o54Var = (o54) obj2;
                o54Var.getClass();
                j54 j54Var = (j54) ((k54) obj).b.getValue();
                if (j54Var != null) {
                    o54Var.i.remove(j54Var.c);
                }
                break;
            case 6:
                ((o54) obj2).i.remove((n54) obj);
                break;
            default:
                ch4 ch4Var = (ch4) obj2;
                View view = (View) obj;
                int i2 = ch4Var.v - 1;
                ch4Var.v = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = zc4.a;
                    sc4.i(view, null);
                    zc4.j(view, null);
                    view.removeOnAttachStateChangeListener(ch4Var.w);
                }
                break;
        }
    }
}
