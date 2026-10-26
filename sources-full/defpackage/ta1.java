package defpackage;

import java.util.Collection;
import java.util.List;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ta1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta1(int i, int i2, Object obj) {
        super(1);
        this.c = i2;
        this.h = obj;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta1(int i, Collection collection) {
        super(1);
        this.c = 4;
        this.d = i;
        this.h = collection;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = 0;
        Object obj2 = this.h;
        int i3 = this.d;
        switch (i) {
            case 0:
                boolean zZ0 = ((db1) obj).z0(i3);
                ((q43) obj2).c = Boolean.valueOf(zZ0);
                return Boolean.valueOf(zZ0);
            case 1:
                zt3 zt3Var = (zt3) obj;
                String str = (String) obj2;
                jz3 jz3Var = zt3Var.m;
                if (jz3Var != null) {
                    long j = jz3Var.a;
                    xr0.f0(zt3Var, (int) (j >> 32), (int) (4294967295L & j), str);
                } else {
                    long j2 = zt3Var.l;
                    int i4 = jz3.c;
                    xr0.f0(zt3Var, (int) (j2 >> 32), (int) (4294967295L & j2), str);
                }
                long j3 = zt3Var.l;
                int i5 = jz3.c;
                int i6 = (int) (j3 >> 32);
                int iX = py.x(i3 > 0 ? (i6 + i3) - 1 : (i6 + i3) - str.length(), 0, zt3Var.d.length());
                zt3Var.f(p23.d(iX, iX));
                return w84Var;
            case 2:
                z02 z02Var = (z02) obj;
                mz1 mz1Var = ((wz1) obj2).a;
                pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
                Protocol$Companion.restoreNonObservable(currentThreadSnapshot, Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.e() : null);
                ((bt0) mz1Var).getClass();
                while (i2 < 2) {
                    int i7 = i3 + i2;
                    z02Var.getClass();
                    long j4 = c12.a;
                    b12 b12Var = z02Var.b;
                    iy2 iy2Var = b12Var.c;
                    if (iy2Var != null) {
                        z02Var.a.add(new hy2(iy2Var, i7, j4, b12Var.b));
                    }
                    i2++;
                }
                return w84Var;
            case 3:
                z02 z02Var2 = (z02) obj;
                b22 b22Var = ((g22) obj2).a;
                pk3 currentThreadSnapshot2 = Protocol$Companion.getCurrentThreadSnapshot();
                Protocol$Companion.restoreNonObservable(currentThreadSnapshot2, Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot2), currentThreadSnapshot2 != null ? currentThreadSnapshot2.e() : null);
                ((dt0) b22Var).getClass();
                while (i2 < 2) {
                    int i8 = i3 + i2;
                    z02Var2.getClass();
                    long j5 = c12.a;
                    b12 b12Var2 = z02Var2.b;
                    iy2 iy2Var2 = b12Var2.c;
                    if (iy2Var2 != null) {
                        z02Var2.a.add(new hy2(iy2Var2, i8, j5, b12Var2.b));
                    }
                    i2++;
                }
                return w84Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i3, (Collection) obj2));
        }
    }
}
