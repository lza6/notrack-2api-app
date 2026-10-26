package androidx.compose.foundation.gestures;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    public static final BringIntoViewSpec$Companion a = BringIntoViewSpec$Companion.$$INSTANCE;

    default float a(float f, float f2, float f3) {
        a.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
