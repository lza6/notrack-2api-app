package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oa0 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ hb0 d;
    public final /* synthetic */ yd2 h;

    public /* synthetic */ oa0(hb0 hb0Var, yd2 yd2Var, int i) {
        this.c = i;
        this.d = hb0Var;
        this.h = yd2Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v11 java.lang.Object, still in use, count: 2, list:
          (r1v11 java.lang.Object) from 0x0347: PHI (r1 I:??) = (r1v8 java.lang.Object), (r1v11 java.lang.Object) binds: [B:84:0x0346, B:111:0x0347] A[DONT_GENERATE, DONT_INLINE]
          (r1v11 java.lang.Object) from 0x033d: CHECK_CAST (yd2) (r1v11 java.lang.Object)
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
    @Override // defpackage.je1
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa0.invoke():java.lang.Object");
    }
}
