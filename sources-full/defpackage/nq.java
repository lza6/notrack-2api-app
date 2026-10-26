package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nq implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mi2 d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ nq(Object obj, Object obj2, Object obj3, mi2 mi2Var, int i) {
        this.c = i;
        this.h = obj;
        this.l = obj2;
        this.m = obj3;
        this.d = mi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        Object i63Var;
        w84 w84Var;
        int i = this.c;
        so0 so0Var = null;
        boolean z = true;
        w84 w84Var2 = w84.a;
        mi2 mi2Var = this.d;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                Bitmap bitmap = (Bitmap) obj4;
                ah2 ah2Var = (ah2) obj2;
                ln2 ln2Var = (ln2) obj;
                Paint paint = qq.a;
                if (!((Boolean) ((gn3) obj3).getValue()).booleanValue()) {
                    bt2 bt2Var = (bt2) ah2Var;
                    if (bt2Var.f() > 0.0f) {
                        float f = ((pq0) mi2Var.getValue()).b < 1.5f ? 2.5f : 1.0f;
                        float f2 = f / ((pq0) mi2Var.getValue()).b;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (ln2Var.a >> 32)) - (bt2Var.f() / 2.0f);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ln2Var.a & 4294967295L)) - (bt2Var.f() / 2.0f);
                        mi2Var.setValue(qq.g(pq0.a((pq0) mi2Var.getValue(), 0, f, ((((pq0) mi2Var.getValue()).c - fIntBitsToFloat) * f2) + fIntBitsToFloat, ((((pq0) mi2Var.getValue()).d - fIntBitsToFloat2) * f2) + fIntBitsToFloat2, 1), bitmap, bt2Var.f()));
                    }
                }
                return w84Var2;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj4;
                Context context = (Context) obj3;
                j92 j92Var = (j92) obj2;
                if (((Boolean) obj).booleanValue()) {
                    sharedPreferences.edit().putBoolean("notifyOptOut", false).apply();
                    if (new rm2(context).b.areNotificationsEnabled()) {
                        mi2Var.setValue(Boolean.TRUE);
                    } else if (Build.VERSION.SDK_INT >= 33) {
                        j92Var.a("android.permission.POST_NOTIFICATIONS", null);
                    } else {
                        try {
                            context.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName()));
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    sharedPreferences.edit().putBoolean("notifyOptOut", true).apply();
                    mi2Var.setValue(Boolean.FALSE);
                }
                return w84Var2;
            case 2:
                Context context2 = (Context) obj2;
                String str = (String) obj;
                str.getClass();
                ((ne1) obj4).invoke(str, (String) obj3);
                mi2Var.setValue(Boolean.FALSE);
                Toast.makeText(context2, context2.getString(R.string.report_sent), 0).show();
                return w84Var2;
            default:
                gq0 gq0Var = (gq0) obj4;
                Context context3 = (Context) obj3;
                String str2 = (String) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        OutputStream outputStreamOpenOutputStream = context3.getContentResolver().openOutputStream(uri);
                        if (outputStreamOpenOutputStream != null) {
                            try {
                                byte[] bytes = str2.getBytes(q30.a);
                                bytes.getClass();
                                outputStreamOpenOutputStream.write(bytes);
                                outputStreamOpenOutputStream.close();
                                w84Var = w84Var2;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    jr1.i(outputStreamOpenOutputStream, th);
                                    throw th2;
                                }
                            }
                        } else {
                            w84Var = null;
                        }
                        if (w84Var == null) {
                            z = false;
                        }
                        i63Var = Boolean.valueOf(z);
                    } catch (Throwable th3) {
                        i63Var = new i63(th3);
                    }
                    Object obj5 = Boolean.FALSE;
                    if (i63Var instanceof i63) {
                        i63Var = obj5;
                    }
                    if (((Boolean) i63Var).booleanValue()) {
                        mi2Var.setValue(Boolean.TRUE);
                        py.F(gq0Var, null, null, new ta0(mi2Var, so0Var, 2), 3);
                    }
                }
                return w84Var2;
        }
    }
}
