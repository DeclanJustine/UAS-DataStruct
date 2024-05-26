import geopandas as gpd
import matplotlib.pyplot as plt
import networkx as nx
from shapely.geometry import Point

# Definisi bandara di Kalimantan, Sumatera, dan Jawa dengan koordinat lat-long
bandara_data = {
    # Kalimantan
    "BPN": {"name": "Bandar Udara Internasional Sultan Aji Muhammad Sulaiman Sepinggan (BPN) - Balikpapan", "coords": (116.893, -1.267)},
    "BEJ": {"name": "Bandar Udara Kalimarau (BEJ) - Berau", "coords": (117.432, 2.155)},
    "AAP": {"name": "Bandar Udara Aji Pangeran Tumenggung Pranoto (AAP) - Samarinda", "coords": (117.156, -0.484)},
    "TRK": {"name": "Bandar Udara Internasional Juwata Tarakan (TRK) - Tarakan", "coords": (117.569, 3.326)},
    "SMQ": {"name": "Bandar Udara H. Asan Sampit (SMQ) - Sampit", "coords": (112.956, -2.499)},
    "PKN": {"name": "Bandar Udara Iskandar (PKN) - Pangkalanbun", "coords": (111.673, -2.704)},
    "BDJ": {"name": "Bandar Udara Internasional Syamsudinnoor (BDJ) - Banjarmasin", "coords": (114.763, -3.442)},
    "PKY": {"name": "Bandar Udara Tjilik Riwut (PKY) - Palangkaraya", "coords": (113.944, -2.225)},
    "PNK": {"name": "Bandar Udara Internasional Supadio (PNK) - Pontianak", "coords": (109.404, -0.150)},
    "LNU": {"name": "Bandar Udara Robert Atty Bessing (LNU) - Malinau", "coords": (116.010, 3.569)},
    "TJS": {"name": "Bandar Udara Tanjung Harapan (TJS) - Tanjung Selor", "coords": (117.451, 2.835)},
    "GHS": {"name": "Bandar Udara Melalan Kutai Barat (GHS) - Melak", "coords": (115.978, 0.054)},
    "HMS": {"name": "Bandar Udara Haji Muhammad Sidik (HMS) - Muara Teweh", "coords": (114.894, -0.946)},
    "PSU": {"name": "Bandar Udara Pangsuma (PSU) - Putussibau", "coords": (112.935, 0.835)},
    "SQG": {"name": "Bandar Udara Tebelian (SQG) - Sintang", "coords": (111.985, 0.064)},
    "KTG": {"name": "Bandar Udara Rahadi Usman (KTG) - Ketapang", "coords": (110.419, -1.816)},
    "BTW": {"name": "Bandar Udara Batu Licin (BTW) - Batulicin", "coords": (116.003, -3.413)},
    "KBU": {"name": "Bandar Udara Gusti Sjamsir Alam (KBU) - Kotabaru", "coords": (116.299, -3.293)},
    # Sumatera
    "KNO": {"name": "Bandar Udara Internasional Kualanamu (KNO) - Medan", "coords": (98.879, 3.642)},
    "PDG": {"name": "Bandar Udara Internasional Minangkabau (PDG) - Padang", "coords": (100.280, -0.787)},
    "PKU": {"name": "Bandar Udara Sultan Syarif Kasim II (PKU) - Pekanbaru", "coords": (101.448, 0.462)},
    "BTH": {"name": "Bandar Udara Internasional Hang Nadim (BTH) - Batam", "coords": (104.118, 1.121)},
    "PLM": {"name": "Bandar Udara Sultan Mahmud Badaruddin II (PLM) - Palembang", "coords": (104.707, -2.900)},
    # Jawa
    "CGK": {"name": "Bandar Udara Internasional Soekarno-Hatta (CGK) - Jakarta", "coords": (106.656, -6.125)},
    "HLP": {"name": "Bandar Udara Halim Perdanakusuma (HLP) - Jakarta", "coords": (106.892, -6.267)},
    "SUB": {"name": "Bandar Udara Internasional Juanda (SUB) - Surabaya", "coords": (112.789, -7.379)},
    "JOG": {"name": "Bandar Udara Internasional Adisutjipto (JOG) - Yogyakarta", "coords": (110.434, -7.788)},
    "YIA": {"name": "Bandar Udara Internasional Yogyakarta (YIA) - Kulon Progo", "coords": (110.049, -7.902)},
    "SRG": {"name": "Bandar Udara Internasional Ahmad Yani (SRG) - Semarang", "coords": (110.375, -6.971)},
    "SOC": {"name": "Bandar Udara Internasional Adi Soemarmo (SOC) - Solo", "coords": (110.757, -7.516)},
}

# Membuat GeoDataFrame untuk bandara
gdf_bandara = gpd.GeoDataFrame(
    [(code, data['name'], Point(data['coords'])) for code, data in bandara_data.items()],
    columns=["Code", "Name", "geometry"]
)

# Definisi graf dan menambahkan node untuk setiap bandara
G = nx.Graph()
for code, data in bandara_data.items():
    G.add_node(code, pos=data['coords'], label=data['name'])

