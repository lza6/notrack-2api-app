package defpackage;

import android.text.Editable;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.widget.TextView;
import androidx.compose.ui.platform.UriHandler;
import io.noties.markwon.ext.tables.TableRowSpan$Cell;
import io.noties.markwon.ext.tables.a;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import notrack.ai.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dn implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    public /* synthetic */ dn(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int width;
        int i;
        Object i63Var;
        Object i63Var2;
        int i2 = this.c;
        Object obj3 = this.h;
        Object obj4 = this.d;
        switch (i2) {
            case 0:
                return fn.AttachmentChip$lambda$5((hn) obj4, (je1) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 1:
                return w40.ChatBgSheet$lambda$56$lambda$55$lambda$48$lambda$44((tt) obj4, (le1) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 2:
                return wa0.ChatDrawer$lambda$837$lambda$836$lambda$777((xa0) obj4, (le1) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 3:
                return wa0.ReportDialog$lambda$457((List) obj4, (le1) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 4:
                return wa0.PersonaPill$lambda$612$lambda$611$lambda$610$lambda$607((String) obj4, (String) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 5:
                return wa0.ChatScreen$lambda$386$lambda$304$lambda$303$lambda$290((gq0) obj4, (h01) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 6:
                return wa0.MessageActionIcon$lambda$559((ym1) obj4, (String) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 7:
                return wa0.ChatDrawer$lambda$721$lambda$720$lambda$719((le1) obj4, (mi2) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 8:
                return wa0.ChatScreen$lambda$208$lambda$206((UriHandler) obj4, (e94) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 9:
                return MainActivity.onCreate$lambda$17$lambda$16$lambda$11((gn3) obj4, (MainActivity) obj3, (ck0) obj, ((Integer) obj2).intValue());
            case 10:
                TextView textView = (TextView) obj;
                Spanned spanned = (Spanned) obj2;
                textView.getClass();
                spanned.getClass();
                LruCache lruCache = jb2.a;
                List list = (List) ((gn3) obj4).getValue();
                int i3 = ((int[]) obj3)[0];
                list.getClass();
                if (!list.isEmpty()) {
                    Editable editable = spanned instanceof Editable ? (Editable) spanned : null;
                    if (editable != null) {
                        float textSize = textView.getTextSize();
                        int currentTextColor = textView.getCurrentTextColor();
                        if (i3 > 0) {
                            width = (i3 - textView.getPaddingLeft()) - textView.getPaddingRight();
                            if (width < 1) {
                                i = 1;
                            } else {
                                i = width;
                            }
                        } else {
                            width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
                            if (width <= 0) {
                                DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
                                width = (int) (displayMetrics.widthPixels - (120.0f * displayMetrics.density));
                                if (width < 1) {
                                    i = 1;
                                }
                            }
                            i = width;
                        }
                        jb2.a(editable, list, textSize, currentTextColor, i, true);
                        int i4 = i;
                        a[] aVarArr = (a[]) editable.getSpans(0, editable.length(), a.class);
                        aVarArr.getClass();
                        int i5 = 0;
                        while (true) {
                            if (i5 < aVarArr.length) {
                                int i6 = i5 + 1;
                                try {
                                    a aVar = aVarArr[i5];
                                    aVar.getClass();
                                    try {
                                        Field field = (Field) jb2.c.getValue();
                                        Object obj5 = field != null ? field.get(aVar) : null;
                                        i63Var = obj5 instanceof List ? (List) obj5 : null;
                                    } catch (Throwable th) {
                                        i63Var = new i63(th);
                                    }
                                    if (i63Var instanceof i63) {
                                        i63Var = null;
                                    }
                                    List list2 = (List) i63Var;
                                    if (list2 != null) {
                                        int size = list2.size();
                                        if (size < 1) {
                                            size = 1;
                                        }
                                        int i7 = (i4 / size) - ((int) (12.0f * textView.getResources().getDisplayMetrics().density));
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                i63Var2 = ((TableRowSpan$Cell) it.next()).text();
                                            } catch (Throwable th2) {
                                                i63Var2 = new i63(th2);
                                            }
                                            if (i63Var2 instanceof i63) {
                                                i63Var2 = null;
                                            }
                                            Editable editable2 = i63Var2 instanceof Editable ? (Editable) i63Var2 : null;
                                            if (editable2 != null) {
                                                jb2.a(editable2, list, textSize, currentTextColor, i7 < 1 ? 1 : i7, false);
                                            }
                                            break;
                                        }
                                    }
                                    i5 = i6;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    j93.g(e.getMessage());
                                    return null;
                                }
                            }
                        }
                    }
                }
                return w84.a;
            default:
                return f04.NotrackAiTheme$lambda$2((ye0) obj4, (ne1) obj3, (ck0) obj, ((Integer) obj2).intValue());
        }
    }
}
