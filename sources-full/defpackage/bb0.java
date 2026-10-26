package defpackage;

import kotlin.KotlinVersion;
import notrack.ai.data.account.Entitlements;

/* JADX INFO: loaded from: classes.dex */
public final class bb0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ hb0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb0(hb0 hb0Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = hb0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x01dc, code lost:
    
        if (r0 == r8) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r88) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb0.a(java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj) throws Throwable {
        Object value;
        Object value2;
        int i = this.d;
        so0 so0Var = null;
        hb0 hb0Var = this.h;
        if (i == 0) {
            g13.O(obj);
            jn3 jn3Var = hb0Var.c;
            do {
                value = jn3Var.getValue();
            } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, true, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -8388609, KotlinVersion.MAX_COMPONENT_VALUE)));
            k2 k2VarF = hb0Var.b.f();
            this.d = 1;
            k2VarF.getClass();
            jt0 jt0Var = sw0.a;
            Object objY = py.Y(at0.c, new j2(so0Var, k2VarF, 0), this);
            hq0 hq0Var = hq0.c;
            if (objY == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        jn3 jn3Var2 = hb0Var.c;
        do {
            value2 = jn3Var2.getValue();
            Entitlements.Companion.getClass();
        } while (!jn3Var2.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, Entitlements.ANONYMOUS, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -29360129, KotlinVersion.MAX_COMPONENT_VALUE)));
        return w84.a;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        hb0 hb0Var = this.h;
        switch (i) {
            case 0:
                return new bb0(hb0Var, so0Var, 0);
            case 1:
                return new bb0(hb0Var, so0Var, 1);
            case 2:
                return new bb0(hb0Var, so0Var, 2);
            case 3:
                return new bb0(hb0Var, so0Var, 3);
            case 4:
                return new bb0(hb0Var, so0Var, 4);
            case 5:
                return new bb0(hb0Var, so0Var, 5);
            case 6:
                return new bb0(hb0Var, so0Var, 6);
            case 7:
                return new bb0(hb0Var, so0Var, 7);
            case 8:
                return new bb0(hb0Var, so0Var, 8);
            case 9:
                return new bb0(hb0Var, so0Var, 9);
            case 10:
                return new bb0(hb0Var, so0Var, 10);
            case 11:
                return new bb0(hb0Var, so0Var, 11);
            case 12:
                return new bb0(hb0Var, so0Var, 12);
            case 13:
                return new bb0(hb0Var, so0Var, 13);
            default:
                return new bb0(hb0Var, so0Var, 14);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        hq0 hq0Var = hq0.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 1:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 2:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 3:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 4:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 5:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 6:
                ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return hq0Var;
            case 7:
                ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return hq0Var;
            case 8:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 9:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 10:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 11:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 12:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 13:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            default:
                return ((bb0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0a61  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v8 java.lang.Object, still in use, count: 2, list:
          (r4v8 java.lang.Object) from 0x0a40: PHI (r4 I:??) = (r4v5 java.lang.Object), (r4v8 java.lang.Object) binds: [B:188:0x0a3f, B:255:0x0a40] A[DONT_GENERATE, DONT_INLINE]
          (r4v8 java.lang.Object) from 0x0a36: CHECK_CAST (yd2) (r4v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r89) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
