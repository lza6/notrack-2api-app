package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zf3 implements wn3, bl3, x93, ld0 {
    public final /* synthetic */ int c;

    public zf3(float f, float f2) {
        this.c = 5;
    }

    public /* synthetic */ zf3(int i) {
        this.c = i;
    }

    @Override // defpackage.ld0
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x003b A[RETURN] */
    @Override // defpackage.bl3
    public boolean e(Object obj, Object obj2) {
        aw3 aw3Var = (aw3) obj;
        aw3 aw3Var2 = (aw3) obj2;
        if (aw3Var == null || aw3Var2 == null) {
            if ((aw3Var == null) ^ (aw3Var2 == null)) {
                return false;
            }
            return true;
        }
        if (aw3Var.a == aw3Var2.a && kr1.n(aw3Var.b, aw3Var2.b) && aw3Var.c == aw3Var2.c && aw3Var.d == aw3Var2.d && aw3Var.e == aw3Var2.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.x93
    public Object j(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        String str = (String) obj3;
        Object obj4 = list.get(2);
        obj4.getClass();
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        obj5.getClass();
        int iIntValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        obj6.getClass();
        long jD = p23.d(iIntValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        obj7.getClass();
        int iIntValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        obj8.getClass();
        long jD2 = p23.d(iIntValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        obj9.getClass();
        return new xz3(iIntValue, str, str2, jD, jD2, ((Long) obj9).longValue(), false, 64);
    }

    @Override // defpackage.x93
    public Object n(a93 a93Var, Object obj) {
        xz3 xz3Var = (xz3) obj;
        Integer numValueOf = Integer.valueOf(xz3Var.a);
        String str = xz3Var.b;
        String str2 = xz3Var.c;
        long j = xz3Var.d;
        int i = jz3.c;
        Integer numValueOf2 = Integer.valueOf((int) (j >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j & 4294967295L));
        long j2 = xz3Var.e;
        return kr1.U(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(xz3Var.f));
    }

    public String toString() {
        switch (this.c) {
            case 1:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
