package defpackage;

import android.os.Bundle;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg0 implements s93 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hg0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.s93
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ng0 ng0Var = ((qg0) obj).q;
                ng0Var.getClass();
                LinkedHashMap linkedHashMap = ng0Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ng0Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ng0Var.g));
                return bundle;
            case 1:
                return DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0((h93) obj);
            case 2:
                zh zhVar = (zh) obj;
                while (zh.n(((zc1) zhVar.C.c).x)) {
                }
                zhVar.D.e(f32.ON_STOP);
                return new Bundle();
            case 3:
                return ((nd1) obj).Y();
            default:
                return k93.a((k93) obj);
        }
    }
}
