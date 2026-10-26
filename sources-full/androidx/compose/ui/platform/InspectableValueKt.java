package androidx.compose.ui.platform;

import androidx.compose.ui.c;
import defpackage.cv0;
import defpackage.le1;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class InspectableValueKt {
    private static final le1 NoInspectorInfo = InspectableValueKt$NoInspectorInfo$1.INSTANCE;
    private static boolean isDebugInspectorInfoEnabled;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.InspectableValueKt$debugInspectorInfo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements le1 {
        final /* synthetic */ le1 $definitions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(le1 le1Var) {
            super(1);
            this.$definitions = le1Var;
        }

        @Override // defpackage.le1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InspectorInfo) obj);
            return w84.a;
        }

        public final void invoke(InspectorInfo inspectorInfo) {
            this.$definitions.invoke(inspectorInfo);
        }
    }

    public static final le1 debugInspectorInfo(le1 le1Var) {
        return isDebugInspectorInfoEnabled() ? new AnonymousClass1(le1Var) : getNoInspectorInfo();
    }

    public static final le1 getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @cv0
    public static final c inspectable(c cVar, le1 le1Var, le1 le1Var2) {
        return inspectableWrapper(cVar, le1Var, (c) le1Var2.invoke(c.i));
    }

    public static final c inspectableWrapper(c cVar, le1 le1Var, c cVar2) {
        InspectableModifier inspectableModifier = new InspectableModifier(le1Var);
        return cVar.then(inspectableModifier).then(cVar2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        isDebugInspectorInfoEnabled = z;
    }
}
