package defpackage;

import ai.notrack.app.R;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import app.template.extension.BuildConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.uuid.Uuid;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class nd1 {
    public final hd1 A;
    public final qn0 B;
    public e4 C;
    public e4 D;
    public e4 E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public qd1 O;
    public final im P;
    public boolean b;
    public ArrayList e;
    public go2 g;
    public final ArrayList n;
    public final bv0 o;
    public final CopyOnWriteArrayList p;
    public final dd1 q;
    public final dd1 r;
    public final dd1 s;
    public final dd1 t;
    public final gd1 u;
    public int v;
    public zc1 w;
    public yh4 x;
    public xc1 y;
    public xc1 z;
    public final ArrayList a = new ArrayList();
    public final ir3 c = new ir3(3);
    public ArrayList d = new ArrayList();
    public final cd1 f = new cd1(this);
    public er h = null;
    public boolean i = false;
    public final fd1 j = new fd1(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [dd1] */
    /* JADX WARN: Type inference failed for: r0v17, types: [dd1] */
    /* JADX WARN: Type inference failed for: r0v18, types: [dd1] */
    /* JADX WARN: Type inference failed for: r0v19, types: [dd1] */
    public nd1() {
        Collections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new bv0(this);
        this.p = new CopyOnWriteArrayList();
        final int i = 0;
        this.q = new dn0(this) { // from class: dd1
            public final /* synthetic */ nd1 b;

            {
                this.b = this;
            }

            @Override // defpackage.dn0
            public final void accept(Object obj) {
                int i2 = i;
                nd1 nd1Var = this.b;
                switch (i2) {
                    case 0:
                        if (nd1Var.M()) {
                            nd1Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (nd1Var.M() && num.intValue() == 80) {
                            nd1Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        wg2 wg2Var = (wg2) obj;
                        if (nd1Var.M()) {
                            boolean z = wg2Var.a;
                            nd1Var.n(false);
                        }
                        break;
                    default:
                        jv2 jv2Var = (jv2) obj;
                        if (nd1Var.M()) {
                            boolean z2 = jv2Var.a;
                            nd1Var.s(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.r = new dn0(this) { // from class: dd1
            public final /* synthetic */ nd1 b;

            {
                this.b = this;
            }

            @Override // defpackage.dn0
            public final void accept(Object obj) {
                int i3 = i2;
                nd1 nd1Var = this.b;
                switch (i3) {
                    case 0:
                        if (nd1Var.M()) {
                            nd1Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (nd1Var.M() && num.intValue() == 80) {
                            nd1Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        wg2 wg2Var = (wg2) obj;
                        if (nd1Var.M()) {
                            boolean z = wg2Var.a;
                            nd1Var.n(false);
                        }
                        break;
                    default:
                        jv2 jv2Var = (jv2) obj;
                        if (nd1Var.M()) {
                            boolean z2 = jv2Var.a;
                            nd1Var.s(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.s = new dn0(this) { // from class: dd1
            public final /* synthetic */ nd1 b;

            {
                this.b = this;
            }

            @Override // defpackage.dn0
            public final void accept(Object obj) {
                int i4 = i3;
                nd1 nd1Var = this.b;
                switch (i4) {
                    case 0:
                        if (nd1Var.M()) {
                            nd1Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (nd1Var.M() && num.intValue() == 80) {
                            nd1Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        wg2 wg2Var = (wg2) obj;
                        if (nd1Var.M()) {
                            boolean z = wg2Var.a;
                            nd1Var.n(false);
                        }
                        break;
                    default:
                        jv2 jv2Var = (jv2) obj;
                        if (nd1Var.M()) {
                            boolean z2 = jv2Var.a;
                            nd1Var.s(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.t = new dn0(this) { // from class: dd1
            public final /* synthetic */ nd1 b;

            {
                this.b = this;
            }

            @Override // defpackage.dn0
            public final void accept(Object obj) {
                int i5 = i4;
                nd1 nd1Var = this.b;
                switch (i5) {
                    case 0:
                        if (nd1Var.M()) {
                            nd1Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (nd1Var.M() && num.intValue() == 80) {
                            nd1Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        wg2 wg2Var = (wg2) obj;
                        if (nd1Var.M()) {
                            boolean z = wg2Var.a;
                            nd1Var.n(false);
                        }
                        break;
                    default:
                        jv2 jv2Var = (jv2) obj;
                        if (nd1Var.M()) {
                            boolean z2 = jv2Var.a;
                            nd1Var.s(false);
                        }
                        break;
                }
            }
        };
        this.u = new gd1(this);
        this.v = -1;
        this.A = new hd1(this);
        this.B = new qn0(12);
        this.F = new ArrayDeque();
        this.P = new im(6, this);
    }

    public static HashSet F(er erVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < erVar.a.size(); i++) {
            xc1 xc1Var = ((xd1) erVar.a.get(i)).b;
            if (xc1Var != null && erVar.g) {
                hashSet.add(xc1Var);
            }
        }
        return hashSet;
    }

    public static boolean K(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean L(xc1 xc1Var) {
        xc1Var.getClass();
        ArrayList arrayListS = xc1Var.D.c.S();
        int size = arrayListS.size();
        boolean zL = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            xc1 xc1Var2 = (xc1) obj;
            if (xc1Var2 != null) {
                zL = L(xc1Var2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(xc1 xc1Var) {
        if (xc1Var == null) {
            return true;
        }
        if (xc1Var.L) {
            return xc1Var.B == null || N(xc1Var.E);
        }
        return false;
    }

    public static boolean O(xc1 xc1Var) {
        if (xc1Var == null) {
            return true;
        }
        nd1 nd1Var = xc1Var.B;
        return xc1Var == nd1Var.z && O(nd1Var.y);
    }

    public static void e0(xc1 xc1Var) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + xc1Var);
        }
        if (xc1Var.I) {
            xc1Var.I = false;
            xc1Var.R = !xc1Var.R;
        }
    }

    public final boolean A(boolean z) {
        boolean zA;
        ArrayList arrayList;
        er erVar;
        z(z);
        if (!this.i && (erVar = this.h) != null) {
            erVar.r = false;
            erVar.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.e(false, false);
            this.a.add(0, this.h);
            ArrayList arrayList2 = this.h.a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                xc1 xc1Var = ((xd1) obj).b;
                if (xc1Var != null) {
                    xc1Var.u = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList3 = this.L;
            ArrayList arrayList4 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.a.size();
                        int i2 = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i2 >= size2) {
                                break;
                            }
                            zA |= ((kd1) arrayList.get(i2)).a(arrayList3, arrayList4);
                            i2++;
                            throw th;
                        }
                        arrayList.clear();
                        this.w.w.removeCallbacks(this.P);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.w.w.removeCallbacks(this.P);
                        throw th;
                    }
                }
            }
            if (!zA) {
                h0();
                v();
                ((HashMap) this.c.d).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                W(this.L, this.M);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x021c A[PHI: r15
  0x021c: PHI (r15v21 int) = (r15v20 int), (r15v23 int) binds: [B:103:0x0209, B:107:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        ir3 ir3Var = this.c;
        ArrayList arrayList3 = this.n;
        boolean z4 = ((er) arrayList.get(i)).o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(ir3Var.U());
        xc1 xc1Var = this.z;
        int i5 = i;
        boolean z5 = false;
        while (i5 < i2) {
            er erVar = (er) arrayList.get(i5);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i5)).booleanValue();
            ArrayList arrayList5 = this.N;
            if (zBooleanValue) {
                z = z4;
                i3 = i5;
                z2 = z5;
                int i6 = 1;
                ArrayList arrayList6 = erVar.a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    xd1 xd1Var = (xd1) arrayList6.get(size);
                    int i7 = xd1Var.a;
                    if (i7 != i6) {
                        if (i7 != 3) {
                            switch (i7) {
                                case 6:
                                    arrayList5.add(xd1Var.b);
                                    break;
                                case 8:
                                    xc1Var = null;
                                    break;
                                case 9:
                                    xc1Var = xd1Var.b;
                                    break;
                                case 10:
                                    xd1Var.i = xd1Var.h;
                                    break;
                            }
                        } else {
                            arrayList5.add(xd1Var.b);
                        }
                        size--;
                        i6 = 1;
                    }
                    arrayList5.remove(xd1Var.b);
                    size--;
                    i6 = 1;
                }
            } else {
                ArrayList arrayList7 = erVar.a;
                int i8 = 0;
                while (i8 < arrayList7.size()) {
                    xd1 xd1Var2 = (xd1) arrayList7.get(i8);
                    boolean z6 = z4;
                    int i9 = xd1Var2.a;
                    int i10 = i5;
                    int i11 = 1;
                    if (i9 != 1) {
                        z3 = z5;
                        if (i9 != 2) {
                            if (i9 == 3 || i9 == 6) {
                                arrayList5.remove(xd1Var2.b);
                                xc1 xc1Var2 = xd1Var2.b;
                                if (xc1Var2 == xc1Var) {
                                    arrayList7.add(i8, new xd1(9, xc1Var2));
                                    i8++;
                                    xc1Var = null;
                                }
                            } else if (i9 == 7) {
                                i11 = 1;
                            } else if (i9 == 8) {
                                arrayList7.add(i8, new xd1(9, xc1Var, 0));
                                xd1Var2.c = true;
                                i8++;
                                xc1Var = xd1Var2.b;
                            }
                            i11 = 1;
                        } else {
                            xc1 xc1Var3 = xd1Var2.b;
                            int i12 = xc1Var3.G;
                            int size2 = arrayList5.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i13 = size2;
                                xc1 xc1Var4 = (xc1) arrayList5.get(size2);
                                if (xc1Var4.G != i12) {
                                    i12 = i12;
                                } else if (xc1Var4 == xc1Var3) {
                                    i12 = i12;
                                    z7 = true;
                                } else {
                                    if (xc1Var4 == xc1Var) {
                                        arrayList7.add(i8, new xd1(9, xc1Var4, 0));
                                        i8++;
                                        i4 = 0;
                                        xc1Var = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    xd1 xd1Var3 = new xd1(3, xc1Var4, i4);
                                    xd1Var3.d = xd1Var2.d;
                                    xd1Var3.f = xd1Var2.f;
                                    xd1Var3.e = xd1Var2.e;
                                    xd1Var3.g = xd1Var2.g;
                                    arrayList7.add(i8, xd1Var3);
                                    arrayList5.remove(xc1Var4);
                                    i8++;
                                    xc1Var = xc1Var;
                                }
                                size2 = i13 - 1;
                                i12 = i12;
                            }
                            i11 = 1;
                            if (z7) {
                                arrayList7.remove(i8);
                                i8--;
                            } else {
                                xd1Var2.a = 1;
                                xd1Var2.c = true;
                                arrayList5.add(xc1Var3);
                            }
                        }
                        i8 += i11;
                        z4 = z6;
                        i5 = i10;
                        z5 = z3;
                    } else {
                        z3 = z5;
                    }
                    arrayList5.add(xd1Var2.b);
                    i8 += i11;
                    z4 = z6;
                    i5 = i10;
                    z5 = z3;
                }
                z = z4;
                i3 = i5;
                z2 = z5;
            }
            z5 = z2 || erVar.g;
            i5 = i3 + 1;
            z4 = z;
        }
        boolean z8 = z4;
        boolean z9 = z5;
        this.N.clear();
        if (!z8 && this.v >= 1) {
            for (int i14 = i; i14 < i2; i14++) {
                ArrayList arrayList8 = ((er) arrayList.get(i14)).a;
                int size3 = arrayList8.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList8.get(i15);
                    i15++;
                    xc1 xc1Var5 = ((xd1) obj).b;
                    if (xc1Var5 != null && xc1Var5.B != null) {
                        ir3Var.b0(g(xc1Var5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i;
        while (i16 < i2) {
            er erVar2 = (er) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                erVar2.c(-1);
                nd1 nd1Var = erVar2.q;
                ArrayList arrayList9 = erVar2.a;
                boolean z10 = true;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    xd1 xd1Var4 = (xd1) arrayList9.get(size4);
                    xc1 xc1Var6 = xd1Var4.b;
                    if (xc1Var6 != null) {
                        if (xc1Var6.Q != null) {
                            xc1Var6.f().a = z10;
                        }
                        int i17 = erVar2.f;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i18 = 4100;
                                if (i17 != 8197) {
                                    i19 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    } else {
                                        i18 = i19;
                                    }
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (xc1Var6.Q != null || i18 != 0) {
                            xc1Var6.f();
                            xc1Var6.Q.f = i18;
                        }
                        xc1Var6.f();
                        xc1Var6.Q.getClass();
                    }
                    switch (xd1Var4.a) {
                        case 1:
                            xc1Var6.G(xd1Var4.d, xd1Var4.e, xd1Var4.f, xd1Var4.g);
                            z10 = true;
                            nd1Var.a0(xc1Var6, true);
                            nd1Var.V(xc1Var6);
                            break;
                        case 2:
                        default:
                            m51.g(xd1Var4.a, str);
                            return;
                        case 3:
                            xc1Var6.G(xd1Var4.d, xd1Var4.e, xd1Var4.f, xd1Var4.g);
                            nd1Var.a(xc1Var6);
                            z10 = true;
                            break;
                        case 4:
                            xc1Var6.G(xd1Var4.d, xd1Var4.e, xd1Var4.f, xd1Var4.g);
                            nd1Var.getClass();
                            e0(xc1Var6);
                            z10 = true;
                            break;
                        case 5:
                            xc1Var6.G(xd1Var4.d, xd1Var4.e, xd1Var4.f, xd1Var4.g);
                            nd1Var.a0(xc1Var6, true);
                            nd1Var.J(xc1Var6);
                            z10 = true;
                            break;
                        case 6:
                            xc1Var6.G(xd1Var4.d, xd1Var4.e, xd1Var4.f, xd1Var4.g);
                            nd1Var.c(xc1Var6);
                            z10 = true;
                            break;
                        case 7:
                            xc1Var6.G(xd1Var4.d, xd1Var4.e, xd1Var4.f, xd1Var4.g);
                            nd1Var.a0(xc1Var6, true);
                            nd1Var.h(xc1Var6);
                            z10 = true;
                            break;
                        case 8:
                            nd1Var.c0(null);
                            z10 = true;
                            break;
                        case 9:
                            nd1Var.c0(xc1Var6);
                            z10 = true;
                            break;
                        case 10:
                            nd1Var.b0(xc1Var6, xd1Var4.h);
                            z10 = true;
                            break;
                    }
                }
            } else {
                erVar2.c(1);
                nd1 nd1Var2 = erVar2.q;
                ArrayList arrayList10 = erVar2.a;
                int size5 = arrayList10.size();
                int i20 = 0;
                while (i20 < size5) {
                    xd1 xd1Var5 = (xd1) arrayList10.get(i20);
                    xc1 xc1Var7 = xd1Var5.b;
                    if (xc1Var7 != null) {
                        if (xc1Var7.Q != null) {
                            xc1Var7.f().a = false;
                        }
                        int i21 = erVar2.f;
                        if (xc1Var7.Q != null || i21 != 0) {
                            xc1Var7.f();
                            xc1Var7.Q.f = i21;
                        }
                        xc1Var7.f();
                        xc1Var7.Q.getClass();
                    }
                    switch (xd1Var5.a) {
                        case 1:
                            xc1Var7.G(xd1Var5.d, xd1Var5.e, xd1Var5.f, xd1Var5.g);
                            nd1Var2.a0(xc1Var7, false);
                            nd1Var2.a(xc1Var7);
                            i20++;
                            str = str;
                            break;
                        case 2:
                        default:
                            m51.g(xd1Var5.a, str);
                            return;
                        case 3:
                            xc1Var7.G(xd1Var5.d, xd1Var5.e, xd1Var5.f, xd1Var5.g);
                            nd1Var2.V(xc1Var7);
                            i20++;
                            str = str;
                            break;
                        case 4:
                            xc1Var7.G(xd1Var5.d, xd1Var5.e, xd1Var5.f, xd1Var5.g);
                            nd1Var2.J(xc1Var7);
                            i20++;
                            str = str;
                            break;
                        case 5:
                            xc1Var7.G(xd1Var5.d, xd1Var5.e, xd1Var5.f, xd1Var5.g);
                            nd1Var2.a0(xc1Var7, false);
                            e0(xc1Var7);
                            i20++;
                            str = str;
                            break;
                        case 6:
                            xc1Var7.G(xd1Var5.d, xd1Var5.e, xd1Var5.f, xd1Var5.g);
                            nd1Var2.h(xc1Var7);
                            i20++;
                            str = str;
                            break;
                        case 7:
                            xc1Var7.G(xd1Var5.d, xd1Var5.e, xd1Var5.f, xd1Var5.g);
                            nd1Var2.a0(xc1Var7, false);
                            nd1Var2.c(xc1Var7);
                            i20++;
                            str = str;
                            break;
                        case 8:
                            nd1Var2.c0(xc1Var7);
                            i20++;
                            str = str;
                            break;
                        case 9:
                            nd1Var2.c0(null);
                            i20++;
                            str = str;
                            break;
                        case 10:
                            nd1Var2.b0(xc1Var7, xd1Var5.i);
                            i20++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i22 = 0;
            while (i22 < size6) {
                Object obj2 = arrayList.get(i22);
                i22++;
                linkedHashSet.addAll(F((er) obj2));
            }
            if (this.h == null) {
                int size7 = arrayList3.size();
                int i23 = 0;
                while (i23 < size7) {
                    Object obj3 = arrayList3.get(i23);
                    i23++;
                    if (obj3 != null) {
                        m51.t();
                        return;
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i24 = 0;
                while (i24 < size8) {
                    Object obj4 = arrayList3.get(i24);
                    i24++;
                    if (obj4 != null) {
                        m51.t();
                        return;
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i25 = i; i25 < i2; i25++) {
            er erVar3 = (er) arrayList.get(i25);
            if (zBooleanValue2) {
                for (int size9 = erVar3.a.size() - 1; size9 >= 0; size9--) {
                    xc1 xc1Var8 = ((xd1) erVar3.a.get(size9)).b;
                    if (xc1Var8 != null) {
                        g(xc1Var8).j();
                    }
                }
            } else {
                ArrayList arrayList11 = erVar3.a;
                int size10 = arrayList11.size();
                int i26 = 0;
                while (i26 < size10) {
                    Object obj5 = arrayList11.get(i26);
                    i26++;
                    xc1 xc1Var9 = ((xd1) obj5).b;
                    if (xc1Var9 != null) {
                        g(xc1Var9).j();
                    }
                }
            }
        }
        Q(this.v, true);
        int i27 = i;
        for (vt0 vt0Var : f(arrayList, i27, i2)) {
            vt0Var.e = zBooleanValue2;
            synchronized (vt0Var.b) {
                vt0Var.g();
                ArrayList arrayList12 = vt0Var.b;
                ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                if (listIterator.hasPrevious()) {
                    ((om3) listIterator.previous()).getClass();
                    throw null;
                }
                vt0Var.f = false;
            }
            vt0Var.c();
        }
        while (i27 < i2) {
            er erVar4 = (er) arrayList.get(i27);
            if (((Boolean) arrayList2.get(i27)).booleanValue() && erVar4.s >= 0) {
                erVar4.s = -1;
            }
            if (erVar4.p != null) {
                for (int i28 = 0; i28 < erVar4.p.size(); i28++) {
                    ((Runnable) erVar4.p.get(i28)).run();
                }
                erVar4.p = null;
            }
            i27++;
        }
        if (!z9 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        m51.t();
    }

    public final xc1 C(int i) {
        ir3 ir3Var = this.c;
        ArrayList arrayList = (ArrayList) ir3Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xc1 xc1Var = (xc1) arrayList.get(size);
            if (xc1Var != null && xc1Var.F == i) {
                return xc1Var;
            }
        }
        for (ud1 ud1Var : ((HashMap) ir3Var.d).values()) {
            if (ud1Var != null) {
                xc1 xc1Var2 = ud1Var.c;
                if (xc1Var2.F == i) {
                    return xc1Var2;
                }
            }
        }
        return null;
    }

    public final xc1 D(String str) {
        ir3 ir3Var = this.c;
        ArrayList arrayList = (ArrayList) ir3Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xc1 xc1Var = (xc1) arrayList.get(size);
            if (xc1Var != null && str.equals(xc1Var.H)) {
                return xc1Var;
            }
        }
        for (ud1 ud1Var : ((HashMap) ir3Var.d).values()) {
            if (ud1Var != null) {
                xc1 xc1Var2 = ud1Var.c;
                if (str.equals(xc1Var2.H)) {
                    return xc1Var2;
                }
            }
        }
        return null;
    }

    public final void E() {
        for (vt0 vt0Var : e()) {
            if (vt0Var.f) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                vt0Var.f = false;
                vt0Var.c();
            }
        }
    }

    public final ViewGroup G(xc1 xc1Var) {
        ViewGroup viewGroup = xc1Var.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (xc1Var.G <= 0 || !this.x.N()) {
            return null;
        }
        View viewM = this.x.M(xc1Var.G);
        if (viewM instanceof ViewGroup) {
            return (ViewGroup) viewM;
        }
        return null;
    }

    public final hd1 H() {
        xc1 xc1Var = this.y;
        return xc1Var != null ? xc1Var.B.H() : this.A;
    }

    public final qn0 I() {
        xc1 xc1Var = this.y;
        return xc1Var != null ? xc1Var.B.I() : this.B;
    }

    public final void J(xc1 xc1Var) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + xc1Var);
        }
        if (xc1Var.I) {
            return;
        }
        xc1Var.I = true;
        xc1Var.R = true ^ xc1Var.R;
        d0(xc1Var);
    }

    public final boolean M() {
        xc1 xc1Var = this.y;
        if (xc1Var == null) {
            return true;
        }
        return xc1Var.p() && this.y.l().M();
    }

    public final boolean P() {
        return this.H || this.I;
    }

    public final void Q(int i, boolean z) {
        zc1 zc1Var;
        if (this.w == null && i != -1) {
            u41.r("No activity");
            return;
        }
        if (z || i != this.v) {
            this.v = i;
            ir3 ir3Var = this.c;
            HashMap map = (HashMap) ir3Var.d;
            ArrayList arrayList = (ArrayList) ir3Var.c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ud1 ud1Var = (ud1) map.get(((xc1) obj).m);
                if (ud1Var != null) {
                    ud1Var.j();
                }
            }
            for (ud1 ud1Var2 : map.values()) {
                if (ud1Var2 != null) {
                    ud1Var2.j();
                    xc1 xc1Var = ud1Var2.c;
                    if (xc1Var.t && !xc1Var.r()) {
                        ir3Var.c0(ud1Var2);
                    }
                }
            }
            f0();
            if (this.G && (zc1Var = this.w) != null && this.v == 7) {
                zc1Var.y.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void R() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.g = false;
        for (xc1 xc1Var : this.c.U()) {
            if (xc1Var != null) {
                xc1Var.D.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i, int i2) {
        A(false);
        z(true);
        xc1 xc1Var = this.z;
        if (xc1Var != null && i < 0 && xc1Var.i().S()) {
            return true;
        }
        boolean zU = U(this.L, this.M, i, i2);
        if (zU) {
            this.b = true;
            try {
                W(this.L, this.M);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        h0();
        v();
        ((HashMap) this.c.d).values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    er erVar = (er) this.d.get(size2);
                    if (i >= 0 && i == erVar.s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        er erVar2 = (er) this.d.get(size - 1);
                        if (i < 0 || i != erVar2.s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((er) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(xc1 xc1Var) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + xc1Var + " nesting=" + xc1Var.A);
        }
        boolean zR = xc1Var.r();
        if (xc1Var.J && zR) {
            return;
        }
        ir3 ir3Var = this.c;
        synchronized (((ArrayList) ir3Var.c)) {
            ((ArrayList) ir3Var.c).remove(xc1Var);
        }
        xc1Var.s = false;
        if (L(xc1Var)) {
            this.G = true;
        }
        xc1Var.t = true;
        d0(xc1Var);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            u41.r("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((er) arrayList.get(i)).o) {
                if (i2 != i) {
                    B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((er) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(arrayList, arrayList2, i2, size);
        }
    }

    public final void X(Bundle bundle) {
        bv0 bv0Var;
        int i;
        Bundle bundle2;
        ud1 ud1Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.w.v.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.w.v.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        ir3 ir3Var = this.c;
        HashMap map2 = (HashMap) ir3Var.h;
        HashMap map3 = (HashMap) ir3Var.d;
        map2.clear();
        map2.putAll(map);
        od1 od1Var = (od1) bundle.getParcelable("state");
        if (od1Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = od1Var.c;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            bv0Var = this.o;
            int i3 = 2;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            Bundle bundleG0 = ir3Var.g0((String) obj, null);
            if (bundleG0 != null) {
                xc1 xc1Var = (xc1) this.O.b.get(((td1) bundleG0.getParcelable("state")).d);
                if (xc1Var != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + xc1Var);
                    }
                    ud1Var = new ud1(bv0Var, ir3Var, xc1Var, bundleG0);
                    bundle2 = bundleG0;
                } else {
                    i3 = 2;
                    bundle2 = bundleG0;
                    ud1Var = new ud1(this.o, this.c, this.w.v.getClassLoader(), H(), bundleG0);
                }
                xc1 xc1Var2 = ud1Var.c;
                xc1Var2.d = bundle2;
                xc1Var2.B = this;
                if (K(i3)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + xc1Var2.m + "): " + xc1Var2);
                }
                ud1Var.l(this.w.v.getClassLoader());
                ir3Var.b0(ud1Var);
                ud1Var.e = this.v;
            }
        }
        qd1 qd1Var = this.O;
        qd1Var.getClass();
        ArrayList arrayList2 = new ArrayList(qd1Var.b.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            xc1 xc1Var3 = (xc1) obj2;
            if (map3.get(xc1Var3.m) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + xc1Var3 + " that was not found in the set of active Fragments " + od1Var.c);
                }
                this.O.h(xc1Var3);
                xc1Var3.B = this;
                ud1 ud1Var2 = new ud1(bv0Var, ir3Var, xc1Var3);
                ud1Var2.e = 1;
                ud1Var2.j();
                xc1Var3.t = true;
                ud1Var2.j();
            }
        }
        ArrayList arrayList3 = od1Var.d;
        ((ArrayList) ir3Var.c).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                xc1 xc1VarM = ir3Var.M(str3);
                if (xc1VarM == null) {
                    u41.r(fq2.n("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + xc1VarM);
                }
                ir3Var.E(xc1VarM);
            }
        }
        if (od1Var.h != null) {
            this.d = new ArrayList(od1Var.h.length);
            int i6 = 0;
            while (true) {
                fr[] frVarArr = od1Var.h;
                if (i6 >= frVarArr.length) {
                    break;
                }
                fr frVar = frVarArr[i6];
                ArrayList arrayList4 = frVar.d;
                er erVar = new er(this);
                int[] iArr = frVar.c;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    xd1 xd1Var = new xd1();
                    int i9 = i7 + 1;
                    xd1Var.a = iArr[i7];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + erVar + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    xd1Var.h = g32.values()[frVar.h[i8]];
                    xd1Var.i = g32.values()[frVar.l[i8]];
                    int i10 = i7 + 2;
                    xd1Var.c = iArr[i9] != 0;
                    int i11 = iArr[i10];
                    xd1Var.d = i11;
                    int i12 = iArr[i7 + 3];
                    xd1Var.e = i12;
                    int i13 = i7 + 5;
                    int i14 = iArr[i7 + 4];
                    xd1Var.f = i14;
                    i7 += 6;
                    int[] iArr2 = iArr;
                    int i15 = iArr2[i13];
                    xd1Var.g = i15;
                    erVar.b = i11;
                    erVar.c = i12;
                    erVar.d = i14;
                    erVar.e = i15;
                    erVar.b(xd1Var);
                    i8++;
                    iArr = iArr2;
                }
                erVar.f = frVar.m;
                erVar.h = frVar.n;
                erVar.g = true;
                erVar.i = frVar.p;
                erVar.j = frVar.q;
                erVar.k = frVar.r;
                erVar.l = frVar.s;
                erVar.m = frVar.t;
                erVar.n = frVar.u;
                erVar.o = frVar.v;
                erVar.s = frVar.o;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    String str4 = (String) arrayList4.get(i16);
                    if (str4 != null) {
                        ((xd1) erVar.a.get(i16)).b = ir3Var.M(str4);
                    }
                }
                erVar.c(1);
                if (K(2)) {
                    StringBuilder sbS = ud2.s("restoreAllState: back stack #", " (index ", i6);
                    sbS.append(erVar.s);
                    sbS.append("): ");
                    sbS.append(erVar);
                    Log.v("FragmentManager", sbS.toString());
                    PrintWriter printWriter = new PrintWriter(new u72());
                    erVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(erVar);
                i6++;
            }
            i = 0;
        } else {
            i = 0;
            this.d = new ArrayList();
        }
        this.k.set(od1Var.l);
        String str5 = od1Var.m;
        if (str5 != null) {
            xc1 xc1VarM2 = ir3Var.M(str5);
            this.z = xc1VarM2;
            r(xc1VarM2);
        }
        ArrayList arrayList5 = od1Var.n;
        if (arrayList5 != null) {
            for (int i17 = i; i17 < arrayList5.size(); i17++) {
                this.l.put((String) arrayList5.get(i17), (gr) od1Var.o.get(i17));
            }
        }
        this.F = new ArrayDeque(od1Var.p);
    }

    public final Bundle Y() {
        int i;
        ArrayList arrayList;
        fr[] frVarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.H = true;
        this.O.g = true;
        ir3 ir3Var = this.c;
        ir3Var.getClass();
        HashMap map = (HashMap) ir3Var.d;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ud1 ud1Var = (ud1) it.next();
            if (ud1Var != null) {
                xc1 xc1Var = ud1Var.c;
                String str = xc1Var.m;
                Bundle bundle3 = new Bundle();
                xc1 xc1Var2 = ud1Var.c;
                if (xc1Var2.c == -1 && (bundle = xc1Var2.d) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new td1(xc1Var2));
                if (xc1Var2.c > -1) {
                    Bundle bundle4 = new Bundle();
                    xc1Var2.B(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    ud1Var.a.s(xc1Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    xc1Var2.Y.f(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleY = xc1Var2.D.Y();
                    if (!bundleY.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleY);
                    }
                    SparseArray<? extends Parcelable> sparseArray = xc1Var2.h;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = xc1Var2.l;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = xc1Var2.n;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                ir3Var.g0(str, bundle3);
                arrayList2.add(xc1Var.m);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + xc1Var + ": " + xc1Var.d);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.h;
        if (!map2.isEmpty()) {
            ir3 ir3Var2 = this.c;
            synchronized (((ArrayList) ir3Var2.c)) {
                try {
                    if (((ArrayList) ir3Var2.c).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) ir3Var2.c).size());
                        ArrayList arrayList3 = (ArrayList) ir3Var2.c;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            xc1 xc1Var3 = (xc1) obj;
                            arrayList.add(xc1Var3.m);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + xc1Var3.m + "): " + xc1Var3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                frVarArr = new fr[size2];
                for (i = 0; i < size2; i++) {
                    frVarArr[i] = new fr((er) this.d.get(i));
                    if (K(2)) {
                        StringBuilder sbS = ud2.s("saveAllState: adding back stack #", ": ", i);
                        sbS.append(this.d.get(i));
                        Log.v("FragmentManager", sbS.toString());
                    }
                }
            } else {
                frVarArr = null;
            }
            od1 od1Var = new od1();
            od1Var.m = null;
            ArrayList arrayList4 = new ArrayList();
            od1Var.n = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            od1Var.o = arrayList5;
            od1Var.c = arrayList2;
            od1Var.d = arrayList;
            od1Var.h = frVarArr;
            od1Var.l = this.k.get();
            xc1 xc1Var4 = this.z;
            if (xc1Var4 != null) {
                od1Var.m = xc1Var4.m;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            od1Var.p = new ArrayList(this.F);
            bundle2.putParcelable("state", od1Var);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(fq2.m("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(fq2.m("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void Z() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.w.removeCallbacks(this.P);
                    this.w.w.post(this.P);
                    h0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ud1 a(xc1 xc1Var) {
        String str = xc1Var.T;
        if (str != null) {
            wd1.c(xc1Var, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + xc1Var);
        }
        ud1 ud1VarG = g(xc1Var);
        xc1Var.B = this;
        ir3 ir3Var = this.c;
        ir3Var.b0(ud1VarG);
        if (!xc1Var.J) {
            ir3Var.E(xc1Var);
            xc1Var.t = false;
            xc1Var.R = false;
            if (L(xc1Var)) {
                this.G = true;
            }
        }
        return ud1VarG;
    }

    public final void a0(xc1 xc1Var, boolean z) {
        ViewGroup viewGroupG = G(xc1Var);
        if (viewGroupG == null || !(viewGroupG instanceof bd1)) {
            return;
        }
        ((bd1) viewGroupG).setDrawDisappearingViewsLast(!z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(zc1 zc1Var, yh4 yh4Var, xc1 xc1Var) {
        if (this.w != null) {
            u41.r("Already attached");
            return;
        }
        this.w = zc1Var;
        this.x = yh4Var;
        this.y = xc1Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (xc1Var != null) {
            copyOnWriteArrayList.add(new id1(xc1Var));
        } else if (zc1Var != null) {
            copyOnWriteArrayList.add(zc1Var);
        }
        if (this.y != null) {
            h0();
        }
        if (zc1Var != null) {
            go2 go2VarA = zc1Var.y.a();
            this.g = go2VarA;
            go2VarA.a(xc1Var != null ? xc1Var : zc1Var, this.j);
        }
        boolean z = false;
        Object[] objArr = 0;
        if (xc1Var != null) {
            qd1 qd1Var = xc1Var.B.O;
            HashMap map = qd1Var.c;
            qd1 qd1Var2 = (qd1) map.get(xc1Var.m);
            if (qd1Var2 == null) {
                qd1Var2 = new qd1(qd1Var.e);
                map.put(xc1Var.m, qd1Var2);
            }
            this.O = qd1Var2;
        } else if (zc1Var != null) {
            md4 md4VarG = zc1Var.y.g();
            oq0 oq0Var = oq0.b;
            oq0Var.getClass();
            iy2 iy2Var = new iy2(md4VarG, qd1.h, oq0Var);
            vc0 vc0VarA = r43.a(qd1.class);
            String classQualifiedName = Options$Companion.getClassQualifiedName(vc0VarA.c);
            if (classQualifiedName == null) {
                u41.k("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.O = (qd1) iy2Var.j(vc0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(classQualifiedName));
        } else {
            this.O = new qd1(false);
        }
        this.O.g = P();
        this.c.l = this.O;
        zc1 zc1Var2 = this.w;
        if (zc1Var2 != null && xc1Var == null) {
            t93 t93VarB = zc1Var2.b();
            t93VarB.c("android:support:fragments", new hg0(3, this));
            Bundle bundleA = t93VarB.a("android:support:fragments");
            if (bundleA != null) {
                X(bundleA);
            }
        }
        zc1 zc1Var3 = this.w;
        if (zc1Var3 != null) {
            ng0 ng0Var = zc1Var3.y.q;
            String strConcat = "FragmentManager:".concat(xc1Var != null ? fq2.r(new StringBuilder(), xc1Var.m, ":") : BuildConfig.VERSION_NAME);
            this.C = ng0Var.c(strConcat.concat("StartActivityForResult"), new u3(4, z), new ed1(this, 1));
            int i = 2;
            this.D = ng0Var.c(strConcat.concat("StartIntentSenderForResult"), new u3(6), new ed1(this, i));
            this.E = ng0Var.c(strConcat.concat("RequestPermissions"), new u3(i), new ed1(this, objArr == true ? 1 : 0));
        }
        zc1 zc1Var4 = this.w;
        if (zc1Var4 != null) {
            zh zhVar = zc1Var4.y;
            dd1 dd1Var = this.q;
            dd1Var.getClass();
            zhVar.r.add(dd1Var);
        }
        zc1 zc1Var5 = this.w;
        if (zc1Var5 != null) {
            zh zhVar2 = zc1Var5.y;
            dd1 dd1Var2 = this.r;
            dd1Var2.getClass();
            zhVar2.s.add(dd1Var2);
        }
        zc1 zc1Var6 = this.w;
        if (zc1Var6 != null) {
            zh zhVar3 = zc1Var6.y;
            dd1 dd1Var3 = this.s;
            dd1Var3.getClass();
            zhVar3.u.add(dd1Var3);
        }
        zc1 zc1Var7 = this.w;
        if (zc1Var7 != null) {
            zh zhVar4 = zc1Var7.y;
            dd1 dd1Var4 = this.t;
            dd1Var4.getClass();
            zhVar4.v.add(dd1Var4);
        }
        zc1 zc1Var8 = this.w;
        if (zc1Var8 == null || xc1Var != null) {
            return;
        }
        zh zhVar5 = zc1Var8.y;
        gd1 gd1Var = this.u;
        gd1Var.getClass();
        ci4 ci4Var = zhVar5.h;
        ((CopyOnWriteArrayList) ci4Var.h).add(gd1Var);
        ((Runnable) ci4Var.d).run();
    }

    public final void b0(xc1 xc1Var, g32 g32Var) {
        if (xc1Var == this.c.M(xc1Var.m) && (xc1Var.C == null || xc1Var.B == this)) {
            xc1Var.U = g32Var;
        } else {
            u41.m("Fragment ", xc1Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void c(xc1 xc1Var) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + xc1Var);
        }
        if (xc1Var.J) {
            xc1Var.J = false;
            if (xc1Var.s) {
                return;
            }
            this.c.E(xc1Var);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + xc1Var);
            }
            if (L(xc1Var)) {
                this.G = true;
            }
        }
    }

    public final void c0(xc1 xc1Var) {
        if (xc1Var != null) {
            if (xc1Var != this.c.M(xc1Var.m) || (xc1Var.C != null && xc1Var.B != this)) {
                u41.m("Fragment ", xc1Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        xc1 xc1Var2 = this.z;
        this.z = xc1Var;
        r(xc1Var2);
        r(this.z);
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(xc1 xc1Var) {
        ViewGroup viewGroupG = G(xc1Var);
        if (viewGroupG != null) {
            wc1 wc1Var = xc1Var.Q;
            if ((wc1Var == null ? 0 : wc1Var.e) + (wc1Var == null ? 0 : wc1Var.d) + (wc1Var == null ? 0 : wc1Var.c) + (wc1Var == null ? 0 : wc1Var.b) > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, xc1Var);
                }
                xc1 xc1Var2 = (xc1) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag);
                wc1 wc1Var2 = xc1Var.Q;
                boolean z = wc1Var2 != null ? wc1Var2.a : false;
                if (xc1Var2.Q == null) {
                    return;
                }
                xc1Var2.f().a = z;
            }
        }
    }

    public final HashSet e() {
        vt0 vt0Var;
        HashSet hashSet = new HashSet();
        ArrayList arrayListR = this.c.R();
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            ViewGroup viewGroup = ((ud1) obj).c.N;
            if (viewGroup != null) {
                I().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof vt0) {
                    vt0Var = (vt0) tag;
                } else {
                    vt0Var = new vt0(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, vt0Var);
                }
                hashSet.add(vt0Var);
            }
        }
        return hashSet;
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((er) arrayList.get(i)).a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                xc1 xc1Var = ((xd1) obj).b;
                if (xc1Var != null && (viewGroup = xc1Var.N) != null) {
                    hashSet.add(vt0.e(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0() {
        ArrayList arrayListR = this.c.R();
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            ud1 ud1Var = (ud1) obj;
            xc1 xc1Var = ud1Var.c;
            if (xc1Var.O) {
                if (this.b) {
                    this.K = true;
                } else {
                    xc1Var.O = false;
                    ud1Var.j();
                }
            }
        }
    }

    public final ud1 g(xc1 xc1Var) {
        String str = xc1Var.m;
        ir3 ir3Var = this.c;
        ud1 ud1Var = (ud1) ((HashMap) ir3Var.d).get(str);
        if (ud1Var != null) {
            return ud1Var;
        }
        ud1 ud1Var2 = new ud1(this.o, ir3Var, xc1Var);
        ud1Var2.l(this.w.v.getClassLoader());
        ud1Var2.e = this.v;
        return ud1Var2;
    }

    public final void g0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new u72());
        zc1 zc1Var = this.w;
        if (zc1Var == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            zc1Var.y.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void h(xc1 xc1Var) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + xc1Var);
        }
        if (xc1Var.J) {
            return;
        }
        xc1Var.J = true;
        if (xc1Var.s) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + xc1Var);
            }
            ir3 ir3Var = this.c;
            synchronized (((ArrayList) ir3Var.c)) {
                ((ArrayList) ir3Var.c).remove(xc1Var);
            }
            xc1Var.s = false;
            if (L(xc1Var)) {
                this.G = true;
            }
            d0(xc1Var);
        }
    }

    public final void h0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    fd1 fd1Var = this.j;
                    fd1Var.a = true;
                    je1 je1Var = fd1Var.c;
                    if (je1Var != null) {
                        je1Var.invoke();
                    }
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && O(this.y);
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                fd1 fd1Var2 = this.j;
                fd1Var2.a = z;
                je1 je1Var2 = fd1Var2.c;
                if (je1Var2 != null) {
                    je1Var2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (xc1 xc1Var : this.c.U()) {
            if (xc1Var != null) {
                xc1Var.M = true;
                if (z) {
                    xc1Var.D.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.v >= 1) {
            for (xc1 xc1Var : this.c.U()) {
                if (xc1Var != null) {
                    if (!xc1Var.I ? xc1Var.D.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (xc1 xc1Var : this.c.U()) {
            if (xc1Var != null && N(xc1Var)) {
                if (!xc1Var.I ? xc1Var.D.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(xc1Var);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                xc1 xc1Var2 = (xc1) this.e.get(i);
                if (arrayList == null || !arrayList.contains(xc1Var2)) {
                    xc1Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        A(true);
        x();
        zc1 zc1Var = this.w;
        ir3 ir3Var = this.c;
        if (zc1Var != null) {
            zIsChangingConfigurations = ((qd1) ir3Var.l).f;
        } else {
            zh zhVar = zc1Var.v;
            if (zhVar != null) {
                zIsChangingConfigurations = true ^ zhVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((gr) it.next()).c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((qd1) ir3Var.l).f((String) obj, false);
                }
            }
        }
        u(-1);
        zc1 zc1Var2 = this.w;
        if (zc1Var2 != null) {
            zh zhVar2 = zc1Var2.y;
            dd1 dd1Var = this.r;
            dd1Var.getClass();
            zhVar2.s.remove(dd1Var);
        }
        zc1 zc1Var3 = this.w;
        if (zc1Var3 != null) {
            zh zhVar3 = zc1Var3.y;
            dd1 dd1Var2 = this.q;
            dd1Var2.getClass();
            zhVar3.r.remove(dd1Var2);
        }
        zc1 zc1Var4 = this.w;
        if (zc1Var4 != null) {
            zh zhVar4 = zc1Var4.y;
            dd1 dd1Var3 = this.s;
            dd1Var3.getClass();
            zhVar4.u.remove(dd1Var3);
        }
        zc1 zc1Var5 = this.w;
        if (zc1Var5 != null) {
            zh zhVar5 = zc1Var5.y;
            dd1 dd1Var4 = this.t;
            dd1Var4.getClass();
            zhVar5.v.remove(dd1Var4);
        }
        zc1 zc1Var6 = this.w;
        if (zc1Var6 != null && this.y == null) {
            zh zhVar6 = zc1Var6.y;
            gd1 gd1Var = this.u;
            gd1Var.getClass();
            ci4 ci4Var = zhVar6.h;
            ((CopyOnWriteArrayList) ci4Var.h).remove(gd1Var);
            if (((HashMap) ci4Var.l).remove(gd1Var) == null) {
                ((Runnable) ci4Var.d).run();
            } else {
                m51.t();
            }
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        e4 e4Var = this.C;
        if (e4Var != null) {
            e4Var.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (xc1 xc1Var : this.c.U()) {
            if (xc1Var != null) {
                xc1Var.M = true;
                if (z) {
                    xc1Var.D.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (xc1 xc1Var : this.c.U()) {
            if (xc1Var != null && z) {
                xc1Var.D.n(true);
            }
        }
    }

    public final void o() {
        ArrayList arrayListS = this.c.S();
        int size = arrayListS.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            xc1 xc1Var = (xc1) obj;
            if (xc1Var != null) {
                xc1Var.q();
                xc1Var.D.o();
            }
        }
    }

    public final boolean p() {
        if (this.v >= 1) {
            for (xc1 xc1Var : this.c.U()) {
                if (xc1Var != null) {
                    if (!xc1Var.I ? xc1Var.D.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v < 1) {
            return;
        }
        for (xc1 xc1Var : this.c.U()) {
            if (xc1Var != null && !xc1Var.I) {
                xc1Var.D.q();
            }
        }
    }

    public final void r(xc1 xc1Var) {
        if (xc1Var != null) {
            if (xc1Var != this.c.M(xc1Var.m)) {
                return;
            }
            xc1Var.B.getClass();
            boolean zO = O(xc1Var);
            Boolean bool = xc1Var.r;
            if (bool == null || bool.booleanValue() != zO) {
                xc1Var.r = Boolean.valueOf(zO);
                nd1 nd1Var = xc1Var.D;
                nd1Var.h0();
                nd1Var.r(nd1Var.z);
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (xc1 xc1Var : this.c.U()) {
            if (xc1Var != null && z) {
                xc1Var.D.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.v < 1) {
            return false;
        }
        boolean z = false;
        for (xc1 xc1Var : this.c.U()) {
            if (xc1Var != null && N(xc1Var)) {
                if (!xc1Var.I ? xc1Var.D.t() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        xc1 xc1Var = this.y;
        if (xc1Var != null) {
            sb.append(xc1Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            zc1 zc1Var = this.w;
            if (zc1Var != null) {
                sb.append(zc1Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (ud1 ud1Var : ((HashMap) this.c.d).values()) {
                if (ud1Var != null) {
                    ud1Var.e = i;
                }
            }
            Q(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((vt0) it.next()).d();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.K) {
            this.K = false;
            f0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strP = ud2.p(str, "    ");
        ir3 ir3Var = this.c;
        ArrayList arrayList = (ArrayList) ir3Var.c;
        String strP2 = ud2.p(str, "    ");
        HashMap map = (HashMap) ir3Var.d;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (ud1 ud1Var : map.values()) {
                printWriter.print(str);
                if (ud1Var != null) {
                    xc1 xc1Var = ud1Var.c;
                    printWriter.println(xc1Var);
                    xc1Var.getClass();
                    printWriter.print(strP2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(xc1Var.F));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(xc1Var.G));
                    printWriter.print(" mTag=");
                    printWriter.println(xc1Var.H);
                    printWriter.print(strP2);
                    printWriter.print("mState=");
                    printWriter.print(xc1Var.c);
                    printWriter.print(" mWho=");
                    printWriter.print(xc1Var.m);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(xc1Var.A);
                    printWriter.print(strP2);
                    printWriter.print("mAdded=");
                    printWriter.print(xc1Var.s);
                    printWriter.print(" mRemoving=");
                    printWriter.print(xc1Var.t);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(xc1Var.v);
                    printWriter.print(" mInLayout=");
                    printWriter.println(xc1Var.w);
                    printWriter.print(strP2);
                    printWriter.print("mHidden=");
                    printWriter.print(xc1Var.I);
                    printWriter.print(" mDetached=");
                    printWriter.print(xc1Var.J);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(xc1Var.L);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strP2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(xc1Var.K);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(xc1Var.P);
                    if (xc1Var.B != null) {
                        printWriter.print(strP2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(xc1Var.B);
                    }
                    if (xc1Var.C != null) {
                        printWriter.print(strP2);
                        printWriter.print("mHost=");
                        printWriter.println(xc1Var.C);
                    }
                    if (xc1Var.E != null) {
                        printWriter.print(strP2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(xc1Var.E);
                    }
                    if (xc1Var.n != null) {
                        printWriter.print(strP2);
                        printWriter.print("mArguments=");
                        printWriter.println(xc1Var.n);
                    }
                    if (xc1Var.d != null) {
                        printWriter.print(strP2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(xc1Var.d);
                    }
                    if (xc1Var.h != null) {
                        printWriter.print(strP2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(xc1Var.h);
                    }
                    if (xc1Var.l != null) {
                        printWriter.print(strP2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(xc1Var.l);
                    }
                    Object objM = xc1Var.o;
                    if (objM == null) {
                        nd1 nd1Var = xc1Var.B;
                        objM = (nd1Var == null || (str2 = xc1Var.p) == null) ? null : nd1Var.c.M(str2);
                    }
                    if (objM != null) {
                        printWriter.print(strP2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(xc1Var.q);
                    }
                    printWriter.print(strP2);
                    printWriter.print("mPopDirection=");
                    wc1 wc1Var = xc1Var.Q;
                    printWriter.println(wc1Var == null ? false : wc1Var.a);
                    wc1 wc1Var2 = xc1Var.Q;
                    if ((wc1Var2 == null ? 0 : wc1Var2.b) != 0) {
                        printWriter.print(strP2);
                        printWriter.print("getEnterAnim=");
                        wc1 wc1Var3 = xc1Var.Q;
                        printWriter.println(wc1Var3 == null ? 0 : wc1Var3.b);
                    }
                    wc1 wc1Var4 = xc1Var.Q;
                    if ((wc1Var4 == null ? 0 : wc1Var4.c) != 0) {
                        printWriter.print(strP2);
                        printWriter.print("getExitAnim=");
                        wc1 wc1Var5 = xc1Var.Q;
                        printWriter.println(wc1Var5 == null ? 0 : wc1Var5.c);
                    }
                    wc1 wc1Var6 = xc1Var.Q;
                    if ((wc1Var6 == null ? 0 : wc1Var6.d) != 0) {
                        printWriter.print(strP2);
                        printWriter.print("getPopEnterAnim=");
                        wc1 wc1Var7 = xc1Var.Q;
                        printWriter.println(wc1Var7 == null ? 0 : wc1Var7.d);
                    }
                    wc1 wc1Var8 = xc1Var.Q;
                    if ((wc1Var8 == null ? 0 : wc1Var8.e) != 0) {
                        printWriter.print(strP2);
                        printWriter.print("getPopExitAnim=");
                        wc1 wc1Var9 = xc1Var.Q;
                        printWriter.println(wc1Var9 == null ? 0 : wc1Var9.e);
                    }
                    if (xc1Var.N != null) {
                        printWriter.print(strP2);
                        printWriter.print("mContainer=");
                        printWriter.println(xc1Var.N);
                    }
                    if (xc1Var.j() != null) {
                        bv0.z(xc1Var).w(strP2, printWriter);
                    }
                    printWriter.print(strP2);
                    printWriter.println("Child " + xc1Var.D + ":");
                    xc1Var.D.w(strP2.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                xc1 xc1Var2 = (xc1) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(xc1Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                xc1 xc1Var3 = (xc1) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(xc1Var3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                er erVar = (er) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(erVar.toString());
                erVar.g(strP, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (kd1) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((vt0) it.next()).d();
        }
    }

    public final void y(kd1 kd1Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    u41.r("FragmentManager has been destroyed");
                    return;
                } else {
                    u41.r("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (P()) {
                u41.r("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(kd1Var);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            u41.r("FragmentManager is already executing transactions");
            return;
        }
        if (this.w == null) {
            if (this.J) {
                u41.r("FragmentManager has been destroyed");
                return;
            } else {
                u41.r("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.w.w.getLooper()) {
            u41.r("Must be called from main thread of fragment host");
            return;
        }
        if (!z && P()) {
            u41.r("Can not perform this action after onSaveInstanceState");
        } else if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
