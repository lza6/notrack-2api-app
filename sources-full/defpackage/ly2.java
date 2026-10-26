package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ly2 {
    public static final /* synthetic */ ly2[] c = {new ly2("None", 0), new ly2("Url", 1), new ly2("Play", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ly2 EF5;

    public static ly2 valueOf(String str) {
        return (ly2) Enum.valueOf(ly2.class, str);
    }

    public static ly2[] values() {
        return (ly2[]) c.clone();
    }
}
