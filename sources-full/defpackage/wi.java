package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes.dex */
public abstract class wi {
    public Object a;
    public Object b;

    public wi(Context context) {
        this.a = context;
    }

    public wi(zi ziVar) {
        this.b = ziVar;
    }

    public static byte[] i(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public void c() {
        vi viVar = (vi) this.a;
        if (viVar != null) {
            try {
                ((zi) this.b).s.unregisterReceiver(viVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public byte[] e(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            m51.v("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((be0) this.b).a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(jr1.k(bArr4, i(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            be0 be0Var = (be0) this.a;
            be0Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            be0Var.p(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public void f(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            u41.k("Given ByteBuffer output is too small");
            return;
        }
        int iPosition = byteBuffer.position();
        be0 be0Var = (be0) this.a;
        be0Var.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            u41.k("Given ByteBuffer output is too small");
            return;
        }
        be0Var.p(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer byteBufferA = ((be0) this.b).a(0, bArr);
        byte[] bArr4 = new byte[32];
        byteBufferA.get(bArr4);
        byte[] bArrK = jr1.k(bArr4, i(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrK);
    }

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof xp3)) {
            return menuItem;
        }
        xp3 xp3Var = (xp3) menuItem;
        if (((ph3) this.b) == null) {
            this.b = new ph3(0);
        }
        MenuItem menuItem2 = (MenuItem) ((ph3) this.b).get(xp3Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        qc2 qc2Var = new qc2((Context) this.a, xp3Var);
        ((ph3) this.b).put(xp3Var, qc2Var);
        return qc2Var;
    }

    public abstract be0 j(int i, byte[] bArr);

    public abstract void k();

    public void l() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((vi) this.a) == null) {
            this.a = new vi(0, this);
        }
        ((zi) this.b).s.registerReceiver((vi) this.a, intentFilterD);
    }
}
