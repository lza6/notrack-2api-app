package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class r32 extends Service implements n32 {
    public final iy2 c = new iy2(this);

    @Override // defpackage.n32
    public final p32 h() {
        return (p32) this.c.d;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        this.c.m(f32.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.c.m(f32.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f32 f32Var = f32.ON_STOP;
        iy2 iy2Var = this.c;
        iy2Var.m(f32Var);
        iy2Var.m(f32.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.c.m(f32.ON_START);
        super.onStart(intent, i);
    }
}
