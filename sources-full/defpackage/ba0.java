package defpackage;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import app.template.extension.BuildConfig;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;
import notrack.ai.data.promo.BonusBar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba0 extends we1 implements je1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.c = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(hb0 hb0Var, int i) {
        super(0, 0, hb0.class, hb0Var, "closeVoiceMenu", "closeVoiceMenu()V");
        this.c = i;
        switch (i) {
            case 1:
                super(0, 0, hb0.class, hb0Var, "dismissVoiceGate", "dismissVoiceGate()V");
                break;
            case 2:
                super(0, 0, hb0.class, hb0Var, "dismissImageGate", "dismissImageGate()V");
                break;
            case 3:
                super(0, 0, hb0.class, hb0Var, "clearAvatar", "clearAvatar()V");
                break;
            case 4:
                super(0, 0, hb0.class, hb0Var, "closeAvatarPicker", "closeAvatarPicker()V");
                break;
            case 5:
                super(0, 0, hb0.class, hb0Var, "acknowledgeRecoveryCode", "acknowledgeRecoveryCode()V");
                break;
            case 6:
                super(0, 0, hb0.class, hb0Var, "signOut", "signOut()V");
                break;
            case 7:
                super(0, 0, hb0.class, hb0Var, "startAccountDeletion", "startAccountDeletion()V");
                break;
            case 8:
                super(0, 0, hb0.class, hb0Var, "cancelAccountDeletion", "cancelAccountDeletion()V");
                break;
            case 9:
                super(0, 0, hb0.class, hb0Var, "clearAccountError", "clearAccountError()V");
                break;
            case 10:
                super(0, 0, hb0.class, hb0Var, "closeInstructions", "closeInstructions()V");
                break;
            case 11:
                super(0, 0, hb0.class, hb0Var, "bgReset", "bgReset()V");
                break;
            case 12:
                super(0, 0, hb0.class, hb0Var, "bgDone", "bgDone()V");
                break;
            case 13:
                super(0, 0, hb0.class, hb0Var, "bgDismiss", "bgDismiss()V");
                break;
            case 14:
                super(0, 0, hb0.class, hb0Var, "carryMake", "carryMake()V");
                break;
            case 15:
                super(0, 0, hb0.class, hb0Var, "carryStart", "carryStart()V");
                break;
            case 16:
                super(0, 0, hb0.class, hb0Var, "carryDismiss", "carryDismiss()V");
                break;
            case 17:
                super(0, 0, hb0.class, hb0Var, "dismissUnofficial", "dismissUnofficial()V");
                break;
            case 18:
                super(0, 0, hb0.class, hb0Var, "dismissCarryGate", "dismissCarryGate()V");
                break;
            case 19:
                super(0, 0, hb0.class, hb0Var, "dismissInstrGate", "dismissInstrGate()V");
                break;
            default:
                break;
        }
    }

    private final Object a() {
        hb0 hb0Var = (hb0) this.receiver;
        String clickUrl = hb0Var.b.d.b.getPickSlot().getClickUrl();
        if (clickUrl.length() > 0) {
            hb0Var.X(new b50(clickUrl));
        }
        return w84.a;
    }

    private final Object c() {
        hb0 hb0Var = (hb0) this.receiver;
        b13 b13Var = hb0Var.b.d;
        int dismissDays = b13Var.b.getPickSlot().getDismissDays();
        if (dismissDays < 1) {
            dismissDays = 1;
        }
        b13Var.a.edit().putLong("pick.until", (((long) dismissDays) * 86400000) + System.currentTimeMillis()).apply();
        jn3 jn3Var = hb0Var.w;
        Boolean bool = Boolean.FALSE;
        jn3Var.getClass();
        jn3Var.p(null, bool);
        return w84.a;
    }

    private final Object d() {
        Object value;
        jn3 jn3Var = ((hb0) this.receiver).c;
        do {
            value = jn3Var.getValue();
        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, t94.a, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -131073, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
        return w84.a;
    }

    private final Object e() {
        hb0 hb0Var = (hb0) this.receiver;
        BonusBar bonusBar = (BonusBar) hb0Var.y.getValue();
        if (bonusBar != null) {
            py.F(id4.a(hb0Var), null, null, new ya0(0, hb0Var, null, Locale.getDefault().getLanguage()), 3);
            hb0Var.X(new b50(bonusBar.getUrl()));
        }
        return w84.a;
    }

    private final Object f() {
        hb0 hb0Var = (hb0) this.receiver;
        jb jbVar = hb0Var.b.e;
        jn3 jn3Var = hb0Var.y;
        BonusBar bonusBar = (BonusBar) jn3Var.getValue();
        int hideHours = bonusBar != null ? bonusBar.getHideHours() : 24;
        jbVar.getClass();
        ((SharedPreferences) jbVar.d).edit().putLong("hiddenUntil", (((long) py.x(hideHours, 1, 720)) * 3600000) + System.currentTimeMillis()).apply();
        jn3Var.o(null);
        return w84.a;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        xa0 xa0Var;
        tt ttVarD;
        boolean zM;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        Object value12;
        Object value13;
        int i = this.c;
        so0 so0Var = null;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ((hb0) this.receiver).t();
                return w84Var;
            case 1:
                ((hb0) this.receiver).v();
                return w84Var;
            case 2:
                ((hb0) this.receiver).u();
                return w84Var;
            case 3:
                hb0 hb0Var = (hb0) this.receiver;
                jn3 jn3Var = hb0Var.c;
                String str = ((xa0) jn3Var.getValue()).r0;
                if (str != null) {
                    if (((xa0) jn3Var.getValue()).c0.getSignedIn()) {
                        py.F(id4.a(hb0Var), null, null, new ya0(2, hb0Var, so0Var, str), 3);
                    } else {
                        yg1 yg1VarI = hb0Var.b.i();
                        yg1VarI.getClass();
                        yg1VarI.a.edit().remove(str).apply();
                        do {
                            value = jn3Var.getValue();
                        } while (!jn3Var.n(value, xa0.a((xa0) value, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1, str.equals("ai") ? 127 : 191)));
                    }
                }
                return w84Var;
            case 4:
                jn3 jn3Var2 = ((hb0) this.receiver).c;
                do {
                    value2 = jn3Var2.getValue();
                } while (!jn3Var2.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1, 223)));
                return w84Var;
            case 5:
                jn3 jn3Var3 = ((hb0) this.receiver).c;
                do {
                    value3 = jn3Var3.getValue();
                } while (!jn3Var3.n(value3, xa0.a((xa0) value3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -67108865, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84Var;
            case 6:
                hb0 hb0Var2 = (hb0) this.receiver;
                hb0Var2.getClass();
                py.F(id4.a(hb0Var2), null, null, new bb0(hb0Var2, so0Var, 13), 3);
                return w84Var;
            case 7:
                hb0 hb0Var3 = (hb0) this.receiver;
                hb0Var3.getClass();
                py.F(id4.a(hb0Var3), null, null, new bb0(hb0Var3, so0Var, 14), 3);
                return w84Var;
            case 8:
                jn3 jn3Var4 = ((hb0) this.receiver).c;
                do {
                    value4 = jn3Var4.getValue();
                } while (!jn3Var4.n(value4, xa0.a((xa0) value4, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -285212673, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84Var;
            case 9:
                ((hb0) this.receiver).s();
                return w84Var;
            case 10:
                hb0 hb0Var4 = (hb0) this.receiver;
                if (!((xa0) hb0Var4.d.c.getValue()).x) {
                    jn3 jn3Var5 = hb0Var4.c;
                    do {
                        value5 = jn3Var5.getValue();
                    } while (!jn3Var5.n(value5, xa0.a((xa0) value5, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -4194305, -32769, KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                return w84Var;
            case 11:
                hb0 hb0Var5 = (hb0) this.receiver;
                qt qtVar = ((xa0) hb0Var5.d.c.getValue()).y;
                if (qtVar != null) {
                    hb0Var5.b.c.w();
                    jn3 jn3Var6 = hb0Var5.c;
                    do {
                        value6 = jn3Var6.getValue();
                        xa0Var = (xa0) value6;
                    } while (!jn3Var6.n(value6, xa0.a(xa0Var, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, new tt(qtVar.g.d, qtVar.h.d, 11, qtVar.n), false, xa0Var.C + 1, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -469762049, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                return w84Var;
            case 12:
                hb0 hb0Var6 = (hb0) this.receiver;
                e60 e60Var = hb0Var6.b;
                xa0 xa0Var2 = (xa0) hb0Var6.d.c.getValue();
                qt qtVar2 = xa0Var2.y;
                if (qtVar2 != null && (ttVarD = xa0Var2.A) != null && ((zM = hb0.m(xa0Var2)) || ttVarD.c(qtVar2))) {
                    if (!zM) {
                        ttVarD = ttVarD.d(qtVar2);
                    }
                    String str2 = ttVarD.b;
                    String str3 = ttVarD.d;
                    String str4 = ttVarD.a;
                    if (zM) {
                        if (kr1.n(str4, "own")) {
                            e60Var.c.q("bg");
                        } else {
                            e60Var.c.E("bg").delete();
                        }
                        if (kr1.n(str3, "own")) {
                            e60Var.c.q("pt");
                        } else {
                            e60Var.c.E("pt").delete();
                        }
                    }
                    if (kr1.n(str2, "own")) {
                        e60Var.c.q("fx");
                    }
                    e60Var.c.w();
                    ci4 ci4Var = e60Var.c;
                    ci4Var.getClass();
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) ci4Var.h).edit();
                    String string = new JSONObject().put("bg", str4).put("fx", str2).put("dim", ttVarD.c).put("pt", str3).put("ps", ttVarD.e).put("po", ttVarD.f).toString();
                    string.getClass();
                    editorEdit.putString("state", string).apply();
                    jn3 jn3Var7 = hb0Var6.c;
                    while (true) {
                        Object value14 = jn3Var7.getValue();
                        xa0 xa0Var3 = (xa0) value14;
                        tt ttVar = ttVarD;
                        if (!jn3Var7.n(value14, xa0.a(xa0Var3, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, ttVar, null, false, xa0Var3.C + 1, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -369098753, -1, KotlinVersion.MAX_COMPONENT_VALUE))) {
                            ttVarD = ttVar;
                        }
                    }
                }
                return w84Var;
            case 13:
                ((hb0) this.receiver).j();
                return w84Var;
            case 14:
                ((hb0) this.receiver).q();
                return w84Var;
            case 15:
                hb0 hb0Var7 = (hb0) this.receiver;
                xa0 xa0Var4 = (xa0) hb0Var7.d.c.getValue();
                String str5 = xa0Var4.c;
                if (str5 != null) {
                    String string2 = mo3.U0(xa0Var4.I).toString();
                    if (string2.length() != 0 && !xa0Var4.J && !xa0Var4.P) {
                        jn3 jn3Var8 = hb0Var7.c;
                        do {
                            value7 = jn3Var8.getValue();
                        } while (!jn3Var8.n(value7, xa0.a((xa0) value7, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, true, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -545, KotlinVersion.MAX_COMPONENT_VALUE)));
                        py.F(id4.a(hb0Var7), null, null, new qb(xa0Var4, hb0Var7, str5, string2, null, 4), 3);
                    }
                }
                return w84Var;
            case 16:
                hb0 hb0Var8 = (hb0) this.receiver;
                if (!((xa0) hb0Var8.d.c.getValue()).P) {
                    ym3 ym3Var = hb0Var8.E;
                    if (ym3Var != null) {
                        ym3Var.c(null);
                    }
                    hb0Var8.E = null;
                    jn3 jn3Var9 = hb0Var8.c;
                    do {
                        value8 = jn3Var9.getValue();
                    } while (!jn3Var9.n(value8, xa0.a((xa0) value8, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, BuildConfig.VERSION_NAME, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -47, KotlinVersion.MAX_COMPONENT_VALUE)));
                }
                return w84Var;
            case 17:
                jn3 jn3Var10 = ((hb0) this.receiver).c;
                do {
                    value9 = jn3Var10.getValue();
                } while (!jn3Var10.n(value9, xa0.a((xa0) value9, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -2049, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84Var;
            case 18:
                hb0 hb0Var9 = (hb0) this.receiver;
                if (((xa0) hb0Var9.d.c.getValue()).Q != null) {
                    hb0Var9.z("close", "carry_gate", "carry_app");
                }
                jn3 jn3Var11 = hb0Var9.c;
                do {
                    value10 = jn3Var11.getValue();
                } while (!jn3Var11.n(value10, xa0.a((xa0) value10, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -1, -1025, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84Var;
            case 19:
                hb0 hb0Var10 = (hb0) this.receiver;
                if (((xa0) hb0Var10.d.c.getValue()).F != null) {
                    hb0Var10.z("close", "instr_gate", "instr_app");
                }
                jn3 jn3Var12 = hb0Var10.c;
                do {
                    value11 = jn3Var12.getValue();
                } while (!jn3Var12.n(value11, xa0.a((xa0) value11, null, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, IntCompanionObject.MAX_VALUE, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                ((hb0) this.receiver).x();
                return w84Var;
            case 21:
                ((hb0) this.receiver).N();
                return w84Var;
            case 22:
                hb0 hb0Var11 = (hb0) this.receiver;
                List listO0 = ke0.O0(((xa0) hb0Var11.d.c.getValue()).a0);
                if (!listO0.isEmpty()) {
                    py.F(id4.a(hb0Var11), null, null, new pb(hb0Var11, listO0, null), 3);
                }
                return w84Var;
            case 23:
                hb0 hb0Var12 = (hb0) this.receiver;
                hb0Var12.getClass();
                py.F(id4.a(hb0Var12), null, null, new eb0(hb0Var12, null), 3);
                return w84Var;
            case 24:
                return a();
            case 25:
                return c();
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                return f();
            default:
                ef4 ef4VarH = ((hb0) this.receiver).H();
                jn3 jn3Var13 = ef4VarH.d;
                MediaPlayer mediaPlayer = ef4VarH.j;
                if (mediaPlayer != null) {
                    try {
                        if (mediaPlayer.isPlaying()) {
                            mediaPlayer.pause();
                            do {
                                value13 = jn3Var13.getValue();
                            } while (!jn3Var13.n(value13, we4.a((we4) value13, false, true, 0.0d, 0.0d, 0.0f, null, 495)));
                        } else {
                            mediaPlayer.start();
                            do {
                                value12 = jn3Var13.getValue();
                            } while (!jn3Var13.n(value12, we4.a((we4) value12, false, false, 0.0d, 0.0d, 0.0f, null, 495)));
                        }
                        break;
                    } catch (IllegalStateException unused) {
                    }
                }
                return w84Var;
        }
    }
}
