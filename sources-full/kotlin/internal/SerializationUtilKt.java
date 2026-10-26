package kotlin.internal;

import app.template.extension.BuildConfig;
import java.io.InvalidObjectException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0081\b\u001a\u001a\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0081\bø\u0001\u0000*\f\b\u0000\u0010\u0006\"\u00020\u00072\u00020\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"throwReadObjectNotSupported", BuildConfig.VERSION_NAME, "wrapAsDeserializationException", BuildConfig.VERSION_NAME, "action", "Lkotlin/Function0;", "ReadObjectParameterType", "Ljava/io/ObjectInputStream;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SerializationUtilKt {
    private static final Void throwReadObjectNotSupported() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private static final void wrapAsDeserializationException(Function0<Unit> action) throws Throwable {
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            action.invoke();
        } catch (Throwable th) {
            Throwable thInitCause = new InvalidObjectException(th.getMessage()).initCause(th);
            Intrinsics.checkNotNullExpressionValue(thInitCause, "initCause(...)");
            throw thInitCause;
        }
    }
}
