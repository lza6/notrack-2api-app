package notrack.ai.data.promo;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PromoRegex {
    public static final Companion Companion = new Companion();
    private final String block;
    private final String blockCjk;
    private final String comp;
    private final String compCjk;
    private final String explCjk;
    private final String explRu;
    private final String explicit;
    private final String imggen;
    private final String imggenCjk;
    private final String live;
    private final String liveCjk;
    private final String media;
    private final String mediaCjk;
    private final String more;
    private final String moreCjk;
    private final String vpn;
    private final String vpnCjk;

    public final class Companion {
        public final qu1 serializer() {
            return PromoRegex$$serializer.INSTANCE;
        }
    }

    public PromoRegex(int i) {
        String str = (i & 1) != 0 ? BuildConfig.VERSION_NAME : "(?:^|[^\\p{L}\\p{N}])(?:photo|selfie|nude|nudes|pics|video call|video chat|video of you|your video|a video of|do video|on video|your voice|voice message|voice note|voice call|voice chat|webcam|your camera|on camera|your body|your face|what do you look like|foto|фото|фотк|снимок|видео|лицо|лица|तस्वीर|फोटो|वीडियो|चेहरा|afbeelding|gezicht|bild|sprachnachricht|stimme|gesicht|immagine|viso|faccia|imagen|voz|imagem|rostro|voix|visage|fotoğraf|resim|sesli|sesini|yüz|gambar|suara|wajah|rosto)";
        String str2 = (i & 2) != 0 ? BuildConfig.VERSION_NAME : "照片|图片|视频|语音|自拍|看看你|发张|你的脸|声音|脸|你的身体|摄像头";
        String str3 = (i & 4) != 0 ? BuildConfig.VERSION_NAME : "(?:^|[^\\p{L}\\p{N}])(?:girlfriend|boyfriend|roleplay|role-play|kiss|cuddl|marry|marri|i love you|love me|loves me|flirt|romantic|sexy|horny|naughty|sex|babe|darling|sweetheart|my love|be mine|lonely|lonel|miss you|hold me|a relationship|our relationship|relationship with|in a relationship|my partner|life partner|wife|husband|turn me on|turns me on|attracted to|feel alone|so alone|all alone|have no one|on a date|подруг|девушк|парн|поцелу|обним|целов|люблю теб|любл|романт|секс|свидан|ласк|одинок|скучаю|प्यार|गर्लफ्रेंड|चुंबन|शादी|प्रेम|pyaar|jaan|vriendin|vriendje|kus|knuffel|hou van je|liefde|trouwen|schatje|eenzaam|freundin|kuss|kuscheln|umarm|ich liebe dich|heirat|schatz|liebe dich|einsam|vermiss|beziehung|sehnsucht|ragazza|fidanzat|bacio|coccol|abbracc|ti amo|sposar|amore|tesoro|sento solo|mi manchi|novia|novio|beso|abrazo|te amo|te quiero|casar|cariño|mi amor|siento solo|te extraño|namorad|beijo|abraço|meu amor|sozinh|saudade|copine|petite amie|bisou|câlin|je t.aime|épous|chéri|sens seul|me manques|sevgili|öpücük|sarıl|seni seviyorum|evlen|tatlım|yalnız|özledim|pacar|cium|peluk|aku cinta|sayang|menikah|cinta kamu|kesepian|kangen|dating|hookup|hook up|one night stand|meet a girl|meet women|find a girlfriend|find a partner|ai girlfriend|virtual girlfriend|waifu|e-girl|girlfriend experience|soulmate|are you single|my crush|have a crush|be my girl|be my queen|познаком|встретимся|будь моей|влюбл|милая|солнышко|célibataire|soltera|soltero|jomblo|kencan|jodoh|aşkım|ролев|ролепл|отыграй|притворись|побудь мо)";
        String str4 = (i & 8) != 0 ? BuildConfig.VERSION_NAME : "女朋友|男朋友|女友|男友|我爱你|亲吻|接吻|拥抱|结婚|宝贝|恋爱|喜欢你|做我女|做我男|寂寞|孤单|想你|抱我|抱抱|约会|单身|谈恋爱";
        String str5 = (i & 16) != 0 ? BuildConfig.VERSION_NAME : "(?<![\\p{L}\\p{N}])(?:porn|porno|blowjob|blowjobs|bdsm|anal|cum|cumshot|creampie|deepthroat|dick|dicks|cock|cocks|pussy|pussies|boobs|tits|titties|slut|sluts|whore|whores|milf|hentai|nsfw|horny|orgasm|handjob|threesome|gangbang|dildo|kinky|femdom|dominatrix|cybersex|sext|sexting|make love|making love|jerk off|jerking off|jack off|talk dirty|dirty talk|on top of me|порно|порнуха|анал|анальный|минет|сиськи|киска|хуй|пизда|трахаться|трахни|ебля|ебать|шлюха|сучка|блядь|госпожа|оргазм|голая|раздевайся|грудь|груди|соси|дрочи|follar|tetas|coño|mamada|puta|polla|desnuda|coger contigo|cogerte|cógeme|buceta|gozar|punheta|safada|transar|ficken|titten|muschi|schwanz|nutte|geil|nackt|fotze|baise|baiser|chatte|salope|pute|nichons|coucher avec|figa|cazzo|troia|pompino|scopare|scopiamo|scopami|tette|puttana|sikiş|sikişelim|sikelim|yarak|amcık|orospu|azgın|ngentot|memek|kontol|bugil|chut|lund|chudai|randi|gaand|sexting|dirty story|erotic|bondage|spank|choke me|striptease|lapdance|orgy|mistress|dominate me|submissive|fetish|похоть|возбуди|соблазни|разврат|шлюшка|erregt|verführ|cachonda|cachondo|sumisa)(?![\\p{L}\\p{N}])";
        String str6 = (i & 32) != 0 ? BuildConfig.VERSION_NAME : "色情|做爱|肛交|骚货|裸体|口交|高潮|奶子|鸡巴|操你|插我|上我|自慰|插进|放荡|调教|捆绑|骚一点";
        String str7 = (i & 64) != 0 ? BuildConfig.VERSION_NAME : "(?:^|[^\\p{L}\\p{N}])(?:трахн|трахат|трахаю|трахае|трахни|выеб|уеб|отъеб|подъеб|наеб|ебат|ебал|ебан|ебл|ебош|ебуч|минет|отсос|дроч|кончил|кончи|кончу|сперм|сиськ|сись|титьк|пизд|хуй|хуе|хую|хуё|шлюх|блядь|разврат|похот|возбуд|соблазн|оргазм|порн|порев|голая|голую|голым|голышом|обнаж|раздет|раздева|раздень|разденься|сексуальн)";
        String str8 = (i & Uuid.SIZE_BITS) != 0 ? BuildConfig.VERSION_NAME : "(?:^|[^\\p{L}\\p{N}])(?:generate an image|generate a picture|generate a pic|generate a photo|generate a girl|generate a woman|create an image|create a picture|make me a picture|draw me a|draw a picture|ai image|ai-generated|нарисуй|сгенерируй фото|сгенерируй картинк|сгенерируй изображени|сгенерируй девушк|создай изображени|создай картинк|dessine-moi|zeichne mir|dibuja|disegna|gerar imagem|generar imagen)";
        String str9 = (i & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? BuildConfig.VERSION_NAME : "生成图片|生成图像|画一张|画个|生成一张";
        String str10 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? BuildConfig.VERSION_NAME : "(?:^|[^\\p{L}\\p{N}])(?:live cam|livecam|cam show|camshow|cam2cam|cam to cam|webcam show|see you on cam|show me on cam|камшоу|по вебке|покажись на камеру|включи камеру|видеозвон|live kamera|webcam en direct|cámara en vivo|webcam dal vivo|câmera ao vivo|canlı kamera|kamera langsung|live webcam|लाइव कैम|كاميرا مباشرة)";
        String str11 = (i & 1024) != 0 ? BuildConfig.VERSION_NAME : "直播|开摄像头|视频秀|真人秀|ライブカメラ";
        String str12 = (i & 2048) != 0 ? BuildConfig.VERSION_NAME : "(?:^|[^\\p{L}\\p{N}])(?:onlyfans|only fans|fansly|more pics|more photos|more nudes|more of you|premium content|do you have more|subscribe to you|онлифанс|онлиф|больше фото|ещё фото|ещё картинк|больше тебя|твой контент|подписаться на теб|mehr fotos|mehr bilder|mehr von dir|plus de photos|plus de toi|más fotos|más de ti|più foto|altre foto|mais fotos|mais de você|daha fazla fotoğraf|daha fazla resim|foto lagi|lebih banyak foto|meer foto|meer van jou|और फ़ोटो|और तस्वीर|المزيد من الصور|صور أكثر)";
        String str13 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? BuildConfig.VERSION_NAME : "更多照片|订阅你|你的内容|更多裸照|もっと写真";
        String str14 = (i & 32768) != 0 ? BuildConfig.VERSION_NAME : "(?<![\\p{L}\\p{N}])(?:loli|shota|underage|underaged|preteen|pre-teen|jailbait|kiddie|child porn|childporn|малолетк|несовершеннолетн|kill myself|want to die|suicide|suicidal|end my life|self-harm|self harm|cut myself|hurt myself|kms|покончить с собой|хочу умереть|суицид|убить себя)(?![\\p{L}\\p{N}])";
        String str15 = (i & 65536) != 0 ? BuildConfig.VERSION_NAME : "幼女|萝莉|未成年|自杀|想死|轻生";
        this.media = str;
        this.mediaCjk = str2;
        this.comp = str3;
        this.compCjk = str4;
        this.explicit = str5;
        this.explCjk = str6;
        this.explRu = str7;
        this.imggen = str8;
        this.imggenCjk = str9;
        this.live = str10;
        this.liveCjk = str11;
        this.more = str12;
        this.moreCjk = str13;
        this.vpn = BuildConfig.VERSION_NAME;
        this.vpnCjk = BuildConfig.VERSION_NAME;
        this.block = str14;
        this.blockCjk = str15;
    }

    public /* synthetic */ PromoRegex(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        if ((i & 1) == 0) {
            this.media = BuildConfig.VERSION_NAME;
        } else {
            this.media = str;
        }
        if ((i & 2) == 0) {
            this.mediaCjk = BuildConfig.VERSION_NAME;
        } else {
            this.mediaCjk = str2;
        }
        if ((i & 4) == 0) {
            this.comp = BuildConfig.VERSION_NAME;
        } else {
            this.comp = str3;
        }
        if ((i & 8) == 0) {
            this.compCjk = BuildConfig.VERSION_NAME;
        } else {
            this.compCjk = str4;
        }
        if ((i & 16) == 0) {
            this.explicit = BuildConfig.VERSION_NAME;
        } else {
            this.explicit = str5;
        }
        if ((i & 32) == 0) {
            this.explCjk = BuildConfig.VERSION_NAME;
        } else {
            this.explCjk = str6;
        }
        if ((i & 64) == 0) {
            this.explRu = BuildConfig.VERSION_NAME;
        } else {
            this.explRu = str7;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.imggen = BuildConfig.VERSION_NAME;
        } else {
            this.imggen = str8;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.imggenCjk = BuildConfig.VERSION_NAME;
        } else {
            this.imggenCjk = str9;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.live = BuildConfig.VERSION_NAME;
        } else {
            this.live = str10;
        }
        if ((i & 1024) == 0) {
            this.liveCjk = BuildConfig.VERSION_NAME;
        } else {
            this.liveCjk = str11;
        }
        if ((i & 2048) == 0) {
            this.more = BuildConfig.VERSION_NAME;
        } else {
            this.more = str12;
        }
        if ((i & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
            this.moreCjk = BuildConfig.VERSION_NAME;
        } else {
            this.moreCjk = str13;
        }
        if ((i & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) {
            this.vpn = BuildConfig.VERSION_NAME;
        } else {
            this.vpn = str14;
        }
        if ((i & 16384) == 0) {
            this.vpnCjk = BuildConfig.VERSION_NAME;
        } else {
            this.vpnCjk = str15;
        }
        if ((32768 & i) == 0) {
            this.block = BuildConfig.VERSION_NAME;
        } else {
            this.block = str16;
        }
        if ((i & 65536) == 0) {
            this.blockCjk = BuildConfig.VERSION_NAME;
        } else {
            this.blockCjk = str17;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(PromoRegex promoRegex, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.media, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, promoRegex.media);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.mediaCjk, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, promoRegex.mediaCjk);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.comp, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 2, promoRegex.comp);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.compCjk, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 3, promoRegex.compCjk);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.explicit, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 4, promoRegex.explicit);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.explCjk, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 5, promoRegex.explCjk);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.explRu, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 6, promoRegex.explRu);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.imggen, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 7, promoRegex.imggen);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.imggenCjk, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 8, promoRegex.imggenCjk);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.live, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 9, promoRegex.live);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.liveCjk, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 10, promoRegex.liveCjk);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.more, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 11, promoRegex.more);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.moreCjk, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 12, promoRegex.moreCjk);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.vpn, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 13, promoRegex.vpn);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.vpnCjk, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 14, promoRegex.vpnCjk);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoRegex.block, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 15, promoRegex.block);
        }
        if (!do3Var.w(tf3Var) && kr1.n(promoRegex.blockCjk, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 16, promoRegex.blockCjk);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoRegex)) {
            return false;
        }
        PromoRegex promoRegex = (PromoRegex) obj;
        return kr1.n(this.media, promoRegex.media) && kr1.n(this.mediaCjk, promoRegex.mediaCjk) && kr1.n(this.comp, promoRegex.comp) && kr1.n(this.compCjk, promoRegex.compCjk) && kr1.n(this.explicit, promoRegex.explicit) && kr1.n(this.explCjk, promoRegex.explCjk) && kr1.n(this.explRu, promoRegex.explRu) && kr1.n(this.imggen, promoRegex.imggen) && kr1.n(this.imggenCjk, promoRegex.imggenCjk) && kr1.n(this.live, promoRegex.live) && kr1.n(this.liveCjk, promoRegex.liveCjk) && kr1.n(this.more, promoRegex.more) && kr1.n(this.moreCjk, promoRegex.moreCjk) && kr1.n(this.vpn, promoRegex.vpn) && kr1.n(this.vpnCjk, promoRegex.vpnCjk) && kr1.n(this.block, promoRegex.block) && kr1.n(this.blockCjk, promoRegex.blockCjk);
    }

    public final String getBlock() {
        return this.block;
    }

    public final String getBlockCjk() {
        return this.blockCjk;
    }

    public final String getComp() {
        return this.comp;
    }

    public final String getCompCjk() {
        return this.compCjk;
    }

    public final String getExplCjk() {
        return this.explCjk;
    }

    public final String getExplRu() {
        return this.explRu;
    }

    public final String getExplicit() {
        return this.explicit;
    }

    public final String getImggen() {
        return this.imggen;
    }

    public final String getImggenCjk() {
        return this.imggenCjk;
    }

    public final String getLive() {
        return this.live;
    }

    public final String getLiveCjk() {
        return this.liveCjk;
    }

    public final String getMedia() {
        return this.media;
    }

    public final String getMediaCjk() {
        return this.mediaCjk;
    }

    public final String getMore() {
        return this.more;
    }

    public final String getMoreCjk() {
        return this.moreCjk;
    }

    public final String getVpn() {
        return this.vpn;
    }

    public final String getVpnCjk() {
        return this.vpnCjk;
    }

    public final int hashCode() {
        return this.blockCjk.hashCode() + ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(this.media.hashCode() * 31, 31, this.mediaCjk), 31, this.comp), 31, this.compCjk), 31, this.explicit), 31, this.explCjk), 31, this.explRu), 31, this.imggen), 31, this.imggenCjk), 31, this.live), 31, this.liveCjk), 31, this.more), 31, this.moreCjk), 31, this.vpn), 31, this.vpnCjk), 31, this.block);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("PromoRegex(media=", this.media, ", mediaCjk=", this.mediaCjk, ", comp=");
        ud2.v(sbT, this.comp, ", compCjk=", this.compCjk, ", explicit=");
        ud2.v(sbT, this.explicit, ", explCjk=", this.explCjk, ", explRu=");
        ud2.v(sbT, this.explRu, ", imggen=", this.imggen, ", imggenCjk=");
        ud2.v(sbT, this.imggenCjk, ", live=", this.live, ", liveCjk=");
        ud2.v(sbT, this.liveCjk, ", more=", this.more, ", moreCjk=");
        ud2.v(sbT, this.moreCjk, ", vpn=", this.vpn, ", vpnCjk=");
        ud2.v(sbT, this.vpnCjk, ", block=", this.block, ", blockCjk=");
        return fq2.r(sbT, this.blockCjk, ")");
    }
}
