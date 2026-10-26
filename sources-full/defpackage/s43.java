package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s43 {
    public static String a(ue1 ue1Var) {
        String string = ue1Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
