package defpackage;

import android.media.MediaPlayer;
import app.template.extension.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Locale;
import notrack.ai.data.avatars.AvatarCatalogue;

/* JADX INFO: loaded from: classes.dex */
public final class fp extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp(Object obj, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new fp((gp) obj2, so0Var, 0);
            case 1:
                return new fp((hb0) obj2, so0Var, 1);
            case 2:
                return new fp((hi4) obj2, so0Var, 2);
            case 3:
                return new fp((lw0) obj2, so0Var, 3);
            case 4:
                return new fp((MediaPlayer) obj2, so0Var, 4);
            default:
                return new fp((ef4) obj2, so0Var, 5);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((fp) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 1:
                ((fp) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return w84Var;
            case 2:
                ((fp) create((bn0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return w84Var;
            case 3:
                return ((fp) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 4:
                ((fp) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return w84Var;
            default:
                ((fp) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return w84Var;
        }
    }

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
        Object[] objArr = 0;
        switch (this.c) {
            case 0:
                g13.O(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                String languageTag = Locale.getDefault().toLanguageTag();
                if (mo3.C0(languageTag)) {
                    languageTag = "en";
                }
                AvatarCatalogue avatarCatalogue = ((gp) this.d).f;
                if (avatarCatalogue != null) {
                    gp gpVar = (gp) this.d;
                    if (languageTag.equals(gpVar.h) && jCurrentTimeMillis - gpVar.g < 300000) {
                        return avatarCatalogue;
                    }
                }
                try {
                    tn2 tn2Var = ((gp) this.d).a.d.k;
                    vu vuVar = new vu();
                    vuVar.p(((gp) this.d).c + "/api/avatars.php?lang=" + URLEncoder.encode(languageTag, "UTF-8"));
                    vuVar.h();
                    l53 l53VarG = vuVar.g();
                    tn2Var.getClass();
                    f63 f63VarF = new y23(tn2Var, l53VarG).f();
                    gp gpVar2 = (gp) this.d;
                    try {
                        if (!f63VarF.c()) {
                            AvatarCatalogue avatarCatalogue2 = gpVar2.f;
                            if (avatarCatalogue2 == null) {
                                AvatarCatalogue.Companion.getClass();
                                avatarCatalogue2 = AvatarCatalogue.EMPTY;
                            }
                            f63VarF.close();
                            return avatarCatalogue2;
                        }
                        m33 m33Var = f63VarF.o;
                        String strL = m33Var != null ? m33Var.l() : null;
                        if (strL == null) {
                            strL = BuildConfig.VERSION_NAME;
                        }
                        AvatarCatalogue avatarCatalogue3 = (AvatarCatalogue) gpVar2.d.b(AvatarCatalogue.Companion.serializer(), strL);
                        gpVar2.f = avatarCatalogue3;
                        gpVar2.g = jCurrentTimeMillis;
                        gpVar2.h = languageTag;
                        f63VarF.close();
                        return avatarCatalogue3;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(f63VarF, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    AvatarCatalogue avatarCatalogue4 = ((gp) this.d).f;
                    if (avatarCatalogue4 == null) {
                        AvatarCatalogue.Companion.getClass();
                        avatarCatalogue4 = AvatarCatalogue.EMPTY;
                    }
                    return avatarCatalogue4;
                }
            case 1:
                g13.O(obj);
                hb0 hb0Var = (hb0) this.d;
                tw2 tw2Var = (tw2) hb0Var.b.i.getValue();
                if (tw2Var != null) {
                    py.F(id4.a(hb0Var), null, null, new q8((Object) hb0Var, (Object) tw2Var, (so0) (objArr == true ? 1 : 0), 13), 3);
                }
                return w84.a;
            case 2:
                g13.O(obj);
                v72.f().c(rm0.a, "Constraints changed for " + ((hi4) this.d));
                return w84.a;
            case 3:
                g13.O(obj);
                lw0 lw0Var = (lw0) this.d;
                synchronized (lw0Var.p) {
                    try {
                        if (!lw0Var.u || lw0Var.v) {
                            return w84.a;
                        }
                        try {
                            lw0Var.Q();
                            break;
                        } catch (IOException unused2) {
                            lw0Var.w = true;
                        }
                        try {
                            if ((lw0Var.r >= 2000 ? 1 : 0) != 0) {
                                lw0Var.S();
                            }
                            break;
                        } catch (IOException unused3) {
                            lw0Var.x = true;
                            lw0Var.s = new t23(new iv());
                        }
                        return w84.a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 4:
                g13.O(obj);
                ((MediaPlayer) this.d).prepare();
                return w84.a;
            default:
                g13.O(obj);
                File[] fileArrListFiles = ((File) ((ef4) this.d).q.getValue()).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
                return w84.a;
        }
    }
}
