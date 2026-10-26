package org.scilab.forge.jlatexmath;

import app.template.extension.BuildConfig;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MatrixAtom extends Atom {
    public static final int ALIGN = 2;
    public static final int ALIGNAT = 3;
    public static final int ALIGNED = 6;
    public static final int ALIGNEDAT = 7;
    public static final int ARRAY = 0;
    public static final int FLALIGN = 4;
    public static final int MATRIX = 1;
    public static final int SMALLMATRIX = 5;
    private boolean isPartial;
    private ArrayOfAtoms matrix;
    private int[] position;
    private boolean spaceAround;
    private int type;
    private Map<Integer, VlineAtom> vlines;
    public static SpaceAtom hsep = new SpaceAtom(0, 1.0f, 0.0f, 0.0f);
    public static SpaceAtom semihsep = new SpaceAtom(0, 0.5f, 0.0f, 0.0f);
    public static SpaceAtom vsep_in = new SpaceAtom(1, 0.0f, 1.0f, 0.0f);
    public static SpaceAtom vsep_ext_top = new SpaceAtom(1, 0.0f, 0.4f, 0.0f);
    public static SpaceAtom vsep_ext_bot = new SpaceAtom(1, 0.0f, 0.4f, 0.0f);
    private static final Box nullBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    private static SpaceAtom align = new SpaceAtom(2);

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, int i) {
        this(false, arrayOfAtoms, i);
    }

    public MatrixAtom(ArrayOfAtoms arrayOfAtoms, String str) {
        this(false, arrayOfAtoms, str);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i) {
        this(z, arrayOfAtoms, i, false);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i, int i2) {
        this(z, arrayOfAtoms, i, i2, true);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i, int i2, boolean z2) {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = i;
        this.spaceAround = z2;
        this.position = new int[arrayOfAtoms.col];
        for (int i3 = 0; i3 < this.matrix.col; i3++) {
            this.position[i3] = i2;
        }
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i, boolean z2) {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = i;
        this.spaceAround = z2;
        if (i == 1 || i == 5) {
            this.position = new int[arrayOfAtoms.col];
            for (int i2 = 0; i2 < this.matrix.col; i2++) {
                this.position[i2] = 2;
            }
            return;
        }
        this.position = new int[arrayOfAtoms.col];
        int i3 = 0;
        while (true) {
            int i4 = this.matrix.col;
            if (i3 >= i4) {
                return;
            }
            int[] iArr = this.position;
            iArr[i3] = 1;
            int i5 = i3 + 1;
            if (i5 < i4) {
                iArr[i5] = 0;
            }
            i3 += 2;
        }
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, String str) {
        this(z, arrayOfAtoms, str, false);
    }

    public MatrixAtom(boolean z, ArrayOfAtoms arrayOfAtoms, String str, boolean z2) {
        this.vlines = new HashMap();
        this.isPartial = z;
        this.matrix = arrayOfAtoms;
        this.type = 0;
        this.spaceAround = z2;
        parsePositions(new StringBuffer(str));
    }

    private Box generateMulticolumn(TeXEnvironment teXEnvironment, Box[] boxArr, float[] fArr, int i, int i2) {
        MulticolumnAtom multicolumnAtom = (MulticolumnAtom) this.matrix.array.get(i).get(i2);
        int skipped = multicolumnAtom.getSkipped();
        int i3 = i2;
        float width = 0.0f;
        while (i3 < (i2 + skipped) - 1) {
            float f = fArr[i3];
            i3++;
            float width2 = boxArr[i3].getWidth() + f + width;
            width = this.vlines.get(Integer.valueOf(i3)) != null ? this.vlines.get(Integer.valueOf(i3)).getWidth(teXEnvironment) + width2 : width2;
        }
        float f2 = width + fArr[i3];
        multicolumnAtom.setWidth(multicolumnAtom.createBox(teXEnvironment).getWidth() <= f2 ? f2 : 0.0f);
        return multicolumnAtom.createBox(teXEnvironment);
    }

    private void parsePositions(StringBuffer stringBuffer) {
        int pos;
        int length = stringBuffer.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < length) {
            char cCharAt = stringBuffer.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    int i2 = i + 1;
                    TeXParser teXParser = new TeXParser(this.isPartial, stringBuffer.substring(i2), new TeXFormula(), false);
                    String[] optsArgs = teXParser.getOptsArgs(2, 0);
                    pos = teXParser.getPos() + i2;
                    int i3 = Integer.parseInt(optsArgs[1]);
                    String str = BuildConfig.VERSION_NAME;
                    for (int i4 = 0; i4 < i3; i4++) {
                        str = str + optsArgs[2];
                    }
                    stringBuffer.insert(pos, str);
                    length = stringBuffer.length();
                } else if (cCharAt == '@') {
                    int i5 = i + 1;
                    TeXParser teXParser2 = new TeXParser(this.isPartial, stringBuffer.substring(i5), new TeXFormula(), false);
                    Atom argument = teXParser2.getArgument();
                    this.matrix.col++;
                    int i6 = 0;
                    while (true) {
                        ArrayOfAtoms arrayOfAtoms = this.matrix;
                        if (i6 >= arrayOfAtoms.row) {
                            break;
                        }
                        arrayOfAtoms.array.get(i6).add(arrayList.size(), argument);
                        i6++;
                    }
                    arrayList.add(5);
                    pos = teXParser2.getPos() + i5;
                } else if (cCharAt == 'c') {
                    arrayList.add(2);
                } else if (cCharAt == 'l') {
                    arrayList.add(0);
                } else if (cCharAt == 'r') {
                    arrayList.add(1);
                } else if (cCharAt != '|') {
                    arrayList.add(2);
                } else {
                    int i7 = 1;
                    while (true) {
                        int i8 = i + 1;
                        if (i8 >= length) {
                            i = i8;
                            break;
                        } else {
                            if (stringBuffer.charAt(i8) != '|') {
                                break;
                            }
                            i7++;
                            i = i8;
                        }
                    }
                    this.vlines.put(Integer.valueOf(arrayList.size()), new VlineAtom(i7));
                }
                i = pos - 1;
            }
            i++;
        }
        for (int size = arrayList.size(); size < this.matrix.col; size++) {
            arrayList.add(2);
        }
        if (arrayList.size() == 0) {
            this.position = new int[]{2};
            return;
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        this.position = new int[numArr.length];
        for (int i9 = 0; i9 < numArr.length; i9++) {
            this.position[i9] = numArr[i9].intValue();
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x022f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0237  */
    /* JADX WARN: Code duplicated, block: B:75:0x0277  */
    /* JADX WARN: Code duplicated, block: B:76:0x0280  */
    /* JADX WARN: Code duplicated, block: B:79:0x028b  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0322  */
    /* JADX WARN: Code duplicated, block: B:87:0x0338  */
    /* JADX WARN: Code duplicated, block: B:88:0x034f  */
    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy;
        float f;
        int i;
        HorizontalBox horizontalBox;
        float[] fArr;
        Box[] boxArr;
        boolean zHasRightVline;
        float[] fArr2;
        int i2;
        Box boxCreateBox;
        int i3;
        boolean z;
        int i4;
        Atom atom;
        MatrixAtom matrixAtom = this;
        ArrayOfAtoms arrayOfAtoms = matrixAtom.matrix;
        int i5 = arrayOfAtoms.row;
        int i6 = arrayOfAtoms.col;
        int i7 = 0;
        Box[][] boxArr2 = (Box[][]) Array.newInstance((Class<?>) Box.class, i5, i6);
        float[] fArr3 = new float[i5];
        float[] fArr4 = new float[i5];
        float[] fArr5 = new float[i6];
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        if (matrixAtom.type == 5) {
            teXEnvironmentCopy = teXEnvironment.copy();
            teXEnvironmentCopy.setStyle(4);
        } else {
            teXEnvironmentCopy = teXEnvironment;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            f = 0.0f;
            if (i8 >= i5) {
                break;
            }
            fArr3[i8] = 0.0f;
            fArr4[i8] = 0.0f;
            int i9 = i7;
            while (i9 < i6) {
                try {
                    atom = matrixAtom.matrix.array.get(i8).get(i9);
                } catch (Exception unused) {
                    boxArr2[i8][i9 - 1].type = 11;
                    i9 = i6 - 1;
                    atom = null;
                }
                boxArr2[i8][i9] = atom == null ? nullBox : atom.createBox(teXEnvironmentCopy);
                fArr3[i8] = Math.max(boxArr2[i8][i9].getDepth(), fArr3[i8]);
                fArr4[i8] = Math.max(boxArr2[i8][i9].getHeight(), fArr4[i8]);
                Box box = boxArr2[i8][i9];
                float[] fArr6 = fArr5;
                if (box.type != 12) {
                    fArr6[i9] = Math.max(box.getWidth(), fArr6[i9]);
                } else {
                    MulticolumnAtom multicolumnAtom = (MulticolumnAtom) atom;
                    multicolumnAtom.setRowColumn(i8, i9);
                    arrayList.add(multicolumnAtom);
                }
                i9++;
                fArr5 = fArr6;
            }
            i8++;
            i7 = 0;
        }
        float[] fArr7 = fArr5;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            MulticolumnAtom multicolumnAtom2 = (MulticolumnAtom) arrayList.get(i10);
            int col = multicolumnAtom2.getCol();
            int row = multicolumnAtom2.getRow();
            int skipped = multicolumnAtom2.getSkipped();
            float f2 = f;
            int i11 = col;
            while (true) {
                i4 = col + skipped;
                if (i11 >= i4) {
                    break;
                }
                f2 += fArr7[i11];
                i11++;
            }
            if (boxArr2[row][col].getWidth() > f2) {
                float width = (boxArr2[row][col].getWidth() - f2) / skipped;
                while (col < i4) {
                    fArr7[col] = fArr7[col] + width;
                    col++;
                }
            }
            i10++;
            f = 0.0f;
        }
        float f3 = 0.0f;
        for (int i12 = 0; i12 < i6; i12++) {
            f3 += fArr7[i12];
        }
        Box[] columnSep = matrixAtom.getColumnSep(teXEnvironmentCopy, f3);
        float width2 = f3;
        for (int i13 = 0; i13 < i6 + 1; i13++) {
            float width3 = columnSep[i13].getWidth() + width2;
            width2 = matrixAtom.vlines.get(Integer.valueOf(i13)) != null ? matrixAtom.vlines.get(Integer.valueOf(i13)).getWidth(teXEnvironmentCopy) + width3 : width3;
        }
        VerticalBox verticalBox = new VerticalBox();
        Box boxCreateBox2 = vsep_in.createBox(teXEnvironmentCopy);
        verticalBox.add(vsep_ext_top.createBox(teXEnvironmentCopy));
        int i14 = 0;
        while (i14 < i5) {
            HorizontalBox horizontalBox2 = new HorizontalBox();
            int skipped2 = 0;
            while (skipped2 < i6) {
                Box[] boxArr3 = columnSep;
                int i15 = boxArr2[i14][skipped2].type;
                int i16 = i5;
                if (i15 != -1) {
                    switch (i15) {
                        case 11:
                            int i17 = i14;
                            float textwidth = teXEnvironmentCopy.getTextwidth();
                            if (textwidth == Float.POSITIVE_INFINITY) {
                                textwidth = fArr7[skipped2];
                            }
                            HorizontalBox horizontalBox3 = new HorizontalBox(boxArr2[i17][skipped2], textwidth, 0);
                            skipped2 = i6 - 1;
                            horizontalBox2 = horizontalBox3;
                            boxArr = boxArr3;
                            i14 = i17;
                            i6 = i6;
                            fArr2 = fArr7;
                            break;
                        case 12:
                            i = i14;
                            if (skipped2 != 0) {
                                if (matrixAtom.vlines.get(0) != null) {
                                    VlineAtom vlineAtom = matrixAtom.vlines.get(0);
                                    vlineAtom.setHeight(boxCreateBox2.getHeight() + fArr4[i] + fArr3[i]);
                                    vlineAtom.setShift((boxCreateBox2.getHeight() / 2.0f) + fArr3[i]);
                                    Box boxCreateBox3 = vlineAtom.createBox(teXEnvironmentCopy);
                                    horizontalBox2.add(new HorizontalBox(boxCreateBox3, boxCreateBox3.getWidth() + boxArr3[0].getWidth(), 0));
                                } else {
                                    horizontalBox2.add(boxArr3[0]);
                                }
                            }
                            if (boxArr2[i][skipped2].type == -1) {
                                horizontalBox2.add(new HorizontalBox(boxArr2[i][skipped2], fArr7[skipped2], matrixAtom.position[skipped2]));
                                horizontalBox = horizontalBox2;
                                fArr = fArr7;
                                boxArr = boxArr3;
                                i14 = i;
                                zHasRightVline = true;
                            } else {
                                horizontalBox = horizontalBox2;
                                fArr = fArr7;
                                i14 = i;
                                Box boxGenerateMulticolumn = matrixAtom.generateMulticolumn(teXEnvironmentCopy, boxArr3, fArr, i14, skipped2);
                                boxArr = boxArr3;
                                MulticolumnAtom multicolumnAtom3 = (MulticolumnAtom) matrixAtom.matrix.array.get(i14).get(skipped2);
                                skipped2 = (multicolumnAtom3.getSkipped() - 1) + skipped2;
                                horizontalBox.add(boxGenerateMulticolumn);
                                zHasRightVline = multicolumnAtom3.hasRightVline();
                            }
                            if (zHasRightVline) {
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                i2 = skipped2 + 1;
                                fArr2 = fArr;
                                if (matrixAtom.vlines.get(Integer.valueOf(i2)) != null) {
                                    VlineAtom vlineAtom2 = matrixAtom.vlines.get(Integer.valueOf(i2));
                                    vlineAtom2.setHeight(boxCreateBox2.getHeight() + fArr4[i14] + fArr3[i14]);
                                    vlineAtom2.setShift((boxCreateBox2.getHeight() / 2.0f) + fArr3[i14]);
                                    boxCreateBox = vlineAtom2.createBox(teXEnvironmentCopy);
                                    if (skipped2 < i6 - 1) {
                                        teXEnvironmentCopy = teXEnvironmentCopy;
                                        horizontalBox.add(new HorizontalBox(boxCreateBox, boxCreateBox.getWidth() + boxArr[i2].getWidth(), 2));
                                    } else {
                                        teXEnvironmentCopy = teXEnvironmentCopy;
                                        horizontalBox.add(new HorizontalBox(boxCreateBox, boxCreateBox.getWidth() + boxArr[i2].getWidth(), 1));
                                    }
                                }
                                horizontalBox2 = horizontalBox;
                            } else {
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                fArr2 = fArr;
                            }
                            teXEnvironmentCopy = teXEnvironmentCopy;
                            horizontalBox.add(boxArr[skipped2 + 1]);
                            horizontalBox2 = horizontalBox;
                            break;
                        case 13:
                            HlineAtom hlineAtom = (HlineAtom) matrixAtom.matrix.array.get(i14).get(skipped2);
                            hlineAtom.setWidth(width2);
                            if (i14 >= 1) {
                                i3 = i14;
                                if (matrixAtom.matrix.array.get(i3 - 1).get(skipped2) instanceof HlineAtom) {
                                    z = false;
                                    horizontalBox2.add(new StrutBox(0.0f, defaultRuleThickness * 2.0f, 0.0f, 0.0f));
                                    hlineAtom.setShift(((-boxCreateBox2.getHeight()) / 2.0f) + defaultRuleThickness);
                                }
                                horizontalBox2.add(hlineAtom.createBox(teXEnvironmentCopy));
                                skipped2 = i6;
                                boxArr = boxArr3;
                                i14 = i3;
                                i6 = skipped2;
                                fArr2 = fArr7;
                            } else {
                                i3 = i14;
                            }
                            z = false;
                            hlineAtom.setShift((-boxCreateBox2.getHeight()) / 2.0f);
                            horizontalBox2.add(hlineAtom.createBox(teXEnvironmentCopy));
                            skipped2 = i6;
                            boxArr = boxArr3;
                            i14 = i3;
                            i6 = skipped2;
                            fArr2 = fArr7;
                            break;
                        default:
                            fArr2 = fArr7;
                            boxArr = boxArr3;
                            i6 = i6;
                            break;
                    }
                } else {
                    i = i14;
                    if (skipped2 != 0) {
                        if (matrixAtom.vlines.get(0) != null) {
                            VlineAtom vlineAtom3 = matrixAtom.vlines.get(0);
                            vlineAtom3.setHeight(boxCreateBox2.getHeight() + fArr4[i] + fArr3[i]);
                            vlineAtom3.setShift((boxCreateBox2.getHeight() / 2.0f) + fArr3[i]);
                            Box boxCreateBox4 = vlineAtom3.createBox(teXEnvironmentCopy);
                            horizontalBox2.add(new HorizontalBox(boxCreateBox4, boxCreateBox4.getWidth() + boxArr3[0].getWidth(), 0));
                        } else {
                            horizontalBox2.add(boxArr3[0]);
                        }
                    }
                    if (boxArr2[i][skipped2].type == -1) {
                        horizontalBox2.add(new HorizontalBox(boxArr2[i][skipped2], fArr7[skipped2], matrixAtom.position[skipped2]));
                        horizontalBox = horizontalBox2;
                        fArr = fArr7;
                        boxArr = boxArr3;
                        i14 = i;
                        zHasRightVline = true;
                    } else {
                        horizontalBox = horizontalBox2;
                        fArr = fArr7;
                        i14 = i;
                        Box boxGenerateMulticolumn2 = matrixAtom.generateMulticolumn(teXEnvironmentCopy, boxArr3, fArr, i14, skipped2);
                        boxArr = boxArr3;
                        MulticolumnAtom multicolumnAtom4 = (MulticolumnAtom) matrixAtom.matrix.array.get(i14).get(skipped2);
                        skipped2 = (multicolumnAtom4.getSkipped() - 1) + skipped2;
                        horizontalBox.add(boxGenerateMulticolumn2);
                        zHasRightVline = multicolumnAtom4.hasRightVline();
                    }
                    if (zHasRightVline) {
                        teXEnvironmentCopy = teXEnvironmentCopy;
                        i2 = skipped2 + 1;
                        fArr2 = fArr;
                        if (matrixAtom.vlines.get(Integer.valueOf(i2)) != null) {
                            VlineAtom vlineAtom4 = matrixAtom.vlines.get(Integer.valueOf(i2));
                            vlineAtom4.setHeight(boxCreateBox2.getHeight() + fArr4[i14] + fArr3[i14]);
                            vlineAtom4.setShift((boxCreateBox2.getHeight() / 2.0f) + fArr3[i14]);
                            boxCreateBox = vlineAtom4.createBox(teXEnvironmentCopy);
                            if (skipped2 < i6 - 1) {
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                horizontalBox.add(new HorizontalBox(boxCreateBox, boxCreateBox.getWidth() + boxArr[i2].getWidth(), 2));
                            } else {
                                teXEnvironmentCopy = teXEnvironmentCopy;
                                horizontalBox.add(new HorizontalBox(boxCreateBox, boxCreateBox.getWidth() + boxArr[i2].getWidth(), 1));
                            }
                        }
                        horizontalBox2 = horizontalBox;
                    } else {
                        teXEnvironmentCopy = teXEnvironmentCopy;
                        teXEnvironmentCopy = teXEnvironmentCopy;
                        fArr2 = fArr;
                    }
                    teXEnvironmentCopy = teXEnvironmentCopy;
                    horizontalBox.add(boxArr[skipped2 + 1]);
                    horizontalBox2 = horizontalBox;
                }
                skipped2++;
                matrixAtom = this;
                columnSep = boxArr;
                i5 = i16;
                i6 = i6;
                fArr7 = fArr2;
            }
            Box[] boxArr4 = columnSep;
            int i18 = i5;
            int i19 = i6;
            float[] fArr8 = fArr7;
            HorizontalBox horizontalBox4 = horizontalBox2;
            if (boxArr2[i14][0].type != 13) {
                horizontalBox4.setHeight(fArr4[i14]);
                horizontalBox4.setDepth(fArr3[i14]);
                verticalBox.add(horizontalBox4);
                if (i14 < i18 - 1) {
                    verticalBox.add(boxCreateBox2);
                }
            } else {
                verticalBox.add(horizontalBox4);
            }
            i14++;
            matrixAtom = this;
            columnSep = boxArr4;
            i5 = i18;
            i6 = i19;
            fArr7 = fArr8;
        }
        verticalBox.add(vsep_ext_bot.createBox(teXEnvironmentCopy));
        float depth = verticalBox.getDepth() + verticalBox.getHeight();
        float axisHeight = teXEnvironmentCopy.getTeXFont().getAxisHeight(teXEnvironmentCopy.getStyle());
        float f4 = depth / 2.0f;
        verticalBox.setHeight(f4 + axisHeight);
        verticalBox.setDepth(f4 - axisHeight);
        return verticalBox;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    public Box[] getColumnSep(TeXEnvironment teXEnvironment, float f) {
        int i = this.matrix.col;
        Box[] boxArr = new Box[i + 1];
        float textwidth = teXEnvironment.getTextwidth();
        int i2 = this.type;
        if (i2 == 6 || i2 == 7) {
            textwidth = Float.POSITIVE_INFINITY;
        }
        int i3 = 2;
        int i4 = 1;
        switch (i2) {
            case 0:
                if (this.position[0] == 5) {
                    boxArr[1] = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    i3 = 1;
                }
                if (this.spaceAround) {
                    boxArr[0] = semihsep.createBox(teXEnvironment);
                } else {
                    boxArr[0] = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                }
                boxArr[i] = boxArr[0];
                Box boxCreateBox = hsep.createBox(teXEnvironment);
                while (i3 < i) {
                    if (this.position[i3] == 5) {
                        StrutBox strutBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
                        boxArr[i3] = strutBox;
                        i3++;
                        boxArr[i3] = strutBox;
                    } else {
                        boxArr[i3] = boxCreateBox;
                    }
                    i3++;
                }
                break;
            case 1:
            case 5:
                Box box = nullBox;
                boxArr[0] = box;
                boxArr[i] = box;
                Box boxCreateBox2 = hsep.createBox(teXEnvironment);
                while (i4 < i) {
                    boxArr[i4] = boxCreateBox2;
                    i4++;
                }
                break;
            case 2:
            case 6:
                Box boxCreateBox3 = align.createBox(teXEnvironment);
                Box strutBox2 = textwidth != Float.POSITIVE_INFINITY ? new StrutBox(Math.max(((textwidth - f) - (boxCreateBox3.getWidth() * (i / 2))) / ((float) Math.floor((i + 3) / 2)), 0.0f), 0.0f, 0.0f, 0.0f) : hsep.createBox(teXEnvironment);
                boxArr[i] = strutBox2;
                for (int i5 = 0; i5 < i; i5++) {
                    if (i5 % 2 == 0) {
                        boxArr[i5] = strutBox2;
                    } else {
                        boxArr[i5] = boxCreateBox3;
                    }
                }
                if (textwidth == Float.POSITIVE_INFINITY) {
                    Box box2 = nullBox;
                    boxArr[0] = box2;
                    boxArr[i] = box2;
                }
                break;
            case 3:
            case 7:
                float fMax = textwidth != Float.POSITIVE_INFINITY ? Math.max((textwidth - f) / 2.0f, 0.0f) : 0.0f;
                Box boxCreateBox4 = align.createBox(teXEnvironment);
                Box box3 = nullBox;
                StrutBox strutBox3 = new StrutBox(fMax, 0.0f, 0.0f, 0.0f);
                boxArr[0] = strutBox3;
                boxArr[i] = strutBox3;
                while (i4 < i) {
                    if (i4 % 2 == 0) {
                        boxArr[i4] = box3;
                    } else {
                        boxArr[i4] = boxCreateBox4;
                    }
                    i4++;
                }
                if (textwidth == Float.POSITIVE_INFINITY) {
                    Box box4 = nullBox;
                    boxArr[0] = box4;
                    boxArr[i] = box4;
                }
                break;
            case 4:
                Box boxCreateBox5 = align.createBox(teXEnvironment);
                Box strutBox4 = textwidth != Float.POSITIVE_INFINITY ? new StrutBox(Math.max(((textwidth - f) - (boxCreateBox5.getWidth() * (i / 2))) / ((float) Math.floor((i - 1) / 2)), 0.0f), 0.0f, 0.0f, 0.0f) : hsep.createBox(teXEnvironment);
                Box box5 = nullBox;
                boxArr[0] = box5;
                boxArr[i] = box5;
                while (i4 < i) {
                    if (i4 % 2 == 0) {
                        boxArr[i4] = strutBox4;
                    } else {
                        boxArr[i4] = boxCreateBox5;
                    }
                    i4++;
                }
                if (textwidth == Float.POSITIVE_INFINITY) {
                    Box box6 = nullBox;
                    boxArr[0] = box6;
                    boxArr[i] = box6;
                }
                break;
            default:
                if (textwidth == Float.POSITIVE_INFINITY) {
                    Box box7 = nullBox;
                    boxArr[0] = box7;
                    boxArr[i] = box7;
                }
                break;
        }
        return boxArr;
    }
}
