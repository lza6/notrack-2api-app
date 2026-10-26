package defpackage;

import java.net.URLEncoder;
import notrack.ai.data.api.ChatHistoryResponse;
import notrack.ai.data.promo.BonusBar;

/* JADX INFO: loaded from: classes.dex */
public final class w50 extends mq3 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w50(Object obj, Object obj2, so0 so0Var, int i) {
        super(1, so0Var);
        this.c = i;
        this.h = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(String str, e60 e60Var, so0 so0Var) {
        super(1, so0Var);
        this.c = 1;
        this.d = str;
        this.h = e60Var;
    }

    @Override // defpackage.wr
    public final so0 create(so0 so0Var) {
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new w50((e60) obj2, (String) obj, so0Var, 0);
            case 1:
                return new w50((String) obj, (e60) obj2, so0Var);
            case 2:
                return new w50((e60) obj2, (String) obj, so0Var, 2);
            default:
                return new w50((ue) obj2, obj, so0Var, 3);
        }
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        so0 so0Var = (so0) obj;
        switch (i) {
            case 0:
                return ((w50) create(so0Var)).invokeSuspend(w84Var);
            case 1:
                return ((w50) create(so0Var)).invokeSuspend(w84Var);
            case 2:
                return ((w50) create(so0Var)).invokeSuspend(w84Var);
            default:
                ((w50) create(so0Var)).invokeSuspend(w84Var);
                return w84Var;
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object i63Var;
        Object i63Var2;
        int i = this.c;
        Object obj2 = this.d;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                g13.O(obj);
                vu vuVar = new vu();
                e60 e60Var = (e60) obj3;
                vuVar.p(e60Var.l + "/api/chat?id=" + ((String) obj2));
                vuVar.o("DELETE", ka4.d);
                l53 l53VarG = vuVar.g();
                try {
                    tn2 tn2Var = e60Var.k;
                    tn2Var.getClass();
                    f63 f63VarF = new y23(tn2Var, l53VarG).f();
                    try {
                        i63Var = Boolean.valueOf(f63VarF.c());
                        f63VarF.close();
                        return new j63(i63Var);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(f63VarF, th);
                            throw th2;
                        }
                    }
                } catch (Exception e) {
                    i63Var = new i63(e);
                }
                break;
            case 1:
                e60 e60Var2 = (e60) obj3;
                g13.O(obj);
                try {
                    String strEncode = URLEncoder.encode((String) obj2, "UTF-8");
                    vu vuVar2 = new vu();
                    vuVar2.p(e60Var2.l + "/bonus.php?lang=" + strEncode);
                    vuVar2.h();
                    l53 l53VarG2 = vuVar2.g();
                    tn2 tn2Var2 = e60Var2.k;
                    tn2Var2.getClass();
                    f63 f63VarF2 = new y23(tn2Var2, l53VarG2).f();
                    try {
                        if (!f63VarF2.c()) {
                            f63VarF2.close();
                            return null;
                        }
                        m33 m33Var = f63VarF2.o;
                        String strL = m33Var != null ? m33Var.l() : null;
                        if (strL != null && !mo3.C0(strL)) {
                            kt1 kt1Var = e60Var2.j;
                            kt1Var.getClass();
                            Object objB = kt1Var.b(BonusBar.Companion.serializer(), strL);
                            if (!((BonusBar) objB).isValid()) {
                                objB = null;
                            }
                            BonusBar bonusBar = (BonusBar) objB;
                            f63VarF2.close();
                            return bonusBar;
                        }
                        f63VarF2.close();
                        return null;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jr1.i(f63VarF2, th3);
                            throw th4;
                        }
                    }
                } catch (Exception unused) {
                    return null;
                }
                return null;
            case 2:
                g13.O(obj);
                vu vuVar3 = new vu();
                e60 e60Var3 = (e60) obj3;
                vuVar3.p(e60Var3.l + "/api/chat?id=" + ((String) obj2));
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
                        m33 m33Var2 = f63VarF3.o;
                        if (m33Var2 == null) {
                            j63 j63Var2 = new j63(new i63(new Exception("Empty body")));
                            f63VarF3.close();
                            return j63Var2;
                        }
                        String strL2 = m33Var2.l();
                        kt1 kt1Var2 = e60Var3.j;
                        kt1Var2.getClass();
                        i63Var2 = kt1Var2.b(ChatHistoryResponse.Companion.serializer(), strL2);
                        f63VarF3.close();
                        return new j63(i63Var2);
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            jr1.i(f63VarF3, th5);
                            throw th6;
                        }
                    }
                } catch (Exception e2) {
                    i63Var2 = new i63(e2);
                }
                break;
            default:
                g13.O(obj);
                ue ueVar = (ue) obj3;
                ue.b(ueVar);
                Object objA = ue.a(ueVar, obj2);
                ueVar.c.d.setValue(objA);
                ueVar.e.setValue(objA);
                return w84.a;
        }
    }
}
