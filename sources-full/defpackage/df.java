package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Log;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.template.extension.BuildConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class df extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df(Object obj, Object obj2, Object obj3, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df(Object obj, Object obj2, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = obj;
        this.l = obj2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.l;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                return new df((Drawable) this.d, (je1) obj3, (je1) obj2, so0Var, 0);
            case 1:
                return new df((gp) this.d, (String) obj3, (le1) obj2, so0Var, 1);
            case 2:
                return new df((gp) this.d, (String) obj3, (byte[]) obj2, so0Var, 2);
            case 3:
                df dfVar = new df((Context) obj3, (Uri) obj2, so0Var, 3);
                dfVar.d = obj;
                return dfVar;
            case 4:
                return new df((hb0) this.d, (gn3) obj3, (mi2) obj2, so0Var, 4);
            case 5:
                return new df((h01) this.d, (SoftwareKeyboardController) obj3, (pa1) obj2, so0Var, 5);
            case 6:
                df dfVar2 = new df((SoftwareKeyboardController) obj3, (za1) obj2, so0Var, 6);
                dfVar2.d = obj;
                return dfVar2;
            case 7:
                df dfVar3 = new df((ix2) obj3, (xt3) obj2, so0Var, 7);
                dfVar3.d = obj;
                return dfVar3;
            case 8:
                return new df((tw2) this.d, (Activity) obj3, (sd) obj2, so0Var, 8);
            case 9:
                df dfVar4 = new df((nu3) obj3, (ix2) obj2, so0Var, 9);
                dfVar4.d = obj;
                return dfVar4;
            default:
                df dfVar5 = new df((wx3) obj3, (ix2) obj2, so0Var, 10);
                dfVar5.d = obj;
                return dfVar5;
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
                ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            case 1:
                return ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 2:
                return ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 3:
                return ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 4:
                ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            case 5:
                ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            case 6:
                ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            case 7:
                return ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 8:
                return ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 9:
                ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            default:
                return ((df) create(gq0Var, so0Var)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0214  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r9;
        Object i63Var;
        int i = this.c;
        ?? r10 = "do";
        sq sqVar = sq.a;
        jq0 jq0Var = jq0.l;
        w84 w84Var = w84.a;
        Object obj2 = this.l;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                g13.O(obj);
                d1.e((Drawable) this.d).registerAnimationCallback(new na4((je1) obj3, (je1) obj2));
                return w84Var;
            case 1:
                g13.O(obj);
                gp gpVar = (gp) this.d;
                String str = (String) gpVar.b.invoke();
                if (str == null) {
                    return sqVar;
                }
                try {
                    JSONObject jSONObjectPut = new JSONObject().put("do", (String) obj3);
                    ((le1) obj2).invoke(jSONObjectPut);
                    String string = jSONObjectPut.toString();
                    string.getClass();
                    vu vuVar = new vu();
                    vuVar.p(gpVar.c + "/api/account.php");
                    vuVar.m("X-Requested-With", "nt");
                    vuVar.m("Authorization", "Bearer ".concat(str));
                    vuVar.o("POST", Options$Companion.create(string, gpVar.e));
                    l53 l53VarG = vuVar.g();
                    tn2 tn2Var = gpVar.a.d.k;
                    tn2Var.getClass();
                    f63 f63VarF = new y23(tn2Var, l53VarG).f();
                    try {
                        int i2 = f63VarF.l;
                        boolean zC = f63VarF.c();
                        m33 m33Var = f63VarF.o;
                        String strL = m33Var != null ? m33Var.l() : null;
                        if (strL == null) {
                            strL = BuildConfig.VERSION_NAME;
                        }
                        vq vqVarA = gp.a(gpVar, i2, zC, strL);
                        f63VarF.close();
                        return vqVarA;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            jr1.i(f63VarF, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    return new rq("network");
                }
            case 2:
                g13.O(obj);
                gp gpVar2 = (gp) this.d;
                String str2 = (String) gpVar2.b.invoke();
                if (str2 == null) {
                    return sqVar;
                }
                try {
                    ci4 ci4Var = new ci4(27);
                    ArrayList arrayList = (ArrayList) ci4Var.l;
                    ac2 ac2Var = yg2.o;
                    ac2Var.getClass();
                    if (ac2Var.b.equals("multipart")) {
                        ci4Var.h = ac2Var;
                    } else {
                        m51.z(ac2Var, "multipart != ");
                    }
                    ci4Var.i("do", "avatar.upload");
                    ci4Var.i("slot", (String) obj3);
                    ci4Var.i("framed", "1");
                    byte[] bArr = (byte[]) obj2;
                    Pattern pattern = ac2.d;
                    ac2 ac2Var2 = Options$Companion.get("image/jpeg");
                    int length = bArr.length;
                    bArr.getClass();
                    ka4.c(bArr.length, 0L, length);
                    arrayList.add(Options$Companion.createFormData("file", "avatar.jpg", new n53(ac2Var2, length, bArr)));
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    yg2 yg2Var = new yg2((lz) ci4Var.d, (ac2) ci4Var.h, ka4.w(arrayList));
                    vu vuVar2 = new vu();
                    vuVar2.p(gpVar2.c + "/api/account.php");
                    vuVar2.m("X-Requested-With", "nt");
                    vuVar2.m("Authorization", "Bearer ".concat(str2));
                    vuVar2.o("POST", yg2Var);
                    l53 l53VarG2 = vuVar2.g();
                    tn2 tn2Var2 = gpVar2.a.d.k;
                    tn2Var2.getClass();
                    f63 f63VarF2 = new y23(tn2Var2, l53VarG2).f();
                    try {
                        int i3 = f63VarF2.l;
                        boolean zC2 = f63VarF2.c();
                        m33 m33Var2 = f63VarF2.o;
                        String strL2 = m33Var2 != null ? m33Var2.l() : null;
                        if (strL2 == null) {
                            strL2 = BuildConfig.VERSION_NAME;
                        }
                        vq vqVarA2 = gp.a(gpVar2, i3, zC2, strL2);
                        f63VarF2.close();
                        return vqVarA2;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jr1.i(f63VarF2, th3);
                            throw th4;
                        }
                    }
                } catch (Exception unused2) {
                    return new rq("network");
                }
            case 3:
                Uri uri = (Uri) obj2;
                g13.O(obj);
                try {
                    ContentResolver contentResolver = ((Context) obj3).getContentResolver();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        return null;
                    }
                    try {
                        try {
                            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                            inputStreamOpenInputStream.close();
                            if (options.outWidth <= 0 || options.outHeight <= 0) {
                                jq0Var = null;
                            } else {
                                int i4 = 1;
                                while (true) {
                                    int i5 = i4 * 2;
                                    if (Math.max(options.outWidth, options.outHeight) / i5 >= 2048) {
                                        i4 = i5;
                                    } else {
                                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                                        options2.inSampleSize = i4;
                                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                        if (inputStreamOpenInputStream2 != null) {
                                            jq0Var = null;
                                            try {
                                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options2);
                                                inputStreamOpenInputStream2.close();
                                                if (bitmapDecodeStream != null) {
                                                    try {
                                                        InputStream inputStreamOpenInputStream3 = contentResolver.openInputStream(uri);
                                                        try {
                                                            if (inputStreamOpenInputStream3 != null) {
                                                                try {
                                                                    r10 = 1;
                                                                    r9 = 1;
                                                                    try {
                                                                        Integer num = new Integer(new ExifInterface(inputStreamOpenInputStream3).getAttributeInt("Orientation", 1));
                                                                        inputStreamOpenInputStream3.close();
                                                                        i63Var = num;
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        Throwable th6 = th;
                                                                        try {
                                                                            throw th6;
                                                                        } catch (Throwable th7) {
                                                                            jr1.i(inputStreamOpenInputStream3, th6);
                                                                            throw th7;
                                                                        }
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    r10 = 1;
                                                                }
                                                            } else {
                                                                r9 = 1;
                                                                i63Var = null;
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            i63Var = new i63(th);
                                                            r9 = r10;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        r10 = 1;
                                                    }
                                                    boolean z = i63Var instanceof i63;
                                                    Object obj4 = i63Var;
                                                    if (z) {
                                                        obj4 = null;
                                                    }
                                                    Integer num2 = (Integer) obj4;
                                                    ?? IntValue = num2 != null ? num2.intValue() : r9;
                                                    Matrix matrix = new Matrix();
                                                    switch (IntValue) {
                                                        case 2:
                                                            matrix.postScale(-1.0f, 1.0f);
                                                            break;
                                                        case 3:
                                                            matrix.postRotate(180.0f);
                                                            break;
                                                        case 4:
                                                            matrix.postScale(1.0f, -1.0f);
                                                            break;
                                                        case 5:
                                                            matrix.postRotate(90.0f);
                                                            matrix.postScale(-1.0f, 1.0f);
                                                            break;
                                                        case 6:
                                                            matrix.postRotate(90.0f);
                                                            break;
                                                        case 7:
                                                            matrix.postRotate(270.0f);
                                                            matrix.postScale(-1.0f, 1.0f);
                                                            break;
                                                        case 8:
                                                            matrix.postRotate(270.0f);
                                                            break;
                                                        default:
                                                            return bitmapDecodeStream;
                                                    }
                                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                                                    if (bitmapCreateBitmap != bitmapDecodeStream) {
                                                        bitmapDecodeStream.recycle();
                                                    }
                                                    return bitmapCreateBitmap;
                                                }
                                            } catch (Throwable th11) {
                                                try {
                                                    throw th11;
                                                } catch (Throwable th12) {
                                                    jr1.i(inputStreamOpenInputStream2, th11);
                                                    throw th12;
                                                }
                                            }
                                        } else {
                                            jq0Var = null;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th13) {
                            try {
                                throw th13;
                            } catch (Throwable th14) {
                                jr1.i(inputStreamOpenInputStream, th13);
                                throw th14;
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.w("AvatarCrop", "decode failed", e);
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        Log.w("AvatarCrop", "decode OOM", e);
                    }
                    return jq0Var;
                } catch (Exception e3) {
                    e = e3;
                    jq0Var = null;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    jq0Var = null;
                }
                Log.w("AvatarCrop", "decode failed", e);
                return jq0Var;
            case 4:
                g13.O(obj);
                if (((String) ((gn3) obj3).getValue()) != null) {
                    wa0.h1((mi2) obj2, true);
                    ((hb0) this.d).p.o(null);
                }
                return w84Var;
            case 5:
                g13.O(obj);
                if (((i01) ((fv0) ((h01) this.d).a.h).getValue()) == i01.d) {
                    SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) obj3;
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                    }
                    ((va1) ((pa1) obj2)).b(8, false, true);
                }
                return w84Var;
            case 6:
                g13.O(obj);
                try {
                    za1.b((za1) obj2);
                    break;
                } catch (Throwable unused3) {
                }
                SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) obj3;
                if (softwareKeyboardController2 != null) {
                    softwareKeyboardController2.show();
                }
                return w84Var;
            case 7:
                g13.O(obj);
                gq0 gq0Var = (gq0) this.d;
                ix2 ix2Var = (ix2) obj3;
                xt3 xt3Var = (xt3) obj2;
                so0 so0Var = null;
                py.F(gq0Var, null, jq0Var, new op0(ix2Var, xt3Var, so0Var, 1), 1);
                return py.F(gq0Var, null, jq0Var, new op0(ix2Var, xt3Var, so0Var, 2), 1);
            case 8:
                g13.O(obj);
                return ((tw2) this.d).f.a((Activity) obj3, (sd) obj2);
            case 9:
                g13.O(obj);
                gq0 gq0Var2 = (gq0) this.d;
                nu3 nu3Var = (nu3) obj3;
                wx3 wx3Var = nu3Var.m;
                ix2 ix2Var2 = (ix2) obj2;
                c9 c9Var = new c9(wx3Var, 24, nu3Var);
                so0 so0Var2 = null;
                py.F(gq0Var2, null, jq0Var, new mu3(wx3Var, ix2Var2, so0Var2, 0), 1);
                py.F(gq0Var2, null, jq0Var, new qb(nu3Var, wx3Var, ix2Var2, c9Var, null, 21), 1);
                py.F(gq0Var2, null, jq0Var, new il3(wx3Var, ix2Var2, c9Var, so0Var2, 2), 1);
                return w84Var;
            default:
                g13.O(obj);
                gq0 gq0Var3 = (gq0) this.d;
                wx3 wx3Var2 = (wx3) obj3;
                ix2 ix2Var3 = (ix2) obj2;
                so0 so0Var3 = null;
                py.F(gq0Var3, null, jq0Var, new mu3(wx3Var2, ix2Var3, so0Var3, 1), 1);
                py.F(gq0Var3, null, jq0Var, new mu3(wx3Var2, ix2Var3, so0Var3, 2), 1);
                return py.F(gq0Var3, null, jq0Var, new mu3(ix2Var3, wx3Var2, null), 1);
        }
    }
}
