package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ra2 extends gb2 {
    public final Map o;

    public ra2(Map map) {
        this.o = map;
    }

    @Override // defpackage.gb2
    public final void O(ir3 ir3Var, qa2 qa2Var) {
        ds3 ds3VarW;
        ds3 ds3VarW2;
        ArrayList arrayList = qa2Var.c;
        if (arrayList.size() > 0) {
            for (sj1 sj1Var : Collections.unmodifiableList(arrayList)) {
                if (sj1Var.m() && (ds3VarW2 = W((String) sj1Var.h)) != null) {
                    ds3VarW2.a(ir3Var, this, sj1Var);
                }
            }
            arrayList.clear();
        } else {
            for (sj1 sj1Var2 : Collections.EMPTY_LIST) {
                if (sj1Var2.m() && (ds3VarW = W((String) sj1Var2.h)) != null) {
                    ds3VarW.a(ir3Var, this, sj1Var2);
                }
            }
        }
        fp1 fp1Var = new fp1();
        fp1Var.d = this;
        fp1Var.c = ir3Var;
        rj1 rj1Var = qa2Var.d;
        while (true) {
            rj1 rj1Var2 = rj1Var.m;
            if (rj1Var2 == null) {
                break;
            } else {
                rj1Var = rj1Var2;
            }
        }
        ArrayList arrayList2 = rj1Var.n;
        List listUnmodifiableList = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        if (listUnmodifiableList.size() > 0) {
            fp1Var.c(listUnmodifiableList);
        } else {
            fp1Var.c(Collections.EMPTY_LIST);
        }
        Map map = Collections.EMPTY_MAP;
        qa2Var.d = new rj1(BuildConfig.VERSION_NAME, 0, map, null);
        qa2Var.c.clear();
        qa2Var.d = new rj1(BuildConfig.VERSION_NAME, 0, map, null);
    }

    @Override // defpackage.gb2
    public final ds3 W(String str) {
        return (ds3) this.o.get(str);
    }
}
