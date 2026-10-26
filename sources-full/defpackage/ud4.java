package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class ud4 {
    public static final n32 a(View view) {
        view.getClass();
        return (n32) rf3.Y(rf3.a0(rf3.Z(view, lb4.p), lb4.q));
    }

    public static void b(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static boolean c(byte b) {
        return b > -65;
    }
}
