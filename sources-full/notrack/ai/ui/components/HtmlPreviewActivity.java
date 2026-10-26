package notrack.ai.ui.components;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.ComposeView;
import app.template.extension.BuildConfig;
import defpackage.ck0;
import defpackage.e4;
import defpackage.f04;
import defpackage.g04;
import defpackage.h11;
import defpackage.je1;
import defpackage.kk0;
import defpackage.m51;
import defpackage.nj1;
import defpackage.pj1;
import defpackage.qg0;
import defpackage.qj1;
import defpackage.sc4;
import defpackage.sp;
import defpackage.t3;
import defpackage.w84;
import defpackage.wg0;
import defpackage.wl;
import defpackage.y3;
import defpackage.ye;
import defpackage.yg0;
import defpackage.zc4;
import defpackage.zg0;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class HtmlPreviewActivity extends qg0 {
    public static String D = null;
    public static String E = "";
    public static String F = null;
    public static String G = "page.html";
    public static volatile g04 H;
    public static volatile boolean I;
    public WebView C;

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 onCreate$lambda$11$lambda$10(y3 y3Var, String str, HtmlPreviewActivity htmlPreviewActivity, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            g04 g04Var = H;
            wg0 wg0VarRememberComposableLambda = zg0.rememberComposableLambda(676179637, true, new sp(y3Var, str, htmlPreviewActivity, 4), kk0Var, 54);
            if (g04Var != null) {
                kk0Var.a0(-552314167);
                f04.NotrackAiTheme(g04Var, wg0VarRememberComposableLambda, kk0Var, 48, 0);
            } else {
                kk0Var.a0(-552312489);
                f04.NotrackAiTheme(null, wg0VarRememberComposableLambda, kk0Var, 48, 1);
            }
            kk0Var.r(false);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 onCreate$lambda$11$lambda$10$lambda$9(y3 y3Var, String str, HtmlPreviewActivity htmlPreviewActivity, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            String str2 = F;
            boolean zJ = kk0Var.j(y3Var) | kk0Var.h(str);
            Object objP = kk0Var.P();
            if (zJ || objP == Composer$Companion.getEmpty()) {
                objP = new ye(y3Var, 16, str);
                kk0Var.l0(objP);
            }
            je1 je1Var = (je1) objP;
            boolean zJ2 = kk0Var.j(htmlPreviewActivity);
            Object objP2 = kk0Var.P();
            if (zJ2 || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new wl(12, htmlPreviewActivity);
                kk0Var.l0(objP2);
            }
            qj1.PreviewHeader(str2, je1Var, (je1) objP2, kk0Var, 0);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    @Override // defpackage.qg0, defpackage.pg0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = D;
        if (str == null) {
            finish();
            return;
        }
        String str2 = E;
        if (str2.length() == 0) {
            str2 = str;
        }
        if (I) {
            getWindow().addFlags(ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
        h11.a(this);
        String str3 = G;
        e4 e4VarL = l(new nj1(this, 0, str2), new t3("text/html"));
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.setContent(new yg0(1384898586, new sp((y3) e4VarL, str3, this, 5), true));
        WebView webView = new WebView(this);
        webView.setBackgroundColor(-1);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, false);
        CookieManager.getInstance().setAcceptCookie(false);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setGeolocationEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setDatabaseEnabled(false);
        settings.setCacheMode(2);
        settings.setMixedContentMode(1);
        webView.setWebViewClient(new pj1(this));
        webView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
        this.C = webView;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(composeView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(webView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        m51 m51Var = new m51(8);
        WeakHashMap weakHashMap = zc4.a;
        sc4.i(linearLayout, m51Var);
        linearLayout.setBackgroundColor(H != g04.c ? Color.rgb(11, 13, 12) : -1);
        setContentView(linearLayout);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        WebView webView = this.C;
        if (webView != null) {
            webView.stopLoading();
            webView.loadUrl("about:blank");
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.destroy();
        }
        this.C = null;
        if (isFinishing()) {
            D = null;
            F = null;
            E = BuildConfig.VERSION_NAME;
        }
    }
}
