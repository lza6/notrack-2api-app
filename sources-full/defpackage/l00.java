package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l00 implements wa1 {
    public static final l00 a = new l00();
    public static Boolean b;

    @Override // defpackage.wa1
    public final boolean c() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw fq2.i("canFocus is read before it is written");
    }

    @Override // defpackage.wa1
    public final void d(boolean z) {
        b = Boolean.valueOf(z);
    }
}