# Tambahkan edge sesuai dengan koneksi bandara di Kalimantan, Sumatera, dan Jawa
edges = [
    # Kalimantan
    ("BPN", "BDJ", 342), ("BPN", "BEJ", 370), ("BPN", "TRK", 512), ("BPN", "PKY", 344), ("BPN", "PNK", 846),
    ("BPN", "GHS", 160), ("BPN", "LNU", 537), ("BPN", "TJS", 460), ("BPN", "SRG", 958), ("BPN", "YIA", 1025),
    ("BPN", "SOC", 970), ("BPN", "SUB", 809), ("BPN", "BTH", 1451), ("BPN", "KNO", 2091),     ("BPN", "CGK", 1254), ("BPN", "HLP", 1241),
    ("BEJ", "AAP", 284), ("BEJ", "SUB", 1154), ("BEJ", "CGK", 1485),
    ("AAP", "GHS", 151), ("AAP", "CGK", 1309), ("AAP", "SUB", 895), ("AAP", "YIA", 1106),
    ("TRK", "LNU", 107), ("TRK", "CGK", 1595), ("TRK", "SUB", 1293),
    ("SMQ", "CGK", 785), ("SMQ", "SUB", 525),
    ("PKN", "CGK", 337), ("PKN", "SRG", 492), ("PKN", "SUB", 522),
    ("BDJ", "HMS", 265), ("BDJ", "CGK", 917), ("BDJ", "SRG", 615), ("BDJ", "YIA", 683),
    ("BDJ", "SUB", 483), ("BDJ", "BTW", 156), ("BDJ", "KBU", 174),
    ("PKY", "CGK", 901), ("PKY", "SUB", 576),
    ("PNK", "BTH", 603), ("PNK", "CGK", 739), ("PNK", "YIA", 872), ("PNK", "SOC", 856),
    ("PNK", "SUB", 889), ("PNK", "KTG", 216), ("PNK", "SQG", 239), ("PNK", "PSU", 411),
    ("KTG", "SRG", 570),
    # Sumatera
    ("KNO", "BTJ", 431), ("KNO", "LSW", 245), ("KNO", "MEQ", 289), ("KNO", "LKI", 285),
    ("KNO", "GNS", 303), ("KNO", "FLZ", 207), ("KNO", "PDG", 536), ("KNO", "PKU", 458),
    ("KNO", "BTH", 656), ("KNO", "PLM", 996), ("KNO", "CGK", 1398), ("KNO", "HLP", 1414),
    ("KNO", "YIA", 1814), ("KNO", "SUB", 1972),
    ("BTJ", "CGK", 1825),
    ("DTB", "CGK", 1260), ("DTB", "BTH", 577), ("DTB", "HLP", 1277),
    ("PKU", "BTH", 293), ("PKU", "CGK", 937), ("PKU", "HLP", 953),
    ("PDG", "BTH", 465), ("PDG", "CGK", 906), ("PDG", "HLP", 924),
    ("BTH", "DJB", 304), ("BTH", "PLM", 463), ("BTH", "PGK", 427), ("BTH", "CGK", 867),
    ("BTH", "YIA", 1214), ("BTH", "SRG", 1146), ("BTH", "SUB", 1341),
    ("TNJ", "CGK", 832),
    ("BUU", "CGK", 728),
    ("DJB", "CGK", 621),
    ("BKS", "CGK", 571),
    ("LLJ", "CGK", 543),
    ("PLM", "PGK", 257), ("PLM", "CGK", 407), ("PLM", "HLP", 422), ("PLM", "YIA", 819), ("PLM", "SUB", 1002),
    ("TKG", "CGK", 191), ("TKG", "YIA", 621),
    ("PGK", "TJQ", 188), ("PGK", "CGK", 458),
    ("TJQ", "CGK", 394),
    # Jawa
    ("CGK", "BWX", 315), ("CGK", "MLG", 673), ("CGK", "HLP", 31), ("CGK", "DHX", 89),
    ("CGK", "SOC", 418), ("CGK", "SRG", 368), ("CGK", "YIA", 413), ("CGK", "JOG", 404),
    ("CGK", "CJN", 218), ("CGK", "BDO", 132), ("CGK", "SUB", 694), ("CGK", "TNJ", 832),
    ("HLP", "CGK", 31),
    ("SUB", "BWX", 338), ("SUB", "MLG", 244), ("SUB", "DHX", 243), ("SUB", "SOC", 188),
    ("SUB", "SRG", 239), ("SUB", "YIA", 445), ("SUB", "JOG", 321), ("SUB", "CJN", 404),
    ("SUB", "BDO", 212), ("SUB", "TKG", 191), ("SUB", "PGK", 496), ("SUB", "PLM", 1002),
    ("JOG", "SOC", 48), ("JOG", "SRG", 80), ("JOG", "YIA", 29), ("JOG", "CGK", 404),
    ("YIA", "SOC", 61), ("YIA", "SRG", 72), ("YIA", "CGK", 413), ("YIA", "JOG", 29),
    ("SRG", "SOC", 86), ("SRG", "CGK", 368), ("SRG", "YIA", 72), ("SRG", "JOG", 80),
    ("SOC", "YIA", 89), ("SOC", "CGK", 418), ("SOC", "SRG", 86),
    # Tambahan rute dalam Pulau Jawa
    ("CGK", "SRG", 368), ("SRG", "YIA", 72), ("YIA", "SOC", 89),
    # Rute internal
    ("SOC", "JOG", 48), ("JOG", "SUB", 321), ("CGK", "HLP", 31)
]

# Tambahkan edge ke graf
for edge in edges:
    G.add_edge(edge[0], edge[1], weight=edge[2])

# Menggambar graf
pos = nx.spring_layout(G, seed=42)  # Menetapkan posisi node
labels = nx.get_edge_attributes(G, 'weight')  # Mendapatkan label untuk bobot edge
nx.draw(G, pos, with_labels=True, node_size=1000, node_color='skyblue', font_size=8, font_weight='bold')
nx.draw_networkx_edge_labels(G, pos, edge_labels=labels)
plt.title("Graf Rute Penerbangan Indonesia")
plt.show()


