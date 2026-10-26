package defpackage;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class tf2 implements nf2, InspectableValue {
    public static final int $stable = 0;
    private InspectorInfo _inspectorValues;

    public final InspectorInfo b() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(Options$Companion.getClassSimpleName(r43.a(getClass()).c));
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    public abstract of2 create();

    @Override // androidx.compose.ui.platform.InspectableValue
    public final pf3 getInspectableElements() {
        return b().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final String getNameFallback() {
        return b().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return b().getValue();
    }

    public abstract void inspectableProperties(InspectorInfo inspectorInfo);

    public abstract void update(of2 of2Var);
}
