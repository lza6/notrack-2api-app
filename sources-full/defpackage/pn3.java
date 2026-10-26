package defpackage;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
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
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextInclusionStrategy$Companion;
import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class pn3 implements InputConnection {
    public final yd a;
    public final oi2 b = new oi2(0, new le1[16]);
    public final InputConnection c;

    public pn3(yd ydVar, EditorInfo editorInfo) {
        this.a = ydVar;
        this.c = av1.l(new on3(this, false), editorInfo, new sb3(this));
    }

    public final au3 a() {
        return ((c) this.a.c).d();
    }

    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((gj) this.a.b).b++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.i();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT >= 25) {
            return this.c.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        int i2 = 1;
        if (charSequence == null) {
            return true;
        }
        this.a.f(new ta1(i, i2, charSequence.toString()));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        this.a.f(new gn1(i, i2, 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        this.a.f(new gn1(i, i2, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((gj) this.a.b).g();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.f(fl1.q);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), jz3.f(a().h), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        au3 au3VarA = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = au3VarA;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = au3VarA.d.length();
        extractedText.partialStartOffset = -1;
        long j = au3VarA.h;
        extractedText.selectionStart = jz3.f(j);
        extractedText.selectionEnd = jz3.e(j);
        extractedText.flags = !mo3.v0(au3VarA, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (jz3.c(a().h)) {
            return null;
        }
        au3 au3VarA = a();
        return au3VarA.d.subSequence(jz3.f(au3VarA.h), jz3.e(au3VarA.h)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        au3 au3VarA = a();
        int iE = jz3.e(au3VarA.h);
        int iE2 = jz3.e(au3VarA.h) + i;
        CharSequence charSequence = au3VarA.d;
        return charSequence.subSequence(iE, Math.min(iE2, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        au3 au3VarA = a();
        return au3VarA.d.subSequence(Math.max(0, jz3.f(au3VarA.h) - i), jz3.f(au3VarA.h)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        int i2 = 0;
        switch (i) {
            case R.id.selectAll:
                yd ydVar = this.a;
                ydVar.f(new yh1(ydVar, i2, a().d.length(), 1));
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
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
                    i2 = 1;
                    break;
            }
        } else {
            i2 = 1;
        }
        le1 le1Var = (le1) this.a.e;
        if (le1Var != null) {
            le1Var.invoke(new en1(i2));
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i;
        xy3 xy3VarB;
        int i2;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 34) {
            return;
        }
        int iQ = 2;
        if (i3 >= 34) {
            yd ydVar = this.a;
            c cVar = (c) ydVar.c;
            az3 az3Var = (az3) ydVar.g;
            je1 je1Var = (je1) ydVar.h;
            ViewConfiguration viewConfiguration = (ViewConfiguration) ydVar.i;
            if (lb.r(handwritingGesture)) {
                SelectGesture selectGestureL = lb.l(handwritingGesture);
                long jL = kr1.L(az3Var, xr0.z0(selectGestureL.getSelectionArea()), selectGestureL.getGranularity() == 1 ? 1 : 0, TextInclusionStrategy$Companion.getContainsCenter());
                if (jz3.c(jL)) {
                    iQ = jr1.q(cVar, ih1.m(selectGestureL));
                } else {
                    cVar.j(jL);
                    if (je1Var != null) {
                        je1Var.invoke();
                    }
                    iQ = 1;
                }
            } else if (ih1.s(handwritingGesture)) {
                DeleteGesture deleteGestureK = ih1.k(handwritingGesture);
                i2 = deleteGestureK.getGranularity() == 1 ? 1 : 0;
                long jL2 = kr1.L(az3Var, xr0.z0(deleteGestureK.getDeletionArea()), i2, TextInclusionStrategy$Companion.getContainsCenter());
                if (jz3.c(jL2)) {
                    iQ = jr1.q(cVar, ih1.m(deleteGestureK));
                } else {
                    if (i2 == 1) {
                        jL2 = kr1.b(jL2, cVar.d());
                    }
                    c.i(cVar, BuildConfig.VERSION_NAME, jL2, false, 12);
                    iQ = 1;
                }
            } else if (ih1.B(handwritingGesture)) {
                SelectRangeGesture selectRangeGestureN = ih1.n(handwritingGesture);
                long jG = kr1.g(az3Var, xr0.z0(selectRangeGestureN.getSelectionStartArea()), xr0.z0(selectRangeGestureN.getSelectionEndArea()), selectRangeGestureN.getGranularity() == 1 ? 1 : 0, TextInclusionStrategy$Companion.getContainsCenter());
                if (jz3.c(jG)) {
                    iQ = jr1.q(cVar, ih1.m(selectRangeGestureN));
                } else {
                    cVar.j(jG);
                    if (je1Var != null) {
                        je1Var.invoke();
                    }
                    iQ = 1;
                }
            } else if (ih1.C(handwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureL = ih1.l(handwritingGesture);
                i2 = deleteRangeGestureL.getGranularity() == 1 ? 1 : 0;
                long jG2 = kr1.g(az3Var, xr0.z0(deleteRangeGestureL.getDeletionStartArea()), xr0.z0(deleteRangeGestureL.getDeletionEndArea()), i2, TextInclusionStrategy$Companion.getContainsCenter());
                if (jz3.c(jG2)) {
                    iQ = jr1.q(cVar, ih1.m(deleteRangeGestureL));
                } else {
                    if (i2 == 1) {
                        jG2 = kr1.b(jG2, cVar.d());
                    }
                    c.i(cVar, BuildConfig.VERSION_NAME, jG2, false, 12);
                    iQ = 1;
                }
            } else if (lb.A(handwritingGesture)) {
                JoinOrSplitGesture joinOrSplitGestureJ = lb.j(handwritingGesture);
                if (cVar.a.b() != cVar.a.b()) {
                    iQ = 3;
                } else {
                    long jK = kr1.k(joinOrSplitGestureJ.getJoinOrSplitPoint());
                    xy3 xy3VarB2 = az3Var.b();
                    int iJ = xy3VarB2 != null ? kr1.J(xy3VarB2.b, jK, az3Var.d(), viewConfiguration) : -1;
                    if (iJ == -1 || ((xy3VarB = az3Var.b()) != null && kr1.h(xy3VarB, iJ))) {
                        iQ = jr1.q(cVar, ih1.m(joinOrSplitGestureJ));
                    } else {
                        long j = kr1.j(iJ, cVar.d());
                        if (jz3.c(j)) {
                            c.i(cVar, " ", j, false, 12);
                        } else {
                            c.i(cVar, BuildConfig.VERSION_NAME, j, false, 12);
                        }
                        iQ = 1;
                    }
                }
            } else if (lb.w(handwritingGesture)) {
                InsertGesture insertGestureI = lb.i(handwritingGesture);
                long jK2 = kr1.k(insertGestureI.getInsertionPoint());
                xy3 xy3VarB3 = az3Var.b();
                int iJ2 = xy3VarB3 != null ? kr1.J(xy3VarB3.b, jK2, az3Var.d(), viewConfiguration) : -1;
                if (iJ2 == -1) {
                    iQ = jr1.q(cVar, ih1.m(insertGestureI));
                } else {
                    c.i(cVar, insertGestureI.getTextToInsert(), p23.d(iJ2, iJ2), false, 12);
                    iQ = 1;
                }
            } else if (lb.y(handwritingGesture)) {
                RemoveSpaceGesture removeSpaceGestureK = lb.k(handwritingGesture);
                long jE = kr1.e(az3Var.b(), kr1.k(removeSpaceGestureK.getStartPoint()), kr1.k(removeSpaceGestureK.getEndPoint()), az3Var.d(), viewConfiguration);
                if (jz3.c(jE)) {
                    iQ = jr1.q(cVar, ih1.m(removeSpaceGestureK));
                } else {
                    o43 o43Var = new o43();
                    o43Var.c = -1;
                    o43 o43Var2 = new o43();
                    o43Var2.c = -1;
                    String strD = new u43("\\s+").d(p23.b0(jE, cVar.d()), new jh1(o43Var, o43Var2, 0));
                    int i4 = o43Var.c;
                    if (i4 == -1 || (i = o43Var2.c) == -1) {
                        iQ = jr1.q(cVar, ih1.m(removeSpaceGestureK));
                    } else {
                        int i5 = (int) (jE >> 32);
                        c.i(cVar, strD.substring(o43Var.c, strD.length() - (jz3.d(jE) - o43Var2.c)), p23.d(i4 + i5, i5 + i), false, 12);
                        iQ = 1;
                    }
                }
            }
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new sg(intConsumer, iQ, 1));
        } else {
            intConsumer.accept(iQ);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && i >= 34) {
            yd ydVar = this.a;
            c cVar = (c) ydVar.c;
            az3 az3Var = (az3) ydVar.g;
            if (lb.r(previewableHandwritingGesture)) {
                SelectGesture selectGestureL = lb.l(previewableHandwritingGesture);
                jr1.y(cVar, kr1.L(az3Var, xr0.z0(selectGestureL.getSelectionArea()), selectGestureL.getGranularity() != 1 ? 0 : 1, TextInclusionStrategy$Companion.getContainsCenter()), 0);
            } else if (ih1.s(previewableHandwritingGesture)) {
                DeleteGesture deleteGestureK = ih1.k(previewableHandwritingGesture);
                jr1.y(cVar, kr1.L(az3Var, xr0.z0(deleteGestureK.getDeletionArea()), deleteGestureK.getGranularity() == 1 ? 1 : 0, TextInclusionStrategy$Companion.getContainsCenter()), 1);
            } else if (ih1.B(previewableHandwritingGesture)) {
                SelectRangeGesture selectRangeGestureN = ih1.n(previewableHandwritingGesture);
                jr1.y(cVar, kr1.g(az3Var, xr0.z0(selectRangeGestureN.getSelectionStartArea()), xr0.z0(selectRangeGestureN.getSelectionEndArea()), selectRangeGestureN.getGranularity() != 1 ? 0 : 1, TextInclusionStrategy$Companion.getContainsCenter()), 0);
            } else if (ih1.C(previewableHandwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureL = ih1.l(previewableHandwritingGesture);
                jr1.y(cVar, kr1.g(az3Var, xr0.z0(deleteRangeGestureL.getDeletionStartArea()), xr0.z0(deleteRangeGestureL.getDeletionEndArea()), deleteRangeGestureL.getGranularity() == 1 ? 1 : 0, TextInclusionStrategy$Companion.getContainsCenter()), 1);
            }
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new ak0(2, cVar));
            }
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0074  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ym3 ym3Var;
        so0 so0Var;
        CursorAnchorInfo cursorAnchorInfoA;
        br0 br0Var = (br0) this.a.f;
        boolean z4 = false;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z7 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z4 = true;
            }
            if (z2 || z3 || z7 || z4) {
                z = z4;
                z4 = z7;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z4 = true;
                } else {
                    z = z4;
                    z4 = true;
                }
                z2 = z4;
            }
            br0Var.f = z2;
            br0Var.g = z3;
            br0Var.h = z4;
            br0Var.i = z;
            if (z5 && (cursorAnchorInfoA = br0Var.a()) != null) {
                fy2 fy2Var = br0Var.c;
                fy2Var.i().updateCursorAnchorInfo((View) fy2Var.c, cursorAnchorInfoA);
            }
            ym3Var = br0Var.e;
            so0Var = null;
            if (!z6) {
                if (ym3Var != null) {
                    ym3Var.c(null);
                }
                br0Var.e = null;
                return true;
            }
            if (ym3Var == null && ym3Var.a()) {
                return true;
            }
            br0Var.e = py.F(br0Var.d, null, jq0.l, new f60(br0Var, so0Var, 3), 1);
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        br0Var.f = z2;
        br0Var.g = z3;
        br0Var.h = z4;
        br0Var.i = z;
        if (z5) {
            fy2 fy2Var2 = br0Var.c;
            fy2Var2.i().updateCursorAnchorInfo((View) fy2Var2.c, cursorAnchorInfoA);
        }
        ym3Var = br0Var.e;
        so0Var = null;
        if (!z6) {
            if (ym3Var == null) {
            }
            br0Var.e = py.F(br0Var.d, null, jq0.l, new f60(br0Var, so0Var, 3), 1);
            return true;
        }
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        br0Var.e = null;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        fy2 fy2Var = (fy2) this.a.d;
        fy2Var.i().dispatchKeyEventFromInputMethod((View) fy2Var.c, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        this.a.f(new gn1(i, i2, 2));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bb  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        em3 em3Var;
        lb1 x62Var;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String string = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj instanceof BackgroundColorSpan) {
                    em3Var = new em3(0L, 0L, (ic1) null, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, gb2.b(((BackgroundColorSpan) obj).getBackgroundColor()), (tt3) null, (pg3) null, 63487);
                } else if (obj instanceof ForegroundColorSpan) {
                    em3Var = new em3(gb2.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (ic1) null, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65534);
                } else if (obj instanceof StrikethroughSpan) {
                    em3Var = new em3(0L, 0L, (ic1) null, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, tt3.d, (pg3) null, 61439);
                } else if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        em3Var = new em3(0L, 0L, ic1.n, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65531);
                    } else if (style == 2) {
                        em3Var = new em3(0L, 0L, (ic1) null, new gc1(1), (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65527);
                    } else if (style != 3) {
                        em3Var = null;
                    } else {
                        em3Var = new em3(0L, 0L, ic1.n, new gc1(1), (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65523);
                    }
                } else if (obj instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                    String family = typefaceSpan.getFamily();
                    if (kr1.n(family, "cursive")) {
                        x62Var = lb1.e;
                    } else if (kr1.n(family, "monospace")) {
                        x62Var = lb1.d;
                    } else if (kr1.n(family, "sans-serif")) {
                        x62Var = lb1.b;
                    } else if (kr1.n(family, "serif")) {
                        x62Var = lb1.c;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 == null || family2.length() == 0) {
                            x62Var = null;
                        } else {
                            Typeface typefaceCreate = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (kr1.n(typefaceCreate, typeface) || kr1.n(typefaceCreate, Typeface.create(typeface, 0))) {
                                typefaceCreate = null;
                            }
                            if (typefaceCreate != null) {
                                x62Var = new x62(new jb(7, typefaceCreate));
                            } else {
                                x62Var = null;
                            }
                        }
                    }
                    em3Var = new em3(0L, 0L, (ic1) null, (gc1) null, (hc1) null, x62Var, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65503);
                } else if (obj instanceof UnderlineSpan) {
                    em3Var = new em3(0L, 0L, (ic1) null, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, tt3.c, (pg3) null, 61439);
                } else {
                    em3Var = null;
                }
                if (em3Var != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new gg(spanned.getSpanStart(obj), spanned.getSpanEnd(obj), em3Var));
                }
            }
            arrayList = arrayList2;
        }
        this.a.f(new hn1(string, arrayList, i));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        yd ydVar = this.a;
        ydVar.f(new yh1(ydVar, i, i2, 1));
        return true;
    }
}
