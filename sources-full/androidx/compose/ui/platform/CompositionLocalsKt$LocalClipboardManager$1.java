package androidx.compose.ui.platform;

import defpackage.eg0;
import defpackage.je1;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class CompositionLocalsKt$LocalClipboardManager$1 extends ww1 implements je1 {
    public static final CompositionLocalsKt$LocalClipboardManager$1 INSTANCE = new CompositionLocalsKt$LocalClipboardManager$1();

    public CompositionLocalsKt$LocalClipboardManager$1() {
        super(0);
    }

    @Override // defpackage.je1
    public final ClipboardManager invoke() {
        CompositionLocalsKt.noLocalProvidedFor("LocalClipboardManager");
        throw new eg0();
    }
}
