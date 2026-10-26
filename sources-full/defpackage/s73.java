package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s73 extends rx1 {
    public static final s73 c = new s73("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s73(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                a31 a31Var = a31.c;
                if (size == 0) {
                    return xb2Var.s(um0.j(j), um0.i(j), a31Var, xq2.y);
                }
                if (size == 1) {
                    nv2 nv2VarC = ((qb2) list.get(0)).c(j);
                    return xb2Var.s(wm0.g(j, nv2VarC.c), wm0.f(j, nv2VarC.d), a31Var, new xc(nv2VarC, 12));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    nv2 nv2VarC2 = ((qb2) list.get(i)).c(j);
                    iMax = Math.max(nv2VarC2.c, iMax);
                    iMax2 = Math.max(nv2VarC2.d, iMax2);
                    arrayList.add(nv2VarC2);
                }
                return xb2Var.s(wm0.g(j, iMax), wm0.f(j, iMax2), a31Var, new ta(arrayList, 6));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
