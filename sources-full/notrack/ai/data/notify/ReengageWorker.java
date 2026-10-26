package notrack.ai.data.notify;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import app.template.extension.BuildConfig;
import defpackage.av1;
import defpackage.f63;
import defpackage.i63;
import defpackage.jr1;
import defpackage.ka4;
import defpackage.kr1;
import defpackage.kt1;
import defpackage.l53;
import defpackage.lq0;
import defpackage.m33;
import defpackage.mo3;
import defpackage.q62;
import defpackage.rm2;
import defpackage.s80;
import defpackage.sn2;
import defpackage.tn2;
import defpackage.vu;
import defpackage.xr0;
import defpackage.y23;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import notrack.ai.MainActivity;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ReengageWorker extends CoroutineWorker {
    public final kt1 g;
    public final tn2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReengageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = xr0.G(new s80(17));
        sn2 sn2Var = new sn2();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        sn2Var.r = ka4.b(15L, timeUnit);
        timeUnit.getClass();
        sn2Var.s = ka4.b(15L, timeUnit);
        this.h = new tn2(sn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(lq0 lq0Var) {
        String language;
        Context context = this.a;
        context.getClass();
        if (!new rm2(context).b.areNotificationsEnabled()) {
            return new q62();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("notify", 0);
        if (sharedPreferences.getBoolean("notifyOptOut", false)) {
            return new q62();
        }
        String string = sharedPreferences.getString("appLang", null);
        if (string == null) {
            language = Locale.getDefault().getLanguage();
        } else {
            language = mo3.C0(string) ? null : string;
            if (language == null) {
                language = Locale.getDefault().getLanguage();
            }
        }
        try {
            language.getClass();
            d(context, sharedPreferences, language);
        } catch (Throwable unused) {
        }
        try {
            Set set = PremiumPushWorker.i;
            Options$Companion.schedule(context);
        } catch (Throwable unused2) {
        }
        return new q62();
    }

    public final void d(Context context, SharedPreferences sharedPreferences, String str) {
        Object i63Var;
        m33 m33Var;
        String strConcat = "https://notrack.ai/announcements.php?loc=".concat(str);
        Object obj = null;
        try {
            vu vuVar = new vu();
            vuVar.p(strConcat);
            vuVar.m("User-Agent", "notrack-android/1.10.13");
            vuVar.h();
            l53 l53VarG = vuVar.g();
            tn2 tn2Var = this.h;
            tn2Var.getClass();
            f63 f63VarF = new y23(tn2Var, l53VarG).f();
            try {
                i63Var = (!f63VarF.c() || (m33Var = f63VarF.o) == null) ? null : m33Var.l();
                f63VarF.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    jr1.i(f63VarF, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            i63Var = new i63(th3);
        }
        if (i63Var instanceof i63) {
            i63Var = null;
        }
        String str2 = (String) i63Var;
        if (str2 == null) {
            return;
        }
        kt1 kt1Var = this.g;
        kt1Var.getClass();
        for (Object obj2 : ((AnnouncementsResponse) kt1Var.b(AnnouncementsResponse.Companion.serializer(), str2)).getItems()) {
            Announcement announcement = (Announcement) obj2;
            if (!mo3.C0(announcement.getId()) && announcement.getMinCode() <= 1295) {
                obj = obj2;
                break;
            }
        }
        Announcement announcement2 = (Announcement) obj;
        if (announcement2 == null || kr1.n(sharedPreferences.getString("lastAnnId", BuildConfig.VERSION_NAME), announcement2.getId()) || System.currentTimeMillis() - sharedPreferences.getLong("lastAnnAt", 0L) < 604800000) {
            return;
        }
        AnnouncementCopy announcementCopy = announcement2.getCopy().get(str);
        if ((announcementCopy == null && (announcementCopy = announcement2.getCopy().get("en")) == null) || mo3.C0(announcementCopy.getTitle())) {
            return;
        }
        String title = announcementCopy.getTitle();
        String body = announcementCopy.getBody();
        context.getClass();
        title.getClass();
        body.getClass();
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, 1002, intent, 201326592);
        activity.getClass();
        av1.J(context, 1002, "updates", title, body, activity);
        sharedPreferences.edit().putString("lastAnnId", announcement2.getId()).putLong("lastAnnAt", System.currentTimeMillis()).apply();
    }
}
