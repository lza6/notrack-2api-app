package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xu2 extends i0 {
    public final /* synthetic */ int c;
    public final ru2 d;

    public /* synthetic */ xu2(int i, ru2 ru2Var) {
        this.c = i;
        this.d = ru2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.i0
    public final int b() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.c) {
            case 0:
                this.d.clear();
                break;
            default:
                this.d.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.c) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                ru2 ru2Var = this.d;
                Object obj2 = ru2Var.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && ru2Var.containsKey(entry.getKey());
            default:
                return this.d.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.c) {
            case 0:
                return new yu2(this.d);
            default:
                o64[] o64VarArr = new o64[8];
                for (int i = 0; i < 8; i++) {
                    o64VarArr[i] = new p64(1);
                }
                return new zu2(this.d, o64VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.c) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.d.remove(entry.getKey(), entry.getValue());
            default:
                ru2 ru2Var = this.d;
                if (!ru2Var.containsKey(obj)) {
                    return false;
                }
                ru2Var.remove(obj);
                return true;
        }
    }
}
