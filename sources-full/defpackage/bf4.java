package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class bf4 extends mq3 implements ne1 {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ MediaPlayer h;
    public final /* synthetic */ ef4 l;
    public final /* synthetic */ double m;
    public final /* synthetic */ double n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf4(MediaPlayer mediaPlayer, ef4 ef4Var, double d, double d2, so0 so0Var) {
        super(2, so0Var);
        this.h = mediaPlayer;
        this.l = ef4Var;
        this.m = d;
        this.n = d2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        bf4 bf4Var = new bf4(this.h, this.l, this.m, this.n, so0Var);
        bf4Var.d = obj;
        return bf4Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((bf4) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        double currentPosition;
        Object value;
        we4 we4Var;
        double d;
        gq0 gq0Var = (gq0) this.d;
        int i = this.c;
        if (i != 0 && i != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(obj);
        while (yo4.F(gq0Var)) {
            try {
                currentPosition = ((double) this.h.getCurrentPosition()) / 1000.0d;
            } catch (IllegalStateException unused) {
                currentPosition = 0.0d;
            }
            jn3 jn3Var = this.l.d;
            do {
                value = jn3Var.getValue();
                we4Var = (we4) value;
                double d2 = this.m + currentPosition;
                d = this.n;
                if (d < 0.01d) {
                    d = 0.01d;
                }
                if (d2 <= d) {
                    d = d2;
                }
            } while (!jn3Var.n(value, we4.a(we4Var, false, false, d, 0.0d, 0.0f, null, 479)));
            this.d = gq0Var;
            this.c = 1;
            Object objU = p23.u(60L, this);
            hq0 hq0Var = hq0.c;
            if (objU == hq0Var) {
                return hq0Var;
            }
        }
        return w84.a;
    }
}
