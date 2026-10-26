package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x42 implements vb2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x42(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        int i = this.a;
        int i2 = 2;
        Object obj = this.b;
        String str = "Collection contains no element matching the predicate.";
        a31 a31Var = a31.c;
        switch (i) {
            case 0:
                return xb2Var.s(um0.h(j), um0.g(j), a31Var, new rc(list, 28, this));
            case 1:
                n23 n23Var = (n23) obj;
                ct2 ct2Var = n23Var.k;
                bt2 bt2Var = n23Var.p;
                bt2 bt2Var2 = n23Var.q;
                int size = list.size();
                int i3 = 0;
                while (i3 < size) {
                    qb2 qb2Var = (qb2) list.get(i3);
                    if (a.a(qb2Var) == l23.d) {
                        nv2 nv2VarC = qb2Var.c(j);
                        int size2 = list.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            qb2 qb2Var2 = (qb2) list.get(i4);
                            int i5 = i2;
                            if (a.a(qb2Var2) == l23.c) {
                                nv2 nv2VarC2 = qb2Var2.c(j);
                                int size3 = list.size();
                                int i6 = 0;
                                while (i6 < size3) {
                                    qb2 qb2Var3 = (qb2) list.get(i6);
                                    String str2 = str;
                                    if (a.a(qb2Var3) == l23.h) {
                                        nv2 nv2VarC3 = qb2Var3.c(um0.a(wm0.j(j, (-(nv2VarC.c + nv2VarC2.c)) / 2, 0, i5), 0, 0, 0, 0, 11));
                                        int i7 = ((nv2VarC.c + nv2VarC2.c) / 2) + nv2VarC3.c;
                                        int iMax = Math.max(nv2VarC3.d, Math.max(nv2VarC.d, nv2VarC2.d));
                                        n23Var.h.h(nv2VarC3.d);
                                        ct2Var.h(i7);
                                        float fMax = Math.max(ct2Var.f() - (n23Var.j.f() / 2.0f), 0.0f);
                                        float fMin = Math.min(n23Var.i.f() / 2.0f, fMax);
                                        if (bt2Var2.f() != fMin || bt2Var.f() != fMax) {
                                            bt2Var2.h(fMin);
                                            bt2Var.h(fMax);
                                            n23Var.l.h(n23Var.f(bt2Var2.f(), bt2Var.f(), n23Var.d.f()));
                                            n23Var.m.h(n23Var.f(bt2Var2.f(), bt2Var.f(), n23Var.e.f()));
                                        }
                                        return xb2Var.s(i7, iMax, a31Var, new zi3(nv2VarC3, nv2VarC.c / 2, (iMax - nv2VarC3.d) / 2, nv2VarC, gb2.R(n23Var.b() * nv2VarC3.c), (iMax - nv2VarC.d) / 2, nv2VarC2, gb2.R((n23Var.a() * nv2VarC3.c) + ((nv2VarC.c - nv2VarC2.c) / 2)), (iMax - nv2VarC2.d) / 2));
                                    }
                                    i6++;
                                    str = str2;
                                }
                                j93.g(str);
                                return null;
                            }
                            i4++;
                            i2 = i5;
                            str = str;
                        }
                        j93.g(str);
                        return null;
                    }
                    i3++;
                    str = str;
                }
                j93.g(str);
                return null;
            default:
                uj3 uj3Var = (uj3) obj;
                int size4 = list.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    qb2 qb2Var4 = (qb2) list.get(i8);
                    if (a.a(qb2Var4) == ji3.c) {
                        nv2 nv2VarC4 = qb2Var4.c(j);
                        int size5 = list.size();
                        for (int i9 = 0; i9 < size5; i9++) {
                            qb2 qb2Var5 = (qb2) list.get(i9);
                            if (a.a(qb2Var5) == ji3.d) {
                                nv2 nv2VarC5 = qb2Var5.c(um0.a(wm0.j(j, -nv2VarC4.c, 0, 2), 0, 0, 0, 0, 11));
                                int i10 = nv2VarC4.c + nv2VarC5.c;
                                int iMax2 = Math.max(nv2VarC5.d, nv2VarC4.d);
                                uj3Var.i.h(nv2VarC5.d);
                                uj3Var.g.h(i10);
                                return xb2Var.s(i10, iMax2, a31Var, new kj3(nv2VarC5, nv2VarC4.c / 2, (iMax2 - nv2VarC5.d) / 2, nv2VarC4, gb2.R(uj3Var.c() * nv2VarC5.c), (iMax2 - nv2VarC4.d) / 2));
                            }
                        }
                        j93.g("Collection contains no element matching the predicate.");
                        return null;
                    }
                }
                j93.g("Collection contains no element matching the predicate.");
                return null;
        }
    }
}
