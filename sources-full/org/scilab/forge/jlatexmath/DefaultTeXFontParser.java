package org.scilab.forge.jlatexmath;

import app.template.extension.BuildConfig;
import defpackage.fq2;
import defpackage.u41;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.awt.Font;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTeXFontParser {
    public static final String GEN_SET_EL = "GeneralSettings";
    public static final String MUFONTID_ATTR = "mufontid";
    public static final String RESOURCE_NAME = "DefaultTeXFont.xml";
    public static final String SPACEFONTID_ATTR = "spacefontid";
    public static final String STYLE_MAPPING_EL = "TextStyleMapping";
    public static final String SYMBOL_MAPPING_EL = "SymbolMapping";
    private static boolean registerFontExceptionDisplayed = false;
    private static boolean shouldRegisterFonts = true;
    private Object base;
    private Map<String, CharFont[]> parsedTextStyles;
    private Element root;
    private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    protected static ArrayList<String> Font_ID = new ArrayList<>();
    private static Map<String, Integer> rangeTypeMappings = new HashMap();
    private static Map<String, CharChildParser> charChildParsers = new HashMap();

    public interface CharChildParser {
        void parse(Element element, char c, FontInfo fontInfo);
    }

    public static class ExtensionParser implements CharChildParser {
        @Override // org.scilab.forge.jlatexmath.DefaultTeXFontParser.CharChildParser
        public void parse(Element element, char c, FontInfo fontInfo) {
            fontInfo.setExtension(c, new int[]{DefaultTeXFontParser.getOptionalInt("top", element, -1), DefaultTeXFontParser.getOptionalInt("mid", element, -1), DefaultTeXFontParser.getIntAndCheck("rep", element), DefaultTeXFontParser.getOptionalInt("bot", element, -1)});
        }
    }

    public static class KernParser implements CharChildParser {
        @Override // org.scilab.forge.jlatexmath.DefaultTeXFontParser.CharChildParser
        public void parse(Element element, char c, FontInfo fontInfo) {
            fontInfo.addKern(c, (char) DefaultTeXFontParser.getIntAndCheck("code", element), DefaultTeXFontParser.getFloatAndCheck("val", element));
        }
    }

    public static class LigParser implements CharChildParser {
        @Override // org.scilab.forge.jlatexmath.DefaultTeXFontParser.CharChildParser
        public void parse(Element element, char c, FontInfo fontInfo) {
            fontInfo.addLigature(c, (char) DefaultTeXFontParser.getIntAndCheck("code", element), (char) DefaultTeXFontParser.getIntAndCheck("ligCode", element));
        }
    }

    public static class NextLargerParser implements CharChildParser {
        @Override // org.scilab.forge.jlatexmath.DefaultTeXFontParser.CharChildParser
        public void parse(Element element, char c, FontInfo fontInfo) {
            fontInfo.setNextLarger(c, (char) DefaultTeXFontParser.getIntAndCheck("code", element), DefaultTeXFontParser.Font_ID.indexOf(DefaultTeXFontParser.getAttrValueAndCheckIfNotNull("fontId", element)));
        }
    }

    static {
        setRangeTypeMappings();
        setCharChildParsers();
    }

    public DefaultTeXFontParser() {
        this(JLatexMathAndroid.getResourceAsStream(RESOURCE_NAME), RESOURCE_NAME);
    }

    public DefaultTeXFontParser(InputStream inputStream, String str) {
        this.base = null;
        factory.setIgnoringElementContentWhitespace(true);
        factory.setIgnoringComments(true);
        try {
            this.root = factory.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e) {
            throw new XMLResourceParseException(str, e);
        }
    }

    public DefaultTeXFontParser(Object obj, InputStream inputStream, String str) {
        this.base = obj;
        factory.setIgnoringElementContentWhitespace(true);
        factory.setIgnoringComments(true);
        try {
            this.root = factory.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e) {
            throw new XMLResourceParseException(str, e);
        }
    }

    public static Font createFont(String str) {
        return Font.createFont(JLatexMathAndroid.loadTypeface(str), TeXFormula.PIXELS_PER_POINT * TeXFormula.FONT_SCALE_FACTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (!attribute.equals(BuildConfig.VERSION_NAME)) {
            return attribute;
        }
        u41.o(RESOURCE_NAME, element.getTagName(), str, null);
        return null;
    }

    public static float getFloatAndCheck(String str, Element element) {
        try {
            return (float) Double.parseDouble(getAttrValueAndCheckIfNotNull(str, element));
        } catch (NumberFormatException unused) {
            u41.o(RESOURCE_NAME, element.getTagName(), str, "has an invalid real value!");
            return 0.0f;
        }
    }

    public static int getIntAndCheck(String str, Element element) {
        try {
            return Integer.parseInt(getAttrValueAndCheckIfNotNull(str, element));
        } catch (NumberFormatException unused) {
            u41.o(RESOURCE_NAME, element.getTagName(), str, "has an invalid integer value!");
            return 0;
        }
    }

    public static float getOptionalFloat(String str, Element element, float f) {
        String attribute = element.getAttribute(str);
        if (attribute.equals(BuildConfig.VERSION_NAME)) {
            return f;
        }
        try {
            return (float) Double.parseDouble(attribute);
        } catch (NumberFormatException unused) {
            u41.o(RESOURCE_NAME, element.getTagName(), str, "has an invalid float value!");
            return 0.0f;
        }
    }

    public static int getOptionalInt(String str, Element element, int i) {
        String attribute = element.getAttribute(str);
        if (attribute.equals(BuildConfig.VERSION_NAME)) {
            return i;
        }
        try {
            return Integer.parseInt(attribute);
        } catch (NumberFormatException unused) {
            u41.o(RESOURCE_NAME, element.getTagName(), str, "has an invalid integer value!");
            return 0;
        }
    }

    private Map<String, CharFont[]> parseStyleMappings() {
        String attrValueAndCheckIfNotNull;
        HashMap map = new HashMap();
        Element element = (Element) this.root.getElementsByTagName("TextStyleMappings").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName(STYLE_MAPPING_EL);
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element2 = (Element) elementsByTagName.item(i);
                String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("name", element2);
                try {
                    attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("bold", element2);
                } catch (ResourceParseException unused) {
                    attrValueAndCheckIfNotNull = null;
                }
                NodeList elementsByTagName2 = element2.getElementsByTagName("MapRange");
                CharFont[] charFontArr = new CharFont[4];
                for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                    Element element3 = (Element) elementsByTagName2.item(i2);
                    String attrValueAndCheckIfNotNull3 = getAttrValueAndCheckIfNotNull("fontId", element3);
                    int intAndCheck = getIntAndCheck("start", element3);
                    String attrValueAndCheckIfNotNull4 = getAttrValueAndCheckIfNotNull("code", element3);
                    Integer num = rangeTypeMappings.get(attrValueAndCheckIfNotNull4);
                    if (num == null) {
                        u41.o(RESOURCE_NAME, "MapRange", "code", fq2.n("contains an unknown \"range name\" '", attrValueAndCheckIfNotNull4, "'!"));
                        return null;
                    }
                    if (attrValueAndCheckIfNotNull == null) {
                        charFontArr[num.intValue()] = new CharFont((char) intAndCheck, Font_ID.indexOf(attrValueAndCheckIfNotNull3));
                    } else {
                        charFontArr[num.intValue()] = new CharFont((char) intAndCheck, Font_ID.indexOf(attrValueAndCheckIfNotNull3), Font_ID.indexOf(attrValueAndCheckIfNotNull));
                    }
                }
                map.put(attrValueAndCheckIfNotNull2, charFontArr);
            }
        }
        return map;
    }

    private static void processCharElement(Element element, FontInfo fontInfo) {
        char intAndCheck = (char) getIntAndCheck("code", element);
        fontInfo.setMetrics(intAndCheck, new float[]{getOptionalFloat("width", element, 0.0f), getOptionalFloat("height", element, 0.0f), getOptionalFloat("depth", element, 0.0f), getOptionalFloat("italic", element, 0.0f)});
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() != 3) {
                Element element2 = (Element) nodeItem;
                CharChildParser charChildParser = charChildParsers.get(element2.getTagName());
                if (charChildParser == null) {
                    throw new XMLResourceParseException("DefaultTeXFont.xml: a <Char>-element has an unknown child element '" + element2.getTagName() + "'!");
                }
                charChildParser.parse(element2, intAndCheck, fontInfo);
            }
        }
    }

    public static void registerFonts(boolean z) {
        shouldRegisterFonts = z;
    }

    private static void setCharChildParsers() {
        charChildParsers.put("Kern", new KernParser());
        charChildParsers.put("Lig", new LigParser());
        charChildParsers.put("NextLarger", new NextLargerParser());
        charChildParsers.put("Extension", new ExtensionParser());
    }

    private static void setRangeTypeMappings() {
        rangeTypeMappings.put("numbers", 0);
        rangeTypeMappings.put("capitals", 1);
        rangeTypeMappings.put("small", 2);
        rangeTypeMappings.put("unicode", 3);
    }

    public String[] parseDefaultTextStyleMappings() {
        String[] strArr = new String[4];
        Element element = (Element) this.root.getElementsByTagName("DefaultTextStyleMapping").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("MapStyle");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element2 = (Element) elementsByTagName.item(i);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("code", element2);
                Integer num = rangeTypeMappings.get(attrValueAndCheckIfNotNull);
                if (num == null) {
                    u41.o(RESOURCE_NAME, "MapStyle", "code", fq2.n("contains an unknown \"range name\" '", attrValueAndCheckIfNotNull, "'!"));
                    return null;
                }
                String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("textStyle", element2);
                if (this.parsedTextStyles.get(attrValueAndCheckIfNotNull2) == null) {
                    u41.o(RESOURCE_NAME, "MapStyle", "textStyle", fq2.n("contains an unknown text style '", attrValueAndCheckIfNotNull2, "'!"));
                    return null;
                }
                CharFont[] charFontArr = this.parsedTextStyles.get(attrValueAndCheckIfNotNull2);
                int iIntValue = num.intValue();
                if (charFontArr[iIntValue] == null) {
                    throw new XMLResourceParseException("DefaultTeXFont.xml: the default text style mapping '" + attrValueAndCheckIfNotNull2 + "' for the range '" + attrValueAndCheckIfNotNull + "' contains no mapping for that range!");
                }
                strArr[iIntValue] = attrValueAndCheckIfNotNull2;
            }
        }
        return strArr;
    }

    public void parseExtraPath() {
        Element element = (Element) this.root.getElementsByTagName("TeXSymbols").item(0);
        if (element != null) {
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("include", element);
            SymbolAtom.addSymbolAtom(JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull), attrValueAndCheckIfNotNull);
        }
        Element element2 = (Element) this.root.getElementsByTagName("FormulaSettings").item(0);
        if (element2 != null) {
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("include", element2);
            TeXFormula.addSymbolMappings(JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull2), attrValueAndCheckIfNotNull2);
        }
    }

    public FontInfo[] parseFontDescriptions(FontInfo[] fontInfoArr) {
        Element element = (Element) this.root.getElementsByTagName("FontDescriptions").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("Metrics");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("include", (Element) elementsByTagName.item(i));
                fontInfoArr = this.base == null ? parseFontDescriptions(fontInfoArr, JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull), attrValueAndCheckIfNotNull) : parseFontDescriptions(fontInfoArr, JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull), attrValueAndCheckIfNotNull);
            }
        }
        return fontInfoArr;
    }

    public FontInfo[] parseFontDescriptions(FontInfo[] fontInfoArr, InputStream inputStream, String str) {
        String attrValueAndCheckIfNotNull;
        String attrValueAndCheckIfNotNull2;
        String attrValueAndCheckIfNotNull3;
        String attrValueAndCheckIfNotNull4;
        if (inputStream == null) {
            return fontInfoArr;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(fontInfoArr));
        try {
            Element documentElement = factory.newDocumentBuilder().parse(inputStream).getDocumentElement();
            String attrValueAndCheckIfNotNull5 = getAttrValueAndCheckIfNotNull("name", documentElement);
            String attrValueAndCheckIfNotNull6 = getAttrValueAndCheckIfNotNull("id", documentElement);
            if (Font_ID.indexOf(attrValueAndCheckIfNotNull6) >= 0) {
                throw new FontAlreadyLoadedException(fq2.n("Font ", attrValueAndCheckIfNotNull6, " is already loaded !"));
            }
            Font_ID.add(attrValueAndCheckIfNotNull6);
            float floatAndCheck = getFloatAndCheck("space", documentElement);
            float floatAndCheck2 = getFloatAndCheck("xHeight", documentElement);
            float floatAndCheck3 = getFloatAndCheck("quad", documentElement);
            int optionalInt = getOptionalInt("skewChar", documentElement, -1);
            int optionalInt2 = getOptionalInt("unicode", documentElement, 0);
            String attrValueAndCheckIfNotNull7 = null;
            try {
                attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("boldVersion", documentElement);
            } catch (ResourceParseException unused) {
                attrValueAndCheckIfNotNull = null;
            }
            try {
                attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("romanVersion", documentElement);
            } catch (ResourceParseException unused2) {
                attrValueAndCheckIfNotNull2 = null;
            }
            try {
                attrValueAndCheckIfNotNull3 = getAttrValueAndCheckIfNotNull("ssVersion", documentElement);
            } catch (ResourceParseException unused3) {
                attrValueAndCheckIfNotNull3 = null;
            }
            try {
                attrValueAndCheckIfNotNull4 = getAttrValueAndCheckIfNotNull("ttVersion", documentElement);
            } catch (ResourceParseException unused4) {
                attrValueAndCheckIfNotNull4 = null;
            }
            try {
                attrValueAndCheckIfNotNull7 = getAttrValueAndCheckIfNotNull("itVersion", documentElement);
            } catch (ResourceParseException unused5) {
            }
            FontInfo fontInfo = new FontInfo(Font_ID.indexOf(attrValueAndCheckIfNotNull6), this.base, str.substring(0, str.lastIndexOf("/") + 1) + attrValueAndCheckIfNotNull5, attrValueAndCheckIfNotNull5, optionalInt2, floatAndCheck2, floatAndCheck, floatAndCheck3, attrValueAndCheckIfNotNull, attrValueAndCheckIfNotNull2, attrValueAndCheckIfNotNull3, attrValueAndCheckIfNotNull4, attrValueAndCheckIfNotNull7);
            if (optionalInt != -1) {
                fontInfo.setSkewChar((char) optionalInt);
            }
            NodeList elementsByTagName = documentElement.getElementsByTagName("Char");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                processCharElement((Element) elementsByTagName.item(i), fontInfo);
            }
            arrayList.add(fontInfo);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                FontInfo fontInfo2 = (FontInfo) arrayList.get(i2);
                fontInfo2.setBoldId(Font_ID.indexOf(fontInfo2.boldVersion));
                fontInfo2.setRomanId(Font_ID.indexOf(fontInfo2.romanVersion));
                fontInfo2.setSsId(Font_ID.indexOf(fontInfo2.ssVersion));
                fontInfo2.setTtId(Font_ID.indexOf(fontInfo2.ttVersion));
                fontInfo2.setItId(Font_ID.indexOf(fontInfo2.itVersion));
            }
            this.parsedTextStyles = parseStyleMappings();
            return (FontInfo[]) arrayList.toArray(fontInfoArr);
        } catch (Exception e) {
            StringBuilder sbS = fq2.s("Cannot find the file ", str, "!");
            sbS.append(e.toString());
            throw new XMLResourceParseException(sbS.toString());
        }
    }

    public Map<String, Number> parseGeneralSettings() {
        HashMap map = new HashMap();
        Element element = (Element) this.root.getElementsByTagName(GEN_SET_EL).item(0);
        if (element == null) {
            throw new XMLResourceParseException(RESOURCE_NAME, GEN_SET_EL);
        }
        map.put(MUFONTID_ATTR, Integer.valueOf(Font_ID.indexOf(getAttrValueAndCheckIfNotNull(MUFONTID_ATTR, element))));
        map.put(SPACEFONTID_ATTR, Integer.valueOf(Font_ID.indexOf(getAttrValueAndCheckIfNotNull(SPACEFONTID_ATTR, element))));
        map.put("scriptfactor", Float.valueOf(getFloatAndCheck("scriptfactor", element)));
        map.put("scriptscriptfactor", Float.valueOf(getFloatAndCheck("scriptscriptfactor", element)));
        return map;
    }

    public Map<String, Float> parseParameters() {
        HashMap map = new HashMap();
        Element element = (Element) this.root.getElementsByTagName("Parameters").item(0);
        if (element == null) {
            throw new XMLResourceParseException(RESOURCE_NAME, "Parameters");
        }
        NamedNodeMap attributes = element.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            String name = ((Attr) attributes.item(i)).getName();
            map.put(name, new Float(getFloatAndCheck(name, element)));
        }
        return map;
    }

    public Map<String, CharFont> parseSymbolMappings() {
        String attrValueAndCheckIfNotNull;
        HashMap map = new HashMap();
        Element element = (Element) this.root.getElementsByTagName("SymbolMappings").item(0);
        if (element == null) {
            throw new XMLResourceParseException(RESOURCE_NAME, "SymbolMappings");
        }
        NodeList elementsByTagName = element.getElementsByTagName("Mapping");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("include", (Element) elementsByTagName.item(i));
            try {
                NodeList elementsByTagName2 = (this.base == null ? factory.newDocumentBuilder().parse(JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull2)).getDocumentElement() : factory.newDocumentBuilder().parse(JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull2)).getDocumentElement()).getElementsByTagName(SYMBOL_MAPPING_EL);
                for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                    Element element2 = (Element) elementsByTagName2.item(i2);
                    String attrValueAndCheckIfNotNull3 = getAttrValueAndCheckIfNotNull("name", element2);
                    int intAndCheck = getIntAndCheck("ch", element2);
                    String attrValueAndCheckIfNotNull4 = getAttrValueAndCheckIfNotNull("fontId", element2);
                    try {
                        attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("boldId", element2);
                    } catch (ResourceParseException unused) {
                        attrValueAndCheckIfNotNull = null;
                    }
                    if (attrValueAndCheckIfNotNull == null) {
                        map.put(attrValueAndCheckIfNotNull3, new CharFont((char) intAndCheck, Font_ID.indexOf(attrValueAndCheckIfNotNull4)));
                    } else {
                        map.put(attrValueAndCheckIfNotNull3, new CharFont((char) intAndCheck, Font_ID.indexOf(attrValueAndCheckIfNotNull4), Font_ID.indexOf(attrValueAndCheckIfNotNull)));
                    }
                }
            } catch (Exception unused2) {
                throw new XMLResourceParseException(fq2.n("Cannot find the file ", attrValueAndCheckIfNotNull2, "!"));
            }
        }
        return map;
    }

    public Map<String, CharFont[]> parseTextStyleMappings() {
        return this.parsedTextStyles;
    }
}
