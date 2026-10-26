package defpackage;

import android.content.Context;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.ContentScale$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class vh3 {
    /* JADX INFO: renamed from: AsyncImage-10Xjiaw, reason: not valid java name */
    public static final void m1845xef24a3e0(Object obj, String str, c cVar, le1 le1Var, le1 le1Var2, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, int i, boolean z, ck0 ck0Var, int i2, int i3, int i4) {
        kk0 kk0Var = (kk0) ck0Var;
        int i5 = i2 << 3;
        lm.m1771xbf6e588d(obj, str, wh3.a((Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext())), (i4 & 4) != 0 ? c.i : cVar, (i4 & 8) != 0 ? tm.D : le1Var, (i4 & 16) != 0 ? null : le1Var2, (i4 & 32) != 0 ? Alignment$Companion.getCenter() : a8Var, (i4 & 64) != 0 ? ContentScale$Companion.getFit() : sn0Var, (i4 & Uuid.SIZE_BITS) != 0 ? 1.0f : f, (i4 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? null : te0Var, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 1 : i, (i4 & 1024) != 0 ? true : z, kk0Var, (i2 & 126) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), ((i2 >> 27) & 14) | ((i3 << 3) & 112), 0);
    }

    /* JADX INFO: renamed from: AsyncImage-x1rPTaM, reason: not valid java name */
    public static final void m1846x9e162dfb(Object obj, String str, c cVar, ms2 ms2Var, ms2 ms2Var2, ms2 ms2Var3, le1 le1Var, le1 le1Var2, le1 le1Var3, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, int i, boolean z, ck0 ck0Var, int i2, int i3, int i4) {
        c cVar2 = (i4 & 4) != 0 ? c.i : cVar;
        ms2 ms2Var4 = (i4 & 8) != 0 ? null : ms2Var;
        ms2 ms2Var5 = (i4 & 16) != 0 ? null : ms2Var2;
        kk0 kk0Var = (kk0) ck0Var;
        int i5 = i2 << 3;
        int i6 = (i2 & 126) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192);
        int i7 = i3 << 3;
        lm.m1770xded95cb8(obj, str, wh3.a((Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext())), cVar2, ms2Var4, ms2Var5, (i4 & 32) != 0 ? ms2Var5 : ms2Var3, (i4 & 64) != 0 ? null : le1Var, (i4 & Uuid.SIZE_BITS) != 0 ? null : le1Var2, (i4 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? null : le1Var3, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? Alignment$Companion.getCenter() : a8Var, (i4 & 1024) != 0 ? ContentScale$Companion.getFit() : sn0Var, (i4 & 2048) != 0 ? 1.0f : f, (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : te0Var, (i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? 1 : i, (i4 & 16384) != 0 ? true : z, kk0Var, i6, ((i2 >> 27) & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752), 0);
    }
}
