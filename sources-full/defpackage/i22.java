package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i22 implements g93, b93 {
    public final h93 a;
    public final b93 b;
    public final gi2 c;

    public i22(g93 g93Var, Map map, b93 b93Var) {
        e8 e8Var = new e8(27, g93Var);
        un3 un3Var = i93.a;
        this.a = new h93(map, e8Var);
        this.b = b93Var;
        int i = sa3.a;
        this.c = new gi2();
    }

    @Override // defpackage.b93
    public void SaveableStateProvider(Object obj, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-697180401);
        int i2 = i & 14;
        this.b.SaveableStateProvider(obj, ne1Var, kk0Var, i & 126);
        boolean zJ = kk0Var.j(this) | kk0Var.j(obj);
        Object objP = kk0Var.P();
        if (zJ || objP == Composer$Companion.getEmpty()) {
            objP = new rc(this, 27, obj);
            kk0Var.l0(objP);
        }
        r11.DisposableEffect(obj, (le1) objP, kk0Var, i2);
        kk0Var.r(false);
    }

    @Override // defpackage.b93
    public final void a(Object obj) {
        this.b.a(obj);
    }

    @Override // defpackage.g93
    public final boolean canBeSaved(Object obj) {
        return this.a.canBeSaved(obj);
    }

    @Override // defpackage.g93
    public final Object consumeRestored(String str) {
        return this.a.consumeRestored(str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // defpackage.g93
    public final Map performSave() {
        gi2 gi2Var = this.c;
        Object[] objArr = gi2Var.b;
        long[] jArr = gi2Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.b.a(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.a.performSave();
    }

    @Override // defpackage.g93
    public final f93 registerProvider(String str, je1 je1Var) {
        return this.a.registerProvider(str, je1Var);
    }
}
