import strukdat.*;
class Vertex{
	String nodeName;
	Vertex(String name)
	{
		this.nodeName = name;
	}

    @Override
    public String toString() {
        return (nodeName);
    }
}


public class MainProgram {
    public static void main(String[] args) {
        // Wilayah Kalimantan - 18
        Vertex BPN = new Vertex("Bandar Udara Internasional Sultan Aji Muhammad Sulaiman Sepinggan(BPN) - Balikpapan");
        Vertex BEJ = new Vertex("Bandar Udara Kalimarau(BEJ) - Berau");
        Vertex AAP = new Vertex("Bandar Udara Aji Pangeran Tumenggung Pranoto(AAP) - Samarinda");
        Vertex TRK = new Vertex("Bandar Udara Internasional Juwata Tarakan(TRK) - Tarakan");
        Vertex SMQ = new Vertex("Bandar Udara H. Asan Sampit(SMQ) - Sampit");
        Vertex PKN = new Vertex("Bandar Udara Iskandar(PKN) - Pangkalanbun");
        Vertex BDJ = new Vertex("Bandar Udara Internasional Syamsudinnoor(BDJ) - Banjarmasin");
        Vertex PKY = new Vertex("Bandar Udara Tjilik Riwut(PKY) - Palangkaraya");
        Vertex PNK = new Vertex("Bandar Udara Internasional Supadio(PNK) - Pontianak");
        Vertex LNU = new Vertex("Bandar Udara Robert Atty Bessing(LNU) - Malinau");
        Vertex TJS = new Vertex("Bandar Udara Tanjung Harapan(TJS) - TanjungSelor");
        Vertex GHS = new Vertex("Bandar Udara Melalan Kutai Barat(GHS) - Melak");
        Vertex HMS = new Vertex("Bandar Udara Haji Muhammad Sidik(HMS) - MuaraTeweh");
        Vertex PSU = new Vertex("Bandar Udara Pangsuma(PSU) - Putussibau");
        Vertex SQG = new Vertex("Bandar Udara Tebelian(SQG) - Sintang");
        Vertex KTG = new Vertex("Bandar Udara Rahadil Usman(KTG) - Ketapang");
        Vertex BTW = new Vertex("Bandar Udara Batu Licin(BTW) - Batulicin");
        Vertex KBU = new Vertex("Bandar Udara Gusti Sjamsir Alam(KBU) - Kotabaru");

        // Wilayah Sumatera - 20
        Vertex BTJ = new Vertex("Bandar Udara Internasional Sultan Iskandar Muda(BTJ) - BandaAceh");
        Vertex LSW = new Vertex("Bandar Udara Malikussaleh(LSW) - Lhokseumawe");
        Vertex MEQ = new Vertex("Bandar Udara Cut Nyak Dhien(MEQ) - Meulaboh");
        Vertex LKI = new Vertex("Bandar Udara Lasikin(LKI) - Sinabang");
        Vertex KNO = new Vertex("Bandar Udara Internasional Kualanamu(KNO) - Medan");
        Vertex DTB = new Vertex("Bandar Udara Internasional Sisingamangaraja XII(DTB) - Tapanuli"); 
        Vertex FLZ = new Vertex("Bandar Udara Dr. Ferdinand Lumban Tobing(FLZ) - Sibolga");
        Vertex GNS = new Vertex("Bandar Udara Binaka Gunungsitoli Nias(GNS) - Nias");
        Vertex PKU = new Vertex("Bandar Udara Internasional Sultan Syarif Kasim II(PKU) - Pekanbaru");
        Vertex BTH = new Vertex("Bandar Udara Internasional Hang Nadim(BTH) - Batam");
        Vertex TNJ = new Vertex("Bandar Udara Raja Haji Fisabilillah Tanjung Pinang(TNJ) - TanjungPinang");
        Vertex PDG = new Vertex("Bandar Udara Internasional Minangkabau(PDG) - Padang");
        Vertex BUU = new Vertex("Bandar Udara Muara Bungo(BUU) - Muara Bungo");
        Vertex DJB = new Vertex("Bandar Udara Internasional Sultan Thaha(DJB) - Jambi");
        Vertex BKS = new Vertex("Bandar Udara Fatmawati Soekarno(BKS) - Bengkulu");
        Vertex LLJ = new Vertex("Bandar Udara Silampari(LLJ) - LubukLinggau");
        Vertex PLM = new Vertex("Bandar Udara Internasional Sultan Mahmud Badaruddin II(PLM) - Palembang");
        Vertex TKG = new Vertex("Bandar Udara Internasional Radin Inten II.(TKG) - BandarLampung");
        Vertex PGK = new Vertex("Bandar Udara Depati Amir(PGK) - PangkalPinang");
        Vertex TJQ = new Vertex("Bandar Udara Internasional H.A.S. Hanandjoeddin(TJQ) - TanjungPandan");

        // Wilayah Jawa - 12
        Vertex BWX = new Vertex("Bandar Udara Internasional Banyuwangi(BWX) - Banyuwangi");  
        Vertex MLG = new Vertex("Bandar Udara Abdulrachman Saleh(MLG) - Malang");    
        Vertex SUB = new Vertex("Bandar Udara Internasional Juanda(SUB) - Surabaya");
        Vertex DHX = new Vertex("Bandar Udara Internasional Dhoho Kediri(DHX) - Kediri"); 
        Vertex SOC = new Vertex("Bandar Udara Adi Soemarmo(SOC) - Surakarta");
        Vertex SRG = new Vertex("Bandar Udara Jenderal Ahmad Yani(SRG) - Semarang");
        Vertex YIA = new Vertex("Bandar Udara Internasional Yogyakarta(YIA) - Yogyakarta");
        Vertex JOG = new Vertex("Bandar Udara Adi Sutjipto(JOG) - Yogyakarta");
        Vertex HLP = new Vertex("Bandar Udara Halim Perdanakusuma(HLP) - Jakarta");
        Vertex CGK = new Vertex("Bandar Udara Internasional Soekarno Hatta(CGK) - Jakarta");
    
        

        WeightedGraph<Vertex> jarak = new WeightedGraph<Vertex>(false); // Undirected
        WeightedGraph<Vertex> harga = new WeightedGraph<Vertex>(false); // Undirected
        // -----------------------------------------------------------------
        // BALIKPAPAN - 16
        // BDJ, BEJ, TRK, PKY, PNK, GHS, LNU, TJS, SRG, YIA, SOC, SUB, BTH, KNO, CGK, HLP
        jarak.addEdge(BPN, BDJ, 342); 
        jarak.addEdge(BPN, BEJ, 370);
        jarak.addEdge(BPN, TRK, 512); 
        jarak.addEdge(BPN, PKY, 344);
        jarak.addEdge(BPN, PNK, 846);
        jarak.addEdge(BPN, GHS, 160);
        jarak.addEdge(BPN, LNU, 537);
        jarak.addEdge(BPN, TJS, 460);
        jarak.addEdge(BPN, SRG, 958);
        jarak.addEdge(BPN, YIA, 1025);
        jarak.addEdge(BPN, SOC, 970);
        jarak.addEdge(BPN, SUB, 809);
        jarak.addEdge(BPN, BTH, 1451);
        jarak.addEdge(BPN, KNO, 2091);
        jarak.addEdge(BPN, CGK, 1248);
        jarak.addEdge(BPN, HLP, 1241);
        harga.addEdge(BPN, BDJ, 1251510); 
        harga.addEdge(BPN, BEJ, 1652635);
        harga.addEdge(BPN, TRK, 1171285); 
        harga.addEdge(BPN, PKY, 1845175);
        harga.addEdge(BPN, PNK, 1476140);
        harga.addEdge(BPN, GHS, 1524275);
        harga.addEdge(BPN, LNU, 2390705);
        harga.addEdge(BPN, TJS, 1315690);
        harga.addEdge(BPN, SRG, 1540320);
        harga.addEdge(BPN, YIA, 1524275);
        harga.addEdge(BPN, SOC, 1604500);
        harga.addEdge(BPN, SUB, 1411960);
        harga.addEdge(BPN, BTH, 2005625);
        harga.addEdge(BPN, KNO, 2390705);
        harga.addEdge(BPN, CGK, 1411960);
        harga.addEdge(BPN, HLP, 1668680);
        // -----------------------------------------------------------------
        // BERAU - 4
        // AAP, SUB, CGK ; BPN udah
        jarak.addEdge(BEJ, AAP, 284);
        jarak.addEdge(BEJ, SUB, 1154);
        jarak.addEdge(BEJ, CGK, 1492);
        harga.addEdge(BEJ, AAP, 1572410);
        harga.addEdge(BEJ, SUB, 2069805);
        harga.addEdge(BEJ, CGK, 2374660);
        // -----------------------------------------------------------------
        // SAMARINDA - 5
        // GHS, CGK, SUB, YIA ; BEJ udah
        jarak.addEdge(AAP, GHS, 151); 
        jarak.addEdge(AAP, CGK, 1316); 
        jarak.addEdge(AAP, SUB, 895); 
        jarak.addEdge(AAP, YIA, 1106); 
        harga.addEdge(AAP, GHS, 1548275); 
        harga.addEdge(AAP, CGK, 1604500); 
        harga.addEdge(AAP, SUB, 1572410); 
        harga.addEdge(AAP, YIA, 1748905); 
        // -----------------------------------------------------------------
        // TARAKAN - 4
        // LNU, CGK, SUB ; BPN udah
        jarak.addEdge(TRK, LNU, 107);
        jarak.addEdge(TRK, CGK, 1608);
        jarak.addEdge(TRK, SUB, 1293);    
        harga.addEdge(TRK, LNU, 1398487);
        harga.addEdge(TRK, CGK, 2053760);
        harga.addEdge(TRK, SUB, 1877265);    
        // -----------------------------------------------------------------
        // SAMPIT - 2
        // CGK, SUB
        jarak.addEdge(SMQ, CGK, 790);
        jarak.addEdge(SMQ, SUB, 525);
        harga.addEdge(SMQ, CGK, 1444050);
        harga.addEdge(SMQ, SUB, 2278390);
        // -----------------------------------------------------------------
        // PANGKALAN BUN - 3
        // CGK, SRG, SUB
        jarak.addEdge(PKN, CGK, 332);
        jarak.addEdge(PKN, SRG, 492);
        jarak.addEdge(PKN, SUB, 522);
        harga.addEdge(PKN, CGK, 1123150);
        harga.addEdge(PKN, SRG, 1171285);
        harga.addEdge(PKN, SUB, 1732860);
        // -----------------------------------------------------------------
        // BANJARMASIN - 8
        // HMS, CGK, SRG, YIA, SUB, BTW, KBU ; BPN udah
        jarak.addEdge(BDJ, HMS, 265);
        jarak.addEdge(BDJ, CGK, 922);
        jarak.addEdge(BDJ, SRG, 615);
        jarak.addEdge(BDJ, YIA, 683);
        jarak.addEdge(BDJ, SUB, 483);
        jarak.addEdge(BDJ, BTW, 156);
        jarak.addEdge(BDJ, KBU, 174);
        harga.addEdge(BDJ, HMS, 1448275);
        harga.addEdge(BDJ, CGK, 1107105);
        harga.addEdge(BDJ, SRG, 1155240);
        harga.addEdge(BDJ, YIA, 1572410);
        harga.addEdge(BDJ, SUB, 802250);
        harga.addEdge(BDJ, BTW, 1058970);
        harga.addEdge(BDJ, KBU, 1299645);
        // -----------------------------------------------------------------
        // PALANGKARAYA - 3
        // CGK, SUB ; BPN udah
        jarak.addEdge(PKY, CGK, 908);
        jarak.addEdge(PKY, SUB, 576);
        harga.addEdge(PKY, CGK, 1428005);
        harga.addEdge(PKY, SUB, 1251510);
        // -----------------------------------------------------------------
        // PONTIANAK - 9
        // BTH, CGK, YIA, SOC, SUB, KTG, SQG, PSU ; BPN udah
        jarak.addEdge(PNK, BTH, 603);
        jarak.addEdge(PNK, CGK, 740);
        jarak.addEdge(PNK, YIA, 872);
        jarak.addEdge(PNK, SOC, 856);
        jarak.addEdge(PNK, SUB, 889);
        jarak.addEdge(PNK, KTG, 216);
        jarak.addEdge(PNK, SQG, 239);
        jarak.addEdge(PNK, PSU, 411);
        harga.addEdge(PNK, BTH, 2358615);
        harga.addEdge(PNK, CGK, 1091060);
        harga.addEdge(PNK, YIA, 1428005);
        harga.addEdge(PNK, SOC, 1588455);
        harga.addEdge(PNK, SUB, 1460095);
        harga.addEdge(PNK, KTG, 1107105);
        harga.addEdge(PNK, SQG, 1251510);
        harga.addEdge(PNK, PSU, 1716815);
        // -----------------------------------------------------------------
        // MALINAU - 2; BPN, TRK
        // TANJUNG SELOR - 1; BPN
        // MELAK - 2; BPN, AAP
        // MUARA TEWEH - 1; BDJ
        // PUTUSSIBAU - 1; PNK
        // SINTANG - 1; SQG
        // BATU LICIN - 1; BDJ
        // KOTABARU - 1; BDJ
        // -----------------------------------------------------------------
        // KETAPANG - 2
        // SRG; PNK udah
        jarak.addEdge(KTG, SRG, 570); 
        harga.addEdge(KTG, SRG, 1816815); 
        // -----------------------------------------------------------------

        // -----------------------------------------------------------------
        // MEDAN - 16
        // BTJ, LSW, MEQ, LKI, GNS, FLZ, PDG, PKU, BTH, PLM, CGK, HLP, 
        // YIA, SUB ; BPN udah
        jarak.addEdge(KNO, BTJ, 431);
        jarak.addEdge(KNO, LSW, 245);
        jarak.addEdge(KNO, MEQ, 289);
        jarak.addEdge(KNO, LKI, 285);
        jarak.addEdge(KNO, GNS, 303);
        jarak.addEdge(KNO, FLZ, 207);
        jarak.addEdge(KNO, PDG, 536);
        jarak.addEdge(KNO, PKU, 458);
        jarak.addEdge(KNO, BTH, 656);
        jarak.addEdge(KNO, PLM, 996);
        jarak.addEdge(KNO, CGK, 1388);
        jarak.addEdge(KNO, HLP, 1414);
        jarak.addEdge(KNO, YIA, 1814);
        jarak.addEdge(KNO, SUB, 1972);
        harga.addEdge(KNO, BTJ, 786205);
        harga.addEdge(KNO, LSW, 1411960);
        harga.addEdge(KNO, MEQ, 1492185);
        harga.addEdge(KNO, LKI, 1382105);
        harga.addEdge(KNO, GNS, 1251510);
        harga.addEdge(KNO, FLZ, 1187330);
        harga.addEdge(KNO, PDG, 834340);
        harga.addEdge(KNO, PKU, 1010835);
        harga.addEdge(KNO, BTH, 992790);
        harga.addEdge(KNO, PLM, 1363825);
        harga.addEdge(KNO, CGK, 1556365);
        harga.addEdge(KNO, HLP, 1636590);
        harga.addEdge(KNO, YIA, 2374660);
        harga.addEdge(KNO, SUB, 2438840);
        // -----------------------------------------------------------------
        // BANDA ACEH - 2
        // CGK; KNO udah
        jarak.addEdge(BTJ, CGK, 1825);
        harga.addEdge(BTJ, CGK, 1925400);
        // -----------------------------------------------------------------
        // LHOKSEUMAWE - 1; KNO
        // MEULABOH - 1; KNO
        // SINABANG - 1; LKI
        // GUNUNG SITOLI - 1; KNO
        // SIBOLGA - 1; FLZ
        // -----------------------------------------------------------------
        // TAPANULI - 3
        // CGK, BTH, HLP
        jarak.addEdge(DTB, CGK, 1256);
        jarak.addEdge(DTB, BTH, 577);
        jarak.addEdge(DTB, HLP, 1277);
        harga.addEdge(DTB, CGK, 1492185);
        harga.addEdge(DTB, BTH, 1267555);
        harga.addEdge(DTB, HLP, 1829130);
        // -----------------------------------------------------------------
        // PEKANBARU - 6
        // BTH, CGK, HLP, YIA, SUB; KNO udah
        jarak.addEdge(PKU, BTH, 293);
        jarak.addEdge(PKU, CGK, 931);
        jarak.addEdge(PKU, HLP, 953);
        jarak.addEdge(PKU, YIA, 1354);
        jarak.addEdge(PKU, SUB, 1523);
        harga.addEdge(PKU, BTH, 673890);
        harga.addEdge(PKU, CGK, 962700);
        harga.addEdge(PKU, HLP, 1331735);
        harga.addEdge(PKU, YIA, 1508230);
        harga.addEdge(PKU, SUB, 2053760);
        // -----------------------------------------------------------------
        // PADANG - 4
        // BTH, CGK, HLP; KNO udah
        jarak.addEdge(PDG, BTH, 465);
        jarak.addEdge(PDG, CGK, 902);
        jarak.addEdge(PDG, HLP, 924);
        harga.addEdge(PDG, BTH, 866430);
        harga.addEdge(PDG, CGK, 1203375);
        harga.addEdge(PDG, HLP, 1187330);
        // -----------------------------------------------------------------
        // BATAM - 13
        // DJB, PLM, PGK, CGK, YIA, SRG, SUB; KNO, DTB, PKU, PDG, PNK, BPN udah
        jarak.addEdge(BTH, DJB, 304);
        jarak.addEdge(BTH, PLM, 463);
        jarak.addEdge(BTH, PGK, 427);
        jarak.addEdge(BTH, CGK, 853);
        jarak.addEdge(BTH, YIA, 1214);
        jarak.addEdge(BTH, SRG, 1146);
        jarak.addEdge(BTH, SUB, 1341);
        harga.addEdge(BTH, DJB, 914565);
        harga.addEdge(BTH, PLM, 802250);
        harga.addEdge(BTH, PGK, 1219420);
        harga.addEdge(BTH, CGK, 1123150);
        harga.addEdge(BTH, YIA, 1829130);
        harga.addEdge(BTH, SRG, 1909355);
        harga.addEdge(BTH, SUB, 1508230);
        // -----------------------------------------------------------------
        // TANJUNG PINANG - 1
        // CGK
        jarak.addEdge(TNJ, CGK, 818);
        harga.addEdge(TNJ, CGK, 1476140);
        // -----------------------------------------------------------------
        // MUARA BUNGO - 1
        // CGK
        jarak.addEdge(BUU, CGK, 715);
        harga.addEdge(BUU, CGK, 1276140);
        // -----------------------------------------------------------------
        // JAMBI - 2
        // CGK; BTH udah
        jarak.addEdge(DJB, CGK, 609);
        harga.addEdge(DJB, CGK, 978745);
        // -----------------------------------------------------------------
        // BENGKULU - 1
        // CGK
        jarak.addEdge(BKS, CGK, 557);
        harga.addEdge(BKS, CGK, 1123150);
        // -----------------------------------------------------------------
        // LUBUKLINGGAU - 1
        // CGK
        jarak.addEdge(LLJ, CGK, 525);
        harga.addEdge(LLJ, CGK, 1283600);
        // -----------------------------------------------------------------
        // PALEMBANG - 7
        // PGK, CGK, HLP, YIA, SUB; KNO, BTH udah
        jarak.addEdge(PLM, PGK, 257);
        jarak.addEdge(PLM, CGK, 401);
        jarak.addEdge(PLM, HLP, 422);
        jarak.addEdge(PLM, YIA, 819);
        jarak.addEdge(PLM, SUB, 1002);
        harga.addEdge(PLM, PGK, 545530);
        harga.addEdge(PLM, CGK, 593665);
        harga.addEdge(PLM, HLP, 609710);
        harga.addEdge(PLM, YIA, 1540320);
        harga.addEdge(PLM, SUB, 1423005);
        // -----------------------------------------------------------------
        // LAMPUNG - 2
        // CGK, YIA
        jarak.addEdge(TKG, CGK, 172);
        jarak.addEdge(TKG, YIA, 621);
        harga.addEdge(TKG, CGK, 481350);
        harga.addEdge(TKG, YIA, 1540320);
        // -----------------------------------------------------------------
        // PANGKAL PINANG - 4
        // TJQ, CGK; BTH, PLM udah
        jarak.addEdge(PGK, TJQ, 188);
        jarak.addEdge(PGK, CGK, 441);
        harga.addEdge(PGK, TJQ, 433215);
        harga.addEdge(PGK, CGK, 850385);
        // -----------------------------------------------------------------
        // TANJUNG PANDAN - 2
        // CGK; PGK udah
        jarak.addEdge(TJQ, CGK, 389);
        harga.addEdge(TJQ, CGK, 738070);
        // -----------------------------------------------------------------

        // -----------------------------------------------------------------
        // BANYUWANGI - 2
        // CGK, SUB
        jarak.addEdge(BWX, SUB, 208);
        jarak.addEdge(BWX, CGK, 868);
        harga.addEdge(BWX, SUB, 2214210);
        harga.addEdge(BWX, CGK, 1395915);
        // -----------------------------------------------------------------
        // MALANG - 2
        // CGK, HLP
        jarak.addEdge(MLG, CGK, 680);
        jarak.addEdge(MLG, HLP, 671);
        harga.addEdge(MLG, CGK, 1283600);
        harga.addEdge(MLG, HLP, 1123150);
        // -----------------------------------------------------------------
        // KEDIRI - 1
        // CGK
        jarak.addEdge(DHX, CGK, 621);
        harga.addEdge(DHX, CGK, 1383600);
        // -----------------------------------------------------------------
        // SURABAYA - 16
        // CGK, HLP; KNO, PKU, BTH, PLM, PNK, PKN, SMQ, PKY, BDJ, BPN,
        // AAP, BEJ, TRK, BWX udah
        jarak.addEdge(SUB, HLP, 666);
        jarak.addEdge(SUB, CGK, 673);
        harga.addEdge(SUB, HLP, 1091060);
        harga.addEdge(SUB, CGK, 994790);
        // -----------------------------------------------------------------
        // SURAKARTA - 4
        // CGK, HLP; BPN, PNK udah
        jarak.addEdge(SOC, HLP, 468);
        jarak.addEdge(SOC, CGK, 478);
        harga.addEdge(SOC, HLP, 882475);
        harga.addEdge(SOC, CGK, 898520);
        // -----------------------------------------------------------------
        // YOGYAKARTA - 1
        // HLP
        jarak.addEdge(JOG, HLP, 437);
        harga.addEdge(JOG, HLP, 882475);
        // -----------------------------------------------------------------
        // YOGYAKARTA - 11
        // CGK, HLP;KNO, PKU, PLM, TKG, BTH, PNK, BPN, BDJ, AAP udah
        jarak.addEdge(YIA, HLP, 405);
        jarak.addEdge(YIA, CGK, 412);
        harga.addEdge(YIA, HLP, 946655);
        harga.addEdge(YIA, CGK, 994790);
        // -----------------------------------------------------------------
        // SEMARANG - 7
        // CGK, HLP; BTH, KTG, PKN, BDJ, BPN udah
        jarak.addEdge(SRG, HLP, 407);
        jarak.addEdge(SRG, CGK, 418);
        harga.addEdge(SRG, HLP, 898520);
        harga.addEdge(SRG, CGK, 930610);
        // -----------------------------------------------------------------
        // JAKARTA - 13; KNO, DTB, PKU, PDG, PLM, BPN, SRG, YIA,
        // JOG, SOC, SUB, MLG
        // JAKARTA - 31
        // BTJ, KNO, DTB, PKU, PDG, BUU, BKS, LLJ, DJB, PLM, TKG, BTH, TNJ,
        // PGK, TJQ, PNK, PKN, SMQ, PKY, BDJ, BPN, AAP, BEJ, TRK, SRG, SOC,
        // YIA, SUB, DHX, MLG, BWX
        // -----------------------------------------------------------------
        jarak.printJarak();
        jarak.jarakTerpendek(CGK, PNK);
        harga.hargaTermurah(CGK, PNK);
    }
}
