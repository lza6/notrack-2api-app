package androidx.compose.ui.platform;

import ai.notrack.app.R;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import defpackage.bg1;
import defpackage.d43;
import defpackage.f32;
import defpackage.fn3;
import defpackage.gm4;
import defpackage.h32;
import defpackage.hn3;
import defpackage.hw0;
import defpackage.i92;
import defpackage.jq0;
import defpackage.jt0;
import defpackage.jy;
import defpackage.k32;
import defpackage.lu2;
import defpackage.n32;
import defpackage.pm0;
import defpackage.po1;
import defpackage.py;
import defpackage.q43;
import defpackage.qk0;
import defpackage.qo0;
import defpackage.r00;
import defpackage.rp3;
import defpackage.sf3;
import defpackage.so0;
import defpackage.sw0;
import defpackage.t00;
import defpackage.t73;
import defpackage.u41;
import defpackage.ud4;
import defpackage.w84;
import defpackage.x21;
import defpackage.xf2;
import defpackage.xp0;
import defpackage.xp1;
import defpackage.y64;
import defpackage.yo4;
import defpackage.zf2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class WindowRecomposer_androidKt {
    private static final Map<Context, hn3> animationScale = new LinkedHashMap();

    public static final d43 createLifecycleAwareWindowRecomposer(final View view, xp0 xp0Var, h32 h32Var) {
        final lu2 lu2Var;
        if (xp0Var.get(t73.m) == null || xp0Var.get(bg1.t) == null) {
            xp0Var = AndroidUiDispatcher.Companion.getCurrentThread().plus(xp0Var);
        }
        xf2 xf2Var = (xf2) xp0Var.get(bg1.t);
        if (xf2Var != null) {
            lu2 lu2Var2 = new lu2(xf2Var);
            hw0 hw0Var = lu2Var2.d;
            synchronized (hw0Var.c) {
                hw0Var.b = false;
            }
            lu2Var = lu2Var2;
        } else {
            lu2Var = null;
        }
        final q43 q43Var = new q43();
        xp0 motionDurationScaleImpl = (zf2) xp0Var.get(t73.s);
        if (motionDurationScaleImpl == null) {
            motionDurationScaleImpl = new MotionDurationScaleImpl();
            q43Var.c = motionDurationScaleImpl;
        }
        xp0 xp0VarPlus = xp0Var.plus(lu2Var != null ? lu2Var : x21.c).plus(motionDurationScaleImpl);
        final d43 d43Var = new d43(xp0VarPlus);
        synchronized (d43Var.b) {
            d43Var.s = true;
        }
        final qo0 qo0VarA = yo4.a(xp0VarPlus);
        if (h32Var == null) {
            n32 n32VarA = ud4.a(view);
            h32Var = n32VarA != null ? n32VarA.h() : null;
        }
        if (h32Var != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    d43Var.t();
                }
            });
            h32Var.a(new k32() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2

                /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[f32.values().length];
                        try {
                            iArr[f32.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[f32.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[f32.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[f32.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[f32.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[f32.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[f32.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // defpackage.k32
                public void onStateChanged(n32 n32Var, f32 f32Var) {
                    boolean z;
                    int i = WhenMappings.$EnumSwitchMapping$0[f32Var.ordinal()];
                    r00 r00VarU = null;
                    if (i == 1) {
                        py.F(qo0VarA, null, jq0.l, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(q43Var, d43Var, n32Var, this, view, null), 1);
                        return;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return;
                            }
                            d43Var.t();
                            return;
                        } else {
                            d43 d43Var2 = d43Var;
                            synchronized (d43Var2.b) {
                                d43Var2.s = true;
                            }
                            return;
                        }
                    }
                    lu2 lu2Var3 = lu2Var;
                    if (lu2Var3 != null) {
                        hw0 hw0Var2 = lu2Var3.d;
                        synchronized (hw0Var2.c) {
                            try {
                                synchronized (hw0Var2.c) {
                                    z = hw0Var2.b;
                                }
                                if (!z) {
                                    ArrayList arrayList = (ArrayList) hw0Var2.a;
                                    hw0Var2.a = (ArrayList) hw0Var2.d;
                                    hw0Var2.d = arrayList;
                                    hw0Var2.b = true;
                                    int size = arrayList.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        ((so0) arrayList.get(i2)).resumeWith(w84.a);
                                    }
                                    arrayList.clear();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    d43 d43Var3 = d43Var;
                    synchronized (d43Var3.b) {
                        if (d43Var3.s) {
                            d43Var3.s = false;
                            r00VarU = d43Var3.u();
                        }
                    }
                    if (r00VarU != null) {
                        ((t00) r00VarU).resumeWith(w84.a);
                    }
                }
            });
            return d43Var;
        }
        po1.c("ViewTreeLifecycleOwner not found from " + view);
        u41.p();
        return null;
    }

    public static /* synthetic */ d43 createLifecycleAwareWindowRecomposer$default(View view, xp0 xp0Var, h32 h32Var, int i, Object obj) {
        if ((i & 1) != 0) {
            xp0Var = x21.c;
        }
        if ((i & 2) != 0) {
            h32Var = null;
        }
        return createLifecycleAwareWindowRecomposer(view, xp0Var, h32Var);
    }

    public static final qk0 findViewTreeCompositionContext(View view) {
        qk0 compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        for (ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((View) parent);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final hn3 getAnimationScaleFlowFor(Context context) {
        hn3 hn3Var;
        Map<Context, hn3> map = animationScale;
        synchronized (map) {
            try {
                hn3 hn3VarU = map.get(context);
                if (hn3VarU == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    final jy jyVarB = gm4.b(-1, 6, null);
                    final Handler handlerJ = xp1.j(Looper.getMainLooper());
                    pm0 pm0Var = new pm0(3, new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(handlerJ) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean z, Uri uri) {
                            jyVarB.i(w84.a);
                        }
                    }, jyVarB, context, null));
                    rp3 rp3VarG = py.g();
                    jt0 jt0Var = sw0.a;
                    hn3VarU = sf3.U(pm0Var, new qo0(y64.I(rp3VarG, i92.a)), new fn3(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, hn3VarU);
                }
                hn3Var = hn3VarU;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hn3Var;
    }

    public static final qk0 getCompositionContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof qk0) {
            return (qk0) tag;
        }
        return null;
    }

    private static final View getContentChild(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final d43 getWindowRecomposer(View view) {
        if (!view.isAttachedToWindow()) {
            po1.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View contentChild = getContentChild(view);
        qk0 compositionContext = getCompositionContext(contentChild);
        if (compositionContext == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(contentChild);
        }
        if (compositionContext instanceof d43) {
            return (d43) compositionContext;
        }
        u41.r("root viewTreeParentCompositionContext is not a Recomposer");
        return null;
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }

    public static final void setCompositionContext(View view, qk0 qk0Var) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, qk0Var);
    }
}
