package defpackage;

import ai.notrack.app.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public class sg0 extends Dialog implements n32, ho2, u93 {
    public p32 c;
    public final cr1 d;
    public final go2 h;

    public sg0(Context context, int i) {
        super(context, i);
        this.d = new cr1(this);
        this.h = new go2(new m3(5, this));
    }

    public static void c(sg0 sg0Var) {
        super.onBackPressed();
    }

    @Override // defpackage.ho2
    public final go2 a() {
        return this.h;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.u93
    public final t93 b() {
        return (t93) this.d.c;
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.n32
    public final p32 h() {
        p32 p32Var = this.c;
        if (p32Var != null) {
            return p32Var;
        }
        p32 p32Var2 = new p32(this);
        this.c = p32Var2;
        return p32Var2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.h.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            go2 go2Var = this.h;
            go2Var.getClass();
            go2Var.e = onBackInvokedDispatcher;
            go2Var.d(go2Var.g);
        }
        this.d.e(bundle);
        p32 p32Var = this.c;
        if (p32Var == null) {
            p32Var = new p32(this);
            this.c = p32Var;
        }
        p32Var.e(f32.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.d.f(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        p32 p32Var = this.c;
        if (p32Var == null) {
            p32Var = new p32(this);
            this.c = p32Var;
        }
        p32Var.e(f32.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        p32 p32Var = this.c;
        if (p32Var == null) {
            p32Var = new p32(this);
            this.c = p32Var;
        }
        p32Var.e(f32.ON_DESTROY);
        this.c = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}
