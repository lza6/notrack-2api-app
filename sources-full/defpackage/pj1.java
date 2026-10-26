package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import notrack.ai.ui.components.HtmlPreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public final class pj1 extends WebViewClient {
    public final /* synthetic */ HtmlPreviewActivity a;

    public pj1(HtmlPreviewActivity htmlPreviewActivity) {
        this.a = htmlPreviewActivity;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        if (kr1.n(url.getScheme(), "about") || kr1.n(url.getScheme(), "data")) {
            return false;
        }
        if (!kr1.n(url.getScheme(), "http") && !kr1.n(url.getScheme(), "https")) {
            return true;
        }
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url.toString())));
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
