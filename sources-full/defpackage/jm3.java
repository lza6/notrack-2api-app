package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import app.template.extension.BuildConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jm3 implements Appendable, CharSequence {
    public final ArrayDeque d = new ArrayDeque(8);
    public final StringBuilder c = new StringBuilder((CharSequence) BuildConfig.VERSION_NAME);

    public jm3() {
        b(0, BuildConfig.VERSION_NAME);
    }

    public static void c(jm3 jm3Var, Object obj, int i, int i2) {
        if (obj != null) {
            int length = jm3Var.c.length();
            if (i2 <= i || i < 0 || i2 > length) {
                return;
            }
            d(jm3Var, obj, i, i2);
        }
    }

    public static void d(jm3 jm3Var, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                jm3Var.d.push(new gm3(obj, i, i2, 33));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                d(jm3Var, obj2, i, i2);
            }
        }
    }

    public final void a(char c) {
        this.c.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.c.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.c;
        b(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.c;
        b(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    public final void b(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof hm3;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.d;
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        arrayDeque.push(new gm3(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spanned;
                    arrayDeque.push(new gm3(obj2, spannableStringBuilder.getSpanStart(obj2) + i, spannableStringBuilder.getSpanEnd(obj2) + i, spannableStringBuilder.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.c.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<gm3> listUnmodifiableList;
        int i3;
        StringBuilder sb = this.c;
        int length = sb.length();
        if (i2 <= i || i < 0 || i2 > length) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.d;
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    gm3 gm3Var = (gm3) itDescendingIterator.next();
                    int i4 = gm3Var.b;
                    if ((i4 >= i && i4 < i2) || (((i3 = gm3Var.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(gm3Var);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (gm3 gm3Var2 : listUnmodifiableList) {
            int iMax = Math.max(0, gm3Var2.b - i);
            spannableStringBuilder.setSpan(gm3Var2.a, iMax, Math.min(length2, (gm3Var2.c - gm3Var2.b) + iMax), gm3Var2.d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.c.toString();
    }
}
