package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.Clipboard;

/* JADX INFO: loaded from: classes.dex */
public final class k extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new k((gh2) this.h, (xi1) obj2, so0Var, 0);
            case 1:
                return new k((gh2) this.h, (yi1) obj2, so0Var, 1);
            case 2:
                return new k((rb) this.h, (fp1) obj2, so0Var, 2);
            case 3:
                k kVar = new k((rx2) obj2, so0Var, 3);
                kVar.h = obj;
                return kVar;
            case 4:
                return new k((c) this.h, (fy2) obj2, so0Var, 4);
            case 5:
                return new k((ki2) this.h, (fy2) obj2, so0Var, 5);
            case 6:
                k kVar2 = new k((vr) obj2, so0Var, 6);
                kVar2.h = obj;
                return kVar2;
            case 7:
                return new k((qx) this.h, (oh) obj2, so0Var, 7);
            case 8:
                k kVar3 = new k((y20) obj2, so0Var, 8);
                kVar3.h = obj;
                return kVar3;
            case 9:
                k kVar4 = new k((z20) obj2, so0Var, 9);
                kVar4.h = obj;
                return kVar4;
            case 10:
                return new k((h01) this.h, (gn3) obj2, so0Var, 10);
            case 11:
                k kVar5 = new k((tw2) obj2, so0Var, 11);
                kVar5.h = obj;
                return kVar5;
            case 12:
                return new k((hb0) this.h, (f50) obj2, so0Var, 12);
            case 13:
                return new k((zj0) this.h, (Runnable) obj2, so0Var, 13);
            case 14:
                return new k((st3) this.h, (wx3) obj2, so0Var, 14);
            case 15:
                return new k((ix2) this.h, (xw3) obj2, so0Var, 15);
            case 16:
                return new k((gs1) this.h, (dr0) obj2, so0Var, 16);
            case 17:
                return new k((ps0) this.h, (q8) obj2, so0Var, 17);
            case 18:
                return new k((t22) this.h, (qb) obj2, so0Var, 18);
            case 19:
                k kVar6 = new k((w20) obj2, so0Var, 19);
                kVar6.h = obj;
                return kVar6;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                k kVar7 = new k((lv0) obj2, so0Var, 20);
                kVar7.h = obj;
                return kVar7;
            case 21:
                return new k((oc3) this.h, (ne1) obj2, so0Var, 21);
            case 22:
                k kVar8 = new k((ne1) obj2, so0Var, 22);
                kVar8.h = obj;
                return kVar8;
            case 23:
                k kVar9 = new k((xk2) obj2, so0Var, 23);
                kVar9.h = obj;
                return kVar9;
            case 24:
                return new k((fl2) this.h, (wz2) obj2, so0Var, 24);
            case 25:
                k kVar10 = new k((i73) obj2, so0Var, 25);
                kVar10.h = obj;
                return kVar10;
            case 26:
                return new k((Clipboard) this.h, (hg) obj2, so0Var, 26);
            case 27:
                return new k((gh2) this.h, (ml3) obj2, so0Var, 27);
            case 28:
                k kVar11 = new k((uj3) obj2, so0Var, 28);
                kVar11.h = obj;
                return kVar11;
            default:
                return new k((uj3) this.h, (q8) obj2, so0Var, 29);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        hq0 hq0Var = hq0.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 1:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 2:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 3:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 4:
                ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0Var;
            case 5:
                ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0Var;
            case 6:
                return ((k) create((wz2) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 7:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 8:
                return ((k) create((wz2) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 9:
                return ((k) create((l81) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 10:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 11:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 12:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 13:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 14:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 15:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 16:
                ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0Var;
            case 17:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 18:
                ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
                return hq0Var;
            case 19:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 21:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 22:
                return ((k) create((gl2) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 23:
                return ((k) create((gl2) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 24:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 25:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 26:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 27:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            case 28:
                return ((k) create((ix2) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((k) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:385:0x0711  */
    /* JADX WARN: Code duplicated, block: B:387:0x071d  */
    /* JADX WARN: Code duplicated, block: B:390:0x0732  */
    /* JADX WARN: Code duplicated, block: B:392:0x0736  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v77, types: [gs1] */
    /* JADX WARN: Type inference failed for: r1v81, types: [gs1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x02b5 -> B:114:0x026e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:197:0x03d8 -> B:200:0x03dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:386:0x071b -> B:388:0x071f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wr
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
