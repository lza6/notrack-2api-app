package notrack.ai.data.chatmeta;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.h82;
import defpackage.hs0;
import defpackage.ly1;
import defpackage.nk0;
import defpackage.oq1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.xw2;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class ChatMetaDoc$$serializer implements ff1 {
    public static final ChatMetaDoc$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ChatMetaDoc$$serializer chatMetaDoc$$serializer = new ChatMetaDoc$$serializer();
        INSTANCE = chatMetaDoc$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.chatmeta.ChatMetaDoc", chatMetaDoc$$serializer, 4);
        xw2Var.k("v", true);
        xw2Var.k("folders", true);
        xw2Var.k("chats", true);
        xw2Var.k("updatedAt", true);
        descriptor = xw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = ChatMetaDoc.$childSerializers;
        return new qu1[]{oq1.a, ly1VarArr[1].getValue(), ly1VarArr[2].getValue(), h82.a};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr = ChatMetaDoc.$childSerializers;
        int i = 0;
        int iW = 0;
        List list = null;
        Map map = null;
        long jA = 0;
        boolean z = true;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                iW = nk0VarB.w(tf3Var, 0);
                i |= 1;
            } else if (iH == 1) {
                list = (List) nk0VarB.v(tf3Var, 1, (qu1) ly1VarArr[1].getValue(), list);
                i |= 2;
            } else if (iH == 2) {
                map = (Map) nk0VarB.v(tf3Var, 2, (qu1) ly1VarArr[2].getValue(), map);
                i |= 4;
            } else {
                if (iH != 3) {
                    u41.f(iH);
                    return null;
                }
                jA = nk0VarB.A(tf3Var, 3);
                i |= 8;
            }
        }
        nk0VarB.q(tf3Var);
        return new ChatMetaDoc(i, iW, list, map, jA);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ChatMetaDoc chatMetaDoc = (ChatMetaDoc) obj;
        chatMetaDoc.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        ChatMetaDoc.write$Self$app_playRelease(chatMetaDoc, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
