package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(hb0 hb0Var, gn3 gn3Var, mi2 mi2Var, mi2 mi2Var2, so0 so0Var) {
        super(2, so0Var);
        this.d = hb0Var;
        this.h = gn3Var;
        this.l = mi2Var;
        this.m = mi2Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(ix2 ix2Var, xt3 xt3Var, xw3 xw3Var, so0 so0Var) {
        super(2, so0Var);
        this.h = ix2Var;
        this.l = xt3Var;
        this.m = xw3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(String str, hb0 hb0Var, Uri uri, qt qtVar, so0 so0Var) {
        super(2, so0Var);
        this.h = str;
        this.d = hb0Var;
        this.l = uri;
        this.m = qtVar;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                return new ea0((hb0) this.d, (gn3) obj4, (mi2) obj3, (mi2) obj2, so0Var);
            case 1:
                return new ea0((String) obj4, (hb0) this.d, (Uri) obj3, (qt) obj2, so0Var);
            default:
                ea0 ea0Var = new ea0((ix2) obj4, (xt3) obj3, (xw3) obj2, so0Var);
                ea0Var.d = obj;
                return ea0Var;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                ((ea0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            case 1:
                return ((ea0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            default:
                ((ea0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object i63Var;
        boolean zBooleanValue;
        Object i63Var2;
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = 0;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.h;
        so0 so0Var = null;
        switch (i) {
            case 0:
                g13.O(obj);
                if (kr1.n((String) ((gn3) obj4).getValue(), "play_no_account")) {
                    ((mi2) obj3).setValue(Boolean.FALSE);
                    wa0.g1((mi2) obj2, true);
                    ((hb0) this.d).u.o(null);
                }
                return w84Var;
            case 1:
                Uri uri = (Uri) obj3;
                g13.O(obj);
                String str = (String) obj4;
                boolean zEquals = str.equals("fx");
                e60 e60Var = ((hb0) this.d).b;
                if (zEquals) {
                    ci4 ci4Var = e60Var.c;
                    ci4Var.getClass();
                    uri.getClass();
                    try {
                        ((File) ci4Var.l).mkdirs();
                        ContentResolver contentResolver = ((Context) ci4Var.d).getContentResolver();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    jr1.i(inputStreamOpenInputStream, th);
                                    throw th2;
                                }
                            }
                        }
                        if (options.outWidth > 0 && options.outHeight > 0) {
                            int i3 = 1;
                            while (true) {
                                int i4 = i3 * 2;
                                if (Math.min(options.outWidth, options.outHeight) / i4 >= 256) {
                                    i3 = i4;
                                } else {
                                    InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                                            options2.inSampleSize = i3;
                                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                            options2.inPreferredConfig = config;
                                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options2);
                                            inputStreamOpenInputStream2.close();
                                            if (bitmapDecodeStream != null) {
                                                int iMin = Math.min(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Uuid.SIZE_BITS, Uuid.SIZE_BITS, config);
                                                bitmapCreateBitmap.getClass();
                                                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, new Rect((bitmapDecodeStream.getWidth() - iMin) / 2, (bitmapDecodeStream.getHeight() - iMin) / 2, ((bitmapDecodeStream.getWidth() - iMin) / 2) + iMin, ((bitmapDecodeStream.getHeight() - iMin) / 2) + iMin), new Rect(0, 0, Uuid.SIZE_BITS, Uuid.SIZE_BITS), new Paint(2));
                                                int[] iArr = new int[16384];
                                                bitmapCreateBitmap.getPixels(iArr, 0, Uuid.SIZE_BITS, 0, 0, Uuid.SIZE_BITS, Uuid.SIZE_BITS);
                                                int[] iArr2 = {0, 127, 16256, 16383};
                                                boolean z = false;
                                                boolean z2 = true;
                                                for (int i5 = 0; i5 < 4; i5++) {
                                                    int i6 = iArr[iArr2[i5]];
                                                    int i7 = i6 >>> 24;
                                                    int i8 = (i6 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                                                    int i9 = (i6 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                                                    int i10 = i6 & KotlinVersion.MAX_COMPONENT_VALUE;
                                                    if (i7 < 250) {
                                                        z = true;
                                                    }
                                                    if (i8 <= 225 || i9 <= 225 || i10 <= 225 || Math.max(i8, Math.max(i9, i10)) - Math.min(i8, Math.min(i9, i10)) >= 22) {
                                                        z2 = false;
                                                    }
                                                }
                                                if (!z && z2) {
                                                    for (int i11 = 0; i11 < 16384; i11++) {
                                                        int i12 = iArr[i11];
                                                        int i13 = (i12 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                                                        int i14 = (i12 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                                                        int i15 = i12 & KotlinVersion.MAX_COMPONENT_VALUE;
                                                        int iMin2 = Math.min(i13, Math.min(i14, i15));
                                                        if (Math.max(i13, Math.max(i14, i15)) - iMin2 < 26) {
                                                            int i16 = i12 >>> 24;
                                                            if (iMin2 > 236) {
                                                                i16 = 0;
                                                            } else if (iMin2 > 212) {
                                                                i16 = (int) (((236 - iMin2) * i16) / 24.0f);
                                                            }
                                                            iArr[i11] = (i12 & 16777215) | (i16 << 24);
                                                        }
                                                    }
                                                    bitmapCreateBitmap.setPixels(iArr, 0, Uuid.SIZE_BITS, 0, 0, Uuid.SIZE_BITS, Uuid.SIZE_BITS);
                                                } else if (!z) {
                                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(Uuid.SIZE_BITS, Uuid.SIZE_BITS, Bitmap.Config.ARGB_8888);
                                                    bitmapCreateBitmap2.getClass();
                                                    Canvas canvas = new Canvas(bitmapCreateBitmap2);
                                                    Path path = new Path();
                                                    path.addCircle(64.0f, 64.0f, 62.0f, Path.Direction.CW);
                                                    canvas.save();
                                                    canvas.clipPath(path);
                                                    canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint(1));
                                                    canvas.restore();
                                                    Paint paint = new Paint(1);
                                                    paint.setStyle(Paint.Style.STROKE);
                                                    paint.setStrokeWidth(4.0f);
                                                    paint.setColor(-637534209);
                                                    canvas.drawPath(path, paint);
                                                    bitmapCreateBitmap = bitmapCreateBitmap2;
                                                }
                                                FileOutputStream fileOutputStream = new FileOutputStream(ci4Var.v("fx"));
                                                try {
                                                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                                    fileOutputStream.close();
                                                    i63Var2 = Boolean.TRUE;
                                                    Object obj5 = Boolean.FALSE;
                                                    if (i63Var2 instanceof i63) {
                                                        i63Var2 = obj5;
                                                    }
                                                    zBooleanValue = ((Boolean) i63Var2).booleanValue();
                                                } catch (Throwable th3) {
                                                    try {
                                                        throw th3;
                                                    } catch (Throwable th4) {
                                                        jr1.i(fileOutputStream, th3);
                                                        throw th4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            try {
                                                throw th5;
                                            } catch (Throwable th6) {
                                                jr1.i(inputStreamOpenInputStream2, th5);
                                                throw th6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        zBooleanValue = false;
                    } catch (Throwable th7) {
                        i63Var2 = new i63(th7);
                    }
                } else {
                    ci4 ci4Var2 = e60Var.c;
                    qt qtVar = (qt) obj2;
                    int i17 = str.equals("pt") ? qtVar.l : qtVar.k;
                    ci4Var2.getClass();
                    uri.getClass();
                    try {
                        ((File) ci4Var2.l).mkdirs();
                        ContentResolver contentResolver2 = ((Context) ci4Var2.d).getContentResolver();
                        BitmapFactory.Options options3 = new BitmapFactory.Options();
                        options3.inJustDecodeBounds = true;
                        InputStream inputStreamOpenInputStream3 = contentResolver2.openInputStream(uri);
                        if (inputStreamOpenInputStream3 != null) {
                            try {
                                BitmapFactory.decodeStream(inputStreamOpenInputStream3, null, options3);
                                inputStreamOpenInputStream3.close();
                            } catch (Throwable th8) {
                                try {
                                    throw th8;
                                } catch (Throwable th9) {
                                    jr1.i(inputStreamOpenInputStream3, th8);
                                    throw th9;
                                }
                            }
                        }
                        if (options3.outWidth > 0 && options3.outHeight > 0) {
                            int i18 = 1;
                            while (true) {
                                int i19 = i18 * 2;
                                if (Math.max(options3.outWidth, options3.outHeight) / i19 >= i17) {
                                    i18 = i19;
                                } else {
                                    InputStream inputStreamOpenInputStream4 = contentResolver2.openInputStream(uri);
                                    if (inputStreamOpenInputStream4 != null) {
                                        try {
                                            BitmapFactory.Options options4 = new BitmapFactory.Options();
                                            options4.inSampleSize = i18;
                                            Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenInputStream4, null, options4);
                                            inputStreamOpenInputStream4.close();
                                            if (bitmapDecodeStream2 != null) {
                                                float fMin = Math.min(1.0f, i17 / Math.max(bitmapDecodeStream2.getWidth(), bitmapDecodeStream2.getHeight()));
                                                if (fMin < 1.0f) {
                                                    int width = (int) (bitmapDecodeStream2.getWidth() * fMin);
                                                    if (width < 1) {
                                                        width = 1;
                                                    }
                                                    int height = (int) (bitmapDecodeStream2.getHeight() * fMin);
                                                    if (height < 1) {
                                                        height = 1;
                                                    }
                                                    bitmapDecodeStream2 = Bitmap.createScaledBitmap(bitmapDecodeStream2, width, height, true);
                                                }
                                                bitmapDecodeStream2.getClass();
                                                FileOutputStream fileOutputStream2 = new FileOutputStream(ci4Var2.v(str));
                                                try {
                                                    bitmapDecodeStream2.compress(Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP, 82, fileOutputStream2);
                                                    fileOutputStream2.close();
                                                    i63Var = Boolean.TRUE;
                                                } catch (Throwable th10) {
                                                    try {
                                                        throw th10;
                                                    } catch (Throwable th11) {
                                                        jr1.i(fileOutputStream2, th10);
                                                        throw th11;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th12) {
                                            try {
                                                throw th12;
                                            } catch (Throwable th13) {
                                                jr1.i(inputStreamOpenInputStream4, th12);
                                                throw th13;
                                            }
                                        }
                                    }
                                }
                                Object obj6 = Boolean.FALSE;
                                if (i63Var instanceof i63) {
                                    i63Var = obj6;
                                }
                                zBooleanValue = ((Boolean) i63Var).booleanValue();
                            }
                        }
                        zBooleanValue = false;
                    } catch (Throwable th14) {
                        i63Var = new i63(th14);
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                g13.O(obj);
                gq0 gq0Var = (gq0) this.d;
                ix2 ix2Var = (ix2) obj4;
                op0 op0Var = new op0(ix2Var, (xt3) obj3, so0Var, i2);
                jq0 jq0Var = jq0.l;
                py.F(gq0Var, null, jq0Var, op0Var, 1);
                py.F(gq0Var, null, jq0Var, new k(ix2Var, (xw3) obj2, null, 15), 1);
                return w84Var;
        }
    }
}
