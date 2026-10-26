package com.android.billingclient.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import defpackage.e4;
import defpackage.jb;
import defpackage.l1;
import defpackage.m1;
import defpackage.qg0;
import defpackage.r3;
import defpackage.sq1;
import defpackage.tm4;
import defpackage.u3;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends qg0 {
    public e4 C;
    public e4 D;
    public e4 E;
    public e4 F;
    public e4 G;
    public e4 H;
    public ResultReceiver I;
    public ResultReceiver J;
    public ResultReceiver K;
    public ResultReceiver L;
    public ResultReceiver M;
    public ResultReceiver N;

    public static final jb m() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            jb jbVar = new jb(4, activityOptionsMakeBasic);
            if (i >= 34) {
                m1.i(activityOptionsMakeBasic, 3);
                return jbVar;
            }
            if (i >= 33) {
                l1.g(activityOptionsMakeBasic, true);
            }
            return jbVar;
        }
        if (i < 34) {
            return null;
        }
        ActivityOptions activityOptionsMakeBasic2 = ActivityOptions.makeBasic();
        jb jbVar2 = new jb(4, activityOptionsMakeBasic2);
        if (i >= 34) {
            m1.i(activityOptionsMakeBasic2, 1);
            return jbVar2;
        }
        if (i >= 33) {
            l1.g(activityOptionsMakeBasic2, true);
        }
        return jbVar2;
    }

    @Override // defpackage.qg0, defpackage.pg0, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        final int i = 5;
        final int i2 = 0;
        this.C = l(new r3(this) { // from class: so4
            public final /* synthetic */ ProxyBillingActivityV2 d;

            {
                this.d = this;
            }

            @Override // defpackage.r3
            public final void b(Object obj) {
                Bundle extras;
                int i3 = i2;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.d;
                q3 q3Var = (q3) obj;
                switch (i3) {
                    case 0:
                        Intent intent = q3Var.d;
                        int i4 = tm4.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
                        if (resultReceiver != null) {
                            resultReceiver.send(i4, intent != null ? intent.getExtras() : null);
                        }
                        int i5 = q3Var.c;
                        if (i5 != -1 || i4 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i5 + " and billing's responseCode: " + i4);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = q3Var.d;
                        int i6 = tm4.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i6, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i7 = q3Var.c;
                        if (i7 != -1 || i6 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i7 + " and billing's responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = q3Var.d;
                        int i8 = q3Var.c;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i8 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i8);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i8);
                        }
                        int i9 = tm4.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.K;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i9, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i9 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = q3Var.d;
                        int i10 = q3Var.c;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i10 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i10);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i10);
                        }
                        int i11 = tm4.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.L;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i11, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i11 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = q3Var.d;
                        int i12 = tm4.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.M;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i12, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i13 = q3Var.c;
                        if (i13 != -1 || i12 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i13 + " and billing's responseCode: " + i12);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = q3Var.d;
                        int i14 = tm4.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.N;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i14, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i15 = q3Var.c;
                        if (i15 != -1 || i14 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i15 + " and billing's responseCode: " + i14);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new u3(5));
        final int i3 = 1;
        this.D = l(new r3(this) { // from class: so4
            public final /* synthetic */ ProxyBillingActivityV2 d;

            {
                this.d = this;
            }

            @Override // defpackage.r3
            public final void b(Object obj) {
                Bundle extras;
                int i4 = i3;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.d;
                q3 q3Var = (q3) obj;
                switch (i4) {
                    case 0:
                        Intent intent = q3Var.d;
                        int i5 = tm4.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
                        if (resultReceiver != null) {
                            resultReceiver.send(i5, intent != null ? intent.getExtras() : null);
                        }
                        int i6 = q3Var.c;
                        if (i6 != -1 || i5 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i6 + " and billing's responseCode: " + i5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = q3Var.d;
                        int i7 = tm4.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i7, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i8 = q3Var.c;
                        if (i8 != -1 || i7 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i8 + " and billing's responseCode: " + i7);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = q3Var.d;
                        int i9 = q3Var.c;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i9 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i9);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i9);
                        }
                        int i10 = tm4.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.K;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i10, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i10 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i10);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = q3Var.d;
                        int i11 = q3Var.c;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i11 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i11);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i11);
                        }
                        int i12 = tm4.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.L;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i12, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i12 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i12);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = q3Var.d;
                        int i13 = tm4.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.M;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i13, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i14 = q3Var.c;
                        if (i14 != -1 || i13 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i14 + " and billing's responseCode: " + i13);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = q3Var.d;
                        int i15 = tm4.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.N;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i15, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i16 = q3Var.c;
                        if (i16 != -1 || i15 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i16 + " and billing's responseCode: " + i15);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new u3(5));
        final int i4 = 2;
        this.E = l(new r3(this) { // from class: so4
            public final /* synthetic */ ProxyBillingActivityV2 d;

            {
                this.d = this;
            }

            @Override // defpackage.r3
            public final void b(Object obj) {
                Bundle extras;
                int i5 = i4;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.d;
                q3 q3Var = (q3) obj;
                switch (i5) {
                    case 0:
                        Intent intent = q3Var.d;
                        int i6 = tm4.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
                        if (resultReceiver != null) {
                            resultReceiver.send(i6, intent != null ? intent.getExtras() : null);
                        }
                        int i7 = q3Var.c;
                        if (i7 != -1 || i6 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i7 + " and billing's responseCode: " + i6);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = q3Var.d;
                        int i8 = tm4.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i8, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i9 = q3Var.c;
                        if (i9 != -1 || i8 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i9 + " and billing's responseCode: " + i8);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = q3Var.d;
                        int i10 = q3Var.c;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i10 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                        }
                        int i11 = tm4.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.K;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i11, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i11 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = q3Var.d;
                        int i12 = q3Var.c;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i12 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i12);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i12);
                        }
                        int i13 = tm4.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.L;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i13, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i13 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i13);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = q3Var.d;
                        int i14 = tm4.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.M;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i14, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i15 = q3Var.c;
                        if (i15 != -1 || i14 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i15 + " and billing's responseCode: " + i14);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = q3Var.d;
                        int i16 = tm4.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.N;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i16, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i17 = q3Var.c;
                        if (i17 != -1 || i16 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i17 + " and billing's responseCode: " + i16);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new u3(5));
        final int i5 = 3;
        this.F = l(new r3(this) { // from class: so4
            public final /* synthetic */ ProxyBillingActivityV2 d;

            {
                this.d = this;
            }

            @Override // defpackage.r3
            public final void b(Object obj) {
                Bundle extras;
                int i6 = i5;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.d;
                q3 q3Var = (q3) obj;
                switch (i6) {
                    case 0:
                        Intent intent = q3Var.d;
                        int i7 = tm4.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
                        if (resultReceiver != null) {
                            resultReceiver.send(i7, intent != null ? intent.getExtras() : null);
                        }
                        int i8 = q3Var.c;
                        if (i8 != -1 || i7 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i8 + " and billing's responseCode: " + i7);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = q3Var.d;
                        int i9 = tm4.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i9, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i10 = q3Var.c;
                        if (i10 != -1 || i9 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i10 + " and billing's responseCode: " + i9);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = q3Var.d;
                        int i11 = q3Var.c;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i11 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                        }
                        int i12 = tm4.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.K;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i12, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i12 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = q3Var.d;
                        int i13 = q3Var.c;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i13 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i13);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i13);
                        }
                        int i14 = tm4.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.L;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i14, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i14 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i14);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = q3Var.d;
                        int i15 = tm4.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.M;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i15, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i16 = q3Var.c;
                        if (i16 != -1 || i15 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i16 + " and billing's responseCode: " + i15);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = q3Var.d;
                        int i17 = tm4.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.N;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i17, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i18 = q3Var.c;
                        if (i18 != -1 || i17 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i18 + " and billing's responseCode: " + i17);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new u3(5));
        final int i6 = 4;
        this.G = l(new r3(this) { // from class: so4
            public final /* synthetic */ ProxyBillingActivityV2 d;

            {
                this.d = this;
            }

            @Override // defpackage.r3
            public final void b(Object obj) {
                Bundle extras;
                int i7 = i6;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.d;
                q3 q3Var = (q3) obj;
                switch (i7) {
                    case 0:
                        Intent intent = q3Var.d;
                        int i8 = tm4.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
                        if (resultReceiver != null) {
                            resultReceiver.send(i8, intent != null ? intent.getExtras() : null);
                        }
                        int i9 = q3Var.c;
                        if (i9 != -1 || i8 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i9 + " and billing's responseCode: " + i8);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = q3Var.d;
                        int i10 = tm4.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i10, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i11 = q3Var.c;
                        if (i11 != -1 || i10 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = q3Var.d;
                        int i12 = q3Var.c;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i12 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i12);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i12);
                        }
                        int i13 = tm4.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.K;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i13, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i13 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i13);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = q3Var.d;
                        int i14 = q3Var.c;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i14 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i14);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i14);
                        }
                        int i15 = tm4.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.L;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i15, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i15 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i15);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = q3Var.d;
                        int i16 = tm4.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.M;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i16, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i17 = q3Var.c;
                        if (i17 != -1 || i16 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i17 + " and billing's responseCode: " + i16);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = q3Var.d;
                        int i18 = tm4.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.N;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i18, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i19 = q3Var.c;
                        if (i19 != -1 || i18 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i19 + " and billing's responseCode: " + i18);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new u3(5));
        this.H = l(new r3(this) { // from class: so4
            public final /* synthetic */ ProxyBillingActivityV2 d;

            {
                this.d = this;
            }

            @Override // defpackage.r3
            public final void b(Object obj) {
                Bundle extras;
                int i7 = i;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.d;
                q3 q3Var = (q3) obj;
                switch (i7) {
                    case 0:
                        Intent intent = q3Var.d;
                        int i8 = tm4.e(intent, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
                        if (resultReceiver != null) {
                            resultReceiver.send(i8, intent != null ? intent.getExtras() : null);
                        }
                        int i9 = q3Var.c;
                        if (i9 != -1 || i8 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i9 + " and billing's responseCode: " + i8);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = q3Var.d;
                        int i10 = tm4.e(intent2, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i10, intent2 != null ? intent2.getExtras() : null);
                        }
                        int i11 = q3Var.c;
                        if (i11 != -1 || i10 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 2:
                        Intent intent3 = q3Var.d;
                        int i12 = q3Var.c;
                        extras = intent3 != null ? intent3.getExtras() : null;
                        if (i12 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i12);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i12);
                        }
                        int i13 = tm4.e(intent3, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.K;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i13, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i13 != 0) {
                            tm4.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i13);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 3:
                        Intent intent4 = q3Var.d;
                        int i14 = q3Var.c;
                        extras = intent4 != null ? intent4.getExtras() : null;
                        if (i14 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i14);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i14);
                        }
                        int i15 = tm4.e(intent4, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver4 = proxyBillingActivityV2.L;
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(i15, extras);
                        } else {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i15 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i15);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 4:
                        Intent intent5 = q3Var.d;
                        int i16 = tm4.e(intent5, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver5 = proxyBillingActivityV2.M;
                        if (resultReceiver5 != null) {
                            resultReceiver5.send(i16, intent5 != null ? intent5.getExtras() : null);
                        }
                        int i17 = q3Var.c;
                        if (i17 != -1 || i16 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i17 + " and billing's responseCode: " + i16);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent6 = q3Var.d;
                        int i18 = tm4.e(intent6, "ProxyBillingActivityV2").a;
                        ResultReceiver resultReceiver6 = proxyBillingActivityV2.N;
                        if (resultReceiver6 != null) {
                            resultReceiver6.send(i18, intent6 != null ? intent6.getExtras() : null);
                        }
                        int i19 = q3Var.c;
                        if (i19 != -1 || i18 != 0) {
                            tm4.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i19 + " and billing's responseCode: " + i18);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        }, new u3(5));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.I = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.J = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.K = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.L = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.M = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.N = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        tm4.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.I = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            e4 e4Var = this.C;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            e4Var.a(new sq1(intentSender, null, 0, 0), m());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.J = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            e4 e4Var2 = this.D;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            e4Var2.a(new sq1(intentSender2, null, 0, 0), m());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.K = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            e4 e4Var3 = this.E;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            e4Var3.a(new sq1(intentSender3, null, 0, 0), m());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.L = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            e4 e4Var4 = this.F;
            pendingIntent4.getClass();
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            intentSender4.getClass();
            e4Var4.a(new sq1(intentSender4, null, 0, 0), m());
            return;
        }
        if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.M = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            e4 e4Var5 = this.G;
            pendingIntent5.getClass();
            IntentSender intentSender5 = pendingIntent5.getIntentSender();
            intentSender5.getClass();
            e4Var5.a(new sq1(intentSender5, null, 0, 0), m());
            return;
        }
        if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.N = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            e4 e4Var6 = this.H;
            pendingIntent6.getClass();
            IntentSender intentSender6 = pendingIntent6.getIntentSender();
            intentSender6.getClass();
            e4Var6.a(new sq1(intentSender6, null, 0, 0), m());
        }
    }

    @Override // defpackage.qg0, defpackage.pg0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.I;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.J;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.K;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.L;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.M;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.N;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
