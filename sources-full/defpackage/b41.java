package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class b41 {
    public static final String a = v72.h("EnqueueRunnable");

    /* JADX WARN: Code duplicated, block: B:169:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a7  */
    public static boolean a(qh4 qh4Var) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        List<fi4> list;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i;
        boolean z10;
        HashSet hashSetB = qh4.b(qh4Var);
        wh4 wh4Var = qh4Var.a;
        List list2 = qh4Var.d;
        int i2 = 0;
        String[] strArr = (String[]) hashSetB.toArray(new String[0]);
        String str = qh4Var.b;
        int i3 = qh4Var.c;
        wh4Var.b.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = wh4Var.c;
        boolean z11 = strArr != null && strArr.length > 0;
        if (z11) {
            int length = strArr.length;
            z = false;
            z2 = false;
            z3 = true;
            while (true) {
                if (i2 < length) {
                    String str2 = strArr[i2];
                    hi4 hi4VarL = workDatabase2.u().l(str2);
                    if (hi4VarL == null) {
                        v72.f().d(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        int i4 = hi4VarL.b;
                        z3 &= i4 == 3;
                        if (i4 == 4) {
                            z2 = true;
                        } else if (i4 == 6) {
                            z = true;
                        }
                        i2++;
                    }
                }
                z7 = false;
                qh4Var.g = true;
                return z7;
            }
        }
        z = false;
        z2 = false;
        z3 = true;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z11) {
            list = list2;
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            z5 = false;
            z6 = z5;
        } else {
            ArrayList arrayListM = workDatabase2.u().m(str);
            if (arrayListM.isEmpty()) {
                list = list2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
                z5 = false;
            } else if (i3 == 3 || i3 == 4) {
                bv0 bv0VarF = workDatabase2.f();
                ArrayList arrayList = new ArrayList();
                int size = arrayListM.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayListM.get(i5);
                    i5++;
                    gi4 gi4Var = (gi4) obj;
                    List list3 = list2;
                    String str3 = gi4Var.a;
                    bv0VarF.getClass();
                    boolean z12 = zIsEmpty;
                    WorkDatabase workDatabase3 = workDatabase2;
                    q73 q73VarA = q73.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                    q73VarA.i(1, str3);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) bv0VarF.d;
                    workDatabase_Impl.b();
                    Cursor cursorM = workDatabase_Impl.m(q73VarA);
                    try {
                        if (cursorM.moveToFirst()) {
                            z8 = false;
                            if (cursorM.getInt(0) != 0) {
                                z9 = true;
                            }
                            cursorM.close();
                            q73VarA.l();
                            if (z9) {
                                i = gi4Var.b;
                                if (i == 3) {
                                    z10 = true;
                                } else {
                                    z10 = z8;
                                }
                                boolean z13 = z3 & z10;
                                if (i == 4) {
                                    z2 = true;
                                } else if (i == 6) {
                                    z = true;
                                }
                                arrayList.add(gi4Var.a);
                                z3 = z13;
                            }
                            list2 = list3;
                            zIsEmpty = z12;
                            workDatabase2 = workDatabase3;
                        } else {
                            z8 = false;
                        }
                        z9 = z8;
                        cursorM.close();
                        q73VarA.l();
                        if (z9) {
                            i = gi4Var.b;
                            if (i == 3) {
                                z10 = true;
                            } else {
                                z10 = z8;
                            }
                            boolean z14 = z3 & z10;
                            if (i == 4) {
                                z2 = true;
                            } else if (i == 6) {
                                z = true;
                            }
                            arrayList.add(gi4Var.a);
                            z3 = z14;
                        }
                        list2 = list3;
                        zIsEmpty = z12;
                        workDatabase2 = workDatabase3;
                    } catch (Throwable th) {
                        cursorM.close();
                        q73VarA.l();
                        throw th;
                    }
                }
                list = list2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
                z5 = false;
                List list4 = arrayList;
                list4 = arrayList;
                if (i3 == 4 && (z || z2)) {
                    ji4 ji4VarU = workDatabase.u();
                    ArrayList arrayListM2 = ji4VarU.m(str);
                    int size2 = arrayListM2.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayListM2.get(i6);
                        i6++;
                        ji4VarU.d(((gi4) obj2).a);
                    }
                    z = false;
                    z2 = false;
                    list4 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) list4.toArray(strArr);
                z11 = strArr.length > 0;
            } else {
                if (i3 == 2) {
                    int size3 = arrayListM.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size3) {
                            Object obj3 = arrayListM.get(i7);
                            i7++;
                            int i8 = ((gi4) obj3).b;
                            if (i8 == 1 || i8 == 2) {
                                z7 = false;
                                qh4Var.g = true;
                                return z7;
                            }
                        }
                    }
                }
                workDatabase2.o(new p00(workDatabase2, str, wh4Var, 0));
                ji4 ji4VarU2 = workDatabase2.u();
                int size4 = arrayListM.size();
                int i9 = 0;
                while (i9 < size4) {
                    Object obj4 = arrayListM.get(i9);
                    i9++;
                    ji4VarU2.d(((gi4) obj4).a);
                }
                list = list2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
                z6 = true;
            }
            z6 = z5;
        }
        boolean z15 = z6;
        for (fi4 fi4Var : list) {
            hi4 hi4Var = fi4Var.b;
            UUID uuid = fi4Var.a;
            if (!z11 || z3) {
                hi4Var.n = jCurrentTimeMillis;
            } else if (z2) {
                hi4Var.b = 4;
            } else if (z) {
                hi4Var.b = 6;
            } else {
                hi4Var.b = 5;
            }
            if (hi4Var.b == 1) {
                z15 = true;
            }
            ji4 ji4VarU3 = workDatabase.u();
            hi4 hi4VarQ = jr1.Q(wh4Var.e, hi4Var);
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) ji4VarU3.a;
            workDatabase_Impl2.b();
            workDatabase_Impl2.c();
            try {
                ((av0) ji4VarU3.b).m(hi4VarQ);
                workDatabase_Impl2.p();
                workDatabase_Impl2.k();
                if (z11) {
                    for (String str4 : strArr) {
                        String string = uuid.toString();
                        string.getClass();
                        zu0 zu0Var = new zu0(string, str4);
                        bv0 bv0VarF2 = workDatabase.f();
                        WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) bv0VarF2.d;
                        workDatabase_Impl3.b();
                        workDatabase_Impl3.c();
                        try {
                            ((av0) bv0VarF2.h).m(zu0Var);
                            workDatabase_Impl3.p();
                            workDatabase_Impl3.k();
                        } catch (Throwable th2) {
                            workDatabase_Impl3.k();
                            throw th2;
                        }
                    }
                }
                mi4 mi4VarV = workDatabase.v();
                String string2 = uuid.toString();
                string2.getClass();
                Set set = fi4Var.c;
                mi4VarV.getClass();
                string2.getClass();
                set.getClass();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    li4 li4Var = new li4((String) it.next(), string2);
                    WorkDatabase_Impl workDatabase_Impl4 = (WorkDatabase_Impl) mi4VarV.d;
                    workDatabase_Impl4.b();
                    workDatabase_Impl4.c();
                    try {
                        ((av0) mi4VarV.h).m(li4Var);
                        workDatabase_Impl4.p();
                        workDatabase_Impl4.k();
                    } catch (Throwable th3) {
                        workDatabase_Impl4.k();
                        throw th3;
                    }
                }
                if (!z4) {
                    bi4 bi4VarS = workDatabase.s();
                    String string3 = uuid.toString();
                    string3.getClass();
                    ai4 ai4Var = new ai4(str, string3);
                    WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) bi4VarS.c;
                    workDatabase_Impl5.b();
                    workDatabase_Impl5.c();
                    try {
                        ((av0) bi4VarS.d).m(ai4Var);
                        workDatabase_Impl5.p();
                        workDatabase_Impl5.k();
                    } catch (Throwable th4) {
                        workDatabase_Impl5.k();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                workDatabase_Impl2.k();
                throw th5;
            }
        }
        z7 = z15;
        qh4Var.g = true;
        return z7;
    }
}
