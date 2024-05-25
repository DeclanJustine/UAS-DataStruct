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
        Vertex CJN = new Vertex("Bandar Udara Cijulang Nasawiru(CJN) - Pangandaran");
        Vertex BDO = new Vertex("Bandar Udara Internasional Husein Sastranegara(BDO) - Bandung");
        Vertex HLP = new Vertex("Bandar Udara Halim Perdanakusuma(HLP) - Jakarta");
        Vertex CGK = new Vertex("Bandar Udara Internasional Soekarno Hatta(CGK) - Jakarta");
    
        

        WeightedGraph<Vertex> bandara = new WeightedGraph<Vertex>(false); // Undirected
        // -----------------------------------------------------------------
        // BALIKPAPAN - 16
        // BDJ, BEJ, TRK, PKY, PNK, GHS, LNU, TJS, SRG, YIA, SOC, SUB, BTH, KNO, CGK, HLP
        bandara.addEdge(BPN, BDJ, 342); 
        bandara.addEdge(BPN, BEJ, 370);
        bandara.addEdge(BPN, TRK, 512); 
        bandara.addEdge(BPN, PKY, 344);
        bandara.addEdge(BPN, PNK, 846);
        bandara.addEdge(BPN, GHS, 160);
        bandara.addEdge(BPN, LNU, 537);
        bandara.addEdge(BPN, TJS, 460);
        bandara.addEdge(BPN, SRG, 958);
        bandara.addEdge(BPN, YIA, 1025);
        bandara.addEdge(BPN, SOC, 970);
        bandara.addEdge(BPN, SUB, 809);
        bandara.addEdge(BPN, BTH, 1451);
        bandara.addEdge(BPN, KNO, 2091);
        bandara.addEdge(BPN, CGK, 1254);
        bandara.addEdge(BPN, HLP, 1241);
        // -----------------------------------------------------------------
        // BERAU - 4
        // AAP, SUB, CGK ; BPN udah
        bandara.addEdge(BEJ, AAP, 284);
        bandara.addEdge(BEJ, SUB, 1154);
        bandara.addEdge(BEJ, CGK, 1485);
        // -----------------------------------------------------------------
        // SAMARINDA - 5
        // GHS, CGK, SUB, YIA ; BEJ udah
        bandara.addEdge(AAP, GHS, 151); 
        bandara.addEdge(AAP, CGK, 1309); 
        bandara.addEdge(AAP, SUB, 895); 
        bandara.addEdge(AAP, YIA, 1106); 
        // -----------------------------------------------------------------
        // TARAKAN - 4
        // LNU, CGK, SUB ; BPN udah
        bandara.addEdge(TRK, LNU, 107);
        bandara.addEdge(TRK, CGK, 1595);
        bandara.addEdge(TRK, SUB, 1293);    
        // -----------------------------------------------------------------
        // SAMPIT - 2
        // CGK, SUB
        bandara.addEdge(SMQ, CGK, 785);
        bandara.addEdge(SMQ, SUB, 525);
        // -----------------------------------------------------------------
        // PANGKALAN BUN - 3
        // CGK, SRG, SUB
        bandara.addEdge(PKN, CGK, 337);
        bandara.addEdge(PKN, SRG, 492);
        bandara.addEdge(PKN, SUB, 522);
        // -----------------------------------------------------------------
        // BANJARMASIN - 8
        // HMS, CGK, SRG, YIA, SUB, BTW, KBU ; BPN udah
        bandara.addEdge(BDJ, HMS, 265);
        bandara.addEdge(BDJ, CGK, 917);
        bandara.addEdge(BDJ, SRG, 615);
        bandara.addEdge(BDJ, YIA, 683);
        bandara.addEdge(BDJ, SUB, 483);
        bandara.addEdge(BDJ, BTW, 156);
        bandara.addEdge(BDJ, KBU, 174);
        // -----------------------------------------------------------------
        // PALANGKARAYA - 3
        // CGK, SUB ; BPN udah
        bandara.addEdge(PKY, CGK, 901);
        bandara.addEdge(PKY, SUB, 576);
        // -----------------------------------------------------------------
        // PONTIANAK - 9
        // BTH, CGK, YIA, SOC, SUB, KTG, SQG, PSU ; BPN udah
        bandara.addEdge(PNK, BTH, 603);
        bandara.addEdge(PNK, CGK, 739);
        bandara.addEdge(PNK, YIA, 872);
        bandara.addEdge(PNK, SOC, 856);
        bandara.addEdge(PNK, SUB, 889);
        bandara.addEdge(PNK, KTG, 216);
        bandara.addEdge(PNK, SQG, 239);
        bandara.addEdge(PNK, PSU, 411);
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
        bandara.addEdge(KTG, SRG, 570); 
        // -----------------------------------------------------------------

        // -----------------------------------------------------------------
        // MEDAN - 16
        // BTJ, LSW, MEQ, LKI, GNS, FLZ, PDG, PKU, BTH, PLM, CGK, HLP, 
        // YIA, SUB ; BPN udah
        bandara.addEdge(KNO, BTJ, 431);
        bandara.addEdge(KNO, LSW, 245);
        bandara.addEdge(KNO, MEQ, 289);
        bandara.addEdge(KNO, LKI, 285);
        bandara.addEdge(KNO, GNS, 303);
        bandara.addEdge(KNO, FLZ, 207);
        bandara.addEdge(KNO, PDG, 536);
        bandara.addEdge(KNO, PKU, 458);
        bandara.addEdge(KNO, BTH, 656);
        bandara.addEdge(KNO, PLM, 996);
        bandara.addEdge(KNO, CGK, 1398);
        bandara.addEdge(KNO, HLP, 1414);
        bandara.addEdge(KNO, YIA, 1814);
        bandara.addEdge(KNO, SUB, 1972);
        // -----------------------------------------------------------------
        // BANDA ACEH - 2
        // CGK; KNO udah
        bandara.addEdge(BTJ, CGK, 1825);
        // -----------------------------------------------------------------
        // LHOKSEUMAWE - 1; KNO
        // MEULABOH - 1; KNO
        // SINABANG - 1; LKI
        // GUNUNG SITOLI - 1; KNO
        // SIBOLGA - 1; FLZ
        // -----------------------------------------------------------------
        // TAPANULI - 3
        // CGK, BTH, HLP
        bandara.addEdge(DTB, CGK, 1260);
        bandara.addEdge(DTB, BTH, 577);
        bandara.addEdge(DTB, HLP, 1277);
        // -----------------------------------------------------------------
        // PEKANBARU - 6
        // BTH, CGK, HLP, YIA, SUB; KNO udah
        bandara.addEdge(PKU, BTH, 293);
        bandara.addEdge(PKU, CGK, 937);
        bandara.addEdge(PKU, HLP, 953);
        bandara.addEdge(PKU, YIA, 1354);
        bandara.addEdge(PKU, SUB, 1523);
        // -----------------------------------------------------------------
        // PADANG - 4
        // BTH, CGK, HLP; KNO udah
        bandara.addEdge(PDG, BTH, 465);
        bandara.addEdge(PDG, CGK, 906);
        bandara.addEdge(PDG, HLP, 924);
        // -----------------------------------------------------------------
        // BATAM - 13
        // DJB, PLM, PGK, CGK, YIA, SRG, SUB; KNO, DTB, PKU, PDG, PNK, BPN udah
        bandara.addEdge(BTH, DJB, 304);
        bandara.addEdge(BTH, PLM, 463);
        bandara.addEdge(BTH, PGK, 427);
        bandara.addEdge(BTH, CGK, 867);
        bandara.addEdge(BTH, YIA, 1214);
        bandara.addEdge(BTH, SRG, 1146);
        bandara.addEdge(BTH, SUB, 1341);
        // -----------------------------------------------------------------
        // TANJUNG PINANG - 1
        // CGK
        bandara.addEdge(TNJ, CGK, 832);
        // -----------------------------------------------------------------
        // MUARA BUNGO - 1
        // CGK
        bandara.addEdge(BUU, CGK, 728);
        // -----------------------------------------------------------------
        // JAMBI - 2
        // CGK; BTH udah
        bandara.addEdge(DJB, CGK, 621);
        // -----------------------------------------------------------------
        // BENGKULU - 1
        // CGK
        bandara.addEdge(BKS, CGK, 571);
        // -----------------------------------------------------------------
        // LUBUKLINGGAU - 1
        // CGK
        bandara.addEdge(LLJ, CGK, 543);
        // -----------------------------------------------------------------
        // PALEMBANG - 7
        // PGK, CGK, HLP, YIA, SUB; KNO, BTH udah
        bandara.addEdge(PLM, PGK, 257);
        bandara.addEdge(PLM, CGK, 407);
        bandara.addEdge(PLM, HLP, 422);
        bandara.addEdge(PLM, YIA, 819);
        bandara.addEdge(PLM, SUB, 1002);
        // -----------------------------------------------------------------
        // LAMPUNG - 2
        // CGK, YIA
        bandara.addEdge(TKG, CGK, 191);
        bandara.addEdge(TKG, YIA, 621);
        // -----------------------------------------------------------------
        // PANGKAL PINANG - 4
        // TJQ, CGK; BTH, PLM udah
        bandara.addEdge(PGK, TJQ, 188);
        bandara.addEdge(PGK, CGK, 458);
        // -----------------------------------------------------------------
        // TANJUNG PANDAN - 2
        // CGK; PGK udah
        bandara.addEdge(TJQ, CGK, 394);
        // -----------------------------------------------------------------

        // -----------------------------------------------------------------
        



    }
}
