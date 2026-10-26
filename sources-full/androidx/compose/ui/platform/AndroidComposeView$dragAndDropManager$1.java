package androidx.compose.ui.platform;

import defpackage.ay0;
import defpackage.bi3;
import defpackage.le1;
import defpackage.m51;
import defpackage.oe1;
import defpackage.we1;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends we1 implements oe1 {
    public AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, 0, AndroidComposeView.class, obj, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z");
    }

    @Override // defpackage.oe1
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            return m33x91ad2579(null, ((bi3) obj2).a, (le1) obj3);
        }
        m51.t();
        return null;
    }

    /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m33x91ad2579(ay0 ay0Var, long j, le1 le1Var) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m22x73bc27b7(ay0Var, j, le1Var));
    }
}
