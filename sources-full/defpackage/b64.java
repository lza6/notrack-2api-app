package defpackage;

import androidx.compose.runtime.Composer$Companion;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class b64 {
    static {
        yo4.H(q22.d, bb2.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <S, T, V extends cg> void UpdateInitialAndTargetValues(o54 o54Var, n54 n54Var, T t, T t2, o71 o71Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(867041821);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(o54Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(n54Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 ? kk0Var.h(t) : kk0Var.j(t) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0 ? kk0Var.h(t2) : kk0Var.j(t2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? kk0Var.h(o71Var) : kk0Var.j(o71Var) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if (!kk0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            kk0Var.V();
        } else if (o54Var.f()) {
            n54Var.e(t, t2, o71Var);
        } else {
            n54Var.f(t2, o71Var);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new q52(o54Var, n54Var, t, t2, o71Var, i, 1));
        }
    }

    public static final <S> gn3 animateDp(o54 o54Var, oe1 oe1Var, String str, oe1 oe1Var2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            oe1Var = q54.c;
        }
        if ((i2 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(o54Var, oe1Var2.invoke(o54Var.b(), ck0Var, Integer.valueOf(i6)), oe1Var2.invoke(o54Var.d.getValue(), ck0Var, Integer.valueOf(i6)), (o71) oe1Var.invoke(o54Var.e(), ck0Var, Integer.valueOf((i5 >> 3) & 112)), mb4.c, str2, ck0Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    public static final <S> gn3 animateFloat(o54 o54Var, oe1 oe1Var, String str, oe1 oe1Var2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            oe1Var = r54.c;
        }
        if ((i2 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(o54Var, oe1Var2.invoke(o54Var.b(), ck0Var, Integer.valueOf(i6)), oe1Var2.invoke(o54Var.d.getValue(), ck0Var, Integer.valueOf(i6)), (o71) oe1Var.invoke(o54Var.e(), ck0Var, Integer.valueOf((i5 >> 3) & 112)), mb4.a, str2, ck0Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    public static final <S> gn3 animateInt(o54 o54Var, oe1 oe1Var, String str, oe1 oe1Var2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            oe1Var = s54.c;
        }
        if ((i2 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(o54Var, oe1Var2.invoke(o54Var.b(), ck0Var, Integer.valueOf(i6)), oe1Var2.invoke(o54Var.d.getValue(), ck0Var, Integer.valueOf(i6)), (o71) oe1Var.invoke(o54Var.e(), ck0Var, Integer.valueOf((i5 >> 3) & 112)), mb4.b, str2, ck0Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    public static final <S> gn3 animateIntOffset(o54 o54Var, oe1 oe1Var, String str, oe1 oe1Var2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            oe1Var = t54.c;
        }
        if ((i2 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(o54Var, oe1Var2.invoke(o54Var.b(), ck0Var, Integer.valueOf(i6)), oe1Var2.invoke(o54Var.d.getValue(), ck0Var, Integer.valueOf(i6)), (o71) oe1Var.invoke(o54Var.e(), ck0Var, Integer.valueOf((i5 >> 3) & 112)), mb4.g, str2, ck0Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    public static final <S> gn3 animateIntSize(o54 o54Var, oe1 oe1Var, String str, oe1 oe1Var2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            oe1Var = u54.c;
        }
        if ((i2 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(o54Var, oe1Var2.invoke(o54Var.b(), ck0Var, Integer.valueOf(i6)), oe1Var2.invoke(o54Var.d.getValue(), ck0Var, Integer.valueOf(i6)), (o71) oe1Var.invoke(o54Var.e(), ck0Var, Integer.valueOf((i5 >> 3) & 112)), mb4.h, str2, ck0Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    public static final <S> gn3 animateOffset(o54 o54Var, oe1 oe1Var, String str, oe1 oe1Var2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            oe1Var = v54.c;
        }
        if ((i2 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(o54Var, oe1Var2.invoke(o54Var.b(), ck0Var, Integer.valueOf(i6)), oe1Var2.invoke(o54Var.d.getValue(), ck0Var, Integer.valueOf(i6)), (o71) oe1Var.invoke(o54Var.e(), ck0Var, Integer.valueOf((i5 >> 3) & 112)), mb4.f, str2, ck0Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    public static final <S> gn3 animateRect(o54 o54Var, oe1 oe1Var, String str, oe1 oe1Var2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            oe1Var = w54.c;
        }
        if ((i2 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(o54Var, oe1Var2.invoke(o54Var.b(), ck0Var, Integer.valueOf(i6)), oe1Var2.invoke(o54Var.d.getValue(), ck0Var, Integer.valueOf(i6)), (o71) oe1Var.invoke(o54Var.e(), ck0Var, Integer.valueOf((i5 >> 3) & 112)), mb4.i, str2, ck0Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    public static final <S> gn3 animateSize(o54 o54Var, oe1 oe1Var, String str, oe1 oe1Var2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            oe1Var = x54.c;
        }
        if ((i2 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return createTransitionAnimation(o54Var, oe1Var2.invoke(o54Var.b(), ck0Var, Integer.valueOf(i6)), oe1Var2.invoke(o54Var.d.getValue(), ck0Var, Integer.valueOf(i6)), (o71) oe1Var.invoke(o54Var.e(), ck0Var, Integer.valueOf((i5 >> 3) & 112)), mb4.e, str2, ck0Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    public static final <S, T, V extends cg> gn3 animateValue(o54 o54Var, w64 w64Var, oe1 oe1Var, String str, oe1 oe1Var2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            oe1Var = y54.c;
        }
        if ((i2 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i3 = (i >> 9) & 112;
        return createTransitionAnimation(o54Var, oe1Var2.invoke(o54Var.b(), ck0Var, Integer.valueOf(i3)), oe1Var2.invoke(o54Var.d.getValue(), ck0Var, Integer.valueOf(i3)), (o71) oe1Var.invoke(o54Var.e(), ck0Var, Integer.valueOf((i >> 3) & 112)), w64Var, str, ck0Var, (i & 14) | (57344 & (i << 9)) | ((i << 6) & 458752));
    }

    public static final <S, T> o54 createChildTransition(o54 o54Var, String str, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i3 = i & 14;
        if (((i3 ^ 6) <= 4 || !((kk0) ck0Var).h(o54Var)) && (i & 6) != 4) {
            z = false;
        }
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = o54Var.b();
            kk0Var.l0(objP);
        }
        if (o54Var.f()) {
            objP = o54Var.b();
        }
        int i4 = (i >> 3) & 112;
        return createChildTransitionInternal(o54Var, oe1Var.invoke(objP, kk0Var, Integer.valueOf(i4)), oe1Var.invoke(o54Var.d.getValue(), kk0Var, Integer.valueOf(i4)), str2, kk0Var, i3 | ((i << 6) & 7168));
    }

    public static final <S, T> o54 createChildTransitionInternal(o54 o54Var, T t, T t2, String str, ck0 ck0Var, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && ((kk0) ck0Var).h(o54Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z2 || objP == Composer$Companion.getEmpty()) {
            objP = new o54(new ni2(t), o54Var, o54Var.c + " > " + str);
            kk0Var.l0(objP);
        }
        o54 o54Var2 = (o54) objP;
        if ((i2 <= 4 || !kk0Var.h(o54Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zH = kk0Var.h(o54Var2) | z;
        Object objP2 = kk0Var.P();
        if (zH || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new sg2(o54Var, 21, o54Var2);
            kk0Var.l0(objP2);
        }
        r11.DisposableEffect(o54Var2, (le1) objP2, kk0Var, 0);
        if (o54Var.f()) {
            o54Var2.i(t, t2);
            return o54Var2;
        }
        o54Var2.j(t2);
        o54Var2.k.setValue(Boolean.FALSE);
        return o54Var2;
    }

    public static final <S, T, V extends cg> k54 createDeferredAnimation(o54 o54Var, w64 w64Var, String str, ck0 ck0Var, int i, int i2) {
        j54 j54Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && ((kk0) ck0Var).h(o54Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z2 || objP == Composer$Companion.getEmpty()) {
            objP = new k54(o54Var, w64Var, str);
            kk0Var.l0(objP);
        }
        k54 k54Var = (k54) objP;
        if ((i3 <= 4 || !kk0Var.h(o54Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zJ = kk0Var.j(k54Var) | z;
        Object objP2 = kk0Var.P();
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new sg2(o54Var, 22, k54Var);
            kk0Var.l0(objP2);
        }
        r11.DisposableEffect(k54Var, (le1) objP2, kk0Var, 0);
        if (o54Var.f() && (j54Var = (j54) k54Var.b.getValue()) != null) {
            o54 o54Var2 = k54Var.c;
            j54Var.c.e(j54Var.h.invoke(((m54) o54Var2.e()).a), j54Var.h.invoke(((m54) o54Var2.e()).b), (o71) j54Var.d.invoke(o54Var2.e()));
        }
        return k54Var;
    }

    public static final <S, T, V extends cg> gn3 createTransitionAnimation(o54 o54Var, T t, T t2, o71 o71Var, w64 w64Var, String str, ck0 ck0Var, int i) {
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && ((kk0) ck0Var).h(o54Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z2 || objP == Composer$Companion.getEmpty()) {
            cg cgVar = (cg) ((x64) w64Var).a.invoke(t2);
            cgVar.d();
            objP = new n54(o54Var, t, cgVar, w64Var);
            kk0Var.l0(objP);
        }
        n54 n54Var = (n54) objP;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        UpdateInitialAndTargetValues(o54Var, n54Var, t, t2, o71Var, kk0Var, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
        if ((i3 <= 4 || !kk0Var.h(o54Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zH = kk0Var.h(n54Var) | z;
        Object objP2 = kk0Var.P();
        if (zH || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new sg2(o54Var, 23, n54Var);
            kk0Var.l0(objP2);
        }
        r11.DisposableEffect(n54Var, (le1) objP2, kk0Var, 0);
        return n54Var;
    }

    public static final <T> o54 rememberTransition(c64 c64Var, String str, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        boolean z = (((i & 14) ^ 6) > 4 && ((kk0) ck0Var).h(c64Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = new o54(c64Var, null, str);
            kk0Var.l0(objP);
        }
        o54 o54Var = (o54) objP;
        kk0Var.a0(1031290843);
        o54Var.animateTo$animation_core_release(((ni2) c64Var).c.getValue(), kk0Var, 0);
        kk0Var.r(false);
        boolean zH = kk0Var.h(o54Var);
        Object objP2 = kk0Var.P();
        if (zH || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new a64(o54Var, 0);
            kk0Var.l0(objP2);
        }
        r11.DisposableEffect(o54Var, (le1) objP2, kk0Var, 0);
        return o54Var;
    }

    public static final <T> o54 updateTransition(T t, String str, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new o54(new ni2(t), null, str);
            kk0Var.l0(objP);
        }
        o54 o54Var = (o54) objP;
        o54Var.animateTo$animation_core_release(t, kk0Var, (i & 8) | 48 | (i & 14));
        Object objP2 = kk0Var.P();
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = new a64(o54Var, 1);
            kk0Var.l0(objP2);
        }
        r11.DisposableEffect(o54Var, (le1) objP2, kk0Var, 54);
        return o54Var;
    }

    @cv0
    public static final <T> o54 updateTransition(ni2 ni2Var, String str, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return rememberTransition(ni2Var, str, ck0Var, i & 126, 0);
    }
}
