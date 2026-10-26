package defpackage;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;
import notrack.ai.data.voice.VoiceConfig;

/* JADX INFO: loaded from: classes.dex */
public final class fb0 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public int d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(hb0 hb0Var, String str, boolean z, so0 so0Var) {
        super(2, so0Var);
        this.l = hb0Var;
        this.m = str;
        this.h = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(iy2 iy2Var, boolean z, tq1 tq1Var, so0 so0Var) {
        super(2, so0Var);
        this.l = iy2Var;
        this.h = z;
        this.m = tq1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.m;
        boolean z = this.h;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                return new fb0((hb0) obj3, (String) obj2, z, so0Var);
            default:
                return new fb0((iy2) obj3, z, (tq1) obj2, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((fb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objY;
        Object value;
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.m;
        boolean z = this.h;
        Object obj3 = this.l;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                hb0 hb0Var = (hb0) obj3;
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    ge4 ge4Var = (ge4) hb0Var.b.m.getValue();
                    String strE0 = (String) obj2;
                    if (strE0 == null) {
                        strE0 = hb0Var.e0();
                    }
                    this.d = 1;
                    ge4Var.getClass();
                    jt0 jt0Var = sw0.a;
                    objY = py.Y(at0.c, new ee4(ge4Var, z, strE0, null), this);
                    if (objY == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i2 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                    objY = obj;
                }
                VoiceConfig voiceConfig = (VoiceConfig) objY;
                jn3 jn3Var = hb0Var.c;
                do {
                    value = jn3Var.getValue();
                } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, voiceConfig, null, false, null, null, null, null, null, null, -1, IntCompanionObject.MAX_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84Var;
            default:
                int i3 = this.d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                iy2 iy2Var = (iy2) obj3;
                gh2 gh2Var = (gh2) (z ? iy2Var.h : iy2Var.l);
                this.d = 1;
                return ((hh2) gh2Var).a((tq1) obj2, this) == hq0Var ? hq0Var : w84Var;
        }
    }
}
