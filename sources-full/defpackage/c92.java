package defpackage;

import notrack.ai.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c92 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainActivity d;

    public /* synthetic */ c92(MainActivity mainActivity, int i) {
        this.c = i;
        this.d = mainActivity;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        MainActivity mainActivity = this.d;
        ck0 ck0Var = (ck0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return MainActivity.onCreate$lambda$17$lambda$16$lambda$11$lambda$10(mainActivity, ck0Var, iIntValue);
            default:
                return MainActivity.onCreate$lambda$17(mainActivity, ck0Var, iIntValue);
        }
    }
}
