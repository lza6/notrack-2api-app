package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class bm3 {
    public float a;
    public float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public final float i;
    public final float j;
    public float k;
    public final float l;
    public float m;
    public float n;
    public final int o;

    public bm3(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2) {
        float f14 = (i2 & Uuid.SIZE_BITS) != 0 ? 0.0f : f8;
        float f15 = (i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? 0.0f : f9;
        float f16 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 0.0f : f10;
        float f17 = (i2 & 2048) != 0 ? 1.0f : f11;
        float f18 = (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? 0.0f : f12;
        float f19 = (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? 0.0f : f13;
        int i3 = (i2 & 16384) != 0 ? 0 : i;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f14;
        this.i = f15;
        this.j = f16;
        this.k = 0.0f;
        this.l = f17;
        this.m = f18;
        this.n = f19;
        this.o = i3;
    }
}
