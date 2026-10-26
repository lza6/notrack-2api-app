package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nh2 extends s92 {
    public final yu2 l;
    public Object m;

    public nh2(yu2 yu2Var, Object obj, Object obj2) {
        super(obj, 0, obj2);
        this.l = yu2Var;
        this.m = obj2;
    }

    @Override // defpackage.s92, java.util.Map.Entry
    public final Object getValue() {
        return this.m;
    }

    @Override // defpackage.s92, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.m;
        this.m = obj;
        wu2 wu2Var = (wu2) this.l.d;
        ru2 ru2Var = wu2Var.l;
        Object obj3 = this.d;
        if (!ru2Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = wu2Var.h;
        if (!z) {
            ru2Var.put(obj3, obj);
        } else {
            if (!z) {
                m51.o();
                return null;
            }
            o64 o64Var = wu2Var.c[wu2Var.d];
            Object obj4 = o64Var.c[o64Var.h];
            ru2Var.put(obj3, obj);
            wu2Var.c(obj4 != null ? obj4.hashCode() : 0, ru2Var.d, obj4, 0);
        }
        wu2Var.o = ru2Var.l;
        return obj2;
    }
}
