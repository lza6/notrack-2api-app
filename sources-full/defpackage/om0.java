package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class om0 implements l81 {
    public final /* synthetic */ int c;
    public final /* synthetic */ l81 d;

    public /* synthetic */ om0(l81 l81Var, int i) {
        this.c = i;
        this.d = l81Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.l81
    public final Object emit(Object obj, so0 so0Var) throws Throwable {
        nm0 nm0Var;
        i91 i91Var;
        int i = this.c;
        w84 w84Var = w84.a;
        l81 l81Var = this.d;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                if (so0Var instanceof nm0) {
                    nm0Var = (nm0) so0Var;
                    int i2 = nm0Var.d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        nm0Var.d = i2 - Integer.MIN_VALUE;
                    } else {
                        nm0Var = new nm0(this, so0Var);
                    }
                } else {
                    nm0Var = new nm0(this, so0Var);
                }
                Object obj2 = nm0Var.c;
                int i3 = nm0Var.d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        g13.O(obj2);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj2);
                if (!(obj instanceof an0)) {
                    return w84Var;
                }
                nm0Var.d = 1;
                return l81Var.emit(obj, nm0Var) == hq0Var ? hq0Var : w84Var;
            default:
                if (so0Var instanceof i91) {
                    i91Var = (i91) so0Var;
                    int i4 = i91Var.d;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        i91Var.d = i4 - Integer.MIN_VALUE;
                    } else {
                        i91Var = new i91(this, so0Var);
                    }
                } else {
                    i91Var = new i91(this, so0Var);
                }
                Object obj3 = i91Var.c;
                int i5 = i91Var.d;
                if (i5 != 0) {
                    if (i5 == 1) {
                        g13.O(obj3);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj3);
                if (obj == null) {
                    return w84Var;
                }
                i91Var.d = 1;
                return l81Var.emit(obj, i91Var) == hq0Var ? hq0Var : w84Var;
        }
    }
}
