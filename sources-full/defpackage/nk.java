package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class nk extends mk {
    @Override // defpackage.mk, defpackage.ok
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.ok
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
