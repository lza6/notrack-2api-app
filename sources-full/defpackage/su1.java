package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class su1 {
    public static final /* synthetic */ su1[] c = {new su1("PUBLIC", 0), new su1("PROTECTED", 1), new su1("INTERNAL", 2), new su1("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    su1 EF5;

    public static su1 valueOf(String str) {
        return (su1) Enum.valueOf(su1.class, str);
    }

    public static su1[] values() {
        return (su1[]) c.clone();
    }
}
