package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class pz2 implements n32 {
    public static final pz2 q = new pz2();
    public int c;
    public int d;
    public Handler m;
    public boolean h = true;
    public boolean l = true;
    public final p32 n = new p32(this);
    public final m3 o = new m3(10, this);
    public final sz0 p = new sz0(this);

    public final void c() {
        int i = this.d + 1;
        this.d = i;
        if (i == 1) {
            if (this.h) {
                this.n.e(f32.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.m;
                handler.getClass();
                handler.removeCallbacks(this.o);
            }
        }
    }

    @Override // defpackage.n32
    public final p32 h() {
        return this.n;
    }
}
