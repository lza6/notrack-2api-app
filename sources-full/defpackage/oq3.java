package defpackage;

import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq3 {
    public static final yw2 a = new yw2(z21.c, null);

    public static final c b(c cVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return cVar.then(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6));
    }
}
