package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer$Companion;
import defpackage.bn1;
import defpackage.ck0;
import defpackage.cl3;
import defpackage.cv0;
import defpackage.d72;
import defpackage.dl0;
import defpackage.i93;
import defpackage.kk0;
import defpackage.le1;
import defpackage.lh1;
import defpackage.mi2;
import defpackage.ne1;
import defpackage.o13;
import defpackage.r11;
import defpackage.s13;
import defpackage.sf3;
import defpackage.u41;
import defpackage.un3;
import defpackage.v53;
import defpackage.w33;
import defpackage.w84;
import defpackage.ww1;
import defpackage.yk0;
import defpackage.zg0;
import defpackage.zm1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    private static final o13 LocalConfiguration = new dl0(AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE);
    private static final o13 LocalContext = new un3(AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);
    private static final o13 LocalImageVectorCache = new un3(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);
    private static final o13 LocalResourceIdCache = new un3(AndroidCompositionLocals_androidKt$LocalResourceIdCache$1.INSTANCE);
    private static final o13 LocalSavedStateRegistryOwner = new un3(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.INSTANCE);
    private static final o13 LocalView = new un3(AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3, reason: invalid class name */
    public static final class AnonymousClass3 extends ww1 implements ne1 {
        final /* synthetic */ ne1 $content;
        final /* synthetic */ AndroidComposeView $owner;
        final /* synthetic */ AndroidUriHandler $uriHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AndroidComposeView androidComposeView, AndroidUriHandler androidUriHandler, ne1 ne1Var) {
            super(2);
            this.$owner = androidComposeView;
            this.$uriHandler = androidUriHandler;
            this.$content = ne1Var;
        }

        @Override // defpackage.ne1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ck0) obj, ((Number) obj2).intValue());
            return w84.a;
        }

        public final void invoke(ck0 ck0Var, int i) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.S(i & 1, (i & 3) != 2)) {
                CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.$uriHandler, this.$content, kk0Var, 0);
            } else {
                kk0Var.V();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4, reason: invalid class name */
    public static final class AnonymousClass4 extends ww1 implements ne1 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ ne1 $content;
        final /* synthetic */ AndroidComposeView $owner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AndroidComposeView androidComposeView, ne1 ne1Var, int i) {
            super(2);
            this.$owner = androidComposeView;
            this.$content = ne1Var;
            this.$$changed = i;
        }

        @Override // defpackage.ne1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ck0) obj, ((Number) obj2).intValue());
            return w84.a;
        }

        public final void invoke(ck0 ck0Var, int i) {
            AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.$owner, this.$content, ck0Var, sf3.V(this.$$changed | 1));
        }
    }

    public static final void ProvideAndroidCompositionLocals(AndroidComposeView androidComposeView, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1396852028);
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(androidComposeView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = cl3.d(new Configuration(context.getResources().getConfiguration()));
                kk0Var.l0(objP);
            }
            mi2 mi2Var = (mi2) objP;
            Object objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(mi2Var);
                kk0Var.l0(objP2);
            }
            androidComposeView.setConfigurationChangeObserver((le1) objP2);
            Object objP3 = kk0Var.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = new AndroidUriHandler(context);
                kk0Var.l0(objP3);
            }
            AndroidUriHandler androidUriHandler = (AndroidUriHandler) objP3;
            AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                u41.r("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            Object objP4 = kk0Var.P();
            if (objP4 == Composer$Companion.getEmpty()) {
                objP4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
                kk0Var.l0(objP4);
            }
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) objP4;
            boolean zJ = kk0Var.j(disposableSaveableStateRegistry);
            Object objP5 = kk0Var.P();
            if (zJ || objP5 == Composer$Companion.getEmpty()) {
                objP5 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1(disposableSaveableStateRegistry);
                kk0Var.l0(objP5);
            }
            r11.DisposableEffect(w84.a, (le1) objP5, kk0Var, 6);
            Object objP6 = kk0Var.P();
            if (objP6 == Composer$Companion.getEmpty()) {
                objP6 = HapticDefaults.INSTANCE.isPremiumVibratorEnabled(context) ? new DefaultHapticFeedback(androidComposeView.getView()) : new NoHapticFeedback();
                kk0Var.l0(objP6);
            }
            yk0.CompositionLocalProvider(new s13[]{LocalConfiguration.c(ProvideAndroidCompositionLocals$lambda$1(mi2Var)), LocalContext.c(context), d72.a.c(viewTreeOwners.getLifecycleOwner()), LocalSavedStateRegistryOwner.c(viewTreeOwners.getSavedStateRegistryOwner()), i93.a.c(disposableSaveableStateRegistry), LocalView.c(androidComposeView.getView()), LocalImageVectorCache.c(obtainImageVectorCache(context, ProvideAndroidCompositionLocals$lambda$1(mi2Var), kk0Var, 0)), LocalResourceIdCache.c(obtainResourceIdCache(context, kk0Var, 0)), CompositionLocalsKt.getLocalProvidableScrollCaptureInProgress().c(Boolean.valueOf(((Boolean) kk0Var.l(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), CompositionLocalsKt.getLocalHapticFeedback().c((lh1) objP6)}, zg0.rememberComposableLambda(1471621628, true, new AnonymousClass3(androidComposeView, androidUriHandler, ne1Var), kk0Var, 54), kk0Var, 56);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new AnonymousClass4(androidComposeView, ne1Var, i));
        }
    }

    private static final Configuration ProvideAndroidCompositionLocals$lambda$1(mi2 mi2Var) {
        return (Configuration) mi2Var.getValue();
    }

    public static final o13 getLocalConfiguration() {
        return LocalConfiguration;
    }

    public static final o13 getLocalContext() {
        return LocalContext;
    }

    public static final o13 getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    public static final o13 getLocalLifecycleOwner() {
        return d72.a;
    }

    @cv0
    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }

    public static final o13 getLocalResourceIdCache() {
        return LocalResourceIdCache;
    }

    public static final o13 getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    public static final o13 getLocalView() {
        return LocalView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final bn1 obtainImageVectorCache(Context context, Configuration configuration, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new bn1();
            kk0Var.l0(objP);
        }
        final bn1 bn1Var = (bn1) objP;
        Object objP2 = kk0Var.P();
        Object obj = objP2;
        if (objP2 == Composer$Companion.getEmpty()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            kk0Var.l0(configuration2);
            obj = configuration2;
        }
        final Configuration configuration3 = (Configuration) obj;
        Object objP3 = kk0Var.P();
        if (objP3 == Composer$Companion.getEmpty()) {
            objP3 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration4) {
                    int iUpdateFrom = configuration3.updateFrom(configuration4);
                    Iterator it = bn1Var.a.entrySet().iterator();
                    while (it.hasNext()) {
                        zm1 zm1Var = (zm1) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                        if (zm1Var == null || Configuration.needNewResources(iUpdateFrom, zm1Var.b)) {
                            it.remove();
                        }
                    }
                    configuration3.setTo(configuration4);
                }

                @Override // android.content.ComponentCallbacks
                @cv0
                public void onLowMemory() {
                    bn1Var.a.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i2) {
                    bn1Var.a.clear();
                }
            };
            kk0Var.l0(objP3);
        }
        AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) objP3;
        boolean zJ = kk0Var.j(context);
        Object objP4 = kk0Var.P();
        if (zJ || objP4 == Composer$Companion.getEmpty()) {
            objP4 = new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1(context, androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1);
            kk0Var.l0(objP4);
        }
        r11.DisposableEffect(bn1Var, (le1) objP4, kk0Var, 0);
        return bn1Var;
    }

    private static final v53 obtainResourceIdCache(Context context, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new v53();
            kk0Var.l0(objP);
        }
        final v53 v53Var = (v53) objP;
        Object objP2 = kk0Var.P();
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    v53 v53Var2 = v53Var;
                    synchronized (v53Var2) {
                        v53Var2.a.c();
                    }
                }

                @Override // android.content.ComponentCallbacks
                @cv0
                public void onLowMemory() {
                    v53 v53Var2 = v53Var;
                    synchronized (v53Var2) {
                        v53Var2.a.c();
                    }
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i2) {
                    v53 v53Var2 = v53Var;
                    synchronized (v53Var2) {
                        v53Var2.a.c();
                    }
                }
            };
            kk0Var.l0(objP2);
        }
        AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) objP2;
        boolean zJ = kk0Var.j(context);
        Object objP3 = kk0Var.P();
        if (zJ || objP3 == Composer$Companion.getEmpty()) {
            objP3 = new AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1(context, androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1);
            kk0Var.l0(objP3);
        }
        r11.DisposableEffect(v53Var, (le1) objP3, kk0Var, 0);
        return v53Var;
    }
}
