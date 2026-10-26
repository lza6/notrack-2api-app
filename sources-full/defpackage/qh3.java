package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh3 extends of2 implements lx1 {
    public float c;
    public float d;
    public float h;
    public float l;
    public float m;
    public float n;
    public long o;
    public rg3 p;
    public boolean q;
    public long r;
    public long s;
    public pj2 t;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nv2 nv2VarC = qb2Var.c(j);
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new sg2(nv2VarC, 10, this));
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.c);
        sb.append(", scaleY=");
        sb.append(this.d);
        sb.append(", alpha = ");
        sb.append(this.h);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.l);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.m);
        sb.append(", cameraDistance=");
        sb.append(this.n);
        sb.append(", transformOrigin=");
        sb.append((Object) e54.d(this.o));
        sb.append(", shape=");
        sb.append(this.p);
        sb.append(", clip=");
        sb.append(this.q);
        sb.append(", renderEffect=null, ambientShadowColor=");
        ud2.t(this.r, sb, ", spotShadowColor=");
        sb.append((Object) re0.i(this.s));
        sb.append(", compositingStrategy=");
        sb.append((Object) ok0.a(0));
        sb.append(')');
        return sb.toString();
    }
}
