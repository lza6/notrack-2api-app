package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class m44 implements View.OnClickListener {
    public final a3 c;
    public final /* synthetic */ o44 d;

    public m44(o44 o44Var) {
        this.d = o44Var;
        Context context = o44Var.a.getContext();
        CharSequence charSequence = o44Var.h;
        a3 a3Var = new a3();
        a3Var.e = ConstantsKt.DEFAULT_BLOCK_SIZE;
        a3Var.g = ConstantsKt.DEFAULT_BLOCK_SIZE;
        a3Var.l = null;
        a3Var.m = null;
        a3Var.n = false;
        a3Var.o = false;
        a3Var.p = 16;
        a3Var.i = context;
        a3Var.a = charSequence;
        this.c = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o44 o44Var = this.d;
        Window.Callback callback = o44Var.k;
        if (callback == null || !o44Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.c);
    }
}
