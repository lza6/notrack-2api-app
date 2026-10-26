package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import defpackage.ne1;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer$Companion$getMatrix$1 extends ww1 implements ne1 {
    public static final ViewLayer$Companion$getMatrix$1 INSTANCE = new ViewLayer$Companion$getMatrix$1();

    public ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // defpackage.ne1
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, (Matrix) obj2);
        return w84.a;
    }

    public final void invoke(View view, Matrix matrix) {
        matrix.set(view.getMatrix());
    }
}
