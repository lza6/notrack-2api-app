package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class it0 implements xq3, g00, m83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    public /* synthetic */ it0(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    public /* synthetic */ it0(o83 o83Var, Object obj, vo voVar, int i) {
        this.c = i;
        this.d = o83Var;
        this.l = obj;
        this.h = voVar;
    }

    @Override // defpackage.g00
    public Object a(f00 f00Var) {
        xp0 xp0Var = (xp0) this.d;
        jq0 jq0Var = (jq0) this.h;
        ne1 ne1Var = (ne1) this.l;
        m3 m3Var = new m3(9, (gs1) xp0Var.get(bg1.s));
        t53 t53Var = f00Var.c;
        if (t53Var != null) {
            t53Var.a(m3Var, cw0.c);
        }
        return py.F(yo4.a(xp0Var), null, jq0Var, new q8(ne1Var, f00Var, (so0) null, 21), 1);
    }

    @Override // defpackage.m83
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        o83 o83Var;
        q72 q72Var;
        int i = this.c;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        q72 q72Var2 = q72.CACHE_FULL;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.l;
        Object obj3 = this.h;
        Object obj4 = this.d;
        int i8 = 0;
        switch (i) {
            case 2:
                o83 o83Var2 = (o83) obj4;
                mo moVar = (mo) obj2;
                g31 g31Var = moVar.c;
                String str = moVar.a;
                vo voVar = (vo) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = o83Var2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * o83Var2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                no noVar = o83Var2.l;
                if (jSimpleQueryForLong >= noVar.a) {
                    o83Var2.p(1L, q72Var2, str);
                    return -1L;
                }
                Long lC = o83.c(sQLiteDatabase, voVar);
                if (lC != null) {
                    jInsert = lC.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", voVar.a);
                    contentValues.put("priority", Integer.valueOf(mz2.a(voVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = voVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = noVar.e;
                byte[] bArr2 = g31Var.b;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(moVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(moVar.e));
                contentValues2.put("payload_encoding", g31Var.a.a);
                contentValues2.put("code", moVar.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i9));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(moVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 3:
                o83 o83Var3 = (o83) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                vo voVar2 = (vo) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
                    f13 f13Var = new f13();
                    f13Var.e = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        m51.x("Null transportName");
                        return null;
                    }
                    f13Var.a = string;
                    f13Var.c = Long.valueOf(cursor2.getLong(i6));
                    f13Var.d = Long.valueOf(cursor2.getLong(3));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        f13Var.b = new g31(string2 == null ? o83.n : new j31(string2), cursor2.getBlob(5));
                        o83Var = o83Var3;
                    } else {
                        String string3 = cursor2.getString(4);
                        j31 j31Var = string3 == null ? o83.n : new j31(string3);
                        Cursor cursorQuery = o83Var3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i12 = 0;
                            int length2 = 0;
                            while (i12 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i12);
                                o83 o83Var4 = o83Var3;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i12++;
                                    cursorQuery = cursor;
                                    o83Var3 = o83Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            o83Var = o83Var3;
                            cursorQuery.close();
                            f13Var.b = new g31(j31Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        f13Var.f = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new so(j, voVar2, f13Var.c()));
                    o83Var3 = o83Var;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                o83 o83Var5 = (o83) obj4;
                HashMap map = (HashMap) obj3;
                ir3 ir3Var = (ir3) obj2;
                ArrayList arrayList3 = (ArrayList) ir3Var.d;
                Cursor cursor3 = (Cursor) obj;
                o83Var5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i13 = cursor3.getInt(1);
                    q72 q72Var3 = q72.REASON_UNKNOWN;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            q72Var3 = q72.MESSAGE_TOO_OLD;
                        } else if (i13 == 2) {
                            q72Var = q72Var2;
                        } else if (i13 == i5) {
                            q72Var3 = q72.PAYLOAD_TOO_BIG;
                        } else if (i13 == i4) {
                            q72Var3 = q72.MAX_RETRIES_REACHED;
                        } else if (i13 == i3) {
                            q72Var3 = q72.INVALID_PAYLOD;
                        } else if (i13 == i2) {
                            q72Var3 = q72.SERVER_ERROR;
                        } else {
                            xr0.S("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                        }
                        q72Var = q72Var3;
                    } else {
                        q72Var = q72Var3;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new r72(j2, q72Var));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i8 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i14 = t72.c;
                    new ArrayList();
                    arrayList3.add(new t72((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jA = o83Var5.d.a();
                SQLiteDatabase sQLiteDatabaseA = o83Var5.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        t04 t04Var = new t04(cursorRawQuery.getLong(0), jA);
                        cursorRawQuery.close();
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                        ir3Var.c = t04Var;
                        ir3Var.h = new mf1(new zn3(o83Var5.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * o83Var5.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), no.f.a));
                        ir3Var.l = (String) o83Var5.m.get();
                        return new kd0((t04) ir3Var.c, Collections.unmodifiableList(arrayList3), (mf1) ir3Var.h, (String) ir3Var.l);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseA.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // defpackage.xq3
    public Object d() {
        kt0 kt0Var = (kt0) this.d;
        vo voVar = (vo) this.h;
        mo moVar = (mo) this.l;
        o83 o83Var = kt0Var.d;
        o83Var.getClass();
        lz2 lz2Var = voVar.c;
        String str = moVar.a;
        String str2 = voVar.a;
        String strD0 = xr0.d0("SQLiteEventStore");
        if (Log.isLoggable(strD0, 3)) {
            Log.d(strD0, "Storing event with priority=" + lz2Var + ", name=" + str + " for destination " + str2);
        }
        ((Long) o83Var.h(new it0(o83Var, (Object) moVar, voVar, 2))).getClass();
        kt0Var.a.H(voVar, 1, false);
        return null;
    }
}
