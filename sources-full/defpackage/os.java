package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.TextToolbar;

/* JADX INFO: loaded from: classes.dex */
public final class os {
    public final /* synthetic */ TextToolbar a;
    public final /* synthetic */ gq0 b;

    public os(TextToolbar textToolbar, gq0 gq0Var) {
        this.a = textToolbar;
        this.b = gq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(wx3 wx3Var, h43 h43Var, so0 so0Var) throws Throwable {
        ks ksVar;
        TextToolbar textToolbar;
        wx3 wx3Var2;
        ms msVar;
        gq0 gq0Var;
        h43 h43Var2;
        wx3 wx3Var3 = wx3Var;
        if (so0Var instanceof ks) {
            ksVar = (ks) so0Var;
            int i = ksVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ksVar.q = i - Integer.MIN_VALUE;
            } else {
                ksVar = new ks(this, so0Var);
            }
        } else {
            ksVar = new ks(this, so0Var);
        }
        Object obj = ksVar.o;
        int i2 = ksVar.q;
        ns nsVar = null;
        if (i2 == 0) {
            g13.O(obj);
            boolean z = (jz3.c(wx3Var3.a.d().h) || wx3Var3.g) ? false : true;
            gq0 gq0Var2 = this.b;
            ms msVar2 = !z ? null : new ms(wx3Var3, gq0Var2, wx3Var3, 0);
            ksVar.c = gq0Var2;
            ksVar.d = wx3Var3;
            ksVar.h = wx3Var3;
            ksVar.l = msVar2;
            ksVar.m = h43Var;
            textToolbar = this.a;
            ksVar.n = textToolbar;
            ksVar.q = 1;
            Object objD = wx3Var3.d(ksVar);
            hq0 hq0Var = hq0.c;
            if (objD == hq0Var) {
                return hq0Var;
            }
            wx3Var2 = wx3Var3;
            msVar = msVar2;
            obj = objD;
            gq0Var = gq0Var2;
            h43Var2 = h43Var;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            textToolbar = ksVar.n;
            h43 h43Var3 = ksVar.m;
            ms msVar3 = ksVar.l;
            wx3 wx3Var4 = ksVar.h;
            wx3Var2 = ksVar.d;
            gq0Var = ksVar.c;
            g13.O(obj);
            h43Var2 = h43Var3;
            msVar = msVar3;
            wx3Var3 = wx3Var4;
        }
        TextToolbar textToolbar2 = textToolbar;
        ms msVar4 = !((Boolean) obj).booleanValue() ? null : new ms(wx3Var3, gq0Var, wx3Var2, 1);
        c cVar = wx3Var2.a;
        c cVar2 = wx3Var2.a;
        ms msVar5 = (jz3.c(cVar.d().h) || !wx3Var2.d || wx3Var2.e || wx3Var2.g) ? null : new ms(wx3Var2, gq0Var, wx3Var2, 2);
        ns nsVar2 = !(jz3.d(cVar2.d().h) != cVar2.d().d.length()) ? null : new ns(wx3Var2, wx3Var2, 0);
        if (wx3Var2.d && !wx3Var2.e && jz3.c(cVar2.d().h)) {
            nsVar = new ns(wx3Var2, wx3Var2, 1);
        }
        textToolbar2.showMenu(h43Var2, msVar, msVar4, msVar5, nsVar2, nsVar);
        return w84.a;
    }
}
