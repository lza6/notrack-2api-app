package defpackage;

import notrack.ai.data.voice.VoiceConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s60 implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    public /* synthetic */ s60(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.l = obj;
        this.d = obj2;
        this.h = obj3;
    }

    public /* synthetic */ s60(je1 je1Var, je1 je1Var2, mi2 mi2Var) {
        this.c = 1;
        this.d = je1Var;
        this.h = je1Var2;
        this.l = mi2Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        Object obj4 = this.h;
        Object obj5 = this.d;
        Object obj6 = this.l;
        switch (i) {
            case 0:
                return wa0.UpdateBanner$lambda$391((w94) obj6, (je1) obj5, (je1) obj4, (pf) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 1:
                return wa0.FolderRow$lambda$896$lambda$895((je1) obj5, (je1) obj4, (mi2) obj6, (lf0) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 2:
                return wa0.PersonaPill$lambda$612$lambda$611((String) obj6, (le1) obj5, (mi2) obj4, (lf0) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 3:
                return wa0.ChatScreen$lambda$386$lambda$385$lambda$384$lambda$383((gq0) obj6, (g22) obj5, (mi2) obj4, (pf) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 4:
                return wa0.ChatScreen$lambda$386$lambda$385$lambda$384$lambda$335((hb0) obj6, (gn3) obj5, (mi2) obj4, (pf) obj, (ck0) obj2, ((Integer) obj3).intValue());
            default:
                return pe4.VoiceMenuSheet$lambda$24((VoiceConfig) obj6, (String) obj5, (le1) obj4, (lf0) obj, (ck0) obj2, ((Integer) obj3).intValue());
        }
    }
}
