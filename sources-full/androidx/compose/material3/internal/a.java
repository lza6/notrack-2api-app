package androidx.compose.material3.internal;

import androidx.compose.ui.c;
import defpackage.b9;
import defpackage.ft2;
import defpackage.g13;
import defpackage.hq0;
import defpackage.je1;
import defpackage.ji4;
import defpackage.k8;
import defpackage.kz0;
import defpackage.m8;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.nq2;
import defpackage.o8;
import defpackage.p8;
import defpackage.q8;
import defpackage.ri2;
import defpackage.so0;
import defpackage.u41;
import defpackage.uo0;
import defpackage.w84;
import defpackage.yo4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(je1 je1Var, ne1 ne1Var, uo0 uo0Var) throws Throwable {
        p8 p8Var;
        if (uo0Var instanceof p8) {
            p8Var = (p8) uo0Var;
            int i = p8Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p8Var.d = i - Integer.MIN_VALUE;
            } else {
                p8Var = new p8(uo0Var);
            }
        } else {
            p8Var = new p8(uo0Var);
        }
        Object obj = p8Var.c;
        int i2 = p8Var.d;
        so0 so0Var = null;
        int i3 = 1;
        try {
            if (i2 == 0) {
                g13.O(obj);
                q8 q8Var = new q8((Object) je1Var, ne1Var, so0Var, i3);
                p8Var.d = 1;
                Object objQ = yo4.q(q8Var, p8Var);
                hq0 hq0Var = hq0.c;
                if (objQ == hq0Var) {
                    return hq0Var;
                }
            } else {
                if (i2 != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
            }
        } catch (k8 unused) {
        }
        return w84.a;
    }

    public static c b(c cVar, ji4 ji4Var, boolean z, boolean z2) {
        return kz0.a(cVar, (b9) ji4Var.f, nq2.d, z, null, ((ft2) ji4Var.l).getValue() != null, new m8(ji4Var, null), z2, 32);
    }

    public static final Object c(ji4 ji4Var, Object obj, float f, mq3 mq3Var) {
        Object objB = ji4Var.b(obj, ri2.c, new o8(ji4Var, f, null), mq3Var);
        return objB == hq0.c ? objB : w84.a;
    }

    public static final c d(c cVar, ji4 ji4Var, ne1 ne1Var) {
        return cVar.then(new DraggableAnchorsElement(ji4Var, ne1Var));
    }
}
