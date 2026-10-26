package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o83 implements Closeable {
    public static final j31 n = new j31("proto");
    public final bb3 c;
    public final ld0 d;
    public final ld0 h;
    public final no l;
    public final t13 m;

    public o83(ld0 ld0Var, ld0 ld0Var2, no noVar, bb3 bb3Var, t13 t13Var) {
        this.c = bb3Var;
        this.d = ld0Var;
        this.h = ld0Var2;
        this.l = noVar;
        this.m = t13Var;
    }

    public static String A(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((so) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object K(Cursor cursor, m83 m83Var) {
        try {
            return m83Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, vo voVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(voVar.a, String.valueOf(mz2.a(voVar.c))));
        byte[] bArr = voVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final SQLiteDatabase a() {
        bb3 bb3Var = this.c;
        Objects.requireNonNull(bb3Var);
        ld0 ld0Var = this.h;
        long jA = ld0Var.a();
        while (true) {
            try {
                return bb3Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (ld0Var.a() >= ((long) this.l.c) + jA) {
                    throw new wq3("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    public final Object h(m83 m83Var) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = m83Var.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList l(SQLiteDatabase sQLiteDatabase, vo voVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lC = c(sQLiteDatabase, voVar);
        if (lC == null) {
            return arrayList;
        }
        K(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i)), new it0(this, (Object) arrayList, voVar, 3));
        return arrayList;
    }

    public final void p(long j, q72 q72Var, String str) {
        h(new l83(j, str, q72Var));
    }

    public final Object x(xq3 xq3Var) {
        SQLiteDatabase sQLiteDatabaseA = a();
        ld0 ld0Var = this.h;
        long jA = ld0Var.a();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objD = xq3Var.d();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objD;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (ld0Var.a() >= ((long) this.l.c) + jA) {
                    throw new wq3("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
