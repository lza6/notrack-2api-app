package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import kotlin.io.ConstantsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class wp3 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public wp3(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        vp3 vp3Var = new vp3(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = vp3Var.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g23.p);
                        vp3Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        vp3Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        vp3Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        vp3Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        vp3Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        vp3Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g23.q);
                        vp3Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        vp3Var.j = (typedArrayObtainStyledAttributes2.getInt(5, vp3Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, vp3Var.d) & 65535);
                        vp3Var.k = typedArrayObtainStyledAttributes2.getText(7);
                        vp3Var.l = typedArrayObtainStyledAttributes2.getText(8);
                        vp3Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        vp3Var.n = string == null ? (char) 0 : string.charAt(0);
                        vp3Var.o = typedArrayObtainStyledAttributes2.getInt(16, ConstantsKt.DEFAULT_BLOCK_SIZE);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        vp3Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                        vp3Var.q = typedArrayObtainStyledAttributes2.getInt(20, ConstantsKt.DEFAULT_BLOCK_SIZE);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            vp3Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            vp3Var.r = vp3Var.e;
                        }
                        vp3Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        vp3Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, vp3Var.f);
                        vp3Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, vp3Var.g);
                        vp3Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        vp3Var.y = typedArrayObtainStyledAttributes2.getString(12);
                        vp3Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        vp3Var.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && vp3Var.w == 0 && vp3Var.x == null) {
                            vp3Var.z = (nc2) vp3Var.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            vp3Var.z = null;
                        }
                        vp3Var.A = typedArrayObtainStyledAttributes2.getText(17);
                        vp3Var.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            vp3Var.D = b01.b(typedArrayObtainStyledAttributes2.getInt(19, -1), vp3Var.D);
                        } else {
                            vp3Var.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = y64.x(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            vp3Var.C = colorStateList;
                        } else {
                            vp3Var.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        vp3Var.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        vp3Var.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(vp3Var.b, vp3Var.i, vp3Var.j, vp3Var.k);
                        vp3Var.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        vp3Var.b = 0;
                        vp3Var.c = 0;
                        vp3Var.d = 0;
                        vp3Var.e = 0;
                        vp3Var.f = true;
                        vp3Var.g = true;
                    } else if (name3.equals("item")) {
                        if (!vp3Var.h) {
                            nc2 nc2Var = vp3Var.z;
                            if (nc2Var == null || !nc2Var.b.hasSubMenu()) {
                                vp3Var.h = true;
                                vp3Var.b(menu2.add(vp3Var.b, vp3Var.i, vp3Var.j, vp3Var.k));
                            } else {
                                vp3Var.h = true;
                                vp3Var.b(menu2.addSubMenu(vp3Var.b, vp3Var.i, vp3Var.j, vp3Var.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof hc2)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof hc2) {
                    hc2 hc2Var = (hc2) menu;
                    if (!hc2Var.p) {
                        hc2Var.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((hc2) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((hc2) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
