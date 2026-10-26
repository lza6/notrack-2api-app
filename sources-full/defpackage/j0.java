package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Collection d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i, Collection collection) {
        super(1);
        this.c = i;
        this.d = collection;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        Collection<?> collection = this.d;
        switch (i) {
            case 0:
                return Boolean.valueOf(collection.contains(obj));
            case 1:
                return Boolean.valueOf(collection.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(collection));
        }
    }
}
