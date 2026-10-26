package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qt3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ jr0 a;

    public qt3(jr0 jr0Var) {
        this.a = jr0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Layout layout;
        jr0 jr0Var = this.a;
        view.removeOnLayoutChangeListener(this);
        try {
            if (jr0Var.getMaxLines() != -1 && jr0Var.getLineCount() > jr0Var.getMaxLines() && (layout = jr0Var.getLayout()) != null) {
                int i9 = 1;
                int lineEnd = layout.getLineEnd(jr0Var.getMaxLines() - 1);
                if (lineEnd >= 0 && lineEnd <= jr0Var.getText().length()) {
                    float fMeasureText = jr0Var.getPaint().measureText("…");
                    while (lineEnd > 0) {
                        if (jr0Var.getPaint().measureText(jr0Var.getText().subSequence(0, lineEnd).toString()) + fMeasureText <= layout.getLineWidth(jr0Var.getMaxLines() - 1)) {
                            break;
                        } else {
                            lineEnd--;
                        }
                    }
                    if (lineEnd > 0) {
                        i9 = lineEnd;
                    }
                    CharSequence charSequenceSubSequence = jr0Var.getText().subSequence(0, i9);
                    Spanned spanned = charSequenceSubSequence instanceof Spanned ? (Spanned) charSequenceSubSequence : null;
                    if (spanned != null) {
                        jr0Var.setText(new SpannableStringBuilder().append((CharSequence) spanned).append((CharSequence) "…"));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
