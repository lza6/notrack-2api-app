package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b43 extends ww1 implements le1 {
    public final /* synthetic */ d43 c;
    public final /* synthetic */ gi2 d;
    public final /* synthetic */ gi2 h;
    public final /* synthetic */ List l;
    public final /* synthetic */ List m;
    public final /* synthetic */ gi2 n;
    public final /* synthetic */ List o;
    public final /* synthetic */ gi2 p;
    public final /* synthetic */ Set q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b43(d43 d43Var, gi2 gi2Var, gi2 gi2Var2, List list, List list2, gi2 gi2Var3, List list3, gi2 gi2Var4, Set set) {
        super(1);
        this.c = d43Var;
        this.d = gi2Var;
        this.h = gi2Var2;
        this.l = list;
        this.m = list2;
        this.n = gi2Var3;
        this.o = list3;
        this.p = gi2Var4;
        this.q = set;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0179 A[Catch: all -> 0x018f, TryCatch #7 {all -> 0x018f, blocks: (B:94:0x0155, B:97:0x015f, B:99:0x016d, B:101:0x0179, B:103:0x017f), top: B:213:0x0155, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x017f A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #7 {all -> 0x018f, blocks: (B:94:0x0155, B:97:0x015f, B:99:0x016d, B:101:0x0179, B:103:0x017f), top: B:213:0x0155, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a1 A[LOOP:2: B:97:0x015f->B:113:0x01a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba A[Catch: all -> 0x02b3, TryCatch #10 {all -> 0x02b3, blocks: (B:28:0x005d, B:29:0x0062, B:36:0x007e, B:37:0x007f, B:38:0x0085, B:40:0x008c, B:43:0x0094, B:54:0x00c2, B:62:0x00d9, B:84:0x0136, B:92:0x014f, B:114:0x01a6, B:121:0x01ba, B:122:0x01bc, B:124:0x01c0, B:125:0x01c1, B:127:0x01d4, B:128:0x01d5, B:117:0x01b0, B:119:0x01b6, B:120:0x01b9, B:87:0x0140, B:89:0x0145, B:90:0x0148, B:57:0x00cc, B:60:0x00d5, B:61:0x00d8, B:138:0x01f7, B:140:0x0200, B:168:0x0266, B:181:0x0294, B:142:0x0206, B:143:0x0208, B:167:0x0265, B:182:0x029c, B:183:0x029d, B:185:0x02a4, B:190:0x02ad, B:191:0x02b0, B:192:0x02b1, B:193:0x02b2, B:65:0x00e4, B:68:0x00f5, B:70:0x0105, B:72:0x010f, B:74:0x0115, B:86:0x013a, B:144:0x0209, B:146:0x0214, B:148:0x0220, B:150:0x0226, B:153:0x022d, B:154:0x0230, B:158:0x023a, B:160:0x0244, B:162:0x024a, B:165:0x025a, B:164:0x0252, B:166:0x025d, B:184:0x029e, B:129:0x01d6, B:131:0x01dd, B:133:0x01e9, B:136:0x01f1, B:45:0x009a, B:47:0x00a1, B:50:0x00af, B:52:0x00b6, B:94:0x0155, B:97:0x015f, B:99:0x016d, B:101:0x0179, B:103:0x017f, B:170:0x026c, B:171:0x026f, B:173:0x0275, B:174:0x0280, B:176:0x0286, B:177:0x028e, B:123:0x01bd, B:56:0x00c6, B:116:0x01aa, B:30:0x0063, B:32:0x006c, B:35:0x0079), top: B:219:0x005d, inners: #0, #2, #3, #4, #5, #6, #7, #8, #9, #11, #12, #13 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:200:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x01a6 A[EDGE_INSN: B:235:0x01a6->B:114:0x01a6 BREAK  A[LOOP:2: B:97:0x015f->B:113:0x01a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x01a6 A[EDGE_INSN: B:236:0x01a6->B:114:0x01a6 BREAK  A[LOOP:2: B:97:0x015f->B:113:0x01a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0136 A[EDGE_INSN: B:238:0x0136->B:84:0x0136 BREAK  A[LOOP:4: B:68:0x00f5->B:82:0x012f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0136 A[EDGE_INSN: B:239:0x0136->B:84:0x0136 BREAK  A[LOOP:4: B:68:0x00f5->B:82:0x012f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:65:0x00e4, B:68:0x00f5, B:70:0x0105, B:72:0x010f, B:74:0x0115), top: B:200:0x00e4, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x010f A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:65:0x00e4, B:68:0x00f5, B:70:0x0105, B:72:0x010f, B:74:0x0115), top: B:200:0x00e4, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0115 A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:65:0x00e4, B:68:0x00f5, B:70:0x0105, B:72:0x010f, B:74:0x0115), top: B:200:0x00e4, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x012f A[LOOP:4: B:68:0x00f5->B:82:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x015e  */
    /* JADX WARN: Code duplicated, block: B:99:0x016d A[Catch: all -> 0x018f, TryCatch #7 {all -> 0x018f, blocks: (B:94:0x0155, B:97:0x015f, B:99:0x016d, B:101:0x0179, B:103:0x017f), top: B:213:0x0155, outer: #10 }] */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        boolean zV;
        Object[] objArr;
        Object[] objArr2;
        char c;
        long[] jArr;
        int length;
        long j;
        long j2;
        int i;
        long j3;
        int i2;
        int i3;
        Object[] objArr3;
        long[] jArr2;
        int length2;
        int i4;
        long j4;
        Object[] objArr4;
        long[] jArr3;
        int i5;
        int i6;
        boolean z;
        long jLongValue = ((Number) obj).longValue();
        d43 d43Var = this.c;
        synchronized (d43Var.b) {
            zV = d43Var.v();
        }
        if (zV) {
            d43 d43Var2 = this.c;
            Trace.beginSection("Recomposer:animation");
            try {
                d43Var2.a.b(jLongValue);
                synchronized (vk3.b) {
                    gi2 gi2Var = vk3.i.h;
                    if (gi2Var != null) {
                        z = gi2Var.h();
                    }
                }
                if (z) {
                    vk3.a();
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        d43 d43Var3 = this.c;
        gi2 gi2Var2 = this.d;
        gi2 gi2Var3 = this.h;
        List list = this.l;
        List list2 = this.m;
        gi2 gi2Var4 = this.n;
        List list3 = this.o;
        gi2 gi2Var5 = this.p;
        Set set = this.q;
        Trace.beginSection("Recomposer:recompose");
        try {
            d43.r(d43Var3);
            synchronized (d43Var3.b) {
                try {
                    oi2 oi2Var = d43Var3.h;
                    Object[] objArr5 = oi2Var.c;
                    int i7 = oi2Var.h;
                    for (int i8 = 0; i8 < i7; i8++) {
                        list.add((tk0) objArr5[i8]);
                    }
                    d43Var3.h.i();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            gi2Var2.b();
            gi2Var3.b();
            while (true) {
                if (list.isEmpty() && list2.isEmpty()) {
                    break;
                }
                try {
                    int size = list.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        tk0 tk0Var = (tk0) list.get(i9);
                        tk0 tk0VarQ = d43.q(d43Var3, tk0Var, gi2Var2);
                        if (tk0VarQ != null) {
                            list3.add(tk0VarQ);
                        }
                        gi2Var3.a(tk0Var);
                    }
                    list.clear();
                    if (gi2Var2.h() || d43Var3.h.h != 0) {
                        synchronized (d43Var3.b) {
                            try {
                                List listX = d43Var3.x();
                                int size2 = listX.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    tk0 tk0Var2 = (tk0) listX.get(i10);
                                    if (!gi2Var3.c(tk0Var2) && tk0Var2.v(set)) {
                                        list.add(tk0Var2);
                                    }
                                }
                                oi2 oi2Var2 = d43Var3.h;
                                int i11 = oi2Var2.h;
                                int i12 = 0;
                                int i13 = 0;
                                while (true) {
                                    objArr = oi2Var2.c;
                                    if (i12 >= i11) {
                                        break;
                                    }
                                    tk0 tk0Var3 = (tk0) objArr[i12];
                                    if (!gi2Var3.c(tk0Var3) && !list.contains(tk0Var3)) {
                                        list.add(tk0Var3);
                                        i13++;
                                    } else if (i13 > 0) {
                                        Object[] objArr6 = oi2Var2.c;
                                        objArr6[i12 - i13] = objArr6[i12];
                                    }
                                    i12++;
                                }
                                int i14 = i11 - i13;
                                Arrays.fill(objArr, i14, i11, (Object) null);
                                oi2Var2.h = i14;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    if (list.isEmpty()) {
                        try {
                            c43.h(list2, d43Var3);
                            while (!list2.isEmpty()) {
                                List listZ = d43Var3.z(list2, gi2Var2);
                                gi2Var4.getClass();
                                Iterator it = listZ.iterator();
                                while (it.hasNext()) {
                                    gi2Var4.k(it.next());
                                }
                                c43.h(list2, d43Var3);
                            }
                        } catch (Throwable th4) {
                            d43Var3.A(th4, null);
                            c43.a(d43Var3, list, list2, list3, gi2Var4, gi2Var5, gi2Var2, gi2Var3);
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        d43Var3.A(th5, null);
                        c43.a(d43Var3, list, list2, list3, gi2Var4, gi2Var5, gi2Var2, gi2Var3);
                        list.clear();
                    } catch (Throwable th6) {
                        list.clear();
                        throw th6;
                    }
                }
                Trace.endSection();
                return w84.a;
            }
            if (list3.isEmpty()) {
                if (gi2Var4.h()) {
                    gi2Var5.j(gi2Var4);
                    objArr2 = gi2Var4.b;
                    c = 7;
                    jArr = gi2Var4.a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i = 0;
                        j = 128;
                        while (true) {
                            j3 = jArr[i];
                            j2 = 255;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                i2 = 8 - ((~(i - length)) >>> 31);
                                for (i3 = 0; i3 < i2; i3++) {
                                    if ((j3 & 255) < 128) {
                                        ((tk0) objArr2[(i << 3) + i3]).i();
                                    }
                                    j3 >>= 8;
                                }
                                if (i2 == 8) {
                                    break;
                                    break;
                                }
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                        }
                    } else {
                        j = 128;
                        j2 = 255;
                    }
                    gi2Var4.b();
                } else {
                    c = 7;
                    j = 128;
                    j2 = 255;
                }
                if (gi2Var5.h()) {
                    objArr3 = gi2Var5.b;
                    jArr2 = gi2Var5.a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i4 = 0;
                        while (true) {
                            j4 = jArr2[i4];
                            objArr4 = objArr3;
                            jArr3 = jArr2;
                            if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                i5 = 8 - ((~(i4 - length2)) >>> 31);
                                for (i6 = 0; i6 < i5; i6++) {
                                    if ((j4 & j2) < j) {
                                        ((tk0) objArr4[(i4 << 3) + i6]).j();
                                    }
                                    j4 >>= 8;
                                }
                                if (i5 == 8) {
                                    break;
                                    break;
                                }
                            }
                            if (i4 != length2) {
                                break;
                                break;
                            }
                            i4++;
                            objArr3 = objArr4;
                            jArr2 = jArr3;
                        }
                    }
                    gi2Var5.b();
                    synchronized (d43Var3.b) {
                        d43Var3.u();
                        vk3.k().m();
                        gi2Var3.b();
                        gi2Var2.b();
                        d43Var3.p = null;
                    }
                } else {
                    synchronized (d43Var3.b) {
                        d43Var3.u();
                        vk3.k().m();
                        gi2Var3.b();
                        gi2Var2.b();
                        d43Var3.p = null;
                    }
                }
            } else {
                try {
                    int size3 = list3.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        gi2Var5.a((tk0) list3.get(i15));
                    }
                    int size4 = list3.size();
                    for (int i16 = 0; i16 < size4; i16++) {
                        ((tk0) list3.get(i16)).g();
                    }
                    list3.clear();
                    if (gi2Var4.h()) {
                        try {
                            gi2Var5.j(gi2Var4);
                            objArr2 = gi2Var4.b;
                            c = 7;
                            jArr = gi2Var4.a;
                            length = jArr.length - 2;
                            if (length >= 0) {
                                i = 0;
                                j = 128;
                                while (true) {
                                    j3 = jArr[i];
                                    j2 = 255;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        if (i != length) {
                                            break;
                                            break;
                                        }
                                        i++;
                                    } else {
                                        i2 = 8 - ((~(i - length)) >>> 31);
                                        while (i3 < i2) {
                                            if ((j3 & 255) < 128) {
                                                ((tk0) objArr2[(i << 3) + i3]).i();
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i2 == 8) {
                                            break;
                                        }
                                        if (i != length) {
                                            break;
                                        }
                                        i++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                            gi2Var4.b();
                        } catch (Throwable th7) {
                            try {
                                d43Var3.A(th7, null);
                                c43.a(d43Var3, list, list2, list3, gi2Var4, gi2Var5, gi2Var2, gi2Var3);
                                gi2Var4.b();
                            } catch (Throwable th8) {
                                gi2Var4.b();
                                throw th8;
                            }
                        }
                    } else {
                        c = 7;
                        j = 128;
                        j2 = 255;
                    }
                    if (gi2Var5.h()) {
                        try {
                            objArr3 = gi2Var5.b;
                            jArr2 = gi2Var5.a;
                            length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                i4 = 0;
                                while (true) {
                                    j4 = jArr2[i4];
                                    objArr4 = objArr3;
                                    jArr3 = jArr2;
                                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i5 = 8 - ((~(i4 - length2)) >>> 31);
                                        while (i6 < i5) {
                                            if ((j4 & j2) < j) {
                                                ((tk0) objArr4[(i4 << 3) + i6]).j();
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i5 == 8) {
                                            break;
                                        }
                                    }
                                    if (i4 != length2) {
                                        break;
                                    }
                                    i4++;
                                    objArr3 = objArr4;
                                    jArr2 = jArr3;
                                }
                            }
                            gi2Var5.b();
                            synchronized (d43Var3.b) {
                                d43Var3.u();
                            }
                            vk3.k().m();
                            gi2Var3.b();
                            gi2Var2.b();
                            d43Var3.p = null;
                        } catch (Throwable th9) {
                            try {
                                d43Var3.A(th9, null);
                                c43.a(d43Var3, list, list2, list3, gi2Var4, gi2Var5, gi2Var2, gi2Var3);
                                gi2Var5.b();
                            } catch (Throwable th10) {
                                gi2Var5.b();
                                throw th10;
                            }
                        }
                    } else {
                        synchronized (d43Var3.b) {
                            d43Var3.u();
                            vk3.k().m();
                            gi2Var3.b();
                            gi2Var2.b();
                            d43Var3.p = null;
                        }
                    }
                } catch (Throwable th11) {
                    try {
                        d43Var3.A(th11, null);
                        c43.a(d43Var3, list, list2, list3, gi2Var4, gi2Var5, gi2Var2, gi2Var3);
                        list3.clear();
                    } catch (Throwable th12) {
                        list3.clear();
                        throw th12;
                    }
                }
            }
            Trace.endSection();
            return w84.a;
        } catch (Throwable th13) {
            Trace.endSection();
            throw th13;
        }
    }
}
