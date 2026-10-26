package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class zd extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
        this.q = obj6;
        this.r = obj7;
        this.s = obj8;
        this.t = obj9;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.t;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.q;
        Object obj6 = this.p;
        Object obj7 = this.o;
        Object obj8 = this.n;
        Object obj9 = this.m;
        Object obj10 = this.l;
        switch (i) {
            case 0:
                zd zdVar = new zd((ki2) obj10, (c) obj9, (az3) obj8, (fy2) obj7, (PlatformTextInputSession) obj6, (in1) obj5, (le1) obj4, (je1) obj3, (ViewConfiguration) obj2, so0Var, 0);
                zdVar.h = obj;
                return zdVar;
            default:
                zd zdVar2 = new zd((hb0) obj10, (gq0) obj9, (Context) obj8, (lh1) obj7, (h01) obj6, (mi2) obj5, (gn3) obj4, (g22) obj3, (mi2) obj2, so0Var, 1);
                zdVar2.h = obj;
                return zdVar2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                ((zd) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return hq0.c;
            default:
                return ((zd) create(gq0Var, so0Var)).invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        int i = this.c;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.r;
        Object obj6 = this.q;
        Object obj7 = this.p;
        Object obj8 = this.l;
        hq0 hq0Var = hq0.c;
        Object obj9 = this.o;
        Object obj10 = this.n;
        Object obj11 = this.m;
        switch (i) {
            case 0:
                c cVar = (c) obj11;
                fy2 fy2Var = (fy2) obj9;
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    gq0 gq0Var = (gq0) this.h;
                    obj2 = null;
                    py.F(gq0Var, null, jq0.l, new k(cVar, fy2Var, null, 4), 1);
                    ki2 ki2Var = (ki2) obj8;
                    if (ki2Var != null) {
                        py.F(gq0Var, null, null, new k(ki2Var, fy2Var, null, 5), 3);
                    }
                    final br0 br0Var = new br0(cVar, (az3) obj10, fy2Var, gq0Var);
                    final c cVar2 = (c) obj11;
                    final in1 in1Var = (in1) obj6;
                    final fy2 fy2Var2 = (fy2) obj9;
                    final le1 le1Var = (le1) obj5;
                    final az3 az3Var = (az3) obj10;
                    final je1 je1Var = (je1) obj4;
                    final ViewConfiguration viewConfiguration = (ViewConfiguration) obj3;
                    PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: wd
                        @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
                        public final InputConnection createInputConnection(EditorInfo editorInfo) {
                            c cVar3 = cVar2;
                            yd ydVar = new yd(new gj(cVar3), cVar3, fy2Var2, le1Var, br0Var, az3Var, je1Var, viewConfiguration);
                            gm4.R(editorInfo, cVar3.d(), cVar3.d().h, in1Var);
                            return new pn3(ydVar, editorInfo);
                        }
                    };
                    this.d = 1;
                    if (((PlatformTextInputSession) obj7).startInputMethod(platformTextInputMethodRequest, this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i2 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                    obj2 = null;
                }
                u41.p();
                return obj2;
            default:
                gq0 gq0Var2 = (gq0) this.h;
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    x20 x20Var = ((hb0) obj8).f;
                    z90 z90Var = new z90((gq0) obj11, (Context) obj10, (lh1) obj9, (h01) obj7, gq0Var2, (mi2) obj6, (gn3) obj5, (g22) obj4, (mi2) obj3);
                    this.h = null;
                    this.d = 1;
                    if (x20Var.a(z90Var, this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84.a;
        }
    }
}
