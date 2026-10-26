package defpackage;

import android.graphics.PathMeasure;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.work.Worker;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class bb2 extends ww1 implements je1 {
    public static final bb2 A;
    public static final bb2 B;
    public static final bb2 C;
    public static final bb2 D;
    public static final bb2 E;
    public static final bb2 F;
    public static final bb2 G;
    public static final bb2 H;
    public static final bb2 I;
    public static final bb2 J;
    public static final bb2 K;
    public static final bb2 d;
    public static final bb2 h;
    public static final bb2 l;
    public static final bb2 m;
    public static final bb2 n;
    public static final bb2 o;
    public static final bb2 p;
    public static final bb2 q;
    public static final bb2 r;
    public static final bb2 s;
    public static final bb2 t;
    public static final bb2 u;
    public static final bb2 v;
    public static final bb2 w;
    public static final bb2 x;
    public static final bb2 y;
    public static final bb2 z;
    public final /* synthetic */ int c;

    static {
        int i = 0;
        d = new bb2(i, 0);
        h = new bb2(i, 1);
        l = new bb2(i, 2);
        m = new bb2(i, 3);
        n = new bb2(i, 4);
        o = new bb2(i, 5);
        p = new bb2(i, 6);
        q = new bb2(i, 7);
        r = new bb2(i, 8);
        s = new bb2(i, 9);
        t = new bb2(i, 10);
        u = new bb2(i, 11);
        v = new bb2(i, 12);
        w = new bb2(i, 13);
        x = new bb2(i, 14);
        y = new bb2(i, 15);
        z = new bb2(i, 16);
        A = new bb2(i, 17);
        B = new bb2(i, 18);
        C = new bb2(i, 19);
        D = new bb2(i, 20);
        E = new bb2(i, 21);
        F = new bb2(i, 22);
        G = new bb2(i, 23);
        H = new bb2(i, 24);
        I = new bb2(i, 25);
        J = new bb2(i, 26);
        K = new bb2(i, 27);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb2(int i, int i2) {
        super(i);
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb2(Worker worker) {
        super(0);
        this.c = 28;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        switch (this.c) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return UUID.randomUUID();
            case 2:
                return new nr2();
            case 3:
                return new jc(new PathMeasure());
            case 4:
            case 5:
                return null;
            case 6:
                return new b73();
            case 7:
                return Boolean.FALSE;
            case 8:
                return wr0.a;
            case 9:
                return new d93(new LinkedHashMap());
            case 10:
                return null;
            case 11:
                return new qe3(1L);
            case 12:
                return null;
            case 13:
                return new vg3();
            case 14:
                return new rx0(0.0f);
            case 15:
                return q74.a;
            case 16:
                return new iq1(0L);
            case 17:
                return new iq1(0L);
            case 18:
                return mz3.b;
            case 19:
                return Boolean.TRUE;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return Boolean.TRUE;
            case 21:
                return Boolean.TRUE;
            case 22:
                ol3 ol3Var = new ol3(pv3.A);
                ol3Var.d();
                return ol3Var;
            case 23:
                return new m74(null, null, null, null, null, null, null, null, null, 32767);
            case 24:
                return w84.a;
            case 25:
                return new ug1();
            case 26:
                return new ot2();
            case 27:
                return new q71();
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }
}
