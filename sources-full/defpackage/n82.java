package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class n82 extends mv2 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ n82(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.mv2
    public final dx1 b() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((m82) obj).getLayoutDirection();
            default:
                return ((AndroidComposeView) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.mv2
    public final int c() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((m82) obj).e0();
            default:
                return ((AndroidComposeView) obj).getRoot().O.p.c;
        }
    }
}
