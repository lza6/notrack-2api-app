package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ct1 extends xr0 {
    public final tz1 h;
    public final zf3 i;

    public ct1(tz1 tz1Var, rs1 rs1Var) {
        rs1Var.getClass();
        this.h = tz1Var;
        this.i = rs1Var.b;
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final long b() {
        tz1 tz1Var = this.h;
        String strJ = tz1Var.j();
        try {
            strJ.getClass();
            b84 b84VarV = py.V(strJ);
            if (b84VarV != null) {
                return b84VarV.c;
            }
            to3.l0(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            tz1.l(tz1Var, "Failed to parse type 'ULong' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.nk0
    public final int h(tf3 tf3Var) {
        tf3Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final int o() {
        tz1 tz1Var = this.h;
        String strJ = tz1Var.j();
        try {
            strJ.getClass();
            w74 w74VarU = py.U(strJ);
            if (w74VarU != null) {
                return w74VarU.c;
            }
            to3.l0(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            tz1.l(tz1Var, "Failed to parse type 'UInt' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.nk0
    public final zf3 r() {
        return this.i;
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final byte t() {
        r74 r74Var;
        tz1 tz1Var = this.h;
        String strJ = tz1Var.j();
        try {
            strJ.getClass();
            w74 w74VarU = py.U(strJ);
            if (w74VarU != null) {
                int i = w74VarU.c;
                r74Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new r74((byte) i);
            }
            if (r74Var != null) {
                return r74Var.c;
            }
            to3.l0(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            tz1.l(tz1Var, "Failed to parse type 'UByte' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.xr0, defpackage.hs0
    public final short x() {
        h84 h84Var;
        tz1 tz1Var = this.h;
        String strJ = tz1Var.j();
        try {
            strJ.getClass();
            w74 w74VarU = py.U(strJ);
            if (w74VarU != null) {
                int i = w74VarU.c;
                h84Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new h84((short) i);
            }
            if (h84Var != null) {
                return h84Var.c;
            }
            to3.l0(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            tz1.l(tz1Var, "Failed to parse type 'UShort' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }
}
