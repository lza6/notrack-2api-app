package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q42 extends URLSpan {
    public final va2 c;
    public final String d;
    public final p42 h;

    public q42(va2 va2Var, String str, p42 p42Var) {
        super(str);
        this.c = va2Var;
        this.d = str;
        this.h = p42Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.h.e(view, this.d);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.c.a);
        textPaint.setColor(textPaint.linkColor);
    }
}
