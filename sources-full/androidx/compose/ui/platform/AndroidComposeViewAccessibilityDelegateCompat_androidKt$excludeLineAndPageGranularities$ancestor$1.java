package androidx.compose.ui.platform;

import defpackage.cf3;
import defpackage.le1;
import defpackage.ue3;
import defpackage.ux1;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 extends ww1 implements le1 {
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1();

    public AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1() {
        super(1);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    @Override // defpackage.le1
    public final Boolean invoke(ux1 ux1Var) {
        boolean z;
        ue3 ue3VarV = ux1Var.v();
        if (ue3VarV != null) {
            if (ue3VarV.h) {
                z = ue3VarV.c.c(cf3.D);
            }
        }
        return Boolean.valueOf(z);
    }
}
