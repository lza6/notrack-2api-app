package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob extends we1 implements le1 {
    public final /* synthetic */ t22 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(t22 t22Var) {
        super(1, jr1.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.c = t22Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        float[] fArr = ((ob2) obj).a;
        cx1 cx1Var = (cx1) this.c.l.getValue();
        if (cx1Var != null) {
            if (!cx1Var.z()) {
                cx1Var = null;
            }
            if (cx1Var != null) {
                cx1Var.D(fArr);
            }
        }
        return w84.a;
    }
}
