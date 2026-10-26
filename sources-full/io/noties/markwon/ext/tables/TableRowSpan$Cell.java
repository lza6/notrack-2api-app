package io.noties.markwon.ext.tables;

/* JADX INFO: loaded from: classes.dex */
public class TableRowSpan$Cell {
    final int alignment;
    final CharSequence text;

    public TableRowSpan$Cell(int i, CharSequence charSequence) {
        this.alignment = i;
        this.text = charSequence;
    }

    public int alignment() {
        return this.alignment;
    }

    public CharSequence text() {
        return this.text;
    }

    public String toString() {
        return "Cell{alignment=" + this.alignment + ", text=" + ((Object) this.text) + '}';
    }
}
