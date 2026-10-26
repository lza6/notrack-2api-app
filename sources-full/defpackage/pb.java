package defpackage;

import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pb extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public Object h;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(d43 d43Var, c43 c43Var, xf2 xf2Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 9;
        this.m = d43Var;
        this.n = c43Var;
        this.o = xf2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(hb0 hb0Var, List list, so0 so0Var) {
        super(2, so0Var);
        this.c = 1;
        this.n = hb0Var;
        this.o = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(ix2 ix2Var, oe1 oe1Var, le1 le1Var, py2 py2Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 10;
        this.l = ix2Var;
        this.n = oe1Var;
        this.m = le1Var;
        this.o = py2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.o = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb(Object obj, Object obj2, Object obj3, Object obj4, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                pb pbVar = new pb((PlatformTextInputSession) this.l, (le1) this.m, (rb) obj3, (t22) obj2, so0Var, 0);
                pbVar.h = obj;
                return pbVar;
            case 1:
                return new pb((hb0) obj3, (List) obj2, so0Var);
            case 2:
                return new pb((hb0) this.h, (String) this.l, (String) this.m, (String) obj3, (String) obj2, so0Var, 2);
            case 3:
                return new pb((String) this.h, (hb0) this.l, (String) this.m, (ArrayList) obj3, (String) obj2, so0Var, 3);
            case 4:
                pb pbVar2 = new pb((s94) this.l, (jn0) this.m, (a) obj3, (gs1) obj2, so0Var, 4);
                pbVar2.h = obj;
                return pbVar2;
            case 5:
                return new pb((z22) this.h, (gn3) this.l, (ly3) this.m, (xw3) obj3, (in1) obj2, so0Var, 5);
            case 6:
                return new pb((kx) this.h, (ey3) this.l, (z22) this.m, (yy3) obj3, (nn2) obj2, so0Var, 6);
            case 7:
                pb pbVar3 = new pb((WorkDatabase_Impl) this.l, (l81) this.m, (String[]) obj3, (ii4) obj2, so0Var, 7);
                pbVar3.h = obj;
                return pbVar3;
            case 8:
                return new pb((pm1) this.h, (g33) this.l, (ai3) this.m, (bg1) obj3, (am1) obj2, so0Var, 8);
            case 9:
                pb pbVar4 = new pb((d43) this.m, (c43) obj3, (xf2) obj2, so0Var);
                pbVar4.h = obj;
                return pbVar4;
            default:
                pb pbVar5 = new pb((ix2) this.l, (oe1) obj3, (le1) this.m, (py2) obj2, so0Var);
                pbVar5.h = obj;
                return pbVar5;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0.c;
            case 1:
                return ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 3:
                return ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 4:
                return ((pb) create((mc3) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 5:
                return ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 6:
                return ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 7:
                return ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 8:
                return ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 9:
                return ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((pb) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:225:0x055a  */
    /* JADX WARN: Code duplicated, block: B:227:0x0573  */
    /* JADX WARN: Code duplicated, block: B:230:0x057a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x0571 -> B:217:0x048d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r88) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
