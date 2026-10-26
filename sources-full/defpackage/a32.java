package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import app.template.extension.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a32 implements PlatformTextInputMethodRequest {
    public final View a;
    public final fp1 b;
    public z22 e;
    public xw3 f;
    public ViewConfiguration g;
    public Rect l;
    public final u22 m;
    public le1 c = fl1.y;
    public le1 d = fl1.z;
    public ey3 h = new ey3(BuildConfig.VERSION_NAME, jz3.b, 4);
    public in1 i = in1.g;
    public final ArrayList j = new ArrayList();
    public final ly1 k = yo4.H(q22.d, new j(21, this));

    public a32(View view, ob obVar, fp1 fp1Var) {
        this.a = view;
        this.b = fp1Var;
        this.m = new u22(obVar, fp1Var);
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        ey3 ey3Var = this.h;
        gm4.R(editorInfo, ey3Var.a.d, ey3Var.b, this.i);
        v22 v22Var = w22.a;
        if (y11.d()) {
            y11.a().i(editorInfo);
        }
        f43 f43Var = new f43(this.h, new sz0(this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(f43Var));
        return f43Var;
    }
}
