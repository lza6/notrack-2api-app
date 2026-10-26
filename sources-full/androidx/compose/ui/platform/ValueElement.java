package androidx.compose.ui.platform;

import defpackage.kr1;

/* JADX INFO: loaded from: classes.dex */
public final class ValueElement {
    public static final int $stable = 8;
    private final String name;
    private final Object value;

    public ValueElement(String str, Object obj) {
        this.name = str;
        this.value = obj;
    }

    public static /* synthetic */ ValueElement copy$default(ValueElement valueElement, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = valueElement.name;
        }
        if ((i & 2) != 0) {
            obj = valueElement.value;
        }
        return valueElement.copy(str, obj);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final ValueElement copy(String str, Object obj) {
        return new ValueElement(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) obj;
        return kr1.n(this.name, valueElement.name) && kr1.n(this.value, valueElement.value);
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }
}
