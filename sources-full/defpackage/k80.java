package defpackage;

import notrack.ai.data.avatars.AvatarItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k80 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ hb0 d;

    public /* synthetic */ k80(hb0 hb0Var, int i) {
        this.c = i;
        this.d = hb0Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        hb0 hb0Var = this.d;
        switch (i) {
            case 0:
                ((AvatarItem) obj).getClass();
                hb0Var.X(new a50("chat_avatar"));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                hb0Var.O(str);
                hb0Var.Y("chip");
                break;
        }
        return w84Var;
    }
}
