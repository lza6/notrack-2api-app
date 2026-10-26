package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ur0 {
    public Integer a;

    public final Integer a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.a = Integer.valueOf(unicodeChar & IntCompanionObject.MAX_VALUE);
            return null;
        }
        Integer num = this.a;
        if (num == null) {
            return Integer.valueOf(unicodeChar);
        }
        this.a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(unicodeChar) : num2;
    }
}
