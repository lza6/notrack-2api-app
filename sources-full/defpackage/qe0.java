package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qe0 implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qe0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pf3
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            default:
                return (Iterator) obj;
        }
    }
}
