package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface xe3 extends iu0 {
    void applySemantics(gf3 gf3Var);

    default boolean getShouldClearDescendantSemantics() {
        return false;
    }

    default boolean getShouldMergeDescendantSemantics() {
        return false;
    }
}
