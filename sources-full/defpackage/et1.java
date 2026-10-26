package defpackage;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public abstract class et1 {
    public static final lo1 a = jr1.a(lo3.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final int a(JsonPrimitive jsonPrimitive) {
        try {
            long jH = new tz1(jsonPrimitive.getContent()).h();
            if (-2147483648L <= jH && jH <= 2147483647L) {
                return (int) jH;
            }
            throw new NumberFormatException(jsonPrimitive.getContent() + " is not an Int");
        } catch (dt1 e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final JsonPrimitive b(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        j93.e(r43.a(jsonElement.getClass()), " is not a JsonPrimitive", "Element ");
        return null;
    }
}
