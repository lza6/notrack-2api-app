package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class InspectorInfo {
    public static final int $stable = 8;
    private String name;
    private final ValueElementSequence properties = new ValueElementSequence();
    private Object value;

    public final String getName() {
        return this.name;
    }

    public final ValueElementSequence getProperties() {
        return this.properties;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }
}
