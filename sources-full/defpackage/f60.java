package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import notrack.ai.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class f60 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f60(int i, so0 so0Var) {
        super(i, so0Var);
        this.c = 10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f60(Object obj, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(wz1 wz1Var, int i, so0 so0Var) {
        super(2, so0Var);
        this.c = 7;
        this.h = wz1Var;
        this.d = i;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = 2;
        switch (this.c) {
            case 0:
                return new f60((le1) this.h, so0Var, 0);
            case 1:
                return new f60((sf0) this.h, so0Var, 1);
            case 2:
                return new f60((ConstraintTrackingWorker) this.h, so0Var, i);
            case 3:
                return new f60((br0) this.h, so0Var, 3);
            case 4:
                return new f60((ns0) this.h, so0Var, 4);
            case 5:
                return new f60((t81) this.h, so0Var, 5);
            case 6:
                return new f60((gb1) this.h, so0Var, 6);
            case 7:
                return new f60((wz1) this.h, this.d, so0Var);
            case 8:
                return new f60((a92) this.h, so0Var, 8);
            case 9:
                return new f60((MainActivity) this.h, so0Var, 9);
            case 10:
                f60 f60Var = new f60(i, so0Var);
                f60Var.h = obj;
                return f60Var;
            case 11:
                return new f60((lv0) this.h, so0Var, 11);
            case 12:
                return new f60((e01) this.h, so0Var, 12);
            case 13:
                return new f60((sq3) this.h, so0Var, 13);
            case 14:
                return new f60((du3) this.h, so0Var, 14);
            case 15:
                return new f60((dr0) this.h, so0Var, 15);
            case 16:
                return new f60((r42) this.h, so0Var, 16);
            default:
                return new f60((r04) this.h, so0Var, 17);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 1:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 3:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 4:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 5:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 6:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 7:
                ((f60) create((pb3) obj, (so0) obj2)).invokeSuspend(w84Var);
                return w84Var;
            case 8:
                ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0.c;
            case 9:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 10:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 11:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 12:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 13:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 14:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 15:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 16:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((f60) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x01fa -> B:97:0x01eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0211 -> B:107:0x0214). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:99:0x01ef
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
