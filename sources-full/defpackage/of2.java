package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class of2 implements iu0 {
    public static final int $stable = 8;
    private of2 child;
    private wl2 coordinator;
    private je1 detachedListener;
    private boolean insertedNodeAwaitingAttachForInvalidation;
    private boolean isAttached;
    private int kindSet;
    private boolean onAttachRunExpected;
    private boolean onDetachRunExpected;
    private kn2 ownerScope;
    private of2 parent;
    private gq0 scope;
    private boolean updatedNodeAwaitingAttachForInvalidation;
    private of2 node = this;
    private int aggregateChildKindSet = -1;

    public static /* synthetic */ void getNode$annotations() {
    }

    public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
    }

    public final int getAggregateChildKindSet$ui_release() {
        return this.aggregateChildKindSet;
    }

    public final of2 getChild$ui_release() {
        return this.child;
    }

    public final wl2 getCoordinator$ui_release() {
        return this.coordinator;
    }

    public final gq0 getCoroutineScope() {
        gq0 gq0Var = this.scope;
        if (gq0Var != null) {
            return gq0Var;
        }
        qo0 qo0VarA = yo4.a(y64.N(this).getCoroutineContext().plus(new is1((gs1) y64.N(this).getCoroutineContext().get(bg1.s))));
        this.scope = qo0VarA;
        return qo0VarA;
    }

    public final je1 getDetachedListener$ui_release() {
        return this.detachedListener;
    }

    public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
        return this.insertedNodeAwaitingAttachForInvalidation;
    }

    public final int getKindSet$ui_release() {
        return this.kindSet;
    }

    @Override // defpackage.iu0
    public final of2 getNode() {
        return this.node;
    }

    public final kn2 getOwnerScope$ui_release() {
        return this.ownerScope;
    }

    public final of2 getParent$ui_release() {
        return this.parent;
    }

    public boolean getShouldAutoInvalidate() {
        return true;
    }

    public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
        return this.updatedNodeAwaitingAttachForInvalidation;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    /* JADX INFO: renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
    public final boolean m1780xf92a8b30(int i) {
        return (getKindSet$ui_release() & i) != 0;
    }

    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public void markAsAttached$ui_release() {
        if (this.isAttached) {
            po1.b("node attached multiple times");
        }
        if (!(this.coordinator != null)) {
            po1.b("attach invoked on a node without a coordinator");
        }
        this.isAttached = true;
        this.onAttachRunExpected = true;
    }

    public void markAsDetached$ui_release() {
        if (!this.isAttached) {
            po1.b("Cannot detach a node that is not attached");
        }
        if (this.onAttachRunExpected) {
            po1.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.onDetachRunExpected) {
            po1.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.isAttached = false;
        gq0 gq0Var = this.scope;
        if (gq0Var != null) {
            yo4.l(gq0Var, new a81("The Modifier.Node was detached", 1));
            this.scope = null;
        }
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onReset() {
    }

    public void reset$ui_release() {
        if (!this.isAttached) {
            po1.b("reset() called on an unattached node");
        }
        onReset();
    }

    public void runAttachLifecycle$ui_release() {
        if (!this.isAttached) {
            po1.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.onAttachRunExpected) {
            po1.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.onAttachRunExpected = false;
        onAttach();
        this.onDetachRunExpected = true;
    }

    public void runDetachLifecycle$ui_release() {
        if (!this.isAttached) {
            po1.b("node detached multiple times");
        }
        if (this.coordinator == null) {
            po1.b("detach invoked on a node without a coordinator");
        }
        if (!this.onDetachRunExpected) {
            po1.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.onDetachRunExpected = false;
        je1 je1Var = this.detachedListener;
        if (je1Var != null) {
            je1Var.invoke();
        }
        onDetach();
    }

    public final void setAggregateChildKindSet$ui_release(int i) {
        this.aggregateChildKindSet = i;
    }

    public void setAsDelegateTo$ui_release(of2 of2Var) {
        this.node = of2Var;
    }

    public final void setChild$ui_release(of2 of2Var) {
        this.child = of2Var;
    }

    public final void setDetachedListener$ui_release(je1 je1Var) {
        this.detachedListener = je1Var;
    }

    public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
        this.insertedNodeAwaitingAttachForInvalidation = z;
    }

    public final void setKindSet$ui_release(int i) {
        this.kindSet = i;
    }

    public final void setOwnerScope$ui_release(kn2 kn2Var) {
        this.ownerScope = kn2Var;
    }

    public final void setParent$ui_release(of2 of2Var) {
        this.parent = of2Var;
    }

    public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
        this.updatedNodeAwaitingAttachForInvalidation = z;
    }

    public final void sideEffect(je1 je1Var) {
        y64.N(this).registerOnEndApplyChangesListener(je1Var);
    }

    public void updateCoordinator$ui_release(wl2 wl2Var) {
        this.coordinator = wl2Var;
    }
}
