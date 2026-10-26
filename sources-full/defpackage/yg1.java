package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import notrack.ai.data.avatars.AvatarView;

/* JADX INFO: loaded from: classes.dex */
public final class yg1 {
    public final SharedPreferences a;
    public final kt1 b;

    public yg1(Context context) {
        context.getClass();
        this.a = context.getSharedPreferences("avatars_guest", 0);
        this.b = xr0.G(new s80(9));
    }

    public final AvatarView a(String str) {
        Object i63Var;
        str.getClass();
        String string = this.a.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            i63Var = (AvatarView) this.b.b(AvatarView.Companion.serializer(), string);
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        return (AvatarView) (i63Var instanceof i63 ? null : i63Var);
    }
}
