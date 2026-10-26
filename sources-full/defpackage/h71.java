package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class h71 implements in2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ k71 d;

    public /* synthetic */ h71(k71 k71Var, int i) {
        this.c = i;
        this.d = k71Var;
    }

    @Override // defpackage.in2
    public final void r(Object obj) {
        int i = this.c;
        k71 k71Var = this.d;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                Handler handler = k71Var.s0;
                im imVar = k71Var.t0;
                handler.removeCallbacks(imVar);
                int iIntValue = num.intValue();
                if (k71Var.x0 != null) {
                    int i2 = k71Var.u0.x;
                    Context contextJ = k71Var.j();
                    Drawable drawable = null;
                    if (contextJ == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i3 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i2 == 0 && iIntValue == 1) {
                            drawable = contextJ.getDrawable(i3);
                        } else {
                            if (i2 == 1 && iIntValue == 2) {
                                i3 = R.drawable.fingerprint_dialog_error;
                            } else if ((i2 == 2 && iIntValue == 1) || (i2 == 1 && iIntValue == 3)) {
                            }
                            drawable = contextJ.getDrawable(i3);
                        }
                    }
                    if (drawable != null) {
                        k71Var.x0.setImageDrawable(drawable);
                        if ((i2 != 0 || iIntValue != 1) && ((i2 == 1 && iIntValue == 2) || (i2 == 2 && iIntValue == 1))) {
                            i71.a(drawable);
                        }
                        k71Var.u0.x = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = k71Var.y0;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? k71Var.v0 : k71Var.w0);
                }
                handler.postDelayed(imVar, 2000L);
                break;
            default:
                CharSequence charSequence = (CharSequence) obj;
                Handler handler2 = k71Var.s0;
                im imVar2 = k71Var.t0;
                handler2.removeCallbacks(imVar2);
                TextView textView2 = k71Var.y0;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                handler2.postDelayed(imVar2, 2000L);
                break;
        }
    }
}
