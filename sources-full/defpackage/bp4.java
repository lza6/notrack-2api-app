package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* JADX INFO: loaded from: classes.dex */
public final class bp4 {
    public static final bp4 b = new bp4(0);
    public static final bp4 c = new bp4(1);
    public static final bp4 d = new bp4(2);
    public static final bp4 e = new bp4(3);
    public static final bp4 f = new bp4(4);
    public static final bp4 g = new bp4(5);
    public static final bp4 h = new bp4(6);
    public static final bp4 i = new bp4(7);
    public static final bp4 j = new bp4(8);
    public final /* synthetic */ int a;

    public /* synthetic */ bp4(int i2) {
        this.a = i2;
    }

    public final boolean a(int i2) {
        gr4 gr4Var;
        switch (this.a) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                                break;
                            default:
                                return false;
                        }
                        break;
                }
                return true;
            case 2:
                return ud2.d(i2) != 0;
            case 3:
                if (i2 == 0) {
                    gr4Var = gr4.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i2 == 1) {
                    gr4Var = gr4.PURCHASES_UPDATED_ACTION;
                } else if (i2 == 2) {
                    gr4Var = gr4.LOCAL_PURCHASES_UPDATED_ACTION;
                } else if (i2 == 3) {
                    gr4Var = gr4.ALTERNATIVE_BILLING_ACTION;
                } else if (i2 != 4) {
                    gr4Var = i2 != 5 ? null : gr4.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                } else {
                    gr4Var = gr4.IN_APP_BILLING_RESULT_UPDATE_ACTION;
                }
                return gr4Var != null;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    case 21:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 7:
                return i2 == 0 || i2 == 1;
            default:
                return i2 == 0 || i2 == 1;
        }
    }
}
