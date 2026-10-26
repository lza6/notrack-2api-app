package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public enum st3 {
    Cut(R.string.cut),
    Copy(R.string.copy),
    Paste(R.string.paste),
    SelectAll(R.string.selectAll),
    Autofill(Build.VERSION.SDK_INT <= 26 ? ai.notrack.app.R.string.autofill : R.string.autofill);

    public final int c;

    st3(int i) {
        this.c = i;
    }

    public final String resolvedString(ck0 ck0Var, int i) {
        return ko3.stringResource(this.c, ck0Var, 0);
    }
}
