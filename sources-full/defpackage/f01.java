package defpackage;

import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f01 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f01(le1 le1Var, int i) {
        super(1);
        this.c = i;
        this.d = le1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        long j;
        switch (this.c) {
            case 0:
                return new h01((i01) obj, this.d);
            case 1:
                return new iq1(((long) ((Number) this.d.invoke(Integer.valueOf((int) (((qq1) obj).a >> 32)))).intValue()) << 32);
            case 2:
                return new iq1(((long) ((Number) this.d.invoke(Integer.valueOf((int) (((qq1) obj).a & 4294967295L)))).intValue()) & 4294967295L);
            case 3:
                return new iq1(((long) ((Number) this.d.invoke(Integer.valueOf((int) (((qq1) obj).a & 4294967295L)))).intValue()) & 4294967295L);
            case 4:
                uk3 uk3Var = (uk3) obj;
                synchronized (vk3.b) {
                    j = vk3.d;
                    vk3.d = 1 + j;
                }
                return new r23(j, uk3Var, this.d);
            case 5:
                return this.d.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 6:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("offset", this.d);
                return w84.a;
            case 7:
                long j2 = ((tj3) obj).a;
                this.d.invoke(new od0(tj3.b(j2), tj3.a(j2)));
                return w84.a;
            case 8:
                pk3 pk3Var = (pk3) this.d.invoke((uk3) obj);
                synchronized (vk3.b) {
                    vk3.c = vk3.c.k(pk3Var.g());
                }
                return pk3Var;
            case 9:
                return this.d.invoke(Long.valueOf(((Number) obj).longValue()));
            default:
                InspectorInfo inspectorInfo2 = (InspectorInfo) obj;
                inspectorInfo2.setName("onConsumedWindowInsetsChanged");
                inspectorInfo2.getProperties().set("block", this.d);
                return w84.a;
        }
    }
}
