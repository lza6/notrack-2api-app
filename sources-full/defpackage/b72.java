package defpackage;

import android.os.Build;
import android.os.StatFs;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import io.noties.markwon.ext.tables.a;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import notrack.ai.data.api.UploadResponse$$serializer;
import notrack.ai.data.notify.PremiumPushItem$$serializer;
import notrack.ai.data.notify.PushCopy$$serializer;
import notrack.ai.data.promo.OwnCard$$serializer;
import notrack.ai.data.promo.OwnSlot$$serializer;
import notrack.ai.data.voice.VoiceOption$$serializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b72 implements je1 {
    public final /* synthetic */ int c;

    public /* synthetic */ b72(int i) {
        this.c = i;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        Object i63Var;
        int i = 0;
        switch (this.c) {
            case 0:
                return wm.a;
            case 1:
                try {
                    Field declaredField = a.class.getDeclaredField("cells");
                    declaredField.setAccessible(true);
                    i63Var = declaredField;
                    break;
                } catch (Throwable th) {
                    i63Var = new i63(th);
                }
                boolean z = i63Var instanceof i63;
                Object obj = i63Var;
                if (z) {
                    obj = null;
                }
                return (Field) obj;
            case 2:
                return new ml(UploadResponse$$serializer.INSTANCE);
            case 3:
                return ls0.a;
            case 4:
                return new zz(new tn2(new sn2()));
            case 5:
                return new ml(OwnSlot$$serializer.INSTANCE);
            case 6:
                return new ml(OwnCard$$serializer.INSTANCE);
            case 7:
                return gb2.q(new ArrayList(0));
            case 8:
                lo3 lo3Var = lo3.a;
                return new t42(PushCopy$$serializer.INSTANCE);
            case 9:
                lo3 lo3Var2 = lo3.a;
                return new t42(PushCopy$$serializer.INSTANCE);
            case 10:
                return new ml(PremiumPushItem$$serializer.INSTANCE);
            case 11:
                return new t42(lo3.a);
            case 12:
                List listK0 = ke0.K0((List) gg3.a.getValue(), new fb1(8));
                ArrayList arrayList = new ArrayList();
                int size = listK0.size();
                while (i < size) {
                    ((un2) listK0.get(i)).getClass();
                    arrayList.add(new ps2(new tk2(new b72(4)), r43.a(da4.class)));
                    i++;
                }
                return arrayList;
            case 13:
                List listK1 = ke0.K0((List) gg3.b.getValue(), new fb1(9));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listK1.size();
                while (i < size2) {
                    ((lf1) listK1.get(i)).getClass();
                    arrayList2.add(Build.VERSION.SDK_INT >= 28 ? new ze() : new jf1());
                    i++;
                }
                return arrayList2;
            case 14:
                try {
                    Iterator it = Arrays.asList(new un2()).iterator();
                    it.getClass();
                    return av1.K(rf3.b0(new em0(new qe0(1, it))));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case 15:
                try {
                    Iterator it2 = Arrays.asList(new lf1()).iterator();
                    it2.getClass();
                    return av1.K(rf3.b0(new em0(new qe0(1, it2))));
                } catch (Throwable th3) {
                    throw new ServiceConfigurationError(th3.getMessage(), th3);
                }
            case 16:
                List list = qz3.a;
                return w84.a;
            case 17:
                List list2 = qz3.a;
                return Float.valueOf(1.0f);
            case 18:
                bu1 bu1Var = a71.c;
                mt2 mt2VarE = a71.d.e("coil3_disk_cache");
                long jY = 10485760;
                try {
                    File file = mt2VarE.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jY = py.y((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new c33(jY, bu1Var, mt2VarE);
            case 19:
                lo3 lo3Var3 = lo3.a;
                return new t42(oq1.a);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return new ml(VoiceOption$$serializer.INSTANCE);
            case 21:
                return new t42(lo3.a);
            case 22:
                return new ml(lo3.a);
            default:
                lo3 lo3Var4 = lo3.a;
                return new t42(oq1.a);
        }
    }
}
