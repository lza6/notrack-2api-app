package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ag2 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public int e = -1;
    public int f = -1;

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x016c  */
    /* JADX WARN: Code duplicated, block: B:76:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:79:0x0176  */
    /* JADX WARN: Code duplicated, block: B:80:0x0179  */
    /* JADX WARN: Code duplicated, block: B:81:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0209  */
    public final fp1 a(AndroidComposeView androidComposeView, MotionEvent motionEvent) {
        long j;
        int i;
        int i2;
        long jValueAt;
        float f;
        long j2;
        long jMo27x2d3fc342;
        long jMo29xf127194;
        int toolType;
        int i3;
        int historySize;
        int i4;
        char c;
        long jFloatToRawIntBits;
        float historicalX;
        ag2 ag2Var = this;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = ag2Var.b;
        SparseBooleanArray sparseBooleanArray = ag2Var.c;
        int i5 = 3;
        if (actionMasked != 3) {
            int i6 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != ag2Var.e || source != ag2Var.f) {
                        ag2Var.e = toolType2;
                        ag2Var.f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j3 = ag2Var.a;
                        ag2Var.a = j3 + 1;
                        sparseLongArray.put(pointerId, j3);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else if (actionMasked2 != 9) {
                    j = 1;
                } else {
                    int pointerId2 = motionEvent.getPointerId(0);
                    if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                        long j4 = ag2Var.a;
                        j = 1;
                        ag2Var.a = j4 + 1;
                        sparseLongArray.put(pointerId2, j4);
                    } else {
                        j = 1;
                    }
                }
                boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z2 = actionMasked == 8;
                if (z) {
                    i = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i = 1;
                }
                int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = ag2Var.d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i7 = 0;
                while (i7 < pointerCount) {
                    boolean z3 = (z || i7 == actionIndex2 || (z2 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i7);
                    int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (iIndexOfKey >= 0) {
                        jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        long j5 = ag2Var.a;
                        ag2Var.a = j5 + j;
                        sparseLongArray.put(pointerId3, j5);
                        jValueAt = j5;
                    }
                    float pressure = motionEvent.getPressure(i7);
                    char c2 = ' ';
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i7))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i7))) << 32);
                    long jA = ln2.a(0.0f, i5, jFloatToRawIntBits2);
                    if (i7 == 0) {
                        f = 0.0f;
                        jMo27x2d3fc342 = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                        jMo29xf127194 = androidComposeView.mo29xf127194(jMo27x2d3fc342);
                    } else {
                        f = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            jMo27x2d3fc342 = (((long) Float.floatToRawIntBits(motionEvent.getRawY(i7))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(i7))) << 32);
                            jMo29xf127194 = androidComposeView.mo29xf127194(jMo27x2d3fc342);
                        } else {
                            j2 = jFloatToRawIntBits2;
                            jMo27x2d3fc342 = androidComposeView.mo27x2d3fc342(jFloatToRawIntBits2);
                        }
                        toolType = motionEvent.getToolType(i7);
                        if (toolType == 0) {
                            i3 = 0;
                        } else if (toolType != 1) {
                            i3 = 1;
                        } else if (toolType != 2) {
                            i3 = i5;
                        } else if (toolType != i5) {
                            i3 = 2;
                        } else if (toolType != i6) {
                            i3 = 0;
                        } else {
                            i3 = i6;
                        }
                        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i4 = 0;
                        while (i4 < historySize) {
                            historicalX = motionEvent.getHistoricalX(i7, i4);
                            float historicalY = motionEvent.getHistoricalY(i7, i4);
                            char c3 = c2;
                            if ((Float.floatToRawIntBits(historicalX) & IntCompanionObject.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & IntCompanionObject.MAX_VALUE) < 2139095040) {
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(historicalX)) << c3) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L);
                                arrayList2.add(new ei1(motionEvent.getHistoricalEventTime(i4), jFloatToRawIntBits3, jFloatToRawIntBits3));
                            }
                            i4++;
                            c2 = c3;
                        }
                        c = c2;
                        if (motionEvent.getActionMasked() == 8) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = 0;
                        }
                        arrayList.add(new fx2(jValueAt, motionEvent.getEventTime(), jMo27x2d3fc342, j2, z3, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList2, jFloatToRawIntBits, jA));
                        i7++;
                        ag2Var = this;
                        z2 = z2;
                        z = z;
                        i5 = 3;
                        i6 = 4;
                    }
                    j2 = jMo29xf127194;
                    toolType = motionEvent.getToolType(i7);
                    if (toolType == 0) {
                        i3 = 0;
                    } else if (toolType != 1) {
                        i3 = 1;
                    } else if (toolType != 2) {
                        i3 = i5;
                    } else if (toolType != i5) {
                        i3 = 2;
                    } else if (toolType != i6) {
                        i3 = 0;
                    } else {
                        i3 = i6;
                    }
                    ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i4 = 0;
                    while (i4 < historySize) {
                        historicalX = motionEvent.getHistoricalX(i7, i4);
                        float historicalY2 = motionEvent.getHistoricalY(i7, i4);
                        char c4 = c2;
                        if ((Float.floatToRawIntBits(historicalX) & IntCompanionObject.MAX_VALUE) >= 2139095040) {
                        }
                        i4++;
                        c2 = c4;
                    }
                    c = c2;
                    if (motionEvent.getActionMasked() == 8) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    arrayList.add(new fx2(jValueAt, motionEvent.getEventTime(), jMo27x2d3fc342, j2, z3, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList3, jFloatToRawIntBits, jA));
                    i7++;
                    ag2Var = this;
                    z2 = z2;
                    z = z;
                    i5 = 3;
                    i6 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i2 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i2 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int iKeyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i8 = i2;
                        while (true) {
                            if (i8 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(iKeyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i8) == iKeyAt) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new fp1(arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
