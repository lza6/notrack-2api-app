package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class aa {
    public static final aa c;
    public static final aa d;
    public static final /* synthetic */ aa[] h;

    static {
        aa aaVar = new aa("SHOW_ORIGINAL", 0);
        c = aaVar;
        aa aaVar2 = new aa("SHOW_TRANSLATED", 1);
        d = aaVar2;
        h = new aa[]{aaVar, aaVar2};
    }

    public static aa valueOf(String str) {
        return (aa) Enum.valueOf(aa.class, str);
    }

    public static aa[] values() {
        return (aa[]) h.clone();
    }
}
