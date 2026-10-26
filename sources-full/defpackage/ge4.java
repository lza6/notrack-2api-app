package defpackage;

import java.util.Arrays;
import kotlin.text.Typography;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import notrack.ai.data.voice.VoiceConfig;
import notrack.ai.data.voice.VoiceQuota;

/* JADX INFO: loaded from: classes.dex */
public final class ge4 {
    public final g50 a;
    public final String b;
    public final kt1 c;
    public volatile VoiceConfig d;
    public volatile long e;

    public ge4(g50 g50Var, String str) {
        str.getClass();
        this.a = g50Var;
        this.b = str;
        this.c = xr0.G(new s80(21));
    }

    public static final String a(ge4 ge4Var, String str) {
        ge4Var.getClass();
        StringBuilder sb = new StringBuilder("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (kr1.z(cCharAt, 32) < 0) {
                sb.append(String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(cCharAt)}, 1)));
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append(Typography.quote);
        return sb.toString();
    }

    public static final VoiceQuota b(ge4 ge4Var, String str) {
        kt1 kt1Var = ge4Var.c;
        try {
            kt1Var.getClass();
            JsonElement jsonElement = (JsonElement) kt1Var.b(gt1.a, str);
            JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
            JsonElement jsonElement2 = jsonObject != null ? (JsonElement) jsonObject.get("quota") : null;
            return jsonElement2 == null ? new VoiceQuota() : (VoiceQuota) kt1Var.a(VoiceQuota.Companion.serializer(), jsonElement2);
        } catch (Exception unused) {
            return new VoiceQuota();
        }
    }

    public final Object c(String str, int i, String str2, int i2, String str3, String str4, uo0 uo0Var) {
        jt0 jt0Var = sw0.a;
        return py.Y(at0.c, new eb0(this, str, i, str2, i2, str3, str4, null), uo0Var);
    }
}
