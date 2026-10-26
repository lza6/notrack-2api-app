package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface ah2 extends mi2, gn3 {
    @Override // defpackage.gn3
    default Object getValue() {
        return Float.valueOf(((bt2) this).f());
    }

    @Override // defpackage.mi2
    default void setValue(Object obj) {
        ((bt2) this).h(((Number) obj).floatValue());
    }
}
