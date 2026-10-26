package androidx.compose.ui.platform;

import defpackage.f93;
import defpackage.g93;
import defpackage.je1;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DisposableSaveableStateRegistry implements g93 {
    public static final int $stable = 8;
    private final /* synthetic */ g93 $$delegate_0;
    private final je1 onDispose;

    public DisposableSaveableStateRegistry(g93 g93Var, je1 je1Var) {
        this.onDispose = je1Var;
        this.$$delegate_0 = g93Var;
    }

    @Override // defpackage.g93
    public boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // defpackage.g93
    public Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    public final void dispose() {
        this.onDispose.invoke();
    }

    @Override // defpackage.g93
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // defpackage.g93
    public f93 registerProvider(String str, je1 je1Var) {
        return this.$$delegate_0.registerProvider(str, je1Var);
    }
}
