package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class p21 implements TextWatcher {
    public final EditText c;
    public o21 d;
    public boolean h = true;

    public p21(EditText editText) {
        this.c = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            y11 y11VarA = y11.a();
            if (editableText == null) {
                length = 0;
            } else {
                y11VarA.getClass();
                length = editableText.length();
            }
            y11VarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.c;
        if (!editText.isInEditMode() && this.h && y11.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = y11.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    y11.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            y11 y11VarA = y11.a();
            if (this.d == null) {
                this.d = new o21(editText);
            }
            y11VarA.h(this.d);
        }
    }
}
