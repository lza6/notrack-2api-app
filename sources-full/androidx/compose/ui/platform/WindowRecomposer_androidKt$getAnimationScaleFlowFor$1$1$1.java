package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import defpackage.l81;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.so0;
import defpackage.vr0;
import defpackage.w20;
import defpackage.w84;

/* JADX INFO: loaded from: classes.dex */
@vr0(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {114, 121}, m = "invokeSuspend")
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends mq3 implements ne1 {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ w20 $channel;
    final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, w20 w20Var, Context context, so0 so0Var) {
        super(2, so0Var);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.$channel = w20Var;
        this.$applicationContext = context;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, so0Var);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // defpackage.ne1
    public final Object invoke(l81 l81Var, so0 so0Var) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(l81Var, so0Var)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:18:0x0045, B:22:0x0055, B:24:0x005d, B:14:0x002a, B:17:0x003f), top: B:31:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r4.emit(r5, r8) == r3) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 2
            r2 = 1
            hq0 r3 = defpackage.hq0.c
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L22
            if (r0 != r1) goto L1b
            java.lang.Object r0 = r8.L$1
            gy r0 = (defpackage.gy) r0
            java.lang.Object r4 = r8.L$0
            l81 r4 = (defpackage.l81) r4
            defpackage.g13.O(r9)     // Catch: java.lang.Throwable -> L19
        L17:
            r9 = r4
            goto L45
        L19:
            r9 = move-exception
            goto L8a
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r8)
            r8 = 0
            return r8
        L22:
            java.lang.Object r0 = r8.L$1
            gy r0 = (defpackage.gy) r0
            java.lang.Object r4 = r8.L$0
            l81 r4 = (defpackage.l81) r4
            defpackage.g13.O(r9)     // Catch: java.lang.Throwable -> L19
            goto L55
        L2e:
            defpackage.g13.O(r9)
            java.lang.Object r9 = r8.L$0
            l81 r9 = (defpackage.l81) r9
            android.content.ContentResolver r0 = r8.$resolver
            android.net.Uri r4 = r8.$animationScaleUri
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r6 = r8.$contentObserver
            r0.registerContentObserver(r4, r5, r6)
            w20 r0 = r8.$channel     // Catch: java.lang.Throwable -> L19
            gy r0 = r0.iterator()     // Catch: java.lang.Throwable -> L19
        L45:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r0     // Catch: java.lang.Throwable -> L19
            r8.label = r2     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r0.b(r8)     // Catch: java.lang.Throwable -> L19
            if (r4 != r3) goto L52
            goto L7f
        L52:
            r7 = r4
            r4 = r9
            r9 = r7
        L55:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L80
            r0.c()     // Catch: java.lang.Throwable -> L19
            android.content.Context r9 = r8.$applicationContext     // Catch: java.lang.Throwable -> L19
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "animator_duration_scale"
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L19
            java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L19
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r4     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r0     // Catch: java.lang.Throwable -> L19
            r8.label = r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r4.emit(r5, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r3) goto L17
        L7f:
            return r3
        L80:
            android.content.ContentResolver r9 = r8.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r8 = r8.$contentObserver
            r9.unregisterContentObserver(r8)
            w84 r8 = defpackage.w84.a
            return r8
        L8a:
            android.content.ContentResolver r0 = r8.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r8 = r8.$contentObserver
            r0.unregisterContentObserver(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
