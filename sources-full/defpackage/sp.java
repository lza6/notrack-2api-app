package defpackage;

import notrack.ai.MainActivity;
import notrack.ai.ui.components.HtmlPreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sp implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    public /* synthetic */ sp(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    public /* synthetic */ sp(String str, Integer num, String str2) {
        this.c = 0;
        this.d = str;
        this.l = num;
        this.h = str2;
    }

    public /* synthetic */ sp(y3 y3Var, String str, HtmlPreviewActivity htmlPreviewActivity, int i) {
        this.c = i;
        this.h = y3Var;
        this.d = str;
        this.l = htmlPreviewActivity;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        Object obj3 = this.l;
        Object obj4 = this.h;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                return zp.AvatarPickerSheet$lambda$81$lambda$80$lambda$76$lambda$54$lambda$53$lambda$52((String) obj5, (Integer) obj3, (String) obj4, (ck0) obj, ((Integer) obj2).intValue());
            case 1:
                return wa0.UpdateBanner$lambda$391$lambda$390((w94) obj5, (je1) obj4, (je1) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 2:
                return wa0.ChatScreen$lambda$163((hb0) obj5, (gn3) obj4, (mi2) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 3:
                return wa0.ChatScreen$lambda$239((j92) obj5, (j92) obj4, (mi2) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 4:
                return HtmlPreviewActivity.onCreate$lambda$11$lambda$10$lambda$9((y3) obj4, (String) obj5, (HtmlPreviewActivity) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 5:
                return HtmlPreviewActivity.onCreate$lambda$11$lambda$10((e4) obj4, (String) obj5, (HtmlPreviewActivity) obj3, (ck0) obj, ((Integer) obj2).intValue());
            default:
                return MainActivity.onCreate$lambda$17$lambda$16((MainActivity) obj5, (gn3) obj4, (mi2) obj3, (ck0) obj, ((Integer) obj2).intValue());
        }
    }
}
