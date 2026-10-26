package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class wr1 {
    public static final String[] n = {"UPDATE", "DELETE", "INSERT"};
    public final WorkDatabase_Impl a;
    public final HashMap b;
    public final HashMap c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public volatile boolean g;
    public volatile he1 h;
    public final hw0 i;
    public final x83 j;
    public final Object k;
    public final Object l;
    public final im m;

    public wr1(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.a = workDatabase_Impl;
        this.b = map;
        this.c = map2;
        this.i = new hw0(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.j = new x83();
        this.k = new Object();
        this.l = new Object();
        this.d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.d.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            locale2.getClass();
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap = this.d;
                linkedHashMap.put(lowerCase4, y92.R(lowerCase3, linkedHashMap));
            }
        }
        this.m = new im(7, this);
    }

    public final boolean a() {
        be1 be1Var = this.a.a;
        if (be1Var == null || !be1Var.c.isOpen()) {
            return false;
        }
        if (!this.g) {
            this.a.h().J();
        }
        if (this.g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(bi4 bi4Var) {
        vr1 vr1Var;
        boolean z;
        WorkDatabase_Impl workDatabase_Impl;
        be1 be1Var;
        synchronized (this.j) {
            vr1Var = (vr1) this.j.d(bi4Var);
        }
        if (vr1Var != null) {
            hw0 hw0Var = this.i;
            int[] iArr = vr1Var.b;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            hw0Var.getClass();
            synchronized (hw0Var) {
                z = false;
                for (int i : iArrCopyOf) {
                    long[] jArr = (long[]) hw0Var.c;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        hw0Var.b = true;
                        z = true;
                    }
                }
            }
            if (z && (be1Var = (workDatabase_Impl = this.a).a) != null && be1Var.c.isOpen()) {
                d(workDatabase_Impl.h().J());
            }
        }
    }

    public final void c(be1 be1Var, int i) {
        be1Var.p("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = n[i2];
            be1Var.p("CREATE TEMP TRIGGER IF NOT EXISTS " + Protocol$Companion.getTriggerName$room_runtime_release(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END");
        }
    }

    public final void d(be1 be1Var) {
        be1Var.getClass();
        if (be1Var.A()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.a.h.readLock();
            lock.getClass();
            lock.lock();
            try {
                synchronized (this.k) {
                    try {
                        int[] iArrC = this.i.c();
                        if (iArrC != null) {
                            if (be1Var.K()) {
                                be1Var.c();
                            } else {
                                be1Var.a();
                            }
                            try {
                                int length = iArrC.length;
                                int i = 0;
                                int i2 = 0;
                                while (i < length) {
                                    int i3 = iArrC[i];
                                    int i4 = i2 + 1;
                                    if (i3 == 1) {
                                        c(be1Var, i2);
                                    } else if (i3 == 2) {
                                        String str = this.e[i2];
                                        String[] strArr = n;
                                        for (int i5 = 0; i5 < 3; i5++) {
                                            be1Var.p("DROP TRIGGER IF EXISTS ".concat(Protocol$Companion.getTriggerName$room_runtime_release(str, strArr[i5])));
                                        }
                                    }
                                    i++;
                                    i2 = i4;
                                }
                                be1Var.O();
                                be1Var.l();
                            } catch (Throwable th) {
                                be1Var.l();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lock.unlock();
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}
