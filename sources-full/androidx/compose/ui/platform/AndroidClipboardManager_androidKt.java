package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import defpackage.em3;
import defpackage.gg;
import defpackage.hg;
import defpackage.kr1;
import defpackage.vl;
import defpackage.z21;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidClipboardManager_androidKt {
    private static final byte BACKGROUND_ID = 10;
    private static final byte BASELINE_SHIFT_ID = 8;
    private static final int BASELINE_SHIFT_SIZE = 4;
    private static final int BYTE_SIZE = 1;
    private static final byte COLOR_ID = 1;
    private static final int COLOR_SIZE = 8;
    private static final int FLOAT_SIZE = 4;
    private static final byte FONT_FEATURE_SETTINGS_ID = 6;
    private static final byte FONT_SIZE_ID = 2;
    private static final byte FONT_STYLE_ID = 4;
    private static final byte FONT_STYLE_ITALIC = 1;
    private static final byte FONT_STYLE_NORMAL = 0;
    private static final int FONT_STYLE_SIZE = 1;
    private static final byte FONT_SYNTHESIS_ALL = 1;
    private static final byte FONT_SYNTHESIS_ID = 5;
    private static final byte FONT_SYNTHESIS_NONE = 0;
    private static final int FONT_SYNTHESIS_SIZE = 1;
    private static final byte FONT_SYNTHESIS_STYLE = 3;
    private static final byte FONT_SYNTHESIS_WEIGHT = 2;
    private static final byte FONT_WEIGHT_ID = 3;
    private static final int FONT_WEIGHT_SIZE = 4;
    private static final int INT_SIZE = 4;
    private static final byte LETTER_SPACING_ID = 7;
    private static final int LONG_SIZE = 8;
    private static final String PLAIN_TEXT_LABEL = "plain text";
    private static final byte SHADOW_ID = 12;
    private static final int SHADOW_SIZE = 20;
    private static final byte TEXT_DECORATION_ID = 11;
    private static final int TEXT_DECORATION_SIZE = 4;
    private static final byte TEXT_GEOMETRIC_TRANSFORM_ID = 9;
    private static final int TEXT_GEOMETRIC_TRANSFORM_SIZE = 8;
    private static final int TEXT_UNIT_SIZE = 5;
    private static final byte UNIT_TYPE_EM = 2;
    private static final byte UNIT_TYPE_SP = 1;
    private static final byte UNIT_TYPE_UNSPECIFIED = 0;

    public static final hg convertToAnnotatedString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new hg(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iW0 = vl.w0(annotationArr);
        if (iW0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (kr1.n(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new gg(spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation), new DecodeHelper(annotation.getValue()).decodeSpanStyle()));
                }
                if (i == iW0) {
                    break;
                }
                i++;
            }
        }
        return new hg(charSequence.toString(), arrayList, 4);
    }

    public static final CharSequence convertToCharSequence(hg hgVar) {
        List list = hgVar.h;
        List list2 = z21.c;
        if (list == null) {
            list = list2;
        }
        String str = hgVar.d;
        if (list.isEmpty()) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        EncodeHelper encodeHelper = new EncodeHelper();
        ArrayList arrayList = hgVar.h;
        if (arrayList != null) {
            list2 = arrayList;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            gg ggVar = (gg) list2.get(i);
            em3 em3Var = (em3) ggVar.a;
            int i2 = ggVar.b;
            int i3 = ggVar.c;
            encodeHelper.reset();
            encodeHelper.encode(em3Var);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper.encodedString()), i2, i3, 33);
        }
        return spannableString;
    }

    public static final ClipEntry toClipEntry(ClipData clipData) {
        return new ClipEntry(clipData);
    }

    public static final ClipMetadata toClipMetadata(ClipDescription clipDescription) {
        return new ClipMetadata(clipDescription);
    }
}
