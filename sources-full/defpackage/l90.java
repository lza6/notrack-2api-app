package defpackage;

import notrack.ai.data.api.ChatDto;

/* JADX INFO: loaded from: classes.dex */
public final class l90 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ChatDto d;
    public final /* synthetic */ mi2 h;

    public /* synthetic */ l90(ChatDto chatDto, mi2 mi2Var, int i) {
        this.c = i;
        this.d = chatDto;
        this.h = mi2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        ChatDto chatDto = this.d;
        mi2 mi2Var = this.h;
        switch (i) {
            case 0:
                mi2Var.setValue(chatDto.getChatId());
                break;
            default:
                mi2Var.setValue(chatDto.getChatId());
                break;
        }
        return w84Var;
    }
}
