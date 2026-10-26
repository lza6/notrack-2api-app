package defpackage;

import android.content.SharedPreferences;
import app.template.extension.BuildConfig;
import java.net.URLEncoder;
import okhttp3.Protocol$Companion;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s50 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ e60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s50(e60 e60Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = e60Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new s50(this.d, so0Var, 0);
            default:
                return new s50(this.d, so0Var, 1);
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
        }
        return ((s50) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        y10 y10Var;
        int i = this.c;
        String str = BuildConfig.VERSION_NAME;
        e60 e60Var = this.d;
        switch (i) {
            case 0:
                g13.O(obj);
                String strQ = py.Q();
                vu vuVar = new vu();
                vuVar.p(e60Var.l + "/api/chat?op=carry_config&locale=" + URLEncoder.encode(strQ, "UTF-8"));
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
                        r10 r10VarM1785parse = f63VarF.l == 200 ? Protocol$Companion.m1785parse(str) : null;
                        SharedPreferences.Editor editorEdit = e60Var.j().edit();
                        if (r10VarM1785parse != null) {
                            editorEdit.putString("carry_cfg_".concat(strQ), str);
                        } else {
                            editorEdit.remove("carry_cfg_".concat(strQ));
                        }
                        editorEdit.apply();
                        if (r10VarM1785parse == null) {
                            r10VarM1785parse = g60.b;
                            break;
                        }
                        f63VarF.close();
                        return r10VarM1785parse;
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
            default:
                g13.O(obj);
                vu vuVar2 = new vu();
                vuVar2.p(e60Var.l + "/api/chat?op=carry_quota");
                vuVar2.h();
                l53 l53VarG2 = vuVar2.g();
                try {
                    tn2 tn2Var2 = e60Var.k;
                    tn2Var2.getClass();
                    f63 f63VarF2 = new y23(tn2Var2, l53VarG2).f();
                    try {
                        if (f63VarF2.l == 200) {
                            m33 m33Var2 = f63VarF2.o;
                            String strL2 = m33Var2 != null ? m33Var2.l() : null;
                            if (strL2 != null) {
                                str = strL2;
                            }
                            y10Var = Options$Companion.parse(new JSONObject(str));
                            break;
                        } else {
                            y10Var = null;
                        }
                        f63VarF2.close();
                        return y10Var;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jr1.i(f63VarF2, th3);
                            throw th4;
                        }
                    }
                } catch (Exception unused2) {
                    return null;
                }
        }
    }
}
