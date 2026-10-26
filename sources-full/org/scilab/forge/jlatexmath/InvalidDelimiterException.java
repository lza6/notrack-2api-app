package org.scilab.forge.jlatexmath;

import defpackage.fq2;

/* JADX INFO: loaded from: classes.dex */
public class InvalidDelimiterException extends JMathTeXException {
    private static final long serialVersionUID = 212553180078002724L;

    public InvalidDelimiterException(char c, String str) {
        super("The character '" + c + "' is mapped to a symbol with the name '" + str + "', but that symbol is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!");
    }

    public InvalidDelimiterException(String str) {
        super(fq2.n("The symbol with the name '", str, "' is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!"));
    }
}
