package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b8 extends we1 implements ne1 {
    public static final b8 c = new b8(2, gb2.class, "min", "min(II)I", 1);

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
