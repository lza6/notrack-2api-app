package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public enum fm4 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final hn4 h;
    public final int c;

    static {
        gj gjVar = new gj(12, (byte) 0);
        gjVar.c = new Object[8];
        gjVar.b = 0;
        for (fm4 fm4Var : values()) {
            Integer numValueOf = Integer.valueOf(fm4Var.c);
            int i = gjVar.b + 1;
            Object[] objArr = (Object[]) gjVar.c;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                gjVar.c = Arrays.copyOf(objArr, bh4.c(length, i2));
            }
            Object[] objArr2 = (Object[]) gjVar.c;
            int i3 = gjVar.b;
            int i4 = i3 + i3;
            objArr2[i4] = numValueOf;
            objArr2[i4 + 1] = fm4Var;
            gjVar.b = i3 + 1;
        }
        ym4 ym4Var = (ym4) gjVar.d;
        if (ym4Var != null) {
            throw ym4Var.a();
        }
        hn4 hn4VarA = hn4.a(gjVar.b, (Object[]) gjVar.c, gjVar);
        ym4 ym4Var2 = (ym4) gjVar.d;
        if (ym4Var2 != null) {
            throw ym4Var2.a();
        }
        h = hn4VarA;
    }

    fm4(int i) {
        this.c = i;
    }
}
