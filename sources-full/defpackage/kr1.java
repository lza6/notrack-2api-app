package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextInclusionStrategy$Companion;
import app.template.extension.BuildConfig;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public abstract class kr1 {
    public static final yf a = new yf(Float.POSITIVE_INFINITY);
    public static final zf b = new zf(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ag c = new ag(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final bg d = new bg(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final yf e = new yf(Float.NEGATIVE_INFINITY);
    public static final zf f = new zf(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ag g = new ag(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final bg h = new bg(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final String[] i = new String[0];
    public static final d5 j = new d5("NO_OWNER", 16);
    public static final j04 k = new j04(0, new long[0], new Object[0]);
    public static volatile boolean l;

    public static c52 A() {
        return new c52(10);
    }

    public static boolean B(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = B(file2) && z;
        }
        return z;
    }

    public static void C(tz0 tz0Var, rq2 rq2Var, long j2) {
        if (rq2Var instanceof pq2) {
            h43 h43Var = ((pq2) rq2Var).a;
            float f2 = h43Var.a;
            float f3 = h43Var.b;
            tz0Var.a0(j2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), k0(h43Var), 1.0f, null, 3);
            return;
        }
        boolean z = rq2Var instanceof qq2;
        b71 b71Var = b71.a;
        if (!z) {
            if (rq2Var instanceof oq2) {
                tz0Var.Z(((oq2) rq2Var).a, j2, b71Var);
                return;
            } else {
                u41.e();
                return;
            }
        }
        qq2 qq2Var = (qq2) rq2Var;
        ic icVar = qq2Var.b;
        if (icVar != null) {
            tz0Var.Z(icVar, j2, b71Var);
            return;
        }
        x73 x73Var = qq2Var.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (x73Var.h >> 32));
        float f4 = x73Var.a;
        float f5 = x73Var.b;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        float fB = x73Var.b();
        float fA = x73Var.a();
        tz0Var.v(j2, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), b71Var);
    }

    public static final p41 D(Enum[] enumArr) {
        enumArr.getClass();
        return new p41(enumArr);
    }

    public static final long E(az3 az3Var, long j2) {
        ln2 ln2Var;
        cx1 cx1VarD = az3Var.d();
        if (cx1VarD != null) {
            cx1 cx1Var = (cx1) az3Var.f.getValue();
            if (cx1Var != null) {
                ln2Var = new ln2((cx1VarD.z() && cx1Var.z()) ? cx1VarD.y(cx1Var, j2) : j2);
            } else {
                ln2Var = null;
            }
            if (ln2Var != null) {
                return ln2Var.a;
            }
        }
        return j2;
    }

    public static final int F(Cursor cursor, String str) {
        String string;
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    columnNames.getClass();
                    String strConcat = ".".concat(str);
                    String str2 = "." + str + '`';
                    int length = columnNames.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            String str3 = columnNames[i3];
                            int i4 = i2 + 1;
                            if (str3.length() < str.length() + 2 || !(to3.j0(str3, strConcat, false) || (str3.charAt(0) == '`' && to3.j0(str3, str2, false)))) {
                                i3++;
                                i2 = i4;
                            } else {
                                columnIndex = i2;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            columnNames2.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) BuildConfig.VERSION_NAME);
            int i5 = 0;
            for (String str4 : columnNames2) {
                i5++;
                if (i5 > 1) {
                    sb.append((CharSequence) ", ");
                }
                yo4.h(sb, str4, null);
            }
            sb.append((CharSequence) BuildConfig.VERSION_NAME);
            string = sb.toString();
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            string = "unknown";
        }
        u41.m("column '", str, "' does not exist. Available columns: ", string);
        return 0;
    }

    public static i00 G(g00 g00Var) {
        f00 f00Var = new f00();
        f00Var.c = new t53();
        i00 i00Var = new i00(f00Var);
        f00Var.b = i00Var;
        f00Var.a = g00Var.getClass();
        try {
            Object objA = g00Var.a(f00Var);
            if (objA == null) {
                return i00Var;
            }
            f00Var.a = objA;
            return i00Var;
        } catch (Exception e2) {
            i00Var.d.j(e2);
            return i00Var;
        }
    }

    public static int H(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final int I(pg2 pg2Var, long j2, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int i2 = (int) (4294967295L & j2);
        int iE = pg2Var.e(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) < pg2Var.f(iE) - handwritingGestureLineMargin || Float.intBitsToFloat(i2) > pg2Var.b(iE) + handwritingGestureLineMargin) {
            return -1;
        }
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) < (-handwritingGestureLineMargin) || Float.intBitsToFloat(i3) > pg2Var.d + handwritingGestureLineMargin) {
            return -1;
        }
        return iE;
    }

    public static final int J(pg2 pg2Var, long j2, cx1 cx1Var, ViewConfiguration viewConfiguration) {
        long jMo174xf127194;
        int I;
        if (cx1Var == null || (I = I(pg2Var, (jMo174xf127194 = cx1Var.mo174xf127194(j2)), viewConfiguration)) == -1) {
            return -1;
        }
        return pg2Var.g(ln2.a((pg2Var.b(I) + pg2Var.f(I)) / 2.0f, 1, jMo174xf127194));
    }

    public static final long K(z22 z22Var, h43 h43Var, int i2, j93 j93Var) {
        yy3 yy3VarD = z22Var.d();
        pg2 pg2Var = yy3VarD != null ? yy3VarD.a.b : null;
        cx1 cx1VarC = z22Var.c();
        return (pg2Var == null || cx1VarC == null) ? jz3.b : pg2Var.h(h43Var.j(cx1VarC.mo174xf127194(0L)), i2, j93Var);
    }

    public static final long L(az3 az3Var, h43 h43Var, int i2, j93 j93Var) {
        xy3 xy3VarB = az3Var.b();
        pg2 pg2Var = xy3VarB != null ? xy3VarB.b : null;
        cx1 cx1VarD = az3Var.d();
        return (pg2Var == null || cx1VarD == null) ? jz3.b : pg2Var.h(h43Var.j(cx1VarD.mo174xf127194(0L)), i2, j93Var);
    }

    public static final o82 M(o82 o82Var) {
        ux1 ux1Var = o82Var.t.t;
        while (true) {
            ux1 ux1VarT = ux1Var.t();
            ux1 ux1Var2 = null;
            if ((ux1VarT != null ? ux1VarT.p : null) == null) {
                o82 o82VarN0 = ((wl2) ux1Var.N.d).N0();
                o82VarN0.getClass();
                return o82VarN0;
            }
            ux1 ux1VarT2 = ux1Var.t();
            if (ux1VarT2 != null) {
                ux1Var2 = ux1VarT2.p;
            }
            ux1Var2.getClass();
            ux1 ux1VarT3 = ux1Var.t();
            ux1VarT3.getClass();
            ux1Var = ux1VarT3.p;
            ux1Var.getClass();
        }
    }

    public static do1 N(w01 w01Var, int i2) {
        return new do1(w01Var, (i2 & 2) != 0 ? k53.c : k53.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void O(rz0 rz0Var) {
        if (((of2) rz0Var).getNode().isAttached()) {
            y64.K(rz0Var, 1).W0();
        }
    }

    public static boolean P(byte b2) {
        return b2 > -65;
    }

    public static final boolean Q(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean R(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean S(int i2) {
        int type;
        return (!R(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    public static List T(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List U(Object... objArr) {
        if (objArr.length <= 0) {
            return z21.c;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static ArrayList V(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new il(objArr, true));
    }

    public static SharedPreferences W(Context context, String str, String str2) {
        context.getClass();
        try {
            gj gjVar = new gj(context);
            if (fq2.z(1) != 0) {
                throw new IllegalArgumentException("Unsupported scheme: ".concat("AES256_GCM"));
            }
            if (((KeyGenParameterSpec) gjVar.d) != null) {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
            gjVar.b = 1;
            return p31.a(context, str, gjVar.e());
        } catch (Exception e2) {
            l = true;
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("storage_health", 0);
                SharedPreferences.Editor editorPutString = sharedPreferences.edit().putInt("ks_fail_count", sharedPreferences.getInt("ks_fail_count", 0) + 1).putLong("ks_last_at", System.currentTimeMillis()).putString("ks_last_store", str);
                String simpleName = e2.getClass().getSimpleName();
                Throwable cause = e2.getCause();
                editorPutString.putString("ks_last_error", simpleName + ": " + (cause != null ? cause.getClass().getSimpleName() : BuildConfig.VERSION_NAME)).apply();
            } catch (Throwable unused) {
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str2, 0);
            sharedPreferences2.getClass();
            return sharedPreferences2;
        }
    }

    public static final List X(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : T(list.get(0));
        }
        return z21.c;
    }

    public static final fr0 Y(db1 db1Var, int i2) {
        int iOrdinal = db1Var.x0().ordinal();
        fr0 fr0Var = fr0.c;
        if (iOrdinal != 0) {
            fr0 fr0Var2 = fr0.d;
            if (iOrdinal == 1) {
                db1 db1VarV = av1.v(db1Var);
                if (db1VarV == null) {
                    u41.k("ActiveParent with no focused child");
                    return null;
                }
                fr0 fr0VarY = Y(db1VarV, i2);
                fr0 fr0Var3 = fr0VarY != fr0Var ? fr0VarY : null;
                if (fr0Var3 != null) {
                    return fr0Var3;
                }
                if (db1Var.d) {
                    return fr0Var;
                }
                db1Var.d = true;
                try {
                    xa1 xa1VarW0 = db1Var.w0();
                    n00 n00Var = new n00(i2);
                    jr1.t(db1Var);
                    qa1 focusOwner = y64.N(db1Var).getFocusOwner();
                    db1 db1Var2 = ((va1) focusOwner).l;
                    xa1VarW0.k.invoke(n00Var);
                    db1 db1Var3 = ((va1) focusOwner).l;
                    if (n00Var.b) {
                        za1 za1Var = za1.b;
                        return fr0Var2;
                    }
                    if (db1Var2 == db1Var3 || db1Var3 == null) {
                        return fr0Var;
                    }
                    return za1.d == za1.c ? fr0Var2 : fr0.h;
                } finally {
                    db1Var.d = false;
                }
            }
            if (iOrdinal == 2) {
                return fr0Var2;
            }
            if (iOrdinal != 3) {
                u41.e();
                return null;
            }
        }
        return fr0Var;
    }

    public static final fr0 Z(db1 db1Var, int i2) {
        if (!db1Var.h) {
            db1Var.h = true;
            try {
                xa1 xa1VarW0 = db1Var.w0();
                n00 n00Var = new n00(i2);
                jr1.t(db1Var);
                qa1 focusOwner = y64.N(db1Var).getFocusOwner();
                db1 db1Var2 = ((va1) focusOwner).l;
                xa1VarW0.j.invoke(n00Var);
                db1 db1Var3 = ((va1) focusOwner).l;
                boolean z = n00Var.b;
                fr0 fr0Var = fr0.d;
                if (z) {
                    za1 za1Var = za1.b;
                    return fr0Var;
                }
                if (db1Var2 != db1Var3 && db1Var3 != null) {
                    return za1.d == za1.c ? fr0Var : fr0.h;
                }
            } finally {
                db1Var.h = false;
            }
        }
        return fr0.c;
    }

    public static ue a(float f2) {
        return new ue(Float.valueOf(f2), mb4.a, Float.valueOf(0.01f), 8);
    }

    public static final fr0 a0(db1 db1Var, int i2) {
        of2 of2VarE;
        yd ydVar;
        int iOrdinal = db1Var.x0().ordinal();
        fr0 fr0Var = fr0.c;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                db1 db1VarV = av1.v(db1Var);
                if (db1VarV != null) {
                    return Y(db1VarV, i2);
                }
                u41.k("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    u41.e();
                    return null;
                }
                if (!db1Var.getNode().isAttached()) {
                    po1.b("visitAncestors called on an unattached node");
                }
                of2 parent$ui_release = db1Var.getNode().getParent$ui_release();
                ux1 ux1VarM = y64.M(db1Var);
                loop0: while (true) {
                    if (ux1VarM == null) {
                        of2VarE = null;
                        break;
                    }
                    if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 1024) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                of2VarE = parent$ui_release;
                                oi2 oi2Var = null;
                                while (of2VarE != null) {
                                    if (of2VarE instanceof db1) {
                                        break loop0;
                                    }
                                    if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                        int i3 = 0;
                                        for (of2 child$ui_release = ((ju0) of2VarE).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                                            if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    of2VarE = child$ui_release;
                                                } else {
                                                    if (oi2Var == null) {
                                                        oi2Var = new oi2(0, new of2[16]);
                                                    }
                                                    if (of2VarE != null) {
                                                        oi2Var.c(of2VarE);
                                                        of2VarE = null;
                                                    }
                                                    oi2Var.c(child$ui_release);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    of2VarE = y64.e(oi2Var);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    ux1VarM = ux1VarM.t();
                    parent$ui_release = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
                }
                db1 db1Var2 = (db1) of2VarE;
                if (db1Var2 == null) {
                    return fr0Var;
                }
                int iOrdinal2 = db1Var2.x0().ordinal();
                if (iOrdinal2 == 0) {
                    return Z(db1Var2, i2);
                }
                if (iOrdinal2 == 1) {
                    return a0(db1Var2, i2);
                }
                if (iOrdinal2 == 2) {
                    return fr0.d;
                }
                if (iOrdinal2 != 3) {
                    u41.e();
                    return null;
                }
                fr0 fr0VarA0 = a0(db1Var2, i2);
                fr0 fr0Var2 = fr0VarA0 != fr0Var ? fr0VarA0 : null;
                return fr0Var2 == null ? Z(db1Var2, i2) : fr0Var2;
            }
        }
        return fr0Var;
    }

    public static final long b(long j2, CharSequence charSequence) {
        int i2 = jz3.c;
        int iCharCount = (int) (j2 >> 32);
        int iCharCount2 = (int) (4294967295L & j2);
        int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(charSequence, iCharCount) : 10;
        int iCodePointAt = iCharCount2 < charSequence.length() ? Character.codePointAt(charSequence, iCharCount2) : 10;
        if (S(iCodePointBefore) && (R(iCodePointAt) || Q(iCodePointAt))) {
            do {
                iCharCount -= Character.charCount(iCodePointBefore);
                if (iCharCount == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            } while (S(iCodePointBefore));
            return p23.d(iCharCount, iCharCount2);
        }
        if (!S(iCodePointAt)) {
            return j2;
        }
        if (!R(iCodePointBefore) && !Q(iCodePointBefore)) {
            return j2;
        }
        do {
            iCharCount2 += Character.charCount(iCodePointAt);
            if (iCharCount2 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
        } while (S(iCodePointAt));
        return p23.d(iCharCount, iCharCount2);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x023b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0244 A[ADDED_TO_REGION, LOOP:9: B:140:0x0244->B:147:0x0258, LOOP_START, PHI: r12
  0x0244: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:139:0x0242, B:147:0x0258] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x0246  */
    /* JADX WARN: Code duplicated, block: B:144:0x0253 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0255  */
    /* JADX WARN: Code duplicated, block: B:146:0x0257  */
    /* JADX WARN: Code duplicated, block: B:148:0x025e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0267  */
    /* JADX WARN: Code duplicated, block: B:154:0x026f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:188:0x026e A[SYNTHETIC] */
    public static final boolean b0(db1 db1Var) {
        oi2 oi2Var;
        int i2;
        int length;
        cb1 cb1Var;
        va1 va1Var;
        db1 db1Var2;
        cb1 cb1Var2;
        yd ydVar;
        qa1 qa1Var;
        char c2;
        yd ydVar2;
        qa1 focusOwner = y64.N(db1Var).getFocusOwner();
        db1 db1Var3 = ((va1) focusOwner).l;
        cb1 cb1VarX0 = db1Var.x0();
        if (db1Var3 == db1Var) {
            db1Var.v0(cb1VarX0, cb1VarX0);
            return true;
        }
        oi2 oi2Var2 = null;
        if (db1Var3 != null || ((Boolean) ((va1) y64.N(db1Var).getFocusOwner()).a.invoke(null, null)).booleanValue()) {
            char c3 = 16;
            if (db1Var3 != null) {
                oi2Var = new oi2(0, new db1[16]);
                if (!db1Var3.getNode().isAttached()) {
                    po1.b("visitAncestors called on an unattached node");
                }
                of2 parent$ui_release = db1Var3.getNode().getParent$ui_release();
                ux1 ux1VarM = y64.M(db1Var3);
                while (ux1VarM != null) {
                    if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 1024) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                oi2 oi2Var3 = oi2Var2;
                                of2 of2VarE = parent$ui_release;
                                while (of2VarE != null) {
                                    if (of2VarE instanceof db1) {
                                        oi2Var.c((db1) of2VarE);
                                    } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                        int i3 = 0;
                                        for (of2 child$ui_release = ((ju0) of2VarE).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                                            if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    of2VarE = child$ui_release;
                                                } else {
                                                    if (oi2Var3 == null) {
                                                        oi2Var3 = new oi2(0, new of2[16]);
                                                    }
                                                    if (of2VarE != null) {
                                                        oi2Var3.c(of2VarE);
                                                        of2VarE = null;
                                                    }
                                                    oi2Var3.c(child$ui_release);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    of2VarE = y64.e(oi2Var3);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                            oi2Var2 = null;
                        }
                    }
                    ux1VarM = ux1VarM.t();
                    parent$ui_release = (ux1VarM == null || (ydVar2 = ux1VarM.N) == null) ? null : (es3) ydVar2.e;
                    oi2Var2 = null;
                }
            } else {
                oi2Var = null;
            }
            Object[] objArr = new db1[16];
            if (!db1Var.getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            of2 parent$ui_release2 = db1Var.getNode().getParent$ui_release();
            ux1 ux1VarM2 = y64.M(db1Var);
            boolean z = true;
            int i4 = 0;
            while (ux1VarM2 != null) {
                if ((((of2) ux1VarM2.N.f).getAggregateChildKindSet$ui_release() & 1024) != 0) {
                    while (parent$ui_release2 != null) {
                        if ((parent$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                            of2 of2VarE2 = parent$ui_release2;
                            oi2 oi2Var4 = null;
                            while (of2VarE2 != null) {
                                if (of2VarE2 instanceof db1) {
                                    db1 db1Var4 = (db1) of2VarE2;
                                    Boolean boolValueOf = oi2Var != null ? Boolean.valueOf(oi2Var.l(db1Var4)) : null;
                                    if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                        int i5 = i4 + 1;
                                        if (objArr.length < i5) {
                                            int length2 = objArr.length;
                                            Object[] objArr2 = new Object[Math.max(i5, length2 * 2)];
                                            System.arraycopy(objArr, 0, objArr2, 0, length2);
                                            objArr = objArr2;
                                        }
                                        objArr[i4] = db1Var4;
                                        i4 = i5;
                                    }
                                    if (db1Var4 == db1Var3) {
                                        z = false;
                                    }
                                } else if ((of2VarE2.getKindSet$ui_release() & 1024) != 0 && (of2VarE2 instanceof ju0)) {
                                    of2 child$ui_release2 = ((ju0) of2VarE2).d;
                                    int i6 = 0;
                                    while (child$ui_release2 != null) {
                                        if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                of2VarE2 = child$ui_release2;
                                            } else {
                                                if (oi2Var4 == null) {
                                                    oi2Var4 = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE2 != null) {
                                                    oi2Var4.c(of2VarE2);
                                                    of2VarE2 = null;
                                                }
                                                oi2Var4.c(child$ui_release2);
                                            }
                                            child$ui_release2 = child$ui_release2.getChild$ui_release();
                                            focusOwner = focusOwner;
                                        }
                                        child$ui_release2 = child$ui_release2.getChild$ui_release();
                                        focusOwner = focusOwner;
                                    }
                                    qa1Var = focusOwner;
                                    c2 = 16;
                                    if (i6 == 1) {
                                        c3 = 16;
                                        focusOwner = qa1Var;
                                    } else {
                                        of2VarE2 = y64.e(oi2Var4);
                                        c3 = c2;
                                        focusOwner = qa1Var;
                                    }
                                }
                                qa1Var = focusOwner;
                                c2 = 16;
                                of2VarE2 = y64.e(oi2Var4);
                                c3 = c2;
                                focusOwner = qa1Var;
                            }
                        }
                        parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        c3 = c3;
                        focusOwner = focusOwner;
                    }
                }
                qa1 qa1Var2 = focusOwner;
                char c4 = c3;
                ux1VarM2 = ux1VarM2.t();
                parent$ui_release2 = (ux1VarM2 == null || (ydVar = ux1VarM2.N) == null) ? null : (es3) ydVar.e;
                c3 = c4;
                focusOwner = qa1Var2;
            }
            qa1 qa1Var3 = focusOwner;
            if (!z || db1Var3 == null || x(db1Var3, false)) {
                p23.M(db1Var, new j(13, db1Var));
                int iOrdinal = db1Var.x0().ordinal();
                if (iOrdinal == 1 || iOrdinal == 3) {
                    ((va1) y64.N(db1Var).getFocusOwner()).g(db1Var);
                }
                cb1 cb1Var3 = cb1.l;
                cb1 cb1Var4 = cb1.d;
                if (oi2Var != null) {
                    int i7 = oi2Var.h - 1;
                    Object[] objArr3 = oi2Var.c;
                    if (i7 < objArr3.length) {
                        while (i7 >= 0) {
                            db1 db1Var5 = (db1) objArr3[i7];
                            if (((va1) qa1Var3).l == db1Var) {
                                db1Var5.v0(cb1Var4, cb1Var3);
                                i7--;
                            }
                        }
                        i2 = i4 - 1;
                        length = objArr.length;
                        cb1Var = cb1.c;
                        if (i2 < length) {
                            while (i2 >= 0) {
                                db1Var2 = (db1) objArr[i2];
                                if (((va1) qa1Var3).l == db1Var) {
                                    if (db1Var2 == db1Var3) {
                                        cb1Var2 = cb1Var;
                                    } else {
                                        cb1Var2 = cb1Var3;
                                    }
                                    db1Var2.v0(cb1Var2, cb1Var4);
                                    i2--;
                                }
                            }
                            va1Var = (va1) qa1Var3;
                            if (va1Var.l == db1Var) {
                                db1Var.v0(cb1VarX0, cb1Var);
                                if (va1Var.l != db1Var) {
                                    return true;
                                }
                            }
                        } else {
                            va1Var = (va1) qa1Var3;
                            if (va1Var.l == db1Var) {
                                db1Var.v0(cb1VarX0, cb1Var);
                                if (va1Var.l != db1Var) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        i2 = i4 - 1;
                        length = objArr.length;
                        cb1Var = cb1.c;
                        if (i2 < length) {
                            while (i2 >= 0) {
                                db1Var2 = (db1) objArr[i2];
                                if (((va1) qa1Var3).l == db1Var) {
                                    if (db1Var2 == db1Var3) {
                                        cb1Var2 = cb1Var;
                                    } else {
                                        cb1Var2 = cb1Var3;
                                    }
                                    db1Var2.v0(cb1Var2, cb1Var4);
                                    i2--;
                                }
                            }
                            va1Var = (va1) qa1Var3;
                            if (va1Var.l == db1Var) {
                                db1Var.v0(cb1VarX0, cb1Var);
                                if (va1Var.l != db1Var) {
                                    return true;
                                }
                            }
                        } else {
                            va1Var = (va1) qa1Var3;
                            if (va1Var.l == db1Var) {
                                db1Var.v0(cb1VarX0, cb1Var);
                                if (va1Var.l != db1Var) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    i2 = i4 - 1;
                    length = objArr.length;
                    cb1Var = cb1.c;
                    if (i2 < length) {
                        while (i2 >= 0) {
                            db1Var2 = (db1) objArr[i2];
                            if (((va1) qa1Var3).l == db1Var) {
                                if (db1Var2 == db1Var3) {
                                    cb1Var2 = cb1Var;
                                } else {
                                    cb1Var2 = cb1Var3;
                                }
                                db1Var2.v0(cb1Var2, cb1Var4);
                                i2--;
                            }
                        }
                        va1Var = (va1) qa1Var3;
                        if (va1Var.l == db1Var) {
                            db1Var.v0(cb1VarX0, cb1Var);
                            if (va1Var.l != db1Var) {
                                return true;
                            }
                        }
                    } else {
                        va1Var = (va1) qa1Var3;
                        if (va1Var.l == db1Var) {
                            db1Var.v0(cb1VarX0, cb1Var);
                            if (va1Var.l != db1Var) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0031 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0052
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.rq3 r7, defpackage.wr r8) {
        /*
            boolean r0 = r8 instanceof defpackage.xn0
            if (r0 == 0) goto L13
            r0 = r8
            xn0 r0 = (defpackage.xn0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            xn0 r0 = new xn0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            rq3 r7 = r0.c
            defpackage.g13.O(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.g13.O(r8)
        L31:
            r0.c = r7
            r0.h = r2
            zw2 r8 = defpackage.zw2.d
            java.lang.Object r8 = r7.a(r8, r0)
            hq0 r1 = defpackage.hq0.c
            if (r8 != r1) goto L40
            return r1
        L40:
            yw2 r8 = (defpackage.yw2) r8
            int r1 = r8.c
            java.util.List r8 = r8.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r8.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L69
            java.lang.Object r5 = r8.get(r4)
            dx2 r5 = (defpackage.dx2) r5
            boolean r6 = r5.b()
            if (r6 != 0) goto L31
            boolean r6 = r5.h
            if (r6 != 0) goto L31
            boolean r5 = r5.d
            if (r5 == 0) goto L31
            int r4 = r4 + 1
            goto L50
        L69:
            java.lang.Object r7 = r8.get(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr1.c(rq3, wr):java.lang.Object");
    }

    public static final Object c0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final za2 d(Matcher matcher, int i2, CharSequence charSequence) {
        if (matcher.find(i2)) {
            return new za2(matcher, charSequence);
        }
        return null;
    }

    public static final long e(xy3 xy3Var, long j2, long j3, cx1 cx1Var, ViewConfiguration viewConfiguration) {
        if (xy3Var != null) {
            pg2 pg2Var = xy3Var.b;
            if (cx1Var != null) {
                long jMo174xf127194 = cx1Var.mo174xf127194(j2);
                long jMo174xf127195 = cx1Var.mo174xf127194(j3);
                int I = I(pg2Var, jMo174xf127194, viewConfiguration);
                int I2 = I(pg2Var, jMo174xf127195, viewConfiguration);
                if (I != -1) {
                    if (I2 != -1) {
                        I = Math.min(I, I2);
                    }
                    I2 = I;
                } else if (I2 == -1) {
                    return jz3.b;
                }
                float fB = (pg2Var.b(I2) + pg2Var.f(I2)) / 2.0f;
                int i2 = (int) (jMo174xf127194 >> 32);
                int i3 = (int) (jMo174xf127195 >> 32);
                return pg2Var.h(new h43(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), fB - 0.1f, Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), fB + 0.1f), 0, TextInclusionStrategy$Companion.getAnyOverlap());
            }
        }
        return jz3.b;
    }

    public static final long f(z22 z22Var, h43 h43Var, h43 h43Var2, int i2, j93 j93Var) {
        long jK = K(z22Var, h43Var, i2, j93Var);
        if (jz3.c(jK)) {
            return jz3.b;
        }
        long jK2 = K(z22Var, h43Var2, i2, j93Var);
        if (jz3.c(jK2)) {
            return jz3.b;
        }
        int i3 = (int) (jK >> 32);
        int i4 = (int) (jK2 & 4294967295L);
        return p23.d(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static void f0() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final long g(az3 az3Var, h43 h43Var, h43 h43Var2, int i2, j93 j93Var) {
        long jL = L(az3Var, h43Var, i2, j93Var);
        if (jz3.c(jL)) {
            return jz3.b;
        }
        long jL2 = L(az3Var, h43Var2, i2, j93Var);
        if (jz3.c(jL2)) {
            return jz3.b;
        }
        int i3 = (int) (jL >> 32);
        int i4 = (int) (jL2 & 4294967295L);
        return p23.d(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static void g0(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final boolean h(xy3 xy3Var, int i2) {
        pg2 pg2Var = xy3Var.b;
        int iD = pg2Var.d(i2);
        return i2 == xy3Var.g(iD) || i2 == pg2Var.c(iD, false) ? xy3Var.h(i2) != xy3Var.a(i2) : xy3Var.a(i2) != xy3Var.a(i2 - 1);
    }

    public static void h0(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static final of2 i(iu0 iu0Var, int i2) {
        of2 child$ui_release = iu0Var.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & i2) == 0) {
            return null;
        }
        while (child$ui_release != null) {
            int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
            if ((kindSet$ui_release & 2) != 0) {
                return null;
            }
            if ((kindSet$ui_release & i2) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }

    public static void i0(EditorInfo editorInfo, CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            k1.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i2 >= 30) {
            k1.g(editorInfo, charSequence);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = charSequence.length();
        if (i5 < 0 || i3 > length) {
            j0(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            j0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            j0(editorInfo, charSequence, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(charSequence.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        j0(editorInfo, i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + iMin2), charSequence.subSequence(i3, iMin + i3)) : charSequence.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    public static final long j(int i2, CharSequence charSequence) {
        int iCharCount = i2;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!R(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i2 < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            if (!R(iCodePointAt)) {
                break;
            }
            i2 += Character.charCount(iCodePointAt);
        }
        return p23.d(iCharCount, i2);
    }

    public static void j0(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final long k(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
    }

    public static final long k0(h43 h43Var) {
        float f2 = h43Var.c - h43Var.a;
        return (((long) Float.floatToRawIntBits(h43Var.d - h43Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final float l(long j2) {
        int i2 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i2) == 0.0f && Float.intBitsToFloat((int) (j2 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static tm3 l0(int i2, Object obj) {
        float f2 = (i2 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new tm3(1.0f, f2, obj);
    }

    public static boolean m(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static void m0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void n0(String str) {
        eg0 eg0Var = new eg0(fq2.n("lateinit property ", str, " has not been initialized"));
        g0(eg0Var, kr1.class.getName());
        throw eg0Var;
    }

    public static ArrayList o(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new il(objArr, true));
    }

    public static t64 o0(int i2, int i3, b11 b11Var, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            b11Var = c11.a;
        }
        return new t64(i2, i3, b11Var);
    }

    public static int p(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            u41.k(ud2.q("fromIndex (0) is greater than toIndex (", ").", size));
        } else if (size > size2) {
            u41.g(size, size2, ") is greater than size (", "toIndex (");
        }
        int i2 = size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int iS = yh4.s((Comparable) arrayList.get(i4), comparable);
            if (iS < 0) {
                i3 = i4 + 1;
            } else {
                if (iS <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int p0(z12 z12Var) {
        List list = z12Var.k;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((a22) list.get(i3)).n;
        }
        return (i2 / list.size()) + z12Var.r;
    }

    public static c52 q(c52 c52Var) {
        c52Var.l();
        c52Var.h = true;
        return c52Var.d > 0 ? c52Var : c52.l;
    }

    public static final long r(yw2 yw2Var, boolean z) {
        List list = yw2Var.a;
        int size = list.size();
        long jI = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            dx2 dx2Var = (dx2) list.get(i3);
            if (dx2Var.d && dx2Var.h) {
                jI = ln2.i(jI, z ? dx2Var.c : dx2Var.g);
                i2++;
            }
        }
        if (i2 == 0) {
            return 9205357640488583168L;
        }
        return ln2.b(i2, jI);
    }

    public static final float s(yw2 yw2Var, boolean z) {
        long jR = r(yw2Var, z);
        float fD = 0.0f;
        if (ln2.c(jR, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = yw2Var.a;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            dx2 dx2Var = (dx2) list.get(i3);
            if (dx2Var.d && dx2Var.h) {
                i2++;
                fD = ln2.d(ln2.h(z ? dx2Var.c : dx2Var.g, jR)) + fD;
            }
        }
        return fD / i2;
    }

    public static final String w(rs1 rs1Var, tf3 tf3Var) {
        tf3Var.getClass();
        rs1Var.getClass();
        for (Annotation annotation : tf3Var.getAnnotations()) {
            if (annotation instanceof vs1) {
                return ((vs1) annotation).discriminator();
            }
        }
        return rs1Var.a.e;
    }

    public static final boolean x(db1 db1Var, boolean z) {
        int iOrdinal = db1Var.x0().ordinal();
        cb1 cb1Var = cb1.l;
        if (iOrdinal == 0) {
            ((va1) y64.N(db1Var).getFocusOwner()).g(null);
            db1Var.v0(cb1.c, cb1Var);
            return true;
        }
        if (iOrdinal == 1) {
            db1 db1VarV = av1.v(db1Var);
            if (!(db1VarV != null ? x(db1VarV, z) : true)) {
                return false;
            }
            db1Var.v0(cb1.d, cb1Var);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            u41.e();
            return false;
        }
        if (z) {
            ((va1) y64.N(db1Var).getFocusOwner()).g(null);
            db1Var.v0(cb1.h, cb1Var);
        }
        return z;
    }

    public static final long y(long j2, h43 h43Var) {
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        float fIntBitsToFloat2 = h43Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
            fIntBitsToFloat2 = h43Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            }
        }
        int i3 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
        float fIntBitsToFloat5 = h43Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i3);
            fIntBitsToFloat5 = h43Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i3);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public static int z(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public abstract void d0(t0 t0Var, t0 t0Var2);

    public abstract void e0(t0 t0Var, Thread thread);

    public abstract boolean t(u0 u0Var, q0 q0Var, q0 q0Var2);

    public abstract boolean u(u0 u0Var, Object obj, Object obj2);

    public abstract boolean v(u0 u0Var, t0 t0Var, t0 t0Var2);
}
