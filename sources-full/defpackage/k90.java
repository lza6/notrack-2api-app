package defpackage;

import notrack.ai.data.api.ChatDto;

/* JADX INFO: loaded from: classes.dex */
public final class k90 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ ChatDto h;

    public /* synthetic */ k90(le1 le1Var, ChatDto chatDto, int i) {
        this.c = i;
        this.d = le1Var;
        this.h = chatDto;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        ChatDto chatDto = this.h;
        le1 le1Var = this.d;
        switch (i) {
            case 0:
                le1Var.invoke(chatDto.getChatId());
                break;
            case 1:
                le1Var.invoke(chatDto.getChatId());
                break;
            case 2:
                le1Var.invoke(chatDto.getChatId());
                break;
            case 3:
                le1Var.invoke(chatDto.getChatId());
                break;
            default:
                le1Var.invoke(chatDto.getChatId());
                break;
        }
        return w84Var;
    }
}
