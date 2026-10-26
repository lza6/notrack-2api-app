package defpackage;

import android.content.Context;
import app.template.extension.BuildConfig;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class im0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public im0() {
        this.a = 1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public im0(Context context, zh4 zh4Var) {
        this.a = 0;
        this.b = zh4Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.c = applicationContext;
        this.d = new Object();
        this.f = new LinkedHashSet();
    }

    public abstract void a(ce4 ce4Var);

    public void b(im0 im0Var) {
        im0Var.k();
        im0Var.f(this);
        im0 im0Var2 = (im0) this.d;
        if (im0Var2 == null) {
            this.c = im0Var;
            this.d = im0Var;
        } else {
            im0Var2.f = im0Var;
            im0Var.e = im0Var2;
            this.d = im0Var;
        }
    }

    public im0 c() {
        return (im0) this.b;
    }

    public void d(im0 im0Var) {
        im0Var.k();
        im0 im0Var2 = (im0) this.f;
        im0Var.f = im0Var2;
        if (im0Var2 != null) {
            im0Var2.e = im0Var;
        }
        im0Var.e = this;
        this.f = im0Var;
        im0 im0Var3 = (im0) this.b;
        im0Var.b = im0Var3;
        if (((im0) im0Var.f) == null) {
            im0Var3.d = im0Var;
        }
    }

    public abstract Object e();

    public void f(im0 im0Var) {
        this.b = im0Var;
    }

    public void g(Object obj) {
        synchronized (this.d) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                ((zh4) this.b).d.execute(new ba(ke0.O0((LinkedHashSet) this.f), 5, this));
            }
        }
    }

    public abstract void h();

    public abstract void i();

    public String j() {
        return BuildConfig.VERSION_NAME;
    }

    public void k() {
        im0 im0Var = (im0) this.e;
        if (im0Var != null) {
            im0Var.f = (im0) this.f;
        } else {
            im0 im0Var2 = (im0) this.b;
            if (im0Var2 != null) {
                im0Var2.c = (im0) this.f;
            }
        }
        im0 im0Var3 = (im0) this.f;
        if (im0Var3 != null) {
            im0Var3.e = im0Var;
        } else {
            im0 im0Var4 = (im0) this.b;
            if (im0Var4 != null) {
                im0Var4.d = im0Var;
            }
        }
        this.b = null;
        this.f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName() + "{" + j() + "}";
            default:
                return super.toString();
        }
    }
}
