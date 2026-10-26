package kotlinx.serialization.json;

import defpackage.gu1;
import defpackage.ke0;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.rt1;
import defpackage.s80;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, gu1 {
    public static final Companion Companion = new Companion();
    private final Map<String, JsonElement> content;

    public final class Companion {
        public final qu1 serializer() {
            return rt1.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(Map<String, ? extends JsonElement> map) {
        map.getClass();
        this.content = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement compute(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement computeIfAbsent(String str, Function<? super String, ? extends JsonElement> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement computeIfPresent(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.content.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return this.content.containsValue((JsonElement) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.content.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return kr1.n(this.content, obj);
    }

    @Override // java.util.Map
    public final JsonElement get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.content.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.content.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement merge(String str, JsonElement jsonElement, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement put(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement putIfAbsent(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement replace(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, JsonElement jsonElement, JsonElement jsonElement2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.content.size();
    }

    public final String toString() {
        return ke0.D0(this.content.entrySet(), ",", "{", "}", new s80(11), 24);
    }

    @Override // java.util.Map
    public final Collection<JsonElement> values() {
        return this.content.values();
    }
}
