package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zh extends qg0 implements di {
    public boolean E;
    public boolean F;
    public zi H;
    public final sz0 C = new sz0(new zc1(this));
    public final p32 D = new p32(this);
    public boolean G = true;

    public zh() {
        ((t93) this.l.c).c("android:support:lifecycle", new hg0(2, this));
        final int i = 0;
        this.r.add(new dn0(this) { // from class: yc1
            public final /* synthetic */ zh b;

            {
                this.b = this;
            }

            @Override // defpackage.dn0
            public final void accept(Object obj) {
                int i2 = i;
                zh zhVar = this.b;
                switch (i2) {
                    case 0:
                        zhVar.C.r();
                        break;
                    default:
                        zhVar.C.r();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.t.add(new dn0(this) { // from class: yc1
            public final /* synthetic */ zh b;

            {
                this.b = this;
            }

            @Override // defpackage.dn0
            public final void accept(Object obj) {
                int i3 = i2;
                zh zhVar = this.b;
                switch (i3) {
                    case 0:
                        zhVar.C.r();
                        break;
                    default:
                        zhVar.C.r();
                        break;
                }
            }
        });
        j(new ig0(this, 1));
    }

    public static boolean n(nd1 nd1Var) {
        boolean zN = false;
        for (xc1 xc1Var : nd1Var.c.U()) {
            if (xc1Var != null) {
                zc1 zc1Var = xc1Var.C;
                if ((zc1Var == null ? null : zc1Var.y) != null) {
                    zN |= n(xc1Var.i());
                }
                if (xc1Var.V.c.compareTo(g32.l) >= 0) {
                    p32 p32Var = xc1Var.V;
                    p32Var.d("setCurrentState");
                    p32Var.f(g32.h);
                    zN = true;
                }
            }
        }
        return zN;
    }

    @Override // defpackage.qg0, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        zi ziVar = (zi) m();
        ziVar.z();
        ((ViewGroup) ziVar.H.findViewById(R.id.content)).addView(view, layoutParams);
        ziVar.u.a(ziVar.t.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01ce A[Catch: all -> 0x01c2, TRY_LEAVE, TryCatch #0 {, blocks: (B:101:0x01b0, B:103:0x01b4, B:109:0x01cc, B:110:0x01ce, B:112:0x01d2, B:118:0x01e2, B:117:0x01d9, B:108:0x01c5), top: B:128:0x01b0, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    /* JADX WARN: Code duplicated, block: B:88:0x017e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0186  */
    /* JADX WARN: Code duplicated, block: B:92:0x0189  */
    /* JADX WARN: Code duplicated, block: B:96:0x019f  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ad  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        ro0 ro0Var;
        Resources.Theme theme;
        Method method;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        zi ziVar = (zi) m();
        ziVar.V = true;
        int i37 = ziVar.Z;
        if (i37 == -100) {
            i37 = li.d;
        }
        int iF = ziVar.F(context, i37);
        if (li.f(context)) {
            li.p(context);
        }
        i72 i72VarS = zi.s(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(zi.w(context, iF, i72VarS, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof ro0) {
                    try {
                        ((ro0) context).a(zi.w(context, iF, i72VarS, null, false));
                    } catch (IllegalStateException unused2) {
                        if (zi.q0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    qi.a(configuration, configuration2, configuration3);
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode |= configuration2.colorMode & 3;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i25 = configuration.uiMode & 15;
                                    i26 = configuration2.uiMode & 15;
                                    if (i25 != i26) {
                                        configuration3.uiMode |= i26;
                                    }
                                    i27 = configuration.uiMode & 48;
                                    i28 = configuration2.uiMode & 48;
                                    if (i27 != i28) {
                                        configuration3.uiMode |= i28;
                                    }
                                    i29 = configuration.screenWidthDp;
                                    i30 = configuration2.screenWidthDp;
                                    if (i29 != i30) {
                                        configuration3.screenWidthDp = i30;
                                    }
                                    i31 = configuration.screenHeightDp;
                                    i32 = configuration2.screenHeightDp;
                                    if (i31 != i32) {
                                        configuration3.screenHeightDp = i32;
                                    }
                                    i33 = configuration.smallestScreenWidthDp;
                                    i34 = configuration2.smallestScreenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.smallestScreenWidthDp = i34;
                                    }
                                    i35 = configuration.densityDpi;
                                    i36 = configuration2.densityDpi;
                                    if (i35 != i36) {
                                        configuration3.densityDpi = i36;
                                    }
                                }
                            }
                            Configuration configurationW = zi.w(context, iF, i72VarS, configuration3, true);
                            ro0Var = new ro0(context, ai.notrack.app.R.style.Theme_AppCompat_Empty);
                            ro0Var.a(configurationW);
                            try {
                                if (context.getTheme() != null) {
                                    theme = ro0Var.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        vk.c(theme);
                                    } else {
                                        synchronized (gm4.h) {
                                            if (gm4.j) {
                                                method = gm4.i;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    gm4.i = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                                }
                                                gm4.j = true;
                                                method = gm4.i;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                                        gm4.i = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = ro0Var;
                        }
                    }
                } else if (zi.q0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            qi.a(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i25 = configuration.uiMode & 15;
                            i26 = configuration2.uiMode & 15;
                            if (i25 != i26) {
                                configuration3.uiMode |= i26;
                            }
                            i27 = configuration.uiMode & 48;
                            i28 = configuration2.uiMode & 48;
                            if (i27 != i28) {
                                configuration3.uiMode |= i28;
                            }
                            i29 = configuration.screenWidthDp;
                            i30 = configuration2.screenWidthDp;
                            if (i29 != i30) {
                                configuration3.screenWidthDp = i30;
                            }
                            i31 = configuration.screenHeightDp;
                            i32 = configuration2.screenHeightDp;
                            if (i31 != i32) {
                                configuration3.screenHeightDp = i32;
                            }
                            i33 = configuration.smallestScreenWidthDp;
                            i34 = configuration2.smallestScreenWidthDp;
                            if (i33 != i34) {
                                configuration3.smallestScreenWidthDp = i34;
                            }
                            i35 = configuration.densityDpi;
                            i36 = configuration2.densityDpi;
                            if (i35 != i36) {
                                configuration3.densityDpi = i36;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationW2 = zi.w(context, iF, i72VarS, configuration3, true);
                    ro0Var = new ro0(context, ai.notrack.app.R.style.Theme_AppCompat_Empty);
                    ro0Var.a(configurationW2);
                    if (context.getTheme() != null) {
                        theme = ro0Var.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            vk.c(theme);
                        } else {
                            synchronized (gm4.h) {
                                if (gm4.j) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    gm4.i = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    gm4.j = true;
                                    method = gm4.i;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = gm4.i;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = ro0Var;
                }
            }
        } else if (context instanceof ro0) {
            ((ro0) context).a(zi.w(context, iF, i72VarS, null, false));
        } else if (zi.q0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    qi.a(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i25 = configuration.uiMode & 15;
                    i26 = configuration2.uiMode & 15;
                    if (i25 != i26) {
                        configuration3.uiMode |= i26;
                    }
                    i27 = configuration.uiMode & 48;
                    i28 = configuration2.uiMode & 48;
                    if (i27 != i28) {
                        configuration3.uiMode |= i28;
                    }
                    i29 = configuration.screenWidthDp;
                    i30 = configuration2.screenWidthDp;
                    if (i29 != i30) {
                        configuration3.screenWidthDp = i30;
                    }
                    i31 = configuration.screenHeightDp;
                    i32 = configuration2.screenHeightDp;
                    if (i31 != i32) {
                        configuration3.screenHeightDp = i32;
                    }
                    i33 = configuration.smallestScreenWidthDp;
                    i34 = configuration2.smallestScreenWidthDp;
                    if (i33 != i34) {
                        configuration3.smallestScreenWidthDp = i34;
                    }
                    i35 = configuration.densityDpi;
                    i36 = configuration2.densityDpi;
                    if (i35 != i36) {
                        configuration3.densityDpi = i36;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationW3 = zi.w(context, iF, i72VarS, configuration3, true);
            ro0Var = new ro0(context, ai.notrack.app.R.style.Theme_AppCompat_Empty);
            ro0Var.a(configurationW3);
            if (context.getTheme() != null) {
                theme = ro0Var.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    vk.c(theme);
                } else {
                    synchronized (gm4.h) {
                        if (gm4.j) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            gm4.i = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            gm4.j = true;
                            method = gm4.i;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = gm4.i;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = ro0Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((zi) m()).D();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.pg0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((zi) m()).D();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.E);
        printWriter.print(" mResumed=");
        printWriter.print(this.F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        if (getApplication() != null) {
            bv0.z(this).w(str3, printWriter);
        }
        ((zc1) this.C.c).x.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        zi ziVar = (zi) m();
        ziVar.z();
        return ziVar.t.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        zi ziVar = (zi) m();
        if (ziVar.w == null) {
            ziVar.D();
            zf4 zf4Var = ziVar.v;
            ziVar.w = new wp3(zf4Var != null ? zf4Var.b() : ziVar.s);
        }
        return ziVar.w;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = nb4.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        zi ziVar = (zi) m();
        if (ziVar.v != null) {
            ziVar.D();
            ziVar.v.getClass();
            ziVar.E(0);
        }
    }

    public final li m() {
        if (this.H == null) {
            wf3 wf3Var = li.c;
            this.H = new zi(this, null, this, this);
        }
        return this.H;
    }

    public final void o() {
        super.onDestroy();
        ((zc1) this.C.c).x.l();
        this.D.e(f32.ON_DESTROY);
    }

    @Override // defpackage.qg0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.C.r();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.qg0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        zi ziVar = (zi) m();
        if (ziVar.M && ziVar.G) {
            ziVar.D();
            zf4 zf4Var = ziVar.v;
            if (zf4Var != null) {
                zf4Var.e(zf4Var.a.getResources().getBoolean(ai.notrack.app.R.bool.abc_action_bar_embed_tabs));
            }
        }
        bj bjVarA = bj.a();
        Context context = ziVar.s;
        synchronized (bjVarA) {
            x53 x53Var = bjVarA.a;
            synchronized (x53Var) {
                j82 j82Var = (j82) x53Var.b.get(context);
                if (j82Var != null) {
                    j82Var.a();
                }
            }
        }
        ziVar.Y = new Configuration(ziVar.s.getResources().getConfiguration());
        ziVar.q(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.qg0, defpackage.pg0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.D.e(f32.ON_CREATE);
        nd1 nd1Var = ((zc1) this.C.c).x;
        nd1Var.H = false;
        nd1Var.I = false;
        nd1Var.O.g = false;
        nd1Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        bd1 bd1Var = (bd1) ((zc1) this.C.c).x.f.onCreateView(view, str, context, attributeSet);
        return bd1Var == null ? super.onCreateView(view, str, context, attributeSet) : bd1Var;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        bd1 bd1Var = (bd1) ((zc1) this.C.c).x.f.onCreateView(null, str, context, attributeSet);
        return bd1Var == null ? super.onCreateView(str, context, attributeSet) : bd1Var;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        o();
        m().h();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.qg0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentR;
        if (!p(i, menuItem)) {
            zi ziVar = (zi) m();
            ziVar.D();
            zf4 zf4Var = ziVar.v;
            if (menuItem.getItemId() != 16908332 || zf4Var == null || (((o44) zf4Var.e).b & 4) == 0 || (intentR = xp1.r(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentR)) {
                navigateUpTo(intentR);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentR2 = xp1.r(this);
            if (intentR2 == null) {
                intentR2 = xp1.r(this);
            }
            if (intentR2 != null) {
                ComponentName component = intentR2.getComponent();
                if (component == null) {
                    component = intentR2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentS = xp1.s(this, component);
                    while (intentS != null) {
                        arrayList.add(size, intentS);
                        intentS = xp1.s(this, intentS.getComponent());
                    }
                    arrayList.add(intentR2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                u41.r("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.F = false;
        ((zc1) this.C.c).x.u(5);
        this.D.e(f32.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((zi) m()).z();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        q();
        zi ziVar = (zi) m();
        ziVar.D();
        zf4 zf4Var = ziVar.v;
        if (zf4Var != null) {
            zf4Var.t = true;
        }
    }

    @Override // defpackage.qg0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.C.r();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        sz0 sz0Var = this.C;
        sz0Var.r();
        super.onResume();
        this.F = true;
        ((zc1) sz0Var.c).x.A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        r();
        ((zi) m()).q(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.C.r();
    }

    @Override // android.app.Activity
    public final void onStop() {
        s();
        zi ziVar = (zi) m();
        ziVar.D();
        zf4 zf4Var = ziVar.v;
        if (zf4Var != null) {
            zf4Var.t = false;
            qd4 qd4Var = zf4Var.s;
            if (qd4Var != null) {
                qd4Var.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m().o(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((zi) m()).D();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final boolean p(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((zc1) this.C.c).x.j();
        }
        return false;
    }

    public final void q() {
        super.onPostResume();
        this.D.e(f32.ON_RESUME);
        nd1 nd1Var = ((zc1) this.C.c).x;
        nd1Var.H = false;
        nd1Var.I = false;
        nd1Var.O.g = false;
        nd1Var.u(7);
    }

    public final void r() {
        sz0 sz0Var = this.C;
        sz0Var.r();
        zc1 zc1Var = (zc1) sz0Var.c;
        super.onStart();
        this.G = false;
        if (!this.E) {
            this.E = true;
            nd1 nd1Var = zc1Var.x;
            nd1Var.H = false;
            nd1Var.I = false;
            nd1Var.O.g = false;
            nd1Var.u(4);
        }
        zc1Var.x.A(true);
        this.D.e(f32.ON_START);
        nd1 nd1Var2 = zc1Var.x;
        nd1Var2.H = false;
        nd1Var2.I = false;
        nd1Var2.O.g = false;
        nd1Var2.u(5);
    }

    public final void s() {
        sz0 sz0Var;
        super.onStop();
        this.G = true;
        do {
            sz0Var = this.C;
        } while (n(((zc1) sz0Var.c).x));
        nd1 nd1Var = ((zc1) sz0Var.c).x;
        nd1Var.I = true;
        nd1Var.O.g = true;
        nd1Var.u(4);
        this.D.e(f32.ON_STOP);
    }

    @Override // defpackage.qg0, android.app.Activity
    public final void setContentView(int i) {
        k();
        m().k(i);
    }

    @Override // defpackage.qg0, android.app.Activity
    public void setContentView(View view) {
        k();
        m().m(view);
    }

    @Override // defpackage.qg0, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        m().n(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((zi) m()).a0 = i;
    }
}
