package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ma2 extends ww1 implements le1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ je1 h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ ta2 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ le1 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ uz3 q;
    public final /* synthetic */ lz3 r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma2(boolean z, boolean z2, je1 je1Var, boolean z3, ta2 ta2Var, String str, le1 le1Var, int i, uz3 uz3Var, lz3 lz3Var, long j) {
        super(1);
        this.c = z;
        this.d = z2;
        this.h = je1Var;
        this.l = z3;
        this.m = ta2Var;
        this.n = str;
        this.o = le1Var;
        this.p = i;
        this.q = uz3Var;
        this.r = lz3Var;
        this.s = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        String str;
        jr0 jr0Var = (jr0) obj;
        jr0Var.getClass();
        jr0Var.i();
        uz3 uz3Var = this.q;
        long jB = uz3Var.b();
        xs2 xs2Var = uz3Var.b;
        em3 em3Var = uz3Var.a;
        if (jB == re0.i) {
            jB = this.s;
        }
        jr0Var.setTextColor(gb2.X(jB));
        long j = em3Var.b;
        gc1 gc1Var = em3Var.d;
        ic1 ic1Var = em3Var.c;
        lb1 lb1Var = em3Var.f;
        jr0Var.setTextSize(2, yz3.c(j));
        long j2 = xs2Var.c;
        if ((1095216660480L & j2) == 4294967296L) {
            yo4.W(jr0Var, (int) TypedValue.applyDimension(2, yz3.c(j2), jr0Var.getContext().getResources().getDisplayMetrics()));
        }
        if (kr1.n(em3Var.m, tt3.d)) {
            jr0Var.setPaintFlags(16);
        }
        lz3 lz3Var = this.r;
        if (lz3Var != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                int iX = gb2.X(lz3Var.a);
                Drawable textSelectHandleLeft = jr0Var.getTextSelectHandleLeft();
                if (textSelectHandleLeft != null) {
                    textSelectHandleLeft.setTint(iX);
                }
                Drawable textSelectHandleRight = jr0Var.getTextSelectHandleRight();
                if (textSelectHandleRight != null) {
                    textSelectHandleRight.setTint(iX);
                }
                Drawable textSelectHandle = jr0Var.getTextSelectHandle();
                if (textSelectHandle != null) {
                    textSelectHandle.setTint(iX);
                }
            }
            jr0Var.setHighlightColor(gb2.X(lz3Var.b));
        }
        int i = xs2Var.a;
        int i2 = 8388611;
        if (i != 1 && i != 5) {
            if (i == 2 || i == 6) {
                i2 = 8388613;
            } else if (i == 3) {
                i2 = 1;
            }
        }
        jr0Var.setGravity(i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29 && i == 4) {
            jr0Var.setJustificationMode(1);
        }
        if (lb1Var != null) {
            Context context = jr0Var.getContext();
            context.getClass();
            mb1 mb1VarV = gb2.v(context);
            ic1 ic1Var2 = ic1Var == null ? ic1.h : ic1Var;
            int i4 = gc1Var != null ? gc1Var.a : 0;
            hc1 hc1Var = em3Var.e;
            jr0Var.setTypeface((Typeface) mb1VarV.b(lb1Var, ic1Var2, i4, hc1Var != null ? hc1Var.a : 65535).c);
        }
        if (gc1Var != null) {
            jr0Var.setTypeface(jr0Var.getTypeface(), gc1Var.a == 1 ? 2 : 0);
        }
        if (ic1Var != null) {
            if (i3 >= 28) {
                jr0Var.setTypeface(Typeface.create(jr0Var.getTypeface(), ic1Var.c, false));
            } else {
                jr0Var.setTypeface(jr0Var.getTypeface(), ic1Var.equals(ic1.o) ? true : ic1Var.equals(ic1.n) ? 1 : ic1Var.equals(ic1.m));
            }
        }
        jr0Var.setWrapMultilineTextWidth(this.c);
        jr0Var.setTextIsSelectable(this.d);
        jr0Var.setOnBlockClickListener(this.h);
        boolean z = this.l;
        jr0Var.setLinkClicksEnabled(!z);
        ta2 ta2Var = this.m;
        List list = ta2Var.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).getClass();
        }
        ir3 ir3Var = ta2Var.a;
        ix0 ix0Var = new ix0((ArrayList) ir3Var.c, (rn0) ir3Var.h, (ArrayList) ir3Var.d);
        int i5 = 0;
        while (true) {
            str = this.n;
            int length = str.length();
            int i6 = i5;
            while (true) {
                if (i6 >= length) {
                    i6 = -1;
                    break;
                }
                char cCharAt = str.charAt(i6);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i6++;
            }
            if (i6 == -1) {
                break;
            }
            ix0Var.i(str.substring(i5, i6));
            int i7 = i6 + 1;
            i5 = (i7 < str.length() && str.charAt(i6) == '\r' && str.charAt(i7) == '\n') ? i6 + 2 : i7;
        }
        if (str.length() > 0 && (i5 == 0 || i5 < str.length())) {
            ix0Var.i(str.substring(i5));
        }
        ix0Var.f(ix0Var.n);
        fy2 fy2Var = new fy2(ix0Var.k, ix0Var.m);
        ix0Var.j.getClass();
        vo1 vo1Var = new vo1(fy2Var);
        Iterator it2 = ix0Var.o.iterator();
        while (it2.hasNext()) {
            ((i) it2.next()).g(vo1Var);
        }
        gx0 gx0Var = (gx0) ix0Var.l.b;
        ArrayList arrayList = (ArrayList) ir3Var.l;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj2 = arrayList.get(i8);
            i8++;
            ((at3) obj2).getClass();
            new zs3().z(gx0Var);
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((f0) it3.next()).c();
        }
        fy2 fy2Var2 = ta2Var.b;
        ua2 ua2Var = (ua2) fy2Var2.c;
        pa2 pa2Var = (pa2) fy2Var2.d;
        ua2 ua2Var2 = new ua2(2);
        new bg1(25);
        jm3 jm3Var = new jm3();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(ua2Var.a);
        ir3 ir3Var2 = new ir3();
        ir3Var2.c = pa2Var;
        ir3Var2.d = ua2Var2;
        ir3Var2.h = jm3Var;
        ir3Var2.l = mapUnmodifiableMap;
        ir3Var2.z(gx0Var);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            ((f0) it4.next()).a(ir3Var2);
        }
        jm3 jm3Var2 = (jm3) ir3Var2.h;
        SpannableStringBuilder hm3Var = new hm3(jm3Var2.c);
        for (gm3 gm3Var : jm3Var2.d) {
            hm3Var.setSpan(gm3Var.a, gm3Var.b, gm3Var.c, gm3Var.d);
        }
        if (TextUtils.isEmpty(hm3Var) && !TextUtils.isEmpty(str)) {
            hm3Var = new SpannableStringBuilder(str);
        }
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            ((f0) it5.next()).d(jr0Var, hm3Var);
        }
        jr0Var.setText(hm3Var, TextView.BufferType.SPANNABLE);
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            ((f0) it6.next()).b(jr0Var);
        }
        jr0Var.setMovementMethod(z ? null : LinkMovementMethod.getInstance());
        le1 le1Var = this.o;
        if (le1Var != null) {
            jr0Var.post(new ba(le1Var, 9, jr0Var));
        }
        jr0Var.setMaxLines(this.p);
        return w84.a;
    }
}
