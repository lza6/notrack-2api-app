package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ke2 extends ag3 {
    public final List c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ke2(String str, ArrayList arrayList) {
        String str2;
        str.getClass();
        if (arrayList.size() == 1) {
            str2 = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        super(str2, null);
        this.c = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke2(List list, String str, ke2 ke2Var) {
        super(str, ke2Var);
        list.getClass();
        this.c = list;
    }
}
