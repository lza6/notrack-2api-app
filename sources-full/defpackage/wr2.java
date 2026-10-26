package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface wr2 {
    void destroy();

    void drawLayer(y00 y00Var, gg1 gg1Var);

    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    float[] mo81x1f96a075();

    void invalidate();

    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    void mo82x9d378691(float[] fArr);

    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    boolean mo83x467a9c69(long j);

    void mapBounds(ei2 ei2Var, boolean z);

    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    long mo84xc59c8b2a(long j, boolean z);

    /* JADX INFO: renamed from: move--gyyYBs */
    void mo85x3458c3d4(long j);

    /* JADX INFO: renamed from: resize-ozmzZPI */
    void mo86x27e04be2(long j);

    void reuseLayer(ne1 ne1Var, je1 je1Var);

    /* JADX INFO: renamed from: transform-58bKbWc */
    void mo87x63595be1(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(n63 n63Var);
}
