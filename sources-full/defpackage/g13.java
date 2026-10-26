package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.util.Base64;
import android.util.Xml;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.ViewConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.uuid.Uuid;
import kotlinx.serialization.json.JsonObject;
import okhttp3.Headers$Companion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g13 {
    public static final cl a = new cl(0);
    public static final cl b = new cl(1);
    public static final float[] c = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] d = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final nc e = new nc(1000);
    public static final nc f;
    public static final StackTraceElement[] g;

    static {
        new nc(1007);
        new nc(1008);
        f = new nc(1002);
        g = new StackTraceElement[0];
    }

    public g13(om3 om3Var) {
        om3Var.getClass();
    }

    public static final float A(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / 3)) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final zp0 B(Executor executor) {
        return new k51(executor);
    }

    public static final boolean C(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean D(yw2 yw2Var) {
        List list = yw2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((dx2) list.get(i)).i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final float F(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int G(float f2, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f2)));
    }

    public static zb1 H(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            N(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), e23.b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                N(xmlResourceParser);
            }
            List listK = K(resources, resourceId);
            return new cc1(new sb1(string, string2, string3, listK), string4 != null ? new sb1(string, string2, string4, listK) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), e23.c);
                    int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i2 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                    int i4 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i4);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        N(xmlResourceParser);
                    }
                    arrayList.add(new bc1(i, i3, resourceId2, string7, string6, z));
                } else {
                    N(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ac1((bc1[]) arrayList.toArray(new bc1[0]));
    }

    public static final long I(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final Object J(au auVar, d5 d5Var, uo0 uo0Var) {
        ag0 ag0Var = new ag0(true);
        ag0Var.H(null);
        bu buVar = new bu();
        buVar.a = ag0Var;
        auVar.getClass();
        if (au.e(new tl4(auVar, buVar, d5Var.d), 30000L, new io4(auVar, 15, buVar), Looper.myLooper() == null ? auVar.e : new Handler(Looper.myLooper()), auVar.d()) == null) {
            fu fuVarH = auVar.h();
            auVar.o(25, 9, fuVarH);
            pm4 pm4Var = xm4.d;
            buVar.a(fuVarH, cn4.m);
        }
        return ag0Var.n(uo0Var);
    }

    public static List K(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final Object L(rs1 rs1Var, String str, JsonObject jsonObject, qu1 qu1Var) {
        rs1Var.getClass();
        str.getClass();
        return new ut1(rs1Var, jsonObject, str, qu1Var.getDescriptor()).a(qu1Var);
    }

    public static final long M(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static void N(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final void O(Object obj) throws Throwable {
        if (obj instanceof i63) {
            throw ((i63) obj).c;
        }
    }

    public static String P(long j) {
        if (y(j, 12884901888L)) {
            return "Rgb";
        }
        if (y(j, 12884901889L)) {
            return "Xyz";
        }
        if (y(j, 12884901890L)) {
            return "Lab";
        }
        return y(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static String Q(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + yo4.Y(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + yo4.Y(Float.intBitsToFloat(i)) + ", " + yo4.Y(Float.intBitsToFloat(i2)) + ')';
    }

    public static final o9 a(ib ibVar) {
        Canvas canvas = p9.a;
        o9 o9Var = new o9();
        o9Var.a = new Canvas(gm4.d(ibVar));
        return o9Var;
    }

    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i2 = tu1.n;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object c(defpackage.rq3 r6, defpackage.wr r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ud3
            if (r0 == 0) goto L13
            r0 = r7
            ud3 r0 = (defpackage.ud3) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ud3 r0 = new ud3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            rq3 r6 = r0.c
            O(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r6)
            r6 = 0
            return r6
        L2e:
            O(r7)
        L31:
            r0.c = r6
            r0.h = r2
            zw2 r7 = defpackage.zw2.d
            java.lang.Object r7 = r6.a(r7, r0)
            hq0 r1 = defpackage.hq0.c
            if (r7 != r1) goto L40
            return r1
        L40:
            yw2 r7 = (defpackage.yw2) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            dx2 r5 = (defpackage.dx2) r5
            boolean r5 = defpackage.py.s(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g13.c(rq3, wr):java.lang.Object");
    }

    public static final boolean d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (kr1.z(cCharAt, Uuid.SIZE_BITS) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(rq3 rq3Var, cg2 cg2Var, gj gjVar, yw2 yw2Var, wr wrVar) throws Throwable {
        vd3 vd3Var;
        gd3 none;
        rq3 rq3Var2;
        l43 l43Var;
        List list;
        int size;
        dx2 dx2Var;
        if (wrVar instanceof vd3) {
            vd3Var = (vd3) wrVar;
            int i = vd3Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vd3Var.m = i - Integer.MIN_VALUE;
            } else {
                vd3Var = new vd3(wrVar);
            }
        } else {
            vd3Var = new vd3(wrVar);
        }
        Object obj = vd3Var.l;
        int i2 = vd3Var.m;
        int i3 = 0;
        if (i2 == 0) {
            O(obj);
            gjVar.q(yw2Var);
            dx2 dx2Var2 = (dx2) yw2Var.a.get(0);
            int i4 = gjVar.b;
            if (i4 != 1) {
                none = i4 != 2 ? SelectionAdjustment$Companion.getParagraph() : SelectionAdjustment$Companion.getWord();
            } else {
                none = SelectionAdjustment$Companion.getNone();
            }
            if (cg2Var.e(dx2Var2.c, none)) {
                l43 l43Var2 = new l43();
                l43Var2.c = !none.equals(SelectionAdjustment$Companion.getNone());
                long j = dx2Var2.a;
                wd3 wd3Var = new wd3(cg2Var, none, l43Var2, i3);
                vd3Var.c = rq3Var;
                vd3Var.d = cg2Var;
                vd3Var.h = l43Var2;
                vd3Var.m = 2;
                Object objG = uy0.g(rq3Var, j, wd3Var, vd3Var);
                hq0 hq0Var = hq0.c;
                if (objG == hq0Var) {
                    return hq0Var;
                }
                rq3Var2 = rq3Var;
                l43Var = l43Var2;
                obj = objG;
                if (((Boolean) obj).booleanValue()) {
                    list = rq3Var2.n.n.a;
                    size = list.size();
                    while (i3 < size) {
                        dx2Var = (dx2) list.get(i3);
                        if (py.t(dx2Var)) {
                            dx2Var.a();
                        }
                        i3++;
                    }
                }
                cg2Var.d();
            }
        } else if (i2 == 1) {
            cg2 cg2Var2 = vd3Var.d;
            rq3 rq3Var3 = vd3Var.c;
            O(obj);
            if (((Boolean) obj).booleanValue()) {
                List list2 = rq3Var3.n.n.a;
                int size2 = list2.size();
                while (i3 < size2) {
                    dx2 dx2Var3 = (dx2) list2.get(i3);
                    if (py.t(dx2Var3)) {
                        dx2Var3.a();
                    }
                    i3++;
                }
            }
            cg2Var2.d();
        } else {
            if (i2 != 2) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l43Var = vd3Var.h;
            cg2Var = vd3Var.d;
            rq3Var2 = vd3Var.c;
            O(obj);
            if (((Boolean) obj).booleanValue() && l43Var.c) {
                list = rq3Var2.n.n.a;
                size = list.size();
                while (i3 < size) {
                    dx2Var = (dx2) list.get(i3);
                    if (py.t(dx2Var)) {
                        dx2Var.a();
                    }
                    i3++;
                }
            }
            cg2Var.d();
        }
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e1 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:47:0x00c9, B:49:0x00d1, B:51:0x00d5, B:53:0x00e1, B:55:0x00ed, B:42:0x009a), top: B:62:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:47:0x00c9, B:49:0x00d1, B:51:0x00d5, B:53:0x00e1, B:55:0x00ed, B:42:0x009a), top: B:62:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(rq3 rq3Var, ex3 ex3Var, gj gjVar, yw2 yw2Var, wr wrVar) throws Throwable {
        xd3 xd3Var;
        gd3 none;
        rq3 rq3Var2;
        l43 l43Var;
        List list;
        int size;
        dx2 dx2Var;
        if (wrVar instanceof xd3) {
            xd3Var = (xd3) wrVar;
            int i = xd3Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xd3Var.m = i - Integer.MIN_VALUE;
            } else {
                xd3Var = new xd3(wrVar);
            }
        } else {
            xd3Var = new xd3(wrVar);
        }
        Object obj = xd3Var.l;
        int i2 = xd3Var.m;
        int i3 = 0;
        int i4 = 1;
        try {
            if (i2 == 0) {
                O(obj);
                dx2 dx2Var2 = (dx2) yw2Var.a.get(0);
                int i5 = gjVar.b;
                if (i5 != 1) {
                    none = i5 != 2 ? SelectionAdjustment$Companion.getParagraph() : SelectionAdjustment$Companion.getWord();
                } else {
                    none = SelectionAdjustment$Companion.getNone();
                }
                if (ex3Var.e(dx2Var2.c, none)) {
                    dx2Var2.a();
                    l43 l43Var2 = new l43();
                    l43Var2.c = !none.equals(SelectionAdjustment$Companion.getNone());
                    long j = dx2Var2.a;
                    wd3 wd3Var = new wd3(ex3Var, none, l43Var2, i4);
                    xd3Var.c = rq3Var;
                    xd3Var.d = ex3Var;
                    xd3Var.h = l43Var2;
                    xd3Var.m = 2;
                    Object objG = uy0.g(rq3Var, j, wd3Var, xd3Var);
                    hq0 hq0Var = hq0.c;
                    if (objG == hq0Var) {
                        return hq0Var;
                    }
                    rq3Var2 = rq3Var;
                    l43Var = l43Var2;
                    obj = objG;
                    if (((Boolean) obj).booleanValue()) {
                        list = rq3Var2.n.n.a;
                        size = list.size();
                        while (i3 < size) {
                            dx2Var = (dx2) list.get(i3);
                            if (py.t(dx2Var)) {
                                dx2Var.a();
                            }
                            i3++;
                        }
                    }
                    ex3Var.d();
                }
            } else if (i2 == 1) {
                ex3 ex3Var2 = xd3Var.d;
                rq3 rq3Var3 = xd3Var.c;
                try {
                    O(obj);
                    if (((Boolean) obj).booleanValue()) {
                        List list2 = rq3Var3.n.n.a;
                        int size2 = list2.size();
                        while (i3 < size2) {
                            dx2 dx2Var3 = (dx2) list2.get(i3);
                            if (py.t(dx2Var3)) {
                                dx2Var3.a();
                            }
                            i3++;
                        }
                    }
                } finally {
                    ex3Var2.d();
                }
            } else {
                if (i2 != 2) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l43Var = xd3Var.h;
                ex3Var = xd3Var.d;
                rq3Var2 = xd3Var.c;
                O(obj);
                if (((Boolean) obj).booleanValue() && l43Var.c) {
                    list = rq3Var2.n.n.a;
                    size = list.size();
                    while (i3 < size) {
                        dx2Var = (dx2) list.get(i3);
                        if (py.t(dx2Var)) {
                            dx2Var.a();
                        }
                        i3++;
                    }
                }
                ex3Var.d();
            }
            return w84.a;
        } catch (Throwable th) {
            ex3Var.d();
            throw th;
        }
    }

    public static final gl2 g(f63 f63Var) {
        ny nyVarD;
        int i = f63Var.l;
        long j = f63Var.s;
        long j2 = f63Var.t;
        th1 th1Var = f63Var.n;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = th1Var.iterator();
        while (true) {
            a0 a0Var = (a0) it;
            if (!a0Var.hasNext()) {
                break;
            }
            ps2 ps2Var = (ps2) a0Var.next();
            String str = (String) ps2Var.c;
            String str2 = (String) ps2Var.d;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        yk2 yk2Var = new yk2(y92.W(linkedHashMap));
        m33 m33Var = f63Var.o;
        return new gl2(i, j, j2, yk2Var, (m33Var == null || (nyVarD = m33Var.D()) == null) ? null : new am3(nyVarD), f63Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a A[LOOP:1: B:24:0x0084->B:26:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final l53 h(cl2 cl2Var, uo0 uo0Var) throws Throwable {
        qa4 qa4Var;
        vu vuVar;
        String str;
        vu vuVar2;
        cl2 cl2Var2;
        m53 m53Var;
        ArrayList arrayList;
        String str2;
        if (uo0Var instanceof qa4) {
            qa4Var = (qa4) uo0Var;
            int i = qa4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa4Var.d = i - Integer.MIN_VALUE;
            } else {
                qa4Var = new qa4(uo0Var);
            }
        } else {
            qa4Var = new qa4(uo0Var);
        }
        Object obj = qa4Var.c;
        int i2 = qa4Var.d;
        vu vuVar3 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            O(obj);
            lz lzVar = (lz) obj;
            if (lzVar != null) {
                m53Var = new m53(lzVar);
                cl2Var2 = null;
                vuVar2 = null;
                str = null;
            } else {
                cl2Var = null;
                vuVar = null;
                vuVar2 = null;
                str = null;
            }
            vuVar3.o(str, m53Var);
            yk2 yk2Var = cl2Var2.c;
            arrayList = new ArrayList(20);
            for (Map.Entry entry : yk2Var.a.entrySet()) {
                str2 = (String) entry.getKey();
                for (String str3 : (List) entry.getValue()) {
                    str2.getClass();
                    str3.getClass();
                    Headers$Companion.checkName(str2);
                    arrayList.add(str2);
                    arrayList.add(mo3.U0(str3).toString());
                }
            }
            th1 th1Var = new th1((String[]) arrayList.toArray(new String[0]));
            vuVar2.getClass();
            vuVar2.h = th1Var.g();
            return vuVar2.g();
        }
        O(obj);
        vuVar = new vu();
        vuVar.p(cl2Var.a);
        str = cl2Var.b;
        vuVar2 = vuVar;
        vu vuVar4 = vuVar;
        cl2Var2 = cl2Var;
        m53Var = null;
        vuVar3 = vuVar4;
        vuVar3.o(str, m53Var);
        yk2 yk2Var2 = cl2Var2.c;
        arrayList = new ArrayList(20);
        while (r5.hasNext()) {
            str2 = (String) entry.getKey();
            while (r1.hasNext()) {
                str2.getClass();
                str3.getClass();
                Headers$Companion.checkName(str2);
                arrayList.add(str2);
                arrayList.add(mo3.U0(str3).toString());
            }
        }
        th1 th1Var2 = new th1((String[]) arrayList.toArray(new String[0]));
        vuVar2.getClass();
        vuVar2.h = th1Var2.g();
        return vuVar2.g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r12 == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.rq3 r9, defpackage.xt3 r10, defpackage.yw2 r11, defpackage.wr r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof defpackage.yd3
            if (r0 == 0) goto L13
            r0 = r12
            yd3 r0 = (defpackage.yd3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            yd3 r0 = new yd3
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.l
            int r1 = r0.m
            r2 = 0
            r3 = 2
            r4 = 1
            hq0 r5 = defpackage.hq0.c
            if (r1 == 0) goto L45
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            xt3 r10 = r0.d
            rq3 r9 = r0.c
            O(r12)     // Catch: java.util.concurrent.CancellationException -> L2f
            goto L8a
        L2f:
            r9 = move-exception
            goto Lbb
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r9)
            return r2
        L38:
            dx2 r9 = r0.h
            xt3 r10 = r0.d
            rq3 r11 = r0.c
            O(r12)     // Catch: java.util.concurrent.CancellationException -> L2f
            r8 = r11
            r11 = r9
            r9 = r8
            goto L61
        L45:
            O(r12)
            java.util.List r11 = r11.a     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r11 = defpackage.ke0.y0(r11)     // Catch: java.util.concurrent.CancellationException -> L2f
            dx2 r11 = (defpackage.dx2) r11     // Catch: java.util.concurrent.CancellationException -> L2f
            long r6 = r11.a     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.c = r9     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.d = r10     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.h = r11     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.m = r4     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r12 = defpackage.uy0.d(r9, r6, r0)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r12 != r5) goto L61
            goto L89
        L61:
            dx2 r12 = (defpackage.dx2) r12     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r12 == 0) goto Lb8
            androidx.compose.ui.platform.ViewConfiguration r1 = r9.i()     // Catch: java.util.concurrent.CancellationException -> L2f
            boolean r11 = x(r1, r11, r12)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r11 == 0) goto Lb8
            long r6 = r12.c     // Catch: java.util.concurrent.CancellationException -> L2f
            r10.c(r6)     // Catch: java.util.concurrent.CancellationException -> L2f
            long r11 = r12.a     // Catch: java.util.concurrent.CancellationException -> L2f
            f82 r1 = new f82     // Catch: java.util.concurrent.CancellationException -> L2f
            r1.<init>(r10, r4)     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.c = r9     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.d = r10     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.h = r2     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.m = r3     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r12 = defpackage.uy0.g(r9, r11, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r12 != r5) goto L8a
        L89:
            return r5
        L8a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L2f
            boolean r11 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r11 == 0) goto Lb5
            sq3 r9 = r9.n     // Catch: java.util.concurrent.CancellationException -> L2f
            yw2 r9 = r9.n     // Catch: java.util.concurrent.CancellationException -> L2f
            java.util.List r9 = r9.a     // Catch: java.util.concurrent.CancellationException -> L2f
            int r11 = r9.size()     // Catch: java.util.concurrent.CancellationException -> L2f
            r12 = 0
        L9d:
            if (r12 >= r11) goto Lb1
            java.lang.Object r0 = r9.get(r12)     // Catch: java.util.concurrent.CancellationException -> L2f
            dx2 r0 = (defpackage.dx2) r0     // Catch: java.util.concurrent.CancellationException -> L2f
            boolean r1 = defpackage.py.t(r0)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r1 == 0) goto Lae
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L2f
        Lae:
            int r12 = r12 + 1
            goto L9d
        Lb1:
            r10.a()     // Catch: java.util.concurrent.CancellationException -> L2f
            goto Lb8
        Lb5:
            r10.onCancel()     // Catch: java.util.concurrent.CancellationException -> L2f
        Lb8:
            w84 r9 = defpackage.w84.a
            return r9
        Lbb:
            r10.onCancel()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g13.i(rq3, xt3, yw2, wr):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r12 == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.rq3 r9, defpackage.fx3 r10, defpackage.yw2 r11, defpackage.wr r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof defpackage.zd3
            if (r0 == 0) goto L13
            r0 = r12
            zd3 r0 = (defpackage.zd3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            zd3 r0 = new zd3
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.l
            int r1 = r0.m
            r2 = 0
            r3 = 2
            r4 = 1
            hq0 r5 = defpackage.hq0.c
            if (r1 == 0) goto L45
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            xt3 r10 = r0.d
            rq3 r9 = r0.c
            O(r12)     // Catch: java.util.concurrent.CancellationException -> L2f
            goto L8a
        L2f:
            r9 = move-exception
            goto Lbb
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r9)
            return r2
        L38:
            dx2 r9 = r0.h
            xt3 r10 = r0.d
            rq3 r11 = r0.c
            O(r12)     // Catch: java.util.concurrent.CancellationException -> L2f
            r8 = r11
            r11 = r9
            r9 = r8
            goto L61
        L45:
            O(r12)
            java.util.List r11 = r11.a     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r11 = defpackage.ke0.y0(r11)     // Catch: java.util.concurrent.CancellationException -> L2f
            dx2 r11 = (defpackage.dx2) r11     // Catch: java.util.concurrent.CancellationException -> L2f
            long r6 = r11.a     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.c = r9     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.d = r10     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.h = r11     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.m = r4     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r12 = defpackage.uy0.d(r9, r6, r0)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r12 != r5) goto L61
            goto L89
        L61:
            dx2 r12 = (defpackage.dx2) r12     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r12 == 0) goto Lb8
            androidx.compose.ui.platform.ViewConfiguration r1 = r9.i()     // Catch: java.util.concurrent.CancellationException -> L2f
            boolean r11 = x(r1, r11, r12)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r11 == 0) goto Lb8
            long r6 = r12.c     // Catch: java.util.concurrent.CancellationException -> L2f
            r10.c(r6)     // Catch: java.util.concurrent.CancellationException -> L2f
            long r11 = r12.a     // Catch: java.util.concurrent.CancellationException -> L2f
            f82 r1 = new f82     // Catch: java.util.concurrent.CancellationException -> L2f
            r1.<init>(r10, r3)     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.c = r9     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.d = r10     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.h = r2     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.m = r3     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r12 = defpackage.uy0.g(r9, r11, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r12 != r5) goto L8a
        L89:
            return r5
        L8a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L2f
            boolean r11 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r11 == 0) goto Lb5
            sq3 r9 = r9.n     // Catch: java.util.concurrent.CancellationException -> L2f
            yw2 r9 = r9.n     // Catch: java.util.concurrent.CancellationException -> L2f
            java.util.List r9 = r9.a     // Catch: java.util.concurrent.CancellationException -> L2f
            int r11 = r9.size()     // Catch: java.util.concurrent.CancellationException -> L2f
            r12 = 0
        L9d:
            if (r12 >= r11) goto Lb1
            java.lang.Object r0 = r9.get(r12)     // Catch: java.util.concurrent.CancellationException -> L2f
            dx2 r0 = (defpackage.dx2) r0     // Catch: java.util.concurrent.CancellationException -> L2f
            boolean r1 = defpackage.py.t(r0)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r1 == 0) goto Lae
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L2f
        Lae:
            int r12 = r12 + 1
            goto L9d
        Lb1:
            r10.a()     // Catch: java.util.concurrent.CancellationException -> L2f
            goto Lb8
        Lb5:
            r10.onCancel()     // Catch: java.util.concurrent.CancellationException -> L2f
        Lb8:
            w84 r9 = defpackage.w84.a
            return r9
        Lbb:
            r10.onCancel()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g13.j(rq3, fx3, yw2, wr):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[Catch: CancellationException -> 0x0098, TryCatch #2 {CancellationException -> 0x0098, blocks: (B:29:0x0091, B:31:0x0095, B:34:0x009a, B:37:0x009f, B:39:0x00a8, B:41:0x00ac, B:43:0x00b0, B:44:0x00b5), top: B:68:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f A[Catch: CancellationException -> 0x0098, TryCatch #2 {CancellationException -> 0x0098, blocks: (B:29:0x0091, B:31:0x0095, B:34:0x009a, B:37:0x009f, B:39:0x00a8, B:41:0x00ac, B:43:0x00b0, B:44:0x00b5), top: B:68:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8 A[Catch: CancellationException -> 0x0098, TryCatch #2 {CancellationException -> 0x0098, blocks: (B:29:0x0091, B:31:0x0095, B:34:0x009a, B:37:0x009f, B:39:0x00a8, B:41:0x00ac, B:43:0x00b0, B:44:0x00b5), top: B:68:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac A[Catch: CancellationException -> 0x0098, TryCatch #2 {CancellationException -> 0x0098, blocks: (B:29:0x0091, B:31:0x0095, B:34:0x009a, B:37:0x009f, B:39:0x00a8, B:41:0x00ac, B:43:0x00b0, B:44:0x00b5), top: B:68:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0 A[Catch: CancellationException -> 0x0098, TryCatch #2 {CancellationException -> 0x0098, blocks: (B:29:0x0091, B:31:0x0095, B:34:0x009a, B:37:0x009f, B:39:0x00a8, B:41:0x00ac, B:43:0x00b0, B:44:0x00b5), top: B:68:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[Catch: CancellationException -> 0x0034, TryCatch #3 {CancellationException -> 0x0034, blocks: (B:13:0x002f, B:48:0x00ce, B:50:0x00d6, B:52:0x00e3, B:54:0x00ef, B:55:0x00f2, B:56:0x00f5, B:58:0x00f9), top: B:69:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3 A[Catch: CancellationException -> 0x0034, TryCatch #3 {CancellationException -> 0x0034, blocks: (B:13:0x002f, B:48:0x00ce, B:50:0x00d6, B:52:0x00e3, B:54:0x00ef, B:55:0x00f2, B:56:0x00f5, B:58:0x00f9), top: B:69:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef A[Catch: CancellationException -> 0x0034, TryCatch #3 {CancellationException -> 0x0034, blocks: (B:13:0x002f, B:48:0x00ce, B:50:0x00d6, B:52:0x00e3, B:54:0x00ef, B:55:0x00f2, B:56:0x00f5, B:58:0x00f9), top: B:69:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9 A[Catch: CancellationException -> 0x0034, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0034, blocks: (B:13:0x002f, B:48:0x00ce, B:50:0x00d6, B:52:0x00e3, B:54:0x00ef, B:55:0x00f2, B:56:0x00f5, B:58:0x00f9), top: B:69:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object k(rq3 rq3Var, fx3 fx3Var, yw2 yw2Var, wr wrVar) throws Throwable {
        ae3 ae3Var;
        xt3 xt3Var;
        dx2 dx2Var;
        long j;
        rq3 rq3Var2;
        p43 p43Var;
        px0 px0Var;
        rq3 rq3Var3;
        xt3 xt3Var2;
        List list;
        int size;
        int i;
        dx2 dx2Var2;
        if (wrVar instanceof ae3) {
            ae3Var = (ae3) wrVar;
            int i2 = ae3Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ae3Var.o = i2 - Integer.MIN_VALUE;
            } else {
                ae3Var = new ae3(wrVar);
            }
        } else {
            ae3Var = new ae3(wrVar);
        }
        Object objG = ae3Var.n;
        int i3 = ae3Var.o;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        if (i3 != 0) {
            if (i3 == 1) {
                j = ae3Var.m;
                p43Var = ae3Var.l;
                dx2Var = ae3Var.h;
                xt3 xt3Var3 = ae3Var.d;
                rq3Var2 = ae3Var.c;
                try {
                    O(objG);
                    xt3Var = xt3Var3;
                    try {
                        px0Var = (px0) objG;
                        if (px0Var == null) {
                            px0Var = px0.h;
                        }
                        if (px0Var == px0.l) {
                            return w84Var;
                        }
                        xt3Var.c(dx2Var.c);
                        if (px0Var == px0.c) {
                            xt3Var.a();
                            return w84Var;
                        }
                        if (px0Var == px0.d) {
                            xt3Var.e(p43Var.c);
                        }
                        f82 f82Var = new f82(xt3Var, 3);
                        ae3Var.c = rq3Var2;
                        ae3Var.d = xt3Var;
                        ae3Var.h = null;
                        ae3Var.l = null;
                        ae3Var.o = 2;
                        objG = uy0.g(rq3Var2, j, f82Var, ae3Var);
                        if (objG != hq0Var) {
                            rq3Var3 = rq3Var2;
                            xt3Var2 = xt3Var;
                            if (!((Boolean) objG).booleanValue()) {
                                xt3Var2.onCancel();
                                return w84Var;
                            }
                            list = rq3Var3.n.n.a;
                            size = list.size();
                            for (i = 0; i < size; i++) {
                                dx2Var2 = (dx2) list.get(i);
                                if (py.t(dx2Var2)) {
                                    dx2Var2.a();
                                }
                            }
                            xt3Var2.a();
                            return w84Var;
                        }
                        return hq0Var;
                    } catch (CancellationException e2) {
                        e = e2;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    xt3Var = xt3Var3;
                }
            } else {
                if (i3 != 2) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xt3Var2 = ae3Var.d;
                rq3Var3 = ae3Var.c;
                try {
                    O(objG);
                    if (!((Boolean) objG).booleanValue()) {
                        xt3Var2.onCancel();
                        return w84Var;
                    }
                    list = rq3Var3.n.n.a;
                    size = list.size();
                    while (i < size) {
                        dx2Var2 = (dx2) list.get(i);
                        if (py.t(dx2Var2)) {
                            dx2Var2.a();
                        }
                    }
                    xt3Var2.a();
                    return w84Var;
                } catch (CancellationException e4) {
                    e = e4;
                    xt3Var = xt3Var2;
                }
            }
            xt3Var.onCancel();
            throw e;
        }
        O(objG);
        try {
            dx2Var = (dx2) ke0.y0(yw2Var.a);
            j = dx2Var.a;
            p43 p43Var2 = new p43();
            p43Var2.c = 9205357640488583168L;
            long longPressTimeoutMillis = rq3Var.i().getLongPressTimeoutMillis();
            be3 be3Var = new be3(j, p43Var2, null);
            ae3Var.c = rq3Var;
            ae3Var.d = fx3Var;
            ae3Var.h = dx2Var;
            ae3Var.l = p43Var2;
            ae3Var.m = j;
            ae3Var.o = 1;
            Object objN = rq3Var.n(longPressTimeoutMillis, be3Var, ae3Var);
            if (objN != hq0Var) {
                rq3Var2 = rq3Var;
                xt3Var = fx3Var;
                p43Var = p43Var2;
                objG = objN;
                px0Var = (px0) objG;
                if (px0Var == null) {
                    px0Var = px0.h;
                }
                if (px0Var == px0.l) {
                    return w84Var;
                }
                xt3Var.c(dx2Var.c);
                if (px0Var == px0.c) {
                    xt3Var.a();
                    return w84Var;
                }
                if (px0Var == px0.d) {
                    xt3Var.e(p43Var.c);
                }
                f82 f82Var2 = new f82(xt3Var, 3);
                ae3Var.c = rq3Var2;
                ae3Var.d = xt3Var;
                ae3Var.h = null;
                ae3Var.l = null;
                ae3Var.o = 2;
                objG = uy0.g(rq3Var2, j, f82Var2, ae3Var);
                if (objG != hq0Var) {
                    rq3Var3 = rq3Var2;
                    xt3Var2 = xt3Var;
                    if (!((Boolean) objG).booleanValue()) {
                        xt3Var2.onCancel();
                        return w84Var;
                    }
                    list = rq3Var3.n.n.a;
                    size = list.size();
                    while (i < size) {
                        dx2Var2 = (dx2) list.get(i);
                        if (py.t(dx2Var2)) {
                            dx2Var2.a();
                        }
                    }
                    xt3Var2.a();
                    return w84Var;
                }
            }
            return hq0Var;
        } catch (CancellationException e5) {
            e = e5;
            xt3Var = fx3Var;
        }
    }

    public static final c l(c cVar, float f2) {
        return f2 == 1.0f ? cVar : a.b(cVar, f2, 0.0f, 0.0f, null, true, 126971);
    }

    public static final void m(gd4 gd4Var, t93 t93Var, h32 h32Var) {
        t93Var.getClass();
        h32Var.getClass();
        l93 l93Var = (l93) gd4Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (l93Var == null || l93Var.h) {
            return;
        }
        l93Var.a(h32Var, t93Var);
        g32 g32Var = ((p32) h32Var).c;
        if (g32Var == g32.d || g32Var.compareTo(g32.l) >= 0) {
            t93Var.d();
        } else {
            h32Var.a(new gt0(h32Var, t93Var));
        }
    }

    public static final long p(int i, int i2, androidx.compose.foundation.text.input.internal.c cVar) {
        sn1 sn1Var;
        g54 g54Var;
        if (i == -1) {
            return (((long) i2) << 32) | 4294967295L;
        }
        boolean z = i > i2;
        fv0 fv0Var = cVar.c;
        rq1 rq1Var = (fv0Var == null || (g54Var = (g54) fv0Var.getValue()) == null) ? null : g54Var.b;
        long jA = rq1Var != null ? rq1Var.a(i, false) : p23.d(i, i);
        long jF = cVar.f(jA);
        if (jz3.c(jA) && jz3.c(jF)) {
            sn1Var = sn1.c;
        } else if (jz3.c(jA) || jz3.c(jF)) {
            sn1Var = (!jz3.c(jA) || jz3.c(jF)) ? sn1.l : sn1.d;
        } else {
            sn1Var = sn1.h;
        }
        int iOrdinal = sn1Var.ordinal();
        qf4 qf4Var = qf4.d;
        qf4 qf4Var2 = qf4.c;
        if (iOrdinal == 0) {
            if (z) {
                qf4Var = qf4Var2;
            }
            return jr1.l(i, qf4Var);
        }
        if (iOrdinal == 1) {
            if (z) {
                return i == ((int) (jF >> 32)) ? jr1.l(i, qf4Var2) : jr1.l((int) (jF & 4294967295L), qf4Var);
            }
            return i == ((int) (jF & 4294967295L)) ? jr1.l(i, qf4Var) : jr1.l((int) (jF >> 32), qf4Var2);
        }
        if (iOrdinal == 2) {
            return z ? jr1.l((int) (jF & 4294967295L), qf4Var2) : jr1.l((int) (jF >> 32), qf4Var);
        }
        if (iOrdinal == 3) {
            return (((long) i) << 32) | 4294967295L;
        }
        u41.e();
        return 0L;
    }

    public static final int q(float f2) {
        return Math.round((float) Math.ceil(f2));
    }

    public static void r(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            ud2.v(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void s(Object obj) {
        if (obj != null) {
            return;
        }
        m51.x("null reference");
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        m51.x(str);
    }

    public static mi2 u() {
        return new ft2(w84.a, t73.t);
    }

    public static final double v(double d2, z01 z01Var, z01 z01Var2) {
        TimeUnit timeUnit = z01Var2.c;
        TimeUnit timeUnit2 = z01Var.c;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d2 * jConvert : d2 / timeUnit2.convert(1L, timeUnit);
    }

    public static final i63 w(Throwable th) {
        th.getClass();
        return new i63(th);
    }

    public static final boolean x(ViewConfiguration viewConfiguration, dx2 dx2Var, dx2 dx2Var2) {
        return ln2.d(ln2.h(dx2Var.c, dx2Var2.c)) < uy0.j(viewConfiguration, dx2Var.i);
    }

    public static final boolean y(long j, long j2) {
        return j == j2;
    }

    public static final boolean z(long j, long j2) {
        return j == j2;
    }

    public boolean E() {
        throw null;
    }

    public mg n(Context context, Looper looper, f13 f13Var, Object obj, xf1 xf1Var, yf1 yf1Var) {
        return o(context, looper, f13Var, obj, (ek4) xf1Var, (ek4) yf1Var);
    }

    public mg o(Context context, Looper looper, f13 f13Var, Object obj, ek4 ek4Var, ek4 ek4Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
