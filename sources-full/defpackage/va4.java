package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class va4 implements qu1 {
    public static final va4 a = new va4();
    public static final gz2 b = new gz2("kotlin.uuid.Uuid", cz2.v);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        String strY = hs0Var.y();
        strY.getClass();
        int length = strY.length();
        if (length == 32) {
            long jB = ai1.b(0, 16, strY);
            long jB2 = ai1.b(16, 32, strY);
            if (jB != 0 || jB2 != 0) {
                return new ua4(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strY.length() <= 64 ? strY : strY.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strY.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB3 = ai1.b(0, 8, strY);
            sf3.k(8, strY);
            long jB4 = ai1.b(9, 13, strY);
            sf3.k(13, strY);
            long jB5 = ai1.b(14, 18, strY);
            sf3.k(18, strY);
            long jB6 = ai1.b(19, 23, strY);
            sf3.k(23, strY);
            long j = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = ai1.b(24, 36, strY) | (jB6 << 48);
            if (j != 0 || jB7 != 0) {
                return new ua4(j, jB7);
            }
        }
        return ua4.h;
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ua4 ua4Var = (ua4) obj;
        ua4Var.getClass();
        do3Var.t(ua4Var.toString());
    }
}
