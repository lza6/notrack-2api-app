package defpackage;

import java.util.Comparator;
import notrack.ai.data.api.ChatDto;
import notrack.ai.data.chatmeta.ChatEntry;
import notrack.ai.data.chatmeta.ChatMetaDoc;

/* JADX INFO: loaded from: classes.dex */
public final class o90 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ChatMetaDoc chatMetaDoc = ((xa0) obj3).X;
                ChatEntry chatEntry = chatMetaDoc.getChats().get(((ChatDto) obj2).getChatId());
                boolean z = false;
                Boolean boolValueOf = Boolean.valueOf(chatEntry != null && chatEntry.getPinned());
                ChatEntry chatEntry2 = chatMetaDoc.getChats().get(((ChatDto) obj).getChatId());
                if (chatEntry2 != null && chatEntry2.getPinned()) {
                    z = true;
                }
                return yh4.s(boolValueOf, Boolean.valueOf(z));
            default:
                jh2 jh2Var = (jh2) obj3;
                return yh4.s(Integer.valueOf(jh2Var.c(((Number) obj).longValue())), Integer.valueOf(jh2Var.c(((Number) obj2).longValue())));
        }
    }
}
