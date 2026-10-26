package notrack.ai.data.avatars;

import app.template.extension.BuildConfig;
import defpackage.a31;
import defpackage.do3;
import defpackage.kr1;
import defpackage.lg;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import defpackage.yo4;
import defpackage.z21;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarCatalogue {
    private static final ly1[] $childSerializers;
    public static final Companion Companion = new Companion();
    private static final AvatarCatalogue EMPTY;
    private final List<String> categories;
    private final List<AvatarItem> items;
    private final Map<String, String> labels;
    private final String lang;
    private final boolean ok;
    private final String version;

    public final class Companion {
        public final qu1 serializer() {
            return AvatarCatalogue$$serializer.INSTANCE;
        }
    }

    static {
        lg lgVar = new lg(3);
        q22 q22Var = q22.c;
        $childSerializers = new ly1[]{null, null, yo4.H(q22Var, lgVar), yo4.H(q22Var, new lg(4)), yo4.H(q22Var, new lg(5)), null};
        EMPTY = new AvatarCatalogue(0);
    }

    public AvatarCatalogue(int i) {
        this.ok = false;
        this.version = BuildConfig.VERSION_NAME;
        z21 z21Var = z21.c;
        this.categories = z21Var;
        this.items = z21Var;
        this.labels = a31.c;
        this.lang = BuildConfig.VERSION_NAME;
    }

    public /* synthetic */ AvatarCatalogue(int i, boolean z, String str, List list, List list2, Map map, String str2) {
        this.ok = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.version = BuildConfig.VERSION_NAME;
        } else {
            this.version = str;
        }
        int i2 = i & 4;
        z21 z21Var = z21.c;
        if (i2 == 0) {
            this.categories = z21Var;
        } else {
            this.categories = list;
        }
        if ((i & 8) == 0) {
            this.items = z21Var;
        } else {
            this.items = list2;
        }
        if ((i & 16) == 0) {
            this.labels = a31.c;
        } else {
            this.labels = map;
        }
        if ((i & 32) == 0) {
            this.lang = BuildConfig.VERSION_NAME;
        } else {
            this.lang = str2;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(AvatarCatalogue avatarCatalogue, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !avatarCatalogue.ok) {
            do3Var.c(tf3Var, 0, avatarCatalogue.ok);
        }
        if (do3Var.w(tf3Var) || !kr1.n(avatarCatalogue.version, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, avatarCatalogue.version);
        }
        boolean zW = do3Var.w(tf3Var);
        z21 z21Var = z21.c;
        ly1[] ly1VarArr = $childSerializers;
        if (zW || !kr1.n(avatarCatalogue.categories, z21Var)) {
            do3Var.q(tf3Var, 2, (qu1) ly1VarArr[2].getValue(), avatarCatalogue.categories);
        }
        if (do3Var.w(tf3Var) || !kr1.n(avatarCatalogue.items, z21Var)) {
            do3Var.q(tf3Var, 3, (qu1) ly1VarArr[3].getValue(), avatarCatalogue.items);
        }
        if (do3Var.w(tf3Var) || !kr1.n(avatarCatalogue.labels, a31.c)) {
            do3Var.q(tf3Var, 4, (qu1) ly1VarArr[4].getValue(), avatarCatalogue.labels);
        }
        if (!do3Var.w(tf3Var) && kr1.n(avatarCatalogue.lang, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 5, avatarCatalogue.lang);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarCatalogue)) {
            return false;
        }
        AvatarCatalogue avatarCatalogue = (AvatarCatalogue) obj;
        return this.ok == avatarCatalogue.ok && kr1.n(this.version, avatarCatalogue.version) && kr1.n(this.categories, avatarCatalogue.categories) && kr1.n(this.items, avatarCatalogue.items) && kr1.n(this.labels, avatarCatalogue.labels) && kr1.n(this.lang, avatarCatalogue.lang);
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final List<AvatarItem> getItems() {
        return this.items;
    }

    public final Map<String, String> getLabels() {
        return this.labels;
    }

    public final int hashCode() {
        return this.lang.hashCode() + ((this.labels.hashCode() + ud2.j(ud2.j(ud2.i(Boolean.hashCode(this.ok) * 31, 31, this.version), 31, this.categories), 31, this.items)) * 31);
    }

    public final String toString() {
        return "AvatarCatalogue(ok=" + this.ok + ", version=" + this.version + ", categories=" + this.categories + ", items=" + this.items + ", labels=" + this.labels + ", lang=" + this.lang + ")";
    }
}
