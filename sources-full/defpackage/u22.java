package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class u22 {
    public final ob a;
    public final fp1 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ey3 j;
    public xy3 k;
    public nn2 l;
    public h43 m;
    public h43 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = ob2.a();
    public final Matrix q = new Matrix();

    public u22(ob obVar, fp1 fp1Var) {
        this.a = obVar;
        this.b = fp1Var;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    public final void a() {
        fp1 fp1Var = this.b;
        InputMethodManager inputMethodManagerF = fp1Var.f();
        View view = (View) fp1Var.c;
        if (!inputMethodManagerF.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        ob2.d(fArr);
        cx1 cx1Var = (cx1) this.a.c.l.getValue();
        if (cx1Var != null) {
            if (!cx1Var.z()) {
                cx1Var = null;
            }
            if (cx1Var != null) {
                cx1Var.D(fArr);
            }
        }
        h43 h43Var = this.n;
        h43Var.getClass();
        float f = -h43Var.a;
        h43 h43Var2 = this.n;
        h43Var2.getClass();
        ob2.f(fArr, f, -h43Var2.b);
        Matrix matrix = this.q;
        yo4.T(fArr, matrix);
        ey3 ey3Var = this.j;
        ey3Var.getClass();
        long j = ey3Var.b;
        nn2 nn2Var = this.l;
        nn2Var.getClass();
        xy3 xy3Var = this.k;
        xy3Var.getClass();
        h43 h43Var3 = this.m;
        h43Var3.getClass();
        h43 h43Var4 = this.n;
        h43Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
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
            boolean zS = gb2.s(h43Var3, fW, h43VarC.b);
            boolean zS2 = gb2.s(h43Var3, fW, h43VarC.d);
            boolean z5 = xy3Var.a(iO) == u53Var;
            int i = (zS || zS2) ? 1 : 0;
            if (!zS || !zS2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f2 = h43VarC.b;
            float f3 = h43VarC.d;
            builder.setInsertionMarkerLocation(fW, f2, f3, f3, i);
        }
        if (z2) {
            int iF2 = jz3Var != null ? jz3.f(jz3Var.a) : -1;
            int iE = jz3Var != null ? jz3.e(jz3Var.a) : -1;
            if (iF2 >= 0 && iF2 < iE) {
                builder.setComposingText(iF2, ey3Var.a.d.subSequence(iF2, iE));
                int iO2 = nn2Var.o(iF2);
                int iO3 = nn2Var.o(iE);
                float[] fArr2 = new float[(iO3 - iO2) * 4];
                xy3Var.b.a(p23.d(iO2, iO3), fArr2);
                while (iF2 < iE) {
                    int iO4 = nn2Var.o(iF2);
                    int i2 = (iO4 - iO2) * 4;
                    float f4 = fArr2[i2];
                    float f5 = fArr2[i2 + 1];
                    int i3 = iE;
                    float f6 = fArr2[i2 + 2];
                    float f7 = fArr2[i2 + 3];
                    int i4 = iO2;
                    int i5 = (h43Var3.a < f6 ? 1 : 0) & (f4 < h43Var3.c ? 1 : 0) & (h43Var3.b < f7 ? 1 : 0) & (f5 < h43Var3.d ? 1 : 0);
                    if (!gb2.s(h43Var3, f4, f5) || !gb2.s(h43Var3, f6, f7)) {
                        i5 |= 2;
                    }
                    if (xy3Var.a(iO4) == u53Var) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder.addCharacterBounds(i6, f4, f5, f6, f7, i5);
                    iF2 = i6 + 1;
                    iE = i3;
                    iO2 = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            builder.setEditorBoundsInfo(i1.h().setEditorBounds(xr0.x0(h43Var4)).setHandwritingBounds(xr0.x0(h43Var4)).build());
        }
        if (i7 >= 34 && z4) {
            xr0.K(builder, xy3Var, h43Var3);
        }
        fp1Var.f().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
