package defpackage;

import java.util.Map;
import notrack.ai.data.avatars.AvatarView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rp implements ne1 {
    public final /* synthetic */ int c = 2;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ rp(String str, String str2, Map map, r10 r10Var) {
        this.d = str;
        this.h = str2;
        this.l = map;
        this.m = r10Var;
    }

    public /* synthetic */ rp(String str, String str2, AvatarView avatarView, String str3) {
        this.d = str;
        this.h = str2;
        this.m = avatarView;
        this.l = str3;
    }

    public /* synthetic */ rp(je1 je1Var, String str, je1 je1Var2, r10 r10Var) {
        this.h = je1Var;
        this.d = str;
        this.l = je1Var2;
        this.m = r10Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return zp.AvatarPickerSheet$lambda$81$lambda$80$lambda$76$lambda$47$lambda$46$lambda$45(this.d, (String) obj5, (AvatarView) obj3, (String) obj4, (ck0) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return q10.CarryGateDialog$lambda$28((je1) obj5, this.d, (je1) obj4, (r10) obj3, (ck0) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return q10.CarryGateDialog$lambda$34(this.d, (String) obj5, (Map) obj4, (r10) obj3, (ck0) obj, iIntValue3);
        }
    }
}
