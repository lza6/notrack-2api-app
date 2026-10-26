package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class y20 implements xe1 {
    public final xp0 c;
    public final int d;
    public final fy h;

    public y20(xp0 xp0Var, int i, fy fyVar) {
        this.c = xp0Var;
        this.d = i;
        this.h = fyVar;
    }

    @Override // defpackage.k81
    public Object a(l81 l81Var, so0 so0Var) {
        Object objQ = yo4.q(new q8(l81Var, this, (so0) null, 7), so0Var);
        return objQ == hq0.c ? objQ : w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.xe1
    public final k81 b(xp0 xp0Var, int i, fy fyVar) {
        xp0 xp0Var2 = this.c;
        xp0 xp0VarPlus = xp0Var.plus(xp0Var2);
        fy fyVar2 = fy.c;
        fy fyVar3 = this.h;
        int i2 = this.d;
        if (fyVar == fyVar2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = IntCompanionObject.MAX_VALUE;
                        }
                    }
                }
            }
            fyVar = fyVar3;
        }
        return (kr1.n(xp0VarPlus, xp0Var2) && i == i2 && fyVar == fyVar3) ? this : g(xp0VarPlus, i, fyVar);
    }

    public String d() {
        return null;
    }

    public abstract Object e(wz2 wz2Var, so0 so0Var);

    public abstract y20 g(xp0 xp0Var, int i, fy fyVar);

    public k81 h() {
        return null;
    }

    public w20 i(gq0 gq0Var) throws Throwable {
        int i = this.d;
        if (i == -3) {
            i = -2;
        }
        ne1 kVar = new k(this, null, 8);
        wz2 wz2Var = new wz2(yh4.L(gq0Var, this.c), gm4.b(i, 4, this.h));
        wz2Var.g0(jq0.h, wz2Var, kVar);
        return wz2Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        x21 x21Var = x21.c;
        xp0 xp0Var = this.c;
        if (xp0Var != x21Var) {
            arrayList.add("context=" + xp0Var);
        }
        int i = this.d;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        fy fyVar = fy.c;
        fy fyVar2 = this.h;
        if (fyVar2 != fyVar) {
            arrayList.add("onBufferOverflow=" + fyVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return ud2.r(sb, ke0.D0(arrayList, ", ", null, null, null, 62), ']');
    }
}
