package androidx.compose.ui.platform;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class TestTagKt {
    public static final c testTag(c cVar, String str) {
        return cVar.then(new TestTagElement(str));
    }
}
