package defpackage;

import app.template.extension.BuildConfig;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Pattern;
import notrack.ai.data.api.DeleteFromResponse;
import notrack.ai.data.api.UploadResponse;
import notrack.ai.data.api.VisionQuotaError;
import okio.Options$Companion;
import okio.Path$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class x50 extends mq3 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ e60 h;
    public final /* synthetic */ Serializable l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x50(String str, e60 e60Var, String str2, so0 so0Var, int i) {
        super(1, so0Var);
        this.c = i;
        this.d = str;
        this.h = e60Var;
        this.l = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x50(String str, Serializable serializable, e60 e60Var, so0 so0Var, int i) {
        super(1, so0Var);
        this.c = i;
        this.d = str;
        this.l = serializable;
        this.h = e60Var;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.io.Serializable] */
    @Override // defpackage.wr
    public final so0 create(so0 so0Var) {
        int i = this.c;
        Object obj = this.l;
        switch (i) {
            case 0:
                return new x50(this.d, this.h, (String) obj, so0Var, 0);
            case 1:
                return new x50(this.d, this.h, (String) obj, so0Var, 1);
            case 2:
                return new x50(this.d, (String) obj, this.h, so0Var, 2);
            default:
                return new x50(this.d, (Serializable) obj, this.h, so0Var, 3);
        }
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        so0 so0Var = (so0) obj;
        switch (i) {
            case 0:
                return ((x50) create(so0Var)).invokeSuspend(w84Var);
            case 1:
                return ((x50) create(so0Var)).invokeSuspend(w84Var);
            case 2:
                ((x50) create(so0Var)).invokeSuspend(w84Var);
                return w84Var;
            default:
                return ((x50) create(so0Var)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0363  */
    /* JADX WARN: Code duplicated, block: B:86:0x0276  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object i50Var;
        Object i63Var;
        Object i63Var2;
        Object p50Var;
        Object i63Var3;
        Object i63Var4;
        Object i63Var5;
        int i = this.c;
        String str = BuildConfig.VERSION_NAME;
        Object obj2 = this.l;
        String str2 = this.d;
        e60 e60Var = this.h;
        Object objL = null;
        switch (i) {
            case 0:
                h50 h50Var = h50.b;
                g13.O(obj);
                String string = new JSONObject().put("op", "delete_from").put("message_id", str2).toString();
                string.getClass();
                Pattern pattern = ac2.d;
                n53 n53VarCreate = Options$Companion.create(string, Options$Companion.get("application/json; charset=utf-8"));
                vu vuVar = new vu();
                vuVar.p(e60Var.l + "/api/chat?id=" + URLEncoder.encode((String) obj2, "UTF-8"));
                vuVar.o("POST", n53VarCreate);
                l53 l53VarG = vuVar.g();
                try {
                    tn2 tn2Var = e60Var.k;
                    tn2Var.getClass();
                    f63 f63VarF = new y23(tn2Var, l53VarG).f();
                    try {
                        if (f63VarF.l == 409) {
                            i50Var = h50.a;
                        } else if (f63VarF.c()) {
                            kt1 kt1Var = e60Var.j;
                            m33 m33Var = f63VarF.o;
                            objL = m33Var != null ? m33Var.l() : null;
                            String str3 = objL == null ? str : objL;
                            kt1Var.getClass();
                            DeleteFromResponse deleteFromResponse = (DeleteFromResponse) kt1Var.b(DeleteFromResponse.Companion.serializer(), str3);
                            if (deleteFromResponse.getOk()) {
                                i50Var = new i50(deleteFromResponse.getChatDeleted());
                            } else {
                                i50Var = h50Var;
                            }
                        } else {
                            i50Var = h50Var;
                        }
                        f63VarF.close();
                        return i50Var;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(f63VarF, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    return h50Var;
                }
            case 1:
                n50 n50Var = n50.a;
                g13.O(obj);
                String string2 = new JSONObject().put("op", "instructions").put("text", str2).toString();
                string2.getClass();
                Pattern pattern2 = ac2.d;
                n53 n53VarCreate2 = Options$Companion.create(string2, Options$Companion.get("application/json; charset=utf-8"));
                vu vuVar2 = new vu();
                vuVar2.p(e60Var.l + "/api/chat?id=" + URLEncoder.encode((String) obj2, "UTF-8"));
                vuVar2.o("POST", n53VarCreate2);
                l53 l53VarG2 = vuVar2.g();
                try {
                    tn2 tn2Var2 = e60Var.k;
                    tn2Var2.getClass();
                    f63 f63VarF2 = new y23(tn2Var2, l53VarG2).f();
                    try {
                        m33 m33Var2 = f63VarF2.o;
                        String strL = m33Var2 != null ? m33Var2.l() : null;
                        String str4 = strL == null ? str : strL;
                        int i2 = f63VarF2.l;
                        if (i2 == 200) {
                            try {
                                i63Var = new JSONObject(str4).optString("instructions", str2);
                            } catch (Throwable th3) {
                                i63Var = new i63(th3);
                            }
                            Object obj3 = i63Var instanceof i63 ? str2 : i63Var;
                            obj3.getClass();
                            String str5 = (String) obj3;
                            try {
                                i63Var2 = e60.c(e60Var, new JSONObject(str4));
                            } catch (Throwable th4) {
                                i63Var2 = new i63(th4);
                            }
                            if (!(i63Var2 instanceof i63)) {
                                objL = i63Var2;
                            }
                            p50Var = new p50(str5, (m50) objL);
                            break;
                        } else if (i2 != 404) {
                            if (i2 == 413) {
                                p50Var = n50.d;
                            } else if (i2 == 422) {
                                p50Var = n50.c;
                            } else if (i2 != 429) {
                                p50Var = n50Var;
                            } else {
                                try {
                                    i63Var3 = e60.b(e60Var, new JSONObject(str4));
                                } catch (Throwable th5) {
                                    i63Var3 = new i63(th5);
                                }
                                if (!(i63Var3 instanceof i63)) {
                                    objL = i63Var3;
                                }
                                p50Var = new o50((l50) objL);
                            }
                            break;
                        } else if (mo3.u0(str4, "\"off\"", false)) {
                            p50Var = n50.b;
                        } else {
                            p50Var = n50Var;
                        }
                        f63VarF2.close();
                        return p50Var;
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            jr1.i(f63VarF2, th6);
                            throw th7;
                        }
                    }
                } catch (Exception unused2) {
                    return n50Var;
                }
            case 2:
                g13.O(obj);
                try {
                    vu vuVar3 = new vu();
                    vuVar3.p(e60Var.l + "/promo_log.php");
                    Pattern pattern3 = ac2.d;
                    vuVar3.o("POST", Options$Companion.create("{\"e\":\"" + str2 + "\",\"p\":\"bonus\",\"loc\":\"" + ((String) obj2) + "\",\"cc\":\"\",\"tier\":\"low\",\"offer\":\"podbex\",\"qa\":0,\"v\":\"app\"}", Options$Companion.get("application/json")));
                    l53 l53VarG3 = vuVar3.g();
                    tn2 tn2Var3 = e60Var.k;
                    tn2Var3.getClass();
                    new y23(tn2Var3, l53VarG3).f().close();
                    break;
                } catch (Exception unused3) {
                }
                return w84.a;
            default:
                kt1 kt1Var2 = e60Var.j;
                g13.O(obj);
                String string3 = UUID.randomUUID().toString();
                string3.getClass();
                lz lzVar = lz.l;
                lz lzVarEncodeUtf8 = Path$Companion.encodeUtf8(string3);
                ac2 ac2Var = yg2.n;
                ArrayList arrayList = new ArrayList();
                ac2 ac2Var2 = yg2.o;
                ac2Var2.getClass();
                if (!ac2Var2.b.equals("multipart")) {
                    m51.z(ac2Var2, "multipart != ");
                    return null;
                }
                byte[] bArr = (byte[]) obj2;
                Pattern pattern4 = ac2.d;
                ac2 ac2Var3 = Options$Companion.get("application/octet-stream");
                int length = bArr.length;
                bArr.getClass();
                ka4.c(bArr.length, 0L, length);
                arrayList.add(Options$Companion.createFormData("file", str2, new n53(ac2Var3, length, bArr)));
                if (arrayList.isEmpty()) {
                    u41.r("Multipart body must have at least one part.");
                    return null;
                }
                yg2 yg2Var = new yg2(lzVarEncodeUtf8, ac2Var2, ka4.w(arrayList));
                vu vuVar4 = new vu();
                vuVar4.p(e60Var.l + "/api/upload");
                vuVar4.o("POST", yg2Var);
                l53 l53VarG4 = vuVar4.g();
                try {
                    tn2 tn2Var4 = e60Var.k;
                    tn2Var4.getClass();
                    f63 f63VarF3 = new y23(tn2Var4, l53VarG4).f();
                    try {
                        m33 m33Var3 = f63VarF3.o;
                        String strL2 = m33Var3 != null ? m33Var3.l() : null;
                        String str6 = strL2 == null ? str : strL2;
                        if (f63VarF3.c()) {
                            if (str6.length() == 0) {
                                j63 j63Var = new j63(new i63(new Exception("Empty body")));
                                f63VarF3.close();
                                return j63Var;
                            }
                            kt1Var2.getClass();
                            i63Var4 = kt1Var2.b(UploadResponse.Companion.serializer(), str6);
                            f63VarF3.close();
                            return new j63(i63Var4);
                        }
                        if (f63VarF3.l == 402) {
                            try {
                                kt1Var2.getClass();
                                i63Var5 = (VisionQuotaError) kt1Var2.b(VisionQuotaError.Companion.serializer(), str6);
                            } catch (Throwable th8) {
                                i63Var5 = new i63(th8);
                            }
                            if (!(i63Var5 instanceof i63)) {
                                objL = i63Var5;
                            }
                            VisionQuotaError visionQuotaError = (VisionQuotaError) objL;
                            if (visionQuotaError != null && kr1.n(visionQuotaError.getError(), "vision_quota")) {
                                j63 j63Var2 = new j63(new i63(new be4(visionQuotaError.getPlan(), visionQuotaError.getLimit(), visionQuotaError.getQuotas())));
                                f63VarF3.close();
                                return j63Var2;
                            }
                            break;
                        }
                        j63 j63Var3 = new j63(new i63(new Exception("HTTP " + f63VarF3.l)));
                        f63VarF3.close();
                        return j63Var3;
                        return new j63(i63Var4);
                    } catch (Throwable th9) {
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            jr1.i(f63VarF3, th9);
                            throw th10;
                        }
                    }
                } catch (Exception e) {
                    i63Var4 = new i63(e);
                }
                i63Var4 = new i63(e);
                break;
        }
    }
}
