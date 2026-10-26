package defpackage;

import java.util.ArrayList;
import notrack.ai.data.chatmeta.FolderMeta;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g70 implements oe1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ mi2 h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ se1 n;
    public final /* synthetic */ se1 o;
    public final /* synthetic */ se1 p;

    public /* synthetic */ g70(je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, je1 je1Var5, boolean z, mi2 mi2Var) {
        this.l = je1Var;
        this.m = je1Var2;
        this.n = je1Var3;
        this.o = je1Var4;
        this.p = je1Var5;
        this.d = z;
        this.h = mi2Var;
    }

    public /* synthetic */ g70(FolderMeta folderMeta, ArrayList arrayList, boolean z, le1 le1Var, le1 le1Var2, ne1 ne1Var, mi2 mi2Var) {
        this.l = folderMeta;
        this.m = arrayList;
        this.d = z;
        this.n = le1Var;
        this.o = le1Var2;
        this.p = ne1Var;
        this.h = mi2Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        se1 se1Var = this.p;
        se1 se1Var2 = this.o;
        se1 se1Var3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return wa0.ChatItem$lambda$997$lambda$996((je1) obj5, (je1) obj4, (je1) se1Var3, (je1) se1Var2, (je1) se1Var, this.d, this.h, (lf0) obj, (ck0) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return wa0.ChatDrawer$lambda$837$lambda$836$lambda$808$lambda$807$lambda$804$lambda$803((FolderMeta) obj5, (ArrayList) obj4, this.d, (le1) se1Var3, (le1) se1Var2, (ne1) se1Var, this.h, (b02) obj, (ck0) obj2, iIntValue2);
        }
    }
}
