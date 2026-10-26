package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ee1 extends SQLiteOpenHelper {
    public static final /* synthetic */ int p = 0;
    public final Context c;
    public final sz0 d;
    public final gj h;
    public final boolean l;
    public boolean m;
    public final qz2 n;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee1(Context context, String str, final sz0 sz0Var, final gj gjVar, boolean z) {
        String string;
        super(context, str, null, gjVar.b, new DatabaseErrorHandler() { // from class: ce1
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                gjVar.getClass();
                int i = ee1.p;
                sQLiteDatabase.getClass();
                sz0 sz0Var2 = sz0Var;
                be1 be1Var = (be1) sz0Var2.c;
                if (be1Var == null || !be1Var.c.equals(sQLiteDatabase)) {
                    be1Var = new be1(sQLiteDatabase);
                    sz0Var2.c = be1Var;
                }
                SQLiteDatabase sQLiteDatabase2 = be1Var.c;
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + be1Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        gj.f(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                gj.f((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                gj.f(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    be1Var.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        gjVar.getClass();
        this.c = context;
        this.d = sz0Var;
        this.h = gjVar;
        this.l = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.n = new qz2(string, context.getCacheDir(), false);
    }

    public final be1 a(boolean z) {
        qz2 qz2Var = this.n;
        try {
            qz2Var.a((this.o || getDatabaseName() == null) ? false : true);
            this.m = false;
            SQLiteDatabase sQLiteDatabaseH = h(z);
            if (!this.m) {
                return c(sQLiteDatabaseH);
            }
            close();
            return a(z);
        } finally {
            qz2Var.b();
        }
    }

    public final be1 c(SQLiteDatabase sQLiteDatabase) {
        sz0 sz0Var = this.d;
        sz0Var.getClass();
        be1 be1Var = (be1) sz0Var.c;
        if (be1Var != null && be1Var.c.equals(sQLiteDatabase)) {
            return be1Var;
        }
        be1 be1Var2 = new be1(sQLiteDatabase);
        sz0Var.c = be1Var2;
        return be1Var2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        qz2 qz2Var = this.n;
        try {
            qz2Var.a(qz2Var.a);
            super.close();
            this.d.c = null;
            this.o = false;
        } finally {
            qz2Var.b();
        }
    }

    public final SQLiteDatabase h(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.o;
        Context context = this.c;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                super.close();
                if (th instanceof de1) {
                    de1 de1Var = th;
                    int iZ = fq2.z(de1Var.c);
                    Throwable th2 = de1Var.d;
                    if (iZ == 0 || iZ == 1 || iZ == 2 || iZ == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.l) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (de1 e) {
                    throw e.d;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.m;
        gj gjVar = this.h;
        if (!z && gjVar.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            c(sQLiteDatabase);
            gjVar.getClass();
        } catch (Throwable th) {
            throw new de1(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.h.n(c(sQLiteDatabase));
        } catch (Throwable th) {
            throw new de1(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.m = true;
        try {
            this.h.p(c(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new de1(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.m) {
            try {
                this.h.o(c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new de1(5, th);
            }
        }
        this.o = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.m = true;
        try {
            this.h.p(c(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new de1(3, th);
        }
    }
}
