package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.g13;
import defpackage.gm4;
import defpackage.gq0;
import defpackage.hg3;
import defpackage.hq0;
import defpackage.iw2;
import defpackage.je1;
import defpackage.le1;
import defpackage.ly3;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.py3;
import defpackage.qb;
import defpackage.so0;
import defpackage.t00;
import defpackage.u41;
import defpackage.uo0;
import defpackage.vr0;
import defpackage.w84;
import defpackage.ww1;
import defpackage.xp0;
import defpackage.yo4;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, gq0 {
    public static final int $stable = 8;
    private final gq0 coroutineScope;
    private final AtomicReference methodSessionMutex = new AtomicReference(null);
    private final ly3 textInputService;
    private final View view;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1, reason: invalid class name */
    @vr0(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {71}, m = "startInputMethod")
    public static final class AnonymousClass1 extends uo0 {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(so0 so0Var) {
            super(so0Var);
        }

        @Override // defpackage.wr
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidPlatformTextInputSession.this.startInputMethod(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ww1 implements le1 {
        final /* synthetic */ PlatformTextInputMethodRequest $request;
        final /* synthetic */ AndroidPlatformTextInputSession this$0;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ww1 implements je1 {
            final /* synthetic */ AndroidPlatformTextInputSession this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidPlatformTextInputSession androidPlatformTextInputSession) {
                super(0);
                this.this$0 = androidPlatformTextInputSession;
            }

            @Override // defpackage.je1
            public /* bridge */ /* synthetic */ Object invoke() {
                m50invoke();
                return w84.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m50invoke() {
                yo4.l(this.this$0.coroutineScope, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlatformTextInputMethodRequest platformTextInputMethodRequest, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
            super(1);
            this.$request = platformTextInputMethodRequest;
            this.this$0 = androidPlatformTextInputSession;
        }

        @Override // defpackage.le1
        public final InputMethodSession invoke(gq0 gq0Var) {
            return new InputMethodSession(this.$request, new AnonymousClass1(this.this$0));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3, reason: invalid class name */
    @vr0(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends mq3 implements ne1 {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass3(so0 so0Var) {
            super(2, so0Var);
        }

        @Override // defpackage.wr
        public final so0 create(Object obj, so0 so0Var) {
            AnonymousClass3 anonymousClass3 = AndroidPlatformTextInputSession.this.new AnonymousClass3(so0Var);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.ne1
        public final Object invoke(InputMethodSession inputMethodSession, so0 so0Var) {
            return ((AnonymousClass3) create(inputMethodSession, so0Var)).invokeSuspend(w84.a);
        }

        @Override // defpackage.wr
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                g13.O(obj);
                InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
                AndroidPlatformTextInputSession androidPlatformTextInputSession = AndroidPlatformTextInputSession.this;
                this.L$0 = inputMethodSession;
                this.L$1 = androidPlatformTextInputSession;
                this.label = 1;
                t00 t00Var = new t00(1, gm4.G(this));
                t00Var.u();
                ly3 ly3Var = androidPlatformTextInputSession.textInputService;
                iw2 iw2Var = ly3Var.a;
                iw2Var.b();
                ly3Var.b.set(new py3(ly3Var, iw2Var));
                t00Var.w(new AndroidPlatformTextInputSession$startInputMethod$3$1$1(inputMethodSession, androidPlatformTextInputSession));
                Object objS = t00Var.s();
                hq0 hq0Var = hq0.c;
                if (objS == hq0Var) {
                    return hq0Var;
                }
            } else {
                if (i != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
            }
            u41.p();
            return null;
        }
    }

    public AndroidPlatformTextInputSession(View view, ly3 ly3Var, gq0 gq0Var) {
        this.view = view;
        this.textInputService = ly3Var;
        this.coroutineScope = gq0Var;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        hg3 hg3Var = (hg3) this.methodSessionMutex.get();
        InputMethodSession inputMethodSession = (InputMethodSession) (hg3Var != null ? hg3Var.b : null);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSessionScope, defpackage.gq0
    public xp0 getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        hg3 hg3Var = (hg3) this.methodSessionMutex.get();
        InputMethodSession inputMethodSession = (InputMethodSession) (hg3Var != null ? hg3Var.b : null);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public Object startInputMethod(PlatformTextInputMethodRequest platformTextInputMethodRequest, so0 so0Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (so0Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) so0Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(so0Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(so0Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            g13.O(obj);
            AtomicReference atomicReference = this.methodSessionMutex;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
            anonymousClass1.label = 1;
            Object objQ = yo4.q(new qb(new AnonymousClass2(platformTextInputMethodRequest, this), atomicReference, anonymousClass3, (so0) null, 18), anonymousClass1);
            hq0 hq0Var = hq0.c;
            if (objQ == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        u41.p();
        return null;
    }
}
