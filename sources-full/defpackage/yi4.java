package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class yi4 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ aj4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi4(aj4 aj4Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = aj4Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        aj4 aj4Var = this.h;
        switch (i) {
            case 0:
                return new yi4(aj4Var, so0Var, 0);
            default:
                return new yi4(aj4Var, so0Var, 1);
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
        return ((yi4) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        final wi4 ti4Var;
        int i = this.c;
        hq0 hq0Var = hq0.c;
        final aj4 aj4Var = this.h;
        so0 so0Var = null;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    Object objA = aj4.a(aj4Var, this);
                    return objA == hq0Var ? hq0Var : objA;
                }
                if (i2 == 1) {
                    g13.O(obj);
                    return obj;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.d;
                try {
                    if (i3 == 0) {
                        g13.O(obj);
                        is1 is1Var = aj4Var.m;
                        yi4 yi4Var = new yi4(aj4Var, so0Var, 0);
                        this.d = 1;
                        obj = py.Y(is1Var, yi4Var, this);
                        if (obj == hq0Var) {
                            return hq0Var;
                        }
                    } else {
                        if (i3 != 1) {
                            u41.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g13.O(obj);
                    }
                    ti4Var = (wi4) obj;
                    break;
                } catch (ri4 e) {
                    ti4Var = new vi4(e.c);
                } catch (CancellationException unused) {
                    ti4Var = new ti4();
                } catch (Throwable th) {
                    v72.f().e(bj4.a, "Unexpected error in WorkerWrapper", th);
                    ti4Var = new ti4();
                }
                Object objN = aj4Var.h.n(new Callable() { // from class: xi4
                    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        aj4 aj4Var2 = aj4Var;
                        String str = aj4Var2.c;
                        ji4 ji4Var = aj4Var2.i;
                        wi4 wi4Var = ti4Var;
                        boolean z = true;
                        boolean z2 = false;
                        if (wi4Var instanceof ui4) {
                            r62 r62Var = ((ui4) wi4Var).a;
                            int iK = ji4Var.k(str);
                            ci4 ci4VarT = aj4Var2.h.t();
                            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ci4VarT.d;
                            workDatabase_Impl.b();
                            hr3 hr3Var = (hr3) ci4VarT.h;
                            he1 he1VarA = hr3Var.a();
                            he1VarA.i(1, str);
                            try {
                                workDatabase_Impl.c();
                                try {
                                    he1VarA.a();
                                    workDatabase_Impl.p();
                                    workDatabase_Impl.k();
                                    hr3Var.j(he1VarA);
                                    if (iK == 0) {
                                        z = false;
                                    } else if (iK == 2) {
                                        hi4 hi4Var = aj4Var2.a;
                                        String str2 = aj4Var2.l;
                                        if (r62Var instanceof q62) {
                                            String str3 = bj4.a;
                                            v72.f().g(str3, "Worker result SUCCESS for " + str2);
                                            if (hi4Var.d()) {
                                                aj4Var2.c();
                                            } else {
                                                ji4Var.v(3, str);
                                                or0 or0Var = ((q62) r62Var).a;
                                                or0Var.getClass();
                                                ji4Var.u(str, or0Var);
                                                aj4Var2.f.getClass();
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                bv0 bv0Var = aj4Var2.j;
                                                ArrayList arrayListY = bv0Var.y(str);
                                                int size = arrayListY.size();
                                                int i4 = 0;
                                                while (i4 < size) {
                                                    Object obj2 = arrayListY.get(i4);
                                                    i4++;
                                                    String str4 = (String) obj2;
                                                    if (ji4Var.k(str4) == 5) {
                                                        q73 q73VarA = q73.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                                                        q73VarA.i(1, str4);
                                                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) bv0Var.d;
                                                        workDatabase_Impl2.b();
                                                        Cursor cursorM = workDatabase_Impl2.m(q73VarA);
                                                        try {
                                                            boolean z3 = cursorM.moveToFirst() && cursorM.getInt(0) != 0;
                                                            cursorM.close();
                                                            q73VarA.l();
                                                            if (z3) {
                                                                v72.f().g(bj4.a, "Setting status to enqueued for ".concat(str4));
                                                                ji4Var.v(1, str4);
                                                                ji4Var.t(str4, jCurrentTimeMillis);
                                                            }
                                                        } catch (Throwable th2) {
                                                            cursorM.close();
                                                            q73VarA.l();
                                                            throw th2;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (r62Var instanceof p62) {
                                            String str5 = bj4.a;
                                            v72.f().g(str5, "Worker result RETRY for " + str2);
                                            aj4Var2.b(-256);
                                        } else {
                                            String str6 = bj4.a;
                                            v72.f().g(str6, "Worker result FAILURE for " + str2);
                                            if (hi4Var.d()) {
                                                aj4Var2.c();
                                            } else {
                                                aj4Var2.d(r62Var);
                                            }
                                        }
                                        z = false;
                                    } else if (ud2.c(iK)) {
                                        z = false;
                                    } else {
                                        aj4Var2.b(-512);
                                    }
                                    z2 = z;
                                } catch (Throwable th3) {
                                    workDatabase_Impl.k();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                hr3Var.j(he1VarA);
                                throw th4;
                            }
                        } else if (wi4Var instanceof ti4) {
                            aj4Var2.d(((ti4) wi4Var).a);
                        } else {
                            if (!(wi4Var instanceof vi4)) {
                                u41.e();
                                return null;
                            }
                            int i5 = ((vi4) wi4Var).a;
                            int iK2 = ji4Var.k(str);
                            if (iK2 == 0 || ud2.c(iK2)) {
                                String str7 = bj4.a;
                                v72 v72VarF = v72.f();
                                StringBuilder sbS = fq2.s("Status for ", str, " is ");
                                sbS.append(ud2.z(iK2));
                                sbS.append(" ; not doing any work");
                                v72VarF.c(str7, sbS.toString());
                                z = false;
                            } else {
                                String str8 = bj4.a;
                                v72 v72VarF2 = v72.f();
                                StringBuilder sbS2 = fq2.s("Status for ", str, " is ");
                                sbS2.append(ud2.z(iK2));
                                sbS2.append("; not doing any work and rescheduling for later execution");
                                v72VarF2.c(str8, sbS2.toString());
                                ji4Var.v(1, str);
                                ji4Var.w(i5, str);
                                ji4Var.n(str, -1L);
                            }
                            z2 = z;
                        }
                        return Boolean.valueOf(z2);
                    }
                });
                objN.getClass();
                return objN;
        }
    }
}
