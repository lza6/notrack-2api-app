package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.ViewConfiguration;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class hl3 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl3(ef4 ef4Var, int i, he4 he4Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 8;
        this.h = ef4Var;
        this.d = i;
        this.l = he4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl3(Object obj, Object obj2, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl3(Object obj, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new hl3((k81) this.h, (vz2) obj2, so0Var, 0);
            case 1:
                return new hl3((sd) this.h, (wf) obj2, so0Var, 1);
            case 2:
                return new hl3((gs1) this.h, (py2) obj2, so0Var, 2);
            case 3:
                return new hl3((uu1) this.h, (nu3) obj2, so0Var, 3);
            case 4:
                hl3 hl3Var = new hl3((nu3) obj2, so0Var, 4);
                hl3Var.h = obj;
                return hl3Var;
            case 5:
                hl3 hl3Var2 = new hl3((gw3) obj2, so0Var, 5);
                hl3Var2.h = obj;
                return hl3Var2;
            case 6:
                hl3 hl3Var3 = new hl3((l81) obj2, so0Var, 6);
                hl3Var3.h = obj;
                return hl3Var3;
            case 7:
                return new hl3((cb0) this.h, (String) obj2, so0Var, 7);
            default:
                return new hl3((ef4) this.h, this.d, (he4) obj2, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((hl3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 1:
                return ((hl3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((hl3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 3:
                return ((hl3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 4:
                ((hl3) create((PlatformTextInputSessionScope) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0.c;
            case 5:
                return ((hl3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 6:
                return ((hl3) create(obj, (so0) obj2)).invokeSuspend(w84Var);
            case 7:
                return ((hl3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((hl3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        int i2 = 12;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        Object obj2 = this.l;
        switch (i) {
            case 0:
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
                k81 k81Var = (k81) this.h;
                gl3 gl3Var = new gl3((vz2) obj2, 1);
                this.d = 1;
                return k81Var.a(gl3Var, this) == hq0Var ? hq0Var : w84Var;
            case 1:
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return ue.c((ue) ((sd) this.h).c, new Float(0.0f), (wf) obj2, this, 12) == hq0Var ? hq0Var : w84Var;
                }
                if (i4 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i5 = this.d;
                if (i5 == 0) {
                    g13.O(obj);
                    gs1 gs1Var = (gs1) this.h;
                    this.d = 1;
                    if (gs1Var.K(this) != hq0Var) {
                    }
                    return hq0Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.d = 2;
                if (((py2) obj2).c(this) != hq0Var) {
                    return w84Var;
                }
                return hq0Var;
            case 3:
                nu3 nu3Var = (nu3) obj2;
                int i6 = this.d;
                if (i6 != 0) {
                    if (i6 == 1 || i6 == 2 || i6 == 3) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                switch (((uu1) this.h).ordinal()) {
                    case 16:
                        wx3 wx3Var = nu3Var.m;
                        this.d = 1;
                        if (wx3Var.f(false, this) != hq0Var) {
                            return w84Var;
                        }
                        break;
                    case 17:
                        wx3 wx3Var2 = nu3Var.m;
                        this.d = 3;
                        if (wx3Var2.t(this) != hq0Var) {
                            return w84Var;
                        }
                        break;
                    case 18:
                        wx3 wx3Var3 = nu3Var.m;
                        this.d = 2;
                        if (wx3Var3.g(this) != hq0Var) {
                            return w84Var;
                        }
                        break;
                    default:
                        return w84Var;
                }
                return hq0Var;
            case 4:
                nu3 nu3Var2 = (nu3) obj2;
                int i7 = this.d;
                if (i7 != 0) {
                    if (i7 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g13.O(obj);
                        u41.p();
                    }
                    return null;
                }
                g13.O(obj);
                PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.h;
                c cVar = nu3Var2.h;
                az3 az3Var = nu3Var2.l;
                in1 in1VarC = nu3Var2.p.c(nu3Var2.q);
                l lVar = new l(1, nu3Var2, nu3.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0, 27);
                hu3 hu3Var = new hu3(nu3Var2, i2);
                ki2 ki2Var = nu3Var2.t;
                ViewConfiguration viewConfiguration = (ViewConfiguration) gm4.t(nu3Var2, CompositionLocalsKt.getLocalViewConfiguration());
                this.d = 1;
                xp1.w(platformTextInputSessionScope, cVar, az3Var, in1VarC, lVar, hu3Var, ki2Var, viewConfiguration, this);
                return hq0Var;
            case 5:
                gw3 gw3Var = (gw3) obj2;
                int i8 = this.d;
                if (i8 != 0) {
                    if (i8 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                gq0 gq0Var = (gq0) this.h;
                pm0 pm0VarE = cl3.e(new i43(i2, gw3Var));
                ha0 ha0Var = new ha0(gw3Var, 9, gq0Var);
                this.d = 1;
                return pm0VarE.a(ha0Var, this) == hq0Var ? hq0Var : w84Var;
            case 6:
                int i9 = this.d;
                if (i9 == 0) {
                    g13.O(obj);
                    Object obj3 = this.h;
                    this.d = 1;
                    return ((l81) obj2).emit(obj3, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i9 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                int i10 = this.d;
                if (i10 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return ((cb0) this.h).invoke((String) obj2, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i10 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                g13.O(obj);
                he4 he4Var = (he4) obj2;
                File file = new File((File) ((ef4) this.h).q.getValue(), "c" + this.d + "_" + he4Var.c + ".ogg");
                byte[] bArr = he4Var.a;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    return file;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        jr1.i(fileOutputStream, th);
                        throw th2;
                    }
                }
        }
    }
}
