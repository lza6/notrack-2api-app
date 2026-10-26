package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class j00 implements Runnable {
    public final /* synthetic */ int c = 1;

    public /* synthetic */ j00() {
    }

    public j00(sk3 sk3Var, int i) {
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                return;
            default:
                try {
                    int i = z44.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (y11.d()) {
                        y11.a().e();
                        break;
                    }
                    return;
                } finally {
                    int i2 = z44.a;
                    Trace.endSection();
                }
        }
    }
}
