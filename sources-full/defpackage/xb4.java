package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface xb4 {
    boolean a();

    long b(cg cgVar, cg cgVar2, cg cgVar3);

    cg s(long j, cg cgVar, cg cgVar2, cg cgVar3);

    cg u(long j, cg cgVar, cg cgVar2, cg cgVar3);

    default cg w(cg cgVar, cg cgVar2, cg cgVar3) {
        return s(b(cgVar, cgVar2, cgVar3), cgVar, cgVar2, cgVar3);
    }
}
