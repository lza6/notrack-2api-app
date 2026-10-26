package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class up3 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ up3() {
    }

    public up3(qc2 qc2Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = qc2Var;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zBooleanValue;
        switch (this.a) {
            case 0:
                Object obj = this.b;
                Method method = (Method) this.c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    m51.n(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((qc2) this.c).h(menuItem));
        }
    }
}
