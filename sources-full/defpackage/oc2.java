package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class oc2 extends FrameLayout implements ge0 {
    public final CollapsibleActionView c;

    /* JADX WARN: Multi-variable type inference failed */
    public oc2(View view) {
        super(view.getContext());
        this.c = (CollapsibleActionView) view;
        addView(view);
    }
}
