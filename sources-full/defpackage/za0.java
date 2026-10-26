package defpackage;

import app.template.extension.BuildConfig;
import java.util.Locale;
import kotlin.KotlinVersion;
import notrack.ai.data.account.Entitlements;

/* JADX INFO: loaded from: classes.dex */
public final class za0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ hb0 h;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za0(hb0 hb0Var, String str, String str2, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = hb0Var;
        this.l = str;
        this.m = str2;
    }

    private final Object a(Object obj) throws Throwable {
        Object value;
        Object objY;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Entitlements entitlements;
        int i = this.d;
        hb0 hb0Var = this.h;
        if (i == 0) {
            g13.O(obj);
            jn3 jn3Var = hb0Var.c;
            do {
                value = jn3Var.getValue();
            } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, true, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
            k2 k2VarF = hb0Var.b.f();
            String string = mo3.U0(this.l).toString();
            this.d = 1;
            k2VarF.getClass();
            jt0 jt0Var = sw0.a;
            objY = py.Y(at0.c, new i2(null, string, this.m, k2VarF, 0), this);
            hq0 hq0Var = hq0.c;
            if (objY == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
            objY = obj;
        }
        r2 r2Var = (r2) objY;
        if (r2Var instanceof q2) {
            jn3 jn3Var2 = hb0Var.c;
            do {
                value6 = jn3Var2.getValue();
                entitlements = ((q2) r2Var).a;
            } while (!jn3Var2.n(value6, xa0.a((xa0) value6, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, entitlements, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -29360129, KotlinVersion.MAX_COMPONENT_VALUE)));
            if (!entitlements.getAds()) {
                hb0.f(hb0Var);
            }
            if (entitlements.getSignedIn()) {
                hb0.h(hb0Var);
            }
            hb0Var.X(e50.a);
        } else if (r2Var instanceof n2) {
            jn3 jn3Var3 = hb0Var.c;
            do {
                value5 = jn3Var3.getValue();
            } while (!jn3Var3.n(value5, xa0.a((xa0) value5, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, ((n2) r2Var).a, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
        } else if (r2Var instanceof l2) {
            jn3 jn3Var4 = hb0Var.c;
            do {
                value4 = jn3Var4.getValue();
            } while (!jn3Var4.n(value4, xa0.a((xa0) value4, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -41943041, KotlinVersion.MAX_COMPONENT_VALUE)));
        } else if (r2Var instanceof o2) {
            jn3 jn3Var5 = hb0Var.c;
            do {
                value3 = jn3Var5.getValue();
            } while (!jn3Var5.n(value3, xa0.a((xa0) value3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "offline", false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
        } else {
            jn3 jn3Var6 = hb0Var.c;
            do {
                value2 = jn3Var6.getValue();
            } while (!jn3Var6.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -8388609, KotlinVersion.MAX_COMPONENT_VALUE)));
        }
        return w84.a;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new za0(this.h, this.l, this.m, so0Var, 0);
            case 1:
                return new za0(this.h, this.l, this.m, so0Var, 1);
            case 2:
                return new za0(this.h, this.l, this.m, so0Var, 2);
            case 3:
                return new za0(this.h, this.l, this.m, so0Var, 3);
            case 4:
                return new za0(this.h, this.l, this.m, so0Var, 4);
            default:
                return new za0(this.h, this.l, this.m, so0Var, 5);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((za0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    /* JADX WARN: Code duplicated, block: B:99:0x0791  */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        Object value;
        xa0 xa0VarA;
        String str;
        l50 l50Var;
        Object value2;
        Object value3;
        Object objY;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        n2 n2Var;
        Object value8;
        p2 p2Var;
        int i = this.c;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        hb0 hb0Var = this.h;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                e60 e60Var = hb0Var.b;
                String language = Locale.getDefault().getLanguage();
                language.getClass();
                this.d = 1;
                return e60Var.n(this.l, "busy_line", language, this.m, this) == hq0Var ? hq0Var : w84Var;
            case 1:
                int i3 = this.d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                e60 e60Var2 = hb0Var.b;
                String strM = fq2.m("own_", this.m);
                String language2 = Locale.getDefault().getLanguage();
                language2.getClass();
                this.d = 1;
                return e60Var2.n(this.l, strM, language2, BuildConfig.VERSION_NAME, this) == hq0Var ? hq0Var : w84Var;
            case 2:
                int i4 = this.d;
                if (i4 != 0) {
                    if (i4 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                e60 e60Var3 = hb0Var.b;
                String language3 = Locale.getDefault().getLanguage();
                language3.getClass();
                this.d = 1;
                e60Var3.getClass();
                jt0 jt0Var = sw0.a;
                Object objA2 = g60.a(at0.c, new c60(this.l, this.m, language3, e60Var3, null), this);
                if (objA2 != hq0Var) {
                    objA2 = w84Var;
                }
                return objA2 == hq0Var ? hq0Var : w84Var;
            case 3:
                int i5 = this.d;
                String str2 = this.l;
                so0 so0Var = null;
                if (i5 != 0) {
                    if (i5 == 1) {
                        g13.O(obj);
                        objA = obj;
                    } else {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                g13.O(obj);
                e60 e60Var4 = hb0Var.b;
                this.d = 1;
                e60Var4.getClass();
                jt0 jt0Var2 = sw0.a;
                objA = g60.a(at0.c, new x50(this.m, e60Var4, str2, so0Var, 1), this);
                if (objA == hq0Var) {
                    return hq0Var;
                }
                q50 q50Var = (q50) objA;
                boolean zN = kr1.n(((xa0) hb0Var.d.c.getValue()).c, str2);
                jn3 jn3Var = hb0Var.c;
                if (!zN) {
                    do {
                        value2 = jn3Var.getValue();
                    } while (!jn3Var.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -8388609, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                    return w84Var;
                }
                do {
                    value = jn3Var.getValue();
                    xa0 xa0Var = (xa0) value;
                    if (q50Var instanceof p50) {
                        p50 p50Var = (p50) q50Var;
                        String str3 = p50Var.a;
                        m50 m50Var = p50Var.b;
                        if (m50Var == null) {
                            m50Var = xa0Var.D;
                        }
                        xa0VarA = xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, str3, false, false, null, null, null, false, 0L, m50Var, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -551550977, -32769, KotlinVersion.MAX_COMPONENT_VALUE);
                    } else if (kr1.n(q50Var, n50.b)) {
                        xa0VarA = xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -13107201, -1, KotlinVersion.MAX_COMPONENT_VALUE);
                    } else if (kr1.n(q50Var, n50.d)) {
                        xa0VarA = xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, "too_long", null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -8388609, -32769, KotlinVersion.MAX_COMPONENT_VALUE);
                    } else if (q50Var instanceof o50) {
                        l50 l50Var2 = ((o50) q50Var).a;
                        String str4 = l50Var2 != null ? l50Var2.a : null;
                        if (kr1.n(str4, "day")) {
                            str = "rate_day";
                        } else {
                            str = kr1.n(str4, "min") ? "rate_min" : "rate";
                        }
                        String str5 = str;
                        int i6 = l50Var2 != null ? l50Var2.d : 0;
                        if (l50Var2 == null) {
                            l50Var = null;
                        } else {
                            l50 l50Var3 = kr1.n(l50Var2.a, "day") ? l50Var2 : null;
                            if (l50Var3 != null) {
                                hb0Var.z("impr", "instr_gate", "instr_app");
                                l50Var = l50Var3;
                            } else {
                                l50Var = null;
                            }
                        }
                        xa0VarA = xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, kr1.n(l50Var2 != null ? l50Var2.a : null, "day") ? new m50(l50Var2.b, l50Var2.c, 0) : xa0Var.D, i6, l50Var, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, str5, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, 528482303, -32769, KotlinVersion.MAX_COMPONENT_VALUE);
                    } else if (kr1.n(q50Var, n50.c)) {
                        xa0VarA = xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, "refused", null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -8388609, -32769, KotlinVersion.MAX_COMPONENT_VALUE);
                    } else {
                        if (!kr1.n(q50Var, n50.a)) {
                            u41.e();
                            return null;
                        }
                        xa0VarA = xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, "failed", null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -8388609, -32769, KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                } while (!jn3Var.n(value, xa0VarA));
                return w84Var;
            case 4:
                return a(obj);
            default:
                int i7 = this.d;
                if (i7 == 0) {
                    g13.O(obj);
                    jn3 jn3Var2 = hb0Var.c;
                    do {
                        value3 = jn3Var2.getValue();
                    } while (!jn3Var2.n(value3, xa0.a((xa0) value3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, true, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -159383553, KotlinVersion.MAX_COMPONENT_VALUE)));
                    k2 k2VarF = hb0Var.b.f();
                    String string = mo3.U0(this.l).toString();
                    this.d = 1;
                    k2VarF.getClass();
                    jt0 jt0Var3 = sw0.a;
                    objY = py.Y(at0.c, new i2(null, string, this.m, k2VarF, 2), this);
                    if (objY == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i7 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                    objY = obj;
                }
                r2 r2Var = (r2) objY;
                if (r2Var instanceof p2) {
                    jn3 jn3Var3 = hb0Var.c;
                    do {
                        value8 = jn3Var3.getValue();
                        p2Var = (p2) r2Var;
                    } while (!jn3Var3.n(value8, xa0.a((xa0) value8, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, p2Var.a, false, null, false, p2Var.b, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -96468993, KotlinVersion.MAX_COMPONENT_VALUE)));
                    if (!p2Var.a.getAds()) {
                        hb0.f(hb0Var);
                    }
                    hb0Var.X(e50.a);
                    return w84Var;
                }
                if (r2Var instanceof n2) {
                    jn3 jn3Var4 = hb0Var.c;
                    do {
                        value7 = jn3Var4.getValue();
                        n2Var = (n2) r2Var;
                    } while (!jn3Var4.n(value7, xa0.a((xa0) value7, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, n2Var.a, false, null, n2Var.c, null, false, null, null, null, false, null, null, null, null, null, null, -1, -159383553, KotlinVersion.MAX_COMPONENT_VALUE)));
                    return w84Var;
                }
                if (r2Var instanceof l2) {
                    jn3 jn3Var5 = hb0Var.c;
                    do {
                        value6 = jn3Var5.getValue();
                    } while (!jn3Var5.n(value6, xa0.a((xa0) value6, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -41943041, KotlinVersion.MAX_COMPONENT_VALUE)));
                    return w84Var;
                }
                if (r2Var instanceof o2) {
                    jn3 jn3Var6 = hb0Var.c;
                    do {
                        value5 = jn3Var6.getValue();
                    } while (!jn3Var6.n(value5, xa0.a((xa0) value5, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "offline", false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
                    return w84Var;
                }
                jn3 jn3Var7 = hb0Var.c;
                do {
                    value4 = jn3Var7.getValue();
                } while (!jn3Var7.n(value4, xa0.a((xa0) value4, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "create_failed", false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84Var;
        }
    }
}
