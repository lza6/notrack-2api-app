package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class kt extends vr {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(im0 im0Var, int i) {
        super(im0Var);
        this.b = i;
        im0Var.getClass();
        switch (i) {
            case 2:
                super(im0Var);
                this.c = 7;
                break;
            case 3:
                super(im0Var);
                this.c = 7;
                break;
            case 4:
                super(im0Var);
                this.c = 9;
                break;
            default:
                this.c = 6;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(lt ltVar) {
        super(ltVar);
        this.b = 1;
        ltVar.getClass();
        this.c = 5;
    }

    @Override // defpackage.fm0
    public final boolean a(hi4 hi4Var) {
        int i = this.b;
        hi4Var.getClass();
        switch (i) {
            case 0:
                return hi4Var.j.c;
            case 1:
                return hi4Var.j.e;
            case 2:
                return hi4Var.j.a == 2;
            case 3:
                int i2 = hi4Var.j.a;
                if (i2 != 3) {
                    return Build.VERSION.SDK_INT >= 30 && i2 == 6;
                }
                return true;
            default:
                return hi4Var.j.f;
        }
    }

    @Override // defpackage.vr
    public final int d() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.c;
    }

    @Override // defpackage.vr
    public final boolean e(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                hl2 hl2Var = (hl2) obj;
                hl2Var.getClass();
                int i = Build.VERSION.SDK_INT;
                boolean z = hl2Var.a;
                if (i >= 26) {
                    if (z && hl2Var.b) {
                        return false;
                    }
                } else if (z) {
                    return false;
                }
                return true;
            case 3:
                hl2 hl2Var2 = (hl2) obj;
                hl2Var2.getClass();
                return !hl2Var2.a || hl2Var2.c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
