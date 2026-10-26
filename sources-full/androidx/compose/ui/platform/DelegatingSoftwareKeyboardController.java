package androidx.compose.ui.platform;

import defpackage.ly3;
import defpackage.py3;

/* JADX INFO: loaded from: classes.dex */
public final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {
    public static final int $stable = 0;
    private final ly3 textInputService;

    public DelegatingSoftwareKeyboardController(ly3 ly3Var) {
        this.textInputService = ly3Var;
    }

    public final ly3 getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public void hide() {
        this.textInputService.a.f();
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public void show() {
        ly3 ly3Var = this.textInputService;
        if (((py3) ly3Var.b.get()) != null) {
            ly3Var.a.d();
        }
    }
}
