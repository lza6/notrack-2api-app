package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rj1 extends x0 {
    public final rj1 m;
    public ArrayList n;

    public rj1(String str, int i, Map map, rj1 rj1Var) {
        super(str, i, map);
        this.m = rj1Var;
    }

    @Override // defpackage.x0
    public final Map e() {
        return (Map) this.l;
    }

    @Override // defpackage.x0
    public final rj1 j() {
        return this;
    }

    @Override // defpackage.x0
    public final boolean l() {
        return true;
    }

    public final void n(int i) {
        if (m()) {
            return;
        }
        this.d = i;
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((rj1) obj).n(i);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append((String) this.h);
        sb.append("', start=");
        sb.append(this.c);
        sb.append(", end=");
        sb.append(this.d);
        sb.append(", attributes=");
        sb.append((Map) this.l);
        sb.append(", parent=");
        rj1 rj1Var = this.m;
        sb.append(rj1Var != null ? (String) rj1Var.h : null);
        sb.append(", children=");
        sb.append(this.n);
        sb.append('}');
        return sb.toString();
    }
}
