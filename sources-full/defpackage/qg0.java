package defpackage;

import ai.notrack.app.R;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ReportFragment$Companion;
import androidx.lifecycle.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class qg0 extends pg0 implements nd4, ph1, u93, ho2, j4 {
    public static final /* synthetic */ int B = 0;
    public final yq3 A;
    public final tn0 d = new tn0();
    public final ci4 h;
    public final cr1 l;
    public md4 m;
    public final mg0 n;
    public final yq3 o;
    public final AtomicInteger p;
    public final ng0 q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList t;
    public final CopyOnWriteArrayList u;
    public final CopyOnWriteArrayList v;
    public final CopyOnWriteArrayList w;
    public boolean x;
    public boolean y;
    public final yq3 z;

    public qg0() {
        final int i = 0;
        this.h = new ci4(new fg0(this, i));
        cr1 cr1Var = new cr1(this);
        this.l = cr1Var;
        this.n = new mg0(this);
        this.o = new yq3(new og0(this, 2));
        this.p = new AtomicInteger();
        this.q = new ng0(this);
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.u = new CopyOnWriteArrayList();
        this.v = new CopyOnWriteArrayList();
        this.w = new CopyOnWriteArrayList();
        p32 p32Var = this.c;
        if (p32Var == null) {
            u41.r("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        p32Var.a(new k32(this) { // from class: gg0
            public final /* synthetic */ qg0 d;

            {
                this.d = this;
            }

            @Override // defpackage.k32
            public final void onStateChanged(n32 n32Var, f32 f32Var) {
                Window window;
                View viewPeekDecorView;
                int i2 = i;
                qg0 qg0Var = this.d;
                switch (i2) {
                    case 0:
                        if (f32Var == f32.ON_STOP && (window = qg0Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (f32Var == f32.ON_DESTROY) {
                            qg0Var.d.b = null;
                            if (!qg0Var.isChangingConfigurations()) {
                                qg0Var.g().a();
                            }
                            mg0 mg0Var = qg0Var.n;
                            qg0 qg0Var2 = mg0Var.l;
                            qg0Var2.getWindow().getDecorView().removeCallbacks(mg0Var);
                            qg0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(mg0Var);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.c.a(new k32(this) { // from class: gg0
            public final /* synthetic */ qg0 d;

            {
                this.d = this;
            }

            @Override // defpackage.k32
            public final void onStateChanged(n32 n32Var, f32 f32Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i2;
                qg0 qg0Var = this.d;
                switch (i3) {
                    case 0:
                        if (f32Var == f32.ON_STOP && (window = qg0Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (f32Var == f32.ON_DESTROY) {
                            qg0Var.d.b = null;
                            if (!qg0Var.isChangingConfigurations()) {
                                qg0Var.g().a();
                            }
                            mg0 mg0Var = qg0Var.n;
                            qg0 qg0Var2 = mg0Var.l;
                            qg0Var2.getWindow().getDecorView().removeCallbacks(mg0Var);
                            qg0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(mg0Var);
                        }
                        break;
                }
            }
        });
        this.c.a(new g43(i2, this));
        cr1Var.d();
        n93.b(this);
        ((t93) cr1Var.c).c("android:support:activity-result", new hg0(i, this));
        j(new ig0(this, i));
        this.z = new yq3(new og0(this, i));
        this.A = new yq3(new og0(this, 3));
    }

    @Override // defpackage.ho2
    public final go2 a() {
        return (go2) this.A.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.u93
    public final t93 b() {
        return (t93) this.l.c;
    }

    @Override // defpackage.ph1
    public final kd4 d() {
        return (kd4) this.z.getValue();
    }

    @Override // defpackage.ph1
    public final zg2 e() {
        zg2 zg2Var = new zg2(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) zg2Var.a;
        if (getApplication() != null) {
            Application application = getApplication();
            application.getClass();
            linkedHashMap.put(jd4.d, application);
        }
        linkedHashMap.put(n93.a, this);
        linkedHashMap.put(n93.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(n93.c, extras);
        }
        return zg2Var;
    }

    @Override // defpackage.j4
    public final ng0 f() {
        return this.q;
    }

    @Override // defpackage.nd4
    public final md4 g() {
        if (getApplication() == null) {
            u41.r("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.m == null) {
            lg0 lg0Var = (lg0) getLastNonConfigurationInstance();
            if (lg0Var != null) {
                this.m = lg0Var.a;
            }
            if (this.m == null) {
                this.m = new md4();
            }
        }
        md4 md4Var = this.m;
        md4Var.getClass();
        return md4Var;
    }

    @Override // defpackage.n32
    public final p32 h() {
        return this.c;
    }

    public final void j(ko2 ko2Var) {
        tn0 tn0Var = this.d;
        tn0Var.getClass();
        qg0 qg0Var = tn0Var.b;
        if (qg0Var != null) {
            ko2Var.a(qg0Var);
        }
        tn0Var.a.add(ko2Var);
    }

    public final void k() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final e4 l(final r3 r3Var, final s3 s3Var) {
        final ng0 ng0Var = this.q;
        ng0Var.getClass();
        final String str = "activity_rq#" + this.p.getAndIncrement();
        LinkedHashMap linkedHashMap = ng0Var.c;
        p32 p32Var = this.c;
        if (p32Var.c.compareTo(g32.l) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            g32 g32Var = p32Var.c;
            sb.append(" is attempting to register while current state is ");
            sb.append(g32Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        ng0Var.d(str);
        c4 c4Var = (c4) linkedHashMap.get(str);
        if (c4Var == null) {
            c4Var = new c4(p32Var);
        }
        k32 k32Var = new k32() { // from class: a4
            @Override // defpackage.k32
            public final void onStateChanged(n32 n32Var, f32 f32Var) {
                ng0 ng0Var2 = ng0Var;
                ng0Var2.getClass();
                Bundle bundle = ng0Var2.g;
                LinkedHashMap linkedHashMap2 = ng0Var2.e;
                LinkedHashMap linkedHashMap3 = ng0Var2.f;
                f32 f32Var2 = f32.ON_START;
                String str2 = str;
                if (f32Var2 != f32Var) {
                    if (f32.ON_STOP == f32Var) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (f32.ON_DESTROY == f32Var) {
                            ng0Var2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                r3 r3Var2 = r3Var;
                s3 s3Var2 = s3Var;
                linkedHashMap2.put(str2, new b4(r3Var2, s3Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    r3Var2.b(obj);
                }
                q3 q3Var = (q3) xr0.c0(str2, bundle);
                if (q3Var != null) {
                    bundle.remove(str2);
                    r3Var2.b(s3Var2.c(q3Var.d, q3Var.c));
                }
            }
        };
        c4Var.a.a(k32Var);
        c4Var.b.add(k32Var);
        linkedHashMap.put(str, c4Var);
        return new e4(ng0Var, str, s3Var, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.q.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((dn0) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.pg0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.l.e(bundle);
        tn0 tn0Var = this.d;
        tn0Var.getClass();
        tn0Var.b = this;
        Iterator it = tn0Var.a.iterator();
        while (it.hasNext()) {
            ((ko2) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = a.d;
        ReportFragment$Companion.injectIfNeededIn(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
        while (it.hasNext()) {
            ((gd1) it.next()).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
            while (it.hasNext()) {
                if (((gd1) it.next()).a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.x) {
            return;
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((dn0) it.next()).accept(new wg2(z));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.x = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.x = false;
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                ((dn0) it.next()).accept(new wg2(z));
            }
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((dn0) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
        while (it.hasNext()) {
            ((gd1) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.y) {
            return;
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ((dn0) it.next()).accept(new jv2(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.y = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.y = false;
            Iterator it = this.v.iterator();
            while (it.hasNext()) {
                ((dn0) it.next()).accept(new jv2(z));
            }
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
        while (it.hasNext()) {
            ((gd1) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.q.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        lg0 lg0Var;
        md4 md4Var = this.m;
        if (md4Var == null && (lg0Var = (lg0) getLastNonConfigurationInstance()) != null) {
            md4Var = lg0Var.a;
        }
        if (md4Var == null) {
            return null;
        }
        lg0 lg0Var2 = new lg0();
        lg0Var2.a = md4Var;
        return lg0Var2;
    }

    @Override // defpackage.pg0, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        p32 p32Var = this.c;
        if (p32Var != null) {
            p32Var.d("setCurrentState");
            p32Var.f(g32.h);
        }
        super.onSaveInstanceState(bundle);
        this.l.f(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((dn0) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (jr1.B()) {
                Trace.beginSection(jr1.O("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            ie1 ie1Var = (ie1) this.o.getValue();
            synchronized (ie1Var.a) {
                try {
                    ie1Var.b = true;
                    ArrayList arrayList = ie1Var.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((je1) obj).invoke();
                    }
                    ie1Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        k();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        k();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.n.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
