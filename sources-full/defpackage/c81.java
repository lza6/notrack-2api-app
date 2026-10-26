package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface c81 extends wf {
    @Override // defpackage.wf
    default xb4 a(w64 w64Var) {
        return new ir3(this);
    }

    float b(long j, float f, float f2, float f3);

    float c(long j, float f, float f2, float f3);

    long d(float f, float f2, float f3);

    default float e(float f, float f2, float f3) {
        return c(d(f, f2, f3), f, f2, f3);
    }
}
