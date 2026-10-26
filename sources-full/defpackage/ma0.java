package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class ma0 implements je1 {
    public final /* synthetic */ yd2 c;
    public final /* synthetic */ hb0 d;
    public final /* synthetic */ mi2 h;
    public final /* synthetic */ mi2 l;

    public ma0(yd2 yd2Var, hb0 hb0Var, mi2 mi2Var, mi2 mi2Var2) {
        this.c = yd2Var;
        this.d = hb0Var;
        this.h = mi2Var;
        this.l = mi2Var2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int iNextIndex;
        Object value;
        Object value2;
        xa0 xa0Var;
        ArrayList arrayList;
        yd2 yd2Var = this.c;
        mm3 mm3Var = yd2Var.c;
        hb0 hb0Var = this.d;
        jn3 jn3Var = hb0Var.c;
        mi2 mi2Var = this.h;
        mm3 mm3Var2 = mm3.d;
        if (mm3Var == mm3Var2) {
            String str = yd2Var.a;
            String str2 = (String) mi2Var.getValue();
            str.getClass();
            str2.getClass();
            do {
                value2 = jn3Var.getValue();
                xa0Var = (xa0) value2;
                List<yd2> list = xa0Var.a;
                arrayList = new ArrayList(le0.q0(list, 10));
                for (yd2 yd2VarA : list) {
                    if (kr1.n(yd2VarA.a, str) && yd2VarA.c == mm3Var2) {
                        yd2VarA = yd2.a(yd2VarA, null, str2.equals(yd2VarA.b) ? null : str2, null, 447);
                    }
                    arrayList.add(yd2VarA);
                }
            } while (!jn3Var.n(value2, xa0.a(xa0Var, arrayList, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        } else {
            String str3 = (String) mi2Var.getValue();
            str3.getClass();
            jn3 jn3Var2 = hb0Var.d.c;
            if (!((xa0) jn3Var2.getValue()).b) {
                String string = mo3.U0(str3).toString();
                if (string.length() != 0) {
                    List list2 = ((xa0) jn3Var2.getValue()).a;
                    ListIterator listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iNextIndex = -1;
                            break;
                        }
                        if (((yd2) listIterator.previous()).c == mm3.c) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (iNextIndex != -1) {
                        yd2 yd2Var2 = (yd2) list2.get(iNextIndex);
                        if (!string.equals(yd2Var2.b)) {
                            List list3 = yd2Var2.f;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list3) {
                                if (((hn) obj).e == gn.d) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayList2.get(i);
                                i++;
                                String str4 = ((hn) obj2).a;
                                if (str4 != null) {
                                    arrayList3.add(str4);
                                }
                            }
                            ArrayList arrayListI0 = ke0.I0(ke0.O0(list2.subList(0, iNextIndex)), yd2.a(yd2Var2, string, null, null, 509));
                            do {
                                value = jn3Var.getValue();
                            } while (!jn3Var.n(value, xa0.a((xa0) value, arrayListI0, true, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -4, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                            hb0Var.X(c50.a);
                            hb0Var.X(e50.a);
                            ym3 ym3Var = hb0Var.g;
                            if (ym3Var != null) {
                                ym3Var.c(null);
                            }
                            hb0Var.w();
                            hb0Var.g = py.F(id4.a(hb0Var), null, null, new qb(hb0Var, string, ((xa0) jn3Var2.getValue()).c, arrayList3, null, 6), 3);
                        }
                    }
                }
            }
        }
        this.l.setValue(null);
        return w84.a;
    }
}
