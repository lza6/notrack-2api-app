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
public final class qp4 {
    public static final qp4 d;
    public static final qp4 h;
    public static final qp4[] l;
    public static final /* synthetic */ qp4[] m;
    public final int c;

    /* JADX INFO: Fake field, exist only in values array */
    qp4 EF0;

    static {
        aq4 aq4Var = aq4.m;
        qp4 qp4Var = new qp4("DOUBLE", 0, 0, 1, aq4Var);
        aq4 aq4Var2 = aq4.l;
        qp4 qp4Var2 = new qp4("FLOAT", 1, 1, 1, aq4Var2);
        aq4 aq4Var3 = aq4.h;
        qp4 qp4Var3 = new qp4("INT64", 2, 2, 1, aq4Var3);
        qp4 qp4Var4 = new qp4("UINT64", 3, 3, 1, aq4Var3);
        aq4 aq4Var4 = aq4.d;
        qp4 qp4Var5 = new qp4("INT32", 4, 4, 1, aq4Var4);
        qp4 qp4Var6 = new qp4("FIXED64", 5, 5, 1, aq4Var3);
        qp4 qp4Var7 = new qp4("FIXED32", 6, 6, 1, aq4Var4);
        aq4 aq4Var5 = aq4.n;
        qp4 qp4Var8 = new qp4("BOOL", 7, 7, 1, aq4Var5);
        aq4 aq4Var6 = aq4.o;
        qp4 qp4Var9 = new qp4("STRING", 8, 8, 1, aq4Var6);
        aq4 aq4Var7 = aq4.r;
        qp4 qp4Var10 = new qp4("MESSAGE", 9, 9, 1, aq4Var7);
        aq4 aq4Var8 = aq4.p;
        qp4 qp4Var11 = new qp4("BYTES", 10, 10, 1, aq4Var8);
        qp4 qp4Var12 = new qp4("UINT32", 11, 11, 1, aq4Var4);
        aq4 aq4Var9 = aq4.q;
        qp4 qp4Var13 = new qp4("ENUM", 12, 12, 1, aq4Var9);
        qp4 qp4Var14 = new qp4("SFIXED32", 13, 13, 1, aq4Var4);
        qp4 qp4Var15 = new qp4("SFIXED64", 14, 14, 1, aq4Var3);
        qp4 qp4Var16 = new qp4("SINT32", 15, 15, 1, aq4Var4);
        qp4 qp4Var17 = new qp4("SINT64", 16, 16, 1, aq4Var3);
        qp4 qp4Var18 = new qp4("GROUP", 17, 17, 1, aq4Var7);
        qp4 qp4Var19 = new qp4("DOUBLE_LIST", 18, 18, 2, aq4Var);
        qp4 qp4Var20 = new qp4("FLOAT_LIST", 19, 19, 2, aq4Var2);
        qp4 qp4Var21 = new qp4("INT64_LIST", 20, 20, 2, aq4Var3);
        qp4 qp4Var22 = new qp4("UINT64_LIST", 21, 21, 2, aq4Var3);
        qp4 qp4Var23 = new qp4("INT32_LIST", 22, 22, 2, aq4Var4);
        qp4 qp4Var24 = new qp4("FIXED64_LIST", 23, 23, 2, aq4Var3);
        qp4 qp4Var25 = new qp4("FIXED32_LIST", 24, 24, 2, aq4Var4);
        qp4 qp4Var26 = new qp4("BOOL_LIST", 25, 25, 2, aq4Var5);
        qp4 qp4Var27 = new qp4("STRING_LIST", 26, 26, 2, aq4Var6);
        qp4 qp4Var28 = new qp4("MESSAGE_LIST", 27, 27, 2, aq4Var7);
        qp4 qp4Var29 = new qp4("BYTES_LIST", 28, 28, 2, aq4Var8);
        qp4 qp4Var30 = new qp4("UINT32_LIST", 29, 29, 2, aq4Var4);
        qp4 qp4Var31 = new qp4("ENUM_LIST", 30, 30, 2, aq4Var9);
        qp4 qp4Var32 = new qp4("SFIXED32_LIST", 31, 31, 2, aq4Var4);
        qp4 qp4Var33 = new qp4("SFIXED64_LIST", 32, 32, 2, aq4Var3);
        qp4 qp4Var34 = new qp4("SINT32_LIST", 33, 33, 2, aq4Var4);
        qp4 qp4Var35 = new qp4("SINT64_LIST", 34, 34, 2, aq4Var3);
        qp4 qp4Var36 = new qp4("DOUBLE_LIST_PACKED", 35, 35, 3, aq4Var);
        d = qp4Var36;
        qp4 qp4Var37 = new qp4("FLOAT_LIST_PACKED", 36, 36, 3, aq4Var2);
        qp4 qp4Var38 = new qp4("INT64_LIST_PACKED", 37, 37, 3, aq4Var3);
        qp4 qp4Var39 = new qp4("UINT64_LIST_PACKED", 38, 38, 3, aq4Var3);
        qp4 qp4Var40 = new qp4("INT32_LIST_PACKED", 39, 39, 3, aq4Var4);
        qp4 qp4Var41 = new qp4("FIXED64_LIST_PACKED", 40, 40, 3, aq4Var3);
        qp4 qp4Var42 = new qp4("FIXED32_LIST_PACKED", 41, 41, 3, aq4Var4);
        qp4 qp4Var43 = new qp4("BOOL_LIST_PACKED", 42, 42, 3, aq4Var5);
        qp4 qp4Var44 = new qp4("UINT32_LIST_PACKED", 43, 43, 3, aq4Var4);
        qp4 qp4Var45 = new qp4("ENUM_LIST_PACKED", 44, 44, 3, aq4Var9);
        qp4 qp4Var46 = new qp4("SFIXED32_LIST_PACKED", 45, 45, 3, aq4Var4);
        qp4 qp4Var47 = new qp4("SFIXED64_LIST_PACKED", 46, 46, 3, aq4Var3);
        qp4 qp4Var48 = new qp4("SINT32_LIST_PACKED", 47, 47, 3, aq4Var4);
        qp4 qp4Var49 = new qp4("SINT64_LIST_PACKED", 48, 48, 3, aq4Var3);
        h = qp4Var49;
        m = new qp4[]{qp4Var, qp4Var2, qp4Var3, qp4Var4, qp4Var5, qp4Var6, qp4Var7, qp4Var8, qp4Var9, qp4Var10, qp4Var11, qp4Var12, qp4Var13, qp4Var14, qp4Var15, qp4Var16, qp4Var17, qp4Var18, qp4Var19, qp4Var20, qp4Var21, qp4Var22, qp4Var23, qp4Var24, qp4Var25, qp4Var26, qp4Var27, qp4Var28, qp4Var29, qp4Var30, qp4Var31, qp4Var32, qp4Var33, qp4Var34, qp4Var35, qp4Var36, qp4Var37, qp4Var38, qp4Var39, qp4Var40, qp4Var41, qp4Var42, qp4Var43, qp4Var44, qp4Var45, qp4Var46, qp4Var47, qp4Var48, qp4Var49, new qp4("GROUP_LIST", 49, 49, 2, aq4Var7), new qp4("MAP", 50, 50, 4, aq4.c)};
        qp4[] qp4VarArrValues = values();
        l = new qp4[qp4VarArrValues.length];
        for (qp4 qp4Var50 : qp4VarArrValues) {
            l[qp4Var50.c] = qp4Var50;
        }
    }

    public qp4(String str, int i, int i2, int i3, aq4 aq4Var) {
        super(str, i);
        this.c = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            aq4Var.getClass();
        }
        if (i3 == 1) {
            aq4 aq4Var2 = aq4.c;
            aq4Var.ordinal();
        }
    }

    public static qp4[] values() {
        return (qp4[]) m.clone();
    }
}
