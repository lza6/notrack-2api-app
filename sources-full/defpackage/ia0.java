package defpackage;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia0 extends we1 implements je1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.c = i3;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0586  */
    /* JADX WARN: Code duplicated, block: B:156:0x058a  */
    /* JADX WARN: Code duplicated, block: B:164:0x05b6 A[Catch: Exception -> 0x05c2, TRY_LEAVE, TryCatch #0 {Exception -> 0x05c2, blocks: (B:162:0x05b0, B:164:0x05b6), top: B:191:0x05b0 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x05b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x01ef A[LOOP:2: B:31:0x01ba->B:41:0x01ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x02b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x02b7 A[LOOP:6: B:79:0x0289->B:89:0x02b7, LOOP_END] */
    @Override // defpackage.je1
    public final Object invoke() {
        Object value;
        Object value2;
        xa0 xa0Var;
        ArrayList arrayListP0;
        int iNextIndex;
        Object value3;
        float f;
        float f2;
        Object value4;
        MediaPlayer mediaPlayer;
        Object value5;
        List listO0;
        int iNextIndex2;
        Object value6;
        yd ydVar;
        Object value7;
        Object value8;
        int i = this.c;
        cb1 cb1Var = cb1.l;
        int i2 = -1;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                hb0 hb0Var = (hb0) this.receiver;
                jn3 jn3Var = hb0Var.c;
                ym3 ym3Var = hb0Var.g;
                if (ym3Var != null) {
                    ym3Var.c(null);
                }
                hb0Var.y();
                hb0Var.g = null;
                do {
                    value = jn3Var.getValue();
                } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -3, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                do {
                    value2 = jn3Var.getValue();
                    xa0Var = (xa0) value2;
                    arrayListP0 = ke0.P0(xa0Var.a);
                    ListIterator listIterator = arrayListP0.listIterator(arrayListP0.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            yd2 yd2Var = (yd2) listIterator.previous();
                            if (yd2Var.c == mm3.d && yd2Var.e) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        arrayListP0.set(iNextIndex, yd2.a((yd2) arrayListP0.get(iNextIndex), null, null, null, 495));
                    }
                } while (!jn3Var.n(value2, xa0.a(xa0Var, arrayListP0, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                break;
            case 1:
                jn3 jn3Var2 = ((hb0) this.receiver).c;
                do {
                    value3 = jn3Var2.getValue();
                } while (!jn3Var2.n(value3, xa0.a((xa0) value3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, true, null, null, null, null, null, null, -1, -1, 253)));
                break;
            case 2:
                ef4 ef4VarH = ((hb0) this.receiver).H();
                jn3 jn3Var3 = ef4VarH.d;
                float f3 = ((we4) jn3Var3.getValue()).h;
                float[] fArr = ef4.s;
                int length = fArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    if (fArr[i3] == f3) {
                        i2 = i3;
                        if (i2 < 0) {
                            f = fArr[0];
                        } else {
                            f = fArr[(i2 + 1) % fArr.length];
                        }
                        f2 = f;
                        do {
                            value4 = jn3Var3.getValue();
                        } while (!jn3Var3.n(value4, we4.a((we4) value4, false, false, 0.0d, 0.0d, f2, null, 383)));
                        mediaPlayer = ef4VarH.j;
                        if (mediaPlayer != null) {
                            try {
                                if (mediaPlayer.isPlaying()) {
                                    mediaPlayer.setPlaybackParams(new PlaybackParams().setSpeed(f2));
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    break;
                }
                if (i2 < 0) {
                    f = fArr[0];
                } else {
                    f = fArr[(i2 + 1) % fArr.length];
                }
                f2 = f;
                do {
                    value4 = jn3Var3.getValue();
                } while (!jn3Var3.n(value4, we4.a((we4) value4, false, false, 0.0d, 0.0d, f2, null, 383)));
                mediaPlayer = ef4VarH.j;
                if (mediaPlayer != null) {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.setPlaybackParams(new PlaybackParams().setSpeed(f2));
                    }
                }
                break;
            case 3:
                ((hb0) this.receiver).H().e();
                break;
            case 4:
                ((hb0) this.receiver).Q();
                break;
            case 5:
                hb0 hb0Var2 = (hb0) this.receiver;
                String str = ((xa0) hb0Var2.d.c.getValue()).c;
                if (str != null) {
                    e60 e60Var = hb0Var2.b;
                    e60Var.getClass();
                    Set<String> stringSet = e60Var.j().getStringSet("carry_hint_off", f31.c);
                    stringSet.getClass();
                    Set setR0 = ke0.R0(stringSet);
                    setR0.add(str);
                    SharedPreferences.Editor editorEdit = e60Var.j().edit();
                    List listO1 = ke0.O0(setR0);
                    int size = listO1.size();
                    if (500 >= size) {
                        listO0 = ke0.O0(listO1);
                    } else {
                        ArrayList arrayList = new ArrayList(500);
                        if (listO1 instanceof RandomAccess) {
                            for (int i4 = size - 500; i4 < size; i4++) {
                                arrayList.add(listO1.get(i4));
                            }
                        } else {
                            ListIterator listIterator2 = listO1.listIterator(size - 500);
                            while (listIterator2.hasNext()) {
                                arrayList.add(listIterator2.next());
                            }
                        }
                        listO0 = arrayList;
                    }
                    editorEdit.putStringSet("carry_hint_off", ke0.S0(listO0)).apply();
                }
                jn3 jn3Var4 = hb0Var2.c;
                do {
                    value5 = jn3Var4.getValue();
                } while (!jn3Var4.n(value5, xa0.a((xa0) value5, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -16385, KotlinVersion.MAX_COMPONENT_VALUE)));
                break;
            case 6:
                hb0 hb0Var3 = (hb0) this.receiver;
                jn3 jn3Var5 = hb0Var3.d.c;
                if (!((xa0) jn3Var5.getValue()).b) {
                    List list = ((xa0) jn3Var5.getValue()).a;
                    ListIterator listIterator3 = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            iNextIndex2 = -1;
                        } else if (((yd2) listIterator3.previous()).c == mm3.c) {
                            iNextIndex2 = listIterator3.nextIndex();
                        }
                    }
                    if (iNextIndex2 != -1) {
                        yd2 yd2Var2 = (yd2) list.get(iNextIndex2);
                        List list2 = yd2Var2.f;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list2) {
                            if (((hn) obj).e == gn.d) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList2.get(i5);
                            i5++;
                            String str2 = ((hn) obj2).a;
                            if (str2 != null) {
                                arrayList3.add(str2);
                            }
                        }
                        List listO2 = ke0.O0(list.subList(0, iNextIndex2 + 1));
                        jn3 jn3Var6 = hb0Var3.c;
                        do {
                            value6 = jn3Var6.getValue();
                        } while (!jn3Var6.n(value6, xa0.a((xa0) value6, listO2, true, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -4, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                        hb0Var3.X(c50.a);
                        hb0Var3.X(e50.a);
                        ym3 ym3Var2 = hb0Var3.g;
                        if (ym3Var2 != null) {
                            ym3Var2.c(null);
                        }
                        hb0Var3.w();
                        hb0Var3.g = py.F(id4.a(hb0Var3), null, null, new qb(hb0Var3, yd2Var2, ((xa0) jn3Var5.getValue()).c, arrayList3, null, 7), 3);
                    }
                }
                break;
            case 7:
                oa1 oa1Var = (oa1) this.receiver;
                gi2 gi2Var = oa1Var.d;
                gi2 gi2Var2 = oa1Var.e;
                db1 db1Var = (db1) oa1Var.c.invoke();
                if (db1Var == null) {
                    Object[] objArr = gi2Var2.b;
                    long[] jArr = gi2Var2.a;
                    int length2 = jArr.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j = jArr[i6];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j & 255) < 128) {
                                        ((ga1) objArr[(i6 << 3) + i8]).U(cb1Var);
                                    }
                                    j >>= 8;
                                }
                                if (i7 == 8) {
                                    if (i6 != length2) {
                                        i6++;
                                    }
                                }
                            } else if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                } else if (db1Var.isAttached()) {
                    if (gi2Var.c(db1Var)) {
                        db1Var.y0();
                    }
                    cb1 cb1VarX0 = db1Var.x0();
                    if (!db1Var.getNode().isAttached()) {
                        po1.b("visitAncestors called on an unattached node");
                    }
                    of2 node = db1Var.getNode();
                    ux1 ux1VarM = y64.M(db1Var);
                    int i9 = 0;
                    while (ux1VarM != null) {
                        if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 5120) != 0) {
                            while (node != null) {
                                if ((node.getKindSet$ui_release() & 5120) != 0) {
                                    if ((node.getKindSet$ui_release() & 1024) != 0) {
                                        i9++;
                                    }
                                    if ((node instanceof ga1) && gi2Var2.c(node)) {
                                        if (i9 <= 1) {
                                            ((ga1) node).U(cb1VarX0);
                                        } else {
                                            ((ga1) node).U(cb1.d);
                                        }
                                        gi2Var2.l(node);
                                    }
                                }
                                node = node.getParent$ui_release();
                            }
                        }
                        ux1VarM = ux1VarM.t();
                        node = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
                    }
                    Object[] objArr2 = gi2Var2.b;
                    long[] jArr2 = gi2Var2.a;
                    int length3 = jArr2.length - 2;
                    if (length3 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j2 = jArr2[i10];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length3)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j2 & 255) < 128) {
                                        ((ga1) objArr2[(i10 << 3) + i12]).U(cb1Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i11 == 8) {
                                    if (i10 != length3) {
                                        i10++;
                                    }
                                }
                            } else if (i10 != length3) {
                                i10++;
                            }
                        }
                    }
                }
                oa1Var.b.invoke();
                gi2Var.b();
                gi2Var2.b();
                oa1Var.f = false;
                break;
            case 8:
                va1 va1Var = (va1) this.receiver;
                if (va1Var.l == null || va1Var.f.x0() == cb1Var) {
                    va1Var.c.invoke();
                }
                break;
            case 9:
                jn3 jn3Var7 = ((hb0) this.receiver).c;
                do {
                    value7 = jn3Var7.getValue();
                } while (!jn3Var7.n(value7, xa0.a((xa0) value7, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, u94.a, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -131073, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                break;
            case 10:
                jn3 jn3Var8 = ((hb0) this.receiver).c;
                do {
                    value8 = jn3Var8.getValue();
                } while (!jn3Var8.n(value8, xa0.a((xa0) value8, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, v94.a, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -131073, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                break;
            case 11:
                ((go2) this.receiver).e();
                break;
            case 12:
                ((go2) this.receiver).e();
                break;
            case 13:
                le3 le3Var = (le3) this.receiver;
                le3Var.b();
                le3Var.i();
                break;
            default:
                ((le3) this.receiver).k();
                break;
        }
        return w84Var;
        return w84Var;
    }
}
