package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class cg1 extends py {
    public final CharSequence s;
    public final TextPaint t;

    public cg1(CharSequence charSequence, TextPaint textPaint) {
        this.s = charSequence;
        this.t = textPaint;
    }

    @Override // defpackage.py
    public final int J(int i) {
        CharSequence charSequence = this.s;
        return this.t.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.py
    public final int M(int i) {
        CharSequence charSequence = this.s;
        return this.t.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
