package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class ParseException extends JMathTeXException {
    private static final long serialVersionUID = -3498558910250213782L;

    public ParseException(String str) {
        super(str);
    }

    public ParseException(String str, Throwable th) {
        super(str, th);
    }
}
