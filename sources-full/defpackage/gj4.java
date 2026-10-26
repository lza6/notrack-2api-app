package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gj4[], still in use, count: 1, list:
  (r0v1 gj4[]) from 0x0038: CONSTRUCTOR (r0v1 gj4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: p41.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class gj4 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public static final /* synthetic */ p41 p;
    public final char c;
    public final char d;

    static {
        p = new p41(gj4VarArr);
    }

    public gj4(char c, char c2) {
        super(str, i);
        this.c = c;
        this.d = c2;
    }

    public static gj4 valueOf(String str) {
        return (gj4) Enum.valueOf(gj4.class, str);
    }

    public static gj4[] values() {
        return (gj4[]) o.clone();
    }
}
