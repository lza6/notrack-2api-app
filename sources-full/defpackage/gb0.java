package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.KotlinVersion;
import notrack.ai.data.api.CarryDto;
import notrack.ai.data.api.ChatHistoryResponse;
import notrack.ai.data.api.ExtractionDto;
import notrack.ai.data.api.MessageDto;
import notrack.ai.data.api.UploadResponse;

/* JADX INFO: loaded from: classes.dex */
public final class gb0 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public int d;
    public final /* synthetic */ int h;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(int i, hb0 hb0Var, so0 so0Var, String str) {
        super(2, so0Var);
        this.l = hb0Var;
        this.m = str;
        this.h = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(int i, so0 so0Var, g22 g22Var) {
        super(2, so0Var);
        this.m = g22Var;
        this.h = i;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new gb0(this.h, (hb0) this.l, so0Var, (String) this.m);
            default:
                gb0 gb0Var = new gb0(this.h, so0Var, (g22) this.m);
                gb0Var.l = obj;
                return gb0Var;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((gb0) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((gb0) create((pb3) obj, (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0246  */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objG;
        Object value2;
        Object value3;
        xa0 xa0Var;
        String str;
        w10 w10Var;
        String carriedTo;
        List list;
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        hq0 hq0Var = hq0.c;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                hb0 hb0Var = (hb0) this.l;
                int i3 = this.d;
                z21 z21Var = z21.c;
                if (i3 == 0) {
                    g13.O(obj);
                    jn3 jn3Var = hb0Var.c;
                    String str2 = (String) obj2;
                    do {
                        value = jn3Var.getValue();
                    } while (!jn3Var.n(value, xa0.a((xa0) value, z21Var, false, str2, null, null, false, true, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, BuildConfig.VERSION_NAME, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -6291782, -61441, KotlinVersion.MAX_COMPONENT_VALUE)));
                    hb0Var.X(y40.a);
                    this.d = 1;
                    objG = hb0Var.b.g((String) obj2, this);
                    if (objG == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                    objG = ((j63) obj).c;
                }
                if (!(objG instanceof i63)) {
                    ChatHistoryResponse chatHistoryResponse = (ChatHistoryResponse) objG;
                    if (i2 == hb0Var.i) {
                        List<MessageDto> messages = chatHistoryResponse.getMessages();
                        ArrayList arrayList = new ArrayList(le0.q0(messages, 10));
                        for (MessageDto messageDto : messages) {
                            String string = UUID.randomUUID().toString();
                            string.getClass();
                            String messageId = messageDto.getMessageId();
                            String content = messageDto.getContent();
                            String speaker = messageDto.getSpeaker();
                            mm3 mm3Var = kr1.n(speaker, "user") ? mm3.c : kr1.n(speaker, "C") ? mm3.d : mm3.h;
                            xd2 xd2Var = kr1.n(messageDto.getType(), "error") ? xd2.d : xd2.c;
                            boolean zN = kr1.n(messageDto.getVia(), "partial");
                            List<UploadResponse> attachments = messageDto.getAttachments();
                            if (attachments != null) {
                                ArrayList arrayList2 = new ArrayList(le0.q0(attachments, 10));
                                for (UploadResponse uploadResponse : attachments) {
                                    String fileId = uploadResponse.getFileId();
                                    String name = uploadResponse.getName();
                                    long bytes = uploadResponse.getBytes();
                                    String kind = uploadResponse.getKind();
                                    ExtractionDto extraction = uploadResponse.getExtraction();
                                    arrayList2.add(new hn(fileId, (String) null, name, bytes, gn.d, kind, extraction != null ? kr1.n(extraction.getTruncated(), Boolean.TRUE) : false, 66));
                                }
                                list = arrayList2;
                            } else {
                                list = z21Var;
                            }
                            arrayList.add(new yd2(string, content, mm3Var, xd2Var, list, zN, messageId, 80));
                        }
                        jn3 jn3Var2 = hb0Var.c;
                        do {
                            value3 = jn3Var2.getValue();
                            xa0Var = (xa0) value3;
                            String instructions = chatHistoryResponse.getChat().getInstructions();
                            if (instructions == null) {
                                instructions = BuildConfig.VERSION_NAME;
                            }
                            str = instructions;
                            CarryDto carry = chatHistoryResponse.getChat().getCarry();
                            if (carry == null) {
                                w10Var = null;
                            } else {
                                if (mo3.C0(carry.getText())) {
                                    carry = null;
                                }
                                if (carry != null) {
                                    w10Var = new w10(carry.getText(), carry.getFromId(), carry.getFromTitle());
                                } else {
                                    w10Var = null;
                                }
                            }
                            carriedTo = chatHistoryResponse.getChat().getCarriedTo();
                        } while (!jn3Var2.n(value3, xa0.a(xa0Var, arrayList, false, null, null, null, false, false, null, false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, str, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, w10Var, (carriedTo == null || mo3.C0(carriedTo)) ? null : carriedTo, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -2097218, -12289, KotlinVersion.MAX_COMPONENT_VALUE)));
                        hb0Var.X(c50.a);
                    }
                }
                Throwable thA = j63.a(objG);
                if (thA == null || i2 != hb0Var.i) {
                    return w84Var;
                }
                jn3 jn3Var3 = hb0Var.c;
                do {
                    value2 = jn3Var3.getValue();
                } while (!jn3Var3.n(value2, xa0.a((xa0) value2, null, false, null, null, null, false, false, thA.getMessage(), false, null, null, 0.0f, null, null, false, false, false, null, null, false, null, null, false, false, null, null, null, false, 0L, null, 0, null, null, false, null, false, 0L, null, 0, null, false, false, null, null, null, null, false, null, null, null, null, false, null, null, null, false, null, false, null, null, null, false, null, null, null, false, null, null, null, null, null, null, -193, -1, KotlinVersion.MAX_COMPONENT_VALUE)));
                return w84Var;
            default:
                int i4 = this.d;
                if (i4 != 0) {
                    if (i4 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                g22 g22Var = (g22) obj2;
                c22 c22Var = new c22((pb3) this.l, 0, g22Var);
                wu0 wu0Var = ((z12) g22Var.e.getValue()).i;
                this.d = 1;
                return xp1.d(c22Var, i2, 100, wu0Var, this) == hq0Var ? hq0Var : w84Var;
        }
    }
}
