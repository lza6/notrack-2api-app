package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e4 extends y3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ s3 d;

    public /* synthetic */ e4(ng0 ng0Var, String str, s3 s3Var, int i) {
        this.a = i;
        this.b = ng0Var;
        this.c = str;
        this.d = s3Var;
    }

    @Override // defpackage.y3
    public final void a(Object obj, jb jbVar) throws Exception {
        int i = this.a;
        s3 s3Var = this.d;
        String str = this.c;
        ng0 ng0Var = this.b;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = ng0Var.b;
                ArrayList arrayList = ng0Var.d;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    m51.m("Attempting to launch an unregistered ActivityResultLauncher with contract ", s3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    ng0Var.b(iIntValue, s3Var, obj, jbVar);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = ng0Var.d;
                Object obj3 = ng0Var.b.get(str);
                if (obj3 == null) {
                    m51.m("Attempting to launch an unregistered ActivityResultLauncher with contract ", s3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    ng0Var.b(iIntValue2, s3Var, obj, jbVar);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void b() {
        this.b.e(this.c);
    }
}
