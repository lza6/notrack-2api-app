package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import defpackage.h43;
import defpackage.je1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;
    private ActionMode actionMode;
    private final View view;
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this), null, null, null, null, null, null, 126, null);
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(h43 h43Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4) {
        showMenu(h43Var, je1Var, je1Var2, je1Var3, je1Var4, null);
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(h43 h43Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, je1 je1Var5) {
        this.textActionModeCallback.setRect(h43Var);
        this.textActionModeCallback.setOnCopyRequested(je1Var);
        this.textActionModeCallback.setOnCutRequested(je1Var3);
        this.textActionModeCallback.setOnPasteRequested(je1Var2);
        this.textActionModeCallback.setOnSelectAllRequested(je1Var4);
        this.textActionModeCallback.setOnAutofillRequested(je1Var5);
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        } else {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        }
    }
}
