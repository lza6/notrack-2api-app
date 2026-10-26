package defpackage;

import java.text.CharacterIterator;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class n30 implements CharacterIterator {
    public final CharSequence c;
    public final int d;
    public int h = 0;

    public n30(int i, CharSequence charSequence) {
        this.c = charSequence;
        this.d = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.h;
        return i == this.d ? CharCompanionObject.MAX_VALUE : this.c.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.h = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.d;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.h;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.d;
        if (i == 0) {
            this.h = i;
            return CharCompanionObject.MAX_VALUE;
        }
        int i2 = i - 1;
        this.h = i2;
        return this.c.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.h + 1;
        this.h = i;
        int i2 = this.d;
        if (i < i2) {
            return this.c.charAt(i);
        }
        this.h = i2;
        return CharCompanionObject.MAX_VALUE;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.h;
        if (i <= 0) {
            return CharCompanionObject.MAX_VALUE;
        }
        int i2 = i - 1;
        this.h = i2;
        return this.c.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.d || i < 0) {
            u41.k("invalid position");
            return (char) 0;
        }
        this.h = i;
        return current();
    }
}
