package defpackage;

import ai.notrack.app.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class sv0 extends xc1 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler c0;
    public boolean l0;
    public Dialog n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final im d0 = new im(2, this);
    public final pv0 e0 = new pv0(this);
    public final qv0 f0 = new qv0(this);
    public int g0 = 0;
    public int h0 = 0;
    public boolean i0 = true;
    public boolean j0 = true;
    public int k0 = -1;
    public final jb m0 = new jb(28, this);
    public boolean r0 = false;

    @Override // defpackage.xc1
    public final void B(Bundle bundle) {
        Dialog dialog = this.n0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.g0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.h0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.i0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.j0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.k0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.xc1
    public final void C() {
        this.M = true;
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = false;
            dialog.show();
            View decorView = this.n0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.xc1
    public final void D() {
        this.M = true;
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.xc1
    public final void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.E(layoutInflater, viewGroup, bundle);
        if (this.n0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.n0.onRestoreInstanceState(bundle2);
    }

    public final void I(boolean z) {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        this.q0 = false;
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.n0.dismiss();
            if (!z) {
                if (Looper.myLooper() == this.c0.getLooper()) {
                    onDismiss(this.n0);
                } else {
                    this.c0.post(this.d0);
                }
            }
        }
        this.o0 = true;
        if (this.k0 < 0) {
            er erVar = new er(l());
            erVar.o = true;
            erVar.h(this);
            erVar.e(true, true);
            return;
        }
        nd1 nd1VarL = l();
        int i = this.k0;
        if (i < 0) {
            u41.k(ud2.m(i, "Bad id: "));
        } else {
            nd1VarL.y(new ld1(nd1VarL, i), true);
            this.k0 = -1;
        }
    }

    public Dialog J() {
        if (nd1.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new sg0(F(), this.h0);
    }

    @Override // defpackage.xc1
    public final yh4 c() {
        return new rv0(this, new rv0(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.o0) {
            return;
        }
        if (nd1.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        I(true);
    }

    @Override // defpackage.xc1
    public final void s() {
        this.M = true;
    }

    @Override // defpackage.xc1
    public final void u(Context context) {
        Object obj;
        super.u(context);
        ih2 ih2Var = this.W;
        ih2Var.getClass();
        ih2.a("observeForever");
        jb jbVar = this.m0;
        u62 u62Var = new u62(ih2Var, jbVar);
        x83 x83Var = ih2Var.b;
        u83 u83VarB = x83Var.b(jbVar);
        if (u83VarB != null) {
            obj = u83VarB.d;
        } else {
            u83 u83Var = new u83(jbVar, u62Var);
            x83Var.l++;
            u83 u83Var2 = x83Var.d;
            if (u83Var2 == null) {
                x83Var.c = u83Var;
                x83Var.d = u83Var;
            } else {
                u83Var2.h = u83Var;
                u83Var.l = u83Var2;
                x83Var.d = u83Var;
            }
            obj = null;
        }
        w62 w62Var = (w62) obj;
        if (w62Var instanceof v62) {
            u41.k("Cannot add the same observer with different lifecycles");
            return;
        }
        if (w62Var == null) {
            u62Var.a(true);
        }
        if (this.q0) {
            return;
        }
        this.p0 = false;
    }

    @Override // defpackage.xc1
    public void v(Bundle bundle) {
        super.v(bundle);
        this.c0 = new Handler();
        this.j0 = this.G == 0;
        if (bundle != null) {
            this.g0 = bundle.getInt("android:style", 0);
            this.h0 = bundle.getInt("android:theme", 0);
            this.i0 = bundle.getBoolean("android:cancelable", true);
            this.j0 = bundle.getBoolean("android:showsDialog", this.j0);
            this.k0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.xc1
    public final void w() {
        this.M = true;
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = true;
            dialog.setOnDismissListener(null);
            this.n0.dismiss();
            if (!this.p0) {
                onDismiss(this.n0);
            }
            this.n0 = null;
            this.r0 = false;
        }
    }

    @Override // defpackage.xc1
    public final void x() {
        this.M = true;
        if (!this.q0 && !this.p0) {
            this.p0 = true;
        }
        ih2 ih2Var = this.W;
        ih2Var.getClass();
        ih2.a("removeObserver");
        w62 w62Var = (w62) ih2Var.b.d(this.m0);
        if (w62Var == null) {
            return;
        }
        w62Var.b();
        w62Var.a(false);
    }

    @Override // defpackage.xc1
    public final LayoutInflater y(Bundle bundle) {
        LayoutInflater layoutInflaterY = super.y(bundle);
        boolean z = this.j0;
        if (z && !this.l0) {
            if (z && !this.r0) {
                try {
                    this.l0 = true;
                    Dialog dialogJ = J();
                    this.n0 = dialogJ;
                    if (this.j0) {
                        int i = this.g0;
                        if (i == 1 || i == 2) {
                            dialogJ.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogJ.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogJ.requestWindowFeature(1);
                        }
                        Context contextJ = j();
                        if (contextJ != null) {
                            this.n0.setOwnerActivity((Activity) contextJ);
                        }
                        this.n0.setCancelable(this.i0);
                        this.n0.setOnCancelListener(this.e0);
                        this.n0.setOnDismissListener(this.f0);
                        this.r0 = true;
                    } else {
                        this.n0 = null;
                    }
                    this.l0 = false;
                } catch (Throwable th) {
                    this.l0 = false;
                    throw th;
                }
            }
            if (nd1.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.n0;
            if (dialog != null) {
                return layoutInflaterY.cloneInContext(dialog.getContext());
            }
        } else if (nd1.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.j0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterY;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterY;
    }
}
