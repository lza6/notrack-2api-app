package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class d4 extends ww1 implements je1 {
    public static final d4 A;
    public static final d4 B;
    public static final d4 C;
    public static final d4 D;
    public static final d4 E;
    public static final d4 F;
    public static final d4 G;
    public static final d4 H;
    public static final d4 I;
    public static final d4 J;
    public static final d4 K;
    public static final d4 L;
    public static final d4 M;
    public static final d4 d;
    public static final d4 h;
    public static final d4 l;
    public static final d4 m;
    public static final d4 n;
    public static final d4 o;
    public static final d4 p;
    public static final d4 q;
    public static final d4 r;
    public static final d4 s;
    public static final d4 t;
    public static final d4 u;
    public static final d4 v;
    public static final d4 w;
    public static final d4 x;
    public static final d4 y;
    public static final d4 z;
    public final /* synthetic */ int c;

    static {
        int i = 0;
        d = new d4(i, 0);
        h = new d4(i, 1);
        l = new d4(i, 2);
        m = new d4(i, 3);
        n = new d4(i, 4);
        o = new d4(i, 5);
        p = new d4(i, 6);
        q = new d4(i, 7);
        r = new d4(i, 8);
        s = new d4(i, 9);
        t = new d4(i, 10);
        u = new d4(i, 11);
        v = new d4(i, 12);
        w = new d4(i, 13);
        x = new d4(i, 14);
        y = new d4(i, 15);
        z = new d4(i, 16);
        A = new d4(i, 17);
        B = new d4(i, 18);
        C = new d4(i, 19);
        D = new d4(i, 20);
        E = new d4(i, 21);
        F = new d4(i, 22);
        G = new d4(i, 23);
        H = new d4(i, 24);
        I = new d4(i, 25);
        J = new d4(i, 26);
        K = new d4(i, 27);
        L = new d4(i, 28);
        M = new d4(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return Integer.valueOf(j23.d.d(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                return UUID.randomUUID();
            case 3:
                return "DEFAULT_TEST_TAG";
            case 4:
                return UUID.randomUUID();
            case 5:
            case 6:
            case 7:
                return w84Var;
            case 8:
                return new re0(gb2.b(1308617531));
            case 9:
                return null;
            case 10:
                return Boolean.TRUE;
            case 11:
                return af0.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            case 12:
                return Boolean.TRUE;
            case 13:
                return new ux1(2);
            case 14:
                mk0.d("Unexpected call to default provider");
                throw new eg0();
            case 15:
                return new re0(re0.b);
            case 16:
                return w84Var;
            case 17:
                return Boolean.TRUE;
            case 18:
                return w84Var;
            case 19:
                return x21.c;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return Boolean.TRUE;
            case 21:
                return Boolean.FALSE;
            case 22:
                return os0.a;
            case 23:
                return null;
            case 24:
                return Boolean.TRUE;
            case 25:
                return new rx0(48.0f);
            case 26:
                return new ux1(3);
            case 27:
                return null;
            case 28:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            default:
                return null;
        }
    }
}
