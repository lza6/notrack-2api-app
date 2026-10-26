package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sf {
    public static final sf c;
    public static final sf d;
    public static final /* synthetic */ sf[] h;

    static {
        sf sfVar = new sf("BoundReached", 0);
        c = sfVar;
        sf sfVar2 = new sf("Finished", 1);
        d = sfVar2;
        h = new sf[]{sfVar, sfVar2};
    }

    public static sf valueOf(String str) {
        return (sf) Enum.valueOf(sf.class, str);
    }

    public static sf[] values() {
        return (sf[]) h.clone();
    }
}
