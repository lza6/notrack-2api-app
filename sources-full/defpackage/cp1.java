package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class cp1 implements dp1 {
    public final InputContentInfo c;

    public cp1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.c = new InputContentInfo(uri, clipDescription, uri2);
    }

    public cp1(Object obj) {
        this.c = (InputContentInfo) obj;
    }

    @Override // defpackage.dp1
    public final ClipDescription a() {
        return this.c.getDescription();
    }

    @Override // defpackage.dp1
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.dp1
    public final Uri c() {
        return this.c.getContentUri();
    }

    @Override // defpackage.dp1
    public final void e() {
        this.c.requestPermission();
    }

    @Override // defpackage.dp1
    public final Uri f() {
        return this.c.getLinkUri();
    }
}
