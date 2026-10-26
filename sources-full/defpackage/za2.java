package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class za2 {
    public final Matcher a;
    public final CharSequence b;
    public ya2 c;

    public za2(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
    }

    public final List a() {
        if (this.c == null) {
            this.c = new ya2(0, this);
        }
        ya2 ya2Var = this.c;
        ya2Var.getClass();
        return ya2Var;
    }

    public final lq1 b() {
        Matcher matcher = this.a;
        return py.X(matcher.start(), matcher.end());
    }

    public final String c() {
        String strGroup = this.a.group();
        strGroup.getClass();
        return strGroup;
    }

    public final za2 d() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return kr1.d(matcher2, iEnd, charSequence);
    }
}
