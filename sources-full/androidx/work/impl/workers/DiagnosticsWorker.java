package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.bi4;
import defpackage.dl2;
import defpackage.hi4;
import defpackage.ir3;
import defpackage.ji4;
import defpackage.kr1;
import defpackage.mi4;
import defpackage.or0;
import defpackage.ov0;
import defpackage.pi4;
import defpackage.q62;
import defpackage.q73;
import defpackage.tm0;
import defpackage.v72;
import defpackage.wh4;
import java.util.ArrayList;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final q62 c() throws Throwable {
        q73 q73Var;
        ir3 ir3Var;
        bi4 bi4Var;
        mi4 mi4Var;
        wh4 wh4VarA = wh4.a(this.a);
        WorkDatabase workDatabase = wh4VarA.c;
        workDatabase.getClass();
        ji4 ji4VarU = workDatabase.u();
        bi4 bi4VarS = workDatabase.s();
        mi4 mi4VarV = workDatabase.v();
        ir3 ir3VarQ = workDatabase.q();
        wh4VarA.b.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        ji4VarU.getClass();
        q73 q73VarA = q73.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        q73VarA.s(jCurrentTimeMillis, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ji4VarU.a;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(q73VarA);
        try {
            int iF = kr1.F(cursorM, "id");
            int iF2 = kr1.F(cursorM, "state");
            int iF3 = kr1.F(cursorM, "worker_class_name");
            int iF4 = kr1.F(cursorM, "input_merger_class_name");
            int iF5 = kr1.F(cursorM, "input");
            int iF6 = kr1.F(cursorM, "output");
            int iF7 = kr1.F(cursorM, "initial_delay");
            int iF8 = kr1.F(cursorM, "interval_duration");
            int iF9 = kr1.F(cursorM, "flex_duration");
            int iF10 = kr1.F(cursorM, "run_attempt_count");
            int iF11 = kr1.F(cursorM, "backoff_policy");
            q73Var = q73VarA;
            try {
                int iF12 = kr1.F(cursorM, "backoff_delay_duration");
                int iF13 = kr1.F(cursorM, "last_enqueue_time");
                int iF14 = kr1.F(cursorM, "minimum_retention_duration");
                int iF15 = kr1.F(cursorM, "schedule_requested_at");
                int iF16 = kr1.F(cursorM, "run_in_foreground");
                int iF17 = kr1.F(cursorM, "out_of_quota_policy");
                int iF18 = kr1.F(cursorM, "period_count");
                int iF19 = kr1.F(cursorM, "generation");
                int iF20 = kr1.F(cursorM, "next_schedule_time_override");
                int iF21 = kr1.F(cursorM, "next_schedule_time_override_generation");
                int iF22 = kr1.F(cursorM, "stop_reason");
                int iF23 = kr1.F(cursorM, "trace_tag");
                int iF24 = kr1.F(cursorM, "required_network_type");
                int iF25 = kr1.F(cursorM, "required_network_request");
                int iF26 = kr1.F(cursorM, "requires_charging");
                int iF27 = kr1.F(cursorM, "requires_device_idle");
                int iF28 = kr1.F(cursorM, "requires_battery_not_low");
                int iF29 = kr1.F(cursorM, "requires_storage_not_low");
                int iF30 = kr1.F(cursorM, "trigger_content_update_delay");
                int iF31 = kr1.F(cursorM, "trigger_max_content_delay");
                int iF32 = kr1.F(cursorM, "content_uri_triggers");
                int i = iF14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    String string = cursorM.getString(iF);
                    int iE = pi4.e(cursorM.getInt(iF2));
                    String string2 = cursorM.getString(iF3);
                    String string3 = cursorM.getString(iF4);
                    byte[] blob = cursorM.getBlob(iF5);
                    or0 or0Var = or0.b;
                    or0 or0VarFromByteArray = Options$Companion.fromByteArray(blob);
                    or0 or0VarFromByteArray2 = Options$Companion.fromByteArray(cursorM.getBlob(iF6));
                    long j = cursorM.getLong(iF7);
                    long j2 = cursorM.getLong(iF8);
                    long j3 = cursorM.getLong(iF9);
                    int i2 = cursorM.getInt(iF10);
                    int iB = pi4.b(cursorM.getInt(iF11));
                    long j4 = cursorM.getLong(iF12);
                    long j5 = cursorM.getLong(iF13);
                    int i3 = i;
                    long j6 = cursorM.getLong(i3);
                    int i4 = iF10;
                    int i5 = iF15;
                    long j7 = cursorM.getLong(i5);
                    iF15 = i5;
                    int i6 = iF16;
                    boolean z = cursorM.getInt(i6) != 0;
                    iF16 = i6;
                    int i7 = iF17;
                    int iD = pi4.d(cursorM.getInt(i7));
                    iF17 = i7;
                    int i8 = iF18;
                    int i9 = cursorM.getInt(i8);
                    iF18 = i8;
                    int i10 = iF19;
                    int i11 = cursorM.getInt(i10);
                    iF19 = i10;
                    int i12 = iF20;
                    long j8 = cursorM.getLong(i12);
                    iF20 = i12;
                    int i13 = iF21;
                    int i14 = cursorM.getInt(i13);
                    iF21 = i13;
                    int i15 = iF22;
                    int i16 = cursorM.getInt(i15);
                    iF22 = i15;
                    int i17 = iF23;
                    String string4 = cursorM.isNull(i17) ? null : cursorM.getString(i17);
                    iF23 = i17;
                    int i18 = iF24;
                    int iC = pi4.c(cursorM.getInt(i18));
                    iF24 = i18;
                    int i19 = iF25;
                    dl2 dl2VarG = pi4.g(cursorM.getBlob(i19));
                    iF25 = i19;
                    int i20 = iF26;
                    boolean z2 = cursorM.getInt(i20) != 0;
                    iF26 = i20;
                    int i21 = iF27;
                    boolean z3 = cursorM.getInt(i21) != 0;
                    iF27 = i21;
                    int i22 = iF28;
                    boolean z4 = cursorM.getInt(i22) != 0;
                    iF28 = i22;
                    int i23 = iF29;
                    boolean z5 = cursorM.getInt(i23) != 0;
                    iF29 = i23;
                    int i24 = iF30;
                    long j9 = cursorM.getLong(i24);
                    iF30 = i24;
                    int i25 = iF31;
                    long j10 = cursorM.getLong(i25);
                    iF31 = i25;
                    int i26 = iF32;
                    iF32 = i26;
                    arrayList.add(new hi4(string, iE, string2, string3, or0VarFromByteArray, or0VarFromByteArray2, j, j2, j3, new tm0(dl2VarG, iC, z2, z3, z4, z5, j9, j10, pi4.a(cursorM.getBlob(i26))), i2, iB, j4, j5, j6, j7, z, iD, i9, i11, j8, i14, i16, string4));
                    iF10 = i4;
                    i = i3;
                }
                cursorM.close();
                q73Var.l();
                ArrayList arrayListI = ji4VarU.i();
                ArrayList arrayListE = ji4VarU.e();
                if (arrayList.isEmpty()) {
                    ir3Var = ir3VarQ;
                    bi4Var = bi4VarS;
                    mi4Var = mi4VarV;
                } else {
                    v72 v72VarF = v72.f();
                    String str = ov0.a;
                    v72VarF.g(str, "Recently completed work:\n\n");
                    ir3Var = ir3VarQ;
                    bi4Var = bi4VarS;
                    mi4Var = mi4VarV;
                    v72.f().g(str, ov0.a(bi4Var, mi4Var, ir3Var, arrayList));
                }
                if (!arrayListI.isEmpty()) {
                    v72 v72VarF2 = v72.f();
                    String str2 = ov0.a;
                    v72VarF2.g(str2, "Running work:\n\n");
                    v72.f().g(str2, ov0.a(bi4Var, mi4Var, ir3Var, arrayListI));
                }
                if (!arrayListE.isEmpty()) {
                    v72 v72VarF3 = v72.f();
                    String str3 = ov0.a;
                    v72VarF3.g(str3, "Enqueued work:\n\n");
                    v72.f().g(str3, ov0.a(bi4Var, mi4Var, ir3Var, arrayListE));
                }
                return new q62();
            } catch (Throwable th) {
                th = th;
                cursorM.close();
                q73Var.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            q73Var = q73VarA;
        }
    }
}
