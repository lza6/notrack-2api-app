package defpackage;

import notrack.ai.data.api.ChatDto;

/* JADX INFO: loaded from: classes.dex */
public final class m90 implements le1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ ChatDto d;
    public final /* synthetic */ mi2 h;

    public m90(ne1 ne1Var, ChatDto chatDto, mi2 mi2Var) {
        this.c = ne1Var;
        this.d = chatDto;
        this.h = mi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        this.c.invoke(this.d.getChatId(), str);
        this.h.setValue(null);
        return w84.a;
    }
}
