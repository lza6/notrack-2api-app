package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ju0 extends of2 {
    public final int c = xl2.f(this);
    public of2 d;

    @Override // defpackage.of2
    public final void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (of2 child$ui_release = this.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!child$ui_release.isAttached()) {
                child$ui_release.markAsAttached$ui_release();
            }
        }
    }

    @Override // defpackage.of2
    public final void markAsDetached$ui_release() {
        for (of2 child$ui_release = this.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // defpackage.of2
    public final void reset$ui_release() {
        super.reset$ui_release();
        for (of2 child$ui_release = this.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.reset$ui_release();
        }
    }

    @Override // defpackage.of2
    public final void runAttachLifecycle$ui_release() {
        for (of2 child$ui_release = this.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // defpackage.of2
    public final void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (of2 child$ui_release = this.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.runDetachLifecycle$ui_release();
        }
    }

    @Override // defpackage.of2
    public final void setAsDelegateTo$ui_release(of2 of2Var) {
        super.setAsDelegateTo$ui_release(of2Var);
        for (of2 child$ui_release = this.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.setAsDelegateTo$ui_release(of2Var);
        }
    }

    @Override // defpackage.of2
    public final void updateCoordinator$ui_release(wl2 wl2Var) {
        super.updateCoordinator$ui_release(wl2Var);
        for (of2 child$ui_release = this.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.updateCoordinator$ui_release(wl2Var);
        }
    }

    public final void v0(iu0 iu0Var) {
        of2 node = iu0Var.getNode();
        if (node != iu0Var) {
            of2 of2Var = iu0Var instanceof of2 ? (of2) iu0Var : null;
            of2 parent$ui_release = of2Var != null ? of2Var.getParent$ui_release() : null;
            if (node == getNode() && kr1.n(parent$ui_release, this)) {
                return;
            }
            u41.r("Cannot delegate to an already delegated node");
            return;
        }
        if (node.isAttached()) {
            po1.b("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet$ui_release = getKindSet$ui_release();
        int iG = xl2.g(node);
        node.setKindSet$ui_release(iG);
        int kindSet$ui_release2 = getKindSet$ui_release();
        int i = iG & 2;
        if (i != 0 && (kindSet$ui_release2 & 2) != 0 && !(this instanceof lx1)) {
            po1.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
        }
        node.setChild$ui_release(this.d);
        this.d = node;
        node.setParent$ui_release(this);
        x0(iG | getKindSet$ui_release(), false);
        if (isAttached()) {
            if (i == 0 || (kindSet$ui_release & 2) != 0) {
                updateCoordinator$ui_release(getCoordinator$ui_release());
            } else {
                yd ydVar = y64.M(this).N;
                getNode().updateCoordinator$ui_release(null);
                ydVar.k();
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            xl2.a(node);
        }
    }

    public final void w0(iu0 iu0Var) {
        of2 of2Var = null;
        for (of2 child$ui_release = this.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            if (child$ui_release == iu0Var) {
                if (child$ui_release.isAttached()) {
                    rh2 rh2Var = xl2.a;
                    if (!child$ui_release.isAttached()) {
                        po1.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    xl2.b(child$ui_release, -1, 2);
                    child$ui_release.runDetachLifecycle$ui_release();
                    child$ui_release.markAsDetached$ui_release();
                }
                child$ui_release.setAsDelegateTo$ui_release(child$ui_release);
                child$ui_release.setAggregateChildKindSet$ui_release(0);
                if (of2Var == null) {
                    this.d = child$ui_release.getChild$ui_release();
                } else {
                    of2Var.setChild$ui_release(child$ui_release.getChild$ui_release());
                }
                child$ui_release.setChild$ui_release(null);
                child$ui_release.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int iG = xl2.g(this);
                x0(iG, true);
                if (isAttached() && (kindSet$ui_release & 2) != 0 && (iG & 2) == 0) {
                    yd ydVar = y64.M(this).N;
                    getNode().updateCoordinator$ui_release(null);
                    ydVar.k();
                    return;
                }
                return;
            }
            of2Var = child$ui_release;
        }
        m51.u(iu0Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void x0(int i, boolean z) {
        ?? parent$ui_release;
        of2 child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i);
        if (kindSet$ui_release != i) {
            if (getNode() == this) {
                setAggregateChildKindSet$ui_release(i);
            }
            if (isAttached()) {
                of2 node = getNode();
                while (parent$ui_release != 0) {
                    i |= parent$ui_release.getKindSet$ui_release();
                    parent$ui_release.setKindSet$ui_release(i);
                    if (parent$ui_release == node) {
                        break;
                    }
                    this = this;
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
                if (z && parent$ui_release == node) {
                    i = xl2.g(node);
                    node.setKindSet$ui_release(i);
                }
                int aggregateChildKindSet$ui_release = i | ((parent$ui_release == 0 || (child$ui_release = parent$ui_release.getChild$ui_release()) == null) ? 0 : child$ui_release.getAggregateChildKindSet$ui_release());
                for (?? parent$ui_release2 = parent$ui_release; parent$ui_release2 != 0; parent$ui_release2 = parent$ui_release2.getParent$ui_release()) {
                    aggregateChildKindSet$ui_release |= parent$ui_release2.getKindSet$ui_release();
                    parent$ui_release2.setAggregateChildKindSet$ui_release(aggregateChildKindSet$ui_release);
                }
            }
        }
    }
}
