package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qr {
    public static final /* synthetic */ qr[] c = {new qr("PRESENT", 0), new qr("ABSENT", 1), new qr("PRESENT_OPTIONAL", 2), new qr("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    qr EF5;

    public static qr valueOf(String str) {
        return (qr) Enum.valueOf(qr.class, str);
    }

    public static qr[] values() {
        return (qr[]) c.clone();
    }
}
