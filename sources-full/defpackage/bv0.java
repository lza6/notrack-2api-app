package defpackage;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.uuid.Uuid;
import notrack.ai.data.chatmeta.ChatEntry;
import notrack.ai.data.chatmeta.ChatMetaDoc;
import notrack.ai.data.chatmeta.FolderMeta;
import okio.Options$Companion;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public class bv0 implements i61, wc3, ql4 {
    public static final int[] l = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int c;
    public final Object d;
    public Object h;

    public bv0(int i) {
        this.c = i;
        switch (i) {
            case 8:
                this.d = new fc4(0);
                this.h = new fc4(0);
                break;
            case 9:
                this.d = new oi2(0, new ux1[16]);
                break;
            default:
                this.d = new jb(26);
                this.h = new jb(26);
                break;
        }
    }

    public /* synthetic */ bv0(int i, Object obj, Object obj2, boolean z) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    public bv0(Context context) {
        this.c = 4;
        this.d = context.getApplicationContext().getSharedPreferences("chatmeta", 0);
        this.h = xr0.G(new f2(10));
    }

    public bv0(AbsSeekBar absSeekBar) {
        this.c = 1;
        this.d = absSeekBar;
    }

    public bv0(TextView textView) {
        this.c = 11;
        this.h = textView;
        this.d = new im(11, this);
    }

    public bv0(WorkDatabase_Impl workDatabase_Impl) {
        this.c = 0;
        this.d = workDatabase_Impl;
        this.h = new av0(workDatabase_Impl, 0);
    }

    public /* synthetic */ bv0(Object obj, int i, Object obj2) {
        this.c = i;
        this.h = obj;
        this.d = obj2;
    }

    public bv0(n32 n32Var, md4 md4Var) {
        this.c = 7;
        this.d = n32Var;
        md4Var.getClass();
        oq0 oq0Var = oq0.b;
        oq0Var.getClass();
        iy2 iy2Var = new iy2(md4Var, y62.c, oq0Var);
        vc0 vc0VarA = r43.a(y62.class);
        String classQualifiedName = Options$Companion.getClassQualifiedName(vc0VarA.c);
        if (classQualifiedName != null) {
            this.h = (y62) iy2Var.j(vc0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(classQualifiedName));
        } else {
            u41.k("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public bv0(nd1 nd1Var) {
        this.c = 6;
        this.d = nd1Var;
        this.h = new CopyOnWriteArrayList();
    }

    public bv0(tu tuVar) {
        this.c = 3;
        Context context = tuVar.a;
        int i = Build.VERSION.SDK_INT;
        this.d = i >= 29 ? ru.b(context) : null;
        this.h = i <= 29 ? new tu(context, (byte) 0) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [of2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void i(ux1 ux1Var) {
        if (ux1Var.O.d == qx1.m && !ux1Var.p() && !ux1Var.q() && !ux1Var.X && ux1Var.G()) {
            yd ydVar = ux1Var.N;
            if ((((of2) ydVar.f).getAggregateChildKindSet$ui_release() & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                for (of2 child$ui_release = (of2) ydVar.f; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                        ?? E = child$ui_release;
                        ?? oi2Var = 0;
                        while (E != 0) {
                            if (E instanceof nf1) {
                                nf1 nf1Var = (nf1) E;
                                nf1Var.a(y64.K(nf1Var, FontInfo.NUMBER_OF_CHAR_CODES));
                            } else if ((E.getKindSet$ui_release() & FontInfo.NUMBER_OF_CHAR_CODES) != 0 && (E instanceof ju0)) {
                                of2 child$ui_release2 = ((ju0) E).d;
                                int i = 0;
                                E = E;
                                oi2Var = oi2Var;
                                while (child$ui_release2 != null) {
                                    if ((child$ui_release2.getKindSet$ui_release() & FontInfo.NUMBER_OF_CHAR_CODES) != 0) {
                                        i++;
                                        if (i == 1) {
                                            oi2Var = oi2Var;
                                            E = child$ui_release2;
                                        } else {
                                            if (oi2Var == 0) {
                                                oi2Var = new oi2(0, new of2[16]);
                                            }
                                            if (E != 0) {
                                                oi2Var.c(E);
                                                E = 0;
                                            }
                                            oi2Var.c(child$ui_release2);
                                        }
                                    }
                                    child$ui_release2 = child$ui_release2.getChild$ui_release();
                                    E = E;
                                    oi2Var = oi2Var;
                                }
                                if (i == 1) {
                                }
                            }
                            E = y64.e(oi2Var);
                        }
                    }
                    if ((child$ui_release.getAggregateChildKindSet$ui_release() & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
                        break;
                    }
                }
            }
        }
        ux1Var.W = false;
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i2 = oi2VarX.h;
        for (int i3 = 0; i3 < i2; i3++) {
            i((ux1) objArr[i3]);
        }
    }

    public static bv0 z(n32 n32Var) {
        return new bv0(n32Var, ((nd4) n32Var).g());
    }

    public boolean A() {
        return !(((k64) ((jb) this.h).d).isEmpty() && ((k64) ((jb) this.d).d).isEmpty());
    }

    public ChatMetaDoc B() {
        Object i63Var;
        String string = ((SharedPreferences) this.d).getString("doc", null);
        if (string == null) {
            return new ChatMetaDoc();
        }
        try {
            kt1 kt1Var = (kt1) this.h;
            kt1Var.getClass();
            i63Var = (ChatMetaDoc) kt1Var.b(ChatMetaDoc.Companion.serializer(), string);
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        Object chatMetaDoc = new ChatMetaDoc();
        if (i63Var instanceof i63) {
            i63Var = chatMetaDoc;
        }
        return (ChatMetaDoc) i63Var;
    }

    public void C(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.d;
        iy2 iy2VarL = iy2.l(absSeekBar.getContext(), attributeSet, l, i);
        Drawable drawableG = iy2VarL.g(0);
        if (drawableG != null) {
            if (drawableG instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableG;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableG2 = G(animationDrawable.getFrame(i2), true);
                    drawableG2.setLevel(10000);
                    animationDrawable2.addFrame(drawableG2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableG = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableG);
        }
        Drawable drawableG3 = iy2VarL.g(1);
        if (drawableG3 != null) {
            absSeekBar.setProgressDrawable(G(drawableG3, false));
        }
        iy2VarL.n();
    }

    public void D(k3 k3Var) {
        ir3 ir3Var = (ir3) this.d;
        ((ActionMode.Callback) ir3Var.c).onDestroyActionMode(ir3Var.Q(k3Var));
        zi ziVar = (zi) this.h;
        if (ziVar.D != null) {
            ziVar.t.getDecorView().removeCallbacks(ziVar.E);
        }
        if (ziVar.C != null) {
            pd4 pd4Var = ziVar.F;
            if (pd4Var != null) {
                pd4Var.b();
            }
            pd4 pd4VarA = zc4.a(ziVar.C);
            pd4VarA.a(0.0f);
            ziVar.F = pd4VarA;
            pd4VarA.d(new oi(2, this));
        }
        ziVar.B = null;
        ViewGroup viewGroup = ziVar.H;
        WeakHashMap weakHashMap = zc4.a;
        qc4.c(viewGroup);
        ziVar.L();
    }

    public boolean E(k3 k3Var, Menu menu) {
        ViewGroup viewGroup = ((zi) this.h).H;
        WeakHashMap weakHashMap = zc4.a;
        qc4.c(viewGroup);
        ir3 ir3Var = (ir3) this.d;
        ActionMode.Callback callback = (ActionMode.Callback) ir3Var.c;
        sp3 sp3VarQ = ir3Var.Q(k3Var);
        ph3 ph3Var = (ph3) ir3Var.l;
        Menu qd2Var = (Menu) ph3Var.get(menu);
        if (qd2Var == null) {
            qd2Var = new qd2((Context) ir3Var.d, (hc2) menu);
            ph3Var.put(menu, qd2Var);
        }
        return callback.onPrepareActionMode(sp3VarQ, qd2Var);
    }

    public void F(ChatMetaDoc chatMetaDoc) {
        ChatMetaDoc chatMetaDocCopy$default = ChatMetaDoc.copy$default(chatMetaDoc, null, null, System.currentTimeMillis() / 1000, 7);
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.d).edit();
            kt1 kt1Var = (kt1) this.h;
            kt1Var.getClass();
            editorEdit.putString("doc", kt1Var.c(ChatMetaDoc.Companion.serializer(), chatMetaDocCopy$default)).apply();
        } catch (Throwable unused) {
        }
    }

    public Drawable G(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.h) == null) {
                this.h = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = G(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    @Override // defpackage.wc3
    public int a(int i) {
        do {
            i = ((bk) this.h).q(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.d).charAt(i)));
        return i;
    }

    @Override // defpackage.wc3
    public int b(int i) {
        do {
            i = ((bk) this.h).o(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.d).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.wc3
    public int c(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        do {
            i = ((bk) this.h).o(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.wc3
    public int d(int i) {
        do {
            i = ((bk) this.h).q(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.d).charAt(i - 1)));
        return i;
    }

    public void e(ux1 ux1Var, boolean z) {
        jb jbVar = (jb) this.h;
        jb jbVar2 = (jb) this.d;
        if (z) {
            jbVar2.t(ux1Var);
            jbVar.t(ux1Var);
        } else {
            if (((k64) jbVar2.d).contains(ux1Var)) {
                return;
            }
            jbVar.t(ux1Var);
        }
    }

    @Override // defpackage.ql4
    public Object f() {
        return new ts4(((tu) ((sk3) this.d).d).a, (xs4) ((ql4) this.h).f());
    }

    public int g() {
        tu tuVar = (tu) this.h;
        if (tuVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = tuVar.a;
        FingerprintManager fingerprintManagerC = m71.c(context);
        if (fingerprintManagerC == null || !m71.e(fingerprintManagerC)) {
            return 12;
        }
        FingerprintManager fingerprintManagerC2 = m71.c(context);
        return (fingerprintManagerC2 == null || !m71.d(fingerprintManagerC2)) ? 11 : 0;
    }

    @Override // defpackage.t13
    public Object get() {
        sb3 sb3Var = new sb3(11);
        zf3 zf3Var = new zf3(9);
        Object obj = ((t13) this.d).get();
        t13 t13Var = (t13) this.h;
        return new o83(sb3Var, zf3Var, no.f, (bb3) obj, t13Var);
    }

    public String h(String str) {
        Integer num;
        str.getClass();
        ChatMetaDoc chatMetaDocB = B();
        String str2 = "f_" + UUID.randomUUID();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        List<FolderMeta> folders = chatMetaDocB.getFolders();
        String strT0 = mo3.T0(60, mo3.U0(str).toString());
        Iterator<T> it = chatMetaDocB.getFolders().iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((FolderMeta) it.next()).getOrder());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((FolderMeta) it.next()).getOrder());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        F(ChatMetaDoc.copy$default(chatMetaDocB, ke0.I0(folders, new FolderMeta(str2, strT0, null, (num != null ? num.intValue() : 0) + 10, jCurrentTimeMillis, jCurrentTimeMillis)), null, 0L, 13));
        return str2;
    }

    public void j(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.j(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void k(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        nd1 nd1Var = (nd1) this.d;
        zh zhVar = nd1Var.w.v;
        xc1 xc1Var2 = nd1Var.y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.k(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void l(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.l(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void m(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.m(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void n(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.n(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void o(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.o(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void p(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        nd1 nd1Var = (nd1) this.d;
        zh zhVar = nd1Var.w.v;
        xc1 xc1Var2 = nd1Var.y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.p(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.q(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.r(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void s(xc1 xc1Var, Bundle bundle, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.s(xc1Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void t(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.t(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public String toString() {
        int iLastIndexOf;
        switch (this.c) {
            case 7:
                StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                n32 n32Var = (n32) this.d;
                if (n32Var == null) {
                    sb.append("null");
                } else {
                    String simpleName = n32Var.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = n32Var.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(iLastIndexOf + 1);
                    }
                    sb.append(simpleName);
                    sb.append('{');
                    sb.append(Integer.toHexString(System.identityHashCode(n32Var)));
                }
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.u(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void v(xc1 xc1Var, boolean z) {
        xc1Var.getClass();
        xc1 xc1Var2 = ((nd1) this.d).y;
        if (xc1Var2 != null) {
            xc1Var2.l().o.v(xc1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                m51.t();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void w(String str, PrintWriter printWriter) {
        lm3 lm3Var = ((y62) this.h).b;
        if (lm3Var.h > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (lm3Var.h <= 0) {
                return;
            }
            if (lm3Var.d(0) != null) {
                m51.t();
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(lm3Var.c[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public void x(String str, le1 le1Var) {
        Map map;
        str.getClass();
        ChatMetaDoc chatMetaDocB = B();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ChatEntry chatEntry = chatMetaDocB.getChats().get(str);
        if (chatEntry == null) {
            chatEntry = new ChatEntry(null, false, false, 0, null, 0L);
        }
        ChatEntry chatEntryCopy$default = ChatEntry.copy$default((ChatEntry) le1Var.invoke(chatEntry), null, false, null, jCurrentTimeMillis, 31);
        Map<String, ChatEntry> chats = chatMetaDocB.getChats();
        chats.getClass();
        if (chats.isEmpty()) {
            Map mapSingletonMap = Collections.singletonMap(str, chatEntryCopy$default);
            mapSingletonMap.getClass();
            map = mapSingletonMap;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(chats);
            linkedHashMap.put(str, chatEntryCopy$default);
            map = linkedHashMap;
        }
        F(ChatMetaDoc.copy$default(chatMetaDocB, null, map, 0L, 11));
    }

    public ArrayList y(String str) {
        q73 q73VarA = q73.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        q73VarA.i(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.d;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(q73VarA);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.getString(0));
            }
            cursorM.close();
            q73VarA.l();
            return arrayList;
        } catch (Throwable th) {
            cursorM.close();
            q73VarA.l();
            throw th;
        }
    }
}
