package defpackage;

import android.database.Cursor;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
public final class wr3 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public wr3(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public static final wr3 a(be1 be1Var, String str) {
        Map mapB;
        Cursor cursorL = be1Var.L(new d5(fq2.n("PRAGMA table_info(`", str, "`)"), 14));
        try {
            if (cursorL.getColumnCount() <= 0) {
                mapB = a31.c;
                cursorL.close();
            } else {
                int columnIndex = cursorL.getColumnIndex("name");
                int columnIndex2 = cursorL.getColumnIndex(TeXSymbolParser.TYPE_ATTR);
                int columnIndex3 = cursorL.getColumnIndex("notnull");
                int columnIndex4 = cursorL.getColumnIndex("pk");
                int columnIndex5 = cursorL.getColumnIndex("dflt_value");
                o92 o92Var = new o92();
                while (cursorL.moveToNext()) {
                    String string = cursorL.getString(columnIndex);
                    String string2 = cursorL.getString(columnIndex2);
                    boolean z = cursorL.getInt(columnIndex3) != 0;
                    int i = cursorL.getInt(columnIndex4);
                    String string3 = cursorL.getString(columnIndex5);
                    string.getClass();
                    string2.getClass();
                    o92Var.put(string, new sr3(i, 2, string, string2, string3, z));
                }
                mapB = o92Var.b();
                cursorL.close();
            }
            Cursor cursorL2 = be1Var.L(new d5(fq2.n("PRAGMA foreign_key_list(`", str, "`)"), 14));
            try {
                int columnIndex6 = cursorL2.getColumnIndex("id");
                int columnIndex7 = cursorL2.getColumnIndex("seq");
                int columnIndex8 = cursorL2.getColumnIndex("table");
                int columnIndex9 = cursorL2.getColumnIndex("on_delete");
                int columnIndex10 = cursorL2.getColumnIndex("on_update");
                List listY = xp1.y(cursorL2);
                cursorL2.moveToPosition(-1);
                ig3 ig3Var = new ig3();
                while (cursorL2.moveToNext()) {
                    if (cursorL2.getInt(columnIndex7) == 0) {
                        int i2 = cursorL2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listY) {
                            int i4 = columnIndex7;
                            List list = listY;
                            if (((ur3) obj).c == i2) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i4;
                            listY = list;
                        }
                        int i5 = columnIndex7;
                        List list2 = listY;
                        int i6 = 0;
                        for (int size = arrayList3.size(); i6 < size; size = size) {
                            Object obj2 = arrayList3.get(i6);
                            i6++;
                            ur3 ur3Var = (ur3) obj2;
                            arrayList.add(ur3Var.h);
                            arrayList2.add(ur3Var.l);
                        }
                        String string4 = cursorL2.getString(columnIndex8);
                        string4.getClass();
                        String string5 = cursorL2.getString(columnIndex9);
                        string5.getClass();
                        String string6 = cursorL2.getString(columnIndex10);
                        string6.getClass();
                        ig3Var.add(new tr3(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = i3;
                        columnIndex7 = i5;
                        listY = list2;
                    }
                }
                ig3 ig3VarP = py.p(ig3Var);
                cursorL2.close();
                Cursor cursorL3 = be1Var.L(new d5("PRAGMA index_list(`" + str + "`)", 14));
                try {
                    int columnIndex11 = cursorL3.getColumnIndex("name");
                    int columnIndex12 = cursorL3.getColumnIndex("origin");
                    int columnIndex13 = cursorL3.getColumnIndex("unique");
                    ig3 ig3VarP2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorL3.close();
                    } else {
                        ig3 ig3Var2 = new ig3();
                        while (cursorL3.moveToNext()) {
                            if ("c".equals(cursorL3.getString(columnIndex12))) {
                                String string7 = cursorL3.getString(columnIndex11);
                                boolean z2 = cursorL3.getInt(columnIndex13) == 1;
                                string7.getClass();
                                vr3 vr3VarZ = xp1.z(be1Var, string7, z2);
                                if (vr3VarZ == null) {
                                    cursorL3.close();
                                } else {
                                    ig3Var2.add(vr3VarZ);
                                }
                            }
                        }
                        ig3VarP2 = py.p(ig3Var2);
                        cursorL3.close();
                    }
                    return new wr3(str, mapB, ig3VarP, ig3VarP2);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        jr1.i(cursorL3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jr1.i(cursorL2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jr1.i(cursorL, th5);
                throw th6;
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3)) {
            return false;
        }
        wr3 wr3Var = (wr3) obj;
        if (!this.a.equals(wr3Var.a) || !this.b.equals(wr3Var.b) || !kr1.n(this.c, wr3Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = wr3Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
