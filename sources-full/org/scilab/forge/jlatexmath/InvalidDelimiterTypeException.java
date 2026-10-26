package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class InvalidDelimiterTypeException extends JMathTeXException {
    private static final long serialVersionUID = -7170484583239756156L;

    public InvalidDelimiterTypeException() {
        super("The delimiter type was not valid! Use one of the delimiter type constants from the class 'TeXConstants'.");
    }
}
