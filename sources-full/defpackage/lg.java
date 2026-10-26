package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.lang.annotation.Annotation;
import notrack.ai.data.api.ChatDto$$serializer;
import notrack.ai.data.api.ChatEvent;
import notrack.ai.data.api.ChatEvent$Busy$$serializer;
import notrack.ai.data.api.ChatEvent$ChatMeta$$serializer;
import notrack.ai.data.api.ChatEvent$Delta$$serializer;
import notrack.ai.data.api.ChatEvent$Error$$serializer;
import notrack.ai.data.api.ChatEvent$InstrRefused$$serializer;
import notrack.ai.data.api.ChatEvent$Message$$serializer;
import notrack.ai.data.api.ChatEvent$Thinking$$serializer;
import notrack.ai.data.api.ChatEvent$Unknown$$serializer;
import notrack.ai.data.api.ChatEvent$UserEcho$$serializer;
import notrack.ai.data.api.MessageDto$$serializer;
import notrack.ai.data.avatars.AvatarItem$$serializer;
import notrack.ai.data.chatmeta.ChatEntry$$serializer;
import notrack.ai.data.chatmeta.FolderMeta$$serializer;
import notrack.ai.data.notify.Announcement$$serializer;
import notrack.ai.data.notify.AnnouncementCopy$$serializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lg implements je1 {
    public final /* synthetic */ int c;

    public /* synthetic */ lg(int i) {
        this.c = i;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        switch (this.c) {
            case 0:
                lo3 lo3Var = lo3.a;
                return new t42(AnnouncementCopy$$serializer.INSTANCE);
            case 1:
                return new ml(Announcement$$serializer.INSTANCE);
            case 2:
                return w84.a;
            case 3:
                return new ml(lo3.a);
            case 4:
                return new ml(AvatarItem$$serializer.INSTANCE);
            case 5:
                return new t42(lo3.a);
            case 6:
                return gx.a;
            case 7:
                return cl3.d(Boolean.FALSE);
            case 8:
                return new rc3(r43.a(ChatEvent.class), new vc0[]{r43.a(ChatEvent.Busy.class), r43.a(ChatEvent.CarryHint.class), r43.a(ChatEvent.ChatMeta.class), r43.a(ChatEvent.Delta.class), r43.a(ChatEvent.Done.class), r43.a(ChatEvent.Error.class), r43.a(ChatEvent.InstrRefused.class), r43.a(ChatEvent.Message.class), r43.a(ChatEvent.Thinking.class), r43.a(ChatEvent.Unknown.class), r43.a(ChatEvent.UserEcho.class)}, new qu1[]{ChatEvent$Busy$$serializer.INSTANCE, new fn2("carry_hint", ChatEvent.CarryHint.INSTANCE, new Annotation[0]), ChatEvent$ChatMeta$$serializer.INSTANCE, ChatEvent$Delta$$serializer.INSTANCE, new fn2("done", ChatEvent.Done.INSTANCE, new Annotation[0]), ChatEvent$Error$$serializer.INSTANCE, ChatEvent$InstrRefused$$serializer.INSTANCE, ChatEvent$Message$$serializer.INSTANCE, ChatEvent$Thinking$$serializer.INSTANCE, ChatEvent$Unknown$$serializer.INSTANCE, ChatEvent$UserEcho$$serializer.INSTANCE}, new Annotation[0]);
            case 9:
                return new fn2("carry_hint", ChatEvent.CarryHint.INSTANCE, new Annotation[0]);
            case 10:
                return new fn2("done", ChatEvent.Done.INSTANCE, new Annotation[0]);
            case 11:
                lo3 lo3Var2 = lo3.a;
                return new t42(oq1.a);
            case 12:
                return new ml(MessageDto$$serializer.INSTANCE);
            case 13:
                return new ml(ChatDto$$serializer.INSTANCE);
            case 14:
                return new ml(FolderMeta$$serializer.INSTANCE);
            case 15:
                lo3 lo3Var3 = lo3.a;
                return new t42(ChatEntry$$serializer.INSTANCE);
            case 16:
                return cl3.d(Boolean.FALSE);
            case 17:
                return cl3.d("bg");
            case 18:
                return Boolean.TRUE;
            case 19:
                return new ml(lo3.a);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return new Handler(Looper.getMainLooper());
            case 21:
                return new ml(lo3.a);
            case 22:
                jt0 jt0Var = sw0.a;
                return i92.a.l;
            case 23:
                return (c33) sa4.a.getValue();
            case 24:
                return tt1.b;
            case 25:
                return pt1.b;
            case 26:
                return mt1.b;
            case 27:
                return rt1.b;
            case 28:
                return ts1.b;
            default:
                un3 un3Var = a72.a;
                return mm.a;
        }
    }
}
