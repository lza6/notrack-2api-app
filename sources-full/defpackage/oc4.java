package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class oc4 extends n92 {
    public final /* synthetic */ int m;

    public oc4(int i, Class cls, int i2, int i3, int i4) {
        this.m = i4;
        this.c = i;
        this.l = cls;
        this.h = i2;
        this.d = i3;
    }

    @Override // defpackage.n92
    public final Object c(View view) {
        switch (this.m) {
            case 0:
                return Boolean.valueOf(uc4.c(view));
            case 1:
                return uc4.a(view);
            default:
                return Boolean.valueOf(uc4.b(view));
        }
    }

    @Override // defpackage.n92
    public final void d(View view, Object obj) {
        switch (this.m) {
            case 0:
                uc4.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                uc4.e(view, (CharSequence) obj);
                break;
            default:
                uc4.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.n92
    public final boolean g(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
