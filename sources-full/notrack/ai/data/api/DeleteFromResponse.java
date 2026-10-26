package notrack.ai.data.api;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class DeleteFromResponse {
    public static final Companion Companion = new Companion();
    private final boolean chatDeleted;
    private final String chatId;
    private final boolean ok;

    public final class Companion {
        public final qu1 serializer() {
            return DeleteFromResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeleteFromResponse(int i, String str, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.ok = false;
        } else {
            this.ok = z;
        }
        this.chatId = (i & 2) == 0 ? BuildConfig.VERSION_NAME : str;
        if ((i & 4) == 0) {
            this.chatDeleted = false;
        } else {
            this.chatDeleted = z2;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(DeleteFromResponse deleteFromResponse, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || deleteFromResponse.ok) {
            do3Var.c(tf3Var, 0, deleteFromResponse.ok);
        }
        if (do3Var.w(tf3Var) || !kr1.n(deleteFromResponse.chatId, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, deleteFromResponse.chatId);
        }
        if (do3Var.w(tf3Var) || deleteFromResponse.chatDeleted) {
            do3Var.c(tf3Var, 2, deleteFromResponse.chatDeleted);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteFromResponse)) {
            return false;
        }
        DeleteFromResponse deleteFromResponse = (DeleteFromResponse) obj;
        return this.ok == deleteFromResponse.ok && kr1.n(this.chatId, deleteFromResponse.chatId) && this.chatDeleted == deleteFromResponse.chatDeleted;
    }

    public final boolean getChatDeleted() {
        return this.chatDeleted;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.chatDeleted) + ud2.i(Boolean.hashCode(this.ok) * 31, 31, this.chatId);
    }

    public final String toString() {
        return "DeleteFromResponse(ok=" + this.ok + ", chatId=" + this.chatId + ", chatDeleted=" + this.chatDeleted + ")";
    }
}
