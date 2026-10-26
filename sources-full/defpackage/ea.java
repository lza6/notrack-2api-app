package defpackage;

import android.graphics.RectF;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.ClipEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ea extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(int i, Object obj) {
        super(2);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0315 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x0317 A[Catch: all -> 0x0305, LOOP:7: B:126:0x02d7->B:143:0x0317, LOOP_END, TryCatch #0 {all -> 0x0305, blocks: (B:119:0x02b4, B:121:0x02c4, B:123:0x02ca, B:126:0x02d7, B:128:0x02e2, B:130:0x02ec, B:132:0x02f2, B:134:0x02fb, B:139:0x0307, B:140:0x030a, B:143:0x0317, B:153:0x0341, B:144:0x031f, B:145:0x0325, B:147:0x032b, B:149:0x0333, B:152:0x033d), top: B:243:0x02b4 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x03b9 A[PHI: r0
  0x03b9: PHI (r0v46 ih3) = (r0v44 ih3), (r0v45 ih3) binds: [B:170:0x03b7, B:173:0x03c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:224:0x04be  */
    /* JADX WARN: Code duplicated, block: B:232:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:268:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        boolean zH;
        g93 g93Var;
        char c;
        Object objH0;
        char c2 = 7;
        long j = -9187201950435737472L;
        int i = 14;
        int i2 = 0;
        r00 r00VarU = null;
        String string = null;
        switch (this.c) {
            case 0:
                ((fa) this.d).h((ze3) obj2, ((Number) obj).intValue());
                return w84.a;
            case 1:
                mq1 mq1Var = (mq1) obj;
                mq1 mq1Var2 = (mq1) obj2;
                mi2 mi2Var = (mi2) this.d;
                int i3 = mq1Var2.a;
                int i4 = mq1Var2.d;
                int i5 = mq1Var2.c;
                int i6 = mq1Var2.b;
                int i7 = mq1Var.c;
                int i8 = mq1Var.b;
                int i9 = mq1Var.d;
                int i10 = mq1Var.a;
                float fMin2 = 1.0f;
                if (i3 >= i7) {
                    fMin = 0.0f;
                } else if (i5 <= i10) {
                    fMin = 1.0f;
                } else if (mq1Var2.d() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(mq1Var.c, i5) + Math.max(i10, i3)) / 2) - i3) / mq1Var2.d();
                }
                if (i6 >= i9) {
                    fMin2 = 0.0f;
                } else if (i4 > i8) {
                    if (mq1Var2.b() == 0) {
                        fMin2 = 0.0f;
                    } else {
                        fMin2 = (((Math.min(i9, i4) + Math.max(i8, i6)) / 2) - i6) / mq1Var2.b();
                    }
                }
                mi2Var.setValue(new e54(av1.b(fMin, fMin2)));
                return w84.a;
            case 2:
                j93 j93Var = (j93) this.d;
                h43 h43VarZ0 = xr0.z0((RectF) obj);
                h43 h43VarZ1 = xr0.z0((RectF) obj2);
                switch (j93Var.c) {
                    case 4:
                        zH = h43VarZ0.h(h43VarZ1);
                        break;
                    default:
                        long jC = h43VarZ0.c();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC & 4294967295L));
                        zH = (fIntBitsToFloat < h43VarZ1.c) & (fIntBitsToFloat >= h43VarZ1.a) & (fIntBitsToFloat2 >= h43VarZ1.b) & (fIntBitsToFloat2 < h43VarZ1.d);
                        break;
                }
                return Boolean.valueOf(zH);
            case 3:
                long jLongValue = ((Number) obj2).longValue();
                if (re3.a((qe3) this.d, jLongValue)) {
                    return Long.valueOf(jLongValue);
                }
                return null;
            case 4:
                py.F((gq0) this.d, null, jq0.l, new k((st3) obj2, (wx3) obj, r00VarU, i), 1);
                return w84.a;
            case 5:
                a93 a93Var = (a93) obj;
                List list = (List) ((ne1) this.d).invoke(a93Var, obj2);
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj3 = list.get(i11);
                    if (obj3 != null && (g93Var = a93Var.d) != null && !g93Var.canBeSaved(obj3)) {
                        u41.k("item can't be saved");
                        return null;
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 6:
                ((xt3) this.d).e(((ln2) obj2).a);
                return w84.a;
            case 7:
                long j2 = ((qq1) obj).a;
                long j3 = ((um0) obj2).a;
                ih3 ih3Var = ih3.c;
                float fG = um0.g(j3);
                hh3 hh3Var = (hh3) this.d;
                af2 af2Var = new af2(fG, j2, hh3Var);
                gz0 gz0Var = new gz0();
                af2Var.invoke(gz0Var);
                LinkedHashMap linkedHashMap = gz0Var.a;
                r92 r92Var = new r92(linkedHashMap);
                int iOrdinal = ((ih3) ((fv0) hh3Var.c.h).getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        u41.e();
                        return null;
                    }
                    ih3 ih3Var2 = ih3.h;
                    if (linkedHashMap.containsKey(ih3Var2)) {
                        ih3Var = ih3Var2;
                    } else {
                        ih3Var2 = ih3.d;
                        if (linkedHashMap.containsKey(ih3Var2)) {
                            ih3Var = ih3Var2;
                        }
                    }
                }
                return new ps2(r92Var, ih3Var);
            case 8:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                ((e01) this.d).b.h(fFloatValue);
                return w84.a;
            case 9:
                Set set = (Set) obj;
                d43 d43Var = (d43) this.d;
                synchronized (d43Var.b) {
                    try {
                        if (((z33) d43Var.t.getValue()).compareTo(z33.m) >= 0) {
                            gi2 gi2Var = d43Var.g;
                            if (set instanceof ta3) {
                                gi2 gi2Var2 = ((ta3) set).c;
                                Object[] objArr = gi2Var2.b;
                                long[] jArr = gi2Var2.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j4 = jArr[i12];
                                        if ((((~j4) << 7) & j4 & j) != j) {
                                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                                            for (int i14 = 0; i14 < i13; i14++) {
                                                if ((j4 & 255) < 128) {
                                                    Object obj4 = objArr[(i12 << 3) + i14];
                                                    if (!(obj4 instanceof mn3) || ((mn3) obj4).c(1)) {
                                                        gi2Var.a(obj4);
                                                    }
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i13 == 8) {
                                                if (i12 != length) {
                                                    i12++;
                                                    j = -9187201950435737472L;
                                                }
                                            }
                                        } else if (i12 != length) {
                                            i12++;
                                            j = -9187201950435737472L;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof mn3) || ((mn3) obj5).c(1)) {
                                        gi2Var.a(obj5);
                                    }
                                }
                            }
                            r00VarU = d43Var.u();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (r00VarU != null) {
                    ((t00) r00VarU).resumeWith(w84.a);
                }
                return w84.a;
            case 10:
                a93 a93Var2 = (a93) obj;
                mi2 mi2Var2 = (mi2) obj2;
                if (!(mi2Var2 instanceof zk3)) {
                    u41.k("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                Object objN = ((x93) this.d).n(a93Var2, mi2Var2.getValue());
                if (objN == null) {
                    return null;
                }
                bl3 bl3VarA = ((zk3) mi2Var2).a();
                bl3VarA.getClass();
                return new ft2(objN, bl3VarA);
            case 11:
                float fFloatValue2 = ((Number) obj).floatValue();
                float fFloatValue3 = ((Number) obj2).floatValue();
                fc3 fc3Var = (fc3) this.d;
                py.F(fc3Var.getCoroutineScope(), null, null, new ec3(fc3Var, fFloatValue2, fFloatValue3, null), 3);
                return Boolean.TRUE;
            case 12:
                long j5 = ((ln2) obj2).a;
                ((dx2) obj).a();
                ((p43) this.d).c = j5;
                return w84.a;
            case 13:
                cx1 cx1Var = (cx1) this.d;
                cx1 cx1VarC = ((vg2) obj).c();
                cx1 cx1VarC2 = ((vg2) obj2).c();
                long jY = cx1VarC != null ? cx1Var.y(cx1VarC, 0L) : 0L;
                long jY2 = cx1VarC2 != null ? cx1Var.y(cx1VarC2, 0L) : 0L;
                int i15 = (int) (jY & 4294967295L);
                int i16 = (int) (jY2 & 4294967295L);
                return Integer.valueOf(Float.intBitsToFloat(i15) == Float.intBitsToFloat(i16) ? yh4.s(Float.valueOf(Float.intBitsToFloat((int) (jY >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jY2 >> 32)))) : yh4.s(Float.valueOf(Float.intBitsToFloat(i15)), Float.valueOf(Float.intBitsToFloat(i16))));
            case 14:
                Set set2 = (Set) obj;
                if (set2 instanceof ta3) {
                    gi2 gi2Var3 = ((ta3) set2).c;
                    Object[] objArr2 = gi2Var3.b;
                    long[] jArr2 = gi2Var3.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j6 = jArr2[i17];
                            if ((((~j6) << c2) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                int i19 = i2;
                                while (true) {
                                    if (i19 < i18) {
                                        if ((j6 & 255) < 128) {
                                            Object obj6 = objArr2[(i17 << 3) + i19];
                                            if (!(obj6 instanceof mn3) || ((mn3) obj6).c(4)) {
                                            }
                                        }
                                        j6 >>= 8;
                                        i19++;
                                        c2 = c2;
                                    } else {
                                        c = c2;
                                        if (i18 == 8) {
                                        }
                                    }
                                }
                            } else {
                                c = c2;
                            }
                            if (i17 != length2) {
                                i17++;
                                c2 = c;
                                i2 = 0;
                            }
                        }
                        ((jy) this.d).i(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj7 : set3) {
                            if (!(obj7 instanceof mn3) || ((mn3) obj7).c(4)) {
                                ((jy) this.d).i(set2);
                            }
                        }
                    }
                }
                return w84.a;
            case 15:
                Set set4 = (Set) obj;
                ol3 ol3Var = (ol3) this.d;
                AtomicReference atomicReference = ol3Var.b;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        objH0 = set4;
                    } else if (obj8 instanceof Set) {
                        objH0 = kr1.U(obj8, set4);
                    } else {
                        if (!(obj8 instanceof List)) {
                            mk0.d("Unexpected notification");
                            u41.p();
                            return null;
                        }
                        objH0 = ke0.H0((Collection) obj8, kr1.T(set4));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj8, objH0)) {
                            if (ol3.a(ol3Var)) {
                                ol3Var.a.invoke(new i43(9, ol3Var));
                            }
                            return w84.a;
                        }
                    } while (atomicReference.get() == obj8);
                }
                break;
            case 16:
                ClipEntry clipEntry = (ClipEntry) obj;
                nu3 nu3Var = (nu3) this.d;
                nu3.y0(nu3Var);
                nu3Var.m.e();
                int itemCount = clipEntry.getClipData().getItemCount();
                int i20 = 0;
                boolean z = false;
                while (i20 < itemCount) {
                    boolean z2 = z || clipEntry.getClipData().getItemAt(i20).getText() != null;
                    i20++;
                    z = z2;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    int itemCount2 = clipEntry.getClipData().getItemCount();
                    int i21 = 0;
                    boolean z3 = false;
                    while (i21 < itemCount2) {
                        CharSequence text = clipEntry.getClipData().getItemAt(i21).getText();
                        if (text != null) {
                            if (z3) {
                                sb.append("\n");
                            }
                            sb.append(text);
                            z3 = true;
                        }
                        i21++;
                        z3 = z3;
                    }
                    string = sb.toString();
                }
                u33.a(nu3Var);
                if (string != null) {
                    c.h(nu3Var.h, string, false, 14);
                }
                return Boolean.TRUE;
            case 17:
                return new iq1(((long) ((xt) this.d).a(0, (int) (((qq1) obj).a & 4294967295L))) & 4294967295L);
            case 18:
                return new iq1(((yt) this.d).a(0L, ((qq1) obj).a, (dx1) obj2));
            default:
                return new iq1(((long) ((wt) this.d).a(0, (int) (((qq1) obj).a >> 32), (dx1) obj2)) << 32);
        }
    }
}
