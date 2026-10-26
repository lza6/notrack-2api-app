package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qk2 {
    public static final SparseArray c;
    public static final /* synthetic */ qk2[] d;

    /* JADX INFO: Fake field, exist only in values array */
    qk2 EF1;

    static {
        qk2 qk2Var = new qk2("MOBILE", 0);
        qk2 qk2Var2 = new qk2("WIFI", 1);
        qk2 qk2Var3 = new qk2("MOBILE_MMS", 2);
        qk2 qk2Var4 = new qk2("MOBILE_SUPL", 3);
        qk2 qk2Var5 = new qk2("MOBILE_DUN", 4);
        qk2 qk2Var6 = new qk2("MOBILE_HIPRI", 5);
        qk2 qk2Var7 = new qk2("WIMAX", 6);
        qk2 qk2Var8 = new qk2("BLUETOOTH", 7);
        qk2 qk2Var9 = new qk2("DUMMY", 8);
        qk2 qk2Var10 = new qk2("ETHERNET", 9);
        qk2 qk2Var11 = new qk2("MOBILE_FOTA", 10);
        qk2 qk2Var12 = new qk2("MOBILE_IMS", 11);
        qk2 qk2Var13 = new qk2("MOBILE_CBS", 12);
        qk2 qk2Var14 = new qk2("WIFI_P2P", 13);
        qk2 qk2Var15 = new qk2("MOBILE_IA", 14);
        qk2 qk2Var16 = new qk2("MOBILE_EMERGENCY", 15);
        qk2 qk2Var17 = new qk2("PROXY", 16);
        qk2 qk2Var18 = new qk2("VPN", 17);
        qk2 qk2Var19 = new qk2("NONE", 18);
        d = new qk2[]{qk2Var, qk2Var2, qk2Var3, qk2Var4, qk2Var5, qk2Var6, qk2Var7, qk2Var8, qk2Var9, qk2Var10, qk2Var11, qk2Var12, qk2Var13, qk2Var14, qk2Var15, qk2Var16, qk2Var17, qk2Var18, qk2Var19};
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        sparseArray.put(0, qk2Var);
        sparseArray.put(1, qk2Var2);
        sparseArray.put(2, qk2Var3);
        sparseArray.put(3, qk2Var4);
        sparseArray.put(4, qk2Var5);
        sparseArray.put(5, qk2Var6);
        sparseArray.put(6, qk2Var7);
        sparseArray.put(7, qk2Var8);
        sparseArray.put(8, qk2Var9);
        sparseArray.put(9, qk2Var10);
        sparseArray.put(10, qk2Var11);
        sparseArray.put(11, qk2Var12);
        sparseArray.put(12, qk2Var13);
        sparseArray.put(13, qk2Var14);
        sparseArray.put(14, qk2Var15);
        sparseArray.put(15, qk2Var16);
        sparseArray.put(16, qk2Var17);
        sparseArray.put(17, qk2Var18);
        sparseArray.put(-1, qk2Var19);
    }

    public static qk2 valueOf(String str) {
        return (qk2) Enum.valueOf(qk2.class, str);
    }

    public static qk2[] values() {
        return (qk2[]) d.clone();
    }
}
