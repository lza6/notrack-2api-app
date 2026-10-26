package defpackage;

import notrack.ai.data.avatars.AvatarItem;

/* JADX INFO: loaded from: classes.dex */
public final class xp implements je1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ AvatarItem h;
    public final /* synthetic */ le1 l;
    public final /* synthetic */ mi2 m;

    public xp(boolean z, le1 le1Var, AvatarItem avatarItem, le1 le1Var2, mi2 mi2Var) {
        this.c = z;
        this.d = le1Var;
        this.h = avatarItem;
        this.l = le1Var2;
        this.m = mi2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        le1 le1Var;
        boolean z = this.c;
        AvatarItem avatarItem = this.h;
        if (z) {
            le1Var = this.d;
        } else {
            this.m.setValue(avatarItem.getId());
            le1Var = this.l;
        }
        le1Var.invoke(avatarItem);
        return w84.a;
    }
}
