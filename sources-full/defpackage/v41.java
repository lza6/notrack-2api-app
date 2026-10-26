package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class v41 extends zp0 {
    public static final /* synthetic */ int l = 0;
    public long c;
    public boolean d;
    public kl h;

    public final void Q(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void R(pw0 pw0Var) {
        kl klVar = this.h;
        if (klVar == null) {
            klVar = new kl();
            this.h = klVar;
        }
        klVar.addLast(pw0Var);
    }

    public final void S(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long T();

    public final boolean U() {
        kl klVar = this.h;
        if (klVar == null) {
            return false;
        }
        pw0 pw0Var = (pw0) (klVar.isEmpty() ? null : klVar.removeFirst());
        if (pw0Var == null) {
            return false;
        }
        pw0Var.run();
        return true;
    }

    @Override // defpackage.zp0
    public final zp0 limitedParallelism(int i, String str) {
        y64.o(i);
        return str != null ? new aj2(this, str) : this;
    }

    public abstract void shutdown();
}
