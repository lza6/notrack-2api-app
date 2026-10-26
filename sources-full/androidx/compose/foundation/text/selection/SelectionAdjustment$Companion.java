package androidx.compose.foundation.text.selection;

import defpackage.fd3;
import defpackage.fe3;
import defpackage.gb2;
import defpackage.gd3;

/* JADX INFO: loaded from: classes.dex */
public final class SelectionAdjustment$Companion {
    private static final gd3 None = new gd3(0);
    private static final gd3 Character = new gd3(1);
    private static final gd3 Word = new gd3(2);
    private static final gd3 Paragraph = new gd3(3);
    private static final gd3 CharacterWithWordAccelerate = new gd3(4);

    public static fd3 a(fe3 fe3Var) {
        return gb2.C(None.a(fe3Var), fe3Var);
    }

    public static gd3 getCharacter() {
        return Character;
    }

    public static gd3 getCharacterWithWordAccelerate() {
        return CharacterWithWordAccelerate;
    }

    public static gd3 getNone() {
        return None;
    }

    public static gd3 getParagraph() {
        return Paragraph;
    }

    public static gd3 getWord() {
        return Word;
    }
}
