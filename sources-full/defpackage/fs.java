package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.Clipboard;

/* JADX INFO: loaded from: classes.dex */
public final class fs extends ww1 implements je1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ wx3 d;
    public final /* synthetic */ lh1 h;
    public final /* synthetic */ Clipboard l;
    public final /* synthetic */ os m;
    public final /* synthetic */ wu0 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(c cVar, wx3 wx3Var, lh1 lh1Var, Clipboard clipboard, os osVar, wu0 wu0Var, boolean z, boolean z2, boolean z3) {
        super(0);
        this.c = cVar;
        this.d = wx3Var;
        this.h = lh1Var;
        this.l = clipboard;
        this.m = osVar;
        this.n = wu0Var;
        this.o = z;
        this.p = z2;
        this.q = z3;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        this.c.getClass();
        wx3 wx3Var = this.d;
        boolean z = this.o;
        if (!z) {
            wx3Var.s();
        }
        wx3Var.h = this.h;
        wx3Var.j = this.l;
        wx3Var.i = this.m;
        wx3Var.c = this.n;
        wx3Var.d = z;
        wx3Var.e = this.p;
        wx3Var.g = this.q;
        return w84.a;
    }
}
