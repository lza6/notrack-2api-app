package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.security.keystore.KeyGenParameterSpec;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.KeyGenerator;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class gj implements fn1 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public gj() {
        this.a = 6;
        this.c = new oi2(0, new dr1[16]);
    }

    public /* synthetic */ gj(int i, byte b) {
        this.a = i;
    }

    public gj(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 13;
        this.b = i;
        this.d = str;
        this.c = arrayList;
    }

    public gj(Context context) {
        this.a = 5;
        context.getApplicationContext();
        this.c = "_androidx_security_master_key_";
    }

    public gj(ImageView imageView) {
        this.a = 0;
        this.b = 0;
        this.c = imageView;
    }

    public gj(c cVar) {
        this.a = 3;
        this.c = cVar;
        this.d = new oi2(0, new le1[16]);
    }

    public gj(ViewConfiguration viewConfiguration) {
        this.a = 2;
        this.c = viewConfiguration;
    }

    public gj(String str, String str2, int i) {
        this.a = 1;
        this.c = str;
        this.d = str2;
        this.b = i;
    }

    public gj(lq1 lq1Var, vl0 vl0Var) {
        this.a = 7;
        gj gjVarN = vl0Var.N();
        int i = lq1Var.c;
        if (i < 0) {
            so1.c("negative nearestRange.first");
        }
        int iMin = Math.min(lq1Var.d, gjVarN.b - 1);
        if (iMin < i) {
            rh2 rh2Var = cn2.a;
            rh2Var.getClass();
            this.c = rh2Var;
            this.d = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.d = new Object[i2];
        this.b = i;
        rh2 rh2Var2 = new rh2(i2);
        yj2 yj2Var = new yj2(i, iMin, rh2Var2, this);
        oi2 oi2Var = (oi2) gjVarN.c;
        if (i < 0 || i >= gjVarN.b) {
            StringBuilder sbS = ud2.s("Index ", ", size ", i);
            sbS.append(gjVarN.b);
            so1.e(sbS.toString());
        }
        if (iMin < 0 || iMin >= gjVarN.b) {
            StringBuilder sbS2 = ud2.s("Index ", ", size ", iMin);
            sbS2.append(gjVarN.b);
            so1.e(sbS2.toString());
        }
        if (iMin < i) {
            so1.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iC = sf3.c(i, oi2Var);
        int i3 = ((dr1) oi2Var.c[iC]).a;
        while (i3 <= iMin) {
            dr1 dr1Var = (dr1) oi2Var.c[iC];
            yj2Var.invoke(dr1Var);
            i3 += dr1Var.b;
            iC++;
        }
        this.c = rh2Var2;
    }

    public gj(n13 n13Var, int i, String str) {
        this.a = 11;
        this.c = n13Var;
        this.b = i;
        this.d = str;
    }

    public gj(sr0 sr0Var, sk3 sk3Var) {
        this.a = 9;
        this.a = 9;
        this.b = 23;
        this.c = sr0Var;
        this.d = sk3Var;
    }

    public static void f(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = kr1.z(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public static void k(gj gjVar, int i, int i2, int i3, int i4, int i5, int i6) {
        long[] jArr = (long[]) gjVar.c;
        int i7 = gjVar.b;
        int i8 = i7 + 3;
        gjVar.b = i8;
        int length = jArr.length;
        if (length <= i8) {
            int iMax = Math.max(length * 2, i8);
            gjVar.c = Arrays.copyOf(jArr, iMax);
            gjVar.d = Arrays.copyOf((long[]) gjVar.d, iMax);
        }
        long[] jArr2 = (long[]) gjVar.c;
        jArr2[i7] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i7 + 1] = (((long) i5) & 4294967295L) | (((long) i4) << 32);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = (((long) i9) << 26) | 2305843009213693952L | ((long) (i & 67108863));
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = ((-2301339409586323457L) & j) | (((long) ((i7 - i10) & 511)) << 52);
                return;
            }
        }
    }

    @Override // defpackage.fn1
    public long a(long j) {
        return ((c) this.c).e(j);
    }

    @Override // defpackage.fn1
    public long b(long j) {
        return ((c) this.c).f(j);
    }

    public void c(int i, i02 i02Var) {
        if (i < 0) {
            so1.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        dr1 dr1Var = new dr1(this.b, i, i02Var);
        this.b += i;
        ((oi2) this.c).c(dr1Var);
    }

    public void d() {
        ol0 ol0Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            b01.a(drawable);
        }
        if (drawable == null || (ol0Var = (ol0) this.d) == null) {
            return;
        }
        bj.d(drawable, ol0Var, imageView.getDrawableState());
    }

    public d5 e() {
        int i = this.b;
        if (i == 0 && ((KeyGenParameterSpec) this.d) == null) {
            u41.k("build() called before setKeyGenParameterSpec or setKeyScheme.");
            return null;
        }
        if (i == 1) {
            this.d = new KeyGenParameterSpec.Builder((String) this.c, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(FontInfo.NUMBER_OF_CHAR_CODES).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.d;
        if (keyGenParameterSpec == null) {
            m51.x("KeyGenParameterSpec was null after build() check");
            return null;
        }
        Object obj = xa2.a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            u41.j(Arrays.toString(keyGenParameterSpec.getBlockModes()), "invalid block mode, want GCM got ");
            return null;
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            m51.g(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            u41.j(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
            return null;
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            u41.k("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            return null;
        }
        synchronized (xa2.a) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                } catch (ProviderException e) {
                    throw new GeneralSecurityException(e.getMessage(), e);
                }
            }
        }
        return new d5(keyGenParameterSpec.getKeystoreAlias(), (KeyGenParameterSpec) this.d);
    }

    public boolean g() {
        oi2 oi2Var = (oi2) this.d;
        int i = this.b - 1;
        this.b = i;
        if (i == 0 && oi2Var.h != 0) {
            c cVar = (c) this.c;
            ay3 ay3Var = cVar.a;
            ay3Var.b.a().f();
            zt3 zt3Var = ay3Var.b;
            Object[] objArr = oi2Var.c;
            int i2 = oi2Var.h;
            for (int i3 = 0; i3 < i2; i3++) {
                ((le1) objArr[i3]).invoke(zt3Var);
            }
            cVar.l(zt3Var);
            ay3.a(ay3Var, false, wu3.c);
            oi2Var.i();
        }
        return this.b > 0;
    }

    public dr1 h(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder sbS = ud2.s("Index ", ", size ", i);
            sbS.append(this.b);
            so1.e(sbS.toString());
        }
        dr1 dr1Var = (dr1) this.d;
        if (dr1Var != null) {
            int i2 = dr1Var.a;
            if (i < dr1Var.b + i2 && i2 <= i) {
                return dr1Var;
            }
        }
        oi2 oi2Var = (oi2) this.c;
        dr1 dr1Var2 = (dr1) oi2Var.c[sf3.c(i, oi2Var)];
        this.d = dr1Var2;
        return dr1Var2;
    }

    public int i(Object obj) {
        rh2 rh2Var = (rh2) this.c;
        int iD = rh2Var.d(obj);
        if (iD >= 0) {
            return rh2Var.c[iD];
        }
        return -1;
    }

    public String j() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof tf3) {
                tf3 tf3Var = (tf3) obj;
                boolean zN = kr1.n(tf3Var.c(), zo3.o);
                int[] iArr = (int[]) this.d;
                if (!zN) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(tf3Var.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.d)[i2]);
                    sb.append("]");
                }
            } else if (obj != t73.r) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void l(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = g23.f;
        iy2 iy2VarL = iy2.l(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) iy2VarL.h;
        zc4.g(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) iy2VarL.h, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = y64.y(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                b01.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(iy2VarL.d(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(b01.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            iy2VarL.n();
        }
    }

    public void m(be1 be1Var) {
    }

    public void n(be1 be1Var) throws IOException {
        sk3 sk3Var = (sk3) this.d;
        Cursor cursorL = be1Var.L(new d5("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'", 14));
        try {
            boolean z = false;
            if (cursorL.moveToFirst() && cursorL.getInt(0) == 0) {
                z = true;
            }
            cursorL.close();
            sk3.h(be1Var);
            if (!z) {
                p73 p73VarM = sk3.m(be1Var);
                if (!p73VarM.b) {
                    m51.B(p73VarM.a, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = be1Var.c;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            List list = ((WorkDatabase_Impl) sk3Var.d).f;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ad0) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jr1.i(cursorL, th);
                throw th2;
            }
        }
    }

    public void o(be1 be1Var) throws IOException {
        int i = 14;
        Cursor cursorL = be1Var.L(new d5("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'", i));
        try {
            boolean z = cursorL.moveToFirst() && cursorL.getInt(0) != 0;
            cursorL.close();
            if (z) {
                Cursor cursorL2 = be1Var.L(new d5("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", i));
                try {
                    String string = cursorL2.moveToFirst() ? cursorL2.getString(0) : null;
                    cursorL2.close();
                    if (!"86254750241babac4b8d52996a675549".equals(string) && !"1cbd3130fa23b59692c061c594c16cc0".equals(string)) {
                        u41.r(fq2.m("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: ", string));
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        jr1.i(cursorL2, th);
                        throw th2;
                    }
                }
            } else {
                p73 p73VarM = sk3.m(be1Var);
                if (!p73VarM.b) {
                    m51.B(p73VarM.a, "Pre-packaged database has an invalid schema: ");
                    return;
                } else {
                    SQLiteDatabase sQLiteDatabase = be1Var.c;
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                }
            }
            sk3 sk3Var = (sk3) this.d;
            ((WorkDatabase_Impl) sk3Var.d).a = be1Var;
            be1Var.c.execSQL("PRAGMA foreign_keys = ON");
            wr1 wr1Var = ((WorkDatabase_Impl) sk3Var.d).d;
            wr1Var.getClass();
            synchronized (wr1Var.l) {
                if (wr1Var.g) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                } else {
                    be1Var.c.execSQL("PRAGMA temp_store = MEMORY;");
                    be1Var.c.execSQL("PRAGMA recursive_triggers='ON';");
                    be1Var.c.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                    wr1Var.d(be1Var);
                    wr1Var.h = be1Var.h("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                    wr1Var.g = true;
                }
            }
            List<ad0> list = ((WorkDatabase_Impl) sk3Var.d).f;
            if (list != null) {
                for (ad0 ad0Var : list) {
                    ad0Var.getClass();
                    be1Var.a();
                    try {
                        StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                        ad0Var.a.getClass();
                        sb.append(System.currentTimeMillis() - 86400000);
                        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                        be1Var.c.execSQL(sb.toString());
                        be1Var.O();
                        be1Var.l();
                    } catch (Throwable th3) {
                        be1Var.l();
                        throw th3;
                    }
                }
            }
            this.c = null;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                jr1.i(cursorL, th4);
                throw th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[LOOP:3: B:11:0x002b->B:109:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    public void p(be1 be1Var, int i, int i2) throws IOException {
        Set set;
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z;
        Integer num;
        int i3;
        int iIntValue;
        int iIntValue2;
        SQLiteDatabase sQLiteDatabase = be1Var.c;
        sk3 sk3Var = (sk3) this.d;
        sr0 sr0Var = (sr0) this.c;
        if (sr0Var != null) {
            nr0 nr0Var = sr0Var.d;
            nr0Var.getClass();
            if (i == i2) {
                iterable = z21.c;
            } else {
                boolean z2 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int iIntValue3 = i;
                while (true) {
                    if (z2) {
                        if (iIntValue3 < i2) {
                            treeMap = (TreeMap) nr0Var.a.get(Integer.valueOf(iIntValue3));
                            if (treeMap != null) {
                                if (z2) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    num = (Integer) it.next();
                                    if (!z2) {
                                        num.getClass();
                                        iIntValue2 = num.intValue();
                                        if (i2 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                            Object obj = treeMap.get(num);
                                            obj.getClass();
                                            arrayList.add(obj);
                                            iIntValue3 = num.intValue();
                                            z = true;
                                            break;
                                            break;
                                        }
                                    } else {
                                        i3 = iIntValue3 + 1;
                                        num.getClass();
                                        iIntValue = num.intValue();
                                        if (i3 <= iIntValue && iIntValue <= i2) {
                                            Object obj2 = treeMap.get(num);
                                            obj2.getClass();
                                            arrayList.add(obj2);
                                            iIntValue3 = num.intValue();
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z) {
                                }
                            }
                            iterable = null;
                        } else {
                            iterable = arrayList;
                        }
                    } else if (iIntValue3 > i2) {
                        treeMap = (TreeMap) nr0Var.a.get(Integer.valueOf(iIntValue3));
                        if (treeMap != null) {
                            if (z2) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                    break;
                                }
                                num = (Integer) it.next();
                                if (!z2) {
                                    i3 = iIntValue3 + 1;
                                    num.getClass();
                                    iIntValue = num.intValue();
                                    if (i3 <= iIntValue) {
                                        continue;
                                    }
                                } else {
                                    num.getClass();
                                    iIntValue2 = num.intValue();
                                    if (i2 <= iIntValue2) {
                                        continue;
                                    }
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                }
            }
            if (iterable != null) {
                c52 c52VarA = kr1.A();
                Cursor cursorL = be1Var.L(new d5("SELECT name FROM sqlite_master WHERE type = 'trigger'", 14));
                while (cursorL.moveToNext()) {
                    try {
                        c52VarA.add(cursorL.getString(0));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(cursorL, th);
                            throw th2;
                        }
                    }
                }
                cursorL.close();
                ListIterator listIterator = kr1.q(c52VarA).listIterator(0);
                while (true) {
                    gi1 gi1Var = (gi1) listIterator;
                    if (!gi1Var.hasNext()) {
                        break;
                    }
                    String str = (String) gi1Var.next();
                    str.getClass();
                    if (to3.q0(str, "room_fts_content_sync_", false)) {
                        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((ee2) it2.next()).a(be1Var);
                }
                p73 p73VarM = sk3.m(be1Var);
                if (!p73VarM.b) {
                    m51.B(p73VarM.a, "Migration didn't properly handle: ");
                    return;
                } else {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                    return;
                }
            }
        }
        sr0 sr0Var2 = (sr0) this.c;
        if (sr0Var2 != null) {
            if (!((i <= i2 || !sr0Var2.k) && sr0Var2.j && ((set = sr0Var2.l) == null || !set.contains(Integer.valueOf(i))))) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
                List list = ((WorkDatabase_Impl) sk3Var.d).f;
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((ad0) it3.next()).getClass();
                    }
                }
                sk3.h(be1Var);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void q(yw2 yw2Var) {
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.c;
        dx2 dx2Var = (dx2) this.d;
        dx2 dx2Var2 = (dx2) yw2Var.a.get(0);
        if (dx2Var == null || dx2Var2.b - dx2Var.b >= viewConfiguration.getDoubleTapTimeoutMillis() || !g13.x(viewConfiguration, dx2Var, dx2Var2)) {
            this.b = 1;
        } else {
            this.b++;
        }
        this.d = dx2Var2;
    }

    public void r(int i, pe1 pe1Var) {
        int i2 = i & 67108863;
        long[] jArr = (long[]) this.c;
        int i3 = this.b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                pe1Var.b(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return j();
            case 11:
                StringBuilder sb = new StringBuilder();
                if (((n13) this.c) == n13.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
