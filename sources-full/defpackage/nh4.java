package defpackage;

import androidx.compose.foundation.layout.WindowInsets$Companion;
import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class nh4 {
    public static final up1 a(pp1 pp1Var) {
        return new up1(pp1Var.a, pp1Var.b, pp1Var.c, pp1Var.d);
    }

    public static final boolean getAreNavigationBarsVisible(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).e.f();
    }

    public static final boolean getAreStatusBarsVisible(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).f.f();
    }

    public static final boolean getAreSystemBarsVisible(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).g.f();
    }

    public static final e getCaptionBar(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).a;
    }

    public static final e getCaptionBarIgnoringVisibility(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).n;
    }

    public static final e getDisplayCutout(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).b;
    }

    public static final e getIme(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).c;
    }

    public static final e getImeAnimationSource(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).t;
    }

    public static final e getImeAnimationTarget(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).s;
    }

    public static final e getMandatorySystemGestures(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).d;
    }

    public static final e getNavigationBars(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).e;
    }

    public static final e getNavigationBarsIgnoringVisibility(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).o;
    }

    public static final e getSafeContent(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).m;
    }

    public static final e getSafeDrawing(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).k;
    }

    public static final e getSafeGestures(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).l;
    }

    public static final e getStatusBars(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).f;
    }

    public static final e getStatusBarsIgnoringVisibility(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).p;
    }

    public static final e getSystemBars(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).g;
    }

    public static final e getSystemBarsIgnoringVisibility(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).q;
    }

    public static final e getSystemGestures(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).h;
    }

    public static final e getTappableElement(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).i;
    }

    public static final e getTappableElementIgnoringVisibility(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).r;
    }

    public static final e getWaterfall(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).j;
    }

    public static final boolean isCaptionBarVisible(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).a.f();
    }

    public static final boolean isImeVisible(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).c.f();
    }

    public static final boolean isTappableElementVisible(WindowInsets$Companion windowInsets$Companion, ck0 ck0Var, int i) {
        return ch4.x.current(ck0Var, 6).i.f();
    }
}
