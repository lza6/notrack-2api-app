package kotlin.random;

import app.template.extension.BuildConfig;
import kotlin.Metadata;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\t\u0010\u0004\u001a\u00020\u0002H\u0081\b\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¨\u0006\n"}, d2 = {"asJavaRandom", "Ljava/util/Random;", "Lkotlin/random/Random;", "asKotlinRandom", "defaultPlatformRandom", "doubleFromParts", BuildConfig.VERSION_NAME, "hi26", BuildConfig.VERSION_NAME, "low27", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PlatformRandomKt {
    public static final java.util.Random asJavaRandom(Random random) {
        java.util.Random impl;
        Intrinsics.checkNotNullParameter(random, "<this>");
        AbstractPlatformRandom abstractPlatformRandom = random instanceof AbstractPlatformRandom ? (AbstractPlatformRandom) random : null;
        return (abstractPlatformRandom == null || (impl = abstractPlatformRandom.getImpl()) == null) ? new KotlinRandom(random) : impl;
    }

    public static final Random asKotlinRandom(java.util.Random random) {
        Random impl;
        Intrinsics.checkNotNullParameter(random, "<this>");
        KotlinRandom kotlinRandom = random instanceof KotlinRandom ? (KotlinRandom) random : null;
        return (kotlinRandom == null || (impl = kotlinRandom.getImpl()) == null) ? new PlatformRandom(random) : impl;
    }

    private static final Random defaultPlatformRandom() {
        return PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
    }

    public static final double doubleFromParts(int i, int i2) {
        return ((((long) i) << 27) + ((long) i2)) / 9.007199254740992E15d;
    }
}
