package defpackage;

import app.template.extension.BuildConfig;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ke0 extends pe0 {
    public static Object A0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void B0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, le1 le1Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            yo4.h(sb, obj, le1Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void C0(List list, StringBuilder sb, e8 e8Var, int i) {
        if ((i & 64) != 0) {
            e8Var = null;
        }
        B0(list, sb, "\n", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "...", e8Var);
    }

    public static String D0(Iterable iterable, CharSequence charSequence, String str, String str2, le1 le1Var, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? BuildConfig.VERSION_NAME : str;
        String str4 = (i & 4) != 0 ? BuildConfig.VERSION_NAME : str2;
        if ((i & 32) != 0) {
            le1Var = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        B0(iterable, sb, charSequence2, str3, str4, "...", le1Var);
        return sb.toString();
    }

    public static Object E0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        j93.g("List is empty.");
        return null;
    }

    public static Object F0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable G0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            m51.o();
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList H0(Collection collection, List list) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static ArrayList I0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object J0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            j93.g("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        u41.k("List has more than one element.");
        return null;
    }

    public static List K0(List list, Comparator comparator) {
        list.getClass();
        if (list.size() <= 1) {
            return O0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List L0(int i, List list) {
        list.getClass();
        if (i < 0) {
            u41.h(ud2.q("Requested element count ", " is less than zero.", i));
            return null;
        }
        if (i == 0) {
            return z21.c;
        }
        if (i >= list.size()) {
            return O0(list);
        }
        if (i == 1) {
            return kr1.T(x0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return kr1.X(arrayList);
    }

    public static final void M0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] N0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    public static List O0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return kr1.X(Q0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z21.c;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return kr1.T(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList P0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List Q0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        M0(iterable, arrayList);
        return arrayList;
    }

    public static Set R0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        M0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set S0(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return py.R(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(y92.S(collection.size()));
                M0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            M0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : py.R(linkedHashSet2.iterator().next());
            }
        }
        return f31.c;
    }

    public static ArrayList u0(int i, List list) {
        list.getClass();
        if (i <= 0 || i <= 0) {
            u41.h(ud2.q("size ", " must be greater than zero.", i));
            return null;
        }
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            it.getClass();
            Iterator itM = !it.hasNext() ? y21.c : sf3.M(new vj3(i, i, it, null));
            while (itM.hasNext()) {
                arrayList.add((List) itM.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean v0(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    kr1.m0();
                    throw null;
                }
                if (kr1.n(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List w0(int i, List list) {
        list.getClass();
        if (i < 0) {
            u41.h(ud2.q("Requested element count ", " is less than zero.", i));
            return null;
        }
        if (i == 0) {
            return O0(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return z21.c;
        }
        if (size == 1) {
            return kr1.T(E0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object x0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return y0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        j93.g("Collection is empty.");
        return null;
    }

    public static Object y0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        j93.g("List is empty.");
        return null;
    }

    public static Object z0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
