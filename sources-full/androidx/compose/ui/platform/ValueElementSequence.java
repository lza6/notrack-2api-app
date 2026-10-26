package androidx.compose.ui.platform;

import defpackage.pf3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ValueElementSequence implements pf3 {
    public static final int $stable = 8;
    private final List<ValueElement> elements = new ArrayList();

    @Override // defpackage.pf3
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(String str, Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
