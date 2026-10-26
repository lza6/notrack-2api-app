package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w73 {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public w73(float f, float f2, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w73)) {
            return false;
        }
        w73 w73Var = (w73) obj;
        return w73Var.a == this.a && w73Var.b == this.b && w73Var.c == this.c && w73Var.d == this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ud2.h(fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.b);
        sb.append(",uptimeMillis=");
        sb.append(this.c);
        sb.append(",deviceId=");
        return fq2.p(sb, this.d, ')');
    }
}
