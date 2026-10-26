package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class tb extends Handler {
    public static final tb a = new tb();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = sb.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String strT0 = (String) sb.b.get(loggerName);
        if (strT0 == null) {
            strT0 = mo3.T0(23, loggerName);
        }
        if (Log.isLoggable(strT0, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iZ0 = mo3.z0('\n', i2, 4, message);
                if (iZ0 == -1) {
                    iZ0 = length;
                }
                while (true) {
                    iMin = Math.min(iZ0, i2 + 4000);
                    Log.println(i, strT0, message.substring(i2, iMin));
                    if (iMin >= iZ0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
