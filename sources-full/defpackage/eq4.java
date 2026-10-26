package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eq4 implements jq4 {
    public final ep4 a;

    public eq4(zf3 zf3Var, ep4 ep4Var) {
        this.a = ep4Var;
    }

    @Override // defpackage.jq4
    public final void a(Object obj) {
        mq4 mq4Var = ((sp4) obj).zzc;
        if (mq4Var.e) {
            mq4Var.e = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.jq4
    public final boolean b(sp4 sp4Var, sp4 sp4Var2) {
        return sp4Var.zzc.equals(sp4Var2.zzc);
    }

    @Override // defpackage.jq4
    public final void c(Object obj, sk3 sk3Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.jq4
    public final void d(Object obj, Object obj2) {
        kq4.o(obj, obj2);
    }

    @Override // defpackage.jq4
    public final void e(Object obj, byte[] bArr, int i, int i2, hp4 hp4Var) {
        sp4 sp4Var = (sp4) obj;
        if (sp4Var.zzc == mq4.f) {
            sp4Var.zzc = mq4.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.jq4
    public final sp4 f() {
        ep4 ep4Var = this.a;
        if (ep4Var instanceof sp4) {
            return ((sp4) ep4Var).n();
        }
        rp4 rp4Var = (rp4) ((sp4) ep4Var).j(5);
        boolean zH = rp4Var.d.h();
        sp4 sp4Var = rp4Var.d;
        if (!zH) {
            return sp4Var;
        }
        sp4Var.getClass();
        fq4.b.a(sp4Var.getClass()).a(sp4Var);
        sp4Var.e();
        return rp4Var.d;
    }

    @Override // defpackage.jq4
    public final boolean g(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.jq4
    public final int h(sp4 sp4Var) {
        return sp4Var.zzc.hashCode();
    }

    @Override // defpackage.jq4
    public final int i(ep4 ep4Var) {
        mq4 mq4Var = ((sp4) ep4Var).zzc;
        int i = mq4Var.d;
        if (i != -1) {
            return i;
        }
        int iW = 0;
        for (int i2 = 0; i2 < mq4Var.a; i2++) {
            int i3 = mq4Var.b[i2] >>> 3;
            jp4 jp4Var = (jp4) mq4Var.c[i2];
            int iF = bk.F(8);
            int iF2 = bk.F(i3) + bk.F(16);
            int iF3 = bk.F(24);
            int iG = jp4Var.g();
            iW += iF + iF + iF2 + ud2.w(iG, iG, iF3);
        }
        mq4Var.d = iW;
        return iW;
    }
}
