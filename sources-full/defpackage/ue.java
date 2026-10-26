package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ue {
    public final w64 a;
    public final Object b;
    public final xf c;
    public final ft2 d;
    public final ft2 e;
    public final xi2 f;
    public final tm3 g;
    public final cg h;
    public final cg i;
    public final cg j;
    public final cg k;

    public ue(Object obj, w64 w64Var, Object obj2) {
        this.a = w64Var;
        this.b = obj2;
        xf xfVar = new xf(w64Var, obj, null, 60);
        this.c = xfVar;
        this.d = cl3.d(Boolean.FALSE);
        this.e = cl3.d(obj);
        this.f = new xi2();
        this.g = new tm3(obj2);
        cg cgVar = xfVar.h;
        boolean z = cgVar instanceof yf;
        cg cgVar2 = z ? kr1.e : cgVar instanceof zf ? kr1.f : cgVar instanceof ag ? kr1.g : kr1.h;
        this.h = cgVar2;
        cg cgVar3 = z ? kr1.a : cgVar instanceof zf ? kr1.b : cgVar instanceof ag ? kr1.c : kr1.d;
        this.i = cgVar3;
        this.j = cgVar2;
        this.k = cgVar3;
    }

    public /* synthetic */ ue(Object obj, w64 w64Var, Object obj2, int i) {
        this(obj, w64Var, (i & 4) != 0 ? null : obj2);
    }

    public static final Object a(ue ueVar, Object obj) {
        w64 w64Var = ueVar.a;
        cg cgVar = ueVar.k;
        cg cgVar2 = ueVar.j;
        if (!kr1.n(cgVar2, ueVar.h) || !kr1.n(cgVar, ueVar.i)) {
            x64 x64Var = (x64) w64Var;
            cg cgVar3 = (cg) x64Var.a.invoke(obj);
            int iB = cgVar3.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (cgVar3.a(i) < cgVar2.a(i) || cgVar3.a(i) > cgVar.a(i)) {
                    cgVar3.e(py.w(cgVar3.a(i), cgVar2.a(i), cgVar.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return x64Var.b.invoke(cgVar3);
            }
        }
        return obj;
    }

    public static final void b(ue ueVar) {
        xf xfVar = ueVar.c;
        xfVar.h.d();
        xfVar.l = Long.MIN_VALUE;
        ueVar.d.setValue(Boolean.FALSE);
    }

    public static Object c(ue ueVar, Object obj, wf wfVar, so0 so0Var, int i) {
        if ((i & 2) != 0) {
            wfVar = ueVar.g;
        }
        wf wfVar2 = wfVar;
        Object objInvoke = ((x64) ueVar.a).b.invoke(ueVar.c.h);
        Object objD = ueVar.d();
        w64 w64Var = ueVar.a;
        return xi2.a(ueVar.f, new te(ueVar, objInvoke, new qs3(wfVar2, w64Var, objD, obj, (cg) ((x64) w64Var).a.invoke(objInvoke)), ueVar.c.l, null), so0Var);
    }

    public final Object d() {
        return this.c.d.getValue();
    }

    public final Object e(so0 so0Var, Object obj) {
        Object objA = xi2.a(this.f, new w50(this, obj, null, 3), so0Var);
        return objA == hq0.c ? objA : w84.a;
    }
}
