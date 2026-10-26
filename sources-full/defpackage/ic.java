package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class ic implements nt2 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public ic(Path path) {
        this.a = path;
    }

    public final h43 c() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new h43(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(nt2 nt2Var, nt2 nt2Var2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(nt2Var instanceof ic)) {
            j93.k("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ((ic) nt2Var).a;
        if (nt2Var2 instanceof ic) {
            return this.a.op(path, ((ic) nt2Var2).a, op);
        }
        j93.k("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void e() {
        this.a.reset();
    }

    public final void f(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
