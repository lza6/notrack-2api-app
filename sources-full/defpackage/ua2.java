package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ua2 {
    public final HashMap a;

    public ua2(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap();
                break;
            case 2:
                this.a = new HashMap(3);
                break;
            default:
                this.a = new HashMap(3);
                break;
        }
    }

    public void a(Class cls, wa2 wa2Var) {
        this.a.put(cls, wa2Var);
    }

    public void b(Class cls, dm3 dm3Var) {
        this.a.put(cls, dm3Var);
    }
}
