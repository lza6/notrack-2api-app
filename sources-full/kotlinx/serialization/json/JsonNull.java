package kotlinx.serialization.json;

import defpackage.pt1;
import defpackage.qu1;

/* JADX INFO: loaded from: classes.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String getContent() {
        return "null";
    }

    public final qu1 serializer() {
        return pt1.a;
    }
}
