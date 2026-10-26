package defpackage;

import androidx.compose.runtime.RecomposeScopeImpl$Companion;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class w33 implements v33 {
    public static final int $stable = 8;
    public static final RecomposeScopeImpl$Companion Companion = new RecomposeScopeImpl$Companion();
    private h8 anchor;
    private ne1 block;
    private int currentToken;
    private int flags;
    private x33 observer;
    private y33 owner;
    private fi2 trackedDependencies;
    private rh2 trackedInstances;

    public w33(y33 y33Var) {
        this.owner = y33Var;
    }

    public static final /* synthetic */ x33 access$getObserver$p(w33 w33Var) {
        w33Var.getClass();
        return null;
    }

    private final boolean checkDerivedStateChanged(gv0 gv0Var, fi2 fi2Var) {
        gv0Var.getClass();
        fv0 fv0Var = (fv0) gv0Var;
        bl3 bl3Var = fv0Var.h;
        if (bl3Var == null) {
            bl3Var = t73.A;
        }
        return !bl3Var.e(fv0Var.h().f, fi2Var.g(gv0Var));
    }

    private static /* synthetic */ void getObserver$annotations() {
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z) {
        int i = this.flags;
        if (z) {
            this.flags = i | 32;
        } else {
            this.flags = i & (-33);
        }
    }

    private final void setSkipped(boolean z) {
        int i = this.flags;
        if (z) {
            this.flags = i | 16;
        } else {
            this.flags = i & (-17);
        }
    }

    public final void adoptedBy(y33 y33Var) {
        this.owner = y33Var;
    }

    public final void compose(ck0 ck0Var) {
        w84 w84Var;
        ne1 ne1Var = this.block;
        if (ne1Var != null) {
            ne1Var.invoke(ck0Var, 1);
            w84Var = w84.a;
        } else {
            w84Var = null;
        }
        if (w84Var != null) {
            return;
        }
        u41.r("Invalid restart scope");
    }

    public final le1 end(int i) {
        rh2 rh2Var = this.trackedInstances;
        if (rh2Var == null || getSkipped$runtime_release()) {
            return null;
        }
        Object[] objArr = rh2Var.b;
        int[] iArr = rh2Var.c;
        long[] jArr = rh2Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        if (iArr[i5] != i) {
                            return new hn1(i, 1, this, rh2Var);
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return null;
                }
            }
            if (i2 == length) {
                return null;
            }
            i2++;
        }
    }

    public final h8 getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.flags & 64) != 0;
    }

    public final boolean getPaused() {
        return (this.flags & FontInfo.NUMBER_OF_CHAR_CODES) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getResuming() {
        return (this.flags & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0;
    }

    public final boolean getReusing() {
        return (this.flags & Uuid.SIZE_BITS) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean getValid() {
        if (this.owner != null) {
            h8 h8Var = this.anchor;
            if (h8Var != null ? h8Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v33
    public void invalidate() {
        y33 y33Var = this.owner;
        if (y33Var != null) {
            y33Var.a(this, null);
        }
    }

    public final ur1 invalidateForResult(Object obj) {
        ur1 ur1VarA;
        y33 y33Var = this.owner;
        return (y33Var == null || (ur1VarA = y33Var.a(this, obj)) == null) ? ur1.c : ur1VarA;
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[LOOP:0: B:19:0x002f->B:33:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[EDGE_INSN: B:36:0x0071->B:34:0x0071 BREAK  A[LOOP:0: B:19:0x002f->B:33:0x006e], SYNTHETIC] */
    public final boolean isInvalidFor(Object obj) {
        fi2 fi2Var;
        if (obj == null || (fi2Var = this.trackedDependencies) == null) {
            return true;
        }
        if (obj instanceof gv0) {
            return checkDerivedStateChanged((gv0) obj, fi2Var);
        }
        if (!(obj instanceof gi2)) {
            return true;
        }
        gi2 gi2Var = (gi2) obj;
        if (gi2Var.h()) {
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
                                Object obj2 = objArr[(i << 3) + i3];
                                if (!(obj2 instanceof gv0) || checkDerivedStateChanged((gv0) obj2, fi2Var)) {
                                    return true;
                                }
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
        }
        return false;
    }

    public final zk0 observe$runtime_release(x33 x33Var) {
        synchronized (sf3.c) {
        }
        return new qn0(26);
    }

    public final void recordDerivedStateValue(gv0 gv0Var, Object obj) {
        fi2 fi2Var = this.trackedDependencies;
        if (fi2Var == null) {
            fi2Var = new fi2();
            this.trackedDependencies = fi2Var;
        }
        fi2Var.l(gv0Var, obj);
    }

    public final boolean recordRead(Object obj) {
        int i;
        if (getRereading()) {
            return false;
        }
        rh2 rh2Var = this.trackedInstances;
        if (rh2Var == null) {
            rh2Var = new rh2();
            this.trackedInstances = rh2Var;
        }
        int i2 = this.currentToken;
        int iC = rh2Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i = -1;
        } else {
            i = rh2Var.c[iC];
        }
        rh2Var.b[iC] = obj;
        rh2Var.c[iC] = i2;
        return i == this.currentToken;
    }

    public final void release() {
        y33 y33Var = this.owner;
        if (y33Var != null) {
            y33Var.b();
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void rereadTrackedInstances() {
        rh2 rh2Var;
        y33 y33Var = this.owner;
        if (y33Var == null || (rh2Var = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            Object[] objArr = rh2Var.b;
            int[] iArr = rh2Var.c;
            long[] jArr = rh2Var.a;
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
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                int i5 = iArr[i4];
                                y33Var.c(obj);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } finally {
            setRereading(false);
        }
    }

    public final void scopeSkipped() {
        if (getReusing()) {
            return;
        }
        setSkipped(true);
    }

    public final void setAnchor(h8 h8Var) {
        this.anchor = h8Var;
    }

    public final void setDefaultsInScope(boolean z) {
        int i = this.flags;
        if (z) {
            this.flags = i | 2;
        } else {
            this.flags = i & (-3);
        }
    }

    public final void setDefaultsInvalid(boolean z) {
        int i = this.flags;
        if (z) {
            this.flags = i | 4;
        } else {
            this.flags = i & (-5);
        }
    }

    public final void setForcedRecompose(boolean z) {
        int i = this.flags;
        if (z) {
            this.flags = i | 64;
        } else {
            this.flags = i & (-65);
        }
    }

    public final void setPaused(boolean z) {
        int i = this.flags;
        this.flags = z ? i | FontInfo.NUMBER_OF_CHAR_CODES : i & (-257);
    }

    public final void setRequiresRecompose(boolean z) {
        int i = this.flags;
        if (z) {
            this.flags = i | 8;
        } else {
            this.flags = i & (-9);
        }
    }

    public final void setResuming(boolean z) {
        int i = this.flags;
        this.flags = z ? i | ConstantsKt.MINIMUM_BLOCK_SIZE : i & (-513);
    }

    public final void setReusing(boolean z) {
        int i = this.flags;
        this.flags = z ? i | Uuid.SIZE_BITS : i & (-129);
    }

    public final void setUsed(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 1 : i & (-2);
    }

    public final void start(int i) {
        this.currentToken = i;
        setSkipped(false);
    }

    public void updateScope(ne1 ne1Var) {
        this.block = ne1Var;
    }
}
