package org.scilab.forge.jlatexmath;

import app.template.extension.BuildConfig;
import defpackage.fq2;
import defpackage.u41;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;

/* JADX INFO: loaded from: classes.dex */
public class GlueSettingsParser {
    private static final String RESOURCE_NAME = "GlueSettings.xml";
    private Glue[] glueTypes;
    private Element root;
    private final Map<String, Integer> typeMappings = new HashMap();
    private final Map<String, Integer> glueTypeMappings = new HashMap();
    private final Map<String, Integer> styleMappings = new HashMap();

    public GlueSettingsParser() {
        try {
            setTypeMappings();
            setStyleMappings();
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            this.root = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(JLatexMathAndroid.getResourceAsStream(RESOURCE_NAME)).getDocumentElement();
            parseGlueTypes();
        } catch (Exception e) {
            throw new XMLResourceParseException(RESOURCE_NAME, e);
        }
    }

    private static void checkMapping(Object obj, String str, String str2, String str3) {
        if (obj != null) {
            return;
        }
        u41.o(RESOURCE_NAME, str, str2, fq2.n("has an unknown value '", str3, "'!"));
    }

    private Glue createGlue(Element element, String str) {
        String attribute;
        String[] strArr = {"space", "stretch", "shrink"};
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            try {
                attribute = element.getAttribute(strArr[i]);
                try {
                    fArr[i] = (float) (!attribute.equals(BuildConfig.VERSION_NAME) ? Double.parseDouble(attribute) : 0.0d);
                } catch (NumberFormatException unused) {
                    u41.o(RESOURCE_NAME, "GlueType", strArr[i], fq2.n("has an invalid real value '", attribute, "'!"));
                    return null;
                }
            } catch (NumberFormatException unused2) {
                attribute = null;
            }
        }
        return new Glue(fArr[0], fArr[1], fArr[2], str);
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (!attribute.equals(BuildConfig.VERSION_NAME)) {
            return attribute;
        }
        u41.o(RESOURCE_NAME, element.getTagName(), str, null);
        return null;
    }

    private void parseGlueTypes() {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Element element = (Element) this.root.getElementsByTagName("GlueTypes").item(0);
        int i3 = -1;
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("GlueType");
            i = 0;
            for (int i4 = 0; i4 < elementsByTagName.getLength(); i4++) {
                Element element2 = (Element) elementsByTagName.item(i4);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element2);
                Glue glueCreateGlue = createGlue(element2, attrValueAndCheckIfNotNull);
                if (attrValueAndCheckIfNotNull.equalsIgnoreCase("default")) {
                    i3 = i;
                }
                arrayList.add(glueCreateGlue);
                i++;
            }
        } else {
            i = 0;
        }
        if (i3 < 0) {
            arrayList.add(new Glue(0.0f, 0.0f, 0.0f, "default"));
            i3 = i;
        }
        Glue[] glueArr = (Glue[]) arrayList.toArray(new Glue[arrayList.size()]);
        this.glueTypes = glueArr;
        if (i3 > 0) {
            Glue glue = glueArr[i3];
            glueArr[i3] = glueArr[0];
            glueArr[0] = glue;
        }
        while (true) {
            Glue[] glueArr2 = this.glueTypes;
            if (i2 >= glueArr2.length) {
                return;
            }
            this.glueTypeMappings.put(glueArr2[i2].getName(), Integer.valueOf(i2));
            i2++;
        }
    }

    private void setStyleMappings() {
        this.styleMappings.put("display", 0);
        this.styleMappings.put("text", 1);
        this.styleMappings.put("script", 2);
        this.styleMappings.put("script_script", 3);
    }

    private void setTypeMappings() {
        this.typeMappings.put("ord", 0);
        this.typeMappings.put("op", 1);
        this.typeMappings.put("bin", 2);
        this.typeMappings.put("rel", 3);
        this.typeMappings.put("open", 4);
        this.typeMappings.put("close", 5);
        this.typeMappings.put("punct", 6);
        this.typeMappings.put("inner", 7);
    }

    public int[][][] createGlueTable() {
        int size = this.typeMappings.size();
        int i = 0;
        int[][][] iArr = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, size, size, this.styleMappings.size());
        Element element = (Element) this.root.getElementsByTagName("GlueTable").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("Glue");
            int i2 = 0;
            while (i2 < elementsByTagName.getLength()) {
                Element element2 = (Element) elementsByTagName.item(i2);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("lefttype", element2);
                String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("righttype", element2);
                String attrValueAndCheckIfNotNull3 = getAttrValueAndCheckIfNotNull("gluetype", element2);
                NodeList elementsByTagName2 = element2.getElementsByTagName("Style");
                int i3 = i;
                while (i3 < elementsByTagName2.getLength()) {
                    String attrValueAndCheckIfNotNull4 = getAttrValueAndCheckIfNotNull("name", (Element) elementsByTagName2.item(i3));
                    int[][][] iArr2 = iArr;
                    Integer num = this.typeMappings.get(attrValueAndCheckIfNotNull);
                    NodeList nodeList = elementsByTagName;
                    Integer num2 = this.typeMappings.get(attrValueAndCheckIfNotNull2);
                    int i4 = i2;
                    Integer num3 = this.styleMappings.get(attrValueAndCheckIfNotNull4);
                    NodeList nodeList2 = elementsByTagName2;
                    Integer num4 = this.glueTypeMappings.get(attrValueAndCheckIfNotNull3);
                    checkMapping(num, "Glue", "lefttype", attrValueAndCheckIfNotNull);
                    checkMapping(num2, "Glue", "righttype", attrValueAndCheckIfNotNull2);
                    checkMapping(num4, "Glue", "gluetype", attrValueAndCheckIfNotNull3);
                    checkMapping(num3, "Style", "name", attrValueAndCheckIfNotNull4);
                    iArr2[num.intValue()][num2.intValue()][num3.intValue()] = num4.intValue();
                    i3++;
                    iArr = iArr2;
                    elementsByTagName = nodeList;
                    i2 = i4;
                    elementsByTagName2 = nodeList2;
                }
                i2++;
                i = 0;
            }
        }
        return iArr;
    }

    public Glue[] getGlueTypes() {
        return this.glueTypes;
    }
}
