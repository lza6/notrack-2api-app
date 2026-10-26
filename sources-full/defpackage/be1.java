package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import app.template.extension.BuildConfig;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class be1 implements Closeable {
    public static final String[] d = {BuildConfig.VERSION_NAME, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] h = new String[0];
    public final SQLiteDatabase c;

    public be1(SQLiteDatabase sQLiteDatabase) {
        this.c = sQLiteDatabase;
    }

    public final boolean A() {
        return this.c.inTransaction();
    }

    public final boolean K() {
        return this.c.isWriteAheadLoggingEnabled();
    }

    public final Cursor L(cq3 cq3Var) {
        final gc gcVar = new gc(1, cq3Var);
        Cursor cursorRawQueryWithFactory = this.c.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ae1
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) gcVar.b(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, cq3Var.c(), h, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    public final void O() {
        this.c.setTransactionSuccessful();
    }

    public final void a() {
        this.c.beginTransaction();
    }

    public final void c() {
        this.c.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    public final he1 h(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.c.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new he1(sQLiteStatementCompileStatement);
    }

    public final void l() {
        this.c.endTransaction();
    }

    public final void p(String str) {
        this.c.execSQL(str);
    }

    public final void x(Object[] objArr) {
        objArr.getClass();
        this.c.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
