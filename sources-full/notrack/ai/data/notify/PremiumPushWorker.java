package notrack.ai.data.notify;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.av1;
import defpackage.f2;
import defpackage.f63;
import defpackage.fq2;
import defpackage.i63;
import defpackage.jr1;
import defpackage.ka4;
import defpackage.kt1;
import defpackage.l53;
import defpackage.lq0;
import defpackage.m33;
import defpackage.mo3;
import defpackage.py;
import defpackage.q62;
import defpackage.rm2;
import defpackage.s2;
import defpackage.s80;
import defpackage.sn2;
import defpackage.tn2;
import defpackage.vu;
import defpackage.xr0;
import defpackage.y23;
import defpackage.yq3;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import notrack.ai.MainActivity;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class PremiumPushWorker extends CoroutineWorker {
    public static final Set i = py.S("ar", "fa", "he", "ur", "ps");
    public final kt1 g;
    public final tn2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumPushWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = xr0.G(new s80(16));
        sn2 sn2Var = new sn2();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        sn2Var.r = ka4.b(15L, timeUnit);
        timeUnit.getClass();
        sn2Var.s = ka4.b(15L, timeUnit);
        this.h = new tn2(sn2Var);
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(lq0 lq0Var) {
        try {
            Context context = this.a;
            context.getClass();
            d(context);
        } catch (Throwable unused) {
        }
        return new q62();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d3  */
    public final void d(Context context) {
        Object i63Var;
        Object i63Var2;
        String strQ;
        Object next;
        m33 m33Var;
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        SharedPreferences sharedPreferences = context.getSharedPreferences("notify", 0);
        if (new rm2(context).b.areNotificationsEnabled() && !sharedPreferences.getBoolean("notifyOptOut", false)) {
            if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) != null && (notificationChannel = notificationManager.getNotificationChannel("offers")) != null && notificationChannel.getImportance() == 0) {
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.getClass();
            if (Options$Companion.inWindow$app_playRelease(calendar)) {
                Object objClone = calendar.clone();
                objClone.getClass();
                Calendar calendar2 = (Calendar) objClone;
                calendar2.setFirstDayOfWeek(2);
                calendar2.setMinimalDaysInFirstWeek(4);
                int i2 = calendar2.get(3);
                int i3 = 1;
                int i4 = calendar2.get(1);
                if (i2 == 1 && calendar2.get(2) == 11) {
                    i4++;
                }
                if (i2 >= 52 && calendar2.get(2) == 0) {
                    i4--;
                }
                int i5 = (i4 * 100) + i2;
                if (sharedPreferences.getInt("premWeek", 0) == i5) {
                    return;
                }
                long j = sharedPreferences.getLong("lastOpenAt", 0L);
                if (j <= 0 || System.currentTimeMillis() - j <= 2592000000L) {
                    try {
                        yq3 yq3Var = new yq3(new s2(context, 0));
                        xr0.G(new f2(i3));
                        i63Var = Boolean.valueOf(((SharedPreferences) yq3Var.getValue()).getBoolean("plan_active", false));
                    } catch (Throwable th) {
                        i63Var = new i63(th);
                    }
                    Object obj = Boolean.FALSE;
                    if (i63Var instanceof i63) {
                        i63Var = obj;
                    }
                    if (((Boolean) i63Var).booleanValue()) {
                        return;
                    }
                    try {
                        vu vuVar = new vu();
                        vuVar.p("https://notrack.ai/premium-push.php?ch=play");
                        vuVar.m("User-Agent", "notrack-android/1.10.13");
                        vuVar.h();
                        l53 l53VarG = vuVar.g();
                        tn2 tn2Var = this.h;
                        tn2Var.getClass();
                        f63 f63VarF = new y23(tn2Var, l53VarG).f();
                        try {
                            i63Var2 = (!f63VarF.c() || (m33Var = f63VarF.o) == null) ? null : m33Var.l();
                            f63VarF.close();
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                jr1.i(f63VarF, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        i63Var2 = new i63(th4);
                    }
                    if (i63Var2 instanceof i63) {
                        i63Var2 = null;
                    }
                    String str = (String) i63Var2;
                    if (str == null) {
                        return;
                    }
                    kt1 kt1Var = this.g;
                    kt1Var.getClass();
                    PremiumPushResponse premiumPushResponse = (PremiumPushResponse) kt1Var.b(PremiumPushResponse.Companion.serializer(), str);
                    if (premiumPushResponse.getEnabled()) {
                        List<PremiumPushItem> items = premiumPushResponse.getItems();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : items) {
                            PremiumPushItem premiumPushItem = (PremiumPushItem) obj2;
                            if (!mo3.C0(premiumPushItem.getId()) && premiumPushItem.getMinCode() <= 1295) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        int i6 = sharedPreferences.getInt("premIdx", 0);
                        PremiumPushItem premiumPushItem2 = (PremiumPushItem) arrayList.get(Math.floorMod(i6, arrayList.size()));
                        Map<String, PushCopy> copyPlay = !premiumPushItem2.getCopyPlay().isEmpty() ? premiumPushItem2.getCopyPlay() : premiumPushItem2.getCopy();
                        String string = sharedPreferences.getString("appLoc", null);
                        copyPlay.getClass();
                        if (string == null) {
                            strQ = py.Q();
                        } else {
                            strQ = !mo3.C0(string) ? string : null;
                            if (strQ == null) {
                                strQ = py.Q();
                            }
                        }
                        String strR0 = mo3.R0('-', strQ);
                        PushCopy pushCopy = copyPlay.get(strQ);
                        if (pushCopy == null && (pushCopy = copyPlay.get(strR0)) == null) {
                            Iterator<T> it = copyPlay.entrySet().iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!mo3.R0('-', (String) ((Map.Entry) next).getKey()).equals(strR0));
                            Map.Entry entry = (Map.Entry) next;
                            PushCopy pushCopy2 = entry != null ? (PushCopy) entry.getValue() : null;
                            pushCopy = pushCopy2 == null ? copyPlay.get("en") : pushCopy2;
                        }
                        if (pushCopy == null || mo3.C0(pushCopy.getTitle())) {
                            return;
                        }
                        if (string == null) {
                            string = py.Q();
                        }
                        boolean zContains = i.contains(mo3.R0('-', string));
                        String title = pushCopy.getTitle();
                        if (zContains) {
                            title = fq2.m("\u200f", title);
                        }
                        String strM = zContains ? fq2.m("\u200f", pushCopy.getBody()) : pushCopy.getBody();
                        String strM2 = fq2.m("push_", premiumPushItem2.getId());
                        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                        intent.setFlags(335544320);
                        intent.putExtra("notrack.premium_from", strM2);
                        PendingIntent activity = PendingIntent.getActivity(context, 1003, intent, 201326592);
                        activity.getClass();
                        av1.J(context, 1003, "offers", title, strM, activity);
                        sharedPreferences.edit().putInt("premWeek", i5).putInt("premIdx", i6 + 1).apply();
                    }
                }
            }
        }
    }
}
