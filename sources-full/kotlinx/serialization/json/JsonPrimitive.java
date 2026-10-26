package kotlinx.serialization.json;

import defpackage.qu1;
import defpackage.tt1;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Companion();

    public final class Companion {
        public final qu1 serializer() {
            return tt1.a;
        }
    }

    public abstract String getContent();

    public String toString() {
        return getContent();
    }
}
