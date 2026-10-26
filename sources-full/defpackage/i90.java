package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i90 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i90(int i, List list) {
        super(1);
        this.c = i;
        this.d = list;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        switch (this.c) {
            case 0:
                this.d.get(((Number) obj).intValue());
                break;
            default:
                this.d.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
