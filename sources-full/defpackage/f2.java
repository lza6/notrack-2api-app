package defpackage;

import android.graphics.Color;
import androidx.compose.ui.graphics.Brush$Companion;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import notrack.ai.data.api.ChatDto;
import notrack.ai.data.avatars.AvatarItem;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements le1 {
    public final /* synthetic */ int c;

    public /* synthetic */ f2(int i) {
        this.c = i;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                us1 us1Var = (us1) obj;
                us1Var.getClass();
                us1Var.b = true;
                return w84Var;
            case 1:
                us1 us1Var2 = (us1) obj;
                us1Var2.getClass();
                us1Var2.b = true;
                return w84Var;
            case 2:
                return (sm) obj;
            case 3:
                us1 us1Var3 = (us1) obj;
                us1Var3.getClass();
                us1Var3.b = true;
                return w84Var;
            case 4:
                AvatarItem avatarItem = (AvatarItem) obj;
                avatarItem.getClass();
                return avatarItem.getId();
            case 5:
                tz0 tz0Var = (tz0) obj;
                tz0Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tz0Var.b() >> 32)) / 31.0f;
                float f = fIntBitsToFloat * 21.4f;
                float f2 = fIntBitsToFloat * 9.4f;
                float f3 = fIntBitsToFloat * 7.0f;
                tz0Var.I(Brush$Companion.m9x8523eea0(kr1.U(new re0(gb2.d(4294951019L)), new re0(gb2.d(4294084367L))), f2 - f3, f2 + f3), f3, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
                float f4 = fIntBitsToFloat * 0.9f;
                tz0.K(tz0Var, gb2.b(1936602880), f3, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), new vo3(0, f4, 0, 0.0f, 30), 104);
                tz0.K(tz0Var, gb2.b(1728053247), 5.3f * fIntBitsToFloat, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), new vo3(0, fIntBitsToFloat * 0.8f, 0, 0.0f, 30), 104);
                xv.b(tz0Var, fIntBitsToFloat, "B", 21.4f, 12.8f, 9.2f, Color.parseColor("#7b3d00"));
                long jD = gb2.d(4286266624L);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(3.6f * fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(20.1f * fIntBitsToFloat) << 32);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(11.6f * fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(1.05f * fIntBitsToFloat) << 32);
                float f5 = 0.52f * fIntBitsToFloat;
                tz0Var.v(jD, (226 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (226 & 16) != 0 ? b71.a : null);
                float f6 = 10.2f * fIntBitsToFloat;
                float f7 = 14.4f * fIntBitsToFloat;
                float f8 = fIntBitsToFloat * 8.6f;
                tz0Var.I(Brush$Companion.m10x8523eea0(new ps2[]{new ps2(Float.valueOf(0.0f), new re0(gb2.d(4294963374L))), new ps2(Float.valueOf(0.45f), new re0(gb2.d(4294756671L))), new ps2(Float.valueOf(1.0f), new re0(gb2.d(4292909842L)))}, f7 - f8, f7 + f8, 8), f8, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L));
                tz0.K(tz0Var, gb2.b(1937264640), f8, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), new vo3(0, fIntBitsToFloat * 1.0f, 0, 0.0f, 30), 104);
                tz0.K(tz0Var, gb2.d(2164260863L), fIntBitsToFloat * 6.6f, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), new vo3(0, f4, 0, 0.0f, 30), 104);
                xv.b(tz0Var, fIntBitsToFloat, "$", 10.2f, 18.7f, 11.6f, Color.parseColor("#6d4700"));
                return w84Var;
            case 6:
                n63 n63Var = (n63) obj;
                n63Var.getClass();
                if (n63Var.u != 1) {
                    n63Var.c |= 32768;
                    n63Var.u = 1;
                }
                return w84Var;
            case 7:
                wx1 wx1Var = (wx1) obj;
                wx1Var.getClass();
                wx1Var.a();
                tz0.T(wx1Var, Brush$Companion.m10x8523eea0(new ps2[]{new ps2(Float.valueOf(0.84f), new re0(re0.b)), new ps2(Float.valueOf(1.0f), new re0(re0.h))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 62);
                return w84Var;
            case 8:
                ((String) obj).getClass();
                return Boolean.FALSE;
            case 9:
                n63 n63Var2 = (n63) obj;
                n63Var2.getClass();
                n63Var2.g(1.45f);
                n63Var2.i(1.45f);
                n63Var2.e(25.0f);
                return w84Var;
            case 10:
                us1 us1Var4 = (us1) obj;
                us1Var4.getClass();
                us1Var4.b = true;
                us1Var4.a = true;
                return w84Var;
            case 11:
                us1 us1Var5 = (us1) obj;
                us1Var5.getClass();
                us1Var5.b = true;
                us1Var5.c = TeXSymbolParser.TYPE_ATTR;
                us1Var5.a = true;
                return w84Var;
            case 12:
                ((String) obj).getClass();
                return w84Var;
            case 13:
                ((String) obj).getClass();
                return w84Var;
            case 14:
                ((String) obj).getClass();
                return w84Var;
            case 15:
                return Integer.valueOf((-((Integer) obj).intValue()) / 3);
            case 16:
                ((String) obj).getClass();
                return w84Var;
            case 17:
                ((String) obj).getClass();
                return w84Var;
            case 18:
                return w84Var;
            case 19:
                ((String) obj).getClass();
                return w84Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                ((String) obj).getClass();
                return w84Var;
            case 21:
                ((String) obj).getClass();
                return w84Var;
            case 22:
                ((String) obj).getClass();
                return w84Var;
            case 23:
                ((String) obj).getClass();
                return w84Var;
            case 24:
                ((String) obj).getClass();
                return w84Var;
            case 25:
                yd2 yd2Var = (yd2) obj;
                yd2Var.getClass();
                return yd2Var.a;
            case 26:
                ChatDto chatDto = (ChatDto) obj;
                chatDto.getClass();
                return chatDto.getChatId();
            case 27:
                ((Long) obj).getClass();
                return w84Var;
            case 28:
                return Integer.valueOf((-((Integer) obj).intValue()) / 3);
            default:
                return Integer.valueOf((-((Integer) obj).intValue()) / 3);
        }
    }
}
