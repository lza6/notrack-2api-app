package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class k02 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj b;

    public /* synthetic */ k02(gj gjVar, int i) {
        this.a = i;
        this.b = gjVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        gj gjVar = this.b;
        switch (i) {
            case 0:
                return yh4.s(Integer.valueOf(gjVar.i(((t02) obj).getKey())), Integer.valueOf(gjVar.i(((t02) obj2).getKey())));
            case 1:
                return yh4.s(Integer.valueOf(gjVar.i(((t02) obj).getKey())), Integer.valueOf(gjVar.i(((t02) obj2).getKey())));
            case 2:
                return yh4.s(Integer.valueOf(gjVar.i(((t02) obj2).getKey())), Integer.valueOf(gjVar.i(((t02) obj).getKey())));
            default:
                return yh4.s(Integer.valueOf(gjVar.i(((t02) obj2).getKey())), Integer.valueOf(gjVar.i(((t02) obj).getKey())));
        }
    }
}
