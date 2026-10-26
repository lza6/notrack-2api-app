package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z61 {
    public final boolean a;
    public final boolean b;
    public final mt2 c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public /* synthetic */ z61(boolean z, boolean z2, mt2 mt2Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, mt2Var, l, l2, l3, l4, a31.c);
    }

    public z61(boolean z, boolean z2, mt2 mt2Var, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.a = z;
        this.b = z2;
        this.c = mt2Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = y92.W(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return ke0.D0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
