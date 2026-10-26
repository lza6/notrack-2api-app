package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class bc implements ks2, uy2 {
    public int c;
    public final Object d;
    public Object h;
    public Object l;

    public bc(Paint paint) {
        this.d = paint;
        this.c = 3;
    }

    public bc(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        vy2 vy2Var = new vy2(this);
        this.d = vy2Var;
        if (!ud2.b(2)) {
            m51.v("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.h = str;
        this.l = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.c = 20;
                break;
            case "HMACSHA224":
                this.c = 28;
                break;
            case "HMACSHA256":
                this.c = 32;
                break;
            case "HMACSHA384":
                this.c = 48;
                break;
            case "HMACSHA512":
                this.c = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        vy2Var.get();
    }

    @Override // defpackage.uy2
    public byte[] a(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        vy2 vy2Var = (vy2) this.d;
        if (i > this.c) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) vy2Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) vy2Var.get()).doFinal(), i);
    }

    public int b() {
        Paint.Cap strokeCap = ((Paint) this.d).getStrokeCap();
        int i = strokeCap == null ? -1 : cc.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int c() {
        Paint.Join strokeJoin = ((Paint) this.d).getStrokeJoin();
        int i = strokeJoin == null ? -1 : cc.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void d(float f) {
        ((Paint) this.d).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void e(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        Paint paint = (Paint) this.d;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(p23.c0(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(p23.e0(i)));
        }
    }

    public void f(long j) {
        ((Paint) this.d).setColor(gb2.X(j));
    }

    public void g(te0 te0Var) {
        this.l = te0Var;
        ((Paint) this.d).setColorFilter(te0Var != null ? te0Var.a : null);
    }

    public void h(int i) {
        ((Paint) this.d).setFilterBitmap(!(i == 0));
    }

    public void i(Shader shader) {
        this.h = shader;
        ((Paint) this.d).setShader(shader);
    }

    public void j(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.d;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void k(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.d;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void l(float f) {
        ((Paint) this.d).setStrokeWidth(f);
    }

    public void m(int i) {
        ((Paint) this.d).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
