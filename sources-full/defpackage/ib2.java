package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.LruCache;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class ib2 extends ClickableSpan {
    public final lb2 c;
    public final float d;
    public final int h;

    public ib2(lb2 lb2Var, float f, int i) {
        this.c = lb2Var;
        this.d = f;
        this.h = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Object i63Var;
        lb2 lb2Var = this.c;
        int i = this.h;
        view.getClass();
        Context context = view.getContext();
        try {
            u43 u43Var = nb2.a;
            String str = lb2Var.b;
            LruCache lruCache = jb2.a;
            i63Var = JLatexMathDrawable.builder(nb2.f(str, hf0.b(i) > 0.5d)).textSize(this.d * 1.1f).color(i).align(0).padding(0).build();
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        if (i63Var instanceof i63) {
            i63Var = null;
        }
        JLatexMathDrawable jLatexMathDrawable = (JLatexMathDrawable) i63Var;
        if (jLatexMathDrawable == null) {
            return;
        }
        int i2 = (int) (16.0f * context.getResources().getDisplayMetrics().density);
        boolean z = hf0.b(i) > 0.5d;
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(jLatexMathDrawable);
        imageView.setPadding(i2, i2, i2, i2);
        imageView.setContentDescription(lb2Var.a);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.addView(imageView);
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(horizontalScrollView);
        scrollView.setBackgroundColor(z ? -15328743 : -1);
        new AlertDialog.Builder(context).setView(scrollView).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
    }
}
