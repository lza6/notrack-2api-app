package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class fw extends ww1 implements le1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Serializable l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(long j, float[] fArr, o43 o43Var, n43 n43Var) {
        super(1);
        this.d = j;
        this.h = fArr;
        this.l = o43Var;
        this.m = n43Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(h43 h43Var, q43 q43Var, long j, jv jvVar) {
        super(1);
        this.h = h43Var;
        this.l = q43Var;
        this.d = j;
        this.m = jvVar;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) throws Throwable {
        float f;
        long j;
        w84 w84Var;
        float[] fArr;
        int i;
        float fA;
        float fA2;
        int i2 = this.c;
        w84 w84Var2 = w84.a;
        Object obj2 = this.m;
        Serializable serializable = this.l;
        Object obj3 = this.h;
        switch (i2) {
            case 0:
                wx1 wx1Var = (wx1) obj;
                wx1Var.a();
                h43 h43Var = (h43) obj3;
                float f2 = h43Var.a;
                float f3 = h43Var.b;
                q43 q43Var = (q43) serializable;
                long j2 = this.d;
                te0 te0Var = (te0) obj2;
                a10 a10Var = wx1Var.c;
                ((jb) a10Var.d.d).B(f2, f3);
                try {
                    f = f3;
                    try {
                        tz0.d0(wx1Var, (bm1) q43Var.c, j2, 0L, 0L, 0.0f, te0Var, 0, 890);
                        ((jb) a10Var.d.d).B(-f2, -f);
                        return w84Var2;
                    } catch (Throwable th) {
                        th = th;
                        ((jb) a10Var.d.d).B(-f2, -f);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f = f3;
                }
                break;
            default:
                ss2 ss2Var = (ss2) obj;
                float[] fArr2 = (float[]) obj3;
                o43 o43Var = (o43) serializable;
                n43 n43Var = (n43) obj2;
                int i3 = ss2Var.b;
                dc dcVar = ss2Var.a;
                int iE = ss2Var.c;
                long j3 = this.d;
                int iF = i3 > jz3.f(j3) ? ss2Var.b : jz3.f(j3);
                if (iE >= jz3.e(j3)) {
                    iE = jz3.e(j3);
                }
                long jD = p23.d(ss2Var.d(iF), ss2Var.d(iE));
                int i4 = o43Var.c;
                vy3 vy3Var = dcVar.d;
                int iF2 = jz3.f(jD);
                int iE2 = jz3.e(jD);
                Layout layout = vy3Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    qo1.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    qo1.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    qo1.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    qo1.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iE2 - iF2) * 4) {
                    qo1.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE2 - 1);
                ui1 ui1Var = new ui1(vy3Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        j = jD;
                        int iF3 = vy3Var.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fG = vy3Var.g(lineForOffset);
                        float fE = vy3Var.e(lineForOffset);
                        w84Var = w84Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i5 = i4;
                        int i6 = iMax;
                        while (i6 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fA3 = ui1Var.a(i6, false, false, false);
                                    i = iMin;
                                    fA = ui1Var.a(i6 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = ui1Var.a(i6, false, false, false);
                                        fA2 = ui1Var.a(i6 + 1, true, true, false);
                                    } else {
                                        fA2 = ui1Var.a(i6, false, false, true);
                                        fA = ui1Var.a(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fA;
                                fArr[i5 + 1] = fG;
                                fArr[i5 + 2] = fA2;
                                fArr[i5 + 3] = fE;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fA = ui1Var.a(i6, z, z, true);
                                i = iMin;
                                fA2 = ui1Var.a(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fA;
                            fArr[i5 + 1] = fG;
                            fArr[i5 + 2] = fA2;
                            fArr[i5 + 3] = fE;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            jD = j;
                            i4 = i5;
                            w84Var2 = w84Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jD;
                    w84Var = w84Var2;
                    fArr = fArr2;
                }
                int iD = (jz3.d(j) * 4) + o43Var.c;
                for (int i7 = o43Var.c; i7 < iD; i7 += 4) {
                    int i8 = i7 + 1;
                    float f4 = fArr[i8];
                    float f5 = n43Var.c;
                    fArr[i8] = f4 + f5;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f5;
                }
                o43Var.c = iD;
                n43Var.c = dcVar.b() + n43Var.c;
                return w84Var;
        }
    }
}
