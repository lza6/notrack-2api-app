package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s44 implements i61 {
    public Object c = null;
    public Object d = null;
    public Object h = null;
    public Object l = null;
    public Object m = null;
    public Object n = null;
    public Object o;

    public static sz0 c(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return new sz0((dw1) ((gw1) ci4.x(gw1.D(byteArrayInputStream, b61.a())).d).v());
        } finally {
            byteArrayInputStream.close();
        }
    }

    public synchronized jb a() {
        jb jbVar;
        try {
            if (((String) this.d) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (jb.h) {
                try {
                    Context context = (Context) this.c;
                    String str = (String) this.d;
                    String str2 = (String) this.h;
                    byte[] bArrX = null;
                    if (str != null) {
                        Context applicationContext = context.getApplicationContext();
                        try {
                            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                            if (string != null) {
                                bArrX = gb2.x(string);
                            }
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            throw new CharConversionException(fq2.n("can't read keyset; the pref value ", str, " is not a valid hex string"));
                        }
                    } else {
                        u41.k("keysetName cannot be null");
                    }
                    String str3 = (String) this.l;
                    if (bArrX == null) {
                        if (str3 != null) {
                            this.m = e();
                        }
                        this.o = b();
                    } else if (str3 != null) {
                        this.o = d(bArrX);
                    } else {
                        this.o = c(bArrX);
                    }
                    jbVar = new jb(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jbVar;
    }

    public sz0 b() throws GeneralSecurityException, IOException {
        if (((pv1) this.n) == null) {
            m51.v("cannot read or generate keyset");
            return null;
        }
        sz0 sz0Var = new sz0(gw1.C());
        pv1 pv1Var = (pv1) this.n;
        synchronized (sz0Var) {
            sz0Var.e(pv1Var.a);
        }
        int iA = la4.a((gw1) sz0Var.n().d).y().A();
        synchronized (sz0Var) {
            for (int i = 0; i < ((gw1) ((dw1) sz0Var.c).d).z(); i++) {
                try {
                    fw1 fw1VarY = ((gw1) ((dw1) sz0Var.c).d).y(i);
                    if (fw1VarY.B() == iA) {
                        if (!fw1VarY.D().equals(mv1.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iA);
                        }
                        dw1 dw1Var = (dw1) sz0Var.c;
                        dw1Var.e();
                        gw1.w((gw1) dw1Var.d, iA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + iA);
        }
        Context context = (Context) this.c;
        String str = (String) this.d;
        String str2 = (String) this.h;
        if (str == null) {
            u41.k("keysetName cannot be null");
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((e6) this.m) != null) {
            ci4 ci4VarN = sz0Var.n();
            e6 e6Var = (e6) this.m;
            byte[] bArr = new byte[0];
            gw1 gw1Var = (gw1) ci4VarN.d;
            byte[] bArrA = e6Var.a(gw1Var.e(), bArr);
            try {
                if (!gw1.E(e6Var.b(bArrA, bArr), b61.a()).equals(gw1Var)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                m31 m31VarZ = n31.z();
                kz kzVarG = mz.g(bArrA, 0, bArrA.length);
                m31VarZ.e();
                n31.w((n31) m31VarZ.d, kzVarG);
                lw1 lw1VarA = la4.a(gw1Var);
                m31VarZ.e();
                n31.x((n31) m31VarZ.d, lw1VarA);
                if (!editorEdit.putString(str, gb2.B(((n31) m31VarZ.b()).e())).commit()) {
                    m51.l("Failed to write to SharedPreferences");
                    return null;
                }
            } catch (sr1 unused) {
                m51.v("invalid keyset, corrupted key material");
                return null;
            }
        } else if (!editorEdit.putString(str, gb2.B(((gw1) sz0Var.n().d).e())).commit()) {
            m51.l("Failed to write to SharedPreferences");
            return null;
        }
        return sz0Var;
    }

    public sz0 d(byte[] bArr) {
        try {
            this.m = new kb().c((String) this.l);
            try {
                return new sz0((dw1) ((gw1) ci4.G(new jb(12, new ByteArrayInputStream(bArr)), (e6) this.m).d).v());
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return c(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                sz0 sz0VarC = c(bArr);
                Object obj = jb.h;
                Log.w("jb", "cannot use Android Keystore, it'll be disabled", e2);
                return sz0VarC;
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    public e6 e() throws KeyStoreException {
        Object obj = jb.h;
        kb kbVar = new kb();
        try {
            boolean zA = kb.a((String) this.l);
            try {
                return kbVar.c((String) this.l);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zA) {
                    throw new KeyStoreException(fq2.n("the master key ", (String) this.l, " exists but is unusable"), e);
                }
                Object obj2 = jb.h;
                Log.w("jb", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Object obj3 = jb.h;
            Log.w("jb", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    @Override // defpackage.t13
    public Object get() {
        return new ca4((Context) ((t13) this.c).get(), (zd2) ((t13) this.d).get(), (o83) ((t13) this.h).get(), (ci4) ((iy2) this.l).get(), (Executor) ((t13) this.m).get(), (o83) ((t13) this.n).get(), new sb3(11), new zf3(9), (o83) ((t13) this.o).get());
    }
}
