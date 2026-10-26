package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gn {
    public static final gn c;
    public static final gn d;
    public static final gn h;
    public static final /* synthetic */ gn[] l;

    static {
        gn gnVar = new gn("UPLOADING", 0);
        c = gnVar;
        gn gnVar2 = new gn("READY", 1);
        d = gnVar2;
        gn gnVar3 = new gn("ERROR", 2);
        h = gnVar3;
        l = new gn[]{gnVar, gnVar2, gnVar3};
    }

    public static gn valueOf(String str) {
        return (gn) Enum.valueOf(gn.class, str);
    }

    public static gn[] values() {
        return (gn[]) l.clone();
    }
}
