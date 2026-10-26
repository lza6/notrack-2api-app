package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.ArrayList;
import notrack.ai.data.api.ChatDto;
import notrack.ai.data.chatmeta.ChatEntry;

/* JADX INFO: loaded from: classes.dex */
public final class p90 extends ww1 implements pe1 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ xa0 d;
    public final /* synthetic */ le1 h;
    public final /* synthetic */ le1 l;
    public final /* synthetic */ le1 m;
    public final /* synthetic */ le1 n;
    public final /* synthetic */ le1 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ ne1 q;
    public final /* synthetic */ mi2 r;
    public final /* synthetic */ mi2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(ArrayList arrayList, xa0 xa0Var, le1 le1Var, le1 le1Var2, le1 le1Var3, le1 le1Var4, le1 le1Var5, boolean z, ne1 ne1Var, mi2 mi2Var, mi2 mi2Var2) {
        super(4);
        this.c = arrayList;
        this.d = xa0Var;
        this.h = le1Var;
        this.l = le1Var2;
        this.m = le1Var3;
        this.n = le1Var4;
        this.o = le1Var5;
        this.p = z;
        this.q = ne1Var;
        this.r = mi2Var;
        this.s = mi2Var2;
    }

    @Override // defpackage.pe1
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((b02) obj, ((Number) obj2).intValue(), (ck0) obj3, ((Number) obj4).intValue());
        return w84.a;
    }

    public final void invoke(b02 b02Var, int i, ck0 ck0Var, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (((kk0) ck0Var).h(b02Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ((kk0) ck0Var).f(i) ? 32 : 16;
        }
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i3 & 1, (i3 & 147) != 146)) {
            kk0Var.V();
            return;
        }
        ChatDto chatDto = (ChatDto) this.c.get(i);
        kk0Var.a0(-1023253278);
        xa0 xa0Var = this.d;
        ChatEntry chatEntry = xa0Var.X.getChats().get(chatDto.getChatId());
        boolean zN = kr1.n(xa0Var.c, chatDto.getChatId());
        boolean z = chatEntry != null && chatEntry.getPinned();
        String titleOverride = chatEntry != null ? chatEntry.getTitleOverride() : null;
        boolean z2 = xa0Var.Z;
        boolean zContains = xa0Var.a0.contains(chatDto.getChatId());
        mi2 mi2Var = this.r;
        boolean zN2 = kr1.n((String) mi2Var.getValue(), chatDto.getChatId());
        le1 le1Var = this.h;
        boolean zH = kk0Var.h(le1Var) | kk0Var.h(chatDto);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new k90(le1Var, chatDto, 0);
            kk0Var.l0(objP);
        }
        je1 je1Var = (je1) objP;
        le1 le1Var2 = this.l;
        boolean zH2 = kk0Var.h(le1Var2) | kk0Var.h(chatDto);
        Object objP2 = kk0Var.P();
        if (zH2 || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new k90(le1Var2, chatDto, 1);
            kk0Var.l0(objP2);
        }
        je1 je1Var2 = (je1) objP2;
        le1 le1Var3 = this.m;
        boolean zH3 = kk0Var.h(le1Var3) | kk0Var.h(chatDto);
        Object objP3 = kk0Var.P();
        if (zH3 || objP3 == Composer$Companion.getEmpty()) {
            objP3 = new k90(le1Var3, chatDto, 2);
            kk0Var.l0(objP3);
        }
        je1 je1Var3 = (je1) objP3;
        boolean zH4 = kk0Var.h(chatDto);
        Object objP4 = kk0Var.P();
        if (zH4 || objP4 == Composer$Companion.getEmpty()) {
            objP4 = new l90(chatDto, mi2Var, 0);
            kk0Var.l0(objP4);
        }
        je1 je1Var4 = (je1) objP4;
        boolean zH5 = kk0Var.h(chatDto);
        Object objP5 = kk0Var.P();
        if (zH5 || objP5 == Composer$Companion.getEmpty()) {
            objP5 = new l90(chatDto, this.s, 1);
            kk0Var.l0(objP5);
        }
        je1 je1Var5 = (je1) objP5;
        le1 le1Var4 = this.n;
        boolean zH6 = kk0Var.h(le1Var4) | kk0Var.h(chatDto);
        Object objP6 = kk0Var.P();
        if (zH6 || objP6 == Composer$Companion.getEmpty()) {
            objP6 = new k90(le1Var4, chatDto, 3);
            kk0Var.l0(objP6);
        }
        je1 je1Var6 = (je1) objP6;
        le1 le1Var5 = this.o;
        boolean zH7 = kk0Var.h(le1Var5) | kk0Var.h(chatDto);
        Object objP7 = kk0Var.P();
        if (zH7 || objP7 == Composer$Companion.getEmpty()) {
            objP7 = new k90(le1Var5, chatDto, 4);
            kk0Var.l0(objP7);
        }
        je1 je1Var7 = (je1) objP7;
        ne1 ne1Var = this.q;
        boolean zH8 = kk0Var.h(ne1Var) | kk0Var.h(chatDto);
        Object objP8 = kk0Var.P();
        if (zH8 || objP8 == Composer$Companion.getEmpty()) {
            objP8 = new m90(ne1Var, chatDto, mi2Var);
            kk0Var.l0(objP8);
        }
        le1 le1Var6 = (le1) objP8;
        Object objP9 = kk0Var.P();
        if (objP9 == Composer$Companion.getEmpty()) {
            objP9 = new n90(0, mi2Var);
            kk0Var.l0(objP9);
        }
        wa0.ChatItem(chatDto, zN, je1Var, je1Var2, z, titleOverride, je1Var3, je1Var4, je1Var5, z2, zContains, je1Var6, je1Var7, this.p, zN2, le1Var6, (je1) objP9, kk0Var, 0, 1572864, 0);
        kk0Var.r(false);
    }
}
