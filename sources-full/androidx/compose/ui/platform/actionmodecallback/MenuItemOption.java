package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import android.os.Build;
import defpackage.kr1;
import defpackage.o41;
import defpackage.u41;

/* JADX INFO: loaded from: classes.dex */
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3),
    Autofill(4);

    private static final /* synthetic */ o41 $ENTRIES = kr1.D(values());
    private final int id;
    private final int order;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[MenuItemOption.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuItemOption.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuItemOption.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenuItemOption.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    MenuItemOption(int i) {
        this.id = i;
        this.order = i;
    }

    public static o41 getEntries() {
        return $ENTRIES;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return R.string.copy;
        }
        if (i == 2) {
            return R.string.paste;
        }
        if (i == 3) {
            return R.string.cut;
        }
        if (i == 4) {
            return R.string.selectAll;
        }
        if (i == 5) {
            return Build.VERSION.SDK_INT <= 26 ? ai.notrack.app.R.string.autofill : R.string.autofill;
        }
        u41.e();
        return 0;
    }
}
