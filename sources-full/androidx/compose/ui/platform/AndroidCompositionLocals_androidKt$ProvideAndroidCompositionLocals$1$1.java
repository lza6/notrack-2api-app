package androidx.compose.ui.platform;

import android.content.res.Configuration;
import defpackage.le1;
import defpackage.mi2;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 extends ww1 implements le1 {
    final /* synthetic */ mi2 $configuration$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(mi2 mi2Var) {
        super(1);
        this.$configuration$delegate = mi2Var;
    }

    @Override // defpackage.le1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return w84.a;
    }

    public final void invoke(Configuration configuration) {
        this.$configuration$delegate.setValue(new Configuration(configuration));
    }
}
