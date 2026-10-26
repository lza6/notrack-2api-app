package defpackage;

import androidx.compose.ui.text.input.OffsetMapping$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class xa4 {
    public static final eu a = new eu(OffsetMapping$Companion.getIdentity(), 0, 0);

    public static final f54 a(de4 de4Var, hg hgVar) {
        f54 f54VarA = de4Var.a(hgVar);
        int length = hgVar.d.length();
        hg hgVar2 = f54VarA.a;
        nn2 nn2Var = f54VarA.b;
        int length2 = hgVar2.d.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(nn2Var.o(i), length2, i);
        }
        b(nn2Var.o(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(nn2Var.n(i2), length, i2);
        }
        c(nn2Var.n(length2), length, length2);
        return new f54(hgVar2, new eu(nn2Var, hgVar.d.length(), hgVar2.d.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        so1.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + ']');
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        so1.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + ']');
    }
}
