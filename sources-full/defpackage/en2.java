package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class en2 {
    public static final Object[] a = new Object[0];
    public static final vh2 b = new vh2(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            m51.s(ud2.q("fromIndex (", ") is less than 0.", i));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
