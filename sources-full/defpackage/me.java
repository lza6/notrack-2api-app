package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class me extends ViewGroup implements ok2, vj0, zr2, wn2 {
    public le1 A;
    public final int[] B;
    public int C;
    public int D;
    public final h61 E;
    public boolean F;
    public final ux1 G;
    public final fk2 c;
    public final View d;
    public final yr2 h;
    public je1 l;
    public boolean m;
    public je1 n;
    public je1 o;
    public c p;
    public le1 q;
    public wu0 r;
    public le1 s;
    public n32 t;
    public u93 u;
    public final int[] v;
    public long w;
    public wg4 x;
    public final le y;
    public final le z;

    public me(Context context, qk0 qk0Var, int i, fk2 fk2Var, View view, yr2 yr2Var) {
        super(context);
        this.c = fk2Var;
        this.d = view;
        this.h = yr2Var;
        if (qk0Var != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, qk0Var);
        }
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        bd4 bd4Var = (bd4) this;
        zc4.j(this, new ee(bd4Var, i2));
        sc4.i(this, this);
        this.l = d4.q;
        this.n = d4.p;
        this.o = d4.o;
        Modifier$Companion modifier$Companion = c.i;
        this.p = modifier$Companion;
        this.r = sf3.a();
        int i3 = 2;
        this.v = new int[2];
        this.w = 0L;
        int i4 = 1;
        this.y = new le(bd4Var, i4);
        this.z = new le(bd4Var, i2);
        this.B = new int[2];
        this.C = Integer.MIN_VALUE;
        this.D = Integer.MIN_VALUE;
        this.E = new h61();
        ux1 ux1Var = new ux1(3);
        ux1Var.o = true;
        ux1Var.w = bd4Var;
        c cVarB = we3.b(a.a(modifier$Companion, jr1.a, fk2Var), true, v1.t);
        lx2 lx2Var = new lx2();
        lx2Var.c = new ge(bd4Var, i4);
        qa0 qa0Var = new qa0();
        qa0 qa0Var2 = lx2Var.d;
        if (qa0Var2 != null) {
            qa0Var2.d = null;
        }
        lx2Var.d = qa0Var;
        qa0Var.d = lx2Var;
        setOnRequestDisallowInterceptTouchEvent$ui_release(qa0Var);
        c cVarD = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(androidx.compose.ui.graphics.a.b(cVarB.then(lx2Var), 0.0f, 0.0f, 0.0f, null, false, 131071), new ie(bd4Var, ux1Var, bd4Var)), new fe(bd4Var, ux1Var, i3));
        ux1Var.Y(this.p.then(cVarD));
        this.q = new rc(ux1Var, i4, cVarD);
        ux1Var.V(this.r);
        this.s = new e8(i3, ux1Var);
        ux1Var.U = new fe(bd4Var, ux1Var, i2);
        ux1Var.V = new ge(bd4Var, i2);
        ux1Var.X(new he(bd4Var, ux1Var));
        this.G = ux1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final as2 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            po1.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.h.getSnapshotObserver();
    }

    public static final int l(bd4 bd4Var, int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(py.x(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static pp1 m(pp1 pp1Var, int i, int i2, int i3, int i4) {
        int i5 = pp1Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = pp1Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = pp1Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = pp1Var.d - i4;
        return pp1.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // defpackage.nk2
    public final void a(View view, View view2, int i, int i2) {
        h61 h61Var = this.E;
        if (i2 == 1) {
            h61Var.b = i;
        } else {
            h61Var.a = i;
        }
    }

    @Override // defpackage.nk2
    public final void b(View view, int i) {
        h61 h61Var = this.E;
        if (i == 1) {
            h61Var.b = 0;
        } else {
            h61Var.a = 0;
        }
    }

    @Override // defpackage.nk2
    public final void c(int i, int i2, int[] iArr, int i3) {
        if (this.d.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            ik2 ik2Var = this.c.a;
            ik2 ik2Var2 = null;
            if (ik2Var != null && ik2Var.isAttached()) {
                ik2Var2 = (ik2) gb2.E(ik2Var);
            }
            long jMo114x38849c55 = ik2Var2 != null ? ik2Var2.mo114x38849c55(jFloatToRawIntBits, i4) : 0L;
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jMo114x38849c55 >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jMo114x38849c55 & 4294967295L)));
        }
    }

    @Override // defpackage.vj0
    public final void d() {
        View view = this.d;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.n.invoke();
        }
    }

    @Override // defpackage.vj0
    public final void e() {
        this.o.invoke();
    }

    @Override // defpackage.wn2
    public final wg4 f(View view, wg4 wg4Var) {
        this.x = new wg4(wg4Var);
        return n(wg4Var);
    }

    @Override // defpackage.vj0
    public final void g() {
        this.n.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.B;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final wu0 getDensity() {
        return this.r;
    }

    public final View getInteropView() {
        return this.d;
    }

    public final ux1 getLayoutNode() {
        return this.G;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final n32 getLifecycleOwner() {
        return this.t;
    }

    public final c getModifier() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h61 h61Var = this.E;
        return h61Var.b | h61Var.a;
    }

    public final le1 getOnDensityChanged$ui_release() {
        return this.s;
    }

    public final le1 getOnModifierChanged$ui_release() {
        return this.q;
    }

    public final le1 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.A;
    }

    public final je1 getRelease() {
        return this.o;
    }

    public final je1 getReset() {
        return this.n;
    }

    public final u93 getSavedStateRegistryOwner() {
        return this.u;
    }

    public final je1 getUpdate() {
        return this.l;
    }

    public final View getView() {
        return this.d;
    }

    @Override // defpackage.ok2
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.d.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            ik2 ik2Var = this.c.a;
            ik2 ik2Var2 = null;
            if (ik2Var != null && ik2Var.isAttached()) {
                ik2Var2 = (ik2) gb2.E(ik2Var);
            }
            ik2 ik2Var3 = ik2Var2;
            long jMo112x75b18a1d = ik2Var3 != null ? ik2Var3.mo112x75b18a1d(jFloatToRawIntBits, jFloatToRawIntBits2, i6) : 0L;
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jMo112x75b18a1d >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jMo112x75b18a1d & 4294967295L)));
        }
    }

    @Override // defpackage.nk2
    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.d.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            ik2 ik2Var = this.c.a;
            ik2 ik2Var2 = null;
            if (ik2Var != null && ik2Var.isAttached()) {
                ik2Var2 = (ik2) gb2.E(ik2Var);
            }
            ik2 ik2Var3 = ik2Var2;
            if (ik2Var3 != null) {
                ik2Var3.mo112x75b18a1d(jFloatToRawIntBits, jFloatToRawIntBits2, i6);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.F) {
            this.G.A();
            return null;
        }
        this.d.postOnAnimation(new k4(this.z, 1));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.d.isNestedScrollingEnabled();
    }

    @Override // defpackage.zr2
    public final boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // defpackage.nk2
    public final boolean j(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public final wg4 n(wg4 wg4Var) {
        tg4 tg4Var = wg4Var.a;
        pp1 pp1VarG = tg4Var.g(-1);
        pp1 pp1Var = pp1.e;
        if (!pp1VarG.equals(pp1Var) || !tg4Var.h(-9).equals(pp1Var) || tg4Var.f() != null) {
            xo1 xo1Var = (xo1) this.G.N.c;
            if (xo1Var.z()) {
                long jM = g13.M(xo1Var.L(0L));
                int i = (int) (jM >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jM & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long J = y64.u(xo1Var).J();
                int i3 = (int) (J >> 32);
                int i4 = (int) (J & 4294967295L);
                long j = xo1Var.h;
                long jM2 = g13.M(xo1Var.L((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jM2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jM2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return wg4Var.a.n(i, i2, i5, i7);
                }
            }
        }
        return wg4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.F) {
            this.G.A();
        } else {
            this.d.postOnAnimation(new k4(this.z, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: all -> 0x0099, LOOP:1: B:14:0x0035->B:25:0x007b, LOOP_END, TryCatch #0 {all -> 0x0099, blocks: (B:4:0x000e, B:8:0x0018, B:26:0x0080, B:31:0x008b, B:36:0x009b, B:33:0x0090, B:11:0x0029, B:14:0x0035, B:16:0x004a, B:18:0x0056, B:20:0x0060, B:22:0x0070, B:25:0x007b, B:37:0x009f), top: B:42:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0080 A[EDGE_INSN: B:49:0x0080->B:26:0x0080 BREAK  A[LOOP:1: B:14:0x0035->B:25:0x007b], SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i;
        super.onDetachedFromWindow();
        ol3 ol3Var = getSnapshotObserver().a;
        synchronized (ol3Var.g) {
            try {
                oi2 oi2Var = ol3Var.f;
                int i2 = oi2Var.h;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = oi2Var.c;
                    if (i3 < i2) {
                        nl3 nl3Var = (nl3) objArr[i3];
                        rh2 rh2Var = (rh2) nl3Var.f.j(this);
                        if (rh2Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = rh2Var.b;
                            int[] iArr = rh2Var.c;
                            long[] jArr = rh2Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i5 != length) {
                                            break;
                                            break;
                                        } else {
                                            i5++;
                                            i3 = i;
                                        }
                                    } else {
                                        int i6 = 8;
                                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i5 << 3) + i8;
                                                Object obj = objArr2[i9];
                                                int i10 = iArr[i9];
                                                nl3Var.d(this, obj);
                                            }
                                            j >>= i6;
                                            i8++;
                                            i6 = i6;
                                        }
                                        if (i7 != i6) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!(nl3Var.f.e != 0)) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = oi2Var.c;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i11 = i2 - i4;
                        Arrays.fill(objArr, i11, i2, (Object) null);
                        oi2Var.h = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.d.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.d;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.C = i;
        this.D = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.d.isNestedScrollingEnabled()) {
            return false;
        }
        py.F(this.c.c(), null, null, new je(z, this, gm4.c(f * (-1.0f), f2 * (-1.0f)), (so0) null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.d.isNestedScrollingEnabled()) {
            return false;
        }
        py.F(this.c.c(), null, null, new ke(this, gm4.c(f * (-1.0f), f2 * (-1.0f)), null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        le1 le1Var = this.A;
        if (le1Var != null) {
            le1Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(wu0 wu0Var) {
        if (wu0Var != this.r) {
            this.r = wu0Var;
            le1 le1Var = this.s;
            if (le1Var != null) {
                le1Var.invoke(wu0Var);
            }
        }
    }

    public final void setLifecycleOwner(n32 n32Var) {
        if (n32Var != this.t) {
            this.t = n32Var;
            setTag(R.id.view_tree_lifecycle_owner, n32Var);
        }
    }

    public final void setModifier(c cVar) {
        if (cVar != this.p) {
            this.p = cVar;
            le1 le1Var = this.q;
            if (le1Var != null) {
                le1Var.invoke(cVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(le1 le1Var) {
        this.s = le1Var;
    }

    public final void setOnModifierChanged$ui_release(le1 le1Var) {
        this.q = le1Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(le1 le1Var) {
        this.A = le1Var;
    }

    public final void setRelease(je1 je1Var) {
        this.o = je1Var;
    }

    public final void setReset(je1 je1Var) {
        this.n = je1Var;
    }

    public final void setSavedStateRegistryOwner(u93 u93Var) {
        if (u93Var != this.u) {
            this.u = u93Var;
            setTag(R.id.view_tree_saved_state_registry_owner, u93Var);
        }
    }

    public final void setUpdate(je1 je1Var) {
        this.l = je1Var;
        this.m = true;
        this.y.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
