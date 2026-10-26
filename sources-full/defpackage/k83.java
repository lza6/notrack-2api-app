package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k83 implements m83 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object h;

    public /* synthetic */ k83(long j, vo voVar) {
        this.d = j;
        this.h = voVar;
    }

    public /* synthetic */ k83(o83 o83Var, long j) {
        this.h = o83Var;
        this.d = j;
    }

    @Override // defpackage.m83
    public final Object apply(Object obj) {
        int i = this.c;
        Object obj2 = this.h;
        long j = this.d;
        switch (i) {
            case 0:
                o83 o83Var = (o83) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                o83Var.getClass();
                String[] strArr = {String.valueOf(j)};
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        o83Var.p(cursorRawQuery.getInt(0), q72.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                vo voVar = (vo) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                String str = voVar.a;
                lz2 lz2Var = voVar.c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(mz2.a(lz2Var))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(mz2.a(lz2Var)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }
}
