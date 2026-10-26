package defpackage;

import java.util.Locale;
import kotlin.KotlinVersion;
import notrack.ai.data.account.Entitlements;
import notrack.ai.data.promo.BonusBar;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ hb0 h;
    public String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya0(int i, hb0 hb0Var, so0 so0Var, String str) {
        super(2, so0Var);
        this.c = i;
        this.h = hb0Var;
        this.l = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(hb0 hb0Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 6;
        this.h = hb0Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        hb0 hb0Var = this.h;
        switch (i) {
            case 0:
                return new ya0(0, hb0Var, so0Var, this.l);
            case 1:
                return new ya0(1, hb0Var, so0Var, this.l);
            case 2:
                return new ya0(2, hb0Var, so0Var, this.l);
            case 3:
                return new ya0(3, hb0Var, so0Var, this.l);
            case 4:
                return new ya0(4, hb0Var, so0Var, this.l);
            case 5:
                return new ya0(5, hb0Var, so0Var, this.l);
            default:
                return new ya0(hb0Var, so0Var);
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
            case 5:
                break;
        }
        return ((ya0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objY;
        Object value2;
        xa0 xa0Var;
        Entitlements entitlements;
        int i;
        Object value3;
        Object objY2;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        String str;
        Object value8;
        Entitlements entitlements2;
        Object value9;
        p2 p2Var;
        Object value10;
        Object objY3;
        Object value11;
        Object value12;
        Object value13;
        Object value14;
        Object objD;
        String language;
        Object objA;
        int i2 = this.c;
        int i3 = 0;
        hq0 hq0Var = hq0.c;
        hb0 hb0Var = this.h;
        w84 w84Var = w84.a;
        so0 so0Var = null;
        switch (i2) {
            case 0:
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    e60 e60Var = hb0Var.b;
                    String str2 = this.l;
                    str2.getClass();
                    this.d = 1;
                    e60Var.getClass();
                    jt0 jt0Var = sw0.a;
                    Object objA2 = g60.a(at0.c, new x50("click", str2, e60Var, (so0) null, 2), this);
                    if (objA2 != hq0Var) {
                        objA2 = w84Var;
                    }
                    if (objA2 == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i4 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
            case 1:
                int i5 = this.d;
                if (i5 == 0) {
                    g13.O(obj);
                    e60 e60Var2 = hb0Var.b;
                    String str3 = this.l;
                    e60Var2.getClass();
                    str3.getClass();
                    e00 e00Var = new e00(new q8(str3, e60Var2, so0Var, 8), x21.c, -2, fy.c);
                    ab0 ab0Var = new ab0(hb0Var, i3);
                    this.d = 1;
                    if (e00Var.a(ab0Var, this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i5 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                if (((xa0) hb0Var.d.c.getValue()).J) {
                    jn3 jn3Var = hb0Var.c;
                    do {
                        value = jn3Var.getValue();
                    } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, "failed", 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -41, KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                return w84Var;
            case 2:
                String str4 = this.l;
                int i6 = this.d;
                so0 so0Var2 = null;
                if (i6 == 0) {
                    g13.O(obj);
                    gp gpVar = (gp) hb0Var.b.n.getValue();
                    this.d = 1;
                    gpVar.getClass();
                    ep epVar = new ep(str4, 0);
                    jt0 jt0Var2 = sw0.a;
                    objY = py.Y(at0.c, new df(gpVar, "avatar.clear", epVar, so0Var2, 1), this);
                    if (objY == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i6 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                    objY = obj;
                }
                if (objY instanceof tq) {
                    jn3 jn3Var2 = hb0Var.c;
                    do {
                        value2 = jn3Var2.getValue();
                        xa0Var = (xa0) value2;
                        if (kr1.n(str4, "ai")) {
                            entitlements = xa0Var.c0;
                            i = 4095;
                        } else {
                            entitlements = xa0Var.c0;
                            i = 6143;
                        }
                    } while (!jn3Var2.n(value2, xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, Entitlements.copy$default(entitlements, null, null, i), false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -4194305, KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                return w84Var;
            case 3:
                jn3 jn3Var3 = hb0Var.c;
                int i7 = this.d;
                if (i7 == 0) {
                    g13.O(obj);
                    do {
                        value3 = jn3Var3.getValue();
                    } while (!jn3Var3.n(value3, xa0.a((xa0) value3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, true, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
                    k2 k2VarF = hb0Var.b.f();
                    String str5 = this.l;
                    this.d = 1;
                    k2VarF.getClass();
                    jt0 jt0Var3 = sw0.a;
                    objY2 = py.Y(at0.c, new g2((so0) null, k2VarF, str5), this);
                    if (objY2 == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i7 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                    objY2 = obj;
                }
                r2 r2Var = (r2) objY2;
                boolean z = r2Var instanceof p2;
                e50 e50Var = e50.a;
                if (z) {
                    do {
                        value9 = jn3Var3.getValue();
                        p2Var = (p2) r2Var;
                    } while (!jn3Var3.n(value9, xa0.a((xa0) value9, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, p2Var.a, false, null, false, p2Var.b, null, null, false, "ok", null, null, false, null, null, null, null, null, null, -1, -1170210817, KotlinVersion.MAX_COMPONENT_VALUE)));
                    if (!p2Var.a.getAds()) {
                        hb0.f(hb0Var);
                    }
                    hb0Var.X(e50Var);
                } else if (r2Var instanceof q2) {
                    do {
                        value8 = jn3Var3.getValue();
                        entitlements2 = ((q2) r2Var).a;
                    } while (!jn3Var3.n(value8, xa0.a((xa0) value8, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, entitlements2, false, null, false, null, null, null, false, "ok", null, null, false, null, null, null, null, null, null, -1, -1103101953, KotlinVersion.MAX_COMPONENT_VALUE)));
                    if (!entitlements2.getAds()) {
                        hb0.f(hb0Var);
                    }
                    if (entitlements2.getSignedIn()) {
                        hb0.h(hb0Var);
                    }
                    hb0Var.X(e50Var);
                } else if (r2Var instanceof n2) {
                    do {
                        value7 = jn3Var3.getValue();
                        str = ((n2) r2Var).a;
                    } while (!jn3Var3.n(value7, xa0.a((xa0) value7, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, str, false, null, null, null, false, str, null, null, false, null, null, null, null, null, null, -1, -1098907649, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else if (r2Var instanceof l2) {
                    do {
                        value6 = jn3Var3.getValue();
                    } while (!jn3Var3.n(value6, xa0.a((xa0) value6, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -41943041, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else if (r2Var instanceof o2) {
                    do {
                        value5 = jn3Var3.getValue();
                    } while (!jn3Var3.n(value5, xa0.a((xa0) value5, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "offline", false, null, null, null, false, "offline", null, null, false, null, null, null, null, null, null, -1, -1098907649, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else {
                    do {
                        value4 = jn3Var3.getValue();
                    } while (!jn3Var3.n(value4, xa0.a((xa0) value4, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "bad_code", false, null, null, null, false, "bad_code", null, null, false, null, null, null, null, null, null, -1, -1098907649, KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                return w84Var;
            case 4:
                int i8 = this.d;
                if (i8 == 0) {
                    g13.O(obj);
                    jn3 jn3Var4 = hb0Var.c;
                    do {
                        value10 = jn3Var4.getValue();
                    } while (!jn3Var4.n(value10, xa0.a((xa0) value10, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, true, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
                    k2 k2VarF2 = hb0Var.b.f();
                    String str6 = this.l;
                    this.d = 1;
                    k2VarF2.getClass();
                    jt0 jt0Var4 = sw0.a;
                    objY3 = py.Y(at0.c, new g2((so0) null, str6, k2VarF2), this);
                    if (objY3 == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i8 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                    objY3 = obj;
                }
                r2 r2Var2 = (r2) objY3;
                if (r2Var2 instanceof m2) {
                    jn3 jn3Var5 = hb0Var.c;
                    do {
                        value14 = jn3Var5.getValue();
                        Entitlements.Companion.getClass();
                    } while (!jn3Var5.n(value14, xa0.a((xa0) value14, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, Entitlements.ANONYMOUS, false, null, false, null, null, null, true, null, null, null, false, null, null, null, null, null, null, -1, -817889281, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else if (r2Var2 instanceof n2) {
                    jn3 jn3Var6 = hb0Var.c;
                    do {
                        value13 = jn3Var6.getValue();
                    } while (!jn3Var6.n(value13, xa0.a((xa0) value13, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, ((n2) r2Var2).a, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else if (r2Var2 instanceof o2) {
                    jn3 jn3Var7 = hb0Var.c;
                    do {
                        value12 = jn3Var7.getValue();
                    } while (!jn3Var7.n(value12, xa0.a((xa0) value12, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "offline", false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
                } else {
                    jn3 jn3Var8 = hb0Var.c;
                    do {
                        value11 = jn3Var8.getValue();
                    } while (!jn3Var8.n(value11, xa0.a((xa0) value11, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, "delete_failed", false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -25165825, KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                return w84Var;
            case 5:
                String str7 = this.l;
                int i9 = this.d;
                if (i9 == 0) {
                    g13.O(obj);
                    e60 e60Var3 = hb0Var.b;
                    this.d = 1;
                    objD = e60Var3.d(str7, this);
                    if (objD == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i9 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                    objD = ((j63) obj).c;
                }
                if (!(objD instanceof i63) && ((Boolean) objD).booleanValue()) {
                    hb0Var.L();
                    if (kr1.n(((xa0) hb0Var.d.c.getValue()).c, str7)) {
                        hb0Var.N();
                    }
                }
                return w84Var;
            default:
                e60 e60Var4 = hb0Var.b;
                int i10 = this.d;
                so0 so0Var3 = null;
                if (i10 != 0) {
                    if (i10 == 1) {
                        language = this.l;
                        g13.O(obj);
                        objA = obj;
                    } else {
                        if (i10 != 2) {
                            u41.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g13.O(obj);
                    }
                    return w84Var;
                }
                g13.O(obj);
                language = Locale.getDefault().getLanguage();
                language.getClass();
                this.l = language;
                this.d = 1;
                e60Var4.getClass();
                jt0 jt0Var5 = sw0.a;
                objA = g60.a(at0.c, new w50(language, e60Var4, null), this);
                if (objA == hq0Var) {
                    return hq0Var;
                }
                String str8 = language;
                BonusBar bonusBar = (BonusBar) objA;
                hb0Var.y.o(bonusBar);
                if (bonusBar != null) {
                    str8.getClass();
                    this.l = null;
                    this.d = 2;
                    e60Var4.getClass();
                    jt0 jt0Var6 = sw0.a;
                    Object objA3 = g60.a(at0.c, new x50("impr", str8, e60Var4, so0Var3, 2), this);
                    if (objA3 != hq0Var) {
                        objA3 = w84Var;
                    }
                    if (objA3 == hq0Var) {
                        return hq0Var;
                    }
                }
                return w84Var;
        }
    }
}
