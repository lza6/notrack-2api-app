package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z43 {
    public final Set a;
    public final oi2 b;
    public oi2 c;
    public final oi2 d;
    public final oi2 e;
    public gi2 f;
    public final ArrayList g;
    public final ch2 h;
    public final ch2 i;
    public ArrayList j;

    public z43(ji2 ji2Var) {
        this.a = ji2Var;
        oi2 oi2Var = new oi2(0, new b53[16]);
        this.b = oi2Var;
        this.c = oi2Var;
        this.d = new oi2(0, new Object[16]);
        this.e = new oi2(0, new je1[16]);
        this.g = new ArrayList();
        this.h = new ch2();
        this.i = new ch2();
    }

    public final void a() {
        Set set = this.a;
        if (set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a53 a53Var = (a53) it.next();
                it.remove();
                a53Var.b();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void b() {
        c(Integer.MIN_VALUE);
        oi2 oi2Var = this.d;
        int i = oi2Var.h;
        Set set = this.a;
        if (i != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                gi2 gi2Var = this.f;
                int i2 = oi2Var.h;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = oi2Var.c[i2];
                    if (obj instanceof b53) {
                        a53 a53Var = ((b53) obj).a;
                        set.remove(a53Var);
                        a53Var.d();
                    }
                    if (obj instanceof vj0) {
                        if (gi2Var == null || !gi2Var.c(obj)) {
                            ((vj0) obj).g();
                        } else {
                            ((vj0) obj).e();
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        oi2 oi2Var2 = this.b;
        if (oi2Var2.h != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Object[] objArr = oi2Var2.c;
                int i3 = oi2Var2.h;
                for (int i4 = 0; i4 < i3; i4++) {
                    a53 a53Var2 = ((b53) objArr[i4]).a;
                    set.remove(a53Var2);
                    a53Var2.a();
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final void c(int i) {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = 0;
        ArrayList arrayListV = null;
        int i3 = 0;
        ch2 ch2Var = null;
        ch2 ch2Var2 = null;
        while (true) {
            ch2 ch2Var3 = this.i;
            if (i3 >= ch2Var3.b) {
                break;
            }
            if (i <= ch2Var3.a(i3)) {
                Object objRemove = arrayList.remove(i3);
                int iE = ch2Var3.e(i3);
                int iE2 = this.h.e(i3);
                if (arrayListV == null) {
                    arrayListV = kr1.V(objRemove);
                    ch2Var2 = new ch2();
                    ch2Var2.c(iE);
                    ch2Var = new ch2();
                    ch2Var.c(iE2);
                } else {
                    ch2Var.getClass();
                    ch2Var2.getClass();
                    arrayListV.add(objRemove);
                    ch2Var2.c(iE);
                    ch2Var.c(iE2);
                }
            } else {
                i3++;
            }
        }
        if (arrayListV != null) {
            ch2Var.getClass();
            ch2Var2.getClass();
            int size = arrayListV.size() - 1;
            while (i2 < size) {
                int i4 = i2 + 1;
                int size2 = arrayListV.size();
                for (int i5 = i4; i5 < size2; i5++) {
                    int iA = ch2Var2.a(i2);
                    int iA2 = ch2Var2.a(i5);
                    if (iA < iA2 || (iA2 == iA && ch2Var.a(i2) < ch2Var.a(i5))) {
                        Object obj = arrayListV.get(i2);
                        arrayListV.set(i2, arrayListV.get(i5));
                        arrayListV.set(i5, obj);
                        int iA3 = ch2Var.a(i2);
                        ch2Var.f(i2, ch2Var.a(i5));
                        ch2Var.f(i5, iA3);
                        int iA4 = ch2Var2.a(i2);
                        ch2Var2.f(i2, ch2Var2.a(i5));
                        ch2Var2.f(i5, iA4);
                    }
                }
                i2 = i4;
            }
            oi2 oi2Var = this.d;
            oi2Var.f(oi2Var.h, arrayListV);
        }
    }

    public final void d(Object obj, int i, int i2, int i3) {
        c(i);
        if (i3 < 0 || i3 >= i) {
            this.d.c(obj);
            return;
        }
        this.g.add(obj);
        this.h.c(i2);
        this.i.c(i3);
    }
}
