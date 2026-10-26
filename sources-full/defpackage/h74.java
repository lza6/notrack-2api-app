package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class h74 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final ir3 b;
    public volatile int c = 0;

    public h74(ir3 ir3Var, int i) {
        this.b = ir3Var;
        this.a = i;
    }

    public final int a(int i) {
        ae2 ae2VarB = b();
        int iA = ae2VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ae2VarB.l;
        int i2 = iA + ae2VarB.c;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final ae2 b() {
        ThreadLocal threadLocal = d;
        ae2 ae2Var = (ae2) threadLocal.get();
        if (ae2Var == null) {
            ae2Var = new ae2();
            threadLocal.set(ae2Var);
        }
        be2 be2Var = (be2) this.b.c;
        int iA = be2Var.a(6);
        if (iA != 0) {
            int i = iA + be2Var.c;
            int i2 = (this.a * 4) + ((ByteBuffer) be2Var.l).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) be2Var.l).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) be2Var.l;
            ae2Var.l = byteBuffer;
            if (byteBuffer != null) {
                ae2Var.c = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ae2Var.d = i4;
                ae2Var.h = ((ByteBuffer) ae2Var.l).getShort(i4);
                return ae2Var;
            }
            ae2Var.c = 0;
            ae2Var.d = 0;
            ae2Var.h = 0;
        }
        return ae2Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ae2 ae2VarB = b();
        int iA = ae2VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) ae2VarB.l).getInt(iA + ae2VarB.c) : 0));
        sb.append(", codepoints:");
        ae2 ae2VarB2 = b();
        int iA2 = ae2VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + ae2VarB2.c;
            i = ((ByteBuffer) ae2VarB2.l).getInt(((ByteBuffer) ae2VarB2.l).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
