package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class ar0 {
    public final AndroidComposeView a;
    public final ci4 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ey3 j;
    public xy3 k;
    public nn2 l;
    public h43 n;
    public h43 o;
    public final Object c = new Object();
    public le1 m = sx.t;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = ob2.a();
    public final Matrix r = new Matrix();

    public ar0(AndroidComposeView androidComposeView, ci4 ci4Var) {
        this.a = androidComposeView;
        this.b = ci4Var;
    }

    public final void a() {
        int iE;
        int iE2;
        ci4 ci4Var = this.b;
        ly1 ly1Var = (ly1) ci4Var.h;
        InputMethodManager inputMethodManager = (InputMethodManager) ly1Var.getValue();
        View view = (View) ci4Var.d;
        if (inputMethodManager.isActive(view)) {
            le1 le1Var = this.m;
            float[] fArr = this.q;
            le1Var.invoke(new ob2(fArr));
            this.a.mo26x1a2a05c7(fArr);
            Matrix matrix = this.r;
            yo4.T(fArr, matrix);
            ey3 ey3Var = this.j;
            ey3Var.getClass();
            long j = ey3Var.b;
            nn2 nn2Var = this.l;
            nn2Var.getClass();
            xy3 xy3Var = this.k;
            xy3Var.getClass();
            pg2 pg2Var = xy3Var.b;
            h43 h43Var = this.n;
            h43Var.getClass();
            float f = h43Var.d;
            float f2 = h43Var.b;
            h43 h43Var2 = this.o;
            h43Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            jz3 jz3Var = ey3Var.c;
            int iF = jz3.f(j);
            builder.setSelectionRange(iF, jz3.e(j));
            u53 u53Var = u53.d;
            if (z && iF >= 0) {
                int iO = nn2Var.o(iF);
                h43 h43VarC = xy3Var.c(iO);
                float fW = py.w(h43VarC.a, 0.0f, (int) (xy3Var.c >> 32));
                boolean zI = xp1.i(h43Var, fW, h43VarC.b);
                boolean zI2 = xp1.i(h43Var, fW, h43VarC.d);
                boolean z5 = xy3Var.a(iO) == u53Var;
                int i = (zI || zI2) ? 1 : 0;
                if (!zI || !zI2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = h43VarC.b;
                float f4 = h43VarC.d;
                builder.setInsertionMarkerLocation(fW, f3, f4, f4, i);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int iF2 = jz3Var != null ? jz3.f(jz3Var.a) : -1;
                int iE3 = jz3Var != null ? jz3.e(jz3Var.a) : -1;
                if (iF2 >= 0 && iF2 < iE3) {
                    builder2.setComposingText(iF2, ey3Var.a.d.subSequence(iF2, iE3));
                    int iO2 = nn2Var.o(iF2);
                    int iO3 = nn2Var.o(iE3);
                    float[] fArr2 = new float[(iO3 - iO2) * 4];
                    pg2Var.a(p23.d(iO2, iO3), fArr2);
                    while (iF2 < iE3) {
                        int iO4 = nn2Var.o(iF2);
                        int i2 = (iO4 - iO2) * 4;
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iE3;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iF2;
                        int i5 = (h43Var.a < f7 ? 1 : 0) & (f5 < h43Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!xp1.i(h43Var, f5, f6) || !xp1.i(h43Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (xy3Var.a(iO4) == u53Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iF2 = i4 + 1;
                        iE3 = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                builder2.setEditorBoundsInfo(i1.h().setEditorBounds(xr0.x0(h43Var2)).setHandwritingBounds(xr0.x0(h43Var2)).build());
            }
            if (i6 >= 34 && z4 && !h43Var.g() && (iE = pg2Var.e(f2)) <= (iE2 = pg2Var.e(f))) {
                while (true) {
                    builder2.addVisibleLineBounds(xy3Var.e(iE), pg2Var.f(iE), xy3Var.f(iE), pg2Var.b(iE));
                    if (iE == iE2) {
                        break;
                    } else {
                        iE++;
                    }
                }
            }
            ((InputMethodManager) ly1Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
