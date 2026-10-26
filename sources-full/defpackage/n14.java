package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class n14 {
    public final int a;

    public n14(int i) {
        this.a = i;
    }

    public static void b(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public abstract n14 a();
}
