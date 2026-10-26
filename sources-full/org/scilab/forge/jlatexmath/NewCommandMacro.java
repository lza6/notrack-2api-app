package org.scilab.forge.jlatexmath;

import defpackage.fq2;
import defpackage.j93;
import java.util.HashMap;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public class NewCommandMacro {
    protected static HashMap<String, String> macrocode = new HashMap<>();
    protected static HashMap<String, String> macroreplacement = new HashMap<>();

    public static void addNewCommand(String str, String str2, int i) {
        macrocode.put(str, str2);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i));
    }

    public static void addNewCommand(String str, String str2, int i, String str3) {
        if (macrocode.get(str) != null) {
            j93.j(fq2.n("Command ", str, " already exists ! Use renewcommand instead ..."));
            return;
        }
        macrocode.put(str, str2);
        macroreplacement.put(str, str3);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i, 1.0f));
    }

    public static void addReNewCommand(String str, String str2, int i) {
        if (macrocode.get(str) == null) {
            j93.j(fq2.n("Command ", str, " is not defined ! Use newcommand instead ..."));
        } else {
            macrocode.put(str, str2);
            MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i));
        }
    }

    public static boolean isMacro(String str) {
        return macrocode.containsKey(str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[LOOP:0: B:9:0x003e->B:10:0x0040, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x0040, please report this as an issue */
    public String executeMacro(TeXParser teXParser, String[] strArr) {
        int i = 0;
        String strReplaceAll = macrocode.get(strArr[0]);
        int length = strArr.length;
        int i2 = length - 11;
        String str = strArr[length - 10];
        if (str == null) {
            if (macroreplacement.get(strArr[0]) != null) {
                strReplaceAll = strReplaceAll.replaceAll("#1", Matcher.quoteReplacement(macroreplacement.get(strArr[0])));
            }
            for (int i3 = 1; i3 <= i2; i3++) {
                strReplaceAll = strReplaceAll.replaceAll("#" + (i3 + i), Matcher.quoteReplacement(strArr[i3]));
            }
            return strReplaceAll;
        }
        strReplaceAll = strReplaceAll.replaceAll("#1", Matcher.quoteReplacement(str));
        i = 1;
        while (i3 <= i2) {
            strReplaceAll = strReplaceAll.replaceAll("#" + (i3 + i), Matcher.quoteReplacement(strArr[i3]));
        }
        return strReplaceAll;
    }
}
