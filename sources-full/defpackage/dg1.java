package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class dg1 extends py {
    public final BreakIterator s;

    public dg1(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.s = characterInstance;
    }

    @Override // defpackage.py
    public final int J(int i) {
        return this.s.following(i);
    }

    @Override // defpackage.py
    public final int M(int i) {
        return this.s.preceding(i);
    }
}
