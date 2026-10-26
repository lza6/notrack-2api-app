package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ef0 {
    public static final float[] a;
    public static final float[] b;
    public static final c54 c;
    public static final c54 d;
    public static final t63 e;
    public static final t63 f;
    public static final t63 g;
    public static final t63 h;
    public static final t63 i;
    public static final t63 j;
    public static final t63 k;
    public static final t63 l;
    public static final t63 m;
    public static final t63 n;
    public static final t63 o;
    public static final t63 p;
    public static final t63 q;
    public static final t63 r;
    public static final vw1 s;
    public static final vw1 t;
    public static final t63 u;
    public static final t63 v;
    public static final t63 w;
    public static final vn2 x;
    public static final bf0[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        c54 c54Var = new c54(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        c54 c54Var2 = new c54(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        c54 c54Var3 = new c54(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = c54Var3;
        c54 c54Var4 = new c54(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = c54Var4;
        rf4 rf4Var = yh4.m;
        t63 t63Var = new t63("sRGB IEC61966-2.1", fArr, rf4Var, c54Var, 0);
        e = t63Var;
        t63 t63Var2 = new t63("sRGB IEC61966-2.1 (Linear)", fArr, rf4Var, 1.0d, 0.0f, 1.0f, 1);
        f = t63Var2;
        t63 t63Var3 = new t63("scRGB-nl IEC 61966-2-2:2003", fArr, rf4Var, null, new u41(13), new u41(14), -0.799f, 2.399f, c54Var, 2);
        g = t63Var3;
        t63 t63Var4 = new t63("scRGB IEC 61966-2-2:2003", fArr, rf4Var, 1.0d, -0.5f, 7.499f, 3);
        h = t63Var4;
        t63 t63Var5 = new t63("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, rf4Var, new c54(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = t63Var5;
        t63 t63Var6 = new t63("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, rf4Var, new c54(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = t63Var6;
        t63 t63Var7 = new t63("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new rf4(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = t63Var7;
        t63 t63Var8 = new t63("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, rf4Var, c54Var, 7);
        l = t63Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        t63 t63Var9 = new t63("NTSC (1953)", fArr2, yh4.d, new c54(d4, d5, d6, d2, d3), 8);
        m = t63Var9;
        t63 t63Var10 = new t63("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, rf4Var, new c54(d4, d5, d6, d2, d3), 9);
        n = t63Var10;
        t63 t63Var11 = new t63("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, rf4Var, 2.2d, 0.0f, 1.0f, 10);
        o = t63Var11;
        t63 t63Var12 = new t63("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, yh4.h, new c54(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = t63Var12;
        rf4 rf4Var2 = yh4.l;
        t63 t63Var13 = new t63("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, rf4Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = t63Var13;
        t63 t63Var14 = new t63("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, rf4Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = t63Var14;
        vw1 vw1Var = new vw1(14, 1, 12884901889L, "Generic XYZ");
        s = vw1Var;
        vw1 vw1Var2 = new vw1(15, 0, 12884901890L, "Generic L*a*b*");
        t = vw1Var2;
        t63 t63Var15 = new t63("None", fArr, rf4Var, c54Var2, 16);
        u = t63Var15;
        t63 t63Var16 = new t63("Hybrid Log Gamma encoding", fArr3, rf4Var, null, new u41(15), new u41(16), 0.0f, 1.0f, c54Var3, 17);
        v = t63Var16;
        t63 t63Var17 = new t63("Perceptual Quantizer encoding", fArr3, rf4Var, null, new u41(17), new u41(18), 0.0f, 1.0f, c54Var4, 18);
        w = t63Var17;
        vn2 vn2Var = new vn2("Oklab", 12884901890L, 19);
        x = vn2Var;
        y = new bf0[]{t63Var, t63Var2, t63Var3, t63Var4, t63Var5, t63Var6, t63Var7, t63Var8, t63Var9, t63Var10, t63Var11, t63Var12, t63Var13, t63Var14, vw1Var, vw1Var2, t63Var15, t63Var16, t63Var17, vn2Var};
    }

    public static double a(c54 c54Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = c54Var.b;
        double d6 = c54Var.c;
        double d7 = c54Var.d;
        double d8 = c54Var.e;
        double d9 = c54Var.f;
        double d10 = d5 * d4;
        return (c54Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(c54 c54Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / c54Var.b;
        double d5 = 1.0d / c54Var.c;
        double d6 = 1.0d / c54Var.d;
        double d7 = c54Var.e;
        double d8 = c54Var.f;
        double d9 = (d2 * d3) / (c54Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(c54 c54Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = c54Var.b;
        double d6 = c54Var.d;
        double dPow = (Math.pow(d4, d6) * c54Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * c54Var.f) + c54Var.e), c54Var.g) * d3;
    }

    public static double d(c54 c54Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -c54Var.b;
        double d6 = c54Var.e;
        double d7 = 1.0d / c54Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-c54Var.f)) + c54Var.c), 1.0d / c54Var.d) * d3;
    }
}
