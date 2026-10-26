package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class zo1 extends InputConnectionWrapper {
    public final /* synthetic */ bp1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo1(InputConnection inputConnection, bp1 bp1Var) {
        super(inputConnection, false);
        this.a = bp1Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        sz0 sz0Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            sz0Var = new sz0(new cp1(inputContentInfo));
        }
        if (this.a.c(sz0Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
