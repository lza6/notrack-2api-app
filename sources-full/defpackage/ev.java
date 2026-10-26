package defpackage;

import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class ev implements is0 {
    public final /* synthetic */ int a = 1;
    public final jq2 b;
    public final kf3 c;
    public final Object d;
    public final Object e;

    public ev(ImageDecoder.Source source, AutoCloseable autoCloseable, jq2 jq2Var, kf3 kf3Var) {
        this.d = source;
        this.e = autoCloseable;
        this.b = jq2Var;
        this.c = kf3Var;
    }

    public ev(wm1 wm1Var, jq2 jq2Var, kf3 kf3Var, v51 v51Var) {
        this.d = wm1Var;
        this.b = jq2Var;
        this.c = kf3Var;
        this.e = v51Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // defpackage.is0
    public final Object a(so0 so0Var) throws Throwable {
        dv dvVar;
        int i;
        kf3 kf3Var;
        sn3 sn3Var;
        int i2 = this.a;
        kf3 kf3Var2 = this.c;
        hq0 hq0Var = hq0.c;
        int i3 = 1;
        switch (i2) {
            case 0:
                if (so0Var instanceof dv) {
                    dvVar = (dv) so0Var;
                    int i4 = dvVar.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        dvVar.m = i4 - Integer.MIN_VALUE;
                    } else {
                        dvVar = new dv(this, (uo0) so0Var);
                    }
                } else {
                    dvVar = new dv(this, (uo0) so0Var);
                }
                Object objS = dvVar.h;
                int i5 = dvVar.m;
                try {
                    if (i5 == 0) {
                        g13.O(objS);
                        dvVar.c = kf3Var2;
                        i = 0;
                        dvVar.d = 0;
                        dvVar.m = 1;
                        if (kf3Var2.a(dvVar) == hq0Var) {
                            return hq0Var;
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                u41.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kf3Var = dvVar.c;
                            try {
                                g13.O(objS);
                                bs0 bs0Var = (bs0) objS;
                                kf3Var.c();
                                return bs0Var;
                            } catch (Throwable th) {
                                th = th;
                                kf3Var.c();
                                throw th;
                            }
                        }
                        int i6 = dvVar.d;
                        kf3 kf3Var3 = dvVar.c;
                        g13.O(objS);
                        i = i6;
                        kf3Var2 = kf3Var3;
                    }
                    wl wlVar = new wl(3, this);
                    dvVar.c = kf3Var2;
                    dvVar.d = i;
                    dvVar.m = 2;
                    objS = yh4.S(wlVar, dvVar);
                    if (objS == hq0Var) {
                        return hq0Var;
                    }
                    kf3Var = kf3Var2;
                    bs0 bs0Var2 = (bs0) objS;
                    kf3Var.c();
                    return bs0Var2;
                } catch (Throwable th2) {
                    th = th2;
                    kf3Var = kf3Var2;
                    kf3Var.c();
                    throw th;
                }
            default:
                if (so0Var instanceof sn3) {
                    sn3Var = (sn3) so0Var;
                    int i7 = sn3Var.l;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        sn3Var.l = i7 - Integer.MIN_VALUE;
                    } else {
                        sn3Var = new sn3(this, (uo0) so0Var);
                    }
                } else {
                    sn3Var = new sn3(this, (uo0) so0Var);
                }
                Object obj = sn3Var.d;
                int i8 = sn3Var.l;
                if (i8 == 0) {
                    g13.O(obj);
                    sn3Var.c = kf3Var2;
                    sn3Var.l = 1;
                    if (kf3Var2.a(sn3Var) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i8 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kf3Var2 = sn3Var.c;
                    g13.O(obj);
                }
                try {
                    AutoCloseable autoCloseable = (AutoCloseable) this.e;
                    try {
                        l43 l43Var = new l43();
                        bs0 bs0Var3 = new bs0(new gv(ImageDecoder.decodeBitmap((ImageDecoder.Source) this.d, new bf(this, l43Var, i3))), l43Var.c);
                        xp1.g(autoCloseable, null);
                        kf3Var2.c();
                        return bs0Var3;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            xp1.g(autoCloseable, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    kf3Var2.c();
                    throw th5;
                }
        }
    }
}
