package androidx.compose.ui.platform;

import android.graphics.Rect;
import defpackage.h43;
import defpackage.kr1;
import defpackage.ms0;
import defpackage.pg2;
import defpackage.u53;
import defpackage.xy3;
import defpackage.ze3;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment = new int[2];
        protected String text;

        public final int[] getRange(int i, int i2) {
            if (i < 0 || i2 < 0 || i == i2) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }

        public final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            kr1.n0("text");
            throw null;
        }

        public void initialize(String str) {
            setText(str);
        }

        public final void setText(String str) {
            this.text = str;
        }
    }

    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ms0 ms0Var) {
                this();
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                characterTextSegmentIterator.getClass();
                return characterTextSegmentIterator;
            }
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, ms0 ms0Var) {
            this(locale);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int length = getText().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kr1.n0("impl");
                    throw null;
                }
                boolean zIsBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.impl;
                if (zIsBoundary) {
                    if (breakIterator2 == null) {
                        kr1.n0("impl");
                        throw null;
                    }
                    int iFollowing = breakIterator2.following(i);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return getRange(i, iFollowing);
                }
                if (breakIterator2 == null) {
                    kr1.n0("impl");
                    throw null;
                }
                i = breakIterator2.following(i);
            } while (i != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                kr1.n0("impl");
                throw null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kr1.n0("impl");
                    throw null;
                }
                boolean zIsBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.impl;
                if (zIsBoundary) {
                    if (breakIterator2 == null) {
                        kr1.n0("impl");
                        throw null;
                    }
                    int iPreceding = breakIterator2.preceding(i);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return getRange(iPreceding, i);
                }
                if (breakIterator2 == null) {
                    kr1.n0("impl");
                    throw null;
                }
                i = breakIterator2.preceding(i);
            } while (i != -1);
            return null;
        }
    }

    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        private static LineTextSegmentIterator lineInstance;
        private xy3 layoutResult;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final u53 DirectionStart = u53.d;
        private static final u53 DirectionEnd = u53.c;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ms0 ms0Var) {
                this();
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                lineTextSegmentIterator.getClass();
                return lineTextSegmentIterator;
            }
        }

        private LineTextSegmentIterator() {
        }

        public /* synthetic */ LineTextSegmentIterator(ms0 ms0Var) {
            this();
        }

        private final int getLineEdgeIndex(int i, u53 u53Var) {
            xy3 xy3Var = this.layoutResult;
            if (xy3Var == null) {
                kr1.n0("layoutResult");
                throw null;
            }
            int iG = xy3Var.g(i);
            xy3 xy3Var2 = this.layoutResult;
            if (xy3Var2 == null) {
                kr1.n0("layoutResult");
                throw null;
            }
            u53 u53VarH = xy3Var2.h(iG);
            xy3 xy3Var3 = this.layoutResult;
            if (u53Var != u53VarH) {
                if (xy3Var3 != null) {
                    return xy3Var3.g(i);
                }
                kr1.n0("layoutResult");
                throw null;
            }
            if (xy3Var3 != null) {
                return xy3Var3.b.c(i, false) - 1;
            }
            kr1.n0("layoutResult");
            throw null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int iD;
            if (getText().length() > 0 && i < getText().length()) {
                xy3 xy3Var = this.layoutResult;
                if (i < 0) {
                    if (xy3Var == null) {
                        kr1.n0("layoutResult");
                        throw null;
                    }
                    iD = xy3Var.b.d(0);
                } else {
                    if (xy3Var == null) {
                        kr1.n0("layoutResult");
                        throw null;
                    }
                    int iD2 = xy3Var.b.d(i);
                    iD = getLineEdgeIndex(iD2, DirectionStart) == i ? iD2 : iD2 + 1;
                }
                xy3 xy3Var2 = this.layoutResult;
                if (xy3Var2 == null) {
                    kr1.n0("layoutResult");
                    throw null;
                }
                if (iD < xy3Var2.b.f) {
                    return getRange(getLineEdgeIndex(iD, DirectionStart), getLineEdgeIndex(iD, DirectionEnd) + 1);
                }
            }
            return null;
        }

        public final void initialize(String str, xy3 xy3Var) {
            setText(str);
            this.layoutResult = xy3Var;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int iD;
            if (getText().length() > 0 && i > 0) {
                int length = getText().length();
                xy3 xy3Var = this.layoutResult;
                if (i > length) {
                    if (xy3Var == null) {
                        kr1.n0("layoutResult");
                        throw null;
                    }
                    iD = xy3Var.b.d(getText().length());
                } else {
                    if (xy3Var == null) {
                        kr1.n0("layoutResult");
                        throw null;
                    }
                    int iD2 = xy3Var.b.d(i);
                    iD = getLineEdgeIndex(iD2, DirectionEnd) + 1 == i ? iD2 : iD2 - 1;
                }
                if (iD >= 0) {
                    return getRange(getLineEdgeIndex(iD, DirectionStart), getLineEdgeIndex(iD, DirectionEnd) + 1);
                }
            }
            return null;
        }
    }

    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        private static PageTextSegmentIterator pageInstance;
        private xy3 layoutResult;
        private ze3 node;
        private Rect tempRect;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final u53 DirectionStart = u53.d;
        private static final u53 DirectionEnd = u53.c;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ms0 ms0Var) {
                this();
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                pageTextSegmentIterator.getClass();
                return pageTextSegmentIterator;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        public /* synthetic */ PageTextSegmentIterator(ms0 ms0Var) {
            this();
        }

        private final int getLineEdgeIndex(int i, u53 u53Var) {
            xy3 xy3Var = this.layoutResult;
            if (xy3Var == null) {
                kr1.n0("layoutResult");
                throw null;
            }
            int iG = xy3Var.g(i);
            xy3 xy3Var2 = this.layoutResult;
            if (xy3Var2 == null) {
                kr1.n0("layoutResult");
                throw null;
            }
            u53 u53VarH = xy3Var2.h(iG);
            xy3 xy3Var3 = this.layoutResult;
            if (u53Var != u53VarH) {
                if (xy3Var3 != null) {
                    return xy3Var3.g(i);
                }
                kr1.n0("layoutResult");
                throw null;
            }
            if (xy3Var3 != null) {
                return xy3Var3.b.c(i, false) - 1;
            }
            kr1.n0("layoutResult");
            throw null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int iE;
            if (getText().length() > 0 && i < getText().length()) {
                try {
                    ze3 ze3Var = this.node;
                    if (ze3Var == null) {
                        kr1.n0("node");
                        throw null;
                    }
                    h43 h43VarE = ze3Var.e();
                    int iRound = Math.round(h43VarE.d - h43VarE.b);
                    if (i <= 0) {
                        i = 0;
                    }
                    xy3 xy3Var = this.layoutResult;
                    if (xy3Var == null) {
                        kr1.n0("layoutResult");
                        throw null;
                    }
                    int iD = xy3Var.b.d(i);
                    xy3 xy3Var2 = this.layoutResult;
                    if (xy3Var2 == null) {
                        kr1.n0("layoutResult");
                        throw null;
                    }
                    float f = xy3Var2.b.f(iD) + iRound;
                    xy3 xy3Var3 = this.layoutResult;
                    if (xy3Var3 == null) {
                        kr1.n0("layoutResult");
                        throw null;
                    }
                    pg2 pg2Var = xy3Var3.b;
                    float f2 = pg2Var.f(pg2Var.f - 1);
                    xy3 xy3Var4 = this.layoutResult;
                    if (f < f2) {
                        if (xy3Var4 == null) {
                            kr1.n0("layoutResult");
                            throw null;
                        }
                        iE = xy3Var4.b.e(f);
                    } else {
                        if (xy3Var4 == null) {
                            kr1.n0("layoutResult");
                            throw null;
                        }
                        iE = xy3Var4.b.f;
                    }
                    return getRange(i, getLineEdgeIndex(iE - 1, DirectionEnd) + 1);
                } catch (IllegalStateException unused) {
                }
            }
            return null;
        }

        public final void initialize(String str, xy3 xy3Var, ze3 ze3Var) {
            setText(str);
            this.layoutResult = xy3Var;
            this.node = ze3Var;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int iE;
            if (getText().length() > 0 && i > 0) {
                try {
                    ze3 ze3Var = this.node;
                    if (ze3Var == null) {
                        kr1.n0("node");
                        throw null;
                    }
                    h43 h43VarE = ze3Var.e();
                    int iRound = Math.round(h43VarE.d - h43VarE.b);
                    int length = getText().length();
                    if (length <= i) {
                        i = length;
                    }
                    xy3 xy3Var = this.layoutResult;
                    if (xy3Var == null) {
                        kr1.n0("layoutResult");
                        throw null;
                    }
                    int iD = xy3Var.b.d(i);
                    xy3 xy3Var2 = this.layoutResult;
                    if (xy3Var2 == null) {
                        kr1.n0("layoutResult");
                        throw null;
                    }
                    float f = xy3Var2.b.f(iD) - iRound;
                    if (f > 0.0f) {
                        xy3 xy3Var3 = this.layoutResult;
                        if (xy3Var3 == null) {
                            kr1.n0("layoutResult");
                            throw null;
                        }
                        iE = xy3Var3.b.e(f);
                    } else {
                        iE = 0;
                    }
                    if (i == getText().length() && iE < iD) {
                        iE++;
                    }
                    return getRange(getLineEdgeIndex(iE, DirectionStart), i);
                } catch (IllegalStateException unused) {
                }
            }
            return null;
        }
    }

    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static ParagraphTextSegmentIterator instance;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ms0 ms0Var) {
                this();
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                paragraphTextSegmentIterator.getClass();
                return paragraphTextSegmentIterator;
            }
        }

        private ParagraphTextSegmentIterator() {
        }

        public /* synthetic */ ParagraphTextSegmentIterator(ms0 ms0Var) {
            this();
        }

        private final boolean isEndBoundary(int i) {
            if (i <= 0 || getText().charAt(i - 1) == '\n') {
                return false;
            }
            return i == getText().length() || getText().charAt(i) == '\n';
        }

        private final boolean isStartBoundary(int i) {
            if (getText().charAt(i) != '\n') {
                return i == 0 || getText().charAt(i - 1) == '\n';
            }
            return false;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int length = getText().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (i < length && getText().charAt(i) == '\n' && !isStartBoundary(i)) {
                i++;
            }
            if (i >= length) {
                return null;
            }
            int i2 = i + 1;
            while (i2 < length && !isEndBoundary(i2)) {
                i2++;
            }
            return getRange(i, i2);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && getText().charAt(i - 1) == '\n' && !isEndBoundary(i)) {
                i--;
            }
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            while (i2 > 0 && !isStartBoundary(i2)) {
                i2--;
            }
            return getRange(i2, i);
        }
    }

    public interface TextSegmentIterator {
        int[] following(int i);

        int[] preceding(int i);
    }

    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ms0 ms0Var) {
                this();
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                wordTextSegmentIterator.getClass();
                return wordTextSegmentIterator;
            }
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, ms0 ms0Var) {
            this(locale);
        }

        private final boolean isEndBoundary(int i) {
            if (i <= 0 || !isLetterOrDigit(i - 1)) {
                return false;
            }
            return i == getText().length() || !isLetterOrDigit(i);
        }

        private final boolean isLetterOrDigit(int i) {
            if (i < 0 || i >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i));
        }

        private final boolean isStartBoundary(int i) {
            if (isLetterOrDigit(i)) {
                return i == 0 || !isLetterOrDigit(i - 1);
            }
            return false;
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (!isLetterOrDigit(i) && !isStartBoundary(i)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kr1.n0("impl");
                    throw null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kr1.n0("impl");
                throw null;
            }
            int iFollowing = breakIterator2.following(i);
            if (iFollowing == -1 || !isEndBoundary(iFollowing)) {
                return null;
            }
            return getRange(i, iFollowing);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                kr1.n0("impl");
                throw null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && !isLetterOrDigit(i - 1) && !isEndBoundary(i)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kr1.n0("impl");
                    throw null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kr1.n0("impl");
                throw null;
            }
            int iPreceding = breakIterator2.preceding(i);
            if (iPreceding == -1 || !isStartBoundary(iPreceding)) {
                return null;
            }
            return getRange(iPreceding, i);
        }
    }
}
