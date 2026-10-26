package defpackage;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;

/* JADX INFO: loaded from: classes.dex */
public final class j9 implements wo {
    public final AndroidComposeView a;
    public final cp b;
    public final AutofillManager c;
    public final AutofillId d;

    public j9(AndroidComposeView androidComposeView, cp cpVar) {
        this.a = androidComposeView;
        this.b = cpVar;
        AutofillManager autofillManagerH = e1.h(androidComposeView.getContext().getSystemService(e1.l()));
        if (autofillManagerH == null) {
            u41.r("Autofill service could not be located.");
            throw null;
        }
        this.c = autofillManagerH;
        androidComposeView.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(androidComposeView);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 == null) {
            throw fq2.i("Required value was null.");
        }
        this.d = autofillId2;
    }
}
