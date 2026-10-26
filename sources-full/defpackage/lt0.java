package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lt0 implements pb3 {
    public final /* synthetic */ mt0 a;

    public lt0(mt0 mt0Var) {
        this.a = mt0Var;
    }

    @Override // defpackage.pb3
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        mt0 mt0Var = this.a;
        float fFloatValue = ((Number) mt0Var.a.invoke(Float.valueOf(f))).floatValue();
        mt0Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        mt0Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
