package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 implements h51 {
    public static final String n = v72.h("CommandHandler");
    public final Context c;
    public final HashMap d = new HashMap();
    public final Object h = new Object();
    public final sb3 l;
    public final mi4 m;

    public vf0(Context context, sb3 sb3Var, mi4 mi4Var) {
        this.c = context;
        this.l = sb3Var;
        this.m = mi4Var;
    }

    public static vh4 b(Intent intent) {
        return new vh4(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, vh4 vh4Var) {
        intent.putExtra("KEY_WORKSPEC_ID", vh4Var.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", vh4Var.b);
    }

    public final void a(Intent intent, int i, br3 br3Var) {
        List<dn3> listJ;
        ArrayList arrayList;
        String action = intent.getAction();
        int i2 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            v72.f().c(n, "Handling constraints changed " + intent);
            Context context = this.c;
            vm0 vm0Var = new vm0(context, this.l, i, br3Var);
            ArrayList arrayListJ = br3Var.m.c.u().j();
            String str = gm0.a;
            int size = arrayListJ.size();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListJ.get(i3);
                i3++;
                tm0 tm0Var = ((hi4) obj).j;
                z |= tm0Var.e;
                z2 |= tm0Var.c;
                z3 |= tm0Var.f;
                z4 |= tm0Var.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList arrayList2 = new ArrayList(arrayListJ.size());
            vm0Var.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListJ.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayListJ.get(i4);
                i4++;
                hi4 hi4Var = (hi4) obj2;
                if (jCurrentTimeMillis >= hi4Var.a() && (!hi4Var.c() || vm0Var.c.b(hi4Var))) {
                    arrayList2.add(hi4Var);
                }
            }
            int size3 = arrayList2.size();
            while (i2 < size3) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                hi4 hi4Var2 = (hi4) obj3;
                String str3 = hi4Var2.a;
                vh4 vh4VarA = ki4.a(hi4Var2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, vh4VarA);
                v72.f().c(vm0.d, "Creating a delay_met command for workSpec with id (" + str3 + ")");
                br3Var.d.d.execute(new ck(vm0Var.b, 1, br3Var, intent3));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            v72.f().c(n, "Handling reschedule " + intent + ", " + i);
            br3Var.m.c();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            v72.f().d(n, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.c;
            vh4 vh4VarB = b(intent);
            v72 v72VarF = v72.f();
            String str4 = n;
            v72VarF.c(str4, "Handling schedule work for " + vh4VarB);
            WorkDatabase workDatabase = br3Var.m.c;
            workDatabase.c();
            try {
                hi4 hi4VarL = workDatabase.u().l(vh4VarB.a);
                if (hi4VarL == null) {
                    v72.f().i(str4, "Skipping scheduling " + vh4VarB + " because it's no longer in the DB");
                    return;
                }
                if (ud2.c(hi4VarL.b)) {
                    v72.f().i(str4, "Skipping scheduling " + vh4VarB + "because it is finished.");
                    return;
                }
                long jA = hi4VarL.a();
                if (hi4VarL.c()) {
                    v72.f().c(str4, "Opportunistically setting an alarm for " + vh4VarB + "at " + jA);
                    a7.b(context2, workDatabase, vh4VarB, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    br3Var.d.d.execute(new ck(i, 1, br3Var, intent4));
                } else {
                    v72.f().c(str4, "Setting up Alarms for " + vh4VarB + "at " + jA);
                    a7.b(context2, workDatabase, vh4VarB, jA);
                }
                workDatabase.p();
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.h) {
                try {
                    vh4 vh4VarB2 = b(intent);
                    v72 v72VarF2 = v72.f();
                    String str5 = n;
                    v72VarF2.c(str5, "Handing delay met for " + vh4VarB2);
                    if (this.d.containsKey(vh4VarB2)) {
                        v72.f().c(str5, "WorkSpec " + vh4VarB2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        gu0 gu0Var = new gu0(this.c, i, br3Var, this.m.k(vh4VarB2));
                        this.d.put(vh4VarB2, gu0Var);
                        gu0Var.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                v72.f().i(n, "Ignoring intent " + intent);
                return;
            }
            vh4 vh4VarB3 = b(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            v72.f().c(n, "Handling onExecutionCompleted " + intent + ", " + i);
            d(vh4VarB3, z5);
            return;
        }
        mi4 mi4Var = this.m;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i5 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            dn3 dn3VarI = mi4Var.i(new vh4(string, i5));
            if (dn3VarI != null) {
                listJ = arrayList;
                arrayList.add(dn3VarI);
                listJ = arrayList;
            }
        } else {
            listJ = mi4Var.j(string);
        }
        listJ = arrayList;
        for (dn3 dn3Var : listJ) {
            v72.f().c(n, "Handing stopWork work for " + string);
            fp1 fp1Var = br3Var.r;
            fp1Var.getClass();
            dn3Var.getClass();
            fp1Var.p(dn3Var, -512);
            vh4 vh4Var = dn3Var.a;
            Context context3 = this.c;
            WorkDatabase workDatabase2 = br3Var.m.c;
            String str6 = a7.a;
            ir3 ir3VarQ = workDatabase2.q();
            gr3 gr3VarW = ir3VarQ.W(vh4Var);
            if (gr3VarW != null) {
                a7.a(context3, vh4Var, gr3VarW.c);
                v72.f().c(a7.a, "Removing SystemIdInfo for workSpecId (" + vh4Var + ")");
                String str7 = vh4Var.a;
                int i6 = vh4Var.b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ir3VarQ.c;
                workDatabase_Impl.b();
                hr3 hr3Var = (hr3) ir3VarQ.h;
                he1 he1VarA = hr3Var.a();
                he1VarA.i(1, str7);
                he1VarA.s(i6, 2);
                try {
                    workDatabase_Impl.c();
                    try {
                        he1VarA.a();
                        workDatabase_Impl.p();
                        workDatabase_Impl.k();
                        hr3Var.j(he1VarA);
                    } catch (Throwable th2) {
                        workDatabase_Impl.k();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    hr3Var.j(he1VarA);
                    throw th3;
                }
            }
            br3Var.d(vh4Var, false);
        }
    }

    @Override // defpackage.h51
    public final void d(vh4 vh4Var, boolean z) {
        synchronized (this.h) {
            try {
                gu0 gu0Var = (gu0) this.d.remove(vh4Var);
                this.m.i(vh4Var);
                if (gu0Var != null) {
                    gu0Var.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
