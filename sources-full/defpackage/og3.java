package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class og3 extends CharacterStyle implements UpdateAppearance {
    public final ng3 c;
    public final float d;
    public final ft2 h = cl3.d(new bi3(9205357640488583168L));
    public final fv0 l = cl3.b(new i43(5, this));

    public og3(ng3 ng3Var, float f) {
        this.c = ng3Var;
        this.d = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        jr1.J(textPaint, this.d);
        textPaint.setShader((Shader) this.l.getValue());
    }
}
