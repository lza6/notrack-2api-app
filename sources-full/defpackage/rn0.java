package defpackage;

import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import androidx.compose.ui.text.font.a;
import app.template.extension.BuildConfig;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class rn0 implements sn0, wo0, a41, i61, zp3, nh1, sl2, a, lw2, jy2, c03 {
    public final /* synthetic */ int c;

    public /* synthetic */ rn0(int i) {
        this.c = i;
    }

    public static Typeface q(String str, ic1 ic1Var, int i) {
        if (i == 0 && kr1.n(ic1Var, ic1.h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iE = sf3.E(ic1Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iE) : Typeface.create(str, iE);
    }

    public static boolean r(e21 e21Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                i74[] i74VarArr = (i74[]) editable.getSpans(selectionStart, iMin, i74.class);
                if (i74VarArr != null && i74VarArr.length > 0) {
                    for (i74 i74Var : i74VarArr) {
                        int spanStart = editable.getSpanStart(i74Var);
                        int spanEnd = editable.getSpanEnd(i74Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    e21Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    e21Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static int t(um1 um1Var, float f) {
        boolean zEquals = "em".equals(um1Var.b);
        float f2 = um1Var.a;
        if (zEquals) {
            f2 *= f;
        }
        return (int) (f2 + 0.5f);
    }

    @Override // defpackage.zp3
    public aq3 a(yp3 yp3Var) {
        return new fe1(yp3Var.a, yp3Var.b, yp3Var.c, yp3Var.d, yp3Var.e);
    }

    @Override // defpackage.sn0
    public long b(long j, long j2) {
        float fH = vl0.h(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fH)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L);
        int i = pa3.a;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.a41
    public Object c(String str, Provider provider) {
        switch (this.c) {
            case 5:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 6:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 7:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // defpackage.sl2
    public boolean d(of2 of2Var) {
        return false;
    }

    @Override // defpackage.jy2
    public void e(hy2 hy2Var) {
    }

    @Override // defpackage.lw2
    public Typeface f(ic1 ic1Var, int i) {
        return q(null, ic1Var, i);
    }

    @Override // defpackage.sl2
    public int g() {
        return 8;
    }

    @Override // defpackage.t13
    public Object get() {
        switch (this.c) {
            case 9:
                return new y83(0, Executors.newSingleThreadExecutor());
            default:
                sb3 sb3Var = new sb3(11);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    m51.x("Null flags");
                    return null;
                }
                map.put(lz2.c, new uo(30000L, 86400000L, set));
                if (set == null) {
                    m51.x("Null flags");
                    return null;
                }
                map.put(lz2.h, new uo(1000L, 86400000L, set));
                if (set == null) {
                    m51.x("Null flags");
                    return null;
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(va3.d)));
                if (setUnmodifiableSet == null) {
                    m51.x("Null flags");
                    return null;
                }
                map.put(lz2.d, new uo(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() >= lz2.values().length) {
                    new HashMap();
                    return new to(sb3Var, map);
                }
                u41.r("Not all priorities have been configured");
                return null;
        }
    }

    @Override // defpackage.lw2
    public Typeface h(hf1 hf1Var, ic1 ic1Var, int i) {
        String strConcat = hf1Var.f;
        int i2 = ic1Var.c / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceQ = q(strConcat, ic1Var, i);
            if (!kr1.n(typefaceQ, Typeface.create(Typeface.DEFAULT, sf3.E(ic1Var, i))) && !kr1.n(typefaceQ, q(null, ic1Var, i))) {
                typeface = typefaceQ;
            }
        }
        return typeface == null ? q(hf1Var.f, ic1Var, i) : typeface;
    }

    @Override // defpackage.nh1
    public boolean i() {
        boolean z;
        synchronized (w61.a) {
            try {
                int i = w61.c;
                w61.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > w61.d + 30000) {
                    w61.c = 0;
                    w61.d = SystemClock.uptimeMillis();
                    String[] list = w61.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    w61.e = list.length < 800;
                }
                z = w61.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.sl2
    public void j(ux1 ux1Var, long j, ii1 ii1Var, int i, boolean z) {
        yd ydVar = ux1Var.N;
        wl2 wl2Var = (wl2) ydVar.d;
        n63 n63Var = wl2.O;
        ((wl2) ydVar.d).U0(wl2.S, wl2Var.L0(j), ii1Var, 1, z);
    }

    @Override // defpackage.c03
    public void k() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.wo0
    public List l(tk1 tk1Var) {
        tk1Var.getClass();
        return z21.c;
    }

    @Override // defpackage.c03
    public void m(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = BuildConfig.VERSION_NAME;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // defpackage.nh1
    public boolean n(ai3 ai3Var) {
        bw0 bw0Var = ai3Var.a;
        boolean z = bw0Var instanceof zv0;
        int i = IntCompanionObject.MAX_VALUE;
        if ((z ? ((zv0) bw0Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        bw0 bw0Var2 = ai3Var.b;
        if (bw0Var2 instanceof zv0) {
            i = ((zv0) bw0Var2).a;
        }
        return i > 100;
    }

    @Override // defpackage.wo0
    public void o(tk1 tk1Var, List list) {
        tk1Var.getClass();
    }

    @Override // defpackage.sl2
    public boolean p(ux1 ux1Var) {
        ue3 ue3VarV = ux1Var.v();
        boolean z = false;
        if (ue3VarV != null && ue3VarV.l) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    public uu1 s(KeyEvent keyEvent) {
        uu1 uu1Var;
        uu1 uu1Var2;
        uu1 uu1Var3 = null;
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long jB = g13.b(keyEvent.getKeyCode());
            if (tu1.a(jB, x92.i)) {
                uu1Var = uu1.SELECT_LINE_LEFT;
            } else if (tu1.a(jB, x92.j)) {
                uu1Var = uu1.SELECT_LINE_RIGHT;
            } else if (tu1.a(jB, x92.k)) {
                uu1Var = uu1.SELECT_HOME;
            } else if (tu1.a(jB, x92.l)) {
                uu1Var = uu1.SELECT_END;
            } else {
                uu1Var = null;
            }
        } else if (keyEvent.isAltPressed()) {
            long jB2 = g13.b(keyEvent.getKeyCode());
            if (tu1.a(jB2, x92.i)) {
                uu1Var = uu1.LINE_LEFT;
            } else if (tu1.a(jB2, x92.j)) {
                uu1Var = uu1.LINE_RIGHT;
            } else if (tu1.a(jB2, x92.k)) {
                uu1Var = uu1.HOME;
            } else if (tu1.a(jB2, x92.l)) {
                uu1Var = uu1.END;
            } else {
                uu1Var = null;
            }
        } else {
            uu1Var = null;
        }
        if (uu1Var != null) {
            return uu1Var;
        }
        sz0 sz0Var = hv1.a;
        sz0Var.getClass();
        boolean zIsShiftPressed = keyEvent.isShiftPressed();
        uu1 uu1Var4 = uu1.SELECT_LINE_END;
        uu1 uu1Var5 = uu1.SELECT_LINE_START;
        uu1 uu1Var6 = uu1.DELETE_PREV_CHAR;
        if (zIsShiftPressed && keyEvent.isCtrlPressed()) {
            long jB3 = g13.b(keyEvent.getKeyCode());
            if (tu1.a(jB3, x92.i)) {
                uu1Var2 = uu1.SELECT_LEFT_WORD;
            } else if (tu1.a(jB3, x92.j)) {
                uu1Var2 = uu1.SELECT_RIGHT_WORD;
            } else if (tu1.a(jB3, x92.k)) {
                uu1Var2 = uu1.SELECT_PREV_PARAGRAPH;
            } else if (tu1.a(jB3, x92.l)) {
                uu1Var2 = uu1.SELECT_NEXT_PARAGRAPH;
            } else {
                uu1Var2 = null;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long jB4 = g13.b(keyEvent.getKeyCode());
            if (tu1.a(jB4, x92.i)) {
                uu1Var2 = uu1.LEFT_WORD;
            } else if (tu1.a(jB4, x92.j)) {
                uu1Var2 = uu1.RIGHT_WORD;
            } else if (tu1.a(jB4, x92.k)) {
                uu1Var2 = uu1.PREV_PARAGRAPH;
            } else if (tu1.a(jB4, x92.l)) {
                uu1Var2 = uu1.NEXT_PARAGRAPH;
            } else if (tu1.a(jB4, x92.c)) {
                uu1Var2 = uu1Var6;
            } else if (tu1.a(jB4, x92.u)) {
                uu1Var2 = uu1.DELETE_NEXT_WORD;
            } else if (tu1.a(jB4, x92.t)) {
                uu1Var2 = uu1.DELETE_PREV_WORD;
            } else if (tu1.a(jB4, x92.h)) {
                uu1Var2 = uu1.DESELECT;
            } else {
                uu1Var2 = null;
            }
        } else if (keyEvent.isShiftPressed()) {
            long jB5 = g13.b(keyEvent.getKeyCode());
            if (tu1.a(jB5, x92.o)) {
                uu1Var2 = uu1Var5;
            } else if (tu1.a(jB5, x92.p)) {
                uu1Var2 = uu1Var4;
            } else {
                uu1Var2 = null;
            }
        } else if (keyEvent.isAltPressed()) {
            long jB6 = g13.b(keyEvent.getKeyCode());
            if (tu1.a(jB6, x92.t)) {
                uu1Var2 = uu1.DELETE_FROM_LINE_START;
            } else if (tu1.a(jB6, x92.u)) {
                uu1Var2 = uu1.DELETE_TO_LINE_END;
            } else {
                uu1Var2 = null;
            }
        } else {
            uu1Var2 = null;
        }
        if (uu1Var2 != null) {
            return uu1Var2;
        }
        Object obj = sz0Var.c;
        int i = gv1.c;
        boolean zIsCtrlPressed = keyEvent.isCtrlPressed();
        uu1 uu1Var7 = uu1.REDO;
        if (!zIsCtrlPressed || !keyEvent.isShiftPressed()) {
            boolean zIsCtrlPressed2 = keyEvent.isCtrlPressed();
            uu1 uu1Var8 = uu1.CUT;
            uu1 uu1Var9 = uu1.COPY;
            uu1 uu1Var10 = uu1.PASTE;
            if (zIsCtrlPressed2) {
                long jY = av1.y(keyEvent);
                if (tu1.a(jY, x92.b) ? true : tu1.a(jY, x92.q)) {
                    uu1Var3 = uu1Var9;
                } else if (tu1.a(jY, x92.d)) {
                    uu1Var3 = uu1Var10;
                } else if (tu1.a(jY, x92.f)) {
                    uu1Var3 = uu1Var8;
                } else if (tu1.a(jY, x92.a)) {
                    uu1Var3 = uu1.SELECT_ALL;
                } else if (tu1.a(jY, x92.e)) {
                    uu1Var3 = uu1Var7;
                } else if (tu1.a(jY, x92.g)) {
                    uu1Var3 = uu1.UNDO;
                }
            } else if (!keyEvent.isCtrlPressed()) {
                if (keyEvent.isShiftPressed()) {
                    long jB7 = g13.b(keyEvent.getKeyCode());
                    if (tu1.a(jB7, x92.i)) {
                        uu1Var3 = uu1.SELECT_LEFT_CHAR;
                    } else if (tu1.a(jB7, x92.j)) {
                        uu1Var3 = uu1.SELECT_RIGHT_CHAR;
                    } else if (tu1.a(jB7, x92.k)) {
                        uu1Var3 = uu1.SELECT_UP;
                    } else if (tu1.a(jB7, x92.l)) {
                        uu1Var3 = uu1.SELECT_DOWN;
                    } else if (tu1.a(jB7, x92.m)) {
                        uu1Var3 = uu1.SELECT_PAGE_UP;
                    } else if (tu1.a(jB7, x92.n)) {
                        uu1Var3 = uu1.SELECT_PAGE_DOWN;
                    } else if (tu1.a(jB7, x92.o)) {
                        uu1Var3 = uu1Var5;
                    } else if (tu1.a(jB7, x92.p)) {
                        uu1Var3 = uu1Var4;
                    } else if (tu1.a(jB7, x92.q)) {
                        uu1Var3 = uu1Var10;
                    }
                } else {
                    long jB8 = g13.b(keyEvent.getKeyCode());
                    if (tu1.a(jB8, x92.i)) {
                        uu1Var3 = uu1.LEFT_CHAR;
                    } else if (tu1.a(jB8, x92.j)) {
                        uu1Var3 = uu1.RIGHT_CHAR;
                    } else if (tu1.a(jB8, x92.k)) {
                        uu1Var3 = uu1.UP;
                    } else if (tu1.a(jB8, x92.l)) {
                        uu1Var3 = uu1.DOWN;
                    } else if (tu1.a(jB8, x92.m)) {
                        uu1Var3 = uu1.PAGE_UP;
                    } else if (tu1.a(jB8, x92.n)) {
                        uu1Var3 = uu1.PAGE_DOWN;
                    } else if (tu1.a(jB8, x92.o)) {
                        uu1Var3 = uu1.LINE_START;
                    } else if (tu1.a(jB8, x92.p)) {
                        uu1Var3 = uu1.LINE_END;
                    } else {
                        if (tu1.a(jB8, x92.r) ? true : tu1.a(jB8, x92.s)) {
                            uu1Var3 = uu1.NEW_LINE;
                        } else if (tu1.a(jB8, x92.t)) {
                            uu1Var3 = uu1Var6;
                        } else if (tu1.a(jB8, x92.u)) {
                            uu1Var3 = uu1.DELETE_NEXT_CHAR;
                        } else if (tu1.a(jB8, x92.v)) {
                            uu1Var3 = uu1Var10;
                        } else if (tu1.a(jB8, x92.w)) {
                            uu1Var3 = uu1Var8;
                        } else if (tu1.a(jB8, x92.x)) {
                            uu1Var3 = uu1Var9;
                        } else if (tu1.a(jB8, x92.y)) {
                            uu1Var3 = uu1.TAB;
                        }
                    }
                }
            }
        } else if (tu1.a(g13.b(keyEvent.getKeyCode()), x92.g)) {
            uu1Var3 = uu1Var7;
        }
        return uu1Var3;
    }
}
