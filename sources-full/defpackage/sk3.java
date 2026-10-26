package defpackage;

import android.R;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import app.template.extension.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class sk3 implements yk, cg2, rg3, ac4, ql4 {
    public final /* synthetic */ int c;
    public Object d;

    public sk3(float f, float f2) {
        this.c = 13;
        this.d = new i81(f, f2, 0.01f);
    }

    public sk3(float f, float f2, cg cgVar) {
        this.c = 15;
        int[] iArr = yb4.a;
        this.d = new ir3(cgVar != null ? new sk3(cgVar, f, f2) : new sk3(f, f2));
    }

    public /* synthetic */ sk3(int i) {
        this.c = i;
    }

    public /* synthetic */ sk3(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public sk3(View view) {
        this.c = 2;
        if (Build.VERSION.SDK_INT < 30) {
            this.d = new sk3(1, view);
            return;
        }
        ul3 ul3Var = new ul3(1, view);
        ul3Var.h = view;
        this.d = ul3Var;
    }

    public sk3(bk bkVar) {
        this.c = 22;
        this.d = bkVar;
        bkVar.d = this;
    }

    public sk3(cg cgVar, float f, float f2) {
        this.c = 12;
        int iB = cgVar.b();
        i81[] i81VarArr = new i81[iB];
        for (int i = 0; i < iB; i++) {
            i81VarArr[i] = new i81(f, f2, cgVar.a(i));
        }
        this.d = i81VarArr;
    }

    public sk3(ia4 ia4Var) {
        this.c = 6;
        this.d = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ia4Var);
    }

    public sk3(wu0 wu0Var) {
        this.c = 3;
        this.d = new y71(rm3.a, wu0Var);
    }

    public sk3(long[] jArr) {
        kh2 kh2Var;
        this.c = 0;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            kh2Var = new kh2(jArrCopyOf.length);
            int i = kh2Var.b;
            if (i < 0) {
                m51.s(BuildConfig.VERSION_NAME);
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArr2 = kh2Var.a;
                if (jArr2.length < length) {
                    kh2Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = kh2Var.a;
                int i2 = kh2Var.b;
                if (i != i2) {
                    vl.l0(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                }
                vl.l0(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                kh2Var.b += jArrCopyOf.length;
            }
        } else {
            kh2Var = new kh2(16);
        }
        this.d = kh2Var;
    }

    public static void h(be1 be1Var) {
        SQLiteDatabase sQLiteDatabase = be1Var.c;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    public static p73 m(be1 be1Var) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new sr3(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new sr3(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new tr3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new tr3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new vr3("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new vr3("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        wr3 wr3Var = new wr3("Dependency", map, hashSet, hashSet2);
        wr3 wr3VarA = wr3.a(be1Var, "Dependency");
        if (!wr3Var.equals(wr3VarA)) {
            return new p73(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + wr3Var + "\n Found:\n" + wr3VarA);
        }
        HashMap map2 = new HashMap(32);
        map2.put("id", new sr3(1, 1, "id", "TEXT", null, true));
        map2.put("state", new sr3(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new sr3(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new sr3(0, 1, "input_merger_class_name", "TEXT", null, true));
        map2.put("input", new sr3(0, 1, "input", "BLOB", null, true));
        map2.put("output", new sr3(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new sr3(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new sr3(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new sr3(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new sr3(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new sr3(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new sr3(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("last_enqueue_time", new sr3(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        map2.put("minimum_retention_duration", new sr3(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new sr3(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new sr3(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new sr3(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("period_count", new sr3(0, 1, "period_count", "INTEGER", "0", true));
        map2.put("generation", new sr3(0, 1, "generation", "INTEGER", "0", true));
        map2.put("next_schedule_time_override", new sr3(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        map2.put("next_schedule_time_override_generation", new sr3(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        map2.put("stop_reason", new sr3(0, 1, "stop_reason", "INTEGER", "-256", true));
        map2.put("trace_tag", new sr3(0, 1, "trace_tag", "TEXT", null, false));
        map2.put("required_network_type", new sr3(0, 1, "required_network_type", "INTEGER", null, true));
        map2.put("required_network_request", new sr3(0, 1, "required_network_request", "BLOB", "x''", true));
        map2.put("requires_charging", new sr3(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new sr3(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new sr3(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new sr3(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new sr3(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new sr3(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new sr3(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new vr3("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new vr3("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        wr3 wr3Var2 = new wr3("WorkSpec", map2, hashSet3, hashSet4);
        wr3 wr3VarA2 = wr3.a(be1Var, "WorkSpec");
        if (!wr3Var2.equals(wr3VarA2)) {
            return new p73(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + wr3Var2 + "\n Found:\n" + wr3VarA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new sr3(1, 1, "tag", "TEXT", null, true));
        map3.put("work_spec_id", new sr3(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new tr3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new vr3("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        wr3 wr3Var3 = new wr3("WorkTag", map3, hashSet5, hashSet6);
        wr3 wr3VarA3 = wr3.a(be1Var, "WorkTag");
        if (!wr3Var3.equals(wr3VarA3)) {
            return new p73(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + wr3Var3 + "\n Found:\n" + wr3VarA3);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new sr3(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("generation", new sr3(2, 1, "generation", "INTEGER", "0", true));
        map4.put("system_id", new sr3(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new tr3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        wr3 wr3Var4 = new wr3("SystemIdInfo", map4, hashSet7, new HashSet(0));
        wr3 wr3VarA4 = wr3.a(be1Var, "SystemIdInfo");
        if (!wr3Var4.equals(wr3VarA4)) {
            return new p73(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + wr3Var4 + "\n Found:\n" + wr3VarA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new sr3(1, 1, "name", "TEXT", null, true));
        map5.put("work_spec_id", new sr3(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new tr3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new vr3("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        wr3 wr3Var5 = new wr3("WorkName", map5, hashSet8, hashSet9);
        wr3 wr3VarA5 = wr3.a(be1Var, "WorkName");
        if (!wr3Var5.equals(wr3VarA5)) {
            return new p73(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + wr3Var5 + "\n Found:\n" + wr3VarA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new sr3(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put("progress", new sr3(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new tr3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        wr3 wr3Var6 = new wr3("WorkProgress", map6, hashSet10, new HashSet(0));
        wr3 wr3VarA6 = wr3.a(be1Var, "WorkProgress");
        if (!wr3Var6.equals(wr3VarA6)) {
            return new p73(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + wr3Var6 + "\n Found:\n" + wr3VarA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new sr3(1, 1, "key", "TEXT", null, true));
        map7.put("long_value", new sr3(0, 1, "long_value", "INTEGER", null, false));
        wr3 wr3Var7 = new wr3("Preference", map7, new HashSet(0), new HashSet(0));
        wr3 wr3VarA7 = wr3.a(be1Var, "Preference");
        if (wr3Var7.equals(wr3VarA7)) {
            return new p73(true, (String) null);
        }
        return new p73(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + wr3Var7 + "\n Found:\n" + wr3VarA7);
    }

    @Override // defpackage.ac4, defpackage.xb4
    public boolean a() {
        ((ir3) this.d).getClass();
        return false;
    }

    @Override // defpackage.xb4
    public long b(cg cgVar, cg cgVar2, cg cgVar3) {
        return ((ir3) this.d).b(cgVar, cgVar2, cgVar3);
    }

    @Override // defpackage.yk
    public Object c(pb3 pb3Var, Float f, Float f2, le1 le1Var, gk3 gk3Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objC = lk3.c(pb3Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, av1.a(0.0f, fFloatValue2, 28), (tm3) this.d, le1Var, gk3Var);
        return objC == hq0.c ? objC : (tf) objC;
    }

    @Override // defpackage.cg2
    public void d() {
    }

    @Override // defpackage.cg2
    public boolean e(long j, gd3 gd3Var) {
        z22 z22Var;
        xw3 xw3Var = (xw3) this.d;
        if (!xw3Var.i() || xw3Var.k().a.d.length() == 0 || (z22Var = xw3Var.d) == null || z22Var.d() == null) {
            return false;
        }
        za1 za1Var = xw3Var.l;
        if (za1Var != null) {
            za1.b(za1Var);
        }
        xw3Var.o = j;
        xw3Var.t = -1;
        xw3Var.f(true);
        o(xw3Var.k(), xw3Var.o, true, gd3Var);
        return true;
    }

    @Override // defpackage.ql4
    public Object f() {
        return ((tu) this.d).a;
    }

    @Override // defpackage.cg2
    public boolean g(long j, gd3 gd3Var) {
        z22 z22Var;
        xw3 xw3Var = (xw3) this.d;
        if (!xw3Var.i() || xw3Var.k().a.d.length() == 0 || (z22Var = xw3Var.d) == null || z22Var.d() == null) {
            return false;
        }
        o(xw3Var.k(), j, false, gd3Var);
        return true;
    }

    public c81 i(int i) {
        switch (this.c) {
            case 12:
                return ((i81[]) this.d)[i];
            case 13:
                return (i81) this.d;
            default:
                return (c81) this.d;
        }
    }

    public void j() {
        View view = (View) this.d;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.rg3
    public rq2 l(long j, dx1 dx1Var, wu0 wu0Var) {
        return new oq2((ic) this.d);
    }

    public void n() {
        View viewFindViewById;
        View view = (View) this.d;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new m3(12, viewFindViewById));
    }

    public void o(ey3 ey3Var, long j, boolean z, gd3 gd3Var) {
        xw3 xw3Var = (xw3) this.d;
        xw3Var.o(jz3.c(xw3.a(xw3Var, ey3Var, j, z, false, gd3Var, false)) ? ch1.h : ch1.d);
    }

    public void p(int i, Object obj, jq4 jq4Var) {
        bk bkVar = (bk) this.d;
        ep4 ep4Var = (ep4) obj;
        bkVar.A(i, 2);
        bkVar.C(ep4Var.c(jq4Var));
        jq4Var.c(ep4Var, this);
    }

    @Override // defpackage.xb4
    public cg s(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        return ((ir3) this.d).s(j, cgVar, cgVar2, cgVar3);
    }

    @Override // defpackage.xb4
    public cg u(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        return ((ir3) this.d).u(j, cgVar, cgVar2, cgVar3);
    }

    @Override // defpackage.xb4
    public cg w(cg cgVar, cg cgVar2, cg cgVar3) {
        return ((ir3) this.d).w(cgVar, cgVar2, cgVar3);
    }
}
