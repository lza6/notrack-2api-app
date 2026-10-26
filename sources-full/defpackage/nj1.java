package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import notrack.ai.ui.components.HtmlPreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nj1 implements r3, g00, m83, xq3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    public /* synthetic */ nj1(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    @Override // defpackage.g00
    public Object a(f00 f00Var) {
        int i = this.c;
        cw0 cw0Var = cw0.c;
        Object obj = this.h;
        final int i2 = 0;
        Executor executor = (Executor) this.d;
        switch (i) {
            case 1:
                c40 c40Var = (c40) obj;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Runnable runnable = new Runnable() { // from class: n62
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        switch (i3) {
                            case 0:
                                atomicBoolean2.set(true);
                                break;
                            default:
                                atomicBoolean2.set(true);
                                break;
                        }
                    }
                };
                t53 t53Var = f00Var.c;
                if (t53Var != null) {
                    t53Var.a(runnable, cw0Var);
                }
                executor.execute(new p00(atomicBoolean, f00Var, c40Var, 3));
                return "setForegroundAsync";
            default:
                je1 je1Var = (je1) obj;
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                final int i3 = 1;
                Runnable runnable2 = new Runnable() { // from class: n62
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        AtomicBoolean atomicBoolean3 = atomicBoolean2;
                        switch (i4) {
                            case 0:
                                atomicBoolean3.set(true);
                                break;
                            default:
                                atomicBoolean3.set(true);
                                break;
                        }
                    }
                };
                t53 t53Var2 = f00Var.c;
                if (t53Var2 != null) {
                    t53Var2.a(runnable2, cw0Var);
                }
                executor.execute(new p00(atomicBoolean2, f00Var, je1Var, 6));
                return w84.a;
        }
    }

    @Override // defpackage.m83
    public Object apply(Object obj) {
        o83 o83Var = (o83) this.d;
        vo voVar = (vo) this.h;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        no noVar = o83Var.l;
        ArrayList arrayListL = o83Var.l(sQLiteDatabase, voVar, noVar.b);
        for (lz2 lz2Var : lz2.values()) {
            if (lz2Var != voVar.c) {
                int size = noVar.b - arrayListL.size();
                if (size <= 0) {
                    break;
                }
                ci4 ci4VarA = vo.a();
                ci4VarA.I(voVar.a);
                if (lz2Var == null) {
                    m51.x("Null priority");
                    return null;
                }
                ci4VarA.l = lz2Var;
                ci4VarA.h = voVar.b;
                arrayListL.addAll(o83Var.l(sQLiteDatabase, ci4VarA.o(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListL.size(); i++) {
            sb.append(((so) arrayListL.get(i)).a);
            if (i < arrayListL.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new n83(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListL.listIterator();
        while (listIterator.hasNext()) {
            so soVar = (so) listIterator.next();
            long j2 = soVar.a;
            if (map.containsKey(Long.valueOf(j2))) {
                f13 f13VarC = soVar.c.c();
                for (n83 n83Var : (Set) map.get(Long.valueOf(j2))) {
                    f13VarC.a(n83Var.a, n83Var.b);
                }
                listIterator.set(new so(j2, soVar.b, f13VarC.c()));
            }
        }
        return arrayListL;
    }

    @Override // defpackage.r3
    public void b(Object obj) {
        HtmlPreviewActivity htmlPreviewActivity = (HtmlPreviewActivity) this.d;
        String str = (String) this.h;
        Uri uri = (Uri) obj;
        String str2 = HtmlPreviewActivity.D;
        if (uri != null) {
            try {
                OutputStream outputStreamOpenOutputStream = htmlPreviewActivity.getContentResolver().openOutputStream(uri);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        byte[] bytes = str.getBytes(q30.a);
                        bytes.getClass();
                        outputStreamOpenOutputStream.write(bytes);
                        outputStreamOpenOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(outputStreamOpenOutputStream, th);
                            throw th2;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // defpackage.xq3
    public Object d() {
        int i = this.c;
        Object obj = this.h;
        ca4 ca4Var = (ca4) this.d;
        switch (i) {
            case 4:
                Iterable iterable = (Iterable) obj;
                o83 o83Var = ca4Var.c;
                o83Var.getClass();
                if (iterable.iterator().hasNext()) {
                    o83Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(o83.A(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ca4Var.i.p(((Integer) entry.getValue()).intValue(), q72.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }
}
