package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import defpackage.dx1;
import defpackage.e8;
import defpackage.gg1;
import defpackage.wu0;
import defpackage.y00;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    public static final GraphicsLayerImpl$Companion a = GraphicsLayerImpl$Companion.$$INSTANCE;

    void a();

    long b();

    void c(float f);

    void d();

    void discardDisplayList();

    void e();

    long f();

    void g(long j);

    float getAlpha();

    float getCameraDistance();

    default boolean getHasDisplayList() {
        return true;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getTranslationX();

    float getTranslationY();

    void h(Outline outline, long j);

    void i();

    void j(y00 y00Var);

    void k(boolean z);

    int l();

    void m(wu0 wu0Var, dx1 dx1Var, gg1 gg1Var, e8 e8Var);

    void n(int i);

    void o(long j);

    long p();

    Matrix q();

    void r(int i, int i2, long j);

    float s();

    void setAlpha(float f);

    void setCameraDistance(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    int t();

    void u(long j);

    long v();
}
