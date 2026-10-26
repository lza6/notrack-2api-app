package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s92 implements Map.Entry, gu1 {
    public final /* synthetic */ int c;
    public final Object d;
    public final Object h;

    public /* synthetic */ s92(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.c) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && kr1.n(entry.getKey(), this.d) && kr1.n(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.h;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.c) {
            case 0:
                Object obj = this.d;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.c) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.d);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
