package org.scilab.forge.jlatexmath;

import defpackage.fq2;

/* JADX INFO: loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(fq2.n("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
