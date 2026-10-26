package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class qg4 extends pg4 {
    public qg4(wg4 wg4Var, WindowInsets windowInsets) {
        super(wg4Var, windowInsets);
    }

    public qg4(wg4 wg4Var, qg4 qg4Var) {
        super(wg4Var, qg4Var);
    }

    @Override // defpackage.tg4
    public wg4 a() {
        return wg4.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.og4, defpackage.tg4
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg4)) {
            return false;
        }
        qg4 qg4Var = (qg4) obj;
        return Objects.equals(this.c, qg4Var.c) && Objects.equals(this.g, qg4Var.g);
    }

    @Override // defpackage.tg4
    public tw0 f() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new tw0(displayCutout);
    }

    @Override // defpackage.tg4
    public int hashCode() {
        return this.c.hashCode();
    }
}
