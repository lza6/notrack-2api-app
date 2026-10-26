package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class lm4 {
    public final im4 a;
    public boolean b;
    public long c;
    public long d;

    public lm4(im4 im4Var) {
        if (im4Var != null) {
            this.a = im4Var;
        } else {
            m51.x("ticker");
            throw null;
        }
    }

    public final void a() {
        if (this.b) {
            u41.r("This stopwatch is already running.");
        } else {
            this.b = true;
            this.d = this.a.b();
        }
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jB = this.b ? (this.a.b() - this.d) + this.c : this.c;
        long j = jB / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jB / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jB / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jB / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jB / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jB / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jB / timeUnit2.convert(1L, timeUnit)));
        switch (km4.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return str2 + " " + str;
    }
}
