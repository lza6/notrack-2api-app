package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.internal.c;

/* JADX INFO: loaded from: classes.dex */
public final class br0 {
    public final c a;
    public final az3 b;
    public final fy2 c;
    public final gq0 d;
    public ym3 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final CursorAnchorInfo.Builder j = new CursorAnchorInfo.Builder();
    public final float[] k = ob2.a();
    public final Matrix l = new Matrix();

    public br0(c cVar, az3 az3Var, fy2 fy2Var, gq0 gq0Var) {
        this.a = cVar;
        this.b = az3Var;
        this.c = fy2Var;
        this.d = gq0Var;
    }

    public final CursorAnchorInfo a() {
        cx1 cx1Var;
        cx1 cx1Var2;
        xy3 xy3VarB;
        az3 az3Var = this.b;
        cx1 cx1VarD = az3Var.d();
        if (cx1VarD != null) {
            if (!cx1VarD.z()) {
                cx1VarD = null;
            }
            if (cx1VarD != null && (cx1Var = (cx1) az3Var.e.getValue()) != null) {
                if (!cx1Var.z()) {
                    cx1Var = null;
                }
                if (cx1Var != null && (cx1Var2 = (cx1) az3Var.f.getValue()) != null) {
                    if (!cx1Var2.z()) {
                        cx1Var2 = null;
                    }
                    if (cx1Var2 != null && (xy3VarB = az3Var.b()) != null) {
                        au3 au3VarD = this.a.d();
                        float[] fArr = this.k;
                        ob2.d(fArr);
                        cx1VarD.D(fArr);
                        Matrix matrix = this.l;
                        yo4.T(fArr, matrix);
                        h43 h43VarJ = vl0.j0(cx1Var).j(cx1VarD.y(cx1Var, 0L));
                        h43 h43VarJ2 = vl0.j0(cx1Var2).j(cx1VarD.y(cx1Var2, 0L));
                        long j = au3VarD.h;
                        jz3 jz3Var = au3VarD.l;
                        boolean z = this.f;
                        boolean z2 = this.g;
                        boolean z3 = this.h;
                        boolean z4 = this.i;
                        CursorAnchorInfo.Builder builder = this.j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iF = jz3.f(j);
                        builder.setSelectionRange(iF, jz3.e(j));
                        u53 u53Var = u53.d;
                        if (z && iF >= 0) {
                            h43 h43VarC = xy3VarB.c(iF);
                            float fW = py.w(h43VarC.a, 0.0f, (int) (xy3VarB.c >> 32));
                            boolean zS = gb2.s(h43VarJ, fW, h43VarC.b);
                            boolean zS2 = gb2.s(h43VarJ, fW, h43VarC.d);
                            boolean z5 = xy3VarB.a(iF) == u53Var;
                            int i = (zS || zS2) ? 1 : 0;
                            if (!zS || !zS2) {
                                i |= 2;
                            }
                            if (z5) {
                                i |= 4;
                            }
                            int i2 = i;
                            float f = h43VarC.b;
                            float f2 = h43VarC.d;
                            builder.setInsertionMarkerLocation(fW, f, f2, f2, i2);
                        }
                        if (z2) {
                            int iF2 = jz3Var != null ? jz3.f(jz3Var.a) : -1;
                            int iE = jz3Var != null ? jz3.e(jz3Var.a) : -1;
                            if (iF2 >= 0 && iF2 < iE) {
                                builder.setComposingText(iF2, au3VarD.d.subSequence(iF2, iE));
                                float[] fArr2 = new float[(iE - iF2) * 4];
                                xy3VarB.b.a(p23.d(iF2, iE), fArr2);
                                int i3 = iF2;
                                while (i3 < iE) {
                                    int i4 = (i3 - iF2) * 4;
                                    float f3 = fArr2[i4];
                                    float f4 = fArr2[i4 + 1];
                                    float f5 = fArr2[i4 + 2];
                                    float f6 = fArr2[i4 + 3];
                                    int i5 = iE;
                                    int i6 = (f3 < h43VarJ.c ? 1 : 0) & (h43VarJ.a < f5 ? 1 : 0) & (h43VarJ.b < f6 ? 1 : 0) & (f4 < h43VarJ.d ? 1 : 0);
                                    if (!gb2.s(h43VarJ, f3, f4) || !gb2.s(h43VarJ, f5, f6)) {
                                        i6 |= 2;
                                    }
                                    if (xy3VarB.a(i3) == u53Var) {
                                        i6 |= 4;
                                    }
                                    builder.addCharacterBounds(i3, f3, f4, f5, f6, i6);
                                    i3++;
                                    iE = i5;
                                }
                            }
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 33 && z3) {
                            builder.setEditorBoundsInfo(i1.h().setEditorBounds(xr0.x0(h43VarJ2)).setHandwritingBounds(xr0.x0(h43VarJ2)).build());
                        }
                        if (i7 >= 34 && z4) {
                            xr0.K(builder, xy3VarB, h43VarJ);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
