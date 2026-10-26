package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class rh4 {
    public static final void a(Context context) {
        Map map;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            v72.f().c(sh4.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr = sh4.b;
            int iS = y92.S(strArr.length);
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                Map mapSingletonMap = Collections.singletonMap(databasePath2, file);
                mapSingletonMap.getClass();
                map = mapSingletonMap;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        v72.f().i(sh4.a, "Over-writing contents of " + file3);
                    }
                    v72.f().c(sh4.a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public abstract void b(ds4 ds4Var, ds4 ds4Var2);

    public abstract void c(ds4 ds4Var, Thread thread);

    public abstract boolean d(js4 js4Var, xp4 xp4Var, xp4 xp4Var2);

    public abstract boolean e(js4 js4Var, Object obj, Object obj2);

    public abstract boolean f(js4 js4Var, ds4 ds4Var, ds4 ds4Var2);
}
