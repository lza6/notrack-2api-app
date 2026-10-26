package defpackage;

import notrack.ai.data.chatmeta.FolderMeta;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i80 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ FolderMeta h;

    public /* synthetic */ i80(le1 le1Var, FolderMeta folderMeta, int i) {
        this.c = i;
        this.d = le1Var;
        this.h = folderMeta;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        FolderMeta folderMeta = this.h;
        le1 le1Var = this.d;
        switch (i) {
            case 0:
                le1Var.invoke(folderMeta.getId());
                break;
            case 1:
                le1Var.invoke(folderMeta.getId());
                break;
            default:
                le1Var.invoke(folderMeta.getId());
                break;
        }
        return w84Var;
    }
}
