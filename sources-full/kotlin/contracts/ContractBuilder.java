package kotlin.contracts;

import app.template.extension.BuildConfig;
import kotlin.Function;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\u0005\u001a\u00020\u0006H'J&\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH'J\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0006H§\u0004J!\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\t*\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH§\u0004¨\u0006\u0013"}, d2 = {"Lkotlin/contracts/ContractBuilder;", BuildConfig.VERSION_NAME, "returns", "Lkotlin/contracts/Returns;", "value", "returnsNotNull", "Lkotlin/contracts/ReturnsNotNull;", "callsInPlace", "Lkotlin/contracts/CallsInPlace;", "R", "lambda", "Lkotlin/Function;", "kind", "Lkotlin/contracts/InvocationKind;", "implies", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "holdsIn", "Lkotlin/contracts/HoldsIn;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ContractBuilder {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ CallsInPlace callsInPlace$default(ContractBuilder contractBuilder, Function function, InvocationKind invocationKind, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i & 2) != 0) {
                invocationKind = InvocationKind.UNKNOWN;
            }
            return contractBuilder.callsInPlace(function, invocationKind);
        }
    }

    <R> CallsInPlace callsInPlace(Function<? extends R> lambda, InvocationKind kind);

    <R> HoldsIn holdsIn(boolean z, Function<? extends R> function);

    void implies(boolean z, ReturnsNotNull returnsNotNull);

    Returns returns();

    Returns returns(Object value);

    ReturnsNotNull returnsNotNull();
}
