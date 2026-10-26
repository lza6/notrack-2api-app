package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kg {
    public static final kg c;
    public static final kg d;
    public static final kg h;
    public static final kg l;
    public static final kg m;
    public static final kg n;
    public static final kg o;
    public static final /* synthetic */ kg[] p;

    static {
        kg kgVar = new kg("Paragraph", 0);
        c = kgVar;
        kg kgVar2 = new kg("Span", 1);
        d = kgVar2;
        kg kgVar3 = new kg("VerbatimTts", 2);
        h = kgVar3;
        kg kgVar4 = new kg("Url", 3);
        l = kgVar4;
        kg kgVar5 = new kg("Link", 4);
        m = kgVar5;
        kg kgVar6 = new kg("Clickable", 5);
        n = kgVar6;
        kg kgVar7 = new kg("String", 6);
        o = kgVar7;
        p = new kg[]{kgVar, kgVar2, kgVar3, kgVar4, kgVar5, kgVar6, kgVar7};
    }

    public static kg valueOf(String str) {
        return (kg) Enum.valueOf(kg.class, str);
    }

    public static kg[] values() {
        return (kg[]) p.clone();
    }
}
