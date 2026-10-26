package kotlin.math;

import app.template.extension.BuildConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/math/Constants;", BuildConfig.VERSION_NAME, "<init>", "()V", "LN2", BuildConfig.VERSION_NAME, "epsilon", "taylor_2_bound", "taylor_n_bound", "upper_taylor_2_bound", "upper_taylor_n_bound", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class Constants {
    public static final Constants INSTANCE = new Constants();
    public static final double LN2 = Math.log(2.0d);
    public static final double epsilon;
    public static final double taylor_2_bound;
    public static final double taylor_n_bound;
    public static final double upper_taylor_2_bound;
    public static final double upper_taylor_n_bound;

    static {
        double dUlp = Math.ulp(1.0d);
        epsilon = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        taylor_2_bound = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        taylor_n_bound = dSqrt2;
        upper_taylor_2_bound = 1.0d / dSqrt;
        upper_taylor_n_bound = 1.0d / dSqrt2;
    }

    private Constants() {
    }
}
