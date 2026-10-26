package androidx.compose.ui.platform;

import ai.notrack.app.R;
import android.view.View;
import android.view.ViewGroup;
import defpackage.h;
import defpackage.kr1;
import defpackage.m84;
import defpackage.ne1;
import defpackage.pk0;
import defpackage.qk0;
import defpackage.tk0;
import defpackage.ux1;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    public static final h createApplier(ux1 ux1Var) {
        return new m84(ux1Var);
    }

    private static final pk0 doSetContent(AndroidComposeView androidComposeView, qk0 qk0Var, ne1 ne1Var) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() && androidComposeView.getTag(R.id.inspection_slot_table_set) == null) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, new tk0(qk0Var, new m84(androidComposeView.getRoot())));
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.setContent(ne1Var);
        if (!kr1.n(androidComposeView.getCoroutineContext(), qk0Var.h())) {
            androidComposeView.setCoroutineContext(qk0Var.h());
        }
        return wrappedComposition;
    }

    public static final pk0 setContent(AbstractComposeView abstractComposeView, qk0 qk0Var, ne1 ne1Var) {
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), qk0Var.h());
            abstractComposeView.addView(androidComposeView.getView(), DefaultLayoutParams);
        }
        return doSetContent(androidComposeView, qk0Var, ne1Var);
    }
}
