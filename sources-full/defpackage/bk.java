package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;
import notrack.ai.data.promo.OwnCard;
import notrack.ai.data.promo.OwnConfig;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class bk {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public /* synthetic */ bk() {
    }

    public bk(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            u41.k(ud2.l(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.e = bArr;
        this.c = 0;
        this.b = i;
    }

    public bk(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("promo_own", 0);
        sharedPreferences.getClass();
        this.d = sharedPreferences;
    }

    public bk(gk gkVar, int i, int i2, WeakReference weakReference) {
        this.e = gkVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }

    public bk(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            qo1.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            qo1.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new n30(i, charSequence));
    }

    public static int F(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int G(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static boolean e(OwnCard ownCard, int i, boolean z) {
        if (i < ownCard.getMinPairs()) {
            return false;
        }
        return !ownCard.getNeedsAdSeen() || z;
    }

    public void A(int i, int i2) {
        C((i << 3) | i2);
    }

    public void B(int i, int i2) {
        C(i << 3);
        C(i2);
    }

    public void C(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.c;
        int i3 = i & (-128);
        byte[] bArr = (byte[]) this.e;
        try {
            if (i3 == 0) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) i;
                this.c = i4;
                return;
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i | Uuid.SIZE_BITS);
            int i6 = i >>> 7;
            try {
                if ((i6 & (-128)) == 0) {
                    int i7 = i2 + 2;
                    bArr[i5] = (byte) i6;
                    this.c = i7;
                    return;
                }
                int i8 = i2 + 2;
                try {
                    bArr[i5] = (byte) (i6 | Uuid.SIZE_BITS);
                    int i9 = i >>> 14;
                    if ((i9 & (-128)) == 0) {
                        int i10 = i2 + 3;
                        bArr[i8] = (byte) i9;
                        this.c = i10;
                        return;
                    }
                    int i11 = i2 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | Uuid.SIZE_BITS);
                        int i12 = i >>> 21;
                        if ((i12 & (-128)) == 0) {
                            int i13 = i2 + 4;
                            bArr[i11] = (byte) i12;
                            this.c = i13;
                            return;
                        } else {
                            i8 = i2 + 4;
                            bArr[i11] = (byte) (i12 | Uuid.SIZE_BITS);
                            int i14 = i2 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.c = i14;
                            return;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i11;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i8;
                }
                throw new ee0(i3, this.b, 1, indexOutOfBoundsException);
            } catch (IndexOutOfBoundsException e3) {
                i3 = i;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    public void D(long j, int i) throws ee0 {
        C(i << 3);
        E(j);
    }

    public void E(long j) throws ee0 {
        long j2 = j & (-128);
        int i = this.c;
        byte[] bArr = (byte[]) this.e;
        try {
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.c = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | Uuid.SIZE_BITS);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.c = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | Uuid.SIZE_BITS);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.c = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | Uuid.SIZE_BITS);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.c = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | Uuid.SIZE_BITS);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.c = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | Uuid.SIZE_BITS);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.c = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | Uuid.SIZE_BITS);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.c = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | Uuid.SIZE_BITS);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.c = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | Uuid.SIZE_BITS);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.c = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | Uuid.SIZE_BITS);
                bArr[i + 9] = (byte) (j >>> 63);
                this.c = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new ee0(i, this.b, 1, e);
        }
    }

    public boolean a(OwnConfig ownConfig) {
        ownConfig.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long busyNoteCooldownMin = ((long) ownConfig.getBusyNoteCooldownMin()) * 60000;
        ArrayList arrayListB = b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            if (jCurrentTimeMillis - ((Number) obj).longValue() < 86400000) {
                arrayList.add(obj);
            }
        }
        return (ownConfig.getBusyNoteMaxPerDay() <= 0 || arrayList.size() < ownConfig.getBusyNoteMaxPerDay()) && (arrayList.isEmpty() || jCurrentTimeMillis - ((Number) ke0.G0(arrayList)).longValue() >= busyNoteCooldownMin);
    }

    public ArrayList b() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Set<String> set = f31.c;
        Set<String> stringSet = sharedPreferences.getStringSet("busy_note_log", set);
        if (stringSet != null) {
            set = stringSet;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            str.getClass();
            Long lT0 = to3.t0(str);
            if (lT0 != null) {
                arrayList.add(lT0);
            }
        }
        return arrayList;
    }

    public void c(int i) {
        new Handler(Looper.getMainLooper()).post(new z6(this, i));
    }

    public void d(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        qo1.a("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + ']');
    }

    public ArrayList f() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Set<String> set = f31.c;
        Set<String> stringSet = sharedPreferences.getStringSet("fast_log", set);
        if (stringSet != null) {
            set = stringSet;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            str.getClass();
            Long lT0 = to3.t0(str);
            if (lT0 != null) {
                arrayList.add(lT0);
            }
        }
        return arrayList;
    }

    public int g() {
        ze1 ze1Var = (ze1) this.e;
        String str = (String) this.d;
        if (ze1Var == null) {
            return str.length();
        }
        return (ze1Var.b - ze1Var.a()) + (str.length() - (this.c - this.b));
    }

    public boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!y11.d()) {
                    return false;
                }
                y11 y11VarA = y11.a();
                if (y11VarA.c() != 1 || y11VarA.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean i(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return Options$Companion.isPunctuation$ui_text_release(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean j(int i) {
        d(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (l(i) && l(i - 1) && l(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(k(i) || k(i + 1));
    }

    public boolean k(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (kr1.n(unicodeBlockOf, unicodeBlock) && kr1.n(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return kr1.n(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && kr1.n(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean l(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!y11.d()) {
                return false;
            }
            y11 y11VarA = y11.a();
            if (y11VarA.c() != 1 || y11VarA.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean m(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return Options$Companion.isPunctuation$ui_text_release(Character.codePointAt((CharSequence) this.d, i));
    }

    public void n() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayListB = b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListB.get(i2);
            i2++;
            if (jCurrentTimeMillis - ((Number) obj).longValue() < 86400000) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListI0 = ke0.I0(arrayList, Long.valueOf(jCurrentTimeMillis));
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.d).edit();
        ArrayList arrayList2 = new ArrayList(le0.q0(arrayListI0, 10));
        int size2 = arrayListI0.size();
        while (i < size2) {
            Object obj2 = arrayListI0.get(i);
            i++;
            arrayList2.add(String.valueOf(((Number) obj2).longValue()));
        }
        editorEdit.putStringSet("busy_note_log", ke0.S0(arrayList2)).apply();
    }

    public int o(int i) {
        d(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (l(iFollowing + (-1)) && l(iFollowing) && !k(iFollowing)) ? o(iFollowing) : iFollowing;
    }

    public void p(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = fk.a(typeface, i, (this.c & 2) != 0);
        }
        gk gkVar = (gk) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (gkVar.m) {
            gkVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = gkVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new ck(i2, 0, textView, typeface));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public int q(int i) {
        d(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (l(iPreceding) && h(iPreceding) && !k(iPreceding)) ? q(iPreceding) : iPreceding;
    }

    public void r(int i, int i2, String str) {
        if (i > i2) {
            qo1.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            qo1.a("start must be non-negative, but was " + i);
        }
        ze1 ze1Var = (ze1) this.e;
        if (ze1Var == null) {
            int iMax = Math.max(KotlinVersion.MAX_COMPONENT_VALUE, str.length() + Uuid.SIZE_BITS);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            ze1 ze1Var2 = new ze1(0);
            ze1Var2.b = iMax;
            ze1Var2.c = cArr;
            ze1Var2.d = length;
            ze1Var2.e = i4;
            this.e = ze1Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > ze1Var.b - ze1Var.a()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            r(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > ze1Var.a()) {
            int iA = length2 - ze1Var.a();
            int i9 = ze1Var.b;
            do {
                i9 *= 2;
            } while (i9 - ze1Var.b < iA);
            char[] cArr2 = new char[i9];
            vl.k0(ze1Var.c, cArr2, 0, 0, ze1Var.d);
            int i10 = ze1Var.b;
            int i11 = ze1Var.e;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            vl.k0(ze1Var.c, cArr2, i13, i11, i12 + i11);
            ze1Var.c = cArr2;
            ze1Var.b = i9;
            ze1Var.e = i13;
        }
        int i14 = ze1Var.d;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = ze1Var.c;
            vl.k0(cArr3, cArr3, ze1Var.e - i15, i8, i14);
            ze1Var.d = i7;
            ze1Var.e -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = ze1Var.a() + i7;
            int iA3 = ze1Var.a() + i8;
            int i16 = ze1Var.e;
            char[] cArr4 = ze1Var.c;
            vl.k0(cArr4, cArr4, ze1Var.d, i16, iA2);
            ze1Var.d += iA2 - i16;
            ze1Var.e = iA3;
        } else {
            ze1Var.e = ze1Var.a() + i8;
            ze1Var.d = i7;
        }
        str.getChars(0, str.length(), ze1Var.c, ze1Var.d);
        ze1Var.d = str.length() + ze1Var.d;
    }

    public void s(byte b) throws ee0 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.c;
        try {
            int i2 = i + 1;
            try {
                ((byte[]) this.e)[i] = b;
                this.c = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new ee0(i, this.b, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    public void t(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, (byte[]) this.e, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ee0(this.c, this.b, i2, e);
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                ze1 ze1Var = (ze1) this.e;
                String str = (String) this.d;
                if (ze1Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append(ze1Var.c, 0, ze1Var.d);
                char[] cArr = ze1Var.c;
                int i = ze1Var.e;
                sb.append(cArr, i, ze1Var.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i, int i2) throws ee0 {
        C((i << 3) | 5);
        v(i2);
    }

    public void v(int i) throws ee0 {
        int i2 = this.c;
        try {
            byte[] bArr = (byte[]) this.e;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new ee0(i2, this.b, 4, e);
        }
    }

    public void w(long j, int i) throws ee0 {
        C((i << 3) | 1);
        x(j);
    }

    public void x(long j) throws ee0 {
        int i = this.c;
        try {
            byte[] bArr = (byte[]) this.e;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new ee0(i, this.b, 8, e);
        }
    }

    public void y(int i, int i2) throws ee0 {
        C(i << 3);
        z(i2);
    }

    public void z(int i) throws ee0 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            C(i);
            return;
        }
        int i2 = this.c;
        try {
            byte[] bArr = (byte[]) this.e;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | Uuid.SIZE_BITS);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | Uuid.SIZE_BITS);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | Uuid.SIZE_BITS);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | Uuid.SIZE_BITS);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | Uuid.SIZE_BITS);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.c = i2;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i7;
                        throw new ee0(i2, this.b, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                i2 = i3;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }
}
