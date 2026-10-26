package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer$Companion;
import defpackage.ck0;
import defpackage.cl3;
import defpackage.gn3;
import defpackage.kk0;
import defpackage.le1;
import defpackage.ne1;
import defpackage.r11;
import defpackage.sf3;
import defpackage.w33;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInfoKt {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ww1 implements ne1 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ le1 $onWindowFocusChanged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(le1 le1Var, int i) {
            super(2);
            this.$onWindowFocusChanged = le1Var;
            this.$$changed = i;
        }

        @Override // defpackage.ne1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ck0) obj, ((Number) obj2).intValue());
            return w84.a;
        }

        public final void invoke(ck0 ck0Var, int i) {
            WindowInfoKt.WindowFocusObserver(this.$onWindowFocusChanged, ck0Var, sf3.V(this.$$changed | 1));
        }
    }

    public static final void WindowFocusObserver(le1 le1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(127829799);
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(le1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            WindowInfo windowInfo = (WindowInfo) kk0Var.l(CompositionLocalsKt.getLocalWindowInfo());
            gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(le1Var, kk0Var, i2 & 14);
            boolean zH = kk0Var.h(windowInfo) | kk0Var.h(gn3VarRememberUpdatedState);
            Object objP = kk0Var.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                objP = new WindowInfoKt$WindowFocusObserver$1$1(windowInfo, gn3VarRememberUpdatedState, null);
                kk0Var.l0(objP);
            }
            r11.LaunchedEffect(windowInfo, (ne1) objP, kk0Var, 0);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new AnonymousClass2(le1Var, i));
        }
    }
}
