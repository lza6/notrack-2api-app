package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer$Companion;
import defpackage.ck0;
import defpackage.g13;
import defpackage.hq0;
import defpackage.kk0;
import defpackage.ne1;
import defpackage.o13;
import defpackage.sf3;
import defpackage.so0;
import defpackage.su2;
import defpackage.u41;
import defpackage.un3;
import defpackage.uo0;
import defpackage.vr0;
import defpackage.w33;
import defpackage.w84;
import defpackage.ww1;
import defpackage.y64;
import defpackage.yk0;
import defpackage.yo4;
import defpackage.yr2;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformTextInputModifierNodeKt {
    private static final o13 LocalChainedPlatformTextInputInterceptor = new un3(PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1.INSTANCE);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements ne1 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ ne1 $content;
        final /* synthetic */ PlatformTextInputInterceptor $interceptor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlatformTextInputInterceptor platformTextInputInterceptor, ne1 ne1Var, int i) {
            super(2);
            this.$interceptor = platformTextInputInterceptor;
            this.$content = ne1Var;
            this.$$changed = i;
        }

        @Override // defpackage.ne1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ck0) obj, ((Number) obj2).intValue());
            return w84.a;
        }

        public final void invoke(ck0 ck0Var, int i) {
            PlatformTextInputModifierNodeKt.InterceptPlatformTextInput(this.$interceptor, this.$content, ck0Var, sf3.V(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1, reason: invalid class name and case insensitive filesystem */
    @vr0(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {136}, m = "establishTextInputSession")
    public static final class C00111 extends uo0 {
        int label;
        /* synthetic */ Object result;

        public C00111(so0 so0Var) {
            super(so0Var);
        }

        @Override // defpackage.wr
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1, reason: invalid class name and case insensitive filesystem */
    @vr0(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {184, 186}, m = "interceptedTextInputSession")
    public static final class C00121 extends uo0 {
        int label;
        /* synthetic */ Object result;

        public C00121(so0 so0Var) {
            super(so0Var);
        }

        @Override // defpackage.wr
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PlatformTextInputModifierNodeKt.interceptedTextInputSession(null, null, null, this);
        }
    }

    public static final void InterceptPlatformTextInput(PlatformTextInputInterceptor platformTextInputInterceptor, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1315007550);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? kk0Var.h(platformTextInputInterceptor) : kk0Var.j(platformTextInputInterceptor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            o13 o13Var = LocalChainedPlatformTextInputInterceptor;
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) kk0Var.l(o13Var);
            boolean zH = kk0Var.h(chainedPlatformTextInputInterceptor);
            Object objP = kk0Var.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                objP = new ChainedPlatformTextInputInterceptor(platformTextInputInterceptor, chainedPlatformTextInputInterceptor);
                kk0Var.l0(objP);
            }
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor2 = (ChainedPlatformTextInputInterceptor) objP;
            chainedPlatformTextInputInterceptor2.updateInterceptor(platformTextInputInterceptor);
            yk0.CompositionLocalProvider(o13Var.c(chainedPlatformTextInputInterceptor2), ne1Var, kk0Var, (i2 & 112) | 8);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new AnonymousClass1(platformTextInputInterceptor, ne1Var, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object establishTextInputSession(PlatformTextInputModifierNode platformTextInputModifierNode, ne1 ne1Var, so0 so0Var) throws Throwable {
        C00111 c00111;
        if (so0Var instanceof C00111) {
            c00111 = (C00111) so0Var;
            int i = c00111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00111.label = i - Integer.MIN_VALUE;
            } else {
                c00111 = new C00111(so0Var);
            }
        } else {
            c00111 = new C00111(so0Var);
        }
        Object obj = c00111.result;
        int i2 = c00111.label;
        if (i2 == 0) {
            g13.O(obj);
            if (!platformTextInputModifierNode.getNode().isAttached()) {
                u41.k("establishTextInputSession called from an unattached node");
                return null;
            }
            yr2 yr2VarN = y64.N(platformTextInputModifierNode);
            androidx.compose.runtime.a aVar = y64.M(platformTextInputModifierNode).J;
            o13 o13Var = LocalChainedPlatformTextInputInterceptor;
            su2 su2Var = (su2) aVar;
            su2Var.getClass();
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) yo4.O(su2Var, o13Var);
            c00111.label = 1;
            Object objInterceptedTextInputSession = interceptedTextInputSession(yr2VarN, chainedPlatformTextInputInterceptor, ne1Var, c00111);
            hq0 hq0Var = hq0.c;
            if (objInterceptedTextInputSession == hq0Var) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r5.textInputSession(r7, r0) == r8) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r6.textInputSession(r5, r7, r0) == r8) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object interceptedTextInputSession(defpackage.yr2 r5, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r6, defpackage.ne1 r7, defpackage.so0 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.C00121
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.C00121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2f
            if (r1 == r3) goto L2b
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r5)
            return r2
        L2b:
            defpackage.g13.O(r8)
            goto L50
        L2f:
            defpackage.g13.O(r8)
            goto L43
        L33:
            defpackage.g13.O(r8)
            hq0 r8 = defpackage.hq0.c
            if (r6 != 0) goto L47
            r0.label = r4
            java.lang.Object r5 = r5.textInputSession(r7, r0)
            if (r5 != r8) goto L43
            goto L4f
        L43:
            defpackage.u41.p()
            return r2
        L47:
            r0.label = r3
            java.lang.Object r5 = r6.textInputSession(r5, r7, r0)
            if (r5 != r8) goto L50
        L4f:
            return r8
        L50:
            defpackage.u41.p()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.interceptedTextInputSession(yr2, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor, ne1, so0):java.lang.Object");
    }
}
