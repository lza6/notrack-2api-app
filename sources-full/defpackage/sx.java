package defpackage;

import android.content.Context;
import androidx.compose.animation.b;
import androidx.compose.foundation.gestures.BringIntoViewSpec$Companion;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sx extends ww1 implements le1 {
    public static final sx A;
    public static final sx B;
    public static final sx C;
    public static final sx D;
    public static final sx E;
    public static final sx F;
    public static final sx G;
    public static final sx H;
    public static final sx I;
    public static final sx J;
    public static final sx K;
    public static final sx L;
    public static final sx M;
    public static final sx d;
    public static final sx h;
    public static final sx l;
    public static final sx m;
    public static final sx n;
    public static final sx o;
    public static final sx p;
    public static final sx q;
    public static final sx r;
    public static final sx s;
    public static final sx t;
    public static final sx u;
    public static final sx v;
    public static final sx w;
    public static final sx x;
    public static final sx y;
    public static final sx z;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new sx(i, 0);
        h = new sx(i, 1);
        l = new sx(i, 2);
        m = new sx(i, 3);
        n = new sx(i, 4);
        o = new sx(i, 5);
        p = new sx(i, 6);
        q = new sx(i, 7);
        r = new sx(i, 8);
        s = new sx(i, 9);
        t = new sx(i, 10);
        u = new sx(i, 11);
        v = new sx(i, 12);
        w = new sx(i, 13);
        x = new sx(i, 14);
        y = new sx(i, 15);
        z = new sx(i, 16);
        A = new sx(i, 17);
        B = new sx(i, 18);
        C = new sx(i, 19);
        D = new sx(i, 20);
        E = new sx(i, 21);
        F = new sx(i, 22);
        G = new sx(i, 23);
        H = new sx(i, 24);
        I = new sx(i, 25);
        J = new sx(i, 26);
        K = new sx(i, 27);
        L = new sx(i, 28);
        M = new sx(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        switch (this.c) {
            case 0:
                su2 su2Var = (su2) obj;
                o13 localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                su2Var.getClass();
                if (((Context) yo4.O(su2Var, localContext)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return ux.b;
                }
                a.a.getClass();
                return BringIntoViewSpec$Companion.DefaultBringIntoViewSpec;
            case 1:
                ef3.j((gf3) obj, 0);
                return w84.a;
            case 2:
                ef3.j((gf3) obj, 0);
                return w84.a;
            case 3:
                ef3.j((gf3) obj, 1);
                return w84.a;
            case 4:
                long jA = re0.a(((re0) obj).a, ef0.x);
                return new bg(re0.d(jA), re0.h(jA), re0.g(jA), re0.e(jA));
            case 5:
                ((Number) obj).longValue();
                return w84.a;
            case 6:
                return Boolean.valueOf(!(((nf2) obj) instanceof bk0));
            case 7:
                return w84.a;
            case 8:
                return w84.a;
            case 9:
                float[] fArr = ((ob2) obj).a;
                return w84.a;
            case 10:
                float[] fArr2 = ((ob2) obj).a;
                return w84.a;
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            case 12:
                long j = ((ln2) obj).a;
                return w84.a;
            case 13:
                return Boolean.TRUE;
            case 14:
                float fFloatValue = ((Number) obj).floatValue();
                t64 t64Var = uj2.a;
                return Float.valueOf(fFloatValue * 0.5f);
            case 15:
                return w84.a;
            case 16:
                long j2 = ((e54) obj).a;
                return new zf(e54.b(j2), e54.c(j2));
            case 17:
                zf zfVar = (zf) obj;
                return new e54(av1.b(zfVar.a, zfVar.b));
            case 18:
                return kr1.l0(7, null);
            case 19:
                ((qq1) obj).getClass();
                return new qq1(0L);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                ((qq1) obj).getClass();
                return new qq1(0L);
            case 21:
                return b.c;
            case 22:
                return w84.a;
            case 23:
                return w84.a;
            case 24:
                return w84.a;
            case 25:
                return w84.a;
            case 26:
                return Boolean.valueOf(((db1) obj).z0(7));
            case 27:
                synchronized (vk3.b) {
                    List list = vk3.h;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((le1) list.get(i)).invoke(obj);
                    }
                }
                return w84.a;
            case 28:
                return w84.a;
            default:
                tz0.f((tz0) obj, re0.h, 0L, 0L, 0.0f, null, 126);
                return w84.a;
        }
    }
}
