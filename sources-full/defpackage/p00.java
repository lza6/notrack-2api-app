package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p00 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    public /* synthetic */ p00(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    public /* synthetic */ p00(kt0 kt0Var, vo voVar, j93 j93Var, mo moVar) {
        this.c = 1;
        this.d = kt0Var;
        this.h = voVar;
        this.l = moVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue = true;
        int i = 0;
        switch (this.c) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) this.d;
                String str = (String) this.h;
                wh4 wh4Var = (wh4) this.l;
                ji4 ji4VarU = workDatabase.u();
                ji4VarU.getClass();
                q73 q73VarA = q73.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                q73VarA.i(1, str);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ji4VarU.a;
                workDatabase_Impl.b();
                Cursor cursorM = workDatabase_Impl.m(q73VarA);
                try {
                    ArrayList arrayList = new ArrayList(cursorM.getCount());
                    while (cursorM.moveToNext()) {
                        arrayList.add(cursorM.getString(0));
                    }
                    cursorM.close();
                    q73VarA.l();
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        av1.e(wh4Var, (String) obj);
                    }
                    return;
                } catch (Throwable th) {
                    cursorM.close();
                    q73VarA.l();
                    throw th;
                }
            case 1:
                kt0 kt0Var = (kt0) this.d;
                vo voVar = (vo) this.h;
                String str2 = voVar.a;
                mo moVar = (mo) this.l;
                kt0Var.getClass();
                Logger logger = kt0.f;
                try {
                    f64 f64VarA = kt0Var.c.a(str2);
                    if (f64VarA == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        new IllegalArgumentException(str3);
                    } else {
                        kt0Var.e.x(new it0(kt0Var, voVar, ((i20) f64VarA).a(moVar), i));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 2:
                tu tuVar = (tu) this.d;
                yo4 yo4Var = (yo4) this.h;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.l;
                try {
                    ub1 ub1VarU = gb2.u(tuVar.a);
                    if (ub1VarU == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    tb1 tb1Var = (tb1) ub1VarU.a;
                    synchronized (tb1Var.d) {
                        tb1Var.f = threadPoolExecutor;
                        break;
                    }
                    ub1VarU.a.a(new a21(yo4Var, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    yo4Var.L(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                f00 f00Var = (f00) this.h;
                c40 c40Var = (c40) this.l;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    c40Var.invoke();
                    f00Var.a(null);
                    return;
                } catch (Throwable th3) {
                    f00Var.b(th3);
                    return;
                }
            case 4:
                tz2 tz2Var = (tz2) this.d;
                i00 i00Var = (i00) this.h;
                aj4 aj4Var = (aj4) this.l;
                try {
                    zBooleanValue = ((Boolean) i00Var.d.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (tz2Var.k) {
                    try {
                        vh4 vh4VarA = ki4.a(aj4Var.a);
                        String str4 = vh4VarA.a;
                        if (tz2Var.c(str4) == aj4Var) {
                            tz2Var.b(str4);
                        }
                        v72.f().c(tz2.l, tz2.class.getSimpleName() + " " + str4 + " executed; reschedule = " + zBooleanValue);
                        ArrayList arrayList2 = tz2Var.j;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            ((h51) obj2).d(vh4VarA, zBooleanValue);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case 5:
                ((tz2) ((fp1) this.d).c).g((dn3) this.h, (zf3) this.l);
                return;
            default:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.d;
                f00 f00Var2 = (f00) this.h;
                je1 je1Var = (je1) this.l;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    f00Var2.a(je1Var.invoke());
                    return;
                } catch (Throwable th5) {
                    f00Var2.b(th5);
                    return;
                }
        }
    }
}
