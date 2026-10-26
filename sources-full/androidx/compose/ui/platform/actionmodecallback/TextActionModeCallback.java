package androidx.compose.ui.platform.actionmodecallback;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.h43;
import defpackage.je1;
import defpackage.ms0;
import defpackage.u41;

/* JADX INFO: loaded from: classes.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final je1 onActionModeDestroy;
    private je1 onAutofillRequested;
    private je1 onCopyRequested;
    private je1 onCutRequested;
    private je1 onPasteRequested;
    private je1 onSelectAllRequested;
    private h43 rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public TextActionModeCallback(je1 je1Var, h43 h43Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, je1 je1Var5, je1 je1Var6) {
        this.onActionModeDestroy = je1Var;
        this.rect = h43Var;
        this.onCopyRequested = je1Var2;
        this.onPasteRequested = je1Var3;
        this.onCutRequested = je1Var4;
        this.onSelectAllRequested = je1Var5;
        this.onAutofillRequested = je1Var6;
    }

    public /* synthetic */ TextActionModeCallback(je1 je1Var, h43 h43Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, je1 je1Var5, je1 je1Var6, int i, ms0 ms0Var) {
        this((i & 1) != 0 ? null : je1Var, (i & 2) != 0 ? h43.e : h43Var, (i & 4) != 0 ? null : je1Var2, (i & 8) != 0 ? null : je1Var3, (i & 16) != 0 ? null : je1Var4, (i & 32) != 0 ? null : je1Var5, (i & 64) != 0 ? null : je1Var6);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, je1 je1Var) {
        if (je1Var != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else {
            if (je1Var != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui_release(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final je1 getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final je1 getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final je1 getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final je1 getOnCutRequested() {
        return this.onCutRequested;
    }

    public final je1 getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final je1 getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final h43 getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            je1 je1Var = this.onCopyRequested;
            if (je1Var != null) {
                je1Var.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            je1 je1Var2 = this.onPasteRequested;
            if (je1Var2 != null) {
                je1Var2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            je1 je1Var3 = this.onCutRequested;
            if (je1Var3 != null) {
                je1Var3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            je1 je1Var4 = this.onSelectAllRequested;
            if (je1Var4 != null) {
                je1Var4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            je1 je1Var5 = this.onAutofillRequested;
            if (je1Var5 != null) {
                je1Var5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            u41.k("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            u41.k("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
        }
        if (this.onAutofillRequested == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        addMenuItem$ui_release(menu, MenuItemOption.Autofill);
        return true;
    }

    public final void onDestroyActionMode() {
        je1 je1Var = this.onActionModeDestroy;
        if (je1Var != null) {
            je1Var.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnAutofillRequested(je1 je1Var) {
        this.onAutofillRequested = je1Var;
    }

    public final void setOnCopyRequested(je1 je1Var) {
        this.onCopyRequested = je1Var;
    }

    public final void setOnCutRequested(je1 je1Var) {
        this.onCutRequested = je1Var;
    }

    public final void setOnPasteRequested(je1 je1Var) {
        this.onPasteRequested = je1Var;
    }

    public final void setOnSelectAllRequested(je1 je1Var) {
        this.onSelectAllRequested = je1Var;
    }

    public final void setRect(h43 h43Var) {
        this.rect = h43Var;
    }

    public final void updateMenuItems$ui_release(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }
}
