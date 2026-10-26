package defpackage;

import androidx.compose.ui.c;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class we3 {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static final void a(InspectorInfo inspectorInfo, ue3 ue3Var) {
        ValueElementSequence properties = inspectorInfo.getProperties();
        int iS = y92.S(le0.q0(ue3Var, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        Iterator it = ue3Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((ff3) entry.getKey()).a, entry.getValue());
        }
        properties.set("properties", linkedHashMap);
    }

    public static final c b(c cVar, boolean z, le1 le1Var) {
        return cVar.then(new AppendedSemanticsElement(le1Var, z));
    }
}
