package notrack.ai.data.api;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.ly1;
import defpackage.nk0;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.xw2;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class ChatHistoryResponse$$serializer implements ff1 {
    public static final ChatHistoryResponse$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ChatHistoryResponse$$serializer chatHistoryResponse$$serializer = new ChatHistoryResponse$$serializer();
        INSTANCE = chatHistoryResponse$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.api.ChatHistoryResponse", chatHistoryResponse$$serializer, 2);
        xw2Var.k("chat", false);
        xw2Var.k("messages", false);
        descriptor = xw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        return new qu1[]{ChatDto$$serializer.INSTANCE, ChatHistoryResponse.$childSerializers[1].getValue()};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr = ChatHistoryResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        ChatDto chatDto = null;
        List list = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                chatDto = (ChatDto) nk0VarB.v(tf3Var, 0, ChatDto$$serializer.INSTANCE, chatDto);
                i |= 1;
            } else {
                if (iH != 1) {
                    u41.f(iH);
                    return null;
                }
                list = (List) nk0VarB.v(tf3Var, 1, (qu1) ly1VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        nk0VarB.q(tf3Var);
        return new ChatHistoryResponse(i, chatDto, list);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ChatHistoryResponse chatHistoryResponse = (ChatHistoryResponse) obj;
        chatHistoryResponse.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        ChatHistoryResponse.write$Self$app_playRelease(chatHistoryResponse, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
