package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uw3 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ xw3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw3(xw3 xw3Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = xw3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        xw3 xw3Var = this.h;
        switch (i) {
            case 0:
                return new uw3(xw3Var, so0Var, 0);
            default:
                return new uw3(xw3Var, so0Var, 1);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((uw3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0377  */
    /* JADX WARN: Code duplicated, block: B:80:0x0189  */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object clipEntry;
        hg hgVar;
        CharSequence text;
        int i = this.c;
        ch1 ch1Var = ch1.c;
        hq0 hq0Var = hq0.c;
        xw3 xw3Var = this.h;
        byte b = 1;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    if (!jz3.c(xw3Var.k().b)) {
                        Clipboard clipboard = xw3Var.h;
                        if (clipboard != null) {
                            ClipEntry clipEntryG = xp1.G(vl0.R(xw3Var.k()));
                            this.d = 1;
                            if (clipboard.setClipEntry(clipEntryG, this) == hq0Var) {
                                return hq0Var;
                            }
                        }
                    }
                    return w84Var;
                }
                if (i2 != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                hg hgVarT = vl0.T(xw3Var.k(), xw3Var.k().a.d.length());
                hg hgVarS = vl0.S(xw3Var.k(), xw3Var.k().a.d.length());
                fg fgVar = new fg(hgVarT);
                fgVar.a(hgVarS);
                hg hgVarD = fgVar.d();
                int iF = jz3.f(xw3Var.k().b);
                xw3Var.c.invoke(xw3.c(hgVarD, p23.d(iF, iF)));
                xw3Var.o(ch1Var);
                xw3Var.a.e = true;
                return w84Var;
            default:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    Clipboard clipboard2 = xw3Var.h;
                    if (clipboard2 != null) {
                        this.d = 1;
                        clipEntry = clipboard2.getClipEntry(this);
                        if (clipEntry == hq0Var) {
                            return hq0Var;
                        }
                    } else {
                        w84Var = w84Var;
                    }
                    return w84Var;
                }
                if (i3 != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                clipEntry = obj;
                ClipEntry clipEntry2 = (ClipEntry) clipEntry;
                if (clipEntry2 != null) {
                    int i4 = 0;
                    ClipData.Item itemAt = clipEntry2.getClipData().getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        ch1Var = ch1Var;
                        w84Var = w84Var;
                        hgVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        int iW0 = vl.w0(annotationArr);
                        if (iW0 >= 0) {
                            int i5 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i5];
                                if (kr1.n(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, i4);
                                    parcelObtain.unmarshall(bArrDecode, i4, bArrDecode.length);
                                    parcelObtain.setDataPosition(i4);
                                    long j = re0.i;
                                    long j2 = j;
                                    long jL = yz3.c;
                                    long jL2 = jL;
                                    ic1 ic1Var = null;
                                    gc1 gc1Var = null;
                                    hc1 hc1Var = null;
                                    String string = null;
                                    zr zrVar = null;
                                    iy3 iy3Var = null;
                                    tt3 tt3Var = null;
                                    pg3 pg3Var = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() > b) {
                                            byte b2 = parcelObtain.readByte();
                                            if (b2 != b) {
                                                i4 = i4;
                                                ch1Var = ch1Var;
                                                int i6 = 2;
                                                if (b2 != 2) {
                                                    w84Var = w84Var;
                                                    if (b2 != 3) {
                                                        if (b2 == 4) {
                                                            b = 1;
                                                            if (parcelObtain.dataAvail() >= 1) {
                                                                byte b3 = parcelObtain.readByte();
                                                                gc1 gc1Var2 = new gc1((b3 != 0 && b3 == 1) ? 1 : i4);
                                                                i4 = i4;
                                                                gc1Var = gc1Var2;
                                                                ch1Var = ch1Var;
                                                                w84Var = w84Var;
                                                            }
                                                        } else if (b2 == 5) {
                                                            if (parcelObtain.dataAvail() >= 1) {
                                                                byte b4 = parcelObtain.readByte();
                                                                if (b4 == 0) {
                                                                    i6 = i4;
                                                                } else if (b4 == 1) {
                                                                    i6 = 65535;
                                                                } else if (b4 != 3) {
                                                                    if (b4 == 2) {
                                                                        i6 = 1;
                                                                    } else {
                                                                        i6 = i4;
                                                                    }
                                                                }
                                                                hc1Var = new hc1(i6);
                                                                ch1Var = ch1Var;
                                                                w84Var = w84Var;
                                                                b = 1;
                                                                i4 = i4;
                                                            }
                                                        } else if (b2 == 6) {
                                                            string = parcelObtain.readString();
                                                        } else if (b2 == 7) {
                                                            if (parcelObtain.dataAvail() >= 5) {
                                                                byte b5 = parcelObtain.readByte();
                                                                long j3 = b5 == 1 ? 4294967296L : b5 == 2 ? 8589934592L : 0L;
                                                                jL2 = zz3.a(j3, 0L) ? yz3.c : gm4.L(parcelObtain.readFloat(), j3);
                                                            }
                                                        } else if (b2 == 8) {
                                                            if (parcelObtain.dataAvail() >= 4) {
                                                                zrVar = new zr(parcelObtain.readFloat());
                                                                w84Var = w84Var;
                                                                b = 1;
                                                            }
                                                        } else if (b2 == 9) {
                                                            if (parcelObtain.dataAvail() >= 8) {
                                                                iy3Var = new iy3(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                                ch1Var = ch1Var;
                                                                w84Var = w84Var;
                                                                b = 1;
                                                                i4 = i4;
                                                            }
                                                        } else if (b2 == 10) {
                                                            if (parcelObtain.dataAvail() >= 8) {
                                                                j2 = parcelObtain.readLong();
                                                                int i7 = re0.j;
                                                            }
                                                        } else if (b2 != 11) {
                                                            if (b2 == 12) {
                                                                if (parcelObtain.dataAvail() >= 20) {
                                                                    long j4 = parcelObtain.readLong();
                                                                    int i8 = re0.j;
                                                                    i4 = i4;
                                                                    w84Var = w84Var;
                                                                    pg3Var = new pg3(j4, (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) & 4294967295L), parcelObtain.readFloat());
                                                                }
                                                            }
                                                            b = 1;
                                                        } else if (parcelObtain.dataAvail() >= 4) {
                                                            int i9 = parcelObtain.readInt();
                                                            int i10 = (i9 & 2) != 0 ? 1 : i4;
                                                            int i11 = (i9 & 1) != 0 ? 1 : i4;
                                                            tt3 tt3Var2 = tt3.d;
                                                            tt3 tt3Var3 = tt3.c;
                                                            if (i10 != 0 && i11 != 0) {
                                                                List listU = kr1.U(tt3Var2, tt3Var3);
                                                                Integer numValueOf = Integer.valueOf(i4);
                                                                int size = listU.size();
                                                                for (int i12 = i4; i12 < size; i12++) {
                                                                    numValueOf = Integer.valueOf(numValueOf.intValue() | ((tt3) listU.get(i12)).a);
                                                                }
                                                                tt3Var = new tt3(numValueOf.intValue());
                                                            } else if (i10 != 0) {
                                                                tt3Var = tt3Var2;
                                                            } else {
                                                                tt3Var = i11 != 0 ? tt3Var3 : tt3.b;
                                                            }
                                                        }
                                                        arrayList.add(new gg(spanStart, spanEnd, new em3(j, jL, ic1Var, gc1Var, hc1Var, (lb1) null, string, jL2, zrVar, iy3Var, (g72) null, j2, tt3Var, pg3Var, 49152)));
                                                    } else if (parcelObtain.dataAvail() >= 4) {
                                                        ic1Var = new ic1(parcelObtain.readInt());
                                                        ch1Var = ch1Var;
                                                        w84Var = w84Var;
                                                        b = 1;
                                                        i4 = i4;
                                                    } else {
                                                        arrayList.add(new gg(spanStart, spanEnd, new em3(j, jL, ic1Var, gc1Var, hc1Var, (lb1) null, string, jL2, zrVar, iy3Var, (g72) null, j2, tt3Var, pg3Var, 49152)));
                                                    }
                                                } else if (parcelObtain.dataAvail() >= 5) {
                                                    byte b6 = parcelObtain.readByte();
                                                    long j5 = b6 == b ? 4294967296L : b6 == 2 ? 8589934592L : 0L;
                                                    jL = zz3.a(j5, 0L) ? yz3.c : gm4.L(parcelObtain.readFloat(), j5);
                                                } else {
                                                    w84Var = w84Var;
                                                    arrayList.add(new gg(spanStart, spanEnd, new em3(j, jL, ic1Var, gc1Var, hc1Var, (lb1) null, string, jL2, zrVar, iy3Var, (g72) null, j2, tt3Var, pg3Var, 49152)));
                                                }
                                                w84Var = w84Var;
                                                b = 1;
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                j = parcelObtain.readLong();
                                                int i13 = re0.j;
                                            }
                                        }
                                        i4 = i4;
                                        ch1Var = ch1Var;
                                        w84Var = w84Var;
                                        arrayList.add(new gg(spanStart, spanEnd, new em3(j, jL, ic1Var, gc1Var, hc1Var, (lb1) null, string, jL2, zrVar, iy3Var, (g72) null, j2, tt3Var, pg3Var, 49152)));
                                    }
                                } else {
                                    i4 = i4;
                                    ch1Var = ch1Var;
                                    w84Var = w84Var;
                                }
                                if (i5 != iW0) {
                                    i5++;
                                    i4 = i4;
                                    ch1Var = ch1Var;
                                    w84Var = w84Var;
                                    b = 1;
                                }
                            }
                        } else {
                            ch1Var = ch1Var;
                            w84Var = w84Var;
                        }
                        hgVar = new hg(text.toString(), arrayList, 4);
                    } else {
                        hgVar = new hg(text.toString());
                        ch1Var = ch1Var;
                        w84Var = w84Var;
                    }
                    if (hgVar != null) {
                        fg fgVar2 = new fg(vl0.T(xw3Var.k(), xw3Var.k().a.d.length()));
                        fgVar2.a(hgVar);
                        hg hgVarD2 = fgVar2.d();
                        hg hgVarS2 = vl0.S(xw3Var.k(), xw3Var.k().a.d.length());
                        fg fgVar3 = new fg(hgVarD2);
                        fgVar3.a(hgVarS2);
                        hg hgVarD3 = fgVar3.d();
                        int length = hgVar.d.length() + jz3.f(xw3Var.k().b);
                        xw3Var.c.invoke(xw3.c(hgVarD3, p23.d(length, length)));
                        xw3Var.o(ch1Var);
                        xw3Var.a.e = true;
                    }
                } else {
                    w84Var = w84Var;
                }
                return w84Var;
        }
    }
}
