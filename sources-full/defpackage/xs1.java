package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xs1 implements an2 {
    public final /* synthetic */ int a;

    @Override // defpackage.h31
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new k31("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                bn2 bn2Var = (bn2) obj2;
                bn2Var.a(l13.g, entry.getKey());
                bn2Var.a(l13.h, entry.getValue());
                return;
            default:
                throw new k31("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
