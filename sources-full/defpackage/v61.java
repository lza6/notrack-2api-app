package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class v61 {
    public static final v61 d;
    public static final v61 h;
    public static final v61[] l;
    public static final /* synthetic */ v61[] m;
    public final int c;

    /* JADX INFO: Fake field, exist only in values array */
    v61 EF0;

    static {
        cs1 cs1Var = cs1.m;
        v61 v61Var = new v61("DOUBLE", 0, 0, 1, cs1Var);
        cs1 cs1Var2 = cs1.l;
        v61 v61Var2 = new v61("FLOAT", 1, 1, 1, cs1Var2);
        cs1 cs1Var3 = cs1.h;
        v61 v61Var3 = new v61("INT64", 2, 2, 1, cs1Var3);
        v61 v61Var4 = new v61("UINT64", 3, 3, 1, cs1Var3);
        cs1 cs1Var4 = cs1.d;
        v61 v61Var5 = new v61("INT32", 4, 4, 1, cs1Var4);
        v61 v61Var6 = new v61("FIXED64", 5, 5, 1, cs1Var3);
        v61 v61Var7 = new v61("FIXED32", 6, 6, 1, cs1Var4);
        cs1 cs1Var5 = cs1.n;
        v61 v61Var8 = new v61("BOOL", 7, 7, 1, cs1Var5);
        cs1 cs1Var6 = cs1.o;
        v61 v61Var9 = new v61("STRING", 8, 8, 1, cs1Var6);
        cs1 cs1Var7 = cs1.r;
        v61 v61Var10 = new v61("MESSAGE", 9, 9, 1, cs1Var7);
        cs1 cs1Var8 = cs1.p;
        v61 v61Var11 = new v61("BYTES", 10, 10, 1, cs1Var8);
        v61 v61Var12 = new v61("UINT32", 11, 11, 1, cs1Var4);
        cs1 cs1Var9 = cs1.q;
        v61 v61Var13 = new v61("ENUM", 12, 12, 1, cs1Var9);
        v61 v61Var14 = new v61("SFIXED32", 13, 13, 1, cs1Var4);
        v61 v61Var15 = new v61("SFIXED64", 14, 14, 1, cs1Var3);
        v61 v61Var16 = new v61("SINT32", 15, 15, 1, cs1Var4);
        v61 v61Var17 = new v61("SINT64", 16, 16, 1, cs1Var3);
        v61 v61Var18 = new v61("GROUP", 17, 17, 1, cs1Var7);
        v61 v61Var19 = new v61("DOUBLE_LIST", 18, 18, 2, cs1Var);
        v61 v61Var20 = new v61("FLOAT_LIST", 19, 19, 2, cs1Var2);
        v61 v61Var21 = new v61("INT64_LIST", 20, 20, 2, cs1Var3);
        v61 v61Var22 = new v61("UINT64_LIST", 21, 21, 2, cs1Var3);
        v61 v61Var23 = new v61("INT32_LIST", 22, 22, 2, cs1Var4);
        v61 v61Var24 = new v61("FIXED64_LIST", 23, 23, 2, cs1Var3);
        v61 v61Var25 = new v61("FIXED32_LIST", 24, 24, 2, cs1Var4);
        v61 v61Var26 = new v61("BOOL_LIST", 25, 25, 2, cs1Var5);
        v61 v61Var27 = new v61("STRING_LIST", 26, 26, 2, cs1Var6);
        v61 v61Var28 = new v61("MESSAGE_LIST", 27, 27, 2, cs1Var7);
        v61 v61Var29 = new v61("BYTES_LIST", 28, 28, 2, cs1Var8);
        v61 v61Var30 = new v61("UINT32_LIST", 29, 29, 2, cs1Var4);
        v61 v61Var31 = new v61("ENUM_LIST", 30, 30, 2, cs1Var9);
        v61 v61Var32 = new v61("SFIXED32_LIST", 31, 31, 2, cs1Var4);
        v61 v61Var33 = new v61("SFIXED64_LIST", 32, 32, 2, cs1Var3);
        v61 v61Var34 = new v61("SINT32_LIST", 33, 33, 2, cs1Var4);
        v61 v61Var35 = new v61("SINT64_LIST", 34, 34, 2, cs1Var3);
        v61 v61Var36 = new v61("DOUBLE_LIST_PACKED", 35, 35, 3, cs1Var);
        d = v61Var36;
        v61 v61Var37 = new v61("FLOAT_LIST_PACKED", 36, 36, 3, cs1Var2);
        v61 v61Var38 = new v61("INT64_LIST_PACKED", 37, 37, 3, cs1Var3);
        v61 v61Var39 = new v61("UINT64_LIST_PACKED", 38, 38, 3, cs1Var3);
        v61 v61Var40 = new v61("INT32_LIST_PACKED", 39, 39, 3, cs1Var4);
        v61 v61Var41 = new v61("FIXED64_LIST_PACKED", 40, 40, 3, cs1Var3);
        v61 v61Var42 = new v61("FIXED32_LIST_PACKED", 41, 41, 3, cs1Var4);
        v61 v61Var43 = new v61("BOOL_LIST_PACKED", 42, 42, 3, cs1Var5);
        v61 v61Var44 = new v61("UINT32_LIST_PACKED", 43, 43, 3, cs1Var4);
        v61 v61Var45 = new v61("ENUM_LIST_PACKED", 44, 44, 3, cs1Var9);
        v61 v61Var46 = new v61("SFIXED32_LIST_PACKED", 45, 45, 3, cs1Var4);
        v61 v61Var47 = new v61("SFIXED64_LIST_PACKED", 46, 46, 3, cs1Var3);
        v61 v61Var48 = new v61("SINT32_LIST_PACKED", 47, 47, 3, cs1Var4);
        v61 v61Var49 = new v61("SINT64_LIST_PACKED", 48, 48, 3, cs1Var3);
        h = v61Var49;
        m = new v61[]{v61Var, v61Var2, v61Var3, v61Var4, v61Var5, v61Var6, v61Var7, v61Var8, v61Var9, v61Var10, v61Var11, v61Var12, v61Var13, v61Var14, v61Var15, v61Var16, v61Var17, v61Var18, v61Var19, v61Var20, v61Var21, v61Var22, v61Var23, v61Var24, v61Var25, v61Var26, v61Var27, v61Var28, v61Var29, v61Var30, v61Var31, v61Var32, v61Var33, v61Var34, v61Var35, v61Var36, v61Var37, v61Var38, v61Var39, v61Var40, v61Var41, v61Var42, v61Var43, v61Var44, v61Var45, v61Var46, v61Var47, v61Var48, v61Var49, new v61("GROUP_LIST", 49, 49, 2, cs1Var7), new v61("MAP", 50, 50, 4, cs1.c)};
        v61[] v61VarArrValues = values();
        l = new v61[v61VarArrValues.length];
        for (v61 v61Var50 : v61VarArrValues) {
            l[v61Var50.c] = v61Var50;
        }
    }

    public v61(String str, int i, int i2, int i3, cs1 cs1Var) {
        super(str, i);
        this.c = i2;
        int iZ = fq2.z(i3);
        if (iZ == 1 || iZ == 3) {
            cs1Var.getClass();
        }
        if (i3 == 1) {
            cs1Var.ordinal();
        }
    }

    public static v61 valueOf(String str) {
        return (v61) Enum.valueOf(v61.class, str);
    }

    public static v61[] values() {
        return (v61[]) m.clone();
    }
}
