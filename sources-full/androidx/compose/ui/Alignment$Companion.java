package androidx.compose.ui;

import defpackage.wt;
import defpackage.xt;
import defpackage.yt;

/* JADX INFO: loaded from: classes.dex */
public final class Alignment$Companion {
    private static final yt TopStart = new yt(-1.0f, -1.0f);
    private static final yt TopCenter = new yt(0.0f, -1.0f);
    private static final yt TopEnd = new yt(1.0f, -1.0f);
    private static final yt CenterStart = new yt(-1.0f, 0.0f);
    private static final yt Center = new yt(0.0f, 0.0f);
    private static final yt CenterEnd = new yt(1.0f, 0.0f);
    private static final yt BottomStart = new yt(-1.0f, 1.0f);
    private static final yt BottomCenter = new yt(0.0f, 1.0f);
    private static final yt BottomEnd = new yt(1.0f, 1.0f);
    private static final xt Top = new xt(-1.0f);
    private static final xt CenterVertically = new xt(0.0f);
    private static final xt Bottom = new xt(1.0f);
    private static final wt Start = new wt(-1.0f);
    private static final wt CenterHorizontally = new wt(0.0f);
    private static final wt End = new wt(1.0f);

    public static xt getBottom() {
        return Bottom;
    }

    public static yt getBottomCenter() {
        return BottomCenter;
    }

    public static yt getBottomEnd() {
        return BottomEnd;
    }

    public static yt getBottomStart() {
        return BottomStart;
    }

    public static yt getCenter() {
        return Center;
    }

    public static yt getCenterEnd() {
        return CenterEnd;
    }

    public static wt getCenterHorizontally() {
        return CenterHorizontally;
    }

    public static yt getCenterStart() {
        return CenterStart;
    }

    public static xt getCenterVertically() {
        return CenterVertically;
    }

    public static wt getEnd() {
        return End;
    }

    public static wt getStart() {
        return Start;
    }

    public static xt getTop() {
        return Top;
    }

    public static yt getTopCenter() {
        return TopCenter;
    }

    public static yt getTopEnd() {
        return TopEnd;
    }

    public static yt getTopStart() {
        return TopStart;
    }
}
