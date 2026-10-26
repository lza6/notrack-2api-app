package notrack.ai.data.account;

import defpackage.do3;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class AccountEnvelope {
    public static final Companion Companion = new Companion();
    private final AccountSummary account;
    private final String code;
    private final boolean created;
    private final Entitlements entitlements;
    private final String error;
    private final String message;
    private final String nickname;
    private final boolean ok;
    private final String recoveryCode;
    private final String suggestion;

    public final class Companion {
        public final qu1 serializer() {
            return AccountEnvelope$$serializer.INSTANCE;
        }
    }

    public AccountEnvelope(int i, boolean z, Entitlements entitlements, AccountSummary accountSummary, String str, String str2, String str3, String str4, String str5, String str6, boolean z2) {
        if ((i & 1) == 0) {
            this.ok = false;
        } else {
            this.ok = z;
        }
        if ((i & 2) == 0) {
            Entitlements.Companion.getClass();
            this.entitlements = Entitlements.ANONYMOUS;
        } else {
            this.entitlements = entitlements;
        }
        if ((i & 4) == 0) {
            this.account = null;
        } else {
            this.account = accountSummary;
        }
        if ((i & 8) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str;
        }
        if ((i & 16) == 0) {
            this.code = null;
        } else {
            this.code = str2;
        }
        if ((i & 32) == 0) {
            this.error = null;
        } else {
            this.error = str3;
        }
        if ((i & 64) == 0) {
            this.message = null;
        } else {
            this.message = str4;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.recoveryCode = null;
        } else {
            this.recoveryCode = str5;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.suggestion = null;
        } else {
            this.suggestion = str6;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.created = false;
        } else {
            this.created = z2;
        }
    }

    public AccountEnvelope(boolean z, Entitlements entitlements, AccountSummary accountSummary, String str, String str2, String str3, String str4, String str5, String str6, boolean z2) {
        entitlements.getClass();
        this.ok = z;
        this.entitlements = entitlements;
        this.account = accountSummary;
        this.nickname = str;
        this.code = str2;
        this.error = str3;
        this.message = str4;
        this.recoveryCode = str5;
        this.suggestion = str6;
        this.created = z2;
    }

    public static AccountEnvelope copy$default(AccountEnvelope accountEnvelope, Entitlements entitlements) {
        return new AccountEnvelope(accountEnvelope.ok, entitlements, accountEnvelope.account, accountEnvelope.nickname, accountEnvelope.code, accountEnvelope.error, accountEnvelope.message, accountEnvelope.recoveryCode, accountEnvelope.suggestion, accountEnvelope.created);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    public static final void write$Self$app_playRelease(AccountEnvelope accountEnvelope, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || accountEnvelope.ok) {
            do3Var.c(tf3Var, 0, accountEnvelope.ok);
        }
        if (do3Var.w(tf3Var)) {
            do3Var.q(tf3Var, 1, Entitlements$$serializer.INSTANCE, accountEnvelope.entitlements);
        } else {
            Entitlements entitlements = accountEnvelope.entitlements;
            Entitlements.Companion.getClass();
            if (!kr1.n(entitlements, Entitlements.ANONYMOUS)) {
                do3Var.q(tf3Var, 1, Entitlements$$serializer.INSTANCE, accountEnvelope.entitlements);
            }
        }
        if (do3Var.w(tf3Var) || accountEnvelope.account != null) {
            do3Var.p(tf3Var, 2, AccountSummary$$serializer.INSTANCE, accountEnvelope.account);
        }
        if (do3Var.w(tf3Var) || accountEnvelope.nickname != null) {
            do3Var.p(tf3Var, 3, lo3.a, accountEnvelope.nickname);
        }
        if (do3Var.w(tf3Var) || accountEnvelope.code != null) {
            do3Var.p(tf3Var, 4, lo3.a, accountEnvelope.code);
        }
        if (do3Var.w(tf3Var) || accountEnvelope.error != null) {
            do3Var.p(tf3Var, 5, lo3.a, accountEnvelope.error);
        }
        if (do3Var.w(tf3Var) || accountEnvelope.message != null) {
            do3Var.p(tf3Var, 6, lo3.a, accountEnvelope.message);
        }
        if (do3Var.w(tf3Var) || accountEnvelope.recoveryCode != null) {
            do3Var.p(tf3Var, 7, lo3.a, accountEnvelope.recoveryCode);
        }
        if (do3Var.w(tf3Var) || accountEnvelope.suggestion != null) {
            do3Var.p(tf3Var, 8, lo3.a, accountEnvelope.suggestion);
        }
        if (do3Var.w(tf3Var) || accountEnvelope.created) {
            do3Var.c(tf3Var, 9, accountEnvelope.created);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountEnvelope)) {
            return false;
        }
        AccountEnvelope accountEnvelope = (AccountEnvelope) obj;
        return this.ok == accountEnvelope.ok && kr1.n(this.entitlements, accountEnvelope.entitlements) && kr1.n(this.account, accountEnvelope.account) && kr1.n(this.nickname, accountEnvelope.nickname) && kr1.n(this.code, accountEnvelope.code) && kr1.n(this.error, accountEnvelope.error) && kr1.n(this.message, accountEnvelope.message) && kr1.n(this.recoveryCode, accountEnvelope.recoveryCode) && kr1.n(this.suggestion, accountEnvelope.suggestion) && this.created == accountEnvelope.created;
    }

    public final AccountSummary getAccount() {
        return this.account;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getCreated() {
        return this.created;
    }

    public final Entitlements getEntitlements() {
        return this.entitlements;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final String getRecoveryCode() {
        return this.recoveryCode;
    }

    public final String getSuggestion() {
        return this.suggestion;
    }

    public final int hashCode() {
        int iHashCode = (this.entitlements.hashCode() + (Boolean.hashCode(this.ok) * 31)) * 31;
        AccountSummary accountSummary = this.account;
        int iHashCode2 = (iHashCode + (accountSummary == null ? 0 : accountSummary.hashCode())) * 31;
        String str = this.nickname;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.recoveryCode;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.suggestion;
        return Boolean.hashCode(this.created) + ((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountEnvelope(ok=");
        sb.append(this.ok);
        sb.append(", entitlements=");
        sb.append(this.entitlements);
        sb.append(", account=");
        sb.append(this.account);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", code=");
        ud2.v(sb, this.code, ", error=", this.error, ", message=");
        ud2.v(sb, this.message, ", recoveryCode=", this.recoveryCode, ", suggestion=");
        sb.append(this.suggestion);
        sb.append(", created=");
        sb.append(this.created);
        sb.append(")");
        return sb.toString();
    }
}
