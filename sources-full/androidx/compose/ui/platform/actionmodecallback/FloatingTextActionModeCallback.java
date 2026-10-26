package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import defpackage.h43;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {
    public static final int $stable = 8;
    private final TextActionModeCallback callback;

    public FloatingTextActionModeCallback(TextActionModeCallback textActionModeCallback) {
        this.callback = textActionModeCallback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.callback.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.callback.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.callback.onDestroyActionMode();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        h43 rect2 = this.callback.getRect();
        if (rect != null) {
            rect.set((int) rect2.a, (int) rect2.b, (int) rect2.c, (int) rect2.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.callback.onPrepareActionMode(actionMode, menu);
    }
}
