package tslamic.github.io.adn;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DeviceNamesTest extends TestCase {

    private static final String FALLBACK = "fallback";

    public void testNull() throws Exception {
        final String result = DeviceNames.getDeviceName(null, FALLBACK);
        Assert.assertEquals(FALLBACK, result);
    }

    public void testEmpty() throws Exception {
        final String result = DeviceNames.getDeviceName("", FALLBACK);
        Assert.assertEquals(FALLBACK, result);
    }

    public void testNotListed() throws Exception {
        final String result = DeviceNames.getDeviceName("UNKNOWN", FALLBACK);
        Assert.assertEquals(FALLBACK, result);
    }

    public void testDevice1() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D626ph", FALLBACK);
    Assert.assertEquals("HTC Desire 626G+ dual sim", result);
}
public void testDevice2() throws Exception {
    final String result = DeviceNames.getDeviceName("umts", FALLBACK);
    Assert.assertEquals("Motorola Droid", result);
}
public void testDevice3() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00XSB", FALLBACK);
    Assert.assertEquals("Asus ZenFone Zoom (ZX551ML)", result);
}
public void testDevice4() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00XSA", FALLBACK);
    Assert.assertEquals("Asus ZenFone Zoom (ZX551ML)", result);
}
public void testDevice5() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-S85", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice6() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-VM701", FALLBACK);
    Assert.assertEquals("LGE Optimus Slider", result);
}
public void testDevice7() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A700YD", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice8() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K600J", FALLBACK);
    Assert.assertEquals("Hisense LED32K600J", result);
}
public void testDevice9() throws Exception {
    final String result = DeviceNames.getDeviceName("TL10RA3", FALLBACK);
    Assert.assertEquals("Amplify TL10RA3", result);
}
public void testDevice10() throws Exception {
    final String result = DeviceNames.getDeviceName("TL10RA2", FALLBACK);
    Assert.assertEquals("ECS TL10RA2", result);
}
public void testDevice11() throws Exception {
    final String result = DeviceNames.getDeviceName("titan_niibr_ds", FALLBACK);
    Assert.assertEquals("Motorola MOTO G", result);
}
public void testDevice12() throws Exception {
    final String result = DeviceNames.getDeviceName("E2033", FALLBACK);
    Assert.assertEquals("Sony Xperia E4g Dual", result);
}
public void testDevice13() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P5220", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 10.1", result);
}
public void testDevice14() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A800IZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A8", result);
}
public void testDevice15() throws Exception {
    final String result = DeviceNames.getDeviceName("SP4", FALLBACK);
    Assert.assertEquals("Kodak SP4", result);
}
public void testDevice16() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-L720", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice17() throws Exception {
    final String result = DeviceNames.getDeviceName("X400", FALLBACK);
    Assert.assertEquals("Positivo X400", result);
}
public void testDevice18() throws Exception {
    final String result = DeviceNames.getDeviceName("M812C", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) M812C", result);
}
public void testDevice19() throws Exception {
    final String result = DeviceNames.getDeviceName("V917G", FALLBACK);
    Assert.assertEquals("ENVIZEN DIGITAL V917G", result);
}
public void testDevice20() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C105", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Zoom", result);
}
public void testDevice21() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C101", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Zoom", result);
}
public void testDevice22() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-S777C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice23() throws Exception {
    final String result = DeviceNames.getDeviceName("A51", FALLBACK);
    Assert.assertEquals("Oppo A51", result);
}
public void testDevice24() throws Exception {
    final String result = DeviceNames.getDeviceName("CT50", FALLBACK);
    Assert.assertEquals("Honeywell Dolphin CT50", result);
}
public void testDevice25() throws Exception {
    final String result = DeviceNames.getDeviceName("A54", FALLBACK);
    Assert.assertEquals("Micromax A54", result);
}
public void testDevice26() throws Exception {
    final String result = DeviceNames.getDeviceName("A57", FALLBACK);
    Assert.assertEquals("Micromax A57", result);
}
public void testDevice27() throws Exception {
    final String result = DeviceNames.getDeviceName("H30-T00", FALLBACK);
    Assert.assertEquals("Huawei H30-T00", result);
}
public void testDevice28() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F520S", FALLBACK);
    Assert.assertEquals("LGE AKA", result);
}
public void testDevice29() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z011D", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 Laser (ZE601KL)", result);
}
public void testDevice30() throws Exception {
    final String result = DeviceNames.getDeviceName("SOL21", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia VL", result);
}
public void testDevice31() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P920h", FALLBACK);
    Assert.assertEquals("LGE Optimus 3D", result);
}
public void testDevice32() throws Exception {
    final String result = DeviceNames.getDeviceName("V817", FALLBACK);
    Assert.assertEquals("ZTE V817", result);
}
public void testDevice33() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F520K", FALLBACK);
    Assert.assertEquals("LGE TBD", result);
}
public void testDevice34() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F520L", FALLBACK);
    Assert.assertEquals("LGE AKA", result);
}
public void testDevice35() throws Exception {
    final String result = DeviceNames.getDeviceName("E6560T", FALLBACK);
    Assert.assertEquals("Kyocera DuraForce", result);
}
public void testDevice36() throws Exception {
    final String result = DeviceNames.getDeviceName("P469", FALLBACK);
    Assert.assertEquals("Micromax Canvas Tabby", result);
}
public void testDevice37() throws Exception {
    final String result = DeviceNames.getDeviceName("E6560L", FALLBACK);
    Assert.assertEquals("Kyocera DuraForce", result);
}
public void testDevice38() throws Exception {
    final String result = DeviceNames.getDeviceName("E6560C", FALLBACK);
    Assert.assertEquals("Kyocera DuraForce", result);
}
public void testDevice39() throws Exception {
    final String result = DeviceNames.getDeviceName("C6943", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Z1", result);
}
public void testDevice40() throws Exception {
    final String result = DeviceNames.getDeviceName("IdeaTabA1000L-F", FALLBACK);
    Assert.assertEquals("Lenovo A1000L", result);
}
public void testDevice41() throws Exception {
    final String result = DeviceNames.getDeviceName("A5C", FALLBACK);
    Assert.assertEquals("TaiwanMobile A5C", result);
}
public void testDevice42() throws Exception {
    final String result = DeviceNames.getDeviceName("TM772", FALLBACK);
    Assert.assertEquals("Apex TM772", result);
}
public void testDevice43() throws Exception {
    final String result = DeviceNames.getDeviceName("MoovaShuffle", FALLBACK);
    Assert.assertEquals("Boost Moova Shuffle", result);
}
public void testDevice44() throws Exception {
    final String result = DeviceNames.getDeviceName("Y538", FALLBACK);
    Assert.assertEquals("Huawei UNION", result);
}
public void testDevice45() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E410f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice46() throws Exception {
    final String result = DeviceNames.getDeviceName("V8285", FALLBACK);
    Assert.assertEquals("ZTE V8285", result);
}
public void testDevice47() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-SU640", FALLBACK);
    Assert.assertEquals("LGE Optimus LTE", result);
}
public void testDevice48() throws Exception {
    final String result = DeviceNames.getDeviceName("SH530U", FALLBACK);
    Assert.assertEquals("Foxconn SH530U", result);
}
public void testDevice49() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N7505L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Neo", result);
}
public void testDevice50() throws Exception {
    final String result = DeviceNames.getDeviceName("7048A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Go PLAY", result);
}
public void testDevice51() throws Exception {
    final String result = DeviceNames.getDeviceName("KYOCERA-E6790", FALLBACK);
    Assert.assertEquals("Kyocera DuraForce XD", result);
}
public void testDevice52() throws Exception {
    final String result = DeviceNames.getDeviceName("7048X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Go PLAY", result);
}
public void testDevice53() throws Exception {
    final String result = DeviceNames.getDeviceName("Z120", FALLBACK);
    Assert.assertEquals("Acer Z120", result);
}
public void testDevice54() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R830", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Axiom", result);
}
public void testDevice55() throws Exception {
    final String result = DeviceNames.getDeviceName("7048S", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Go PLAY", result);
}
public void testDevice56() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P555K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice57() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P555L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice58() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P555M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice59() throws Exception {
    final String result = DeviceNames.getDeviceName("E6833", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5 Premium Dual", result);
}
public void testDevice60() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P555C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice61() throws Exception {
    final String result = DeviceNames.getDeviceName("R827T", FALLBACK);
    Assert.assertEquals("OPPO R827T", result);
}
public void testDevice62() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P555Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice63() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P555S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice64() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-MS695", FALLBACK);
    Assert.assertEquals("LGE LG OPTIMUS M+", result);
}
public void testDevice65() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7392", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Duos", result);
}
public void testDevice66() throws Exception {
    final String result = DeviceNames.getDeviceName("TBDG1073", FALLBACK);
    Assert.assertEquals("Zeki TBDG1073", result);
}
public void testDevice67() throws Exception {
    final String result = DeviceNames.getDeviceName("V2_Viper", FALLBACK);
    Assert.assertEquals("AllView V2 Viper", result);
}
public void testDevice68() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1564", FALLBACK);
    Assert.assertEquals("Motorola Droid Maxx 2", result);
}
public void testDevice69() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1565", FALLBACK);
    Assert.assertEquals("Motorola Droid Maxx 2", result);
}
public void testDevice70() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1563", FALLBACK);
    Assert.assertEquals("Motorola Moto X Play", result);
}
public void testDevice71() throws Exception {
    final String result = DeviceNames.getDeviceName("G630-U251", FALLBACK);
    Assert.assertEquals("Huawei G630-U251", result);
}
public void testDevice72() throws Exception {
    final String result = DeviceNames.getDeviceName("Indigo", FALLBACK);
    Assert.assertEquals("Explay Indigo", result);
}
public void testDevice73() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9108V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice74() throws Exception {
    final String result = DeviceNames.getDeviceName("Luno", FALLBACK);
    Assert.assertEquals("Orange Luno", result);
}
public void testDevice75() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-C550", FALLBACK);
    Assert.assertEquals("LGE Optimus Chat", result);
}
public void testDevice76() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-C555", FALLBACK);
    Assert.assertEquals("LGE Optimus Chat", result);
}
public void testDevice77() throws Exception {
    final String result = DeviceNames.getDeviceName("Z787", FALLBACK);
    Assert.assertEquals("ZTE Z787", result);
}
public void testDevice78() throws Exception {
    final String result = DeviceNames.getDeviceName("SHF31", FALLBACK);
    Assert.assertEquals("Sharp AQUOS K SHF31", result);
}
public void testDevice79() throws Exception {
    final String result = DeviceNames.getDeviceName("SHF32", FALLBACK);
    Assert.assertEquals("Sharp AQUOS K SHF32", result);
}
public void testDevice80() throws Exception {
    final String result = DeviceNames.getDeviceName("S_plus", FALLBACK);
    Assert.assertEquals("Gionee S plus", result);
}
public void testDevice81() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H440AR", FALLBACK);
    Assert.assertEquals("LGE LG Spirit LTE", result);
}
public void testDevice82() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire_320", FALLBACK);
    Assert.assertEquals("HTC Desire320", result);
}
public void testDevice83() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P768", FALLBACK);
    Assert.assertEquals("LG Optimus L9", result);
}
public void testDevice84() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P769", FALLBACK);
    Assert.assertEquals("LG Optimus L9", result);
}
public void testDevice85() throws Exception {
    final String result = DeviceNames.getDeviceName("VK700", FALLBACK);
    Assert.assertEquals("LGE G Pad 10.1 LTE", result);
}
public void testDevice86() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P760", FALLBACK);
    Assert.assertEquals("LG Optimus L9", result);
}
public void testDevice87() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P765", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L9", result);
}
public void testDevice88() throws Exception {
    final String result = DeviceNames.getDeviceName("MTN-E70", FALLBACK);
    Assert.assertEquals("MTN-E70", result);
}
public void testDevice89() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7109G", FALLBACK);
    Assert.assertEquals("Proscan PLT7109G", result);
}
public void testDevice90() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-04D", FALLBACK);
    Assert.assertEquals("Sharp Q-pot.Phone SH-04D", result);
}
public void testDevice91() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-04E", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE EX SH-04E", result);
}
public void testDevice92() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-04F", FALLBACK);
    Assert.assertEquals("Sharp AQUOS ZETA SH-04F", result);
}
public void testDevice93() throws Exception {
    final String result = DeviceNames.getDeviceName("PX3000", FALLBACK);
    Assert.assertEquals("Hisense PX3000", result);
}
public void testDevice94() throws Exception {
    final String result = DeviceNames.getDeviceName("LCD-LX565A", FALLBACK);
    Assert.assertEquals("Sharp LCD-LX565A", result);
}
public void testDevice95() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_PH39100", FALLBACK);
    Assert.assertEquals("HTC Vivid 4G", result);
}
public void testDevice96() throws Exception {
    final String result = DeviceNames.getDeviceName("L7", FALLBACK);
    Assert.assertEquals("Camelus L7", result);
}
public void testDevice97() throws Exception {
    final String result = DeviceNames.getDeviceName("L9", FALLBACK);
    Assert.assertEquals("Polaroid L9", result);
}
public void testDevice98() throws Exception {
    final String result = DeviceNames.getDeviceName("RubikII7", FALLBACK);
    Assert.assertEquals("Plaisio Rubik-II", result);
}
public void testDevice99() throws Exception {
    final String result = DeviceNames.getDeviceName("H8_Life", FALLBACK);
    Assert.assertEquals("AllView Viva H8 Life", result);
}
public void testDevice100() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV31", FALLBACK);
    Assert.assertEquals("Sharp AQUOS SERIE mini SHV31", result);
}
public void testDevice101() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV33", FALLBACK);
    Assert.assertEquals("Sharp AQUOS Compact SHV33", result);
}
public void testDevice102() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV32", FALLBACK);
    Assert.assertEquals("Sharp AQUOS SERIE SHV32", result);
}
public void testDevice103() throws Exception {
    final String result = DeviceNames.getDeviceName("GN9010", FALLBACK);
    Assert.assertEquals("Gionee S6", result);
}
public void testDevice104() throws Exception {
    final String result = DeviceNames.getDeviceName("TI320-DU", FALLBACK);
    Assert.assertEquals("LGUplus TV G", result);
}
public void testDevice105() throws Exception {
    final String result = DeviceNames.getDeviceName("LED46K360J", FALLBACK);
    Assert.assertEquals("Hisense LED46K360J", result);
}
public void testDevice106() throws Exception {
    final String result = DeviceNames.getDeviceName("Hit", FALLBACK);
    Assert.assertEquals("Explay Hit", result);
}
public void testDevice107() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM206SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE Xx 206SH", result);
}
public void testDevice108() throws Exception {
    final String result = DeviceNames.getDeviceName("HW-03E", FALLBACK);
    Assert.assertEquals("Huawei HW-03E", result);
}
public void testDevice109() throws Exception {
    final String result = DeviceNames.getDeviceName("b1-720", FALLBACK);
    Assert.assertEquals("Acer B1-720", result);
}
public void testDevice110() throws Exception {
    final String result = DeviceNames.getDeviceName("VSP355g", FALLBACK);
    Assert.assertEquals("Vestel VSP355g", result);
}
public void testDevice111() throws Exception {
    final String result = DeviceNames.getDeviceName("M811", FALLBACK);
    Assert.assertEquals("CMCC M811", result);
}
public void testDevice112() throws Exception {
    final String result = DeviceNames.getDeviceName("VSP355s", FALLBACK);
    Assert.assertEquals("Vestel VSP355s", result);
}
public void testDevice113() throws Exception {
    final String result = DeviceNames.getDeviceName("Telenor_One_Touch_C", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 985", result);
}
public void testDevice114() throws Exception {
    final String result = DeviceNames.getDeviceName("PRO10D", FALLBACK);
    Assert.assertEquals("Prestige PRO10D", result);
}
public void testDevice115() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-AS780", FALLBACK);
    Assert.assertEquals("LGE LG Optimus F7", result);
}
public void testDevice116() throws Exception {
    final String result = DeviceNames.getDeviceName("PRO5043", FALLBACK);
    Assert.assertEquals("Polaroid PRO5043", result);
}
public void testDevice117() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M500W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 8.0", result);
}
public void testDevice118() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I959", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice119() throws Exception {
    final String result = DeviceNames.getDeviceName("MotoA953", FALLBACK);
    Assert.assertEquals("Motorola Milestone2", result);
}
public void testDevice120() throws Exception {
    final String result = DeviceNames.getDeviceName("F5180", FALLBACK);
    Assert.assertEquals("Hisense F5180", result);
}
public void testDevice121() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000010-N", FALLBACK);
    Assert.assertEquals("NEC LifeTouch Note", result);
}
public void testDevice122() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55K370", FALLBACK);
    Assert.assertEquals("Hisense LED55K370", result);
}
public void testDevice123() throws Exception {
    final String result = DeviceNames.getDeviceName("NX507J", FALLBACK);
    Assert.assertEquals("ZTE NX507J", result);
}
public void testDevice124() throws Exception {
    final String result = DeviceNames.getDeviceName("NX507H", FALLBACK);
    Assert.assertEquals("ZTE NX507J", result);
}
public void testDevice125() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T561Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 9.6", result);
}
public void testDevice126() throws Exception {
    final String result = DeviceNames.getDeviceName("Winner", FALLBACK);
    Assert.assertEquals("Explay Winner", result);
}
public void testDevice127() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55XT810X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED55XT810X3DU", result);
}
public void testDevice128() throws Exception {
    final String result = DeviceNames.getDeviceName("MD210", FALLBACK);
    Assert.assertEquals("Haier MD210", result);
}
public void testDevice129() throws Exception {
    final String result = DeviceNames.getDeviceName("DA222HQL", FALLBACK);
    Assert.assertEquals("Acer DA222HQL", result);
}
public void testDevice130() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T561M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 9.6", result);
}
public void testDevice131() throws Exception {
    final String result = DeviceNames.getDeviceName("DA221HQL", FALLBACK);
    Assert.assertEquals("Acer DA221HQL", result);
}
public void testDevice132() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D693", FALLBACK);
    Assert.assertEquals("LGE G3 Stylus", result);
}
public void testDevice133() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D690", FALLBACK);
    Assert.assertEquals("LGE G Vista", result);
}
public void testDevice134() throws Exception {
    final String result = DeviceNames.getDeviceName("ZKB2A", FALLBACK);
    Assert.assertEquals("ZTE Spro 2", result);
}
public void testDevice135() throws Exception {
    final String result = DeviceNames.getDeviceName("X55", FALLBACK);
    Assert.assertEquals("Ashna X55", result);
}
public void testDevice136() throws Exception {
    final String result = DeviceNames.getDeviceName("U708", FALLBACK);
    Assert.assertEquals("OPPO U708", result);
}
public void testDevice137() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7102T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice138() throws Exception {
    final String result = DeviceNames.getDeviceName("NX601J", FALLBACK);
    Assert.assertEquals("ZTE NX601J", result);
}
public void testDevice139() throws Exception {
    final String result = DeviceNames.getDeviceName("Infinix-X552", FALLBACK);
    Assert.assertEquals("INFINIX-X552", result);
}
public void testDevice140() throws Exception {
    final String result = DeviceNames.getDeviceName("Infinix-X551", FALLBACK);
    Assert.assertEquals("Infinix HOT NOTE", result);
}
public void testDevice141() throws Exception {
    final String result = DeviceNames.getDeviceName("N860", FALLBACK);
    Assert.assertEquals("ZTE Warp N860", result);
}
public void testDevice142() throws Exception {
    final String result = DeviceNames.getDeviceName("N861", FALLBACK);
    Assert.assertEquals("ZTE N861", result);
}
public void testDevice143() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M180K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice144() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M180L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice145() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-VS700", FALLBACK);
    Assert.assertEquals("LGE LG Enlighten", result);
}
public void testDevice146() throws Exception {
    final String result = DeviceNames.getDeviceName("HUAWEI-M835", FALLBACK);
    Assert.assertEquals("Huawei M835", result);
}
public void testDevice147() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-10DTB4", FALLBACK);
    Assert.assertEquals("Haier HS-10DTB4", result);
}
public void testDevice148() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M180S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice149() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-10DTB8", FALLBACK);
    Assert.assertEquals("Hipstreet HS-10DTB8", result);
}
public void testDevice150() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M180W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice151() throws Exception {
    final String result = DeviceNames.getDeviceName("VS840PP", FALLBACK);
    Assert.assertEquals("LGE LG Lucid", result);
}
public void testDevice152() throws Exception {
    final String result = DeviceNames.getDeviceName("Sonic", FALLBACK);
    Assert.assertEquals("Mobicell Mobicel", result);
}
public void testDevice153() throws Exception {
    final String result = DeviceNames.getDeviceName("L-07C", FALLBACK);
    Assert.assertEquals("LGE Marquee", result);
}
public void testDevice154() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR8995", FALLBACK);
    Assert.assertEquals("Pantech Apache", result);
}
public void testDevice155() throws Exception {
    final String result = DeviceNames.getDeviceName("T705/T708", FALLBACK);
    Assert.assertEquals("Positivo T705", result);
}
public void testDevice156() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-GW620", FALLBACK);
    Assert.assertEquals("LGE Eve", result);
}
public void testDevice157() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-MS770", FALLBACK);
    Assert.assertEquals("LG Motion 4G", result);
}
public void testDevice158() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice159() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice160() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice161() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice162() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice163() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice164() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice165() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice166() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice167() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice168() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC6525LVW", FALLBACK);
    Assert.assertEquals("HTC One M8", result);
}
public void testDevice169() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice170() throws Exception {
    final String result = DeviceNames.getDeviceName("TOM007", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) P688L", result);
}
public void testDevice171() throws Exception {
    final String result = DeviceNames.getDeviceName("N5L", FALLBACK);
    Assert.assertEquals("NUU N5L", result);
}
public void testDevice172() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K360J", FALLBACK);
    Assert.assertEquals("Hisense LED42K360J", result);
}
public void testDevice173() throws Exception {
    final String result = DeviceNames.getDeviceName("LT18a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia arc S", result);
}
public void testDevice174() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G860P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Sport", result);
}
public void testDevice175() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E110S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice176() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50G05", FALLBACK);
    Assert.assertEquals("Hisense LED50G05", result);
}
public void testDevice177() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_0P6A1", FALLBACK);
    Assert.assertEquals("HTC Desire 300", result);
}
public void testDevice178() throws Exception {
    final String result = DeviceNames.getDeviceName("Z667", FALLBACK);
    Assert.assertEquals("ZTE Z667", result);
}
public void testDevice179() throws Exception {
    final String result = DeviceNames.getDeviceName("CK07T", FALLBACK);
    Assert.assertEquals("ClickN Kids", result);
}
public void testDevice180() throws Exception {
    final String result = DeviceNames.getDeviceName("QUANTUM_400_LITE", FALLBACK);
    Assert.assertEquals("GoClever QUANTUM 400 LITE", result);
}
public void testDevice181() throws Exception {
    final String result = DeviceNames.getDeviceName("V769M", FALLBACK);
    Assert.assertEquals("ZTE V769M", result);
}
public void testDevice182() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E460f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice183() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7320", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice184() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-GN120", FALLBACK);
    Assert.assertEquals("Samsung Galaxy NX", result);
}
public void testDevice185() throws Exception {
    final String result = DeviceNames.getDeviceName("AT7-A", FALLBACK);
    Assert.assertEquals("Toshiba AT7-A", result);
}
public void testDevice186() throws Exception {
    final String result = DeviceNames.getDeviceName("800P31C", FALLBACK);
    Assert.assertEquals("Mecer 800P31C", result);
}
public void testDevice187() throws Exception {
    final String result = DeviceNames.getDeviceName("N5110", FALLBACK);
    Assert.assertEquals("Oppo N5110", result);
}
public void testDevice188() throws Exception {
    final String result = DeviceNames.getDeviceName("N5111", FALLBACK);
    Assert.assertEquals("Oppo N1 mimi", result);
}
public void testDevice189() throws Exception {
    final String result = DeviceNames.getDeviceName("N5116", FALLBACK);
    Assert.assertEquals("Oppo N1 mimi", result);
}
public void testDevice190() throws Exception {
    final String result = DeviceNames.getDeviceName("N5117", FALLBACK);
    Assert.assertEquals("Oppo N5117", result);
}
public void testDevice191() throws Exception {
    final String result = DeviceNames.getDeviceName("SMARTTVBOX", FALLBACK);
    Assert.assertEquals("Panasonic SmartTVBox", result);
}
public void testDevice192() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9208", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice193() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9200", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice194() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I997R", FALLBACK);
    Assert.assertEquals("Samsung Infuse", result);
}
public void testDevice195() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7100T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice196() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9205", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice197() throws Exception {
    final String result = DeviceNames.getDeviceName("GN8001", FALLBACK);
    Assert.assertEquals("Gionee GN8001", result);
}
public void testDevice198() throws Exception {
    final String result = DeviceNames.getDeviceName("U9180", FALLBACK);
    Assert.assertEquals("ZTE U9180", result);
}
public void testDevice199() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL86C", FALLBACK);
    Assert.assertEquals("LGE Optimus Core", result);
}
public void testDevice200() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3586V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Lite", result);
}
public void testDevice201() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M920", FALLBACK);
    Assert.assertEquals("Samsung Transform", result);
}
public void testDevice202() throws Exception {
    final String result = DeviceNames.getDeviceName("vision2_5", FALLBACK);
    Assert.assertEquals("Hisense Vision 2.5", result);
}
public void testDevice203() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-C800", FALLBACK);
    Assert.assertEquals("LG myTouch Q", result);
}
public void testDevice204() throws Exception {
    final String result = DeviceNames.getDeviceName("NX785QC8G", FALLBACK);
    Assert.assertEquals("Nextbook NX785QC8G", result);
}
public void testDevice205() throws Exception {
    final String result = DeviceNames.getDeviceName("Rise", FALLBACK);
    Assert.assertEquals("Kyocera Rise", result);
}
public void testDevice206() throws Exception {
    final String result = DeviceNames.getDeviceName("SHARP-ADS1", FALLBACK);
    Assert.assertEquals("Sharp ADS1", result);
}
public void testDevice207() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT9650G", FALLBACK);
    Assert.assertEquals("Proscan PLT9650G", result);
}
public void testDevice208() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I545", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice209() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H961S", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice210() throws Exception {
    final String result = DeviceNames.getDeviceName("9DTB38", FALLBACK);
    Assert.assertEquals("Hipstreet 9DTB38", result);
}
public void testDevice211() throws Exception {
    final String result = DeviceNames.getDeviceName("9DTB39", FALLBACK);
    Assert.assertEquals("Hipstreet 9DTB39", result);
}
public void testDevice212() throws Exception {
    final String result = DeviceNames.getDeviceName("SUGAR", FALLBACK);
    Assert.assertEquals("Sugar", result);
}
public void testDevice213() throws Exception {
    final String result = DeviceNames.getDeviceName("Winner7", FALLBACK);
    Assert.assertEquals("Explay Winner 7", result);
}
public void testDevice214() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H961N", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice215() throws Exception {
    final String result = DeviceNames.getDeviceName("PantechP8000", FALLBACK);
    Assert.assertEquals("Pantech Crossover", result);
}
public void testDevice216() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P490L", FALLBACK);
    Assert.assertEquals("LGE LG G Pad 8.0 LTE", result);
}
public void testDevice217() throws Exception {
    final String result = DeviceNames.getDeviceName("D2005", FALLBACK);
    Assert.assertEquals("Sony Xperia E1", result);
}
public void testDevice218() throws Exception {
    final String result = DeviceNames.getDeviceName("D2004", FALLBACK);
    Assert.assertEquals("Sony Xperia E1", result);
}
public void testDevice219() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-LINK", FALLBACK);
    Assert.assertEquals("ZTE Racer", result);
}
public void testDevice220() throws Exception {
    final String result = DeviceNames.getDeviceName("PI7000", FALLBACK);
    Assert.assertEquals("Philips T8 PI7000", result);
}
public void testDevice221() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7500W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Plus", result);
}
public void testDevice222() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7500T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Plus", result);
}
public void testDevice223() throws Exception {
    final String result = DeviceNames.getDeviceName("V8110", FALLBACK);
    Assert.assertEquals("ZTE V8110", result);
}
public void testDevice224() throws Exception {
    final String result = DeviceNames.getDeviceName("PI2010", FALLBACK);
    Assert.assertEquals("Philips PI2010", result);
}
public void testDevice225() throws Exception {
    final String result = DeviceNames.getDeviceName("PI2011", FALLBACK);
    Assert.assertEquals("Philips PI2011", result);
}
public void testDevice226() throws Exception {
    final String result = DeviceNames.getDeviceName("SHL21", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SERIE SHL21", result);
}
public void testDevice227() throws Exception {
    final String result = DeviceNames.getDeviceName("SHL22", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE  SERIE SHL22", result);
}
public void testDevice228() throws Exception {
    final String result = DeviceNames.getDeviceName("SHL23", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE  SERIE SHL23", result);
}
public void testDevice229() throws Exception {
    final String result = DeviceNames.getDeviceName("EB-A71GJ", FALLBACK);
    Assert.assertEquals("Sharp EB-A71GJ", result);
}
public void testDevice230() throws Exception {
    final String result = DeviceNames.getDeviceName("SHL25", FALLBACK);
    Assert.assertEquals("Sharp AQUOS SERIE SHL25", result);
}
public void testDevice231() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7500L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Plus", result);
}
public void testDevice232() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7108D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice233() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K560X3D", FALLBACK);
    Assert.assertEquals("Hisense LED42K560X3D", result);
}
public void testDevice234() throws Exception {
    final String result = DeviceNames.getDeviceName("PTAB751", FALLBACK);
    Assert.assertEquals("Polaroid PTAB751", result);
}
public void testDevice235() throws Exception {
    final String result = DeviceNames.getDeviceName("IGGY", FALLBACK);
    Assert.assertEquals("WIKO IGGY", result);
}
public void testDevice236() throws Exception {
    final String result = DeviceNames.getDeviceName("CHM-U01", FALLBACK);
    Assert.assertEquals("Huawei CHM-U01", result);
}
public void testDevice237() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-RM02", FALLBACK);
    Assert.assertEquals("Sharp AQUOS SH-RM02", result);
}
public void testDevice238() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I537", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Active", result);
}
public void testDevice239() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I827", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Appeal", result);
}
public void testDevice240() throws Exception {
    final String result = DeviceNames.getDeviceName("C6616", FALLBACK);
    Assert.assertEquals("Sony Xperia Z", result);
}
public void testDevice241() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313U", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace 4 Lite", result);
}
public void testDevice242() throws Exception {
    final String result = DeviceNames.getDeviceName("E6853", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5 Premium", result);
}
public void testDevice243() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-9DTB7A", FALLBACK);
    Assert.assertEquals("Hipstreet HS-9DTB7A", result);
}
public void testDevice244() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM103SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SoftBank 103SH", result);
}
public void testDevice245() throws Exception {
    final String result = DeviceNames.getDeviceName("F-07E", FALLBACK);
    Assert.assertEquals("Fujitsu Disney Mobile on docomo F-07E", result);
}
public void testDevice246() throws Exception {
    final String result = DeviceNames.getDeviceName("F-07D", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS mu F-07D", result);
}
public void testDevice247() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP561", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2 Tablet", result);
}
public void testDevice248() throws Exception {
    final String result = DeviceNames.getDeviceName("HWT31", FALLBACK);
    Assert.assertEquals("Huawei HWT31", result);
}
public void testDevice249() throws Exception {
    final String result = DeviceNames.getDeviceName("F-074", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS mu F-07D", result);
}
public void testDevice250() throws Exception {
    final String result = DeviceNames.getDeviceName("vsi8q_1", FALLBACK);
    Assert.assertEquals("ViewSonic ViewPadi8Q", result);
}
public void testDevice251() throws Exception {
    final String result = DeviceNames.getDeviceName("V1_Viper_I4G", FALLBACK);
    Assert.assertEquals("AllView V1 Viper I4G", result);
}
public void testDevice252() throws Exception {
    final String result = DeviceNames.getDeviceName("Tab2A7-20F", FALLBACK);
    Assert.assertEquals("Lenovo TAB 2 A7-20F", result);
}
public void testDevice253() throws Exception {
    final String result = DeviceNames.getDeviceName("GS-918", FALLBACK);
    Assert.assertEquals("DOPO GS-918", result);
}
public void testDevice254() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1098", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice255() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T966", FALLBACK);
    Assert.assertEquals("Hisense HS-T966", result);
}
public void testDevice256() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T967", FALLBACK);
    Assert.assertEquals("Hisense HS-T967", result);
}
public void testDevice257() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T968", FALLBACK);
    Assert.assertEquals("Hisense HS-T968", result);
}
public void testDevice258() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1093", FALLBACK);
    Assert.assertEquals("Motorola MOTO X", result);
}
public void testDevice259() throws Exception {
    final String result = DeviceNames.getDeviceName("QH-10", FALLBACK);
    Assert.assertEquals("Huawei T102", result);
}
public void testDevice260() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1096", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice261() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1097", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice262() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1094", FALLBACK);
    Assert.assertEquals("Motorola MOTO X", result);
}
public void testDevice263() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1095", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice264() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-58UE1H", FALLBACK);
    Assert.assertEquals("Sharp LC-58UE1H", result);
}
public void testDevice265() throws Exception {
    final String result = DeviceNames.getDeviceName("DL900", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) DL900", result);
}
public void testDevice266() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-58UE1M", FALLBACK);
    Assert.assertEquals("Sharp LC-58UE1M", result);
}
public void testDevice267() throws Exception {
    final String result = DeviceNames.getDeviceName("T785B", FALLBACK);
    Assert.assertEquals("Haier T785B", result);
}
public void testDevice268() throws Exception {
    final String result = DeviceNames.getDeviceName("C5120", FALLBACK);
    Assert.assertEquals("Kyocera Milano", result);
}
public void testDevice269() throws Exception {
    final String result = DeviceNames.getDeviceName("C5121", FALLBACK);
    Assert.assertEquals("Kyocera Milano", result);
}
public void testDevice270() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3456DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3456DUO", result);
}
public void testDevice271() throws Exception {
    final String result = DeviceNames.getDeviceName("Zero_Spin", FALLBACK);
    Assert.assertEquals("Vitsmo Zero Spin", result);
}
public void testDevice272() throws Exception {
    final String result = DeviceNames.getDeviceName("FJJB091", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS mu F-07D", result);
}
public void testDevice273() throws Exception {
    final String result = DeviceNames.getDeviceName("Ideos", FALLBACK);
    Assert.assertEquals("Huawei IDEOS", result);
}
public void testDevice274() throws Exception {
    final String result = DeviceNames.getDeviceName("PAD1021", FALLBACK);
    Assert.assertEquals("Haier PAD1021", result);
}
public void testDevice275() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire_300", FALLBACK);
    Assert.assertEquals("HTC Desire 300", result);
}
public void testDevice276() throws Exception {
    final String result = DeviceNames.getDeviceName("H882L", FALLBACK);
    Assert.assertEquals("Huawei H882L", result);
}
public void testDevice277() throws Exception {
    final String result = DeviceNames.getDeviceName("titan_retbr_dstv", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice278() throws Exception {
    final String result = DeviceNames.getDeviceName("E6782", FALLBACK);
    Assert.assertEquals("Kyocera Brigadier", result);
}
public void testDevice279() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P6800", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.7", result);
}
public void testDevice280() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_E10310", FALLBACK);
    Assert.assertEquals("Lenovo LIFETAB E10310", result);
}
public void testDevice281() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_E10316", FALLBACK);
    Assert.assertEquals("Medion LIFETAB E10316", result);
}
public void testDevice282() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P6200", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0 Plus", result);
}
public void testDevice283() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P6201", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0 Plus", result);
}
public void testDevice284() throws Exception {
    final String result = DeviceNames.getDeviceName("P01T_1", FALLBACK);
    Assert.assertEquals("Asus ZenPad 10 (Z300CL)", result);
}
public void testDevice285() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7130G", FALLBACK);
    Assert.assertEquals("Proscan PLT7130G", result);
}
public void testDevice286() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U98", FALLBACK);
    Assert.assertEquals("Hisense HS-U98", result);
}
public void testDevice287() throws Exception {
    final String result = DeviceNames.getDeviceName("AV7", FALLBACK);
    Assert.assertEquals("AV7", result);
}
public void testDevice288() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N916S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice289() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N916L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice290() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N916K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice291() throws Exception {
    final String result = DeviceNames.getDeviceName("7048W", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Go PLAY", result);
}
public void testDevice292() throws Exception {
    final String result = DeviceNames.getDeviceName("A110Q", FALLBACK);
    Assert.assertEquals("Micromax CANVAS 2 PLUS", result);
}
public void testDevice293() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A700S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice294() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLS996", FALLBACK);
    Assert.assertEquals("LGE LG G Flex2", result);
}
public void testDevice295() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLS991", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice296() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLS990", FALLBACK);
    Assert.assertEquals("LG G3", result);
}
public void testDevice297() throws Exception {
    final String result = DeviceNames.getDeviceName("Z850", FALLBACK);
    Assert.assertEquals("ZTE Z850", result);
}
public void testDevice298() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A700F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice299() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50K660X3D", FALLBACK);
    Assert.assertEquals("Hisense LED50K660X3D", result);
}
public void testDevice300() throws Exception {
    final String result = DeviceNames.getDeviceName("Z500", FALLBACK);
    Assert.assertEquals("Acer Liquid Z500", result);
}
public void testDevice301() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A700K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice302() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A700H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice303() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A700L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice304() throws Exception {
    final String result = DeviceNames.getDeviceName("PRO5023", FALLBACK);
    Assert.assertEquals("Polaroid Phantom 5", result);
}
public void testDevice305() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A7000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice306() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-02F", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE EX SH-02F", result);
}
public void testDevice307() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-02G", FALLBACK);
    Assert.assertEquals("Sharp Disney Mobile on docomo SH-02G", result);
}
public void testDevice308() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-02D", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE slider SH-02D", result);
}
public void testDevice309() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-02E", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE ZETA SH-02E", result);
}
public void testDevice310() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-02H", FALLBACK);
    Assert.assertEquals("Sharp AQUOS Compact SH-02H", result);
}
public void testDevice311() throws Exception {
    final String result = DeviceNames.getDeviceName("KYY24", FALLBACK);
    Assert.assertEquals("Kyocera TORQUE G01", result);
}
public void testDevice312() throws Exception {
    final String result = DeviceNames.getDeviceName("KYY22", FALLBACK);
    Assert.assertEquals("Kyocera URBANO L02", result);
}
public void testDevice313() throws Exception {
    final String result = DeviceNames.getDeviceName("KYY23", FALLBACK);
    Assert.assertEquals("Kyocera URBANO L03", result);
}
public void testDevice314() throws Exception {
    final String result = DeviceNames.getDeviceName("Trio-Stealth-G4-7.85", FALLBACK);
    Assert.assertEquals("Trio-Stealth-G4-7.85", result);
}
public void testDevice315() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G720AX", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Max", result);
}
public void testDevice316() throws Exception {
    final String result = DeviceNames.getDeviceName("PNDPP44Q7GPBLK", FALLBACK);
    Assert.assertEquals("Haier PNDPP44Q7GPBLK", result);
}
public void testDevice317() throws Exception {
    final String result = DeviceNames.getDeviceName("X06HT", FALLBACK);
    Assert.assertEquals("HTC Desire", result);
}
public void testDevice318() throws Exception {
    final String result = DeviceNames.getDeviceName("DM009SH", FALLBACK);
    Assert.assertEquals("Sharp DM009SH", result);
}
public void testDevice319() throws Exception {
    final String result = DeviceNames.getDeviceName("NX505J", FALLBACK);
    Assert.assertEquals("ZTE NX505J", result);
}
public void testDevice320() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T567V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 9.6", result);
}
public void testDevice321() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-GH1", FALLBACK);
    Assert.assertEquals("Samsung IceTouch", result);
}
public void testDevice322() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T968S", FALLBACK);
    Assert.assertEquals("Hisense HS-T968S", result);
}
public void testDevice323() throws Exception {
    final String result = DeviceNames.getDeviceName("B15", FALLBACK);
    Assert.assertEquals("CAT B15", result);
}
public void testDevice324() throws Exception {
    final String result = DeviceNames.getDeviceName("Viva_i7G", FALLBACK);
    Assert.assertEquals("AllView Viva i7G", result);
}
public void testDevice325() throws Exception {
    final String result = DeviceNames.getDeviceName("DM-01G", FALLBACK);
    Assert.assertEquals("LGE DM-01G", result);
}
public void testDevice326() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915T3", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice327() throws Exception {
    final String result = DeviceNames.getDeviceName("X75", FALLBACK);
    Assert.assertEquals("QMobile X75", result);
}
public void testDevice328() throws Exception {
    final String result = DeviceNames.getDeviceName("ST27i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia go", result);
}
public void testDevice329() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-MS690", FALLBACK);
    Assert.assertEquals("LGE Optimus One", result);
}
public void testDevice330() throws Exception {
    final String result = DeviceNames.getDeviceName("ST27a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Go", result);
}
public void testDevice331() throws Exception {
    final String result = DeviceNames.getDeviceName("E3_Living", FALLBACK);
    Assert.assertEquals("AllView E3 Living", result);
}
public void testDevice332() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7390", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Lite", result);
}
public void testDevice333() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H631MX", FALLBACK);
    Assert.assertEquals("LGE LG G Stylo", result);
}
public void testDevice334() throws Exception {
    final String result = DeviceNames.getDeviceName("TM105", FALLBACK);
    Assert.assertEquals("Gigabyte TM105", result);
}
public void testDevice335() throws Exception {
    final String result = DeviceNames.getDeviceName("X8607", FALLBACK);
    Assert.assertEquals("ZTE Blade L3", result);
}
public void testDevice336() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360GY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice337() throws Exception {
    final String result = DeviceNames.getDeviceName("M220", FALLBACK);
    Assert.assertEquals("Huawei M220", result);
}
public void testDevice338() throws Exception {
    final String result = DeviceNames.getDeviceName("D6683", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3 Dual", result);
}
public void testDevice339() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T800X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice340() throws Exception {
    final String result = DeviceNames.getDeviceName("A240", FALLBACK);
    Assert.assertEquals("Micromax A240", result);
}
public void testDevice341() throws Exception {
    final String result = DeviceNames.getDeviceName("ONE_TOUCH_PIXI3D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4)", result);
}
public void testDevice342() throws Exception {
    final String result = DeviceNames.getDeviceName("PLK-CL00", FALLBACK);
    Assert.assertEquals("Huawei PLK-CL00", result);
}
public void testDevice343() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U609", FALLBACK);
    Assert.assertEquals("Hisense U609", result);
}
public void testDevice344() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U978", FALLBACK);
    Assert.assertEquals("Hisense HS-U978", result);
}
public void testDevice345() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I497", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 10.1", result);
}
public void testDevice346() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U602", FALLBACK);
    Assert.assertEquals("Hisense U602", result);
}
public void testDevice347() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_0P9C2", FALLBACK);
    Assert.assertEquals("HTC Desire 816", result);
}
public void testDevice348() throws Exception {
    final String result = DeviceNames.getDeviceName("LE43B7600A", FALLBACK);
    Assert.assertEquals("Haier LE43B7600A", result);
}
public void testDevice349() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U601", FALLBACK);
    Assert.assertEquals("Hisense HS-U601", result);
}
public void testDevice350() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U606", FALLBACK);
    Assert.assertEquals("Hisense U606AE", result);
}
public void testDevice351() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U971", FALLBACK);
    Assert.assertEquals("Hisense HS-U971", result);
}
public void testDevice352() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5500B", FALLBACK);
    Assert.assertEquals("Samsung Europa", result);
}
public void testDevice353() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P555", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice354() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P550", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice355() throws Exception {
    final String result = DeviceNames.getDeviceName("SpiceMi-449", FALLBACK);
    Assert.assertEquals("Spice Smart Flo Mi-449", result);
}
public void testDevice356() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H900", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice357() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H901", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice358() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5500L", FALLBACK);
    Assert.assertEquals("Samsung Europa", result);
}
public void testDevice359() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5500M", FALLBACK);
    Assert.assertEquals("Samsung Europa", result);
}
public void testDevice360() throws Exception {
    final String result = DeviceNames.getDeviceName("UTA200", FALLBACK);
    Assert.assertEquals("SK Telesys UTA200", result);
}
public void testDevice361() throws Exception {
    final String result = DeviceNames.getDeviceName("X500", FALLBACK);
    Assert.assertEquals("ZTE X500", result);
}
public void testDevice362() throws Exception {
    final String result = DeviceNames.getDeviceName("V360", FALLBACK);
    Assert.assertEquals("Acer Liquid E1", result);
}
public void testDevice363() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K360J", FALLBACK);
    Assert.assertEquals("Hisense LED32K360J", result);
}
public void testDevice364() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3508J", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend3", result);
}
public void testDevice365() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V500", FALLBACK);
    Assert.assertEquals("LGE LG G Pad 8.3", result);
}
public void testDevice366() throws Exception {
    final String result = DeviceNames.getDeviceName("R833T", FALLBACK);
    Assert.assertEquals("Oppo R833T", result);
}
public void testDevice367() throws Exception {
    final String result = DeviceNames.getDeviceName("EGD172", FALLBACK);
    Assert.assertEquals("Ematic EGD172", result);
}
public void testDevice368() throws Exception {
    final String result = DeviceNames.getDeviceName("N-08D", FALLBACK);
    Assert.assertEquals("NEC MEDIAS TAB UL N-08D", result);
}
public void testDevice369() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6293W23", FALLBACK);
    Assert.assertEquals("RCA RCT6293W23", result);
}
public void testDevice370() throws Exception {
    final String result = DeviceNames.getDeviceName("Cosmic", FALLBACK);
    Assert.assertEquals("Explay Cosmic", result);
}
public void testDevice371() throws Exception {
    final String result = DeviceNames.getDeviceName("Next7D12", FALLBACK);
    Assert.assertEquals("Anydata Nextbook Next7D12 Tablet", result);
}
public void testDevice372() throws Exception {
    final String result = DeviceNames.getDeviceName("X50D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) X50D", result);
}
public void testDevice373() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3531DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3531DUO", result);
}
public void testDevice374() throws Exception {
    final String result = DeviceNames.getDeviceName("0PAJ5", FALLBACK);
    Assert.assertEquals("HTC One (E8)", result);
}
public void testDevice375() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-10DTB12", FALLBACK);
    Assert.assertEquals("Hipstreet HS-10DTB12", result);
}
public void testDevice376() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7102i", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice377() throws Exception {
    final String result = DeviceNames.getDeviceName("M5", FALLBACK);
    Assert.assertEquals("Mint M5", result);
}
public void testDevice378() throws Exception {
    final String result = DeviceNames.getDeviceName("M4", FALLBACK);
    Assert.assertEquals("Mint M4", result);
}
public void testDevice379() throws Exception {
    final String result = DeviceNames.getDeviceName("M7", FALLBACK);
    Assert.assertEquals("CZ Electronics M7 Sapphire", result);
}
public void testDevice380() throws Exception {
    final String result = DeviceNames.getDeviceName("M3", FALLBACK);
    Assert.assertEquals("Gionee M3", result);
}
public void testDevice381() throws Exception {
    final String result = DeviceNames.getDeviceName("M2", FALLBACK);
    Assert.assertEquals("Gionee M2", result);
}
public void testDevice382() throws Exception {
    final String result = DeviceNames.getDeviceName("Coolpad7920", FALLBACK);
    Assert.assertEquals("Coolpad7920", result);
}
public void testDevice383() throws Exception {
    final String result = DeviceNames.getDeviceName("UVP", FALLBACK);
    Assert.assertEquals("Ubiquiti UVP", result);
}
public void testDevice384() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D955", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice385() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D956", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice386() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D951", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice387() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D950", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice388() throws Exception {
    final String result = DeviceNames.getDeviceName("E400", FALLBACK);
    Assert.assertEquals("NGM Italia SRL NGM Youcolor E400", result);
}
public void testDevice389() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D959", FALLBACK);
    Assert.assertEquals("LG G Flex", result);
}
public void testDevice390() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D958", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice391() throws Exception {
    final String result = DeviceNames.getDeviceName("XT937C", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice392() throws Exception {
    final String result = DeviceNames.getDeviceName("WA966", FALLBACK);
    Assert.assertEquals("SKnetworks WA966", result);
}
public void testDevice393() throws Exception {
    final String result = DeviceNames.getDeviceName("FMT-NM7116-01", FALLBACK);
    Assert.assertEquals("Future Mobile Technology netsurferDUAL 7", result);
}
public void testDevice394() throws Exception {
    final String result = DeviceNames.getDeviceName("WA960", FALLBACK);
    Assert.assertEquals("Hisense WA960", result);
}
public void testDevice395() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V498S1", FALLBACK);
    Assert.assertEquals("LGE G Pad II 8.0", result);
}
public void testDevice396() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V498S2", FALLBACK);
    Assert.assertEquals("LGE G Pad II 8.0", result);
}
public void testDevice397() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-T217A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 7.0", result);
}
public void testDevice398() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P5210XD1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 10.1", result);
}
public void testDevice399() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E220S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pop", result);
}
public void testDevice400() throws Exception {
    final String result = DeviceNames.getDeviceName("TegraNote-P1640", FALLBACK);
    Assert.assertEquals("NVidia TegraNote", result);
}
public void testDevice401() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M900", FALLBACK);
    Assert.assertEquals("Samsung Moment", result);
}
public void testDevice402() throws Exception {
    final String result = DeviceNames.getDeviceName("one695_1_coho", FALLBACK);
    Assert.assertEquals("CloudFone Cloudpad One 6.95", result);
}
public void testDevice403() throws Exception {
    final String result = DeviceNames.getDeviceName("chagall", FALLBACK);
    Assert.assertEquals("Pegatron chagall", result);
}
public void testDevice404() throws Exception {
    final String result = DeviceNames.getDeviceName("R815T", FALLBACK);
    Assert.assertEquals("Oppo R815T", result);
}
public void testDevice405() throws Exception {
    final String result = DeviceNames.getDeviceName("R815W", FALLBACK);
    Assert.assertEquals("Oppo R815W", result);
}
public void testDevice406() throws Exception {
    final String result = DeviceNames.getDeviceName("vsi7q_1", FALLBACK);
    Assert.assertEquals("ViewSonic ViewPadi7Q", result);
}
public void testDevice407() throws Exception {
    final String result = DeviceNames.getDeviceName("S1052", FALLBACK);
    Assert.assertEquals("Logicom S1052", result);
}
public void testDevice408() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9230", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Golden", result);
}
public void testDevice409() throws Exception {
    final String result = DeviceNames.getDeviceName("calgary", FALLBACK);
    Assert.assertEquals("Motorola Devour", result);
}
public void testDevice410() throws Exception {
    final String result = DeviceNames.getDeviceName("E6683", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5 dual", result);
}
public void testDevice411() throws Exception {
    final String result = DeviceNames.getDeviceName("T2702", FALLBACK);
    Assert.assertEquals("MJS T2702", result);
}
public void testDevice412() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9515L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice413() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000011-N", FALLBACK);
    Assert.assertEquals("NEC LifeTouch Note", result);
}
public void testDevice414() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6802", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Duos", result);
}
public void testDevice415() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6800", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Advance", result);
}
public void testDevice416() throws Exception {
    final String result = DeviceNames.getDeviceName("CT10", FALLBACK);
    Assert.assertEquals("IDeaUSA CT10", result);
}
public void testDevice417() throws Exception {
    final String result = DeviceNames.getDeviceName("009Z", FALLBACK);
    Assert.assertEquals("ZTE 009Z", result);
}
public void testDevice418() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC-Z710a", FALLBACK);
    Assert.assertEquals("HTC Sensation 4G", result);
}
public void testDevice419() throws Exception {
    final String result = DeviceNames.getDeviceName("A91", FALLBACK);
    Assert.assertEquals("Micromax A91", result);
}
public void testDevice420() throws Exception {
    final String result = DeviceNames.getDeviceName("41EA04", FALLBACK);
    Assert.assertEquals("Sanyo Benesse", result);
}
public void testDevice421() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-713HD", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab 7", result);
}
public void testDevice422() throws Exception {
    final String result = DeviceNames.getDeviceName("NE501J", FALLBACK);
    Assert.assertEquals("ZTE NE501J", result);
}
public void testDevice423() throws Exception {
    final String result = DeviceNames.getDeviceName("FMT-NM7058-03", FALLBACK);
    Assert.assertEquals("Future Mobile Technology FMT-NM7058-03", result);
}
public void testDevice424() throws Exception {
    final String result = DeviceNames.getDeviceName("R7Plus", FALLBACK);
    Assert.assertEquals("Oppo R7 Plus", result);
}
public void testDevice425() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9300T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice426() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9300I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Neo Plus", result);
}
public void testDevice427() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T817R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice428() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-J021", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice429() throws Exception {
    final String result = DeviceNames.getDeviceName("C6903", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1", result);
}
public void testDevice430() throws Exception {
    final String result = DeviceNames.getDeviceName("C6902", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1", result);
}
public void testDevice431() throws Exception {
    final String result = DeviceNames.getDeviceName("C6906", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Z1", result);
}
public void testDevice432() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z008D", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 (ZE550ML)", result);
}
public void testDevice433() throws Exception {
    final String result = DeviceNames.getDeviceName("NEOS", FALLBACK);
    Assert.assertEquals("Astak NEOS", result);
}
public void testDevice434() throws Exception {
    final String result = DeviceNames.getDeviceName("thunderc", FALLBACK);
    Assert.assertEquals("LGE Optimus One", result);
}
public void testDevice435() throws Exception {
    final String result = DeviceNames.getDeviceName("XT916", FALLBACK);
    Assert.assertEquals("Motorola RAZR D1", result);
}
public void testDevice436() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I757M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice437() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00MD", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 Laser (ZE600KL)", result);
}
public void testDevice438() throws Exception {
    final String result = DeviceNames.getDeviceName("MS4A", FALLBACK);
    Assert.assertEquals("ZTE MS4A", result);
}
public void testDevice439() throws Exception {
    final String result = DeviceNames.getDeviceName("IdeaTabA1010-T", FALLBACK);
    Assert.assertEquals("Lenovo IdeaTab A1010", result);
}
public void testDevice440() throws Exception {
    final String result = DeviceNames.getDeviceName("MS4C", FALLBACK);
    Assert.assertEquals("Huawei MS4C", result);
}
public void testDevice441() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9000M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice442() throws Exception {
    final String result = DeviceNames.getDeviceName("ETBW11AA", FALLBACK);
    Assert.assertEquals("ASUS ETBW11AA", result);
}
public void testDevice443() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9000B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice444() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9000T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice445() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P713GO", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7 II", result);
}
public void testDevice446() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B9150", FALLBACK);
    Assert.assertEquals("Samsung Homesync", result);
}
public void testDevice447() throws Exception {
    final String result = DeviceNames.getDeviceName("F-05G", FALLBACK);
    Assert.assertEquals("Fujitsu F-05G", result);
}
public void testDevice448() throws Exception {
    final String result = DeviceNames.getDeviceName("F-05F", FALLBACK);
    Assert.assertEquals("Fujitsu F-05F", result);
}
public void testDevice449() throws Exception {
    final String result = DeviceNames.getDeviceName("F-05E", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Tab F-05E", result);
}
public void testDevice450() throws Exception {
    final String result = DeviceNames.getDeviceName("F-05D", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS X LTE F-05D", result);
}
public void testDevice451() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1526", FALLBACK);
    Assert.assertEquals("Motorola Moto E", result);
}
public void testDevice452() throws Exception {
    final String result = DeviceNames.getDeviceName("Z818L", FALLBACK);
    Assert.assertEquals("ZTE Z818L", result);
}
public void testDevice453() throws Exception {
    final String result = DeviceNames.getDeviceName("Atom", FALLBACK);
    Assert.assertEquals("Explay Atom", result);
}
public void testDevice454() throws Exception {
    final String result = DeviceNames.getDeviceName("A716_Inspire_Life", FALLBACK);
    Assert.assertEquals("Gtel A716 Inspire Life", result);
}
public void testDevice455() throws Exception {
    final String result = DeviceNames.getDeviceName("6044D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6044D", result);
}
public void testDevice456() throws Exception {
    final String result = DeviceNames.getDeviceName("VSD241", FALLBACK);
    Assert.assertEquals("ViewSonic VSD241 Smart Display", result);
}
public void testDevice457() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-04G", FALLBACK);
    Assert.assertEquals("Sharp AQUOS EVER SH-04G", result);
}
public void testDevice458() throws Exception {
    final String result = DeviceNames.getDeviceName("P2M", FALLBACK);
    Assert.assertEquals("Gionee P2M", result);
}
public void testDevice459() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T599", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Exhibit", result);
}
public void testDevice460() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7572", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Duos", result);
}
public void testDevice461() throws Exception {
    final String result = DeviceNames.getDeviceName("NWZ-Z1000Series", FALLBACK);
    Assert.assertEquals("Sony NWZ-Z1000", result);
}
public void testDevice462() throws Exception {
    final String result = DeviceNames.getDeviceName("MST711", FALLBACK);
    Assert.assertEquals("Trio MST711", result);
}
public void testDevice463() throws Exception {
    final String result = DeviceNames.getDeviceName("A3-A30", FALLBACK);
    Assert.assertEquals("Acer A3-A30", result);
}
public void testDevice464() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLK430", FALLBACK);
    Assert.assertEquals("LGE LG G Pad F7.0", result);
}
public void testDevice465() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-i889", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice466() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-T817A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice467() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P880g", FALLBACK);
    Assert.assertEquals("LGE Optimus 4X HD", result);
}
public void testDevice468() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-KC120S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera", result);
}
public void testDevice469() throws Exception {
    final String result = DeviceNames.getDeviceName("Kestrel", FALLBACK);
    Assert.assertEquals("Huawei G535-L11", result);
}
public void testDevice470() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-KC120L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera", result);
}
public void testDevice471() throws Exception {
    final String result = DeviceNames.getDeviceName("PAD712", FALLBACK);
    Assert.assertEquals("Haier PAD712", result);
}
public void testDevice472() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9018", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice473() throws Exception {
    final String result = DeviceNames.getDeviceName("8057", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8057", result);
}
public void testDevice474() throws Exception {
    final String result = DeviceNames.getDeviceName("8056", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8056", result);
}
public void testDevice475() throws Exception {
    final String result = DeviceNames.getDeviceName("VS415PP", FALLBACK);
    Assert.assertEquals("LGE LG Optimus Zone 2", result);
}
public void testDevice476() throws Exception {
    final String result = DeviceNames.getDeviceName("8054", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8054", result);
}
public void testDevice477() throws Exception {
    final String result = DeviceNames.getDeviceName("Che1-CL20", FALLBACK);
    Assert.assertEquals("Huawei Che1-CL20", result);
}
public void testDevice478() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9010", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice479() throws Exception {
    final String result = DeviceNames.getDeviceName("d-02H", FALLBACK);
    Assert.assertEquals("Huawei M2-802LD", result);
}
public void testDevice480() throws Exception {
    final String result = DeviceNames.getDeviceName("ATV", FALLBACK);
    Assert.assertEquals("Explay ATV", result);
}
public void testDevice481() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_5X", FALLBACK);
    Assert.assertEquals("Nexus 5X", result);
}
public void testDevice482() throws Exception {
    final String result = DeviceNames.getDeviceName("Z520", FALLBACK);
    Assert.assertEquals("Acer Liquid Z520", result);
}
public void testDevice483() throws Exception {
    final String result = DeviceNames.getDeviceName("M3101BCD", FALLBACK);
    Assert.assertEquals("Hisense M3101BCD", result);
}
public void testDevice484() throws Exception {
    final String result = DeviceNames.getDeviceName("FS402", FALLBACK);
    Assert.assertEquals("Fly FS402", result);
}
public void testDevice485() throws Exception {
    final String result = DeviceNames.getDeviceName("4013M", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 4013M", result);
}
public void testDevice486() throws Exception {
    final String result = DeviceNames.getDeviceName("FS401", FALLBACK);
    Assert.assertEquals("Fly Stratus 1", result);
}
public void testDevice487() throws Exception {
    final String result = DeviceNames.getDeviceName("LED39K280J3D", FALLBACK);
    Assert.assertEquals("Hisense LED39K280J3D", result);
}
public void testDevice488() throws Exception {
    final String result = DeviceNames.getDeviceName("PTM-Z-mini", FALLBACK);
    Assert.assertEquals("Tecno PHANTOM-Z-mini", result);
}
public void testDevice489() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5505DUO", FALLBACK);
    Assert.assertEquals("Prestigio MultiPhone 5505 DUO", result);
}
public void testDevice490() throws Exception {
    final String result = DeviceNames.getDeviceName("S440", FALLBACK);
    Assert.assertEquals("Positivo S440", result);
}
public void testDevice491() throws Exception {
    final String result = DeviceNames.getDeviceName("MID4X07", FALLBACK);
    Assert.assertEquals("Polaroid MID4X07", result);
}
public void testDevice492() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F600S", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice493() throws Exception {
    final String result = DeviceNames.getDeviceName("NW-Z1000Series", FALLBACK);
    Assert.assertEquals("Sony NW-Z1000", result);
}
public void testDevice494() throws Exception {
    final String result = DeviceNames.getDeviceName("L-EMENT500L", FALLBACK);
    Assert.assertEquals("Logicom L-EMENT500", result);
}
public void testDevice495() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F600K", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice496() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F600L", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice497() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-7DTB29-8GB", FALLBACK);
    Assert.assertEquals("Haier HS-7DTB29-8GB", result);
}
public void testDevice498() throws Exception {
    final String result = DeviceNames.getDeviceName("D2212", FALLBACK);
    Assert.assertEquals("Sony Xperia E3 Dual", result);
}
public void testDevice499() throws Exception {
    final String result = DeviceNames.getDeviceName("ST25i", FALLBACK);
    Assert.assertEquals("Sony Xperia U", result);
}
public void testDevice500() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D385", FALLBACK);
    Assert.assertEquals("LGE LG L80 Dual", result);
}
public void testDevice501() throws Exception {
    final String result = DeviceNames.getDeviceName("ST25a", FALLBACK);
    Assert.assertEquals("Sony Xperia U", result);
}
public void testDevice502() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D380", FALLBACK);
    Assert.assertEquals("LGE LG L80 Dual", result);
}
public void testDevice503() throws Exception {
    final String result = DeviceNames.getDeviceName("N8730-411", FALLBACK);
    Assert.assertEquals("NEC AGT10", result);
}
public void testDevice504() throws Exception {
    final String result = DeviceNames.getDeviceName("PG86100", FALLBACK);
    Assert.assertEquals("HTC Evo 3D", result);
}
public void testDevice505() throws Exception {
    final String result = DeviceNames.getDeviceName("EM01F", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS S EM01F", result);
}
public void testDevice506() throws Exception {
    final String result = DeviceNames.getDeviceName("IF236a", FALLBACK);
    Assert.assertEquals("InFocus Big Tab", result);
}
public void testDevice507() throws Exception {
    final String result = DeviceNames.getDeviceName("IS04", FALLBACK);
    Assert.assertEquals("Fujitsu REGZA Phone T-01C", result);
}
public void testDevice508() throws Exception {
    final String result = DeviceNames.getDeviceName("IS05", FALLBACK);
    Assert.assertEquals("Sharp IS05", result);
}
public void testDevice509() throws Exception {
    final String result = DeviceNames.getDeviceName("A51w", FALLBACK);
    Assert.assertEquals("Oppo A51w", result);
}
public void testDevice510() throws Exception {
    final String result = DeviceNames.getDeviceName("IS01", FALLBACK);
    Assert.assertEquals("Sharp IS01", result);
}
public void testDevice511() throws Exception {
    final String result = DeviceNames.getDeviceName("IS03", FALLBACK);
    Assert.assertEquals("Sharp IS03", result);
}
public void testDevice512() throws Exception {
    final String result = DeviceNames.getDeviceName("A51f", FALLBACK);
    Assert.assertEquals("Oppo A51fa", result);
}
public void testDevice513() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice514() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM102SH2", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SoftBank  102SH II", result);
}
public void testDevice515() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5838", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice516() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4516", FALLBACK);
    Assert.assertEquals("Fly IQ4516 Octa", result);
}
public void testDevice517() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4513", FALLBACK);
    Assert.assertEquals("Fly IQ4513", result);
}
public void testDevice518() throws Exception {
    final String result = DeviceNames.getDeviceName("MTN-S730", FALLBACK);
    Assert.assertEquals("MTN Group MTN Smart S730", result);
}
public void testDevice519() throws Exception {
    final String result = DeviceNames.getDeviceName("A511", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab A511", result);
}
public void testDevice520() throws Exception {
    final String result = DeviceNames.getDeviceName("A510", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab A510", result);
}
public void testDevice521() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A310X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3(2016)", result);
}
public void testDevice522() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A310Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3(2016)", result);
}
public void testDevice523() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A310F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3(2016)", result);
}
public void testDevice524() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U950", FALLBACK);
    Assert.assertEquals("Hisense HS-U950", result);
}
public void testDevice525() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A310M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3(2016)", result);
}
public void testDevice526() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H650", FALLBACK);
    Assert.assertEquals("LGE LG Zero", result);
}
public void testDevice527() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-H800T", FALLBACK);
    Assert.assertEquals("Hisense H800T", result);
}
public void testDevice528() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5831i", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice529() throws Exception {
    final String result = DeviceNames.getDeviceName("TC70RA1", FALLBACK);
    Assert.assertEquals("ECS TC70RA1", result);
}
public void testDevice530() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X170fTV", FALLBACK);
    Assert.assertEquals("LGE LG Prime II", result);
}
public void testDevice531() throws Exception {
    final String result = DeviceNames.getDeviceName("V865M", FALLBACK);
    Assert.assertEquals("ZTE V865M", result);
}
public void testDevice532() throws Exception {
    final String result = DeviceNames.getDeviceName("Coolpad8295M", FALLBACK);
    Assert.assertEquals("Coolpad CP8295M", result);
}
public void testDevice533() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9009W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice534() throws Exception {
    final String result = DeviceNames.getDeviceName("785TB4", FALLBACK);
    Assert.assertEquals("Hipstreet 785TB4", result);
}
public void testDevice535() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_P733X", FALLBACK);
    Assert.assertEquals("Medion LIFETAB P733x", result);
}
public void testDevice536() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM303SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE Xx mini 303SH", result);
}
public void testDevice537() throws Exception {
    final String result = DeviceNames.getDeviceName("AO5510", FALLBACK);
    Assert.assertEquals("Yureka", result);
}
public void testDevice538() throws Exception {
    final String result = DeviceNames.getDeviceName("R831K", FALLBACK);
    Assert.assertEquals("Oppo R831K", result);
}
public void testDevice539() throws Exception {
    final String result = DeviceNames.getDeviceName("QOOQ", FALLBACK);
    Assert.assertEquals("QOOQV3", result);
}
public void testDevice540() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8190", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III Mini", result);
}
public void testDevice541() throws Exception {
    final String result = DeviceNames.getDeviceName("R831L", FALLBACK);
    Assert.assertEquals("OPPO R831L", result);
}
public void testDevice542() throws Exception {
    final String result = DeviceNames.getDeviceName("T10xTA", FALLBACK);
    Assert.assertEquals("Asus T101TA", result);
}
public void testDevice543() throws Exception {
    final String result = DeviceNames.getDeviceName("R831S", FALLBACK);
    Assert.assertEquals("OPPO R831S", result);
}
public void testDevice544() throws Exception {
    final String result = DeviceNames.getDeviceName("N9510", FALLBACK);
    Assert.assertEquals("ZTE N9510", result);
}
public void testDevice545() throws Exception {
    final String result = DeviceNames.getDeviceName("R831T", FALLBACK);
    Assert.assertEquals("Oppo R831", result);
}
public void testDevice546() throws Exception {
    final String result = DeviceNames.getDeviceName("SCL-TL00H", FALLBACK);
    Assert.assertEquals("Huawei Honor 4A", result);
}
public void testDevice547() throws Exception {
    final String result = DeviceNames.getDeviceName("Huawei-U8652", FALLBACK);
    Assert.assertEquals("Huawei U8652", result);
}
public void testDevice548() throws Exception {
    final String result = DeviceNames.getDeviceName("N-06D", FALLBACK);
    Assert.assertEquals("NEC MEDIAS TAB N-06D", result);
}
public void testDevice549() throws Exception {
    final String result = DeviceNames.getDeviceName("N-06E", FALLBACK);
    Assert.assertEquals("NEC MEDIAS  X N-06E", result);
}
public void testDevice550() throws Exception {
    final String result = DeviceNames.getDeviceName("N-06C", FALLBACK);
    Assert.assertEquals("NEC MEDIAS WP N-06C", result);
}
public void testDevice551() throws Exception {
    final String result = DeviceNames.getDeviceName("N9515", FALLBACK);
    Assert.assertEquals("ZTE N9515", result);
}
public void testDevice552() throws Exception {
    final String result = DeviceNames.getDeviceName("XL39h", FALLBACK);
    Assert.assertEquals("Sony Xperia Z Ultra", result);
}
public void testDevice553() throws Exception {
    final String result = DeviceNames.getDeviceName("D2-961G", FALLBACK);
    Assert.assertEquals("Haier D2-961G", result);
}
public void testDevice554() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-FL40L", FALLBACK);
    Assert.assertEquals("LGE 070 touch", result);
}
public void testDevice555() throws Exception {
    final String result = DeviceNames.getDeviceName("l5400", FALLBACK);
    Assert.assertEquals("Toshiba L5450ME", result);
}
public void testDevice556() throws Exception {
    final String result = DeviceNames.getDeviceName("b1-721", FALLBACK);
    Assert.assertEquals("Acer B1-721", result);
}
public void testDevice557() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-i569", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Gio", result);
}
public void testDevice558() throws Exception {
    final String result = DeviceNames.getDeviceName("HG-9041", FALLBACK);
    Assert.assertEquals("Haier HG-9041", result);
}
public void testDevice559() throws Exception {
    final String result = DeviceNames.getDeviceName("3005", FALLBACK);
    Assert.assertEquals("Oppo 3005", result);
}
public void testDevice560() throws Exception {
    final String result = DeviceNames.getDeviceName("3007", FALLBACK);
    Assert.assertEquals("Oppo 3007", result);
}
public void testDevice561() throws Exception {
    final String result = DeviceNames.getDeviceName("3006", FALLBACK);
    Assert.assertEquals("Oppo 3006", result);
}
public void testDevice562() throws Exception {
    final String result = DeviceNames.getDeviceName("3001", FALLBACK);
    Assert.assertEquals("Oppo 3001", result);
}
public void testDevice563() throws Exception {
    final String result = DeviceNames.getDeviceName("3000", FALLBACK);
    Assert.assertEquals("Oppo 3000", result);
}
public void testDevice564() throws Exception {
    final String result = DeviceNames.getDeviceName("3008", FALLBACK);
    Assert.assertEquals("Oppo 3008", result);
}
public void testDevice565() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900T1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice566() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900T3", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice567() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900T4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice568() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_mini_601e", FALLBACK);
    Assert.assertEquals("HTC One mini 601E", result);
}
public void testDevice569() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T230X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice570() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F180L", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice571() throws Exception {
    final String result = DeviceNames.getDeviceName("Z958", FALLBACK);
    Assert.assertEquals("ZTE Z958", result);
}
public void testDevice572() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F180K", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice573() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F180S", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice574() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL35G", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3", result);
}
public void testDevice575() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I727", FALLBACK);
    Assert.assertEquals("Samsung Skyrocket", result);
}
public void testDevice576() throws Exception {
    final String result = DeviceNames.getDeviceName("E9771", FALLBACK);
    Assert.assertEquals("Gigabyte E9771", result);
}
public void testDevice577() throws Exception {
    final String result = DeviceNames.getDeviceName("P360X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) P360X", result);
}
public void testDevice578() throws Exception {
    final String result = DeviceNames.getDeviceName("C1+", FALLBACK);
    Assert.assertEquals("Condor C1+", result);
}
public void testDevice579() throws Exception {
    final String result = DeviceNames.getDeviceName("5015D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)", result);
}
public void testDevice580() throws Exception {
    final String result = DeviceNames.getDeviceName("5015E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)", result);
}
public void testDevice581() throws Exception {
    final String result = DeviceNames.getDeviceName("Z796C", FALLBACK);
    Assert.assertEquals("ZTE Z796C", result);
}
public void testDevice582() throws Exception {
    final String result = DeviceNames.getDeviceName("5015A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)", result);
}
public void testDevice583() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T330X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 4 8.0", result);
}
public void testDevice584() throws Exception {
    final String result = DeviceNames.getDeviceName("Coolpad8908", FALLBACK);
    Assert.assertEquals("Coolpad8908", result);
}
public void testDevice585() throws Exception {
    final String result = DeviceNames.getDeviceName("MTAB-07530A", FALLBACK);
    Assert.assertEquals("Memorex MTAB-07530A", result);
}
public void testDevice586() throws Exception {
    final String result = DeviceNames.getDeviceName("5015X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)", result);
}
public void testDevice587() throws Exception {
    final String result = DeviceNames.getDeviceName("N-01D", FALLBACK);
    Assert.assertEquals("NEC MEDIAS PP N-01D", result);
}
public void testDevice588() throws Exception {
    final String result = DeviceNames.getDeviceName("CINKPLUS", FALLBACK);
    Assert.assertEquals("Enspert WIKO CINK+", result);
}
public void testDevice589() throws Exception {
    final String result = DeviceNames.getDeviceName("831C", FALLBACK);
    Assert.assertEquals("HTC One M8", result);
}
public void testDevice590() throws Exception {
    final String result = DeviceNames.getDeviceName("dTV01", FALLBACK);
    Assert.assertEquals("Huawei M220", result);
}
public void testDevice591() throws Exception {
    final String result = DeviceNames.getDeviceName("Clear", FALLBACK);
    Assert.assertEquals("Wintec T750", result);
}
public void testDevice592() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V507L", FALLBACK);
    Assert.assertEquals("LGE LG G Pad 8.3 homeBoy", result);
}
public void testDevice593() throws Exception {
    final String result = DeviceNames.getDeviceName("Coolmini", FALLBACK);
    Assert.assertEquals("Coolpad Coolmini", result);
}
public void testDevice594() throws Exception {
    final String result = DeviceNames.getDeviceName("MiTV2", FALLBACK);
    Assert.assertEquals("Xiaomi MiTV2", result);
}
public void testDevice595() throws Exception {
    final String result = DeviceNames.getDeviceName("9920", FALLBACK);
    Assert.assertEquals("Star Alps S9920", result);
}
public void testDevice596() throws Exception {
    final String result = DeviceNames.getDeviceName("PRO8D", FALLBACK);
    Assert.assertEquals("Prestige PRO8D", result);
}
public void testDevice597() throws Exception {
    final String result = DeviceNames.getDeviceName("GX2", FALLBACK);
    Assert.assertEquals("GSmart GX2", result);
}
public void testDevice598() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G530A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Go Prime", result);
}
public void testDevice599() throws Exception {
    final String result = DeviceNames.getDeviceName("Z750C", FALLBACK);
    Assert.assertEquals("ZTE Z750C", result);
}
public void testDevice600() throws Exception {
    final String result = DeviceNames.getDeviceName("Z930L", FALLBACK);
    Assert.assertEquals("ZTE Z930L", result);
}
public void testDevice601() throws Exception {
    final String result = DeviceNames.getDeviceName("SHIELD", FALLBACK);
    Assert.assertEquals("NVidia Shield", result);
}
public void testDevice602() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A770K", FALLBACK);
    Assert.assertEquals("Pantech VEGA RACER", result);
}
public void testDevice603() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6352", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Duos", result);
}
public void testDevice604() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6358", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice605() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LU3700", FALLBACK);
    Assert.assertEquals("LGE Optimus One", result);
}
public void testDevice606() throws Exception {
    final String result = DeviceNames.getDeviceName("Connect502", FALLBACK);
    Assert.assertEquals("Sourcing Creation Connect502", result);
}
public void testDevice607() throws Exception {
    final String result = DeviceNames.getDeviceName("Connect504", FALLBACK);
    Assert.assertEquals("Sourcing Creation Connect 504", result);
}
public void testDevice608() throws Exception {
    final String result = DeviceNames.getDeviceName("X2_Soul_Mini", FALLBACK);
    Assert.assertEquals("AllView X2 Soul Mini", result);
}
public void testDevice609() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E440g", FALLBACK);
    Assert.assertEquals("LG Optimus L4 II", result);
}
public void testDevice610() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E440f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L4 II", result);
}
public void testDevice611() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T530X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 10.1", result);
}
public void testDevice612() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-K01", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice613() throws Exception {
    final String result = DeviceNames.getDeviceName("U972", FALLBACK);
    Assert.assertEquals("Hisense u972", result);
}
public void testDevice614() throws Exception {
    final String result = DeviceNames.getDeviceName("U970", FALLBACK);
    Assert.assertEquals("Hisense U970", result);
}
public void testDevice615() throws Exception {
    final String result = DeviceNames.getDeviceName("INFINIX-X551", FALLBACK);
    Assert.assertEquals("INFINIX-X551", result);
}
public void testDevice616() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I200PP", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Stellar", result);
}
public void testDevice617() throws Exception {
    final String result = DeviceNames.getDeviceName("IS15SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SL IS15SH", result);
}
public void testDevice618() throws Exception {
    final String result = DeviceNames.getDeviceName("Coolpad8198T", FALLBACK);
    Assert.assertEquals("Coolpad8198T", result);
}
public void testDevice619() throws Exception {
    final String result = DeviceNames.getDeviceName("AT7003", FALLBACK);
    Assert.assertEquals("Haier AT7003", result);
}
public void testDevice620() throws Exception {
    final String result = DeviceNames.getDeviceName("KALOS", FALLBACK);
    Assert.assertEquals("Bungbungame KALOS", result);
}
public void testDevice621() throws Exception {
    final String result = DeviceNames.getDeviceName("F-03E", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Kiss F-03E", result);
}
public void testDevice622() throws Exception {
    final String result = DeviceNames.getDeviceName("F-03D", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Kiss F-03D", result);
}
public void testDevice623() throws Exception {
    final String result = DeviceNames.getDeviceName("F-03G", FALLBACK);
    Assert.assertEquals("Fujitsu F-03G", result);
}
public void testDevice624() throws Exception {
    final String result = DeviceNames.getDeviceName("F-03F", FALLBACK);
    Assert.assertEquals("Fujitsu F-03F", result);
}
public void testDevice625() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P659H", FALLBACK);
    Assert.assertEquals("LGE Optimus F3", result);
}
public void testDevice626() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D826y", FALLBACK);
    Assert.assertEquals("HTC Desire 826", result);
}
public void testDevice627() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1058", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice628() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1056", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice629() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1055", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice630() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1052", FALLBACK);
    Assert.assertEquals("Moto X", result);
}
public void testDevice631() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1053", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice632() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1050", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice633() throws Exception {
    final String result = DeviceNames.getDeviceName("V8514", FALLBACK);
    Assert.assertEquals("ZTE V8514", result);
}
public void testDevice634() throws Exception {
    final String result = DeviceNames.getDeviceName("V8510", FALLBACK);
    Assert.assertEquals("Huawei Y330-U11", result);
}
public void testDevice635() throws Exception {
    final String result = DeviceNames.getDeviceName("6042D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6042D", result);
}
public void testDevice636() throws Exception {
    final String result = DeviceNames.getDeviceName("SUNSET2", FALLBACK);
    Assert.assertEquals("Wiko SUNSET2", result);
}
public void testDevice637() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice638() throws Exception {
    final String result = DeviceNames.getDeviceName("ATH-TL00", FALLBACK);
    Assert.assertEquals("Huawei ATH-TL00", result);
}
public void testDevice639() throws Exception {
    final String result = DeviceNames.getDeviceName("P4S", FALLBACK);
    Assert.assertEquals("Gionee P4S", result);
}
public void testDevice640() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR6425LVW", FALLBACK);
    Assert.assertEquals("HTC Rezound 4G", result);
}
public void testDevice641() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P708g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7", result);
}
public void testDevice642() throws Exception {
    final String result = DeviceNames.getDeviceName("HW-W820", FALLBACK);
    Assert.assertEquals("Cellon HWW820", result);
}
public void testDevice643() throws Exception {
    final String result = DeviceNames.getDeviceName("LenovoA3300-GV", FALLBACK);
    Assert.assertEquals("Lenovo A3300-GV", result);
}
public void testDevice644() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J110M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1 Ace", result);
}
public void testDevice645() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J110L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1 Ace", result);
}
public void testDevice646() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J110H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1 Ace", result);
}
public void testDevice647() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J110G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1 Ace", result);
}
public void testDevice648() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J110F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1 Ace", result);
}
public void testDevice649() throws Exception {
    final String result = DeviceNames.getDeviceName("A3-A11", FALLBACK);
    Assert.assertEquals("Acer A3-A11", result);
}
public void testDevice650() throws Exception {
    final String result = DeviceNames.getDeviceName("A3-A10", FALLBACK);
    Assert.assertEquals("Acer A3-A10", result);
}
public void testDevice651() throws Exception {
    final String result = DeviceNames.getDeviceName("NSZ-GS7/GX70", FALLBACK);
    Assert.assertEquals("Sony NSZGS7", result);
}
public void testDevice652() throws Exception {
    final String result = DeviceNames.getDeviceName("N1", FALLBACK);
    Assert.assertEquals("Oppo N1", result);
}
public void testDevice653() throws Exception {
    final String result = DeviceNames.getDeviceName("N3", FALLBACK);
    Assert.assertEquals("Star NO.1 N3", result);
}
public void testDevice654() throws Exception {
    final String result = DeviceNames.getDeviceName("N6", FALLBACK);
    Assert.assertEquals("Gini N6", result);
}
public void testDevice655() throws Exception {
    final String result = DeviceNames.getDeviceName("ICON", FALLBACK);
    Assert.assertEquals("Cellon ICON", result);
}
public void testDevice656() throws Exception {
    final String result = DeviceNames.getDeviceName("P001", FALLBACK);
    Assert.assertEquals("Asus ZenPad C 7.0 (Z170MG)", result);
}
public void testDevice657() throws Exception {
    final String result = DeviceNames.getDeviceName("P002", FALLBACK);
    Assert.assertEquals("Asus ZenPad 7.0(Z370KL)", result);
}
public void testDevice658() throws Exception {
    final String result = DeviceNames.getDeviceName("ST5000", FALLBACK);
    Assert.assertEquals("Seemahale Telecoms ST5000", result);
}
public void testDevice659() throws Exception {
    final String result = DeviceNames.getDeviceName("8079", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8079", result);
}
public void testDevice660() throws Exception {
    final String result = DeviceNames.getDeviceName("myPadP4", FALLBACK);
    Assert.assertEquals("ZTE V9S", result);
}
public void testDevice661() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P659", FALLBACK);
    Assert.assertEquals("LGE Optimus F3", result);
}
public void testDevice662() throws Exception {
    final String result = DeviceNames.getDeviceName("8070", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8070", result);
}
public void testDevice663() throws Exception {
    final String result = DeviceNames.getDeviceName("Aquaris_M4.5", FALLBACK);
    Assert.assertEquals("bq Aquaris M4.5", result);
}
public void testDevice664() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9505X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice665() throws Exception {
    final String result = DeviceNames.getDeviceName("P5Life_TM", FALLBACK);
    Assert.assertEquals("AllView P5 Life", result);
}
public void testDevice666() throws Exception {
    final String result = DeviceNames.getDeviceName("VS876", FALLBACK);
    Assert.assertEquals("LGE LG Lucid 3", result);
}
public void testDevice667() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9505G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice668() throws Exception {
    final String result = DeviceNames.getDeviceName("Discovery", FALLBACK);
    Assert.assertEquals("Explay Discovery", result);
}
public void testDevice669() throws Exception {
    final String result = DeviceNames.getDeviceName("LENNY", FALLBACK);
    Assert.assertEquals("Wiko LENNY", result);
}
public void testDevice670() throws Exception {
    final String result = DeviceNames.getDeviceName("Z12", FALLBACK);
    Assert.assertEquals("QMobile Z12", result);
}
public void testDevice671() throws Exception {
    final String result = DeviceNames.getDeviceName("a5", FALLBACK);
    Assert.assertEquals("ZTE Blade", result);
}
public void testDevice672() throws Exception {
    final String result = DeviceNames.getDeviceName("a4", FALLBACK);
    Assert.assertEquals("Southern Telecom a4", result);
}
public void testDevice673() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T315T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 8.0", result);
}
public void testDevice674() throws Exception {
    final String result = DeviceNames.getDeviceName("SUBLIM", FALLBACK);
    Assert.assertEquals("Enspert WIKO SUBLIM", result);
}
public void testDevice675() throws Exception {
    final String result = DeviceNames.getDeviceName("pad_d85", FALLBACK);
    Assert.assertEquals("Haier", result);
}
public void testDevice676() throws Exception {
    final String result = DeviceNames.getDeviceName("P771A", FALLBACK);
    Assert.assertEquals("Anydata HKC P771A", result);
}
public void testDevice677() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D631", FALLBACK);
    Assert.assertEquals("LGE LG G Vista", result);
}
public void testDevice678() throws Exception {
    final String result = DeviceNames.getDeviceName("ST23a", FALLBACK);
    Assert.assertEquals("Sony Xperia miro", result);
}
public void testDevice679() throws Exception {
    final String result = DeviceNames.getDeviceName("T2HD", FALLBACK);
    Assert.assertEquals("Lumigon T2 HD", result);
}
public void testDevice680() throws Exception {
    final String result = DeviceNames.getDeviceName("ST23i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia miro", result);
}
public void testDevice681() throws Exception {
    final String result = DeviceNames.getDeviceName("Idol2S_Orange", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) IDOL 2 S", result);
}
public void testDevice682() throws Exception {
    final String result = DeviceNames.getDeviceName("G526-L22", FALLBACK);
    Assert.assertEquals("Huawei G526", result);
}
public void testDevice683() throws Exception {
    final String result = DeviceNames.getDeviceName("BASE_Lutea_3", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 997D", result);
}
public void testDevice684() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910W8", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 4", result);
}
public void testDevice685() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T499Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini", result);
}
public void testDevice686() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice687() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T499V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini", result);
}
public void testDevice688() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G316M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4", result);
}
public void testDevice689() throws Exception {
    final String result = DeviceNames.getDeviceName("N800", FALLBACK);
    Assert.assertEquals("ZTE N800", result);
}
public void testDevice690() throws Exception {
    final String result = DeviceNames.getDeviceName("Neon", FALLBACK);
    Assert.assertEquals("AG Mobile Neon", result);
}
public void testDevice691() throws Exception {
    final String result = DeviceNames.getDeviceName("ETL-S5042", FALLBACK);
    Assert.assertEquals("Etuline ETL-S5042", result);
}
public void testDevice692() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G316U", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4 Lite", result);
}
public void testDevice693() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P350f", FALLBACK);
    Assert.assertEquals("LGE LG Pecan", result);
}
public void testDevice694() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P350g", FALLBACK);
    Assert.assertEquals("LGE LG Pecan", result);
}
public void testDevice695() throws Exception {
    final String result = DeviceNames.getDeviceName("DROID_Pro", FALLBACK);
    Assert.assertEquals("Motorola Droid Pro", result);
}
public void testDevice696() throws Exception {
    final String result = DeviceNames.getDeviceName("AN200", FALLBACK);
    Assert.assertEquals("SK Telesys AN200", result);
}
public void testDevice697() throws Exception {
    final String result = DeviceNames.getDeviceName("AT400", FALLBACK);
    Assert.assertEquals("Toshiba AT400", result);
}
public void testDevice698() throws Exception {
    final String result = DeviceNames.getDeviceName("VSP250s", FALLBACK);
    Assert.assertEquals("Vestel VSP250s", result);
}
public void testDevice699() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F370K", FALLBACK);
    Assert.assertEquals("LGE LG F70", result);
}
public void testDevice700() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F370L", FALLBACK);
    Assert.assertEquals("LGE LG F70", result);
}
public void testDevice701() throws Exception {
    final String result = DeviceNames.getDeviceName("H30-T10", FALLBACK);
    Assert.assertEquals("Huawei Honor3", result);
}
public void testDevice702() throws Exception {
    final String result = DeviceNames.getDeviceName("ELITE8Q", FALLBACK);
    Assert.assertEquals("Prestige ELITE8Q", result);
}
public void testDevice703() throws Exception {
    final String result = DeviceNames.getDeviceName("VSP250g", FALLBACK);
    Assert.assertEquals("Vestel VSP250g", result);
}
public void testDevice704() throws Exception {
    final String result = DeviceNames.getDeviceName("one7_0_4", FALLBACK);
    Assert.assertEquals("CloudFone Cloudpad One 7.0", result);
}
public void testDevice705() throws Exception {
    final String result = DeviceNames.getDeviceName("I50", FALLBACK);
    Assert.assertEquals("Haier I50", result);
}
public void testDevice706() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F370S", FALLBACK);
    Assert.assertEquals("LGE LG F70", result);
}
public void testDevice707() throws Exception {
    final String result = DeviceNames.getDeviceName("U707", FALLBACK);
    Assert.assertEquals("Oppo U707", result);
}
public void testDevice708() throws Exception {
    final String result = DeviceNames.getDeviceName("TM75A-V", FALLBACK);
    Assert.assertEquals("Gigabyte TM75A-V", result);
}
public void testDevice709() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U936", FALLBACK);
    Assert.assertEquals("Hisense HS-U936", result);
}
public void testDevice710() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U939", FALLBACK);
    Assert.assertEquals("Hisense HS-U939", result);
}
public void testDevice711() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H630", FALLBACK);
    Assert.assertEquals("LGE LG G Stylo", result);
}
public void testDevice712() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H631", FALLBACK);
    Assert.assertEquals("LGE LG G Stylo", result);
}
public void testDevice713() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_0P9O2", FALLBACK);
    Assert.assertEquals("HTC Desire 610", result);
}
public void testDevice714() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H636", FALLBACK);
    Assert.assertEquals("LGE LG G Stylo", result);
}
public void testDevice715() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T113NU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3V 7.0", result);
}
public void testDevice716() throws Exception {
    final String result = DeviceNames.getDeviceName("IS11S", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Acro", result);
}
public void testDevice717() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-SU760", FALLBACK);
    Assert.assertEquals("LGE Optimus 3D", result);
}
public void testDevice718() throws Exception {
    final String result = DeviceNames.getDeviceName("IS11T", FALLBACK);
    Assert.assertEquals("Fujitsu REGZA Phone IS11T", result);
}
public void testDevice719() throws Exception {
    final String result = DeviceNames.getDeviceName("IS11N", FALLBACK);
    Assert.assertEquals("NEC MEDIAS BR IS11N", result);
}
public void testDevice720() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-M828C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Precedent", result);
}
public void testDevice721() throws Exception {
    final String result = DeviceNames.getDeviceName("AS985", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice722() throws Exception {
    final String result = DeviceNames.getDeviceName("AS986", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice723() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P870h", FALLBACK);
    Assert.assertEquals("LGE Optimus F5", result);
}
public void testDevice724() throws Exception {
    final String result = DeviceNames.getDeviceName("LE55M7000CF", FALLBACK);
    Assert.assertEquals("Haier LE55M7000CF", result);
}
public void testDevice725() throws Exception {
    final String result = DeviceNames.getDeviceName("Q4T7IN", FALLBACK);
    Assert.assertEquals("Auchan Q4T7IN", result);
}
public void testDevice726() throws Exception {
    final String result = DeviceNames.getDeviceName("VT10E", FALLBACK);
    Assert.assertEquals("Vestel VT10E", result);
}
public void testDevice727() throws Exception {
    final String result = DeviceNames.getDeviceName("LT610", FALLBACK);
    Assert.assertEquals("LT610", result);
}
public void testDevice728() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T959V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S 4G", result);
}
public void testDevice729() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice730() throws Exception {
    final String result = DeviceNames.getDeviceName("N-04D", FALLBACK);
    Assert.assertEquals("NEC MEDIAS LTE N-04D", result);
}
public void testDevice731() throws Exception {
    final String result = DeviceNames.getDeviceName("N-04E", FALLBACK);
    Assert.assertEquals("NEC MEDIAS X N-04E", result);
}
public void testDevice732() throws Exception {
    final String result = DeviceNames.getDeviceName("N-04C", FALLBACK);
    Assert.assertEquals("NEC MEDIAS N-04C", result);
}
public void testDevice733() throws Exception {
    final String result = DeviceNames.getDeviceName("PI3900-93", FALLBACK);
    Assert.assertEquals("Philips PI3900", result);
}
public void testDevice734() throws Exception {
    final String result = DeviceNames.getDeviceName("HSG1279", FALLBACK);
    Assert.assertEquals("HANNSpree HSG1279", result);
}
public void testDevice735() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F570S", FALLBACK);
    Assert.assertEquals("LGE LG F570S", result);
}
public void testDevice736() throws Exception {
    final String result = DeviceNames.getDeviceName("samsung-printer-tablet", FALLBACK);
    Assert.assertEquals("Samsung ProXpress M4580", result);
}
public void testDevice737() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T320", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Pro 8.4", result);
}
public void testDevice738() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_PO582", FALLBACK);
    Assert.assertEquals("HTC One mini", result);
}
public void testDevice739() throws Exception {
    final String result = DeviceNames.getDeviceName("SX930C_CJ", FALLBACK);
    Assert.assertEquals("CJ HelloVision Hello TV Smart", result);
}
public void testDevice740() throws Exception {
    final String result = DeviceNames.getDeviceName("MB886", FALLBACK);
    Assert.assertEquals("Motorola Atrix HD", result);
}
public void testDevice741() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-C01", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice742() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900R6", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice743() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900R7", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice744() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice745() throws Exception {
    final String result = DeviceNames.getDeviceName("U8652", FALLBACK);
    Assert.assertEquals("Huawei U8652", result);
}
public void testDevice746() throws Exception {
    final String result = DeviceNames.getDeviceName("MotoroiX", FALLBACK);
    Assert.assertEquals("Motorola Droid X", result);
}
public void testDevice747() throws Exception {
    final String result = DeviceNames.getDeviceName("M620", FALLBACK);
    Assert.assertEquals("Huawei M620", result);
}
public void testDevice748() throws Exception {
    final String result = DeviceNames.getDeviceName("M821H", FALLBACK);
    Assert.assertEquals("Hisense M821H", result);
}
public void testDevice749() throws Exception {
    final String result = DeviceNames.getDeviceName("Z970", FALLBACK);
    Assert.assertEquals("ZTE ZMax", result);
}
public void testDevice750() throws Exception {
    final String result = DeviceNames.getDeviceName("INSIGNIA_550i", FALLBACK);
    Assert.assertEquals("GoClever INSIGNIA 550i", result);
}
public void testDevice751() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Incredible_S", FALLBACK);
    Assert.assertEquals("HTC Incredible S", result);
}
public void testDevice752() throws Exception {
    final String result = DeviceNames.getDeviceName("ME302C", FALLBACK);
    Assert.assertEquals("Asus MeMo Pad 10 (ME302C)", result);
}
public void testDevice753() throws Exception {
    final String result = DeviceNames.getDeviceName("BNT-710", FALLBACK);
    Assert.assertEquals("RCA BNT-710", result);
}
public void testDevice754() throws Exception {
    final String result = DeviceNames.getDeviceName("R819T", FALLBACK);
    Assert.assertEquals("Oppo R819T", result);
}
public void testDevice755() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920W8", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice756() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J100FN", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice757() throws Exception {
    final String result = DeviceNames.getDeviceName("R8200", FALLBACK);
    Assert.assertEquals("Oppo R8200", result);
}
public void testDevice758() throws Exception {
    final String result = DeviceNames.getDeviceName("C9660", FALLBACK);
    Assert.assertEquals("YotaPhone C9660", result);
}
public void testDevice759() throws Exception {
    final String result = DeviceNames.getDeviceName("5017D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (4.5)", result);
}
public void testDevice760() throws Exception {
    final String result = DeviceNames.getDeviceName("5017E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (4.5)", result);
}
public void testDevice761() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-S01", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice762() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-S00", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice763() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F670S", FALLBACK);
    Assert.assertEquals("LGE LG K10", result);
}
public void testDevice764() throws Exception {
    final String result = DeviceNames.getDeviceName("5017A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (4.5)", result);
}
public void testDevice765() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-S05", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice766() throws Exception {
    final String result = DeviceNames.getDeviceName("EG929", FALLBACK);
    Assert.assertEquals("Hisense EG929", result);
}
public void testDevice767() throws Exception {
    final String result = DeviceNames.getDeviceName("VF-1397", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) VF-1397", result);
}
public void testDevice768() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F670L", FALLBACK);
    Assert.assertEquals("LGE LG K10", result);
}
public void testDevice769() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F670K", FALLBACK);
    Assert.assertEquals("LGE LG K10", result);
}
public void testDevice770() throws Exception {
    final String result = DeviceNames.getDeviceName("PX2700", FALLBACK);
    Assert.assertEquals("Hisense PX2700", result);
}
public void testDevice771() throws Exception {
    final String result = DeviceNames.getDeviceName("AX1020", FALLBACK);
    Assert.assertEquals("BMobile AX1020", result);
}
public void testDevice772() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H788TR", FALLBACK);
    Assert.assertEquals("LGE LG AKA", result);
}
public void testDevice773() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9295", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Active", result);
}
public void testDevice774() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F470K", FALLBACK);
    Assert.assertEquals("LGE G3 Beat", result);
}
public void testDevice775() throws Exception {
    final String result = DeviceNames.getDeviceName("B1-A71", FALLBACK);
    Assert.assertEquals("Acer B1-A71", result);
}
public void testDevice776() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5312", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice777() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F470L", FALLBACK);
    Assert.assertEquals("LGE G3 Beat", result);
}
public void testDevice778() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice779() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E730", FALLBACK);
    Assert.assertEquals("LGE Optimus Sol", result);
}
public void testDevice780() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F470S", FALLBACK);
    Assert.assertEquals("LGE G3 Beat", result);
}
public void testDevice781() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E739", FALLBACK);
    Assert.assertEquals("LG MyTouch e739", result);
}
public void testDevice782() throws Exception {
    final String result = DeviceNames.getDeviceName("D2533", FALLBACK);
    Assert.assertEquals("Sony Xperia C3", result);
}
public void testDevice783() throws Exception {
    final String result = DeviceNames.getDeviceName("PAD69H", FALLBACK);
    Assert.assertEquals("Haier", result);
}
public void testDevice784() throws Exception {
    final String result = DeviceNames.getDeviceName("ST10/ST10x", FALLBACK);
    Assert.assertEquals("Southern Telecom Smartab ST10", result);
}
public void testDevice785() throws Exception {
    final String result = DeviceNames.getDeviceName("778TPC", FALLBACK);
    Assert.assertEquals("IView 778TPC", result);
}
public void testDevice786() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6573W23", FALLBACK);
    Assert.assertEquals("RCA RCT6573W23", result);
}
public void testDevice787() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7278U", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3 Duos", result);
}
public void testDevice788() throws Exception {
    final String result = DeviceNames.getDeviceName("10DTB12A", FALLBACK);
    Assert.assertEquals("Hipstreet HS-10DTB12A", result);
}
public void testDevice789() throws Exception {
    final String result = DeviceNames.getDeviceName("N918St", FALLBACK);
    Assert.assertEquals("ZTE N918St", result);
}
public void testDevice790() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LU6800", FALLBACK);
    Assert.assertEquals("LGE Optimus Big", result);
}
public void testDevice791() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-P739", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice792() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I847", FALLBACK);
    Assert.assertEquals("Samsung Rugby Smart", result);
}
public void testDevice793() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ456", FALLBACK);
    Assert.assertEquals("Fly Era Life 2", result);
}
public void testDevice794() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ459", FALLBACK);
    Assert.assertEquals("Fly Evo Chic 2", result);
}
public void testDevice795() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K360J3D", FALLBACK);
    Assert.assertEquals("Hisense LED32K360J3D", result);
}
public void testDevice796() throws Exception {
    final String result = DeviceNames.getDeviceName("VivaH7LTE", FALLBACK);
    Assert.assertEquals("AllView Viva H7 LTE", result);
}
public void testDevice797() throws Exception {
    final String result = DeviceNames.getDeviceName("Clempad2_XL", FALLBACK);
    Assert.assertEquals("Clementoni Clempad 4.4 XL", result);
}
public void testDevice798() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G350", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Plus", result);
}
public void testDevice799() throws Exception {
    final String result = DeviceNames.getDeviceName("LT26w", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia acro S", result);
}
public void testDevice800() throws Exception {
    final String result = DeviceNames.getDeviceName("L39t", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1", result);
}
public void testDevice801() throws Exception {
    final String result = DeviceNames.getDeviceName("L39u", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1", result);
}
public void testDevice802() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-D668", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH D668", result);
}
public void testDevice803() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F160S", FALLBACK);
    Assert.assertEquals("LGE LG optimus LTE2", result);
}
public void testDevice804() throws Exception {
    final String result = DeviceNames.getDeviceName("L39h", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1", result);
}
public void testDevice805() throws Exception {
    final String result = DeviceNames.getDeviceName("LT26i", FALLBACK);
    Assert.assertEquals("Sony Xperia S", result);
}
public void testDevice806() throws Exception {
    final String result = DeviceNames.getDeviceName("OCTA", FALLBACK);
    Assert.assertEquals("Positivo OCTA", result);
}
public void testDevice807() throws Exception {
    final String result = DeviceNames.getDeviceName("DM016SH", FALLBACK);
    Assert.assertEquals("Sharp DM016SH", result);
}
public void testDevice808() throws Exception {
    final String result = DeviceNames.getDeviceName("FW8977-ED", FALLBACK);
    Assert.assertEquals("Verssed FW8977-ED", result);
}
public void testDevice809() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I545PP", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice810() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1078", FALLBACK);
    Assert.assertEquals("Motorola MOTO G", result);
}
public void testDevice811() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1079", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice812() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R530M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice813() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D828x", FALLBACK);
    Assert.assertEquals("HTC Desire 828", result);
}
public void testDevice814() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1072", FALLBACK);
    Assert.assertEquals("Motorola MOTO G", result);
}
public void testDevice815() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G870F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Active", result);
}
public void testDevice816() throws Exception {
    final String result = DeviceNames.getDeviceName("C1904", FALLBACK);
    Assert.assertEquals("Sony Xperia M", result);
}
public void testDevice817() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R530X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice818() throws Exception {
    final String result = DeviceNames.getDeviceName("C1905", FALLBACK);
    Assert.assertEquals("Sony Xperia M", result);
}
public void testDevice819() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R530U", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice820() throws Exception {
    final String result = DeviceNames.getDeviceName("XT555C", FALLBACK);
    Assert.assertEquals("Motorola Moto Defy XT", result);
}
public void testDevice821() throws Exception {
    final String result = DeviceNames.getDeviceName("SKi630t", FALLBACK);
    Assert.assertEquals("Hisense SKi630t", result);
}
public void testDevice822() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H635", FALLBACK);
    Assert.assertEquals("LGE LG G Stylo", result);
}
public void testDevice823() throws Exception {
    final String result = DeviceNames.getDeviceName("R45", FALLBACK);
    Assert.assertEquals("Revtel R45", result);
}
public void testDevice824() throws Exception {
    final String result = DeviceNames.getDeviceName("NS-P16AT10", FALLBACK);
    Assert.assertEquals("Insignia NS-P16AT10", result);
}
public void testDevice825() throws Exception {
    final String result = DeviceNames.getDeviceName("Y550-L02", FALLBACK);
    Assert.assertEquals("Huawei Y550-L02", result);
}
public void testDevice826() throws Exception {
    final String result = DeviceNames.getDeviceName("Y550-L03", FALLBACK);
    Assert.assertEquals("Huawei Y550-L03", result);
}
public void testDevice827() throws Exception {
    final String result = DeviceNames.getDeviceName("R831", FALLBACK);
    Assert.assertEquals("Oppo R831", result);
}
public void testDevice828() throws Exception {
    final String result = DeviceNames.getDeviceName("R830", FALLBACK);
    Assert.assertEquals("OPPO R830", result);
}
public void testDevice829() throws Exception {
    final String result = DeviceNames.getDeviceName("AT300SE", FALLBACK);
    Assert.assertEquals("Toshiba AT400", result);
}
public void testDevice830() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T320NU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Pro 8.4", result);
}
public void testDevice831() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E140L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice832() throws Exception {
    final String result = DeviceNames.getDeviceName("X35E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) X35E", result);
}
public void testDevice833() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E140K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice834() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E140S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice835() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I435L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice836() throws Exception {
    final String result = DeviceNames.getDeviceName("XT910", FALLBACK);
    Assert.assertEquals("Motorola Droid RAZR", result);
}
public void testDevice837() throws Exception {
    final String result = DeviceNames.getDeviceName("X35T", FALLBACK);
    Assert.assertEquals("Auchan Selecline X35T", result);
}
public void testDevice838() throws Exception {
    final String result = DeviceNames.getDeviceName("710C", FALLBACK);
    Assert.assertEquals("HTC 710C", result);
}
public void testDevice839() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5690R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Xcover", result);
}
public void testDevice840() throws Exception {
    final String result = DeviceNames.getDeviceName("ME501", FALLBACK);
    Assert.assertEquals("Motorola Cliq-XT", result);
}
public void testDevice841() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5690L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Xcover", result);
}
public void testDevice842() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5690M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Xcover", result);
}
public void testDevice843() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL16C", FALLBACK);
    Assert.assertEquals("LGE Y25", result);
}
public void testDevice844() throws Exception {
    final String result = DeviceNames.getDeviceName("F-01D", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Tab LTE F-01D", result);
}
public void testDevice845() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T889", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note II", result);
}
public void testDevice846() throws Exception {
    final String result = DeviceNames.getDeviceName("GN152", FALLBACK);
    Assert.assertEquals("Gionee GN152", result);
}
public void testDevice847() throws Exception {
    final String result = DeviceNames.getDeviceName("F-01H", FALLBACK);
    Assert.assertEquals("Fujitsu F-01H", result);
}
public void testDevice848() throws Exception {
    final String result = DeviceNames.getDeviceName("Z768G", FALLBACK);
    Assert.assertEquals("ZTE Z768G", result);
}
public void testDevice849() throws Exception {
    final String result = DeviceNames.getDeviceName("P022", FALLBACK);
    Assert.assertEquals("Asus Zenpad 8.0 (Z380C)", result);
}
public void testDevice850() throws Exception {
    final String result = DeviceNames.getDeviceName("P023", FALLBACK);
    Assert.assertEquals("Asus ZenPad 10 (Z300C)", result);
}
public void testDevice851() throws Exception {
    final String result = DeviceNames.getDeviceName("K00X", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 7 LTE (ME7530CL)", result);
}
public void testDevice852() throws Exception {
    final String result = DeviceNames.getDeviceName("P021", FALLBACK);
    Assert.assertEquals("Asus ZenPad 10 (Z300CG)", result);
}
public void testDevice853() throws Exception {
    final String result = DeviceNames.getDeviceName("GEM-701L", FALLBACK);
    Assert.assertEquals("Huawei X2", result);
}
public void testDevice854() throws Exception {
    final String result = DeviceNames.getDeviceName("P024", FALLBACK);
    Assert.assertEquals("Asus Zenpad 8.0 (Z380KL)", result);
}
public void testDevice855() throws Exception {
    final String result = DeviceNames.getDeviceName("401SH", FALLBACK);
    Assert.assertEquals("Sharp 401SH", result);
}
public void testDevice856() throws Exception {
    final String result = DeviceNames.getDeviceName("001DL", FALLBACK);
    Assert.assertEquals("Dell Streak", result);
}
public void testDevice857() throws Exception {
    final String result = DeviceNames.getDeviceName("401SO", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3", result);
}
public void testDevice858() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E617G", FALLBACK);
    Assert.assertEquals("LGE Optimus L5", result);
}
public void testDevice859() throws Exception {
    final String result = DeviceNames.getDeviceName("EGQ780", FALLBACK);
    Assert.assertEquals("Ematic EGQ780", result);
}
public void testDevice860() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A8000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A8", result);
}
public void testDevice861() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9050", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice862() throws Exception {
    final String result = DeviceNames.getDeviceName("Q-Touch", FALLBACK);
    Assert.assertEquals("Plus4 Q-Touch", result);
}
public void testDevice863() throws Exception {
    final String result = DeviceNames.getDeviceName("TEI11011MST", FALLBACK);
    Assert.assertEquals("Mecer TEI11011", result);
}
public void testDevice864() throws Exception {
    final String result = DeviceNames.getDeviceName("TECTOYTT2500", FALLBACK);
    Assert.assertEquals("Anydata TecToy TT-2500", result);
}
public void testDevice865() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7108", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice866() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9507V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice867() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note II", result);
}
public void testDevice868() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_E7316", FALLBACK);
    Assert.assertEquals("Medion LIFETAB E7316", result);
}
public void testDevice869() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7102", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice870() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_E7313", FALLBACK);
    Assert.assertEquals("Medion LIFETAB E7313", result);
}
public void testDevice871() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7105", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note II", result);
}
public void testDevice872() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_E7310", FALLBACK);
    Assert.assertEquals("Lenovo LIFETAB E7310", result);
}
public void testDevice873() throws Exception {
    final String result = DeviceNames.getDeviceName("Prime", FALLBACK);
    Assert.assertEquals("Explay Prime", result);
}
public void testDevice874() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K600X3D", FALLBACK);
    Assert.assertEquals("Hisense LED32K600X3D", result);
}
public void testDevice875() throws Exception {
    final String result = DeviceNames.getDeviceName("E6508", FALLBACK);
    Assert.assertEquals("Sony Xperia Z4v", result);
}
public void testDevice876() throws Exception {
    final String result = DeviceNames.getDeviceName("XT621", FALLBACK);
    Assert.assertEquals("Motorola Master Touch XT621", result);
}
public void testDevice877() throws Exception {
    final String result = DeviceNames.getDeviceName("XT627", FALLBACK);
    Assert.assertEquals("Motorola XT627", result);
}
public void testDevice878() throws Exception {
    final String result = DeviceNames.getDeviceName("XT626", FALLBACK);
    Assert.assertEquals("Motorola Motoluxe", result);
}
public void testDevice879() throws Exception {
    final String result = DeviceNames.getDeviceName("l3453", FALLBACK);
    Assert.assertEquals("Toshiba L5450C", result);
}
public void testDevice880() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A800S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A8", result);
}
public void testDevice881() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-J929L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL J929L", result);
}
public void testDevice882() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00LD", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 Laser (ZE550KL)", result);
}
public void testDevice883() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A800X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A8", result);
}
public void testDevice884() throws Exception {
    final String result = DeviceNames.getDeviceName("XT919", FALLBACK);
    Assert.assertEquals("Motorola RAZR D3", result);
}
public void testDevice885() throws Exception {
    final String result = DeviceNames.getDeviceName("OC1020A", FALLBACK);
    Assert.assertEquals("3Q OC1020A", result);
}
public void testDevice886() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A800F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A8", result);
}
public void testDevice887() throws Exception {
    final String result = DeviceNames.getDeviceName("STV100-4", FALLBACK);
    Assert.assertEquals("BlackBerry PRIV by BlackBerry", result);
}
public void testDevice888() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A800I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A8", result);
}
public void testDevice889() throws Exception {
    final String result = DeviceNames.getDeviceName("Q4T10INK", FALLBACK);
    Assert.assertEquals("Auchan QILIVE", result);
}
public void testDevice890() throws Exception {
    final String result = DeviceNames.getDeviceName("CKT3", FALLBACK);
    Assert.assertEquals("ESI Enterprises CKT3", result);
}
public void testDevice891() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D610", FALLBACK);
    Assert.assertEquals("LGE G2 MINI", result);
}
public void testDevice892() throws Exception {
    final String result = DeviceNames.getDeviceName("Glacier", FALLBACK);
    Assert.assertEquals("Gigabyte TM105A", result);
}
public void testDevice893() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A900L", FALLBACK);
    Assert.assertEquals("Pantech VEGA Secret UP", result);
}
public void testDevice894() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A900K", FALLBACK);
    Assert.assertEquals("Pantech VEGA Secret UP", result);
}
public void testDevice895() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D618", FALLBACK);
    Assert.assertEquals("LGE G2 MINI", result);
}
public void testDevice896() throws Exception {
    final String result = DeviceNames.getDeviceName("Fog", FALLBACK);
    Assert.assertEquals("Explay Fog", result);
}
public void testDevice897() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A900S", FALLBACK);
    Assert.assertEquals("Pantech VEGA Secret UP", result);
}
public void testDevice898() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530MU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice899() throws Exception {
    final String result = DeviceNames.getDeviceName("ST21i", FALLBACK);
    Assert.assertEquals("Sony Xperia Tipo", result);
}
public void testDevice900() throws Exception {
    final String result = DeviceNames.getDeviceName("Smart402", FALLBACK);
    Assert.assertEquals("BYD Smart 402", result);
}
public void testDevice901() throws Exception {
    final String result = DeviceNames.getDeviceName("C5502", FALLBACK);
    Assert.assertEquals("Sony Xperia ZR", result);
}
public void testDevice902() throws Exception {
    final String result = DeviceNames.getDeviceName("C5503", FALLBACK);
    Assert.assertEquals("Sony Xperia ZR", result);
}
public void testDevice903() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I629", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice904() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9060M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo Plus", result);
}
public void testDevice905() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9060L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo", result);
}
public void testDevice906() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9060I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo Plus", result);
}
public void testDevice907() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9060C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo Plus", result);
}
public void testDevice908() throws Exception {
    final String result = DeviceNames.getDeviceName("EGQ178", FALLBACK);
    Assert.assertEquals("Ematic EGQ178", result);
}
public void testDevice909() throws Exception {
    final String result = DeviceNames.getDeviceName("V972M", FALLBACK);
    Assert.assertEquals("ZTE LEO S1", result);
}
public void testDevice910() throws Exception {
    final String result = DeviceNames.getDeviceName("S150", FALLBACK);
    Assert.assertEquals("SK Telesys S150", result);
}
public void testDevice911() throws Exception {
    final String result = DeviceNames.getDeviceName("HM_NOTE_1LTE", FALLBACK);
    Assert.assertEquals("Xiaomi Redmi Note 4G", result);
}
public void testDevice912() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A860L", FALLBACK);
    Assert.assertEquals("Pantech IM-A860L", result);
}
public void testDevice913() throws Exception {
    final String result = DeviceNames.getDeviceName("S8Q", FALLBACK);
    Assert.assertEquals("ZTE S8Q", result);
}
public void testDevice914() throws Exception {
    final String result = DeviceNames.getDeviceName("GSmart7Tab", FALLBACK);
    Assert.assertEquals("Gigabyte TM75A", result);
}
public void testDevice915() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A860S", FALLBACK);
    Assert.assertEquals("Pantech IM-A860S", result);
}
public void testDevice916() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P355", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice917() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P350", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice918() throws Exception {
    final String result = DeviceNames.getDeviceName("Carl", FALLBACK);
    Assert.assertEquals("ZTE Racer", result);
}
public void testDevice919() throws Exception {
    final String result = DeviceNames.getDeviceName("Mach", FALLBACK);
    Assert.assertEquals("Cellon Mach", result);
}
public void testDevice920() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4551", FALLBACK);
    Assert.assertEquals("Fly IQ4551", result);
}
public void testDevice921() throws Exception {
    final String result = DeviceNames.getDeviceName("OT-990C", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) OT-990C", result);
}
public void testDevice922() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I337Z", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice923() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U912", FALLBACK);
    Assert.assertEquals("Hisense HS-U912", result);
}
public void testDevice924() throws Exception {
    final String result = DeviceNames.getDeviceName("EG680", FALLBACK);
    Assert.assertEquals("Smartfren EG680", result);
}
public void testDevice925() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V700", FALLBACK);
    Assert.assertEquals("LGE G Pad 10.1", result);
}
public void testDevice926() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H340", FALLBACK);
    Assert.assertEquals("LGE LG Leon 4G LTE", result);
}
public void testDevice927() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H342", FALLBACK);
    Assert.assertEquals("LGE LG Leon 4G LTE", result);
}
public void testDevice928() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H343", FALLBACK);
    Assert.assertEquals("LGE LG Leon 4G LTE", result);
}
public void testDevice929() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I437", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Express", result);
}
public void testDevice930() throws Exception {
    final String result = DeviceNames.getDeviceName("PLK-AL10", FALLBACK);
    Assert.assertEquals("Huawei PLK-AL10", result);
}
public void testDevice931() throws Exception {
    final String result = DeviceNames.getDeviceName("M9300", FALLBACK);
    Assert.assertEquals("Kyocera Echo", result);
}
public void testDevice932() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T978", FALLBACK);
    Assert.assertEquals("Hisense HS-T978", result);
}
public void testDevice933() throws Exception {
    final String result = DeviceNames.getDeviceName("5860E", FALLBACK);
    Assert.assertEquals("Coolpad Quattro 4G", result);
}
public void testDevice934() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T116NQ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 Lite 7.0", result);
}
public void testDevice935() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-L682", FALLBACK);
    Assert.assertEquals("Hisense L682", result);
}
public void testDevice936() throws Exception {
    final String result = DeviceNames.getDeviceName("N-02E", FALLBACK);
    Assert.assertEquals("NEC MEDIAS U N-02E", result);
}
public void testDevice937() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P905V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Pro 12.2", result);
}
public void testDevice938() throws Exception {
    final String result = DeviceNames.getDeviceName("E600", FALLBACK);
    Assert.assertEquals("Acer Liquid E600", result);
}
public void testDevice939() throws Exception {
    final String result = DeviceNames.getDeviceName("Tab2A7-10F", FALLBACK);
    Assert.assertEquals("Lenovo TAB 2 A7-10F", result);
}
public void testDevice940() throws Exception {
    final String result = DeviceNames.getDeviceName("U705W", FALLBACK);
    Assert.assertEquals("Oppo Ulike2", result);
}
public void testDevice941() throws Exception {
    final String result = DeviceNames.getDeviceName("U705T", FALLBACK);
    Assert.assertEquals("OPPO Ulike2", result);
}
public void testDevice942() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9198", FALLBACK);
    Assert.assertEquals("Samsung SM-G9198", result);
}
public void testDevice943() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P905M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Pro 12.2", result);
}
public void testDevice944() throws Exception {
    final String result = DeviceNames.getDeviceName("LT18i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia arc S", result);
}
public void testDevice945() throws Exception {
    final String result = DeviceNames.getDeviceName("T012", FALLBACK);
    Assert.assertEquals("Acer Liquid Z320", result);
}
public void testDevice946() throws Exception {
    final String result = DeviceNames.getDeviceName("SH8118U", FALLBACK);
    Assert.assertEquals("Sharp SH8118U", result);
}
public void testDevice947() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G531BT", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice948() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LS970", FALLBACK);
    Assert.assertEquals("LG Optimus G", result);
}
public void testDevice949() throws Exception {
    final String result = DeviceNames.getDeviceName("EASY1", FALLBACK);
    Assert.assertEquals("ucall EASY1", result);
}
public void testDevice950() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_07STBF", FALLBACK);
    Assert.assertEquals("Positivo Ypy 07STBF", result);
}
public void testDevice951() throws Exception {
    final String result = DeviceNames.getDeviceName("L-EMENT550", FALLBACK);
    Assert.assertEquals("Logicom L-EMENT550", result);
}
public void testDevice952() throws Exception {
    final String result = DeviceNames.getDeviceName("NX402", FALLBACK);
    Assert.assertEquals("ZTE NX40X", result);
}
public void testDevice953() throws Exception {
    final String result = DeviceNames.getDeviceName("NX401", FALLBACK);
    Assert.assertEquals("Nubia NX401", result);
}
public void testDevice954() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D157f", FALLBACK);
    Assert.assertEquals("LGE LG-D157f", result);
}
public void testDevice955() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_S1034X", FALLBACK);
    Assert.assertEquals("Medion LIFETAB S1034X", result);
}
public void testDevice956() throws Exception {
    final String result = DeviceNames.getDeviceName("M601", FALLBACK);
    Assert.assertEquals("BYD M601", result);
}
public void testDevice957() throws Exception {
    final String result = DeviceNames.getDeviceName("Fresh_NF", FALLBACK);
    Assert.assertEquals("Explay Fresh", result);
}
public void testDevice958() throws Exception {
    final String result = DeviceNames.getDeviceName("falcon", FALLBACK);
    Assert.assertEquals("Borqs Falcon", result);
}
public void testDevice959() throws Exception {
    final String result = DeviceNames.getDeviceName("ISW13HT", FALLBACK);
    Assert.assertEquals("HTC ISW13HT", result);
}
public void testDevice960() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL31L", FALLBACK);
    Assert.assertEquals("LGE LG F70", result);
}
public void testDevice961() throws Exception {
    final String result = DeviceNames.getDeviceName("T1060C", FALLBACK);
    Assert.assertEquals("Positivo T1060", result);
}
public void testDevice962() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-S25", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice963() throws Exception {
    final String result = DeviceNames.getDeviceName("B505", FALLBACK);
    Assert.assertEquals("BenQ B505", result);
}
public void testDevice964() throws Exception {
    final String result = DeviceNames.getDeviceName("B502", FALLBACK);
    Assert.assertEquals("BenQ B502", result);
}
public void testDevice965() throws Exception {
    final String result = DeviceNames.getDeviceName("Xolo_X500", FALLBACK);
    Assert.assertEquals("Intel Xolo X500", result);
}
public void testDevice966() throws Exception {
    final String result = DeviceNames.getDeviceName("PNDPP47GP", FALLBACK);
    Assert.assertEquals("Haier PNDPP47GP", result);
}
public void testDevice967() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K220", FALLBACK);
    Assert.assertEquals("Hisense LED32K220", result);
}
public void testDevice968() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_M910x", FALLBACK);
    Assert.assertEquals("HTC Desire EYE", result);
}
public void testDevice969() throws Exception {
    final String result = DeviceNames.getDeviceName("K013C", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 7", result);
}
public void testDevice970() throws Exception {
    final String result = DeviceNames.getDeviceName("E-Tab10", FALLBACK);
    Assert.assertEquals("GeneralMobile E-Tab10", result);
}
public void testDevice971() throws Exception {
    final String result = DeviceNames.getDeviceName("PI4010G", FALLBACK);
    Assert.assertEquals("Philips PI4010G", result);
}
public void testDevice972() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6672W23", FALLBACK);
    Assert.assertEquals("RCA RCT6672W23", result);
}
public void testDevice973() throws Exception {
    final String result = DeviceNames.getDeviceName("one8_0_1", FALLBACK);
    Assert.assertEquals("CloudFone Cloudpad One 8.0", result);
}
public void testDevice974() throws Exception {
    final String result = DeviceNames.getDeviceName("WX04SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE es WX04SH", result);
}
public void testDevice975() throws Exception {
    final String result = DeviceNames.getDeviceName("6039A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6039A", result);
}
public void testDevice976() throws Exception {
    final String result = DeviceNames.getDeviceName("6039K", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6039K", result);
}
public void testDevice977() throws Exception {
    final String result = DeviceNames.getDeviceName("6039J", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6039J", result);
}
public void testDevice978() throws Exception {
    final String result = DeviceNames.getDeviceName("6039H", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6039H", result);
}
public void testDevice979() throws Exception {
    final String result = DeviceNames.getDeviceName("6039S", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6039S", result);
}
public void testDevice980() throws Exception {
    final String result = DeviceNames.getDeviceName("CSL_Spice_MI700", FALLBACK);
    Assert.assertEquals("Foxconn CSL Spice MI700", result);
}
public void testDevice981() throws Exception {
    final String result = DeviceNames.getDeviceName("6039Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6039Y", result);
}
public void testDevice982() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9100P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice983() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9100T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice984() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6312", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young", result);
}
public void testDevice985() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6310", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young", result);
}
public void testDevice986() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9100G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 Plus", result);
}
public void testDevice987() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ434", FALLBACK);
    Assert.assertEquals("Fly IQ434", result);
}
public void testDevice988() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9100M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice989() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F300S", FALLBACK);
    Assert.assertEquals("LGE VU3", result);
}
public void testDevice990() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D400", FALLBACK);
    Assert.assertEquals("LGE L90", result);
}
public void testDevice991() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D405", FALLBACK);
    Assert.assertEquals("LGE L90", result);
}
public void testDevice992() throws Exception {
    final String result = DeviceNames.getDeviceName("PE-TL20", FALLBACK);
    Assert.assertEquals("Huawei PE-TL20", result);
}
public void testDevice993() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F300L", FALLBACK);
    Assert.assertEquals("LGE VU3", result);
}
public void testDevice994() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F300K", FALLBACK);
    Assert.assertEquals("LGE VU3", result);
}
public void testDevice995() throws Exception {
    final String result = DeviceNames.getDeviceName("D2114", FALLBACK);
    Assert.assertEquals("Sony Xperia E1", result);
}
public void testDevice996() throws Exception {
    final String result = DeviceNames.getDeviceName("LE48M7000CF", FALLBACK);
    Assert.assertEquals("Haier LE48M7000CF", result);
}
public void testDevice997() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR6410LVW", FALLBACK);
    Assert.assertEquals("HTC Droid Incredible 4G", result);
}
public void testDevice998() throws Exception {
    final String result = DeviceNames.getDeviceName("Vision20", FALLBACK);
    Assert.assertEquals("Hisense LED85XT910G3DU", result);
}
public void testDevice999() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G361HU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice1000() throws Exception {
    final String result = DeviceNames.getDeviceName("eZeeTab10D12-S", FALLBACK);
    Assert.assertEquals("Storex eZeeTab10D12-S", result);
}
public void testDevice1001() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B7510L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pro", result);
}
public void testDevice1002() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B7510B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pro", result);
}
public void testDevice1003() throws Exception {
    final String result = DeviceNames.getDeviceName("VK410", FALLBACK);
    Assert.assertEquals("LGE GPAD 7.0 LTE", result);
}
public void testDevice1004() throws Exception {
    final String result = DeviceNames.getDeviceName("NEC-NE-201A1A", FALLBACK);
    Assert.assertEquals("NEC NE-201", result);
}
public void testDevice1005() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR6300", FALLBACK);
    Assert.assertEquals("HTC Droid Incredible", result);
}
public void testDevice1006() throws Exception {
    final String result = DeviceNames.getDeviceName("VSD221", FALLBACK);
    Assert.assertEquals("ViewSonic VSD221", result);
}
public void testDevice1007() throws Exception {
    final String result = DeviceNames.getDeviceName("VSD220", FALLBACK);
    Assert.assertEquals("Quanta VSD220", result);
}
public void testDevice1008() throws Exception {
    final String result = DeviceNames.getDeviceName("R815", FALLBACK);
    Assert.assertEquals("Oppo R815", result);
}
public void testDevice1009() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F260S", FALLBACK);
    Assert.assertEquals("LGE LG Optimus LTE3", result);
}
public void testDevice1010() throws Exception {
    final String result = DeviceNames.getDeviceName("R819", FALLBACK);
    Assert.assertEquals("Oppo R819", result);
}
public void testDevice1011() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL_J210", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 4010X", result);
}
public void testDevice1012() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M240S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice1013() throws Exception {
    final String result = DeviceNames.getDeviceName("V1_Viper_S4G", FALLBACK);
    Assert.assertEquals("AllView V1 Viper S4G", result);
}
public void testDevice1014() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D213AR", FALLBACK);
    Assert.assertEquals("LGE L50 Sporty", result);
}
public void testDevice1015() throws Exception {
    final String result = DeviceNames.getDeviceName("IN610", FALLBACK);
    Assert.assertEquals("Infocus IN610", result);
}
public void testDevice1016() throws Exception {
    final String result = DeviceNames.getDeviceName("ME525", FALLBACK);
    Assert.assertEquals("Motorola Defy", result);
}
public void testDevice1017() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7262", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Star Plus", result);
}
public void testDevice1018() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E615f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 Dual", result);
}
public void testDevice1019() throws Exception {
    final String result = DeviceNames.getDeviceName("MI-438", FALLBACK);
    Assert.assertEquals("Spice Stellar Mi-438", result);
}
public void testDevice1020() throws Exception {
    final String result = DeviceNames.getDeviceName("C8690", FALLBACK);
    Assert.assertEquals("Cellon CJ-1984", result);
}
public void testDevice1021() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1019", FALLBACK);
    Assert.assertEquals("Motorola Moto E", result);
}
public void testDevice1022() throws Exception {
    final String result = DeviceNames.getDeviceName("Pelephone-Y300-", FALLBACK);
    Assert.assertEquals("Huawei Y300", result);
}
public void testDevice1023() throws Exception {
    final String result = DeviceNames.getDeviceName("E815", FALLBACK);
    Assert.assertEquals("BYD K-Touch E815", result);
}
public void testDevice1024() throws Exception {
    final String result = DeviceNames.getDeviceName("PRO5023PW", FALLBACK);
    Assert.assertEquals("Polaroid PRO5023PW", result);
}
public void testDevice1025() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite8QS", FALLBACK);
    Assert.assertEquals("Prestige ELITE8QS", result);
}
public void testDevice1026() throws Exception {
    final String result = DeviceNames.getDeviceName("LED48L288", FALLBACK);
    Assert.assertEquals("Hisense LED48L288", result);
}
public void testDevice1027() throws Exception {
    final String result = DeviceNames.getDeviceName("ITQ701", FALLBACK);
    Assert.assertEquals("iRiver Wow TAB +", result);
}
public void testDevice1028() throws Exception {
    final String result = DeviceNames.getDeviceName("ITQ700", FALLBACK);
    Assert.assertEquals("iRiver Wow(Window of the world)", result);
}
public void testDevice1029() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5360L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y", result);
}
public void testDevice1030() throws Exception {
    final String result = DeviceNames.getDeviceName("GEM-703L", FALLBACK);
    Assert.assertEquals("Huawei X2", result);
}
public void testDevice1031() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-D710BST", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice1032() throws Exception {
    final String result = DeviceNames.getDeviceName("Che1-L04", FALLBACK);
    Assert.assertEquals("Huawei Che1-L04", result);
}
public void testDevice1033() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5360B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y", result);
}
public void testDevice1034() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5504DUO", FALLBACK);
    Assert.assertEquals("Prestigio MultiPhone 5504 DUO", result);
}
public void testDevice1035() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR930L", FALLBACK);
    Assert.assertEquals("Pantech ADR930L", result);
}
public void testDevice1036() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5360T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y", result);
}
public void testDevice1037() throws Exception {
    final String result = DeviceNames.getDeviceName("TL66", FALLBACK);
    Assert.assertEquals("Tonino Lamborghini Antares", result);
}
public void testDevice1038() throws Exception {
    final String result = DeviceNames.getDeviceName("hisense_gx1200v", FALLBACK);
    Assert.assertEquals("Hisense TV", result);
}
public void testDevice1039() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5369", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y", result);
}
public void testDevice1040() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00T", FALLBACK);
    Assert.assertEquals("Asus PadFone X mini (PF450CL)", result);
}
public void testDevice1041() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00P", FALLBACK);
    Assert.assertEquals("Asus ZenFone 5 LTE (A500KL)", result);
}
public void testDevice1042() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00Q", FALLBACK);
    Assert.assertEquals("Asus ZenFone 4 (A450CG)", result);
}
public void testDevice1043() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00N", FALLBACK);
    Assert.assertEquals("Asus PadFone S (PF500KL)", result);
}
public void testDevice1044() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00J", FALLBACK);
    Assert.assertEquals("Asus ZenFone 5", result);
}
public void testDevice1045() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00K", FALLBACK);
    Assert.assertEquals("Asus ZenFone 5 (A502CG)", result);
}
public void testDevice1046() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00I", FALLBACK);
    Assert.assertEquals("Asus ZenFone 4 (A400CG)", result);
}
public void testDevice1047() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00F", FALLBACK);
    Assert.assertEquals("Asus ZenFone 5 (A500CG)", result);
}
public void testDevice1048() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00G", FALLBACK);
    Assert.assertEquals("Asus ZenFone 6 (A600CG)", result);
}
public void testDevice1049() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00E", FALLBACK);
    Assert.assertEquals("Asus PadFone mini", result);
}
public void testDevice1050() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000013-101", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice1051() throws Exception {
    final String result = DeviceNames.getDeviceName("MWND1", FALLBACK);
    Assert.assertEquals("Acer MWND1", result);
}
public void testDevice1052() throws Exception {
    final String result = DeviceNames.getDeviceName("STJR700", FALLBACK);
    Assert.assertEquals("Smartab STJR700", result);
}
public void testDevice1053() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9070", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Advance", result);
}
public void testDevice1054() throws Exception {
    final String result = DeviceNames.getDeviceName("MegaFon_SP-AI", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Megafon Login", result);
}
public void testDevice1055() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-L40G", FALLBACK);
    Assert.assertEquals("LGE Optimus L5", result);
}
public void testDevice1056() throws Exception {
    final String result = DeviceNames.getDeviceName("TCLJ330", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 4033X", result);
}
public void testDevice1057() throws Exception {
    final String result = DeviceNames.getDeviceName("XT605", FALLBACK);
    Assert.assertEquals("Motorola XT605", result);
}
public void testDevice1058() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I605", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note II", result);
}
public void testDevice1059() throws Exception {
    final String result = DeviceNames.getDeviceName("d-01H", FALLBACK);
    Assert.assertEquals("Huawei M2-A04L", result);
}
public void testDevice1060() throws Exception {
    final String result = DeviceNames.getDeviceName("Beeline_Pro_3", FALLBACK);
    Assert.assertEquals("Beeline Pro 3", result);
}
public void testDevice1061() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6773W22", FALLBACK);
    Assert.assertEquals("RCA RCT6773W22", result);
}
public void testDevice1062() throws Exception {
    final String result = DeviceNames.getDeviceName("W627", FALLBACK);
    Assert.assertEquals("Haier", result);
}
public void testDevice1063() throws Exception {
    final String result = DeviceNames.getDeviceName("W626", FALLBACK);
    Assert.assertEquals("Anydata Philips W626", result);
}
public void testDevice1064() throws Exception {
    final String result = DeviceNames.getDeviceName("C6Quad_4G", FALLBACK);
    Assert.assertEquals("AllView C6 Quad 4G", result);
}
public void testDevice1065() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E330S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1066() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E330L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1067() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E330K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1068() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-P907A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Pro 12.2", result);
}
public void testDevice1069() throws Exception {
    final String result = DeviceNames.getDeviceName("D6603", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3", result);
}
public void testDevice1070() throws Exception {
    final String result = DeviceNames.getDeviceName("Q6S5IN4G", FALLBACK);
    Assert.assertEquals("Auchan Q6S5IN4G", result);
}
public void testDevice1071() throws Exception {
    final String result = DeviceNames.getDeviceName("0PM92", FALLBACK);
    Assert.assertEquals("HTC Desire 626s", result);
}
public void testDevice1072() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5283B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Star Trios", result);
}
public void testDevice1073() throws Exception {
    final String result = DeviceNames.getDeviceName("M7808", FALLBACK);
    Assert.assertEquals("Haier M7808", result);
}
public void testDevice1074() throws Exception {
    final String result = DeviceNames.getDeviceName("Q", FALLBACK);
    Assert.assertEquals("Cellon Q", result);
}
public void testDevice1075() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I747M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice1076() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G357FZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Style", result);
}
public void testDevice1077() throws Exception {
    final String result = DeviceNames.getDeviceName("One", FALLBACK);
    Assert.assertEquals("One", result);
}
public void testDevice1078() throws Exception {
    final String result = DeviceNames.getDeviceName("SI4301", FALLBACK);
    Assert.assertEquals("BYD SI4301", result);
}
public void testDevice1079() throws Exception {
    final String result = DeviceNames.getDeviceName("6016D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6016D", result);
}
public void testDevice1080() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M480W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice1081() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-SU870", FALLBACK);
    Assert.assertEquals("LGE Optimus 3D MAX", result);
}
public void testDevice1082() throws Exception {
    final String result = DeviceNames.getDeviceName("K01B", FALLBACK);
    Assert.assertEquals("Asus Transformer Pad (TF303K)", result);
}
public void testDevice1083() throws Exception {
    final String result = DeviceNames.getDeviceName("movo", FALLBACK);
    Assert.assertEquals("TCL LE50UHDE5692G", result);
}
public void testDevice1084() throws Exception {
    final String result = DeviceNames.getDeviceName("K01A", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 7 (ME70C)", result);
}
public void testDevice1085() throws Exception {
    final String result = DeviceNames.getDeviceName("K01F", FALLBACK);
    Assert.assertEquals("Asus Fonepad 7 (FE171MG)", result);
}
public void testDevice1086() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V700n", FALLBACK);
    Assert.assertEquals("LGE G Pad 10.1", result);
}
public void testDevice1087() throws Exception {
    final String result = DeviceNames.getDeviceName("K01E", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad (ME103K)", result);
}
public void testDevice1088() throws Exception {
    final String result = DeviceNames.getDeviceName("K01H", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 8 (ME581C)", result);
}
public void testDevice1089() throws Exception {
    final String result = DeviceNames.getDeviceName("K01N", FALLBACK);
    Assert.assertEquals("Asus Fonepad 7 (FE171CG)", result);
}
public void testDevice1090() throws Exception {
    final String result = DeviceNames.getDeviceName("6016A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6010A", result);
}
public void testDevice1091() throws Exception {
    final String result = DeviceNames.getDeviceName("K01Q", FALLBACK);
    Assert.assertEquals("Asus Fonepad 7 LTE (FE375CL)", result);
}
public void testDevice1092() throws Exception {
    final String result = DeviceNames.getDeviceName("K01U", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 7 (ME171C)", result);
}
public void testDevice1093() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6500", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini2", result);
}
public void testDevice1094() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T679M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy W", result);
}
public void testDevice1095() throws Exception {
    final String result = DeviceNames.getDeviceName("V2_Viper_I_TM", FALLBACK);
    Assert.assertEquals("AllView V2 Viper I", result);
}
public void testDevice1096() throws Exception {
    final String result = DeviceNames.getDeviceName("E10319", FALLBACK);
    Assert.assertEquals("Medion microstar E10319", result);
}
public void testDevice1097() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL55C", FALLBACK);
    Assert.assertEquals("LG LGL55C", result);
}
public void testDevice1098() throws Exception {
    final String result = DeviceNames.getDeviceName("G630-U20", FALLBACK);
    Assert.assertEquals("Huawei G630-U20", result);
}
public void testDevice1099() throws Exception {
    final String result = DeviceNames.getDeviceName("201M", FALLBACK);
    Assert.assertEquals("MOTOROLA RAZR M", result);
}
public void testDevice1100() throws Exception {
    final String result = DeviceNames.getDeviceName("GN5001S", FALLBACK);
    Assert.assertEquals("Gionee GN5001S", result);
}
public void testDevice1101() throws Exception {
    final String result = DeviceNames.getDeviceName("N5206", FALLBACK);
    Assert.assertEquals("Oppo N3", result);
}
public void testDevice1102() throws Exception {
    final String result = DeviceNames.getDeviceName("N5207", FALLBACK);
    Assert.assertEquals("Oppo N3", result);
}
public void testDevice1103() throws Exception {
    final String result = DeviceNames.getDeviceName("201K", FALLBACK);
    Assert.assertEquals("Kyocera Honeybee Touch", result);
}
public void testDevice1104() throws Exception {
    final String result = DeviceNames.getDeviceName("MB511", FALLBACK);
    Assert.assertEquals("Motorola Flipout", result);
}
public void testDevice1105() throws Exception {
    final String result = DeviceNames.getDeviceName("GALAPAD_S6", FALLBACK);
    Assert.assertEquals("Galapad S6", result);
}
public void testDevice1106() throws Exception {
    final String result = DeviceNames.getDeviceName("N5209", FALLBACK);
    Assert.assertEquals("Oppo N3", result);
}
public void testDevice1107() throws Exception {
    final String result = DeviceNames.getDeviceName("9021A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 9021A", result);
}
public void testDevice1108() throws Exception {
    final String result = DeviceNames.getDeviceName("7050Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP S9", result);
}
public void testDevice1109() throws Exception {
    final String result = DeviceNames.getDeviceName("GN5001L", FALLBACK);
    Assert.assertEquals("Gionee GN5001L", result);
}
public void testDevice1110() throws Exception {
    final String result = DeviceNames.getDeviceName("PantechP9060", FALLBACK);
    Assert.assertEquals("Pantech Pocket", result);
}
public void testDevice1111() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9515", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1112() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice1113() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M930BST", FALLBACK);
    Assert.assertEquals("Samsung Transform Ultra", result);
}
public void testDevice1114() throws Exception {
    final String result = DeviceNames.getDeviceName("TA80TA1", FALLBACK);
    Assert.assertEquals("Tinhvan TA80TA1", result);
}
public void testDevice1115() throws Exception {
    final String result = DeviceNames.getDeviceName("K012", FALLBACK);
    Assert.assertEquals("Asus Fonepad 7 (FE170CG)", result);
}
public void testDevice1116() throws Exception {
    final String result = DeviceNames.getDeviceName("K013", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 7 (ME176CX)", result);
}
public void testDevice1117() throws Exception {
    final String result = DeviceNames.getDeviceName("K010", FALLBACK);
    Assert.assertEquals("Best Buy Transformer Pad (TF103C)", result);
}
public void testDevice1118() throws Exception {
    final String result = DeviceNames.getDeviceName("K011", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 8 (ME181CX)", result);
}
public void testDevice1119() throws Exception {
    final String result = DeviceNames.getDeviceName("K016", FALLBACK);
    Assert.assertEquals("Asus Fonepad 8 (FE380CXG)", result);
}
public void testDevice1120() throws Exception {
    final String result = DeviceNames.getDeviceName("K017", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 7 (ME170C)", result);
}
public void testDevice1121() throws Exception {
    final String result = DeviceNames.getDeviceName("K014", FALLBACK);
    Assert.assertEquals("Asus Transformer Pad (TF303CL)", result);
}
public void testDevice1122() throws Exception {
    final String result = DeviceNames.getDeviceName("K015", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 8 (ME581CL)", result);
}
public void testDevice1123() throws Exception {
    final String result = DeviceNames.getDeviceName("K018", FALLBACK);
    Assert.assertEquals("Asus Transformer Pad (TF103CG)", result);
}
public void testDevice1124() throws Exception {
    final String result = DeviceNames.getDeviceName("K019", FALLBACK);
    Assert.assertEquals("Asus Fonepad 7(FE375CXG)", result);
}
public void testDevice1125() throws Exception {
    final String result = DeviceNames.getDeviceName("U707T", FALLBACK);
    Assert.assertEquals("Oppo U707T", result);
}
public void testDevice1126() throws Exception {
    final String result = DeviceNames.getDeviceName("Kate", FALLBACK);
    Assert.assertEquals("Wenu Kate", result);
}
public void testDevice1127() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T365", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 Active", result);
}
public void testDevice1128() throws Exception {
    final String result = DeviceNames.getDeviceName("4028J", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4.5)", result);
}
public void testDevice1129() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X155", FALLBACK);
    Assert.assertEquals("LGE LG Max", result);
}
public void testDevice1130() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T2105", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 Kids", result);
}
public void testDevice1131() throws Exception {
    final String result = DeviceNames.getDeviceName("4028A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4.5)", result);
}
public void testDevice1132() throws Exception {
    final String result = DeviceNames.getDeviceName("4028E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4.5)", result);
}
public void testDevice1133() throws Exception {
    final String result = DeviceNames.getDeviceName("306SH", FALLBACK);
    Assert.assertEquals("Sharp 306SH", result);
}
public void testDevice1134() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5301L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Plus", result);
}
public void testDevice1135() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LS995", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice1136() throws Exception {
    final String result = DeviceNames.getDeviceName("4028S", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4.5)", result);
}
public void testDevice1137() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5301B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Plus", result);
}
public void testDevice1138() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1225", FALLBACK);
    Assert.assertEquals("Motorola Moto Turbo", result);
}
public void testDevice1139() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313HZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Duos3", result);
}
public void testDevice1140() throws Exception {
    final String result = DeviceNames.getDeviceName("T1-701ua", FALLBACK);
    Assert.assertEquals("Huawei MediaPad", result);
}
public void testDevice1141() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313HY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace 4", result);
}
public void testDevice1142() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-A11A", FALLBACK);
    Assert.assertEquals("Sharp LC-A11A", result);
}
public void testDevice1143() throws Exception {
    final String result = DeviceNames.getDeviceName("AST21", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 8 (AST21)", result);
}
public void testDevice1144() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313HN", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4", result);
}
public void testDevice1145() throws Exception {
    final String result = DeviceNames.getDeviceName("Yellowstone", FALLBACK);
    Assert.assertEquals("Google Project Tango Tablet Development Kit", result);
}
public void testDevice1146() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I727R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice1147() throws Exception {
    final String result = DeviceNames.getDeviceName("Cygnus45", FALLBACK);
    Assert.assertEquals("MobiWire Cygnus", result);
}
public void testDevice1148() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9210T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice1149() throws Exception {
    final String result = DeviceNames.getDeviceName("Primo81", FALLBACK);
    Assert.assertEquals("MSI Primo81", result);
}
public void testDevice1150() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5508DUO", FALLBACK);
    Assert.assertEquals("Prestigio Multiphone 5508 DUO", result);
}
public void testDevice1151() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T210X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 8.0", result);
}
public void testDevice1152() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC-X710a", FALLBACK);
    Assert.assertEquals("HTC Velocity 4G", result);
}
public void testDevice1153() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T210R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 3 7.0", result);
}
public void testDevice1154() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T210L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 7.0", result);
}
public void testDevice1155() throws Exception {
    final String result = DeviceNames.getDeviceName("Joy_TV", FALLBACK);
    Assert.assertEquals("Explay Joy TV", result);
}
public void testDevice1156() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT8802G", FALLBACK);
    Assert.assertEquals("Proscan PLT8802G", result);
}
public void testDevice1157() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL33L", FALLBACK);
    Assert.assertEquals("LGE LG SUNSET", result);
}
public void testDevice1158() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D180f", FALLBACK);
    Assert.assertEquals("LGE Optimus L40", result);
}
public void testDevice1159() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65K600X3D", FALLBACK);
    Assert.assertEquals("Hisense LED65K600X3D", result);
}
public void testDevice1160() throws Exception {
    final String result = DeviceNames.getDeviceName("CMB405", FALLBACK);
    Assert.assertEquals("Hisense CMB405", result);
}
public void testDevice1161() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E445", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L4 II Dual", result);
}
public void testDevice1162() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E440", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L4 II", result);
}
public void testDevice1163() throws Exception {
    final String result = DeviceNames.getDeviceName("305SH", FALLBACK);
    Assert.assertEquals("Sharp SoftBank 305SH", result);
}
public void testDevice1164() throws Exception {
    final String result = DeviceNames.getDeviceName("NX785QC", FALLBACK);
    Assert.assertEquals("Nextbook NX785QC", result);
}
public void testDevice1165() throws Exception {
    final String result = DeviceNames.getDeviceName("Z933", FALLBACK);
    Assert.assertEquals("ZTE Z933", result);
}
public void testDevice1166() throws Exception {
    final String result = DeviceNames.getDeviceName("LGMS631", FALLBACK);
    Assert.assertEquals("LGE LG G Stylo", result);
}
public void testDevice1167() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M480K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice1168() throws Exception {
    final String result = DeviceNames.getDeviceName("Q4514", FALLBACK);
    Assert.assertEquals("Auchan Q.4514", result);
}
public void testDevice1169() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-L520", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice1170() throws Exception {
    final String result = DeviceNames.getDeviceName("FZ-X1", FALLBACK);
    Assert.assertEquals("Panasonic FZ-X1", result);
}
public void testDevice1171() throws Exception {
    final String result = DeviceNames.getDeviceName("MT-803G", FALLBACK);
    Assert.assertEquals("Huawei T802", result);
}
public void testDevice1172() throws Exception {
    final String result = DeviceNames.getDeviceName("10DTB10", FALLBACK);
    Assert.assertEquals("Hipstreet Phantom", result);
}
public void testDevice1173() throws Exception {
    final String result = DeviceNames.getDeviceName("SOT21", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2 Tablet", result);
}
public void testDevice1174() throws Exception {
    final String result = DeviceNames.getDeviceName("ITP-E410W", FALLBACK);
    Assert.assertEquals("SK Telesys ITP-E410W", result);
}
public void testDevice1175() throws Exception {
    final String result = DeviceNames.getDeviceName("LED39K600X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED39K600X3DU", result);
}
public void testDevice1176() throws Exception {
    final String result = DeviceNames.getDeviceName("E6715", FALLBACK);
    Assert.assertEquals("Kyocera TorqueXT", result);
}
public void testDevice1177() throws Exception {
    final String result = DeviceNames.getDeviceName("6037K", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6037K", result);
}
public void testDevice1178() throws Exception {
    final String result = DeviceNames.getDeviceName("A712", FALLBACK);
    Assert.assertEquals("Astro Queo A712", result);
}
public void testDevice1179() throws Exception {
    final String result = DeviceNames.getDeviceName("6037B", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6037B", result);
}
public void testDevice1180() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-M919", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1181() throws Exception {
    final String result = DeviceNames.getDeviceName("6037Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6037Y", result);
}
public void testDevice1182() throws Exception {
    final String result = DeviceNames.getDeviceName("A-TT00", FALLBACK);
    Assert.assertEquals("Haier A-TT00", result);
}
public void testDevice1183() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D852", FALLBACK);
    Assert.assertEquals("G3", result);
}
public void testDevice1184() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R680", FALLBACK);
    Assert.assertEquals("Samsung Repp", result);
}
public void testDevice1185() throws Exception {
    final String result = DeviceNames.getDeviceName("BKO-S200", FALLBACK);
    Assert.assertEquals("SK Broadband B tv smart", result);
}
public void testDevice1186() throws Exception {
    final String result = DeviceNames.getDeviceName("KC-S701", FALLBACK);
    Assert.assertEquals("Kyocera TORQUE(KC-S701)", result);
}
public void testDevice1187() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-RACER", FALLBACK);
    Assert.assertEquals("ZTE Racer", result);
}
public void testDevice1188() throws Exception {
    final String result = DeviceNames.getDeviceName("P6_Pro", FALLBACK);
    Assert.assertEquals("AllView P6 Pro", result);
}
public void testDevice1189() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_07FTB", FALLBACK);
    Assert.assertEquals("Positivo Ypy 07FTB", result);
}
public void testDevice1190() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_07FTA", FALLBACK);
    Assert.assertEquals("Positivo YPY7 3G", result);
}
public void testDevice1191() throws Exception {
    final String result = DeviceNames.getDeviceName("IS11LG", FALLBACK);
    Assert.assertEquals("LGE Optimus EX", result);
}
public void testDevice1192() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC6600LVW", FALLBACK);
    Assert.assertEquals("HTCOneMaxVZW", result);
}
public void testDevice1193() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LS696", FALLBACK);
    Assert.assertEquals("LGE LG Optimus Elite", result);
}
public void testDevice1194() throws Exception {
    final String result = DeviceNames.getDeviceName("LT22i", FALLBACK);
    Assert.assertEquals("Sony Xperia P", result);
}
public void testDevice1195() throws Exception {
    final String result = DeviceNames.getDeviceName("A3-A20FHD", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab 10", result);
}
public void testDevice1196() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9008L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice1197() throws Exception {
    final String result = DeviceNames.getDeviceName("Che2-L11", FALLBACK);
    Assert.assertEquals("Huawei Che2-L11", result);
}
public void testDevice1198() throws Exception {
    final String result = DeviceNames.getDeviceName("A100", FALLBACK);
    Assert.assertEquals("ZTE V9", result);
}
public void testDevice1199() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G130M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young2", result);
}
public void testDevice1200() throws Exception {
    final String result = DeviceNames.getDeviceName("DMTAB-IN08A", FALLBACK);
    Assert.assertEquals("Nabi DreamTab HD8 Tablet", result);
}
public void testDevice1201() throws Exception {
    final String result = DeviceNames.getDeviceName("Clempad_HR", FALLBACK);
    Assert.assertEquals("Clementoni Clempad HR", result);
}
public void testDevice1202() throws Exception {
    final String result = DeviceNames.getDeviceName("Smartfive", FALLBACK);
    Assert.assertEquals("Konrow Smartfive", result);
}
public void testDevice1203() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U980", FALLBACK);
    Assert.assertEquals("Hisense HS-U980", result);
}
public void testDevice1204() throws Exception {
    final String result = DeviceNames.getDeviceName("KIS", FALLBACK);
    Assert.assertEquals("ZTE KIS", result);
}
public void testDevice1205() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_S350", FALLBACK);
    Assert.assertEquals("Positivo Ypy S350", result);
}
public void testDevice1206() throws Exception {
    final String result = DeviceNames.getDeviceName("CT726", FALLBACK);
    Assert.assertEquals("Carrefour CT726", result);
}
public void testDevice1207() throws Exception {
    final String result = DeviceNames.getDeviceName("55AX600C", FALLBACK);
    Assert.assertEquals("Panasonic 55AX600C", result);
}
public void testDevice1208() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I997", FALLBACK);
    Assert.assertEquals("Samsung Infuse 4G", result);
}
public void testDevice1209() throws Exception {
    final String result = DeviceNames.getDeviceName("JT-B1", FALLBACK);
    Assert.assertEquals("Panasonic JT-B1", result);
}
public void testDevice1210() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55XT880G3DU", FALLBACK);
    Assert.assertEquals("Hisense LED55XT880G3DU", result);
}
public void testDevice1211() throws Exception {
    final String result = DeviceNames.getDeviceName("R809T", FALLBACK);
    Assert.assertEquals("Oppo R809T", result);
}
public void testDevice1212() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1039", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice1213() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1034", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice1214() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H420", FALLBACK);
    Assert.assertEquals("LGE LG Spirit", result);
}
public void testDevice1215() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H422", FALLBACK);
    Assert.assertEquals("LGE LG Volt", result);
}
public void testDevice1216() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1030", FALLBACK);
    Assert.assertEquals("Motorola Droid Mini", result);
}
public void testDevice1217() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1031", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice1218() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6078W2", FALLBACK);
    Assert.assertEquals("Anydata RCA RCT6078W2", result);
}
public void testDevice1219() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1033", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice1220() throws Exception {
    final String result = DeviceNames.getDeviceName("P2", FALLBACK);
    Assert.assertEquals("Haier P2", result);
}
public void testDevice1221() throws Exception {
    final String result = DeviceNames.getDeviceName("USCCADR3305", FALLBACK);
    Assert.assertEquals("Huawei M865", result);
}
public void testDevice1222() throws Exception {
    final String result = DeviceNames.getDeviceName("P6", FALLBACK);
    Assert.assertEquals("Gionee P6", result);
}
public void testDevice1223() throws Exception {
    final String result = DeviceNames.getDeviceName("P4", FALLBACK);
    Assert.assertEquals("Gionee P4", result);
}
public void testDevice1224() throws Exception {
    final String result = DeviceNames.getDeviceName("GETAWAY", FALLBACK);
    Assert.assertEquals("Wiko GETAWAY", result);
}
public void testDevice1225() throws Exception {
    final String result = DeviceNames.getDeviceName("001HT", FALLBACK);
    Assert.assertEquals("HTC Desire HD", result);
}
public void testDevice1226() throws Exception {
    final String result = DeviceNames.getDeviceName("E6782L", FALLBACK);
    Assert.assertEquals("Kyocera DuraScout", result);
}
public void testDevice1227() throws Exception {
    final String result = DeviceNames.getDeviceName("Z740", FALLBACK);
    Assert.assertEquals("ZTE Z740", result);
}
public void testDevice1228() throws Exception {
    final String result = DeviceNames.getDeviceName("9002X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 9002X", result);
}
public void testDevice1229() throws Exception {
    final String result = DeviceNames.getDeviceName("ATH-AL00", FALLBACK);
    Assert.assertEquals("Huawei ATH-AL00", result);
}
public void testDevice1230() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T365F0", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 Active", result);
}
public void testDevice1231() throws Exception {
    final String result = DeviceNames.getDeviceName("9002A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 9002A", result);
}
public void testDevice1232() throws Exception {
    final String result = DeviceNames.getDeviceName("MT11a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia neo V", result);
}
public void testDevice1233() throws Exception {
    final String result = DeviceNames.getDeviceName("TC55CH", FALLBACK);
    Assert.assertEquals("MotorolaSolutionsInc. TC55CH", result);
}
public void testDevice1234() throws Exception {
    final String result = DeviceNames.getDeviceName("i4901", FALLBACK);
    Assert.assertEquals("IDEA i4901", result);
}
public void testDevice1235() throws Exception {
    final String result = DeviceNames.getDeviceName("Winner8", FALLBACK);
    Assert.assertEquals("Explay Winner 8", result);
}
public void testDevice1236() throws Exception {
    final String result = DeviceNames.getDeviceName("Cherry_Mobile_Touch_HD", FALLBACK);
    Assert.assertEquals("Cherry Mobile Touch HD", result);
}
public void testDevice1237() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-R04", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice1238() throws Exception {
    final String result = DeviceNames.getDeviceName("S4040", FALLBACK);
    Assert.assertEquals("Mobiwire S4040", result);
}
public void testDevice1239() throws Exception {
    final String result = DeviceNames.getDeviceName("CHERRY", FALLBACK);
    Assert.assertEquals("Mobicell CHERRY", result);
}
public void testDevice1240() throws Exception {
    final String result = DeviceNames.getDeviceName("Racer", FALLBACK);
    Assert.assertEquals("ZTE Racer", result);
}
public void testDevice1241() throws Exception {
    final String result = DeviceNames.getDeviceName("DARKFULL", FALLBACK);
    Assert.assertEquals("WIKO DARKFULL", result);
}
public void testDevice1242() throws Exception {
    final String result = DeviceNames.getDeviceName("5054X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5054X", result);
}
public void testDevice1243() throws Exception {
    final String result = DeviceNames.getDeviceName("ShakerBeat", FALLBACK);
    Assert.assertEquals("Boost ShakerBeat", result);
}
public void testDevice1244() throws Exception {
    final String result = DeviceNames.getDeviceName("2014501", FALLBACK);
    Assert.assertEquals("Xiaomi HM 1SLTETD", result);
}
public void testDevice1245() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T537R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 10.0", result);
}
public void testDevice1246() throws Exception {
    final String result = DeviceNames.getDeviceName("2014502", FALLBACK);
    Assert.assertEquals("Xiaomi HM 2A", result);
}
public void testDevice1247() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire_500", FALLBACK);
    Assert.assertEquals("HTC Desire 500", result);
}
public void testDevice1248() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U9", FALLBACK);
    Assert.assertEquals("Hisense HS-U9", result);
}
public void testDevice1249() throws Exception {
    final String result = DeviceNames.getDeviceName("movo_la", FALLBACK);
    Assert.assertEquals("TCL L55E6700UDS", result);
}
public void testDevice1250() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50K360J", FALLBACK);
    Assert.assertEquals("Hisense LED50K360J", result);
}
public void testDevice1251() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000002-001", FALLBACK);
    Assert.assertEquals("NEC LifeTouch W", result);
}
public void testDevice1252() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1060", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice1253() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D630x", FALLBACK);
    Assert.assertEquals("HTC Desire 626", result);
}
public void testDevice1254() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00UD", FALLBACK);
    Assert.assertEquals("Asus ZenFone Selfie (ZD551KL)", result);
}
public void testDevice1255() throws Exception {
    final String result = DeviceNames.getDeviceName("201F", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS A SoftBank 201F", result);
}
public void testDevice1256() throws Exception {
    final String result = DeviceNames.getDeviceName("Kurio4S", FALLBACK);
    Assert.assertEquals("KD Interactive Kurio4S", result);
}
public void testDevice1257() throws Exception {
    final String result = DeviceNames.getDeviceName("SCL21", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice1258() throws Exception {
    final String result = DeviceNames.getDeviceName("SCL23", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice1259() throws Exception {
    final String result = DeviceNames.getDeviceName("SCL22", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice1260() throws Exception {
    final String result = DeviceNames.getDeviceName("SCL24", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice1261() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM007SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE THE HYBRID SoftBank 007SH", result);
}
public void testDevice1262() throws Exception {
    final String result = DeviceNames.getDeviceName("HW-SCL-L32", FALLBACK);
    Assert.assertEquals("Huawei Y6", result);
}
public void testDevice1263() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-GB1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Player 4", result);
}
public void testDevice1264() throws Exception {
    final String result = DeviceNames.getDeviceName("Q4T7IN3G", FALLBACK);
    Assert.assertEquals("Auchan Q4T7IN3G", result);
}
public void testDevice1265() throws Exception {
    final String result = DeviceNames.getDeviceName("P5_Energy", FALLBACK);
    Assert.assertEquals("AllView P5 Energy", result);
}
public void testDevice1266() throws Exception {
    final String result = DeviceNames.getDeviceName("AT7-B", FALLBACK);
    Assert.assertEquals("Toshiba AT7-B", result);
}
public void testDevice1267() throws Exception {
    final String result = DeviceNames.getDeviceName("AT7-C", FALLBACK);
    Assert.assertEquals("Toshiba AT7-C", result);
}
public void testDevice1268() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7272", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3", result);
}
public void testDevice1269() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E410B", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice1270() throws Exception {
    final String result = DeviceNames.getDeviceName("DARKNIGHT", FALLBACK);
    Assert.assertEquals("WIKO DARKNIGHT", result);
}
public void testDevice1271() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G5306W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice1272() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R970X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1273() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E410g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice1274() throws Exception {
    final String result = DeviceNames.getDeviceName("TX201LA", FALLBACK);
    Assert.assertEquals("ASUS Transformer Book Trio", result);
}
public void testDevice1275() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E410c", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice1276() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E410i", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice1277() throws Exception {
    final String result = DeviceNames.getDeviceName("IS13SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE IS13SH", result);
}
public void testDevice1278() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R970C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1279() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7278", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3", result);
}
public void testDevice1280() throws Exception {
    final String result = DeviceNames.getDeviceName("C6843", FALLBACK);
    Assert.assertEquals("Sony Xperia Z Ultra", result);
}
public void testDevice1281() throws Exception {
    final String result = DeviceNames.getDeviceName("R7kt", FALLBACK);
    Assert.assertEquals("Oppo R7kt", result);
}
public void testDevice1282() throws Exception {
    final String result = DeviceNames.getDeviceName("ISW11K", FALLBACK);
    Assert.assertEquals("Kyocera DIGNO", result);
}
public void testDevice1283() throws Exception {
    final String result = DeviceNames.getDeviceName("R7kf", FALLBACK);
    Assert.assertEquals("Oppo R7kf", result);
}
public void testDevice1284() throws Exception {
    final String result = DeviceNames.getDeviceName("LED48K681X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED48K681X3DU", result);
}
public void testDevice1285() throws Exception {
    final String result = DeviceNames.getDeviceName("R7kc", FALLBACK);
    Assert.assertEquals("Oppo R7kc", result);
}
public void testDevice1286() throws Exception {
    final String result = DeviceNames.getDeviceName("V791", FALLBACK);
    Assert.assertEquals("ZTE V791", result);
}
public void testDevice1287() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6313T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young", result);
}
public void testDevice1288() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A780L", FALLBACK);
    Assert.assertEquals("Pantech VEGA RACER", result);
}
public void testDevice1289() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I437Z", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Express", result);
}
public void testDevice1290() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I437P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Express", result);
}
public void testDevice1291() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice1292() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I927R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Glide", result);
}
public void testDevice1293() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00WD", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 Laser (ZE550KG)", result);
}
public void testDevice1294() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice1295() throws Exception {
    final String result = DeviceNames.getDeviceName("MW6617", FALLBACK);
    Assert.assertEquals("Lazer MW6617", result);
}
public void testDevice1296() throws Exception {
    final String result = DeviceNames.getDeviceName("GTV100", FALLBACK);
    Assert.assertEquals("Netgear NeoTVPrime", result);
}
public void testDevice1297() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T360", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 Active", result);
}
public void testDevice1298() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H410", FALLBACK);
    Assert.assertEquals("LGE LG Wine Smart", result);
}
public void testDevice1299() throws Exception {
    final String result = DeviceNames.getDeviceName("JT1241", FALLBACK);
    Assert.assertEquals("Anydata Jiateng JT1241", result);
}
public void testDevice1300() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite9QL", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite9QL", result);
}
public void testDevice1301() throws Exception {
    final String result = DeviceNames.getDeviceName("VS990", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice1302() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8262", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core", result);
}
public void testDevice1303() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8260", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core", result);
}
public void testDevice1304() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X132", FALLBACK);
    Assert.assertEquals("LGE L45", result);
}
public void testDevice1305() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X137", FALLBACK);
    Assert.assertEquals("LGE L60", result);
}
public void testDevice1306() throws Exception {
    final String result = DeviceNames.getDeviceName("E39", FALLBACK);
    Assert.assertEquals("Acer Liquid E700", result);
}
public void testDevice1307() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8268", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Duos", result);
}
public void testDevice1308() throws Exception {
    final String result = DeviceNames.getDeviceName("L-06DJOJO", FALLBACK);
    Assert.assertEquals("LGE Optimus Vu", result);
}
public void testDevice1309() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5303B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Plus", result);
}
public void testDevice1310() throws Exception {
    final String result = DeviceNames.getDeviceName("NEC-101S", FALLBACK);
    Assert.assertEquals("NEC MEDIAS NEC-101S", result);
}
public void testDevice1311() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-G610", FALLBACK);
    Assert.assertEquals("Hisense HS-G610", result);
}
public void testDevice1312() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910T2", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice1313() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F220K", FALLBACK);
    Assert.assertEquals("LGE Optimus GK", result);
}
public void testDevice1314() throws Exception {
    final String result = DeviceNames.getDeviceName("T1-A21w", FALLBACK);
    Assert.assertEquals("Huawei T1 10", result);
}
public void testDevice1315() throws Exception {
    final String result = DeviceNames.getDeviceName("FZ-A1B", FALLBACK);
    Assert.assertEquals("Panasonic FZ-A1", result);
}
public void testDevice1316() throws Exception {
    final String result = DeviceNames.getDeviceName("LGUK410", FALLBACK);
    Assert.assertEquals("LGE G Pad 7.0 LTE", result);
}
public void testDevice1317() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3502L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Plus", result);
}
public void testDevice1318() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3502I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend3", result);
}
public void testDevice1319() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D290AR", FALLBACK);
    Assert.assertEquals("LGE L Fino", result);
}
public void testDevice1320() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3502U", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend3", result);
}
public void testDevice1321() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3502T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Plus", result);
}
public void testDevice1322() throws Exception {
    final String result = DeviceNames.getDeviceName("Venus_V3_5040", FALLBACK);
    Assert.assertEquals("Vestel Venus V3 5040", result);
}
public void testDevice1323() throws Exception {
    final String result = DeviceNames.getDeviceName("SHL24", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE  SERIE mini SHL24", result);
}
public void testDevice1324() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-724", FALLBACK);
    Assert.assertEquals("Acer Iconia TalkTab 7", result);
}
public void testDevice1325() throws Exception {
    final String result = DeviceNames.getDeviceName("DL701Q", FALLBACK);
    Assert.assertEquals("DigiLand DL701Q", result);
}
public void testDevice1326() throws Exception {
    final String result = DeviceNames.getDeviceName("T1-A21L", FALLBACK);
    Assert.assertEquals("Huawei T1 10", result);
}
public void testDevice1327() throws Exception {
    final String result = DeviceNames.getDeviceName("P001_2", FALLBACK);
    Assert.assertEquals("Asus ZenPadC 7.0 (Z170MG)", result);
}
public void testDevice1328() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E460", FALLBACK);
    Assert.assertEquals("LG Optimus L5 II", result);
}
public void testDevice1329() throws Exception {
    final String result = DeviceNames.getDeviceName("Cynus_F9_4G", FALLBACK);
    Assert.assertEquals("Mobistel Cynus F9 4G", result);
}
public void testDevice1330() throws Exception {
    final String result = DeviceNames.getDeviceName("TBQC1063", FALLBACK);
    Assert.assertEquals("Zeki TBQC1063B", result);
}
public void testDevice1331() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_PN071", FALLBACK);
    Assert.assertEquals("HTC One", result);
}
public void testDevice1332() throws Exception {
    final String result = DeviceNames.getDeviceName("LGMS659", FALLBACK);
    Assert.assertEquals("LGE Optimus F3", result);
}
public void testDevice1333() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_5020X_Orange", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 5020D", result);
}
public void testDevice1334() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8160L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace2", result);
}
public void testDevice1335() throws Exception {
    final String result = DeviceNames.getDeviceName("Y400", FALLBACK);
    Assert.assertEquals("Positivo BGH Y400", result);
}
public void testDevice1336() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-E968", FALLBACK);
    Assert.assertEquals("Hisense HS-E968", result);
}
public void testDevice1337() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8160P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace2", result);
}
public void testDevice1338() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I925U", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice1339() throws Exception {
    final String result = DeviceNames.getDeviceName("M8047IU", FALLBACK);
    Assert.assertEquals("Brightstar M8046IU", result);
}
public void testDevice1340() throws Exception {
    final String result = DeviceNames.getDeviceName("402SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS CRYSTAL X", result);
}
public void testDevice1341() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T365M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 Active", result);
}
public void testDevice1342() throws Exception {
    final String result = DeviceNames.getDeviceName("X9180", FALLBACK);
    Assert.assertEquals("ZTE X9180", result);
}
public void testDevice1343() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T365Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 4 Active", result);
}
public void testDevice1344() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313HU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace 4", result);
}
public void testDevice1345() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I415", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Stratosphere II", result);
}
public void testDevice1346() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M830", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Rush", result);
}
public void testDevice1347() throws Exception {
    final String result = DeviceNames.getDeviceName("VF-895N", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Vodafone 895", result);
}
public void testDevice1348() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7272C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3 Duos", result);
}
public void testDevice1349() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9158V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega Plus", result);
}
public void testDevice1350() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T900", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Pro 12.2", result);
}
public void testDevice1351() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7223G", FALLBACK);
    Assert.assertEquals("Anydata Proscan PLT7223G", result);
}
public void testDevice1352() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T905", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Pro 12.2", result);
}
public void testDevice1353() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5570B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini", result);
}
public void testDevice1354() throws Exception {
    final String result = DeviceNames.getDeviceName("4035A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 4", result);
}
public void testDevice1355() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5570I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini", result);
}
public void testDevice1356() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55K600X3D", FALLBACK);
    Assert.assertEquals("Hisense LED55K600X3D", result);
}
public void testDevice1357() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5570L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini", result);
}
public void testDevice1358() throws Exception {
    final String result = DeviceNames.getDeviceName("LED47K600X3D", FALLBACK);
    Assert.assertEquals("Hisense LED47K600X3D", result);
}
public void testDevice1359() throws Exception {
    final String result = DeviceNames.getDeviceName("D5106", FALLBACK);
    Assert.assertEquals("Sony Xperia T3", result);
}
public void testDevice1360() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT9609G", FALLBACK);
    Assert.assertEquals("Proscan PLT9609G", result);
}
public void testDevice1361() throws Exception {
    final String result = DeviceNames.getDeviceName("D5103", FALLBACK);
    Assert.assertEquals("Sony Xperia T3", result);
}
public void testDevice1362() throws Exception {
    final String result = DeviceNames.getDeviceName("D5102", FALLBACK);
    Assert.assertEquals("Sony Xperia T3", result);
}
public void testDevice1363() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M430W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0 Plus", result);
}
public void testDevice1364() throws Exception {
    final String result = DeviceNames.getDeviceName("PI3106", FALLBACK);
    Assert.assertEquals("Philips PI3106", result);
}
public void testDevice1365() throws Exception {
    final String result = DeviceNames.getDeviceName("PI3105", FALLBACK);
    Assert.assertEquals("Philips PI3105", result);
}
public void testDevice1366() throws Exception {
    final String result = DeviceNames.getDeviceName("403SC", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice1367() throws Exception {
    final String result = DeviceNames.getDeviceName("E5823", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5 Compact", result);
}
public void testDevice1368() throws Exception {
    final String result = DeviceNames.getDeviceName("403SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS CRYSTAL 2", result);
}
public void testDevice1369() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P880", FALLBACK);
    Assert.assertEquals("LGE Optimus 4X HD", result);
}
public void testDevice1370() throws Exception {
    final String result = DeviceNames.getDeviceName("EVO", FALLBACK);
    Assert.assertEquals("HTC Evo", result);
}
public void testDevice1371() throws Exception {
    final String result = DeviceNames.getDeviceName("TVE9603I", FALLBACK);
    Assert.assertEquals("Carrefour CT1050", result);
}
public void testDevice1372() throws Exception {
    final String result = DeviceNames.getDeviceName("W900S", FALLBACK);
    Assert.assertEquals("Gionee W900S", result);
}
public void testDevice1373() throws Exception {
    final String result = DeviceNames.getDeviceName("MT-700", FALLBACK);
    Assert.assertEquals("Haier MT-700", result);
}
public void testDevice1374() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR6410LRA", FALLBACK);
    Assert.assertEquals("HTC DROID Incredible 4G LTE", result);
}
public void testDevice1375() throws Exception {
    final String result = DeviceNames.getDeviceName("Optimus_Madrid", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 995", result);
}
public void testDevice1376() throws Exception {
    final String result = DeviceNames.getDeviceName("STARTRAIL6", FALLBACK);
    Assert.assertEquals("SFR Star Trail 6", result);
}
public void testDevice1377() throws Exception {
    final String result = DeviceNames.getDeviceName("STARTRAIL5", FALLBACK);
    Assert.assertEquals("SFR Star Trail 5", result);
}
public void testDevice1378() throws Exception {
    final String result = DeviceNames.getDeviceName("R850", FALLBACK);
    Assert.assertEquals("OPPO R850", result);
}
public void testDevice1379() throws Exception {
    final String result = DeviceNames.getDeviceName("PRO7DS", FALLBACK);
    Assert.assertEquals("Prestige PRO7DS", result);
}
public void testDevice1380() throws Exception {
    final String result = DeviceNames.getDeviceName("F52_05", FALLBACK);
    Assert.assertEquals("BenQ F52", result);
}
public void testDevice1381() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_S405", FALLBACK);
    Assert.assertEquals("Positivo Ypy S405", result);
}
public void testDevice1382() throws Exception {
    final String result = DeviceNames.getDeviceName("Qrypton7", FALLBACK);
    Assert.assertEquals("Gigabyte TM75A", result);
}
public void testDevice1383() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D165AR", FALLBACK);
    Assert.assertEquals("LGE Optimus L40", result);
}
public void testDevice1384() throws Exception {
    final String result = DeviceNames.getDeviceName("GT540R", FALLBACK);
    Assert.assertEquals("LGE Swift", result);
}
public void testDevice1385() throws Exception {
    final String result = DeviceNames.getDeviceName("Q5S55IN4G", FALLBACK);
    Assert.assertEquals("Auchan Q5S55IN4G", result);
}
public void testDevice1386() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H443", FALLBACK);
    Assert.assertEquals("LGE LG Escape2", result);
}
public void testDevice1387() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H442", FALLBACK);
    Assert.assertEquals("LGE LG Volt 4G", result);
}
public void testDevice1388() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H440", FALLBACK);
    Assert.assertEquals("LGE LG Spirit LTE", result);
}
public void testDevice1389() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H445", FALLBACK);
    Assert.assertEquals("LGE LG Escape2", result);
}
public void testDevice1390() throws Exception {
    final String result = DeviceNames.getDeviceName("4018X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 3.5", result);
}
public void testDevice1391() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55K610X3D", FALLBACK);
    Assert.assertEquals("Hisense LED55K610X3D", result);
}
public void testDevice1392() throws Exception {
    final String result = DeviceNames.getDeviceName("PAP5430", FALLBACK);
    Assert.assertEquals("BYD Prestigio PAP5430", result);
}
public void testDevice1393() throws Exception {
    final String result = DeviceNames.getDeviceName("4018A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 3.5", result);
}
public void testDevice1394() throws Exception {
    final String result = DeviceNames.getDeviceName("4018D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 3.5", result);
}
public void testDevice1395() throws Exception {
    final String result = DeviceNames.getDeviceName("4018E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 3.5", result);
}
public void testDevice1396() throws Exception {
    final String result = DeviceNames.getDeviceName("4018F", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 3.5", result);
}
public void testDevice1397() throws Exception {
    final String result = DeviceNames.getDeviceName("X2_Soul_Lite_TM", FALLBACK);
    Assert.assertEquals("AllView X2 Soul Lite", result);
}
public void testDevice1398() throws Exception {
    final String result = DeviceNames.getDeviceName("4018M", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 3.5", result);
}
public void testDevice1399() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E120S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 HD LTE", result);
}
public void testDevice1400() throws Exception {
    final String result = DeviceNames.getDeviceName("ForwardRuby", FALLBACK);
    Assert.assertEquals("NGM Italia SRL Ruby", result);
}
public void testDevice1401() throws Exception {
    final String result = DeviceNames.getDeviceName("V96A", FALLBACK);
    Assert.assertEquals("ZTE V96A", result);
}
public void testDevice1402() throws Exception {
    final String result = DeviceNames.getDeviceName("Z667T", FALLBACK);
    Assert.assertEquals("ZTE Z667T", result);
}
public void testDevice1403() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E120K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 HD LTE", result);
}
public void testDevice1404() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-713", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab 7", result);
}
public void testDevice1405() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E120L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 HD LTE", result);
}
public void testDevice1406() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R940", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Lightray", result);
}
public void testDevice1407() throws Exception {
    final String result = DeviceNames.getDeviceName("CT7", FALLBACK);
    Assert.assertEquals("IDeaUSA CT7", result);
}
public void testDevice1408() throws Exception {
    final String result = DeviceNames.getDeviceName("CT3", FALLBACK);
    Assert.assertEquals("Olive Oil OliveOil Model 3", result);
}
public void testDevice1409() throws Exception {
    final String result = DeviceNames.getDeviceName("CT8", FALLBACK);
    Assert.assertEquals("iDea USA CT8", result);
}
public void testDevice1410() throws Exception {
    final String result = DeviceNames.getDeviceName("S732", FALLBACK);
    Assert.assertEquals("Logicom S732", result);
}
public void testDevice1411() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P1013", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice1412() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P1010", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice1413() throws Exception {
    final String result = DeviceNames.getDeviceName("B1-820", FALLBACK);
    Assert.assertEquals("Acer B1-820", result);
}
public void testDevice1414() throws Exception {
    final String result = DeviceNames.getDeviceName("G620S-UL00", FALLBACK);
    Assert.assertEquals("Huawei G620S-UL00", result);
}
public void testDevice1415() throws Exception {
    final String result = DeviceNames.getDeviceName("KYOCERA-E6560", FALLBACK);
    Assert.assertEquals("Kyocera DuraForce", result);
}
public void testDevice1416() throws Exception {
    final String result = DeviceNames.getDeviceName("FEVER", FALLBACK);
    Assert.assertEquals("Wiko FEVER", result);
}
public void testDevice1417() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I739", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend2", result);
}
public void testDevice1418() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9300", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice1419() throws Exception {
    final String result = DeviceNames.getDeviceName("DDA800R", FALLBACK);
    Assert.assertEquals("iRiver DMT580D", result);
}
public void testDevice1420() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9305", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice1421() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9308", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice1422() throws Exception {
    final String result = DeviceNames.getDeviceName("VENSTAR2050", FALLBACK);
    Assert.assertEquals("VENSTAR2050", result);
}
public void testDevice1423() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-GB70D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy player 70 Plus", result);
}
public void testDevice1424() throws Exception {
    final String result = DeviceNames.getDeviceName("E2171SS", FALLBACK);
    Assert.assertEquals("Hisense Sero7", result);
}
public void testDevice1425() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928W8", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice1426() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I939D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice1427() throws Exception {
    final String result = DeviceNames.getDeviceName("STV100-1", FALLBACK);
    Assert.assertEquals("BlackBerry PRIV by BlackBerry", result);
}
public void testDevice1428() throws Exception {
    final String result = DeviceNames.getDeviceName("4036E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 4", result);
}
public void testDevice1429() throws Exception {
    final String result = DeviceNames.getDeviceName("STV100-3", FALLBACK);
    Assert.assertEquals("BlackBerry PRIV by BlackBerry", result);
}
public void testDevice1430() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U610", FALLBACK);
    Assert.assertEquals("Hisense U610", result);
}
public void testDevice1431() throws Exception {
    final String result = DeviceNames.getDeviceName("FP-U320-INF-WLTW", FALLBACK);
    Assert.assertEquals("InFocus FP-U320-INF-WLTW", result);
}
public void testDevice1432() throws Exception {
    final String result = DeviceNames.getDeviceName("C5215", FALLBACK);
    Assert.assertEquals("Kyocera Hydro EDGE", result);
}
public void testDevice1433() throws Exception {
    final String result = DeviceNames.getDeviceName("VP100+", FALLBACK);
    Assert.assertEquals("Vestel VP100+", result);
}
public void testDevice1434() throws Exception {
    final String result = DeviceNames.getDeviceName("NX510J", FALLBACK);
    Assert.assertEquals("ZTE NX510J", result);
}
public void testDevice1435() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J700M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J7", result);
}
public void testDevice1436() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-13C", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE f SH-13C", result);
}
public void testDevice1437() throws Exception {
    final String result = DeviceNames.getDeviceName("R7Plust", FALLBACK);
    Assert.assertEquals("Oppo R7Plust", result);
}
public void testDevice1438() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J700K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J7", result);
}
public void testDevice1439() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J700F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J7", result);
}
public void testDevice1440() throws Exception {
    final String result = DeviceNames.getDeviceName("TAB-A01-SD", FALLBACK);
    Assert.assertEquals("Panasonic TAB-A01", result);
}
public void testDevice1441() throws Exception {
    final String result = DeviceNames.getDeviceName("LE40U5000A", FALLBACK);
    Assert.assertEquals("Haier LE40U5000A", result);
}
public void testDevice1442() throws Exception {
    final String result = DeviceNames.getDeviceName("AK815", FALLBACK);
    Assert.assertEquals("LGE G Pad 8+", result);
}
public void testDevice1443() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J7008", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J7", result);
}
public void testDevice1444() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A920S", FALLBACK);
    Assert.assertEquals("Pantech IM-A920S", result);
}
public void testDevice1445() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_990S", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) One Touch 990S", result);
}
public void testDevice1446() throws Exception {
    final String result = DeviceNames.getDeviceName("LED46K330X3D", FALLBACK);
    Assert.assertEquals("Hisense LED46K330X3D", result);
}
public void testDevice1447() throws Exception {
    final String result = DeviceNames.getDeviceName("S3T10IN", FALLBACK);
    Assert.assertEquals("Auchan S3T10IN", result);
}
public void testDevice1448() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_990A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) One Touch 990A", result);
}
public void testDevice1449() throws Exception {
    final String result = DeviceNames.getDeviceName("N880", FALLBACK);
    Assert.assertEquals("ZTE Blade", result);
}
public void testDevice1450() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5800L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Apollo", result);
}
public void testDevice1451() throws Exception {
    final String result = DeviceNames.getDeviceName("TM105A", FALLBACK);
    Assert.assertEquals("Gigabyte TM105A", result);
}
public void testDevice1452() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3504DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3504DUO", result);
}
public void testDevice1453() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5800D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Apollo", result);
}
public void testDevice1454() throws Exception {
    final String result = DeviceNames.getDeviceName("MID7065", FALLBACK);
    Assert.assertEquals("Anydata Coby MID7065", result);
}
public void testDevice1455() throws Exception {
    final String result = DeviceNames.getDeviceName("WETAB700DG", FALLBACK);
    Assert.assertEquals("W.e. WETAB700DG", result);
}
public void testDevice1456() throws Exception {
    final String result = DeviceNames.getDeviceName("LED60K380", FALLBACK);
    Assert.assertEquals("Hisense LED60K380", result);
}
public void testDevice1457() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5670", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fit", result);
}
public void testDevice1458() throws Exception {
    final String result = DeviceNames.getDeviceName("D6643", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3", result);
}
public void testDevice1459() throws Exception {
    final String result = DeviceNames.getDeviceName("D6646", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3", result);
}
public void testDevice1460() throws Exception {
    final String result = DeviceNames.getDeviceName("AT374", FALLBACK);
    Assert.assertEquals("Toshiba AT7-B", result);
}
public void testDevice1461() throws Exception {
    final String result = DeviceNames.getDeviceName("G621-TL00M", FALLBACK);
    Assert.assertEquals("Huawei G621-TL00M", result);
}
public void testDevice1462() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_M8x", FALLBACK);
    Assert.assertEquals("HTC One (M8)", result);
}
public void testDevice1463() throws Exception {
    final String result = DeviceNames.getDeviceName("FARTM9334P1", FALLBACK);
    Assert.assertEquals("Fujitsu FARTM9334P1", result);
}
public void testDevice1464() throws Exception {
    final String result = DeviceNames.getDeviceName("DM010SH", FALLBACK);
    Assert.assertEquals("Sharp DM010SH", result);
}
public void testDevice1465() throws Exception {
    final String result = DeviceNames.getDeviceName("P509", FALLBACK);
    Assert.assertEquals("NGM Italia SRL P509", result);
}
public void testDevice1466() throws Exception {
    final String result = DeviceNames.getDeviceName("P508", FALLBACK);
    Assert.assertEquals("NGM Italia SRL P508", result);
}
public void testDevice1467() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H320", FALLBACK);
    Assert.assertEquals("LGE LG Leon", result);
}
public void testDevice1468() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H326", FALLBACK);
    Assert.assertEquals("LGE LG Leon TV", result);
}
public void testDevice1469() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H324", FALLBACK);
    Assert.assertEquals("LGE LG Leon", result);
}
public void testDevice1470() throws Exception {
    final String result = DeviceNames.getDeviceName("EM63", FALLBACK);
    Assert.assertEquals("DOPO EM63 Tablet", result);
}
public void testDevice1471() throws Exception {
    final String result = DeviceNames.getDeviceName("Titanium", FALLBACK);
    Assert.assertEquals("Motorola Opus One", result);
}
public void testDevice1472() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC331ZLVW", FALLBACK);
    Assert.assertEquals("HTCDesire612VZW", result);
}
public void testDevice1473() throws Exception {
    final String result = DeviceNames.getDeviceName("PLK-TL00", FALLBACK);
    Assert.assertEquals("Huawei PLK-TL00", result);
}
public void testDevice1474() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-D920", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL D920", result);
}
public void testDevice1475() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1092", FALLBACK);
    Assert.assertEquals("Motorola MOTO X", result);
}
public void testDevice1476() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6010", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Music", result);
}
public void testDevice1477() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6012", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Music Duos", result);
}
public void testDevice1478() throws Exception {
    final String result = DeviceNames.getDeviceName("SGPT13", FALLBACK);
    Assert.assertEquals("Sony Xperia Tablet S", result);
}
public void testDevice1479() throws Exception {
    final String result = DeviceNames.getDeviceName("SGPT12", FALLBACK);
    Assert.assertEquals("Sony Xperia Tablet S", result);
}
public void testDevice1480() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7583T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Plus", result);
}
public void testDevice1481() throws Exception {
    final String result = DeviceNames.getDeviceName("G735-L23", FALLBACK);
    Assert.assertEquals("Huawei G735-L23", result);
}
public void testDevice1482() throws Exception {
    final String result = DeviceNames.getDeviceName("A2107A-H", FALLBACK);
    Assert.assertEquals("Lenovo A2107A", result);
}
public void testDevice1483() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P940", FALLBACK);
    Assert.assertEquals("LGE PRADA 3.0", result);
}
public void testDevice1484() throws Exception {
    final String result = DeviceNames.getDeviceName("K7/PTAB782", FALLBACK);
    Assert.assertEquals("Polaroid K7", result);
}
public void testDevice1485() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-01EVW", FALLBACK);
    Assert.assertEquals("Sharp SH-01E Vivienne Westwood", result);
}
public void testDevice1486() throws Exception {
    final String result = DeviceNames.getDeviceName("PC36100", FALLBACK);
    Assert.assertEquals("HTC Evo 4G", result);
}
public void testDevice1487() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G388F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Xcover3", result);
}
public void testDevice1488() throws Exception {
    final String result = DeviceNames.getDeviceName("MicromaxP480", FALLBACK);
    Assert.assertEquals("Micromax Canvas Tab", result);
}
public void testDevice1489() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P5100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 10.1", result);
}
public void testDevice1490() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_908", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) One Touch 908", result);
}
public void testDevice1491() throws Exception {
    final String result = DeviceNames.getDeviceName("MotoE2", FALLBACK);
    Assert.assertEquals("Motorola Moto E", result);
}
public void testDevice1492() throws Exception {
    final String result = DeviceNames.getDeviceName("NX403A", FALLBACK);
    Assert.assertEquals("ZTE NX403A", result);
}
public void testDevice1493() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire_200", FALLBACK);
    Assert.assertEquals("HTC Desire 200", result);
}
public void testDevice1494() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One", FALLBACK);
    Assert.assertEquals("HTC One", result);
}
public void testDevice1495() throws Exception {
    final String result = DeviceNames.getDeviceName("UVP-X", FALLBACK);
    Assert.assertEquals("Ubiquiti UVP-X", result);
}
public void testDevice1496() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P713TR", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7 II", result);
}
public void testDevice1497() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K600A3D", FALLBACK);
    Assert.assertEquals("Hisense LED42K600A3D", result);
}
public void testDevice1498() throws Exception {
    final String result = DeviceNames.getDeviceName("A31c", FALLBACK);
    Assert.assertEquals("Oppo A31c", result);
}
public void testDevice1499() throws Exception {
    final String result = DeviceNames.getDeviceName("W1011A", FALLBACK);
    Assert.assertEquals("Wistron W1011A", result);
}
public void testDevice1500() throws Exception {
    final String result = DeviceNames.getDeviceName("A31u", FALLBACK);
    Assert.assertEquals("Oppo A31u", result);
}
public void testDevice1501() throws Exception {
    final String result = DeviceNames.getDeviceName("A31t", FALLBACK);
    Assert.assertEquals("Oppo A13t", result);
}
public void testDevice1502() throws Exception {
    final String result = DeviceNames.getDeviceName("Vision", FALLBACK);
    Assert.assertEquals("Hisense Vision", result);
}
public void testDevice1503() throws Exception {
    final String result = DeviceNames.getDeviceName("CF10", FALLBACK);
    Assert.assertEquals("Saltillo CF10", result);
}
public void testDevice1504() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F120L", FALLBACK);
    Assert.assertEquals("LGE LG Optimus LTE Tag", result);
}
public void testDevice1505() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F120K", FALLBACK);
    Assert.assertEquals("LGE LG Optimus LTE Tag", result);
}
public void testDevice1506() throws Exception {
    final String result = DeviceNames.getDeviceName("T1-A23L", FALLBACK);
    Assert.assertEquals("Huawei T1 10", result);
}
public void testDevice1507() throws Exception {
    final String result = DeviceNames.getDeviceName("LENNY2", FALLBACK);
    Assert.assertEquals("Wiko LENNY2", result);
}
public void testDevice1508() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8530", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Beam", result);
}
public void testDevice1509() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F120S", FALLBACK);
    Assert.assertEquals("LGE LG Optimus LTE Tag", result);
}
public void testDevice1510() throws Exception {
    final String result = DeviceNames.getDeviceName("LCD-S3A-01", FALLBACK);
    Assert.assertEquals("Sharp LCD-S3A-01", result);
}
public void testDevice1511() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E400", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3", result);
}
public void testDevice1512() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D806", FALLBACK);
    Assert.assertEquals("LGE LG G2", result);
}
public void testDevice1513() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D805", FALLBACK);
    Assert.assertEquals("G2", result);
}
public void testDevice1514() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D803", FALLBACK);
    Assert.assertEquals("G2", result);
}
public void testDevice1515() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D802", FALLBACK);
    Assert.assertEquals("LG G2", result);
}
public void testDevice1516() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D801", FALLBACK);
    Assert.assertEquals("LG G2", result);
}
public void testDevice1517() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D800", FALLBACK);
    Assert.assertEquals("LG G2", result);
}
public void testDevice1518() throws Exception {
    final String result = DeviceNames.getDeviceName("V1_Viper_I4G_TM", FALLBACK);
    Assert.assertEquals("AllView V1 Viper I4G", result);
}
public void testDevice1519() throws Exception {
    final String result = DeviceNames.getDeviceName("H220", FALLBACK);
    Assert.assertEquals("Cherry Mobile H220", result);
}
public void testDevice1520() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-X5T", FALLBACK);
    Assert.assertEquals("Hisense HS-X5T", result);
}
public void testDevice1521() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-M819N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice1522() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9002", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Duos", result);
}
public void testDevice1523() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9006", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3", result);
}
public void testDevice1524() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9007", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice1525() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9005", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3", result);
}
public void testDevice1526() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9008", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Duos", result);
}
public void testDevice1527() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9009", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice1528() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-I630T", FALLBACK);
    Assert.assertEquals("Hisense HS-I630T", result);
}
public void testDevice1529() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-E700M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E7", result);
}
public void testDevice1530() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-I630M", FALLBACK);
    Assert.assertEquals("Hisense HS-I630M", result);
}
public void testDevice1531() throws Exception {
    final String result = DeviceNames.getDeviceName("EGS017", FALLBACK);
    Assert.assertEquals("Ematic EGS017", result);
}
public void testDevice1532() throws Exception {
    final String result = DeviceNames.getDeviceName("Z200", FALLBACK);
    Assert.assertEquals("Acer Liquid Z200", result);
}
public void testDevice1533() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-E700F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E7", result);
}
public void testDevice1534() throws Exception {
    final String result = DeviceNames.getDeviceName("Z205", FALLBACK);
    Assert.assertEquals("Acer Liquid Z205", result);
}
public void testDevice1535() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3", result);
}
public void testDevice1536() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3", result);
}
public void testDevice1537() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3", result);
}
public void testDevice1538() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-E7009", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E7", result);
}
public void testDevice1539() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900U", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice1540() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-E7000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E7", result);
}
public void testDevice1541() throws Exception {
    final String result = DeviceNames.getDeviceName("SH930W", FALLBACK);
    Assert.assertEquals("Foxconn SH930W", result);
}
public void testDevice1542() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice1543() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice1544() throws Exception {
    final String result = DeviceNames.getDeviceName("Galaxy_Nexus", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Nexus", result);
}
public void testDevice1545() throws Exception {
    final String result = DeviceNames.getDeviceName("VS425PP", FALLBACK);
    Assert.assertEquals("LGE Zone3", result);
}
public void testDevice1546() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000002-W01", FALLBACK);
    Assert.assertEquals("NEC LifeTouch W", result);
}
public void testDevice1547() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000002-W02", FALLBACK);
    Assert.assertEquals("NEC LifeTouch W", result);
}
public void testDevice1548() throws Exception {
    final String result = DeviceNames.getDeviceName("Huawei_8100-9", FALLBACK);
    Assert.assertEquals("Huawei T-Mobile Pulse", result);
}
public void testDevice1549() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Glacier", FALLBACK);
    Assert.assertEquals("HTC Glacier", result);
}
public void testDevice1550() throws Exception {
    final String result = DeviceNames.getDeviceName("Y320-U01", FALLBACK);
    Assert.assertEquals("Huawei Y320-U01", result);
}
public void testDevice1551() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M580", FALLBACK);
    Assert.assertEquals("Samsung Replenish", result);
}
public void testDevice1552() throws Exception {
    final String result = DeviceNames.getDeviceName("TAB-700", FALLBACK);
    Assert.assertEquals("Haier TAB-700", result);
}
public void testDevice1553() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D693n", FALLBACK);
    Assert.assertEquals("LGE G3 Stylus", result);
}
public void testDevice1554() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7270L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3", result);
}
public void testDevice1555() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR6410OM", FALLBACK);
    Assert.assertEquals("HTC DROID Incredible 4G LTE", result);
}
public void testDevice1556() throws Exception {
    final String result = DeviceNames.getDeviceName("E4_Lite", FALLBACK);
    Assert.assertEquals("AllView E4 Lite", result);
}
public void testDevice1557() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M220L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Neo", result);
}
public void testDevice1558() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E435g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice1559() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E435f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice1560() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V905R", FALLBACK);
    Assert.assertEquals("LGE Optimus Pad", result);
}
public void testDevice1561() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_0P6B6", FALLBACK);
    Assert.assertEquals("HTC One (M8)", result);
}
public void testDevice1562() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F320L", FALLBACK);
    Assert.assertEquals("LGE LG G2", result);
}
public void testDevice1563() throws Exception {
    final String result = DeviceNames.getDeviceName("TR10CS2", FALLBACK);
    Assert.assertEquals("MG series Any 302", result);
}
public void testDevice1564() throws Exception {
    final String result = DeviceNames.getDeviceName("D2316", FALLBACK);
    Assert.assertEquals("Sony Xperia M2", result);
}
public void testDevice1565() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E435k", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice1566() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F320S", FALLBACK);
    Assert.assertEquals("LGE LG G2", result);
}
public void testDevice1567() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M340S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy M Style", result);
}
public void testDevice1568() throws Exception {
    final String result = DeviceNames.getDeviceName("E5803", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5 Compact", result);
}
public void testDevice1569() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG971", FALLBACK);
    Assert.assertEquals("Hisense HS-EG971", result);
}
public void testDevice1570() throws Exception {
    final String result = DeviceNames.getDeviceName("2PQ93", FALLBACK);
    Assert.assertEquals("HTC One A9", result);
}
public void testDevice1571() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG978", FALLBACK);
    Assert.assertEquals("Hisense EG978", result);
}
public void testDevice1572() throws Exception {
    final String result = DeviceNames.getDeviceName("VK815", FALLBACK);
    Assert.assertEquals("LGE LG G Pad X 8.3", result);
}
public void testDevice1573() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I435", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice1574() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-T537A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 10.0", result);
}
public void testDevice1575() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5280", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Star", result);
}
public void testDevice1576() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5282", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Star", result);
}
public void testDevice1577() throws Exception {
    final String result = DeviceNames.getDeviceName("B502_SA", FALLBACK);
    Assert.assertEquals("BenQ B502", result);
}
public void testDevice1578() throws Exception {
    final String result = DeviceNames.getDeviceName("N958St", FALLBACK);
    Assert.assertEquals("ZTE N958St", result);
}
public void testDevice1579() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-Z990", FALLBACK);
    Assert.assertEquals("ZTE-Z990", result);
}
public void testDevice1580() throws Exception {
    final String result = DeviceNames.getDeviceName("EGQ307", FALLBACK);
    Assert.assertEquals("Ematic EGQ307", result);
}
public void testDevice1581() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000018-004", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice1582() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G850A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice1583() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I957D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice1584() throws Exception {
    final String result = DeviceNames.getDeviceName("AX660", FALLBACK);
    Assert.assertEquals("BMobile AX660", result);
}
public void testDevice1585() throws Exception {
    final String result = DeviceNames.getDeviceName("XT890", FALLBACK);
    Assert.assertEquals("MOTOROLA RAZR i", result);
}
public void testDevice1586() throws Exception {
    final String result = DeviceNames.getDeviceName("XT897", FALLBACK);
    Assert.assertEquals("Motorola Photo Q", result);
}
public void testDevice1587() throws Exception {
    final String result = DeviceNames.getDeviceName("EGP008", FALLBACK);
    Assert.assertEquals("Anydata ematic EGP008", result);
}
public void testDevice1588() throws Exception {
    final String result = DeviceNames.getDeviceName("MT-734G", FALLBACK);
    Assert.assertEquals("Apex MT-734G", result);
}
public void testDevice1589() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_S460", FALLBACK);
    Assert.assertEquals("Positivo Ypy S460", result);
}
public void testDevice1590() throws Exception {
    final String result = DeviceNames.getDeviceName("D5788", FALLBACK);
    Assert.assertEquals("Sony Xperia J1 Compact", result);
}
public void testDevice1591() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A710K", FALLBACK);
    Assert.assertEquals("Pantech Vega X", result);
}
public void testDevice1592() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E450j", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice1593() throws Exception {
    final String result = DeviceNames.getDeviceName("PGN404", FALLBACK);
    Assert.assertEquals("Condor PGN404", result);
}
public void testDevice1594() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K600X3D", FALLBACK);
    Assert.assertEquals("Hisense LED42K600X3D", result);
}
public void testDevice1595() throws Exception {
    final String result = DeviceNames.getDeviceName("FunTab2", FALLBACK);
    Assert.assertEquals("Ematic FunTab 2", result);
}
public void testDevice1596() throws Exception {
    final String result = DeviceNames.getDeviceName("VAP430", FALLBACK);
    Assert.assertEquals("Vizio StreamPlayer", result);
}
public void testDevice1597() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E989", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G Pro", result);
}
public void testDevice1598() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E988", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G Pro", result);
}
public void testDevice1599() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-S975L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1600() throws Exception {
    final String result = DeviceNames.getDeviceName("I212", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Pixo 7", result);
}
public void testDevice1601() throws Exception {
    final String result = DeviceNames.getDeviceName("I213", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Pixo 7", result);
}
public void testDevice1602() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E987", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice1603() throws Exception {
    final String result = DeviceNames.getDeviceName("I211", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Pixo 7", result);
}
public void testDevice1604() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E980", FALLBACK);
    Assert.assertEquals("LG Optimus G Pro", result);
}
public void testDevice1605() throws Exception {
    final String result = DeviceNames.getDeviceName("MPDC706", FALLBACK);
    Assert.assertEquals("MPman MPDC706", result);
}
public void testDevice1606() throws Exception {
    final String result = DeviceNames.getDeviceName("PB99400", FALLBACK);
    Assert.assertEquals("HTC Desire", result);
}
public void testDevice1607() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5670L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fit", result);
}
public void testDevice1608() throws Exception {
    final String result = DeviceNames.getDeviceName("bq_Aquaris_5_HD", FALLBACK);
    Assert.assertEquals("bq Aquaris 5 HD", result);
}
public void testDevice1609() throws Exception {
    final String result = DeviceNames.getDeviceName("4016D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 4015X", result);
}
public void testDevice1610() throws Exception {
    final String result = DeviceNames.getDeviceName("EuroleaguePhone", FALLBACK);
    Assert.assertEquals("Euroleague I7a", result);
}
public void testDevice1611() throws Exception {
    final String result = DeviceNames.getDeviceName("MT15a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia neo", result);
}
public void testDevice1612() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR910L", FALLBACK);
    Assert.assertEquals("Pantech ADR910L", result);
}
public void testDevice1613() throws Exception {
    final String result = DeviceNames.getDeviceName("Z665C", FALLBACK);
    Assert.assertEquals("ZTE Z665C", result);
}
public void testDevice1614() throws Exception {
    final String result = DeviceNames.getDeviceName("F-09E", FALLBACK);
    Assert.assertEquals("Fujitsu F-09E", result);
}
public void testDevice1615() throws Exception {
    final String result = DeviceNames.getDeviceName("F-09D", FALLBACK);
    Assert.assertEquals("Fujitsu F-09D ANTEPRIMA", result);
}
public void testDevice1616() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R960", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice1617() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G800R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Mini", result);
}
public void testDevice1618() throws Exception {
    final String result = DeviceNames.getDeviceName("9006W", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 9006W", result);
}
public void testDevice1619() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V607L", FALLBACK);
    Assert.assertEquals("LGE Homeboy2", result);
}
public void testDevice1620() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL_P689L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL P689L", result);
}
public void testDevice1621() throws Exception {
    final String result = DeviceNames.getDeviceName("TegraNote-Premium", FALLBACK);
    Assert.assertEquals("NVidia TegraNote", result);
}
public void testDevice1622() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-S850L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Idol S", result);
}
public void testDevice1623() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R740C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Discover", result);
}
public void testDevice1624() throws Exception {
    final String result = DeviceNames.getDeviceName("PGN-508", FALLBACK);
    Assert.assertEquals("Condor C6+", result);
}
public void testDevice1625() throws Exception {
    final String result = DeviceNames.getDeviceName("PGN-506", FALLBACK);
    Assert.assertEquals("Condor C7", result);
}
public void testDevice1626() throws Exception {
    final String result = DeviceNames.getDeviceName("PGN-507", FALLBACK);
    Assert.assertEquals("Condor A9", result);
}
public void testDevice1627() throws Exception {
    final String result = DeviceNames.getDeviceName("VW_RCBKK1", FALLBACK);
    Assert.assertEquals("Panasonic Boukenkun-reciever", result);
}
public void testDevice1628() throws Exception {
    final String result = DeviceNames.getDeviceName("TBQG1084", FALLBACK);
    Assert.assertEquals("Zeki TBQG1084", result);
}
public void testDevice1629() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E470S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Active", result);
}
public void testDevice1630() throws Exception {
    final String result = DeviceNames.getDeviceName("ISW11SC", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice1631() throws Exception {
    final String result = DeviceNames.getDeviceName("AQ710A", FALLBACK);
    Assert.assertEquals("Intel AQ710A", result);
}
public void testDevice1632() throws Exception {
    final String result = DeviceNames.getDeviceName("503SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS Xx2 mini", result);
}
public void testDevice1633() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X165g", FALLBACK);
    Assert.assertEquals("LGE LG Max", result);
}
public void testDevice1634() throws Exception {
    final String result = DeviceNames.getDeviceName("B8405", FALLBACK);
    Assert.assertEquals("ZTE V815W", result);
}
public void testDevice1635() throws Exception {
    final String result = DeviceNames.getDeviceName("4009K", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)", result);
}
public void testDevice1636() throws Exception {
    final String result = DeviceNames.getDeviceName("B760H", FALLBACK);
    Assert.assertEquals("ZTE B760E", result);
}
public void testDevice1637() throws Exception {
    final String result = DeviceNames.getDeviceName("V6L", FALLBACK);
    Assert.assertEquals("Gionee ForwardZero", result);
}
public void testDevice1638() throws Exception {
    final String result = DeviceNames.getDeviceName("2014011", FALLBACK);
    Assert.assertEquals("Xiaomi HM 1STD", result);
}
public void testDevice1639() throws Exception {
    final String result = DeviceNames.getDeviceName("B760E", FALLBACK);
    Assert.assertEquals("ZTE B760E", result);
}
public void testDevice1640() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL25L", FALLBACK);
    Assert.assertEquals("LGE Optimus F3", result);
}
public void testDevice1641() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H221AR", FALLBACK);
    Assert.assertEquals("LGE LG Joy", result);
}
public void testDevice1642() throws Exception {
    final String result = DeviceNames.getDeviceName("Digital2-Deluxe", FALLBACK);
    Assert.assertEquals("Digital2 Deluxe", result);
}
public void testDevice1643() throws Exception {
    final String result = DeviceNames.getDeviceName("4009A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)", result);
}
public void testDevice1644() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E270K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice1645() throws Exception {
    final String result = DeviceNames.getDeviceName("E5633", FALLBACK);
    Assert.assertEquals("Sony Xperia M5 Dual", result);
}
public void testDevice1646() throws Exception {
    final String result = DeviceNames.getDeviceName("5050A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP S3", result);
}
public void testDevice1647() throws Exception {
    final String result = DeviceNames.getDeviceName("5050Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP S3", result);
}
public void testDevice1648() throws Exception {
    final String result = DeviceNames.getDeviceName("5050X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP S3", result);
}
public void testDevice1649() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E270S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice1650() throws Exception {
    final String result = DeviceNames.getDeviceName("HuaweiG510-0100-orange", FALLBACK);
    Assert.assertEquals("Huawei G510", result);
}
public void testDevice1651() throws Exception {
    final String result = DeviceNames.getDeviceName("5050S", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP S3", result);
}
public void testDevice1652() throws Exception {
    final String result = DeviceNames.getDeviceName("T-Mobile_G2_Touch", FALLBACK);
    Assert.assertEquals("HTC Hero", result);
}
public void testDevice1653() throws Exception {
    final String result = DeviceNames.getDeviceName("NX512J", FALLBACK);
    Assert.assertEquals("ZTE NX512J", result);
}
public void testDevice1654() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I337", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1655() throws Exception {
    final String result = DeviceNames.getDeviceName("TX201LAF", FALLBACK);
    Assert.assertEquals("Asus TX201LAF", result);
}
public void testDevice1656() throws Exception {
    final String result = DeviceNames.getDeviceName("S10-232L", FALLBACK);
    Assert.assertEquals("HUAWEI MediaPad 10 Link+", result);
}
public void testDevice1657() throws Exception {
    final String result = DeviceNames.getDeviceName("S4S5IN4G", FALLBACK);
    Assert.assertEquals("Auchan S4S5IN4G", result);
}
public void testDevice1658() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N5120", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 8.0", result);
}
public void testDevice1659() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E615", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 Dual", result);
}
public void testDevice1660() throws Exception {
    final String result = DeviceNames.getDeviceName("DARKSIDE", FALLBACK);
    Assert.assertEquals("Enspert DARKSIDE", result);
}
public void testDevice1661() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E612", FALLBACK);
    Assert.assertEquals("LGE Optimus L5", result);
}
public void testDevice1662() throws Exception {
    final String result = DeviceNames.getDeviceName("LT-NA7F", FALLBACK);
    Assert.assertEquals("NEC LifeTouch Note", result);
}
public void testDevice1663() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-N915A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice1664() throws Exception {
    final String result = DeviceNames.getDeviceName("S480", FALLBACK);
    Assert.assertEquals("Positivo S480", result);
}
public void testDevice1665() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3505DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3505DUO", result);
}
public void testDevice1666() throws Exception {
    final String result = DeviceNames.getDeviceName("PadFone", FALLBACK);
    Assert.assertEquals("Asus PadFone", result);
}
public void testDevice1667() throws Exception {
    final String result = DeviceNames.getDeviceName("XT830C", FALLBACK);
    Assert.assertEquals("Motorola MOTO E", result);
}
public void testDevice1668() throws Exception {
    final String result = DeviceNames.getDeviceName("DPA23D", FALLBACK);
    Assert.assertEquals("Dopo DPA23D", result);
}
public void testDevice1669() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P600", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice1670() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P601", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1 2014 Edition", result);
}
public void testDevice1671() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P602", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice1672() throws Exception {
    final String result = DeviceNames.getDeviceName("YUREKA", FALLBACK);
    Assert.assertEquals("Yureka", result);
}
public void testDevice1673() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P605", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1 2014 Edition", result);
}
public void testDevice1674() throws Exception {
    final String result = DeviceNames.getDeviceName("A6_Lite", FALLBACK);
    Assert.assertEquals("AllView A6 Lite", result);
}
public void testDevice1675() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J100F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice1676() throws Exception {
    final String result = DeviceNames.getDeviceName("Revue", FALLBACK);
    Assert.assertEquals("Logitech Revue", result);
}
public void testDevice1677() throws Exception {
    final String result = DeviceNames.getDeviceName("TBDG734", FALLBACK);
    Assert.assertEquals("Zeki TBDG734", result);
}
public void testDevice1678() throws Exception {
    final String result = DeviceNames.getDeviceName("502SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS Xx2", result);
}
public void testDevice1679() throws Exception {
    final String result = DeviceNames.getDeviceName("C6802", FALLBACK);
    Assert.assertEquals("Sony Xperia Z Ultra", result);
}
public void testDevice1680() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3405DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3405DUO", result);
}
public void testDevice1681() throws Exception {
    final String result = DeviceNames.getDeviceName("C6806", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Z Ultra", result);
}
public void testDevice1682() throws Exception {
    final String result = DeviceNames.getDeviceName("LT900", FALLBACK);
    Assert.assertEquals("Lava XOLO LT900", result);
}
public void testDevice1683() throws Exception {
    final String result = DeviceNames.getDeviceName("EG606", FALLBACK);
    Assert.assertEquals("Hisense EG606", result);
}
public void testDevice1684() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J100M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice1685() throws Exception {
    final String result = DeviceNames.getDeviceName("vsi7q_1_coho", FALLBACK);
    Assert.assertEquals("ViewSonic ViewPadi7Q", result);
}
public void testDevice1686() throws Exception {
    final String result = DeviceNames.getDeviceName("PHS-601", FALLBACK);
    Assert.assertEquals("Candor PHS-601", result);
}
public void testDevice1687() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J100H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice1688() throws Exception {
    final String result = DeviceNames.getDeviceName("Q4T10IN", FALLBACK);
    Assert.assertEquals("Auchan Q4T10IN", result);
}
public void testDevice1689() throws Exception {
    final String result = DeviceNames.getDeviceName("S8-306L", FALLBACK);
    Assert.assertEquals("HUAWEI MediaPad M1 8.0", result);
}
public void testDevice1690() throws Exception {
    final String result = DeviceNames.getDeviceName("Desire_HD", FALLBACK);
    Assert.assertEquals("HTC Desire HD", result);
}
public void testDevice1691() throws Exception {
    final String result = DeviceNames.getDeviceName("G735-L03", FALLBACK);
    Assert.assertEquals("Huawei G735-L03", result);
}
public void testDevice1692() throws Exception {
    final String result = DeviceNames.getDeviceName("D5316", FALLBACK);
    Assert.assertEquals("Sony Xperia T2 Ultra", result);
}
public void testDevice1693() throws Exception {
    final String result = DeviceNames.getDeviceName("P6_Qmax", FALLBACK);
    Assert.assertEquals("AllView P6 Qmax", result);
}
public void testDevice1694() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5454DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP5454DUO", result);
}
public void testDevice1695() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4490i", FALLBACK);
    Assert.assertEquals("Fly IQ4490i", result);
}
public void testDevice1696() throws Exception {
    final String result = DeviceNames.getDeviceName("N986", FALLBACK);
    Assert.assertEquals("ZTE N986", result);
}
public void testDevice1697() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P920", FALLBACK);
    Assert.assertEquals("LGE Optimus 3D", result);
}
public void testDevice1698() throws Exception {
    final String result = DeviceNames.getDeviceName("M35t", FALLBACK);
    Assert.assertEquals("Sony Xperia SP", result);
}
public void testDevice1699() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P925", FALLBACK);
    Assert.assertEquals("LGE Thrill 4G", result);
}
public void testDevice1700() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite13Q", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite13Q", result);
}
public void testDevice1701() throws Exception {
    final String result = DeviceNames.getDeviceName("A08S", FALLBACK);
    Assert.assertEquals("AboCom A08SM", result);
}
public void testDevice1702() throws Exception {
    final String result = DeviceNames.getDeviceName("M35h", FALLBACK);
    Assert.assertEquals("Sony Xperia SP", result);
}
public void testDevice1703() throws Exception {
    final String result = DeviceNames.getDeviceName("CP-DX70", FALLBACK);
    Assert.assertEquals("Cisco Desktop Collaboration Experience DX70", result);
}
public void testDevice1704() throws Exception {
    final String result = DeviceNames.getDeviceName("X-tremer", FALLBACK);
    Assert.assertEquals("WIKO DARKNIGHT", result);
}
public void testDevice1705() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G386W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core", result);
}
public void testDevice1706() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G386T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Avant", result);
}
public void testDevice1707() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D170", FALLBACK);
    Assert.assertEquals("LGE Optimus L40", result);
}
public void testDevice1708() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G386F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core LTE", result);
}
public void testDevice1709() throws Exception {
    final String result = DeviceNames.getDeviceName("MotoG3", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice1710() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL39C", FALLBACK);
    Assert.assertEquals("LGE LG L39C", result);
}
public void testDevice1711() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A700X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice1712() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F510K", FALLBACK);
    Assert.assertEquals("LGE LG G Flex2", result);
}
public void testDevice1713() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F510L", FALLBACK);
    Assert.assertEquals("LGE LG G Flex2", result);
}
public void testDevice1714() throws Exception {
    final String result = DeviceNames.getDeviceName("P900/Q900", FALLBACK);
    Assert.assertEquals("Polaroid P900", result);
}
public void testDevice1715() throws Exception {
    final String result = DeviceNames.getDeviceName("G700", FALLBACK);
    Assert.assertEquals("Haier G700", result);
}
public void testDevice1716() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F510S", FALLBACK);
    Assert.assertEquals("LGE LG G Flex2", result);
}
public void testDevice1717() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-E620M", FALLBACK);
    Assert.assertEquals("Hisense HS-E620M", result);
}
public void testDevice1718() throws Exception {
    final String result = DeviceNames.getDeviceName("SH950C-CM", FALLBACK);
    Assert.assertEquals("LGE SH950C-CM", result);
}
public void testDevice1719() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H340n", FALLBACK);
    Assert.assertEquals("LGE LG Leon 4G LTE", result);
}
public void testDevice1720() throws Exception {
    final String result = DeviceNames.getDeviceName("Tab734", FALLBACK);
    Assert.assertEquals("Intenso Tab734", result);
}
public void testDevice1721() throws Exception {
    final String result = DeviceNames.getDeviceName("WX05SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE WX05SH", result);
}
public void testDevice1722() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D821", FALLBACK);
    Assert.assertEquals("LG Nexus 5", result);
}
public void testDevice1723() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D820", FALLBACK);
    Assert.assertEquals("LG Nexus 5 USA", result);
}
public void testDevice1724() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65XT880G3DU", FALLBACK);
    Assert.assertEquals("Hisense LED65XT880G3DU", result);
}
public void testDevice1725() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E420", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice1726() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E425", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice1727() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G316HU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4", result);
}
public void testDevice1728() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65XT880G3DF", FALLBACK);
    Assert.assertEquals("Hisense LED65XT880G3DF", result);
}
public void testDevice1729() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_7060", FALLBACK);
    Assert.assertEquals("HTC Desire 7060", result);
}
public void testDevice1730() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I939", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice1731() throws Exception {
    final String result = DeviceNames.getDeviceName("V.45", FALLBACK);
    Assert.assertEquals("Nextel V.45", result);
}
public void testDevice1732() throws Exception {
    final String result = DeviceNames.getDeviceName("Z992", FALLBACK);
    Assert.assertEquals("ZTE Z992", result);
}
public void testDevice1733() throws Exception {
    final String result = DeviceNames.getDeviceName("Z993", FALLBACK);
    Assert.assertEquals("ZTE Z993", result);
}
public void testDevice1734() throws Exception {
    final String result = DeviceNames.getDeviceName("V.40", FALLBACK);
    Assert.assertEquals("Mobiwire V.40", result);
}
public void testDevice1735() throws Exception {
    final String result = DeviceNames.getDeviceName("Z995", FALLBACK);
    Assert.assertEquals("ZTE Z995", result);
}
public void testDevice1736() throws Exception {
    final String result = DeviceNames.getDeviceName("Z220", FALLBACK);
    Assert.assertEquals("Acer Liquid Z220", result);
}
public void testDevice1737() throws Exception {
    final String result = DeviceNames.getDeviceName("Z998", FALLBACK);
    Assert.assertEquals("ZTE Z998", result);
}
public void testDevice1738() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K370", FALLBACK);
    Assert.assertEquals("Hisense LED42K370", result);
}
public void testDevice1739() throws Exception {
    final String result = DeviceNames.getDeviceName("7DTB41", FALLBACK);
    Assert.assertEquals("Hipstreet Micron", result);
}
public void testDevice1740() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-T707A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 8.4", result);
}
public void testDevice1741() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A7009", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice1742() throws Exception {
    final String result = DeviceNames.getDeviceName("101N", FALLBACK);
    Assert.assertEquals("NEC MEDIAS CH 101N", result);
}
public void testDevice1743() throws Exception {
    final String result = DeviceNames.getDeviceName("101K", FALLBACK);
    Assert.assertEquals("Kyocera HONEY BEE", result);
}
public void testDevice1744() throws Exception {
    final String result = DeviceNames.getDeviceName("Brilliant", FALLBACK);
    Assert.assertEquals("Explay Brilliant", result);
}
public void testDevice1745() throws Exception {
    final String result = DeviceNames.getDeviceName("101F", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS A SoftBank 101F", result);
}
public void testDevice1746() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U970E", FALLBACK);
    Assert.assertEquals("Hisense HS-U970E", result);
}
public void testDevice1747() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-S730M", FALLBACK);
    Assert.assertEquals("Samsung Amazing", result);
}
public void testDevice1748() throws Exception {
    final String result = DeviceNames.getDeviceName("M532", FALLBACK);
    Assert.assertEquals("Fujitsu STYLISTIC M532", result);
}
public void testDevice1749() throws Exception {
    final String result = DeviceNames.getDeviceName("101P", FALLBACK);
    Assert.assertEquals("Panasonic 101P", result);
}
public void testDevice1750() throws Exception {
    final String result = DeviceNames.getDeviceName("EG980", FALLBACK);
    Assert.assertEquals("SKnetworks EG980", result);
}
public void testDevice1751() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32G180", FALLBACK);
    Assert.assertEquals("Hisense LED32G180", result);
}
public void testDevice1752() throws Exception {
    final String result = DeviceNames.getDeviceName("MiTV", FALLBACK);
    Assert.assertEquals("Xiaomi China", result);
}
public void testDevice1753() throws Exception {
    final String result = DeviceNames.getDeviceName("ETL-S4521", FALLBACK);
    Assert.assertEquals("Etuline ETL-S4521", result);
}
public void testDevice1754() throws Exception {
    final String result = DeviceNames.getDeviceName("M24IS820", FALLBACK);
    Assert.assertEquals("FBC M24IS820", result);
}
public void testDevice1755() throws Exception {
    final String result = DeviceNames.getDeviceName("one695_1", FALLBACK);
    Assert.assertEquals("CloudFone Cloudpad One 6.95", result);
}
public void testDevice1756() throws Exception {
    final String result = DeviceNames.getDeviceName("Z936L", FALLBACK);
    Assert.assertEquals("ZTE Z936L", result);
}
public void testDevice1757() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLS740", FALLBACK);
    Assert.assertEquals("LG Volt", result);
}
public void testDevice1758() throws Exception {
    final String result = DeviceNames.getDeviceName("Surfer7773G", FALLBACK);
    Assert.assertEquals("Explay Surfer777 3G", result);
}
public void testDevice1759() throws Exception {
    final String result = DeviceNames.getDeviceName("KYY21", FALLBACK);
    Assert.assertEquals("Kyocera URBANO L01", result);
}
public void testDevice1760() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K370", FALLBACK);
    Assert.assertEquals("Hisense LED32K370", result);
}
public void testDevice1761() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3518", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core LTE", result);
}
public void testDevice1762() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7202", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Max", result);
}
public void testDevice1763() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7200", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Max", result);
}
public void testDevice1764() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-S920L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice1765() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D486", FALLBACK);
    Assert.assertEquals("LGE Wine Smart", result);
}
public void testDevice1766() throws Exception {
    final String result = DeviceNames.getDeviceName("P01MA", FALLBACK);
    Assert.assertEquals("Asus ZenPad S 8.0 (Z580CA)", result);
}
public void testDevice1767() throws Exception {
    final String result = DeviceNames.getDeviceName("ATH-TL00H", FALLBACK);
    Assert.assertEquals("Huawei ATH-TL00H", result);
}
public void testDevice1768() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG958", FALLBACK);
    Assert.assertEquals("Hisense HS-EG958", result);
}
public void testDevice1769() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I100", FALLBACK);
    Assert.assertEquals("Samsung Gem", result);
}
public void testDevice1770() throws Exception {
    final String result = DeviceNames.getDeviceName("VSP145M", FALLBACK);
    Assert.assertEquals("Vestel VSP145M", result);
}
public void testDevice1771() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A3009", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice1772() throws Exception {
    final String result = DeviceNames.getDeviceName("EB-4063-X", FALLBACK);
    Assert.assertEquals("Panasonic EB-4063-X", result);
}
public void testDevice1773() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A3000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice1774() throws Exception {
    final String result = DeviceNames.getDeviceName("MT500", FALLBACK);
    Assert.assertEquals("Micromax CANVAS BLAZE", result);
}
public void testDevice1775() throws Exception {
    final String result = DeviceNames.getDeviceName("A101", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab A100 (VanGogh)", result);
}
public void testDevice1776() throws Exception {
    final String result = DeviceNames.getDeviceName("Onyx", FALLBACK);
    Assert.assertEquals("Explay Onyx", result);
}
public void testDevice1777() throws Exception {
    final String result = DeviceNames.getDeviceName("W5510", FALLBACK);
    Assert.assertEquals("Gigabyte W5510", result);
}
public void testDevice1778() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F200LS", FALLBACK);
    Assert.assertEquals("LGE Optimus Vu2", result);
}
public void testDevice1779() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP611", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3 Tablet Compact", result);
}
public void testDevice1780() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP341", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Tablet Z", result);
}
public void testDevice1781() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP612", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3 Tablet Compact", result);
}
public void testDevice1782() throws Exception {
    final String result = DeviceNames.getDeviceName("D6502", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2", result);
}
public void testDevice1783() throws Exception {
    final String result = DeviceNames.getDeviceName("D6503", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2", result);
}
public void testDevice1784() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F610S", FALLBACK);
    Assert.assertEquals("LGE LG Wine Smart Jazz", result);
}
public void testDevice1785() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I777M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice1786() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice1787() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P655H", FALLBACK);
    Assert.assertEquals("LGE Optimus F3", result);
}
public void testDevice1788() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P655K", FALLBACK);
    Assert.assertEquals("LGE Optimus F3", result);
}
public void testDevice1789() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice1790() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice1791() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice1792() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice1793() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B5510", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Pro", result);
}
public void testDevice1794() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B5512", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Pro Duos", result);
}
public void testDevice1795() throws Exception {
    final String result = DeviceNames.getDeviceName("LED58K280J", FALLBACK);
    Assert.assertEquals("Hisense LED58K280J", result);
}
public void testDevice1796() throws Exception {
    final String result = DeviceNames.getDeviceName("TB100", FALLBACK);
    Assert.assertEquals("Gigabyte TB100", result);
}
public void testDevice1797() throws Exception {
    final String result = DeviceNames.getDeviceName("MFC2_Plus", FALLBACK);
    Assert.assertEquals("Clementoni My first Clempad 4.4 Plus", result);
}
public void testDevice1798() throws Exception {
    final String result = DeviceNames.getDeviceName("TF101-WiMAX", FALLBACK);
    Assert.assertEquals("Asus Eee Pad TF101-WiMAX", result);
}
public void testDevice1799() throws Exception {
    final String result = DeviceNames.getDeviceName("LED58K280U", FALLBACK);
    Assert.assertEquals("Hisense LED58K280U", result);
}
public void testDevice1800() throws Exception {
    final String result = DeviceNames.getDeviceName("R7", FALLBACK);
    Assert.assertEquals("Oppo R7", result);
}
public void testDevice1801() throws Exception {
    final String result = DeviceNames.getDeviceName("R1", FALLBACK);
    Assert.assertEquals("PIONEER R1", result);
}
public void testDevice1802() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-S720C", FALLBACK);
    Assert.assertEquals("Samsung Proclaim", result);
}
public void testDevice1803() throws Exception {
    final String result = DeviceNames.getDeviceName("NEC-102", FALLBACK);
    Assert.assertEquals("NEC MEDIAS NEC-102", result);
}
public void testDevice1804() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T710", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 8.0", result);
}
public void testDevice1805() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T715", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 8.0", result);
}
public void testDevice1806() throws Exception {
    final String result = DeviceNames.getDeviceName("LS-5008", FALLBACK);
    Assert.assertEquals("ZTE Blade S6", result);
}
public void testDevice1807() throws Exception {
    final String result = DeviceNames.getDeviceName("4032A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 4033X", result);
}
public void testDevice1808() throws Exception {
    final String result = DeviceNames.getDeviceName("4032D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 4033X", result);
}
public void testDevice1809() throws Exception {
    final String result = DeviceNames.getDeviceName("4032E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 4033X", result);
}
public void testDevice1810() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8160", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace 2", result);
}
public void testDevice1811() throws Exception {
    final String result = DeviceNames.getDeviceName("N9500", FALLBACK);
    Assert.assertEquals("ZTE N9500", result);
}
public void testDevice1812() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-i579", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Duos", result);
}
public void testDevice1813() throws Exception {
    final String result = DeviceNames.getDeviceName("4032X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 4033X", result);
}
public void testDevice1814() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LW770", FALLBACK);
    Assert.assertEquals("LGE LG Optimus Regard", result);
}
public void testDevice1815() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LS855", FALLBACK);
    Assert.assertEquals("LGE Marquee", result);
}
public void testDevice1816() throws Exception {
    final String result = DeviceNames.getDeviceName("I216X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) I216X", result);
}
public void testDevice1817() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D802TR", FALLBACK);
    Assert.assertEquals("LGE LG G2", result);
}
public void testDevice1818() throws Exception {
    final String result = DeviceNames.getDeviceName("INGO-TAB", FALLBACK);
    Assert.assertEquals("Haier INGO-TAB", result);
}
public void testDevice1819() throws Exception {
    final String result = DeviceNames.getDeviceName("AX600C", FALLBACK);
    Assert.assertEquals("Panasonic AX600C", result);
}
public void testDevice1820() throws Exception {
    final String result = DeviceNames.getDeviceName("I216A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) I216A", result);
}
public void testDevice1821() throws Exception {
    final String result = DeviceNames.getDeviceName("4014E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4)", result);
}
public void testDevice1822() throws Exception {
    final String result = DeviceNames.getDeviceName("4014A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 4014A", result);
}
public void testDevice1823() throws Exception {
    final String result = DeviceNames.getDeviceName("4014M", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 4014M", result);
}
public void testDevice1824() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D950G", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice1825() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P698", FALLBACK);
    Assert.assertEquals("LGE Optimus Net Dual", result);
}
public void testDevice1826() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I957D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice1827() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P690", FALLBACK);
    Assert.assertEquals("LGE Optimus Spirit", result);
}
public void testDevice1828() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I957M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice1829() throws Exception {
    final String result = DeviceNames.getDeviceName("Eris", FALLBACK);
    Assert.assertEquals("HTC Droid Eris", result);
}
public void testDevice1830() throws Exception {
    final String result = DeviceNames.getDeviceName("V4S", FALLBACK);
    Assert.assertEquals("Gionee V4S", result);
}
public void testDevice1831() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I957R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice1832() throws Exception {
    final String result = DeviceNames.getDeviceName("GT540", FALLBACK);
    Assert.assertEquals("LGE Swift", result);
}
public void testDevice1833() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7511", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1 N", result);
}
public void testDevice1834() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7510", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice1835() throws Exception {
    final String result = DeviceNames.getDeviceName("l4300", FALLBACK);
    Assert.assertEquals("Toshiba L4300", result);
}
public void testDevice1836() throws Exception {
    final String result = DeviceNames.getDeviceName("E5653", FALLBACK);
    Assert.assertEquals("Sony Xperia M5", result);
}
public void testDevice1837() throws Exception {
    final String result = DeviceNames.getDeviceName("Logicom-S9782", FALLBACK);
    Assert.assertEquals("Haier Logicom S9782", result);
}
public void testDevice1838() throws Exception {
    final String result = DeviceNames.getDeviceName("CLEMPADCALL", FALLBACK);
    Assert.assertEquals("Clementoni Clempad Call", result);
}
public void testDevice1839() throws Exception {
    final String result = DeviceNames.getDeviceName("XT687", FALLBACK);
    Assert.assertEquals("Motorola Motoluxe", result);
}
public void testDevice1840() throws Exception {
    final String result = DeviceNames.getDeviceName("XT685", FALLBACK);
    Assert.assertEquals("Motorola Motoluxe", result);
}
public void testDevice1841() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T355C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice1842() throws Exception {
    final String result = DeviceNames.getDeviceName("XT682", FALLBACK);
    Assert.assertEquals("Motorola Motoluxe", result);
}
public void testDevice1843() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T355Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice1844() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920T1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice1845() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N5100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 8.0", result);
}
public void testDevice1846() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N5105", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 8.0", result);
}
public void testDevice1847() throws Exception {
    final String result = DeviceNames.getDeviceName("C525c", FALLBACK);
    Assert.assertEquals("HTC One SV", result);
}
public void testDevice1848() throws Exception {
    final String result = DeviceNames.getDeviceName("MotoMB511", FALLBACK);
    Assert.assertEquals("Motorola Flipout", result);
}
public void testDevice1849() throws Exception {
    final String result = DeviceNames.getDeviceName("HS_10DTB12A", FALLBACK);
    Assert.assertEquals("Hipstreet HS-10DTB12A", result);
}
public void testDevice1850() throws Exception {
    final String result = DeviceNames.getDeviceName("HTV31", FALLBACK);
    Assert.assertEquals("HTC HTV31", result);
}
public void testDevice1851() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D610x", FALLBACK);
    Assert.assertEquals("HTC Desire 610", result);
}
public void testDevice1852() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLS885", FALLBACK);
    Assert.assertEquals("LGE G3 Vigor", result);
}
public void testDevice1853() throws Exception {
    final String result = DeviceNames.getDeviceName("X9006", FALLBACK);
    Assert.assertEquals("OPPO X9006", result);
}
public void testDevice1854() throws Exception {
    final String result = DeviceNames.getDeviceName("X9007", FALLBACK);
    Assert.assertEquals("OPPO X9007", result);
}
public void testDevice1855() throws Exception {
    final String result = DeviceNames.getDeviceName("X9000", FALLBACK);
    Assert.assertEquals("Oppo X9000", result);
}
public void testDevice1856() throws Exception {
    final String result = DeviceNames.getDeviceName("E6653", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5", result);
}
public void testDevice1857() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I869", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win", result);
}
public void testDevice1858() throws Exception {
    final String result = DeviceNames.getDeviceName("WeTab1004B", FALLBACK);
    Assert.assertEquals("W.e. WeTab1004B", result);
}
public void testDevice1859() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-J736L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL 736L", result);
}
public void testDevice1860() throws Exception {
    final String result = DeviceNames.getDeviceName("PantechP9070", FALLBACK);
    Assert.assertEquals("Pantech Burst", result);
}
public void testDevice1861() throws Exception {
    final String result = DeviceNames.getDeviceName("ME811", FALLBACK);
    Assert.assertEquals("Motorola Droid X", result);
}
public void testDevice1862() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I535PP", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice1863() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-03G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S 8.4", result);
}
public void testDevice1864() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-03D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 LTE", result);
}
public void testDevice1865() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-03E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice1866() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A760S", FALLBACK);
    Assert.assertEquals("Pantech IM-A760S", result);
}
public void testDevice1867() throws Exception {
    final String result = DeviceNames.getDeviceName("TC97RA1", FALLBACK);
    Assert.assertEquals("Tekwind TC97RA1", result);
}
public void testDevice1868() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LU3000", FALLBACK);
    Assert.assertEquals("LGE Optimus Mach", result);
}
public void testDevice1869() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_10FTBF", FALLBACK);
    Assert.assertEquals("Positivo Ypy 10FTBF", result);
}
public void testDevice1870() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E425c", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice1871() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E470f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L4 II Tri", result);
}
public void testDevice1872() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E425f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice1873() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E425g", FALLBACK);
    Assert.assertEquals("LG Optimus L3 II", result);
}
public void testDevice1874() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E425j", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice1875() throws Exception {
    final String result = DeviceNames.getDeviceName("E15i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia X8", result);
}
public void testDevice1876() throws Exception {
    final String result = DeviceNames.getDeviceName("BOSCH_E10316", FALLBACK);
    Assert.assertEquals("Medion LIFETAB E10316", result);
}
public void testDevice1877() throws Exception {
    final String result = DeviceNames.getDeviceName("B1-730HD", FALLBACK);
    Assert.assertEquals("Acer Iconia One 7", result);
}
public void testDevice1878() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00LDC", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 Laser (ZE550KL)", result);
}
public void testDevice1879() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-CX670", FALLBACK);
    Assert.assertEquals("LGE Optimus One", result);
}
public void testDevice1880() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite11Q", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite11Q", result);
}
public void testDevice1881() throws Exception {
    final String result = DeviceNames.getDeviceName("T-01D", FALLBACK);
    Assert.assertEquals("Fujitsu REGZA Phone T-01D", result);
}
public void testDevice1882() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3558", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core2", result);
}
public void testDevice1883() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G150N0", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Folder", result);
}
public void testDevice1884() throws Exception {
    final String result = DeviceNames.getDeviceName("T-01C", FALLBACK);
    Assert.assertEquals("Fujitsu REGZA Phone T-01C", result);
}
public void testDevice1885() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-42LE860H", FALLBACK);
    Assert.assertEquals("Sharp LC-42LE860H", result);
}
public void testDevice1886() throws Exception {
    final String result = DeviceNames.getDeviceName("C6750", FALLBACK);
    Assert.assertEquals("Kyocera Hydro Elite", result);
}
public void testDevice1887() throws Exception {
    final String result = DeviceNames.getDeviceName("DMC-CM1", FALLBACK);
    Assert.assertEquals("Panasonic LUMIX CM1", result);
}
public void testDevice1888() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-42LE860M", FALLBACK);
    Assert.assertEquals("Sharp LC-42LE860M", result);
}
public void testDevice1889() throws Exception {
    final String result = DeviceNames.getDeviceName("Z740G", FALLBACK);
    Assert.assertEquals("ZTE Z740G", result);
}
public void testDevice1890() throws Exception {
    final String result = DeviceNames.getDeviceName("Viva_C701", FALLBACK);
    Assert.assertEquals("AllView Viva C701", result);
}
public void testDevice1891() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G150NS", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Folder", result);
}
public void testDevice1892() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G150NL", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Folder", result);
}
public void testDevice1893() throws Exception {
    final String result = DeviceNames.getDeviceName("XT915", FALLBACK);
    Assert.assertEquals("Motorola RAZR D1", result);
}
public void testDevice1894() throws Exception {
    final String result = DeviceNames.getDeviceName("XT914", FALLBACK);
    Assert.assertEquals("Motorola RAZR D1", result);
}
public void testDevice1895() throws Exception {
    final String result = DeviceNames.getDeviceName("M370", FALLBACK);
    Assert.assertEquals("InFocus M370", result);
}
public void testDevice1896() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G150NK", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Folder", result);
}
public void testDevice1897() throws Exception {
    final String result = DeviceNames.getDeviceName("4Game", FALLBACK);
    Assert.assertEquals("Explay 4Game", result);
}
public void testDevice1898() throws Exception {
    final String result = DeviceNames.getDeviceName("G615-U10", FALLBACK);
    Assert.assertEquals("Huawei G615-U10", result);
}
public void testDevice1899() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D150", FALLBACK);
    Assert.assertEquals("LGE LG-D150", result);
}
public void testDevice1900() throws Exception {
    final String result = DeviceNames.getDeviceName("B1-750", FALLBACK);
    Assert.assertEquals("Acer Iconia One 7", result);
}
public void testDevice1901() throws Exception {
    final String result = DeviceNames.getDeviceName("XT918", FALLBACK);
    Assert.assertEquals("Motorola RAZR D1", result);
}
public void testDevice1902() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G900A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice1903() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I545L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice1904() throws Exception {
    final String result = DeviceNames.getDeviceName("0PJA10", FALLBACK);
    Assert.assertEquals("HTC One M9", result);
}
public void testDevice1905() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1032", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice1906() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice1907() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice1908() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice1909() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice1910() throws Exception {
    final String result = DeviceNames.getDeviceName("LED84XT900G3D", FALLBACK);
    Assert.assertEquals("Hisense LED84XT900G3D", result);
}
public void testDevice1911() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E400K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Golden", result);
}
public void testDevice1912() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E400S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Golden", result);
}
public void testDevice1913() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice1914() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 Lite 7.0", result);
}
public void testDevice1915() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice1916() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_mini", FALLBACK);
    Assert.assertEquals("HTC One mini", result);
}
public void testDevice1917() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-T337A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 8.0", result);
}
public void testDevice1918() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H810", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice1919() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H811", FALLBACK);
    Assert.assertEquals("LG G4", result);
}
public void testDevice1920() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H812", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice1921() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H815", FALLBACK);
    Assert.assertEquals("G4", result);
}
public void testDevice1922() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H818", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice1923() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H819", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice1924() throws Exception {
    final String result = DeviceNames.getDeviceName("Z205P", FALLBACK);
    Assert.assertEquals("Acer Liquid Z205", result);
}
public void testDevice1925() throws Exception {
    final String result = DeviceNames.getDeviceName("VS930_4G", FALLBACK);
    Assert.assertEquals("LG Spectrum 2", result);
}
public void testDevice1926() throws Exception {
    final String result = DeviceNames.getDeviceName("K00F", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 10 (ME102A)", result);
}
public void testDevice1927() throws Exception {
    final String result = DeviceNames.getDeviceName("PMT3377_Wi", FALLBACK);
    Assert.assertEquals("Prestigio MultiPad Thunder 7.0i", result);
}
public void testDevice1928() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-C5", FALLBACK);
    Assert.assertEquals("TECNO-C5", result);
}
public void testDevice1929() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T769", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Blaze", result);
}
public void testDevice1930() throws Exception {
    final String result = DeviceNames.getDeviceName("K00C", FALLBACK);
    Assert.assertEquals("Asus Transformer Pad Infinity (TF701T)", result);
}
public void testDevice1931() throws Exception {
    final String result = DeviceNames.getDeviceName("C6806_GPe", FALLBACK);
    Assert.assertEquals("Sony Smartphone Z Ultra Google Play edition", result);
}
public void testDevice1932() throws Exception {
    final String result = DeviceNames.getDeviceName("48AX600C", FALLBACK);
    Assert.assertEquals("Panasonic 48AX600C", result);
}
public void testDevice1933() throws Exception {
    final String result = DeviceNames.getDeviceName("Cinema", FALLBACK);
    Assert.assertEquals("Enspert DARKSIDE", result);
}
public void testDevice1934() throws Exception {
    final String result = DeviceNames.getDeviceName("E6883", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5 Premium Dual", result);
}
public void testDevice1935() throws Exception {
    final String result = DeviceNames.getDeviceName("EM9", FALLBACK);
    Assert.assertEquals("Emerson EM9", result);
}
public void testDevice1936() throws Exception {
    final String result = DeviceNames.getDeviceName("VP74-Vox", FALLBACK);
    Assert.assertEquals("Vestel VP74", result);
}
public void testDevice1937() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G155S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Folder", result);
}
public void testDevice1938() throws Exception {
    final String result = DeviceNames.getDeviceName("V1_Viper_I4G_PL", FALLBACK);
    Assert.assertEquals("AllView V1 Viper I4G", result);
}
public void testDevice1939() throws Exception {
    final String result = DeviceNames.getDeviceName("Leader", FALLBACK);
    Assert.assertEquals("Explay Leader", result);
}
public void testDevice1940() throws Exception {
    final String result = DeviceNames.getDeviceName("VS920_4G", FALLBACK);
    Assert.assertEquals("LG Spectrum 4G", result);
}
public void testDevice1941() throws Exception {
    final String result = DeviceNames.getDeviceName("AC50DHE", FALLBACK);
    Assert.assertEquals("Archos 50 d Helium", result);
}
public void testDevice1942() throws Exception {
    final String result = DeviceNames.getDeviceName("CT1020W", FALLBACK);
    Assert.assertEquals("Carrefour CT1020W", result);
}
public void testDevice1943() throws Exception {
    final String result = DeviceNames.getDeviceName("N919D", FALLBACK);
    Assert.assertEquals("ZTE N919D", result);
}
public void testDevice1944() throws Exception {
    final String result = DeviceNames.getDeviceName("CMP749", FALLBACK);
    Assert.assertEquals("Anydata iCraig CMP749", result);
}
public void testDevice1945() throws Exception {
    final String result = DeviceNames.getDeviceName("CMP748", FALLBACK);
    Assert.assertEquals("Anydata iCraig CMP748", result);
}
public void testDevice1946() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9158", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 5.8", result);
}
public void testDevice1947() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9152", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 5.8", result);
}
public void testDevice1948() throws Exception {
    final String result = DeviceNames.getDeviceName("V.45S", FALLBACK);
    Assert.assertEquals("Mobiwire V.45", result);
}
public void testDevice1949() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9150", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 5.8", result);
}
public void testDevice1950() throws Exception {
    final String result = DeviceNames.getDeviceName("LGMS323", FALLBACK);
    Assert.assertEquals("LG Optimus L70", result);
}
public void testDevice1951() throws Exception {
    final String result = DeviceNames.getDeviceName("P-05D", FALLBACK);
    Assert.assertEquals("Panasonic P-05D", result);
}
public void testDevice1952() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T959W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice1953() throws Exception {
    final String result = DeviceNames.getDeviceName("GDENTMY7317", FALLBACK);
    Assert.assertEquals("ENTITY GDENTMY7317", result);
}
public void testDevice1954() throws Exception {
    final String result = DeviceNames.getDeviceName("F301", FALLBACK);
    Assert.assertEquals("Gionee F301", result);
}
public void testDevice1955() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T959P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Fascinate", result);
}
public void testDevice1956() throws Exception {
    final String result = DeviceNames.getDeviceName("F303", FALLBACK);
    Assert.assertEquals("Gionee F303", result);
}
public void testDevice1957() throws Exception {
    final String result = DeviceNames.getDeviceName("NX508J", FALLBACK);
    Assert.assertEquals("ZTE NX508J", result);
}
public void testDevice1958() throws Exception {
    final String result = DeviceNames.getDeviceName("KR076", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8057", result);
}
public void testDevice1959() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T959D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Vibrant", result);
}
public void testDevice1960() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A840SP", FALLBACK);
    Assert.assertEquals("Pantech IM-840SP", result);
}
public void testDevice1961() throws Exception {
    final String result = DeviceNames.getDeviceName("NEO8-1", FALLBACK);
    Assert.assertEquals("Haier NEO8-1", result);
}
public void testDevice1962() throws Exception {
    final String result = DeviceNames.getDeviceName("M02", FALLBACK);
    Assert.assertEquals("Fujitsu arrows M02", result);
}
public void testDevice1963() throws Exception {
    final String result = DeviceNames.getDeviceName("M01", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS M01", result);
}
public void testDevice1964() throws Exception {
    final String result = DeviceNames.getDeviceName("S3T7IN3G", FALLBACK);
    Assert.assertEquals("Auchan S3T7IN3G", result);
}
public void testDevice1965() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F160K", FALLBACK);
    Assert.assertEquals("LGE LG optimus LTE2", result);
}
public void testDevice1966() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D725PR", FALLBACK);
    Assert.assertEquals("LGE G3 S", result);
}
public void testDevice1967() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F160L", FALLBACK);
    Assert.assertEquals("LGE LG optimus LTE2", result);
}
public void testDevice1968() throws Exception {
    final String result = DeviceNames.getDeviceName("31TL04", FALLBACK);
    Assert.assertEquals("Sanyo Benesse", result);
}
public void testDevice1969() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-US780", FALLBACK);
    Assert.assertEquals("LGE LG Optimus F7", result);
}
public void testDevice1970() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65XT800X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED65XT800X3DU", result);
}
public void testDevice1971() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928N0", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice1972() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7100G", FALLBACK);
    Assert.assertEquals("Proscan PLT7100G", result);
}
public void testDevice1973() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG939", FALLBACK);
    Assert.assertEquals("Hisense HS-EG939", result);
}
public void testDevice1974() throws Exception {
    final String result = DeviceNames.getDeviceName("SSR1-5-8M", FALLBACK);
    Assert.assertEquals("Sico SmartPhone SSR1-5-8M", result);
}
public void testDevice1975() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E275S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice1976() throws Exception {
    final String result = DeviceNames.getDeviceName("SDU", FALLBACK);
    Assert.assertEquals("Panasonic SDU", result);
}
public void testDevice1977() throws Exception {
    final String result = DeviceNames.getDeviceName("8080", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8080", result);
}
public void testDevice1978() throws Exception {
    final String result = DeviceNames.getDeviceName("T03", FALLBACK);
    Assert.assertEquals("Acer Liquid Z630", result);
}
public void testDevice1979() throws Exception {
    final String result = DeviceNames.getDeviceName("H60-L11", FALLBACK);
    Assert.assertEquals("Huawei H60-L11", result);
}
public void testDevice1980() throws Exception {
    final String result = DeviceNames.getDeviceName("H60-L12", FALLBACK);
    Assert.assertEquals("Huawei H60-L12", result);
}
public void testDevice1981() throws Exception {
    final String result = DeviceNames.getDeviceName("A7100_X3", FALLBACK);
    Assert.assertEquals("Gtel A7100 X3", result);
}
public void testDevice1982() throws Exception {
    final String result = DeviceNames.getDeviceName("MFLogin3T", FALLBACK);
    Assert.assertEquals("MegaFon MFLogin3T", result);
}
public void testDevice1983() throws Exception {
    final String result = DeviceNames.getDeviceName("EGQ347", FALLBACK);
    Assert.assertEquals("Ematic EGQ347", result);
}
public void testDevice1984() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50K680X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED50K680X3DU", result);
}
public void testDevice1985() throws Exception {
    final String result = DeviceNames.getDeviceName("KFJWI", FALLBACK);
    Assert.assertEquals("Kindle Fire HD 8.9", result);
}
public void testDevice1986() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7568I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend", result);
}
public void testDevice1987() throws Exception {
    final String result = DeviceNames.getDeviceName("KFJWA", FALLBACK);
    Assert.assertEquals("Kindle Fire HD 8.9", result);
}
public void testDevice1988() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M300W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice1989() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP321", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Tablet Z", result);
}
public void testDevice1990() throws Exception {
    final String result = DeviceNames.getDeviceName("IdeaPadA10", FALLBACK);
    Assert.assertEquals("Lenovo A10", result);
}
public void testDevice1991() throws Exception {
    final String result = DeviceNames.getDeviceName("PowerFour", FALLBACK);
    Assert.assertEquals("HighScreen Power Four", result);
}
public void testDevice1992() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65XT890G3D", FALLBACK);
    Assert.assertEquals("Hisense LED65XT890G3D", result);
}
public void testDevice1993() throws Exception {
    final String result = DeviceNames.getDeviceName("sp401", FALLBACK);
    Assert.assertEquals("Sourcing Creation sp401", result);
}
public void testDevice1994() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z007", FALLBACK);
    Assert.assertEquals("Asus ZenFone C (ZC451CG)", result);
}
public void testDevice1995() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R920", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Attain", result);
}
public void testDevice1996() throws Exception {
    final String result = DeviceNames.getDeviceName("A463BG", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Pixi3-3.5 TF", result);
}
public void testDevice1997() throws Exception {
    final String result = DeviceNames.getDeviceName("Pulsar", FALLBACK);
    Assert.assertEquals("Explay Pulsar", result);
}
public void testDevice1998() throws Exception {
    final String result = DeviceNames.getDeviceName("X2_Soul_Style", FALLBACK);
    Assert.assertEquals("AllView X2 Soul Style", result);
}
public void testDevice1999() throws Exception {
    final String result = DeviceNames.getDeviceName("LED48K380U", FALLBACK);
    Assert.assertEquals("Hisense LED48K380U", result);
}
public void testDevice2000() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G318HZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4 Lite", result);
}
public void testDevice2001() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P500h", FALLBACK);
    Assert.assertEquals("LGE LG Optimus One", result);
}
public void testDevice2002() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F560K", FALLBACK);
    Assert.assertEquals("LGE G Stylo", result);
}
public void testDevice2003() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P3100B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 7.0", result);
}
public void testDevice2004() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-B02", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice2005() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-B01", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice2006() throws Exception {
    final String result = DeviceNames.getDeviceName("Phoenix2", FALLBACK);
    Assert.assertEquals("Hipstreet Phoenix2", result);
}
public void testDevice2007() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-i559", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pop (CDMA)", result);
}
public void testDevice2008() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E980h", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G Pro", result);
}
public void testDevice2009() throws Exception {
    final String result = DeviceNames.getDeviceName("Cybook-Tablet", FALLBACK);
    Assert.assertEquals("Booken Cybook Tablet", result);
}
public void testDevice2010() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9006W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice2011() throws Exception {
    final String result = DeviceNames.getDeviceName("LT28at", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia ion", result);
}
public void testDevice2012() throws Exception {
    final String result = DeviceNames.getDeviceName("404SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS Xx", result);
}
public void testDevice2013() throws Exception {
    final String result = DeviceNames.getDeviceName("PNDPP44QC10", FALLBACK);
    Assert.assertEquals("pendo PNDPP44QC10", result);
}
public void testDevice2014() throws Exception {
    final String result = DeviceNames.getDeviceName("404SC", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice2015() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-C800G", FALLBACK);
    Assert.assertEquals("LGE Optimus Hub", result);
}
public void testDevice2016() throws Exception {
    final String result = DeviceNames.getDeviceName("T47_05", FALLBACK);
    Assert.assertEquals("BenQ T47", result);
}
public void testDevice2017() throws Exception {
    final String result = DeviceNames.getDeviceName("LED75XT910G3DU", FALLBACK);
    Assert.assertEquals("Hisense LED75XT910G3DU", result);
}
public void testDevice2018() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G130H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young2", result);
}
public void testDevice2019() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G130E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young2", result);
}
public void testDevice2020() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H635A", FALLBACK);
    Assert.assertEquals("LGE LG G Stylo", result);
}
public void testDevice2021() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL21G", FALLBACK);
    Assert.assertEquals("LGE LG Destiny", result);
}
public void testDevice2022() throws Exception {
    final String result = DeviceNames.getDeviceName("N9520", FALLBACK);
    Assert.assertEquals("ZTE N9520", result);
}
public void testDevice2023() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G130U", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young2", result);
}
public void testDevice2024() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5660V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Gio", result);
}
public void testDevice2025() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-R02", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice2026() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-R03", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice2027() throws Exception {
    final String result = DeviceNames.getDeviceName("5054S", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5054S", result);
}
public void testDevice2028() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000001-R01", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice2029() throws Exception {
    final String result = DeviceNames.getDeviceName("5054T", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5054T", result);
}
public void testDevice2030() throws Exception {
    final String result = DeviceNames.getDeviceName("5054W", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5054W", result);
}
public void testDevice2031() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U970", FALLBACK);
    Assert.assertEquals("Hisense HS-U970", result);
}
public void testDevice2032() throws Exception {
    final String result = DeviceNames.getDeviceName("1206", FALLBACK);
    Assert.assertEquals("Oppo 1206", result);
}
public void testDevice2033() throws Exception {
    final String result = DeviceNames.getDeviceName("1201", FALLBACK);
    Assert.assertEquals("OPPO 1201", result);
}
public void testDevice2034() throws Exception {
    final String result = DeviceNames.getDeviceName("5054A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5054A", result);
}
public void testDevice2035() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T959", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Vibrant", result);
}
public void testDevice2036() throws Exception {
    final String result = DeviceNames.getDeviceName("5054D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5054D", result);
}
public void testDevice2037() throws Exception {
    final String result = DeviceNames.getDeviceName("MFC145FR1", FALLBACK);
    Assert.assertEquals("Lexibook Fluo", result);
}
public void testDevice2038() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-AS840", FALLBACK);
    Assert.assertEquals("LGE LG Optimus LTE Tag", result);
}
public void testDevice2039() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42L288", FALLBACK);
    Assert.assertEquals("Hisense LED42L288", result);
}
public void testDevice2040() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP7557", FALLBACK);
    Assert.assertEquals("Prestigio Grace", result);
}
public void testDevice2041() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T357W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A S 8.0", result);
}
public void testDevice2042() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T357T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice2043() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000007-D01", FALLBACK);
    Assert.assertEquals("NEC LifeTouch S", result);
}
public void testDevice2044() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F440L", FALLBACK);
    Assert.assertEquals("LGE Ice cream Smart", result);
}
public void testDevice2045() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T377R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 8.0", result);
}
public void testDevice2046() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E451g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice2047() throws Exception {
    final String result = DeviceNames.getDeviceName("N9835", FALLBACK);
    Assert.assertEquals("ZTE N9835", result);
}
public void testDevice2048() throws Exception {
    final String result = DeviceNames.getDeviceName("PGN509", FALLBACK);
    Assert.assertEquals("Condor PGN509", result);
}
public void testDevice2049() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J200GU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J2", result);
}
public void testDevice2050() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I800", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0", result);
}
public void testDevice2051() throws Exception {
    final String result = DeviceNames.getDeviceName("TBDG773", FALLBACK);
    Assert.assertEquals("Anydata Zeki TBDG773", result);
}
public void testDevice2052() throws Exception {
    final String result = DeviceNames.getDeviceName("E6633", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5 dual", result);
}
public void testDevice2053() throws Exception {
    final String result = DeviceNames.getDeviceName("KITE", FALLBACK);
    Assert.assertEquals("Wiko KITE", result);
}
public void testDevice2054() throws Exception {
    final String result = DeviceNames.getDeviceName("R7st", FALLBACK);
    Assert.assertEquals("Oppo R7st", result);
}
public void testDevice2055() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-G1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Player 4.0", result);
}
public void testDevice2056() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-S765C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Style", result);
}
public void testDevice2057() throws Exception {
    final String result = DeviceNames.getDeviceName("R7sf", FALLBACK);
    Assert.assertEquals("Oppo R7sfg", result);
}
public void testDevice2058() throws Exception {
    final String result = DeviceNames.getDeviceName("R7sm", FALLBACK);
    Assert.assertEquals("Oppo R7sm", result);
}
public void testDevice2059() throws Exception {
    final String result = DeviceNames.getDeviceName("D819", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) D819", result);
}
public void testDevice2060() throws Exception {
    final String result = DeviceNames.getDeviceName("LED47K610J3DP", FALLBACK);
    Assert.assertEquals("Hisense LED47K610J3DP", result);
}
public void testDevice2061() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-01H", FALLBACK);
    Assert.assertEquals("Samsung SC-01H", result);
}
public void testDevice2062() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E300", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice2063() throws Exception {
    final String result = DeviceNames.getDeviceName("S550", FALLBACK);
    Assert.assertEquals("Positivo S550", result);
}
public void testDevice2064() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-01C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice2065() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-01D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice2066() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-01E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.7 Plus", result);
}
public void testDevice2067() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-01F", FALLBACK);
    Assert.assertEquals("Samsung SC-01F", result);
}
public void testDevice2068() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-01G", FALLBACK);
    Assert.assertEquals("Samsung SC-01G", result);
}
public void testDevice2069() throws Exception {
    final String result = DeviceNames.getDeviceName("S40", FALLBACK);
    Assert.assertEquals("Cat S40", result);
}
public void testDevice2070() throws Exception {
    final String result = DeviceNames.getDeviceName("W757", FALLBACK);
    Assert.assertEquals("Haier W757", result);
}
public void testDevice2071() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D520", FALLBACK);
    Assert.assertEquals("LGE LG Optimus F3Q", result);
}
public void testDevice2072() throws Exception {
    final String result = DeviceNames.getDeviceName("ETH102", FALLBACK);
    Assert.assertEquals("Ematic ETH102", result);
}
public void testDevice2073() throws Exception {
    final String result = DeviceNames.getDeviceName("ISW16SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SERIE ISW16SH", result);
}
public void testDevice2074() throws Exception {
    final String result = DeviceNames.getDeviceName("KIW-TL00H", FALLBACK);
    Assert.assertEquals("Huawei Honor 5X", result);
}
public void testDevice2075() throws Exception {
    final String result = DeviceNames.getDeviceName("TA70CA3", FALLBACK);
    Assert.assertEquals("Digilite TA70CA3", result);
}
public void testDevice2076() throws Exception {
    final String result = DeviceNames.getDeviceName("TA70CA2", FALLBACK);
    Assert.assertEquals("Digilite TA70CA2", result);
}
public void testDevice2077() throws Exception {
    final String result = DeviceNames.getDeviceName("TA70CA1", FALLBACK);
    Assert.assertEquals("Digilite TA70CA1", result);
}
public void testDevice2078() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-840FHD", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab 8", result);
}
public void testDevice2079() throws Exception {
    final String result = DeviceNames.getDeviceName("C6730", FALLBACK);
    Assert.assertEquals("Kyocera Hydro Icon", result);
}
public void testDevice2080() throws Exception {
    final String result = DeviceNames.getDeviceName("A520L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) A520L", result);
}
public void testDevice2081() throws Exception {
    final String result = DeviceNames.getDeviceName("A5801", FALLBACK);
    Assert.assertEquals("Cellon A5801", result);
}
public void testDevice2082() throws Exception {
    final String result = DeviceNames.getDeviceName("M310", FALLBACK);
    Assert.assertEquals("Huawei M310", result);
}
public void testDevice2083() throws Exception {
    final String result = DeviceNames.getDeviceName("6050F", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) IDOL 2 S", result);
}
public void testDevice2084() throws Exception {
    final String result = DeviceNames.getDeviceName("6050A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) IDOL 2 S", result);
}
public void testDevice2085() throws Exception {
    final String result = DeviceNames.getDeviceName("6050Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) IDOL 2 S", result);
}
public void testDevice2086() throws Exception {
    final String result = DeviceNames.getDeviceName("6050W", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) IDOL 2 S", result);
}
public void testDevice2087() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55L288", FALLBACK);
    Assert.assertEquals("Hisense LED55L288", result);
}
public void testDevice2088() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M380S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice2089() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M380W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice2090() throws Exception {
    final String result = DeviceNames.getDeviceName("GoTab_GBT10", FALLBACK);
    Assert.assertEquals("My Go GoTab GBT10", result);
}
public void testDevice2091() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M380K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice2092() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3508I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend3", result);
}
public void testDevice2093() throws Exception {
    final String result = DeviceNames.getDeviceName("7043Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP 2 (5)", result);
}
public void testDevice2094() throws Exception {
    final String result = DeviceNames.getDeviceName("NB1022", FALLBACK);
    Assert.assertEquals("Nobis NB1022", result);
}
public void testDevice2095() throws Exception {
    final String result = DeviceNames.getDeviceName("7043A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP 2 (5)", result);
}
public void testDevice2096() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_7041X", FALLBACK);
    Assert.assertEquals("Alcatel One Touch Pop C7", result);
}
public void testDevice2097() throws Exception {
    final String result = DeviceNames.getDeviceName("7043K", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP 2 (5)", result);
}
public void testDevice2098() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H525", FALLBACK);
    Assert.assertEquals("LGE LG G4c", result);
}
public void testDevice2099() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H520", FALLBACK);
    Assert.assertEquals("LGE LG Magna LTE", result);
}
public void testDevice2100() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H522", FALLBACK);
    Assert.assertEquals("LGE LG Prime Plus 4G", result);
}
public void testDevice2101() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T520", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Pro 10.1", result);
}
public void testDevice2102() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T525", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tap Pro 10.1", result);
}
public void testDevice2103() throws Exception {
    final String result = DeviceNames.getDeviceName("MTC975", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) MTC975", result);
}
public void testDevice2104() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I257M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice2105() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T817W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice2106() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T817V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice2107() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T817T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice2108() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8558", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win", result);
}
public void testDevice2109() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T817P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice2110() throws Exception {
    final String result = DeviceNames.getDeviceName("Z980L", FALLBACK);
    Assert.assertEquals("ZTE Z980L", result);
}
public void testDevice2111() throws Exception {
    final String result = DeviceNames.getDeviceName("Z150", FALLBACK);
    Assert.assertEquals("Acer Liquid Z5", result);
}
public void testDevice2112() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-VS450PP", FALLBACK);
    Assert.assertEquals("LGE Optimus Exceed 2", result);
}
public void testDevice2113() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8552", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win", result);
}
public void testDevice2114() throws Exception {
    final String result = DeviceNames.getDeviceName("SI", FALLBACK);
    Assert.assertEquals("Cellon SI", result);
}
public void testDevice2115() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H740", FALLBACK);
    Assert.assertEquals("LGE LG G Vista 2", result);
}
public void testDevice2116() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50K370", FALLBACK);
    Assert.assertEquals("Hisense LED50K370", result);
}
public void testDevice2117() throws Exception {
    final String result = DeviceNames.getDeviceName("Ilium_L1000", FALLBACK);
    Assert.assertEquals("Lanix ILIUM L1000", result);
}
public void testDevice2118() throws Exception {
    final String result = DeviceNames.getDeviceName("LED40K260X3D", FALLBACK);
    Assert.assertEquals("Hisense LED40K260X3D", result);
}
public void testDevice2119() throws Exception {
    final String result = DeviceNames.getDeviceName("R8205", FALLBACK);
    Assert.assertEquals("Oppo R8205", result);
}
public void testDevice2120() throws Exception {
    final String result = DeviceNames.getDeviceName("R8207", FALLBACK);
    Assert.assertEquals("Oppo R8207", result);
}
public void testDevice2121() throws Exception {
    final String result = DeviceNames.getDeviceName("R8206", FALLBACK);
    Assert.assertEquals("Oppo R8206", result);
}
public void testDevice2122() throws Exception {
    final String result = DeviceNames.getDeviceName("R8201", FALLBACK);
    Assert.assertEquals("Oppo R8201", result);
}
public void testDevice2123() throws Exception {
    final String result = DeviceNames.getDeviceName("T852", FALLBACK);
    Assert.assertEquals("Audiovox T852 Tablet", result);
}
public void testDevice2124() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice2125() throws Exception {
    final String result = DeviceNames.getDeviceName("TAB700MPG", FALLBACK);
    Assert.assertEquals("Haier TAB-700", result);
}
public void testDevice2126() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7005", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice2127() throws Exception {
    final String result = DeviceNames.getDeviceName("LT-TLA", FALLBACK);
    Assert.assertEquals("NEC LifeTouch L", result);
}
public void testDevice2128() throws Exception {
    final String result = DeviceNames.getDeviceName("IN335", FALLBACK);
    Assert.assertEquals("InFocus IN335", result);
}
public void testDevice2129() throws Exception {
    final String result = DeviceNames.getDeviceName("FZ-N1", FALLBACK);
    Assert.assertEquals("Panasonic FZ-N1", result);
}
public void testDevice2130() throws Exception {
    final String result = DeviceNames.getDeviceName("KurioPhone", FALLBACK);
    Assert.assertEquals("KD Interactive Kurio Phone", result);
}
public void testDevice2131() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6273W26", FALLBACK);
    Assert.assertEquals("RCA RCT6273W26", result);
}
public void testDevice2132() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5517DUO", FALLBACK);
    Assert.assertEquals("Prestigio MultiPhone 5517 DUO", result);
}
public void testDevice2133() throws Exception {
    final String result = DeviceNames.getDeviceName("CETAB9ML9", FALLBACK);
    Assert.assertEquals("Haier CETAB9ML9", result);
}
public void testDevice2134() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P716", FALLBACK);
    Assert.assertEquals("LGE Optimus L7II", result);
}
public void testDevice2135() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P715", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7II", result);
}
public void testDevice2136() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P714", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7 II", result);
}
public void testDevice2137() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P713", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7 II", result);
}
public void testDevice2138() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P712", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7 II", result);
}
public void testDevice2139() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P710", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7 II", result);
}
public void testDevice2140() throws Exception {
    final String result = DeviceNames.getDeviceName("P-07C", FALLBACK);
    Assert.assertEquals("Panasonic P-07C", result);
}
public void testDevice2141() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3559", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core2", result);
}
public void testDevice2142() throws Exception {
    final String result = DeviceNames.getDeviceName("P-07D", FALLBACK);
    Assert.assertEquals("Panasonic ELUGA Power", result);
}
public void testDevice2143() throws Exception {
    final String result = DeviceNames.getDeviceName("DPM1081", FALLBACK);
    Assert.assertEquals("Dopo DPM1081", result);
}
public void testDevice2144() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR3010", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH Ultra 960c", result);
}
public void testDevice2145() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT1065G", FALLBACK);
    Assert.assertEquals("Proscan PLT1065G", result);
}
public void testDevice2146() throws Exception {
    final String result = DeviceNames.getDeviceName("ForwardEndurance", FALLBACK);
    Assert.assertEquals("NGM Italia SRL Endurance", result);
}
public void testDevice2147() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_A9u", FALLBACK);
    Assert.assertEquals("HTC One A9", result);
}
public void testDevice2148() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9070P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Advance", result);
}
public void testDevice2149() throws Exception {
    final String result = DeviceNames.getDeviceName("BNT-700K", FALLBACK);
    Assert.assertEquals("BLUEDOT BNT-700K", result);
}
public void testDevice2150() throws Exception {
    final String result = DeviceNames.getDeviceName("E5533", FALLBACK);
    Assert.assertEquals("Sony Xperia C5 Ultra Dual", result);
}
public void testDevice2151() throws Exception {
    final String result = DeviceNames.getDeviceName("T05", FALLBACK);
    Assert.assertEquals("Acer Liquid Z530S", result);
}
public void testDevice2152() throws Exception {
    final String result = DeviceNames.getDeviceName("T04", FALLBACK);
    Assert.assertEquals("Acer Liquid Z630S", result);
}
public void testDevice2153() throws Exception {
    final String result = DeviceNames.getDeviceName("SNB02-NV7A", FALLBACK);
    Assert.assertEquals("Nabi 2S Tablet", result);
}
public void testDevice2154() throws Exception {
    final String result = DeviceNames.getDeviceName("T02", FALLBACK);
    Assert.assertEquals("Acer Liquid Z530", result);
}
public void testDevice2155() throws Exception {
    final String result = DeviceNames.getDeviceName("T01", FALLBACK);
    Assert.assertEquals("Acer Liquid Z330", result);
}
public void testDevice2156() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K680X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED42K680X3DU", result);
}
public void testDevice2157() throws Exception {
    final String result = DeviceNames.getDeviceName("FMT-NT8A42-01", FALLBACK);
    Assert.assertEquals("Future Mobile Technology Dual 8", result);
}
public void testDevice2158() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G355M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core2", result);
}
public void testDevice2159() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G355H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core2", result);
}
public void testDevice2160() throws Exception {
    final String result = DeviceNames.getDeviceName("G620S-L02", FALLBACK);
    Assert.assertEquals("Huawei G620S-L02", result);
}
public void testDevice2161() throws Exception {
    final String result = DeviceNames.getDeviceName("G620S-L03", FALLBACK);
    Assert.assertEquals("Huawei G620S-L03", result);
}
public void testDevice2162() throws Exception {
    final String result = DeviceNames.getDeviceName("G620S-L01", FALLBACK);
    Assert.assertEquals("Huawei G620S-L01", result);
}
public void testDevice2163() throws Exception {
    final String result = DeviceNames.getDeviceName("Q882", FALLBACK);
    Assert.assertEquals("REACH Q882", result);
}
public void testDevice2164() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A870K", FALLBACK);
    Assert.assertEquals("Pantech IM-A870K", result);
}
public void testDevice2165() throws Exception {
    final String result = DeviceNames.getDeviceName("G7-TL00", FALLBACK);
    Assert.assertEquals("Huawei G7-TL00", result);
}
public void testDevice2166() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7508Q", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega2", result);
}
public void testDevice2167() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A870L", FALLBACK);
    Assert.assertEquals("Pantech IM-A870L", result);
}
public void testDevice2168() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A870S", FALLBACK);
    Assert.assertEquals("Pantech IM-A870S", result);
}
public void testDevice2169() throws Exception {
    final String result = DeviceNames.getDeviceName("Retro", FALLBACK);
    Assert.assertEquals("mobicel Retro", result);
}
public void testDevice2170() throws Exception {
    final String result = DeviceNames.getDeviceName("FXC-5A", FALLBACK);
    Assert.assertEquals("geanee FXC-5A", result);
}
public void testDevice2171() throws Exception {
    final String result = DeviceNames.getDeviceName("EGQ367", FALLBACK);
    Assert.assertEquals("Ematic EGQ367", result);
}
public void testDevice2172() throws Exception {
    final String result = DeviceNames.getDeviceName("XCD35", FALLBACK);
    Assert.assertEquals("ZTE Blade", result);
}
public void testDevice2173() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-AS730", FALLBACK);
    Assert.assertEquals("LGE LG Optimus Select", result);
}
public void testDevice2174() throws Exception {
    final String result = DeviceNames.getDeviceName("F-06E", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS NX F-06E", result);
}
public void testDevice2175() throws Exception {
    final String result = DeviceNames.getDeviceName("D2403", FALLBACK);
    Assert.assertEquals("Sony Xperia M2 Aqua", result);
}
public void testDevice2176() throws Exception {
    final String result = DeviceNames.getDeviceName("D2406", FALLBACK);
    Assert.assertEquals("Sony Xperia M2 Aqua", result);
}
public void testDevice2177() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V400Y1", FALLBACK);
    Assert.assertEquals("LGE G Pad 7.0", result);
}
public void testDevice2178() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5550DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP5550DUO", result);
}
public void testDevice2179() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_S7316", FALLBACK);
    Assert.assertEquals("Medion LIFETAB E7316", result);
}
public void testDevice2180() throws Exception {
    final String result = DeviceNames.getDeviceName("D6543", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2", result);
}
public void testDevice2181() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D610TR", FALLBACK);
    Assert.assertEquals("LGE G2 MINI", result);
}
public void testDevice2182() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_Fierce", FALLBACK);
    Assert.assertEquals("ALCATEL ONE TOUCH Fierce", result);
}
public void testDevice2183() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V400", FALLBACK);
    Assert.assertEquals("LGE Gpad 7.0", result);
}
public void testDevice2184() throws Exception {
    final String result = DeviceNames.getDeviceName("Samba", FALLBACK);
    Assert.assertEquals("Mobicell Samba", result);
}
public void testDevice2185() throws Exception {
    final String result = DeviceNames.getDeviceName("Z791G", FALLBACK);
    Assert.assertEquals("ZTE Z791G", result);
}
public void testDevice2186() throws Exception {
    final String result = DeviceNames.getDeviceName("U680C", FALLBACK);
    Assert.assertEquals("Teleepoch UMX U680C", result);
}
public void testDevice2187() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P6211", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0 Plus", result);
}
public void testDevice2188() throws Exception {
    final String result = DeviceNames.getDeviceName("M9000", FALLBACK);
    Assert.assertEquals("ZTE V793", result);
}
public void testDevice2189() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-03G", FALLBACK);
    Assert.assertEquals("Sharp AQUOS ZETA SH-03G", result);
}
public void testDevice2190() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900RZWAUSC", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice2191() throws Exception {
    final String result = DeviceNames.getDeviceName("R1001", FALLBACK);
    Assert.assertEquals("Oppo R1001", result);
}
public void testDevice2192() throws Exception {
    final String result = DeviceNames.getDeviceName("EGP010", FALLBACK);
    Assert.assertEquals("Anydata ematic EGP010", result);
}
public void testDevice2193() throws Exception {
    final String result = DeviceNames.getDeviceName("CEH1", FALLBACK);
    Assert.assertEquals("Sanyo CEH1", result);
}
public void testDevice2194() throws Exception {
    final String result = DeviceNames.getDeviceName("SU950", FALLBACK);
    Assert.assertEquals("LGE Optimus Z", result);
}
public void testDevice2195() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6790", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice2196() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D290", FALLBACK);
    Assert.assertEquals("LGE L Fino", result);
}
public void testDevice2197() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D295", FALLBACK);
    Assert.assertEquals("LGE L Fino", result);
}
public void testDevice2198() throws Exception {
    final String result = DeviceNames.getDeviceName("E506", FALLBACK);
    Assert.assertEquals("NGM Italia SRL NGM Youcolor E506", result);
}
public void testDevice2199() throws Exception {
    final String result = DeviceNames.getDeviceName("E507", FALLBACK);
    Assert.assertEquals("NGM Italia SRL NGM Youcolor E507", result);
}
public void testDevice2200() throws Exception {
    final String result = DeviceNames.getDeviceName("E505", FALLBACK);
    Assert.assertEquals("NGM Italia SRL NGM Youcolor E505", result);
}
public void testDevice2201() throws Exception {
    final String result = DeviceNames.getDeviceName("E500", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) E500", result);
}
public void testDevice2202() throws Exception {
    final String result = DeviceNames.getDeviceName("E501", FALLBACK);
    Assert.assertEquals("NGM Italia SRL NGM Youcolor E501", result);
}
public void testDevice2203() throws Exception {
    final String result = DeviceNames.getDeviceName("EVIANT_EVT10Q", FALLBACK);
    Assert.assertEquals("Eviant EVC10Q", result);
}
public void testDevice2204() throws Exception {
    final String result = DeviceNames.getDeviceName("LT28i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia ion", result);
}
public void testDevice2205() throws Exception {
    final String result = DeviceNames.getDeviceName("LT28h", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia ion", result);
}
public void testDevice2206() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-N035", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice2207() throws Exception {
    final String result = DeviceNames.getDeviceName("BARRY", FALLBACK);
    Assert.assertEquals("WIKO Barry", result);
}
public void testDevice2208() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire_610", FALLBACK);
    Assert.assertEquals("HTC Desire 610", result);
}
public void testDevice2209() throws Exception {
    final String result = DeviceNames.getDeviceName("V85", FALLBACK);
    Assert.assertEquals("Symphony V85", result);
}
public void testDevice2210() throws Exception {
    final String result = DeviceNames.getDeviceName("RW107", FALLBACK);
    Assert.assertEquals("Sharp RW107", result);
}
public void testDevice2211() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-E500F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E5", result);
}
public void testDevice2212() throws Exception {
    final String result = DeviceNames.getDeviceName("M502", FALLBACK);
    Assert.assertEquals("NGM Italia SRL M502", result);
}
public void testDevice2213() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-E500M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E5", result);
}
public void testDevice2214() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-E500H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E5", result);
}
public void testDevice2215() throws Exception {
    final String result = DeviceNames.getDeviceName("Clempad2_special", FALLBACK);
    Assert.assertEquals("Clementoni Clempad 4.4 Basic Special", result);
}
public void testDevice2216() throws Exception {
    final String result = DeviceNames.getDeviceName("NX501", FALLBACK);
    Assert.assertEquals("ZTE NX501", result);
}
public void testDevice2217() throws Exception {
    final String result = DeviceNames.getDeviceName("W861", FALLBACK);
    Assert.assertEquals("Haier", result);
}
public void testDevice2218() throws Exception {
    final String result = DeviceNames.getDeviceName("Rage", FALLBACK);
    Assert.assertEquals("AG Mobile Rage", result);
}
public void testDevice2219() throws Exception {
    final String result = DeviceNames.getDeviceName("W860", FALLBACK);
    Assert.assertEquals("Haier W860", result);
}
public void testDevice2220() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-S960L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice2221() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G130BU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young2 Pro", result);
}
public void testDevice2222() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G130BT", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young2", result);
}
public void testDevice2223() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-810", FALLBACK);
    Assert.assertEquals("Acer GT-810", result);
}
public void testDevice2224() throws Exception {
    final String result = DeviceNames.getDeviceName("XT390", FALLBACK);
    Assert.assertEquals("Motorola Motosmart", result);
}
public void testDevice2225() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T3777", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 8.0", result);
}
public void testDevice2226() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM204SH", FALLBACK);
    Assert.assertEquals("Sharp SBM204SH", result);
}
public void testDevice2227() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_918A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 918A", result);
}
public void testDevice2228() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E250S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note II", result);
}
public void testDevice2229() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E250L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice2230() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E250K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 2", result);
}
public void testDevice2231() throws Exception {
    final String result = DeviceNames.getDeviceName("MB855", FALLBACK);
    Assert.assertEquals("Motorola Photon 4G", result);
}
public void testDevice2232() throws Exception {
    final String result = DeviceNames.getDeviceName("N9810", FALLBACK);
    Assert.assertEquals("ZTE N9810", result);
}
public void testDevice2233() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T377P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 8.0", result);
}
public void testDevice2234() throws Exception {
    final String result = DeviceNames.getDeviceName("XT535", FALLBACK);
    Assert.assertEquals("Motorola Moto Defy XT", result);
}
public void testDevice2235() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I535", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice2236() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I829", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Style Duos", result);
}
public void testDevice2237() throws Exception {
    final String result = DeviceNames.getDeviceName("LE49U5000A", FALLBACK);
    Assert.assertEquals("Haier LE49U5000A", result);
}
public void testDevice2238() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G361H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice2239() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G361M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice2240() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LG870", FALLBACK);
    Assert.assertEquals("LGE LG Optimus F7", result);
}
public void testDevice2241() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G361F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice2242() throws Exception {
    final String result = DeviceNames.getDeviceName("CS180", FALLBACK);
    Assert.assertEquals("Infocus CS1 8.0", result);
}
public void testDevice2243() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM205SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE ss 205SH", result);
}
public void testDevice2244() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I759", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Infinite", result);
}
public void testDevice2245() throws Exception {
    final String result = DeviceNames.getDeviceName("I-K1", FALLBACK);
    Assert.assertEquals("iRiver ULALA", result);
}
public void testDevice2246() throws Exception {
    final String result = DeviceNames.getDeviceName("P350X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) P350X", result);
}
public void testDevice2247() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D500", FALLBACK);
    Assert.assertEquals("LGE Optimus F6", result);
}
public void testDevice2248() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D505", FALLBACK);
    Assert.assertEquals("LGE Optimus F6", result);
}
public void testDevice2249() throws Exception {
    final String result = DeviceNames.getDeviceName("S39h", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia C", result);
}
public void testDevice2250() throws Exception {
    final String result = DeviceNames.getDeviceName("HTCD200LVW", FALLBACK);
    Assert.assertEquals("HTC Desire 626", result);
}
public void testDevice2251() throws Exception {
    final String result = DeviceNames.getDeviceName("H30-C00", FALLBACK);
    Assert.assertEquals("Huawei H30-C00", result);
}
public void testDevice2252() throws Exception {
    final String result = DeviceNames.getDeviceName("FT142D", FALLBACK);
    Assert.assertEquals("ZTE FT142D", result);
}
public void testDevice2253() throws Exception {
    final String result = DeviceNames.getDeviceName("TT101", FALLBACK);
    Assert.assertEquals("ZTE V9", result);
}
public void testDevice2254() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I337M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice2255() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P925g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus 3D", result);
}
public void testDevice2256() throws Exception {
    final String result = DeviceNames.getDeviceName("E2043", FALLBACK);
    Assert.assertEquals("Sony Xperia E4g Dual", result);
}
public void testDevice2257() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J500F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J5", result);
}
public void testDevice2258() throws Exception {
    final String result = DeviceNames.getDeviceName("Mi438S", FALLBACK);
    Assert.assertEquals("Nexian journey one", result);
}
public void testDevice2259() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-D710VMUB", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice2260() throws Exception {
    final String result = DeviceNames.getDeviceName("NS-14T004", FALLBACK);
    Assert.assertEquals("Insignia Flex 10.1", result);
}
public void testDevice2261() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A720L", FALLBACK);
    Assert.assertEquals("Pantech Vega X", result);
}
public void testDevice2262() throws Exception {
    final String result = DeviceNames.getDeviceName("B1-710", FALLBACK);
    Assert.assertEquals("Acer B1-710", result);
}
public void testDevice2263() throws Exception {
    final String result = DeviceNames.getDeviceName("B1-711", FALLBACK);
    Assert.assertEquals("Acer B1-711", result);
}
public void testDevice2264() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_983", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 983", result);
}
public void testDevice2265() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_985", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Alcatel one touch 985", result);
}
public void testDevice2266() throws Exception {
    final String result = DeviceNames.getDeviceName("M330", FALLBACK);
    Assert.assertEquals("Huawei China", result);
}
public void testDevice2267() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J500M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J5", result);
}
public void testDevice2268() throws Exception {
    final String result = DeviceNames.getDeviceName("HTX21", FALLBACK);
    Assert.assertEquals("HTC KDDI Infobar A02", result);
}
public void testDevice2269() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00AD", FALLBACK);
    Assert.assertEquals("Asus Zenfone 2", result);
}
public void testDevice2270() throws Exception {
    final String result = DeviceNames.getDeviceName("A27", FALLBACK);
    Assert.assertEquals("Micromax A27", result);
}
public void testDevice2271() throws Exception {
    final String result = DeviceNames.getDeviceName("302HW", FALLBACK);
    Assert.assertEquals("Huawei P6S-L04", result);
}
public void testDevice2272() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M250S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice2273() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M250L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice2274() throws Exception {
    final String result = DeviceNames.getDeviceName("Qrypton1010", FALLBACK);
    Assert.assertEquals("Gigabyte TM105A", result);
}
public void testDevice2275() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M250K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice2276() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP512", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2 Tablet", result);
}
public void testDevice2277() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP511", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2 Tablet", result);
}
public void testDevice2278() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T815C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice2279() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T815Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice2280() throws Exception {
    final String result = DeviceNames.getDeviceName("Ultym5", FALLBACK);
    Assert.assertEquals("Huawei G535-L11", result);
}
public void testDevice2281() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8190L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Mini", result);
}
public void testDevice2282() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I896", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Captivate", result);
}
public void testDevice2283() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I897", FALLBACK);
    Assert.assertEquals("Samsung Captivate", result);
}
public void testDevice2284() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H502", FALLBACK);
    Assert.assertEquals("LGE LG Magna", result);
}
public void testDevice2285() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H500", FALLBACK);
    Assert.assertEquals("LGE LG Magna", result);
}
public void testDevice2286() throws Exception {
    final String result = DeviceNames.getDeviceName("NS-15AT10", FALLBACK);
    Assert.assertEquals("Insignia NS-15AT10", result);
}
public void testDevice2287() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I547", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Rugby Pro", result);
}
public void testDevice2288() throws Exception {
    final String result = DeviceNames.getDeviceName("CHM-CL00", FALLBACK);
    Assert.assertEquals("Huawei CHM-CL00", result);
}
public void testDevice2289() throws Exception {
    final String result = DeviceNames.getDeviceName("Shine", FALLBACK);
    Assert.assertEquals("Explay Shine", result);
}
public void testDevice2290() throws Exception {
    final String result = DeviceNames.getDeviceName("TBQG855", FALLBACK);
    Assert.assertEquals("Zeki TBQG855", result);
}
public void testDevice2291() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55XT780G3D", FALLBACK);
    Assert.assertEquals("Hisense LED55XT780G3D", result);
}
public void testDevice2292() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_0PKX2", FALLBACK);
    Assert.assertEquals("HTC Desire 626", result);
}
public void testDevice2293() throws Exception {
    final String result = DeviceNames.getDeviceName("MACARON", FALLBACK);
    Assert.assertEquals("Wiko MACARON", result);
}
public void testDevice2294() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R880", FALLBACK);
    Assert.assertEquals("Samsung Acclaim", result);
}
public void testDevice2295() throws Exception {
    final String result = DeviceNames.getDeviceName("HW-H60-J1", FALLBACK);
    Assert.assertEquals("Huawei H60-J1", result);
}
public void testDevice2296() throws Exception {
    final String result = DeviceNames.getDeviceName("Yupiroid", FALLBACK);
    Assert.assertEquals("Hipstreet Yupiroid", result);
}
public void testDevice2297() throws Exception {
    final String result = DeviceNames.getDeviceName("N790", FALLBACK);
    Assert.assertEquals("ZTE N790", result);
}
public void testDevice2298() throws Exception {
    final String result = DeviceNames.getDeviceName("C1504", FALLBACK);
    Assert.assertEquals("Sony Xperia E", result);
}
public void testDevice2299() throws Exception {
    final String result = DeviceNames.getDeviceName("C1505", FALLBACK);
    Assert.assertEquals("Sony Xperia E", result);
}
public void testDevice2300() throws Exception {
    final String result = DeviceNames.getDeviceName("Aloha", FALLBACK);
    Assert.assertEquals("LGE Ally", result);
}
public void testDevice2301() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J120F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice2302() throws Exception {
    final String result = DeviceNames.getDeviceName("7DTB25", FALLBACK);
    Assert.assertEquals("Hipstreet 7DTB25", result);
}
public void testDevice2303() throws Exception {
    final String result = DeviceNames.getDeviceName("HM-N501-FL", FALLBACK);
    Assert.assertEquals("Haier HM-N501-FL", result);
}
public void testDevice2304() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J120H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1(2016)", result);
}
public void testDevice2305() throws Exception {
    final String result = DeviceNames.getDeviceName("VS980_4G", FALLBACK);
    Assert.assertEquals("LG G2", result);
}
public void testDevice2306() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I927", FALLBACK);
    Assert.assertEquals("Samsung Captivate Glide", result);
}
public void testDevice2307() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I925", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice2308() throws Exception {
    final String result = DeviceNames.getDeviceName("T705", FALLBACK);
    Assert.assertEquals("Positivo T705", result);
}
public void testDevice2309() throws Exception {
    final String result = DeviceNames.getDeviceName("T701", FALLBACK);
    Assert.assertEquals("Positivo T701 TV", result);
}
public void testDevice2310() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E730f", FALLBACK);
    Assert.assertEquals("LGE Optimus Sol", result);
}
public void testDevice2311() throws Exception {
    final String result = DeviceNames.getDeviceName("X909", FALLBACK);
    Assert.assertEquals("Oppo X909", result);
}
public void testDevice2312() throws Exception {
    final String result = DeviceNames.getDeviceName("X900", FALLBACK);
    Assert.assertEquals("Foxconn XOLO", result);
}
public void testDevice2313() throws Exception {
    final String result = DeviceNames.getDeviceName("YU5010A", FALLBACK);
    Assert.assertEquals("YUPHORIA", result);
}
public void testDevice2314() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I699I", FALLBACK);
    Assert.assertEquals("Samsung China Telecom", result);
}
public void testDevice2315() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6773W22B", FALLBACK);
    Assert.assertEquals("RCA 7 Voyager II", result);
}
public void testDevice2316() throws Exception {
    final String result = DeviceNames.getDeviceName("VP73_Vox", FALLBACK);
    Assert.assertEquals("Vestel VP73", result);
}
public void testDevice2317() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9197", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice2318() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55K380U", FALLBACK);
    Assert.assertEquals("Hisense LED55K380U", result);
}
public void testDevice2319() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9195", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice2320() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9192", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini Duos", result);
}
public void testDevice2321() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9190", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice2322() throws Exception {
    final String result = DeviceNames.getDeviceName("E2281UK", FALLBACK);
    Assert.assertEquals("Hisense Sero 8", result);
}
public void testDevice2323() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9198", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice2324() throws Exception {
    final String result = DeviceNames.getDeviceName("Z826", FALLBACK);
    Assert.assertEquals("ZTE Z826", result);
}
public void testDevice2325() throws Exception {
    final String result = DeviceNames.getDeviceName("Z820", FALLBACK);
    Assert.assertEquals("ZTE Z820", result);
}
public void testDevice2326() throws Exception {
    final String result = DeviceNames.getDeviceName("SH8128U", FALLBACK);
    Assert.assertEquals("Sharp SH8128U", result);
}
public void testDevice2327() throws Exception {
    final String result = DeviceNames.getDeviceName("ST26i", FALLBACK);
    Assert.assertEquals("Sony Xperia J", result);
}
public void testDevice2328() throws Exception {
    final String result = DeviceNames.getDeviceName("POC2", FALLBACK);
    Assert.assertEquals("POC2", result);
}
public void testDevice2329() throws Exception {
    final String result = DeviceNames.getDeviceName("P-01D", FALLBACK);
    Assert.assertEquals("Panasonic P-01D", result);
}
public void testDevice2330() throws Exception {
    final String result = DeviceNames.getDeviceName("MITO_A10", FALLBACK);
    Assert.assertEquals("Mito A10", result);
}
public void testDevice2331() throws Exception {
    final String result = DeviceNames.getDeviceName("HY1-5085", FALLBACK);
    Assert.assertEquals("Hyundai HY1-5085", result);
}
public void testDevice2332() throws Exception {
    final String result = DeviceNames.getDeviceName("M-MP7NB3G", FALLBACK);
    Assert.assertEquals("Nextbook M-MP7NB3G", result);
}
public void testDevice2333() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G850FQ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice2334() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T859", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice2335() throws Exception {
    final String result = DeviceNames.getDeviceName("AX1060", FALLBACK);
    Assert.assertEquals("BMobile AX1060", result);
}
public void testDevice2336() throws Exception {
    final String result = DeviceNames.getDeviceName("LED58XT880J3DU", FALLBACK);
    Assert.assertEquals("Hisense LED58XT880J3DU", result);
}
public void testDevice2337() throws Exception {
    final String result = DeviceNames.getDeviceName("XT702", FALLBACK);
    Assert.assertEquals("Motorola Droid", result);
}
public void testDevice2338() throws Exception {
    final String result = DeviceNames.getDeviceName("Clempad_HR_Plus", FALLBACK);
    Assert.assertEquals("Clementoni Clempad HR Plus", result);
}
public void testDevice2339() throws Exception {
    final String result = DeviceNames.getDeviceName("XT701", FALLBACK);
    Assert.assertEquals("Motorola Droid", result);
}
public void testDevice2340() throws Exception {
    final String result = DeviceNames.getDeviceName("GR-TB10S", FALLBACK);
    Assert.assertEquals("Anydata Grundig GR-TB10S Tablet", result);
}
public void testDevice2341() throws Exception {
    final String result = DeviceNames.getDeviceName("Cygnus", FALLBACK);
    Assert.assertEquals("MobiWire Cygnus", result);
}
public void testDevice2342() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P3110", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 2", result);
}
public void testDevice2343() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P3113", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 2 7.0", result);
}
public void testDevice2344() throws Exception {
    final String result = DeviceNames.getDeviceName("Dslide710", FALLBACK);
    Assert.assertEquals("Danew DSlide 710", result);
}
public void testDevice2345() throws Exception {
    final String result = DeviceNames.getDeviceName("E5553", FALLBACK);
    Assert.assertEquals("Sony Xperia C5 Ultra", result);
}
public void testDevice2346() throws Exception {
    final String result = DeviceNames.getDeviceName("A5_Easy_TM", FALLBACK);
    Assert.assertEquals("AllView A5 Easy", result);
}
public void testDevice2347() throws Exception {
    final String result = DeviceNames.getDeviceName("Zilo", FALLBACK);
    Assert.assertEquals("Zilo", result);
}
public void testDevice2348() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_mini_2", FALLBACK);
    Assert.assertEquals("HTC One mini 2", result);
}
public void testDevice2349() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-04G", FALLBACK);
    Assert.assertEquals("Sony Xperia A4", result);
}
public void testDevice2350() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-04F", FALLBACK);
    Assert.assertEquals("Sony Xperia A2", result);
}
public void testDevice2351() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-04E", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia A", result);
}
public void testDevice2352() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-04D", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia GX", result);
}
public void testDevice2353() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R720", FALLBACK);
    Assert.assertEquals("Samsung Admire", result);
}
public void testDevice2354() throws Exception {
    final String result = DeviceNames.getDeviceName("F5281", FALLBACK);
    Assert.assertEquals("Hisense Sero 8 pro", result);
}
public void testDevice2355() throws Exception {
    final String result = DeviceNames.getDeviceName("i785Q", FALLBACK);
    Assert.assertEquals("IView SupraPad i785Q", result);
}
public void testDevice2356() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G357M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice2357() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite8QI", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite8QI", result);
}
public void testDevice2358() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E300S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice2359() throws Exception {
    final String result = DeviceNames.getDeviceName("D6708", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3v", result);
}
public void testDevice2360() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50L288", FALLBACK);
    Assert.assertEquals("Hisense LED50L288", result);
}
public void testDevice2361() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G5500", FALLBACK);
    Assert.assertEquals("Samsung Galaxy On5", result);
}
public void testDevice2362() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00EDB", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 Laser (ZE500KL)", result);
}
public void testDevice2363() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E300L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice2364() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E300K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice2365() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-7DTB40-8GB", FALLBACK);
    Assert.assertEquals("Hipstreet HS-7DTB40-8GB", result);
}
public void testDevice2366() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-GC110", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera", result);
}
public void testDevice2367() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-L900", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note II", result);
}
public void testDevice2368() throws Exception {
    final String result = DeviceNames.getDeviceName("MT3A", FALLBACK);
    Assert.assertEquals("MegaFon MT3A", result);
}
public void testDevice2369() throws Exception {
    final String result = DeviceNames.getDeviceName("YU5510", FALLBACK);
    Assert.assertEquals("Yureka", result);
}
public void testDevice2370() throws Exception {
    final String result = DeviceNames.getDeviceName("D6563", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2a", result);
}
public void testDevice2371() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A510XZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice2372() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite8QL", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite8QL", result);
}
public void testDevice2373() throws Exception {
    final String result = DeviceNames.getDeviceName("GT540GO", FALLBACK);
    Assert.assertEquals("LGE Swift", result);
}
public void testDevice2374() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-GS1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Player 3.6", result);
}
public void testDevice2375() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P505CH", FALLBACK);
    Assert.assertEquals("LGE LG Optimus One", result);
}
public void testDevice2376() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I957", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice2377() throws Exception {
    final String result = DeviceNames.getDeviceName("C6506", FALLBACK);
    Assert.assertEquals("Sony Xperia ZL", result);
}
public void testDevice2378() throws Exception {
    final String result = DeviceNames.getDeviceName("C6503", FALLBACK);
    Assert.assertEquals("Sony Xperia ZL", result);
}
public void testDevice2379() throws Exception {
    final String result = DeviceNames.getDeviceName("C6502", FALLBACK);
    Assert.assertEquals("Sony Xperia ZL", result);
}
public void testDevice2380() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-P100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0", result);
}
public void testDevice2381() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-KU3700", FALLBACK);
    Assert.assertEquals("LGE Optimus One", result);
}
public void testDevice2382() throws Exception {
    final String result = DeviceNames.getDeviceName("SmartTab10", FALLBACK);
    Assert.assertEquals("ZTE SmartTab10", result);
}
public void testDevice2383() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D315", FALLBACK);
    Assert.assertEquals("LGE LG F70", result);
}
public void testDevice2384() throws Exception {
    final String result = DeviceNames.getDeviceName("A1", FALLBACK);
    Assert.assertEquals("ZTE A1R", result);
}
public void testDevice2385() throws Exception {
    final String result = DeviceNames.getDeviceName("A3", FALLBACK);
    Assert.assertEquals("BenQ A3", result);
}
public void testDevice2386() throws Exception {
    final String result = DeviceNames.getDeviceName("A2", FALLBACK);
    Assert.assertEquals("ZTE A2", result);
}
public void testDevice2387() throws Exception {
    final String result = DeviceNames.getDeviceName("A5", FALLBACK);
    Assert.assertEquals("Southern Telecom A5", result);
}
public void testDevice2388() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-MS870", FALLBACK);
    Assert.assertEquals("LGE Spirit 4G", result);
}
public void testDevice2389() throws Exception {
    final String result = DeviceNames.getDeviceName("A6", FALLBACK);
    Assert.assertEquals("Polaroid A6", result);
}
public void testDevice2390() throws Exception {
    final String result = DeviceNames.getDeviceName("R2010", FALLBACK);
    Assert.assertEquals("OPPO R2010", result);
}
public void testDevice2391() throws Exception {
    final String result = DeviceNames.getDeviceName("R2017", FALLBACK);
    Assert.assertEquals("OPPO R2017", result);
}
public void testDevice2392() throws Exception {
    final String result = DeviceNames.getDeviceName("T7", FALLBACK);
    Assert.assertEquals("Tobii DynaVox T7", result);
}
public void testDevice2393() throws Exception {
    final String result = DeviceNames.getDeviceName("T2", FALLBACK);
    Assert.assertEquals("Lumigon T2", result);
}
public void testDevice2394() throws Exception {
    final String result = DeviceNames.getDeviceName("T3", FALLBACK);
    Assert.assertEquals("ZTE T3", result);
}
public void testDevice2395() throws Exception {
    final String result = DeviceNames.getDeviceName("NX406E", FALLBACK);
    Assert.assertEquals("ZTE NX406E", result);
}
public void testDevice2396() throws Exception {
    final String result = DeviceNames.getDeviceName("GEM-703LT", FALLBACK);
    Assert.assertEquals("Huawei X2", result);
}
public void testDevice2397() throws Exception {
    final String result = DeviceNames.getDeviceName("NB09", FALLBACK);
    Assert.assertEquals("Nobis NB09", result);
}
public void testDevice2398() throws Exception {
    final String result = DeviceNames.getDeviceName("DA226HQ", FALLBACK);
    Assert.assertEquals("Acer DA226HQ", result);
}
public void testDevice2399() throws Exception {
    final String result = DeviceNames.getDeviceName("NB07", FALLBACK);
    Assert.assertEquals("Nobis NB07", result);
}
public void testDevice2400() throws Exception {
    final String result = DeviceNames.getDeviceName("PixelV1", FALLBACK);
    Assert.assertEquals("Lava Pixel V1", result);
}
public void testDevice2401() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_10STBF", FALLBACK);
    Assert.assertEquals("Positivo Ypy 10STBF", result);
}
public void testDevice2402() throws Exception {
    final String result = DeviceNames.getDeviceName("E380", FALLBACK);
    Assert.assertEquals("Acer Liquid E3", result);
}
public void testDevice2403() throws Exception {
    final String result = DeviceNames.getDeviceName("SCL-CL00", FALLBACK);
    Assert.assertEquals("Huawei Honor 4A", result);
}
public void testDevice2404() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_0PJA10", FALLBACK);
    Assert.assertEquals("HTC One M9", result);
}
public void testDevice2405() throws Exception {
    final String result = DeviceNames.getDeviceName("Hydro", FALLBACK);
    Assert.assertEquals("Kyocera Hydro PLUS", result);
}
public void testDevice2406() throws Exception {
    final String result = DeviceNames.getDeviceName("B506_TW", FALLBACK);
    Assert.assertEquals("BenQ B506", result);
}
public void testDevice2407() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-7DTB25", FALLBACK);
    Assert.assertEquals("Haier HS-7DTB25", result);
}
public void testDevice2408() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-7DTB27", FALLBACK);
    Assert.assertEquals("Hipstreet HS-7DTB27", result);
}
public void testDevice2409() throws Exception {
    final String result = DeviceNames.getDeviceName("LED39K360J", FALLBACK);
    Assert.assertEquals("Hisense LED39K360J", result);
}
public void testDevice2410() throws Exception {
    final String result = DeviceNames.getDeviceName("Now", FALLBACK);
    Assert.assertEquals("NGM Italia SRL Danamic Now", result);
}
public void testDevice2411() throws Exception {
    final String result = DeviceNames.getDeviceName("KC-S301AE", FALLBACK);
    Assert.assertEquals("Kyocera S301", result);
}
public void testDevice2412() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X130g", FALLBACK);
    Assert.assertEquals("LGE L45", result);
}
public void testDevice2413() throws Exception {
    final String result = DeviceNames.getDeviceName("KYV36", FALLBACK);
    Assert.assertEquals("Kyocera DIGNO rafre", result);
}
public void testDevice2414() throws Exception {
    final String result = DeviceNames.getDeviceName("KYV34", FALLBACK);
    Assert.assertEquals("Kyocera URBANO V02", result);
}
public void testDevice2415() throws Exception {
    final String result = DeviceNames.getDeviceName("KYV35", FALLBACK);
    Assert.assertEquals("Kyocera TORQUE G02", result);
}
public void testDevice2416() throws Exception {
    final String result = DeviceNames.getDeviceName("KYV32", FALLBACK);
    Assert.assertEquals("Kyocera BASIO", result);
}
public void testDevice2417() throws Exception {
    final String result = DeviceNames.getDeviceName("KYV33", FALLBACK);
    Assert.assertEquals("Kyocera INFOBAR A03", result);
}
public void testDevice2418() throws Exception {
    final String result = DeviceNames.getDeviceName("KYV31", FALLBACK);
    Assert.assertEquals("Kyocera URBANO V01", result);
}
public void testDevice2419() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D320AR", FALLBACK);
    Assert.assertEquals("LGE L70", result);
}
public void testDevice2420() throws Exception {
    final String result = DeviceNames.getDeviceName("F-10D", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS X F-10D", result);
}
public void testDevice2421() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T999", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice2422() throws Exception {
    final String result = DeviceNames.getDeviceName("HERO200", FALLBACK);
    Assert.assertEquals("HTC Hero", result);
}
public void testDevice2423() throws Exception {
    final String result = DeviceNames.getDeviceName("LE39M7000CF", FALLBACK);
    Assert.assertEquals("Haier LE39M7000CF", result);
}
public void testDevice2424() throws Exception {
    final String result = DeviceNames.getDeviceName("AZDroid", FALLBACK);
    Assert.assertEquals("AZBox AZDroid", result);
}
public void testDevice2425() throws Exception {
    final String result = DeviceNames.getDeviceName("SMART64", FALLBACK);
    Assert.assertEquals("Binatone SMART64", result);
}
public void testDevice2426() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice2427() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920R6", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice2428() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920R7", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice2429() throws Exception {
    final String result = DeviceNames.getDeviceName("MC36", FALLBACK);
    Assert.assertEquals("Zebra MC36", result);
}
public void testDevice2430() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5470DUO", FALLBACK);
    Assert.assertEquals("Prestigio Grace X5", result);
}
public void testDevice2431() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9008V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice2432() throws Exception {
    final String result = DeviceNames.getDeviceName("Swift", FALLBACK);
    Assert.assertEquals("AG Mobile Swift", result);
}
public void testDevice2433() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7803G", FALLBACK);
    Assert.assertEquals("Proscan PLT7803G", result);
}
public void testDevice2434() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P509", FALLBACK);
    Assert.assertEquals("LG Optimus T", result);
}
public void testDevice2435() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P506", FALLBACK);
    Assert.assertEquals("LGE LG Optimus One", result);
}
public void testDevice2436() throws Exception {
    final String result = DeviceNames.getDeviceName("BB8252", FALLBACK);
    Assert.assertEquals("Bigben BB8252", result);
}
public void testDevice2437() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P504", FALLBACK);
    Assert.assertEquals("LGE LG Optimus One", result);
}
public void testDevice2438() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P505", FALLBACK);
    Assert.assertEquals("LGE LG Optimus One", result);
}
public void testDevice2439() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P503", FALLBACK);
    Assert.assertEquals("LGE LG Optimus One", result);
}
public void testDevice2440() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P500", FALLBACK);
    Assert.assertEquals("LGE LG Optimus One", result);
}
public void testDevice2441() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7390E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fresh", result);
}
public void testDevice2442() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7390G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fresh", result);
}
public void testDevice2443() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7390L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Lite", result);
}
public void testDevice2444() throws Exception {
    final String result = DeviceNames.getDeviceName("L-IXIR_TAB_840", FALLBACK);
    Assert.assertEquals("Logicom L-IXIR TAB 840", result);
}
public void testDevice2445() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_10FTB", FALLBACK);
    Assert.assertEquals("Positivo Ypy 10FTB", result);
}
public void testDevice2446() throws Exception {
    final String result = DeviceNames.getDeviceName("PT2200", FALLBACK);
    Assert.assertEquals("BenQ PT2200", result);
}
public void testDevice2447() throws Exception {
    final String result = DeviceNames.getDeviceName("RioPlay", FALLBACK);
    Assert.assertEquals("Explay Rio Play", result);
}
public void testDevice2448() throws Exception {
    final String result = DeviceNames.getDeviceName("CMB501", FALLBACK);
    Assert.assertEquals("Hisense CMB501", result);
}
public void testDevice2449() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900MD", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice2450() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I510", FALLBACK);
    Assert.assertEquals("Samsung Droid Charge", result);
}
public void testDevice2451() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7710L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Xcover2", result);
}
public void testDevice2452() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P6200L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0 Plus", result);
}
public void testDevice2453() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5500", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Europa", result);
}
public void testDevice2454() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5503", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Europa", result);
}
public void testDevice2455() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F480K", FALLBACK);
    Assert.assertEquals("LGE Wine Smart", result);
}
public void testDevice2456() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5508", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Europa", result);
}
public void testDevice2457() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LG855", FALLBACK);
    Assert.assertEquals("LGE Marquee", result);
}
public void testDevice2458() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F480S", FALLBACK);
    Assert.assertEquals("LGE Wine Smart", result);
}
public void testDevice2459() throws Exception {
    final String result = DeviceNames.getDeviceName("W717", FALLBACK);
    Assert.assertEquals("Haier W717", result);
}
public void testDevice2460() throws Exception {
    final String result = DeviceNames.getDeviceName("S510", FALLBACK);
    Assert.assertEquals("Acer Liquid S1", result);
}
public void testDevice2461() throws Exception {
    final String result = DeviceNames.getDeviceName("E2281", FALLBACK);
    Assert.assertEquals("Hisense Sero 8", result);
}
public void testDevice2462() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-05D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice2463() throws Exception {
    final String result = DeviceNames.getDeviceName("D2202", FALLBACK);
    Assert.assertEquals("Sony Xperia E3", result);
}
public void testDevice2464() throws Exception {
    final String result = DeviceNames.getDeviceName("A5_Quad_Plus", FALLBACK);
    Assert.assertEquals("AllView A5 Quad Plus", result);
}
public void testDevice2465() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P700", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7", result);
}
public void testDevice2466() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5690", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Xcover", result);
}
public void testDevice2467() throws Exception {
    final String result = DeviceNames.getDeviceName("FS551", FALLBACK);
    Assert.assertEquals("Fly Nimbus 4", result);
}
public void testDevice2468() throws Exception {
    final String result = DeviceNames.getDeviceName("archer", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A", result);
}
public void testDevice2469() throws Exception {
    final String result = DeviceNames.getDeviceName("VF695", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) VF695", result);
}
public void testDevice2470() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P5210", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 3 10.1", result);
}
public void testDevice2471() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-L710", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice2472() throws Exception {
    final String result = DeviceNames.getDeviceName("PX2800", FALLBACK);
    Assert.assertEquals("Hisense PX2800", result);
}
public void testDevice2473() throws Exception {
    final String result = DeviceNames.getDeviceName("788TPCII", FALLBACK);
    Assert.assertEquals("IView 788TPCII", result);
}
public void testDevice2474() throws Exception {
    final String result = DeviceNames.getDeviceName("B1-730", FALLBACK);
    Assert.assertEquals("Acer Iconia One 7", result);
}
public void testDevice2475() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N8005", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice2476() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N8000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice2477() throws Exception {
    final String result = DeviceNames.getDeviceName("DM015K", FALLBACK);
    Assert.assertEquals("Kyocera DM015K", result);
}
public void testDevice2478() throws Exception {
    final String result = DeviceNames.getDeviceName("Fly_IQ442", FALLBACK);
    Assert.assertEquals("Enspert CINK SLIM", result);
}
public void testDevice2479() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1025", FALLBACK);
    Assert.assertEquals("Motorola Moto E", result);
}
public void testDevice2480() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT8223G", FALLBACK);
    Assert.assertEquals("Anydata Proscan PLT8223G", result);
}
public void testDevice2481() throws Exception {
    final String result = DeviceNames.getDeviceName("PI3910", FALLBACK);
    Assert.assertEquals("Philips PI3910", result);
}
public void testDevice2482() throws Exception {
    final String result = DeviceNames.getDeviceName("Trooper_X40", FALLBACK);
    Assert.assertEquals("KAZAM TROOPER X4.0", result);
}
public void testDevice2483() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-GB70", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Player", result);
}
public void testDevice2484() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8730", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Express", result);
}
public void testDevice2485() throws Exception {
    final String result = DeviceNames.getDeviceName("HTL23", FALLBACK);
    Assert.assertEquals("HTC HTL23", result);
}
public void testDevice2486() throws Exception {
    final String result = DeviceNames.getDeviceName("HTL22", FALLBACK);
    Assert.assertEquals("HTC J One", result);
}
public void testDevice2487() throws Exception {
    final String result = DeviceNames.getDeviceName("HTL21", FALLBACK);
    Assert.assertEquals("HTC J Butterfly", result);
}
public void testDevice2488() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9192I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice2489() throws Exception {
    final String result = DeviceNames.getDeviceName("G100W", FALLBACK);
    Assert.assertEquals("Acer Picasso", result);
}
public void testDevice2490() throws Exception {
    final String result = DeviceNames.getDeviceName("Z110", FALLBACK);
    Assert.assertEquals("Acer Z110", result);
}
public void testDevice2491() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_0PKV1", FALLBACK);
    Assert.assertEquals("HTC ONE M8s", result);
}
public void testDevice2492() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X135", FALLBACK);
    Assert.assertEquals("LGE L60", result);
}
public void testDevice2493() throws Exception {
    final String result = DeviceNames.getDeviceName("LED48K370", FALLBACK);
    Assert.assertEquals("Hisense LED48K370", result);
}
public void testDevice2494() throws Exception {
    final String result = DeviceNames.getDeviceName("Venus", FALLBACK);
    Assert.assertEquals("Mobicell Mobicel", result);
}
public void testDevice2495() throws Exception {
    final String result = DeviceNames.getDeviceName("MTN-8978P", FALLBACK);
    Assert.assertEquals("MTN-8978P", result);
}
public void testDevice2496() throws Exception {
    final String result = DeviceNames.getDeviceName("EV-S100", FALLBACK);
    Assert.assertEquals("KT Tech EV-S100", result);
}
public void testDevice2497() throws Exception {
    final String result = DeviceNames.getDeviceName("TP10RA1", FALLBACK);
    Assert.assertEquals("ECS TP10RA1", result);
}
public void testDevice2498() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H788", FALLBACK);
    Assert.assertEquals("LGE LG AKA", result);
}
public void testDevice2499() throws Exception {
    final String result = DeviceNames.getDeviceName("N850", FALLBACK);
    Assert.assertEquals("ZTE N850", result);
}
public void testDevice2500() throws Exception {
    final String result = DeviceNames.getDeviceName("Z752C", FALLBACK);
    Assert.assertEquals("ZTE Z752C", result);
}
public void testDevice2501() throws Exception {
    final String result = DeviceNames.getDeviceName("FGAD", FALLBACK);
    Assert.assertEquals("Royaltek FGAD", result);
}
public void testDevice2502() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LU8300", FALLBACK);
    Assert.assertEquals("LGE Optimus PAD LTE", result);
}
public void testDevice2503() throws Exception {
    final String result = DeviceNames.getDeviceName("T1-701w", FALLBACK);
    Assert.assertEquals("Huawei MediaPad", result);
}
public void testDevice2504() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1 v", result);
}
public void testDevice2505() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A510F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice2506() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A510K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice2507() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A510L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice2508() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A510M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice2509() throws Exception {
    final String result = DeviceNames.getDeviceName("Y541-U02", FALLBACK);
    Assert.assertEquals("Huawei Y541-U02", result);
}
public void testDevice2510() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D858HK", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice2511() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A510X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice2512() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A510Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice2513() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T530NU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 4 10.1", result);
}
public void testDevice2514() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T939", FALLBACK);
    Assert.assertEquals("Hisense HS-T939", result);
}
public void testDevice2515() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire_S", FALLBACK);
    Assert.assertEquals("HTC Desire S", result);
}
public void testDevice2516() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-i909", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice2517() throws Exception {
    final String result = DeviceNames.getDeviceName("MICROSTAR_E10319", FALLBACK);
    Assert.assertEquals("Medion LIFETAB E10320", result);
}
public void testDevice2518() throws Exception {
    final String result = DeviceNames.getDeviceName("HyasongT1", FALLBACK);
    Assert.assertEquals("Haier Hyasong T1", result);
}
public void testDevice2519() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T561", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 9.6", result);
}
public void testDevice2520() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T560", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 9.6", result);
}
public void testDevice2521() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T562", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 9.6", result);
}
public void testDevice2522() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T530NN", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4", result);
}
public void testDevice2523() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire_C", FALLBACK);
    Assert.assertEquals("HTC Desire C", result);
}
public void testDevice2524() throws Exception {
    final String result = DeviceNames.getDeviceName("LGAS323", FALLBACK);
    Assert.assertEquals("LGE L70", result);
}
public void testDevice2525() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3", result);
}
public void testDevice2526() throws Exception {
    final String result = DeviceNames.getDeviceName("C5170", FALLBACK);
    Assert.assertEquals("Kyocera Hydro", result);
}
public void testDevice2527() throws Exception {
    final String result = DeviceNames.getDeviceName("DROID2_GLOBAL", FALLBACK);
    Assert.assertEquals("Motorola Droid 2 Global", result);
}
public void testDevice2528() throws Exception {
    final String result = DeviceNames.getDeviceName("U8230", FALLBACK);
    Assert.assertEquals("Huawei U8230", result);
}
public void testDevice2529() throws Exception {
    final String result = DeviceNames.getDeviceName("D5833", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3 Compact", result);
}
public void testDevice2530() throws Exception {
    final String result = DeviceNames.getDeviceName("AX1055", FALLBACK);
    Assert.assertEquals("BMobile AX1055", result);
}
public void testDevice2531() throws Exception {
    final String result = DeviceNames.getDeviceName("FZ-B2B", FALLBACK);
    Assert.assertEquals("Panasonic FZ-B2", result);
}
public void testDevice2532() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A5100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice2533() throws Exception {
    final String result = DeviceNames.getDeviceName("iliumPAD", FALLBACK);
    Assert.assertEquals("Gigabyte mexico", result);
}
public void testDevice2534() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC6435LVW", FALLBACK);
    Assert.assertEquals("HTC Droid DNA", result);
}
public void testDevice2535() throws Exception {
    final String result = DeviceNames.getDeviceName("Kindle_Fire", FALLBACK);
    Assert.assertEquals("Kindle Fire", result);
}
public void testDevice2536() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G720N0", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand-Max", result);
}
public void testDevice2537() throws Exception {
    final String result = DeviceNames.getDeviceName("P-03E", FALLBACK);
    Assert.assertEquals("Panasonic ELUGA P", result);
}
public void testDevice2538() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M250", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice2539() throws Exception {
    final String result = DeviceNames.getDeviceName("XT720", FALLBACK);
    Assert.assertEquals("Motorola Motoroi", result);
}
public void testDevice2540() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T879", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice2541() throws Exception {
    final String result = DeviceNames.getDeviceName("ME600", FALLBACK);
    Assert.assertEquals("Motorola Backflip", result);
}
public void testDevice2542() throws Exception {
    final String result = DeviceNames.getDeviceName("SRF79", FALLBACK);
    Assert.assertEquals("Smartab SRF79", result);
}
public void testDevice2543() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-02H", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5 Compact", result);
}
public void testDevice2544() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-02C", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Acro", result);
}
public void testDevice2545() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-02E", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Z", result);
}
public void testDevice2546() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-02D", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia S", result);
}
public void testDevice2547() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-02G", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3 Compact", result);
}
public void testDevice2548() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-02F", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1f", result);
}
public void testDevice2549() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-09D", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE ZETA SH-09D", result);
}
public void testDevice2550() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D626x", FALLBACK);
    Assert.assertEquals("HTC Desire 626", result);
}
public void testDevice2551() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910T3", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice2552() throws Exception {
    final String result = DeviceNames.getDeviceName("E3_Sign", FALLBACK);
    Assert.assertEquals("AllView E3 Sign", result);
}
public void testDevice2553() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E400R", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3", result);
}
public void testDevice2554() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3502C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend3", result);
}
public void testDevice2555() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM009SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE THE PREMIUM SoftBank 009SH", result);
}
public void testDevice2556() throws Exception {
    final String result = DeviceNames.getDeviceName("E2371CH", FALLBACK);
    Assert.assertEquals("Hisense E2371CH", result);
}
public void testDevice2557() throws Exception {
    final String result = DeviceNames.getDeviceName("MF97G", FALLBACK);
    Assert.assertEquals("ZTE MF97G", result);
}
public void testDevice2558() throws Exception {
    final String result = DeviceNames.getDeviceName("MF97E", FALLBACK);
    Assert.assertEquals("ZTE MF97E", result);
}
public void testDevice2559() throws Exception {
    final String result = DeviceNames.getDeviceName("MF97B", FALLBACK);
    Assert.assertEquals("ZTE Spro 2", result);
}
public void testDevice2560() throws Exception {
    final String result = DeviceNames.getDeviceName("MF97A", FALLBACK);
    Assert.assertEquals("ZTE MF97A", result);
}
public void testDevice2561() throws Exception {
    final String result = DeviceNames.getDeviceName("MF97V", FALLBACK);
    Assert.assertEquals("ZTE Spro 2", result);
}
public void testDevice2562() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E455f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice2563() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E400g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3", result);
}
public void testDevice2564() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E400f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3", result);
}
public void testDevice2565() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E400b", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3", result);
}
public void testDevice2566() throws Exception {
    final String result = DeviceNames.getDeviceName("D2-751G", FALLBACK);
    Assert.assertEquals("Haier D2-751G", result);
}
public void testDevice2567() throws Exception {
    final String result = DeviceNames.getDeviceName("A920", FALLBACK);
    Assert.assertEquals("AZPEN A920", result);
}
public void testDevice2568() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300XU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice2569() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300XZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice2570() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4418", FALLBACK);
    Assert.assertEquals("Fly IQ4418", result);
}
public void testDevice2571() throws Exception {
    final String result = DeviceNames.getDeviceName("MS4B", FALLBACK);
    Assert.assertEquals("MegaFon MS4B", result);
}
public void testDevice2572() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4416", FALLBACK);
    Assert.assertEquals("Fly IQ4416", result);
}
public void testDevice2573() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4415", FALLBACK);
    Assert.assertEquals("Fly IQ4415", result);
}
public void testDevice2574() throws Exception {
    final String result = DeviceNames.getDeviceName("CUBOT_ONE", FALLBACK);
    Assert.assertEquals("Cubot One", result);
}
public void testDevice2575() throws Exception {
    final String result = DeviceNames.getDeviceName("C6522", FALLBACK);
    Assert.assertEquals("Kyocera Hydro XTRM", result);
}
public void testDevice2576() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D331", FALLBACK);
    Assert.assertEquals("LGE LBello", result);
}
public void testDevice2577() throws Exception {
    final String result = DeviceNames.getDeviceName("A846L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) A846L", result);
}
public void testDevice2578() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice2579() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D335", FALLBACK);
    Assert.assertEquals("LGE L Bello", result);
}
public void testDevice2580() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D337", FALLBACK);
    Assert.assertEquals("LGE L Bello", result);
}
public void testDevice2581() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H959", FALLBACK);
    Assert.assertEquals("LGE LG G Flex2", result);
}
public void testDevice2582() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7562L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S DUOS", result);
}
public void testDevice2583() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H950", FALLBACK);
    Assert.assertEquals("LGE LG G Flex2", result);
}
public void testDevice2584() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H955", FALLBACK);
    Assert.assertEquals("LGE LG G Flex2", result);
}
public void testDevice2585() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7562C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Duos", result);
}
public void testDevice2586() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F540K", FALLBACK);
    Assert.assertEquals("LGE LG Volt LTE", result);
}
public void testDevice2587() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F540S", FALLBACK);
    Assert.assertEquals("LGE LG Volt LTE", result);
}
public void testDevice2588() throws Exception {
    final String result = DeviceNames.getDeviceName("C6740N", FALLBACK);
    Assert.assertEquals("Kyocera Hydro WAVE", result);
}
public void testDevice2589() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7562i", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Duos", result);
}
public void testDevice2590() throws Exception {
    final String result = DeviceNames.getDeviceName("MB501", FALLBACK);
    Assert.assertEquals("Motorola Cliq-XT", result);
}
public void testDevice2591() throws Exception {
    final String result = DeviceNames.getDeviceName("NX404H", FALLBACK);
    Assert.assertEquals("ZTE NX404H", result);
}
public void testDevice2592() throws Exception {
    final String result = DeviceNames.getDeviceName("F-12D", FALLBACK);
    Assert.assertEquals("Fujitsu Raku-Raku SMART PHONE F-12D", result);
}
public void testDevice2593() throws Exception {
    final String result = DeviceNames.getDeviceName("F-12C", FALLBACK);
    Assert.assertEquals("Fujitsu F-12C", result);
}
public void testDevice2594() throws Exception {
    final String result = DeviceNames.getDeviceName("PC-TS508T1W", FALLBACK);
    Assert.assertEquals("NEC PC-508T1W", result);
}
public void testDevice2595() throws Exception {
    final String result = DeviceNames.getDeviceName("A210", FALLBACK);
    Assert.assertEquals("Micromax CANVAS 4", result);
}
public void testDevice2596() throws Exception {
    final String result = DeviceNames.getDeviceName("A211", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab A211", result);
}
public void testDevice2597() throws Exception {
    final String result = DeviceNames.getDeviceName("XP7700", FALLBACK);
    Assert.assertEquals("Sonimtech XP7705", result);
}
public void testDevice2598() throws Exception {
    final String result = DeviceNames.getDeviceName("L-02D", FALLBACK);
    Assert.assertEquals("LGE PRADA 3.0", result);
}
public void testDevice2599() throws Exception {
    final String result = DeviceNames.getDeviceName("L-02E", FALLBACK);
    Assert.assertEquals("LGE Optimus LIFE", result);
}
public void testDevice2600() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T805Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2601() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T805S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2602() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T805W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2603() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T805K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2604() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T805L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2605() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T805M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2606() throws Exception {
    final String result = DeviceNames.getDeviceName("SLIDE", FALLBACK);
    Assert.assertEquals("Wiko SLIDE", result);
}
public void testDevice2607() throws Exception {
    final String result = DeviceNames.getDeviceName("CT1000", FALLBACK);
    Assert.assertEquals("Nuvision TM1088", result);
}
public void testDevice2608() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL85C", FALLBACK);
    Assert.assertEquals("LGE Optimus Black", result);
}
public void testDevice2609() throws Exception {
    final String result = DeviceNames.getDeviceName("A460G", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Pixi3-4 TF", result);
}
public void testDevice2610() throws Exception {
    final String result = DeviceNames.getDeviceName("HTCEVOV4G", FALLBACK);
    Assert.assertEquals("HTC Evo V 4G", result);
}
public void testDevice2611() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6303W87DK", FALLBACK);
    Assert.assertEquals("RCA 10 Viking Pro", result);
}
public void testDevice2612() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T677NK", FALLBACK);
    Assert.assertEquals("Samsung Galaxy view", result);
}
public void testDevice2613() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T677NL", FALLBACK);
    Assert.assertEquals("Samsung Galaxy view", result);
}
public void testDevice2614() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7392L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend", result);
}
public void testDevice2615() throws Exception {
    final String result = DeviceNames.getDeviceName("MB810", FALLBACK);
    Assert.assertEquals("Motorola Droid X", result);
}
public void testDevice2616() throws Exception {
    final String result = DeviceNames.getDeviceName("Pulse", FALLBACK);
    Assert.assertEquals("Huawei U8220", result);
}
public void testDevice2617() throws Exception {
    final String result = DeviceNames.getDeviceName("gucci", FALLBACK);
    Assert.assertEquals("Xiaomi HM NOTE 1S CT", result);
}
public void testDevice2618() throws Exception {
    final String result = DeviceNames.getDeviceName("T3000", FALLBACK);
    Assert.assertEquals("Infocus T3000", result);
}
public void testDevice2619() throws Exception {
    final String result = DeviceNames.getDeviceName("QUANTUM_1010N", FALLBACK);
    Assert.assertEquals("GoClever QUANTUM 1010N", result);
}
public void testDevice2620() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T800", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S 10.5", result);
}
public void testDevice2621() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T807", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2622() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T805", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2623() throws Exception {
    final String result = DeviceNames.getDeviceName("GN5002", FALLBACK);
    Assert.assertEquals("Gionee GN5002", result);
}
public void testDevice2624() throws Exception {
    final String result = DeviceNames.getDeviceName("GN5001", FALLBACK);
    Assert.assertEquals("Gionee GN5001", result);
}
public void testDevice2625() throws Exception {
    final String result = DeviceNames.getDeviceName("AK330S", FALLBACK);
    Assert.assertEquals("Acer AK330s", result);
}
public void testDevice2626() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E210S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice2627() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_10FTA", FALLBACK);
    Assert.assertEquals("Positivo YPY 10 3G", result);
}
public void testDevice2628() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E210K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice2629() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E210L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice2630() throws Exception {
    final String result = DeviceNames.getDeviceName("HS_7DTB35", FALLBACK);
    Assert.assertEquals("Hipstreet HS-7DTB35", result);
}
public void testDevice2631() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1528", FALLBACK);
    Assert.assertEquals("Motorola Moto E", result);
}
public void testDevice2632() throws Exception {
    final String result = DeviceNames.getDeviceName("ST7001", FALLBACK);
    Assert.assertEquals("Essentielb ST7001 Tablet", result);
}
public void testDevice2633() throws Exception {
    final String result = DeviceNames.getDeviceName("Y220-U00", FALLBACK);
    Assert.assertEquals("Huawei Y220", result);
}
public void testDevice2634() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-N920A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice2635() throws Exception {
    final String result = DeviceNames.getDeviceName("S350", FALLBACK);
    Assert.assertEquals("BYD Solo S350", result);
}
public void testDevice2636() throws Exception {
    final String result = DeviceNames.getDeviceName("Skill", FALLBACK);
    Assert.assertEquals("Haier Skill", result);
}
public void testDevice2637() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM302SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE Xx 302SH", result);
}
public void testDevice2638() throws Exception {
    final String result = DeviceNames.getDeviceName("Selecline-854599", FALLBACK);
    Assert.assertEquals("Auchan Selecline-854599", result);
}
public void testDevice2639() throws Exception {
    final String result = DeviceNames.getDeviceName("A6S", FALLBACK);
    Assert.assertEquals("TaiwanMobile A6S", result);
}
public void testDevice2640() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5660M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Gio", result);
}
public void testDevice2641() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5660L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Gio", result);
}
public void testDevice2642() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5660B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Gio", result);
}
public void testDevice2643() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C111", FALLBACK);
    Assert.assertEquals("Samsung Galaxy K Zoom", result);
}
public void testDevice2644() throws Exception {
    final String result = DeviceNames.getDeviceName("ST18i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia ray", result);
}
public void testDevice2645() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C115", FALLBACK);
    Assert.assertEquals("Samsung Galaxy K Zoom", result);
}
public void testDevice2646() throws Exception {
    final String result = DeviceNames.getDeviceName("MZ609", FALLBACK);
    Assert.assertEquals("Motorola XOOM 2", result);
}
public void testDevice2647() throws Exception {
    final String result = DeviceNames.getDeviceName("MZ604", FALLBACK);
    Assert.assertEquals("Motorola XOOM", result);
}
public void testDevice2648() throws Exception {
    final String result = DeviceNames.getDeviceName("MZ605", FALLBACK);
    Assert.assertEquals("Motorola XOOM", result);
}
public void testDevice2649() throws Exception {
    final String result = DeviceNames.getDeviceName("ST18a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia ray", result);
}
public void testDevice2650() throws Exception {
    final String result = DeviceNames.getDeviceName("MZ601", FALLBACK);
    Assert.assertEquals("Motorola XOOM", result);
}
public void testDevice2651() throws Exception {
    final String result = DeviceNames.getDeviceName("EGQ223", FALLBACK);
    Assert.assertEquals("Ematic EGQ223", result);
}
public void testDevice2652() throws Exception {
    final String result = DeviceNames.getDeviceName("2014813", FALLBACK);
    Assert.assertEquals("Xiaomi HM 2LTE-CMCC", result);
}
public void testDevice2653() throws Exception {
    final String result = DeviceNames.getDeviceName("KAZAM_Trooper_450L", FALLBACK);
    Assert.assertEquals("KAZAM Trooper 450L", result);
}
public void testDevice2654() throws Exception {
    final String result = DeviceNames.getDeviceName("DMTAB-NV08B", FALLBACK);
    Assert.assertEquals("Nabi DreamTab HD8 Tablet", result);
}
public void testDevice2655() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4601", FALLBACK);
    Assert.assertEquals("Fly IQ4601", result);
}
public void testDevice2656() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N8020", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice2657() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_S500", FALLBACK);
    Assert.assertEquals("Positivo Ypy S500", result);
}
public void testDevice2658() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00ED", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 Laser (ZE500KL)", result);
}
public void testDevice2659() throws Exception {
    final String result = DeviceNames.getDeviceName("W80", FALLBACK);
    Assert.assertEquals("QMobile W80", result);
}
public void testDevice2660() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP551", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2 Tablet", result);
}
public void testDevice2661() throws Exception {
    final String result = DeviceNames.getDeviceName("U3", FALLBACK);
    Assert.assertEquals("Oppo U3", result);
}
public void testDevice2662() throws Exception {
    final String result = DeviceNames.getDeviceName("U2", FALLBACK);
    Assert.assertEquals("Anydata HCL ME TABLET PC U2", result);
}
public void testDevice2663() throws Exception {
    final String result = DeviceNames.getDeviceName("CP-D403", FALLBACK);
    Assert.assertEquals("Megahouse CP-D403", result);
}
public void testDevice2664() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H542", FALLBACK);
    Assert.assertEquals("LGE LG G4 Stylus", result);
}
public void testDevice2665() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H540", FALLBACK);
    Assert.assertEquals("LGE LG G4 Stylus", result);
}
public void testDevice2666() throws Exception {
    final String result = DeviceNames.getDeviceName("LGS01", FALLBACK);
    Assert.assertEquals("LGE Wine Smart", result);
}
public void testDevice2667() throws Exception {
    final String result = DeviceNames.getDeviceName("D2-927G", FALLBACK);
    Assert.assertEquals("Haier D2-927G", result);
}
public void testDevice2668() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9109W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice2669() throws Exception {
    final String result = DeviceNames.getDeviceName("G1-725", FALLBACK);
    Assert.assertEquals("Acer Iconia One 7", result);
}
public void testDevice2670() throws Exception {
    final String result = DeviceNames.getDeviceName("R200", FALLBACK);
    Assert.assertEquals("Toughshield R200", result);
}
public void testDevice2671() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3812B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Slim", result);
}
public void testDevice2672() throws Exception {
    final String result = DeviceNames.getDeviceName("AA3-600", FALLBACK);
    Assert.assertEquals("Acer Aspire A3", result);
}
public void testDevice2673() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-Y3S", FALLBACK);
    Assert.assertEquals("TECNO-Y3S", result);
}
public void testDevice2674() throws Exception {
    final String result = DeviceNames.getDeviceName("Z130", FALLBACK);
    Assert.assertEquals("Acer Liquid Z3", result);
}
public void testDevice2675() throws Exception {
    final String result = DeviceNames.getDeviceName("LT30a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia T", result);
}
public void testDevice2676() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket SS", result);
}
public void testDevice2677() throws Exception {
    final String result = DeviceNames.getDeviceName("NS-14T002", FALLBACK);
    Assert.assertEquals("INSIGNIA NS-14T002", result);
}
public void testDevice2678() throws Exception {
    final String result = DeviceNames.getDeviceName("LT30p", FALLBACK);
    Assert.assertEquals("Sony Xperia T", result);
}
public void testDevice2679() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM107SHB", FALLBACK);
    Assert.assertEquals("Sharp SoftBank 107SH B", result);
}
public void testDevice2680() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E431g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice2681() throws Exception {
    final String result = DeviceNames.getDeviceName("LenovoA3300-H", FALLBACK);
    Assert.assertEquals("Lenovo A3300", result);
}
public void testDevice2682() throws Exception {
    final String result = DeviceNames.getDeviceName("HUAWEI_Y300-0100", FALLBACK);
    Assert.assertEquals("Huawei Ascend Y300", result);
}
public void testDevice2683() throws Exception {
    final String result = DeviceNames.getDeviceName("402SO", FALLBACK);
    Assert.assertEquals("Sony Xperia Z4", result);
}
public void testDevice2684() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LW690", FALLBACK);
    Assert.assertEquals("LGE Optimus One", result);
}
public void testDevice2685() throws Exception {
    final String result = DeviceNames.getDeviceName("LT29i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia TX", result);
}
public void testDevice2686() throws Exception {
    final String result = DeviceNames.getDeviceName("BLADE_N880", FALLBACK);
    Assert.assertEquals("ZTE Blade", result);
}
public void testDevice2687() throws Exception {
    final String result = DeviceNames.getDeviceName("Z792", FALLBACK);
    Assert.assertEquals("ZTE Z792", result);
}
public void testDevice2688() throws Exception {
    final String result = DeviceNames.getDeviceName("ALE-L02", FALLBACK);
    Assert.assertEquals("Huawei ALE-L02", result);
}
public void testDevice2689() throws Exception {
    final String result = DeviceNames.getDeviceName("MotionE11", FALLBACK);
    Assert.assertEquals("Edcon Motion E1.1", result);
}
public void testDevice2690() throws Exception {
    final String result = DeviceNames.getDeviceName("C5155", FALLBACK);
    Assert.assertEquals("Kyocera Rise", result);
}
public void testDevice2691() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P778", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L9", result);
}
public void testDevice2692() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_S350_PLUS", FALLBACK);
    Assert.assertEquals("Positivo Ypy S350p", result);
}
public void testDevice2693() throws Exception {
    final String result = DeviceNames.getDeviceName("L-EMENT350", FALLBACK);
    Assert.assertEquals("Logicom L-EMENT350", result);
}
public void testDevice2694() throws Exception {
    final String result = DeviceNames.getDeviceName("BS472", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Idol S", result);
}
public void testDevice2695() throws Exception {
    final String result = DeviceNames.getDeviceName("Tab814S", FALLBACK);
    Assert.assertEquals("Intenso Tab814S", result);
}
public void testDevice2696() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F430L", FALLBACK);
    Assert.assertEquals("LGE Gx2", result);
}
public void testDevice2697() throws Exception {
    final String result = DeviceNames.getDeviceName("5042G", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP2 (4.5)", result);
}
public void testDevice2698() throws Exception {
    final String result = DeviceNames.getDeviceName("5042D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP 2", result);
}
public void testDevice2699() throws Exception {
    final String result = DeviceNames.getDeviceName("5042A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP 2", result);
}
public void testDevice2700() throws Exception {
    final String result = DeviceNames.getDeviceName("XT897S", FALLBACK);
    Assert.assertEquals("Motorola Photon", result);
}
public void testDevice2701() throws Exception {
    final String result = DeviceNames.getDeviceName("5042X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP 2", result);
}
public void testDevice2702() throws Exception {
    final String result = DeviceNames.getDeviceName("5042W", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP2 (4.5)", result);
}
public void testDevice2703() throws Exception {
    final String result = DeviceNames.getDeviceName("5042T", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5042T", result);
}
public void testDevice2704() throws Exception {
    final String result = DeviceNames.getDeviceName("Ally", FALLBACK);
    Assert.assertEquals("LGE Ally", result);
}
public void testDevice2705() throws Exception {
    final String result = DeviceNames.getDeviceName("Explosion", FALLBACK);
    Assert.assertEquals("Cellon Explosion", result);
}
public void testDevice2706() throws Exception {
    final String result = DeviceNames.getDeviceName("USCC-C6721", FALLBACK);
    Assert.assertEquals("Kyocera Hydro XTRM", result);
}
public void testDevice2707() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_AB10DC", FALLBACK);
    Assert.assertEquals("Positivo Ypy AB10D", result);
}
public void testDevice2708() throws Exception {
    final String result = DeviceNames.getDeviceName("MT8000", FALLBACK);
    Assert.assertEquals("Anydata Eviant MT8000", result);
}
public void testDevice2709() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_AB10DP", FALLBACK);
    Assert.assertEquals("Positivo Ypy AB10DP", result);
}
public void testDevice2710() throws Exception {
    final String result = DeviceNames.getDeviceName("GN9008", FALLBACK);
    Assert.assertEquals("Gionee E8", result);
}
public void testDevice2711() throws Exception {
    final String result = DeviceNames.getDeviceName("GN9006", FALLBACK);
    Assert.assertEquals("Gionee GN9006", result);
}
public void testDevice2712() throws Exception {
    final String result = DeviceNames.getDeviceName("GN9007", FALLBACK);
    Assert.assertEquals("Gionee GN9007", result);
}
public void testDevice2713() throws Exception {
    final String result = DeviceNames.getDeviceName("GN9005", FALLBACK);
    Assert.assertEquals("Gionee S5.1", result);
}
public void testDevice2714() throws Exception {
    final String result = DeviceNames.getDeviceName("GN9000", FALLBACK);
    Assert.assertEquals("Gionee GN9000", result);
}
public void testDevice2715() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_B810x", FALLBACK);
    Assert.assertEquals("HTC Butterfly 2", result);
}
public void testDevice2716() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL34C", FALLBACK);
    Assert.assertEquals("LG Optimus Fuel", result);
}
public void testDevice2717() throws Exception {
    final String result = DeviceNames.getDeviceName("MS6", FALLBACK);
    Assert.assertEquals("Multilaser Ms6", result);
}
public void testDevice2718() throws Exception {
    final String result = DeviceNames.getDeviceName("MS5", FALLBACK);
    Assert.assertEquals("Trimble Navigation PeopleNet ConnectedTablet", result);
}
public void testDevice2719() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G310HN", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Style", result);
}
public void testDevice2720() throws Exception {
    final String result = DeviceNames.getDeviceName("M865", FALLBACK);
    Assert.assertEquals("Huawei M865", result);
}
public void testDevice2721() throws Exception {
    final String result = DeviceNames.getDeviceName("M860", FALLBACK);
    Assert.assertEquals("Huawei M860", result);
}
public void testDevice2722() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-07E", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE si SH-07E", result);
}
public void testDevice2723() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-07D", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE st SH-07D", result);
}
public void testDevice2724() throws Exception {
    final String result = DeviceNames.getDeviceName("SHT21", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PAD SHT21", result);
}
public void testDevice2725() throws Exception {
    final String result = DeviceNames.getDeviceName("SHT22", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PAD  SHT22", result);
}
public void testDevice2726() throws Exception {
    final String result = DeviceNames.getDeviceName("FS451", FALLBACK);
    Assert.assertEquals("Fly FS451", result);
}
public void testDevice2727() throws Exception {
    final String result = DeviceNames.getDeviceName("FS452", FALLBACK);
    Assert.assertEquals("Fly Nimbus 2", result);
}
public void testDevice2728() throws Exception {
    final String result = DeviceNames.getDeviceName("ZT-701", FALLBACK);
    Assert.assertEquals("AtGames-zooti ZOOTI PAD ZT-701", result);
}
public void testDevice2729() throws Exception {
    final String result = DeviceNames.getDeviceName("PE-UL00", FALLBACK);
    Assert.assertEquals("Huawei PE-UL00", result);
}
public void testDevice2730() throws Exception {
    final String result = DeviceNames.getDeviceName("SOL25", FALLBACK);
    Assert.assertEquals("Sony Xperia ZL2", result);
}
public void testDevice2731() throws Exception {
    final String result = DeviceNames.getDeviceName("SOL24", FALLBACK);
    Assert.assertEquals("Sony Xperia Z Ultra", result);
}
public void testDevice2732() throws Exception {
    final String result = DeviceNames.getDeviceName("SOL26", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3", result);
}
public void testDevice2733() throws Exception {
    final String result = DeviceNames.getDeviceName("T705K", FALLBACK);
    Assert.assertEquals("Positivo T705", result);
}
public void testDevice2734() throws Exception {
    final String result = DeviceNames.getDeviceName("SOL23", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1", result);
}
public void testDevice2735() throws Exception {
    final String result = DeviceNames.getDeviceName("SOL22", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia UL", result);
}
public void testDevice2736() throws Exception {
    final String result = DeviceNames.getDeviceName("WX442", FALLBACK);
    Assert.assertEquals("Motorola Citrus", result);
}
public void testDevice2737() throws Exception {
    final String result = DeviceNames.getDeviceName("WX445", FALLBACK);
    Assert.assertEquals("Motorola Citrus", result);
}
public void testDevice2738() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G920AZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice2739() throws Exception {
    final String result = DeviceNames.getDeviceName("TM101A530L", FALLBACK);
    Assert.assertEquals("Nuvision TM101A530L", result);
}
public void testDevice2740() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9150", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2741() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-E200T", FALLBACK);
    Assert.assertEquals("Hisense E200T", result);
}
public void testDevice2742() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360BT", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win2", result);
}
public void testDevice2743() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2744() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2745() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2746() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2747() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2748() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2749() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2750() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9168I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo", result);
}
public void testDevice2751() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2752() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice2753() throws Exception {
    final String result = DeviceNames.getDeviceName("MD7081", FALLBACK);
    Assert.assertEquals("AMTC MD7081", result);
}
public void testDevice2754() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D681", FALLBACK);
    Assert.assertEquals("LGE G Pro Lite", result);
}
public void testDevice2755() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D680", FALLBACK);
    Assert.assertEquals("LGE G Pro Lite", result);
}
public void testDevice2756() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D683", FALLBACK);
    Assert.assertEquals("LGE G Pro Lite", result);
}
public void testDevice2757() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D682", FALLBACK);
    Assert.assertEquals("LGE G Pro Lite", result);
}
public void testDevice2758() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D685", FALLBACK);
    Assert.assertEquals("LGE G Pro Lite", result);
}
public void testDevice2759() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D684", FALLBACK);
    Assert.assertEquals("LGE G Pro Lite", result);
}
public void testDevice2760() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D686", FALLBACK);
    Assert.assertEquals("LG G Pro Lite Dual", result);
}
public void testDevice2761() throws Exception {
    final String result = DeviceNames.getDeviceName("TC55", FALLBACK);
    Assert.assertEquals("Zebra TC55", result);
}
public void testDevice2762() throws Exception {
    final String result = DeviceNames.getDeviceName("KM-E100", FALLBACK);
    Assert.assertEquals("KT Tech TAKE SUIT", result);
}
public void testDevice2763() throws Exception {
    final String result = DeviceNames.getDeviceName("SAF3011", FALLBACK);
    Assert.assertEquals("Gigabyte SAF3011", result);
}
public void testDevice2764() throws Exception {
    final String result = DeviceNames.getDeviceName("Optimus_San_Remo", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 6030X", result);
}
public void testDevice2765() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-M02-EVA20", FALLBACK);
    Assert.assertEquals("Sharp AQUOS SH-M02-EVA20", result);
}
public void testDevice2766() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530T1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice2767() throws Exception {
    final String result = DeviceNames.getDeviceName("SproutChannelCubby", FALLBACK);
    Assert.assertEquals("Ematic Sprout Channel Cubby", result);
}
public void testDevice2768() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G901F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice2769() throws Exception {
    final String result = DeviceNames.getDeviceName("Zeus", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Play", result);
}
public void testDevice2770() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G5309W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice2771() throws Exception {
    final String result = DeviceNames.getDeviceName("MFLoginPh", FALLBACK);
    Assert.assertEquals("MegaFon MFLoginPh", result);
}
public void testDevice2772() throws Exception {
    final String result = DeviceNames.getDeviceName("FV-FG6", FALLBACK);
    Assert.assertEquals("FaceVsion OC1020A", result);
}
public void testDevice2773() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7560M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace II X", result);
}
public void testDevice2774() throws Exception {
    final String result = DeviceNames.getDeviceName("MT7A", FALLBACK);
    Assert.assertEquals("ZTE V72", result);
}
public void testDevice2775() throws Exception {
    final String result = DeviceNames.getDeviceName("V8602", FALLBACK);
    Assert.assertEquals("ZTE Grand X Quad Lite", result);
}
public void testDevice2776() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D693AR", FALLBACK);
    Assert.assertEquals("LGE G3 Stylus", result);
}
public void testDevice2777() throws Exception {
    final String result = DeviceNames.getDeviceName("Panasonic_P61", FALLBACK);
    Assert.assertEquals("Panasonic P61", result);
}
public void testDevice2778() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-841", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab 8", result);
}
public void testDevice2779() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-840", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab 8", result);
}
public void testDevice2780() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G130HN", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young2", result);
}
public void testDevice2781() throws Exception {
    final String result = DeviceNames.getDeviceName("Motorola_Electrify", FALLBACK);
    Assert.assertEquals("Motorola Electrify", result);
}
public void testDevice2782() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7710", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Xcover2", result);
}
public void testDevice2783() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I337", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice2784() throws Exception {
    final String result = DeviceNames.getDeviceName("E2171MX", FALLBACK);
    Assert.assertEquals("Hisense Sero 7", result);
}
public void testDevice2785() throws Exception {
    final String result = DeviceNames.getDeviceName("ITQ1000", FALLBACK);
    Assert.assertEquals("iRiver WOW Tab+(ITQ1000)", result);
}
public void testDevice2786() throws Exception {
    final String result = DeviceNames.getDeviceName("RIO-L03", FALLBACK);
    Assert.assertEquals("HUAWEI G8", result);
}
public void testDevice2787() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T230NU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 4", result);
}
public void testDevice2788() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T230NT", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice2789() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T230NY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice2790() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U988", FALLBACK);
    Assert.assertEquals("Hisense U988E-2", result);
}
public void testDevice2791() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_E9sx", FALLBACK);
    Assert.assertEquals("HTC One E9s dual sim", result);
}
public void testDevice2792() throws Exception {
    final String result = DeviceNames.getDeviceName("CETAB7ML9", FALLBACK);
    Assert.assertEquals("Haier CETAB7ML9", result);
}
public void testDevice2793() throws Exception {
    final String result = DeviceNames.getDeviceName("MFC_HR_Plus", FALLBACK);
    Assert.assertEquals("Clementoni My First Clempad HR Plus", result);
}
public void testDevice2794() throws Exception {
    final String result = DeviceNames.getDeviceName("L-04C", FALLBACK);
    Assert.assertEquals("LGE Optimus chat", result);
}
public void testDevice2795() throws Exception {
    final String result = DeviceNames.getDeviceName("L-04E", FALLBACK);
    Assert.assertEquals("LGE Optimus G Pro", result);
}
public void testDevice2796() throws Exception {
    final String result = DeviceNames.getDeviceName("L-01D", FALLBACK);
    Assert.assertEquals("LGE Optimus LTE", result);
}
public void testDevice2797() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T807V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2798() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T807T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2799() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T807P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice2800() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42G200", FALLBACK);
    Assert.assertEquals("Hisense LED42G200", result);
}
public void testDevice2801() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00XS", FALLBACK);
    Assert.assertEquals("Asus ZenFone Zoom (ZX551ML)", result);
}
public void testDevice2802() throws Exception {
    final String result = DeviceNames.getDeviceName("DL1010Q", FALLBACK);
    Assert.assertEquals("DigiLand DL1010Q", result);
}
public void testDevice2803() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9235", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Golden", result);
}
public void testDevice2804() throws Exception {
    final String result = DeviceNames.getDeviceName("P330X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) P330X", result);
}
public void testDevice2805() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M110S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice2806() throws Exception {
    final String result = DeviceNames.getDeviceName("LED47K560J3D", FALLBACK);
    Assert.assertEquals("Hisense LED47K560J3D", result);
}
public void testDevice2807() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_4005D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 4005D", result);
}
public void testDevice2808() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7898", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend2", result);
}
public void testDevice2809() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_07FTBF", FALLBACK);
    Assert.assertEquals("Positivo Ypy 07FTBF", result);
}
public void testDevice2810() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-P500", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 10.1", result);
}
public void testDevice2811() throws Exception {
    final String result = DeviceNames.getDeviceName("l5450", FALLBACK);
    Assert.assertEquals("Toshiba L5450ME", result);
}
public void testDevice2812() throws Exception {
    final String result = DeviceNames.getDeviceName("7045Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 7045Y", result);
}
public void testDevice2813() throws Exception {
    final String result = DeviceNames.getDeviceName("R8106", FALLBACK);
    Assert.assertEquals("Oppo R8106", result);
}
public void testDevice2814() throws Exception {
    final String result = DeviceNames.getDeviceName("R8107", FALLBACK);
    Assert.assertEquals("Oppo R5", result);
}
public void testDevice2815() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7310", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice2816() throws Exception {
    final String result = DeviceNames.getDeviceName("N4L", FALLBACK);
    Assert.assertEquals("NUU N4L", result);
}
public void testDevice2817() throws Exception {
    final String result = DeviceNames.getDeviceName("R8109", FALLBACK);
    Assert.assertEquals("Oppo R5", result);
}
public void testDevice2818() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50K360X3D", FALLBACK);
    Assert.assertEquals("Hisense LED50K360X3D", result);
}
public void testDevice2819() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P1000T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice2820() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P1000R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice2821() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-EK-GC100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera", result);
}
public void testDevice2822() throws Exception {
    final String result = DeviceNames.getDeviceName("PMT3017_WI", FALLBACK);
    Assert.assertEquals("Prestigio MultiPad Wize 3017", result);
}
public void testDevice2823() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P1000N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice2824() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P1000L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice2825() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P1000M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice2826() throws Exception {
    final String result = DeviceNames.getDeviceName("8055", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8055", result);
}
public void testDevice2827() throws Exception {
    final String result = DeviceNames.getDeviceName("VS986", FALLBACK);
    Assert.assertEquals("LG G4", result);
}
public void testDevice2828() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M950", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Reverb", result);
}
public void testDevice2829() throws Exception {
    final String result = DeviceNames.getDeviceName("FT103", FALLBACK);
    Assert.assertEquals("Quanta FT103", result);
}
public void testDevice2830() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M820-BST", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Prevail", result);
}
public void testDevice2831() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M290K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Gio", result);
}
public void testDevice2832() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M290S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Gio", result);
}
public void testDevice2833() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6773W42B", FALLBACK);
    Assert.assertEquals("RCA RCT6773W42B", result);
}
public void testDevice2834() throws Exception {
    final String result = DeviceNames.getDeviceName("V9180", FALLBACK);
    Assert.assertEquals("ZTE V9180", result);
}
public void testDevice2835() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X170g", FALLBACK);
    Assert.assertEquals("LGE LG Prime II", result);
}
public void testDevice2836() throws Exception {
    final String result = DeviceNames.getDeviceName("XT557", FALLBACK);
    Assert.assertEquals("Motorola Moto Defy XT", result);
}
public void testDevice2837() throws Exception {
    final String result = DeviceNames.getDeviceName("XT556", FALLBACK);
    Assert.assertEquals("Motorola Moto Defy XT", result);
}
public void testDevice2838() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice2839() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925R7", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice2840() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925R6", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice2841() throws Exception {
    final String result = DeviceNames.getDeviceName("S01-orange", FALLBACK);
    Assert.assertEquals("Fujitsu STYLISTIC S01", result);
}
public void testDevice2842() throws Exception {
    final String result = DeviceNames.getDeviceName("PantechP8010", FALLBACK);
    Assert.assertEquals("Pantech Flex", result);
}
public void testDevice2843() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T959S", FALLBACK);
    Assert.assertEquals("Hisense HS-T959S", result);
}
public void testDevice2844() throws Exception {
    final String result = DeviceNames.getDeviceName("A4C", FALLBACK);
    Assert.assertEquals("ZTE Bouygues Telecom Bs 402", result);
}
public void testDevice2845() throws Exception {
    final String result = DeviceNames.getDeviceName("VP74-Orava", FALLBACK);
    Assert.assertEquals("Vestel VP74", result);
}
public void testDevice2846() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-MS910", FALLBACK);
    Assert.assertEquals("LG Esteem", result);
}
public void testDevice2847() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP712", FALLBACK);
    Assert.assertEquals("Sony Xperia Z4 tablet", result);
}
public void testDevice2848() throws Exception {
    final String result = DeviceNames.getDeviceName("Planet", FALLBACK);
    Assert.assertEquals("Explay Planet", result);
}
public void testDevice2849() throws Exception {
    final String result = DeviceNames.getDeviceName("A44", FALLBACK);
    Assert.assertEquals("Micromax A44", result);
}
public void testDevice2850() throws Exception {
    final String result = DeviceNames.getDeviceName("A45", FALLBACK);
    Assert.assertEquals("Micromax A45", result);
}
public void testDevice2851() throws Exception {
    final String result = DeviceNames.getDeviceName("HIGHWAY", FALLBACK);
    Assert.assertEquals("WIKO HIGHWAY", result);
}
public void testDevice2852() throws Exception {
    final String result = DeviceNames.getDeviceName("C2105", FALLBACK);
    Assert.assertEquals("Sony Xperia L", result);
}
public void testDevice2853() throws Exception {
    final String result = DeviceNames.getDeviceName("C2104", FALLBACK);
    Assert.assertEquals("Sony Xperia L", result);
}
public void testDevice2854() throws Exception {
    final String result = DeviceNames.getDeviceName("C2107", FALLBACK);
    Assert.assertEquals("Infocus C7", result);
}
public void testDevice2855() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-J320D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL-J320D", result);
}
public void testDevice2856() throws Exception {
    final String result = DeviceNames.getDeviceName("K012_2", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 7 (FE7010CG)", result);
}
public void testDevice2857() throws Exception {
    final String result = DeviceNames.getDeviceName("V795(A3S)", FALLBACK);
    Assert.assertEquals("ZTE V795", result);
}
public void testDevice2858() throws Exception {
    final String result = DeviceNames.getDeviceName("P470", FALLBACK);
    Assert.assertEquals("Micromax Canvas tab", result);
}
public void testDevice2859() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR6400L", FALLBACK);
    Assert.assertEquals("HTC Thunderbolt", result);
}
public void testDevice2860() throws Exception {
    final String result = DeviceNames.getDeviceName("Cygnus_mini", FALLBACK);
    Assert.assertEquals("Mobiwire Cygnus mini", result);
}
public void testDevice2861() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G110M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket2", result);
}
public void testDevice2862() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G110H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket2", result);
}
public void testDevice2863() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G110B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket2", result);
}
public void testDevice2864() throws Exception {
    final String result = DeviceNames.getDeviceName("TF10EA2", FALLBACK);
    Assert.assertEquals("ECS TF10EA2", result);
}
public void testDevice2865() throws Exception {
    final String result = DeviceNames.getDeviceName("TR10CD3", FALLBACK);
    Assert.assertEquals("Amplify TR10CD3", result);
}
public void testDevice2866() throws Exception {
    final String result = DeviceNames.getDeviceName("TR10CD2", FALLBACK);
    Assert.assertEquals("MG series Any 303", result);
}
public void testDevice2867() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I527", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega", result);
}
public void testDevice2868() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A820L", FALLBACK);
    Assert.assertEquals("Pantech Vega LTE M", result);
}
public void testDevice2869() throws Exception {
    final String result = DeviceNames.getDeviceName("Z955L", FALLBACK);
    Assert.assertEquals("ZTE Z955L", result);
}
public void testDevice2870() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7602G", FALLBACK);
    Assert.assertEquals("Proscan PLT7602G", result);
}
public void testDevice2871() throws Exception {
    final String result = DeviceNames.getDeviceName("ST700", FALLBACK);
    Assert.assertEquals("SMARTAB ST700", result);
}
public void testDevice2872() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-PHANTOM5", FALLBACK);
    Assert.assertEquals("TECNO-PHANTOM5", result);
}
public void testDevice2873() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D610AR", FALLBACK);
    Assert.assertEquals("LGE G2 MINI", result);
}
public void testDevice2874() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R820", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Admire", result);
}
public void testDevice2875() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D335E", FALLBACK);
    Assert.assertEquals("LGE L Bello", result);
}
public void testDevice2876() throws Exception {
    final String result = DeviceNames.getDeviceName("VS810PP", FALLBACK);
    Assert.assertEquals("LGE F60", result);
}
public void testDevice2877() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P698f", FALLBACK);
    Assert.assertEquals("LGE Optimus Net Dual", result);
}
public void testDevice2878() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8200Q", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Mini Value Edition", result);
}
public void testDevice2879() throws Exception {
    final String result = DeviceNames.getDeviceName("Q4S6IN4G", FALLBACK);
    Assert.assertEquals("Auchan Q4S6IN4G", result);
}
public void testDevice2880() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T970", FALLBACK);
    Assert.assertEquals("Hisense HS-T970", result);
}
public void testDevice2881() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T116NY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 3V 7.0", result);
}
public void testDevice2882() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1575", FALLBACK);
    Assert.assertEquals("Motorola Moto X Style", result);
}
public void testDevice2883() throws Exception {
    final String result = DeviceNames.getDeviceName("E2281SS", FALLBACK);
    Assert.assertEquals("Hisense Sero8", result);
}
public void testDevice2884() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T116NU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3V 7.0", result);
}
public void testDevice2885() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8200N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Mini Value Edition", result);
}
public void testDevice2886() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8200L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Mini", result);
}
public void testDevice2887() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1572", FALLBACK);
    Assert.assertEquals("Motorola Moto X Style", result);
}
public void testDevice2888() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I915", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 10.1", result);
}
public void testDevice2889() throws Exception {
    final String result = DeviceNames.getDeviceName("LED40L288", FALLBACK);
    Assert.assertEquals("Hisense LED40L288", result);
}
public void testDevice2890() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J500N0", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J5", result);
}
public void testDevice2891() throws Exception {
    final String result = DeviceNames.getDeviceName("PH44100", FALLBACK);
    Assert.assertEquals("HTC Evo Design 4G", result);
}
public void testDevice2892() throws Exception {
    final String result = DeviceNames.getDeviceName("T1060B", FALLBACK);
    Assert.assertEquals("Positivo T1060", result);
}
public void testDevice2893() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50K260X3D", FALLBACK);
    Assert.assertEquals("Hisense LED50K260X3D", result);
}
public void testDevice2894() throws Exception {
    final String result = DeviceNames.getDeviceName("TM700A520L", FALLBACK);
    Assert.assertEquals("Nuvision TM700A520L", result);
}
public void testDevice2895() throws Exception {
    final String result = DeviceNames.getDeviceName("SP-5100", FALLBACK);
    Assert.assertEquals("Haier SP-5100", result);
}
public void testDevice2896() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T900X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Pro 12.2", result);
}
public void testDevice2897() throws Exception {
    final String result = DeviceNames.getDeviceName("Comet", FALLBACK);
    Assert.assertEquals("Huawei IDEOS", result);
}
public void testDevice2898() throws Exception {
    final String result = DeviceNames.getDeviceName("V883M", FALLBACK);
    Assert.assertEquals("ZTE LEO M1", result);
}
public void testDevice2899() throws Exception {
    final String result = DeviceNames.getDeviceName("Videocon_V7400", FALLBACK);
    Assert.assertEquals("Huawei T-Mobile Pulse", result);
}
public void testDevice2900() throws Exception {
    final String result = DeviceNames.getDeviceName("J730U", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 730U", result);
}
public void testDevice2901() throws Exception {
    final String result = DeviceNames.getDeviceName("N9130", FALLBACK);
    Assert.assertEquals("ZTE N9130", result);
}
public void testDevice2902() throws Exception {
    final String result = DeviceNames.getDeviceName("V1_Viper_L", FALLBACK);
    Assert.assertEquals("AllView V1 Viper L", result);
}
public void testDevice2903() throws Exception {
    final String result = DeviceNames.getDeviceName("N9132", FALLBACK);
    Assert.assertEquals("ZTE N9132", result);
}
public void testDevice2904() throws Exception {
    final String result = DeviceNames.getDeviceName("V1_Viper_E", FALLBACK);
    Assert.assertEquals("AllView V1 Viper E", result);
}
public void testDevice2905() throws Exception {
    final String result = DeviceNames.getDeviceName("TBDG874", FALLBACK);
    Assert.assertEquals("Zeki TBDG874 Tablet", result);
}
public void testDevice2906() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC6435LRA", FALLBACK);
    Assert.assertEquals("HTC DROID DNA", result);
}
public void testDevice2907() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-05G", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PAD SH-05G", result);
}
public void testDevice2908() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-05F", FALLBACK);
    Assert.assertEquals("Sharp Disney Mobile on docomo SH-05F", result);
}
public void testDevice2909() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-05E", FALLBACK);
    Assert.assertEquals("Sharp SH-05E", result);
}
public void testDevice2910() throws Exception {
    final String result = DeviceNames.getDeviceName("V100MD", FALLBACK);
    Assert.assertEquals("ENVIZEN DIGITAL V100MD", result);
}
public void testDevice2911() throws Exception {
    final String result = DeviceNames.getDeviceName("VP74-Telefunken", FALLBACK);
    Assert.assertEquals("Vestel VP74", result);
}
public void testDevice2912() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9152P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega Plus", result);
}
public void testDevice2913() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3530DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3530DUO", result);
}
public void testDevice2914() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T839", FALLBACK);
    Assert.assertEquals("Samsung Sidekick", result);
}
public void testDevice2915() throws Exception {
    final String result = DeviceNames.getDeviceName("TM75A-V2", FALLBACK);
    Assert.assertEquals("i-Buddie TM75A-V2", result);
}
public void testDevice2916() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H961AN", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice2917() throws Exception {
    final String result = DeviceNames.getDeviceName("A7_Lite", FALLBACK);
    Assert.assertEquals("AllView A7 Lite", result);
}
public void testDevice2918() throws Exception {
    final String result = DeviceNames.getDeviceName("ALE-L23", FALLBACK);
    Assert.assertEquals("Huawei ALE-L23", result);
}
public void testDevice2919() throws Exception {
    final String result = DeviceNames.getDeviceName("ALE-L21", FALLBACK);
    Assert.assertEquals("Huawei ALE-L21", result);
}
public void testDevice2920() throws Exception {
    final String result = DeviceNames.getDeviceName("920TPC", FALLBACK);
    Assert.assertEquals("IView 920TPC", result);
}
public void testDevice2921() throws Exception {
    final String result = DeviceNames.getDeviceName("d-01G", FALLBACK);
    Assert.assertEquals("Huawei d-01G", result);
}
public void testDevice2922() throws Exception {
    final String result = DeviceNames.getDeviceName("NX506J", FALLBACK);
    Assert.assertEquals("ZTE NX506J", result);
}
public void testDevice2923() throws Exception {
    final String result = DeviceNames.getDeviceName("LED46K360X3D", FALLBACK);
    Assert.assertEquals("Hisense LED46K360X3D", result);
}
public void testDevice2924() throws Exception {
    final String result = DeviceNames.getDeviceName("PAD722", FALLBACK);
    Assert.assertEquals("Haier PAD722", result);
}
public void testDevice2925() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D690n", FALLBACK);
    Assert.assertEquals("LGE G3 Stylus", result);
}
public void testDevice2926() throws Exception {
    final String result = DeviceNames.getDeviceName("N855D", FALLBACK);
    Assert.assertEquals("ZTE N855D", result);
}
public void testDevice2927() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-S3H-01", FALLBACK);
    Assert.assertEquals("Sharp LC-S3H-01", result);
}
public void testDevice2928() throws Exception {
    final String result = DeviceNames.getDeviceName("U9500", FALLBACK);
    Assert.assertEquals("Huawei Ascend D", result);
}
public void testDevice2929() throws Exception {
    final String result = DeviceNames.getDeviceName("Boost", FALLBACK);
    Assert.assertEquals("AG Mobile Boost", result);
}
public void testDevice2930() throws Exception {
    final String result = DeviceNames.getDeviceName("P774A", FALLBACK);
    Assert.assertEquals("Anydata HKC P774A", result);
}
public void testDevice2931() throws Exception {
    final String result = DeviceNames.getDeviceName("AM506", FALLBACK);
    Assert.assertEquals("Amgoo AM506", result);
}
public void testDevice2932() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-GI2", FALLBACK);
    Assert.assertEquals("Samsung Galaxy 070", result);
}
public void testDevice2933() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-GI1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Player 4.2", result);
}
public void testDevice2934() throws Exception {
    final String result = DeviceNames.getDeviceName("E1052GP", FALLBACK);
    Assert.assertEquals("LOGICOM E1052GP", result);
}
public void testDevice2935() throws Exception {
    final String result = DeviceNames.getDeviceName("N799D", FALLBACK);
    Assert.assertEquals("ZTE N799D", result);
}
public void testDevice2936() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-i929", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 Duos", result);
}
public void testDevice2937() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-Libra", FALLBACK);
    Assert.assertEquals("ZTE Blade", result);
}
public void testDevice2938() throws Exception {
    final String result = DeviceNames.getDeviceName("TC75", FALLBACK);
    Assert.assertEquals("Zebra Pollux", result);
}
public void testDevice2939() throws Exception {
    final String result = DeviceNames.getDeviceName("HuaweiG510-0100", FALLBACK);
    Assert.assertEquals("Huawei G510", result);
}
public void testDevice2940() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J120M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice2941() throws Exception {
    final String result = DeviceNames.getDeviceName("W6620", FALLBACK);
    Assert.assertEquals("Philips W6620", result);
}
public void testDevice2942() throws Exception {
    final String result = DeviceNames.getDeviceName("X66", FALLBACK);
    Assert.assertEquals("Ashna X66", result);
}
public void testDevice2943() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D375", FALLBACK);
    Assert.assertEquals("LGE LG L80 Single", result);
}
public void testDevice2944() throws Exception {
    final String result = DeviceNames.getDeviceName("dL1", FALLBACK);
    Assert.assertEquals("Panasonic ELUGA", result);
}
public void testDevice2945() throws Exception {
    final String result = DeviceNames.getDeviceName("C600", FALLBACK);
    Assert.assertEquals("QLA C600", result);
}
public void testDevice2946() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D370", FALLBACK);
    Assert.assertEquals("LGE LG L80 Single", result);
}
public void testDevice2947() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D373", FALLBACK);
    Assert.assertEquals("LGE LG L80 Single", result);
}
public void testDevice2948() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G903F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Neo", result);
}
public void testDevice2949() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G903M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Neo", result);
}
public void testDevice2950() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G903W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Neo", result);
}
public void testDevice2951() throws Exception {
    final String result = DeviceNames.getDeviceName("CI", FALLBACK);
    Assert.assertEquals("Cellon CI", result);
}
public void testDevice2952() throws Exception {
    final String result = DeviceNames.getDeviceName("Coolpad8085Q", FALLBACK);
    Assert.assertEquals("Coolpad8085Q", result);
}
public void testDevice2953() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D213", FALLBACK);
    Assert.assertEquals("LGE L50 Sporty", result);
}
public void testDevice2954() throws Exception {
    final String result = DeviceNames.getDeviceName("PowerFive", FALLBACK);
    Assert.assertEquals("HighScreen Power Five", result);
}
public void testDevice2955() throws Exception {
    final String result = DeviceNames.getDeviceName("Droid", FALLBACK);
    Assert.assertEquals("Motorola Droid", result);
}
public void testDevice2956() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT8235G", FALLBACK);
    Assert.assertEquals("PROSCAN PLT8235G Tablet", result);
}
public void testDevice2957() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G530AZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice2958() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-S735C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Discover", result);
}
public void testDevice2959() throws Exception {
    final String result = DeviceNames.getDeviceName("A250", FALLBACK);
    Assert.assertEquals("Micromax CANVAS TURBO", result);
}
public void testDevice2960() throws Exception {
    final String result = DeviceNames.getDeviceName("E2171CA", FALLBACK);
    Assert.assertEquals("Hisense Sero 7", result);
}
public void testDevice2961() throws Exception {
    final String result = DeviceNames.getDeviceName("TC700H", FALLBACK);
    Assert.assertEquals("Zebra Pollux", result);
}
public void testDevice2962() throws Exception {
    final String result = DeviceNames.getDeviceName("Tornado", FALLBACK);
    Assert.assertEquals("Explay Tornado", result);
}
public void testDevice2963() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U966", FALLBACK);
    Assert.assertEquals("Hisense HS-U966", result);
}
public void testDevice2964() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F500K", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice2965() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F500L", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice2966() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U961", FALLBACK);
    Assert.assertEquals("Hisense HS-U961", result);
}
public void testDevice2967() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F500S", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice2968() throws Exception {
    final String result = DeviceNames.getDeviceName("V3", FALLBACK);
    Assert.assertEquals("Haier V3", result);
}
public void testDevice2969() throws Exception {
    final String result = DeviceNames.getDeviceName("V5", FALLBACK);
    Assert.assertEquals("ZTE NE501J", result);
}
public void testDevice2970() throws Exception {
    final String result = DeviceNames.getDeviceName("V7", FALLBACK);
    Assert.assertEquals("Polaroid V7", result);
}
public void testDevice2971() throws Exception {
    final String result = DeviceNames.getDeviceName("V9", FALLBACK);
    Assert.assertEquals("ZTE V9", result);
}
public void testDevice2972() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V480", FALLBACK);
    Assert.assertEquals("LGE G pad 8.0", result);
}
public void testDevice2973() throws Exception {
    final String result = DeviceNames.getDeviceName("i7", FALLBACK);
    Assert.assertEquals("Venturer i7", result);
}
public void testDevice2974() throws Exception {
    final String result = DeviceNames.getDeviceName("Motorola-XT502", FALLBACK);
    Assert.assertEquals("Motorola Quench XT3", result);
}
public void testDevice2975() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P940h", FALLBACK);
    Assert.assertEquals("LGE PRADA 3.0", result);
}
public void testDevice2976() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I317", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note II", result);
}
public void testDevice2977() throws Exception {
    final String result = DeviceNames.getDeviceName("L-06C", FALLBACK);
    Assert.assertEquals("LGE Optimus Pad", result);
}
public void testDevice2978() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_S400", FALLBACK);
    Assert.assertEquals("Positivo YPY S400", result);
}
public void testDevice2979() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V510", FALLBACK);
    Assert.assertEquals("LGE LG G Pad 8.3 Google Play Edition", result);
}
public void testDevice2980() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-S820L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice2981() throws Exception {
    final String result = DeviceNames.getDeviceName("FL7008", FALLBACK);
    Assert.assertEquals("Reliance FL7008", result);
}
public void testDevice2982() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J100MU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice2983() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J100ML", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice2984() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_S", FALLBACK);
    Assert.assertEquals("HTC One S", result);
}
public void testDevice2985() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_V", FALLBACK);
    Assert.assertEquals("HTC One V", result);
}
public void testDevice2986() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_X", FALLBACK);
    Assert.assertEquals("HTC One X", result);
}
public void testDevice2987() throws Exception {
    final String result = DeviceNames.getDeviceName("PE-TL00M", FALLBACK);
    Assert.assertEquals("Huawei PE-TL00M", result);
}
public void testDevice2988() throws Exception {
    final String result = DeviceNames.getDeviceName("AM-H100", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) AM-H100", result);
}
public void testDevice2989() throws Exception {
    final String result = DeviceNames.getDeviceName("Imperium7", FALLBACK);
    Assert.assertEquals("Explay Imperium 7", result);
}
public void testDevice2990() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T959S1", FALLBACK);
    Assert.assertEquals("Hisense HS-T959S1", result);
}
public void testDevice2991() throws Exception {
    final String result = DeviceNames.getDeviceName("Imperium8", FALLBACK);
    Assert.assertEquals("Explay Imperium 8", result);
}
public void testDevice2992() throws Exception {
    final String result = DeviceNames.getDeviceName("VH777", FALLBACK);
    Assert.assertEquals("Hisense VH777", result);
}
public void testDevice2993() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900W8", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice2994() throws Exception {
    final String result = DeviceNames.getDeviceName("T4018", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 3.5", result);
}
public void testDevice2995() throws Exception {
    final String result = DeviceNames.getDeviceName("4009M", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)", result);
}
public void testDevice2996() throws Exception {
    final String result = DeviceNames.getDeviceName("C14100", FALLBACK);
    Assert.assertEquals("KD Interactive Kurio Tab - Extrem", result);
}
public void testDevice2997() throws Exception {
    final String result = DeviceNames.getDeviceName("4009F", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)", result);
}
public void testDevice2998() throws Exception {
    final String result = DeviceNames.getDeviceName("W6360", FALLBACK);
    Assert.assertEquals("Gigabyte W6360", result);
}
public void testDevice2999() throws Exception {
    final String result = DeviceNames.getDeviceName("4009D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)", result);
}
public void testDevice3000() throws Exception {
    final String result = DeviceNames.getDeviceName("4009E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)", result);
}
public void testDevice3001() throws Exception {
    final String result = DeviceNames.getDeviceName("4009X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)", result);
}
public void testDevice3002() throws Exception {
    final String result = DeviceNames.getDeviceName("Arc", FALLBACK);
    Assert.assertEquals("Kobo Arc", result);
}
public void testDevice3003() throws Exception {
    final String result = DeviceNames.getDeviceName("4009S", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)", result);
}
public void testDevice3004() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9210", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice3005() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I717R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice3006() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3450DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3450DUO", result);
}
public void testDevice3007() throws Exception {
    final String result = DeviceNames.getDeviceName("WA978", FALLBACK);
    Assert.assertEquals("SKnetworks WA978", result);
}
public void testDevice3008() throws Exception {
    final String result = DeviceNames.getDeviceName("Commtiva-N700", FALLBACK);
    Assert.assertEquals("Foxconn Commtiva N700", result);
}
public void testDevice3009() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I717D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice3010() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM104SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SoftBank 104SH", result);
}
public void testDevice3011() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I717M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice3012() throws Exception {
    final String result = DeviceNames.getDeviceName("JIMMY", FALLBACK);
    Assert.assertEquals("Wiko JIMMY", result);
}
public void testDevice3013() throws Exception {
    final String result = DeviceNames.getDeviceName("st70408_4_coho", FALLBACK);
    Assert.assertEquals("Trekstor SurfTab xintron i 7.0", result);
}
public void testDevice3014() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920R7", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice3015() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920R6", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice3016() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice3017() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M930", FALLBACK);
    Assert.assertEquals("Samsung Transform Ultra", result);
}
public void testDevice3018() throws Exception {
    final String result = DeviceNames.getDeviceName("Q4T8IN", FALLBACK);
    Assert.assertEquals("Auchan Q4T8IN", result);
}
public void testDevice3019() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G730V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III Mini", result);
}
public void testDevice3020() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J100VPP", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice3021() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_S1033X", FALLBACK);
    Assert.assertEquals("Medion LIFETAB S1033X", result);
}
public void testDevice3022() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T710X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 8.0", result);
}
public void testDevice3023() throws Exception {
    final String result = DeviceNames.getDeviceName("G7-L03", FALLBACK);
    Assert.assertEquals("Huawei G7-L03", result);
}
public void testDevice3024() throws Exception {
    final String result = DeviceNames.getDeviceName("G7-L01", FALLBACK);
    Assert.assertEquals("HUAWEI G7-L01", result);
}
public void testDevice3025() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G750H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega2", result);
}
public void testDevice3026() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P990hN", FALLBACK);
    Assert.assertEquals("LGE Optimus 2X", result);
}
public void testDevice3027() throws Exception {
    final String result = DeviceNames.getDeviceName("NS-P16AT785HD", FALLBACK);
    Assert.assertEquals("Insignia MID7802RA", result);
}
public void testDevice3028() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G750F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega2", result);
}
public void testDevice3029() throws Exception {
    final String result = DeviceNames.getDeviceName("BM180", FALLBACK);
    Assert.assertEquals("Bluebird BM180", result);
}
public void testDevice3030() throws Exception {
    final String result = DeviceNames.getDeviceName("VP73_Hyundai", FALLBACK);
    Assert.assertEquals("Vestel VP73", result);
}
public void testDevice3031() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I200", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Stellar", result);
}
public void testDevice3032() throws Exception {
    final String result = DeviceNames.getDeviceName("WX10K", FALLBACK);
    Assert.assertEquals("Kyocera WX10K", result);
}
public void testDevice3033() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-C660R", FALLBACK);
    Assert.assertEquals("LGE Optimus Pro", result);
}
public void testDevice3034() throws Exception {
    final String result = DeviceNames.getDeviceName("A5_Lite", FALLBACK);
    Assert.assertEquals("AllView A5 Lite", result);
}
public void testDevice3035() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6818", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice3036() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM107SH", FALLBACK);
    Assert.assertEquals("Sharp PANTONE 5 SoftBank 107SH", result);
}
public void testDevice3037() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6810", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice3038() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6812", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice3039() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-C660h", FALLBACK);
    Assert.assertEquals("LGE Optimus Pro", result);
}
public void testDevice3040() throws Exception {
    final String result = DeviceNames.getDeviceName("A5_Easy", FALLBACK);
    Assert.assertEquals("AllView A5 Easy", result);
}
public void testDevice3041() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-S968C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice3042() throws Exception {
    final String result = DeviceNames.getDeviceName("Endeavour101", FALLBACK);
    Assert.assertEquals("Nuvision TM1088", result);
}
public void testDevice3043() throws Exception {
    final String result = DeviceNames.getDeviceName("GT540f", FALLBACK);
    Assert.assertEquals("LGE Swift", result);
}
public void testDevice3044() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F620K", FALLBACK);
    Assert.assertEquals("LGE LG Class", result);
}
public void testDevice3045() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F620L", FALLBACK);
    Assert.assertEquals("LGE LG Class", result);
}
public void testDevice3046() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F620S", FALLBACK);
    Assert.assertEquals("LGE LG Class", result);
}
public void testDevice3047() throws Exception {
    final String result = DeviceNames.getDeviceName("MD7008", FALLBACK);
    Assert.assertEquals("AMTC MD7008", result);
}
public void testDevice3048() throws Exception {
    final String result = DeviceNames.getDeviceName("TE1", FALLBACK);
    Assert.assertEquals("Telefunken Enjoy TE1", result);
}
public void testDevice3049() throws Exception {
    final String result = DeviceNames.getDeviceName("PI2000", FALLBACK);
    Assert.assertEquals("Philips PI2000", result);
}
public void testDevice3050() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-06D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice3051() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-V856", FALLBACK);
    Assert.assertEquals("ZTE-V856", result);
}
public void testDevice3052() throws Exception {
    final String result = DeviceNames.getDeviceName("Z819L", FALLBACK);
    Assert.assertEquals("ZTE Z819L", result);
}
public void testDevice3053() throws Exception {
    final String result = DeviceNames.getDeviceName("TC80RA1", FALLBACK);
    Assert.assertEquals("Ceibal TC80RA1", result);
}
public void testDevice3054() throws Exception {
    final String result = DeviceNames.getDeviceName("TC80RA6", FALLBACK);
    Assert.assertEquals("Ceibal TC80RA6", result);
}
public void testDevice3055() throws Exception {
    final String result = DeviceNames.getDeviceName("I110", FALLBACK);
    Assert.assertEquals("Acer Liquid C1", result);
}
public void testDevice3056() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-KU5400", FALLBACK);
    Assert.assertEquals("LGE PRADA 3.0", result);
}
public void testDevice3057() throws Exception {
    final String result = DeviceNames.getDeviceName("KYL23", FALLBACK);
    Assert.assertEquals("Kyocera miraie", result);
}
public void testDevice3058() throws Exception {
    final String result = DeviceNames.getDeviceName("KYL22", FALLBACK);
    Assert.assertEquals("Kyocera DIGNO", result);
}
public void testDevice3059() throws Exception {
    final String result = DeviceNames.getDeviceName("KYL21", FALLBACK);
    Assert.assertEquals("Kyocera DIGNO S", result);
}
public void testDevice3060() throws Exception {
    final String result = DeviceNames.getDeviceName("A068", FALLBACK);
    Assert.assertEquals("Micromax BOLT", result);
}
public void testDevice3061() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP771", FALLBACK);
    Assert.assertEquals("Sony Xperia Z4 Tablet", result);
}
public void testDevice3062() throws Exception {
    final String result = DeviceNames.getDeviceName("C6606", FALLBACK);
    Assert.assertEquals("Sony Xperia Z", result);
}
public void testDevice3063() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z002", FALLBACK);
    Assert.assertEquals("Asus ZenFone 6 (A601CG)", result);
}
public void testDevice3064() throws Exception {
    final String result = DeviceNames.getDeviceName("C6602", FALLBACK);
    Assert.assertEquals("Sony Xperia Z", result);
}
public void testDevice3065() throws Exception {
    final String result = DeviceNames.getDeviceName("C6603", FALLBACK);
    Assert.assertEquals("Sony Xperia Z", result);
}
public void testDevice3066() throws Exception {
    final String result = DeviceNames.getDeviceName("VM670", FALLBACK);
    Assert.assertEquals("LG Optimus V", result);
}
public void testDevice3067() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6108", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Pop", result);
}
public void testDevice3068() throws Exception {
    final String result = DeviceNames.getDeviceName("MTN-TBW5982C3", FALLBACK);
    Assert.assertEquals("MTN-5982C3", result);
}
public void testDevice3069() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC-P715a", FALLBACK);
    Assert.assertEquals("HTC Puccini", result);
}
public void testDevice3070() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6102", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Duos", result);
}
public void testDevice3071() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E465f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L4 II", result);
}
public void testDevice3072() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E465g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L4 II", result);
}
public void testDevice3073() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-D600", FALLBACK);
    Assert.assertEquals("Samsung Conquer 4G", result);
}
public void testDevice3074() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9301I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Neo", result);
}
public void testDevice3075() throws Exception {
    final String result = DeviceNames.getDeviceName("XP6700", FALLBACK);
    Assert.assertEquals("Sonimtech XP6", result);
}
public void testDevice3076() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9301Q", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Neo", result);
}
public void testDevice3077() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X150", FALLBACK);
    Assert.assertEquals("LGE LG Bello II", result);
}
public void testDevice3078() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3453DUO", FALLBACK);
    Assert.assertEquals("Prestigio WIZE A3", result);
}
public void testDevice3079() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E975", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice3080() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E976", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice3081() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E977", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice3082() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E970", FALLBACK);
    Assert.assertEquals("LG Optimus G", result);
}
public void testDevice3083() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E971", FALLBACK);
    Assert.assertEquals("Optimus G", result);
}
public void testDevice3084() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E973", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice3085() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_0PCV2", FALLBACK);
    Assert.assertEquals("HTC Desire 510", result);
}
public void testDevice3086() throws Exception {
    final String result = DeviceNames.getDeviceName("E2281MX", FALLBACK);
    Assert.assertEquals("Hisense Sero 8", result);
}
public void testDevice3087() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T959", FALLBACK);
    Assert.assertEquals("Hisense HS-T959", result);
}
public void testDevice3088() throws Exception {
    final String result = DeviceNames.getDeviceName("E852GP", FALLBACK);
    Assert.assertEquals("LOGICOM E852GP", result);
}
public void testDevice3089() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1080", FALLBACK);
    Assert.assertEquals("Motorola Droid Ultra", result);
}
public void testDevice3090() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1085", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice3091() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E612f", FALLBACK);
    Assert.assertEquals("LGE Optimus L5", result);
}
public void testDevice3092() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E612g", FALLBACK);
    Assert.assertEquals("LG Optimus L5 Dual", result);
}
public void testDevice3093() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9209", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3094() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9208", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3095() throws Exception {
    final String result = DeviceNames.getDeviceName("FHMD001", FALLBACK);
    Assert.assertEquals("Fujitsu FHMD001", result);
}
public void testDevice3096() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9200", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3097() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3455DUO", FALLBACK);
    Assert.assertEquals("Prestigio Grace X3", result);
}
public void testDevice3098() throws Exception {
    final String result = DeviceNames.getDeviceName("C02BB1", FALLBACK);
    Assert.assertEquals("KDDI Power Up Unit", result);
}
public void testDevice3099() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3100() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3101() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3102() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3103() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3104() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3105() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3106() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T589", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Q", result);
}
public void testDevice3107() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3108() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3109() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3110() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M580BST", FALLBACK);
    Assert.assertEquals("Samsung Replenish", result);
}
public void testDevice3111() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7500", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Plus", result);
}
public void testDevice3112() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7508", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Plus", result);
}
public void testDevice3113() throws Exception {
    final String result = DeviceNames.getDeviceName("F-06F", FALLBACK);
    Assert.assertEquals("Fujitsu F-06F", result);
}
public void testDevice3114() throws Exception {
    final String result = DeviceNames.getDeviceName("TIT-AL00", FALLBACK);
    Assert.assertEquals("HUAWEI Y6 Pro", result);
}
public void testDevice3115() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P6810", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.7", result);
}
public void testDevice3116() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-03C", FALLBACK);
    Assert.assertEquals("Sharp LYNX 3D SH-03C", result);
}
public void testDevice3117() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9287C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3118() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P6210", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0 Plus", result);
}
public void testDevice3119() throws Exception {
    final String result = DeviceNames.getDeviceName("A3-A20", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab 10", result);
}
public void testDevice3120() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-03F", FALLBACK);
    Assert.assertEquals("Sharp SH-03F", result);
}
public void testDevice3121() throws Exception {
    final String result = DeviceNames.getDeviceName("6045B", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)", result);
}
public void testDevice3122() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T310X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 8.0", result);
}
public void testDevice3123() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E510", FALLBACK);
    Assert.assertEquals("LGE Optimus Hub", result);
}
public void testDevice3124() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice3125() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9001", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Plus", result);
}
public void testDevice3126() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9003", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice3127() throws Exception {
    final String result = DeviceNames.getDeviceName("LGMS500", FALLBACK);
    Assert.assertEquals("LG Optimus F6", result);
}
public void testDevice3128() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D620u", FALLBACK);
    Assert.assertEquals("HTC Desire 620 dual sim", result);
}
public void testDevice3129() throws Exception {
    final String result = DeviceNames.getDeviceName("EGS102", FALLBACK);
    Assert.assertEquals("Anydata ematic EGS102", result);
}
public void testDevice3130() throws Exception {
    final String result = DeviceNames.getDeviceName("M821", FALLBACK);
    Assert.assertEquals("Hisense M821", result);
}
public void testDevice3131() throws Exception {
    final String result = DeviceNames.getDeviceName("M823", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) n1 max", result);
}
public void testDevice3132() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D620h", FALLBACK);
    Assert.assertEquals("HTC Desire 620G dual sim", result);
}
public void testDevice3133() throws Exception {
    final String result = DeviceNames.getDeviceName("Viva_i10HD", FALLBACK);
    Assert.assertEquals("AllView Viva i10HD", result);
}
public void testDevice3134() throws Exception {
    final String result = DeviceNames.getDeviceName("EGS109", FALLBACK);
    Assert.assertEquals("EMATICEGS109", result);
}
public void testDevice3135() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B5510B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Pro", result);
}
public void testDevice3136() throws Exception {
    final String result = DeviceNames.getDeviceName("Matrix", FALLBACK);
    Assert.assertEquals("Mobicell Matrix", result);
}
public void testDevice3137() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B5510L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Pro", result);
}
public void testDevice3138() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G386T1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Avant", result);
}
public void testDevice3139() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_S_4G", FALLBACK);
    Assert.assertEquals("Samsung Nexus S 4G", result);
}
public void testDevice3140() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7105L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice3141() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7105H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice3142() throws Exception {
    final String result = DeviceNames.getDeviceName("ST26a", FALLBACK);
    Assert.assertEquals("Sony Xperia J", result);
}
public void testDevice3143() throws Exception {
    final String result = DeviceNames.getDeviceName("WA-U420D", FALLBACK);
    Assert.assertEquals("Welgate WA-U420D", result);
}
public void testDevice3144() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM102SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SoftBank 102SH", result);
}
public void testDevice3145() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360FY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice3146() throws Exception {
    final String result = DeviceNames.getDeviceName("S450", FALLBACK);
    Assert.assertEquals("Positivo S450", result);
}
public void testDevice3147() throws Exception {
    final String result = DeviceNames.getDeviceName("PMT7287C3G", FALLBACK);
    Assert.assertEquals("Prestigio PMT7287C3G", result);
}
public void testDevice3148() throws Exception {
    final String result = DeviceNames.getDeviceName("SH80F", FALLBACK);
    Assert.assertEquals("Sharp SH80F", result);
}
public void testDevice3149() throws Exception {
    final String result = DeviceNames.getDeviceName("M5_lite", FALLBACK);
    Assert.assertEquals("Gionee M5 Lite", result);
}
public void testDevice3150() throws Exception {
    final String result = DeviceNames.getDeviceName("MY16ADA", FALLBACK);
    Assert.assertEquals("Honda Accord", result);
}
public void testDevice3151() throws Exception {
    final String result = DeviceNames.getDeviceName("EG98", FALLBACK);
    Assert.assertEquals("Hisense EG98", result);
}
public void testDevice3152() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire", FALLBACK);
    Assert.assertEquals("HTC Desire", result);
}
public void testDevice3153() throws Exception {
    final String result = DeviceNames.getDeviceName("Panasonic_dL1", FALLBACK);
    Assert.assertEquals("Panasonic ELUGA dL1", result);
}
public void testDevice3154() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9508C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice3155() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C115M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy K Zoom", result);
}
public void testDevice3156() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C115L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy K Zoom", result);
}
public void testDevice3157() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9508V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice3158() throws Exception {
    final String result = DeviceNames.getDeviceName("HUAWEI", FALLBACK);
    Assert.assertEquals("HUAWEI GX8", result);
}
public void testDevice3159() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-VM696", FALLBACK);
    Assert.assertEquals("LG Optimus Elite", result);
}
public void testDevice3160() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C115W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy K Zoom", result);
}
public void testDevice3161() throws Exception {
    final String result = DeviceNames.getDeviceName("G526-L11", FALLBACK);
    Assert.assertEquals("Huawei G526", result);
}
public void testDevice3162() throws Exception {
    final String result = DeviceNames.getDeviceName("D2206", FALLBACK);
    Assert.assertEquals("Sony Xperia E3", result);
}
public void testDevice3163() throws Exception {
    final String result = DeviceNames.getDeviceName("D2203", FALLBACK);
    Assert.assertEquals("Sony Xperia E3", result);
}
public void testDevice3164() throws Exception {
    final String result = DeviceNames.getDeviceName("CP-DX650", FALLBACK);
    Assert.assertEquals("Cisco CP-DX650", result);
}
public void testDevice3165() throws Exception {
    final String result = DeviceNames.getDeviceName("CER2", FALLBACK);
    Assert.assertEquals("Sanyo CER2", result);
}
public void testDevice3166() throws Exception {
    final String result = DeviceNames.getDeviceName("CER3", FALLBACK);
    Assert.assertEquals("Sanyo CER3", result);
}
public void testDevice3167() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D393", FALLBACK);
    Assert.assertEquals("LGE F60", result);
}
public void testDevice3168() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D392", FALLBACK);
    Assert.assertEquals("LGE F60", result);
}
public void testDevice3169() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D390", FALLBACK);
    Assert.assertEquals("LGE F60", result);
}
public void testDevice3170() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5503T", FALLBACK);
    Assert.assertEquals("Samsung Europa", result);
}
public void testDevice3171() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1528O", FALLBACK);
    Assert.assertEquals("Motorola Moto E", result);
}
public void testDevice3172() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T550X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice3173() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_V1", FALLBACK);
    Assert.assertEquals("HTC Desire 310", result);
}
public void testDevice3174() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M486W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice3175() throws Exception {
    final String result = DeviceNames.getDeviceName("M8402", FALLBACK);
    Assert.assertEquals("ZTE M8402", result);
}
public void testDevice3176() throws Exception {
    final String result = DeviceNames.getDeviceName("M210", FALLBACK);
    Assert.assertEquals("Infocus M210", result);
}
public void testDevice3177() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U800", FALLBACK);
    Assert.assertEquals("Hisense U800E-1", result);
}
public void testDevice3178() throws Exception {
    final String result = DeviceNames.getDeviceName("A500", FALLBACK);
    Assert.assertEquals("Acer Picasso", result);
}
public void testDevice3179() throws Exception {
    final String result = DeviceNames.getDeviceName("A501", FALLBACK);
    Assert.assertEquals("Acer Picasso", result);
}
public void testDevice3180() throws Exception {
    final String result = DeviceNames.getDeviceName("TrioStealth-7", FALLBACK);
    Assert.assertEquals("MachSpeed TrioStealth-7", result);
}
public void testDevice3181() throws Exception {
    final String result = DeviceNames.getDeviceName("N-07D", FALLBACK);
    Assert.assertEquals("NEC MEDIAS X N-07D", result);
}
public void testDevice3182() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A910L", FALLBACK);
    Assert.assertEquals("Pantech IM-A910L", result);
}
public void testDevice3183() throws Exception {
    final String result = DeviceNames.getDeviceName("C6530N", FALLBACK);
    Assert.assertEquals("Kyocera Hydro Life", result);
}
public void testDevice3184() throws Exception {
    final String result = DeviceNames.getDeviceName("VivaH8LTE", FALLBACK);
    Assert.assertEquals("AllView Viva H8 LTE", result);
}
public void testDevice3185() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D120AR", FALLBACK);
    Assert.assertEquals("LGE L30 Sporty", result);
}
public void testDevice3186() throws Exception {
    final String result = DeviceNames.getDeviceName("LT15a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia arc", result);
}
public void testDevice3187() throws Exception {
    final String result = DeviceNames.getDeviceName("LT15i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia arc", result);
}
public void testDevice3188() throws Exception {
    final String result = DeviceNames.getDeviceName("PGN511", FALLBACK);
    Assert.assertEquals("Condor PGN511", result);
}
public void testDevice3189() throws Exception {
    final String result = DeviceNames.getDeviceName("MOTWX435KT", FALLBACK);
    Assert.assertEquals("Motorola Triumph", result);
}
public void testDevice3190() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T399", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Light", result);
}
public void testDevice3191() throws Exception {
    final String result = DeviceNames.getDeviceName("S504", FALLBACK);
    Assert.assertEquals("Logicom S504", result);
}
public void testDevice3192() throws Exception {
    final String result = DeviceNames.getDeviceName("SH940C-LN", FALLBACK);
    Assert.assertEquals("LinkNet Smart Box HD", result);
}
public void testDevice3193() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_VLE_U", FALLBACK);
    Assert.assertEquals("HTC One S", result);
}
public void testDevice3194() throws Exception {
    final String result = DeviceNames.getDeviceName("2014812", FALLBACK);
    Assert.assertEquals("Xiaomi HM 2LTE-CT", result);
}
public void testDevice3195() throws Exception {
    final String result = DeviceNames.getDeviceName("2014811", FALLBACK);
    Assert.assertEquals("Xiaomi HM 2LTE-CU", result);
}
public void testDevice3196() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG936D", FALLBACK);
    Assert.assertEquals("EG936D Hisense", result);
}
public void testDevice3197() throws Exception {
    final String result = DeviceNames.getDeviceName("2014817", FALLBACK);
    Assert.assertEquals("Xiaomi HM 2LTE-SA", result);
}
public void testDevice3198() throws Exception {
    final String result = DeviceNames.getDeviceName("2014819", FALLBACK);
    Assert.assertEquals("Xiaomi HM 2LTE-BR", result);
}
public void testDevice3199() throws Exception {
    final String result = DeviceNames.getDeviceName("2014818", FALLBACK);
    Assert.assertEquals("Xiaomi HM 2LTE-IN", result);
}
public void testDevice3200() throws Exception {
    final String result = DeviceNames.getDeviceName("VT785P2-Celcus", FALLBACK);
    Assert.assertEquals("Vestel VT785P2", result);
}
public void testDevice3201() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3608", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice3202() throws Exception {
    final String result = DeviceNames.getDeviceName("MD7053G", FALLBACK);
    Assert.assertEquals("Kennex MD7053G", result);
}
public void testDevice3203() throws Exception {
    final String result = DeviceNames.getDeviceName("Event", FALLBACK);
    Assert.assertEquals("Event", result);
}
public void testDevice3204() throws Exception {
    final String result = DeviceNames.getDeviceName("ME301T", FALLBACK);
    Assert.assertEquals("ASUS MeMO Pad Smart 10", result);
}
public void testDevice3205() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9128", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice3206() throws Exception {
    final String result = DeviceNames.getDeviceName("301F", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS A SoftBank 301F", result);
}
public void testDevice3207() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3589W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Lite", result);
}
public void testDevice3208() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9000Q", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice3209() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A910S", FALLBACK);
    Assert.assertEquals("Pantech IM-A910S", result);
}
public void testDevice3210() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T889V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice3211() throws Exception {
    final String result = DeviceNames.getDeviceName("HERO_X", FALLBACK);
    Assert.assertEquals("Mobicell HERO X", result);
}
public void testDevice3212() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8550E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win", result);
}
public void testDevice3213() throws Exception {
    final String result = DeviceNames.getDeviceName("MB300", FALLBACK);
    Assert.assertEquals("Motorola Backflip", result);
}
public void testDevice3214() throws Exception {
    final String result = DeviceNames.getDeviceName("MID8065", FALLBACK);
    Assert.assertEquals("Anydata Coby MID8065", result);
}
public void testDevice3215() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5302B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket", result);
}
public void testDevice3216() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3509I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend3", result);
}
public void testDevice3217() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-K410", FALLBACK);
    Assert.assertEquals("LGE LG K9", result);
}
public void testDevice3218() throws Exception {
    final String result = DeviceNames.getDeviceName("eye3", FALLBACK);
    Assert.assertEquals("HKT eye3", result);
}
public void testDevice3219() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM003SH", FALLBACK);
    Assert.assertEquals("Sharp GALAPAGOS SoftBank 003SH", result);
}
public void testDevice3220() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-BLADE", FALLBACK);
    Assert.assertEquals("ZTE-BLADE", result);
}
public void testDevice3221() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I879E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo+", result);
}
public void testDevice3222() throws Exception {
    final String result = DeviceNames.getDeviceName("MH-CHANNELS", FALLBACK);
    Assert.assertEquals("Mohu MH-CHANNELS", result);
}
public void testDevice3223() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M910", FALLBACK);
    Assert.assertEquals("Samsung VinsQ(M910)", result);
}
public void testDevice3224() throws Exception {
    final String result = DeviceNames.getDeviceName("LT30at", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia T", result);
}
public void testDevice3225() throws Exception {
    final String result = DeviceNames.getDeviceName("8DTB38", FALLBACK);
    Assert.assertEquals("Hipstreet Electron", result);
}
public void testDevice3226() throws Exception {
    final String result = DeviceNames.getDeviceName("Telenor_Smart", FALLBACK);
    Assert.assertEquals("Telenor Smart", result);
}
public void testDevice3227() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65XT900G3DU", FALLBACK);
    Assert.assertEquals("Hisense LED65XT900G3DU", result);
}
public void testDevice3228() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D390AR", FALLBACK);
    Assert.assertEquals("LGE F60", result);
}
public void testDevice3229() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-L710T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice3230() throws Exception {
    final String result = DeviceNames.getDeviceName("NX007HD", FALLBACK);
    Assert.assertEquals("Anydata Nextbook NX007HD Tablet", result);
}
public void testDevice3231() throws Exception {
    final String result = DeviceNames.getDeviceName("S3T10IN3G", FALLBACK);
    Assert.assertEquals("Auchan S3T10IN3G", result);
}
public void testDevice3232() throws Exception {
    final String result = DeviceNames.getDeviceName("403HW", FALLBACK);
    Assert.assertEquals("HUAWEI MediaPad M1 8.0", result);
}
public void testDevice3233() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Butterfly_s_901s", FALLBACK);
    Assert.assertEquals("HTC Butterfly S", result);
}
public void testDevice3234() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50K380U", FALLBACK);
    Assert.assertEquals("Hisense LED50K380U", result);
}
public void testDevice3235() throws Exception {
    final String result = DeviceNames.getDeviceName("VT785P2-Vestel", FALLBACK);
    Assert.assertEquals("Vestel VT785P2", result);
}
public void testDevice3236() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F350S", FALLBACK);
    Assert.assertEquals("LGE G Pro2", result);
}
public void testDevice3237() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F350K", FALLBACK);
    Assert.assertEquals("LGE G Pro2", result);
}
public void testDevice3238() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F350L", FALLBACK);
    Assert.assertEquals("LGE G Pro2", result);
}
public void testDevice3239() throws Exception {
    final String result = DeviceNames.getDeviceName("PTL21", FALLBACK);
    Assert.assertEquals("Pantech PTL21", result);
}
public void testDevice3240() throws Exception {
    final String result = DeviceNames.getDeviceName("A87", FALLBACK);
    Assert.assertEquals("Micromax A87", result);
}
public void testDevice3241() throws Exception {
    final String result = DeviceNames.getDeviceName("A84", FALLBACK);
    Assert.assertEquals("Micromax A84", result);
}
public void testDevice3242() throws Exception {
    final String result = DeviceNames.getDeviceName("A88", FALLBACK);
    Assert.assertEquals("Micromax A88", result);
}
public void testDevice3243() throws Exception {
    final String result = DeviceNames.getDeviceName("A89", FALLBACK);
    Assert.assertEquals("Micromax A89", result);
}
public void testDevice3244() throws Exception {
    final String result = DeviceNames.getDeviceName("MS50", FALLBACK);
    Assert.assertEquals("Multilaser MS50", result);
}
public void testDevice3245() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H788SG", FALLBACK);
    Assert.assertEquals("LGE LG AKA", result);
}
public void testDevice3246() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT9606G", FALLBACK);
    Assert.assertEquals("Proscan PLT9606G", result);
}
public void testDevice3247() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-P709", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 5.8", result);
}
public void testDevice3248() throws Exception {
    final String result = DeviceNames.getDeviceName("DA222HQLA", FALLBACK);
    Assert.assertEquals("Acer DA222HQLA", result);
}
public void testDevice3249() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D526h", FALLBACK);
    Assert.assertEquals("HTC Desire 526G+ dual sim", result);
}
public void testDevice3250() throws Exception {
    final String result = DeviceNames.getDeviceName("C6916", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1S", result);
}
public void testDevice3251() throws Exception {
    final String result = DeviceNames.getDeviceName("6045Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)", result);
}
public void testDevice3252() throws Exception {
    final String result = DeviceNames.getDeviceName("Q.3778", FALLBACK);
    Assert.assertEquals("Qilive Q.3778", result);
}
public void testDevice3253() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_M8", FALLBACK);
    Assert.assertEquals("HTC One M8", result);
}
public void testDevice3254() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_M9", FALLBACK);
    Assert.assertEquals("HTC One M9", result);
}
public void testDevice3255() throws Exception {
    final String result = DeviceNames.getDeviceName("6045I", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)", result);
}
public void testDevice3256() throws Exception {
    final String result = DeviceNames.getDeviceName("6045K", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)", result);
}
public void testDevice3257() throws Exception {
    final String result = DeviceNames.getDeviceName("6045F", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)", result);
}
public void testDevice3258() throws Exception {
    final String result = DeviceNames.getDeviceName("LGV32", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice3259() throws Exception {
    final String result = DeviceNames.getDeviceName("LGV31", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice3260() throws Exception {
    final String result = DeviceNames.getDeviceName("Tornado3G", FALLBACK);
    Assert.assertEquals("Explay Tornado 3G", result);
}
public void testDevice3261() throws Exception {
    final String result = DeviceNames.getDeviceName("AZ210A", FALLBACK);
    Assert.assertEquals("Intel Orange San Diego", result);
}
public void testDevice3262() throws Exception {
    final String result = DeviceNames.getDeviceName("AZ210B", FALLBACK);
    Assert.assertEquals("Intel Orange avec Intel Inside", result);
}
public void testDevice3263() throws Exception {
    final String result = DeviceNames.getDeviceName("PRO9D", FALLBACK);
    Assert.assertEquals("Prestige PRO9D", result);
}
public void testDevice3264() throws Exception {
    final String result = DeviceNames.getDeviceName("IMD501", FALLBACK);
    Assert.assertEquals("Enspert CINK KING", result);
}
public void testDevice3265() throws Exception {
    final String result = DeviceNames.getDeviceName("PC-TS708T1W", FALLBACK);
    Assert.assertEquals("NEC PC-708T1W", result);
}
public void testDevice3266() throws Exception {
    final String result = DeviceNames.getDeviceName("U966", FALLBACK);
    Assert.assertEquals("Hisense U966", result);
}
public void testDevice3267() throws Exception {
    final String result = DeviceNames.getDeviceName("LCD-V3A", FALLBACK);
    Assert.assertEquals("Sharp LCD-V3A", result);
}
public void testDevice3268() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice3269() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P875", FALLBACK);
    Assert.assertEquals("LGE Optimus F5", result);
}
public void testDevice3270() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P870", FALLBACK);
    Assert.assertEquals("LGE Optimus  LTE", result);
}
public void testDevice3271() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B9120", FALLBACK);
    Assert.assertEquals("Samsung Absolute", result);
}
public void testDevice3272() throws Exception {
    final String result = DeviceNames.getDeviceName("W2", FALLBACK);
    Assert.assertEquals("LT W2", result);
}
public void testDevice3273() throws Exception {
    final String result = DeviceNames.getDeviceName("Z753G", FALLBACK);
    Assert.assertEquals("ZTE Z753G", result);
}
public void testDevice3274() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E467f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L4 II Dual", result);
}
public void testDevice3275() throws Exception {
    final String result = DeviceNames.getDeviceName("LCD-LX560A", FALLBACK);
    Assert.assertEquals("Sharp LCD-LX560A", result);
}
public void testDevice3276() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E610v", FALLBACK);
    Assert.assertEquals("LGE Optimus L5", result);
}
public void testDevice3277() throws Exception {
    final String result = DeviceNames.getDeviceName("LenovoA3300-HV", FALLBACK);
    Assert.assertEquals("Lenovo A3300", result);
}
public void testDevice3278() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D310n", FALLBACK);
    Assert.assertEquals("HTC Desire 310", result);
}
public void testDevice3279() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-KH5200", FALLBACK);
    Assert.assertEquals("LGE Eve", result);
}
public void testDevice3280() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_5020D_Orange", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 5020D", result);
}
public void testDevice3281() throws Exception {
    final String result = DeviceNames.getDeviceName("Aero1021/P1021HCBA4C1VXX", FALLBACK);
    Assert.assertEquals("Gigabyte TM105A", result);
}
public void testDevice3282() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7898I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend2", result);
}
public void testDevice3283() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N7500Q", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Neo", result);
}
public void testDevice3284() throws Exception {
    final String result = DeviceNames.getDeviceName("A51kc", FALLBACK);
    Assert.assertEquals("Oppo A51kc", result);
}
public void testDevice3285() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7566", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S duos", result);
}
public void testDevice3286() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7562", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Duos", result);
}
public void testDevice3287() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7560", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace2 X", result);
}
public void testDevice3288() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E510g", FALLBACK);
    Assert.assertEquals("LGE Optimus Hub", result);
}
public void testDevice3289() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E510f", FALLBACK);
    Assert.assertEquals("LGE Optimus Hub", result);
}
public void testDevice3290() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7568", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Duos", result);
}
public void testDevice3291() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_E10320", FALLBACK);
    Assert.assertEquals("Medion LIFETAB E10320", result);
}
public void testDevice3292() throws Exception {
    final String result = DeviceNames.getDeviceName("F-04E", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS V F-04E", result);
}
public void testDevice3293() throws Exception {
    final String result = DeviceNames.getDeviceName("F-04F", FALLBACK);
    Assert.assertEquals("Fujitsu F-04F", result);
}
public void testDevice3294() throws Exception {
    final String result = DeviceNames.getDeviceName("F-04G", FALLBACK);
    Assert.assertEquals("Fujitsu F-04G", result);
}
public void testDevice3295() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-01H", FALLBACK);
    Assert.assertEquals("Sharp AQUOS ZETA SH-01H", result);
}
public void testDevice3296() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A880S", FALLBACK);
    Assert.assertEquals("Pantech IM-A880S", result);
}
public void testDevice3297() throws Exception {
    final String result = DeviceNames.getDeviceName("OWN-I62S", FALLBACK);
    Assert.assertEquals("Entel OWN I62S", result);
}
public void testDevice3298() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-01G", FALLBACK);
    Assert.assertEquals("Sharp AQUOS ZETA SH-01G", result);
}
public void testDevice3299() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-01F", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE ZETA  SH-01F", result);
}
public void testDevice3300() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-01E", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE si SH-01E", result);
}
public void testDevice3301() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-01D", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SH-01D", result);
}
public void testDevice3302() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LU5400", FALLBACK);
    Assert.assertEquals("LGE PRADA 3.0", result);
}
public void testDevice3303() throws Exception {
    final String result = DeviceNames.getDeviceName("IF195a", FALLBACK);
    Assert.assertEquals("InFocus Big Tab", result);
}
public void testDevice3304() throws Exception {
    final String result = DeviceNames.getDeviceName("eH811", FALLBACK);
    Assert.assertEquals("Huawei eH811", result);
}
public void testDevice3305() throws Exception {
    final String result = DeviceNames.getDeviceName("X300", FALLBACK);
    Assert.assertEquals("Aikun RX300", result);
}
public void testDevice3306() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J700H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J7", result);
}
public void testDevice3307() throws Exception {
    final String result = DeviceNames.getDeviceName("Z730", FALLBACK);
    Assert.assertEquals("ZTE Z730", result);
}
public void testDevice3308() throws Exception {
    final String result = DeviceNames.getDeviceName("Che1-CL10", FALLBACK);
    Assert.assertEquals("Huawei Che1-CL10", result);
}
public void testDevice3309() throws Exception {
    final String result = DeviceNames.getDeviceName("P3S", FALLBACK);
    Assert.assertEquals("Gionee P3S", result);
}
public void testDevice3310() throws Exception {
    final String result = DeviceNames.getDeviceName("XT0000", FALLBACK);
    Assert.assertEquals("Motorola MOTO E", result);
}
public void testDevice3311() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC-X315E", FALLBACK);
    Assert.assertEquals("HTC Sensation XL with Beats Audio X315e", result);
}
public void testDevice3312() throws Exception {
    final String result = DeviceNames.getDeviceName("LTB-HS", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice3313() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-GC200", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera 2", result);
}
public void testDevice3314() throws Exception {
    final String result = DeviceNames.getDeviceName("1107", FALLBACK);
    Assert.assertEquals("Oppo 1107", result);
}
public void testDevice3315() throws Exception {
    final String result = DeviceNames.getDeviceName("1105", FALLBACK);
    Assert.assertEquals("Oppo 1105", result);
}
public void testDevice3316() throws Exception {
    final String result = DeviceNames.getDeviceName("PMT3009_Wi_C", FALLBACK);
    Assert.assertEquals("Prestigio MultiPad Wize 3009", result);
}
public void testDevice3317() throws Exception {
    final String result = DeviceNames.getDeviceName("1100", FALLBACK);
    Assert.assertEquals("Oppo 1100", result);
}
public void testDevice3318() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I905", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice3319() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I679", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3", result);
}
public void testDevice3320() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H788n", FALLBACK);
    Assert.assertEquals("LGE LG AKA", result);
}
public void testDevice3321() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B5512B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Pro Duos", result);
}
public void testDevice3322() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65XT900X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED65XT900X3DU", result);
}
public void testDevice3323() throws Exception {
    final String result = DeviceNames.getDeviceName("MID4X10", FALLBACK);
    Assert.assertEquals("Polaroid MID4X10", result);
}
public void testDevice3324() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D625", FALLBACK);
    Assert.assertEquals("LGE G2 mini 4G LTE", result);
}
public void testDevice3325() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D175f", FALLBACK);
    Assert.assertEquals("LGE Optimus L40", result);
}
public void testDevice3326() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D620", FALLBACK);
    Assert.assertEquals("LG G2 Mini", result);
}
public void testDevice3327() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL22", FALLBACK);
    Assert.assertEquals("LGE LGL22", result);
}
public void testDevice3328() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL23", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice3329() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_6P", FALLBACK);
    Assert.assertEquals("Nexus 6P", result);
}
public void testDevice3330() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL21", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice3331() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL24", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice3332() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3333() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3334() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3335() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3336() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3337() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3338() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3339() throws Exception {
    final String result = DeviceNames.getDeviceName("G526-L33", FALLBACK);
    Assert.assertEquals("Huawei G526", result);
}
public void testDevice3340() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3341() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-L300", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Victory", result);
}
public void testDevice3342() throws Exception {
    final String result = DeviceNames.getDeviceName("NX700QC", FALLBACK);
    Assert.assertEquals("Nextbook NX700QC", result);
}
public void testDevice3343() throws Exception {
    final String result = DeviceNames.getDeviceName("U20a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia X10 mini pro", result);
}
public void testDevice3344() throws Exception {
    final String result = DeviceNames.getDeviceName("U20i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia X10 Mini Pro", result);
}
public void testDevice3345() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5830i", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3346() throws Exception {
    final String result = DeviceNames.getDeviceName("Glow", FALLBACK);
    Assert.assertEquals("Laiq Glow", result);
}
public void testDevice3347() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT9649G", FALLBACK);
    Assert.assertEquals("Proscan PLT9649G", result);
}
public void testDevice3348() throws Exception {
    final String result = DeviceNames.getDeviceName("X2_Soul_Xtreme", FALLBACK);
    Assert.assertEquals("AllView X2 Soul Xtreme", result);
}
public void testDevice3349() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U820", FALLBACK);
    Assert.assertEquals("Hisense HS-U820", result);
}
public void testDevice3350() throws Exception {
    final String result = DeviceNames.getDeviceName("London", FALLBACK);
    Assert.assertEquals("Marshall London", result);
}
public void testDevice3351() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6203W46L", FALLBACK);
    Assert.assertEquals("RCA Pro10 Edition II", result);
}
public void testDevice3352() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4507", FALLBACK);
    Assert.assertEquals("Fly Dune 3", result);
}
public void testDevice3353() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E160S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice3354() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4509", FALLBACK);
    Assert.assertEquals("Fly IQ4509", result);
}
public void testDevice3355() throws Exception {
    final String result = DeviceNames.getDeviceName("N-05E", FALLBACK);
    Assert.assertEquals("NEC MEDIAS W N-05E", result);
}
public void testDevice3356() throws Exception {
    final String result = DeviceNames.getDeviceName("N-05D", FALLBACK);
    Assert.assertEquals("NEC MEDIAS ES N-05D", result);
}
public void testDevice3357() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_985", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 985", result);
}
public void testDevice3358() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U929", FALLBACK);
    Assert.assertEquals("Hisense HS-U929", result);
}
public void testDevice3359() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E160L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice3360() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E160K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice3361() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC331ZLVWPP", FALLBACK);
    Assert.assertEquals("HTCDesire612VZW", result);
}
public void testDevice3362() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I467", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 8", result);
}
public void testDevice3363() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LS720", FALLBACK);
    Assert.assertEquals("LG Optimus F3", result);
}
public void testDevice3364() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite7Q", FALLBACK);
    Assert.assertEquals("Prestige ELITE7Q", result);
}
public void testDevice3365() throws Exception {
    final String result = DeviceNames.getDeviceName("S51SE", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia mini", result);
}
public void testDevice3366() throws Exception {
    final String result = DeviceNames.getDeviceName("Speedsurfer", FALLBACK);
    Assert.assertEquals("Huawei G535-L11", result);
}
public void testDevice3367() throws Exception {
    final String result = DeviceNames.getDeviceName("ELITE9Q", FALLBACK);
    Assert.assertEquals("Prestige ELITE9Q", result);
}
public void testDevice3368() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G8508S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice3369() throws Exception {
    final String result = DeviceNames.getDeviceName("Zenith", FALLBACK);
    Assert.assertEquals("AG Mobile Zenith", result);
}
public void testDevice3370() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50K610X3D", FALLBACK);
    Assert.assertEquals("Hisense LED50K610X3D", result);
}
public void testDevice3371() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D722J", FALLBACK);
    Assert.assertEquals("LGE G3 Beat", result);
}
public void testDevice3372() throws Exception {
    final String result = DeviceNames.getDeviceName("CHC-U23", FALLBACK);
    Assert.assertEquals("Huawei CHC-U23", result);
}
public void testDevice3373() throws Exception {
    final String result = DeviceNames.getDeviceName("Clempad_HR_XL", FALLBACK);
    Assert.assertEquals("Clementoni Clempad 5.0 XL", result);
}
public void testDevice3374() throws Exception {
    final String result = DeviceNames.getDeviceName("G3SMNTA22", FALLBACK);
    Assert.assertEquals("AOC-A2272PW4T", result);
}
public void testDevice3375() throws Exception {
    final String result = DeviceNames.getDeviceName("Y635-L21", FALLBACK);
    Assert.assertEquals("Huawei Y635-L21", result);
}
public void testDevice3376() throws Exception {
    final String result = DeviceNames.getDeviceName("G3SMNTA24", FALLBACK);
    Assert.assertEquals("AOC-A2472PW4T", result);
}
public void testDevice3377() throws Exception {
    final String result = DeviceNames.getDeviceName("U8220PLUS", FALLBACK);
    Assert.assertEquals("Huawei U8220", result);
}
public void testDevice3378() throws Exception {
    final String result = DeviceNames.getDeviceName("A554C", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Juke-A554C", result);
}
public void testDevice3379() throws Exception {
    final String result = DeviceNames.getDeviceName("4027X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4.5)", result);
}
public void testDevice3380() throws Exception {
    final String result = DeviceNames.getDeviceName("GAMETAB-ONE", FALLBACK);
    Assert.assertEquals("Bigben GAMETAB-ONE", result);
}
public void testDevice3381() throws Exception {
    final String result = DeviceNames.getDeviceName("FieldBook_E1", FALLBACK);
    Assert.assertEquals("Logic Instrument FieldBook E1", result);
}
public void testDevice3382() throws Exception {
    final String result = DeviceNames.getDeviceName("PantechP9090", FALLBACK);
    Assert.assertEquals("Pantech P9090", result);
}
public void testDevice3383() throws Exception {
    final String result = DeviceNames.getDeviceName("4027N", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4.5)", result);
}
public void testDevice3384() throws Exception {
    final String result = DeviceNames.getDeviceName("4027A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4.5)", result);
}
public void testDevice3385() throws Exception {
    final String result = DeviceNames.getDeviceName("4027D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4.5)", result);
}
public void testDevice3386() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9008W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice3387() throws Exception {
    final String result = DeviceNames.getDeviceName("MID1028", FALLBACK);
    Assert.assertEquals("Polaroid MID1028", result);
}
public void testDevice3388() throws Exception {
    final String result = DeviceNames.getDeviceName("IS12S", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia acro HD", result);
}
public void testDevice3389() throws Exception {
    final String result = DeviceNames.getDeviceName("IS12F", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS ES IS12F", result);
}
public void testDevice3390() throws Exception {
    final String result = DeviceNames.getDeviceName("Marquis_MP977", FALLBACK);
    Assert.assertEquals("Anydata Marquis Tablet", result);
}
public void testDevice3391() throws Exception {
    final String result = DeviceNames.getDeviceName("R830S", FALLBACK);
    Assert.assertEquals("OPPO R830S", result);
}
public void testDevice3392() throws Exception {
    final String result = DeviceNames.getDeviceName("C6522N", FALLBACK);
    Assert.assertEquals("Kyocera Hydro XTRM", result);
}
public void testDevice3393() throws Exception {
    final String result = DeviceNames.getDeviceName("E450", FALLBACK);
    Assert.assertEquals("NGM Italia SRL NGM Youcolor E450", result);
}
public void testDevice3394() throws Exception {
    final String result = DeviceNames.getDeviceName("PNDPP44QC7", FALLBACK);
    Assert.assertEquals("pendo PNDPP44QC7", result);
}
public void testDevice3395() throws Exception {
    final String result = DeviceNames.getDeviceName("TM9S775", FALLBACK);
    Assert.assertEquals("TMAX TM9S775", result);
}
public void testDevice3396() throws Exception {
    final String result = DeviceNames.getDeviceName("USS", FALLBACK);
    Assert.assertEquals("Ubiquiti USS", result);
}
public void testDevice3397() throws Exception {
    final String result = DeviceNames.getDeviceName("IS12SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE IS12SH", result);
}
public void testDevice3398() throws Exception {
    final String result = DeviceNames.getDeviceName("M372", FALLBACK);
    Assert.assertEquals("InFocus M372", result);
}
public void testDevice3399() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-VS700PP", FALLBACK);
    Assert.assertEquals("LGE LG Enlighten", result);
}
public void testDevice3400() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-N064", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice3401() throws Exception {
    final String result = DeviceNames.getDeviceName("Telenor_SmartPlus", FALLBACK);
    Assert.assertEquals("Mobiwire Telenor SmartPlus", result);
}
public void testDevice3402() throws Exception {
    final String result = DeviceNames.getDeviceName("FP2", FALLBACK);
    Assert.assertEquals("Fairphone FP2", result);
}
public void testDevice3403() throws Exception {
    final String result = DeviceNames.getDeviceName("P8_Energy_mini", FALLBACK);
    Assert.assertEquals("AllView P8 Energy mini", result);
}
public void testDevice3404() throws Exception {
    final String result = DeviceNames.getDeviceName("CMP793", FALLBACK);
    Assert.assertEquals("iCraig CMP793", result);
}
public void testDevice3405() throws Exception {
    final String result = DeviceNames.getDeviceName("CMP791", FALLBACK);
    Assert.assertEquals("iCraig CMP791", result);
}
public void testDevice3406() throws Exception {
    final String result = DeviceNames.getDeviceName("PX7", FALLBACK);
    Assert.assertEquals("Hisense PX1900ES", result);
}
public void testDevice3407() throws Exception {
    final String result = DeviceNames.getDeviceName("Y511-U00", FALLBACK);
    Assert.assertEquals("Huawei Y511-U00", result);
}
public void testDevice3408() throws Exception {
    final String result = DeviceNames.getDeviceName("PLK-L01", FALLBACK);
    Assert.assertEquals("Huawei PLK-L01", result);
}
public void testDevice3409() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-KC100K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera", result);
}
public void testDevice3410() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9080E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice3411() throws Exception {
    final String result = DeviceNames.getDeviceName("Farabi", FALLBACK);
    Assert.assertEquals("Vestel Farabi", result);
}
public void testDevice3412() throws Exception {
    final String result = DeviceNames.getDeviceName("402HW", FALLBACK);
    Assert.assertEquals("HUAWEI MediaPad 10 Link+", result);
}
public void testDevice3413() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9080L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice3414() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N7105T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note II", result);
}
public void testDevice3415() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313MU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4", result);
}
public void testDevice3416() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313MY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace 4", result);
}
public void testDevice3417() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-KC100S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera", result);
}
public void testDevice3418() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-50UE1H", FALLBACK);
    Assert.assertEquals("Sharp LC-50UE1H", result);
}
public void testDevice3419() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-50UE1M", FALLBACK);
    Assert.assertEquals("Sharp LC-50UE1M", result);
}
public void testDevice3420() throws Exception {
    final String result = DeviceNames.getDeviceName("STAIRWAY", FALLBACK);
    Assert.assertEquals("Enspert STAIRWAY", result);
}
public void testDevice3421() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A800S", FALLBACK);
    Assert.assertEquals("Pantech IM-A800S", result);
}
public void testDevice3422() throws Exception {
    final String result = DeviceNames.getDeviceName("Warp", FALLBACK);
    Assert.assertEquals("ZTE N860", result);
}
public void testDevice3423() throws Exception {
    final String result = DeviceNames.getDeviceName("D2502", FALLBACK);
    Assert.assertEquals("Sony Xperia C3 Dual", result);
}
public void testDevice3424() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P355C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice3425() throws Exception {
    final String result = DeviceNames.getDeviceName("IS11SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE IS11SH", result);
}
public void testDevice3426() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-VS410PP", FALLBACK);
    Assert.assertEquals("LGE Optimus Zone", result);
}
public void testDevice3427() throws Exception {
    final String result = DeviceNames.getDeviceName("Devour", FALLBACK);
    Assert.assertEquals("Motorola Devour", result);
}
public void testDevice3428() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P355Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice3429() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T337T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 8.0", result);
}
public void testDevice3430() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T337V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 8.0", result);
}
public void testDevice3431() throws Exception {
    final String result = DeviceNames.getDeviceName("Z797C", FALLBACK);
    Assert.assertEquals("ZTE Z797C", result);
}
public void testDevice3432() throws Exception {
    final String result = DeviceNames.getDeviceName("DROID_BIONIC", FALLBACK);
    Assert.assertEquals("Motorola Droid Bionic", result);
}
public void testDevice3433() throws Exception {
    final String result = DeviceNames.getDeviceName("PRIMO", FALLBACK);
    Assert.assertEquals("Konrow Primo", result);
}
public void testDevice3434() throws Exception {
    final String result = DeviceNames.getDeviceName("Viva_H701_LTE_CZ", FALLBACK);
    Assert.assertEquals("AllView Viva i701G", result);
}
public void testDevice3435() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G550FY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy On5", result);
}
public void testDevice3436() throws Exception {
    final String result = DeviceNames.getDeviceName("TQ150", FALLBACK);
    Assert.assertEquals("ZTE TQ150", result);
}
public void testDevice3437() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-P729", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice3438() throws Exception {
    final String result = DeviceNames.getDeviceName("STARXTREM", FALLBACK);
    Assert.assertEquals("ZTE STARXTREM", result);
}
public void testDevice3439() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I857", FALLBACK);
    Assert.assertEquals("Samsung DoubleTime", result);
}
public void testDevice3440() throws Exception {
    final String result = DeviceNames.getDeviceName("6043A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6043A", result);
}
public void testDevice3441() throws Exception {
    final String result = DeviceNames.getDeviceName("TA10TA2", FALLBACK);
    Assert.assertEquals("Vulcan TA10TA2", result);
}
public void testDevice3442() throws Exception {
    final String result = DeviceNames.getDeviceName("6043D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6043D", result);
}
public void testDevice3443() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7108", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice3444() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7109", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice3445() throws Exception {
    final String result = DeviceNames.getDeviceName("TF101", FALLBACK);
    Assert.assertEquals("Asus Eee Pad TF101", result);
}
public void testDevice3446() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7102", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand II", result);
}
public void testDevice3447() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7105", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice3448() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G7106", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice3449() throws Exception {
    final String result = DeviceNames.getDeviceName("NBX-T7014", FALLBACK);
    Assert.assertEquals("Noblex NBX-T7014", result);
}
public void testDevice3450() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G710K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice3451() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G710L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice3452() throws Exception {
    final String result = DeviceNames.getDeviceName("Zoom", FALLBACK);
    Assert.assertEquals("AG Mobile Zoom", result);
}
public void testDevice3453() throws Exception {
    final String result = DeviceNames.getDeviceName("LCD-UF30A", FALLBACK);
    Assert.assertEquals("Sharp LCD-UF30A", result);
}
public void testDevice3454() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G710S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice3455() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9305T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice3456() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T677", FALLBACK);
    Assert.assertEquals("Samsung Galaxy View", result);
}
public void testDevice3457() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T670", FALLBACK);
    Assert.assertEquals("Samsung Galaxy View", result);
}
public void testDevice3458() throws Exception {
    final String result = DeviceNames.getDeviceName("P901", FALLBACK);
    Assert.assertEquals("Polaroid P901", result);
}
public void testDevice3459() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T399N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Light", result);
}
public void testDevice3460() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V940", FALLBACK);
    Assert.assertEquals("LGE LG G Pad II 10.1 FHD", result);
}
public void testDevice3461() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR6350", FALLBACK);
    Assert.assertEquals("HTC Droid Incredible 2", result);
}
public void testDevice3462() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1045", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice3463() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1042", FALLBACK);
    Assert.assertEquals("Motorola MOTO G", result);
}
public void testDevice3464() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I547C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Rugby", result);
}
public void testDevice3465() throws Exception {
    final String result = DeviceNames.getDeviceName("V8507", FALLBACK);
    Assert.assertEquals("ZTE V829", result);
}
public void testDevice3466() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-SKATE", FALLBACK);
    Assert.assertEquals("ZTE-SKATE", result);
}
public void testDevice3467() throws Exception {
    final String result = DeviceNames.getDeviceName("V8502", FALLBACK);
    Assert.assertEquals("ZTE Blade", result);
}
public void testDevice3468() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K660X3D", FALLBACK);
    Assert.assertEquals("Hisense LED42K660X3D", result);
}
public void testDevice3469() throws Exception {
    final String result = DeviceNames.getDeviceName("T-101", FALLBACK);
    Assert.assertEquals("Huawei T101", result);
}
public void testDevice3470() throws Exception {
    final String result = DeviceNames.getDeviceName("V8501", FALLBACK);
    Assert.assertEquals("ZTE V807", result);
}
public void testDevice3471() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6002W46", FALLBACK);
    Assert.assertEquals("RCA RCT6002W46", result);
}
public void testDevice3472() throws Exception {
    final String result = DeviceNames.getDeviceName("NX008HD8G", FALLBACK);
    Assert.assertEquals("Anydata Nextbook NX008HD8G Tablet", result);
}
public void testDevice3473() throws Exception {
    final String result = DeviceNames.getDeviceName("XT800", FALLBACK);
    Assert.assertEquals("Motorola Glam XT800", result);
}
public void testDevice3474() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM200SH", FALLBACK);
    Assert.assertEquals("Sharp PANTONE 6 SoftBank 200SH", result);
}
public void testDevice3475() throws Exception {
    final String result = DeviceNames.getDeviceName("R829", FALLBACK);
    Assert.assertEquals("OPPO R829", result);
}
public void testDevice3476() throws Exception {
    final String result = DeviceNames.getDeviceName("VP800", FALLBACK);
    Assert.assertEquals("Foxconn vizio VP800", result);
}
public void testDevice3477() throws Exception {
    final String result = DeviceNames.getDeviceName("R820", FALLBACK);
    Assert.assertEquals("Oppo R820", result);
}
public void testDevice3478() throws Exception {
    final String result = DeviceNames.getDeviceName("R821", FALLBACK);
    Assert.assertEquals("Oppo R821", result);
}
public void testDevice3479() throws Exception {
    final String result = DeviceNames.getDeviceName("NS-P16AT08", FALLBACK);
    Assert.assertEquals("Insignia NS-P16AT08", result);
}
public void testDevice3480() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9003L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice3481() throws Exception {
    final String result = DeviceNames.getDeviceName("R7c", FALLBACK);
    Assert.assertEquals("Oppo R7c", result);
}
public void testDevice3482() throws Exception {
    final String result = DeviceNames.getDeviceName("R7f", FALLBACK);
    Assert.assertEquals("Oppo R7f", result);
}
public void testDevice3483() throws Exception {
    final String result = DeviceNames.getDeviceName("R7g", FALLBACK);
    Assert.assertEquals("Oppo R7g", result);
}
public void testDevice3484() throws Exception {
    final String result = DeviceNames.getDeviceName("L35h", FALLBACK);
    Assert.assertEquals("Sony Xperia ZL", result);
}
public void testDevice3485() throws Exception {
    final String result = DeviceNames.getDeviceName("ME511", FALLBACK);
    Assert.assertEquals("Motorola Flipout", result);
}
public void testDevice3486() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6293T", FALLBACK);
    Assert.assertEquals("Samsung Roy VE DTV", result);
}
public void testDevice3487() throws Exception {
    final String result = DeviceNames.getDeviceName("F-02H", FALLBACK);
    Assert.assertEquals("Fujitsu F-02H", result);
}
public void testDevice3488() throws Exception {
    final String result = DeviceNames.getDeviceName("R7s", FALLBACK);
    Assert.assertEquals("Oppo R7s", result);
}
public void testDevice3489() throws Exception {
    final String result = DeviceNames.getDeviceName("G320", FALLBACK);
    Assert.assertEquals("Plaisio G320", result);
}
public void testDevice3490() throws Exception {
    final String result = DeviceNames.getDeviceName("F-02F", FALLBACK);
    Assert.assertEquals("Fujitsu F-02F", result);
}
public void testDevice3491() throws Exception {
    final String result = DeviceNames.getDeviceName("F-02G", FALLBACK);
    Assert.assertEquals("Fujitsu F-02G", result);
}
public void testDevice3492() throws Exception {
    final String result = DeviceNames.getDeviceName("F-02E", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS X F-02E", result);
}
public void testDevice3493() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-S01", FALLBACK);
    Assert.assertEquals("Sharp SC-S01", result);
}
public void testDevice3494() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_E732X", FALLBACK);
    Assert.assertEquals("Medion LIFETAB E732X", result);
}
public void testDevice3495() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-SU540", FALLBACK);
    Assert.assertEquals("LGE PRADA 3.0", result);
}
public void testDevice3496() throws Exception {
    final String result = DeviceNames.getDeviceName("P8_Energy", FALLBACK);
    Assert.assertEquals("AllView P8 Energy", result);
}
public void testDevice3497() throws Exception {
    final String result = DeviceNames.getDeviceName("BLOOM", FALLBACK);
    Assert.assertEquals("Wiko BLOOM", result);
}
public void testDevice3498() throws Exception {
    final String result = DeviceNames.getDeviceName("P01W", FALLBACK);
    Assert.assertEquals("Asus ZenPad 7.0 (Z370C)", result);
}
public void testDevice3499() throws Exception {
    final String result = DeviceNames.getDeviceName("P01V", FALLBACK);
    Assert.assertEquals("Asus ZenPad 7.0 (Z370CG)", result);
}
public void testDevice3500() throws Exception {
    final String result = DeviceNames.getDeviceName("P01T", FALLBACK);
    Assert.assertEquals("ASUSPRO Tablet-M1000CL", result);
}
public void testDevice3501() throws Exception {
    final String result = DeviceNames.getDeviceName("i700", FALLBACK);
    Assert.assertEquals("IView SupraPad i700", result);
}
public void testDevice3502() throws Exception {
    final String result = DeviceNames.getDeviceName("P01Z", FALLBACK);
    Assert.assertEquals("Asus ZenPad C 7.0 (Z170C)", result);
}
public void testDevice3503() throws Exception {
    final String result = DeviceNames.getDeviceName("P01Y", FALLBACK);
    Assert.assertEquals("Asus ZenPad C 7.0 (Z170CG)", result);
}
public void testDevice3504() throws Exception {
    final String result = DeviceNames.getDeviceName("KCP01K", FALLBACK);
    Assert.assertEquals("Kyocera LUCE", result);
}
public void testDevice3505() throws Exception {
    final String result = DeviceNames.getDeviceName("P01M", FALLBACK);
    Assert.assertEquals("Asus ZenPad S 8.0 (Z580C)", result);
}
public void testDevice3506() throws Exception {
    final String result = DeviceNames.getDeviceName("P5W", FALLBACK);
    Assert.assertEquals("Gionee P5W", result);
}
public void testDevice3507() throws Exception {
    final String result = DeviceNames.getDeviceName("D45", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 4.5", result);
}
public void testDevice3508() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U800E-1", FALLBACK);
    Assert.assertEquals("Hisense U800E-1", result);
}
public void testDevice3509() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_10STB", FALLBACK);
    Assert.assertEquals("Positivo Ypy 10STB", result);
}
public void testDevice3510() throws Exception {
    final String result = DeviceNames.getDeviceName("E6533", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3+ Dual", result);
}
public void testDevice3511() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9063T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo Duos", result);
}
public void testDevice3512() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I747Z", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice3513() throws Exception {
    final String result = DeviceNames.getDeviceName("KC-01", FALLBACK);
    Assert.assertEquals("Kyocera KC-01", result);
}
public void testDevice3514() throws Exception {
    final String result = DeviceNames.getDeviceName("GV7790", FALLBACK);
    Assert.assertEquals("Prestigio GV7790", result);
}
public void testDevice3515() throws Exception {
    final String result = DeviceNames.getDeviceName("SH90B", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SH90B", result);
}
public void testDevice3516() throws Exception {
    final String result = DeviceNames.getDeviceName("Quest", FALLBACK);
    Assert.assertEquals("AG Mobile Quest", result);
}
public void testDevice3517() throws Exception {
    final String result = DeviceNames.getDeviceName("IS14SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE IS14SH", result);
}
public void testDevice3518() throws Exception {
    final String result = DeviceNames.getDeviceName("SFR-G8800", FALLBACK);
    Assert.assertEquals("SFR-G8800", result);
}
public void testDevice3519() throws Exception {
    final String result = DeviceNames.getDeviceName("STJR76", FALLBACK);
    Assert.assertEquals("Smartab STJR76", result);
}
public void testDevice3520() throws Exception {
    final String result = DeviceNames.getDeviceName("WEBPAD1002", FALLBACK);
    Assert.assertEquals("Nuvision TM1088", result);
}
public void testDevice3521() throws Exception {
    final String result = DeviceNames.getDeviceName("Bay", FALLBACK);
    Assert.assertEquals("HighScreen Bay", result);
}
public void testDevice3522() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6272W23", FALLBACK);
    Assert.assertEquals("RCA RCT6272W23", result);
}
public void testDevice3523() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D605", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L9 II", result);
}
public void testDevice3524() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C111M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy K Zoom", result);
}
public void testDevice3525() throws Exception {
    final String result = DeviceNames.getDeviceName("Tab_2", FALLBACK);
    Assert.assertEquals("Beeline Tab 2", result);
}
public void testDevice3526() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F200L", FALLBACK);
    Assert.assertEquals("LGE Optimus Vu2", result);
}
public void testDevice3527() throws Exception {
    final String result = DeviceNames.getDeviceName("G610-U00", FALLBACK);
    Assert.assertEquals("Huawei G610", result);
}
public void testDevice3528() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M485W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice3529() throws Exception {
    final String result = DeviceNames.getDeviceName("11DTB1", FALLBACK);
    Assert.assertEquals("Hipstreet Synergy", result);
}
public void testDevice3530() throws Exception {
    final String result = DeviceNames.getDeviceName("R6007", FALLBACK);
    Assert.assertEquals("OPPO R6007", result);
}
public void testDevice3531() throws Exception {
    final String result = DeviceNames.getDeviceName("R6006", FALLBACK);
    Assert.assertEquals("Oppo R6006", result);
}
public void testDevice3532() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F200S", FALLBACK);
    Assert.assertEquals("LGE Optimus Vu2", result);
}
public void testDevice3533() throws Exception {
    final String result = DeviceNames.getDeviceName("N810", FALLBACK);
    Assert.assertEquals("ZTE N810", result);
}
public void testDevice3534() throws Exception {
    final String result = DeviceNames.getDeviceName("N817", FALLBACK);
    Assert.assertEquals("ZTE N817", result);
}
public void testDevice3535() throws Exception {
    final String result = DeviceNames.getDeviceName("N818", FALLBACK);
    Assert.assertEquals("ZTE N818", result);
}
public void testDevice3536() throws Exception {
    final String result = DeviceNames.getDeviceName("KYOCERA-C6745", FALLBACK);
    Assert.assertEquals("Kyocera Hydro AIR", result);
}
public void testDevice3537() throws Exception {
    final String result = DeviceNames.getDeviceName("MT25i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia neo L", result);
}
public void testDevice3538() throws Exception {
    final String result = DeviceNames.getDeviceName("E8", FALLBACK);
    Assert.assertEquals("QMobile E8", result);
}
public void testDevice3539() throws Exception {
    final String result = DeviceNames.getDeviceName("E4", FALLBACK);
    Assert.assertEquals("Turk Telekom E4", result);
}
public void testDevice3540() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-T280", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7", result);
}
public void testDevice3541() throws Exception {
    final String result = DeviceNames.getDeviceName("EI", FALLBACK);
    Assert.assertEquals("Cellon EI", result);
}
public void testDevice3542() throws Exception {
    final String result = DeviceNames.getDeviceName("P1001", FALLBACK);
    Assert.assertEquals("Polaroid P1001", result);
}
public void testDevice3543() throws Exception {
    final String result = DeviceNames.getDeviceName("f400", FALLBACK);
    Assert.assertEquals("EMTEC F400", result);
}
public void testDevice3544() throws Exception {
    final String result = DeviceNames.getDeviceName("D2243", FALLBACK);
    Assert.assertEquals("Sony Xperia E3", result);
}
public void testDevice3545() throws Exception {
    final String result = DeviceNames.getDeviceName("202F", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS A SoftBank 202F", result);
}
public void testDevice3546() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_07STB", FALLBACK);
    Assert.assertEquals("Positivo Ypy 07STB", result);
}
public void testDevice3547() throws Exception {
    final String result = DeviceNames.getDeviceName("7055A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Hero2C", result);
}
public void testDevice3548() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_07STA", FALLBACK);
    Assert.assertEquals("Positivo YPY7 wifi", result);
}
public void testDevice3549() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00ADB", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 (ZE551ML)", result);
}
public void testDevice3550() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00ADA", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 (ZE551ML)", result);
}
public void testDevice3551() throws Exception {
    final String result = DeviceNames.getDeviceName("202K", FALLBACK);
    Assert.assertEquals("Kyocera DIGNO R", result);
}
public void testDevice3552() throws Exception {
    final String result = DeviceNames.getDeviceName("N-03E", FALLBACK);
    Assert.assertEquals("NEC Disney Mobile on docomoN-03E", result);
}
public void testDevice3553() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM106SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE Xx SoftBank 106SH", result);
}
public void testDevice3554() throws Exception {
    final String result = DeviceNames.getDeviceName("AV10", FALLBACK);
    Assert.assertEquals("AV10", result);
}
public void testDevice3555() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-AS811", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice3556() throws Exception {
    final String result = DeviceNames.getDeviceName("Amazing_P5", FALLBACK);
    Assert.assertEquals("ZTE myPad P5", result);
}
public void testDevice3557() throws Exception {
    final String result = DeviceNames.getDeviceName("X9", FALLBACK);
    Assert.assertEquals("USA111 IRULU X9", result);
}
public void testDevice3558() throws Exception {
    final String result = DeviceNames.getDeviceName("ET7050D", FALLBACK);
    Assert.assertEquals("Impecca ET7050D", result);
}
public void testDevice3559() throws Exception {
    final String result = DeviceNames.getDeviceName("X1", FALLBACK);
    Assert.assertEquals("Moxee Technologies X1", result);
}
public void testDevice3560() throws Exception {
    final String result = DeviceNames.getDeviceName("MW-7615P", FALLBACK);
    Assert.assertEquals("Lazer MW-7615P", result);
}
public void testDevice3561() throws Exception {
    final String result = DeviceNames.getDeviceName("X7", FALLBACK);
    Assert.assertEquals("USA111 Irulu X7", result);
}
public void testDevice3562() throws Exception {
    final String result = DeviceNames.getDeviceName("X4", FALLBACK);
    Assert.assertEquals("NUU X4", result);
}
public void testDevice3563() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915W8", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice3564() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000018-102", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice3565() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000018-101", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice3566() throws Exception {
    final String result = DeviceNames.getDeviceName("CHC-U01", FALLBACK);
    Assert.assertEquals("Huawei CHC-U01", result);
}
public void testDevice3567() throws Exception {
    final String result = DeviceNames.getDeviceName("CHC-U03", FALLBACK);
    Assert.assertEquals("Huawei CHC-U03", result);
}
public void testDevice3568() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000018-104", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice3569() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-A1H", FALLBACK);
    Assert.assertEquals("Sharp LC-A1H", result);
}
public void testDevice3570() throws Exception {
    final String result = DeviceNames.getDeviceName("LT668", FALLBACK);
    Assert.assertEquals("Hisense EG68AE", result);
}
public void testDevice3571() throws Exception {
    final String result = DeviceNames.getDeviceName("Y635-L02", FALLBACK);
    Assert.assertEquals("Huawei Y635-L02", result);
}
public void testDevice3572() throws Exception {
    final String result = DeviceNames.getDeviceName("Y635-L03", FALLBACK);
    Assert.assertEquals("Huawei Y635-L03", result);
}
public void testDevice3573() throws Exception {
    final String result = DeviceNames.getDeviceName("MB526", FALLBACK);
    Assert.assertEquals("Motorola Defy", result);
}
public void testDevice3574() throws Exception {
    final String result = DeviceNames.getDeviceName("C1605", FALLBACK);
    Assert.assertEquals("Sony Xperia E dual", result);
}
public void testDevice3575() throws Exception {
    final String result = DeviceNames.getDeviceName("C1604", FALLBACK);
    Assert.assertEquals("Sony Xperia E dual", result);
}
public void testDevice3576() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8730T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Express", result);
}
public void testDevice3577() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Flyer_P512_NA", FALLBACK);
    Assert.assertEquals("HTC Flyer", result);
}
public void testDevice3578() throws Exception {
    final String result = DeviceNames.getDeviceName("S4S4IN3G", FALLBACK);
    Assert.assertEquals("Auchan S4S4IN3G", result);
}
public void testDevice3579() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM101SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE THE HYBRID SoftBank 101SH", result);
}
public void testDevice3580() throws Exception {
    final String result = DeviceNames.getDeviceName("MTAB-09541AB", FALLBACK);
    Assert.assertEquals("Memorex MTAB-09541AB", result);
}
public void testDevice3581() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-W2015", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Golden 2", result);
}
public void testDevice3582() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-W2014", FALLBACK);
    Assert.assertEquals("Samsung Montblanc", result);
}
public void testDevice3583() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-W2016", FALLBACK);
    Assert.assertEquals("Samsung W2016", result);
}
public void testDevice3584() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T330", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 8.0", result);
}
public void testDevice3585() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T331", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 8.0", result);
}
public void testDevice3586() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_5035X", FALLBACK);
    Assert.assertEquals("Alcatel One Touch X Pop", result);
}
public void testDevice3587() throws Exception {
    final String result = DeviceNames.getDeviceName("Hol-U19", FALLBACK);
    Assert.assertEquals("Huawei Hol-U19", result);
}
public void testDevice3588() throws Exception {
    final String result = DeviceNames.getDeviceName("Hol-U10", FALLBACK);
    Assert.assertEquals("Huawei Hol-U10", result);
}
public void testDevice3589() throws Exception {
    final String result = DeviceNames.getDeviceName("PI3205G", FALLBACK);
    Assert.assertEquals("Philips PI3205G", result);
}
public void testDevice3590() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1250", FALLBACK);
    Assert.assertEquals("Motorola DROID Turbo", result);
}
public void testDevice3591() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1254", FALLBACK);
    Assert.assertEquals("Motorola Droid Turbo", result);
}
public void testDevice3592() throws Exception {
    final String result = DeviceNames.getDeviceName("Fresh", FALLBACK);
    Assert.assertEquals("Explay Fresh", result);
}
public void testDevice3593() throws Exception {
    final String result = DeviceNames.getDeviceName("SCL-TL00", FALLBACK);
    Assert.assertEquals("Huawei Honor 4A", result);
}
public void testDevice3594() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Sensation_4G", FALLBACK);
    Assert.assertEquals("HTC Sensation 4G", result);
}
public void testDevice3595() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-C660", FALLBACK);
    Assert.assertEquals("LGE Optimus Pro", result);
}
public void testDevice3596() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-03G", FALLBACK);
    Assert.assertEquals("Sony Xperia Z4", result);
}
public void testDevice3597() throws Exception {
    final String result = DeviceNames.getDeviceName("DM011SH", FALLBACK);
    Assert.assertEquals("Sharp DM011SH", result);
}
public void testDevice3598() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-L6", FALLBACK);
    Assert.assertEquals("Tecno Techno L6", result);
}
public void testDevice3599() throws Exception {
    final String result = DeviceNames.getDeviceName("D5503", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1", result);
}
public void testDevice3600() throws Exception {
    final String result = DeviceNames.getDeviceName("ME722", FALLBACK);
    Assert.assertEquals("Motorola Milestone2", result);
}
public void testDevice3601() throws Exception {
    final String result = DeviceNames.getDeviceName("Ahiga", FALLBACK);
    Assert.assertEquals("Mobiwire Ahiga", result);
}
public void testDevice3602() throws Exception {
    final String result = DeviceNames.getDeviceName("NB7022S", FALLBACK);
    Assert.assertEquals("Nobis NB7022S", result);
}
public void testDevice3603() throws Exception {
    final String result = DeviceNames.getDeviceName("Favorite", FALLBACK);
    Assert.assertEquals("Explay Favorite", result);
}
public void testDevice3604() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9082i", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand duos", result);
}
public void testDevice3605() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9082C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo", result);
}
public void testDevice3606() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9082L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Duos", result);
}
public void testDevice3607() throws Exception {
    final String result = DeviceNames.getDeviceName("LGUS550", FALLBACK);
    Assert.assertEquals("LGE LG Logos", result);
}
public void testDevice3608() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T237P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice3609() throws Exception {
    final String result = DeviceNames.getDeviceName("WA912", FALLBACK);
    Assert.assertEquals("Hisense WA912", result);
}
public void testDevice3610() throws Exception {
    final String result = DeviceNames.getDeviceName("VS870_4G", FALLBACK);
    Assert.assertEquals("LG Lucid 2", result);
}
public void testDevice3611() throws Exception {
    final String result = DeviceNames.getDeviceName("P886A", FALLBACK);
    Assert.assertEquals("Anydata HKC P886A", result);
}
public void testDevice3612() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E310L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice3613() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E310K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice3614() throws Exception {
    final String result = DeviceNames.getDeviceName("DM012SH", FALLBACK);
    Assert.assertEquals("Sharp DM012SH", result);
}
public void testDevice3615() throws Exception {
    final String result = DeviceNames.getDeviceName("MTC_968", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL A988", result);
}
public void testDevice3616() throws Exception {
    final String result = DeviceNames.getDeviceName("Prime11E", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Prime11E", result);
}
public void testDevice3617() throws Exception {
    final String result = DeviceNames.getDeviceName("W270BD", FALLBACK);
    Assert.assertEquals("Hisense W270BD", result);
}
public void testDevice3618() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K280J3D", FALLBACK);
    Assert.assertEquals("Hisense LED32K280J3D", result);
}
public void testDevice3619() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E310S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice3620() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65XT810X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED65XT810X3DU", result);
}
public void testDevice3621() throws Exception {
    final String result = DeviceNames.getDeviceName("LED46K260X3D", FALLBACK);
    Assert.assertEquals("Hisense LED46K260X3D", result);
}
public void testDevice3622() throws Exception {
    final String result = DeviceNames.getDeviceName("Z795G", FALLBACK);
    Assert.assertEquals("ZTE Z795G", result);
}
public void testDevice3623() throws Exception {
    final String result = DeviceNames.getDeviceName("TC69CA2", FALLBACK);
    Assert.assertEquals("ECS TC69CA2", result);
}
public void testDevice3624() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_903", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 903", result);
}
public void testDevice3625() throws Exception {
    final String result = DeviceNames.getDeviceName("80-1", FALLBACK);
    Assert.assertEquals("Gigaset Maxwell-10", result);
}
public void testDevice3626() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-N719", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice3627() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T335K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 8.0", result);
}
public void testDevice3628() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T335L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 8.0", result);
}
public void testDevice3629() throws Exception {
    final String result = DeviceNames.getDeviceName("Si01BE", FALLBACK);
    Assert.assertEquals("SiAL Si01BE", result);
}
public void testDevice3630() throws Exception {
    final String result = DeviceNames.getDeviceName("Si01BB", FALLBACK);
    Assert.assertEquals("SiAL Bic camera", result);
}
public void testDevice3631() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5301", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Plus", result);
}
public void testDevice3632() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5300", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket", result);
}
public void testDevice3633() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5303", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Plus", result);
}
public void testDevice3634() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5302", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket", result);
}
public void testDevice3635() throws Exception {
    final String result = DeviceNames.getDeviceName("G740-L00", FALLBACK);
    Assert.assertEquals("Huawei G740", result);
}
public void testDevice3636() throws Exception {
    final String result = DeviceNames.getDeviceName("Connect551", FALLBACK);
    Assert.assertEquals("Sourcing Creation Connect551", result);
}
public void testDevice3637() throws Exception {
    final String result = DeviceNames.getDeviceName("6014X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6014X", result);
}
public void testDevice3638() throws Exception {
    final String result = DeviceNames.getDeviceName("Liquid", FALLBACK);
    Assert.assertEquals("Acer Liquid", result);
}
public void testDevice3639() throws Exception {
    final String result = DeviceNames.getDeviceName("SCL-L01", FALLBACK);
    Assert.assertEquals("Huawei Y6", result);
}
public void testDevice3640() throws Exception {
    final String result = DeviceNames.getDeviceName("gprimelteacg", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice3641() throws Exception {
    final String result = DeviceNames.getDeviceName("TA71CA5", FALLBACK);
    Assert.assertEquals("i-Buddie TA71CA5", result);
}
public void testDevice3642() throws Exception {
    final String result = DeviceNames.getDeviceName("X2_Soul_Style_Plus", FALLBACK);
    Assert.assertEquals("AllView X2 Soul Style+", result);
}
public void testDevice3643() throws Exception {
    final String result = DeviceNames.getDeviceName("TA71CA1", FALLBACK);
    Assert.assertEquals("i-Buddie TA71CA1", result);
}
public void testDevice3644() throws Exception {
    final String result = DeviceNames.getDeviceName("TA71CA2", FALLBACK);
    Assert.assertEquals("Vulcan TA71CA2", result);
}
public void testDevice3645() throws Exception {
    final String result = DeviceNames.getDeviceName("TA71CA3", FALLBACK);
    Assert.assertEquals("G53 TA71CA3", result);
}
public void testDevice3646() throws Exception {
    final String result = DeviceNames.getDeviceName("W032I", FALLBACK);
    Assert.assertEquals("BYD WISKY W032I", result);
}
public void testDevice3647() throws Exception {
    final String result = DeviceNames.getDeviceName("LED39K600X3D", FALLBACK);
    Assert.assertEquals("Hisense LED39K600X3D", result);
}
public void testDevice3648() throws Exception {
    final String result = DeviceNames.getDeviceName("DPM7827", FALLBACK);
    Assert.assertEquals("Dopo DPM7827", result);
}
public void testDevice3649() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50XT880G3DU", FALLBACK);
    Assert.assertEquals("Hisense LED50XT880G3DU", result);
}
public void testDevice3650() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-L710", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice3651() throws Exception {
    final String result = DeviceNames.getDeviceName("VSD231", FALLBACK);
    Assert.assertEquals("ViewSonic VSD231", result);
}
public void testDevice3652() throws Exception {
    final String result = DeviceNames.getDeviceName("S4S6IN3G", FALLBACK);
    Assert.assertEquals("Auchan S4S6IN3G", result);
}
public void testDevice3653() throws Exception {
    final String result = DeviceNames.getDeviceName("FARTM933KZ", FALLBACK);
    Assert.assertEquals("Fujitsu FARTM933KZ", result);
}
public void testDevice3654() throws Exception {
    final String result = DeviceNames.getDeviceName("V2_Viper_I", FALLBACK);
    Assert.assertEquals("AllView V2 Viper I", result);
}
public void testDevice3655() throws Exception {
    final String result = DeviceNames.getDeviceName("AQT80", FALLBACK);
    Assert.assertEquals("Sprint Slate 8 Tablet", result);
}
public void testDevice3656() throws Exception {
    final String result = DeviceNames.getDeviceName("V2_Viper_X", FALLBACK);
    Assert.assertEquals("AllView V2 Viper X", result);
}
public void testDevice3657() throws Exception {
    final String result = DeviceNames.getDeviceName("VALENCIA", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 983", result);
}
public void testDevice3658() throws Exception {
    final String result = DeviceNames.getDeviceName("AS876", FALLBACK);
    Assert.assertEquals("LGE LG-AS876", result);
}
public void testDevice3659() throws Exception {
    final String result = DeviceNames.getDeviceName("LePanII", FALLBACK);
    Assert.assertEquals("Anydata LePanII", result);
}
public void testDevice3660() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-M01", FALLBACK);
    Assert.assertEquals("Sharp AQUOS SH-M01", result);
}
public void testDevice3661() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-M02", FALLBACK);
    Assert.assertEquals("Sharp AQUOS SH-M02", result);
}
public void testDevice3662() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-X500", FALLBACK);
    Assert.assertEquals("ZTE-X500", result);
}
public void testDevice3663() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J500FN", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J5", result);
}
public void testDevice3664() throws Exception {
    final String result = DeviceNames.getDeviceName("MM-3202", FALLBACK);
    Assert.assertEquals("iRiver MM3202", result);
}
public void testDevice3665() throws Exception {
    final String result = DeviceNames.getDeviceName("MM-3201", FALLBACK);
    Assert.assertEquals("iRiver MM3202", result);
}
public void testDevice3666() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1064", FALLBACK);
    Assert.assertEquals("Moto G", result);
}
public void testDevice3667() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1063", FALLBACK);
    Assert.assertEquals("Motorola MOTO G", result);
}
public void testDevice3668() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T111M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 Lite", result);
}
public void testDevice3669() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1069", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice3670() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1068", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice3671() throws Exception {
    final String result = DeviceNames.getDeviceName("MiBOX1S", FALLBACK);
    Assert.assertEquals("Xiaomi China", result);
}
public void testDevice3672() throws Exception {
    final String result = DeviceNames.getDeviceName("E860", FALLBACK);
    Assert.assertEquals("Hisense E860", result);
}
public void testDevice3673() throws Exception {
    final String result = DeviceNames.getDeviceName("Z777", FALLBACK);
    Assert.assertEquals("ZTE Z777", result);
}
public void testDevice3674() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_906Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) One Touch 906", result);
}
public void testDevice3675() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL_S725T", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL S725T", result);
}
public void testDevice3676() throws Exception {
    final String result = DeviceNames.getDeviceName("Alcatel_one_touch_908F_Orange", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) One Touch 908", result);
}
public void testDevice3677() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K360X3D", FALLBACK);
    Assert.assertEquals("Hisense LED42K360X3D", result);
}
public void testDevice3678() throws Exception {
    final String result = DeviceNames.getDeviceName("CETAB10KML9", FALLBACK);
    Assert.assertEquals("Haier CETAB10KML9", result);
}
public void testDevice3679() throws Exception {
    final String result = DeviceNames.getDeviceName("HTCONE", FALLBACK);
    Assert.assertEquals("HTC One", result);
}
public void testDevice3680() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P690f", FALLBACK);
    Assert.assertEquals("LGE Optimus Spirit", result);
}
public void testDevice3681() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P690b", FALLBACK);
    Assert.assertEquals("LGE Optimus Net", result);
}
public void testDevice3682() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice3683() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G890A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3684() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-i589", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Duos", result);
}
public void testDevice3685() throws Exception {
    final String result = DeviceNames.getDeviceName("VS880", FALLBACK);
    Assert.assertEquals("LGE G Vista", result);
}
public void testDevice3686() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM007SHK", FALLBACK);
    Assert.assertEquals("Sharp SoftBank 007SH KT", result);
}
public void testDevice3687() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM007SHJ", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE THE HYBRID SoftBank 007SH J", result);
}
public void testDevice3688() throws Exception {
    final String result = DeviceNames.getDeviceName("ADR6330VW", FALLBACK);
    Assert.assertEquals("HTC Rhyme", result);
}
public void testDevice3689() throws Exception {
    final String result = DeviceNames.getDeviceName("LS670", FALLBACK);
    Assert.assertEquals("LG Optimus S", result);
}
public void testDevice3690() throws Exception {
    final String result = DeviceNames.getDeviceName("X909T", FALLBACK);
    Assert.assertEquals("Oppo X909", result);
}
public void testDevice3691() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F490L", FALLBACK);
    Assert.assertEquals("LGE G3 Screen", result);
}
public void testDevice3692() throws Exception {
    final String result = DeviceNames.getDeviceName("MB865", FALLBACK);
    Assert.assertEquals("Motorola Atrix 2", result);
}
public void testDevice3693() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P355", FALLBACK);
    Assert.assertEquals("LGE PecanV", result);
}
public void testDevice3694() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P350", FALLBACK);
    Assert.assertEquals("LGE LG Pecan", result);
}
public void testDevice3695() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9060", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo", result);
}
public void testDevice3696() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65XT880G3D", FALLBACK);
    Assert.assertEquals("Hisense LED65XT880G3D", result);
}
public void testDevice3697() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F480L", FALLBACK);
    Assert.assertEquals("LGE Wine Smart", result);
}
public void testDevice3698() throws Exception {
    final String result = DeviceNames.getDeviceName("PC-TE508BAW", FALLBACK);
    Assert.assertEquals("NEC LaVieTab PC-TE508BAW", result);
}
public void testDevice3699() throws Exception {
    final String result = DeviceNames.getDeviceName("AT1S0", FALLBACK);
    Assert.assertEquals("Toshiba Thrive 7", result);
}
public void testDevice3700() throws Exception {
    final String result = DeviceNames.getDeviceName("MTAB-08530A", FALLBACK);
    Assert.assertEquals("Memorex MTAB-08530A", result);
}
public void testDevice3701() throws Exception {
    final String result = DeviceNames.getDeviceName("MFC510FR1", FALLBACK);
    Assert.assertEquals("Lexibook Fluo XL Premium Edition", result);
}
public void testDevice3702() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC0P3P7", FALLBACK);
    Assert.assertEquals("HTC One max", result);
}
public void testDevice3703() throws Exception {
    final String result = DeviceNames.getDeviceName("AQT100", FALLBACK);
    Assert.assertEquals("Sprint AQT100", result);
}
public void testDevice3704() throws Exception {
    final String result = DeviceNames.getDeviceName("PMT3018_WI", FALLBACK);
    Assert.assertEquals("Prestigio MultiPad Wize 3018", result);
}
public void testDevice3705() throws Exception {
    final String result = DeviceNames.getDeviceName("MT27i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia sola", result);
}
public void testDevice3706() throws Exception {
    final String result = DeviceNames.getDeviceName("UNO_X8", FALLBACK);
    Assert.assertEquals("ODYS UNO X8", result);
}
public void testDevice3707() throws Exception {
    final String result = DeviceNames.getDeviceName("SELFY", FALLBACK);
    Assert.assertEquals("Wiko SELFY", result);
}
public void testDevice3708() throws Exception {
    final String result = DeviceNames.getDeviceName("Fly", FALLBACK);
    Assert.assertEquals("SK Telesys Fly", result);
}
public void testDevice3709() throws Exception {
    final String result = DeviceNames.getDeviceName("LCD-LX460A", FALLBACK);
    Assert.assertEquals("Sharp LCD-LX460A", result);
}
public void testDevice3710() throws Exception {
    final String result = DeviceNames.getDeviceName("ME302KL", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad FHD 10 (ME302KL)", result);
}
public void testDevice3711() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T520CC", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Pro 10.1 Chef Collection", result);
}
public void testDevice3712() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360HU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice3713() throws Exception {
    final String result = DeviceNames.getDeviceName("MDB342X", FALLBACK);
    Assert.assertEquals("Mobily MDB342X", result);
}
public void testDevice3714() throws Exception {
    final String result = DeviceNames.getDeviceName("502ZT", FALLBACK);
    Assert.assertEquals("ZTE Spro 2", result);
}
public void testDevice3715() throws Exception {
    final String result = DeviceNames.getDeviceName("DROID_RAZR_HD", FALLBACK);
    Assert.assertEquals("Motorola Droid Razr HD", result);
}
public void testDevice3716() throws Exception {
    final String result = DeviceNames.getDeviceName("ISW12HT", FALLBACK);
    Assert.assertEquals("HTC EVO 3D ISW12HT", result);
}
public void testDevice3717() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-C710h", FALLBACK);
    Assert.assertEquals("LGE Shine Plus with Google", result);
}
public void testDevice3718() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00RD", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 Laser (ZE500KG)", result);
}
public void testDevice3719() throws Exception {
    final String result = DeviceNames.getDeviceName("P552", FALLBACK);
    Assert.assertEquals("NGM Italia SRL P552", result);
}
public void testDevice3720() throws Exception {
    final String result = DeviceNames.getDeviceName("WPT005", FALLBACK);
    Assert.assertEquals("iRiver WPT005", result);
}
public void testDevice3721() throws Exception {
    final String result = DeviceNames.getDeviceName("P551", FALLBACK);
    Assert.assertEquals("NGM Italia SRL P551", result);
}
public void testDevice3722() throws Exception {
    final String result = DeviceNames.getDeviceName("A700", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab A700", result);
}
public void testDevice3723() throws Exception {
    final String result = DeviceNames.getDeviceName("A701", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab A701", result);
}
public void testDevice3724() throws Exception {
    final String result = DeviceNames.getDeviceName("PX1900", FALLBACK);
    Assert.assertEquals("Hisense PX1900", result);
}
public void testDevice3725() throws Exception {
    final String result = DeviceNames.getDeviceName("TA10CA4", FALLBACK);
    Assert.assertEquals("i-Buddie TA10CA4", result);
}
public void testDevice3726() throws Exception {
    final String result = DeviceNames.getDeviceName("TA10CA1", FALLBACK);
    Assert.assertEquals("i-Buddie TA10CA1", result);
}
public void testDevice3727() throws Exception {
    final String result = DeviceNames.getDeviceName("TA10CA3", FALLBACK);
    Assert.assertEquals("i-Buddie TA10CA3", result);
}
public void testDevice3728() throws Exception {
    final String result = DeviceNames.getDeviceName("TA10CA2", FALLBACK);
    Assert.assertEquals("i-Buddie TA10CA2", result);
}
public void testDevice3729() throws Exception {
    final String result = DeviceNames.getDeviceName("P102G", FALLBACK);
    Assert.assertEquals("Gigabyte P102g", result);
}
public void testDevice3730() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N750", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Neo", result);
}
public void testDevice3731() throws Exception {
    final String result = DeviceNames.getDeviceName("ref_SCTF", FALLBACK);
    Assert.assertEquals("LGE Smart Dios V8700", result);
}
public void testDevice3732() throws Exception {
    final String result = DeviceNames.getDeviceName("T1144", FALLBACK);
    Assert.assertEquals("IPRODA T1144", result);
}
public void testDevice3733() throws Exception {
    final String result = DeviceNames.getDeviceName("X4508", FALLBACK);
    Assert.assertEquals("Lazer X4508", result);
}
public void testDevice3734() throws Exception {
    final String result = DeviceNames.getDeviceName("S3T7IN", FALLBACK);
    Assert.assertEquals("Auchan S3T7IN", result);
}
public void testDevice3735() throws Exception {
    final String result = DeviceNames.getDeviceName("EGD103", FALLBACK);
    Assert.assertEquals("Ematic EGD103", result);
}
public void testDevice3736() throws Exception {
    final String result = DeviceNames.getDeviceName("X2_Soul_Lite", FALLBACK);
    Assert.assertEquals("AllView X2 Soul Lite", result);
}
public void testDevice3737() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E415g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice3738() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E415f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice3739() throws Exception {
    final String result = DeviceNames.getDeviceName("G630-U10", FALLBACK);
    Assert.assertEquals("Huawei G630-U10", result);
}
public void testDevice3740() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3741() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3742() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3743() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-L695", FALLBACK);
    Assert.assertEquals("Hisense L695W", result);
}
public void testDevice3744() throws Exception {
    final String result = DeviceNames.getDeviceName("MB502", FALLBACK);
    Assert.assertEquals("Motorola Charm", result);
}
public void testDevice3745() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3556D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core2", result);
}
public void testDevice3746() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-L691", FALLBACK);
    Assert.assertEquals("Hisense l691", result);
}
public void testDevice3747() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3748() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3749() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3750() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3751() throws Exception {
    final String result = DeviceNames.getDeviceName("Smartphone_Android_by_SFR_STARADDICT_II", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Smartphone Android by SFR STARADDICT II", result);
}
public void testDevice3752() throws Exception {
    final String result = DeviceNames.getDeviceName("N8730-41102", FALLBACK);
    Assert.assertEquals("NEC AGT10", result);
}
public void testDevice3753() throws Exception {
    final String result = DeviceNames.getDeviceName("N8730-41101", FALLBACK);
    Assert.assertEquals("NEC AGT10", result);
}
public void testDevice3754() throws Exception {
    final String result = DeviceNames.getDeviceName("OP110", FALLBACK);
    Assert.assertEquals("Olivetti OP110", result);
}
public void testDevice3755() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3756() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E405", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 Dual", result);
}
public void testDevice3757() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-05G", FALLBACK);
    Assert.assertEquals("Samsung SC-05G", result);
}
public void testDevice3758() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P875h", FALLBACK);
    Assert.assertEquals("LGE Optimus F5", result);
}
public void testDevice3759() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9118", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice3760() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T217S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 3 7.0", result);
}
public void testDevice3761() throws Exception {
    final String result = DeviceNames.getDeviceName("TMK27A2", FALLBACK);
    Assert.assertEquals("Haier TMK27A2", result);
}
public void testDevice3762() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T217T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 7.0", result);
}
public void testDevice3763() throws Exception {
    final String result = DeviceNames.getDeviceName("YD201", FALLBACK);
    Assert.assertEquals("Yota Devices YotaPhone2", result);
}
public void testDevice3764() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_P9514", FALLBACK);
    Assert.assertEquals("Medion Lifetab P9514", result);
}
public void testDevice3765() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T315", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 8.0", result);
}
public void testDevice3766() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T312", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 8.0", result);
}
public void testDevice3767() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T310", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 3 8.0", result);
}
public void testDevice3768() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T311", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 8.0", result);
}
public void testDevice3769() throws Exception {
    final String result = DeviceNames.getDeviceName("LGAS995", FALLBACK);
    Assert.assertEquals("LGE LG G Flex2", result);
}
public void testDevice3770() throws Exception {
    final String result = DeviceNames.getDeviceName("NOBA", FALLBACK);
    Assert.assertEquals("Nyx mobile NOBA", result);
}
public void testDevice3771() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X160", FALLBACK);
    Assert.assertEquals("LGE LG Max", result);
}
public void testDevice3772() throws Exception {
    final String result = DeviceNames.getDeviceName("MID1065", FALLBACK);
    Assert.assertEquals("Anydata Coby MID1065", result);
}
public void testDevice3773() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LS980", FALLBACK);
    Assert.assertEquals("LG G2", result);
}
public void testDevice3774() throws Exception {
    final String result = DeviceNames.getDeviceName("N762", FALLBACK);
    Assert.assertEquals("ZTE N762", result);
}
public void testDevice3775() throws Exception {
    final String result = DeviceNames.getDeviceName("S6Plus", FALLBACK);
    Assert.assertEquals("Claresta S6Plus", result);
}
public void testDevice3776() throws Exception {
    final String result = DeviceNames.getDeviceName("D5316N", FALLBACK);
    Assert.assertEquals("Sony Xperia T2 Ultra", result);
}
public void testDevice3777() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A5009", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3778() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A5000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3779() throws Exception {
    final String result = DeviceNames.getDeviceName("Huawei-U8687", FALLBACK);
    Assert.assertEquals("Huawei U8687", result);
}
public void testDevice3780() throws Exception {
    final String result = DeviceNames.getDeviceName("Orange_Daytona", FALLBACK);
    Assert.assertEquals("Huawei Ascend G510", result);
}
public void testDevice3781() throws Exception {
    final String result = DeviceNames.getDeviceName("402LG", FALLBACK);
    Assert.assertEquals("LGE Spray", result);
}
public void testDevice3782() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A9000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy-A9(2016)", result);
}
public void testDevice3783() throws Exception {
    final String result = DeviceNames.getDeviceName("7D-501u", FALLBACK);
    Assert.assertEquals("HUAWEI MediaPad X1 7.0", result);
}
public void testDevice3784() throws Exception {
    final String result = DeviceNames.getDeviceName("GravityQuad", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice3785() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G870W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Active", result);
}
public void testDevice3786() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-J5", FALLBACK);
    Assert.assertEquals("TECNO-J5", result);
}
public void testDevice3787() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-J7", FALLBACK);
    Assert.assertEquals("TECNO-J7", result);
}
public void testDevice3788() throws Exception {
    final String result = DeviceNames.getDeviceName("P4501", FALLBACK);
    Assert.assertEquals("Medion P4501", result);
}
public void testDevice3789() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-T677A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy View", result);
}
public void testDevice3790() throws Exception {
    final String result = DeviceNames.getDeviceName("TO101", FALLBACK);
    Assert.assertEquals("ZTE V9", result);
}
public void testDevice3791() throws Exception {
    final String result = DeviceNames.getDeviceName("Trio-Stealth-G4-7", FALLBACK);
    Assert.assertEquals("Trio-Stealth G4 7", result);
}
public void testDevice3792() throws Exception {
    final String result = DeviceNames.getDeviceName("EG978", FALLBACK);
    Assert.assertEquals("SKnetworks EG978TW", result);
}
public void testDevice3793() throws Exception {
    final String result = DeviceNames.getDeviceName("EG970", FALLBACK);
    Assert.assertEquals("Hisense EG970", result);
}
public void testDevice3794() throws Exception {
    final String result = DeviceNames.getDeviceName("Coolpad8750", FALLBACK);
    Assert.assertEquals("Coolpad CP8750", result);
}
public void testDevice3795() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E455", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice3796() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E450", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice3797() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T235Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice3798() throws Exception {
    final String result = DeviceNames.getDeviceName("TPA60W", FALLBACK);
    Assert.assertEquals("Acer TPA60W", result);
}
public void testDevice3799() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N7505", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3 Neo", result);
}
public void testDevice3800() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N7507", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Neo", result);
}
public void testDevice3801() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A775C", FALLBACK);
    Assert.assertEquals("Pantech IM-A775C", result);
}
public void testDevice3802() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N7502", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Neo", result);
}
public void testDevice3803() throws Exception {
    final String result = DeviceNames.getDeviceName("Status", FALLBACK);
    Assert.assertEquals("AG Mobile Status", result);
}
public void testDevice3804() throws Exception {
    final String result = DeviceNames.getDeviceName("TLINK455", FALLBACK);
    Assert.assertEquals("Thomson TLink 455", result);
}
public void testDevice3805() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-LIBRA", FALLBACK);
    Assert.assertEquals("ZTE Blade", result);
}
public void testDevice3806() throws Exception {
    final String result = DeviceNames.getDeviceName("H7S", FALLBACK);
    Assert.assertEquals("Techno H7S", result);
}
public void testDevice3807() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM005SH", FALLBACK);
    Assert.assertEquals("Sharp GALAPAGOS SoftBank 005SH", result);
}
public void testDevice3808() throws Exception {
    final String result = DeviceNames.getDeviceName("YBMK01", FALLBACK);
    Assert.assertEquals("iRiver Wow(Window of the world)", result);
}
public void testDevice3809() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000019-001", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice3810() throws Exception {
    final String result = DeviceNames.getDeviceName("Z793C", FALLBACK);
    Assert.assertEquals("ZTE Z793C", result);
}
public void testDevice3811() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5700R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Spica", result);
}
public void testDevice3812() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-E700H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E7", result);
}
public void testDevice3813() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5700L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Spica", result);
}
public void testDevice3814() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T815N0", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice3815() throws Exception {
    final String result = DeviceNames.getDeviceName("Ultra", FALLBACK);
    Assert.assertEquals("AG Mobile ULTRA", result);
}
public void testDevice3816() throws Exception {
    final String result = DeviceNames.getDeviceName("F3", FALLBACK);
    Assert.assertEquals("BenQ F3", result);
}
public void testDevice3817() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N750L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Neo", result);
}
public void testDevice3818() throws Exception {
    final String result = DeviceNames.getDeviceName("Chacer", FALLBACK);
    Assert.assertEquals("AG Mobile Chacer", result);
}
public void testDevice3819() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P607T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1 2014 Edition", result);
}
public void testDevice3820() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N750K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Neo", result);
}
public void testDevice3821() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N750S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3 Neo", result);
}
public void testDevice3822() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5368", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y", result);
}
public void testDevice3823() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5367", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y TV", result);
}
public void testDevice3824() throws Exception {
    final String result = DeviceNames.getDeviceName("SP355AWG", FALLBACK);
    Assert.assertEquals("BYD SP355AWG", result);
}
public void testDevice3825() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5363", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y", result);
}
public void testDevice3826() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5360", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y", result);
}
public void testDevice3827() throws Exception {
    final String result = DeviceNames.getDeviceName("S201", FALLBACK);
    Assert.assertEquals("SK Telesys K2401", result);
}
public void testDevice3828() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5457DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP5457DUO", result);
}
public void testDevice3829() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3", result);
}
public void testDevice3830() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D410", FALLBACK);
    Assert.assertEquals("LGE L90 Dual", result);
}
public void testDevice3831() throws Exception {
    final String result = DeviceNames.getDeviceName("6016E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6016E", result);
}
public void testDevice3832() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D415", FALLBACK);
    Assert.assertEquals("LG Optimus L90", result);
}
public void testDevice3833() throws Exception {
    final String result = DeviceNames.getDeviceName("6016X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 6016X", result);
}
public void testDevice3834() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM006SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SoftBank 006SH", result);
}
public void testDevice3835() throws Exception {
    final String result = DeviceNames.getDeviceName("A955", FALLBACK);
    Assert.assertEquals("Motorola Droid II", result);
}
public void testDevice3836() throws Exception {
    final String result = DeviceNames.getDeviceName("D2104", FALLBACK);
    Assert.assertEquals("Sony Xperia E1 dual", result);
}
public void testDevice3837() throws Exception {
    final String result = DeviceNames.getDeviceName("D2105", FALLBACK);
    Assert.assertEquals("Sony Xperia E1 dual", result);
}
public void testDevice3838() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7275B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3", result);
}
public void testDevice3839() throws Exception {
    final String result = DeviceNames.getDeviceName("MS3A", FALLBACK);
    Assert.assertEquals("Haier MEGAFON MS3A", result);
}
public void testDevice3840() throws Exception {
    final String result = DeviceNames.getDeviceName("MS3B", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 4033X", result);
}
public void testDevice3841() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_10", FALLBACK);
    Assert.assertEquals("Google Nexus 10", result);
}
public void testDevice3842() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7275T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3", result);
}
public void testDevice3843() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7275R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace 3", result);
}
public void testDevice3844() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7275Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3", result);
}
public void testDevice3845() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V909", FALLBACK);
    Assert.assertEquals("LGE Optimus Pad", result);
}
public void testDevice3846() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V900", FALLBACK);
    Assert.assertEquals("LGE Optimus Pad", result);
}
public void testDevice3847() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V901", FALLBACK);
    Assert.assertEquals("LGE Optimus Pad", result);
}
public void testDevice3848() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL15G", FALLBACK);
    Assert.assertEquals("LGE Y25", result);
}
public void testDevice3849() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9287", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3850() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9280", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3851() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N900W8", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3", result);
}
public void testDevice3852() throws Exception {
    final String result = DeviceNames.getDeviceName("KUNO4", FALLBACK);
    Assert.assertEquals("Archos Kuno", result);
}
public void testDevice3853() throws Exception {
    final String result = DeviceNames.getDeviceName("MID7317CP", FALLBACK);
    Assert.assertEquals("Anydata Auchan MID7317CP Tablet", result);
}
public void testDevice3854() throws Exception {
    final String result = DeviceNames.getDeviceName("GEM-702L", FALLBACK);
    Assert.assertEquals("Huawei X2", result);
}
public void testDevice3855() throws Exception {
    final String result = DeviceNames.getDeviceName("Next7P12", FALLBACK);
    Assert.assertEquals("Anydata Nextbook Next7P12", result);
}
public void testDevice3856() throws Exception {
    final String result = DeviceNames.getDeviceName("MID7055", FALLBACK);
    Assert.assertEquals("Anydata COBY MID7055", result);
}
public void testDevice3857() throws Exception {
    final String result = DeviceNames.getDeviceName("X10a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia X10", result);
}
public void testDevice3858() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-AS990", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice3859() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-AS991", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice3860() throws Exception {
    final String result = DeviceNames.getDeviceName("X10i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia X10", result);
}
public void testDevice3861() throws Exception {
    final String result = DeviceNames.getDeviceName("G527-U081", FALLBACK);
    Assert.assertEquals("Huawei G527", result);
}
public void testDevice3862() throws Exception {
    final String result = DeviceNames.getDeviceName("CT710", FALLBACK);
    Assert.assertEquals("Anydata Carrefour CT710", result);
}
public void testDevice3863() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7580", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Plus", result);
}
public void testDevice3864() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7582", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Duos2", result);
}
public void testDevice3865() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7275", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice3866() throws Exception {
    final String result = DeviceNames.getDeviceName("LT25i", FALLBACK);
    Assert.assertEquals("Sony Xperia V", result);
}
public void testDevice3867() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7270", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace3", result);
}
public void testDevice3868() throws Exception {
    final String result = DeviceNames.getDeviceName("LT25c", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia V", result);
}
public void testDevice3869() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3870() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3871() throws Exception {
    final String result = DeviceNames.getDeviceName("ISW11M", FALLBACK);
    Assert.assertEquals("Motorola Photon 4G", result);
}
public void testDevice3872() throws Exception {
    final String result = DeviceNames.getDeviceName("X100", FALLBACK);
    Assert.assertEquals("Moxee Technologies X100", result);
}
public void testDevice3873() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3874() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3875() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A840S", FALLBACK);
    Assert.assertEquals("Pantech IM-A840S", result);
}
public void testDevice3876() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3877() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3878() throws Exception {
    final String result = DeviceNames.getDeviceName("ISW11F", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Z ISW11F", result);
}
public void testDevice3879() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3880() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1003", FALLBACK);
    Assert.assertEquals("Motorola MOTO G", result);
}
public void testDevice3881() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1002", FALLBACK);
    Assert.assertEquals("Motorola MOTO G", result);
}
public void testDevice3882() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T537V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 10.0", result);
}
public void testDevice3883() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3884() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3404DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3404DUO", result);
}
public void testDevice3885() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_S831X", FALLBACK);
    Assert.assertEquals("Medion LIFETAB S831X", result);
}
public void testDevice3886() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1008", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice3887() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G900AZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice3888() throws Exception {
    final String result = DeviceNames.getDeviceName("Z660G", FALLBACK);
    Assert.assertEquals("ZTE Z660G", result);
}
public void testDevice3889() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G928X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice3890() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_0P6B", FALLBACK);
    Assert.assertEquals("HTC One M8", result);
}
public void testDevice3891() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-S959G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice3892() throws Exception {
    final String result = DeviceNames.getDeviceName("N8303", FALLBACK);
    Assert.assertEquals("ZTE N8303", result);
}
public void testDevice3893() throws Exception {
    final String result = DeviceNames.getDeviceName("Z755", FALLBACK);
    Assert.assertEquals("ZTE Z755", result);
}
public void testDevice3894() throws Exception {
    final String result = DeviceNames.getDeviceName("4035Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 4", result);
}
public void testDevice3895() throws Exception {
    final String result = DeviceNames.getDeviceName("4035X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 4", result);
}
public void testDevice3896() throws Exception {
    final String result = DeviceNames.getDeviceName("4035D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 4", result);
}
public void testDevice3897() throws Exception {
    final String result = DeviceNames.getDeviceName("G2-3GP", FALLBACK);
    Assert.assertEquals("Hisense G2-3GP", result);
}
public void testDevice3898() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-S950C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice3899() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9158P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega Plus", result);
}
public void testDevice3900() throws Exception {
    final String result = DeviceNames.getDeviceName("RTC-tablet", FALLBACK);
    Assert.assertEquals("Asus RTC-700A", result);
}
public void testDevice3901() throws Exception {
    final String result = DeviceNames.getDeviceName("EG668", FALLBACK);
    Assert.assertEquals("SKnetworks EG68BE", result);
}
public void testDevice3902() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-KU5900", FALLBACK);
    Assert.assertEquals("LGE Optimus Black", result);
}
public void testDevice3903() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A830KE", FALLBACK);
    Assert.assertEquals("Pantech IM-A830KE", result);
}
public void testDevice3904() throws Exception {
    final String result = DeviceNames.getDeviceName("vsi8q_1_coho", FALLBACK);
    Assert.assertEquals("ViewSonic ViewPadi8Q", result);
}
public void testDevice3905() throws Exception {
    final String result = DeviceNames.getDeviceName("Primo_NX3", FALLBACK);
    Assert.assertEquals("Walton Primo NX3", result);
}
public void testDevice3906() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-8680", FALLBACK);
    Assert.assertEquals("Cellon EK-8680", result);
}
public void testDevice3907() throws Exception {
    final String result = DeviceNames.getDeviceName("Kurio7S", FALLBACK);
    Assert.assertEquals("KD Interactive Kurio7S", result);
}
public void testDevice3908() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G600FY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy On7", result);
}
public void testDevice3909() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T9", FALLBACK);
    Assert.assertEquals("Hisense HS-T9", result);
}
public void testDevice3910() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace 4", result);
}
public void testDevice3911() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9082", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice3912() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4 Lite", result);
}
public void testDevice3913() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4", result);
}
public void testDevice3914() throws Exception {
    final String result = DeviceNames.getDeviceName("BT210", FALLBACK);
    Assert.assertEquals("Intel Yolo", result);
}
public void testDevice3915() throws Exception {
    final String result = DeviceNames.getDeviceName("Q5S5IN4G", FALLBACK);
    Assert.assertEquals("Auchan Q5S5IN4G", result);
}
public void testDevice3916() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J320P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J3", result);
}
public void testDevice3917() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M585D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Safe", result);
}
public void testDevice3918() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-N910A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 4", result);
}
public void testDevice3919() throws Exception {
    final String result = DeviceNames.getDeviceName("XT610", FALLBACK);
    Assert.assertEquals("Motorola Droid Pro", result);
}
public void testDevice3920() throws Exception {
    final String result = DeviceNames.getDeviceName("XT611", FALLBACK);
    Assert.assertEquals("Motorola Motoluxe", result);
}
public void testDevice3921() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F160LV", FALLBACK);
    Assert.assertEquals("LGE LG optimus LTE2", result);
}
public void testDevice3922() throws Exception {
    final String result = DeviceNames.getDeviceName("XT615", FALLBACK);
    Assert.assertEquals("Motorola Motoluxe", result);
}
public void testDevice3923() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-J900C", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL-J900C", result);
}
public void testDevice3924() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I619", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice3925() throws Exception {
    final String result = DeviceNames.getDeviceName("L50", FALLBACK);
    Assert.assertEquals("Haier L50", result);
}
public void testDevice3926() throws Exception {
    final String result = DeviceNames.getDeviceName("L52", FALLBACK);
    Assert.assertEquals("Haier L52", result);
}
public void testDevice3927() throws Exception {
    final String result = DeviceNames.getDeviceName("L55", FALLBACK);
    Assert.assertEquals("Inhon L55", result);
}
public void testDevice3928() throws Exception {
    final String result = DeviceNames.getDeviceName("NEBUPOS3", FALLBACK);
    Assert.assertEquals("EBN NEBUPOS3", result);
}
public void testDevice3929() throws Exception {
    final String result = DeviceNames.getDeviceName("WX04K", FALLBACK);
    Assert.assertEquals("Kyocera DIGNO Dual", result);
}
public void testDevice3930() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5670B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fit", result);
}
public void testDevice3931() throws Exception {
    final String result = DeviceNames.getDeviceName("STB7012", FALLBACK);
    Assert.assertEquals("Avoca STB7012", result);
}
public void testDevice3932() throws Exception {
    final String result = DeviceNames.getDeviceName("STB7013", FALLBACK);
    Assert.assertEquals("Avoca STB7013", result);
}
public void testDevice3933() throws Exception {
    final String result = DeviceNames.getDeviceName("MotoE2(4G-LTE)", FALLBACK);
    Assert.assertEquals("Moto E2", result);
}
public void testDevice3934() throws Exception {
    final String result = DeviceNames.getDeviceName("Metal_Tablet_10", FALLBACK);
    Assert.assertEquals("TJC Metal Tablet", result);
}
public void testDevice3935() throws Exception {
    final String result = DeviceNames.getDeviceName("S8-303L", FALLBACK);
    Assert.assertEquals("HUAWEI MediaPad M1 8.0", result);
}
public void testDevice3936() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A800YZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A8", result);
}
public void testDevice3937() throws Exception {
    final String result = DeviceNames.getDeviceName("H30-U10", FALLBACK);
    Assert.assertEquals("Huawei Honor3", result);
}
public void testDevice3938() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T999V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice3939() throws Exception {
    final String result = DeviceNames.getDeviceName("D6616", FALLBACK);
    Assert.assertEquals("Sony Xperiz Z3", result);
}
public void testDevice3940() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T999L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice3941() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T999N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice3942() throws Exception {
    final String result = DeviceNames.getDeviceName("H30-L02", FALLBACK);
    Assert.assertEquals("Huawei H30-L02", result);
}
public void testDevice3943() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500XZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice3944() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00TD", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 Laser (ZE551KL)", result);
}
public void testDevice3945() throws Exception {
    final String result = DeviceNames.getDeviceName("9020A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 9020A", result);
}
public void testDevice3946() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H968", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice3947() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-SU880", FALLBACK);
    Assert.assertEquals("LGE Optimus EX", result);
}
public void testDevice3948() throws Exception {
    final String result = DeviceNames.getDeviceName("A80RG11", FALLBACK);
    Assert.assertEquals("Archos Quechua Tablet 8", result);
}
public void testDevice3949() throws Exception {
    final String result = DeviceNames.getDeviceName("RM02", FALLBACK);
    Assert.assertEquals("Fujitsu RM02", result);
}
public void testDevice3950() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I407", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Amp", result);
}
public void testDevice3951() throws Exception {
    final String result = DeviceNames.getDeviceName("A720", FALLBACK);
    Assert.assertEquals("AZPEN A720", result);
}
public void testDevice3952() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-L720T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice3953() throws Exception {
    final String result = DeviceNames.getDeviceName("HS_9DTB37", FALLBACK);
    Assert.assertEquals("Haier HS-9DTB37", result);
}
public void testDevice3954() throws Exception {
    final String result = DeviceNames.getDeviceName("DA220HQL", FALLBACK);
    Assert.assertEquals("Acer DA220HQL", result);
}
public void testDevice3955() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P970", FALLBACK);
    Assert.assertEquals("LGE Optimus Black", result);
}
public void testDevice3956() throws Exception {
    final String result = DeviceNames.getDeviceName("C8817D", FALLBACK);
    Assert.assertEquals("Huawei C8817D", result);
}
public void testDevice3957() throws Exception {
    final String result = DeviceNames.getDeviceName("A853", FALLBACK);
    Assert.assertEquals("Motorola Droid", result);
}
public void testDevice3958() throws Exception {
    final String result = DeviceNames.getDeviceName("A854", FALLBACK);
    Assert.assertEquals("Motorola Droid", result);
}
public void testDevice3959() throws Exception {
    final String result = DeviceNames.getDeviceName("4003J", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4)", result);
}
public void testDevice3960() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-55LE860M", FALLBACK);
    Assert.assertEquals("Sharp LC-55LE860M", result);
}
public void testDevice3961() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-55LE860H", FALLBACK);
    Assert.assertEquals("Sharp LC-55LE860H", result);
}
public void testDevice3962() throws Exception {
    final String result = DeviceNames.getDeviceName("4003A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4)", result);
}
public void testDevice3963() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M340L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy M Style", result);
}
public void testDevice3964() throws Exception {
    final String result = DeviceNames.getDeviceName("HTCD200LVWPP", FALLBACK);
    Assert.assertEquals("HTC Desire 626", result);
}
public void testDevice3965() throws Exception {
    final String result = DeviceNames.getDeviceName("LED58XT880G3D", FALLBACK);
    Assert.assertEquals("Hisense LED58XT880G3D", result);
}
public void testDevice3966() throws Exception {
    final String result = DeviceNames.getDeviceName("QMV7A", FALLBACK);
    Assert.assertEquals("Verizon Ellipsis 7", result);
}
public void testDevice3967() throws Exception {
    final String result = DeviceNames.getDeviceName("QMV7B", FALLBACK);
    Assert.assertEquals("Verizon Wireless Ellipsis 7 (QMV7B)", result);
}
public void testDevice3968() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9505", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice3969() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9507", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice3970() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9506", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice3971() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9500", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice3972() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9502", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Duos", result);
}
public void testDevice3973() throws Exception {
    final String result = DeviceNames.getDeviceName("IS17SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE CL IS17SH", result);
}
public void testDevice3974() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9508", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice3975() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T211M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 7.0", result);
}
public void testDevice3976() throws Exception {
    final String result = DeviceNames.getDeviceName("RCS13101T", FALLBACK);
    Assert.assertEquals("RCA RCS13101T", result);
}
public void testDevice3977() throws Exception {
    final String result = DeviceNames.getDeviceName("9788", FALLBACK);
    Assert.assertEquals("Gigabyte 9788", result);
}
public void testDevice3978() throws Exception {
    final String result = DeviceNames.getDeviceName("K007", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 7 (ME572C)", result);
}
public void testDevice3979() throws Exception {
    final String result = DeviceNames.getDeviceName("K00L", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad HD 8 (ME180A)", result);
}
public void testDevice3980() throws Exception {
    final String result = DeviceNames.getDeviceName("LEMENT_TAB901", FALLBACK);
    Assert.assertEquals("Logicom LEMENTTAB901", result);
}
public void testDevice3981() throws Exception {
    final String result = DeviceNames.getDeviceName("K00E", FALLBACK);
    Assert.assertEquals("Asus Fonepad 7 (ME372CG)", result);
}
public void testDevice3982() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X147", FALLBACK);
    Assert.assertEquals("LGE L60", result);
}
public void testDevice3983() throws Exception {
    final String result = DeviceNames.getDeviceName("K00G", FALLBACK);
    Assert.assertEquals("Asus Fonepad Note 6 (ME560CG)", result);
}
public void testDevice3984() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X145", FALLBACK);
    Assert.assertEquals("LGE L60", result);
}
public void testDevice3985() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-X140", FALLBACK);
    Assert.assertEquals("LGE L60", result);
}
public void testDevice3986() throws Exception {
    final String result = DeviceNames.getDeviceName("K00Y", FALLBACK);
    Assert.assertEquals("Asus Fonepad 7 LTE (ME372CL)", result);
}
public void testDevice3987() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F320K", FALLBACK);
    Assert.assertEquals("LGE LG G2", result);
}
public void testDevice3988() throws Exception {
    final String result = DeviceNames.getDeviceName("K00Z", FALLBACK);
    Assert.assertEquals("Asus Fonepad 7 (ME175CG)", result);
}
public void testDevice3989() throws Exception {
    final String result = DeviceNames.getDeviceName("K00U", FALLBACK);
    Assert.assertEquals("Asus MeMo Pad HD 7 (ME173XX)", result);
}
public void testDevice3990() throws Exception {
    final String result = DeviceNames.getDeviceName("K00R", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad 7 LTE (ME572CL)", result);
}
public void testDevice3991() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F240K", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G Pro", result);
}
public void testDevice3992() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F240L", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G Pro", result);
}
public void testDevice3993() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-S906L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice3994() throws Exception {
    final String result = DeviceNames.getDeviceName("HUAWEI_P6-U06", FALLBACK);
    Assert.assertEquals("Huawei Ascend P6", result);
}
public void testDevice3995() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F240S", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G Pro", result);
}
public void testDevice3996() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F400L", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice3997() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F400K", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice3998() throws Exception {
    final String result = DeviceNames.getDeviceName("Preo_P2", FALLBACK);
    Assert.assertEquals("Teknosa Preo P2", result);
}
public void testDevice3999() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F400S", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice4000() throws Exception {
    final String result = DeviceNames.getDeviceName("IN810", FALLBACK);
    Assert.assertEquals("Infocus IN810", result);
}
public void testDevice4001() throws Exception {
    final String result = DeviceNames.getDeviceName("IN815", FALLBACK);
    Assert.assertEquals("Infocus IN815", result);
}
public void testDevice4002() throws Exception {
    final String result = DeviceNames.getDeviceName("MiSS", FALLBACK);
    Assert.assertEquals("Bunbungame MiSS", result);
}
public void testDevice4003() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5300L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket", result);
}
public void testDevice4004() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5300B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket", result);
}
public void testDevice4005() throws Exception {
    final String result = DeviceNames.getDeviceName("DROID4", FALLBACK);
    Assert.assertEquals("Motorola Droid 4", result);
}
public void testDevice4006() throws Exception {
    final String result = DeviceNames.getDeviceName("DROID2", FALLBACK);
    Assert.assertEquals("Motorola Droid 2", result);
}
public void testDevice4007() throws Exception {
    final String result = DeviceNames.getDeviceName("DROID3", FALLBACK);
    Assert.assertEquals("Motorola Droid 3", result);
}
public void testDevice4008() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5507DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP5507DUO", result);
}
public void testDevice4009() throws Exception {
    final String result = DeviceNames.getDeviceName("TC8000", FALLBACK);
    Assert.assertEquals("Zebra TC8000", result);
}
public void testDevice4010() throws Exception {
    final String result = DeviceNames.getDeviceName("TDA02", FALLBACK);
    Assert.assertEquals("FBC M24IS810", result);
}
public void testDevice4011() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_AB7DC", FALLBACK);
    Assert.assertEquals("Positivo AB7D", result);
}
public void testDevice4012() throws Exception {
    final String result = DeviceNames.getDeviceName("EG950", FALLBACK);
    Assert.assertEquals("Hisense EG950", result);
}
public void testDevice4013() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9105P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 Plus", result);
}
public void testDevice4014() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I400", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Continuum", result);
}
public void testDevice4015() throws Exception {
    final String result = DeviceNames.getDeviceName("CT2200", FALLBACK);
    Assert.assertEquals("Quanta CT2200", result);
}
public void testDevice4016() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I405", FALLBACK);
    Assert.assertEquals("Samsung Stratosphere", result);
}
public void testDevice4017() throws Exception {
    final String result = DeviceNames.getDeviceName("WALKMAN", FALLBACK);
    Assert.assertEquals("Sony NW-ZX1", result);
}
public void testDevice4018() throws Exception {
    final String result = DeviceNames.getDeviceName("SOT31", FALLBACK);
    Assert.assertEquals("Sony Xperia Z4 Tablet", result);
}
public void testDevice4019() throws Exception {
    final String result = DeviceNames.getDeviceName("NEO7-1", FALLBACK);
    Assert.assertEquals("Haier NEO7-1", result);
}
public void testDevice4020() throws Exception {
    final String result = DeviceNames.getDeviceName("NEO7-2", FALLBACK);
    Assert.assertEquals("Haier NEO7-2", result);
}
public void testDevice4021() throws Exception {
    final String result = DeviceNames.getDeviceName("LT-W1", FALLBACK);
    Assert.assertEquals("Hisense E100TAE", result);
}
public void testDevice4022() throws Exception {
    final String result = DeviceNames.getDeviceName("D2-721G", FALLBACK);
    Assert.assertEquals("Haier D2-721", result);
}
public void testDevice4023() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P605V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1 2014 Edition", result);
}
public void testDevice4024() throws Exception {
    final String result = DeviceNames.getDeviceName("DROIDX", FALLBACK);
    Assert.assertEquals("Motorola Droid X", result);
}
public void testDevice4025() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P605S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice4026() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Transformer_Pad_TF300T", FALLBACK);
    Assert.assertEquals("Asus Transformer Pad", result);
}
public void testDevice4027() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P605L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice4028() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P605M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1 2014 Edition", result);
}
public void testDevice4029() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P605K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice4030() throws Exception {
    final String result = DeviceNames.getDeviceName("TM785M3", FALLBACK);
    Assert.assertEquals("Nuvision TM785M3", result);
}
public void testDevice4031() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G5108Q", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Max Duos", result);
}
public void testDevice4032() throws Exception {
    final String result = DeviceNames.getDeviceName("st70408_4", FALLBACK);
    Assert.assertEquals("Trekstor SurfTab xintron i 7.0", result);
}
public void testDevice4033() throws Exception {
    final String result = DeviceNames.getDeviceName("HUAWEI_G510-0251", FALLBACK);
    Assert.assertEquals("Huawei Ascend G510", result);
}
public void testDevice4034() throws Exception {
    final String result = DeviceNames.getDeviceName("ST7/ST7x", FALLBACK);
    Assert.assertEquals("Southern Telecom Smartab ST7", result);
}
public void testDevice4035() throws Exception {
    final String result = DeviceNames.getDeviceName("PI3110", FALLBACK);
    Assert.assertEquals("Philips PI3110", result);
}
public void testDevice4036() throws Exception {
    final String result = DeviceNames.getDeviceName("PE-TL10", FALLBACK);
    Assert.assertEquals("Huawei PE-TL10", result);
}
public void testDevice4037() throws Exception {
    final String result = DeviceNames.getDeviceName("AND1E", FALLBACK);
    Assert.assertEquals("Philips Android 2014", result);
}
public void testDevice4038() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7273T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 Duos TV", result);
}
public void testDevice4039() throws Exception {
    final String result = DeviceNames.getDeviceName("M01T", FALLBACK);
    Assert.assertEquals("Fujitsu arrows Tab M01T", result);
}
public void testDevice4040() throws Exception {
    final String result = DeviceNames.getDeviceName("MH350", FALLBACK);
    Assert.assertEquals("Fujitsu STYLISTIC MH350", result);
}
public void testDevice4041() throws Exception {
    final String result = DeviceNames.getDeviceName("I10A-LE", FALLBACK);
    Assert.assertEquals("Anydata Leader I10A-LE", result);
}
public void testDevice4042() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-L600", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice4043() throws Exception {
    final String result = DeviceNames.getDeviceName("MTN-S720i", FALLBACK);
    Assert.assertEquals("MTN-S720i", result);
}
public void testDevice4044() throws Exception {
    final String result = DeviceNames.getDeviceName("6036A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Idol2 MINI S", result);
}
public void testDevice4045() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC6515LVW", FALLBACK);
    Assert.assertEquals("HTC One remix", result);
}
public void testDevice4046() throws Exception {
    final String result = DeviceNames.getDeviceName("6036X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Idol2 MINI S", result);
}
public void testDevice4047() throws Exception {
    final String result = DeviceNames.getDeviceName("6036Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Idol2 MINI S", result);
}
public void testDevice4048() throws Exception {
    final String result = DeviceNames.getDeviceName("A111", FALLBACK);
    Assert.assertEquals("Micromax A111", result);
}
public void testDevice4049() throws Exception {
    final String result = DeviceNames.getDeviceName("A110", FALLBACK);
    Assert.assertEquals("Acer A110", result);
}
public void testDevice4050() throws Exception {
    final String result = DeviceNames.getDeviceName("A116", FALLBACK);
    Assert.assertEquals("Micromax A116", result);
}
public void testDevice4051() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00UDA", FALLBACK);
    Assert.assertEquals("Asus ZenFone Selfie (ZD551KL)", result);
}
public void testDevice4052() throws Exception {
    final String result = DeviceNames.getDeviceName("Garminfone", FALLBACK);
    Assert.assertEquals("Garmin Nuvifone", result);
}
public void testDevice4053() throws Exception {
    final String result = DeviceNames.getDeviceName("GN9010L", FALLBACK);
    Assert.assertEquals("Gionee GN9010L", result);
}
public void testDevice4054() throws Exception {
    final String result = DeviceNames.getDeviceName("304SH", FALLBACK);
    Assert.assertEquals("Sharp AQUOS Xx 304SH", result);
}
public void testDevice4055() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A5100X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice4056() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G730W8", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Mini", result);
}
public void testDevice4057() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I747", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III", result);
}
public void testDevice4058() throws Exception {
    final String result = DeviceNames.getDeviceName("SMART63", FALLBACK);
    Assert.assertEquals("Binatone Smart 63", result);
}
public void testDevice4059() throws Exception {
    final String result = DeviceNames.getDeviceName("SMART66", FALLBACK);
    Assert.assertEquals("Binatone Smart 66", result);
}
public void testDevice4060() throws Exception {
    final String result = DeviceNames.getDeviceName("A11t", FALLBACK);
    Assert.assertEquals("Oppo A11t", result);
}
public void testDevice4061() throws Exception {
    final String result = DeviceNames.getDeviceName("A11w", FALLBACK);
    Assert.assertEquals("OPPO A11w", result);
}
public void testDevice4062() throws Exception {
    final String result = DeviceNames.getDeviceName("Baker", FALLBACK);
    Assert.assertEquals("ZTE Baker", result);
}
public void testDevice4063() throws Exception {
    final String result = DeviceNames.getDeviceName("PC_Smart_PTSGOB8", FALLBACK);
    Assert.assertEquals("PC Smart PTSGOB8", result);
}
public void testDevice4064() throws Exception {
    final String result = DeviceNames.getDeviceName("A11f", FALLBACK);
    Assert.assertEquals("Oppo A11f", result);
}
public void testDevice4065() throws Exception {
    final String result = DeviceNames.getDeviceName("V975", FALLBACK);
    Assert.assertEquals("ZTE V975", result);
}
public void testDevice4066() throws Exception {
    final String result = DeviceNames.getDeviceName("Lenovo_A2105", FALLBACK);
    Assert.assertEquals("Lenovo A2105", result);
}
public void testDevice4067() throws Exception {
    final String result = DeviceNames.getDeviceName("AC50BHE", FALLBACK);
    Assert.assertEquals("Archos 50b Helium", result);
}
public void testDevice4068() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1028", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice4069() throws Exception {
    final String result = DeviceNames.getDeviceName("ISW13F", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Z ISW13F", result);
}
public void testDevice4070() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1023", FALLBACK);
    Assert.assertEquals("Motorola Moto E", result);
}
public void testDevice4071() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1022", FALLBACK);
    Assert.assertEquals("Motorola Moto E", result);
}
public void testDevice4072() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1021", FALLBACK);
    Assert.assertEquals("Motorola Moto X Play", result);
}
public void testDevice4073() throws Exception {
    final String result = DeviceNames.getDeviceName("C8660", FALLBACK);
    Assert.assertEquals("Cellon SM55", result);
}
public void testDevice4074() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M100S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A", result);
}
public void testDevice4075() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_TQ7", FALLBACK);
    Assert.assertEquals("Positivo Ypy TQ7", result);
}
public void testDevice4076() throws Exception {
    final String result = DeviceNames.getDeviceName("T1-701u", FALLBACK);
    Assert.assertEquals("Huawei MediaPad", result);
}
public void testDevice4077() throws Exception {
    final String result = DeviceNames.getDeviceName("AS740", FALLBACK);
    Assert.assertEquals("LGE Ally", result);
}
public void testDevice4078() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-LX565H", FALLBACK);
    Assert.assertEquals("Sharp LC-LX565H", result);
}
public void testDevice4079() throws Exception {
    final String result = DeviceNames.getDeviceName("TH805", FALLBACK);
    Assert.assertEquals("Thinpad TH805", result);
}
public void testDevice4080() throws Exception {
    final String result = DeviceNames.getDeviceName("N1T", FALLBACK);
    Assert.assertEquals("Oppo N1T", result);
}
public void testDevice4081() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-P600", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice4082() throws Exception {
    final String result = DeviceNames.getDeviceName("STB8098", FALLBACK);
    Assert.assertEquals("Avoca STB8098", result);
}
public void testDevice4083() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G928A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge+", result);
}
public void testDevice4084() throws Exception {
    final String result = DeviceNames.getDeviceName("LS-5503", FALLBACK);
    Assert.assertEquals("ZTE Blade S6 Plus", result);
}
public void testDevice4085() throws Exception {
    final String result = DeviceNames.getDeviceName("CARBON_PRO4543", FALLBACK);
    Assert.assertEquals("Polaroid V45M", result);
}
public void testDevice4086() throws Exception {
    final String result = DeviceNames.getDeviceName("R7007", FALLBACK);
    Assert.assertEquals("OPPO R7007", result);
}
public void testDevice4087() throws Exception {
    final String result = DeviceNames.getDeviceName("R7005", FALLBACK);
    Assert.assertEquals("Oppo R7005", result);
}
public void testDevice4088() throws Exception {
    final String result = DeviceNames.getDeviceName("TP601C", FALLBACK);
    Assert.assertEquals("Neffos C5L", result);
}
public void testDevice4089() throws Exception {
    final String result = DeviceNames.getDeviceName("TP601B", FALLBACK);
    Assert.assertEquals("Neffos C5L", result);
}
public void testDevice4090() throws Exception {
    final String result = DeviceNames.getDeviceName("TP601A", FALLBACK);
    Assert.assertEquals("Neffos C5L", result);
}
public void testDevice4091() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H525n", FALLBACK);
    Assert.assertEquals("LGE LG G4c", result);
}
public void testDevice4092() throws Exception {
    final String result = DeviceNames.getDeviceName("Z00D", FALLBACK);
    Assert.assertEquals("Asus ZenFone 2 (ZE500CL)", result);
}
public void testDevice4093() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E985T", FALLBACK);
    Assert.assertEquals("LGE LG-E985T", result);
}
public void testDevice4094() throws Exception {
    final String result = DeviceNames.getDeviceName("ME172V", FALLBACK);
    Assert.assertEquals("Asus MeMO PAD", result);
}
public void testDevice4095() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG916", FALLBACK);
    Assert.assertEquals("HIsense HS-EG916", result);
}
public void testDevice4096() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A510S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5(2016)", result);
}
public void testDevice4097() throws Exception {
    final String result = DeviceNames.getDeviceName("E350", FALLBACK);
    Assert.assertEquals("Logicom E350", result);
}
public void testDevice4098() throws Exception {
    final String result = DeviceNames.getDeviceName("Dslide971DC", FALLBACK);
    Assert.assertEquals("DANEW Dslide971DC", result);
}
public void testDevice4099() throws Exception {
    final String result = DeviceNames.getDeviceName("VIA-T7D-3G", FALLBACK);
    Assert.assertEquals("Casper VIA T7D 3G", result);
}
public void testDevice4100() throws Exception {
    final String result = DeviceNames.getDeviceName("Torque", FALLBACK);
    Assert.assertEquals("Kyocera Torque", result);
}
public void testDevice4101() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I748", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice4102() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G313ML", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4", result);
}
public void testDevice4103() throws Exception {
    final String result = DeviceNames.getDeviceName("T-Mobile_G2", FALLBACK);
    Assert.assertEquals("T-Mobile G2", result);
}
public void testDevice4104() throws Exception {
    final String result = DeviceNames.getDeviceName("HP_10_Tablet", FALLBACK);
    Assert.assertEquals("HP Tablet 10", result);
}
public void testDevice4105() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire_510", FALLBACK);
    Assert.assertEquals("HTC Desire 510", result);
}
public void testDevice4106() throws Exception {
    final String result = DeviceNames.getDeviceName("BT230", FALLBACK);
    Assert.assertEquals("Intel Etisalat E-20", result);
}
public void testDevice4107() throws Exception {
    final String result = DeviceNames.getDeviceName("LED40K360J", FALLBACK);
    Assert.assertEquals("Hisense LED40K360J", result);
}
public void testDevice4108() throws Exception {
    final String result = DeviceNames.getDeviceName("E5606", FALLBACK);
    Assert.assertEquals("Sony Xperia M5", result);
}
public void testDevice4109() throws Exception {
    final String result = DeviceNames.getDeviceName("E5603", FALLBACK);
    Assert.assertEquals("Sony Xperia M5", result);
}
public void testDevice4110() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-X68T", FALLBACK);
    Assert.assertEquals("Hisense HS-X68T", result);
}
public void testDevice4111() throws Exception {
    final String result = DeviceNames.getDeviceName("JM-250", FALLBACK);
    Assert.assertEquals("BenQ JM-250", result);
}
public void testDevice4112() throws Exception {
    final String result = DeviceNames.getDeviceName("G620-L75", FALLBACK);
    Assert.assertEquals("Huawei G620-L75", result);
}
public void testDevice4113() throws Exception {
    final String result = DeviceNames.getDeviceName("E6553", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3+", result);
}
public void testDevice4114() throws Exception {
    final String result = DeviceNames.getDeviceName("OT-310", FALLBACK);
    Assert.assertEquals("Partner OT-310", result);
}
public void testDevice4115() throws Exception {
    final String result = DeviceNames.getDeviceName("PNDPP410GP", FALLBACK);
    Assert.assertEquals("Haier PNDPP410GP", result);
}
public void testDevice4116() throws Exception {
    final String result = DeviceNames.getDeviceName("FLOW", FALLBACK);
    Assert.assertEquals("Lechpol FLOW", result);
}
public void testDevice4117() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A730S", FALLBACK);
    Assert.assertEquals("Pantech IM-A730S", result);
}
public void testDevice4118() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530BT", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice4119() throws Exception {
    final String result = DeviceNames.getDeviceName("SKT01", FALLBACK);
    Assert.assertEquals("Kyocera TORQUE", result);
}
public void testDevice4120() throws Exception {
    final String result = DeviceNames.getDeviceName("G6", FALLBACK);
    Assert.assertEquals("Claresta G6", result);
}
public void testDevice4121() throws Exception {
    final String result = DeviceNames.getDeviceName("G5", FALLBACK);
    Assert.assertEquals("Claresta G5", result);
}
public void testDevice4122() throws Exception {
    final String result = DeviceNames.getDeviceName("G4", FALLBACK);
    Assert.assertEquals("Claresta G4", result);
}
public void testDevice4123() throws Exception {
    final String result = DeviceNames.getDeviceName("G3", FALLBACK);
    Assert.assertEquals("BYD INHON G3", result);
}
public void testDevice4124() throws Exception {
    final String result = DeviceNames.getDeviceName("G1", FALLBACK);
    Assert.assertEquals("Hisense G1", result);
}
public void testDevice4125() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G870A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Active", result);
}
public void testDevice4126() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F310LR", FALLBACK);
    Assert.assertEquals("LGE LG Gx", result);
}
public void testDevice4127() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Transformer_Pad_TF700T", FALLBACK);
    Assert.assertEquals("ASUS Transformer Pad Infinity", result);
}
public void testDevice4128() throws Exception {
    final String result = DeviceNames.getDeviceName("D6633", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3 Dual", result);
}
public void testDevice4129() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5660", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Gio", result);
}
public void testDevice4130() throws Exception {
    final String result = DeviceNames.getDeviceName("C-4", FALLBACK);
    Assert.assertEquals("Hisense C-4", result);
}
public void testDevice4131() throws Exception {
    final String result = DeviceNames.getDeviceName("P778A", FALLBACK);
    Assert.assertEquals("Anydata HKC P778A", result);
}
public void testDevice4132() throws Exception {
    final String result = DeviceNames.getDeviceName("C2004", FALLBACK);
    Assert.assertEquals("Sony Xperia M dual", result);
}
public void testDevice4133() throws Exception {
    final String result = DeviceNames.getDeviceName("C2005", FALLBACK);
    Assert.assertEquals("Sony Xperia M dual", result);
}
public void testDevice4134() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-10D", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE sv SH-10D", result);
}
public void testDevice4135() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-10B", FALLBACK);
    Assert.assertEquals("Sharp LYNX SH-10B", result);
}
public void testDevice4136() throws Exception {
    final String result = DeviceNames.getDeviceName("C6833", FALLBACK);
    Assert.assertEquals("Sony Xperia Z Ultra", result);
}
public void testDevice4137() throws Exception {
    final String result = DeviceNames.getDeviceName("9022X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONETOUCH PIXI 3 (8)", result);
}
public void testDevice4138() throws Exception {
    final String result = DeviceNames.getDeviceName("DM013SH", FALLBACK);
    Assert.assertEquals("Sharp DM013SH", result);
}
public void testDevice4139() throws Exception {
    final String result = DeviceNames.getDeviceName("bq_Aquaris_5", FALLBACK);
    Assert.assertEquals("bq Aquaris 5", result);
}
public void testDevice4140() throws Exception {
    final String result = DeviceNames.getDeviceName("S5.1", FALLBACK);
    Assert.assertEquals("Gionee S5.1", result);
}
public void testDevice4141() throws Exception {
    final String result = DeviceNames.getDeviceName("S5.5", FALLBACK);
    Assert.assertEquals("Gionee S5.5", result);
}
public void testDevice4142() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_9", FALLBACK);
    Assert.assertEquals("Nexus 9", result);
}
public void testDevice4143() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_7", FALLBACK);
    Assert.assertEquals("Asus Nexus 7", result);
}
public void testDevice4144() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_6", FALLBACK);
    Assert.assertEquals("Nexus 6", result);
}
public void testDevice4145() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_5", FALLBACK);
    Assert.assertEquals("Nexus 5", result);
}
public void testDevice4146() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_4", FALLBACK);
    Assert.assertEquals("Google Nexus 4", result);
}
public void testDevice4147() throws Exception {
    final String result = DeviceNames.getDeviceName("C3668", FALLBACK);
    Assert.assertEquals("Cellon C3668", result);
}
public void testDevice4148() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A830L", FALLBACK);
    Assert.assertEquals("Pantech IM-A830L", result);
}
public void testDevice4149() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A830K", FALLBACK);
    Assert.assertEquals("Pantech IM-A830K", result);
}
public void testDevice4150() throws Exception {
    final String result = DeviceNames.getDeviceName("LT-NA7", FALLBACK);
    Assert.assertEquals("NEC LifeTouch Note", result);
}
public void testDevice4151() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_M9u", FALLBACK);
    Assert.assertEquals("HTC One M9", result);
}
public void testDevice4152() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A830S", FALLBACK);
    Assert.assertEquals("Pantech IM-A830S", result);
}
public void testDevice4153() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-J210C", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL J210C", result);
}
public void testDevice4154() throws Exception {
    final String result = DeviceNames.getDeviceName("Nexus_S", FALLBACK);
    Assert.assertEquals("Samsung Nexus S", result);
}
public void testDevice4155() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E411g", FALLBACK);
    Assert.assertEquals("LG Optimus L1 II", result);
}
public void testDevice4156() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E411f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice4157() throws Exception {
    final String result = DeviceNames.getDeviceName("CP-DX80", FALLBACK);
    Assert.assertEquals("Cisco Desktop Collaboration Experience DX80", result);
}
public void testDevice4158() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P355M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice4159() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_X+", FALLBACK);
    Assert.assertEquals("HTC One X+", result);
}
public void testDevice4160() throws Exception {
    final String result = DeviceNames.getDeviceName("Essentielb-Pixis", FALLBACK);
    Assert.assertEquals("essentielb Pyxis", result);
}
public void testDevice4161() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Desire_HD_A9191", FALLBACK);
    Assert.assertEquals("HTC Desire HD", result);
}
public void testDevice4162() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T350", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice4163() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T355", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice4164() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D125", FALLBACK);
    Assert.assertEquals("LGE L30 Sporty", result);
}
public void testDevice4165() throws Exception {
    final String result = DeviceNames.getDeviceName("DM014SH", FALLBACK);
    Assert.assertEquals("Sharp Disney Mobile DM014SH", result);
}
public void testDevice4166() throws Exception {
    final String result = DeviceNames.getDeviceName("PI3210G", FALLBACK);
    Assert.assertEquals("Philips PI3210G", result);
}
public void testDevice4167() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D120", FALLBACK);
    Assert.assertEquals("LGE L30 Sporty", result);
}
public void testDevice4168() throws Exception {
    final String result = DeviceNames.getDeviceName("DL700D", FALLBACK);
    Assert.assertEquals("DigiLand DL700D", result);
}
public void testDevice4169() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-10DTB41-8GB", FALLBACK);
    Assert.assertEquals("Hipstreet HS-10DTB41-8GB", result);
}
public void testDevice4170() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_918", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 918", result);
}
public void testDevice4171() throws Exception {
    final String result = DeviceNames.getDeviceName("SpeedTAB", FALLBACK);
    Assert.assertEquals("HUAWEI MediaPad 10 Link+", result);
}
public void testDevice4172() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7580L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Plus", result);
}
public void testDevice4173() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7580E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend Plus", result);
}
public void testDevice4174() throws Exception {
    final String result = DeviceNames.getDeviceName("N720", FALLBACK);
    Assert.assertEquals("ZTE N720", result);
}
public void testDevice4175() throws Exception {
    final String result = DeviceNames.getDeviceName("W55", FALLBACK);
    Assert.assertEquals("Qilive W55", result);
}
public void testDevice4176() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_XL", FALLBACK);
    Assert.assertEquals("HTC One XL", result);
}
public void testDevice4177() throws Exception {
    final String result = DeviceNames.getDeviceName("MT2L03", FALLBACK);
    Assert.assertEquals("Huawei MT2L03LITE", result);
}
public void testDevice4178() throws Exception {
    final String result = DeviceNames.getDeviceName("LGMS345", FALLBACK);
    Assert.assertEquals("LGE LG Leon 4G LTE", result);
}
public void testDevice4179() throws Exception {
    final String result = DeviceNames.getDeviceName("E10i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia X10 Mini", result);
}
public void testDevice4180() throws Exception {
    final String result = DeviceNames.getDeviceName("E10a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia X10 mini", result);
}
public void testDevice4181() throws Exception {
    final String result = DeviceNames.getDeviceName("Coolpad_5218D", FALLBACK);
    Assert.assertEquals("Coolpad5218D", result);
}
public void testDevice4182() throws Exception {
    final String result = DeviceNames.getDeviceName("R829T", FALLBACK);
    Assert.assertEquals("OPPO R829T", result);
}
public void testDevice4183() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T239M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice4184() throws Exception {
    final String result = DeviceNames.getDeviceName("5025X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)", result);
}
public void testDevice4185() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T239C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice4186() throws Exception {
    final String result = DeviceNames.getDeviceName("D2-M", FALLBACK);
    Assert.assertEquals("Hisense D2-M", result);
}
public void testDevice4187() throws Exception {
    final String result = DeviceNames.getDeviceName("5016A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)", result);
}
public void testDevice4188() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7777", FALLBACK);
    Assert.assertEquals("Anydata Proscan PLT7777", result);
}
public void testDevice4189() throws Exception {
    final String result = DeviceNames.getDeviceName("5025E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)", result);
}
public void testDevice4190() throws Exception {
    final String result = DeviceNames.getDeviceName("5025D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)", result);
}
public void testDevice4191() throws Exception {
    final String result = DeviceNames.getDeviceName("5025G", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)", result);
}
public void testDevice4192() throws Exception {
    final String result = DeviceNames.getDeviceName("5070D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5070D", result);
}
public void testDevice4193() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5312M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4194() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5312L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4195() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G750A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega2", result);
}
public void testDevice4196() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5312C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4197() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5312B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4198() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8258", FALLBACK);
    Assert.assertEquals("Samsung Galaxy M Style", result);
}
public void testDevice4199() throws Exception {
    final String result = DeviceNames.getDeviceName("5016J", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)", result);
}
public void testDevice4200() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8250", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Beam", result);
}
public void testDevice4201() throws Exception {
    final String result = DeviceNames.getDeviceName("TBQG774", FALLBACK);
    Assert.assertEquals("Zeki TBQG774", result);
}
public void testDevice4202() throws Exception {
    final String result = DeviceNames.getDeviceName("14A-DA", FALLBACK);
    Assert.assertEquals("Honda A-DA", result);
}
public void testDevice4203() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E410", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice4204() throws Exception {
    final String result = DeviceNames.getDeviceName("LGMS395", FALLBACK);
    Assert.assertEquals("LG Optimus F60", result);
}
public void testDevice4205() throws Exception {
    final String result = DeviceNames.getDeviceName("Vortex", FALLBACK);
    Assert.assertEquals("LGE Optimus One", result);
}
public void testDevice4206() throws Exception {
    final String result = DeviceNames.getDeviceName("VP700", FALLBACK);
    Assert.assertEquals("Foxconn vizio VP700", result);
}
public void testDevice4207() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E985", FALLBACK);
    Assert.assertEquals("LGE LG-E985T", result);
}
public void testDevice4208() throws Exception {
    final String result = DeviceNames.getDeviceName("X600", FALLBACK);
    Assert.assertEquals("Letv x600", result);
}
public void testDevice4209() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T2397", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice4210() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E986", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G Pro", result);
}
public void testDevice4211() throws Exception {
    final String result = DeviceNames.getDeviceName("TM785CH", FALLBACK);
    Assert.assertEquals("Apex TM785CH", result);
}
public void testDevice4212() throws Exception {
    final String result = DeviceNames.getDeviceName("VF-1497", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) VF-1497", result);
}
public void testDevice4213() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6792L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame Lite Duos", result);
}
public void testDevice4214() throws Exception {
    final String result = DeviceNames.getDeviceName("GR-TB7", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH T10", result);
}
public void testDevice4215() throws Exception {
    final String result = DeviceNames.getDeviceName("F5070", FALLBACK);
    Assert.assertEquals("Hisense F5070", result);
}
public void testDevice4216() throws Exception {
    final String result = DeviceNames.getDeviceName("EverClassic", FALLBACK);
    Assert.assertEquals("Enspert WIKO CINK PEAX", result);
}
public void testDevice4217() throws Exception {
    final String result = DeviceNames.getDeviceName("TI10RA1", FALLBACK);
    Assert.assertEquals("ECS TI10RA1", result);
}
public void testDevice4218() throws Exception {
    final String result = DeviceNames.getDeviceName("BIRDY", FALLBACK);
    Assert.assertEquals("Wiko BIRDY", result);
}
public void testDevice4219() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G316ML", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4 Neo", result);
}
public void testDevice4220() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G316MY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4", result);
}
public void testDevice4221() throws Exception {
    final String result = DeviceNames.getDeviceName("DA241HL", FALLBACK);
    Assert.assertEquals("Acer DA241HL", result);
}
public void testDevice4222() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6077W2", FALLBACK);
    Assert.assertEquals("RCA RCT6077W2", result);
}
public void testDevice4223() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G316H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4", result);
}
public void testDevice4224() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-D710", FALLBACK);
    Assert.assertEquals("Samsung Epic", result);
}
public void testDevice4225() throws Exception {
    final String result = DeviceNames.getDeviceName("AX7OO", FALLBACK);
    Assert.assertEquals("BMobile AX700", result);
}
public void testDevice4226() throws Exception {
    final String result = DeviceNames.getDeviceName("W337", FALLBACK);
    Assert.assertEquals("Philips W337", result);
}
public void testDevice4227() throws Exception {
    final String result = DeviceNames.getDeviceName("BP-1001", FALLBACK);
    Assert.assertEquals("WoongjinThinkbig", result);
}
public void testDevice4228() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-UK495", FALLBACK);
    Assert.assertEquals("LGE LG G Pad F 8.0", result);
}
public void testDevice4229() throws Exception {
    final String result = DeviceNames.getDeviceName("PRIMO8", FALLBACK);
    Assert.assertEquals("THOMSON PRIMO8 Tablet", result);
}
public void testDevice4230() throws Exception {
    final String result = DeviceNames.getDeviceName("MPDC1006", FALLBACK);
    Assert.assertEquals("MPman MPDC1006", result);
}
public void testDevice4231() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6691W3", FALLBACK);
    Assert.assertEquals("RCA RCT6691W3", result);
}
public void testDevice4232() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D375AR", FALLBACK);
    Assert.assertEquals("LGE LG L80 Single", result);
}
public void testDevice4233() throws Exception {
    final String result = DeviceNames.getDeviceName("PRIMO7", FALLBACK);
    Assert.assertEquals("THOMSON PRIMO7 Tablet", result);
}
public void testDevice4234() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K610X3D", FALLBACK);
    Assert.assertEquals("Hisense LED42K610X3D", result);
}
public void testDevice4235() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG981", FALLBACK);
    Assert.assertEquals("Hisense EG981", result);
}
public void testDevice4236() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG980", FALLBACK);
    Assert.assertEquals("Hisense HS-EG980", result);
}
public void testDevice4237() throws Exception {
    final String result = DeviceNames.getDeviceName("EVC8Q", FALLBACK);
    Assert.assertEquals("Eviant EVC8Q", result);
}
public void testDevice4238() throws Exception {
    final String result = DeviceNames.getDeviceName("MT15i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia neo", result);
}
public void testDevice4239() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P895", FALLBACK);
    Assert.assertEquals("LGE Optimus Vu", result);
}
public void testDevice4240() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG98C", FALLBACK);
    Assert.assertEquals("Hisense HS-EG98C", result);
}
public void testDevice4241() throws Exception {
    final String result = DeviceNames.getDeviceName("SCT21", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice4242() throws Exception {
    final String result = DeviceNames.getDeviceName("Che2-L23", FALLBACK);
    Assert.assertEquals("Huawei Che2-L23", result);
}
public void testDevice4243() throws Exception {
    final String result = DeviceNames.getDeviceName("PRO7D", FALLBACK);
    Assert.assertEquals("Anydata Visual Land Prestige 7D", result);
}
public void testDevice4244() throws Exception {
    final String result = DeviceNames.getDeviceName("U675", FALLBACK);
    Assert.assertEquals("Teleepoch U675", result);
}
public void testDevice4245() throws Exception {
    final String result = DeviceNames.getDeviceName("Hydro_PLUS", FALLBACK);
    Assert.assertEquals("Kyocera Hydro PLUS", result);
}
public void testDevice4246() throws Exception {
    final String result = DeviceNames.getDeviceName("VP74-Finlux", FALLBACK);
    Assert.assertEquals("Vestel VP74", result);
}
public void testDevice4247() throws Exception {
    final String result = DeviceNames.getDeviceName("XT881", FALLBACK);
    Assert.assertEquals("MOTOROLA ELECTRIFY 2", result);
}
public void testDevice4248() throws Exception {
    final String result = DeviceNames.getDeviceName("XT885", FALLBACK);
    Assert.assertEquals("Motorola Razr V", result);
}
public void testDevice4249() throws Exception {
    final String result = DeviceNames.getDeviceName("XT886", FALLBACK);
    Assert.assertEquals("Motorola Razr V", result);
}
public void testDevice4250() throws Exception {
    final String result = DeviceNames.getDeviceName("MID107", FALLBACK);
    Assert.assertEquals("Takara MID 107", result);
}
public void testDevice4251() throws Exception {
    final String result = DeviceNames.getDeviceName("CEA3", FALLBACK);
    Assert.assertEquals("Sanyo CEA3", result);
}
public void testDevice4252() throws Exception {
    final String result = DeviceNames.getDeviceName("CEA1", FALLBACK);
    Assert.assertEquals("Sanyo CEA1", result);
}
public void testDevice4253() throws Exception {
    final String result = DeviceNames.getDeviceName("9007X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONETOUCH PIXI3(7)", result);
}
public void testDevice4254() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V490", FALLBACK);
    Assert.assertEquals("LGE G pad 8.0 LTE", result);
}
public void testDevice4255() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V496", FALLBACK);
    Assert.assertEquals("LGE LG G Pad F 8.0", result);
}
public void testDevice4256() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V497", FALLBACK);
    Assert.assertEquals("LGE LG G Pad II 8.0LTE", result);
}
public void testDevice4257() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V495", FALLBACK);
    Assert.assertEquals("LGE LG G Pad F 8.0", result);
}
public void testDevice4258() throws Exception {
    final String result = DeviceNames.getDeviceName("9007A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONETOUCH PIXI3(7)", result);
}
public void testDevice4259() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V498", FALLBACK);
    Assert.assertEquals("LGE G Pad II 8.0", result);
}
public void testDevice4260() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V499", FALLBACK);
    Assert.assertEquals("LGE LG G Pad F 8.0", result);
}
public void testDevice4261() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-E600M", FALLBACK);
    Assert.assertEquals("Hisense HS-E600M", result);
}
public void testDevice4262() throws Exception {
    final String result = DeviceNames.getDeviceName("I221", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) I221", result);
}
public void testDevice4263() throws Exception {
    final String result = DeviceNames.getDeviceName("I220", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) I220", result);
}
public void testDevice4264() throws Exception {
    final String result = DeviceNames.getDeviceName("HTCEVODesign4G", FALLBACK);
    Assert.assertEquals("HTC Evo Design 4G", result);
}
public void testDevice4265() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H340AR", FALLBACK);
    Assert.assertEquals("LGE LG Leon 4G LTE", result);
}
public void testDevice4266() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R950", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice4267() throws Exception {
    final String result = DeviceNames.getDeviceName("A714_Vivo_Play", FALLBACK);
    Assert.assertEquals("Gtel A714 Vivo Play", result);
}
public void testDevice4268() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P1000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice4269() throws Exception {
    final String result = DeviceNames.getDeviceName("G2SMNT", FALLBACK);
    Assert.assertEquals("Philips S221C3A", result);
}
public void testDevice4270() throws Exception {
    final String result = DeviceNames.getDeviceName("SCL-AL00", FALLBACK);
    Assert.assertEquals("Huawei Honor 4A", result);
}
public void testDevice4271() throws Exception {
    final String result = DeviceNames.getDeviceName("DROID_X2", FALLBACK);
    Assert.assertEquals("Motorola Droid X2", result);
}
public void testDevice4272() throws Exception {
    final String result = DeviceNames.getDeviceName("LED48K360X3D", FALLBACK);
    Assert.assertEquals("Hisense LED48K360X3D", result);
}
public void testDevice4273() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3503DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3503DUO", result);
}
public void testDevice4274() throws Exception {
    final String result = DeviceNames.getDeviceName("DW-21(A)", FALLBACK);
    Assert.assertEquals("Wistron DW-21(A)", result);
}
public void testDevice4275() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900FG", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Google Play Edition", result);
}
public void testDevice4276() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900FD", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Dual SIM", result);
}
public void testDevice4277() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000019-002", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice4278() throws Exception {
    final String result = DeviceNames.getDeviceName("PX3100", FALLBACK);
    Assert.assertEquals("Hisense PX3100", result);
}
public void testDevice4279() throws Exception {
    final String result = DeviceNames.getDeviceName("Bit", FALLBACK);
    Assert.assertEquals("Explay Bit", result);
}
public void testDevice4280() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G900FQ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice4281() throws Exception {
    final String result = DeviceNames.getDeviceName("I7A-LE", FALLBACK);
    Assert.assertEquals("Haier GF88", result);
}
public void testDevice4282() throws Exception {
    final String result = DeviceNames.getDeviceName("SH631W", FALLBACK);
    Assert.assertEquals("Foxconn SHARP SH631W", result);
}
public void testDevice4283() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5455DUO", FALLBACK);
    Assert.assertEquals("Prestigio MultiPhone 5455 DUO", result);
}
public void testDevice4284() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC-A510a", FALLBACK);
    Assert.assertEquals("HTC Wildfire S", result);
}
public void testDevice4285() throws Exception {
    final String result = DeviceNames.getDeviceName("XT303", FALLBACK);
    Assert.assertEquals("Motorola Motosmart", result);
}
public void testDevice4286() throws Exception {
    final String result = DeviceNames.getDeviceName("XT300", FALLBACK);
    Assert.assertEquals("Motorola Spice", result);
}
public void testDevice4287() throws Exception {
    final String result = DeviceNames.getDeviceName("XT301", FALLBACK);
    Assert.assertEquals("Motorola Citrus", result);
}
public void testDevice4288() throws Exception {
    final String result = DeviceNames.getDeviceName("XT305", FALLBACK);
    Assert.assertEquals("Motorola Motosmart", result);
}
public void testDevice4289() throws Exception {
    final String result = DeviceNames.getDeviceName("L10", FALLBACK);
    Assert.assertEquals("Camelus L10", result);
}
public void testDevice4290() throws Exception {
    final String result = DeviceNames.getDeviceName("MTS-SP100", FALLBACK);
    Assert.assertEquals("ZTE Racer", result);
}
public void testDevice4291() throws Exception {
    final String result = DeviceNames.getDeviceName("Venus_V3_5570", FALLBACK);
    Assert.assertEquals("Vestel Venus V3 5570", result);
}
public void testDevice4292() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360R6", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice4293() throws Exception {
    final String result = DeviceNames.getDeviceName("LED40K360X3D", FALLBACK);
    Assert.assertEquals("Hisense LED40K360X3D", result);
}
public void testDevice4294() throws Exception {
    final String result = DeviceNames.getDeviceName("S7842", FALLBACK);
    Assert.assertEquals("Logicom S7842", result);
}
public void testDevice4295() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I497", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 10.1", result);
}
public void testDevice4296() throws Exception {
    final String result = DeviceNames.getDeviceName("ST950I-LN", FALLBACK);
    Assert.assertEquals("LinkNet ST950I-LN", result);
}
public void testDevice4297() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E475f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice4298() throws Exception {
    final String result = DeviceNames.getDeviceName("D6653", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3", result);
}
public void testDevice4299() throws Exception {
    final String result = DeviceNames.getDeviceName("Siru", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP S3", result);
}
public void testDevice4300() throws Exception {
    final String result = DeviceNames.getDeviceName("Monterra", FALLBACK);
    Assert.assertEquals("Garmin Monterra", result);
}
public void testDevice4301() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J200H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J2", result);
}
public void testDevice4302() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J200M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J2", result);
}
public void testDevice4303() throws Exception {
    final String result = DeviceNames.getDeviceName("NX511J", FALLBACK);
    Assert.assertEquals("ZTE NX511J", result);
}
public void testDevice4304() throws Exception {
    final String result = DeviceNames.getDeviceName("PMT3037_3G", FALLBACK);
    Assert.assertEquals("Prestigio MultiPad Wize 3037 3G", result);
}
public void testDevice4305() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J200G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J2", result);
}
public void testDevice4306() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J200F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J2", result);
}
public void testDevice4307() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J200Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J2", result);
}
public void testDevice4308() throws Exception {
    final String result = DeviceNames.getDeviceName("TabMini", FALLBACK);
    Assert.assertEquals("Explay Tab Mini", result);
}
public void testDevice4309() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-12C", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SH-12C", result);
}
public void testDevice4310() throws Exception {
    final String result = DeviceNames.getDeviceName("NEO10-1", FALLBACK);
    Assert.assertEquals("Haier NEO10-1", result);
}
public void testDevice4311() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_603h", FALLBACK);
    Assert.assertEquals("HTC Desire 501", result);
}
public void testDevice4312() throws Exception {
    final String result = DeviceNames.getDeviceName("Prime10ES", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Prime10ES", result);
}
public void testDevice4313() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T807R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice4314() throws Exception {
    final String result = DeviceNames.getDeviceName("MG080D1T", FALLBACK);
    Assert.assertEquals("TSUNAMi Tablet Tsunami TSTA080D1", result);
}
public void testDevice4315() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket SS", result);
}
public void testDevice4316() throws Exception {
    final String result = DeviceNames.getDeviceName("404KC", FALLBACK);
    Assert.assertEquals("Kyocera 404KC", result);
}
public void testDevice4317() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M580D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Safe", result);
}
public void testDevice4318() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP412", FALLBACK);
    Assert.assertEquals("Sony Xperia Z Ultra", result);
}
public void testDevice4319() throws Exception {
    final String result = DeviceNames.getDeviceName("G735-L12", FALLBACK);
    Assert.assertEquals("Huawei G735-L12", result);
}
public void testDevice4320() throws Exception {
    final String result = DeviceNames.getDeviceName("MIT700", FALLBACK);
    Assert.assertEquals("iRiver DMT580D", result);
}
public void testDevice4321() throws Exception {
    final String result = DeviceNames.getDeviceName("D5306", FALLBACK);
    Assert.assertEquals("Sony Xperia T2 Ultra", result);
}
public void testDevice4322() throws Exception {
    final String result = DeviceNames.getDeviceName("INFINIX-X600", FALLBACK);
    Assert.assertEquals("INFINIX-X600", result);
}
public void testDevice4323() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-D700", FALLBACK);
    Assert.assertEquals("Samsung Epic 4G", result);
}
public void testDevice4324() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T110", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 Lite", result);
}
public void testDevice4325() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T111", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 Lite", result);
}
public void testDevice4326() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T113", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 Lite 7.0", result);
}
public void testDevice4327() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T116", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 VE 7.0", result);
}
public void testDevice4328() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P930", FALLBACK);
    Assert.assertEquals("LGE Optimus LTE", result);
}
public void testDevice4329() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P936", FALLBACK);
    Assert.assertEquals("LGE Optimus LTE", result);
}
public void testDevice4330() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P935", FALLBACK);
    Assert.assertEquals("LGE Optimus LTE", result);
}
public void testDevice4331() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC0P4E1", FALLBACK);
    Assert.assertEquals("HTC Desire 601", result);
}
public void testDevice4332() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice4333() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T589R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Q", result);
}
public void testDevice4334() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T589W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Q", result);
}
public void testDevice4335() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D107", FALLBACK);
    Assert.assertEquals("LGE L20", result);
}
public void testDevice4336() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D105", FALLBACK);
    Assert.assertEquals("LGE L20", result);
}
public void testDevice4337() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D100", FALLBACK);
    Assert.assertEquals("LGE L20", result);
}
public void testDevice4338() throws Exception {
    final String result = DeviceNames.getDeviceName("TRIO-7.85", FALLBACK);
    Assert.assertEquals("TRIO-7.85", result);
}
public void testDevice4339() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P5113", FALLBACK);
    Assert.assertEquals("Samsnung Galaxy Tab 2 10.1", result);
}
public void testDevice4340() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P5110", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 2", result);
}
public void testDevice4341() throws Exception {
    final String result = DeviceNames.getDeviceName("P791", FALLBACK);
    Assert.assertEquals("Polaroid P791", result);
}
public void testDevice4342() throws Exception {
    final String result = DeviceNames.getDeviceName("T1-A22L", FALLBACK);
    Assert.assertEquals("Huawei T1 10", result);
}
public void testDevice4343() throws Exception {
    final String result = DeviceNames.getDeviceName("SMT-i9100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice4344() throws Exception {
    final String result = DeviceNames.getDeviceName("VP74-Celcus", FALLBACK);
    Assert.assertEquals("Vestel VP74", result);
}
public void testDevice4345() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G910S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Round", result);
}
public void testDevice4346() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6310T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young", result);
}
public void testDevice4347() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S7582L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Duos2", result);
}
public void testDevice4348() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E975T", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice4349() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6310L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young", result);
}
public void testDevice4350() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E975K", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice4351() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6310N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young", result);
}
public void testDevice4352() throws Exception {
    final String result = DeviceNames.getDeviceName("G621-TL00", FALLBACK);
    Assert.assertEquals("Huawei G621-TL00", result);
}
public void testDevice4353() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6310B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Young", result);
}
public void testDevice4354() throws Exception {
    final String result = DeviceNames.getDeviceName("PC-TE307N1W", FALLBACK);
    Assert.assertEquals("NEC PC-TE307N1W", result);
}
public void testDevice4355() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M190S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice4356() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-S970G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice4357() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E975w", FALLBACK);
    Assert.assertEquals("LGE Optimus GJ", result);
}
public void testDevice4358() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9305N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice4359() throws Exception {
    final String result = DeviceNames.getDeviceName("ONE_TOUCH_960C", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH Ultra 960c", result);
}
public void testDevice4360() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-T100K", FALLBACK);
    Assert.assertEquals("Pantech AT1", result);
}
public void testDevice4361() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1049", FALLBACK);
    Assert.assertEquals("Motorola Moto X", result);
}
public void testDevice4362() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6810E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4363() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4364() throws Exception {
    final String result = DeviceNames.getDeviceName("AD7003", FALLBACK);
    Assert.assertEquals("COMIO AD7003", result);
}
public void testDevice4365() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4366() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4367() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6810B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4368() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6810M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4369() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6810L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4370() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4371() throws Exception {
    final String result = DeviceNames.getDeviceName("FMT-NM7054-01", FALLBACK);
    Assert.assertEquals("Future Mobile Technology FMT-NM7054-01", result);
}
public void testDevice4372() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4373() throws Exception {
    final String result = DeviceNames.getDeviceName("FMT-NM7054-03", FALLBACK);
    Assert.assertEquals("Future Mobile Technology FMT-NM7054-03", result);
}
public void testDevice4374() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4375() throws Exception {
    final String result = DeviceNames.getDeviceName("FAR70B", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Tab Wi-Fi FAR70B", result);
}
public void testDevice4376() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6810P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4377() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5310T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pocket Neo", result);
}
public void testDevice4378() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G850Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice4379() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G850X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice4380() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9103", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice4381() throws Exception {
    final String result = DeviceNames.getDeviceName("Che2-UL00", FALLBACK);
    Assert.assertEquals("Huawei Che2-UL00", result);
}
public void testDevice4382() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9105", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 Plus", result);
}
public void testDevice4383() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E435", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice4384() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9108", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice4385() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G850S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice4386() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E430", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 II", result);
}
public void testDevice4387() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G850W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice4388() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E455g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice4389() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G850K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice4390() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G850M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice4391() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G850L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice4392() throws Exception {
    final String result = DeviceNames.getDeviceName("MF97W", FALLBACK);
    Assert.assertEquals("ZTE MF97W", result);
}
public void testDevice4393() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G850F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Alpha", result);
}
public void testDevice4394() throws Exception {
    final String result = DeviceNames.getDeviceName("ITP-R208W", FALLBACK);
    Assert.assertEquals("SK Telesys ITP-R208W", result);
}
public void testDevice4395() throws Exception {
    final String result = DeviceNames.getDeviceName("myTouch_4G_Slide", FALLBACK);
    Assert.assertEquals("HTC myTouch 4G Slide", result);
}
public void testDevice4396() throws Exception {
    final String result = DeviceNames.getDeviceName("Primo73", FALLBACK);
    Assert.assertEquals("MSI Primo73", result);
}
public void testDevice4397() throws Exception {
    final String result = DeviceNames.getDeviceName("EGS004", FALLBACK);
    Assert.assertEquals("Anydata ematic EGS004", result);
}
public void testDevice4398() throws Exception {
    final String result = DeviceNames.getDeviceName("Primo76", FALLBACK);
    Assert.assertEquals("MSI Primo76", result);
}
public void testDevice4399() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T989D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice4400() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6790L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4401() throws Exception {
    final String result = DeviceNames.getDeviceName("TR10RS1", FALLBACK);
    Assert.assertEquals("ECS TR10RS1", result);
}
public void testDevice4402() throws Exception {
    final String result = DeviceNames.getDeviceName("Tostab03", FALLBACK);
    Assert.assertEquals("Toshiba AT100", result);
}
public void testDevice4403() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6790E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4404() throws Exception {
    final String result = DeviceNames.getDeviceName("Life", FALLBACK);
    Assert.assertEquals("NGM Italia SRL LIFE", result);
}
public void testDevice4405() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G350E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Star2 Plus", result);
}
public void testDevice4406() throws Exception {
    final String result = DeviceNames.getDeviceName("Aster", FALLBACK);
    Assert.assertEquals("Vertu Aster", result);
}
public void testDevice4407() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G350M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Plus", result);
}
public void testDevice4408() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55K600A3D", FALLBACK);
    Assert.assertEquals("Hisense LED55K600A3D", result);
}
public void testDevice4409() throws Exception {
    final String result = DeviceNames.getDeviceName("10DTB42", FALLBACK);
    Assert.assertEquals("Hipstreet Pilot", result);
}
public void testDevice4410() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLS751", FALLBACK);
    Assert.assertEquals("LGE LG Volt II", result);
}
public void testDevice4411() throws Exception {
    final String result = DeviceNames.getDeviceName("SPH-M840", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Prevail 2", result);
}
public void testDevice4412() throws Exception {
    final String result = DeviceNames.getDeviceName("M3s", FALLBACK);
    Assert.assertEquals("CZ Electronics M3s", result);
}
public void testDevice4413() throws Exception {
    final String result = DeviceNames.getDeviceName("S8-303LT", FALLBACK);
    Assert.assertEquals("HUAWEI MediaPad M1 8.0", result);
}
public void testDevice4414() throws Exception {
    final String result = DeviceNames.getDeviceName("PantechP4100", FALLBACK);
    Assert.assertEquals("Pantech Element", result);
}
public void testDevice4415() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P990", FALLBACK);
    Assert.assertEquals("LGE Optimus 2X", result);
}
public void testDevice4416() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3502", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Plus", result);
}
public void testDevice4417() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I537", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Active", result);
}
public void testDevice4418() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-X6T", FALLBACK);
    Assert.assertEquals("Hisense HS-X6T", result);
}
public void testDevice4419() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3508", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend3", result);
}
public void testDevice4420() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3509", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Trend3", result);
}
public void testDevice4421() throws Exception {
    final String result = DeviceNames.getDeviceName("M3-2200", FALLBACK);
    Assert.assertEquals("Acer M3-2200", result);
}
public void testDevice4422() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T2519", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Q", result);
}
public void testDevice4423() throws Exception {
    final String result = DeviceNames.getDeviceName("CJ-1984", FALLBACK);
    Assert.assertEquals("Cellon CJ-1984", result);
}
public void testDevice4424() throws Exception {
    final String result = DeviceNames.getDeviceName("M3S", FALLBACK);
    Assert.assertEquals("Gionee M3S", result);
}
public void testDevice4425() throws Exception {
    final String result = DeviceNames.getDeviceName("H7", FALLBACK);
    Assert.assertEquals("Hisense Vidaa", result);
}
public void testDevice4426() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B7810", FALLBACK);
    Assert.assertEquals("Samsung Galaxy M Pro2", result);
}
public void testDevice4427() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7649G", FALLBACK);
    Assert.assertEquals("Proscan PLT7649G", result);
}
public void testDevice4428() throws Exception {
    final String result = DeviceNames.getDeviceName("QTAQZ3", FALLBACK);
    Assert.assertEquals("Verizon Wireless Ellipsis 8", result);
}
public void testDevice4429() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915FY", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice4430() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E270L", FALLBACK);
    Assert.assertEquals("Samsung Baffin", result);
}
public void testDevice4431() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G318H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4 Lite", result);
}
public void testDevice4432() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D816d", FALLBACK);
    Assert.assertEquals("HTC D816d", result);
}
public void testDevice4433() throws Exception {
    final String result = DeviceNames.getDeviceName("SK17a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia mini pro", result);
}
public void testDevice4434() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG966", FALLBACK);
    Assert.assertEquals("Hisense HS-EG966", result);
}
public void testDevice4435() throws Exception {
    final String result = DeviceNames.getDeviceName("SK17i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia mini pro", result);
}
public void testDevice4436() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I957M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice4437() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I957R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice4438() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I110", FALLBACK);
    Assert.assertEquals("Samsung Illusion", result);
}
public void testDevice4439() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D816x", FALLBACK);
    Assert.assertEquals("HTC Desire 816", result);
}
public void testDevice4440() throws Exception {
    final String result = DeviceNames.getDeviceName("SBM203SH", FALLBACK);
    Assert.assertEquals("Sharp SoftBank AQUOS PHONE Xx 203SH", result);
}
public void testDevice4441() throws Exception {
    final String result = DeviceNames.getDeviceName("R827", FALLBACK);
    Assert.assertEquals("Oppo R827", result);
}
public void testDevice4442() throws Exception {
    final String result = DeviceNames.getDeviceName("D2305", FALLBACK);
    Assert.assertEquals("Sony Xperia M2", result);
}
public void testDevice4443() throws Exception {
    final String result = DeviceNames.getDeviceName("D2306", FALLBACK);
    Assert.assertEquals("Sony Xperia M2", result);
}
public void testDevice4444() throws Exception {
    final String result = DeviceNames.getDeviceName("D2302", FALLBACK);
    Assert.assertEquals("Sony Xperia M2", result);
}
public void testDevice4445() throws Exception {
    final String result = DeviceNames.getDeviceName("D2303", FALLBACK);
    Assert.assertEquals("Sony Xperia M2", result);
}
public void testDevice4446() throws Exception {
    final String result = DeviceNames.getDeviceName("USCC-E6762", FALLBACK);
    Assert.assertEquals("Kyocera DuraForce", result);
}
public void testDevice4447() throws Exception {
    final String result = DeviceNames.getDeviceName("K97", FALLBACK);
    Assert.assertEquals("ZTE K97", result);
}
public void testDevice4448() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP351", FALLBACK);
    Assert.assertEquals("Sony Xperia Tablet Z", result);
}
public void testDevice4449() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6790N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4450() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G318MZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4 Lite", result);
}
public void testDevice4451() throws Exception {
    final String result = DeviceNames.getDeviceName("F-08D", FALLBACK);
    Assert.assertEquals("Fujitsu Disney Mobile on docomo F-08D", result);
}
public void testDevice4452() throws Exception {
    final String result = DeviceNames.getDeviceName("F-08E", FALLBACK);
    Assert.assertEquals("Fujitsu Raku-Raku SMART PHONE2 F-08E", result);
}
public void testDevice4453() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G318ML", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4 Lite", result);
}
public void testDevice4454() throws Exception {
    final String result = DeviceNames.getDeviceName("0PCV1", FALLBACK);
    Assert.assertEquals("HTC Desire 510", result);
}
public void testDevice4455() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-AS680", FALLBACK);
    Assert.assertEquals("LGE Optimus 2", result);
}
public void testDevice4456() throws Exception {
    final String result = DeviceNames.getDeviceName("E2281CA", FALLBACK);
    Assert.assertEquals("Hisense Sero 8", result);
}
public void testDevice4457() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-C105A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Zoom", result);
}
public void testDevice4458() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite7QL", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite7QL", result);
}
public void testDevice4459() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite7QS", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite7QS", result);
}
public void testDevice4460() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G5108", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Max", result);
}
public void testDevice4461() throws Exception {
    final String result = DeviceNames.getDeviceName("P300", FALLBACK);
    Assert.assertEquals("Micromax P300", result);
}
public void testDevice4462() throws Exception {
    final String result = DeviceNames.getDeviceName("T1060", FALLBACK);
    Assert.assertEquals("Positivo T1060", result);
}
public void testDevice4463() throws Exception {
    final String result = DeviceNames.getDeviceName("ME173X", FALLBACK);
    Assert.assertEquals("Asus MeMO Pad HD 7", result);
}
public void testDevice4464() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I257", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice4465() throws Exception {
    final String result = DeviceNames.getDeviceName("HSG1341", FALLBACK);
    Assert.assertEquals("HannSpree HSG1341", result);
}
public void testDevice4466() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G350L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Plus", result);
}
public void testDevice4467() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E500S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win", result);
}
public void testDevice4468() throws Exception {
    final String result = DeviceNames.getDeviceName("Che2-TL00M", FALLBACK);
    Assert.assertEquals("Huawei Che2-TL00M", result);
}
public void testDevice4469() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6010L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Music", result);
}
public void testDevice4470() throws Exception {
    final String result = DeviceNames.getDeviceName("Che2-TL00H", FALLBACK);
    Assert.assertEquals("Huawei Che2-TL00H", result);
}
public void testDevice4471() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LU6500", FALLBACK);
    Assert.assertEquals("LGE Optimus Q2", result);
}
public void testDevice4472() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R970", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice4473() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7500D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice4474() throws Exception {
    final String result = DeviceNames.getDeviceName("W6500", FALLBACK);
    Assert.assertEquals("Philips W6500", result);
}
public void testDevice4475() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T705", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 8.4", result);
}
public void testDevice4476() throws Exception {
    final String result = DeviceNames.getDeviceName("LED58K680X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED58K680X3DU", result);
}
public void testDevice4477() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T700", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S", result);
}
public void testDevice4478() throws Exception {
    final String result = DeviceNames.getDeviceName("Milestone", FALLBACK);
    Assert.assertEquals("Motorola Droid", result);
}
public void testDevice4479() throws Exception {
    final String result = DeviceNames.getDeviceName("T-Mobile_myTouch_Q", FALLBACK);
    Assert.assertEquals("T-Mobile myTouch Q", result);
}
public void testDevice4480() throws Exception {
    final String result = DeviceNames.getDeviceName("MB200", FALLBACK);
    Assert.assertEquals("Motorola CLIQ", result);
}
public void testDevice4481() throws Exception {
    final String result = DeviceNames.getDeviceName("MiBOX2", FALLBACK);
    Assert.assertEquals("Xiaomi MiBOX2", result);
}
public void testDevice4482() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7503", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice4483() throws Exception {
    final String result = DeviceNames.getDeviceName("F270BW", FALLBACK);
    Assert.assertEquals("Hisense F270BW", result);
}
public void testDevice4484() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7501", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1 N", result);
}
public void testDevice4485() throws Exception {
    final String result = DeviceNames.getDeviceName("CT820", FALLBACK);
    Assert.assertEquals("Carrefour CT820", result);
}
public void testDevice4486() throws Exception {
    final String result = DeviceNames.getDeviceName("LS-5010", FALLBACK);
    Assert.assertEquals("Reliance Smartphone JS LS-5010", result);
}
public void testDevice4487() throws Exception {
    final String result = DeviceNames.getDeviceName("CT825", FALLBACK);
    Assert.assertEquals("Haier CT825", result);
}
public void testDevice4488() throws Exception {
    final String result = DeviceNames.getDeviceName("CT826", FALLBACK);
    Assert.assertEquals("Carrefour CT826", result);
}
public void testDevice4489() throws Exception {
    final String result = DeviceNames.getDeviceName("LS-5014", FALLBACK);
    Assert.assertEquals("Reliance LS-5014", result);
}
public void testDevice4490() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-i509", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y", result);
}
public void testDevice4491() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P705f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7", result);
}
public void testDevice4492() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P705g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7", result);
}
public void testDevice4493() throws Exception {
    final String result = DeviceNames.getDeviceName("9005X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 9005X", result);
}
public void testDevice4494() throws Exception {
    final String result = DeviceNames.getDeviceName("U8100", FALLBACK);
    Assert.assertEquals("Huawei T-Mobile Pulse", result);
}
public void testDevice4495() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I717", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice4496() throws Exception {
    final String result = DeviceNames.getDeviceName("MicromaxP680", FALLBACK);
    Assert.assertEquals("Micromax Canvas tab", result);
}
public void testDevice4497() throws Exception {
    final String result = DeviceNames.getDeviceName("Y635-L01", FALLBACK);
    Assert.assertEquals("Huawei Y635-L01", result);
}
public void testDevice4498() throws Exception {
    final String result = DeviceNames.getDeviceName("E310", FALLBACK);
    Assert.assertEquals("Acer Liquid Mini", result);
}
public void testDevice4499() throws Exception {
    final String result = DeviceNames.getDeviceName("Gravity", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice4500() throws Exception {
    final String result = DeviceNames.getDeviceName("F103L", FALLBACK);
    Assert.assertEquals("Gionee F103L", result);
}
public void testDevice4501() throws Exception {
    final String result = DeviceNames.getDeviceName("EB-L76G-B", FALLBACK);
    Assert.assertEquals("Sharp Media Tablet", result);
}
public void testDevice4502() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T699", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Relay", result);
}
public void testDevice4503() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T325", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Pro 8.4", result);
}
public void testDevice4504() throws Exception {
    final String result = DeviceNames.getDeviceName("M2mini", FALLBACK);
    Assert.assertEquals("Gionee M2mini", result);
}
public void testDevice4505() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I467M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 8.0", result);
}
public void testDevice4506() throws Exception {
    final String result = DeviceNames.getDeviceName("R7t", FALLBACK);
    Assert.assertEquals("Oppo R7t", result);
}
public void testDevice4507() throws Exception {
    final String result = DeviceNames.getDeviceName("F103S", FALLBACK);
    Assert.assertEquals("Gionee F103S", result);
}
public void testDevice4508() throws Exception {
    final String result = DeviceNames.getDeviceName("LBOX500", FALLBACK);
    Assert.assertEquals("Lexibook Playdroid", result);
}
public void testDevice4509() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530R7", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice4510() throws Exception {
    final String result = DeviceNames.getDeviceName("E5643", FALLBACK);
    Assert.assertEquals("Sony Xperia M5 Dual", result);
}
public void testDevice4511() throws Exception {
    final String result = DeviceNames.getDeviceName("4033L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ONE TOUCH 4033X", result);
}
public void testDevice4512() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F100S", FALLBACK);
    Assert.assertEquals("LGE Optimus Vu", result);
}
public void testDevice4513() throws Exception {
    final String result = DeviceNames.getDeviceName("TM1088", FALLBACK);
    Assert.assertEquals("Nuvision TM1088", result);
}
public void testDevice4514() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F100L", FALLBACK);
    Assert.assertEquals("LGE Optimus Vu", result);
}
public void testDevice4515() throws Exception {
    final String result = DeviceNames.getDeviceName("L681", FALLBACK);
    Assert.assertEquals("Hisense L681", result);
}
public void testDevice4516() throws Exception {
    final String result = DeviceNames.getDeviceName("XT320", FALLBACK);
    Assert.assertEquals("Motorola Defy Mini", result);
}
public void testDevice4517() throws Exception {
    final String result = DeviceNames.getDeviceName("XT321", FALLBACK);
    Assert.assertEquals("Motorola Defy Mini", result);
}
public void testDevice4518() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G925A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice4519() throws Exception {
    final String result = DeviceNames.getDeviceName("google_sdk", FALLBACK);
    Assert.assertEquals("Android Emulator", result);
}
public void testDevice4520() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N8010", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice4521() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_S710E", FALLBACK);
    Assert.assertEquals("HTC Incredible S", result);
}
public void testDevice4522() throws Exception {
    final String result = DeviceNames.getDeviceName("F105", FALLBACK);
    Assert.assertEquals("Gionee F105", result);
}
public void testDevice4523() throws Exception {
    final String result = DeviceNames.getDeviceName("Onliner4", FALLBACK);
    Assert.assertEquals("Explay Onliner 4", result);
}
public void testDevice4524() throws Exception {
    final String result = DeviceNames.getDeviceName("F103", FALLBACK);
    Assert.assertEquals("Gionee F103", result);
}
public void testDevice4525() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E610", FALLBACK);
    Assert.assertEquals("LG Optimus L5", result);
}
public void testDevice4526() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G530FZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice4527() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K360", FALLBACK);
    Assert.assertEquals("Hisense LED32K360", result);
}
public void testDevice4528() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K330X3D", FALLBACK);
    Assert.assertEquals("Hisense LED42K330X3D", result);
}
public void testDevice4529() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F340S", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice4530() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A710X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7(2016)", result);
}
public void testDevice4531() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A710Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7(2016)", result);
}
public void testDevice4532() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A710S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7(2016)", result);
}
public void testDevice4533() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9200", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4534() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A710K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7(2016)", result);
}
public void testDevice4535() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A710L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7(2016)", result);
}
public void testDevice4536() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A710M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7(2016)", result);
}
public void testDevice4537() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9208", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4538() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A710F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7(2016)", result);
}
public void testDevice4539() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F340L", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice4540() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4541() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4542() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4543() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4544() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A7100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7(2016)", result);
}
public void testDevice4545() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4546() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4547() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4548() throws Exception {
    final String result = DeviceNames.getDeviceName("LED40K370", FALLBACK);
    Assert.assertEquals("Hisense LED40K370", result);
}
public void testDevice4549() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4550() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4551() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4552() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N920X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note5", result);
}
public void testDevice4553() throws Exception {
    final String result = DeviceNames.getDeviceName("AT100", FALLBACK);
    Assert.assertEquals("Toshiba AT100", result);
}
public void testDevice4554() throws Exception {
    final String result = DeviceNames.getDeviceName("NX513J", FALLBACK);
    Assert.assertEquals("ZTE NX513J", result);
}
public void testDevice4555() throws Exception {
    final String result = DeviceNames.getDeviceName("C6742", FALLBACK);
    Assert.assertEquals("Kyocera Hydro VIEW", result);
}
public void testDevice4556() throws Exception {
    final String result = DeviceNames.getDeviceName("C6740", FALLBACK);
    Assert.assertEquals("Kyocera Hydro WAVE", result);
}
public void testDevice4557() throws Exception {
    final String result = DeviceNames.getDeviceName("LT971", FALLBACK);
    Assert.assertEquals("hisense lt971", result);
}
public void testDevice4558() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F580L", FALLBACK);
    Assert.assertEquals("LGE Gentle", result);
}
public void testDevice4559() throws Exception {
    final String result = DeviceNames.getDeviceName("DMT580D", FALLBACK);
    Assert.assertEquals("iRiver DMT580D", result);
}
public void testDevice4560() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500YZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice4561() throws Exception {
    final String result = DeviceNames.getDeviceName("S30", FALLBACK);
    Assert.assertEquals("Cat S30", result);
}
public void testDevice4562() throws Exception {
    final String result = DeviceNames.getDeviceName("D820X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) D820X", result);
}
public void testDevice4563() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F540L", FALLBACK);
    Assert.assertEquals("LGE LG Volt LTE", result);
}
public void testDevice4564() throws Exception {
    final String result = DeviceNames.getDeviceName("LED46K280J3D", FALLBACK);
    Assert.assertEquals("Hisense LED46K280J3D", result);
}
public void testDevice4565() throws Exception {
    final String result = DeviceNames.getDeviceName("D5322", FALLBACK);
    Assert.assertEquals("Sony Xperia T2 Ultra dual", result);
}
public void testDevice4566() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-L38C", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3", result);
}
public void testDevice4567() throws Exception {
    final String result = DeviceNames.getDeviceName("HM_1SW", FALLBACK);
    Assert.assertEquals("Xiaomi Redmi", result);
}
public void testDevice4568() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B5330", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Chat", result);
}
public void testDevice4569() throws Exception {
    final String result = DeviceNames.getDeviceName("NE-103T", FALLBACK);
    Assert.assertEquals("NEC MEDIAS U NE-103T", result);
}
public void testDevice4570() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D331AR", FALLBACK);
    Assert.assertEquals("LGE LBello", result);
}
public void testDevice4571() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D160", FALLBACK);
    Assert.assertEquals("LGE Optimus L40", result);
}
public void testDevice4572() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D165", FALLBACK);
    Assert.assertEquals("LGE Optimus L40", result);
}
public void testDevice4573() throws Exception {
    final String result = DeviceNames.getDeviceName("Zio", FALLBACK);
    Assert.assertEquals("Kyocera zio", result);
}
public void testDevice4574() throws Exception {
    final String result = DeviceNames.getDeviceName("AX4Nano_plus", FALLBACK);
    Assert.assertEquals("AllView AX4 Nano Plus", result);
}
public void testDevice4575() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T810X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice4576() throws Exception {
    final String result = DeviceNames.getDeviceName("e-tab4", FALLBACK);
    Assert.assertEquals("General Mobile E-tab 4", result);
}
public void testDevice4577() throws Exception {
    final String result = DeviceNames.getDeviceName("XT920", FALLBACK);
    Assert.assertEquals("Motorola RAZR D3", result);
}
public void testDevice4578() throws Exception {
    final String result = DeviceNames.getDeviceName("XT925", FALLBACK);
    Assert.assertEquals("Motorola DROID RAZR HD", result);
}
public void testDevice4579() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5453DUO", FALLBACK);
    Assert.assertEquals("Prestigio MultiPhone 5453 DUO", result);
}
public void testDevice4580() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R760", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice4581() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite10Q", FALLBACK);
    Assert.assertEquals("Prestige ELITE10Q", result);
}
public void testDevice4582() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_AB7K", FALLBACK);
    Assert.assertEquals("Positivo Ypy AB7K", result);
}
public void testDevice4583() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55K680X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED55K680X3DU", result);
}
public void testDevice4584() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_AB7D", FALLBACK);
    Assert.assertEquals("Positivo AB7", result);
}
public void testDevice4585() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5510L", FALLBACK);
    Assert.assertEquals("Samsung Europa", result);
}
public void testDevice4586() throws Exception {
    final String result = DeviceNames.getDeviceName("Smart_TAB_1003s", FALLBACK);
    Assert.assertEquals("Sourcing Creation ST1003S", result);
}
public void testDevice4587() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_709d", FALLBACK);
    Assert.assertEquals("HTC Desire 700 dual sim", result);
}
public void testDevice4588() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T759", FALLBACK);
    Assert.assertEquals("Samsung Exhibit", result);
}
public void testDevice4589() throws Exception {
    final String result = DeviceNames.getDeviceName("RAINBOW", FALLBACK);
    Assert.assertEquals("Wiko RAINBOW", result);
}
public void testDevice4590() throws Exception {
    final String result = DeviceNames.getDeviceName("003P", FALLBACK);
    Assert.assertEquals("Panasonic 003P", result);
}
public void testDevice4591() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6812i", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4592() throws Exception {
    final String result = DeviceNames.getDeviceName("S7-721u", FALLBACK);
    Assert.assertEquals("HUAWEI MediaPad 7 Youth2", result);
}
public void testDevice4593() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A890L", FALLBACK);
    Assert.assertEquals("Pantech VEGA Secret Note", result);
}
public void testDevice4594() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A890K", FALLBACK);
    Assert.assertEquals("Pantech VEGA Secret Note", result);
}
public void testDevice4595() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H731", FALLBACK);
    Assert.assertEquals("LGE G4 vigor", result);
}
public void testDevice4596() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H735", FALLBACK);
    Assert.assertEquals("LGE LG G4 Beat", result);
}
public void testDevice4597() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H734", FALLBACK);
    Assert.assertEquals("LGE LG G4s", result);
}
public void testDevice4598() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H736", FALLBACK);
    Assert.assertEquals("LGE LG G4 Beat", result);
}
public void testDevice4599() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6812C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4600() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6812B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice4601() throws Exception {
    final String result = DeviceNames.getDeviceName("LenovoA588t", FALLBACK);
    Assert.assertEquals("Lenovo A588t", result);
}
public void testDevice4602() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A890S", FALLBACK);
    Assert.assertEquals("Pantech VEGA Secret Note", result);
}
public void testDevice4603() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D838", FALLBACK);
    Assert.assertEquals("LGE G Pro2", result);
}
public void testDevice4604() throws Exception {
    final String result = DeviceNames.getDeviceName("X40E", FALLBACK);
    Assert.assertEquals("Enspert Lazer X40E", result);
}
public void testDevice4605() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9168", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Neo", result);
}
public void testDevice4606() throws Exception {
    final String result = DeviceNames.getDeviceName("N9180", FALLBACK);
    Assert.assertEquals("ZTE N9180", result);
}
public void testDevice4607() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-SU370", FALLBACK);
    Assert.assertEquals("LGE Optimus One", result);
}
public void testDevice4608() throws Exception {
    final String result = DeviceNames.getDeviceName("M220c", FALLBACK);
    Assert.assertEquals("Huawei M220", result);
}
public void testDevice4609() throws Exception {
    final String result = DeviceNames.getDeviceName("Z987", FALLBACK);
    Assert.assertEquals("ZTE Z987", result);
}
public void testDevice4610() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G730A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Mini", result);
}
public void testDevice4611() throws Exception {
    final String result = DeviceNames.getDeviceName("VS985_4G", FALLBACK);
    Assert.assertEquals("LG G3 4G", result);
}
public void testDevice4612() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8190N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S III Mini", result);
}
public void testDevice4613() throws Exception {
    final String result = DeviceNames.getDeviceName("P6_Energy_TM", FALLBACK);
    Assert.assertEquals("AllView P6 Energy", result);
}
public void testDevice4614() throws Exception {
    final String result = DeviceNames.getDeviceName("PLK-TL01H", FALLBACK);
    Assert.assertEquals("Huawei PLK-TL01H", result);
}
public void testDevice4615() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G710", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand2", result);
}
public void testDevice4616() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-E936", FALLBACK);
    Assert.assertEquals("Hisense HS-E936", result);
}
public void testDevice4617() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M440S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice4618() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R760X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice4619() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8190T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Mini", result);
}
public void testDevice4620() throws Exception {
    final String result = DeviceNames.getDeviceName("PLANET", FALLBACK);
    Assert.assertEquals("Pantech PLANET", result);
}
public void testDevice4621() throws Exception {
    final String result = DeviceNames.getDeviceName("SLIDE2", FALLBACK);
    Assert.assertEquals("Wiko PULP FAB", result);
}
public void testDevice4622() throws Exception {
    final String result = DeviceNames.getDeviceName("IM5", FALLBACK);
    Assert.assertEquals("Kodak IM5", result);
}
public void testDevice4623() throws Exception {
    final String result = DeviceNames.getDeviceName("SL930", FALLBACK);
    Assert.assertEquals("Gigaset SL930", result);
}
public void testDevice4624() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLS770", FALLBACK);
    Assert.assertEquals("LGE LG G Stylo", result);
}
public void testDevice4625() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G800HQ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 mini", result);
}
public void testDevice4626() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G6000", FALLBACK);
    Assert.assertEquals("Samsung Galaxy On7", result);
}
public void testDevice4627() throws Exception {
    final String result = DeviceNames.getDeviceName("W3620", FALLBACK);
    Assert.assertEquals("Philips W3620", result);
}
public void testDevice4628() throws Exception {
    final String result = DeviceNames.getDeviceName("4045O", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP2 (4)", result);
}
public void testDevice4629() throws Exception {
    final String result = DeviceNames.getDeviceName("4045L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP2 (4)", result);
}
public void testDevice4630() throws Exception {
    final String result = DeviceNames.getDeviceName("4045A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP2 (4)", result);
}
public void testDevice4631() throws Exception {
    final String result = DeviceNames.getDeviceName("4045D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP2 (4)", result);
}
public void testDevice4632() throws Exception {
    final String result = DeviceNames.getDeviceName("M10", FALLBACK);
    Assert.assertEquals("Monster M10", result);
}
public void testDevice4633() throws Exception {
    final String result = DeviceNames.getDeviceName("4045X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP2 (4)", result);
}
public void testDevice4634() throws Exception {
    final String result = DeviceNames.getDeviceName("NXA8QC116", FALLBACK);
    Assert.assertEquals("Nextbook NXA8QC116", result);
}
public void testDevice4635() throws Exception {
    final String result = DeviceNames.getDeviceName("E2371", FALLBACK);
    Assert.assertEquals("Hisense Sero7 LE", result);
}
public void testDevice4636() throws Exception {
    final String result = DeviceNames.getDeviceName("NEC-STR", FALLBACK);
    Assert.assertEquals("NEC LifeTouch L", result);
}
public void testDevice4637() throws Exception {
    final String result = DeviceNames.getDeviceName("SZJ-JS101", FALLBACK);
    Assert.assertEquals("Fujitsu SZJ-JS101", result);
}
public void testDevice4638() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-50LE860H", FALLBACK);
    Assert.assertEquals("Sharp LC-50LE860H", result);
}
public void testDevice4639() throws Exception {
    final String result = DeviceNames.getDeviceName("LC-50LE860M", FALLBACK);
    Assert.assertEquals("Sharp LC-50LE860M", result);
}
public void testDevice4640() throws Exception {
    final String result = DeviceNames.getDeviceName("PG06100", FALLBACK);
    Assert.assertEquals("HTC EVO Shift 4G", result);
}
public void testDevice4641() throws Exception {
    final String result = DeviceNames.getDeviceName("MT-733G", FALLBACK);
    Assert.assertEquals("MiiA MT-733G", result);
}
public void testDevice4642() throws Exception {
    final String result = DeviceNames.getDeviceName("PLK-UL00", FALLBACK);
    Assert.assertEquals("Huawei PLK-UL00", result);
}
public void testDevice4643() throws Exception {
    final String result = DeviceNames.getDeviceName("PTBPT5QCB7", FALLBACK);
    Assert.assertEquals("Protab PTBPT5QCB7", result);
}
public void testDevice4644() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V400S1", FALLBACK);
    Assert.assertEquals("LGE G Pad 7.0", result);
}
public void testDevice4645() throws Exception {
    final String result = DeviceNames.getDeviceName("H60-L21", FALLBACK);
    Assert.assertEquals("Huawei H60-L21", result);
}
public void testDevice4646() throws Exception {
    final String result = DeviceNames.getDeviceName("GOA", FALLBACK);
    Assert.assertEquals("Wiko GOA", result);
}
public void testDevice4647() throws Exception {
    final String result = DeviceNames.getDeviceName("VT785P2-Finlux", FALLBACK);
    Assert.assertEquals("Vestel VT785P2", result);
}
public void testDevice4648() throws Exception {
    final String result = DeviceNames.getDeviceName("EGQ337", FALLBACK);
    Assert.assertEquals("Ematic EGQ337", result);
}
public void testDevice4649() throws Exception {
    final String result = DeviceNames.getDeviceName("G3SMNTS22", FALLBACK);
    Assert.assertEquals("Philips PHP-S221C4AFD", result);
}
public void testDevice4650() throws Exception {
    final String result = DeviceNames.getDeviceName("G3SMNTS23", FALLBACK);
    Assert.assertEquals("Philips PHP-S231C4AFD", result);
}
public void testDevice4651() throws Exception {
    final String result = DeviceNames.getDeviceName("LED40K681X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED40K681X3DU", result);
}
public void testDevice4652() throws Exception {
    final String result = DeviceNames.getDeviceName("TM800A550L", FALLBACK);
    Assert.assertEquals("Nuvision TM800A550L", result);
}
public void testDevice4653() throws Exception {
    final String result = DeviceNames.getDeviceName("VK810_4G", FALLBACK);
    Assert.assertEquals("G Pad 8.3", result);
}
public void testDevice4654() throws Exception {
    final String result = DeviceNames.getDeviceName("PHS-402", FALLBACK);
    Assert.assertEquals("Hisense U606AE", result);
}
public void testDevice4655() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP621", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3 Tablet Compact", result);
}
public void testDevice4656() throws Exception {
    final String result = DeviceNames.getDeviceName("CEM1", FALLBACK);
    Assert.assertEquals("Sanyo 55CE6139M1", result);
}
public void testDevice4657() throws Exception {
    final String result = DeviceNames.getDeviceName("V2_Viper_X_plus", FALLBACK);
    Assert.assertEquals("AllView V2 Viper X plus", result);
}
public void testDevice4658() throws Exception {
    final String result = DeviceNames.getDeviceName("NXA116QC164", FALLBACK);
    Assert.assertEquals("Nextbook NXA116QC164", result);
}
public void testDevice4659() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E170L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy R-Style", result);
}
public void testDevice4660() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E170K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy R-Style", result);
}
public void testDevice4661() throws Exception {
    final String result = DeviceNames.getDeviceName("VS840_4G", FALLBACK);
    Assert.assertEquals("LG Lucid 4G", result);
}
public void testDevice4662() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_S450", FALLBACK);
    Assert.assertEquals("Positivo Ypy S450", result);
}
public void testDevice4663() throws Exception {
    final String result = DeviceNames.getDeviceName("Pegasus", FALLBACK);
    Assert.assertEquals("Mobiwire Pegasus", result);
}
public void testDevice4664() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E170S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy R-Style", result);
}
public void testDevice4665() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LG730", FALLBACK);
    Assert.assertEquals("LG Venice", result);
}
public void testDevice4666() throws Exception {
    final String result = DeviceNames.getDeviceName("IR7Q", FALLBACK);
    Assert.assertEquals("ViewSonic ViewPad IR7Q", result);
}
public void testDevice4667() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E370K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice4668() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP7505DUO", FALLBACK);
    Assert.assertEquals("Prestigio Grace X7", result);
}
public void testDevice4669() throws Exception {
    final String result = DeviceNames.getDeviceName("ATH-CL00", FALLBACK);
    Assert.assertEquals("Huawei ATH-CL00", result);
}
public void testDevice4670() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E370D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice4671() throws Exception {
    final String result = DeviceNames.getDeviceName("LT700", FALLBACK);
    Assert.assertEquals("QMobile LT700", result);
}
public void testDevice4672() throws Exception {
    final String result = DeviceNames.getDeviceName("4013E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4)", result);
}
public void testDevice4673() throws Exception {
    final String result = DeviceNames.getDeviceName("4013D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4)", result);
}
public void testDevice4674() throws Exception {
    final String result = DeviceNames.getDeviceName("FJT21", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Tab FJT21", result);
}
public void testDevice4675() throws Exception {
    final String result = DeviceNames.getDeviceName("R8007", FALLBACK);
    Assert.assertEquals("OPPO R8007", result);
}
public void testDevice4676() throws Exception {
    final String result = DeviceNames.getDeviceName("R8006", FALLBACK);
    Assert.assertEquals("OPPO R8006", result);
}
public void testDevice4677() throws Exception {
    final String result = DeviceNames.getDeviceName("4013K", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4)", result);
}
public void testDevice4678() throws Exception {
    final String result = DeviceNames.getDeviceName("4013J", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4)", result);
}
public void testDevice4679() throws Exception {
    final String result = DeviceNames.getDeviceName("DSlide750", FALLBACK);
    Assert.assertEquals("Danew DSlide 750", result);
}
public void testDevice4680() throws Exception {
    final String result = DeviceNames.getDeviceName("R8001", FALLBACK);
    Assert.assertEquals("OPPO R8001", result);
}
public void testDevice4681() throws Exception {
    final String result = DeviceNames.getDeviceName("R8000", FALLBACK);
    Assert.assertEquals("Oppo R8000", result);
}
public void testDevice4682() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6012B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Music Duos", result);
}
public void testDevice4683() throws Exception {
    final String result = DeviceNames.getDeviceName("4013X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) PIXI3(4)", result);
}
public void testDevice4684() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R915", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Indulge", result);
}
public void testDevice4685() throws Exception {
    final String result = DeviceNames.getDeviceName("ST21i2", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia tipo dual", result);
}
public void testDevice4686() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R910", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Indulge", result);
}
public void testDevice4687() throws Exception {
    final String result = DeviceNames.getDeviceName("Voyager", FALLBACK);
    Assert.assertEquals("Gigabyte TM75A", result);
}
public void testDevice4688() throws Exception {
    final String result = DeviceNames.getDeviceName("E2171TK", FALLBACK);
    Assert.assertEquals("Hisense Sero 7", result);
}
public void testDevice4689() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL22C", FALLBACK);
    Assert.assertEquals("LGE LG Power", result);
}
public void testDevice4690() throws Exception {
    final String result = DeviceNames.getDeviceName("N9518", FALLBACK);
    Assert.assertEquals("ZTE N9518", result);
}
public void testDevice4691() throws Exception {
    final String result = DeviceNames.getDeviceName("R800x", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia PLAY", result);
}
public void testDevice4692() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-C729", FALLBACK);
    Assert.assertEquals("LGE LG DOUBLEPLAY", result);
}
public void testDevice4693() throws Exception {
    final String result = DeviceNames.getDeviceName("N9516", FALLBACK);
    Assert.assertEquals("ZTE N9516", result);
}
public void testDevice4694() throws Exception {
    final String result = DeviceNames.getDeviceName("ECHO", FALLBACK);
    Assert.assertEquals("Mobicell ECHO", result);
}
public void testDevice4695() throws Exception {
    final String result = DeviceNames.getDeviceName("V55", FALLBACK);
    Assert.assertEquals("ZTE V55", result);
}
public void testDevice4696() throws Exception {
    final String result = DeviceNames.getDeviceName("R800i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Play", result);
}
public void testDevice4697() throws Exception {
    final String result = DeviceNames.getDeviceName("SOSMART_T5", FALLBACK);
    Assert.assertEquals("SOSMART T5", result);
}
public void testDevice4698() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LS840", FALLBACK);
    Assert.assertEquals("LG Viper", result);
}
public void testDevice4699() throws Exception {
    final String result = DeviceNames.getDeviceName("R800a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia PLAY", result);
}
public void testDevice4700() throws Exception {
    final String result = DeviceNames.getDeviceName("Vox", FALLBACK);
    Assert.assertEquals("Kobo Vox", result);
}
public void testDevice4701() throws Exception {
    final String result = DeviceNames.getDeviceName("TOSPASB", FALLBACK);
    Assert.assertEquals("TOSHIBA STB10", result);
}
public void testDevice4702() throws Exception {
    final String result = DeviceNames.getDeviceName("M555", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS M555", result);
}
public void testDevice4703() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5800", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Apollo", result);
}
public void testDevice4704() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5801", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Apollo", result);
}
public void testDevice4705() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-P306C", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL-P306C", result);
}
public void testDevice4706() throws Exception {
    final String result = DeviceNames.getDeviceName("STR-9.6-Tablet", FALLBACK);
    Assert.assertEquals("MachSpeed STR-9.6-Tablet", result);
}
public void testDevice4707() throws Exception {
    final String result = DeviceNames.getDeviceName("DWA1015D", FALLBACK);
    Assert.assertEquals("DigitalStream DWA1015D Tablet", result);
}
public void testDevice4708() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P970h", FALLBACK);
    Assert.assertEquals("LGE Optimus Black", result);
}
public void testDevice4709() throws Exception {
    final String result = DeviceNames.getDeviceName("E5663", FALLBACK);
    Assert.assertEquals("Sony Xperia M5 Dual", result);
}
public void testDevice4710() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P970g", FALLBACK);
    Assert.assertEquals("LGE Optimus Black", result);
}
public void testDevice4711() throws Exception {
    final String result = DeviceNames.getDeviceName("Y511-T00", FALLBACK);
    Assert.assertEquals("Huawei Y511-T00", result);
}
public void testDevice4712() throws Exception {
    final String result = DeviceNames.getDeviceName("WAX", FALLBACK);
    Assert.assertEquals("Wiko WAX", result);
}
public void testDevice4713() throws Exception {
    final String result = DeviceNames.getDeviceName("Aquaris_E4.5", FALLBACK);
    Assert.assertEquals("bq Aquaris E4.5", result);
}
public void testDevice4714() throws Exception {
    final String result = DeviceNames.getDeviceName("NXA8LTE116", FALLBACK);
    Assert.assertEquals("Nextbook NXA8LTE116", result);
}
public void testDevice4715() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I727", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2 Skyrocket", result);
}
public void testDevice4716() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G920W8", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice4717() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N5110", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 8.0", result);
}
public void testDevice4718() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A810S", FALLBACK);
    Assert.assertEquals("Pantech IM-A810S", result);
}
public void testDevice4719() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-02E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note2", result);
}
public void testDevice4720() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-02D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0 Plus", result);
}
public void testDevice4721() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-02G", FALLBACK);
    Assert.assertEquals("Samsung SC-02G", result);
}
public void testDevice4722() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-02F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note3", result);
}
public void testDevice4723() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-02C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S2", result);
}
public void testDevice4724() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-02B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S", result);
}
public void testDevice4725() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-N910", FALLBACK);
    Assert.assertEquals("ZTE-N910", result);
}
public void testDevice4726() throws Exception {
    final String result = DeviceNames.getDeviceName("IdeaTabA1000-G", FALLBACK);
    Assert.assertEquals("Lenovo A1000-G", result);
}
public void testDevice4727() throws Exception {
    final String result = DeviceNames.getDeviceName("IdeaTabA1000-F", FALLBACK);
    Assert.assertEquals("Lenovo A1000", result);
}
public void testDevice4728() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A810K", FALLBACK);
    Assert.assertEquals("Pantech IM-A810K", result);
}
public void testDevice4729() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50XT900X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED50XT900X3DU", result);
}
public void testDevice4730() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE_V5", FALLBACK);
    Assert.assertEquals("ZTE NE501J", result);
}
public void testDevice4731() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I879", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice4732() throws Exception {
    final String result = DeviceNames.getDeviceName("FS502", FALLBACK);
    Assert.assertEquals("Fly FS502", result);
}
public void testDevice4733() throws Exception {
    final String result = DeviceNames.getDeviceName("FS501", FALLBACK);
    Assert.assertEquals("Fly Nimbus3", result);
}
public void testDevice4734() throws Exception {
    final String result = DeviceNames.getDeviceName("LED58K610X3D", FALLBACK);
    Assert.assertEquals("Hisense LED58K610X3D", result);
}
public void testDevice4735() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-AK495", FALLBACK);
    Assert.assertEquals("LGE LG G Pad F 8.0", result);
}
public void testDevice4736() throws Exception {
    final String result = DeviceNames.getDeviceName("FS504", FALLBACK);
    Assert.assertEquals("Fly Cirrus 2", result);
}
public void testDevice4737() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4413_Quad", FALLBACK);
    Assert.assertEquals("Fly IQ4413 Quad", result);
}
public void testDevice4738() throws Exception {
    final String result = DeviceNames.getDeviceName("one8_0_1_coho", FALLBACK);
    Assert.assertEquals("CloudFone Cloudpad One 8.0", result);
}
public void testDevice4739() throws Exception {
    final String result = DeviceNames.getDeviceName("J630", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL J630", result);
}
public void testDevice4740() throws Exception {
    final String result = DeviceNames.getDeviceName("Dream", FALLBACK);
    Assert.assertEquals("WIKO DARKFULL", result);
}
public void testDevice4741() throws Exception {
    final String result = DeviceNames.getDeviceName("DA223HQL", FALLBACK);
    Assert.assertEquals("Acer DA223HQL", result);
}
public void testDevice4742() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7804G", FALLBACK);
    Assert.assertEquals("Proscan PLT7804G", result);
}
public void testDevice4743() throws Exception {
    final String result = DeviceNames.getDeviceName("ME860", FALLBACK);
    Assert.assertEquals("Motorola Atrix", result);
}
public void testDevice4744() throws Exception {
    final String result = DeviceNames.getDeviceName("PMT3038_3G", FALLBACK);
    Assert.assertEquals("Prestigio MultiPad Wize 3038 3G", result);
}
public void testDevice4745() throws Exception {
    final String result = DeviceNames.getDeviceName("DT101Bv51", FALLBACK);
    Assert.assertEquals("ESI Enterprises DT101Bv51", result);
}
public void testDevice4746() throws Exception {
    final String result = DeviceNames.getDeviceName("B1-810", FALLBACK);
    Assert.assertEquals("Acer Iconia One 8", result);
}
public void testDevice4747() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I705", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 7.0", result);
}
public void testDevice4748() throws Exception {
    final String result = DeviceNames.getDeviceName("S57", FALLBACK);
    Assert.assertEquals("Acer Liquid Jade Z", result);
}
public void testDevice4749() throws Exception {
    final String result = DeviceNames.getDeviceName("S56", FALLBACK);
    Assert.assertEquals("Acer Liquid Jade S", result);
}
public void testDevice4750() throws Exception {
    final String result = DeviceNames.getDeviceName("S55", FALLBACK);
    Assert.assertEquals("Acer Liquid Jade", result);
}
public void testDevice4751() throws Exception {
    final String result = DeviceNames.getDeviceName("S53", FALLBACK);
    Assert.assertEquals("Acer Liquid X1", result);
}
public void testDevice4752() throws Exception {
    final String result = DeviceNames.getDeviceName("S50", FALLBACK);
    Assert.assertEquals("Cat S50", result);
}
public void testDevice4753() throws Exception {
    final String result = DeviceNames.getDeviceName("IdeaTabA5000-E", FALLBACK);
    Assert.assertEquals("Lenovo IdeaTab A5000", result);
}
public void testDevice4754() throws Exception {
    final String result = DeviceNames.getDeviceName("S59", FALLBACK);
    Assert.assertEquals("Acer Liquid X2", result);
}
public void testDevice4755() throws Exception {
    final String result = DeviceNames.getDeviceName("ViewPhone3", FALLBACK);
    Assert.assertEquals("Foxconn ViewPhone3", result);
}
public void testDevice4756() throws Exception {
    final String result = DeviceNames.getDeviceName("TB01", FALLBACK);
    Assert.assertEquals("Huawei M620", result);
}
public void testDevice4757() throws Exception {
    final String result = DeviceNames.getDeviceName("L-EMENT_TAB1040", FALLBACK);
    Assert.assertEquals("Logicom L-EMENT TAB 1040", result);
}
public void testDevice4758() throws Exception {
    final String result = DeviceNames.getDeviceName("302KC", FALLBACK);
    Assert.assertEquals("Kyocera DIGNO T", result);
}
public void testDevice4759() throws Exception {
    final String result = DeviceNames.getDeviceName("40TL04", FALLBACK);
    Assert.assertEquals("Sanyo Benesse", result);
}
public void testDevice4760() throws Exception {
    final String result = DeviceNames.getDeviceName("N3-2200", FALLBACK);
    Assert.assertEquals("Acer N3-2200", result);
}
public void testDevice4761() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K610X3D", FALLBACK);
    Assert.assertEquals("Hisense LED32K610X3D", result);
}
public void testDevice4762() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9128I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice4763() throws Exception {
    final String result = DeviceNames.getDeviceName("M35c", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia SP", result);
}
public void testDevice4764() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9128E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice4765() throws Exception {
    final String result = DeviceNames.getDeviceName("C6725", FALLBACK);
    Assert.assertEquals("Kyocera Hydro VIBE", result);
}
public void testDevice4766() throws Exception {
    final String result = DeviceNames.getDeviceName("LE32U5000A", FALLBACK);
    Assert.assertEquals("Haier LE32U5000A", result);
}
public void testDevice4767() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9128V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice4768() throws Exception {
    final String result = DeviceNames.getDeviceName("2013023", FALLBACK);
    Assert.assertEquals("Xiaomi China", result);
}
public void testDevice4769() throws Exception {
    final String result = DeviceNames.getDeviceName("2013022", FALLBACK);
    Assert.assertEquals("Xiaomi Hong Mi", result);
}
public void testDevice4770() throws Exception {
    final String result = DeviceNames.getDeviceName("XT901", FALLBACK);
    Assert.assertEquals("Motorola Electrify M", result);
}
public void testDevice4771() throws Exception {
    final String result = DeviceNames.getDeviceName("M305", FALLBACK);
    Assert.assertEquals("Fujitsu M305", result);
}
public void testDevice4772() throws Exception {
    final String result = DeviceNames.getDeviceName("XT907", FALLBACK);
    Assert.assertEquals("Motorola Droid Razr M", result);
}
public void testDevice4773() throws Exception {
    final String result = DeviceNames.getDeviceName("Akta_A4", FALLBACK);
    Assert.assertEquals("GSmart Akta A4", result);
}
public void testDevice4774() throws Exception {
    final String result = DeviceNames.getDeviceName("LenovoA1000L-F", FALLBACK);
    Assert.assertEquals("Lenovo IdeaTab A1000", result);
}
public void testDevice4775() throws Exception {
    final String result = DeviceNames.getDeviceName("V72C", FALLBACK);
    Assert.assertEquals("ZTE V72C", result);
}
public void testDevice4776() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65K560J3DTR", FALLBACK);
    Assert.assertEquals("Hisense LED65K560J3DTR", result);
}
public void testDevice4777() throws Exception {
    final String result = DeviceNames.getDeviceName("T1-821W", FALLBACK);
    Assert.assertEquals("Huawei T1", result);
}
public void testDevice4778() throws Exception {
    final String result = DeviceNames.getDeviceName("LCD-LX565A-B", FALLBACK);
    Assert.assertEquals("Sharp LCD-LX565A", result);
}
public void testDevice4779() throws Exception {
    final String result = DeviceNames.getDeviceName("V72M", FALLBACK);
    Assert.assertEquals("ZTE V72M", result);
}
public void testDevice4780() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65K560J3DTB", FALLBACK);
    Assert.assertEquals("Hisense LED65K560J3DTB", result);
}
public void testDevice4781() throws Exception {
    final String result = DeviceNames.getDeviceName("LED39K680X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED39K680X3DU", result);
}
public void testDevice4782() throws Exception {
    final String result = DeviceNames.getDeviceName("T1-821L", FALLBACK);
    Assert.assertEquals("Huawei T1", result);
}
public void testDevice4783() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-L671", FALLBACK);
    Assert.assertEquals("Hisense L671W", result);
}
public void testDevice4784() throws Exception {
    final String result = DeviceNames.getDeviceName("CDP7TAB4C8", FALLBACK);
    Assert.assertEquals("Haier CDP7TAB4C8", result);
}
public void testDevice4785() throws Exception {
    final String result = DeviceNames.getDeviceName("AC45BHE", FALLBACK);
    Assert.assertEquals("Archos 45b Helium", result);
}
public void testDevice4786() throws Exception {
    final String result = DeviceNames.getDeviceName("102P", FALLBACK);
    Assert.assertEquals("Panasonic 102P", result);
}
public void testDevice4787() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T779", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 10.1", result);
}
public void testDevice4788() throws Exception {
    final String result = DeviceNames.getDeviceName("Infinity", FALLBACK);
    Assert.assertEquals("NGM Infinity", result);
}
public void testDevice4789() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F200K", FALLBACK);
    Assert.assertEquals("LGE Optimus Vu2", result);
}
public void testDevice4790() throws Exception {
    final String result = DeviceNames.getDeviceName("M721", FALLBACK);
    Assert.assertEquals("Allfine M721", result);
}
public void testDevice4791() throws Exception {
    final String result = DeviceNames.getDeviceName("402ZT", FALLBACK);
    Assert.assertEquals("ZTE 402ZT", result);
}
public void testDevice4792() throws Exception {
    final String result = DeviceNames.getDeviceName("morrison", FALLBACK);
    Assert.assertEquals("Motorola CLIQ", result);
}
public void testDevice4793() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D858", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice4794() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D859", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice4795() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D850", FALLBACK);
    Assert.assertEquals("LG G3", result);
}
public void testDevice4796() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D851", FALLBACK);
    Assert.assertEquals("LG G3", result);
}
public void testDevice4797() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G531Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice4798() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D855", FALLBACK);
    Assert.assertEquals("LG G3", result);
}
public void testDevice4799() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D856", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice4800() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D857", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice4801() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G531F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice4802() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G531H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice4803() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A700FD", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A7", result);
}
public void testDevice4804() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G531M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice4805() throws Exception {
    final String result = DeviceNames.getDeviceName("7040T", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 7040T", result);
}
public void testDevice4806() throws Exception {
    final String result = DeviceNames.getDeviceName("7040R", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 7040R", result);
}
public void testDevice4807() throws Exception {
    final String result = DeviceNames.getDeviceName("10.1Myros", FALLBACK);
    Assert.assertEquals("Vestel VP100+", result);
}
public void testDevice4808() throws Exception {
    final String result = DeviceNames.getDeviceName("SUNSET", FALLBACK);
    Assert.assertEquals("Wiko SUNSET", result);
}
public void testDevice4809() throws Exception {
    final String result = DeviceNames.getDeviceName("7040N", FALLBACK);
    Assert.assertEquals("Alcatel One Touch Fierce 2", result);
}
public void testDevice4810() throws Exception {
    final String result = DeviceNames.getDeviceName("EGD213", FALLBACK);
    Assert.assertEquals("Ematic EGD213", result);
}
public void testDevice4811() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T980", FALLBACK);
    Assert.assertEquals("Hisense HS-T980", result);
}
public void testDevice4812() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T707V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S 8.4", result);
}
public void testDevice4813() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T255S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy W", result);
}
public void testDevice4814() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-E917", FALLBACK);
    Assert.assertEquals("Hisense HS-E917", result);
}
public void testDevice4815() throws Exception {
    final String result = DeviceNames.getDeviceName("C6_Duo", FALLBACK);
    Assert.assertEquals("AllView C6 Duo", result);
}
public void testDevice4816() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6103W46", FALLBACK);
    Assert.assertEquals("RCA RCT6103W46", result);
}
public void testDevice4817() throws Exception {
    final String result = DeviceNames.getDeviceName("iRULU_V3", FALLBACK);
    Assert.assertEquals("USA111 iRULU V3", result);
}
public void testDevice4818() throws Exception {
    final String result = DeviceNames.getDeviceName("VP74", FALLBACK);
    Assert.assertEquals("Vestel VP74", result);
}
public void testDevice4819() throws Exception {
    final String result = DeviceNames.getDeviceName("VP73", FALLBACK);
    Assert.assertEquals("Vestel VP73", result);
}
public void testDevice4820() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D700", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L9", result);
}
public void testDevice4821() throws Exception {
    final String result = DeviceNames.getDeviceName("MK16i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia pro", result);
}
public void testDevice4822() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL96G", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7", result);
}
public void testDevice4823() throws Exception {
    final String result = DeviceNames.getDeviceName("MK16a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia pro", result);
}
public void testDevice4824() throws Exception {
    final String result = DeviceNames.getDeviceName("SMT-E5015", FALLBACK);
    Assert.assertEquals("Samsung olleh", result);
}
public void testDevice4825() throws Exception {
    final String result = DeviceNames.getDeviceName("E2_Jump", FALLBACK);
    Assert.assertEquals("AllView E2 Jump", result);
}
public void testDevice4826() throws Exception {
    final String result = DeviceNames.getDeviceName("KFOT", FALLBACK);
    Assert.assertEquals("Kindle Fire", result);
}
public void testDevice4827() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T320X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Pro 8.4", result);
}
public void testDevice4828() throws Exception {
    final String result = DeviceNames.getDeviceName("FJL22", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Z FJL22", result);
}
public void testDevice4829() throws Exception {
    final String result = DeviceNames.getDeviceName("FJL21", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS ef FJL21", result);
}
public void testDevice4830() throws Exception {
    final String result = DeviceNames.getDeviceName("E5506", FALLBACK);
    Assert.assertEquals("Sony Xperia C5 Ultra", result);
}
public void testDevice4831() throws Exception {
    final String result = DeviceNames.getDeviceName("T70", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) T70", result);
}
public void testDevice4832() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-EG929", FALLBACK);
    Assert.assertEquals("Hisense HS-EG929", result);
}
public void testDevice4833() throws Exception {
    final String result = DeviceNames.getDeviceName("ODYSSEY", FALLBACK);
    Assert.assertEquals("Crosscall ODYSSEY", result);
}
public void testDevice4834() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite10QI", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite10QI", result);
}
public void testDevice4835() throws Exception {
    final String result = DeviceNames.getDeviceName("P-04D", FALLBACK);
    Assert.assertEquals("Panasonic P-04D", result);
}
public void testDevice4836() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite10QL", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite10QL", result);
}
public void testDevice4837() throws Exception {
    final String result = DeviceNames.getDeviceName("H60-L02", FALLBACK);
    Assert.assertEquals("Huawei H60-L02", result);
}
public void testDevice4838() throws Exception {
    final String result = DeviceNames.getDeviceName("H60-L03", FALLBACK);
    Assert.assertEquals("Huawei H60-L03", result);
}
public void testDevice4839() throws Exception {
    final String result = DeviceNames.getDeviceName("H60-L01", FALLBACK);
    Assert.assertEquals("Huawei H60-L01", result);
}
public void testDevice4840() throws Exception {
    final String result = DeviceNames.getDeviceName("H60-L04", FALLBACK);
    Assert.assertEquals("Huawei H60-L04", result);
}
public void testDevice4841() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-E500YZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E5", result);
}
public void testDevice4842() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite10QS", FALLBACK);
    Assert.assertEquals("Visual Land Prestige Elite10QS", result);
}
public void testDevice4843() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E500L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win", result);
}
public void testDevice4844() throws Exception {
    final String result = DeviceNames.getDeviceName("H940", FALLBACK);
    Assert.assertEquals("Cherry Mobile One", result);
}
public void testDevice4845() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R830C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Admire 2", result);
}
public void testDevice4846() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A750K", FALLBACK);
    Assert.assertEquals("Pantech Mirach A", result);
}
public void testDevice4847() throws Exception {
    final String result = DeviceNames.getDeviceName("PC1038Q", FALLBACK);
    Assert.assertEquals("Allfine PC1038Q", result);
}
public void testDevice4848() throws Exception {
    final String result = DeviceNames.getDeviceName("asus_google_cube", FALLBACK);
    Assert.assertEquals("Asus Cube", result);
}
public void testDevice4849() throws Exception {
    final String result = DeviceNames.getDeviceName("eZeeTab7D15-M", FALLBACK);
    Assert.assertEquals("Storex eZeeTab7D15-M", result);
}
public void testDevice4850() throws Exception {
    final String result = DeviceNames.getDeviceName("Easy", FALLBACK);
    Assert.assertEquals("Explay Easy", result);
}
public void testDevice4851() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D693TR", FALLBACK);
    Assert.assertEquals("LGE G3 Stylus", result);
}
public void testDevice4852() throws Exception {
    final String result = DeviceNames.getDeviceName("Antares", FALLBACK);
    Assert.assertEquals("Tonino Lamborghini Antares", result);
}
public void testDevice4853() throws Exception {
    final String result = DeviceNames.getDeviceName("ML01-M7S-Quad-Core", FALLBACK);
    Assert.assertEquals("Multilaser M7s Quad Core", result);
}
public void testDevice4854() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E450B", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice4855() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-830", FALLBACK);
    Assert.assertEquals("Acer A1-830", result);
}
public void testDevice4856() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000018-002", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice4857() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000018-003", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice4858() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D802T", FALLBACK);
    Assert.assertEquals("LGE LG G2", result);
}
public void testDevice4859() throws Exception {
    final String result = DeviceNames.getDeviceName("D000-000018-001", FALLBACK);
    Assert.assertEquals("NEC LifeTouch B", result);
}
public void testDevice4860() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A740S", FALLBACK);
    Assert.assertEquals("Pantech IM-A740S", result);
}
public void testDevice4861() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G800A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 mini", result);
}
public void testDevice4862() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E450f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice4863() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E450g", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L5 II", result);
}
public void testDevice4864() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E405f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L3 Dual", result);
}
public void testDevice4865() throws Exception {
    final String result = DeviceNames.getDeviceName("AM-H200", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Sol", result);
}
public void testDevice4866() throws Exception {
    final String result = DeviceNames.getDeviceName("R1011", FALLBACK);
    Assert.assertEquals("Oppo R1011w", result);
}
public void testDevice4867() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP641", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3 Tablet Compact", result);
}
public void testDevice4868() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP311", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Tablet Z", result);
}
public void testDevice4869() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP312", FALLBACK);
    Assert.assertEquals("Sony Xperia Tablet Z", result);
}
public void testDevice4870() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I927", FALLBACK);
    Assert.assertEquals("Samsung Captivate Glide", result);
}
public void testDevice4871() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-MS840", FALLBACK);
    Assert.assertEquals("LGE LG Connect 4G", result);
}
public void testDevice4872() throws Exception {
    final String result = DeviceNames.getDeviceName("MTN-S620", FALLBACK);
    Assert.assertEquals("MTN-S620", result);
}
public void testDevice4873() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J3109", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J3", result);
}
public void testDevice4874() throws Exception {
    final String result = DeviceNames.getDeviceName("Style", FALLBACK);
    Assert.assertEquals("Explay Style", result);
}
public void testDevice4875() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I527M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mega 6.3", result);
}
public void testDevice4876() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H340GT", FALLBACK);
    Assert.assertEquals("LGE LG Leon 4G LTE", result);
}
public void testDevice4877() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-US730", FALLBACK);
    Assert.assertEquals("LGE Splendor", result);
}
public void testDevice4878() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R930", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Aviator", result);
}
public void testDevice4879() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D285", FALLBACK);
    Assert.assertEquals("LGE L65", result);
}
public void testDevice4880() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D280", FALLBACK);
    Assert.assertEquals("LGE L65", result);
}
public void testDevice4881() throws Exception {
    final String result = DeviceNames.getDeviceName("E270BSA", FALLBACK);
    Assert.assertEquals("Hisense E270BSA", result);
}
public void testDevice4882() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J100Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice4883() throws Exception {
    final String result = DeviceNames.getDeviceName("Tab870", FALLBACK);
    Assert.assertEquals("Bitmore Tab870", result);
}
public void testDevice4884() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J100G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J1", result);
}
public void testDevice4885() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL75C", FALLBACK);
    Assert.assertEquals("LGE LG OPTIMUS ZIP", result);
}
public void testDevice4886() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T212", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 7.0", result);
}
public void testDevice4887() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T211", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 7.0", result);
}
public void testDevice4888() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T210", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 3", result);
}
public void testDevice4889() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T215", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 7.0", result);
}
public void testDevice4890() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8150", FALLBACK);
    Assert.assertEquals("Samsung Galaxy W", result);
}
public void testDevice4891() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-N045", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice4892() throws Exception {
    final String result = DeviceNames.getDeviceName("ITP-R408W", FALLBACK);
    Assert.assertEquals("TUNTUN English DREAM PAD", result);
}
public void testDevice4893() throws Exception {
    final String result = DeviceNames.getDeviceName("ONYX", FALLBACK);
    Assert.assertEquals("Mobicell ONYX", result);
}
public void testDevice4894() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I896", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S Captivate", result);
}
public void testDevice4895() throws Exception {
    final String result = DeviceNames.getDeviceName("M1_Plus", FALLBACK);
    Assert.assertEquals("Explay M1 Plus", result);
}
public void testDevice4896() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G920A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6", result);
}
public void testDevice4897() throws Exception {
    final String result = DeviceNames.getDeviceName("H450R", FALLBACK);
    Assert.assertEquals("ANS Trailblazer", result);
}
public void testDevice4898() throws Exception {
    final String result = DeviceNames.getDeviceName("Phantom", FALLBACK);
    Assert.assertEquals("Explay Phantom", result);
}
public void testDevice4899() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P895qb", FALLBACK);
    Assert.assertEquals("LGE Optimus Vu", result);
}
public void testDevice4900() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M570S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Advance", result);
}
public void testDevice4901() throws Exception {
    final String result = DeviceNames.getDeviceName("GW620", FALLBACK);
    Assert.assertEquals("LGE Eve", result);
}
public void testDevice4902() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E981h", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G Pro", result);
}
public void testDevice4903() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7500", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
}
public void testDevice4904() throws Exception {
    final String result = DeviceNames.getDeviceName("T10+", FALLBACK);
    Assert.assertEquals("Tobii DynaVox T10+", result);
}
public void testDevice4905() throws Exception {
    final String result = DeviceNames.getDeviceName("LT26ii", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia SL", result);
}
public void testDevice4906() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC6500LVW", FALLBACK);
    Assert.assertEquals("HTC One", result);
}
public void testDevice4907() throws Exception {
    final String result = DeviceNames.getDeviceName("Telenor_Smart_Pro", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ALCATEL ONE TOUCH 991", result);
}
public void testDevice4908() throws Exception {
    final String result = DeviceNames.getDeviceName("COUPLE", FALLBACK);
    Assert.assertEquals("Foxconn MUSN COUPLE", result);
}
public void testDevice4909() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P905F0", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Pro 12.2", result);
}
public void testDevice4910() throws Exception {
    final String result = DeviceNames.getDeviceName("X2_Soul_Style_TM", FALLBACK);
    Assert.assertEquals("AllView X2 Soul Style", result);
}
public void testDevice4911() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360T1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice4912() throws Exception {
    final String result = DeviceNames.getDeviceName("icube-830", FALLBACK);
    Assert.assertEquals("SK Telesys icube-830", result);
}
public void testDevice4913() throws Exception {
    final String result = DeviceNames.getDeviceName("S380", FALLBACK);
    Assert.assertEquals("Positivo S380", result);
}
public void testDevice4914() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I815", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.7", result);
}
public void testDevice4915() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R730", FALLBACK);
    Assert.assertEquals("Samsung Transfix", result);
}
public void testDevice4916() throws Exception {
    final String result = DeviceNames.getDeviceName("Che2-TL00", FALLBACK);
    Assert.assertEquals("Huawei Che2-TL00", result);
}
public void testDevice4917() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55XT900X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED55XT900X3DU", result);
}
public void testDevice4918() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E275K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand", result);
}
public void testDevice4919() throws Exception {
    final String result = DeviceNames.getDeviceName("Transformer_Prime_TF201", FALLBACK);
    Assert.assertEquals("Asus Eee Pad Transformer Prime", result);
}
public void testDevice4920() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-01FDQ", FALLBACK);
    Assert.assertEquals("Sharp SH-01F DRAGON QUEST", result);
}
public void testDevice4921() throws Exception {
    final String result = DeviceNames.getDeviceName("D820", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) D820", result);
}
public void testDevice4922() throws Exception {
    final String result = DeviceNames.getDeviceName("A521L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) A521L", result);
}
public void testDevice4923() throws Exception {
    final String result = DeviceNames.getDeviceName("ST17i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia active", result);
}
public void testDevice4924() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D390n", FALLBACK);
    Assert.assertEquals("LGE F60", result);
}
public void testDevice4925() throws Exception {
    final String result = DeviceNames.getDeviceName("DROID_RAZR", FALLBACK);
    Assert.assertEquals("Motorola Droid Razr", result);
}
public void testDevice4926() throws Exception {
    final String result = DeviceNames.getDeviceName("BouygtelTV", FALLBACK);
    Assert.assertEquals("Bouygues Telecom Bbox Miami", result);
}
public void testDevice4927() throws Exception {
    final String result = DeviceNames.getDeviceName("S3015", FALLBACK);
    Assert.assertEquals("Entel S3015", result);
}
public void testDevice4928() throws Exception {
    final String result = DeviceNames.getDeviceName("PE-CL00", FALLBACK);
    Assert.assertEquals("Huawei PE-CL00", result);
}
public void testDevice4929() throws Exception {
    final String result = DeviceNames.getDeviceName("D75E", FALLBACK);
    Assert.assertEquals("Honeywell D75E", result);
}
public void testDevice4930() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3812", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win Pro", result);
}
public void testDevice4931() throws Exception {
    final String result = DeviceNames.getDeviceName("E2053", FALLBACK);
    Assert.assertEquals("Sony Xperia E4g", result);
}
public void testDevice4932() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3815", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Express II", result);
}
public void testDevice4933() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3818", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win Pro", result);
}
public void testDevice4934() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3819", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win Pro", result);
}
public void testDevice4935() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_M8MINx", FALLBACK);
    Assert.assertEquals("HTC One mini 2", result);
}
public void testDevice4936() throws Exception {
    final String result = DeviceNames.getDeviceName("LED50XT880G3D", FALLBACK);
    Assert.assertEquals("Hisense LED50XT880G3D", result);
}
public void testDevice4937() throws Exception {
    final String result = DeviceNames.getDeviceName("Patio100_3G", FALLBACK);
    Assert.assertEquals("Fujitsu Patio100", result);
}
public void testDevice4938() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC6535LRA", FALLBACK);
    Assert.assertEquals("HTC One M9", result);
}
public void testDevice4939() throws Exception {
    final String result = DeviceNames.getDeviceName("MFC_HR", FALLBACK);
    Assert.assertEquals("Clementoni My First Clempad HR", result);
}
public void testDevice4940() throws Exception {
    final String result = DeviceNames.getDeviceName("TD070VA1", FALLBACK);
    Assert.assertEquals("Acer Tab 7", result);
}
public void testDevice4941() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_990", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) One Touch 990", result);
}
public void testDevice4942() throws Exception {
    final String result = DeviceNames.getDeviceName("ALCATEL_one_touch_995", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) ATEL ONE TOUCH 995", result);
}
public void testDevice4943() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I827D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Q", result);
}
public void testDevice4944() throws Exception {
    final String result = DeviceNames.getDeviceName("M321", FALLBACK);
    Assert.assertEquals("Huawei Honor Box", result);
}
public void testDevice4945() throws Exception {
    final String result = DeviceNames.getDeviceName("A31", FALLBACK);
    Assert.assertEquals("Oppo A31", result);
}
public void testDevice4946() throws Exception {
    final String result = DeviceNames.getDeviceName("R800at", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia PLAY", result);
}
public void testDevice4947() throws Exception {
    final String result = DeviceNames.getDeviceName("SCV31", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice4948() throws Exception {
    final String result = DeviceNames.getDeviceName("SCV32", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A8", result);
}
public void testDevice4949() throws Exception {
    final String result = DeviceNames.getDeviceName("Y340-U081", FALLBACK);
    Assert.assertEquals("Huawei Y340-U081", result);
}
public void testDevice4950() throws Exception {
    final String result = DeviceNames.getDeviceName("TA80CA1", FALLBACK);
    Assert.assertEquals("i-Buddie TA80CA1", result);
}
public void testDevice4951() throws Exception {
    final String result = DeviceNames.getDeviceName("TA80CA2", FALLBACK);
    Assert.assertEquals("Casper TA80CA2", result);
}
public void testDevice4952() throws Exception {
    final String result = DeviceNames.getDeviceName("VP73_le", FALLBACK);
    Assert.assertEquals("Vestel VP73", result);
}
public void testDevice4953() throws Exception {
    final String result = DeviceNames.getDeviceName("NABI2-NV7A", FALLBACK);
    Assert.assertEquals("Nabi 2 Tablet", result);
}
public void testDevice4954() throws Exception {
    final String result = DeviceNames.getDeviceName("Y220-U05", FALLBACK);
    Assert.assertEquals("Huawei Y220", result);
}
public void testDevice4955() throws Exception {
    final String result = DeviceNames.getDeviceName("P480", FALLBACK);
    Assert.assertEquals("Micromax Canvas Tab", result);
}
public void testDevice4956() throws Exception {
    final String result = DeviceNames.getDeviceName("T-02D", FALLBACK);
    Assert.assertEquals("Fujitsu REGZA Phone T-02D", result);
}
public void testDevice4957() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3819D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win Pro", result);
}
public void testDevice4958() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65XT780G3D", FALLBACK);
    Assert.assertEquals("Hisense LED65XT780G3D", result);
}
public void testDevice4959() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K280J3D", FALLBACK);
    Assert.assertEquals("Hisense LED42K280J3D", result);
}
public void testDevice4960() throws Exception {
    final String result = DeviceNames.getDeviceName("NEC909e", FALLBACK);
    Assert.assertEquals("NEC909e", result);
}
public void testDevice4961() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J500G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J5", result);
}
public void testDevice4962() throws Exception {
    final String result = DeviceNames.getDeviceName("VIA-T7D", FALLBACK);
    Assert.assertEquals("Casper VIA T7D", result);
}
public void testDevice4963() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J500H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J5", result);
}
public void testDevice4964() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T535", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 10.0", result);
}
public void testDevice4965() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T533", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 10.1", result);
}
public void testDevice4966() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T530", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 10.1", result);
}
public void testDevice4967() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T531", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 10.0", result);
}
public void testDevice4968() throws Exception {
    final String result = DeviceNames.getDeviceName("Forge", FALLBACK);
    Assert.assertEquals("Razer Forge TV", result);
}
public void testDevice4969() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J500Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J5", result);
}
public void testDevice4970() throws Exception {
    final String result = DeviceNames.getDeviceName("Z410", FALLBACK);
    Assert.assertEquals("Acer Liquid Z410", result);
}
public void testDevice4971() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R890", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice4972() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H779", FALLBACK);
    Assert.assertEquals("LGE LG AKA", result);
}
public void testDevice4973() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H778", FALLBACK);
    Assert.assertEquals("LGE LG AKA", result);
}
public void testDevice4974() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I717", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice4975() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-G50", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Player 50", result);
}
public void testDevice4976() throws Exception {
    final String result = DeviceNames.getDeviceName("E2281TK", FALLBACK);
    Assert.assertEquals("Hisense Sero 8", result);
}
public void testDevice4977() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-R530C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3", result);
}
public void testDevice4978() throws Exception {
    final String result = DeviceNames.getDeviceName("CP-VL5A", FALLBACK);
    Assert.assertEquals("Hipstreet CP-VL5A", result);
}
public void testDevice4979() throws Exception {
    final String result = DeviceNames.getDeviceName("R821T", FALLBACK);
    Assert.assertEquals("Oppo R821T", result);
}
public void testDevice4980() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9106W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice4981() throws Exception {
    final String result = DeviceNames.getDeviceName("Vega", FALLBACK);
    Assert.assertEquals("Explay Vega", result);
}
public void testDevice4982() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3502DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP3502DUO", result);
}
public void testDevice4983() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Amaze_4G", FALLBACK);
    Assert.assertEquals("HTC Amaze 4G", result);
}
public void testDevice4984() throws Exception {
    final String result = DeviceNames.getDeviceName("ME371MG", FALLBACK);
    Assert.assertEquals("ASUS Fonepad ME371MG", result);
}
public void testDevice4985() throws Exception {
    final String result = DeviceNames.getDeviceName("7DTB37", FALLBACK);
    Assert.assertEquals("Hipstreet 7DTB37", result);
}
public void testDevice4986() throws Exception {
    final String result = DeviceNames.getDeviceName("Ice-Twist", FALLBACK);
    Assert.assertEquals("Huawei Ice-Twist", result);
}
public void testDevice4987() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J5007", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J5", result);
}
public void testDevice4988() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J5008", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J5", result);
}
public void testDevice4989() throws Exception {
    final String result = DeviceNames.getDeviceName("MD1005", FALLBACK);
    Assert.assertEquals("Lazer MD1005 Tablet", result);
}
public void testDevice4990() throws Exception {
    final String result = DeviceNames.getDeviceName("MD1001", FALLBACK);
    Assert.assertEquals("AMTC MD1001 Tablet", result);
}
public void testDevice4991() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C105L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Zoom", result);
}
public void testDevice4992() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C105K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Zoom", result);
}
public void testDevice4993() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H440n", FALLBACK);
    Assert.assertEquals("LGE LG Spirit 4G LTE", result);
}
public void testDevice4994() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5700", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Spica", result);
}
public void testDevice4995() throws Exception {
    final String result = DeviceNames.getDeviceName("D2-727", FALLBACK);
    Assert.assertEquals("Anydata D2-727G", result);
}
public void testDevice4996() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-C105S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Zoom", result);
}
public void testDevice4997() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T705M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 8.4", result);
}
public void testDevice4998() throws Exception {
    final String result = DeviceNames.getDeviceName("TCC893X_EVM", FALLBACK);
    Assert.assertEquals("Hyundai CAR AVN SYSTEM", result);
}
public void testDevice4999() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F460S", FALLBACK);
    Assert.assertEquals("LGE LG G3 Cat.6", result);
}
public void testDevice5000() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-05D", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia SX", result);
}
public void testDevice5001() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-05F", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2 Tablet", result);
}
public void testDevice5002() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-05G", FALLBACK);
    Assert.assertEquals("Sony Xperia Z4 Tablet", result);
}
public void testDevice5003() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T705C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S 8.4", result);
}
public void testDevice5004() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6102E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Duos", result);
}
public void testDevice5005() throws Exception {
    final String result = DeviceNames.getDeviceName("ThinkVision28", FALLBACK);
    Assert.assertEquals("Lenovo ThinkVision28", result);
}
public void testDevice5006() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T705Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S 8.4", result);
}
public void testDevice5007() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6102B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y Duos", result);
}
public void testDevice5008() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P705", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L7", result);
}
public void testDevice5009() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T705W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 8.4", result);
}
public void testDevice5010() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F460K", FALLBACK);
    Assert.assertEquals("LGE LG G3 Cat.6", result);
}
public void testDevice5011() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F460L", FALLBACK);
    Assert.assertEquals("LGE LG G3 Cat.6", result);
}
public void testDevice5012() throws Exception {
    final String result = DeviceNames.getDeviceName("PAD841", FALLBACK);
    Assert.assertEquals("Haier PAD841", result);
}
public void testDevice5013() throws Exception {
    final String result = DeviceNames.getDeviceName("501SO", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5", result);
}
public void testDevice5014() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D728", FALLBACK);
    Assert.assertEquals("LGE G3 Beat", result);
}
public void testDevice5015() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D729", FALLBACK);
    Assert.assertEquals("LGE G3 Beat", result);
}
public void testDevice5016() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D722", FALLBACK);
    Assert.assertEquals("LGE G3 S", result);
}
public void testDevice5017() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D723", FALLBACK);
    Assert.assertEquals("LGE G3 S", result);
}
public void testDevice5018() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D726", FALLBACK);
    Assert.assertEquals("LGE G3 Beat", result);
}
public void testDevice5019() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D727", FALLBACK);
    Assert.assertEquals("LGE G3 Beat", result);
}
public void testDevice5020() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D724", FALLBACK);
    Assert.assertEquals("LGE G3 S", result);
}
public void testDevice5021() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D725", FALLBACK);
    Assert.assertEquals("LGE G3 Vigor", result);
}
public void testDevice5022() throws Exception {
    final String result = DeviceNames.getDeviceName("VivaH10LTE", FALLBACK);
    Assert.assertEquals("AllView Viva H10 LTE", result);
}
public void testDevice5023() throws Exception {
    final String result = DeviceNames.getDeviceName("776TPCIII", FALLBACK);
    Assert.assertEquals("iView 776TPCIII", result);
}
public void testDevice5024() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_M8Sx", FALLBACK);
    Assert.assertEquals("HTC One (E8)", result);
}
public void testDevice5025() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_M8Sy", FALLBACK);
    Assert.assertEquals("HTC One (E8) dual sim", result);
}
public void testDevice5026() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL41C", FALLBACK);
    Assert.assertEquals("LGE L70 CDMA", result);
}
public void testDevice5027() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-J200BT", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J2", result);
}
public void testDevice5028() throws Exception {
    final String result = DeviceNames.getDeviceName("SOV31", FALLBACK);
    Assert.assertEquals("Sony Xperia Z4", result);
}
public void testDevice5029() throws Exception {
    final String result = DeviceNames.getDeviceName("SOV32", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5", result);
}
public void testDevice5030() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32L288", FALLBACK);
    Assert.assertEquals("Hisense LED32L288", result);
}
public void testDevice5031() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_M8Sd", FALLBACK);
    Assert.assertEquals("HTC One E8 dual", result);
}
public void testDevice5032() throws Exception {
    final String result = DeviceNames.getDeviceName("MSP4507", FALLBACK);
    Assert.assertEquals("Manta MSP4507", result);
}
public void testDevice5033() throws Exception {
    final String result = DeviceNames.getDeviceName("NV8", FALLBACK);
    Assert.assertEquals("Ncredible NV8", result);
}
public void testDevice5034() throws Exception {
    final String result = DeviceNames.getDeviceName("T10", FALLBACK);
    Assert.assertEquals("BYD DynaVox T10", result);
}
public void testDevice5035() throws Exception {
    final String result = DeviceNames.getDeviceName("TF201", FALLBACK);
    Assert.assertEquals("Asus Eee Pad Transformer Prime", result);
}
public void testDevice5036() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P3105", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 7.0", result);
}
public void testDevice5037() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P3100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 2", result);
}
public void testDevice5038() throws Exception {
    final String result = DeviceNames.getDeviceName("DP7856K", FALLBACK);
    Assert.assertEquals("Dopo DP7856K", result);
}
public void testDevice5039() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-06DNERV", FALLBACK);
    Assert.assertEquals("Sharp SH-06D NERV", result);
}
public void testDevice5040() throws Exception {
    final String result = DeviceNames.getDeviceName("A5_Quad_Plus_TM", FALLBACK);
    Assert.assertEquals("AllView A5 Quad Plus", result);
}
public void testDevice5041() throws Exception {
    final String result = DeviceNames.getDeviceName("MaxiIQ", FALLBACK);
    Assert.assertEquals("Pegatron MaxiIQ", result);
}
public void testDevice5042() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_P891X", FALLBACK);
    Assert.assertEquals("Medion LIFETAB P891X", result);
}
public void testDevice5043() throws Exception {
    final String result = DeviceNames.getDeviceName("P-06D", FALLBACK);
    Assert.assertEquals("Panasonic ELUGA V", result);
}
public void testDevice5044() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D100AR", FALLBACK);
    Assert.assertEquals("LGE L20", result);
}
public void testDevice5045() throws Exception {
    final String result = DeviceNames.getDeviceName("Clempad2_plus", FALLBACK);
    Assert.assertEquals("Clementoni Clempad 4.4 Plus", result);
}
public void testDevice5046() throws Exception {
    final String result = DeviceNames.getDeviceName("EGQ377", FALLBACK);
    Assert.assertEquals("Ematic EGQ377", result);
}
public void testDevice5047() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T715N0", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 8.0", result);
}
public void testDevice5048() throws Exception {
    final String result = DeviceNames.getDeviceName("F5281CH", FALLBACK);
    Assert.assertEquals("Hisense F5281CH", result);
}
public void testDevice5049() throws Exception {
    final String result = DeviceNames.getDeviceName("YU5050", FALLBACK);
    Assert.assertEquals("Micromax Yutopia", result);
}
public void testDevice5050() throws Exception {
    final String result = DeviceNames.getDeviceName("PTAB1051_PTAB1055", FALLBACK);
    Assert.assertEquals("Polaroid PTAB1051-PTAB1055", result);
}
public void testDevice5051() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-GC100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera", result);
}
public void testDevice5052() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T560NU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab E 9.6", result);
}
public void testDevice5053() throws Exception {
    final String result = DeviceNames.getDeviceName("MZ606", FALLBACK);
    Assert.assertEquals("Motorola XOOM", result);
}
public void testDevice5054() throws Exception {
    final String result = DeviceNames.getDeviceName("NX405H", FALLBACK);
    Assert.assertEquals("ZTE NX405H", result);
}
public void testDevice5055() throws Exception {
    final String result = DeviceNames.getDeviceName("Patio100", FALLBACK);
    Assert.assertEquals("Fujitsu Patio100", result);
}
public void testDevice5056() throws Exception {
    final String result = DeviceNames.getDeviceName("ME525+", FALLBACK);
    Assert.assertEquals("Motorola Defy", result);
}
public void testDevice5057() throws Exception {
    final String result = DeviceNames.getDeviceName("MB525", FALLBACK);
    Assert.assertEquals("Motorola Defy", result);
}
public void testDevice5058() throws Exception {
    final String result = DeviceNames.getDeviceName("ATH-UL00", FALLBACK);
    Assert.assertEquals("Huawei ATH-UL00", result);
}
public void testDevice5059() throws Exception {
    final String result = DeviceNames.getDeviceName("LED55K260X3D", FALLBACK);
    Assert.assertEquals("Hisense LED55K260X3D", result);
}
public void testDevice5060() throws Exception {
    final String result = DeviceNames.getDeviceName("Play", FALLBACK);
    Assert.assertEquals("WeTek Play", result);
}
public void testDevice5061() throws Exception {
    final String result = DeviceNames.getDeviceName("NE-202", FALLBACK);
    Assert.assertEquals("NEC MEDIAS NE-202", result);
}
public void testDevice5062() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLS660", FALLBACK);
    Assert.assertEquals("LG Tribute LS660", result);
}
public void testDevice5063() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-V410", FALLBACK);
    Assert.assertEquals("LG G Pad 7.0", result);
}
public void testDevice5064() throws Exception {
    final String result = DeviceNames.getDeviceName("SB506", FALLBACK);
    Assert.assertEquals("Gigabyte SB506", result);
}
public void testDevice5065() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-GP1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Player 5.8", result);
}
public void testDevice5066() throws Exception {
    final String result = DeviceNames.getDeviceName("P5Life", FALLBACK);
    Assert.assertEquals("AllView P5Life", result);
}
public void testDevice5067() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D682TR", FALLBACK);
    Assert.assertEquals("LGE G Pro Lite", result);
}
public void testDevice5068() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP3452DUO", FALLBACK);
    Assert.assertEquals("Prestigio Muze A3", result);
}
public void testDevice5069() throws Exception {
    final String result = DeviceNames.getDeviceName("KSP8000", FALLBACK);
    Assert.assertEquals("Kyocera Echo", result);
}
public void testDevice5070() throws Exception {
    final String result = DeviceNames.getDeviceName("Elite", FALLBACK);
    Assert.assertEquals("Panasonic Elite 18", result);
}
public void testDevice5071() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P505R", FALLBACK);
    Assert.assertEquals("LGE LG Optimus One", result);
}
public void testDevice5072() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-810", FALLBACK);
    Assert.assertEquals("Acer Iconia A1-810", result);
}
public void testDevice5073() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-811", FALLBACK);
    Assert.assertEquals("Acer A1-811", result);
}
public void testDevice5074() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G355HQ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core2", result);
}
public void testDevice5075() throws Exception {
    final String result = DeviceNames.getDeviceName("Kurio10S", FALLBACK);
    Assert.assertEquals("KD Interactive Kurio10S", result);
}
public void testDevice5076() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M305W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice5077() throws Exception {
    final String result = DeviceNames.getDeviceName("R2001", FALLBACK);
    Assert.assertEquals("OPPO R2001", result);
}
public void testDevice5078() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G355HN", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core2", result);
}
public void testDevice5079() throws Exception {
    final String result = DeviceNames.getDeviceName("8030B", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8030B", result);
}
public void testDevice5080() throws Exception {
    final String result = DeviceNames.getDeviceName("L-01E", FALLBACK);
    Assert.assertEquals("LGE LG Optimus G", result);
}
public void testDevice5081() throws Exception {
    final String result = DeviceNames.getDeviceName("V9c", FALLBACK);
    Assert.assertEquals("ZTE V9", result);
}
public void testDevice5082() throws Exception {
    final String result = DeviceNames.getDeviceName("L-01F", FALLBACK);
    Assert.assertEquals("G2", result);
}
public void testDevice5083() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6213W87DK", FALLBACK);
    Assert.assertEquals("RCA 11 Maven Pro", result);
}
public void testDevice5084() throws Exception {
    final String result = DeviceNames.getDeviceName("V9e", FALLBACK);
    Assert.assertEquals("ZTE V9", result);
}
public void testDevice5085() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G360AZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice5086() throws Exception {
    final String result = DeviceNames.getDeviceName("8030Y", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 8030Y", result);
}
public void testDevice5087() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T235", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice5088() throws Exception {
    final String result = DeviceNames.getDeviceName("V9S", FALLBACK);
    Assert.assertEquals("ZTE V9S", result);
}
public void testDevice5089() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T231", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice5090() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T230", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice5091() throws Exception {
    final String result = DeviceNames.getDeviceName("M51w", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1 Compact", result);
}
public void testDevice5092() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T232", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice5093() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T239", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice5094() throws Exception {
    final String result = DeviceNames.getDeviceName("V9C", FALLBACK);
    Assert.assertEquals("ZTE V9", result);
}
public void testDevice5095() throws Exception {
    final String result = DeviceNames.getDeviceName("V9A", FALLBACK);
    Assert.assertEquals("ZTE V9A", result);
}
public void testDevice5096() throws Exception {
    final String result = DeviceNames.getDeviceName("G30", FALLBACK);
    Assert.assertEquals("Haier G30", result);
}
public void testDevice5097() throws Exception {
    final String result = DeviceNames.getDeviceName("KTAB", FALLBACK);
    Assert.assertEquals("DEA Factory KTAB", result);
}
public void testDevice5098() throws Exception {
    final String result = DeviceNames.getDeviceName("Primo_ZX2", FALLBACK);
    Assert.assertEquals("Walton Primo ZX2", result);
}
public void testDevice5099() throws Exception {
    final String result = DeviceNames.getDeviceName("M511", FALLBACK);
    Assert.assertEquals("Infocus M511", result);
}
public void testDevice5100() throws Exception {
    final String result = DeviceNames.getDeviceName("M510", FALLBACK);
    Assert.assertEquals("Infocus M511", result);
}
public void testDevice5101() throws Exception {
    final String result = DeviceNames.getDeviceName("MFC191FR2", FALLBACK);
    Assert.assertEquals("Lexibook Fluo XL", result);
}
public void testDevice5102() throws Exception {
    final String result = DeviceNames.getDeviceName("M512", FALLBACK);
    Assert.assertEquals("Infocus M512", result);
}
public void testDevice5103() throws Exception {
    final String result = DeviceNames.getDeviceName("M518", FALLBACK);
    Assert.assertEquals("Infocus M518", result);
}
public void testDevice5104() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-7DTB35", FALLBACK);
    Assert.assertEquals("Hipstreet HS-7DTB35", result);
}
public void testDevice5105() throws Exception {
    final String result = DeviceNames.getDeviceName("VS910_4G", FALLBACK);
    Assert.assertEquals("LG Revolution 4G", result);
}
public void testDevice5106() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-U688", FALLBACK);
    Assert.assertEquals("U688 Hisense", result);
}
public void testDevice5107() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T116BU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab Plus 7.0", result);
}
public void testDevice5108() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-X1", FALLBACK);
    Assert.assertEquals("Hisense X1E1", result);
}
public void testDevice5109() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G800F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Mini", result);
}
public void testDevice5110() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G800M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 mini", result);
}
public void testDevice5111() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G800H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 Mini", result);
}
public void testDevice5112() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_M9pw", FALLBACK);
    Assert.assertEquals("HTC One M9+", result);
}
public void testDevice5113() throws Exception {
    final String result = DeviceNames.getDeviceName("TM800A510L", FALLBACK);
    Assert.assertEquals("Nuvision TM800A510L", result);
}
public void testDevice5114() throws Exception {
    final String result = DeviceNames.getDeviceName("A0001", FALLBACK);
    Assert.assertEquals("OnePlus One", result);
}
public void testDevice5115() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G800X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 mini", result);
}
public void testDevice5116() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G800Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5 mini LTE", result);
}
public void testDevice5117() throws Exception {
    final String result = DeviceNames.getDeviceName("WM8", FALLBACK);
    Assert.assertEquals("Hisense WM8", result);
}
public void testDevice5118() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T335", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 8.0", result);
}
public void testDevice5119() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_T00I-D", FALLBACK);
    Assert.assertEquals("Asus ZenFone 4 (A400CG)", result);
}
public void testDevice5120() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6077W22", FALLBACK);
    Assert.assertEquals("RCA RCT6077W22", result);
}
public void testDevice5121() throws Exception {
    final String result = DeviceNames.getDeviceName("HW-W900", FALLBACK);
    Assert.assertEquals("Cellon HW-W900", result);
}
public void testDevice5122() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6378W2", FALLBACK);
    Assert.assertEquals("RCA RCT6378W2", result);
}
public void testDevice5123() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9268", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Premier", result);
}
public void testDevice5124() throws Exception {
    final String result = DeviceNames.getDeviceName("LGMS769", FALLBACK);
    Assert.assertEquals("LG Optimus L9", result);
}
public void testDevice5125() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9260", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Premier", result);
}
public void testDevice5126() throws Exception {
    final String result = DeviceNames.getDeviceName("Air", FALLBACK);
    Assert.assertEquals("Mobicell Air", result);
}
public void testDevice5127() throws Exception {
    final String result = DeviceNames.getDeviceName("XT389", FALLBACK);
    Assert.assertEquals("Motorola Motosmart", result);
}
public void testDevice5128() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T989", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice5129() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-US670", FALLBACK);
    Assert.assertEquals("LGE Optimus One", result);
}
public void testDevice5130() throws Exception {
    final String result = DeviceNames.getDeviceName("EveryPad2", FALLBACK);
    Assert.assertEquals("Lenovo A3500-F", result);
}
public void testDevice5131() throws Exception {
    final String result = DeviceNames.getDeviceName("DMX-ST7A", FALLBACK);
    Assert.assertEquals("Dreamax DMX-ST7A", result);
}
public void testDevice5132() throws Exception {
    final String result = DeviceNames.getDeviceName("one7_0_4_coho", FALLBACK);
    Assert.assertEquals("CloudFone Cloudpad One 7.0", result);
}
public void testDevice5133() throws Exception {
    final String result = DeviceNames.getDeviceName("Z600", FALLBACK);
    Assert.assertEquals("Ashna Z600", result);
}
public void testDevice5134() throws Exception {
    final String result = DeviceNames.getDeviceName("F-01F", FALLBACK);
    Assert.assertEquals("Fujitsu F-01F", result);
}
public void testDevice5135() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-E420f", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L1II", result);
}
public void testDevice5136() throws Exception {
    final String result = DeviceNames.getDeviceName("IdeaTabA1020-T", FALLBACK);
    Assert.assertEquals("Lenovo IdeaTab A1020", result);
}
public void testDevice5137() throws Exception {
    final String result = DeviceNames.getDeviceName("ST13", FALLBACK);
    Assert.assertEquals("Southern Telecom ST13", result);
}
public void testDevice5138() throws Exception {
    final String result = DeviceNames.getDeviceName("X9077", FALLBACK);
    Assert.assertEquals("Oppo X9077", result);
}
public void testDevice5139() throws Exception {
    final String result = DeviceNames.getDeviceName("X9076", FALLBACK);
    Assert.assertEquals("OPPO X9076", result);
}
public void testDevice5140() throws Exception {
    final String result = DeviceNames.getDeviceName("ST940I-UP", FALLBACK);
    Assert.assertEquals("LGU+ ST940I-UP", result);
}
public void testDevice5141() throws Exception {
    final String result = DeviceNames.getDeviceName("X9070", FALLBACK);
    Assert.assertEquals("OPPO X9070", result);
}
public void testDevice5142() throws Exception {
    final String result = DeviceNames.getDeviceName("CMB510", FALLBACK);
    Assert.assertEquals("Hisense CMB510", result);
}
public void testDevice5143() throws Exception {
    final String result = DeviceNames.getDeviceName("YPY_AB10D", FALLBACK);
    Assert.assertEquals("Positivo Ypy AB10", result);
}
public void testDevice5144() throws Exception {
    final String result = DeviceNames.getDeviceName("E6603", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5", result);
}
public void testDevice5145() throws Exception {
    final String result = DeviceNames.getDeviceName("NSZ-GU1", FALLBACK);
    Assert.assertEquals("Sony BRAVIA Smart Stick", result);
}
public void testDevice5146() throws Exception {
    final String result = DeviceNames.getDeviceName("NS-P10A6100", FALLBACK);
    Assert.assertEquals("Insignia NS-P10A6100", result);
}
public void testDevice5147() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6500T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini2", result);
}
public void testDevice5148() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I5510", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Europa", result);
}
public void testDevice5149() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6500L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini2", result);
}
public void testDevice5150() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5570", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini", result);
}
public void testDevice5151() throws Exception {
    final String result = DeviceNames.getDeviceName("U98", FALLBACK);
    Assert.assertEquals("Hisense HS-U98", result);
}
public void testDevice5152() throws Exception {
    final String result = DeviceNames.getDeviceName("MFC2_Special", FALLBACK);
    Assert.assertEquals("Clementoni My first Clempad 4.4 Basic Special", result);
}
public void testDevice5153() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6500D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini2", result);
}
public void testDevice5154() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5578", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini", result);
}
public void testDevice5155() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T350X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 8.0", result);
}
public void testDevice5156() throws Exception {
    final String result = DeviceNames.getDeviceName("A6_Duo", FALLBACK);
    Assert.assertEquals("AllView A6 Duo", result);
}
public void testDevice5157() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A910K", FALLBACK);
    Assert.assertEquals("Pantech IM-A910K", result);
}
public void testDevice5158() throws Exception {
    final String result = DeviceNames.getDeviceName("S500", FALLBACK);
    Assert.assertEquals("Acer CloudMobile S500", result);
}
public void testDevice5159() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A690S", FALLBACK);
    Assert.assertEquals("Pantech Mirach", result);
}
public void testDevice5160() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3609", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice5161() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A690L", FALLBACK);
    Assert.assertEquals("Pantech Mirach", result);
}
public void testDevice5162() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3606", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice5163() throws Exception {
    final String result = DeviceNames.getDeviceName("CP3700A", FALLBACK);
    Assert.assertEquals("Coolpad 3700A", result);
}
public void testDevice5164() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8550L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win", result);
}
public void testDevice5165() throws Exception {
    final String result = DeviceNames.getDeviceName("Smart501", FALLBACK);
    Assert.assertEquals("FarEasTone Smart501", result);
}
public void testDevice5166() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-Z990G", FALLBACK);
    Assert.assertEquals("ZTE-Z990G", result);
}
public void testDevice5167() throws Exception {
    final String result = DeviceNames.getDeviceName("Smart503", FALLBACK);
    Assert.assertEquals("Infocus Smart503", result);
}
public void testDevice5168() throws Exception {
    final String result = DeviceNames.getDeviceName("VF685", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) VF685", result);
}
public void testDevice5169() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F340K", FALLBACK);
    Assert.assertEquals("LGE LG G Flex", result);
}
public void testDevice5170() throws Exception {
    final String result = DeviceNames.getDeviceName("E2070", FALLBACK);
    Assert.assertEquals("Hisense E2070", result);
}
public void testDevice5171() throws Exception {
    final String result = DeviceNames.getDeviceName("S50c", FALLBACK);
    Assert.assertEquals("CatS50c", result);
}
public void testDevice5172() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice5173() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-S766C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Style", result);
}
public void testDevice5174() throws Exception {
    final String result = DeviceNames.getDeviceName("NID-7011", FALLBACK);
    Assert.assertEquals("NAXA NID-7011", result);
}
public void testDevice5175() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice5176() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B5330L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Chat", result);
}
public void testDevice5177() throws Exception {
    final String result = DeviceNames.getDeviceName("KFTT", FALLBACK);
    Assert.assertEquals("Kindle Fire HD 7", result);
}
public void testDevice5178() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice5179() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B5330B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Chat", result);
}
public void testDevice5180() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice5181() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G360T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Prime", result);
}
public void testDevice5182() throws Exception {
    final String result = DeviceNames.getDeviceName("TCL-P688L", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) P688L", result);
}
public void testDevice5183() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_D820pi", FALLBACK);
    Assert.assertEquals("HTC Desire 820G PLUS dual sim", result);
}
public void testDevice5184() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9308I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Neo Plus", result);
}
public void testDevice5185() throws Exception {
    final String result = DeviceNames.getDeviceName("A17", FALLBACK);
    Assert.assertEquals("Toshiba AT7-C", result);
}
public void testDevice5186() throws Exception {
    final String result = DeviceNames.getDeviceName("A11", FALLBACK);
    Assert.assertEquals("Oppo A11", result);
}
public void testDevice5187() throws Exception {
    final String result = DeviceNames.getDeviceName("L-05E", FALLBACK);
    Assert.assertEquals("LGE LG optimus it L-05E", result);
}
public void testDevice5188() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-M919V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice5189() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-M919N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice5190() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300FU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice5191() throws Exception {
    final String result = DeviceNames.getDeviceName("A1P", FALLBACK);
    Assert.assertEquals("ZTE A1P", result);
}
public void testDevice5192() throws Exception {
    final String result = DeviceNames.getDeviceName("A1R", FALLBACK);
    Assert.assertEquals("ZTE A1R", result);
}
public void testDevice5193() throws Exception {
    final String result = DeviceNames.getDeviceName("Trooper_X35", FALLBACK);
    Assert.assertEquals("KAZAM TROOPER X3.5", result);
}
public void testDevice5194() throws Exception {
    final String result = DeviceNames.getDeviceName("ST15a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia mini", result);
}
public void testDevice5195() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A850S", FALLBACK);
    Assert.assertEquals("Pantech IM-A850S", result);
}
public void testDevice5196() throws Exception {
    final String result = DeviceNames.getDeviceName("FARTMB611Y", FALLBACK);
    Assert.assertEquals("Fujitsu FARTMB611Y", result);
}
public void testDevice5197() throws Exception {
    final String result = DeviceNames.getDeviceName("ST15i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia mini", result);
}
public void testDevice5198() throws Exception {
    final String result = DeviceNames.getDeviceName("NS-15AT07", FALLBACK);
    Assert.assertEquals("Insignia NS-15AT07", result);
}
public void testDevice5199() throws Exception {
    final String result = DeviceNames.getDeviceName("SCC-U21", FALLBACK);
    Assert.assertEquals("Huawei Y6", result);
}
public void testDevice5200() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A850K", FALLBACK);
    Assert.assertEquals("Pantech IM-A850K", result);
}
public void testDevice5201() throws Exception {
    final String result = DeviceNames.getDeviceName("FP-U320-711-WWAN", FALLBACK);
    Assert.assertEquals("SAKAISIO FP-U320-711-WWAN", result);
}
public void testDevice5202() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A850L", FALLBACK);
    Assert.assertEquals("Pantech IM-A850L", result);
}
public void testDevice5203() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T550", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice5204() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T555", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice5205() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I589", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Duos", result);
}
public void testDevice5206() throws Exception {
    final String result = DeviceNames.getDeviceName("Z160", FALLBACK);
    Assert.assertEquals("Acer Liquid Z4", result);
}
public void testDevice5207() throws Exception {
    final String result = DeviceNames.getDeviceName("R823T", FALLBACK);
    Assert.assertEquals("Oppo R823T", result);
}
public void testDevice5208() throws Exception {
    final String result = DeviceNames.getDeviceName("AK330", FALLBACK);
    Assert.assertEquals("Acer Liquid Gallant E350", result);
}
public void testDevice5209() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8580", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Advance", result);
}
public void testDevice5210() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I777", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S II", result);
}
public void testDevice5211() throws Exception {
    final String result = DeviceNames.getDeviceName("EGD078", FALLBACK);
    Assert.assertEquals("Ematic EGD078", result);
}
public void testDevice5212() throws Exception {
    final String result = DeviceNames.getDeviceName("YP-G70", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Player 5", result);
}
public void testDevice5213() throws Exception {
    final String result = DeviceNames.getDeviceName("l9450", FALLBACK);
    Assert.assertEquals("Toshiba L9450", result);
}
public void testDevice5214() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8150T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy W", result);
}
public void testDevice5215() throws Exception {
    final String result = DeviceNames.getDeviceName("SM55", FALLBACK);
    Assert.assertEquals("Cellon SM55", result);
}
public void testDevice5216() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8150B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy W", result);
}
public void testDevice5217() throws Exception {
    final String result = DeviceNames.getDeviceName("WT19i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Live with Walkman", result);
}
public void testDevice5218() throws Exception {
    final String result = DeviceNames.getDeviceName("V.35", FALLBACK);
    Assert.assertEquals("VSN V.35", result);
}
public void testDevice5219() throws Exception {
    final String result = DeviceNames.getDeviceName("Ilium_L950", FALLBACK);
    Assert.assertEquals("Lanix ILIUM L950", result);
}
public void testDevice5220() throws Exception {
    final String result = DeviceNames.getDeviceName("WT19a", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia live", result);
}
public void testDevice5221() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9195X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice5222() throws Exception {
    final String result = DeviceNames.getDeviceName("7044X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP 2 (5)", result);
}
public void testDevice5223() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9195T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice5224() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9195I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice5225() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9195L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4 Mini", result);
}
public void testDevice5226() throws Exception {
    final String result = DeviceNames.getDeviceName("StrikaPlay", FALLBACK);
    Assert.assertEquals("Boost StrikaPlay", result);
}
public void testDevice5227() throws Exception {
    final String result = DeviceNames.getDeviceName("7044A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) POP 2 (5)", result);
}
public void testDevice5228() throws Exception {
    final String result = DeviceNames.getDeviceName("Hol-T00", FALLBACK);
    Assert.assertEquals("Huawei Hol-T00", result);
}
public void testDevice5229() throws Exception {
    final String result = DeviceNames.getDeviceName("T730", FALLBACK);
    Assert.assertEquals("Wintec T730", result);
}
public void testDevice5230() throws Exception {
    final String result = DeviceNames.getDeviceName("FWTA-T1000", FALLBACK);
    Assert.assertEquals("Finggo FWTA-T1000", result);
}
public void testDevice5231() throws Exception {
    final String result = DeviceNames.getDeviceName("HTCD100LVW", FALLBACK);
    Assert.assertEquals("HTC Desire 526", result);
}
public void testDevice5232() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-N900A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 3", result);
}
public void testDevice5233() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-03H", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5 Premium", result);
}
public void testDevice5234() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P725", FALLBACK);
    Assert.assertEquals("LGE Optimus 3D MAX", result);
}
public void testDevice5235() throws Exception {
    final String result = DeviceNames.getDeviceName("PAD1042", FALLBACK);
    Assert.assertEquals("Haier PAD1042", result);
}
public void testDevice5236() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P720", FALLBACK);
    Assert.assertEquals("LGE Optimus 3D MAX", result);
}
public void testDevice5237() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-03C", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia ray", result);
}
public void testDevice5238() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-03F", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2", result);
}
public void testDevice5239() throws Exception {
    final String result = DeviceNames.getDeviceName("D5803", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3 Compact", result);
}
public void testDevice5240() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-03D", FALLBACK);
    Assert.assertEquals("Sony Xperia acro HD", result);
}
public void testDevice5241() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-03E", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Tablet Z", result);
}
public void testDevice5242() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-08E", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PAD SH-08E", result);
}
public void testDevice5243() throws Exception {
    final String result = DeviceNames.getDeviceName("M701", FALLBACK);
    Assert.assertEquals("Hisense M701", result);
}
public void testDevice5244() throws Exception {
    final String result = DeviceNames.getDeviceName("M702", FALLBACK);
    Assert.assertEquals("Fujitsu STYLISTIC M702", result);
}
public void testDevice5245() throws Exception {
    final String result = DeviceNames.getDeviceName("MF8604", FALLBACK);
    Assert.assertEquals("ZTE Blade", result);
}
public void testDevice5246() throws Exception {
    final String result = DeviceNames.getDeviceName("Z830", FALLBACK);
    Assert.assertEquals("ZTE Z830", result);
}
public void testDevice5247() throws Exception {
    final String result = DeviceNames.getDeviceName("Light", FALLBACK);
    Assert.assertEquals("ZTE V9", result);
}
public void testDevice5248() throws Exception {
    final String result = DeviceNames.getDeviceName("A01SH", FALLBACK);
    Assert.assertEquals("Sharp A01SH", result);
}
public void testDevice5249() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6818V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Fame", result);
}
public void testDevice5250() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T849", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab", result);
}
public void testDevice5251() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5047DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP5047DUO", result);
}
public void testDevice5252() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T555C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab A 9.7", result);
}
public void testDevice5253() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice5254() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice5255() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice5256() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 4", result);
}
public void testDevice5257() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910G", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 4", result);
}
public void testDevice5258() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 4", result);
}
public void testDevice5259() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_E7312", FALLBACK);
    Assert.assertEquals("Lenovo LIFETAB E7310", result);
}
public void testDevice5260() throws Exception {
    final String result = DeviceNames.getDeviceName("PX2000", FALLBACK);
    Assert.assertEquals("Hisense PX2000", result);
}
public void testDevice5261() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT7650G", FALLBACK);
    Assert.assertEquals("Proscan PLT7650G", result);
}
public void testDevice5262() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice5263() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 4", result);
}
public void testDevice5264() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 4", result);
}
public void testDevice5265() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910U", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice5266() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N910T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 4", result);
}
public void testDevice5267() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300YZ", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice5268() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-i5700", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Spica", result);
}
public void testDevice5269() throws Exception {
    final String result = DeviceNames.getDeviceName("QTAIR7", FALLBACK);
    Assert.assertEquals("Verizon Wireless Ellipsis 10", result);
}
public void testDevice5270() throws Exception {
    final String result = DeviceNames.getDeviceName("USCCADR6230US", FALLBACK);
    Assert.assertEquals("HTC Wildfire S A515c", result);
}
public void testDevice5271() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E230K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice5272() throws Exception {
    final String result = DeviceNames.getDeviceName("PMT5877C", FALLBACK);
    Assert.assertEquals("Prestigio PMT5877C", result);
}
public void testDevice5273() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E230L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice5274() throws Exception {
    final String result = DeviceNames.getDeviceName("SHV-E230S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice5275() throws Exception {
    final String result = DeviceNames.getDeviceName("NX503J", FALLBACK);
    Assert.assertEquals("ZTE NX503J", result);
}
public void testDevice5276() throws Exception {
    final String result = DeviceNames.getDeviceName("B15Q", FALLBACK);
    Assert.assertEquals("Cat B15Q", result);
}
public void testDevice5277() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-GC120", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera", result);
}
public void testDevice5278() throws Exception {
    final String result = DeviceNames.getDeviceName("NX503A", FALLBACK);
    Assert.assertEquals("Nubia NX503A", result);
}
public void testDevice5279() throws Exception {
    final String result = DeviceNames.getDeviceName("EGQ327M", FALLBACK);
    Assert.assertEquals("Ematic EGQ327M", result);
}
public void testDevice5280() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N9100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note4", result);
}
public void testDevice5281() throws Exception {
    final String result = DeviceNames.getDeviceName("LED65K680X3DU", FALLBACK);
    Assert.assertEquals("Hisense LED65K680X3DU", result);
}
public void testDevice5282() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S5839i", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice5283() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P720h", FALLBACK);
    Assert.assertEquals("LGE Optimus 3D MAX", result);
}
public void testDevice5284() throws Exception {
    final String result = DeviceNames.getDeviceName("P70221", FALLBACK);
    Assert.assertEquals("Micromax Canvas Tab", result);
}
public void testDevice5285() throws Exception {
    final String result = DeviceNames.getDeviceName("Party", FALLBACK);
    Assert.assertEquals("Explay Party", result);
}
public void testDevice5286() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P990H", FALLBACK);
    Assert.assertEquals("LGE Optimus 2X", result);
}
public void testDevice5287() throws Exception {
    final String result = DeviceNames.getDeviceName("LED39K610X3D", FALLBACK);
    Assert.assertEquals("Hisense LED39K610X3D", result);
}
public void testDevice5288() throws Exception {
    final String result = DeviceNames.getDeviceName("A953", FALLBACK);
    Assert.assertEquals("Motorola Milestone2", result);
}
public void testDevice5289() throws Exception {
    final String result = DeviceNames.getDeviceName("A726_Infinity_Lite", FALLBACK);
    Assert.assertEquals("Gtel A726 Infinity Lite", result);
}
public void testDevice5290() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D340f8", FALLBACK);
    Assert.assertEquals("LGE L70", result);
}
public void testDevice5291() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4406", FALLBACK);
    Assert.assertEquals("Fly Era Nano 6", result);
}
public void testDevice5292() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4407", FALLBACK);
    Assert.assertEquals("Fly ERA Nano 7", result);
}
public void testDevice5293() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4400", FALLBACK);
    Assert.assertEquals("Fly Era Nano 8", result);
}
public void testDevice5294() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ4401", FALLBACK);
    Assert.assertEquals("Fly IQ4401", result);
}
public void testDevice5295() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P990h", FALLBACK);
    Assert.assertEquals("LGE Optimus 2X", result);
}
public void testDevice5296() throws Exception {
    final String result = DeviceNames.getDeviceName("Spice_MI700", FALLBACK);
    Assert.assertEquals("Foxconn CSL Spice MI700", result);
}
public void testDevice5297() throws Exception {
    final String result = DeviceNames.getDeviceName("Ghost", FALLBACK);
    Assert.assertEquals("AG Mobile Ghost", result);
}
public void testDevice5298() throws Exception {
    final String result = DeviceNames.getDeviceName("JD-150", FALLBACK);
    Assert.assertEquals("BenQ JD-150", result);
}
public void testDevice5299() throws Exception {
    final String result = DeviceNames.getDeviceName("X10", FALLBACK);
    Assert.assertEquals("Moxee Technologies X10", result);
}
public void testDevice5300() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_One_max", FALLBACK);
    Assert.assertEquals("HTC One max", result);
}
public void testDevice5301() throws Exception {
    final String result = DeviceNames.getDeviceName("LIFETAB_S785X", FALLBACK);
    Assert.assertEquals("Medion LIFETAB S785X", result);
}
public void testDevice5302() throws Exception {
    final String result = DeviceNames.getDeviceName("E601M", FALLBACK);
    Assert.assertEquals("Hisense E601M", result);
}
public void testDevice5303() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F310L", FALLBACK);
    Assert.assertEquals("LGE LG Gx", result);
}
public void testDevice5304() throws Exception {
    final String result = DeviceNames.getDeviceName("H-27", FALLBACK);
    Assert.assertEquals("Opticon H-27", result);
}
public void testDevice5305() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-A7S", FALLBACK);
    Assert.assertEquals("TECNO-A7S", result);
}
public void testDevice5306() throws Exception {
    final String result = DeviceNames.getDeviceName("NXA101LTE116", FALLBACK);
    Assert.assertEquals("Nextbook NXA101LTE116", result);
}
public void testDevice5307() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H960", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice5308() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H962", FALLBACK);
    Assert.assertEquals("LGE V10", result);
}
public void testDevice5309() throws Exception {
    final String result = DeviceNames.getDeviceName("M470BSA", FALLBACK);
    Assert.assertEquals("Hisense M470BSA", result);
}
public void testDevice5310() throws Exception {
    final String result = DeviceNames.getDeviceName("M470BSG", FALLBACK);
    Assert.assertEquals("Hisense M470BSG", result);
}
public void testDevice5311() throws Exception {
    final String result = DeviceNames.getDeviceName("M470BSD", FALLBACK);
    Assert.assertEquals("Hisense M470BSD", result);
}
public void testDevice5312() throws Exception {
    final String result = DeviceNames.getDeviceName("M470BSE", FALLBACK);
    Assert.assertEquals("Hisense M470BSE", result);
}
public void testDevice5313() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8262B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Duos", result);
}
public void testDevice5314() throws Exception {
    final String result = DeviceNames.getDeviceName("M470BSS", FALLBACK);
    Assert.assertEquals("Hisense M470BSS", result);
}
public void testDevice5315() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-S738C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Centura", result);
}
public void testDevice5316() throws Exception {
    final String result = DeviceNames.getDeviceName("F-11D", FALLBACK);
    Assert.assertEquals("Fujitsu ARROWS Me F-11D", result);
}
public void testDevice5317() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G310R5", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace", result);
}
public void testDevice5318() throws Exception {
    final String result = DeviceNames.getDeviceName("M3mini", FALLBACK);
    Assert.assertEquals("Gionee M3mini", result);
}
public void testDevice5319() throws Exception {
    final String result = DeviceNames.getDeviceName("DA245HQL", FALLBACK);
    Assert.assertEquals("Acer DA245HQL", result);
}
public void testDevice5320() throws Exception {
    final String result = DeviceNames.getDeviceName("VP74-Luxor", FALLBACK);
    Assert.assertEquals("Vestel VP74", result);
}
public void testDevice5321() throws Exception {
    final String result = DeviceNames.getDeviceName("VP73_Myros", FALLBACK);
    Assert.assertEquals("Vestel VP73", result);
}
public void testDevice5322() throws Exception {
    final String result = DeviceNames.getDeviceName("IN265", FALLBACK);
    Assert.assertEquals("7Eleven IN265", result);
}
public void testDevice5323() throws Exception {
    final String result = DeviceNames.getDeviceName("503HW", FALLBACK);
    Assert.assertEquals("Huawei ALE-L02", result);
}
public void testDevice5324() throws Exception {
    final String result = DeviceNames.getDeviceName("N1W", FALLBACK);
    Assert.assertEquals("OPPO N1W", result);
}
public void testDevice5325() throws Exception {
    final String result = DeviceNames.getDeviceName("IN260", FALLBACK);
    Assert.assertEquals("InFocus IN260", result);
}
public void testDevice5326() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-F410S", FALLBACK);
    Assert.assertEquals("LGE LG G3 A", result);
}
public void testDevice5327() throws Exception {
    final String result = DeviceNames.getDeviceName("V370", FALLBACK);
    Assert.assertEquals("Acer Liquid E2", result);
}
public void testDevice5328() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T237V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab4 7.0", result);
}
public void testDevice5329() throws Exception {
    final String result = DeviceNames.getDeviceName("XT939G", FALLBACK);
    Assert.assertEquals("Motorola Moto G", result);
}
public void testDevice5330() throws Exception {
    final String result = DeviceNames.getDeviceName("MI_3W", FALLBACK);
    Assert.assertEquals("Xiaomi Mi 3", result);
}
public void testDevice5331() throws Exception {
    final String result = DeviceNames.getDeviceName("PULP", FALLBACK);
    Assert.assertEquals("Wiko PULP", result);
}
public void testDevice5332() throws Exception {
    final String result = DeviceNames.getDeviceName("Transformer_TF101", FALLBACK);
    Assert.assertEquals("Asus Eee Pad Transformer", result);
}
public void testDevice5333() throws Exception {
    final String result = DeviceNames.getDeviceName("P275", FALLBACK);
    Assert.assertEquals("Micromax P275", result);
}
public void testDevice5334() throws Exception {
    final String result = DeviceNames.getDeviceName("STB9097", FALLBACK);
    Assert.assertEquals("Avoca STB9097", result);
}
public void testDevice5335() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SM-T807A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy TabS 10.5", result);
}
public void testDevice5336() throws Exception {
    final String result = DeviceNames.getDeviceName("CT1030", FALLBACK);
    Assert.assertEquals("Haier CT1030", result);
}
public void testDevice5337() throws Exception {
    final String result = DeviceNames.getDeviceName("Xoom", FALLBACK);
    Assert.assertEquals("Motorola Xoom", result);
}
public void testDevice5338() throws Exception {
    final String result = DeviceNames.getDeviceName("4035X_Orange", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 4", result);
}
public void testDevice5339() throws Exception {
    final String result = DeviceNames.getDeviceName("A450TL", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) A450TL", result);
}
public void testDevice5340() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T715Y", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 8.0", result);
}
public void testDevice5341() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-I317M", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note II", result);
}
public void testDevice5342() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-Y5", FALLBACK);
    Assert.assertEquals("TECNO-Y5", result);
}
public void testDevice5343() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-Y4", FALLBACK);
    Assert.assertEquals("TECNO-Y4", result);
}
public void testDevice5344() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-Y6", FALLBACK);
    Assert.assertEquals("TECNO-Y6", result);
}
public void testDevice5345() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-Y3", FALLBACK);
    Assert.assertEquals("TECNO-Y3", result);
}
public void testDevice5346() throws Exception {
    final String result = DeviceNames.getDeviceName("K1", FALLBACK);
    Assert.assertEquals("Lenovo K1", result);
}
public void testDevice5347() throws Exception {
    final String result = DeviceNames.getDeviceName("K5", FALLBACK);
    Assert.assertEquals("Kubo K5", result);
}
public void testDevice5348() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T715C", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 8.0", result);
}
public void testDevice5349() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-04G", FALLBACK);
    Assert.assertEquals("Samsung SC-04G", result);
}
public void testDevice5350() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-04F", FALLBACK);
    Assert.assertEquals("Samsung SC-04F", result);
}
public void testDevice5351() throws Exception {
    final String result = DeviceNames.getDeviceName("SC-04E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S4", result);
}
public void testDevice5352() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-E260T", FALLBACK);
    Assert.assertEquals("Hisense E260T", result);
}
public void testDevice5353() throws Exception {
    final String result = DeviceNames.getDeviceName("unknown", FALLBACK);
    Assert.assertEquals("Motorola Defy", result);
}
public void testDevice5354() throws Exception {
    final String result = DeviceNames.getDeviceName("MB860", FALLBACK);
    Assert.assertEquals("Motorola Atrix 4G", result);
}
public void testDevice5355() throws Exception {
    final String result = DeviceNames.getDeviceName("MB861", FALLBACK);
    Assert.assertEquals("Motorola Atrix", result);
}
public void testDevice5356() throws Exception {
    final String result = DeviceNames.getDeviceName("KYOCERA-C6742", FALLBACK);
    Assert.assertEquals("Kyocera Hydro VIEW", result);
}
public void testDevice5357() throws Exception {
    final String result = DeviceNames.getDeviceName("N986+", FALLBACK);
    Assert.assertEquals("ZTE N986D", result);
}
public void testDevice5358() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-GN120A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy NX", result);
}
public void testDevice5359() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T815", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 8.0", result);
}
public void testDevice5360() throws Exception {
    final String result = DeviceNames.getDeviceName("TA272HUL", FALLBACK);
    Assert.assertEquals("Acer TA272HUL", result);
}
public void testDevice5361() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T817", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice5362() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T810", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab S2 9.7", result);
}
public void testDevice5363() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-LU6200", FALLBACK);
    Assert.assertEquals("LGE Optimus LTE", result);
}
public void testDevice5364() throws Exception {
    final String result = DeviceNames.getDeviceName("N986D", FALLBACK);
    Assert.assertEquals("ZTE N986D", result);
}
public void testDevice5365() throws Exception {
    final String result = DeviceNames.getDeviceName("M370i", FALLBACK);
    Assert.assertEquals("InFocus M370i", result);
}
public void testDevice5366() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D852G", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice5367() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A300H", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A3", result);
}
public void testDevice5368() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-AS695", FALLBACK);
    Assert.assertEquals("LGE Optimus Plus", result);
}
public void testDevice5369() throws Exception {
    final String result = DeviceNames.getDeviceName("msm8625", FALLBACK);
    Assert.assertEquals("Hisense HS-EG929", result);
}
public void testDevice5370() throws Exception {
    final String result = DeviceNames.getDeviceName("R370L", FALLBACK);
    Assert.assertEquals("Orbic R370H", result);
}
public void testDevice5371() throws Exception {
    final String result = DeviceNames.getDeviceName("NS-13T001", FALLBACK);
    Assert.assertEquals("Anydata Insignia NS-13T001 Tablet", result);
}
public void testDevice5372() throws Exception {
    final String result = DeviceNames.getDeviceName("Y220-U17", FALLBACK);
    Assert.assertEquals("Huawei Y220", result);
}
public void testDevice5373() throws Exception {
    final String result = DeviceNames.getDeviceName("Y220-U10", FALLBACK);
    Assert.assertEquals("Huawei Y220-U10", result);
}
public void testDevice5374() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I509", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Y", result);
}
public void testDevice5375() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B7510", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Pro", result);
}
public void testDevice5376() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-I500", FALLBACK);
    Assert.assertEquals("Samsung Fascinate", result);
}
public void testDevice5377() throws Exception {
    final String result = DeviceNames.getDeviceName("L575", FALLBACK);
    Assert.assertEquals("Hyundai L575", result);
}
public void testDevice5378() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8552B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Win", result);
}
public void testDevice5379() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925W8", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5380() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-P999", FALLBACK);
    Assert.assertEquals("LG G2X P999", result);
}
public void testDevice5381() throws Exception {
    final String result = DeviceNames.getDeviceName("SmartTab7", FALLBACK);
    Assert.assertEquals("ZTE SmartTab7", result);
}
public void testDevice5382() throws Exception {
    final String result = DeviceNames.getDeviceName("CM990", FALLBACK);
    Assert.assertEquals("Huawei Evolution III", result);
}
public void testDevice5383() throws Exception {
    final String result = DeviceNames.getDeviceName("V8403", FALLBACK);
    Assert.assertEquals("ZTE V8403", result);
}
public void testDevice5384() throws Exception {
    final String result = DeviceNames.getDeviceName("V8402", FALLBACK);
    Assert.assertEquals("ZTE Racer", result);
}
public void testDevice5385() throws Exception {
    final String result = DeviceNames.getDeviceName("TM75A", FALLBACK);
    Assert.assertEquals("Gigabyte TM75A", result);
}
public void testDevice5386() throws Exception {
    final String result = DeviceNames.getDeviceName("SH8188U", FALLBACK);
    Assert.assertEquals("Sharp SH8188U", result);
}
public void testDevice5387() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P5200", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab3 10.1", result);
}
public void testDevice5388() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-B9062", FALLBACK);
    Assert.assertEquals("Samsung Galaxy (China)", result);
}
public void testDevice5389() throws Exception {
    final String result = DeviceNames.getDeviceName("Andromax-c", FALLBACK);
    Assert.assertEquals("Hisense Andromax-c", result);
}
public void testDevice5390() throws Exception {
    final String result = DeviceNames.getDeviceName("LIXIR1041", FALLBACK);
    Assert.assertEquals("Logicom L-IXIR TAB 1041", result);
}
public void testDevice5391() throws Exception {
    final String result = DeviceNames.getDeviceName("MZ617", FALLBACK);
    Assert.assertEquals("Motorola XOOM 2", result);
}
public void testDevice5392() throws Exception {
    final String result = DeviceNames.getDeviceName("A621BL", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) A621BL", result);
}
public void testDevice5393() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-N915R4", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Edge", result);
}
public void testDevice5394() throws Exception {
    final String result = DeviceNames.getDeviceName("S520", FALLBACK);
    Assert.assertEquals("Acer Liquid S2", result);
}
public void testDevice5395() throws Exception {
    final String result = DeviceNames.getDeviceName("PLT9602G", FALLBACK);
    Assert.assertEquals("Proscan PLT9602G", result);
}
public void testDevice5396() throws Exception {
    final String result = DeviceNames.getDeviceName("B1-723", FALLBACK);
    Assert.assertEquals("Acer B1-723", result);
}
public void testDevice5397() throws Exception {
    final String result = DeviceNames.getDeviceName("ST21a", FALLBACK);
    Assert.assertEquals("Sony Xperia tipo", result);
}
public void testDevice5398() throws Exception {
    final String result = DeviceNames.getDeviceName("204HW", FALLBACK);
    Assert.assertEquals("Huawei hw204HW", result);
}
public void testDevice5399() throws Exception {
    final String result = DeviceNames.getDeviceName("P776A", FALLBACK);
    Assert.assertEquals("Anydata HKC P776A", result);
}
public void testDevice5400() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-N8013", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note 10.1", result);
}
public void testDevice5401() throws Exception {
    final String result = DeviceNames.getDeviceName("A79", FALLBACK);
    Assert.assertEquals("HKC A79 Tablet", result);
}
public void testDevice5402() throws Exception {
    final String result = DeviceNames.getDeviceName("A78", FALLBACK);
    Assert.assertEquals("Micromax A78", result);
}
public void testDevice5403() throws Exception {
    final String result = DeviceNames.getDeviceName("A75", FALLBACK);
    Assert.assertEquals("Micromax A75", result);
}
public void testDevice5404() throws Exception {
    final String result = DeviceNames.getDeviceName("A73", FALLBACK);
    Assert.assertEquals("Micromax A73", result);
}
public void testDevice5405() throws Exception {
    final String result = DeviceNames.getDeviceName("SH837W", FALLBACK);
    Assert.assertEquals("Foxconn SHARP SH837W", result);
}
public void testDevice5406() throws Exception {
    final String result = DeviceNames.getDeviceName("Craft", FALLBACK);
    Assert.assertEquals("Explay Craft", result);
}
public void testDevice5407() throws Exception {
    final String result = DeviceNames.getDeviceName("D5303", FALLBACK);
    Assert.assertEquals("Sony Xperia T2 Ultra", result);
}
public void testDevice5408() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K380U", FALLBACK);
    Assert.assertEquals("Hisense LED42K380U", result);
}
public void testDevice5409() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500F1", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice5410() throws Exception {
    final String result = DeviceNames.getDeviceName("SGP521", FALLBACK);
    Assert.assertEquals("Sony Xperia Z2 Tablet", result);
}
public void testDevice5411() throws Exception {
    final String result = DeviceNames.getDeviceName("Trooper_X55", FALLBACK);
    Assert.assertEquals("KAZAM TROOPER X5.5", result);
}
public void testDevice5412() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-A500FU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy A5", result);
}
public void testDevice5413() throws Exception {
    final String result = DeviceNames.getDeviceName("IQ436i", FALLBACK);
    Assert.assertEquals("Fly Era Nano 9", result);
}
public void testDevice5414() throws Exception {
    final String result = DeviceNames.getDeviceName("003Z", FALLBACK);
    Assert.assertEquals("ZTE Blade", result);
}
public void testDevice5415() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H222", FALLBACK);
    Assert.assertEquals("LGE LG Joy", result);
}
public void testDevice5416() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H221", FALLBACK);
    Assert.assertEquals("LGE LG Joy", result);
}
public void testDevice5417() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-H220", FALLBACK);
    Assert.assertEquals("LGE LG Joy", result);
}
public void testDevice5418() throws Exception {
    final String result = DeviceNames.getDeviceName("G1-715", FALLBACK);
    Assert.assertEquals("Acer G1-715", result);
}
public void testDevice5419() throws Exception {
    final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I577", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Exhilarate", result);
}
public void testDevice5420() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A725L", FALLBACK);
    Assert.assertEquals("Pantech ef14lv", result);
}
public void testDevice5421() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5422() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5423() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925I", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5424() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925F", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5425() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-SU660", FALLBACK);
    Assert.assertEquals("LGE Optimus 2X", result);
}
public void testDevice5426() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925A", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5427() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925X", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5428() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5429() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5430() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925R", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5431() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5432() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G925P", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5433() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M130K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy K", result);
}
public void testDevice5434() throws Exception {
    final String result = DeviceNames.getDeviceName("SHW-M130L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy U", result);
}
public void testDevice5435() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G3139D", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace4 Lite", result);
}
public void testDevice5436() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-i705", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab2 7.0", result);
}
public void testDevice5437() throws Exception {
    final String result = DeviceNames.getDeviceName("X2_Soul_PRO", FALLBACK);
    Assert.assertEquals("AllView X2 Soul PRO", result);
}
public void testDevice5438() throws Exception {
    final String result = DeviceNames.getDeviceName("MY1306P", FALLBACK);
    Assert.assertEquals("Lazer MY1306P", result);
}
public void testDevice5439() throws Exception {
    final String result = DeviceNames.getDeviceName("L36h", FALLBACK);
    Assert.assertEquals("Sony Xperia Z", result);
}
public void testDevice5440() throws Exception {
    final String result = DeviceNames.getDeviceName("AS650C", FALLBACK);
    Assert.assertEquals("Panasonic AS650C", result);
}
public void testDevice5441() throws Exception {
    final String result = DeviceNames.getDeviceName("N9101", FALLBACK);
    Assert.assertEquals("ZTE N9101", result);
}
public void testDevice5442() throws Exception {
    final String result = DeviceNames.getDeviceName("N9100", FALLBACK);
    Assert.assertEquals("ZTE N9100", result);
}
public void testDevice5443() throws Exception {
    final String result = DeviceNames.getDeviceName("starTIM1", FALLBACK);
    Assert.assertEquals("Cellon starTIM1", result);
}
public void testDevice5444() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1585", FALLBACK);
    Assert.assertEquals("Motorola Droid Turbo 2", result);
}
public void testDevice5445() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P905", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Pro 12.2", result);
}
public void testDevice5446() throws Exception {
    final String result = DeviceNames.getDeviceName("XT1580", FALLBACK);
    Assert.assertEquals("Motorola Moto X Force", result);
}
public void testDevice5447() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P901", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Pro 12.2", result);
}
public void testDevice5448() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-P900", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note Pro 12.2", result);
}
public void testDevice5449() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-T330NU", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 4 8.0", result);
}
public void testDevice5450() throws Exception {
    final String result = DeviceNames.getDeviceName("HT-I860", FALLBACK);
    Assert.assertEquals("Haier HT-I860", result);
}
public void testDevice5451() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T928", FALLBACK);
    Assert.assertEquals("Hisense HS-T928", result);
}
public void testDevice5452() throws Exception {
    final String result = DeviceNames.getDeviceName("LED39K360X3D", FALLBACK);
    Assert.assertEquals("Hisense LED39K360X3D", result);
}
public void testDevice5453() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-T926", FALLBACK);
    Assert.assertEquals("Hisense HS-T926", result);
}
public void testDevice5454() throws Exception {
    final String result = DeviceNames.getDeviceName("LED75XT890G3D", FALLBACK);
    Assert.assertEquals("Hisense LED75XT890G3D", result);
}
public void testDevice5455() throws Exception {
    final String result = DeviceNames.getDeviceName("HTCD100LVWPP", FALLBACK);
    Assert.assertEquals("HTC Desire 526", result);
}
public void testDevice5456() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G9250", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S6 Edge", result);
}
public void testDevice5457() throws Exception {
    final String result = DeviceNames.getDeviceName("T752", FALLBACK);
    Assert.assertEquals("Audiovox T752 Tablet", result);
}
public void testDevice5458() throws Exception {
    final String result = DeviceNames.getDeviceName("EveryPad", FALLBACK);
    Assert.assertEquals("Lenovo EveryPad", result);
}
public void testDevice5459() throws Exception {
    final String result = DeviceNames.getDeviceName("U8220", FALLBACK);
    Assert.assertEquals("Huawei U8220", result);
}
public void testDevice5460() throws Exception {
    final String result = DeviceNames.getDeviceName("N850L", FALLBACK);
    Assert.assertEquals("ZTE N850L", result);
}
public void testDevice5461() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-01D", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia PLAY", result);
}
public void testDevice5462() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-01E", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia AX", result);
}
public void testDevice5463() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-01F", FALLBACK);
    Assert.assertEquals("Sony Xperia Z1", result);
}
public void testDevice5464() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-01G", FALLBACK);
    Assert.assertEquals("Sony Xperia Z3", result);
}
public void testDevice5465() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-01B", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia X10", result);
}
public void testDevice5466() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-01C", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia Arc", result);
}
public void testDevice5467() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-06F", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PAD SH-06F", result);
}
public void testDevice5468() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-06D", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE SH-06D", result);
}
public void testDevice5469() throws Exception {
    final String result = DeviceNames.getDeviceName("SH-06E", FALLBACK);
    Assert.assertEquals("Sharp AQUOS PHONE ZETA SH-06E", result);
}
public void testDevice5470() throws Exception {
    final String result = DeviceNames.getDeviceName("SO-01H", FALLBACK);
    Assert.assertEquals("Sony Xperia Z5", result);
}
public void testDevice5471() throws Exception {
    final String result = DeviceNames.getDeviceName("Z813", FALLBACK);
    Assert.assertEquals("ZTE Z813", result);
}
public void testDevice5472() throws Exception {
    final String result = DeviceNames.getDeviceName("Z812", FALLBACK);
    Assert.assertEquals("ZTE Z812", result);
}
public void testDevice5473() throws Exception {
    final String result = DeviceNames.getDeviceName("TECNO-M6S", FALLBACK);
    Assert.assertEquals("TECNO-M6S", result);
}
public void testDevice5474() throws Exception {
    final String result = DeviceNames.getDeviceName("C5302", FALLBACK);
    Assert.assertEquals("Sony Xperia SP", result);
}
public void testDevice5475() throws Exception {
    final String result = DeviceNames.getDeviceName("C5303", FALLBACK);
    Assert.assertEquals("Sony Xperia SP", result);
}
public void testDevice5476() throws Exception {
    final String result = DeviceNames.getDeviceName("C5306", FALLBACK);
    Assert.assertEquals("Sony Xperia SP", result);
}
public void testDevice5477() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-X8C", FALLBACK);
    Assert.assertEquals("Hisense HS-X8C", result);
}
public void testDevice5478() throws Exception {
    final String result = DeviceNames.getDeviceName("V8200plus", FALLBACK);
    Assert.assertEquals("ZTE V8200plus", result);
}
public void testDevice5479() throws Exception {
    final String result = DeviceNames.getDeviceName("BHX-S100", FALLBACK);
    Assert.assertEquals("SK Broadband B tv smart", result);
}
public void testDevice5480() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T869", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 7.0 Plus", result);
}
public void testDevice5481() throws Exception {
    final String result = DeviceNames.getDeviceName("LGL45C", FALLBACK);
    Assert.assertEquals("LGE Optimus Net", result);
}
public void testDevice5482() throws Exception {
    final String result = DeviceNames.getDeviceName("M97", FALLBACK);
    Assert.assertEquals("Anydata Matsunichi M97", result);
}
public void testDevice5483() throws Exception {
    final String result = DeviceNames.getDeviceName("US740", FALLBACK);
    Assert.assertEquals("LGE Ally", result);
}
public void testDevice5484() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-X8T", FALLBACK);
    Assert.assertEquals("Hisense HS-X8T", result);
}
public void testDevice5485() throws Exception {
    final String result = DeviceNames.getDeviceName("HS-X8U", FALLBACK);
    Assert.assertEquals("Hisense HS-X8U", result);
}
public void testDevice5486() throws Exception {
    final String result = DeviceNames.getDeviceName("CS-1A13", FALLBACK);
    Assert.assertEquals("Dell Cloud Connect", result);
}
public void testDevice5487() throws Exception {
    final String result = DeviceNames.getDeviceName("E5563", FALLBACK);
    Assert.assertEquals("Sony Xperia C5 Ultra Dual", result);
}
public void testDevice5488() throws Exception {
    final String result = DeviceNames.getDeviceName("PADCT1010W", FALLBACK);
    Assert.assertEquals("Haier PADCT1010W", result);
}
public void testDevice5489() throws Exception {
    final String result = DeviceNames.getDeviceName("5065A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5065A", result);
}
public void testDevice5490() throws Exception {
    final String result = DeviceNames.getDeviceName("5065D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5065D", result);
}
public void testDevice5491() throws Exception {
    final String result = DeviceNames.getDeviceName("5065X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5065X", result);
}
public void testDevice5492() throws Exception {
    final String result = DeviceNames.getDeviceName("ZTE-V6500", FALLBACK);
    Assert.assertEquals("ZTE-V6500", result);
}
public void testDevice5493() throws Exception {
    final String result = DeviceNames.getDeviceName("5065W", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5065W", result);
}
public void testDevice5494() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D315l", FALLBACK);
    Assert.assertEquals("LGE LG F70", result);
}
public void testDevice5495() throws Exception {
    final String result = DeviceNames.getDeviceName("LT100K6900A", FALLBACK);
    Assert.assertEquals("Hisense LT100K6900A", result);
}
public void testDevice5496() throws Exception {
    final String result = DeviceNames.getDeviceName("LE43U5000A", FALLBACK);
    Assert.assertEquals("Haier LE43U5000A", result);
}
public void testDevice5497() throws Exception {
    final String result = DeviceNames.getDeviceName("5560S", FALLBACK);
    Assert.assertEquals("Coolpad CP5660S", result);
}
public void testDevice5498() throws Exception {
    final String result = DeviceNames.getDeviceName("5038A", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 4.5", result);
}
public void testDevice5499() throws Exception {
    final String result = DeviceNames.getDeviceName("5038E", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) Soul 4.5", result);
}
public void testDevice5500() throws Exception {
    final String result = DeviceNames.getDeviceName("5038D", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) 5038D", result);
}
public void testDevice5501() throws Exception {
    final String result = DeviceNames.getDeviceName("PSP5307DUO", FALLBACK);
    Assert.assertEquals("Prestigio PSP5307DUO", result);
}
public void testDevice5502() throws Exception {
    final String result = DeviceNames.getDeviceName("C2305", FALLBACK);
    Assert.assertEquals("Sony Xperia C", result);
}
public void testDevice5503() throws Exception {
    final String result = DeviceNames.getDeviceName("C2304", FALLBACK);
    Assert.assertEquals("Sony Xperia C", result);
}
public void testDevice5504() throws Exception {
    final String result = DeviceNames.getDeviceName("P-02D", FALLBACK);
    Assert.assertEquals("Panasonic P-02D", result);
}
public void testDevice5505() throws Exception {
    final String result = DeviceNames.getDeviceName("P-02E", FALLBACK);
    Assert.assertEquals("Panasonic ELUGA X", result);
}
public void testDevice5506() throws Exception {
    final String result = DeviceNames.getDeviceName("Z932L", FALLBACK);
    Assert.assertEquals("ZTE Z932L", result);
}
public void testDevice5507() throws Exception {
    final String result = DeviceNames.getDeviceName("5038X", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) SOUL 4.5", result);
}
public void testDevice5508() throws Exception {
    final String result = DeviceNames.getDeviceName("EIII", FALLBACK);
    Assert.assertEquals("Cellon EIII", result);
}
public void testDevice5509() throws Exception {
    final String result = DeviceNames.getDeviceName("MTAB-07535AK", FALLBACK);
    Assert.assertEquals("Memorex MTAB-0753AK", result);
}
public void testDevice5510() throws Exception {
    final String result = DeviceNames.getDeviceName("Houston", FALLBACK);
    Assert.assertEquals("Cellon Houston", result);
}
public void testDevice5511() throws Exception {
    final String result = DeviceNames.getDeviceName("YU5010", FALLBACK);
    Assert.assertEquals("YUPHORIA", result);
}
public void testDevice5512() throws Exception {
    final String result = DeviceNames.getDeviceName("ForwardZero", FALLBACK);
    Assert.assertEquals("NGM Italia SRL ForwardZero", result);
}
public void testDevice5513() throws Exception {
    final String result = DeviceNames.getDeviceName("IM-A860K", FALLBACK);
    Assert.assertEquals("Pantech IM-A860K", result);
}
public void testDevice5514() throws Exception {
    final String result = DeviceNames.getDeviceName("LGUS990", FALLBACK);
    Assert.assertEquals("LGE LG G3", result);
}
public void testDevice5515() throws Exception {
    final String result = DeviceNames.getDeviceName("LGUS991", FALLBACK);
    Assert.assertEquals("LGE LG G4", result);
}
public void testDevice5516() throws Exception {
    final String result = DeviceNames.getDeviceName("A930", FALLBACK);
    Assert.assertEquals("Enspert MG", result);
}
public void testDevice5517() throws Exception {
    final String result = DeviceNames.getDeviceName("LGUS995", FALLBACK);
    Assert.assertEquals("LGE LG G Flex2", result);
}
public void testDevice5518() throws Exception {
    final String result = DeviceNames.getDeviceName("B50", FALLBACK);
    Assert.assertEquals("BenQ B50", result);
}
public void testDevice5519() throws Exception {
    final String result = DeviceNames.getDeviceName("LGLS620", FALLBACK);
    Assert.assertEquals("LGE L70", result);
}
public void testDevice5520() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8200", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S3 Mini Value Edition", result);
}
public void testDevice5521() throws Exception {
    final String result = DeviceNames.getDeviceName("PNDPP48GP", FALLBACK);
    Assert.assertEquals("Anydata Pendo PNDPP48GP", result);
}
public void testDevice5522() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z010D", FALLBACK);
    Assert.assertEquals("Asus Zenfone MAX (ZC550KL)", result);
}
public void testDevice5523() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D329", FALLBACK);
    Assert.assertEquals("LGE L70", result);
}
public void testDevice5524() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D325", FALLBACK);
    Assert.assertEquals("LGE L70", result);
}
public void testDevice5525() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D320", FALLBACK);
    Assert.assertEquals("LGE L70", result);
}
public void testDevice5526() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D321", FALLBACK);
    Assert.assertEquals("LGE LG Optimus L70", result);
}
public void testDevice5527() throws Exception {
    final String result = DeviceNames.getDeviceName("LAP250U", FALLBACK);
    Assert.assertEquals("LGU+ LAP250U", result);
}
public void testDevice5528() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-S978L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy E5", result);
}
public void testDevice5529() throws Exception {
    final String result = DeviceNames.getDeviceName("801EM", FALLBACK);
    Assert.assertEquals("Coolpad 801EM", result);
}
public void testDevice5530() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC6535LVW", FALLBACK);
    Assert.assertEquals("HTC One M9", result);
}
public void testDevice5531() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T599V", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Exhibit", result);
}
public void testDevice5532() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D221", FALLBACK);
    Assert.assertEquals("LGE L50 Sporty", result);
}
public void testDevice5533() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T599N", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Exhibit", result);
}
public void testDevice5534() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D227", FALLBACK);
    Assert.assertEquals("LGE L50 Sporty", result);
}
public void testDevice5535() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC_Sensation_Z710e", FALLBACK);
    Assert.assertEquals("HTC Sensation", result);
}
public void testDevice5536() throws Exception {
    final String result = DeviceNames.getDeviceName("801ES", FALLBACK);
    Assert.assertEquals("Coolpad801ES", result);
}
public void testDevice5537() throws Exception {
    final String result = DeviceNames.getDeviceName("L-05D", FALLBACK);
    Assert.assertEquals("LGE LG optimus it L-05D", result);
}
public void testDevice5538() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8260E", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core Safe", result);
}
public void testDevice5539() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I8260L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Core", result);
}
public void testDevice5540() throws Exception {
    final String result = DeviceNames.getDeviceName("ASUS_Z00YD", FALLBACK);
    Assert.assertEquals("ASUS Live", result);
}
public void testDevice5541() throws Exception {
    final String result = DeviceNames.getDeviceName("C6530", FALLBACK);
    Assert.assertEquals("Kyocera Hydro LIFE", result);
}
public void testDevice5542() throws Exception {
    final String result = DeviceNames.getDeviceName("A1-850", FALLBACK);
    Assert.assertEquals("Acer Iconia One 8", result);
}
public void testDevice5543() throws Exception {
    final String result = DeviceNames.getDeviceName("SHP-SH630E", FALLBACK);
    Assert.assertEquals("Foxconn SHARP SH630E", result);
}
public void testDevice5544() throws Exception {
    final String result = DeviceNames.getDeviceName("HM_NOTE_1W", FALLBACK);
    Assert.assertEquals("Xiaomi Redmi Note", result);
}
public void testDevice5545() throws Exception {
    final String result = DeviceNames.getDeviceName("A205", FALLBACK);
    Assert.assertEquals("Toshiba Astro-20", result);
}
public void testDevice5546() throws Exception {
    final String result = DeviceNames.getDeviceName("A204", FALLBACK);
    Assert.assertEquals("Toshiba A204", result);
}
public void testDevice5547() throws Exception {
    final String result = DeviceNames.getDeviceName("A200", FALLBACK);
    Assert.assertEquals("Acer Iconia Tab A200", result);
}
public void testDevice5548() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G906K", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice5549() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G906L", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice5550() throws Exception {
    final String result = DeviceNames.getDeviceName("ST21a2", FALLBACK);
    Assert.assertEquals("Sony Xperia tipo dual", result);
}
public void testDevice5551() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G906S", FALLBACK);
    Assert.assertEquals("Samsung Galaxy S5", result);
}
public void testDevice5552() throws Exception {
    final String result = DeviceNames.getDeviceName("SM-G5308W", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Grand Prime", result);
}
public void testDevice5553() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T679", FALLBACK);
    Assert.assertEquals("Samsung Exhibit II", result);
}
public void testDevice5554() throws Exception {
    final String result = DeviceNames.getDeviceName("VT10E2", FALLBACK);
    Assert.assertEquals("Vestel VT10E2", result);
}
public void testDevice5555() throws Exception {
    final String result = DeviceNames.getDeviceName("LED46K660X3D", FALLBACK);
    Assert.assertEquals("Hisense LED46K660X3D", result);
}
public void testDevice5556() throws Exception {
    final String result = DeviceNames.getDeviceName("101P51C", FALLBACK);
    Assert.assertEquals("Mecer 101P51C", result);
}
public void testDevice5557() throws Exception {
    final String result = DeviceNames.getDeviceName("NB7850S", FALLBACK);
    Assert.assertEquals("Nobis NB7850S", result);
}
public void testDevice5558() throws Exception {
    final String result = DeviceNames.getDeviceName("Telenor_OneTouch", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) One Touch 990", result);
}
public void testDevice5559() throws Exception {
    final String result = DeviceNames.getDeviceName("DT7v51B", FALLBACK);
    Assert.assertEquals("ESI Enterprises DT7v51B", result);
}
public void testDevice5560() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-S6802B", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Ace Duos", result);
}
public void testDevice5561() throws Exception {
    final String result = DeviceNames.getDeviceName("FLY_IQ4400_AF", FALLBACK);
    Assert.assertEquals("Fly Iris", result);
}
public void testDevice5562() throws Exception {
    final String result = DeviceNames.getDeviceName("LED42K610J3DP", FALLBACK);
    Assert.assertEquals("Hisense LED42K610J3DP", result);
}
public void testDevice5563() throws Exception {
    final String result = DeviceNames.getDeviceName("MT11i", FALLBACK);
    Assert.assertEquals("Sony Ericsson Xperia neo V", result);
}
public void testDevice5564() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9220", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice5565() throws Exception {
    final String result = DeviceNames.getDeviceName("DL750", FALLBACK);
    Assert.assertEquals("TCT (Alcatel) TCL DL750", result);
}
public void testDevice5566() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-T499", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Mini", result);
}
public void testDevice5567() throws Exception {
    final String result = DeviceNames.getDeviceName("x600", FALLBACK);
    Assert.assertEquals("LeTV Le1", result);
}
public void testDevice5568() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-I9228", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Note", result);
}
public void testDevice5569() throws Exception {
    final String result = DeviceNames.getDeviceName("CT1010", FALLBACK);
    Assert.assertEquals("Enspert Carrefour CT1010", result);
}
public void testDevice5570() throws Exception {
    final String result = DeviceNames.getDeviceName("MY15ADA", FALLBACK);
    Assert.assertEquals("Honda Pilot", result);
}
public void testDevice5571() throws Exception {
    final String result = DeviceNames.getDeviceName("FWSP-S1000", FALLBACK);
    Assert.assertEquals("Finggo FWSP-S1000", result);
}
public void testDevice5572() throws Exception {
    final String result = DeviceNames.getDeviceName("Golf", FALLBACK);
    Assert.assertEquals("WIKO IGGY", result);
}
public void testDevice5573() throws Exception {
    final String result = DeviceNames.getDeviceName("Infinity-10.1-v2", FALLBACK);
    Assert.assertEquals("Infinity-10.1-v2", result);
}
public void testDevice5574() throws Exception {
    final String result = DeviceNames.getDeviceName("Infinity-10.1-v3", FALLBACK);
    Assert.assertEquals("Infinity-10.1-v3", result);
}
public void testDevice5575() throws Exception {
    final String result = DeviceNames.getDeviceName("SGH-N075T", FALLBACK);
    Assert.assertEquals("Samsung Galaxy J", result);
}
public void testDevice5576() throws Exception {
    final String result = DeviceNames.getDeviceName("LED32K360X3D", FALLBACK);
    Assert.assertEquals("Hisense LED32K360X3D", result);
}
public void testDevice5577() throws Exception {
    final String result = DeviceNames.getDeviceName("SCH-W789", FALLBACK);
    Assert.assertEquals("Samsung Hennessy", result);
}
public void testDevice5578() throws Exception {
    final String result = DeviceNames.getDeviceName("Etab5", FALLBACK);
    Assert.assertEquals("General Mobile Etab5", result);
}
public void testDevice5579() throws Exception {
    final String result = DeviceNames.getDeviceName("GT-P7300", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Tab 8.9", result);
}
public void testDevice5580() throws Exception {
    final String result = DeviceNames.getDeviceName("Roar_A50", FALLBACK);
    Assert.assertEquals("Symphony Roar A50", result);
}
public void testDevice5581() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-D722AR", FALLBACK);
    Assert.assertEquals("LGE G3 S", result);
}
public void testDevice5582() throws Exception {
    final String result = DeviceNames.getDeviceName("EK-GN100", FALLBACK);
    Assert.assertEquals("Samsung Galaxy Camera", result);
}
public void testDevice5583() throws Exception {
    final String result = DeviceNames.getDeviceName("RCT6203W46", FALLBACK);
    Assert.assertEquals("RCA RCT6203W46", result);
}
public void testDevice5584() throws Exception {
    final String result = DeviceNames.getDeviceName("VT785P2-Cleverpad", FALLBACK);
    Assert.assertEquals("Vestel VT785P2", result);
}
public void testDevice5585() throws Exception {
    final String result = DeviceNames.getDeviceName("TBQG884", FALLBACK);
    Assert.assertEquals("Zeki TBQG884", result);
}
public void testDevice5586() throws Exception {
    final String result = DeviceNames.getDeviceName("XT560", FALLBACK);
    Assert.assertEquals("Motorola Defy Pro", result);
}
public void testDevice5587() throws Exception {
    final String result = DeviceNames.getDeviceName("SH825Wi", FALLBACK);
    Assert.assertEquals("Sharp SH825wi", result);
}
public void testDevice5588() throws Exception {
    final String result = DeviceNames.getDeviceName("QTAQZ3KID", FALLBACK);
    Assert.assertEquals("Verizon Wireless QTAQZ3KID", result);
}
public void testDevice5589() throws Exception {
    final String result = DeviceNames.getDeviceName("LG-VK700", FALLBACK);
    Assert.assertEquals("LGE G Pad 10.1 LTE", result);
}
public void testDevice5590() throws Exception {
    final String result = DeviceNames.getDeviceName("HTC-PG762", FALLBACK);
    Assert.assertEquals("HTC Wildfire S A515c", result);
}
public void testDevice5591() throws Exception {
    final String result = DeviceNames.getDeviceName("FP-U320-711-WIFI", FALLBACK);
    Assert.assertEquals("SAKAISIO FP-U320-711-WIFI", result);
}

}
