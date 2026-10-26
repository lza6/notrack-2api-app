package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ef4 {
    public static final boolean r;
    public static final float[] s;
    public final Context a;
    public final ge4 b;
    public final nd0 c;
    public final jn3 d;
    public final s23 e;
    public final ah3 f;
    public final q23 g;
    public volatile int h;
    public ym3 i;
    public MediaPlayer j;
    public AudioFocusRequest k;
    public boolean l;
    public volatile String m;
    public volatile String n;
    public volatile String o;
    public volatile yt0 p;
    public final yq3 q;

    static {
        r = Build.VERSION.SDK_INT >= 29;
        s = new float[]{1.0f, 1.25f, 1.5f, 2.0f, 0.75f};
    }

    public ef4(Context context, ge4 ge4Var, nd0 nd0Var) {
        context.getClass();
        ge4Var.getClass();
        this.a = context;
        this.b = ge4Var;
        this.c = nd0Var;
        jn3 jn3VarF = gb2.f(new we4(null, 0, 0.0f, null, 511));
        this.d = jn3VarF;
        this.e = new s23(jn3VarF);
        ah3 ah3VarH = xr0.H(4, 5, null);
        this.f = ah3VarH;
        this.g = new q23(ah3VarH);
        this.q = new yq3(new wl(20, this));
    }

    /* JADX WARN: Code duplicated, block: B:168:0x04af A[LOOP:1: B:85:0x023f->B:168:0x04af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x026d A[EDGE_INSN: B:195:0x026d->B:87:0x026d BREAK  A[LOOP:1: B:85:0x023f->B:168:0x04af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r14v10, types: [qe4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0381 -> B:134:0x03ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x03dc -> B:179:0x03e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0422 -> B:142:0x042c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:168:0x04af
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.ef4 r47, int r48, java.lang.String r49, int r50, java.lang.String r51, defpackage.uo0 r52) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef4.a(ef4, int, java.lang.String, int, java.lang.String, uo0):java.lang.Object");
    }

    public static final double d(List list, he4 he4Var, double d) {
        double dDoubleValue;
        int i = he4Var.c;
        double dDoubleValue2 = he4Var.e;
        list.getClass();
        int i2 = i + 1;
        if (list.size() > i2) {
            Iterator it = ke0.w0(i2, list).iterator();
            dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += ((Number) it.next()).doubleValue();
            }
        } else {
            dDoubleValue = 0.0d;
        }
        if (dDoubleValue2 <= 0.0d) {
            Double d2 = (Double) ke0.A0(i, list);
            dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        }
        return d + dDoubleValue2 + dDoubleValue;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(int i, String str, int i2, String str2, boolean z, uo0 uo0Var) throws Throwable {
        ze4 ze4Var;
        int i3;
        boolean z2;
        Object objC;
        String str3;
        int i4;
        String str4;
        boolean z3;
        int i5;
        String str5;
        Object objC2;
        if (uo0Var instanceof ze4) {
            ze4Var = (ze4) uo0Var;
            int i6 = ze4Var.p;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ze4Var.p = i6 - Integer.MIN_VALUE;
            } else {
                ze4Var = new ze4(this, uo0Var);
            }
        } else {
            ze4Var = new ze4(this, uo0Var);
        }
        ze4 ze4Var2 = ze4Var;
        Object obj = ze4Var2.n;
        hq0 hq0Var = hq0.c;
        int i7 = ze4Var2.p;
        if (i7 == 0) {
            g13.O(obj);
            ge4 ge4Var = this.b;
            String str6 = this.m;
            String str7 = this.o;
            ze4Var2.h = str;
            ze4Var2.l = str2;
            i3 = i;
            ze4Var2.c = i3;
            ze4Var2.d = i2;
            z2 = z;
            ze4Var2.m = z2;
            ze4Var2.p = 1;
            objC = ge4Var.c(str, i2, str2, 0, str6, str7, ze4Var2);
            if (objC != hq0Var) {
                str3 = str;
                i4 = i2;
                str4 = str2;
            }
            return hq0Var;
        }
        if (i7 == 1) {
            boolean z4 = ze4Var2.m;
            i4 = ze4Var2.d;
            int i8 = ze4Var2.c;
            str4 = ze4Var2.l;
            str3 = ze4Var2.h;
            g13.O(obj);
            z2 = z4;
            objC = obj;
            i3 = i8;
        } else {
            if (i7 != 2) {
                if (i7 == 3) {
                    g13.O(obj);
                    return obj;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = ze4Var2.m;
            i4 = ze4Var2.d;
            int i9 = ze4Var2.c;
            str4 = ze4Var2.l;
            str3 = ze4Var2.h;
            g13.O(obj);
            i3 = i9;
        }
        i5 = i4;
        str5 = str3;
        if (i3 == this.h) {
            ge4 ge4Var2 = this.b;
            String str8 = this.m;
            String str9 = this.o;
            ze4Var2.h = null;
            ze4Var2.l = null;
            ze4Var2.c = i3;
            ze4Var2.d = i5;
            ze4Var2.m = z3;
            ze4Var2.p = 3;
            objC2 = ge4Var2.c(str5, i5, str4, 0, str8, str9, ze4Var2);
            if (objC2 != hq0Var) {
                return hq0Var;
            }
            return objC2;
        }
        return null;
        jf4 jf4Var = (jf4) objC;
        if (i3 == this.h) {
            if (z2 && (jf4Var instanceof gf4)) {
                gf4 gf4Var = (gf4) jf4Var;
                if (gf4Var.a == 404 && mo3.u0(gf4Var.b, "answer", true)) {
                    ze4Var2.h = str3;
                    ze4Var2.l = str4;
                    ze4Var2.c = i3;
                    ze4Var2.d = i4;
                    ze4Var2.m = z2;
                    ze4Var2.p = 2;
                    if (p23.u(600L, ze4Var2) != hq0Var) {
                        z3 = z2;
                        i5 = i4;
                        str5 = str3;
                        if (i3 == this.h) {
                            ge4 ge4Var3 = this.b;
                            String str10 = this.m;
                            String str11 = this.o;
                            ze4Var2.h = null;
                            ze4Var2.l = null;
                            ze4Var2.c = i3;
                            ze4Var2.d = i5;
                            ze4Var2.m = z3;
                            ze4Var2.p = 3;
                            objC2 = ge4Var3.c(str5, i5, str4, 0, str10, str11, ze4Var2);
                            if (objC2 != hq0Var) {
                                return objC2;
                            }
                        }
                    }
                    return hq0Var;
                }
            }
            return jf4Var;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e5 A[Catch: Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:39:0x00e1, B:41:0x00e5, B:44:0x00f1, B:45:0x00f5, B:47:0x0115, B:53:0x0139), top: B:74:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1 A[Catch: Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:39:0x00e1, B:41:0x00e5, B:44:0x00f1, B:45:0x00f5, B:47:0x0115, B:53:0x0139), top: B:74:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012d A[Catch: Exception -> 0x0139, TRY_LEAVE, TryCatch #4 {Exception -> 0x0139, blocks: (B:50:0x0127, B:52:0x012d), top: B:79:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197 A[Catch: Exception -> 0x019f, TRY_LEAVE, TryCatch #0 {Exception -> 0x019f, blocks: (B:15:0x003a, B:57:0x0184, B:59:0x0197), top: B:72:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object c(int i, he4 he4Var, double d, double d2, uo0 uo0Var) throws Throwable {
        af4 af4Var;
        double d3;
        double d4;
        File file;
        MediaPlayer mediaPlayer;
        double d5;
        File file2;
        MediaPlayer mediaPlayer2;
        double d6;
        int i2;
        jn3 jn3Var;
        Object value;
        float f;
        MediaPlayer mediaPlayer3;
        ym3 ym3VarF;
        boolean z;
        Object objS;
        ym3 ym3Var;
        int i3;
        boolean z2;
        boolean zBooleanValue;
        int i4 = i;
        if (uo0Var instanceof af4) {
            af4Var = (af4) uo0Var;
            int i5 = af4Var.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                af4Var.q = i5 - Integer.MIN_VALUE;
            } else {
                af4Var = new af4(this, uo0Var);
            }
        } else {
            af4Var = new af4(this, uo0Var);
        }
        af4 af4Var2 = af4Var;
        Object objY = af4Var2.o;
        hq0 hq0Var = hq0.c;
        int i6 = af4Var2.q;
        so0 so0Var = null;
        if (i6 == 0) {
            g13.O(objY);
            jt0 jt0Var = sw0.a;
            at0 at0Var = at0.c;
            hl3 hl3Var = new hl3(this, i4, he4Var, (so0) null);
            af4Var2.c = i4;
            af4Var2.m = d;
            af4Var2.n = d2;
            af4Var2.q = 1;
            objY = py.Y(at0Var, hl3Var, af4Var2);
            if (objY != hq0Var) {
                d3 = d;
                d4 = d2;
            }
            return hq0Var;
        }
        if (i6 == 1) {
            d4 = af4Var2.n;
            d3 = af4Var2.m;
            i4 = af4Var2.c;
            g13.O(objY);
        } else {
            if (i6 != 2) {
                if (i6 != 3) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = af4Var2.c;
                ym3Var = af4Var2.l;
                mediaPlayer = af4Var2.h;
                file = af4Var2.d;
                try {
                    g13.O(objY);
                    z = true;
                    zBooleanValue = ((Boolean) objY).booleanValue();
                    ym3Var.c(null);
                    this.j = null;
                    mediaPlayer.release();
                    file.delete();
                    if (zBooleanValue || i3 != this.h) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                } catch (Exception unused) {
                    this.j = null;
                    try {
                        mediaPlayer.release();
                    } catch (Exception unused2) {
                    }
                    file.delete();
                }
                return Boolean.valueOf(z2);
            }
            double d7 = af4Var2.n;
            double d8 = af4Var2.m;
            i4 = af4Var2.c;
            MediaPlayer mediaPlayer4 = af4Var2.h;
            file2 = af4Var2.d;
            try {
                g13.O(objY);
                d5 = d8;
                d4 = d7;
                mediaPlayer2 = mediaPlayer4;
                d6 = d5;
                i2 = i4;
                try {
                    if (i2 != this.h) {
                        mediaPlayer2.release();
                        file2.delete();
                        return Boolean.FALSE;
                    }
                    this.j = mediaPlayer2;
                    jn3Var = this.d;
                    do {
                        value = jn3Var.getValue();
                    } while (!jn3Var.n(value, we4.a((we4) value, false, false, 0.0d, 0.0d, 0.0f, null, 487)));
                    mediaPlayer2.start();
                    f = ((we4) this.d.getValue()).h;
                    mediaPlayer3 = this.j;
                    if (mediaPlayer3 != null) {
                        try {
                            if (mediaPlayer3.isPlaying()) {
                                mediaPlayer3.setPlaybackParams(new PlaybackParams().setSpeed(f));
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    ym3VarF = py.F(this.c, null, null, new bf4(mediaPlayer2, this, d6, d4, null), 3);
                    af4Var2.d = file2;
                    af4Var2.h = mediaPlayer2;
                    af4Var2.l = ym3VarF;
                    af4Var2.c = i2;
                    af4Var2.m = d6;
                    af4Var2.n = d4;
                    af4Var2.q = 3;
                    z = true;
                    t00 t00Var = new t00(1, gm4.G(af4Var2));
                    t00Var.u();
                    mediaPlayer2.setOnCompletionListener(new xe4(t00Var));
                    mediaPlayer2.setOnErrorListener(new ye4(t00Var));
                    t00Var.w(new qa0(3, mediaPlayer2));
                    objS = t00Var.s();
                    if (objS != hq0Var) {
                        mediaPlayer = mediaPlayer2;
                        objY = objS;
                        file = file2;
                        ym3Var = ym3VarF;
                        i3 = i2;
                        zBooleanValue = ((Boolean) objY).booleanValue();
                        ym3Var.c(null);
                        this.j = null;
                        mediaPlayer.release();
                        file.delete();
                        if (zBooleanValue) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                    return hq0Var;
                } catch (Exception unused4) {
                    mediaPlayer = mediaPlayer2;
                    file = file2;
                    this.j = null;
                    mediaPlayer.release();
                    file.delete();
                }
            } catch (Exception unused5) {
                mediaPlayer = mediaPlayer4;
                file = file2;
                this.j = null;
                mediaPlayer.release();
                file.delete();
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        File file3 = (File) objY;
        if (i4 != this.h) {
            file3.delete();
            return Boolean.FALSE;
        }
        MediaPlayer mediaPlayer5 = new MediaPlayer();
        try {
            mediaPlayer5.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
            mediaPlayer5.setDataSource(file3.getAbsolutePath());
            jt0 jt0Var2 = sw0.a;
            at0 at0Var2 = at0.c;
            fp fpVar = new fp(mediaPlayer5, so0Var, 4);
            af4Var2.d = file3;
            af4Var2.h = mediaPlayer5;
            af4Var2.c = i4;
            af4Var2.m = d3;
            af4Var2.n = d4;
            af4Var2.q = 2;
            if (py.Y(at0Var2, fpVar, af4Var2) != hq0Var) {
                d5 = d3;
                file2 = file3;
                mediaPlayer2 = mediaPlayer5;
                d6 = d5;
                i2 = i4;
                if (i2 != this.h) {
                    mediaPlayer2.release();
                    file2.delete();
                    return Boolean.FALSE;
                }
                this.j = mediaPlayer2;
                jn3Var = this.d;
                do {
                    value = jn3Var.getValue();
                } while (!jn3Var.n(value, we4.a((we4) value, false, false, 0.0d, 0.0d, 0.0f, null, 487)));
                mediaPlayer2.start();
                f = ((we4) this.d.getValue()).h;
                mediaPlayer3 = this.j;
                if (mediaPlayer3 != null) {
                    if (mediaPlayer3.isPlaying()) {
                        mediaPlayer3.setPlaybackParams(new PlaybackParams().setSpeed(f));
                    }
                }
                ym3VarF = py.F(this.c, null, null, new bf4(mediaPlayer2, this, d6, d4, null), 3);
                af4Var2.d = file2;
                af4Var2.h = mediaPlayer2;
                af4Var2.l = ym3VarF;
                af4Var2.c = i2;
                af4Var2.m = d6;
                af4Var2.n = d4;
                af4Var2.q = 3;
                z = true;
                t00 t00Var2 = new t00(1, gm4.G(af4Var2));
                t00Var2.u();
                mediaPlayer2.setOnCompletionListener(new xe4(t00Var2));
                mediaPlayer2.setOnErrorListener(new ye4(t00Var2));
                t00Var2.w(new qa0(3, mediaPlayer2));
                objS = t00Var2.s();
                if (objS != hq0Var) {
                    mediaPlayer = mediaPlayer2;
                    objY = objS;
                    file = file2;
                    ym3Var = ym3VarF;
                    i3 = i2;
                    zBooleanValue = ((Boolean) objY).booleanValue();
                    ym3Var.c(null);
                    this.j = null;
                    mediaPlayer.release();
                    file.delete();
                    if (zBooleanValue) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                }
            }
            return hq0Var;
        } catch (Exception unused6) {
            file = file3;
            mediaPlayer = mediaPlayer5;
            this.j = null;
            mediaPlayer.release();
            file.delete();
        }
    }

    public final void e() {
        boolean z = ((we4) this.d.getValue()).a || this.m != null;
        this.h++;
        f(z, true);
    }

    public final void f(boolean z, boolean z2) {
        ef4 ef4Var;
        ym3 ym3Var = this.i;
        so0 so0Var = null;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        this.i = null;
        yt0 yt0Var = this.p;
        if (yt0Var != null) {
            yt0Var.c(null);
        }
        this.p = null;
        MediaPlayer mediaPlayer = this.j;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setOnCompletionListener(null);
                mediaPlayer.setOnErrorListener(null);
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
            } catch (Exception unused) {
            }
            try {
                mediaPlayer.release();
            } catch (Exception unused2) {
            }
        }
        this.j = null;
        Object systemService = this.a.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            AudioFocusRequest audioFocusRequest = this.k;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
            this.k = null;
        }
        String str = this.n;
        String str2 = this.m;
        this.m = null;
        if (!z || str == null || (str2 == null && !z2)) {
            ef4Var = this;
        } else {
            ef4Var = this;
            py.F(this.c, null, null, new il3(ef4Var, str, str2, so0Var, 4), 3);
        }
        jn3 jn3Var = ef4Var.d;
        jn3Var.p(null, new we4(null, 0, ((we4) jn3Var.getValue()).h, ef4Var.o, 127));
        nd0 nd0Var = ef4Var.c;
        jt0 jt0Var = sw0.a;
        py.F(nd0Var, at0.c, null, new fp(ef4Var, so0Var, 5), 2);
    }
}
