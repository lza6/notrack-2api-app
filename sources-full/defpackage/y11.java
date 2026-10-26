package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class y11 {
    public static final Object j = new Object();
    public static volatile y11 k;
    public final ReentrantReadWriteLock a;
    public final ul b;
    public volatile int c;
    public final Handler d;
    public final zt e;
    public final x11 f;
    public final qn0 g;
    public final int h;
    public final xs0 i;

    public y11(ub1 ub1Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        x11 x11Var = ub1Var.a;
        this.f = x11Var;
        int i = ub1Var.b;
        this.h = i;
        this.i = ub1Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ul(0);
        this.g = new qn0(4);
        zt ztVar = new zt(this);
        this.e = ztVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                x11Var.a(new u11(ztVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static y11 a() {
        y11 y11Var;
        synchronized (j) {
            try {
                y11Var = k;
                if (!(y11Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y11Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(int i, CharSequence charSequence) {
        if (!(c() == 1)) {
            u41.r("Not initialized yet");
            return 0;
        }
        p23.n(charSequence, "charSequence cannot be null");
        ci4 ci4Var = (ci4) this.e.b;
        ci4Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            i74[] i74VarArr = (i74[]) spanned.getSpans(i, i + 1, i74.class);
            if (i74VarArr.length > 0) {
                return spanned.getSpanStart(i74VarArr[0]);
            }
        }
        return ((j21) ci4Var.F(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), IntCompanionObject.MAX_VALUE, true, new j21(i))).d;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            u41.r("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            zt ztVar = this.e;
            y11 y11Var = (y11) ztVar.a;
            try {
                y11Var.f.a(new u11(ztVar));
            } catch (Throwable th) {
                y11Var.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new w11(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:38:0x005a, B:41:0x005f, B:43:0x0063, B:45:0x0070, B:52:0x008f, B:54:0x0099, B:56:0x009c, B:58:0x009f, B:60:0x00af, B:61:0x00b2), top: B:101:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00af A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:38:0x005a, B:41:0x005f, B:43:0x0063, B:45:0x0070, B:52:0x008f, B:54:0x0099, B:56:0x009c, B:58:0x009f, B:60:0x00af, B:61:0x00b2), top: B:101:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i4;
        int i5;
        i74[] i74VarArr;
        int spanStart;
        g94 g94Var = null;
        if (!(c() == 1)) {
            u41.r("Not initialized yet");
            return null;
        }
        if (i < 0) {
            u41.k("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            u41.k("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            u41.k("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            u41.k("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            u41.k("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        ci4 ci4Var = (ci4) this.e.b;
        ci4Var.getClass();
        boolean z2 = charSequence instanceof km3;
        if (z2) {
            ((km3) charSequence).a();
        }
        if (z2) {
            g94Var = new g94((Spannable) charSequence);
            if (g94Var != null) {
                for (i74 i74Var : i74VarArr) {
                    spanStart = g94Var.d.getSpanStart(i74Var);
                    int spanEnd = g94Var.d.getSpanEnd(i74Var);
                    if (spanStart != i2) {
                        g94Var.removeSpan(i74Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((km3) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    g94Var = new g94((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((km3) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, i74.class) <= i2) {
                g94Var = new g94();
                g94Var.c = false;
                g94Var.d = new SpannableString(charSequence);
            }
            if (g94Var != null && (i74VarArr = (i74[]) g94Var.d.getSpans(i, i2, i74.class)) != null && i74VarArr.length > 0) {
                while (i < r0) {
                    spanStart = g94Var.d.getSpanStart(i74Var);
                    int spanEnd2 = g94Var.d.getSpanEnd(i74Var);
                    if (spanStart != i2) {
                        g94Var.removeSpan(i74Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    g94 g94Var2 = (g94) ci4Var.F(charSequence2, i4, i5, IntCompanionObject.MAX_VALUE, z, new bi4(g94Var, (qn0) ci4Var.d));
                    if (g94Var2 != null) {
                        Spannable spannable = g94Var2.d;
                        if (z2) {
                            ((km3) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((km3) charSequence2).b();
                    throw th;
                }
            }
            ((km3) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((km3) charSequence2).b();
        throw th;
    }

    public final void h(v11 v11Var) {
        p23.n(v11Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new w11(Arrays.asList(v11Var), this.c, null));
            } else {
                this.b.add(v11Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        zt ztVar = this.e;
        ztVar.getClass();
        Bundle bundle = editorInfo.extras;
        be2 be2Var = (be2) ((ir3) ztVar.c).c;
        int iA = be2Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) be2Var.l).getInt(iA + be2Var.c) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
