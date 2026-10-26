package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class av2 extends w0 {
    public final /* synthetic */ int c;
    public final uu2 d;

    public /* synthetic */ av2(uu2 uu2Var, int i) {
        this.c = i;
        this.d = uu2Var;
    }

    @Override // defpackage.t
    public final int b() {
        int i = this.c;
        uu2 uu2Var = this.d;
        switch (i) {
            case 0:
                uu2Var.getClass();
                break;
            default:
                uu2Var.getClass();
                break;
        }
        return uu2Var.d;
    }

    @Override // defpackage.t, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.c;
        uu2 uu2Var = this.d;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = uu2Var.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && uu2Var.containsKey(entry.getKey());
            default:
                return uu2Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.c) {
            case 0:
                n64 n64Var = this.d.c;
                o64[] o64VarArr = new o64[8];
                for (int i = 0; i < 8; i++) {
                    o64VarArr[i] = new p64(0);
                }
                return new bv2(n64Var, o64VarArr);
            default:
                n64 n64Var2 = this.d.c;
                o64[] o64VarArr2 = new o64[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    o64VarArr2[i2] = new p64(1);
                }
                return new bv2(n64Var2, o64VarArr2);
        }
    }
}
