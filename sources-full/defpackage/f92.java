package defpackage;

import notrack.ai.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class f92 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f92(MainActivity mainActivity, int i) {
        super(0);
        this.c = i;
        this.d = mainActivity;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        MainActivity mainActivity = this.d;
        switch (i) {
            case 0:
                return mainActivity.g();
            default:
                return mainActivity.e();
        }
    }
}
