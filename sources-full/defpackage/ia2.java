package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class ia2 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 2;
    public /* synthetic */ boolean d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia2(Context context, so0 so0Var) {
        super(2, so0Var);
        this.h = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia2(by2 by2Var, boolean z, so0 so0Var) {
        super(2, so0Var);
        this.h = by2Var;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia2(boolean z, fh2 fh2Var, so0 so0Var) {
        super(2, so0Var);
        this.d = z;
        this.h = fh2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new ia2(this.d, (fh2) obj2, so0Var);
            case 1:
                return new ia2((by2) obj2, this.d, so0Var);
            default:
                ia2 ia2Var = new ia2((Context) obj2, so0Var);
                ia2Var.d = ((Boolean) obj).booleanValue();
                return ia2Var;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ((ia2) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                break;
            case 1:
                ((ia2) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ia2) create(bool, (so0) obj2)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        cr1 cr1Var;
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                g13.O(obj);
                if (!this.d) {
                    ((ct2) ((fh2) obj2)).h(0);
                }
                break;
            case 1:
                g13.O(obj);
                by2 by2Var = (by2) obj2;
                boolean z = this.d;
                if (!z && by2Var.a && (cr1Var = by2Var.f) != null) {
                    cr1Var.b();
                }
                by2Var.a = z;
                je1 je1Var = by2Var.c;
                if (je1Var != null) {
                    je1Var.invoke();
                }
                break;
            default:
                g13.O(obj);
                bs2.a((Context) obj2, RescheduleReceiver.class, this.d);
                break;
        }
        return w84Var;
    }
}
