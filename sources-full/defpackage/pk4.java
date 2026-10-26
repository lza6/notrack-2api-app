package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class pk4 extends uk4 {
    public final /* synthetic */ Intent c;
    public final /* synthetic */ GoogleApiActivity d;

    public pk4(Intent intent, GoogleApiActivity googleApiActivity) {
        this.c = intent;
        this.d = googleApiActivity;
    }

    @Override // defpackage.uk4
    public final void a() {
        Intent intent = this.c;
        if (intent != null) {
            this.d.startActivityForResult(intent, 2);
        }
    }
}
