package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m13 implements ab4 {
    public boolean a = false;
    public boolean b = false;
    public u61 c;
    public final l13 d;

    public m13(l13 l13Var) {
        this.d = l13Var;
    }

    @Override // defpackage.ab4
    public final ab4 b(String str) {
        if (this.a) {
            throw new k31("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.e(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.ab4
    public final ab4 c(boolean z) {
        if (this.a) {
            throw new k31("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.b(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
