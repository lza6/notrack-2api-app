package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ii4 implements Callable {
    public final /* synthetic */ q73 a;
    public final /* synthetic */ ji4 b;

    public ii4(ji4 ji4Var, q73 q73Var) {
        this.b = ji4Var;
        this.a = q73Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean boolValueOf;
        Cursor cursorM = ((WorkDatabase_Impl) this.b.a).m(this.a);
        try {
            if (cursorM.moveToFirst()) {
                boolValueOf = Boolean.valueOf(cursorM.getInt(0) != 0);
            } else {
                boolValueOf = Boolean.FALSE;
            }
            return boolValueOf;
        } finally {
            cursorM.close();
        }
    }

    public final void finalize() {
        this.a.l();
    }
}
