package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends hj implements h3 {
    public final /* synthetic */ g3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(g3 g3Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.l = g3Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        xp1.F(this, getContentDescription());
        setOnTouchListener(new b3(this, this));
    }

    @Override // defpackage.h3
    public final boolean b() {
        return false;
    }

    @Override // defpackage.h3
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.l.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
