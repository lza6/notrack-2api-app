package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;

/* JADX INFO: loaded from: classes.dex */
public final class m9 extends bp {
    public final sz0 a;
    public final af3 b;
    public final AndroidComposeView c;
    public final j43 d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final eh2 h;
    public boolean i;

    public m9(sz0 sz0Var, af3 af3Var, AndroidComposeView androidComposeView, j43 j43Var, String str) {
        this.a = sz0Var;
        this.b = af3Var;
        this.c = androidComposeView;
        this.d = j43Var;
        this.e = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(androidComposeView);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 == null) {
            throw fq2.i("Required value was null.");
        }
        this.g = autofillId2;
        this.h = new eh2();
    }
}
