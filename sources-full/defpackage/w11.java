package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w11 implements Runnable {
    public final /* synthetic */ int c = 1;
    public final int d;
    public final Object h;

    public w11(ek4 ek4Var, int i) {
        this.h = ek4Var;
        this.d = i;
    }

    public w11(List list, int i, Throwable th) {
        p23.n(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = this.d;
        Object obj = this.h;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((v11) arrayList.get(i3)).b();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((v11) arrayList.get(i3)).a();
                        i3++;
                    }
                }
                break;
            default:
                ((ek4) obj).i(i2);
                break;
        }
    }
}
