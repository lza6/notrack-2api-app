package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class qh4 {
    public static final String i = v72.h("WorkContinuationImpl");
    public final wh4 a;
    public final String b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public t73 h;

    public qh4(wh4 wh4Var, String str, int i2, List list, int i3) {
        this.a = wh4Var;
        this.b = str;
        this.c = i2;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i2 == 1 && ((fi4) list.get(i4)).b.u != LongCompanionObject.MAX_VALUE) {
                u41.k("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((fi4) list.get(i4)).a.toString();
            string.getClass();
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static HashSet b(qh4 qh4Var) {
        HashSet hashSet = new HashSet();
        qh4Var.getClass();
        return hashSet;
    }

    public final t73 a() {
        String str;
        if (this.g) {
            v72.f().i(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            wh4 wh4Var = this.a;
            t73 t73Var = wh4Var.b.m;
            int i2 = this.c;
            if (i2 == 1) {
                str = "REPLACE";
            } else if (i2 == 2) {
                str = "KEEP";
            } else if (i2 == 3) {
                str = "APPEND";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str = "APPEND_OR_REPLACE";
            }
            this.h = py.H(t73Var, "EnqueueRunnable_".concat(str), wh4Var.d.a, new wl(21, this));
        }
        return this.h;
    }
}
