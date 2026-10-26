package androidx.compose.ui.autofill;

import defpackage.ha;
import defpackage.xr0;

/* JADX INFO: loaded from: classes.dex */
public final class ContentType$Companion {
    static final /* synthetic */ ContentType$Companion $$INSTANCE = new ContentType$Companion();
    private static final ha Password;

    static {
        xr0.D("username");
        Password = xr0.D("password");
        xr0.D("emailAddress");
        xr0.D("newUsername");
        xr0.D("newPassword");
        xr0.D("postalAddress");
        xr0.D("postalCode");
        xr0.D("creditCardNumber");
        xr0.D("creditCardSecurityCode");
        xr0.D("creditCardExpirationDate");
        xr0.D("creditCardExpirationMonth");
        xr0.D("creditCardExpirationYear");
        xr0.D("creditCardExpirationDay");
        xr0.D("addressCountry");
        xr0.D("addressRegion");
        xr0.D("addressLocality");
        xr0.D("streetAddress");
        xr0.D("extendedAddress");
        xr0.D("extendedPostalCode");
        xr0.D("personName");
        xr0.D("personGivenName");
        xr0.D("personFamilyName");
        xr0.D("personMiddleName");
        xr0.D("personMiddleInitial");
        xr0.D("personNamePrefix");
        xr0.D("personNameSuffix");
        xr0.D("phoneNumber");
        xr0.D("phoneNumberDevice");
        xr0.D("phoneCountryCode");
        xr0.D("phoneNational");
        xr0.D("gender");
        xr0.D("birthDateFull");
        xr0.D("birthDateDay");
        xr0.D("birthDateMonth");
        xr0.D("birthDateYear");
        xr0.D("smsOTPCode");
    }

    public static ha getPassword() {
        return Password;
    }
}
