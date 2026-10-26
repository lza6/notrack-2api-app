package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tt3 {
    public static final tt3 b = new tt3(0);
    public static final tt3 c = new tt3(1);
    public static final tt3 d = new tt3(2);
    public final int a;

    public tt3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tt3) {
            return this.a == ((tt3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + k62.a(62, ", ", arrayList) + ']';
    }
}
