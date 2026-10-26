package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.b;

/* JADX INFO: loaded from: classes.dex */
public final class ql3 extends b {
    public final Socket m;

    public ql3(Socket socket) {
        this.m = socket;
    }

    @Override // okio.b
    public final void j() {
        Socket socket = this.m;
        try {
            socket.close();
        } catch (AssertionError e) {
            Logger logger = xj4.a;
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? mo3.u0(message, "getsockname failed", false) : false) {
                    xj4.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                    return;
                }
            }
            throw e;
        } catch (Exception e2) {
            xj4.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
