package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class zc1 extends yh4 implements nd4, ho2, j4, u93, rd1 {
    public final zh u;
    public final zh v;
    public final Handler w;
    public final nd1 x;
    public final /* synthetic */ zh y;

    public zc1(zh zhVar) {
        this.y = zhVar;
        Handler handler = new Handler();
        this.u = zhVar;
        this.v = zhVar;
        this.w = handler;
        this.x = new nd1();
    }

    @Override // defpackage.yh4
    public final View M(int i) {
        return this.y.findViewById(i);
    }

    @Override // defpackage.yh4
    public final boolean N() {
        Window window = this.y.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ho2
    public final go2 a() {
        return this.y.a();
    }

    @Override // defpackage.u93
    public final t93 b() {
        return (t93) this.y.l.c;
    }

    @Override // defpackage.rd1
    public final void c() {
    }

    @Override // defpackage.j4
    public final ng0 f() {
        return this.y.q;
    }

    @Override // defpackage.nd4
    public final md4 g() {
        return this.y.g();
    }

    @Override // defpackage.n32
    public final p32 h() {
        return this.y.D;
    }
}
