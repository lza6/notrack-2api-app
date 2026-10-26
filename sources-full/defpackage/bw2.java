package defpackage;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public class bw2 implements zv2 {
    public final Magnifier a;

    public bw2(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.zv2
    public void a(long j, long j2, float f) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (((long) this.a.getWidth()) << 32) | (((long) this.a.getHeight()) & 4294967295L);
    }

    public final void d() {
        this.a.update();
    }
}
