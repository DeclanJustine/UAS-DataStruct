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
        Vertex BPN = new Vertex("Bandar Udara Internasional Sultan Aji Muhammad Sulaiman Sepinggan(BPN) - Balikpapan");
        Vertex BEJ = new Vertex("Bandar Udara Kalimarau(BEJ) - Berau");
        Vertex AAP = new Vertex("Bandar Udara Aji Pangeran Tumenggung Pranoto(AAP) - Samarinda");
        Vertex TRK = new Vertex("Bandara Internasional Juwata Tarakan(TRK) - Tarakan");
        Vertex SMQ = new Vertex("Bandar Udara H. Asan Sampit(SMQ) - Sampit");
        Vertex PKN = new Vertex("Bandar Udara Iskandar(PKN) - Pangkalanbun");
        Vertex BWX = new Vertex("Bandar Udara Internasional Banyuwangi(BWX) - Banyuwangi");
        Vertex LLJ = new Vertex("Bandar Udara Silampari(LLJ) - LubukLinggau");
        Vertex TJQ = new Vertex("Bandar Udara Internasional H.A.S. Hanandjoeddin(TJQ) - TanjungPandan");
        Vertex DHX = new Vertex("Bandara Internasional Dhoho Kediri(DHX) - Kediri");
        Vertex DTB = new Vertex("Bandar Udara Internasional Sisingamangaraja XII(DTB) - Tapanuli");
        Vertex BDJ = new Vertex("Bandar Udara Internasional Syamsudinnoor(BDJ) - Banjarmasin");
        Vertex PKY = new Vertex("Bandar Udara Tjilik Riwut(PKY) - Palangkaraya");
        Vertex PNK = new Vertex("Bandar Udara Internasional Supadio(PNK) - Pontianak");
        Vertex CGK = new Vertex("Bandar Udara Internasional Soekarno Hatta(CGK) - Jakarta");
        Vertex MLG = new Vertex("Bandar Udara Abdulrachman Saleh(MLG) - Malang");
        Vertex SRG = new Vertex("Bandar Udara Jenderal Ahmad Yani(SRG) - Semarang");
        Vertex SUB = new Vertex("Bandara Internasional Juanda(SUB) - Surabaya");
        Vertex SOC = new Vertex("Bandar Udara Adi Soemarmo(SOC) - Surakarta");
        Vertex BDO = new Vertex("Bandar Udara Internasional Husein Sastranegara(BDO) - Bandung");
        Vertex YIA = new Vertex("Bandara Internasional Yogyakarta(YIA) - Yogyakarta");
        Vertex BTJ = new Vertex("Bandar Udara Internasional Sultan Iskandar Muda(BTJ) - BandaAceh");
        Vertex TKG = new Vertex("Bandar Udara Internasional Radin Inten II.(TKG) - BandarLampung");
        Vertex BKS = new Vertex("Bandar Udara Fatmawati Soekarno(BKS) - Bengkulu");
        Vertex GNS = new Vertex("Bandar Udara Binaka Gunungsitoli Nias(GNS) - Nias");
        Vertex DJB = new Vertex("Bandara Internasional Sultan Thaha(DJB) - Jambi");
        Vertex KNO = new Vertex("Kualanamu International Airport(KNO) - Medan");
        Vertex PDG = new Vertex("Bandar Udara Internasional Minangkabau(PDG) - Padang");
        Vertex PLM = new Vertex("Bandar Udara Internasional Sultan Mahmud Badaruddin II(PLM) - Palembang");
        Vertex PKU = new Vertex("Bandara Internasional Sultan Syarif Kasim II(PKU) - Pekanbaru");
        Vertex TNJ = new Vertex("Bandara Raja Haji Fisabilillah Tanjung Pinang(TNJ) - TanjungPinang");
        Vertex BTH = new Vertex("Bandar Udara Internasional Hang Nadim(BTH) - Batam");
        Vertex PGK = new Vertex("Bandar Udara Depati Amir(PGK) - PangkalPinang");

        WeightedGraph<Vertex> bandara = new WeightedGraph<Vertex>(false); // Undirected
        // Gak ada ke AAP, SMQ, PKN
        bandara.addEdge(BPN, BDJ, 342); 
        bandara.addEdge(BPN, BEJ, 370);
        bandara.addEdge(BPN, TRK, 512); 
        bandara.addEdge(BPN, PKY, 344);
        bandara.addEdge(BPN, PNK, 846);

        bandara.addEdge(BPN, SRG, 958);
        bandara.addEdge(BPN, YIA, 1025);
        bandara.addEdge(BPN, SOC, 970);
        bandara.addEdge(BPN, SUB, 809);
        bandara.addEdge(BPN, BTH, 1451);
        bandara.addEdge(BPN, KNO, 2091);

        bandara.addEdge(BPN, CGK, 1241);

        // Gak ada ke TRK, SMQ, PKN, PKY, BDJ, PNK; udah ada BPN
        bandara.addEdge(BEJ, AAP, 284);
        bandara.addEdge(BEJ, CGK, 1485);

        // Gak ada ke BPN, TRK, SMQ, PKN, BDJ, PKY, PNK; udah ada BEJ 
        bandara.addEdge(AAP, CGK, 1309); 

        // Gak ada ke BEJ, AAP, SMQ, PKN, PKY, PNK, BDJ; udah ada BPN
        bandara.addEdge(TRK, CGK, 1595);

        // Gak ada ke PKY, PKN, BPN, BEJ, AAP, TRK, BDJ, PNK;
        bandara.addEdge(SMQ, CGK, 785);

        // Gak ada ke BEJ, AAP, TRK, SMQ, BDJ, PKY, PNK; udah ada BPN
        bandara.addEdge(PKN, CGK, 337);

        // Gak ada ke BEJ, AAP, TRK, SMQ, PKN, PKY, PNK ; udah ada BPN
        bandara.addEdge(BDJ, CGK, 917);

        // Gak ada BEJ, AAP, TRK, SMQ, PKN, BDJ, PNK; udah ada BPN
        bandara.addEdge(PKY, CGK, 901);

        // Gak ada BEJ, AAP, TRK, SMQ, PKN, BDJ, PKY ; udah ada BPN
        bandara.addEdge(PNK, CGK, 739);

        // KALIMANTAN KELAR
        // -----------------------------------------------------------------------------------------

    }
}
