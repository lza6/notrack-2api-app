package androidx.compose.ui.platform;

import android.view.View;
import defpackage.ck2;
import defpackage.dc4;
import defpackage.mk2;
import defpackage.sc4;
import defpackage.so0;
import defpackage.vl;
import defpackage.zc4;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollInteropConnection implements ck2 {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final mk2 nestedScrollChildHelper;
    private final View view;

    public NestedScrollInteropConnection(View view) {
        this.view = view;
        mk2 mk2Var = new mk2(view);
        if (mk2Var.d) {
            WeakHashMap weakHashMap = zc4.a;
            sc4.j(view);
        }
        mk2Var.d = true;
        this.nestedScrollChildHelper = mk2Var;
        this.consumedScrollCache = new int[2];
        WeakHashMap weakHashMap2 = zc4.a;
        sc4.h(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.f(0)) {
            this.nestedScrollChildHelper.h(0);
        }
        if (this.nestedScrollChildHelper.f(1)) {
            this.nestedScrollChildHelper.h(1);
        }
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    public Object mo111x5577af55(long j, long j2, so0 so0Var) {
        if (!this.nestedScrollChildHelper.a(NestedScrollInteropConnectionKt.toViewVelocity(dc4.b(j2)), NestedScrollInteropConnectionKt.toViewVelocity(dc4.c(j2)), true)) {
            j2 = 0;
        }
        interruptOngoingScrolls();
        return new dc4(j2);
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo112x75b18a1d(long j, long j2, int i) {
        if (!this.nestedScrollChildHelper.g(NestedScrollInteropConnectionKt.m118x4e34934f(j2), NestedScrollInteropConnectionKt.m120xaf982006(i))) {
            return 0L;
        }
        vl.q0(this.consumedScrollCache, 0);
        this.nestedScrollChildHelper.d(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j & 4294967295L))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j2 >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j2 & 4294967295L))), null, NestedScrollInteropConnectionKt.m120xaf982006(i), this.consumedScrollCache);
        return NestedScrollInteropConnectionKt.m119xb0cbdab(this.consumedScrollCache, j2);
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo113x43e5835a(long j, so0 so0Var) {
        if (!this.nestedScrollChildHelper.b(NestedScrollInteropConnectionKt.toViewVelocity(dc4.b(j)), NestedScrollInteropConnectionKt.toViewVelocity(dc4.c(j)))) {
            j = 0;
        }
        interruptOngoingScrolls();
        return new dc4(j);
    }

    @Override // defpackage.ck2
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo114x38849c55(long j, int i) {
        if (!this.nestedScrollChildHelper.g(NestedScrollInteropConnectionKt.m118x4e34934f(j), NestedScrollInteropConnectionKt.m120xaf982006(i))) {
            return 0L;
        }
        vl.q0(this.consumedScrollCache, 0);
        this.nestedScrollChildHelper.c(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (4294967295L & j))), NestedScrollInteropConnectionKt.m120xaf982006(i), this.consumedScrollCache, null);
        return NestedScrollInteropConnectionKt.m119xb0cbdab(this.consumedScrollCache, j);
    }
}
