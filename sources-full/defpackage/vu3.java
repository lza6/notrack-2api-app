package defpackage;

import android.view.DragEvent;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;

/* JADX INFO: loaded from: classes.dex */
public final class vu3 implements zx0 {
    public final /* synthetic */ ku3 c;
    public final /* synthetic */ ea d;
    public final /* synthetic */ ku3 h;
    public final /* synthetic */ ku3 l;
    public final /* synthetic */ ku3 m;
    public final /* synthetic */ ku3 n;

    public vu3(ku3 ku3Var, ea eaVar, ku3 ku3Var2, ku3 ku3Var3, ku3 ku3Var4, ku3 ku3Var5) {
        this.c = ku3Var;
        this.d = eaVar;
        this.h = ku3Var2;
        this.l = ku3Var3;
        this.m = ku3Var4;
        this.n = ku3Var5;
    }

    @Override // defpackage.zx0
    public final void G(wx0 wx0Var) {
    }

    @Override // defpackage.zx0
    public final void J(wx0 wx0Var) {
        DragEvent dragEvent = wx0Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
        nu3 nu3Var = this.l.d;
        cx1 cx1Var = (cx1) nu3Var.l.f.getValue();
        if (cx1Var != null && cx1Var.z()) {
            jFloatToRawIntBits = cx1Var.e(jFloatToRawIntBits);
        }
        int iC = nu3Var.l.c(jFloatToRawIntBits, true);
        if (iC >= 0) {
            nu3Var.h.j(p23.d(iC, iC));
        }
        nu3Var.m.z(ah1.c, jFloatToRawIntBits);
    }

    @Override // defpackage.zx0
    public final void M(wx0 wx0Var) {
        this.n.invoke(wx0Var);
    }

    @Override // defpackage.zx0
    public final boolean m0(wx0 wx0Var) {
        this.c.invoke(wx0Var);
        DragEvent dragEvent = wx0Var.a;
        this.d.invoke(AndroidClipboardManager_androidKt.toClipEntry(dragEvent.getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(dragEvent.getClipDescription()));
        return Boolean.TRUE.booleanValue();
    }

    @Override // defpackage.zx0
    public final void x(wx0 wx0Var) {
        this.h.invoke(wx0Var);
    }

    @Override // defpackage.zx0
    public final void y(wx0 wx0Var) {
        this.m.invoke(wx0Var);
    }
}
