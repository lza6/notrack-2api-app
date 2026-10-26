package androidx.compose.ui.platform;

import defpackage.cf3;
import defpackage.ff3;
import defpackage.je1;
import defpackage.ne1;
import defpackage.ue3;
import defpackage.ww1;
import defpackage.ze3;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1 extends ww1 implements ne1 {
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1();

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements je1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.je1
        public final Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ww1 implements je1 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.je1
        public final Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1() {
        super(2);
    }

    @Override // defpackage.ne1
    public final Integer invoke(ze3 ze3Var, ze3 ze3Var2) {
        ue3 ue3Var = ze3Var.d;
        ff3 ff3Var = cf3.r;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        Object objG = ue3Var.c.g(ff3Var);
        if (objG == null) {
            objG = anonymousClass1.invoke();
        }
        float fFloatValue = ((Number) objG).floatValue();
        ue3 ue3Var2 = ze3Var2.d;
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        Object objG2 = ue3Var2.c.g(ff3Var);
        if (objG2 == null) {
            objG2 = anonymousClass2.invoke();
        }
        return Integer.valueOf(Float.compare(fFloatValue, ((Number) objG2).floatValue()));
    }
}
