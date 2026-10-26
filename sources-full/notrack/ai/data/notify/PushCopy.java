package notrack.ai.data.notify;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;

/* JADX INFO: loaded from: classes.dex */
public final class PushCopy {
    public static final Companion Companion = new Companion();
    private final String body;
    private final String title;

    public final class Companion {
        public final qu1 serializer() {
            return PushCopy$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PushCopy(String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.title = BuildConfig.VERSION_NAME;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.body = BuildConfig.VERSION_NAME;
        } else {
            this.body = str2;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(PushCopy pushCopy, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(pushCopy.title, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, pushCopy.title);
        }
        if (!do3Var.w(tf3Var) && kr1.n(pushCopy.body, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 1, pushCopy.body);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushCopy)) {
            return false;
        }
        PushCopy pushCopy = (PushCopy) obj;
        return kr1.n(this.title, pushCopy.title) && kr1.n(this.body, pushCopy.body);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.body.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return "PushCopy(title=" + this.title + ", body=" + this.body + ")";
    }
}
