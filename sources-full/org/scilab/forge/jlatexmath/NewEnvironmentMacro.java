package org.scilab.forge.jlatexmath;

import defpackage.fq2;
import defpackage.j93;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i) {
        String strP = ud2.p(str, "@env");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        NewCommandMacro.addNewCommand(strP, sb.toString(), i2);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            j93.j(fq2.n("Environment ", str, "is not defined ! Use newenvironment instead ..."));
            return;
        }
        String strP = ud2.p(str, "@env");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        NewCommandMacro.addReNewCommand(strP, sb.toString(), i2);
    }
}
