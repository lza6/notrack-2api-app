package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import defpackage.av1;
import defpackage.db1;
import defpackage.fa1;
import defpackage.h43;
import defpackage.kr1;
import defpackage.le1;
import defpackage.u41;
import defpackage.va1;
import defpackage.ww1;
import defpackage.xr0;
import defpackage.yu1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView$keyInputModifier$1 extends ww1 implements le1 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements le1 {
        final /* synthetic */ fa1 $focusDirection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fa1 fa1Var) {
            super(1);
            this.$focusDirection = fa1Var;
        }

        @Override // defpackage.le1
        public final Boolean invoke(db1 db1Var) {
            return Boolean.valueOf(db1Var.z0(this.$focusDirection.a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.le1
    public /* synthetic */ Object invoke(Object obj) {
        return m37x70d653e4(((yu1) obj).a);
    }

    /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m37x70d653e4(KeyEvent keyEvent) {
        fa1 fa1VarM25x5aa118d = this.this$0.m25x5aa118d(keyEvent);
        if (fa1VarM25x5aa118d != null) {
            int i = fa1VarM25x5aa118d.a;
            if (av1.A(keyEvent) == 2) {
                Integer numU0 = xr0.u0(i);
                h43 h43VarOnFetchFocusRect = this.this$0.onFetchFocusRect();
                Boolean boolE = ((va1) this.this$0.getFocusOwner()).e(i, h43VarOnFetchFocusRect, new AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1(fa1VarM25x5aa118d));
                if (boolE != null ? boolE.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (i != 1 && i != 2) {
                    return Boolean.FALSE;
                }
                if (numU0 != null) {
                    View viewFindNextNonChildView = this.this$0.findNextNonChildView(numU0.intValue());
                    if (kr1.n(viewFindNextNonChildView, this.this$0)) {
                        viewFindNextNonChildView = null;
                    }
                    if (viewFindNextNonChildView != null) {
                        Rect rectW0 = h43VarOnFetchFocusRect != null ? xr0.w0(h43VarOnFetchFocusRect) : null;
                        if (rectW0 == null) {
                            u41.r("Invalid rect");
                            return null;
                        }
                        viewFindNextNonChildView.getLocationInWindow(this.this$0.tmpPositionArray);
                        int i2 = this.this$0.tmpPositionArray[0];
                        int i3 = this.this$0.tmpPositionArray[1];
                        AndroidComposeView androidComposeView = this.this$0;
                        androidComposeView.getLocationInWindow(androidComposeView.tmpPositionArray);
                        rectW0.offset(this.this$0.tmpPositionArray[0] - i2, this.this$0.tmpPositionArray[1] - i3);
                        if (xr0.p0(viewFindNextNonChildView, numU0, rectW0)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!((va1) this.this$0.getFocusOwner()).b(i, false, false)) {
                    return Boolean.TRUE;
                }
                Boolean boolE2 = ((va1) this.this$0.getFocusOwner()).e(i, null, new AnonymousClass1(fa1VarM25x5aa118d));
                return Boolean.valueOf(boolE2 != null ? boolE2.booleanValue() : true);
            }
        }
        return Boolean.FALSE;
    }
}
