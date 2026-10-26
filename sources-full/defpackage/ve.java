package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.work.impl.WorkDatabase_Impl;

/* JADX INFO: loaded from: classes.dex */
public final class ve extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public Object h;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(Context context, Uri uri, String str, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3, so0 so0Var) {
        super(2, so0Var);
        this.c = 1;
        this.h = context;
        this.l = uri;
        this.m = str;
        this.n = mi2Var;
        this.o = mi2Var2;
        this.p = mi2Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, so0 so0Var, int i, boolean z) {
        super(2, so0Var);
        this.c = i;
        this.h = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve(Object obj, Object obj2, Object obj3, Object obj4, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(s62 s62Var, sh1 sh1Var, hi4 hi4Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 4;
        this.n = s62Var;
        this.o = sh1Var;
        this.p = hi4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(xi2 xi2Var, le1 le1Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 6;
        this.o = xi2Var;
        this.p = le1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                ve veVar = new ve((w20) this.m, (ue) this.n, (gn3) obj3, (gn3) obj2, so0Var, 0);
                veVar.l = obj;
                return veVar;
            case 1:
                return new ve((Context) this.h, (Uri) this.l, (String) this.m, (mi2) this.n, (mi2) obj3, (mi2) obj2, so0Var);
            case 2:
                return new ve((le1) this.l, (Bitmap) this.m, (mi2) this.n, (ah2) obj3, (mi2) obj2, so0Var, 2);
            case 3:
                ve veVar2 = new ve((hb0) this.h, (tw2) this.m, (Activity) this.n, (uw2) obj3, (String) obj2, so0Var, 3, false);
                veVar2.l = obj;
                return veVar2;
            case 4:
                ve veVar3 = new ve((s62) this.n, (sh1) obj3, (hi4) obj2, so0Var);
                veVar3.l = obj;
                return veVar3;
            case 5:
                return new ve((WorkDatabase_Impl) this.l, (bi4) this.m, (jy) this.n, (ii4) obj3, (jy) obj2, so0Var, 5);
            case 6:
                ve veVar4 = new ve((xi2) obj3, (le1) obj2, so0Var);
                veVar4.n = obj;
                return veVar4;
            case 7:
                ve veVar5 = new ve((q43) this.m, (xk2) this.n, (q43) obj3, (cl2) obj2, so0Var, 7);
                veVar5.l = obj;
                return veVar5;
            default:
                ve veVar6 = new ve((ix2) this.h, (oe1) this.m, (le1) this.n, (le1) obj3, (le1) obj2, so0Var, 8, false);
                veVar6.l = obj;
                return veVar6;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((ve) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 1:
                return ((ve) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((ve) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 3:
                return ((ve) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 4:
                return ((ve) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 5:
                return ((ve) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 6:
                return ((ve) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 7:
                return ((ve) create((gl2) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((ve) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:288:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:291:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:293:0x0603  */
    /* JADX WARN: Code duplicated, block: B:294:0x0605  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37, types: [int, zi2] */
    /* JADX WARN: Type inference failed for: r4v17, types: [gs1, hq0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [so0] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x036b -> B:157:0x0341). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:287:0x05e9 -> B:289:0x05ed). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
