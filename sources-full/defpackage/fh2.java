package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface fh2 extends mi2, gn3 {
    @Override // defpackage.gn3
    default Object getValue() {
        return Integer.valueOf(((ct2) this).f());
    }

    @Override // defpackage.mi2
    default void setValue(Object obj) {
        ((ct2) this).h(((Number) obj).intValue());
    }
}
