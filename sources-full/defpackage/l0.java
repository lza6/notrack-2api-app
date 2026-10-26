package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends j23 {
    @Override // defpackage.j23
    public final int a(int i) {
        return (f().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.j23
    public final double b() {
        return f().nextDouble();
    }

    @Override // defpackage.j23
    public final int c() {
        return f().nextInt();
    }

    @Override // defpackage.j23
    public final int d(int i) {
        return f().nextInt(i);
    }

    public abstract Random f();
}
