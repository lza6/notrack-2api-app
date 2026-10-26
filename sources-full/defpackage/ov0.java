package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ov0 {
    public static final String a = v72.h("DiagnosticsWrkr");

    public static final String a(bi4 bi4Var, mi4 mi4Var, ir3 ir3Var, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hi4 hi4Var = (hi4) obj;
            vh4 vh4VarA = ki4.a(hi4Var);
            String str2 = hi4Var.a;
            gr3 gr3VarW = ir3Var.W(vh4VarA);
            Integer numValueOf = gr3VarW != null ? Integer.valueOf(gr3VarW.c) : null;
            bi4Var.getClass();
            q73 q73VarA = q73.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            q73VarA.i(1, str2);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) bi4Var.c;
            workDatabase_Impl.b();
            Cursor cursorM = workDatabase_Impl.m(q73VarA);
            try {
                ArrayList arrayList2 = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    arrayList2.add(cursorM.getString(0));
                }
                cursorM.close();
                q73VarA.l();
                String strD0 = ke0.D0(arrayList2, ",", null, null, null, 62);
                String strD1 = ke0.D0(mi4Var.h(str2), ",", null, null, null, 62);
                StringBuilder sbS = fq2.s("\n", str2, "\t ");
                sbS.append(hi4Var.c);
                sbS.append("\t ");
                sbS.append(numValueOf);
                sbS.append("\t ");
                switch (hi4Var.b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sbS.append(str);
                sbS.append("\t ");
                sbS.append(strD0);
                sbS.append("\t ");
                sbS.append(strD1);
                sbS.append('\t');
                sb.append(sbS.toString());
            } catch (Throwable th) {
                cursorM.close();
                q73VarA.l();
                throw th;
            }
        }
        return sb.toString();
    }
}
