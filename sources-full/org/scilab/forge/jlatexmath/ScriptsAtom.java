package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class ScriptsAtom extends Atom {
    private static final SpaceAtom SCRIPT_SPACE = new SpaceAtom(3, 0.5f, 0.0f, 0.0f);
    private int align;
    private final Atom base;
    private final Atom subscript;
    private final Atom superscript;

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3) {
        this.align = 0;
        this.base = atom;
        this.subscript = atom2;
        this.superscript = atom3;
    }

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3, boolean z) {
        this(atom, atom2, atom3);
        if (z) {
            return;
        }
        this.align = 1;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x015c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0227  */
    /* JADX WARN: Code duplicated, block: B:77:0x0240  */
    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float height;
        float depth;
        float subDrop;
        float italic;
        float depth2;
        Atom atom;
        Box boxCreateBox;
        float width;
        Atom atom2;
        HorizontalBox horizontalBox;
        SpaceAtom spaceAtom;
        float sup2;
        float fMax;
        Atom atom3;
        float fMax2;
        float depth3;
        float f;
        float fAbs;
        Atom atom4 = this.base;
        Box strutBox = atom4 == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom4.createBox(teXEnvironment);
        Box strutBox2 = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.subscript == null && this.superscript == null) {
            return strutBox;
        }
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Atom atom5 = this.base;
        int i = atom5.type_limits;
        if (i == 2 || (i == 0 && style == 0)) {
            return new UnderOverAtom(new UnderOverAtom(atom5, this.subscript, 3, 0.3f, true, false), this.superscript, 3, 3.0f, true, true).createBox(teXEnvironment);
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(strutBox);
        int lastFontId = strutBox.getLastFontId();
        if (lastFontId == -1) {
            lastFontId = teXFont.getMuFontId();
        }
        TeXEnvironment teXEnvironmentSubStyle = teXEnvironment.subStyle();
        TeXEnvironment teXEnvironmentSupStyle = teXEnvironment.supStyle();
        Atom atom6 = this.base;
        if (!(atom6 instanceof AccentedAtom)) {
            if ((atom6 instanceof SymbolAtom) && atom6.type == 1) {
                Char nextLarger = teXFont.getChar(((SymbolAtom) atom6).getName(), style);
                if (style < 2 && teXFont.hasNextLarger(nextLarger)) {
                    nextLarger = teXFont.getNextLarger(nextLarger, style);
                }
                CharBox charBox = new CharBox(nextLarger);
                charBox.setShift(((-(charBox.getDepth() + charBox.getHeight())) / 2.0f) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
                horizontalBox2 = new HorizontalBox(charBox);
                italic = nextLarger.getItalic();
                strutBox2 = new SpaceAtom(2).createBox(teXEnvironment);
                if (italic > 1.0E-7f && this.subscript == null) {
                    horizontalBox2.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
                }
                height = horizontalBox2.getHeight() - teXFont.getSupDrop(teXEnvironmentSupStyle.getStyle());
                depth2 = horizontalBox2.getDepth() + teXFont.getSubDrop(teXEnvironmentSubStyle.getStyle());
            } else if (atom6 instanceof CharSymbol) {
                CharFont charFont = ((CharSymbol) atom6).getCharFont(teXFont);
                italic = (((CharSymbol) this.base).isMarkedAsTextSymbol() && teXFont.hasSpace(charFont.fontId)) ? 0.0f : teXFont.getChar(charFont, style).getItalic();
                if (italic > 1.0E-7f && this.subscript == null) {
                    horizontalBox2.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
                    italic = 0.0f;
                }
                height = 0.0f;
                depth2 = 0.0f;
            } else {
                height = strutBox.getHeight() - teXFont.getSupDrop(teXEnvironmentSupStyle.getStyle());
                depth = strutBox.getDepth();
                subDrop = teXFont.getSubDrop(teXEnvironmentSubStyle.getStyle());
            }
            atom = this.superscript;
            if (atom == null) {
                Box boxCreateBox2 = this.subscript.createBox(teXEnvironmentSubStyle);
                boxCreateBox2.setShift(Math.max(Math.max(depth2, teXFont.getSub1(style)), boxCreateBox2.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
                horizontalBox2.add(boxCreateBox2);
                horizontalBox2.add(strutBox2);
                return horizontalBox2;
            }
            boxCreateBox = atom.createBox(teXEnvironmentSupStyle);
            width = boxCreateBox.getWidth();
            atom2 = this.subscript;
            if (atom2 != null && this.align == 1) {
                width = Math.max(width, atom2.createBox(teXEnvironmentSubStyle).getWidth());
            }
            horizontalBox = new HorizontalBox(boxCreateBox, width, this.align);
            spaceAtom = SCRIPT_SPACE;
            horizontalBox.add(spaceAtom.createBox(teXEnvironment));
            if (style == 0) {
                sup2 = teXFont.getSup1(style);
            } else if (teXEnvironment.crampStyle().getStyle() == style) {
                sup2 = teXFont.getSup3(style);
            } else {
                sup2 = teXFont.getSup2(style);
            }
            fMax = Math.max(Math.max(height, sup2), (Math.abs(teXFont.getXHeight(style, lastFontId)) / 4.0f) + boxCreateBox.getDepth());
            atom3 = this.subscript;
            if (atom3 == null) {
                horizontalBox.setShift(-fMax);
                horizontalBox2.add(horizontalBox);
            } else {
                Box boxCreateBox3 = atom3.createBox(teXEnvironmentSubStyle);
                HorizontalBox horizontalBox3 = new HorizontalBox(boxCreateBox3, width, this.align);
                horizontalBox3.add(spaceAtom.createBox(teXEnvironment));
                fMax2 = Math.max(depth2, teXFont.getSub2(style));
                float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
                depth3 = ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox3.getHeight();
                f = defaultRuleThickness * 4.0f;
                if (depth3 < f) {
                    fMax += f - depth3;
                    fAbs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (fMax - boxCreateBox.getDepth());
                    if (fAbs > 0.0f) {
                        fMax += fAbs;
                        fMax2 -= fAbs;
                    }
                }
                VerticalBox verticalBox = new VerticalBox();
                horizontalBox.setShift(italic);
                verticalBox.add(horizontalBox);
                verticalBox.add(new StrutBox(0.0f, ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox3.getHeight(), 0.0f, 0.0f));
                verticalBox.add(horizontalBox3);
                verticalBox.setHeight(boxCreateBox.getHeight() + fMax);
                verticalBox.setDepth(boxCreateBox3.getDepth() + fMax2);
                horizontalBox2.add(verticalBox);
            }
            horizontalBox2.add(strutBox2);
            return horizontalBox2;
        }
        Box boxCreateBox4 = ((AccentedAtom) atom6).base.createBox(teXEnvironment.crampStyle());
        height = boxCreateBox4.getHeight() - teXFont.getSupDrop(teXEnvironmentSupStyle.getStyle());
        depth = boxCreateBox4.getDepth();
        subDrop = teXFont.getSubDrop(teXEnvironmentSubStyle.getStyle());
        depth2 = subDrop + depth;
        italic = 0.0f;
        atom = this.superscript;
        if (atom == null) {
            Box boxCreateBox5 = this.subscript.createBox(teXEnvironmentSubStyle);
            boxCreateBox5.setShift(Math.max(Math.max(depth2, teXFont.getSub1(style)), boxCreateBox5.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
            horizontalBox2.add(boxCreateBox5);
            horizontalBox2.add(strutBox2);
            return horizontalBox2;
        }
        boxCreateBox = atom.createBox(teXEnvironmentSupStyle);
        width = boxCreateBox.getWidth();
        atom2 = this.subscript;
        if (atom2 != null) {
            width = Math.max(width, atom2.createBox(teXEnvironmentSubStyle).getWidth());
        }
        horizontalBox = new HorizontalBox(boxCreateBox, width, this.align);
        spaceAtom = SCRIPT_SPACE;
        horizontalBox.add(spaceAtom.createBox(teXEnvironment));
        if (style == 0) {
            sup2 = teXFont.getSup1(style);
        } else if (teXEnvironment.crampStyle().getStyle() == style) {
            sup2 = teXFont.getSup3(style);
        } else {
            sup2 = teXFont.getSup2(style);
        }
        fMax = Math.max(Math.max(height, sup2), (Math.abs(teXFont.getXHeight(style, lastFontId)) / 4.0f) + boxCreateBox.getDepth());
        atom3 = this.subscript;
        if (atom3 == null) {
            horizontalBox.setShift(-fMax);
            horizontalBox2.add(horizontalBox);
        } else {
            Box boxCreateBox6 = atom3.createBox(teXEnvironmentSubStyle);
            HorizontalBox horizontalBox4 = new HorizontalBox(boxCreateBox6, width, this.align);
            horizontalBox4.add(spaceAtom.createBox(teXEnvironment));
            fMax2 = Math.max(depth2, teXFont.getSub2(style));
            float defaultRuleThickness2 = teXFont.getDefaultRuleThickness(style);
            depth3 = ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox6.getHeight();
            f = defaultRuleThickness2 * 4.0f;
            if (depth3 < f) {
                fMax += f - depth3;
                fAbs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (fMax - boxCreateBox.getDepth());
                if (fAbs > 0.0f) {
                    fMax += fAbs;
                    fMax2 -= fAbs;
                }
            }
            VerticalBox verticalBox2 = new VerticalBox();
            horizontalBox.setShift(italic);
            verticalBox2.add(horizontalBox);
            verticalBox2.add(new StrutBox(0.0f, ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox6.getHeight(), 0.0f, 0.0f));
            verticalBox2.add(horizontalBox4);
            verticalBox2.setHeight(boxCreateBox.getHeight() + fMax);
            verticalBox2.setDepth(boxCreateBox6.getDepth() + fMax2);
            horizontalBox2.add(verticalBox2);
        }
        horizontalBox2.add(strutBox2);
        return horizontalBox2;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return this.base.getRightType();
    }
}
