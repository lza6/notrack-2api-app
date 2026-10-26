package androidx.compose.ui.platform;

import defpackage.e31;
import defpackage.pf3;

/* JADX INFO: loaded from: classes.dex */
public interface InspectableValue {

    public static final class DefaultImpls {
        @Deprecated
        public static pf3 getInspectableElements(InspectableValue inspectableValue) {
            return InspectableValue.super.getInspectableElements();
        }

        @Deprecated
        public static String getNameFallback(InspectableValue inspectableValue) {
            return InspectableValue.super.getNameFallback();
        }

        @Deprecated
        public static Object getValueOverride(InspectableValue inspectableValue) {
            return InspectableValue.super.getValueOverride();
        }
    }

    default pf3 getInspectableElements() {
        return e31.a;
    }

    default String getNameFallback() {
        return null;
    }

    default Object getValueOverride() {
        return null;
    }
}
