package defpackage;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class he1 extends ge1 implements bq3 {
    public final SQLiteStatement d;

    public he1(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.d = sQLiteStatement;
    }

    public final int a() {
        return this.d.executeUpdateDelete();
    }
}
