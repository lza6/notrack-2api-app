package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ce {
    public final /* synthetic */ int a;

    public /* synthetic */ ce(int i) {
        this.a = i;
    }

    public final da4 a(Object obj, jq2 jq2Var) {
        switch (this.a) {
            case 0:
                return jr1.N(((Uri) obj).toString());
            case 1:
                return jr1.b(((File) obj).getPath());
            case 2:
                return jr1.b(((mt2) obj).c.p());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = jq2Var.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return jr1.N("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return jr1.N((String) obj);
        }
    }
}
