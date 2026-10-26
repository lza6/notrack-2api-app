package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class e implements rd4 {
    public boolean a;
    public int b;
    public Object c;

    @Override // defpackage.rd4
    public void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.n = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.rd4
    public void b() {
        this.a = true;
    }

    @Override // defpackage.rd4
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
