package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class av extends gd4 {
    public Executor b;
    public p23 c;
    public gj d;
    public vu e;
    public ci4 f;
    public bi4 g;
    public zu h;
    public String i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ih2 q;
    public ih2 r;
    public ih2 s;
    public ih2 t;
    public ih2 u;
    public ih2 w;
    public ih2 y;
    public ih2 z;
    public int j = 0;
    public boolean v = true;
    public int x = 0;

    public static void j(ih2 ih2Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            ih2Var.f(obj);
        } else {
            ih2Var.e(obj);
        }
    }

    public final int e() {
        gj gjVar = this.d;
        if (gjVar == null) {
            return 0;
        }
        vu vuVar = this.e;
        int i = gjVar.b;
        if (i != 0) {
            return i;
        }
        if (vuVar != null) {
            return 15;
        }
        return KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public final void f(gu guVar) {
        if (this.r == null) {
            this.r = new ih2();
        }
        j(this.r, guVar);
    }

    public final void g(CharSequence charSequence) {
        if (this.z == null) {
            this.z = new ih2();
        }
        j(this.z, charSequence);
    }

    public final void h(int i) {
        if (this.y == null) {
            this.y = new ih2();
        }
        j(this.y, Integer.valueOf(i));
    }

    public final void i(boolean z) {
        if (this.u == null) {
            this.u = new ih2();
        }
        j(this.u, Boolean.valueOf(z));
    }
}
