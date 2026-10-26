package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import app.template.extension.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.ConstantsKt;
import notrack.ai.MainActivity;
import notrack.ai.data.account.DeletePreview;
import okio.Options$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, Object obj2, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = obj;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                h2 h2Var = new h2((k2) obj2, so0Var, 0);
                h2Var.d = obj;
                return h2Var;
            case 1:
                return new h2((hb0) this.d, (h01) obj2, so0Var, 1);
            case 2:
                return new h2((hb0) this.d, (mi2) obj2, so0Var, 2);
            case 3:
                return new h2((Context) this.d, (Uri) obj2, so0Var, 3);
            case 4:
                h2 h2Var2 = new h2((dr0) obj2, so0Var, 4);
                h2Var2.d = obj;
                return h2Var2;
            case 5:
                h2 h2Var3 = new h2((je1) obj2, so0Var, 5);
                h2Var3.d = obj;
                return h2Var3;
            case 6:
                return new h2((MainActivity) this.d, (mi2) obj2, so0Var, 6);
            case 7:
                return new h2((h01) this.d, (e01) obj2, so0Var, 7);
            default:
                h2 h2Var4 = new h2((wx3) obj2, so0Var, 8);
                h2Var4.d = obj;
                return h2Var4;
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
                return ((h2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 1:
                ((h2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            case 2:
                ((h2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            case 3:
                return ((h2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 4:
                return ((h2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 5:
                return ((h2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
            case 6:
                ((h2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            case 7:
                ((h2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                return w84Var;
            default:
                return ((h2) create(gq0Var, so0Var)).invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object i63Var;
        InputStream inputStreamOpenInputStream;
        Bitmap bitmapCreateScaledBitmap;
        int i;
        SharedPreferences sharedPreferences;
        int i2;
        int i3 = this.c;
        String str = BuildConfig.VERSION_NAME;
        boolean z = false;
        w84 w84Var = w84.a;
        so0 so0Var = null;
        Object obj2 = this.h;
        switch (i3) {
            case 0:
                k2 k2Var = (k2) obj2;
                g13.O(obj);
                try {
                    vu vuVar = new vu();
                    vuVar.p(k2Var.c + "/api/account.php");
                    vuVar.m("X-Requested-With", "nt");
                    String string = new JSONObject().put("do", "account.delete.preview").toString();
                    string.getClass();
                    vuVar.o("POST", Options$Companion.create(string, k2Var.e));
                    String strE = k2Var.b.e();
                    if (strE != null) {
                        vuVar.m("Authorization", "Bearer ".concat(strE));
                    }
                    tn2 tn2Var = k2Var.a.d.k;
                    l53 l53VarG = vuVar.g();
                    tn2Var.getClass();
                    f63 f63VarF = new y23(tn2Var, l53VarG).f();
                    try {
                        m33 m33Var = f63VarF.o;
                        String strL = m33Var != null ? m33Var.l() : null;
                        if (strL != null) {
                            str = strL;
                        }
                        if (!f63VarF.c()) {
                            f63VarF.close();
                            return null;
                        }
                        try {
                            kt1 kt1Var = k2Var.d;
                            kt1Var.getClass();
                            i63Var = (DeletePreview) kt1Var.b(DeletePreview.Companion.serializer(), str);
                            break;
                        } catch (Throwable th) {
                            i63Var = new i63(th);
                        }
                        if (i63Var instanceof i63) {
                            i63Var = null;
                        }
                        DeletePreview deletePreview = (DeletePreview) i63Var;
                        f63VarF.close();
                        return deletePreview;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            jr1.i(f63VarF, th2);
                            throw th3;
                        }
                    }
                } catch (Exception unused) {
                    return null;
                }
                return null;
            case 1:
                g13.O(obj);
                ((hb0) this.d).d0(((h01) obj2).c());
                return w84Var;
            case 2:
                g13.O(obj);
                if (((Boolean) ((mi2) obj2).getValue()).booleanValue()) {
                    hb0 hb0Var = (hb0) this.d;
                    tw2 tw2Var = (tw2) hb0Var.b.i.getValue();
                    if (tw2Var != null) {
                        py.F(id4.a(hb0Var), null, null, new k(tw2Var, so0Var, 11), 3);
                    }
                }
                return w84Var;
            case 3:
                Context context = (Context) this.d;
                Uri uri = (Uri) obj2;
                g13.O(obj);
                try {
                    ContentResolver contentResolver = context.getContentResolver();
                    String strR1 = wa0.r1(context, uri);
                    if (strR1 == null) {
                        strR1 = "file";
                    }
                    String type = contentResolver.getType(uri);
                    if (type != null) {
                        str = type;
                    }
                    if (!to3.q0(str, "image", false)) {
                        if (wa0.s1(context, uri) > 26214400 || (inputStreamOpenInputStream = contentResolver.openInputStream(uri)) == null) {
                            return null;
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(ConstantsKt.DEFAULT_BUFFER_SIZE, inputStreamOpenInputStream.available()));
                            byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
                            for (int i4 = inputStreamOpenInputStream.read(bArr); i4 >= 0; i4 = inputStreamOpenInputStream.read(bArr)) {
                                byteArrayOutputStream.write(bArr, 0, i4);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArray.getClass();
                            inputStreamOpenInputStream.close();
                            return new ps2(strR1, byteArray);
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                jr1.i(inputStreamOpenInputStream, th4);
                                throw th5;
                            }
                        }
                    }
                    Bitmap bitmapQ1 = wa0.q1(context, uri);
                    if (bitmapQ1 == null) {
                        return null;
                    }
                    if (bitmapQ1.getWidth() > 2000 || bitmapQ1.getHeight() > 2000) {
                        float fMin = Math.min(2000.0f / bitmapQ1.getWidth(), 2000.0f / bitmapQ1.getHeight());
                        int width = (int) (bitmapQ1.getWidth() * fMin);
                        if (width < 1) {
                            width = 1;
                        }
                        int height = (int) (bitmapQ1.getHeight() * fMin);
                        if (height < 1) {
                            height = 1;
                        }
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapQ1, width, height, true);
                    } else {
                        bitmapCreateScaledBitmap = bitmapQ1;
                    }
                    bitmapCreateScaledBitmap.getClass();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream2);
                    if (bitmapCreateScaledBitmap != bitmapQ1) {
                        bitmapQ1.recycle();
                    }
                    bitmapCreateScaledBitmap.recycle();
                    return new ps2(strR1, byteArrayOutputStream2.toByteArray());
                } catch (Exception | OutOfMemoryError unused2) {
                    return null;
                }
            case 4:
                g13.O(obj);
                gq0 gq0Var = (gq0) this.d;
                dr0 dr0Var = (dr0) obj2;
                AtomicReference atomicReference = dr0Var.b;
                ym3 ym3VarF = py.F(gq0Var, null, null, new k((gs1) atomicReference.getAndSet(null), dr0Var, so0Var, 16), 3);
                while (!atomicReference.compareAndSet(null, ym3VarF)) {
                    if (atomicReference.get() != null) {
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 5:
                g13.O(obj);
                xp0 coroutineContext = ((gq0) this.d).getCoroutineContext();
                je1 je1Var = (je1) obj2;
                try {
                    m04 m04Var = new m04();
                    m04Var.q = yo4.D(yo4.y(coroutineContext), true, m04Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m04.r;
                    try {
                        do {
                            i = atomicIntegerFieldUpdater.get(m04Var);
                            if (i != 0) {
                                if (i != 2 && i != 3) {
                                    m04.t(i);
                                    throw null;
                                }
                            }
                            return je1Var.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(m04Var, i, 0));
                        return je1Var.invoke();
                    } finally {
                        m04Var.s();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 6:
                g13.O(obj);
                MainActivity mainActivity = (MainActivity) this.d;
                int i5 = MainActivity.L;
                if (Build.VERSION.SDK_INT >= 33 && !new rm2(mainActivity).b.areNotificationsEnabled() && (i2 = (sharedPreferences = mainActivity.getSharedPreferences("notify", 0)).getInt("primerCount", 0)) < 2 && (i2 == 0 || 1295 > sharedPreferences.getInt("primerLastVc", 0))) {
                    SharedPreferences sharedPreferences2 = mainActivity.getSharedPreferences("notify", 0);
                    sharedPreferences2.edit().putInt("primerCount", sharedPreferences2.getInt("primerCount", 0) + 1).putInt("primerLastVc", 1295).apply();
                    ((mi2) obj2).setValue(Boolean.TRUE);
                }
                return w84Var;
            case 7:
                g13.O(obj);
                if (((i01) ((ft2) ((h01) this.d).a.g).getValue()) == i01.c) {
                    e01 e01Var = (e01) obj2;
                    e01Var.a.setValue(Boolean.TRUE);
                    e01Var.b.h(0.0f);
                    e01Var.c.h(0.0f);
                }
                return w84Var;
            default:
                g13.O(obj);
                gq0 gq0Var2 = (gq0) this.d;
                wx3 wx3Var = (wx3) obj2;
                py.F(gq0Var2, null, null, new ls(wx3Var, so0Var, 4), 3);
                return py.F(gq0Var2, null, null, new ls(wx3Var, so0Var, 5), 3);
        }
    }
}
