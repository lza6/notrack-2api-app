package defpackage;

import android.media.MediaPlayer;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class af4 extends uo0 {
    public int c;
    public File d;
    public MediaPlayer h;
    public ym3 l;
    public double m;
    public double n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ef4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af4(ef4 ef4Var, uo0 uo0Var) {
        super(uo0Var);
        this.p = ef4Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.c(0, null, 0.0d, 0.0d, this);
    }
}
