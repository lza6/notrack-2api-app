package defpackage;

import app.template.extension.BuildConfig;
import java.net.URLEncoder;
import notrack.ai.data.voice.VoiceConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ee4 extends mq3 implements ne1 {
    public final /* synthetic */ ge4 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee4(ge4 ge4Var, boolean z, String str, so0 so0Var) {
        super(2, so0Var);
        this.c = ge4Var;
        this.d = z;
        this.h = str;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new ee4(this.c, this.d, this.h, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((ee4) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        VoiceConfig voiceConfig = this.c.d;
        if (!this.d && voiceConfig != null && jCurrentTimeMillis - this.c.e < ((long) voiceConfig.getTtlSeconds()) * 1000) {
            return voiceConfig;
        }
        String str = this.c.b;
        String strEncode = URLEncoder.encode(this.h, "UTF-8");
        strEncode.getClass();
        String strEncode2 = URLEncoder.encode("play", "UTF-8");
        strEncode2.getClass();
        String str2 = str + "/speak.php?do=config&lang=" + strEncode + "&channel=" + strEncode2 + "&version_code=1295";
        try {
            tn2 tn2Var = this.c.a.d.k;
            vu vuVar = new vu();
            vuVar.p(str2);
            vuVar.h();
            l53 l53VarG = vuVar.g();
            tn2Var.getClass();
            f63 f63VarF = new y23(tn2Var, l53VarG).f();
            ge4 ge4Var = this.c;
            try {
                if (f63VarF.l == 404) {
                    ge4Var.d = null;
                    f63VarF.close();
                    return null;
                }
                if (!f63VarF.c()) {
                    VoiceConfig voiceConfig2 = ge4Var.d;
                    f63VarF.close();
                    return voiceConfig2;
                }
                m33 m33Var = f63VarF.o;
                String strL = m33Var != null ? m33Var.l() : null;
                if (strL == null) {
                    strL = BuildConfig.VERSION_NAME;
                }
                if (mo3.C0(strL)) {
                    VoiceConfig voiceConfig3 = ge4Var.d;
                    f63VarF.close();
                    return voiceConfig3;
                }
                VoiceConfig voiceConfig4 = (VoiceConfig) ge4Var.c.b(VoiceConfig.Companion.serializer(), strL);
                ge4Var.d = voiceConfig4;
                ge4Var.e = jCurrentTimeMillis;
                f63VarF.close();
                return voiceConfig4;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    jr1.i(f63VarF, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return this.c.d;
        }
    }
}
