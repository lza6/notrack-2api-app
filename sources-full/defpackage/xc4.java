package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class xc4 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static nn0 b(View view, nn0 nn0Var) {
        ContentInfo contentInfoJ = nn0Var.a.j();
        Objects.requireNonNull(contentInfoJ);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoJ);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoJ ? nn0Var : new nn0(new jb(contentInfoPerformReceiveContent));
    }
}
