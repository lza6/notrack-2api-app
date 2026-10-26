package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c8 extends we1 implements ne1 {
    public static final c8 c = new c8(2, gb2.class, "max", "max(II)I", 1);

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
