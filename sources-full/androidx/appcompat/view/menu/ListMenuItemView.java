package androidx.appcompat.view.menu;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import app.template.extension.BuildConfig;
import defpackage.g23;
import defpackage.hc2;
import defpackage.iy2;
import defpackage.mc2;
import defpackage.od2;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements od2, AbsListView.SelectionBoundsAdjuster {
    public mc2 c;
    public ImageView d;
    public RadioButton h;
    public TextView l;
    public CheckBox m;
    public TextView n;
    public ImageView o;
    public ImageView p;
    public LinearLayout q;
    public final Drawable r;
    public final int s;
    public final Context t;
    public boolean u;
    public final Drawable v;
    public final boolean w;
    public LayoutInflater x;
    public boolean y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        iy2 iy2VarL = iy2.l(getContext(), attributeSet, g23.r, i);
        this.r = iy2VarL.e(5);
        TypedArray typedArray = (TypedArray) iy2VarL.h;
        this.s = typedArray.getResourceId(1, -1);
        this.u = typedArray.getBoolean(7, false);
        this.t = context;
        this.v = iy2VarL.e(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.w = typedArrayObtainStyledAttributes.hasValue(0);
        iy2VarL.n();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.x == null) {
            this.x = LayoutInflater.from(getContext());
        }
        return this.x;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // defpackage.od2
    public final void a(mc2 mc2Var) {
        boolean z;
        int i;
        String string;
        this.c = mc2Var;
        boolean zIsVisible = mc2Var.isVisible();
        hc2 hc2Var = mc2Var.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(mc2Var.e);
        setCheckable(mc2Var.isCheckable());
        if (hc2Var.o()) {
            if ((hc2Var.n() ? mc2Var.j : mc2Var.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        hc2Var.n();
        if (z) {
            mc2 mc2Var2 = this.c;
            hc2 hc2Var2 = mc2Var2.n;
            if (hc2Var2.o()) {
                i = (hc2Var2.n() ? mc2Var2.j : mc2Var2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.n;
            mc2 mc2Var3 = this.c;
            hc2 hc2Var3 = mc2Var3.n;
            Context context = hc2Var3.a;
            char c = hc2Var3.n() ? mc2Var3.j : mc2Var3.h;
            if (c == 0) {
                string = BuildConfig.VERSION_NAME;
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = hc2Var3.n() ? mc2Var3.k : mc2Var3.i;
                mc2.c(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                mc2.c(sb, i2, ConstantsKt.DEFAULT_BLOCK_SIZE, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                mc2.c(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                mc2.c(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                mc2.c(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                mc2.c(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.n.getVisibility() != i) {
            this.n.setVisibility(i);
        }
        setIcon(mc2Var.getIcon());
        setEnabled(mc2Var.isEnabled());
        setSubMenuArrowVisible(mc2Var.hasSubMenu());
        setContentDescription(mc2Var.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.p;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.p.getLayoutParams();
        rect.top = this.p.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.od2
    public mc2 getItemData() {
        return this.c;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.r);
        TextView textView = (TextView) findViewById(R.id.title);
        this.l = textView;
        int i = this.s;
        if (i != -1) {
            textView.setTextAppearance(this.t, i);
        }
        this.n = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.o = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.v);
        }
        this.p = (ImageView) findViewById(R.id.group_divider);
        this.q = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.d != null && this.u) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.h == null && this.m == null) {
            return;
        }
        if ((this.c.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
            view = this.m;
        } else {
            if (this.m == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.m = checkBox;
                LinearLayout linearLayout2 = this.q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.m;
            view = this.h;
        }
        if (z) {
            compoundButton.setChecked(this.c.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.m;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.c.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
        } else {
            if (this.m == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.m = checkBox;
                LinearLayout linearLayout2 = this.q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.m;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.y = z;
        this.u = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setVisibility((this.w || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        hc2 hc2Var = this.c.n;
        boolean z = this.y;
        if (z || this.u) {
            ImageView imageView = this.d;
            if (imageView == null && drawable == null && !this.u) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.d = imageView2;
                LinearLayout linearLayout = this.q;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.u) {
                this.d.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.d;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.l;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.l.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.l.getVisibility() != 0) {
                this.l.setVisibility(0);
            }
        }
    }
}
