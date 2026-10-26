package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class cn extends AtomicInteger {
    @Override // java.lang.Number
    public final byte byteValue() {
        return (byte) super.intValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return (short) super.intValue();
    }
}
