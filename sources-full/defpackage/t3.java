package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class t3 extends s3 {
    public final String a;

    public t3(String str) {
        this.a = str;
    }

    @Override // defpackage.s3
    public final Intent a(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.a).putExtra("android.intent.extra.TITLE", str);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.s3
    public final jb b(Context context, Object obj) {
        ((String) obj).getClass();
        return null;
    }

    @Override // defpackage.s3
    public final Object c(Intent intent, int i) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
