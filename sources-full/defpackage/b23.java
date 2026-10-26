package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b23 {
    public static final b23 c;
    public static final /* synthetic */ b23[] d;

    static {
        b23 b23Var = new b23("DEFAULT", 0);
        c = b23Var;
        b23 b23Var2 = new b23("UNMETERED_ONLY", 1);
        b23 b23Var3 = new b23("UNMETERED_OR_DAILY", 2);
        b23 b23Var4 = new b23("FAST_IF_RADIO_AWAKE", 3);
        b23 b23Var5 = new b23("NEVER", 4);
        b23 b23Var6 = new b23("UNRECOGNIZED", 5);
        d = new b23[]{b23Var, b23Var2, b23Var3, b23Var4, b23Var5, b23Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, b23Var);
        sparseArray.put(1, b23Var2);
        sparseArray.put(2, b23Var3);
        sparseArray.put(3, b23Var4);
        sparseArray.put(4, b23Var5);
        sparseArray.put(-1, b23Var6);
    }

    public static b23 valueOf(String str) {
        return (b23) Enum.valueOf(b23.class, str);
    }

    public static b23[] values() {
        return (b23[]) d.clone();
    }
}
