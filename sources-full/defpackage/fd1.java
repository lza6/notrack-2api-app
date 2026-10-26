package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fd1 extends yn2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(le1 le1Var) {
        super(true);
        this.e = le1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(nd1 nd1Var) {
        super(false);
        this.e = nd1Var;
    }

    @Override // defpackage.yn2
    public void a() {
        switch (this.d) {
            case 0:
                nd1 nd1Var = (nd1) this.e;
                if (nd1.K(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + nd1Var);
                }
                if (nd1.K(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + nd1Var.h);
                }
                er erVar = nd1Var.h;
                if (erVar != null) {
                    erVar.r = false;
                    erVar.d();
                    er erVar2 = nd1Var.h;
                    m3 m3Var = new m3(8, nd1Var);
                    if (erVar2.p == null) {
                        erVar2.p = new ArrayList();
                    }
                    erVar2.p.add(m3Var);
                    nd1Var.h.e(false, true);
                    nd1Var.i = true;
                    nd1Var.A(true);
                    nd1Var.E();
                    nd1Var.i = false;
                    nd1Var.h = null;
                }
                break;
        }
    }

    @Override // defpackage.yn2
    public final void b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                nd1 nd1Var = (nd1) obj;
                if (nd1.K(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + nd1Var);
                }
                fd1 fd1Var = nd1Var.j;
                ArrayList arrayList = nd1Var.n;
                nd1Var.i = true;
                nd1Var.A(true);
                int i2 = 0;
                nd1Var.i = false;
                if (nd1Var.h == null) {
                    if (fd1Var.a) {
                        if (nd1.K(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        nd1Var.S();
                        return;
                    } else {
                        if (nd1.K(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        nd1Var.g.c();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(nd1.F(nd1Var.h));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        if (obj2 != null) {
                            m51.t();
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw null;
                        }
                    }
                }
                ArrayList arrayList2 = nd1Var.h.a;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    xc1 xc1Var = ((xd1) obj3).b;
                    if (xc1Var != null) {
                        xc1Var.u = false;
                    }
                }
                for (vt0 vt0Var : nd1Var.f(new ArrayList(Collections.singletonList(nd1Var.h)), 0, 1)) {
                    ArrayList arrayList3 = vt0Var.c;
                    if (nd1.K(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    vt0Var.f(arrayList3);
                    arrayList3.getClass();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ((om3) it2.next()).getClass();
                        pe0.s0(null, arrayList4);
                    }
                    List listO0 = ke0.O0(ke0.S0(arrayList4));
                    int size3 = listO0.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        ((nm3) listO0.get(i5)).a(vt0Var.a);
                    }
                    int size4 = arrayList3.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        vt0Var.a((om3) arrayList3.get(i6));
                    }
                    List listO1 = ke0.O0(arrayList3);
                    if (listO1.size() > 0) {
                        ((om3) listO1.get(0)).getClass();
                        throw null;
                    }
                }
                ArrayList arrayList5 = nd1Var.h.a;
                int size5 = arrayList5.size();
                while (i2 < size5) {
                    Object obj4 = arrayList5.get(i2);
                    i2++;
                    xc1 xc1Var2 = ((xd1) obj4).b;
                    if (xc1Var2 != null && xc1Var2.N == null) {
                        nd1Var.g(xc1Var2).j();
                    }
                }
                nd1Var.h = null;
                nd1Var.h0();
                if (nd1.K(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + fd1Var.a + " for  FragmentManager " + nd1Var);
                    return;
                }
                return;
            default:
                ((le1) obj).invoke(this);
                return;
        }
    }

    @Override // defpackage.yn2
    public void c(zq zqVar) {
        switch (this.d) {
            case 0:
                nd1 nd1Var = (nd1) this.e;
                if (nd1.K(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + nd1Var);
                }
                if (nd1Var.h != null) {
                    for (vt0 vt0Var : nd1Var.f(new ArrayList(Collections.singletonList(nd1Var.h)), 0, 1)) {
                        vt0Var.getClass();
                        zqVar.getClass();
                        if (nd1.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + zqVar.c);
                        }
                        ArrayList arrayList = vt0Var.c;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((om3) obj).getClass();
                            pe0.s0(null, arrayList2);
                        }
                        List listO0 = ke0.O0(ke0.S0(arrayList2));
                        int size2 = listO0.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((nm3) listO0.get(i2)).b(zqVar, vt0Var.a);
                        }
                    }
                    Iterator it = nd1Var.n.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        m51.t();
                        break;
                    }
                }
                break;
            default:
                super.c(zqVar);
                break;
        }
    }

    @Override // defpackage.yn2
    public void d(zq zqVar) {
        switch (this.d) {
            case 0:
                nd1 nd1Var = (nd1) this.e;
                if (nd1.K(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + nd1Var);
                }
                nd1Var.x();
                nd1Var.y(new md1(nd1Var), false);
                break;
            default:
                super.d(zqVar);
                break;
        }
    }
}
