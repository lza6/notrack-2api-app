package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class ge1 implements bq3 {
    public final SQLiteProgram c;

    public ge1(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.c = sQLiteProgram;
    }

    @Override // defpackage.bq3
    public final void C(int i, byte[] bArr) {
        this.c.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.bq3
    public final void i(int i, String str) {
        str.getClass();
        this.c.bindString(i, str);
    }

    @Override // defpackage.bq3
    public final void k(double d, int i) {
        this.c.bindDouble(i, d);
    }

    @Override // defpackage.bq3
    public final void m(int i) {
        this.c.bindNull(i);
    }

    @Override // defpackage.bq3
    public final void s(long j, int i) {
        this.c.bindLong(i, j);
    }
}
