package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class wq4 extends ck4 implements IInterface {
    public final int e;

    public wq4(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.e = Arrays.hashCode(bArr);
    }

    public static byte[] j(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wq4) {
            try {
                wq4 wq4Var = (wq4) obj;
                if (wq4Var.e == this.e) {
                    return Arrays.equals(i(), (byte[]) new gn2(wq4Var.i()).e);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.ck4
    public final boolean h(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.e);
            return true;
        }
        gn2 gn2Var = new gn2(i());
        parcel2.writeNoException();
        int i2 = sm4.a;
        parcel2.writeStrongBinder(gn2Var);
        return true;
    }

    public final int hashCode() {
        return this.e;
    }

    public abstract byte[] i();
}
