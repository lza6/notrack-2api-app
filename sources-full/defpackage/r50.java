package defpackage;

import android.content.SharedPreferences;
import app.template.extension.BuildConfig;
import java.net.URLEncoder;
import java.util.Set;
import java.util.regex.Pattern;
import notrack.ai.data.api.ChatListResponse;
import notrack.ai.data.promo.PromoConfig;
import okhttp3.Protocol$Companion;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r50 extends mq3 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ e60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r50(e60 e60Var, so0 so0Var, int i) {
        super(1, so0Var);
        this.c = i;
        this.d = e60Var;
    }

    @Override // defpackage.wr
    public final so0 create(so0 so0Var) {
        int i = this.c;
        e60 e60Var = this.d;
        switch (i) {
            case 0:
                return new r50(e60Var, so0Var, 0);
            case 1:
                return new r50(e60Var, so0Var, 1);
            case 2:
                return new r50(e60Var, so0Var, 2);
            case 3:
                return new r50(e60Var, so0Var, 3);
            case 4:
                return new r50(e60Var, so0Var, 4);
            case 5:
                return new r50(e60Var, so0Var, 5);
            default:
                return new r50(e60Var, so0Var, 6);
        }
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        so0 so0Var = (so0) obj;
        switch (i) {
            case 0:
                return ((r50) create(so0Var)).invokeSuspend(w84Var);
            case 1:
                ((r50) create(so0Var)).invokeSuspend(w84Var);
                return w84Var;
            case 2:
                return ((r50) create(so0Var)).invokeSuspend(w84Var);
            case 3:
                return ((r50) create(so0Var)).invokeSuspend(w84Var);
            case 4:
                return ((r50) create(so0Var)).invokeSuspend(w84Var);
            case 5:
                return ((r50) create(so0Var)).invokeSuspend(w84Var);
            default:
                ((r50) create(so0Var)).invokeSuspend(w84Var);
                return w84Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d0  */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        qt qtVar;
        Object i63Var;
        k50 k50Var;
        m50 m50VarC;
        int i = this.c;
        String str = BuildConfig.VERSION_NAME;
        switch (i) {
            case 0:
                g13.O(obj);
                String strQ = py.Q();
                vu vuVar = new vu();
                e60 e60Var = this.d;
                String str2 = e60Var.l;
                ci4 ci4Var = e60Var.c;
                vuVar.p(str2 + "/api/chat?op=bg_config&locale=" + URLEncoder.encode(strQ, "UTF-8") + "&fx=2");
                vuVar.h();
                l53 l53VarG = vuVar.g();
                try {
                    tn2 tn2Var = e60Var.k;
                    tn2Var.getClass();
                    f63 f63VarF = new y23(tn2Var, l53VarG).f();
                    try {
                        m33 m33Var = f63VarF.o;
                        String strL = m33Var != null ? m33Var.l() : null;
                        if (strL != null) {
                            str = strL;
                        }
                        int i2 = f63VarF.l;
                        if (i2 == 200) {
                            Set set = qt.o;
                            qtVar = Protocol$Companion.parse(str);
                            if (qtVar != null) {
                                ((SharedPreferences) ci4Var.h).edit().putString("cfg_".concat(strQ), str).apply();
                            } else {
                                qtVar = null;
                            }
                        } else if (i2 == 404 && mo3.u0(str, "\"off\"", false)) {
                            ((SharedPreferences) ci4Var.h).edit().putString("cfg_".concat(strQ), "{\"enabled\":false}").apply();
                            Set set2 = qt.o;
                            qtVar = Protocol$Companion.parse("{\"enabled\":false}");
                        } else {
                            qtVar = null;
                        }
                        f63VarF.close();
                        return qtVar;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(f63VarF, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                g13.O(obj);
                try {
                    String strQ2 = py.Q();
                    vu vuVar2 = new vu();
                    vuVar2.p(this.d.l + "/promo-config.php?loc=" + strQ2);
                    vuVar2.h();
                    l53 l53VarG2 = vuVar2.g();
                    tn2 tn2Var2 = this.d.k;
                    tn2Var2.getClass();
                    f63 f63VarF2 = new y23(tn2Var2, l53VarG2).f();
                    e60 e60Var2 = this.d;
                    try {
                        if (f63VarF2.c()) {
                            m33 m33Var2 = f63VarF2.o;
                            String strL2 = m33Var2 != null ? m33Var2.l() : null;
                            if (strL2 != null && !mo3.C0(strL2)) {
                                b13 b13Var = e60Var2.d;
                                kt1 kt1Var = e60Var2.j;
                                kt1Var.getClass();
                                PromoConfig promoConfig = (PromoConfig) kt1Var.b(PromoConfig.Companion.serializer(), strL2);
                                b13Var.getClass();
                                promoConfig.getClass();
                                b13Var.b = promoConfig;
                                b13Var.b();
                            }
                        }
                        f63VarF2.close();
                        break;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jr1.i(f63VarF2, th3);
                            throw th4;
                        }
                    }
                } catch (Exception unused2) {
                }
                return w84.a;
            case 2:
                g13.O(obj);
                vu vuVar3 = new vu();
                e60 e60Var3 = this.d;
                vuVar3.p(e60Var3.l + "/api/chats");
                vuVar3.h();
                l53 l53VarG3 = vuVar3.g();
                try {
                    tn2 tn2Var3 = e60Var3.k;
                    tn2Var3.getClass();
                    f63 f63VarF3 = new y23(tn2Var3, l53VarG3).f();
                    try {
                        if (!f63VarF3.c()) {
                            j63 j63Var = new j63(new i63(new Exception("HTTP " + f63VarF3.l)));
                            f63VarF3.close();
                            return j63Var;
                        }
                        m33 m33Var3 = f63VarF3.o;
                        if (m33Var3 == null) {
                            j63 j63Var2 = new j63(new i63(new Exception("Empty body")));
                            f63VarF3.close();
                            return j63Var2;
                        }
                        String strL3 = m33Var3.l();
                        kt1 kt1Var2 = e60Var3.j;
                        kt1Var2.getClass();
                        i63Var = kt1Var2.b(ChatListResponse.Companion.serializer(), strL3);
                        f63VarF3.close();
                        return new j63(i63Var);
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            jr1.i(f63VarF3, th5);
                            throw th6;
                        }
                    }
                } catch (Exception e) {
                    i63Var = new i63(e);
                }
                break;
            case 3:
                g13.O(obj);
                String strQ3 = py.Q();
                vu vuVar4 = new vu();
                e60 e60Var4 = this.d;
                vuVar4.p(e60Var4.l + "/api/chat?op=instr_config&locale=" + URLEncoder.encode(strQ3, "UTF-8"));
                vuVar4.h();
                l53 l53VarG4 = vuVar4.g();
                try {
                    tn2 tn2Var4 = e60Var4.k;
                    tn2Var4.getClass();
                    f63 f63VarF4 = new y23(tn2Var4, l53VarG4).f();
                    try {
                        m33 m33Var4 = f63VarF4.o;
                        String strL4 = m33Var4 != null ? m33Var4.l() : null;
                        if (strL4 != null) {
                            str = strL4;
                        }
                        int i3 = f63VarF4.l;
                        if (i3 == 200) {
                            k50Var = e60.l(str);
                            if (k50Var != null) {
                                e60Var4.j().edit().putString("instr_cfg_".concat(strQ3), str).apply();
                            } else {
                                k50Var = null;
                            }
                        } else if (i3 == 404 && mo3.u0(str, "\"off\"", false)) {
                            a31 a31Var = a31.c;
                            k50Var = new k50(false, 2000, a31Var, z21.c, a31Var);
                        } else {
                            k50Var = null;
                        }
                        f63VarF4.close();
                        return k50Var;
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            jr1.i(f63VarF4, th7);
                            throw th8;
                        }
                    }
                } catch (Exception unused3) {
                    return null;
                }
            case 4:
                g13.O(obj);
                vu vuVar5 = new vu();
                e60 e60Var5 = this.d;
                vuVar5.p(e60Var5.l + "/api/chat?op=instr_quota");
                vuVar5.h();
                l53 l53VarG5 = vuVar5.g();
                try {
                    tn2 tn2Var5 = e60Var5.k;
                    tn2Var5.getClass();
                    f63 f63VarF5 = new y23(tn2Var5, l53VarG5).f();
                    try {
                        if (f63VarF5.l == 200) {
                            m33 m33Var5 = f63VarF5.o;
                            String strL5 = m33Var5 != null ? m33Var5.l() : null;
                            if (strL5 != null) {
                                str = strL5;
                            }
                            m50VarC = e60.c(e60Var5, new JSONObject(str));
                            break;
                        } else {
                            m50VarC = null;
                        }
                        f63VarF5.close();
                        return m50VarC;
                    } catch (Throwable th9) {
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            jr1.i(f63VarF5, th9);
                            throw th10;
                        }
                    }
                } catch (Exception unused4) {
                    return null;
                }
            case 5:
                g13.O(obj);
                String string = new JSONObject().put("op", "instructions").put("text", BuildConfig.VERSION_NAME).toString();
                string.getClass();
                Pattern pattern = ac2.d;
                n53 n53VarCreate = Options$Companion.create(string, Options$Companion.get("application/json; charset=utf-8"));
                vu vuVar6 = new vu();
                e60 e60Var6 = this.d;
                vuVar6.p(e60Var6.l + "/api/chat?id=00000000-0000-0000-0000-000000000000");
                vuVar6.o("POST", n53VarCreate);
                l53 l53VarG6 = vuVar6.g();
                try {
                    tn2 tn2Var6 = e60Var6.k;
                    tn2Var6.getClass();
                    f63 f63VarF6 = new y23(tn2Var6, l53VarG6).f();
                    try {
                        int i4 = f63VarF6.l;
                        m33 m33Var6 = f63VarF6.o;
                        String strL6 = m33Var6 != null ? m33Var6.l() : null;
                        if (strL6 != null) {
                            str = strL6;
                        }
                        Boolean bool = (i4 == 404 && mo3.u0(str, "\"off\"", false)) ? Boolean.FALSE : i4 == 404 ? Boolean.TRUE : null;
                        f63VarF6.close();
                        return bool;
                    } catch (Throwable th11) {
                        try {
                            throw th11;
                        } catch (Throwable th12) {
                            jr1.i(f63VarF6, th11);
                            throw th12;
                        }
                    }
                } catch (Exception unused5) {
                    return null;
                }
            default:
                e60 e60Var7 = this.d;
                g13.O(obj);
                try {
                    String str3 = e60Var7.l + "/download/version.php?vc=1295&vn=" + URLEncoder.encode("1.10.13", "UTF-8") + "&ch=play&app=ai.notrack.app&src=" + e60.a(e60Var7) + "&sig=" + ((String) e60Var7.q.getValue());
                    tn2 tn2Var7 = e60Var7.k;
                    vu vuVar7 = new vu();
                    vuVar7.p(str3);
                    vuVar7.h();
                    l53 l53VarG7 = vuVar7.g();
                    tn2Var7.getClass();
                    new y23(tn2Var7, l53VarG7).f().close();
                    break;
                } catch (Exception unused6) {
                }
                return w84.a;
        }
    }
}
