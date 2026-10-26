package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gt0 implements k32 {
    public final /* synthetic */ int c = 0;
    public final Object d;
    public final Object h;

    public gt0(et0 et0Var, k32 k32Var) {
        et0Var.getClass();
        this.d = et0Var;
        this.h = k32Var;
    }

    public gt0(h32 h32Var, t93 t93Var) {
        this.d = h32Var;
        this.h = t93Var;
    }

    public gt0(m32 m32Var) {
        this.d = m32Var;
        zc0 zc0Var = zc0.c;
        Class<?> cls = m32Var.getClass();
        xc0 xc0Var = (xc0) zc0Var.a.get(cls);
        this.h = xc0Var == null ? zc0Var.a(cls, null) : xc0Var;
    }

    @Override // defpackage.k32
    public final void onStateChanged(n32 n32Var, f32 f32Var) {
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                et0 et0Var = (et0) obj;
                switch (ft0.a[f32Var.ordinal()]) {
                    case 1:
                        et0Var.onCreate(n32Var);
                        break;
                    case 2:
                        et0Var.onStart(n32Var);
                        break;
                    case 3:
                        et0Var.onResume(n32Var);
                        break;
                    case 4:
                        et0Var.onPause(n32Var);
                        break;
                    case 5:
                        et0Var.onStop(n32Var);
                        break;
                    case 6:
                        et0Var.onDestroy(n32Var);
                        break;
                    case 7:
                        u41.k("ON_ANY must not been send by anybody");
                        break;
                }
                k32 k32Var = (k32) obj2;
                if (k32Var != null) {
                    k32Var.onStateChanged(n32Var, f32Var);
                }
                break;
            case 1:
                if (f32Var == f32.ON_START) {
                    ((h32) obj).b(this);
                    ((t93) obj2).d();
                }
                break;
            default:
                HashMap map = ((xc0) obj2).a;
                xc0.a((List) map.get(f32Var), n32Var, f32Var, obj);
                xc0.a((List) map.get(f32.ON_ANY), n32Var, f32Var, obj);
                break;
        }
    }
}
