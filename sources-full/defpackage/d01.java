package defpackage;

import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class d01 {
    public final String a;
    public final je1 b;
    public final ym1 c;
    public final ne1 d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public d01(String str, je1 je1Var, ym1 ym1Var, String str2, boolean z, int i) {
        ym1Var = (i & 4) != 0 ? null : ym1Var;
        yg0 yg0Var = (i & 8) != 0 ? null : ki0.o0;
        String str3 = (i & 16) != 0 ? null : "Aa";
        str2 = (i & 32) != 0 ? null : str2;
        z = (i & 64) != 0 ? false : z;
        boolean z2 = (i & Uuid.SIZE_BITS) == 0;
        str.getClass();
        je1Var.getClass();
        this.a = str;
        this.b = je1Var;
        this.c = ym1Var;
        this.d = yg0Var;
        this.e = str3;
        this.f = str2;
        this.g = z;
        this.h = z2;
    }
}
