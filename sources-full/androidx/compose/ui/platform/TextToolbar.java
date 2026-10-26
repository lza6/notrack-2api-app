package androidx.compose.ui.platform;

import defpackage.h43;
import defpackage.j93;
import defpackage.je1;

/* JADX INFO: loaded from: classes.dex */
public interface TextToolbar {

    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(TextToolbar textToolbar, h43 h43Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, je1 je1Var5) {
            TextToolbar.super.showMenu(h43Var, je1Var, je1Var2, je1Var3, je1Var4, je1Var5);
        }
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, h43 h43Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, int i, Object obj) {
        if (obj != null) {
            j93.k("Super calls with default arguments not supported in this target, function: showMenu");
            return;
        }
        if ((i & 2) != 0) {
            je1Var = null;
        }
        if ((i & 4) != 0) {
            je1Var2 = null;
        }
        if ((i & 8) != 0) {
            je1Var3 = null;
        }
        if ((i & 16) != 0) {
            je1Var4 = null;
        }
        textToolbar.showMenu(h43Var, je1Var, je1Var2, je1Var3, je1Var4);
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, h43 h43Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, je1 je1Var5, int i, Object obj) {
        if (obj != null) {
            j93.k("Super calls with default arguments not supported in this target, function: showMenu");
            return;
        }
        if ((i & 2) != 0) {
            je1Var = null;
        }
        if ((i & 4) != 0) {
            je1Var2 = null;
        }
        if ((i & 8) != 0) {
            je1Var3 = null;
        }
        if ((i & 16) != 0) {
            je1Var4 = null;
        }
        if ((i & 32) != 0) {
            je1Var5 = null;
        }
        textToolbar.showMenu(h43Var, je1Var, je1Var2, je1Var3, je1Var4, je1Var5);
    }

    TextToolbarStatus getStatus();

    void hide();

    void showMenu(h43 h43Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4);

    default void showMenu(h43 h43Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, je1 je1Var5) {
        showMenu(h43Var, je1Var, je1Var2, je1Var3, je1Var4);
    }
}
