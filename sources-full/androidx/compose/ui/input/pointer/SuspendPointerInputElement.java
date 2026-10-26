package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.of2;
import defpackage.sq3;
import defpackage.tf2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends tf2 {
    public final Object c;
    public final Object d;
    public final Object[] h;
    public final PointerInputEventHandler l;

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.c = obj;
        this.d = obj2;
        this.h = objArr;
        this.l = pointerInputEventHandler;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new sq3(this.c, this.d, this.h, this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!kr1.n(this.c, suspendPointerInputElement.c) || !kr1.n(this.d, suspendPointerInputElement.d)) {
            return false;
        }
        Object[] objArr = suspendPointerInputElement.h;
        Object[] objArr2 = this.h;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.l == suspendPointerInputElement.l;
    }

    public final int hashCode() {
        Object obj = this.c;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.d;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.h;
        return this.l.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerInput");
        inspectorInfo.getProperties().set("key1", this.c);
        inspectorInfo.getProperties().set("key2", this.d);
        inspectorInfo.getProperties().set("keys", this.h);
        inspectorInfo.getProperties().set("pointerInputEventHandler", this.l);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        sq3 sq3Var = (sq3) of2Var;
        Object obj = sq3Var.c;
        Object obj2 = this.c;
        boolean z = !kr1.n(obj, obj2);
        sq3Var.c = obj2;
        Object obj3 = sq3Var.d;
        Object obj4 = this.d;
        if (!kr1.n(obj3, obj4)) {
            z = true;
        }
        sq3Var.d = obj4;
        Object[] objArr = sq3Var.h;
        Object[] objArr2 = this.h;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        sq3Var.h = objArr2;
        Class<?> cls = sq3Var.l.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.l;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            sq3Var.x0();
        }
        sq3Var.l = pointerInputEventHandler;
    }
}
