package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vg0 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final yq3 f;
    public final yq3 g;

    public vg0(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = new yq3(new je1(this) { // from class: tg0
            public final /* synthetic */ vg0 d;

            {
                this.d = this;
            }

            @Override // defpackage.je1
            public final Object invoke() {
                int i2 = i;
                z21 z21Var = z21.c;
                int i3 = 0;
                vg0 vg0Var = this.d;
                switch (i2) {
                    case 0:
                        List list6 = vg0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            pe0.s0((List) ((je1) list6.get(i3)).invoke(), arrayList);
                            i3++;
                        }
                        vg0Var.d = z21Var;
                        return arrayList;
                    default:
                        List list7 = vg0Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            pe0.s0((List) ((je1) list7.get(i3)).invoke(), arrayList2);
                            i3++;
                        }
                        vg0Var.e = z21Var;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = new yq3(new je1(this) { // from class: tg0
            public final /* synthetic */ vg0 d;

            {
                this.d = this;
            }

            @Override // defpackage.je1
            public final Object invoke() {
                int i3 = i2;
                z21 z21Var = z21.c;
                int i4 = 0;
                vg0 vg0Var = this.d;
                switch (i3) {
                    case 0:
                        List list6 = vg0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i4 < size) {
                            pe0.s0((List) ((je1) list6.get(i4)).invoke(), arrayList);
                            i4++;
                        }
                        vg0Var.d = z21Var;
                        return arrayList;
                    default:
                        List list7 = vg0Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i4 < size2) {
                            pe0.s0((List) ((je1) list7.get(i4)).invoke(), arrayList2);
                            i4++;
                        }
                        vg0Var.e = z21Var;
                        return arrayList2;
                }
            }
        });
    }
}
