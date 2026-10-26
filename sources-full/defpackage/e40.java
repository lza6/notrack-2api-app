package defpackage;

import androidx.compose.ui.platform.ClipboardManager;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e40 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ e40(ClipboardManager clipboardManager, String str, lh1 lh1Var, gq0 gq0Var, mi2 mi2Var) {
        this.c = 2;
        this.h = clipboardManager;
        this.d = str;
        this.l = lh1Var;
        this.m = gq0Var;
        this.n = mi2Var;
    }

    public /* synthetic */ e40(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
        this.m = obj4;
        this.n = obj5;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj = this.n;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.d;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                String str = (String) obj4;
                File file = (File) obj5;
                le1 le1Var = (le1) obj3;
                le1 le1Var2 = (le1) obj2;
                tt ttVar = (tt) obj;
                if (kr1.n(str, "own") && (file == null || !file.isFile())) {
                    le1Var.invoke("fx");
                } else {
                    le1Var2.invoke(tt.b(ttVar, null, str, 0, null, null, 0, 61));
                }
                break;
            case 1:
                ne1 ne1Var = (ne1) obj4;
                ne1 ne1Var2 = (ne1) obj5;
                boolean zB1 = wa0.b1((mi2) obj3);
                String str2 = (String) ((mi2) obj2).getValue();
                String str3 = (String) ((mi2) obj).getValue();
                if (!zB1) {
                    ne1Var.invoke(str2, str3);
                } else {
                    ne1Var2.invoke(str2, str3);
                }
                break;
            default:
                mi2 mi2Var = (mi2) obj;
                ((ClipboardManager) obj5).setText(new hg((String) obj4));
                ((lh1) obj3).mo63x70bb4fce(9);
                mi2Var.setValue(Boolean.TRUE);
                py.F((gq0) obj2, null, null, new ta0(mi2Var, null, 1), 3);
                break;
        }
        return w84Var;
    }
}
