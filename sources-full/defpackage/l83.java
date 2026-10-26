package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l83 implements m83, xq3 {
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    public /* synthetic */ l83(long j, Object obj, Object obj2) {
        this.d = obj;
        this.h = obj2;
        this.c = j;
    }

    @Override // defpackage.m83
    public Object apply(Object obj) {
        String str = (String) this.d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((q72) this.h).c;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.c;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.xq3
    public Object d() {
        ca4 ca4Var = (ca4) this.d;
        vo voVar = (vo) this.h;
        o83 o83Var = ca4Var.c;
        long jA = ca4Var.g.a() + this.c;
        o83Var.getClass();
        o83Var.h(new k83(jA, voVar));
        return null;
    }
}
