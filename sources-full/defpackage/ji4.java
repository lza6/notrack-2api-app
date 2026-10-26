package defpackage;

import android.database.Cursor;
import androidx.compose.material3.internal.a;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ji4 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public ji4(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        int i = 5;
        this.b = new av0(workDatabase_Impl, i);
        new hr3(workDatabase_Impl, 12);
        this.c = new hr3(workDatabase_Impl, 13);
        this.d = new hr3(workDatabase_Impl, 14);
        this.e = new hr3(workDatabase_Impl, 15);
        this.f = new hr3(workDatabase_Impl, 16);
        this.g = new hr3(workDatabase_Impl, 17);
        this.h = new hr3(workDatabase_Impl, 18);
        this.i = new hr3(workDatabase_Impl, 19);
        this.j = new hr3(workDatabase_Impl, 4);
        new hr3(workDatabase_Impl, i);
        this.k = new hr3(workDatabase_Impl, 6);
        this.l = new hr3(workDatabase_Impl, 7);
        this.m = new hr3(workDatabase_Impl, 8);
        new hr3(workDatabase_Impl, 9);
        new hr3(workDatabase_Impl, 10);
        this.n = new hr3(workDatabase_Impl, 11);
    }

    public ji4(Enum r1, le1 le1Var, je1 je1Var, wf wfVar, le1 le1Var2) {
        this.a = le1Var;
        this.b = je1Var;
        this.c = wfVar;
        this.d = le1Var2;
        this.e = new br1();
        this.f = new b9(this);
        this.g = cl3.d(r1);
        this.h = cl3.b(new u8(this, 4));
        this.i = cl3.b(new u8(this, 2));
        this.j = new bt2(Float.NaN);
        cl3.c(new u8(this, 3), t73.A);
        this.k = new bt2(0.0f);
        this.l = cl3.d(null);
        this.m = cl3.d(new r92(a31.c));
        this.n = new y8(this);
    }

    public static void z(ji4 ji4Var, r92 r92Var) {
        Object value;
        bt2 bt2Var = (bt2) ji4Var.j;
        fv0 fv0Var = (fv0) ji4Var.h;
        if (Float.isNaN(bt2Var.f()) || (value = r92Var.a(((bt2) ji4Var.j).f())) == null) {
            value = fv0Var.getValue();
        }
        ji4Var.y(r92Var, value);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(ri2 ri2Var, z8 z8Var, uo0 uo0Var) throws Throwable {
        t8 t8Var;
        if (uo0Var instanceof t8) {
            t8Var = (t8) uo0Var;
            int i = t8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                t8Var.l = i - Integer.MIN_VALUE;
            } else {
                t8Var = new t8(this, uo0Var);
            }
        } else {
            t8Var = new t8(this, uo0Var);
        }
        Object obj = t8Var.d;
        int i2 = t8Var.l;
        try {
            if (i2 == 0) {
                g13.O(obj);
                br1 br1Var = (br1) this.e;
                v8 v8Var = new v8(this, z8Var, null);
                t8Var.c = this;
                t8Var.l = 1;
                br1Var.getClass();
                Object objQ = yo4.q(new v31(ri2Var, br1Var, v8Var, null), t8Var);
                hq0 hq0Var = hq0.c;
                if (objQ == hq0Var) {
                    return hq0Var;
                }
            } else {
                if (i2 != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = t8Var.c;
                g13.O(obj);
            }
            r92 r92VarF = this.f();
            bt2 bt2Var = (bt2) this.j;
            Object objA = r92VarF.a(bt2Var.f());
            if (objA != null && Math.abs(bt2Var.f() - this.f().d(objA)) <= 0.5f && ((Boolean) ((le1) this.d).invoke(objA)).booleanValue()) {
                this.r(objA);
            }
            return w84.a;
        } catch (Throwable th) {
            r92 r92VarF2 = this.f();
            bt2 bt2Var2 = (bt2) this.j;
            Object objA2 = r92VarF2.a(bt2Var2.f());
            if (objA2 != null && Math.abs(bt2Var2.f() - this.f().d(objA2)) <= 0.5f && ((Boolean) ((le1) this.d).invoke(objA2)).booleanValue()) {
                this.r(objA2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(Object obj, ri2 ri2Var, pe1 pe1Var, so0 so0Var) throws Throwable {
        w8 w8Var;
        if (so0Var instanceof w8) {
            w8Var = (w8) so0Var;
            int i = w8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                w8Var.l = i - Integer.MIN_VALUE;
            } else {
                w8Var = new w8(this, so0Var);
            }
        } else {
            w8Var = new w8(this, so0Var);
        }
        Object obj2 = w8Var.d;
        int i2 = w8Var.l;
        try {
            if (i2 == 0) {
                g13.O(obj2);
                if (f().a.containsKey(obj)) {
                    br1 br1Var = (br1) this.e;
                    x8 x8Var = new x8(this, obj, pe1Var, null);
                    w8Var.c = this;
                    w8Var.l = 1;
                    br1Var.getClass();
                    Object objQ = yo4.q(new v31(ri2Var, br1Var, x8Var, null), w8Var);
                    hq0 hq0Var = hq0.c;
                    if (objQ == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    r(obj);
                }
                return w84.a;
            }
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = w8Var.c;
            g13.O(obj2);
            this.s(null);
            bt2 bt2Var = (bt2) this.j;
            Object objA = this.f().a(bt2Var.f());
            if (objA != null && Math.abs(bt2Var.f() - this.f().d(objA)) <= 0.5f && ((Boolean) ((le1) this.d).invoke(objA)).booleanValue()) {
                this.r(objA);
            }
            return w84.a;
        } catch (Throwable th) {
            this.s(null);
            bt2 bt2Var2 = (bt2) this.j;
            Object objA2 = this.f().a(bt2Var2.f());
            if (objA2 != null && Math.abs(bt2Var2.f() - this.f().d(objA2)) <= 0.5f && ((Boolean) ((le1) this.d).invoke(objA2)).booleanValue()) {
                this.r(objA2);
            }
            throw th;
        }
    }

    public Object c(float f, float f2, Object obj) {
        le1 le1Var = (le1) this.a;
        r92 r92VarF = f();
        float fD = r92VarF.d(obj);
        float fFloatValue = ((Number) ((je1) this.b).invoke()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objB = r92VarF.b(f, true);
                    objB.getClass();
                    return objB;
                }
                Object objB2 = r92VarF.b(f, true);
                objB2.getClass();
                if (f >= Math.abs(Math.abs(((Number) le1Var.invoke(Float.valueOf(Math.abs(r92VarF.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objB3 = r92VarF.b(f, false);
                    objB3.getClass();
                    return objB3;
                }
                Object objB4 = r92VarF.b(f, false);
                objB4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) le1Var.invoke(Float.valueOf(Math.abs(fD - r92VarF.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public void d(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        hr3 hr3Var = (hr3) this.c;
        he1 he1VarA = hr3Var.a();
        he1VarA.i(1, str);
        try {
            workDatabase_Impl.c();
            try {
                he1VarA.a();
                workDatabase_Impl.p();
                workDatabase_Impl.k();
                hr3Var.j(he1VarA);
            } catch (Throwable th) {
                workDatabase_Impl.k();
                throw th;
            }
        } catch (Throwable th2) {
            hr3Var.j(he1VarA);
            throw th2;
        }
    }

    public ArrayList e() throws Throwable {
        q73 q73Var;
        q73 q73VarA = q73.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        q73VarA.s(200L, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iF12 = kr1.F(cursorM, "backoff_delay_duration");
            int iF13 = kr1.F(cursorM, "last_enqueue_time");
            int iF14 = kr1.F(cursorM, "minimum_retention_duration");
            q73Var = q73VarA;
            try {
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
                    i = i3;
                    int i4 = iF15;
                    long j7 = cursorM.getLong(i4);
                    iF15 = i4;
                    int i5 = iF16;
                    boolean z = cursorM.getInt(i5) != 0;
                    iF16 = i5;
                    int i6 = iF17;
                    int iD = pi4.d(cursorM.getInt(i6));
                    iF17 = i6;
                    int i7 = iF18;
                    int i8 = cursorM.getInt(i7);
                    iF18 = i7;
                    int i9 = iF19;
                    int i10 = cursorM.getInt(i9);
                    iF19 = i9;
                    int i11 = iF20;
                    long j8 = cursorM.getLong(i11);
                    iF20 = i11;
                    int i12 = iF21;
                    int i13 = cursorM.getInt(i12);
                    iF21 = i12;
                    int i14 = iF22;
                    int i15 = cursorM.getInt(i14);
                    iF22 = i14;
                    int i16 = iF23;
                    String string4 = cursorM.isNull(i16) ? null : cursorM.getString(i16);
                    iF23 = i16;
                    int i17 = iF24;
                    int iC = pi4.c(cursorM.getInt(i17));
                    iF24 = i17;
                    int i18 = iF25;
                    dl2 dl2VarG = pi4.g(cursorM.getBlob(i18));
                    iF25 = i18;
                    int i19 = iF26;
                    boolean z2 = cursorM.getInt(i19) != 0;
                    iF26 = i19;
                    int i20 = iF27;
                    boolean z3 = cursorM.getInt(i20) != 0;
                    iF27 = i20;
                    int i21 = iF28;
                    boolean z4 = cursorM.getInt(i21) != 0;
                    iF28 = i21;
                    int i22 = iF29;
                    boolean z5 = cursorM.getInt(i22) != 0;
                    iF29 = i22;
                    int i23 = iF30;
                    long j9 = cursorM.getLong(i23);
                    iF30 = i23;
                    int i24 = iF31;
                    long j10 = cursorM.getLong(i24);
                    iF31 = i24;
                    int i25 = iF32;
                    iF32 = i25;
                    arrayList.add(new hi4(string, iE, string2, string3, or0VarFromByteArray, or0VarFromByteArray2, j, j2, j3, new tm0(dl2VarG, iC, z2, z3, z4, z5, j9, j10, pi4.a(cursorM.getBlob(i25))), i2, iB, j4, j5, j6, j7, z, iD, i8, i10, j8, i13, i15, string4));
                }
                cursorM.close();
                q73Var.l();
                return arrayList;
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

    public r92 f() {
        return (r92) ((ft2) this.m).getValue();
    }

    public ArrayList g(int i) throws Throwable {
        q73 q73Var;
        q73 q73VarA = q73.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        q73VarA.s(i, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iF12 = kr1.F(cursorM, "backoff_delay_duration");
            int iF13 = kr1.F(cursorM, "last_enqueue_time");
            int iF14 = kr1.F(cursorM, "minimum_retention_duration");
            q73Var = q73VarA;
            try {
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
                int i2 = iF14;
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
                    int i3 = cursorM.getInt(iF10);
                    int iB = pi4.b(cursorM.getInt(iF11));
                    long j4 = cursorM.getLong(iF12);
                    long j5 = cursorM.getLong(iF13);
                    int i4 = i2;
                    long j6 = cursorM.getLong(i4);
                    i2 = i4;
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
                    arrayList.add(new hi4(string, iE, string2, string3, or0VarFromByteArray, or0VarFromByteArray2, j, j2, j3, new tm0(dl2VarG, iC, z2, z3, z4, z5, j9, j10, pi4.a(cursorM.getBlob(i26))), i3, iB, j4, j5, j6, j7, z, iD, i9, i11, j8, i14, i16, string4));
                }
                cursorM.close();
                q73Var.l();
                return arrayList;
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

    public ArrayList h() throws Throwable {
        q73 q73Var;
        q73 q73VarA = q73.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iF12 = kr1.F(cursorM, "backoff_delay_duration");
            int iF13 = kr1.F(cursorM, "last_enqueue_time");
            int iF14 = kr1.F(cursorM, "minimum_retention_duration");
            q73Var = q73VarA;
            try {
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
                    i = i3;
                    int i4 = iF15;
                    long j7 = cursorM.getLong(i4);
                    iF15 = i4;
                    int i5 = iF16;
                    boolean z = cursorM.getInt(i5) != 0;
                    iF16 = i5;
                    int i6 = iF17;
                    int iD = pi4.d(cursorM.getInt(i6));
                    iF17 = i6;
                    int i7 = iF18;
                    int i8 = cursorM.getInt(i7);
                    iF18 = i7;
                    int i9 = iF19;
                    int i10 = cursorM.getInt(i9);
                    iF19 = i9;
                    int i11 = iF20;
                    long j8 = cursorM.getLong(i11);
                    iF20 = i11;
                    int i12 = iF21;
                    int i13 = cursorM.getInt(i12);
                    iF21 = i12;
                    int i14 = iF22;
                    int i15 = cursorM.getInt(i14);
                    iF22 = i14;
                    int i16 = iF23;
                    String string4 = cursorM.isNull(i16) ? null : cursorM.getString(i16);
                    iF23 = i16;
                    int i17 = iF24;
                    int iC = pi4.c(cursorM.getInt(i17));
                    iF24 = i17;
                    int i18 = iF25;
                    dl2 dl2VarG = pi4.g(cursorM.getBlob(i18));
                    iF25 = i18;
                    int i19 = iF26;
                    boolean z2 = cursorM.getInt(i19) != 0;
                    iF26 = i19;
                    int i20 = iF27;
                    boolean z3 = cursorM.getInt(i20) != 0;
                    iF27 = i20;
                    int i21 = iF28;
                    boolean z4 = cursorM.getInt(i21) != 0;
                    iF28 = i21;
                    int i22 = iF29;
                    boolean z5 = cursorM.getInt(i22) != 0;
                    iF29 = i22;
                    int i23 = iF30;
                    long j9 = cursorM.getLong(i23);
                    iF30 = i23;
                    int i24 = iF31;
                    long j10 = cursorM.getLong(i24);
                    iF31 = i24;
                    int i25 = iF32;
                    iF32 = i25;
                    arrayList.add(new hi4(string, iE, string2, string3, or0VarFromByteArray, or0VarFromByteArray2, j, j2, j3, new tm0(dl2VarG, iC, z2, z3, z4, z5, j9, j10, pi4.a(cursorM.getBlob(i25))), i2, iB, j4, j5, j6, j7, z, iD, i8, i10, j8, i13, i15, string4));
                }
                cursorM.close();
                q73Var.l();
                return arrayList;
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

    public ArrayList i() throws Throwable {
        q73 q73Var;
        q73 q73VarA = q73.a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iF12 = kr1.F(cursorM, "backoff_delay_duration");
            int iF13 = kr1.F(cursorM, "last_enqueue_time");
            int iF14 = kr1.F(cursorM, "minimum_retention_duration");
            q73Var = q73VarA;
            try {
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
                    i = i3;
                    int i4 = iF15;
                    long j7 = cursorM.getLong(i4);
                    iF15 = i4;
                    int i5 = iF16;
                    boolean z = cursorM.getInt(i5) != 0;
                    iF16 = i5;
                    int i6 = iF17;
                    int iD = pi4.d(cursorM.getInt(i6));
                    iF17 = i6;
                    int i7 = iF18;
                    int i8 = cursorM.getInt(i7);
                    iF18 = i7;
                    int i9 = iF19;
                    int i10 = cursorM.getInt(i9);
                    iF19 = i9;
                    int i11 = iF20;
                    long j8 = cursorM.getLong(i11);
                    iF20 = i11;
                    int i12 = iF21;
                    int i13 = cursorM.getInt(i12);
                    iF21 = i12;
                    int i14 = iF22;
                    int i15 = cursorM.getInt(i14);
                    iF22 = i14;
                    int i16 = iF23;
                    String string4 = cursorM.isNull(i16) ? null : cursorM.getString(i16);
                    iF23 = i16;
                    int i17 = iF24;
                    int iC = pi4.c(cursorM.getInt(i17));
                    iF24 = i17;
                    int i18 = iF25;
                    dl2 dl2VarG = pi4.g(cursorM.getBlob(i18));
                    iF25 = i18;
                    int i19 = iF26;
                    boolean z2 = cursorM.getInt(i19) != 0;
                    iF26 = i19;
                    int i20 = iF27;
                    boolean z3 = cursorM.getInt(i20) != 0;
                    iF27 = i20;
                    int i21 = iF28;
                    boolean z4 = cursorM.getInt(i21) != 0;
                    iF28 = i21;
                    int i22 = iF29;
                    boolean z5 = cursorM.getInt(i22) != 0;
                    iF29 = i22;
                    int i23 = iF30;
                    long j9 = cursorM.getLong(i23);
                    iF30 = i23;
                    int i24 = iF31;
                    long j10 = cursorM.getLong(i24);
                    iF31 = i24;
                    int i25 = iF32;
                    iF32 = i25;
                    arrayList.add(new hi4(string, iE, string2, string3, or0VarFromByteArray, or0VarFromByteArray2, j, j2, j3, new tm0(dl2VarG, iC, z2, z3, z4, z5, j9, j10, pi4.a(cursorM.getBlob(i25))), i2, iB, j4, j5, j6, j7, z, iD, i8, i10, j8, i13, i15, string4));
                }
                cursorM.close();
                q73Var.l();
                return arrayList;
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

    public ArrayList j() {
        q73 q73Var;
        q73 q73VarA = q73.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iF12 = kr1.F(cursorM, "backoff_delay_duration");
            int iF13 = kr1.F(cursorM, "last_enqueue_time");
            int iF14 = kr1.F(cursorM, "minimum_retention_duration");
            q73Var = q73VarA;
            try {
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
                    i = i3;
                    int i4 = iF15;
                    long j7 = cursorM.getLong(i4);
                    iF15 = i4;
                    int i5 = iF16;
                    boolean z = cursorM.getInt(i5) != 0;
                    iF16 = i5;
                    int i6 = iF17;
                    int iD = pi4.d(cursorM.getInt(i6));
                    iF17 = i6;
                    int i7 = iF18;
                    int i8 = cursorM.getInt(i7);
                    iF18 = i7;
                    int i9 = iF19;
                    int i10 = cursorM.getInt(i9);
                    iF19 = i9;
                    int i11 = iF20;
                    long j8 = cursorM.getLong(i11);
                    iF20 = i11;
                    int i12 = iF21;
                    int i13 = cursorM.getInt(i12);
                    iF21 = i12;
                    int i14 = iF22;
                    int i15 = cursorM.getInt(i14);
                    iF22 = i14;
                    int i16 = iF23;
                    String string4 = cursorM.isNull(i16) ? null : cursorM.getString(i16);
                    iF23 = i16;
                    int i17 = iF24;
                    int iC = pi4.c(cursorM.getInt(i17));
                    iF24 = i17;
                    int i18 = iF25;
                    dl2 dl2VarG = pi4.g(cursorM.getBlob(i18));
                    iF25 = i18;
                    int i19 = iF26;
                    boolean z2 = cursorM.getInt(i19) != 0;
                    iF26 = i19;
                    int i20 = iF27;
                    boolean z3 = cursorM.getInt(i20) != 0;
                    iF27 = i20;
                    int i21 = iF28;
                    boolean z4 = cursorM.getInt(i21) != 0;
                    iF28 = i21;
                    int i22 = iF29;
                    boolean z5 = cursorM.getInt(i22) != 0;
                    iF29 = i22;
                    int i23 = iF30;
                    long j9 = cursorM.getLong(i23);
                    iF30 = i23;
                    int i24 = iF31;
                    long j10 = cursorM.getLong(i24);
                    iF31 = i24;
                    int i25 = iF32;
                    iF32 = i25;
                    arrayList.add(new hi4(string, iE, string2, string3, or0VarFromByteArray, or0VarFromByteArray2, j, j2, j3, new tm0(dl2VarG, iC, z2, z3, z4, z5, j9, j10, pi4.a(cursorM.getBlob(i25))), i2, iB, j4, j5, j6, j7, z, iD, i8, i10, j8, i13, i15, string4));
                }
                cursorM.close();
                q73Var.l();
                return arrayList;
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

    public int k(String str) {
        q73 q73VarA = q73.a(1, "SELECT state FROM workspec WHERE id=?");
        q73VarA.i(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(q73VarA);
        try {
            int iE = 0;
            if (cursorM.moveToFirst()) {
                Integer numValueOf = cursorM.isNull(0) ? null : Integer.valueOf(cursorM.getInt(0));
                if (numValueOf != null) {
                    iE = pi4.e(numValueOf.intValue());
                }
            }
            return iE;
        } finally {
            cursorM.close();
            q73VarA.l();
        }
    }

    public hi4 l(String str) throws Throwable {
        q73 q73Var;
        q73 q73VarA = q73.a(1, "SELECT * FROM workspec WHERE id=?");
        q73VarA.i(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iF12 = kr1.F(cursorM, "backoff_delay_duration");
            int iF13 = kr1.F(cursorM, "last_enqueue_time");
            int iF14 = kr1.F(cursorM, "minimum_retention_duration");
            q73Var = q73VarA;
            try {
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
                hi4 hi4Var = null;
                if (cursorM.moveToFirst()) {
                    String string = cursorM.getString(iF);
                    int iE = pi4.e(cursorM.getInt(iF2));
                    String string2 = cursorM.getString(iF3);
                    String string3 = cursorM.getString(iF4);
                    byte[] blob = cursorM.getBlob(iF5);
                    or0 or0Var = or0.b;
                    hi4Var = new hi4(string, iE, string2, string3, Options$Companion.fromByteArray(blob), Options$Companion.fromByteArray(cursorM.getBlob(iF6)), cursorM.getLong(iF7), cursorM.getLong(iF8), cursorM.getLong(iF9), new tm0(pi4.g(cursorM.getBlob(iF25)), pi4.c(cursorM.getInt(iF24)), cursorM.getInt(iF26) != 0, cursorM.getInt(iF27) != 0, cursorM.getInt(iF28) != 0, cursorM.getInt(iF29) != 0, cursorM.getLong(iF30), cursorM.getLong(iF31), pi4.a(cursorM.getBlob(iF32))), cursorM.getInt(iF10), pi4.b(cursorM.getInt(iF11)), cursorM.getLong(iF12), cursorM.getLong(iF13), cursorM.getLong(iF14), cursorM.getLong(iF15), cursorM.getInt(iF16) != 0, pi4.d(cursorM.getInt(iF17)), cursorM.getInt(iF18), cursorM.getInt(iF19), cursorM.getLong(iF20), cursorM.getInt(iF21), cursorM.getInt(iF22), cursorM.isNull(iF23) ? null : cursorM.getString(iF23));
                }
                cursorM.close();
                q73Var.l();
                return hi4Var;
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

    public ArrayList m(String str) {
        q73 q73VarA = q73.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        q73VarA.i(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(q73VarA);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                String string = cursorM.getString(0);
                int iE = pi4.e(cursorM.getInt(1));
                string.getClass();
                gi4 gi4Var = new gi4();
                gi4Var.a = string;
                gi4Var.b = iE;
                arrayList.add(gi4Var);
            }
            cursorM.close();
            q73VarA.l();
            return arrayList;
        } catch (Throwable th) {
            cursorM.close();
            q73VarA.l();
            throw th;
        }
    }

    public void n(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        hr3 hr3Var = (hr3) this.l;
        he1 he1VarA = hr3Var.a();
        he1VarA.s(j, 1);
        he1VarA.i(2, str);
        try {
            workDatabase_Impl.c();
            try {
                he1VarA.a();
                workDatabase_Impl.p();
                workDatabase_Impl.k();
                hr3Var.j(he1VarA);
            } catch (Throwable th) {
                workDatabase_Impl.k();
                throw th;
            }
        } catch (Throwable th2) {
            hr3Var.j(he1VarA);
            throw th2;
        }
    }

    public float o(float f) {
        Float fValueOf;
        bt2 bt2Var = (bt2) this.j;
        float f2 = (Float.isNaN(bt2Var.f()) ? 0.0f : bt2Var.f()) + f;
        float fC = f().c();
        Collection collectionValues = f().a.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return py.w(f2, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public float p() {
        bt2 bt2Var = (bt2) this.j;
        if (!Float.isNaN(bt2Var.f())) {
            return bt2Var.f();
        }
        u41.r("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public void q(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        hr3 hr3Var = (hr3) this.k;
        he1 he1VarA = hr3Var.a();
        he1VarA.i(1, str);
        he1VarA.s(i, 2);
        try {
            workDatabase_Impl.c();
            try {
                he1VarA.a();
                workDatabase_Impl.p();
                workDatabase_Impl.k();
                hr3Var.j(he1VarA);
            } catch (Throwable th) {
                workDatabase_Impl.k();
                throw th;
            }
        } catch (Throwable th2) {
            hr3Var.j(he1VarA);
            throw th2;
        }
    }

    public void r(Object obj) {
        ((ft2) this.g).setValue(obj);
    }

    public void s(Object obj) {
        ((ft2) this.l).setValue(obj);
    }

    public void t(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        hr3 hr3Var = (hr3) this.h;
        he1 he1VarA = hr3Var.a();
        he1VarA.s(j, 1);
        he1VarA.i(2, str);
        try {
            workDatabase_Impl.c();
            try {
                he1VarA.a();
                workDatabase_Impl.p();
                workDatabase_Impl.k();
                hr3Var.j(he1VarA);
            } catch (Throwable th) {
                workDatabase_Impl.k();
                throw th;
            }
        } catch (Throwable th2) {
            hr3Var.j(he1VarA);
            throw th2;
        }
    }

    public void u(String str, or0 or0Var) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        hr3 hr3Var = (hr3) this.g;
        he1 he1VarA = hr3Var.a();
        or0 or0Var2 = or0.b;
        he1VarA.C(1, Options$Companion.toByteArrayInternalV1(or0Var));
        he1VarA.i(2, str);
        try {
            workDatabase_Impl.c();
            try {
                he1VarA.a();
                workDatabase_Impl.p();
                workDatabase_Impl.k();
                hr3Var.j(he1VarA);
            } catch (Throwable th) {
                workDatabase_Impl.k();
                throw th;
            }
        } catch (Throwable th2) {
            hr3Var.j(he1VarA);
            throw th2;
        }
    }

    public void v(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        hr3 hr3Var = (hr3) this.d;
        he1 he1VarA = hr3Var.a();
        he1VarA.s(pi4.f(i), 1);
        he1VarA.i(2, str);
        try {
            workDatabase_Impl.c();
            try {
                he1VarA.a();
                workDatabase_Impl.p();
                workDatabase_Impl.k();
                hr3Var.j(he1VarA);
            } catch (Throwable th) {
                workDatabase_Impl.k();
                throw th;
            }
        } catch (Throwable th2) {
            hr3Var.j(he1VarA);
            throw th2;
        }
    }

    public void w(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        hr3 hr3Var = (hr3) this.n;
        he1 he1VarA = hr3Var.a();
        he1VarA.s(i, 1);
        he1VarA.i(2, str);
        try {
            workDatabase_Impl.c();
            try {
                he1VarA.a();
                workDatabase_Impl.p();
                workDatabase_Impl.k();
                hr3Var.j(he1VarA);
            } catch (Throwable th) {
                workDatabase_Impl.k();
                throw th;
            }
        } catch (Throwable th2) {
            hr3Var.j(he1VarA);
            throw th2;
        }
    }

    public Object x(float f, mq3 mq3Var) {
        Object value = ((ft2) this.g).getValue();
        Object objC = c(p(), f, value);
        boolean zBooleanValue = ((Boolean) ((le1) this.d).invoke(objC)).booleanValue();
        hq0 hq0Var = hq0.c;
        if (zBooleanValue) {
            Object objC2 = a.c(this, objC, f, mq3Var);
            if (objC2 == hq0Var) {
                return objC2;
            }
        } else {
            Object objC3 = a.c(this, value, f, mq3Var);
            if (objC3 == hq0Var) {
                return objC3;
            }
        }
        return w84.a;
    }

    public void y(r92 r92Var, Object obj) {
        if (kr1.n(f(), r92Var)) {
            return;
        }
        ((ft2) this.m).setValue(r92Var);
        br1 br1Var = (br1) this.e;
        c9 c9Var = new c9(this, 0, obj);
        zi2 zi2Var = br1Var.b;
        boolean zG = zi2Var.g();
        if (zG) {
            try {
                c9Var.invoke();
                zi2Var.i(null);
            } catch (Throwable th) {
                zi2Var.i(null);
                throw th;
            }
        }
        if (zG) {
            return;
        }
        s(obj);
    }
}
