package defpackage;

import ai.notrack.app.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.UriHandler;
import app.template.extension.BuildConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.LongCompanionObject;
import notrack.ai.MainActivity;
import notrack.ai.data.chatmeta.FolderMeta;
import notrack.ai.data.voice.VoiceOption;
import notrack.ai.ui.components.HtmlPreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ye implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    public /* synthetic */ ye(UriHandler uriHandler, mi2 mi2Var) {
        this.c = 10;
        this.d = uriHandler;
        this.h = mi2Var;
    }

    public /* synthetic */ ye(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        String[] strArrNames;
        vq4 vq4Var;
        int i = 0;
        switch (this.c) {
            case 0:
                ef efVar = (ef) this.d;
                l43 l43Var = (l43) this.h;
                wm1 wm1VarN = sf3.N(efVar.a, efVar.c);
                try {
                    ImageDecoder.Source sourceD0 = p23.d0(wm1VarN, efVar.b, true);
                    if (sourceD0 == null) {
                        ny nyVarD = wm1VarN.D();
                        try {
                            nyVarD.j(LongCompanionObject.MAX_VALUE);
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) nyVarD.q().d);
                            while (!nyVarD.q().r()) {
                                nyVarD.q().read(byteBufferAllocateDirect);
                            }
                            byteBufferAllocateDirect.flip();
                            nyVarD.close();
                            sourceD0 = ImageDecoder.createSource(byteBufferAllocateDirect);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                jr1.i(nyVarD, th);
                                throw th2;
                            }
                        }
                    }
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceD0, new bf(efVar, l43Var, i));
                    xp1.g(wm1VarN, null);
                    return drawableDecodeDrawable;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        xp1.g(wm1VarN, th3);
                        throw th4;
                    }
                }
            case 1:
                ((mi2) this.h).setValue((String) this.d);
                return w84.a;
            case 2:
                hb0 hb0Var = (hb0) this.d;
                g04 g04Var = ((xa0) ((gn3) this.h).getValue()).k;
                g04 g04Var2 = g04.d;
                g04 g04Var3 = g04Var == g04Var2 ? g04.c : g04Var2;
                hb0Var.b.a.c("theme_dark", g04Var3 == g04Var2);
                jn3 jn3Var = hb0Var.c;
                while (true) {
                    Object value = jn3Var.getValue();
                    g04 g04Var4 = g04Var3;
                    if (jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, g04Var4, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1025, -1, KotlinVersion.MAX_COMPONENT_VALUE))) {
                        return w84.a;
                    }
                    g04Var3 = g04Var4;
                }
                break;
            case 3:
                List list = (List) this.d;
                mi2 mi2Var = (mi2) this.h;
                List listQ0 = ke0.Q0(list);
                Collections.shuffle(listQ0);
                mi2Var.setValue(ke0.L0(3, listQ0));
                return w84.a;
            case 4:
                lh1 lh1Var = (lh1) this.d;
                je1 je1Var = (je1) this.h;
                lh1Var.mo63x70bb4fce(0);
                je1Var.invoke();
                return w84.a;
            case 5:
                j92 j92Var = (j92) this.d;
                Context context = (Context) this.h;
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                intent.putExtra("android.speech.extra.PROMPT", context.getString(R.string.voice_speak_now));
                try {
                    j92Var.a(intent, null);
                    break;
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(context, context.getString(R.string.voice_unavailable), 0).show();
                }
                return w84.a;
            case 6:
                mi2 mi2Var2 = (mi2) this.d;
                za1 za1Var = (za1) this.h;
                mi2Var2.setValue(new ey3(BuildConfig.VERSION_NAME, p23.d(0, 0), 4));
                try {
                    za1.b(za1Var);
                    break;
                } catch (Throwable unused2) {
                }
                return w84.a;
            case 7:
                String str = (String) this.d;
                Context context2 = (Context) this.h;
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str);
                try {
                    context2.startActivity(Intent.createChooser(intent2, null));
                    break;
                } catch (Throwable unused3) {
                }
                return w84.a;
            case 8:
                try {
                    ((UriHandler) this.d).openUri(((e94) this.h).b);
                    break;
                } catch (Throwable unused4) {
                }
                return w84.a;
            case 9:
                ((le1) this.d).invoke(((yd2) this.h).b);
                return w84.a;
            case 10:
                wa0.h1((mi2) this.h, true);
                return w84.a;
            case 11:
                ((ClipboardManager) this.d).setText(new hg((String) this.h));
                return w84.a;
            case 12:
                ((hb0) this.d).W(((w10) this.h).b);
                return w84.a;
            case 13:
                ((hb0) this.d).W((String) this.h);
                return w84.a;
            case 14:
                ((mi2) this.h).setValue(((FolderMeta) this.d).getId());
                return w84.a;
            case 15:
                return kr1.T(new ps2((s61) this.d, (vc0) this.h));
            case 16:
                y3 y3Var = (y3) this.d;
                String str2 = (String) this.h;
                String str3 = HtmlPreviewActivity.D;
                y3Var.a(str2, null);
                return w84.a;
            case 17:
                tf3 tf3Var = (tf3) this.d;
                rs1 rs1Var = (rs1) this.h;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ws1 ws1Var = rs1Var.a;
                ot1.a(rs1Var, tf3Var);
                int iD = tf3Var.d();
                for (int i2 = 0; i2 < iD; i2++) {
                    List listH = tf3Var.h(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listH) {
                        if (obj instanceof nt1) {
                            arrayList.add(obj);
                        }
                    }
                    nt1 nt1Var = (nt1) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (nt1Var != null && (strArrNames = nt1Var.names()) != null) {
                        for (String str4 : strArrNames) {
                            String str5 = kr1.n(tf3Var.c(), yf3.n) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str4)) {
                                throw new jt1("The suggested name '" + str4 + "' for " + str5 + ' ' + tf3Var.e(i2) + " is already one of the names for " + str5 + ' ' + tf3Var.e(((Number) y92.R(str4, linkedHashMap)).intValue()) + " in " + tf3Var);
                            }
                            linkedHashMap.put(str4, Integer.valueOf(i2));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? a31.c : linkedHashMap;
            case 18:
                MainActivity mainActivity = (MainActivity) this.d;
                mi2 mi2Var3 = (mi2) this.h;
                int i3 = MainActivity.L;
                mi2Var3.setValue(Boolean.FALSE);
                if (Build.VERSION.SDK_INT >= 33) {
                    mainActivity.J.a("android.permission.POST_NOTIFICATIONS", null);
                }
                return w84.a;
            case 19:
                ((j92) this.d).a((String) this.h, null);
                return w84.a;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return gm4.i((String) this.d, zo3.q, new tf3[0], new s(7, (fn2) this.h));
            case 21:
                ((le1) this.d).invoke((uw2) this.h);
                return w84.a;
            case 22:
                MainActivity mainActivity2 = (MainActivity) this.d;
                ir3 ir3Var = (ir3) this.h;
                Context applicationContext = mainActivity2.getApplicationContext();
                synchronized (gm4.class) {
                    try {
                        if (gm4.a == null) {
                            Context applicationContext2 = applicationContext.getApplicationContext();
                            if (applicationContext2 != null) {
                                applicationContext = applicationContext2;
                            }
                            gm4.a = new vq4(new tu(applicationContext, (byte) 0));
                        }
                        vq4Var = gm4.a;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                np4 np4Var = (np4) vq4Var.c.f();
                l33 l33Var = (l33) ir3Var.l;
                synchronized (np4Var) {
                    um4 um4Var = np4Var.b;
                    synchronized (um4Var) {
                        um4Var.a.f("registerListener", new Object[0]);
                        if (l33Var == null) {
                            throw new NullPointerException("Registered Play Core listener should not be null.");
                        }
                        um4Var.d.add(l33Var);
                        um4Var.a();
                    }
                }
                return np4Var;
            case 23:
                u43 u43Var = (u43) this.d;
                CharSequence charSequence = (CharSequence) this.h;
                u43Var.getClass();
                charSequence.getClass();
                Matcher matcher = u43Var.c.matcher(charSequence);
                matcher.getClass();
                return kr1.d(matcher, 0, charSequence);
            default:
                ((le1) this.d).invoke(((VoiceOption) this.h).getName());
                return w84.a;
        }
    }
}
