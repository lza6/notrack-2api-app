package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pk2 {
    public static final SparseArray c;
    public static final /* synthetic */ pk2[] d;

    /* JADX INFO: Fake field, exist only in values array */
    pk2 EF1;

    static {
        pk2 pk2Var = new pk2("UNKNOWN_MOBILE_SUBTYPE", 0);
        pk2 pk2Var2 = new pk2("GPRS", 1);
        pk2 pk2Var3 = new pk2("EDGE", 2);
        pk2 pk2Var4 = new pk2("UMTS", 3);
        pk2 pk2Var5 = new pk2("CDMA", 4);
        pk2 pk2Var6 = new pk2("EVDO_0", 5);
        pk2 pk2Var7 = new pk2("EVDO_A", 6);
        pk2 pk2Var8 = new pk2("RTT", 7);
        pk2 pk2Var9 = new pk2("HSDPA", 8);
        pk2 pk2Var10 = new pk2("HSUPA", 9);
        pk2 pk2Var11 = new pk2("HSPA", 10);
        pk2 pk2Var12 = new pk2("IDEN", 11);
        pk2 pk2Var13 = new pk2("EVDO_B", 12);
        pk2 pk2Var14 = new pk2("LTE", 13);
        pk2 pk2Var15 = new pk2("EHRPD", 14);
        pk2 pk2Var16 = new pk2("HSPAP", 15);
        pk2 pk2Var17 = new pk2("GSM", 16);
        pk2 pk2Var18 = new pk2("TD_SCDMA", 17);
        pk2 pk2Var19 = new pk2("IWLAN", 18);
        pk2 pk2Var20 = new pk2("LTE_CA", 19);
        d = new pk2[]{pk2Var, pk2Var2, pk2Var3, pk2Var4, pk2Var5, pk2Var6, pk2Var7, pk2Var8, pk2Var9, pk2Var10, pk2Var11, pk2Var12, pk2Var13, pk2Var14, pk2Var15, pk2Var16, pk2Var17, pk2Var18, pk2Var19, pk2Var20, new pk2("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        sparseArray.put(0, pk2Var);
        sparseArray.put(1, pk2Var2);
        sparseArray.put(2, pk2Var3);
        sparseArray.put(3, pk2Var4);
        sparseArray.put(4, pk2Var5);
        sparseArray.put(5, pk2Var6);
        sparseArray.put(6, pk2Var7);
        sparseArray.put(7, pk2Var8);
        sparseArray.put(8, pk2Var9);
        sparseArray.put(9, pk2Var10);
        sparseArray.put(10, pk2Var11);
        sparseArray.put(11, pk2Var12);
        sparseArray.put(12, pk2Var13);
        sparseArray.put(13, pk2Var14);
        sparseArray.put(14, pk2Var15);
        sparseArray.put(15, pk2Var16);
        sparseArray.put(16, pk2Var17);
        sparseArray.put(17, pk2Var18);
        sparseArray.put(18, pk2Var19);
        sparseArray.put(19, pk2Var20);
    }

    public static pk2 valueOf(String str) {
        return (pk2) Enum.valueOf(pk2.class, str);
    }

    public static pk2[] values() {
        return (pk2[]) d.clone();
    }
}
