package androidx.compose.ui.platform;

import ai.notrack.app.R;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import defpackage.g93;
import defpackage.h93;
import defpackage.hg0;
import defpackage.i93;
import defpackage.je1;
import defpackage.se1;
import defpackage.t73;
import defpackage.t93;
import defpackage.u93;
import defpackage.un3;
import defpackage.w84;
import defpackage.ww1;
import defpackage.zk3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt {
    private static final Class<? extends Object>[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements je1 {
        final /* synthetic */ t93 $androidxRegistry;
        final /* synthetic */ String $key;
        final /* synthetic */ boolean $registered;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, t93 t93Var, String str) {
            super(0);
            this.$registered = z;
            this.$androidxRegistry = t93Var;
            this.$key = str;
        }

        @Override // defpackage.je1
        public /* bridge */ /* synthetic */ Object invoke() {
            m71invoke();
            return w84.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m71invoke() {
            if (this.$registered) {
                t93 t93Var = this.$androidxRegistry;
                String str = this.$key;
                t93Var.getClass();
                str.getClass();
                t93Var.a.d(str);
            }
        }
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(View view, u93 u93Var) {
        Object parent = view.getParent();
        parent.getClass();
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(strValueOf, u93Var);
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(String str, u93 u93Var) {
        boolean z;
        String str2 = g93.class.getSimpleName() + ':' + str;
        t93 t93VarB = u93Var.b();
        Bundle bundleA = t93VarB.a(str2);
        Map<String, List<Object>> map = bundleA != null ? toMap(bundleA) : null;
        DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 = DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.INSTANCE;
        un3 un3Var = i93.a;
        h93 h93Var = new h93(map, disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1);
        try {
            z = true;
            t93VarB.c(str2, new hg0(1 == true ? 1 : 0, h93Var));
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new DisposableSaveableStateRegistry(h93Var, new AnonymousClass1(z, t93VarB, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle DisposableSaveableStateRegistry$lambda$0(g93 g93Var) {
        return toBundle(g93Var.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof zk3) {
            zk3 zk3Var = (zk3) obj;
            if (zk3Var.a() == t73.t || zk3Var.a() == t73.A || zk3Var.a() == t73.x) {
                Object value = zk3Var.getValue();
                if (value == null) {
                    return true;
                }
                return canBeSavedToBundle(value);
            }
        } else if (!(obj instanceof se1) || !(obj instanceof Serializable)) {
            for (Class<? extends Object> cls : AcceptableClasses) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            parcelableArrayList.getClass();
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
