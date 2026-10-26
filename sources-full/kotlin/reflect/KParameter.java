package kotlin.reflect;

import app.template.extension.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "index", BuildConfig.VERSION_NAME, "getIndex", "()I", "name", BuildConfig.VERSION_NAME, "getName", "()Ljava/lang/String;", TeXSymbolParser.TYPE_ATTR, "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "kind", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "isOptional", BuildConfig.VERSION_NAME, "()Z", "isVararg", "isVararg$annotations", "()V", "Kind", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface KParameter extends KAnnotatedElement {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void isVararg$annotations() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/KParameter$Kind;", BuildConfig.VERSION_NAME, "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "CONTEXT", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Kind {
        INSTANCE,
        CONTEXT,
        EXTENSION_RECEIVER,
        VALUE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<Kind> getEntries() {
            return $ENTRIES;
        }
    }

    int getIndex();

    Kind getKind();

    String getName();

    KType getType();

    boolean isOptional();

    boolean isVararg();
}
