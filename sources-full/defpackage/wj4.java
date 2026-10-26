package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.UShort;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class wj4 {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = mt2.d;
        mt2 mt2Var = Path$Companion.get("/");
        ps2[] ps2VarArr = {new ps2(mt2Var, new sj4(mt2Var, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(y92.S(1));
        y92.U(linkedHashMap, ps2VarArr);
        for (sj4 sj4Var : ke0.K0(arrayList, new fb1(11))) {
            if (((sj4) linkedHashMap.put(sj4Var.a, sj4Var)) == null) {
                while (true) {
                    mt2 mt2Var2 = sj4Var.a;
                    mt2 mt2VarC = mt2Var2.c();
                    if (mt2VarC == null) {
                        break;
                    }
                    sj4 sj4Var2 = (sj4) linkedHashMap.get(mt2VarC);
                    if (sj4Var2 != null) {
                        sj4Var2.q.add(mt2Var2);
                        break;
                    }
                    sj4 sj4Var3 = new sj4(mt2VarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMap.put(mt2VarC, sj4Var3);
                    sj4Var3.q.add(mt2Var2);
                    sj4Var = sj4Var3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final String b(int i) {
        yo4.m(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final tj4 c(mt2 mt2Var, a71 a71Var, le1 le1Var) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        a71Var.getClass();
        au1 au1VarO = a71Var.O(mt2Var);
        try {
            long size = au1VarO.size();
            long j = size - 22;
            if (j < 0) {
                throw new IOException("not a zip: size=" + au1VarO.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                u23 u23Var = new u23(au1VarO.a(j));
                try {
                    if (u23Var.c() == 101010256) {
                        int iL = u23Var.l() & UShort.MAX_VALUE;
                        int iL2 = u23Var.l() & UShort.MAX_VALUE;
                        long jL = u23Var.l() & UShort.MAX_VALUE;
                        if (jL != (u23Var.l() & UShort.MAX_VALUE) || iL != 0 || iL2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        u23Var.skip(4L);
                        long jC = 4294967295L & ((long) u23Var.c());
                        int iL3 = u23Var.l() & UShort.MAX_VALUE;
                        q41 q41Var = new q41(jL, jC, iL3);
                        u23Var.p(iL3);
                        u23Var.close();
                        long j2 = j - 20;
                        if (j2 > 0) {
                            u23 u23Var2 = new u23(au1VarO.a(j2));
                            try {
                                if (u23Var2.c() == 117853008) {
                                    int iC = u23Var2.c();
                                    long jH = u23Var2.h();
                                    if (u23Var2.c() != 1 || iC != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    u23 u23Var3 = new u23(au1VarO.a(jH));
                                    try {
                                        int iC2 = u23Var3.c();
                                        if (iC2 != 101075792) {
                                            throw new IOException("bad zip: expected " + b(101075792) + " but was " + b(iC2));
                                        }
                                        u23Var3.skip(12L);
                                        int iC3 = u23Var3.c();
                                        int iC4 = u23Var3.c();
                                        long jH2 = u23Var3.h();
                                        if (jH2 != u23Var3.h() || iC3 != 0 || iC4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        u23Var3.skip(8L);
                                        q41 q41Var2 = new q41(jH2, u23Var3.h(), iL3);
                                        try {
                                            u23Var3.close();
                                            th3 = null;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                        }
                                        q41Var = q41Var2;
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            u23Var3.close();
                                        } catch (Throwable th6) {
                                            gb2.l(th5, th6);
                                        }
                                        th3 = th5;
                                    }
                                }
                                try {
                                    u23Var2.close();
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    u23Var2.close();
                                } catch (Throwable th9) {
                                    gb2.l(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        u23 u23Var4 = new u23(au1VarO.a(q41Var.b));
                        try {
                            long j3 = q41Var.a;
                            for (long j4 = 0; j4 < j3; j4++) {
                                sj4 sj4VarD = d(u23Var4);
                                if (sj4VarD.h >= q41Var.b) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) le1Var.invoke(sj4VarD)).booleanValue()) {
                                    arrayList.add(sj4VarD);
                                }
                            }
                            try {
                                u23Var4.close();
                                th = null;
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        } catch (Throwable th11) {
                            try {
                                u23Var4.close();
                            } catch (Throwable th12) {
                                gb2.l(th11, th12);
                            }
                            th = th11;
                        }
                        if (th != null) {
                            throw th;
                        }
                        tj4 tj4Var = new tj4(mt2Var, a71Var, a(arrayList));
                        try {
                            au1VarO.close();
                        } catch (Throwable unused) {
                        }
                        return tj4Var;
                    }
                    u23Var.close();
                    j--;
                } catch (Throwable th13) {
                    u23Var.close();
                    throw th13;
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th14) {
            if (au1VarO == null) {
                throw th14;
            }
            try {
                au1VarO.close();
                throw th14;
            } catch (Throwable th15) {
                gb2.l(th14, th15);
                throw th14;
            }
        }
    }

    public static final sj4 d(final u23 u23Var) throws IOException {
        int iC = u23Var.c();
        if (iC != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iC));
        }
        u23Var.skip(4L);
        short sL = u23Var.l();
        int i = sL & UShort.MAX_VALUE;
        if ((sL & 1) != 0) {
            m51.l("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        int iL = u23Var.l() & UShort.MAX_VALUE;
        int iL2 = u23Var.l() & UShort.MAX_VALUE;
        int iL3 = u23Var.l() & UShort.MAX_VALUE;
        long jC = ((long) u23Var.c()) & 4294967295L;
        final p43 p43Var = new p43();
        p43Var.c = ((long) u23Var.c()) & 4294967295L;
        final p43 p43Var2 = new p43();
        p43Var2.c = ((long) u23Var.c()) & 4294967295L;
        int iL4 = u23Var.l() & UShort.MAX_VALUE;
        int iL5 = u23Var.l() & UShort.MAX_VALUE;
        int iL6 = u23Var.l() & UShort.MAX_VALUE;
        u23Var.skip(8L);
        final p43 p43Var3 = new p43();
        p43Var3.c = ((long) u23Var.c()) & 4294967295L;
        String strP = u23Var.p(iL4);
        if (mo3.v0(strP, (char) 0)) {
            m51.l("bad zip: filename contains 0x00");
            return null;
        }
        long j = p43Var2.c == 4294967295L ? 8L : 0L;
        if (p43Var.c == 4294967295L) {
            j += 8;
        }
        if (p43Var3.c == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final q43 q43Var = new q43();
        final q43 q43Var2 = new q43();
        final q43 q43Var3 = new q43();
        final l43 l43Var = new l43();
        e(u23Var, iL5, new ne1() { // from class: vj4
            @Override // defpackage.ne1
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                u23 u23Var2 = u23Var;
                if (iIntValue == 1) {
                    l43 l43Var2 = l43Var;
                    if (l43Var2.c) {
                        m51.l("bad zip: zip64 extra repeated");
                        return null;
                    }
                    l43Var2.c = true;
                    if (jLongValue < j2) {
                        m51.l("bad zip: zip64 extra too short");
                        return null;
                    }
                    p43 p43Var4 = p43Var2;
                    long jH = p43Var4.c;
                    if (jH == 4294967295L) {
                        jH = u23Var2.h();
                    }
                    p43Var4.c = jH;
                    p43 p43Var5 = p43Var;
                    p43Var5.c = p43Var5.c == 4294967295L ? u23Var2.h() : 0L;
                    p43 p43Var6 = p43Var3;
                    p43Var6.c = p43Var6.c == 4294967295L ? u23Var2.h() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        m51.l("bad zip: NTFS extra too short");
                        return null;
                    }
                    u23Var2.skip(4L);
                    wj4.e(u23Var2, (int) (jLongValue - 4), new uj4(q43Var, u23Var2, q43Var2, q43Var3));
                }
                return w84.a;
            }
        });
        if (j2 > 0 && !l43Var.c) {
            m51.l("bad zip: zip64 extra required but absent");
            return null;
        }
        String strP2 = u23Var.p(iL6);
        String str = mt2.d;
        return new sj4(Path$Companion.get("/").e(strP), to3.j0(strP, "/", false), strP2, jC, p43Var.c, p43Var2.c, iL, p43Var3.c, iL3, iL2, (Long) q43Var.c, (Long) q43Var2.c, (Long) q43Var3.c, 57344);
    }

    public static final void e(u23 u23Var, int i, ne1 ne1Var) throws IOException {
        dy dyVar = u23Var.d;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                m51.l("bad zip: truncated header in extra field");
                return;
            }
            int iL = u23Var.l() & UShort.MAX_VALUE;
            long jL = ((long) u23Var.l()) & 65535;
            long j2 = j - 4;
            if (j2 < jL) {
                m51.l("bad zip: truncated value in extra field");
                return;
            }
            u23Var.F(jL);
            long j3 = dyVar.d;
            ne1Var.invoke(Integer.valueOf(iL), Long.valueOf(jL));
            long j4 = (dyVar.d + jL) - j3;
            if (j4 < 0) {
                m51.l(ud2.m(iL, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    dyVar.skip(j4);
                }
                j = j2 - jL;
            }
        }
    }

    public static final sj4 f(u23 u23Var, sj4 sj4Var) throws IOException {
        int iC = u23Var.c();
        if (iC != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iC));
        }
        u23Var.skip(2L);
        short sL = u23Var.l();
        int i = sL & UShort.MAX_VALUE;
        if ((sL & 1) != 0) {
            m51.l("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        u23Var.skip(18L);
        long jL = ((long) u23Var.l()) & 65535;
        int iL = u23Var.l() & UShort.MAX_VALUE;
        u23Var.skip(jL);
        if (sj4Var == null) {
            u23Var.skip(iL);
            return null;
        }
        q43 q43Var = new q43();
        q43 q43Var2 = new q43();
        q43 q43Var3 = new q43();
        e(u23Var, iL, new uj4(u23Var, q43Var, q43Var2, q43Var3));
        return new sj4(sj4Var.a, sj4Var.b, sj4Var.c, sj4Var.d, sj4Var.e, sj4Var.f, sj4Var.g, sj4Var.h, sj4Var.i, sj4Var.j, sj4Var.k, sj4Var.l, sj4Var.m, (Integer) q43Var.c, (Integer) q43Var2.c, (Integer) q43Var3.c);
    }

    public static /* synthetic */ boolean g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, js4 js4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(js4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(js4Var) != obj && atomicReferenceFieldUpdater.get(js4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
