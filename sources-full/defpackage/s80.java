package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import notrack.ai.data.chatmeta.ChatEntry;
import notrack.ai.data.notify.PremiumPushWorker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s80 implements le1 {
    public final /* synthetic */ int c;

    public /* synthetic */ s80(int i) {
        this.c = i;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                return w84Var;
            case 1:
                ChatEntry chatEntry = (ChatEntry) obj;
                chatEntry.getClass();
                return ChatEntry.copy$default(chatEntry, null, true ^ chatEntry.getPinned(), null, 0L, 61);
            case 2:
                ud0 ud0Var = (ud0) obj;
                ud0Var.getClass();
                return ud0Var.b;
            case 3:
                ud0 ud0Var2 = (ud0) obj;
                ud0Var2.getClass();
                return ud0Var2.b;
            case 4:
                za2 za2Var = (za2) obj;
                za2Var.getClass();
                u43 u43Var = xd0.a;
                return Boolean.valueOf(!xd0.e((String) ((ya2) za2Var.a()).get(1)));
            case 5:
                za2 za2Var2 = (za2) obj;
                za2Var2.getClass();
                u43 u43Var2 = xd0.a;
                return Boolean.valueOf(!xd0.e((String) ((ya2) za2Var2.a()).get(1)));
            case 6:
                vp0 vp0Var = (vp0) obj;
                if (vp0Var instanceof zp0) {
                    return (zp0) vp0Var;
                }
                return null;
            case 7:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 8:
                return obj;
            case 9:
                us1 us1Var = (us1) obj;
                us1Var.getClass();
                us1Var.b = true;
                return w84Var;
            case 10:
                wc0 wc0Var = (wc0) obj;
                wc0Var.getClass();
                wc0.a(wc0Var, "JsonPrimitive", new ht1(new lg(24)));
                wc0.a(wc0Var, "JsonNull", new ht1(new lg(25)));
                wc0.a(wc0Var, "JsonLiteral", new ht1(new lg(26)));
                wc0.a(wc0Var, "JsonObject", new ht1(new lg(27)));
                wc0.a(wc0Var, "JsonArray", new ht1(new lg(28)));
                return w84Var;
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                StringBuilder sb = new StringBuilder();
                jo3.a(sb, str);
                sb.append(':');
                sb.append(jsonElement);
                return sb.toString();
            case 12:
                ((String) obj).getClass();
                return w84Var;
            case 13:
                za2 za2Var3 = (za2) obj;
                za2Var3.getClass();
                String str2 = (String) ((ya2) za2Var3.a()).get(2);
                Object obj2 = ((ya2) za2Var3.a()).get(1);
                String strSubstring = str2.substring(0, 2);
                yo4.m(16);
                int i2 = Integer.parseInt(strSubstring, 16);
                String strSubstring2 = str2.substring(2, 4);
                yo4.m(16);
                int i3 = Integer.parseInt(strSubstring2, 16);
                String strSubstring3 = str2.substring(4, 6);
                yo4.m(16);
                int i4 = Integer.parseInt(strSubstring3, 16);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj2);
                sb2.append(i2);
                sb2.append(",");
                sb2.append(i3);
                sb2.append(",");
                return fq2.q(sb2, i4, "}");
            case 14:
                uw2 uw2Var = (uw2) obj;
                uw2Var.getClass();
                return Integer.valueOf(!to3.j0(uw2Var.a, "_pro", false) ? 1 : 0);
            case 15:
                uw2 uw2Var2 = (uw2) obj;
                uw2Var2.getClass();
                return Boolean.valueOf(uw2Var2.a());
            case 16:
                us1 us1Var2 = (us1) obj;
                Set set = PremiumPushWorker.i;
                us1Var2.getClass();
                us1Var2.b = true;
                return w84Var;
            case 17:
                us1 us1Var3 = (us1) obj;
                us1Var3.getClass();
                us1Var3.b = true;
                return w84Var;
            case 18:
                obj.getClass();
                return Integer.valueOf(j23.d.d(2147418112) + 65536);
            case 19:
                return Boolean.valueOf(obj == null);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return w84Var;
            case 21:
                us1 us1Var4 = (us1) obj;
                us1Var4.getClass();
                us1Var4.b = true;
                return w84Var;
            default:
                ((sj4) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
