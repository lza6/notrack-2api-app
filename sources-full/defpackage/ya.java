package defpackage;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.of2;

/* JADX INFO: loaded from: classes.dex */
public final class ya implements View.OnDragListener, xx0 {
    public final yx0 a = new yx0(null, 3);
    public final ul b = new ul(0);
    public final AndroidDragAndDropManager$modifier$1 c = new tf2() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // defpackage.tf2
        public final of2 create() {
            return this.c.a;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.c.a.hashCode();
        }

        @Override // defpackage.tf2
        public final void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // defpackage.tf2
        public final /* bridge */ /* synthetic */ void update(of2 of2Var) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        wx0 wx0Var = new wx0(dragEvent);
        int action = dragEvent.getAction();
        ul ulVar = this.b;
        yx0 yx0Var = this.a;
        switch (action) {
            case 1:
                l43 l43Var = new l43();
                ie ieVar = new ie(wx0Var, yx0Var, l43Var, 9);
                if (ieVar.invoke(yx0Var) == h64.c) {
                    gb2.b0(yx0Var, ieVar);
                }
                boolean z = l43Var.c;
                ulVar.getClass();
                ol olVar = new ol(ulVar);
                while (olVar.hasNext()) {
                    ((zx0) olVar.next()).G(wx0Var);
                }
                return z;
            case 2:
                yx0Var.J(wx0Var);
                return false;
            case 3:
                return yx0Var.m0(wx0Var);
            case 4:
                yx0Var.M(wx0Var);
                ulVar.clear();
                return false;
            case 5:
                yx0Var.x(wx0Var);
                return false;
            case 6:
                yx0Var.y(wx0Var);
                return false;
            default:
                return false;
        }
    }
}
