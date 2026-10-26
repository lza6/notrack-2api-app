package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class su2 extends uu2 implements a {
    public static final su2 l = new su2(n64.e, 0);

    @Override // defpackage.uu2, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof vk0) {
            return super.containsKey((vk0) obj);
        }
        return false;
    }

    @Override // defpackage.uu2, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof bb4) {
            return super.containsValue((bb4) obj);
        }
        return false;
    }

    @Override // defpackage.uu2, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof vk0) {
            return (bb4) super.get((vk0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof vk0) ? obj2 : (bb4) super.getOrDefault((vk0) obj, (bb4) obj2);
    }
}
