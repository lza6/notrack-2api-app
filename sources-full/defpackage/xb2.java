package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface xb2 extends er1 {
    wb2 g0(int i, int i2, Map map, le1 le1Var);

    default wb2 s(int i, int i2, Map map, le1 le1Var) {
        return g0(i, i2, map, le1Var);
    }
}
