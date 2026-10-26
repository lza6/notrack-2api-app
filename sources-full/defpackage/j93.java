package defpackage;

import androidx.compose.ui.text.input.OffsetMapping$Companion;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import org.scilab.forge.jlatexmath.ParseException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j93 implements ox2, de4, kv1 {
    public final /* synthetic */ int c;

    public /* synthetic */ j93(int i) {
        this.c = i;
    }

    public static /* synthetic */ void b(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void c(Object obj, Object obj2) throws TimeoutException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " for ");
        sb.append(obj2);
        throw new TimeoutException(sb.toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void f(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void g(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new ParseException(str);
    }

    public static /* synthetic */ void k(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void l(String str) throws zp4 {
        throw new zp4(str);
    }

    @Override // defpackage.de4
    public f54 a(hg hgVar) {
        return new f54(hgVar, OffsetMapping$Companion.getIdentity());
    }

    @Override // defpackage.kv1
    public kr1 d(f13 f13Var) throws GeneralSecurityException {
        d5 d5Var;
        if (!((String) f13Var.a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            u41.k("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
            return null;
        }
        try {
            jj4 jj4VarB = jj4.B((mz) f13Var.c, b61.a());
            if (jj4VarB.z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            lr2 lr2Var = (lr2) f13Var.e;
            int iOrdinal = lr2Var.ordinal();
            if (iOrdinal == 1) {
                d5Var = d5.M;
            } else if (iOrdinal == 2) {
                d5Var = d5.N;
            } else if (iOrdinal == 3) {
                d5Var = d5.O;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + lr2Var.b());
                }
                d5Var = d5.N;
            }
            return kj4.q0(d5Var, new sz0(nz.a(jj4VarB.y().k())), (Integer) f13Var.f);
        } catch (sr1 unused) {
            m51.v("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }
}
