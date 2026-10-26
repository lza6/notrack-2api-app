package defpackage;

import androidx.compose.ui.c;
import java.util.List;
import notrack.ai.data.voice.VoiceConfig;
import notrack.ai.data.voice.VoiceQuota;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr2 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ sr2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2, int i3) {
        this.c = i3;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
        this.q = obj6;
        this.d = i;
        this.h = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        Object obj6 = this.n;
        Object obj7 = this.m;
        Object obj8 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vr2.c((String) obj8, (String) obj7, (String) obj6, (String) obj5, (List) obj4, (c) obj3, (ck0) obj, this.d, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                pe4.VoiceGateDialog((VoiceQuota) obj8, (VoiceConfig) obj7, (je1) obj6, (je1) obj5, (je1) obj4, (je1) obj3, (ck0) obj, sf3.V(this.d | 1), this.h);
                break;
        }
        return w84Var;
    }
}
