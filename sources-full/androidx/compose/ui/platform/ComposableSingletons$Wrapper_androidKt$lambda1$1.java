package androidx.compose.ui.platform;

import defpackage.ck0;
import defpackage.kk0;
import defpackage.ne1;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: renamed from: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$Wrapper_androidKt$lambda1$1 extends ww1 implements ne1 {
    public static final ComposableSingletons$Wrapper_androidKt$lambda1$1 INSTANCE = new ComposableSingletons$Wrapper_androidKt$lambda1$1();

    public ComposableSingletons$Wrapper_androidKt$lambda1$1() {
        super(2);
    }

    @Override // defpackage.ne1
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            return;
        }
        kk0Var.V();
    }
}
