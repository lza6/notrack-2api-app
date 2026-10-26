package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class hc2 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public fc2 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public mc2 v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public hc2(Context context) {
        boolean zS;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = ad4.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zS = og.s(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zS = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zS) {
                z = true;
            }
        }
        this.d = z;
    }

    public final mc2 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            u41.k("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        mc2 mc2Var = new mc2(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((mc2) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, mc2Var);
                p(true);
                return mc2Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, mc2Var);
        p(true);
        return mc2Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            mc2 mc2VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            mc2VarA.setIcon(resolveInfo.loadIcon(packageManager));
            mc2VarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = mc2VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        mc2 mc2VarA = a(i, i2, i3, charSequence);
        ep3 ep3Var = new ep3(this.a, this, mc2VarA);
        mc2VarA.o = ep3Var;
        ep3Var.setHeaderTitle(mc2VarA.e);
        return ep3Var;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(nd2 nd2Var, Context context) {
        this.u.add(new WeakReference(nd2Var));
        nd2Var.h(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            nd2 nd2Var = (nd2) weakReference.get();
            if (nd2Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                nd2Var.b(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        mc2 mc2Var = this.v;
        if (mc2Var != null) {
            d(mc2Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(mc2 mc2Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zC = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == mc2Var) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                nd2 nd2Var = (nd2) weakReference.get();
                if (nd2Var != null) {
                    zC = nd2Var.c(mc2Var);
                    if (zC) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zC) {
                this.v = null;
            }
        }
        return zC;
    }

    public boolean e(hc2 hc2Var, MenuItem menuItem) {
        fc2 fc2Var = this.e;
        return fc2Var != null && fc2Var.e(hc2Var, menuItem);
    }

    public boolean f(mc2 mc2Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zE = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            nd2 nd2Var = (nd2) weakReference.get();
            if (nd2Var != null) {
                zE = nd2Var.e(mc2Var);
                if (zE) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zE) {
            this.v = mc2Var;
        }
        return zE;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mc2 mc2Var = (mc2) arrayList.get(i2);
            if (mc2Var.a == i) {
                return mc2Var;
            }
            if (mc2Var.hasSubMenu() && (menuItemFindItem = mc2Var.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final mc2 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (mc2) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            mc2 mc2Var = (mc2) arrayList.get(i2);
            char c = zN ? mc2Var.j : mc2Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return mc2Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                mc2 mc2Var = (mc2) arrayList.get(i2);
                if (mc2Var.hasSubMenu()) {
                    mc2Var.o.h(list, i, keyEvent);
                }
                char c = zN ? mc2Var.j : mc2Var.h;
                if ((modifiers & 69647) == ((zN ? mc2Var.k : mc2Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && mc2Var.isEnabled()) {
                        list.add(mc2Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((mc2) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zJ = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                nd2 nd2Var = (nd2) weakReference.get();
                if (nd2Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zJ |= nd2Var.j();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zJ) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    mc2 mc2Var = (mc2) arrayListL.get(i);
                    if ((mc2Var.x & 32) == 32) {
                        arrayList.add(mc2Var);
                    } else {
                        arrayList2.add(mc2Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public hc2 k() {
        return this;
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            mc2 mc2Var = (mc2) arrayList2.get(i);
            if (mc2Var.isVisible()) {
                arrayList.add(mc2Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            nd2 nd2Var = (nd2) weakReference.get();
            if (nd2Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                nd2Var.f();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        mc2 mc2VarG = g(i, keyEvent);
        boolean zQ = mc2VarG != null ? q(mc2VarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, nd2 nd2Var, int i) {
        nc2 nc2Var;
        boolean zExpandActionView;
        nc2 nc2Var2;
        boolean z;
        ep3 ep3Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        nd2 nd2Var2;
        mc2 mc2Var = (mc2) menuItem;
        boolean zI = false;
        if (mc2Var == null || !mc2Var.isEnabled()) {
            return false;
        }
        hc2 hc2Var = mc2Var.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = mc2Var.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(mc2Var)) && !hc2Var.e(hc2Var, mc2Var)) {
            Intent intent = mc2Var.g;
            if (intent != null) {
                try {
                    hc2Var.a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    nc2Var = mc2Var.A;
                    if (nc2Var == null) {
                    }
                    zExpandActionView = false;
                    nc2Var2 = mc2Var.A;
                    if (nc2Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (mc2Var.e()) {
                        zExpandActionView |= mc2Var.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (mc2Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!mc2Var.hasSubMenu()) {
                            ep3 ep3Var2 = new ep3(this.a, this, mc2Var);
                            mc2Var.o = ep3Var2;
                            ep3Var2.setHeaderTitle(mc2Var.e);
                        }
                        ep3Var = mc2Var.o;
                        if (z) {
                            nc2Var2.b.onPrepareSubMenu(ep3Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (nd2Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                nd2Var2 = (nd2) weakReference.get();
                                if (nd2Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zI) {
                                    zI = nd2Var2.i(ep3Var);
                                }
                            }
                        }
                        zExpandActionView |= zI;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!mc2Var.hasSubMenu()) {
                            ep3 ep3Var3 = new ep3(this.a, this, mc2Var);
                            mc2Var.o = ep3Var3;
                            ep3Var3.setHeaderTitle(mc2Var.e);
                        }
                        ep3Var = mc2Var.o;
                        if (z) {
                            nc2Var2.b.onPrepareSubMenu(ep3Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zI = nd2Var != null ? nd2Var.i(ep3Var) : false;
                            while (r8.hasNext()) {
                                nd2Var2 = (nd2) weakReference.get();
                                if (nd2Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zI) {
                                    zI = nd2Var2.i(ep3Var);
                                }
                            }
                        }
                        zExpandActionView |= zI;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                nc2Var = mc2Var.A;
                if (nc2Var == null && nc2Var.b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        nc2Var2 = mc2Var.A;
        if (nc2Var2 == null && nc2Var2.b.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (mc2Var.e()) {
            zExpandActionView |= mc2Var.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (mc2Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!mc2Var.hasSubMenu()) {
                ep3 ep3Var4 = new ep3(this.a, this, mc2Var);
                mc2Var.o = ep3Var4;
                ep3Var4.setHeaderTitle(mc2Var.e);
            }
            ep3Var = mc2Var.o;
            if (z) {
                nc2Var2.b.onPrepareSubMenu(ep3Var);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (nd2Var != null) {
                }
                while (r8.hasNext()) {
                    nd2Var2 = (nd2) weakReference.get();
                    if (nd2Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zI) {
                        zI = nd2Var2.i(ep3Var);
                    }
                }
            }
            zExpandActionView |= zI;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(nd2 nd2Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            nd2 nd2Var2 = (nd2) weakReference.get();
            if (nd2Var2 == null || nd2Var2 == nd2Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((mc2) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((mc2) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((mc2) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((ep3) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mc2 mc2Var = (mc2) arrayList.get(i2);
            if (mc2Var.b == i) {
                mc2Var.x = (mc2Var.x & (-5)) | (z2 ? 4 : 0);
                mc2Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mc2 mc2Var = (mc2) arrayList.get(i2);
            if (mc2Var.b == i) {
                mc2Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            mc2 mc2Var = (mc2) arrayList.get(i2);
            if (mc2Var.b == i) {
                int i3 = mc2Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                mc2Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((ep3) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }
}
