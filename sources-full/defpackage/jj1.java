package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class jj1 extends i {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final ij1 a = new ij1();
    public boolean c = false;
    public kn4 d = new kn4(2);

    public jj1(Pattern pattern) {
        this.b = pattern;
    }

    @Override // defpackage.i
    public final void a(CharSequence charSequence) {
        kn4 kn4Var = this.d;
        StringBuilder sb = (StringBuilder) kn4Var.c;
        if (kn4Var.b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        kn4Var.b++;
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.c = true;
    }

    @Override // defpackage.i
    public final void d() {
        this.a.g = ((StringBuilder) this.d.c).toString();
        this.d = null;
    }

    @Override // defpackage.i
    public final kv e() {
        return this.a;
    }

    @Override // defpackage.i
    public final lv h(ix0 ix0Var) {
        if (this.c) {
            return null;
        }
        if (ix0Var.h && this.b == null) {
            return null;
        }
        return lv.a(ix0Var.b);
    }
}
