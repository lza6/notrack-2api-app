package kotlinx.serialization.json;

import defpackage.gu1;
import defpackage.ke0;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.ts1;
import defpackage.yh4;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class JsonArray extends JsonElement implements List<JsonElement>, gu1 {
    public static final Companion Companion = new Companion();
    private final List<JsonElement> content;

    public final class Companion {
        public final qu1 serializer() {
            return ts1.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(List<? extends JsonElement> list) {
        list.getClass();
        this.content = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return this.content.contains((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.content.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return kr1.n(this.content, obj);
    }

    @Override // java.util.List
    public final JsonElement get(int i) {
        return this.content.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return this.content.indexOf((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<JsonElement> iterator() {
        return this.content.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return this.content.lastIndexOf((JsonElement) obj);
    }

    @Override // java.util.List
    public final ListIterator<JsonElement> listIterator() {
        return this.content.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<JsonElement> listIterator(int i) {
        return this.content.listIterator(i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ JsonElement remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ JsonElement set(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.content.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<JsonElement> subList(int i, int i2) {
        return this.content.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return yh4.a0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) yh4.b0(this, tArr);
    }

    public final String toString() {
        return ke0.D0(this.content, ",", "[", "]", null, 56);
    }
}
