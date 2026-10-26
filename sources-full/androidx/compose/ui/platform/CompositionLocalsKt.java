package androidx.compose.ui.platform;

import defpackage.ck0;
import defpackage.cv0;
import defpackage.dl0;
import defpackage.kk0;
import defpackage.ne1;
import defpackage.o13;
import defpackage.s13;
import defpackage.sf3;
import defpackage.un3;
import defpackage.vk0;
import defpackage.w33;
import defpackage.w84;
import defpackage.ww1;
import defpackage.yk0;
import defpackage.yr2;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class CompositionLocalsKt {
    private static final o13 LocalAccessibilityManager = new un3(CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);
    private static final o13 LocalAutofill = new un3(CompositionLocalsKt$LocalAutofill$1.INSTANCE);
    private static final o13 LocalAutofillTree = new un3(CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);
    private static final o13 LocalAutofillManager = new un3(CompositionLocalsKt$LocalAutofillManager$1.INSTANCE);
    private static final o13 LocalClipboardManager = new un3(CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);
    private static final o13 LocalClipboard = new un3(CompositionLocalsKt$LocalClipboard$1.INSTANCE);
    private static final o13 LocalGraphicsContext = new un3(CompositionLocalsKt$LocalGraphicsContext$1.INSTANCE);
    private static final o13 LocalDensity = new un3(CompositionLocalsKt$LocalDensity$1.INSTANCE);
    private static final o13 LocalFocusManager = new un3(CompositionLocalsKt$LocalFocusManager$1.INSTANCE);
    private static final o13 LocalFontLoader = new un3(CompositionLocalsKt$LocalFontLoader$1.INSTANCE);
    private static final o13 LocalFontFamilyResolver = new un3(CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);
    private static final o13 LocalHapticFeedback = new un3(CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);
    private static final o13 LocalInputModeManager = new un3(CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);
    private static final o13 LocalLayoutDirection = new un3(CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);
    private static final o13 LocalTextInputService = new un3(CompositionLocalsKt$LocalTextInputService$1.INSTANCE);
    private static final o13 LocalSoftwareKeyboardController = new un3(CompositionLocalsKt$LocalSoftwareKeyboardController$1.INSTANCE);
    private static final o13 LocalTextToolbar = new un3(CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);
    private static final o13 LocalUriHandler = new un3(CompositionLocalsKt$LocalUriHandler$1.INSTANCE);
    private static final o13 LocalViewConfiguration = new un3(CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);
    private static final o13 LocalWindowInfo = new un3(CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);
    private static final o13 LocalPointerIconService = new un3(CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);
    private static final o13 LocalProvidableScrollCaptureInProgress = new dl0(CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1.INSTANCE);
    private static final o13 LocalCursorBlinkEnabled = new un3(CompositionLocalsKt$LocalCursorBlinkEnabled$1.INSTANCE);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements ne1 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ ne1 $content;
        final /* synthetic */ yr2 $owner;
        final /* synthetic */ UriHandler $uriHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(yr2 yr2Var, UriHandler uriHandler, ne1 ne1Var, int i) {
            super(2);
            this.$owner = yr2Var;
            this.$uriHandler = uriHandler;
            this.$content = ne1Var;
            this.$$changed = i;
        }

        @Override // defpackage.ne1
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ck0) obj, ((Number) obj2).intValue());
            return w84.a;
        }

        public final void invoke(ck0 ck0Var, int i) {
            CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.$uriHandler, this.$content, ck0Var, sf3.V(this.$$changed | 1));
        }
    }

    public static final void ProvideCommonCompositionLocals(yr2 yr2Var, UriHandler uriHandler, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(874662829);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? kk0Var.h(yr2Var) : kk0Var.j(yr2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? kk0Var.h(uriHandler) : kk0Var.j(uriHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(ne1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i2 & 1, (i2 & 147) != 146)) {
            s13 s13VarC = LocalAccessibilityManager.c(yr2Var.getAccessibilityManager());
            s13 s13VarC2 = LocalAutofill.c(yr2Var.getAutofill());
            s13 s13VarC3 = LocalAutofillManager.c(yr2Var.getAutofillManager());
            s13 s13VarC4 = LocalAutofillTree.c(yr2Var.getAutofillTree());
            s13 s13VarC5 = LocalClipboardManager.c(yr2Var.getClipboardManager());
            s13 s13VarC6 = LocalClipboard.c(yr2Var.getClipboard());
            s13 s13VarC7 = LocalDensity.c(yr2Var.getDensity());
            s13 s13VarC8 = LocalFocusManager.c(yr2Var.getFocusOwner());
            s13 s13VarC9 = LocalFontLoader.c(yr2Var.getFontLoader());
            s13VarC9.h = false;
            int i3 = i2;
            s13 s13VarC10 = LocalFontFamilyResolver.c(yr2Var.getFontFamilyResolver());
            s13VarC10.h = false;
            yk0.CompositionLocalProvider(new s13[]{s13VarC, s13VarC2, s13VarC3, s13VarC4, s13VarC5, s13VarC6, s13VarC7, s13VarC8, s13VarC9, s13VarC10, LocalHapticFeedback.c(yr2Var.getHapticFeedBack()), LocalInputModeManager.c(yr2Var.getInputModeManager()), LocalLayoutDirection.c(yr2Var.getLayoutDirection()), LocalTextInputService.c(yr2Var.getTextInputService()), LocalSoftwareKeyboardController.c(yr2Var.getSoftwareKeyboardController()), LocalTextToolbar.c(yr2Var.getTextToolbar()), LocalUriHandler.c(uriHandler), LocalViewConfiguration.c(yr2Var.getViewConfiguration()), LocalWindowInfo.c(yr2Var.getWindowInfo()), LocalPointerIconService.c(yr2Var.getPointerIconService()), LocalGraphicsContext.c(yr2Var.getGraphicsContext())}, ne1Var, kk0Var, ((i3 >> 3) & 112) | 8);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new AnonymousClass1(yr2Var, uriHandler, ne1Var, i));
        }
    }

    public static final o13 getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    public static final o13 getLocalAutofill() {
        return LocalAutofill;
    }

    @cv0
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    public static final o13 getLocalAutofillManager() {
        return LocalAutofillManager;
    }

    public static final o13 getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    @cv0
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    public static final o13 getLocalClipboard() {
        return LocalClipboard;
    }

    public static final o13 getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    @cv0
    public static /* synthetic */ void getLocalClipboardManager$annotations() {
    }

    public static final o13 getLocalCursorBlinkEnabled() {
        return LocalCursorBlinkEnabled;
    }

    public static final o13 getLocalDensity() {
        return LocalDensity;
    }

    public static final o13 getLocalFocusManager() {
        return LocalFocusManager;
    }

    public static final o13 getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    public static final o13 getLocalFontLoader() {
        return LocalFontLoader;
    }

    @cv0
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    public static final o13 getLocalGraphicsContext() {
        return LocalGraphicsContext;
    }

    public static final o13 getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    public static final o13 getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    public static final o13 getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    public static final o13 getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    public static final o13 getLocalProvidableScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final vk0 getLocalScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final o13 getLocalSoftwareKeyboardController() {
        return LocalSoftwareKeyboardController;
    }

    public static final o13 getLocalTextInputService() {
        return LocalTextInputService;
    }

    @cv0
    public static /* synthetic */ void getLocalTextInputService$annotations() {
    }

    public static final o13 getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    public static final o13 getLocalUriHandler() {
        return LocalUriHandler;
    }

    public static final o13 getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    public static final o13 getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
