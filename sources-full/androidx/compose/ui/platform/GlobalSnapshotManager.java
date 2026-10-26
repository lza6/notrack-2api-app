package androidx.compose.ui.platform;

import defpackage.gm4;
import defpackage.gq0;
import defpackage.jy;
import defpackage.ke0;
import defpackage.le1;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.py;
import defpackage.so0;
import defpackage.vk3;
import defpackage.vr0;
import defpackage.w20;
import defpackage.w84;
import defpackage.ww1;
import defpackage.yo4;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1, reason: invalid class name */
    @vr0(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends mq3 implements ne1 {
        final /* synthetic */ w20 $channel;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(w20 w20Var, so0 so0Var) {
            super(2, so0Var);
            this.$channel = w20Var;
        }

        @Override // defpackage.wr
        public final so0 create(Object obj, so0 so0Var) {
            return new AnonymousClass1(this.$channel, so0Var);
        }

        @Override // defpackage.ne1
        public final Object invoke(gq0 gq0Var, so0 so0Var) {
            return ((AnonymousClass1) create(gq0Var, so0Var)).invokeSuspend(w84.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0034 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:6:0x0012, B:17:0x0035, B:19:0x003d, B:20:0x004d, B:26:0x005b, B:14:0x0028, B:28:0x005e, B:30:0x0063, B:31:0x0064, B:13:0x0023, B:21:0x004e, B:23:0x0054), top: B:45:0x0006, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0054 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {, blocks: (B:21:0x004e, B:23:0x0054), top: B:43:0x004e, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x005e A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:6:0x0012, B:17:0x0035, B:19:0x003d, B:20:0x004d, B:26:0x005b, B:14:0x0028, B:28:0x005e, B:30:0x0063, B:31:0x0064, B:13:0x0023, B:21:0x004e, B:23:0x0054), top: B:45:0x0006, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0032 -> B:17:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.wr
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                hq0 r0 = defpackage.hq0.c
                int r1 = r7.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 != r3) goto L18
                java.lang.Object r1 = r7.L$1
                gy r1 = (defpackage.gy) r1
                java.lang.Object r4 = r7.L$0
                w20 r4 = (defpackage.w20) r4
                defpackage.g13.O(r8)     // Catch: java.lang.Throwable -> L16
                goto L35
            L16:
                r7 = move-exception
                goto L6b
            L18:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.u41.r(r7)
                return r2
            L1e:
                defpackage.g13.O(r8)
                w20 r4 = r7.$channel
                gy r8 = r4.iterator()     // Catch: java.lang.Throwable -> L16
                r1 = r8
            L28:
                r7.L$0 = r4     // Catch: java.lang.Throwable -> L16
                r7.L$1 = r1     // Catch: java.lang.Throwable -> L16
                r7.label = r3     // Catch: java.lang.Throwable -> L16
                java.lang.Object r8 = r1.b(r7)     // Catch: java.lang.Throwable -> L16
                if (r8 != r0) goto L35
                return r0
            L35:
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L16
                boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L16
                if (r8 == 0) goto L65
                java.lang.Object r8 = r1.c()     // Catch: java.lang.Throwable -> L16
                w84 r8 = (defpackage.w84) r8     // Catch: java.lang.Throwable -> L16
                java.util.concurrent.atomic.AtomicBoolean r8 = androidx.compose.ui.platform.GlobalSnapshotManager.access$getSent$p()     // Catch: java.lang.Throwable -> L16
                r5 = 0
                r8.set(r5)     // Catch: java.lang.Throwable -> L16
                java.lang.Object r8 = defpackage.vk3.b     // Catch: java.lang.Throwable -> L16
                monitor-enter(r8)     // Catch: java.lang.Throwable -> L16
                rf1 r6 = defpackage.vk3.i     // Catch: java.lang.Throwable -> L62
                gi2 r6 = r6.h     // Catch: java.lang.Throwable -> L62
                if (r6 == 0) goto L5b
                boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L62
                if (r6 != r3) goto L5b
                r5 = r3
            L5b:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
                if (r5 == 0) goto L28
                defpackage.vk3.a()     // Catch: java.lang.Throwable -> L16
                goto L28
            L62:
                r7 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
                throw r7     // Catch: java.lang.Throwable -> L16
            L65:
                r4.c(r2)
                w84 r7 = defpackage.w84.a
                return r7
            L6b:
                throw r7     // Catch: java.lang.Throwable -> L6c
            L6c:
                r8 = move-exception
                boolean r0 = r7 instanceof java.util.concurrent.CancellationException
                if (r0 == 0) goto L74
                r2 = r7
                java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
            L74:
                if (r2 != 0) goto L80
                java.lang.String r0 = "Channel was consumed, consumer had failed"
                java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
                r2.<init>(r0)
                r2.initCause(r7)
            L80:
                r4.c(r2)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ww1 implements le1 {
        final /* synthetic */ w20 $channel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(w20 w20Var) {
            super(1);
            this.$channel = w20Var;
        }

        @Override // defpackage.le1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m78invoke(obj);
            return w84.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m78invoke(Object obj) {
            if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                this.$channel.i(w84.a);
            }
        }
    }

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            jy jyVarB = gm4.b(1, 6, null);
            py.F(yo4.a(AndroidUiDispatcher.Companion.getMain()), null, null, new AnonymousClass1(jyVarB, null), 3);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(jyVarB);
            synchronized (vk3.b) {
                vk3.h = ke0.I0(vk3.h, anonymousClass2);
            }
            vk3.a();
        }
    }
}
