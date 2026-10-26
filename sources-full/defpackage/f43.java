package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextInclusionStrategy$Companion;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class f43 implements InputConnection {
    public final sz0 a;
    public final boolean b;
    public final z22 c;
    public final xw3 d;
    public final ViewConfiguration e;
    public int f;
    public ey3 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public f43(ey3 ey3Var, sz0 sz0Var, boolean z, z22 z22Var, xw3 xw3Var, ViewConfiguration viewConfiguration) {
        this.a = sz0Var;
        this.b = z;
        this.c = z22Var;
        this.d = xw3Var;
        this.e = viewConfiguration;
        this.g = ey3Var;
    }

    public final void a(n11 n11Var) {
        this.f++;
        try {
            this.j.add(n11Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((a32) this.a.c).c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((a32) this.a.c).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (kr1.n(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new wf0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new pu0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new qu0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new n71());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        ey3 ey3Var = this.g;
        return TextUtils.getCapsMode(ey3Var.a.d, jz3.f(ey3Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return vl0.l(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (jz3.c(this.g.b)) {
            return null;
        }
        return vl0.R(this.g).d;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return vl0.S(this.g, i).d;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return vl0.T(this.g, i).d;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new lg3(0, this.g.a.d.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((a32) this.a.c).d.invoke(new en1(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        hg hgVar;
        int i;
        yy3 yy3VarD;
        yy3 yy3VarD2;
        if (Build.VERSION.SDK_INT >= 34) {
            pj2 pj2Var = new pj2(7, this);
            z22 z22Var = this.c;
            int iR = 3;
            if (z22Var != null && (hgVar = z22Var.j) != null) {
                yy3 yy3VarD3 = z22Var.d();
                if (hgVar.equals(yy3VarD3 != null ? yy3VarD3.a.a.a : null)) {
                    boolean zR = lb.r(handwritingGesture);
                    xw3 xw3Var = this.d;
                    if (zR) {
                        SelectGesture selectGestureL = lb.l(handwritingGesture);
                        long jK = kr1.K(z22Var, xr0.z0(selectGestureL.getSelectionArea()), selectGestureL.getGranularity() != 1 ? 0 : 1, TextInclusionStrategy$Companion.getContainsCenter());
                        if (jz3.c(jK)) {
                            iR = jr1.r(ih1.m(selectGestureL), pj2Var);
                        } else {
                            pj2Var.invoke(new lg3((int) (jK >> 32), (int) (jK & 4294967295L)));
                            if (xw3Var != null) {
                                xw3Var.f(true);
                            }
                            iR = 1;
                        }
                    } else if (ih1.s(handwritingGesture)) {
                        DeleteGesture deleteGestureK = ih1.k(handwritingGesture);
                        int i2 = deleteGestureK.getGranularity() != 1 ? 0 : 1;
                        long jK2 = kr1.K(z22Var, xr0.z0(deleteGestureK.getDeletionArea()), i2, TextInclusionStrategy$Companion.getContainsCenter());
                        if (jz3.c(jK2)) {
                            iR = jr1.r(ih1.m(deleteGestureK), pj2Var);
                        } else {
                            jr1.E(jK2, hgVar, i2 == 1, pj2Var);
                            iR = 1;
                        }
                    } else if (ih1.B(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureN = ih1.n(handwritingGesture);
                        long jF = kr1.f(z22Var, xr0.z0(selectRangeGestureN.getSelectionStartArea()), xr0.z0(selectRangeGestureN.getSelectionEndArea()), selectRangeGestureN.getGranularity() != 1 ? 0 : 1, TextInclusionStrategy$Companion.getContainsCenter());
                        if (jz3.c(jF)) {
                            iR = jr1.r(ih1.m(selectRangeGestureN), pj2Var);
                        } else {
                            pj2Var.invoke(new lg3((int) (jF >> 32), (int) (jF & 4294967295L)));
                            if (xw3Var != null) {
                                xw3Var.f(true);
                            }
                            iR = 1;
                        }
                    } else if (ih1.C(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureL = ih1.l(handwritingGesture);
                        int i3 = deleteRangeGestureL.getGranularity() != 1 ? 0 : 1;
                        long jF2 = kr1.f(z22Var, xr0.z0(deleteRangeGestureL.getDeletionStartArea()), xr0.z0(deleteRangeGestureL.getDeletionEndArea()), i3, TextInclusionStrategy$Companion.getContainsCenter());
                        if (jz3.c(jF2)) {
                            iR = jr1.r(ih1.m(deleteRangeGestureL), pj2Var);
                        } else {
                            jr1.E(jF2, hgVar, i3 == 1, pj2Var);
                            iR = 1;
                        }
                    } else {
                        boolean zA = lb.A(handwritingGesture);
                        ViewConfiguration viewConfiguration = this.e;
                        if (zA) {
                            JoinOrSplitGesture joinOrSplitGestureJ = lb.j(handwritingGesture);
                            if (viewConfiguration == null) {
                                iR = jr1.r(ih1.A(joinOrSplitGestureJ), pj2Var);
                            } else {
                                long jK3 = kr1.k(joinOrSplitGestureJ.getJoinOrSplitPoint());
                                yy3 yy3VarD4 = z22Var.d();
                                int iJ = yy3VarD4 != null ? kr1.J(yy3VarD4.a.b, jK3, z22Var.c(), viewConfiguration) : -1;
                                if (iJ == -1 || ((yy3VarD2 = z22Var.d()) != null && kr1.h(yy3VarD2.a, iJ))) {
                                    iR = jr1.r(ih1.m(joinOrSplitGestureJ), pj2Var);
                                } else {
                                    long j = kr1.j(iJ, hgVar);
                                    if (jz3.c(j)) {
                                        int i4 = (int) (j >> 32);
                                        pj2Var.invoke(new kh1(new n11[]{new lg3(i4, i4), new wf0(" ", 1)}));
                                    } else {
                                        jr1.E(j, hgVar, false, pj2Var);
                                    }
                                    iR = 1;
                                }
                            }
                        } else if (lb.w(handwritingGesture)) {
                            InsertGesture insertGestureI = lb.i(handwritingGesture);
                            if (viewConfiguration == null) {
                                iR = jr1.r(ih1.A(insertGestureI), pj2Var);
                            } else {
                                long jK4 = kr1.k(insertGestureI.getInsertionPoint());
                                yy3 yy3VarD5 = z22Var.d();
                                int iJ2 = yy3VarD5 != null ? kr1.J(yy3VarD5.a.b, jK4, z22Var.c(), viewConfiguration) : -1;
                                if (iJ2 == -1 || ((yy3VarD = z22Var.d()) != null && kr1.h(yy3VarD.a, iJ2))) {
                                    iR = jr1.r(ih1.m(insertGestureI), pj2Var);
                                } else {
                                    pj2Var.invoke(new kh1(new n11[]{new lg3(iJ2, iJ2), new wf0(insertGestureI.getTextToInsert(), 1)}));
                                    iR = 1;
                                }
                            }
                        } else if (lb.y(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureK = lb.k(handwritingGesture);
                            yy3 yy3VarD6 = z22Var.d();
                            long jE = kr1.e(yy3VarD6 != null ? yy3VarD6.a : null, kr1.k(removeSpaceGestureK.getStartPoint()), kr1.k(removeSpaceGestureK.getEndPoint()), z22Var.c(), viewConfiguration);
                            if (jz3.c(jE)) {
                                iR = jr1.r(ih1.m(removeSpaceGestureK), pj2Var);
                            } else {
                                o43 o43Var = new o43();
                                o43Var.c = -1;
                                o43 o43Var2 = new o43();
                                o43Var2.c = -1;
                                String strD = new u43("\\s+").d(p23.b0(jE, hgVar), new jh1(o43Var, o43Var2, 1));
                                int i5 = o43Var.c;
                                if (i5 == -1 || (i = o43Var2.c) == -1) {
                                    iR = jr1.r(ih1.m(removeSpaceGestureK), pj2Var);
                                } else {
                                    int i6 = (int) (jE >> 32);
                                    pj2Var.invoke(new kh1(new n11[]{new lg3(i6 + i5, i6 + i), new wf0(strD.substring(i5, strD.length() - (jz3.d(jE) - o43Var2.c)), 1)}));
                                    iR = 1;
                                }
                            }
                        } else {
                            iR = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new sg(intConsumer, iR, 0));
            } else {
                intConsumer.accept(iR);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        z22 z22Var;
        hg hgVar;
        if (Build.VERSION.SDK_INT >= 34 && (z22Var = this.c) != null && (hgVar = z22Var.j) != null) {
            yy3 yy3VarD = z22Var.d();
            if (hgVar.equals(yy3VarD != null ? yy3VarD.a.a.a : null)) {
                boolean zR = lb.r(previewableHandwritingGesture);
                int i = 1;
                ch1 ch1Var = ch1.c;
                xw3 xw3Var = this.d;
                if (zR) {
                    SelectGesture selectGestureL = lb.l(previewableHandwritingGesture);
                    if (xw3Var != null) {
                        long jK = kr1.K(z22Var, xr0.z0(selectGestureL.getSelectionArea()), selectGestureL.getGranularity() != 1 ? 0 : 1, TextInclusionStrategy$Companion.getContainsCenter());
                        z22 z22Var2 = xw3Var.d;
                        if (z22Var2 != null) {
                            z22Var2.f(jK);
                        }
                        z22 z22Var3 = xw3Var.d;
                        if (z22Var3 != null) {
                            z22Var3.e(jz3.b);
                        }
                        if (!jz3.c(jK)) {
                            xw3Var.q(false);
                            xw3Var.o(ch1Var);
                        }
                    }
                } else if (ih1.s(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureK = ih1.k(previewableHandwritingGesture);
                    if (xw3Var != null) {
                        long jK2 = kr1.K(z22Var, xr0.z0(deleteGestureK.getDeletionArea()), deleteGestureK.getGranularity() != 1 ? 0 : 1, TextInclusionStrategy$Companion.getContainsCenter());
                        z22 z22Var4 = xw3Var.d;
                        if (z22Var4 != null) {
                            z22Var4.e(jK2);
                        }
                        z22 z22Var5 = xw3Var.d;
                        if (z22Var5 != null) {
                            z22Var5.f(jz3.b);
                        }
                        if (!jz3.c(jK2)) {
                            xw3Var.q(false);
                            xw3Var.o(ch1Var);
                        }
                    }
                } else if (ih1.B(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureN = ih1.n(previewableHandwritingGesture);
                    if (xw3Var != null) {
                        long jF = kr1.f(z22Var, xr0.z0(selectRangeGestureN.getSelectionStartArea()), xr0.z0(selectRangeGestureN.getSelectionEndArea()), selectRangeGestureN.getGranularity() != 1 ? 0 : 1, TextInclusionStrategy$Companion.getContainsCenter());
                        z22 z22Var6 = xw3Var.d;
                        if (z22Var6 != null) {
                            z22Var6.f(jF);
                        }
                        z22 z22Var7 = xw3Var.d;
                        if (z22Var7 != null) {
                            z22Var7.e(jz3.b);
                        }
                        if (!jz3.c(jF)) {
                            xw3Var.q(false);
                            xw3Var.o(ch1Var);
                        }
                    }
                } else if (ih1.C(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureL = ih1.l(previewableHandwritingGesture);
                    if (xw3Var != null) {
                        long jF2 = kr1.f(z22Var, xr0.z0(deleteRangeGestureL.getDeletionStartArea()), xr0.z0(deleteRangeGestureL.getDeletionEndArea()), deleteRangeGestureL.getGranularity() != 1 ? 0 : 1, TextInclusionStrategy$Companion.getContainsCenter());
                        z22 z22Var8 = xw3Var.d;
                        if (z22Var8 != null) {
                            z22Var8.e(jF2);
                        }
                        z22 z22Var9 = xw3Var.d;
                        if (z22Var9 != null) {
                            z22Var9.f(jz3.b);
                        }
                        if (!jz3.c(jF2)) {
                            xw3Var.q(false);
                            xw3Var.o(ch1Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new ak0(i, xw3Var));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        u22 u22Var;
        boolean z4 = this.k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            u22Var = ((a32) this.a.c).m;
            synchronized (u22Var.c) {
                try {
                    u22Var.f = z2;
                    u22Var.g = z3;
                    u22Var.h = z5;
                    u22Var.i = z;
                    if (z6) {
                        u22Var.e = true;
                        if (u22Var.j != null) {
                            u22Var.a();
                        }
                    }
                    u22Var.d = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        u22Var = ((a32) this.a.c).m;
        synchronized (u22Var.c) {
            u22Var.f = z2;
            u22Var.g = z3;
            u22Var.h = z5;
            u22Var.i = z;
            if (z6) {
                u22Var.e = true;
                if (u22Var.j != null) {
                    u22Var.a();
                }
            }
            u22Var.d = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((a32) this.a.c).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new jg3(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new kg3(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new lg3(i, i2));
        return true;
    }
}
