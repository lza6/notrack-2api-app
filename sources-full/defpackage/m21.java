package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class m21 extends vl0 {
    public final TextView h;
    public final g21 i;
    public boolean j = true;

    public m21(TextView textView) {
        this.h = textView;
        this.i = new g21(textView);
    }

    @Override // defpackage.vl0
    public final InputFilter[] M(InputFilter[] inputFilterArr) {
        if (!this.j) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof g21) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            g21 g21Var = this.i;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = g21Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == g21Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.vl0
    public final void a0(boolean z) {
        if (z) {
            m0();
        }
    }

    @Override // defpackage.vl0
    public final void b0(boolean z) {
        this.j = z;
        m0();
        TextView textView = this.h;
        textView.setFilters(M(textView.getFilters()));
    }

    public final void m0() {
        TextView textView = this.h;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.j) {
            if (!(transformationMethod instanceof q21) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new q21(transformationMethod);
            }
        } else if (transformationMethod instanceof q21) {
            transformationMethod = ((q21) transformationMethod).c;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
