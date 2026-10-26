package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y9 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return AndroidComposeViewAccessibilityDelegateCompat_androidKt.sortByGeometryGroupings$lambda$5((ne1) obj3, obj, obj2);
            case 1:
                for (le1 le1Var : (le1[]) obj3) {
                    int iS = yh4.s((Comparable) le1Var.invoke(obj), (Comparable) le1Var.invoke(obj2));
                    if (iS != 0) {
                        return iS;
                    }
                }
                return 0;
            default:
                return ((Number) ((ea) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
