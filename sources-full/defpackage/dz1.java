package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dz1 implements u02 {
    public final vy1 a;
    public final s02 b;
    public final int c;
    public final /* synthetic */ s02 d;
    public final /* synthetic */ wz1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long j;

    public dz1(vy1 vy1Var, s02 s02Var, int i, wz1 wz1Var, boolean z, boolean z2, int i2, int i3, long j) {
        this.d = s02Var;
        this.e = wz1Var;
        this.f = z;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = j;
        this.a = vy1Var;
        this.b = s02Var;
        this.c = i;
    }

    public final kz1 a(int i, long j, int i2, int i3, int i4) {
        int i5;
        xy1 xy1Var = (xy1) this.a;
        Object objB = xy1Var.b(i);
        Object objJ = xy1Var.b.J(i);
        List listA = this.b.a(j, i);
        if (um0.f(j)) {
            i5 = um0.j(j);
        } else {
            if (!um0.e(j)) {
                so1.a("does not have fixed height");
            }
            i5 = um0.i(j);
        }
        dx1 layoutDirection = this.d.d.getLayoutDirection();
        b bVar = this.e.m;
        int i6 = this.i;
        long j2 = this.j;
        return new kz1(i, objB, this.f, i5, i4, this.g, layoutDirection, this.h, i6, listA, j2, objJ, bVar, j, i2, i3);
    }
}
