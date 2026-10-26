package defpackage;

import ai.notrack.app.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class k71 extends sv0 {
    public final Handler s0 = new Handler(Looper.getMainLooper());
    public final im t0 = new im(4, this);
    public av u0;
    public int v0;
    public int w0;
    public ImageView x0;
    public TextView y0;

    @Override // defpackage.xc1
    public final void A() {
        this.M = true;
        av avVar = this.u0;
        avVar.x = 0;
        avVar.h(1);
        this.u0.g(m(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // defpackage.sv0
    public final Dialog J() {
        kn4 kn4Var = new kn4(F());
        gj gjVar = this.u0.d;
        String strM = null;
        CharSequence charSequence = gjVar != null ? (CharSequence) gjVar.c : null;
        c7 c7Var = (c7) kn4Var.c;
        c7Var.d = charSequence;
        View viewInflate = LayoutInflater.from(c7Var.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            gj gjVar2 = this.u0.d;
            CharSequence charSequence2 = gjVar2 != null ? (CharSequence) gjVar2.d : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence2);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.u0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.x0 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.y0 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (xr0.g0(this.u0.e())) {
            strM = m(R.string.confirm_device_credential_password);
        } else {
            av avVar = this.u0;
            String str = avVar.i;
            if (str != null) {
                strM = str;
            } else if (avVar.d != null) {
                strM = BuildConfig.VERSION_NAME;
            }
        }
        zu zuVar = new zu(this);
        c7Var.f = strM;
        c7Var.g = zuVar;
        c7Var.k = viewInflate;
        g7 g7VarF = kn4Var.f();
        g7VarF.setCanceledOnTouchOutside(false);
        return g7VarF;
    }

    public final int K(int i) {
        Context contextJ = j();
        if (contextJ == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextJ.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = contextJ.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.sv0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        av avVar = this.u0;
        if (avVar.w == null) {
            avVar.w = new ih2();
        }
        av.j(avVar.w, Boolean.TRUE);
    }

    @Override // defpackage.sv0, defpackage.xc1
    public final void v(Bundle bundle) {
        super.v(bundle);
        int i = 1;
        av avVarD = wu.d(this, this.n.getBoolean("host_activity", true));
        this.u0 = avVarD;
        if (avVarD.y == null) {
            avVarD.y = new ih2();
        }
        avVarD.y.d(this, new h71(this, 0));
        av avVar = this.u0;
        if (avVar.z == null) {
            avVar.z = new ih2();
        }
        avVar.z.d(this, new h71(this, i));
        if (Build.VERSION.SDK_INT >= 26) {
            this.v0 = K(j71.a());
        } else {
            Context contextJ = j();
            this.v0 = contextJ != null ? contextJ.getColor(R.color.biometric_error_color) : 0;
        }
        this.w0 = K(android.R.attr.textColorSecondary);
    }

    @Override // defpackage.xc1
    public final void z() {
        this.M = true;
        this.s0.removeCallbacksAndMessages(null);
    }
}
