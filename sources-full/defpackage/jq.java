package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import notrack.ai.data.chatmeta.FolderMeta;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jq implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    public /* synthetic */ jq(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    public /* synthetic */ jq(Object obj, Object obj2, mi2 mi2Var, int i) {
        this.c = i;
        this.d = obj;
        this.l = obj2;
        this.h = mi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        boolean z = false;
        w84 w84Var = w84.a;
        Object obj2 = this.l;
        Object obj3 = this.h;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                mi2 mi2Var = (mi2) obj3;
                mi2Var.setValue(qq.g(pq0.a((pq0) mi2Var.getValue(), 0, py.w(((Float) obj).floatValue(), 1.0f, 4.0f), 0.0f, 0.0f, 13), (Bitmap) obj4, ((bt2) ((ah2) obj2)).f()));
                return w84Var;
            case 1:
                le1 le1Var = (le1) obj4;
                le1 le1Var2 = (le1) obj3;
                tt ttVar = (tt) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.equals("own")) {
                    le1Var.invoke("pt");
                } else {
                    le1Var2.invoke(tt.b(ttVar, null, null, 0, str, null, 0, 55));
                }
                return w84Var;
            case 2:
                je1 je1Var = (je1) obj4;
                mi2 mi2Var2 = (mi2) obj3;
                mi2 mi2Var3 = (mi2) obj2;
                cb1 cb1Var = (cb1) obj;
                cb1Var.getClass();
                if (cb1Var.b()) {
                    mi2Var2.setValue(Boolean.TRUE);
                } else if (((Boolean) mi2Var2.getValue()).booleanValue() && !((Boolean) mi2Var3.getValue()).booleanValue()) {
                    je1Var.invoke();
                }
                return w84Var;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj4;
                Context context = (Context) obj2;
                mi2 mi2Var4 = (mi2) obj3;
                if (((Boolean) obj).booleanValue()) {
                    sharedPreferences.edit().putBoolean("notifyOptOut", false).apply();
                }
                if (new rm2(context).b.areNotificationsEnabled() && !sharedPreferences.getBoolean("notifyOptOut", false)) {
                    z = true;
                }
                mi2Var4.setValue(Boolean.valueOf(z));
                return w84Var;
            case 4:
                ne1 ne1Var = (ne1) obj4;
                mi2 mi2Var5 = (mi2) obj3;
                mi2 mi2Var6 = (mi2) obj2;
                ((vv1) obj).getClass();
                if (!mo3.C0((String) mi2Var5.getValue())) {
                    ne1Var.invoke((String) mi2Var5.getValue(), null);
                    mi2Var6.setValue(Boolean.FALSE);
                }
                return w84Var;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                ((ne1) obj4).invoke(((FolderMeta) obj2).getId(), str2);
                ((mi2) obj3).setValue(null);
                return w84Var;
            case 6:
                ia0 ia0Var = (ia0) obj4;
                ir3 ir3Var = (ir3) obj3;
                ia0 ia0Var2 = (ia0) obj2;
                wk wkVar = (wk) obj;
                if (wkVar.b == 11) {
                    ia0Var.invoke();
                } else if (wkVar.a == 2) {
                    Integer num = wkVar.c;
                    if ((num != null ? num.intValue() : -1) >= 14 && wkVar.a(ct4.a(1).a()) != null) {
                        np4 np4VarV = ir3Var.V();
                        e4 e4Var = (e4) ir3Var.c;
                        ct4 ct4VarA = ct4.a(1).a();
                        np4VarV.getClass();
                        np4.b(wkVar, e4Var, ct4VarA);
                    } else if (wkVar.a(ct4.a(0).a()) != null) {
                        ia0Var2.invoke();
                    }
                }
                return w84Var;
            case 7:
                ms2 ms2Var = (ms2) obj4;
                ms2 ms2Var2 = (ms2) obj3;
                ms2 ms2Var3 = (ms2) obj2;
                sm smVar = (sm) obj;
                if (smVar instanceof qm) {
                    return ms2Var != null ? new qm(ms2Var) : (qm) smVar;
                }
                if (!(smVar instanceof pm)) {
                    return smVar;
                }
                pm pmVar = (pm) smVar;
                s41 s41Var = pmVar.b;
                if (s41Var.c instanceof um2) {
                    return ms2Var2 != null ? new pm(ms2Var2, s41Var) : pmVar;
                }
                return ms2Var3 != null ? new pm(ms2Var3, s41Var) : pmVar;
            default:
                le1 le1Var3 = (le1) obj4;
                le1 le1Var4 = (le1) obj3;
                le1 le1Var5 = (le1) obj2;
                sm smVar2 = (sm) obj;
                if (smVar2 instanceof qm) {
                    if (le1Var3 != null) {
                        le1Var3.invoke(smVar2);
                    }
                } else if (smVar2 instanceof rm) {
                    if (le1Var4 != null) {
                        le1Var4.invoke(smVar2);
                    }
                } else if (smVar2 instanceof pm) {
                    if (le1Var5 != null) {
                        le1Var5.invoke(smVar2);
                    }
                } else if (!(smVar2 instanceof om)) {
                    u41.e();
                    return null;
                }
                return w84Var;
        }
    }
}
