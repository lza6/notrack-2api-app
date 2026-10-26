package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract class ng3 extends yx {
    public Shader a;
    public long b = 9205357640488583168L;

    @Override // defpackage.yx
    public final void a(float f, long j, ks2 ks2Var) {
        Shader shaderB = this.a;
        if (shaderB == null || !bi3.a(this.b, j)) {
            if (bi3.e(j)) {
                shaderB = null;
                this.a = null;
                this.b = 9205357640488583168L;
            } else {
                shaderB = b(j);
                this.a = shaderB;
                this.b = j;
            }
        }
        bc bcVar = (bc) ks2Var;
        Paint paint = (Paint) bcVar.d;
        long jB = gb2.b(paint.getColor());
        long j2 = re0.b;
        if (!re0.c(jB, j2)) {
            bcVar.f(j2);
        }
        if (!kr1.n((Shader) bcVar.h, shaderB)) {
            bcVar.i(shaderB);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        bcVar.d(f);
    }

    public abstract Shader b(long j);
}
