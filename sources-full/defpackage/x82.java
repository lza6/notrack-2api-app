package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x82 implements u82 {
    public final iy2 a;
    public final qn0 b;
    public final qn0 c;

    public x82(iy2 iy2Var) {
        this.a = iy2Var;
        boolean zIsEmpty = ((uf2) iy2Var.l).a.isEmpty();
        qn0 qn0Var = wf2.a;
        if (zIsEmpty) {
            this.b = qn0Var;
            this.c = qn0Var;
            return;
        }
        oh2 oh2Var = (oh2) ph2.b.a.get();
        oh2Var = oh2Var == null ? ph2.c : oh2Var;
        wf2.a(iy2Var);
        oh2Var.getClass();
        this.b = qn0Var;
        this.c = qn0Var;
    }

    @Override // defpackage.u82
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        qn0 qn0Var = this.c;
        if (length <= 5) {
            qn0Var.getClass();
            m51.v("tag too short");
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        iy2 iy2Var = this.a;
        for (hz2 hz2Var : iy2Var.i(bArrCopyOf)) {
            try {
                ((u82) hz2Var.b).a(bArrCopyOfRange, hz2Var.e.equals(lr2.LEGACY) ? xp1.h(bArr2, y82.b) : bArr2);
                qn0Var.getClass();
                return;
            } catch (GeneralSecurityException e) {
                y82.a.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = iy2Var.i(py.d).iterator();
        while (it.hasNext()) {
            try {
                ((u82) ((hz2) it.next()).b).a(bArr, bArr2);
                qn0Var.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        qn0Var.getClass();
        m51.v("invalid MAC");
    }

    @Override // defpackage.u82
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        qn0 qn0Var = this.b;
        hz2 hz2Var = (hz2) this.a.h;
        if (hz2Var.e.equals(lr2.LEGACY)) {
            bArr = xp1.h(bArr, y82.b);
        }
        try {
            byte[] bArr2 = hz2Var.c;
            byte[] bArrH = xp1.h(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((u82) hz2Var.b).b(bArr));
            int i = hz2Var.f;
            qn0Var.getClass();
            return bArrH;
        } catch (GeneralSecurityException e) {
            qn0Var.getClass();
            throw e;
        }
    }
}
