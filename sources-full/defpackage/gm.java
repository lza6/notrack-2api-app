package defpackage;

import ai.notrack.app.R;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import io.noties.markwon.ext.tables.a;

/* JADX INFO: loaded from: classes.dex */
public final class gm implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;

    public /* synthetic */ gm(TextView textView, int i) {
        this.c = i;
        this.d = textView;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.c;
        TextView textView = this.d;
        switch (i) {
            case 0:
                vl0.g0(textView);
                view.removeOnAttachStateChangeListener(this);
                view.setTag(R.id.markwon_drawables_scheduler, null);
                break;
            default:
                CharSequence text = textView.getText();
                Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), a.class);
                if (spans != null && spans.length > 0) {
                    for (Object obj : spans) {
                        ((a) obj).r = null;
                    }
                }
                textView.removeOnAttachStateChangeListener(this);
                textView.setTag(R.id.markwon_tables_scheduler, null);
                break;
        }
    }
}
