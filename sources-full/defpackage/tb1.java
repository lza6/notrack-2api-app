package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class tb1 implements x11 {
    public final Context a;
    public final sb1 b;
    public final rn0 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public yo4 h;

    public tb1(Context context, sb1 sb1Var) {
        p23.n(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = sb1Var;
        this.c = ub1.d;
    }

    @Override // defpackage.x11
    public final void a(yo4 yo4Var) {
        synchronized (this.d) {
            this.h = yo4Var;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new fl0("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new m3(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final lc1 c() {
        try {
            rn0 rn0Var = this.c;
            Context context = this.a;
            sb1 sb1Var = this.b;
            rn0Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{sb1Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            kc1 kc1VarA = rb1.a(context, Collections.unmodifiableList(arrayList));
            int i = kc1VarA.a;
            if (i != 0) {
                throw new RuntimeException(ud2.q("fetchFonts failed (", ")", i));
            }
            lc1[] lc1VarArr = (lc1[]) kc1VarA.b.get(0);
            if (lc1VarArr == null || lc1VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return lc1VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
