package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eb0 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 2;
    public Object d;
    public Object h;
    public int l;
    public int m;
    public Object n;
    public Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(ge4 ge4Var, String str, int i, String str2, int i2, String str3, String str4, so0 so0Var) {
        super(2, so0Var);
        this.n = ge4Var;
        this.o = str;
        this.l = i;
        this.h = str2;
        this.m = i2;
        this.p = str3;
        this.d = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(hb0 hb0Var, so0 so0Var) {
        super(2, so0Var);
        this.d = hb0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(Map map, hb0 hb0Var, so0 so0Var) {
        super(2, so0Var);
        this.o = map;
        this.p = hb0Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new eb0((hb0) this.d, so0Var);
            case 1:
                return new eb0((Map) this.o, (hb0) this.p, so0Var);
            default:
                return new eb0((ge4) this.n, (String) this.o, this.l, (String) this.h, this.m, (String) this.p, (String) this.d, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((eb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0427 A[PHI: r3 r7
  0x0427: PHI (r3v7 java.util.Set) = (r3v2 java.util.Set), (r3v9 java.util.Set) binds: [B:172:0x0422, B:206:0x0574] A[DONT_GENERATE, DONT_INLINE]
  0x0427: PHI (r7v3 int) = (r7v0 int), (r7v7 int) binds: [B:172:0x0422, B:206:0x0574] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:175:0x042d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0445  */
    /* JADX WARN: Code duplicated, block: B:181:0x044f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0454  */
    /* JADX WARN: Code duplicated, block: B:192:0x0476  */
    /* JADX WARN: Code duplicated, block: B:195:0x049a  */
    /* JADX WARN: Code duplicated, block: B:198:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:205:0x0572  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [z21] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0305 -> B:156:0x0309). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x0462 -> B:190:0x0470). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x049a -> B:166:0x0358). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r95) {
        /*
            Method dump skipped, instruction units count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
