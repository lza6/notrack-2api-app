package notrack.ai;

import ai.notrack.app.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.ComposeView;
import com.credited.setting;
import defpackage.ab2;
import defpackage.av;
import defpackage.c92;
import defpackage.cb0;
import defpackage.ck0;
import defpackage.cl3;
import defpackage.d92;
import defpackage.dl2;
import defpackage.dn;
import defpackage.e4;
import defpackage.e92;
import defpackage.f04;
import defpackage.f60;
import defpackage.f92;
import defpackage.g04;
import defpackage.gj;
import defpackage.gn3;
import defpackage.h11;
import defpackage.h2;
import defpackage.h92;
import defpackage.hb0;
import defpackage.hi4;
import defpackage.hq3;
import defpackage.id4;
import defpackage.ir3;
import defpackage.iy2;
import defpackage.je1;
import defpackage.jn3;
import defpackage.kd4;
import defpackage.ke0;
import defpackage.kk0;
import defpackage.kr1;
import defpackage.l33;
import defpackage.m51;
import defpackage.md4;
import defpackage.mi2;
import defpackage.mo3;
import defpackage.n80;
import defpackage.nd1;
import defpackage.ne1;
import defpackage.np4;
import defpackage.og;
import defpackage.ou;
import defpackage.py;
import defpackage.q22;
import defpackage.qh4;
import defpackage.qu2;
import defpackage.qz3;
import defpackage.r11;
import defpackage.r43;
import defpackage.rg0;
import defpackage.so0;
import defpackage.sp;
import defpackage.t93;
import defpackage.tm0;
import defpackage.to2;
import defpackage.u3;
import defpackage.u41;
import defpackage.ud2;
import defpackage.ud4;
import defpackage.um4;
import defpackage.vc0;
import defpackage.vd4;
import defpackage.vu;
import defpackage.w84;
import defpackage.wa0;
import defpackage.wd4;
import defpackage.wh4;
import defpackage.wl;
import defpackage.wu;
import defpackage.xa0;
import defpackage.xh;
import defpackage.xr0;
import defpackage.ya0;
import defpackage.ye;
import defpackage.yg0;
import defpackage.yh;
import defpackage.yk0;
import defpackage.yo4;
import defpackage.zc1;
import defpackage.zg0;
import defpackage.zg2;
import defpackage.zh;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import notrack.ai.data.notify.PremiumPushWorker;
import notrack.ai.data.notify.ReengageWorker;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends zh {
    public static final /* synthetic */ int L = 0;
    public final vu I;
    public final e4 J;
    public final ir3 K;

    static {
        System.loadLibrary("null");
    }

    public MainActivity() {
        ((t93) this.l.c).c("androidx:appcompat", new xh(this));
        j(new yh(this));
        wl wlVar = new wl(14, this);
        vc0 vc0VarA = r43.a(hb0.class);
        f92 f92Var = new f92(this, 0);
        f92 f92Var2 = new f92(this, 1);
        vu vuVar = new vu();
        vuVar.c = vc0VarA;
        vuVar.d = f92Var;
        vuVar.h = wlVar;
        vuVar.l = f92Var2;
        this.I = vuVar;
        this.J = l(new m51(16), new u3(3));
        ir3 ir3Var = new ir3();
        ir3Var.c = l(new m51(23), new u3(5));
        ir3Var.h = yo4.H(q22.d, new ye(this, 22, ir3Var));
        ir3Var.l = new l33(ir3Var);
        this.K = ir3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 onCreate$lambda$17(MainActivity mainActivity, ck0 ck0Var, int i) {
        int i2 = 1;
        int i3 = 0;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 3) != 2);
        w84 w84Var = w84.a;
        if (!zS) {
            kk0Var.V();
            return w84Var;
        }
        so0 so0Var = null;
        gn3 gn3VarCollectAsState = cl3.collectAsState(mainActivity.y().d, null, kk0Var, 0, 1);
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(Boolean.FALSE);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        boolean zJ = kk0Var.j(mainActivity);
        Object objP2 = kk0Var.P();
        int i4 = 6;
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new h2(mainActivity, mi2Var, so0Var, i4);
            kk0Var.l0(objP2);
        }
        r11.LaunchedEffect(w84Var, (ne1) objP2, kk0Var, 6);
        boolean zJ2 = kk0Var.j(mainActivity);
        Object objP3 = kk0Var.P();
        if (zJ2 || objP3 == Composer$Companion.getEmpty()) {
            objP3 = new f60(mainActivity, so0Var, 9);
            kk0Var.l0(objP3);
        }
        r11.LaunchedEffect(w84Var, (ne1) objP3, kk0Var, 6);
        Boolean boolValueOf = Boolean.valueOf(((xa0) gn3VarCollectAsState.getValue()).o);
        g04 g04Var = ((xa0) gn3VarCollectAsState.getValue()).k;
        boolean zH = kk0Var.h(gn3VarCollectAsState) | kk0Var.j(mainActivity);
        Object objP4 = kk0Var.P();
        if (zH || objP4 == Composer$Companion.getEmpty()) {
            objP4 = new d92(mainActivity, gn3VarCollectAsState, so0Var, i3);
            kk0Var.l0(objP4);
        }
        r11.LaunchedEffect(boolValueOf, g04Var, (ne1) objP4, kk0Var, 0);
        Boolean boolValueOf2 = Boolean.valueOf(((xa0) gn3VarCollectAsState.getValue()).p);
        Boolean boolValueOf3 = Boolean.valueOf(((xa0) gn3VarCollectAsState.getValue()).q);
        boolean zH2 = kk0Var.h(gn3VarCollectAsState) | kk0Var.j(mainActivity);
        Object objP5 = kk0Var.P();
        if (zH2 || objP5 == Composer$Companion.getEmpty()) {
            objP5 = new d92(mainActivity, gn3VarCollectAsState, so0Var, i2);
            kk0Var.l0(objP5);
        }
        r11.LaunchedEffect(boolValueOf2, boolValueOf3, (ne1) objP5, kk0Var, 0);
        f04.NotrackAiTheme(((xa0) gn3VarCollectAsState.getValue()).k, zg0.rememberComposableLambda(1109418811, true, new sp(mainActivity, gn3VarCollectAsState, mi2Var, i4), kk0Var, 54), kk0Var, 48, 0);
        return w84Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 onCreate$lambda$17$lambda$16(MainActivity mainActivity, gn3 gn3Var, mi2 mi2Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            Modifier$Companion modifier$Companion = c.i;
            hq3.m210x8dcae10(d.c, null, ab2.a.getColorScheme(kk0Var, 0).n, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(-1249909866, true, new dn(gn3Var, 9, mainActivity), kk0Var, 54), kk0Var, 12582918, 122);
            if (((Boolean) mi2Var.getValue()).booleanValue()) {
                kk0Var.a0(923259179);
                boolean zJ = kk0Var.j(mainActivity);
                Object objP = kk0Var.P();
                if (zJ || objP == Composer$Companion.getEmpty()) {
                    objP = new ye(mainActivity, 18, mi2Var);
                    kk0Var.l0(objP);
                }
                je1 je1Var = (je1) objP;
                Object objP2 = kk0Var.P();
                if (objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new n80(8, mi2Var);
                    kk0Var.l0(objP2);
                }
                h92.NotifPrimerDialog(je1Var, (je1) objP2, kk0Var, 48);
            } else {
                kk0Var.a0(916628775);
            }
            kk0Var.r(false);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 onCreate$lambda$17$lambda$16$lambda$11(gn3 gn3Var, MainActivity mainActivity, ck0 ck0Var, int i) {
        int i2 = 0;
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            yk0.CompositionLocalProvider(qz3.b.c(Float.valueOf(((xa0) gn3Var.getValue()).l)), zg0.rememberComposableLambda(2011297494, true, new c92(mainActivity, i2), kk0Var, 54), kk0Var, 56);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 onCreate$lambda$17$lambda$16$lambda$11$lambda$10(MainActivity mainActivity, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            wa0.ChatScreen(mainActivity.y(), mainActivity.K, kk0Var, 0, 0);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static final void x(MainActivity mainActivity, hb0 hb0Var) {
        String strValueOf;
        int i = Build.VERSION.SDK_INT;
        Executor executorD = i >= 28 ? og.d(mainActivity) : new ou(new Handler(mainActivity.getMainLooper()), 2);
        executorD.getClass();
        e92 e92Var = new e92(hb0Var);
        wu wuVar = new wu();
        nd1 nd1Var = ((zc1) mainActivity.C.c).x;
        md4 md4VarG = mainActivity.g();
        kd4 kd4VarD = mainActivity.d();
        zg2 zg2VarE = mainActivity.e();
        kd4VarD.getClass();
        iy2 iy2Var = new iy2(md4VarG, kd4VarD, zg2VarE);
        vc0 vc0VarA = r43.a(av.class);
        String classQualifiedName = Options$Companion.getClassQualifiedName(vc0VarA.c);
        if (classQualifiedName == null) {
            u41.k("Local and anonymous classes can not be ViewModels");
            return;
        }
        av avVar = (av) iy2Var.j(vc0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(classQualifiedName));
        wuVar.a = true;
        wuVar.b = nd1Var;
        avVar.b = executorD;
        avVar.c = e92Var;
        int i2 = (i >= 30 ? 15 : 255) | 32768;
        String string = mainActivity.getString(R.string.app_locked_title);
        String string2 = mainActivity.getString(R.string.app_locked_subtitle);
        if (TextUtils.isEmpty(string)) {
            u41.k("Title must be set and non-empty.");
            return;
        }
        if (!xr0.h0(i2)) {
            StringBuilder sbS = ud2.s("Authenticator combination is unsupported on API ", ": ", i);
            if (i2 == 15) {
                strValueOf = "BIOMETRIC_STRONG";
            } else if (i2 == 255) {
                strValueOf = "BIOMETRIC_WEAK";
            } else if (i2 == 32768) {
                strValueOf = "DEVICE_CREDENTIAL";
            } else if (i2 != 32783) {
                strValueOf = i2 != 33023 ? String.valueOf(i2) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
            } else {
                strValueOf = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
            }
            sbS.append(strValueOf);
            throw new IllegalArgumentException(sbS.toString());
        }
        boolean zG0 = i2 != 0 ? xr0.g0(i2) : false;
        if (TextUtils.isEmpty(null) && !zG0) {
            u41.k("Negative text must be set and non-empty.");
            return;
        }
        if (!TextUtils.isEmpty(null) && zG0) {
            u41.k("Negative text must not be set if device credential authentication is allowed.");
            return;
        }
        try {
            wuVar.b(new gj(string, string2, i2));
        } catch (IllegalArgumentException e) {
            Log.w("NoTrack", "biometric prompt refused by the platform, unlocking", e);
            hb0Var.Z();
        }
    }

    public final void A(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("notrack.premium_from")) == null) {
            return;
        }
        intent.removeExtra("notrack.premium_from");
        hb0 hb0VarY = y();
        jn3 jn3Var = hb0VarY.p;
        jn3Var.getClass();
        jn3Var.p(null, stringExtra);
        py.F(id4.a(hb0VarY), null, null, new cb0(hb0VarY, stringExtra, (so0) null), 3);
    }

    @Override // defpackage.zh, defpackage.qg0, defpackage.pg0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setting.f(this);
        super.onCreate(bundle);
        h11.a(this);
        TimeUnit.DAYS.getClass();
        int i = 1;
        to2 to2Var = new to2(ReengageWorker.class, i);
        hi4 hi4Var = (hi4) to2Var.b;
        hi4Var.getClass();
        int i2 = hi4.y;
        hi4Var.h = 86400000L;
        hi4Var.i = py.y(86400000L, 300000L, 86400000L);
        ((hi4) to2Var.b).j = new tm0(new dl2(null), 2, false, false, false, false, -1L, -1L, ke0.S0(new LinkedHashSet()));
        new qh4(wh4.a(this), "reengage", 2, Collections.singletonList((qu2) to2Var.b()), 0).a();
        Set set = PremiumPushWorker.i;
        Options$Companion.schedule(this);
        z(getIntent());
        A(getIntent());
        yg0 yg0Var = new yg0(1724918198, new c92(this, i), true);
        ViewGroup.LayoutParams layoutParams = rg0.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(yg0Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(this, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(yg0Var);
        View decorView = getWindow().getDecorView();
        if (ud4.a(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (wd4.a(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (vd4.a(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(composeView2, rg0.a);
    }

    @Override // defpackage.zh, android.app.Activity
    public final void onDestroy() {
        ir3 ir3Var = this.K;
        if (ir3Var != null) {
            np4 np4VarV = ir3Var.V();
            l33 l33Var = (l33) ir3Var.l;
            synchronized (np4VarV) {
                um4 um4Var = np4VarV.b;
                synchronized (um4Var) {
                    um4Var.a.f("unregisterListener", new Object[0]);
                    if (l33Var == null) {
                        throw new NullPointerException("Unregistered Play Core listener should not be null.");
                    }
                    um4Var.d.remove(l33Var);
                    um4Var.a();
                }
            }
        }
        super.onDestroy();
    }

    @Override // defpackage.qg0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        z(intent);
        A(intent);
    }

    @Override // defpackage.zh, android.app.Activity
    public final native void onResume();

    public final hb0 y() {
        return (hb0) this.I.getValue();
    }

    public final void z(Intent intent) {
        Uri data;
        String queryParameter;
        if (intent == null || (data = intent.getData()) == null || !kr1.n(data.getHost(), "notrack.ai") || !kr1.n(data.getPath(), "/app/auth") || (queryParameter = data.getQueryParameter("code")) == null) {
            return;
        }
        so0 so0Var = null;
        intent.setData(null);
        hb0 hb0VarY = y();
        if (mo3.C0(queryParameter)) {
            return;
        }
        py.F(id4.a(hb0VarY), null, null, new ya0(3, hb0VarY, so0Var, queryParameter), 3);
    }
}
