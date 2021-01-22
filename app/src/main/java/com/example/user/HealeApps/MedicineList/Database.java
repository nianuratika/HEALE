package com.example.user.HealeApps.MedicineList;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.user.HealeApps.R;

public class Database extends SQLiteOpenHelper {
    final static String DB_NAME = "db_hut";

    public Database(Context context) {
        super(context, DB_NAME, null, 3);
// TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS meg(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, penyebab TEXT, gejala TEXT, description TEXT, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("_id", "1");
        values.put("nama", "Simvastatin");
        values.put("penyebab", "Menurunkan kadar kolesterol dalam darah, serta mengurangi risiko serangan jantung dan stroke.");
        values.put("gejala", "Dosis penggunaan simvastatin tergantung pada kadar kolesterol, kondisi kesehatan, serta seberapa tinggi risiko pasien untuk terkena serangan jantung dan stroke. Dosis simvastatin yang biasanya diberikan oleh dokter untuk kolesterol tinggi adalah 10-40 mg, satu kali sehari.");
        values.put("description", "Ada dua jenis kolesterol, yaitu HDL (sering disebut lemak baik) dan LDL (lemak jahat). LDL sering dianggap sebagai lemak jahat karena mudah menempel di dinding pembuluh darah dan menyebabkan penyumbatan pada pembuluh darah (aterosklerosis). Akibatnya, berisiko menimbulkan stroke dan serangan jantung.\n" +
                "\n" +
                "Simvastatin bekerja dengan cara menghambat enzim pembentuk kolesterol jahat, sehingga kadar kolesterol dalam darah berkurang.");
        values.put("img", R.drawable.simvastatin);
        db.insert("meg", "_id", values);

        values.put("_id", "2");
        values.put("nama", "Nellco Special");
        values.put("penyebab", "meringankan gejala-gejala flu seperti demam, sakit kepala, hidung tersumbat dan bersin-bersin yang disertai batuk.");
        values.put("gejala", "Dosis Dewasa : 3 x sehari 3 sendok takar. \n" +
                "Anak-anak : 6-12 tahun: 3 x sehari setengah sendok takar.");
        values.put("description", "OBH NELLCO SPECIAL mengandung zat aktif Glycyrrhiza succus, Ephedrine HCl, Chlorpeniramine maleat, Ammonium chloride dan Paracetamol. Obat ini digunakan untuk mengatasi gejala flu seperti demam, sakit kepala, hidung tersumbat, bersin-bersin yang disertai batuk.\n" +
                "\n" +
                "Komposisi : \n" +
                "Tiap sendok takar ( 5 ml ) mengandung : glycyrrhizae succus 100mg, ammonium chloride 40mg, ephedrine HCI 2,5mg, paracetamol 135mg, chlorpheniramine maleate 1,3mg.\n" +
                "\n" +
                "Kategori : \n " +
                "Batuk dan Flu.\n" +
                "\n" +
                "Kemasan : \n " +
                "Dus, 1 Botol @ 100 ml.\n" +
                "\n" +
                "Hati hati penggunaan pada penderita tekanan darah tinggi atau stroke, seperti pada penderita dengan berat badan berlebih, atau penderita usia lanjut. Hentikan penggunaan obat ini, jika terjadi susah tidur, jantung berdebar dan pusing.");
        values.put("img", R.drawable.nellcospecial);
        db.insert("meg", "_id", values);

        values.put("_id", "3");
        values.put("nama", "Panadol");
        values.put("penyebab", "meredakan gejala dan keluhan, seperti demam, flu, sakit kepala, hidung tersumbat, batuk tidak berdahak, dan bersin-bersin.  Panadol juga sering digunakan untuk meredakan sakit gigi dan nyeri otot.");
        values.put("gejala", "Panadol Extra\n" +
                "Bentuk obat: tablet\n" +
                "Dosis dewasa & anak ≥12 tahun: 1 tablet, 3–4 kali sehari, maksimal 8 tablet per hari\n" +
                "\n" +
                "Panadol Regular\n" +
                "Bentuk obat: tablet\n" +
                "Dosis dewasa & anak ≥12 tahun: 1–2 tablet, 3–4 kali sehari, maksimal 8 tablet per hari\n" +
                "\n" +
                "Panadol Cold & Flu dan Panadol Flu & Batuk\n" +
                "Dosis dewasa & anak ≥12 tahun: 1 tablet tiap 4–6 jam, maksimal 8 tablet per hari\n" +
                "\n" +
                "Penting diingat, jangan berikan semua varian Panadol di atas kepada anak-anak berusia di bawah 12 tahun, kecuali atas petunjuk dokter.\n" +
                "Sedangkan dosis Panadol untuk anak-anak adalah sebagai berikut:\n" +
                "\n" +
                "Panadol Anak Drops\n" +
                "Bentuk obat: sirop\n" +
                "Dosis: 0,8–1,6 ml (sesuai usia), 3–6 kali sehari\n" +
                "\n" +
                "Panadol Anak Syrup\n" +
                "Bentuk obat sirop\n" +
                "Usia 1–2 tahun: 3,75 ml, usia 2–3 tahun: 5 ml, usia 4–5 tahun: 7,5 ml, usia 6 tahun: 10 ml, 3–4 kali sehari\n" +
                "Dosis maksimal 4 kali sehari\n" +
                "\n" +
                "Panadol Anak Suspension\n" +
                "Bentuk obat: suspensi\n" +
                "Usia 6–12 tahun: 1 sendok takar (5 ml), 3–4 kali sehari\n" +
                "Usia >12 tahun: 2 sendok takar (10 ml) 3–4 kali sehari\n" +
                "\n" +
                "Panadol Anak Chewable\n" +
                "Bentuk obat: tablet kunyah\n" +
                "Usia 2–5 tahun: 1–2 tablet, 3–4 kali sehari\n" +
                "Usia 6–12 tahun: 2–4 tablet, 3–4 kali sehari");
        values.put("description", "Panadol Reguler (warna biru-putih)\n" +
                "Panadol biru bermanfaat untuk meredakan nyeri, seperti sakit kepala, sakit gigi, dan nyeri otot, serta menurunkan demam. Tiap tablet Panadol Reguler mengandung 500 mg paracetamol.\n" +
                "\n" +
                "Panadol Cold & Flu (warna hijau-putih)\n" +
                "Panadol hijau bermanfaat untuk meredakan hidung tersumbat, batuk tidak berdahak, serta demam yang disebabkan oleh flu. Tiap tablet Panadol Cold & Flu mengandung 500 mg paracetamol, 30 mg pseudoephedrine HCl, dan 15 mg dextrometorphan HBr.\n" +
                "\n" +
                "Panadol Flu & Batuk (warna hijau-merah)\n" +
                "Panadol Flu & Batuk bermanfaat untuk meredakan bersin-bersin, hidung tersumbat, demam, sakit kepala, batuk tidak berdahak, nyeri otot, dan nyeri tenggorokan akibat flu. Tiap tablet Panadol Flu & Batuk mengandung 500 mg paracetamol, 5 mg phenylephrine HCl, dan 15 mg dextrometorphan.\n" +
                "\n" +
                "Panadol Extra (warna merah-putih)\n" +
                "Panadol merah bermanfaat untuk meredakan sakit kepala dan sakit gigi. Tiap tablet Panadol Extra mengandung 500 mg paracetamol dan 65 mg kafein.\n" +
                "\n" +
                "Selain keempat varian di atas, ada pula varian Panadol yang khusus ditujukan untuk anak-anak. Varian ini bermanfaat untuk meredakan sakit kepala, nyeri akibat tumbuh gigi, serta demam akibat pilek, flu, atau setelah imunisasi. Beberapa varian tersebut adalah:\n" +
                "\n" +
                "Panadol Anak Drops\n" +
                "Panadol Anak Drops untuk anak-anak usia 0–1 tahun tersedia dalam bentuk sirop yang dilengkapi dengan pipet tetes. Tiap 1 ml Panadol Anak Drops mengandung 100 mg paracetamol.\n" +
                "\n" +
                "Panadol Anak Syrup\n" +
                "Panadol Anak Syrup ditujukan untuk anak usia 1–6 tahun. Tiap 1 ml Panadol Anak Syrup mengandung 32 mg paracetamol.\n" +
                "\n" +
                "Panadol Anak Suspension\n" +
                "Panadol Anak Suspension ditujukan untuk anak usia 6 tahun ke atas. Setiap 1 ml Panadol Anak Suspension mengandung 50 mg paracetamol.\n" +
                "\n" +
                "Panadol Anak Chewable\n" +
                "Panadol Anak Chewable untuk anak usia 2–12 tahun tersedia dalam bentuk tablet kunyah. Tiap tablet Panadol Anak Chewable mengandung 120 mg paracetamol.");
        values.put("img", R.drawable.panadol);
        db.insert("meg", "_id", values);

        values.put("_id", "4");
        values.put("nama", "Paracetamol");
        values.put("penyebab", "penurun demam dan pereda nyeri, seperti nyeri haid dan sakit gigi. Paracetamol tersedia dalam bentuk tablet 500 mg dan 600 mg, sirup, drop, suppositoria, dan infus.");
        values.put("gejala", "Dosis paracetamol disesuaikan dengan usia dan kondisi penderita. Berikut adalah penjelasan paracetamol dalam bentuk obat minum dan suppositoria untuk meredakan demam dan nyeri:\n" +
                "\n" +
                "Dewasa\n" +
                "325–650 mg tiap 4–6 jam atau 1.000 mg tiap 6–8 jam. Paracetamol biasanya tersedia dalam bentuk tablet dengan kandungan 500 mg. Paracetamol 500 mg dapat diminum tiap 4–6 jam sekali untuk meredakan demam.\n" +
                "\n" +
                "Anak < 2 bulan\n" +
                "10–15 mg/kgBB, tiap 6–8 jam sekali atau sesuai dengan anjuran dokter.\n" +
                "\n" +
                "Anak 2 bulan–12 tahun\n" +
                "10–15 mg/kgBB, tiap 4–6 jam sekali atau sesuai anjuran dokter. Dosis maksimal 5 kali pemberian dalam 24 jam.\n" +
                "\n" +
                "Anak > 12 tahun\n" +
                "325–650 mg per 4–6 jam atau 1.000 mg tiap 6–8 jam.\n" +
                "\n" +
                "Khusus untuk paracetamol infus, dosis dan pemberiannya akan dilakukan langsung oleh dokter atau oleh petugas medis di bawah pengawasan dokter sesuai kondisi pasien.");
        values.put("description", "Paracetamol bekerja dengan cara mengurangi produksi zat penyebab peradangan, yaitu prostaglandin. Dengan penurunan kadar prostaglandin di dalam tubuh, tanda peradangan seperti demam dan nyeri akan berkurang.\n" +
                "\n" +
                "Merk dagang paracetamol: \n" +
                "Panadol, Naprex, Paramol, Mixagrip Flu, Hufagesic, Paramex SK, Sanmol, Sumagesic, Tempra, Termorex, dan Poro.\n" +
                "\n" +
                "Bentuk obat : \n" +
                "Tablet, kaplet, sirup, drop, infus, dan suppositoria.\n" +
                "\n" +
                "Peringatan Sebelum Mengonsumsi Paracetamol (Acetaminophen)\n" +
                "Jangan mengonsumsi dan menggunakan paracetamol jika memiliki riwayat alergi dengan obat ini.\n" +
                "Jangan memberikan paracetamol kepada anak berusia di bawah 2 tahun tanpa petunjuk dari dokter.\n" +
                "Konsultasikan dengan dokter sebelum menggunakan paracetamol jika Anda menderita gangguan hati atau ginjal.\n" +
                "Jangan mengonsumsi alkohol bersama dengan parasetamol karena dapat meningkatkan risiko kerusakan hati.\n" +
                "Beri tahu dokter jika Anda sedang mengonsumsi obat, seperti obat untuk epilepsi, tuberkulosis (TBC), obat pengencer darah, suplemen, atau obat herbal.\n" +
                "Segera ke rumah sakit jika demam tidak mereda, serta ketika muncul kemerahan pada kulit.\n" +
                "Segera ke dokter jika terjadi reaksi alergi obat atau overdosis.");
        values.put("img", R.drawable.paracetamol);
        db.insert("meg", "_id", values);

        values.put("_id", "5");
        values.put("nama", "Tera F");
        values.put("penyebab", "Meringankan gejala influenza, seperti:\n" +
                "Demam.\n" +
                "Bersin disertai batuk.\n" +
                "Sakit kepala.\n" +
                "Hidung tersumbat.\n");
        values.put("gejala", "Penggunaan obat harus sesuai petunjuk pada kemasan dan anjuran dokter\n" +
                "Dewasa dan anak-anak berusia 12 tahun ke atas: 1 kaplet sebanyak 3-4 kali/hari.\n" +
                "Anak-anak berusia 6-12 tahun: ½ kaplet sebanyak 3-4 kali/hari.");
        values.put("description", "Ada dua jenis kolesterol, yaitu HDL (sering disebut lemak baik) dan LDL (lemak jahat). LDL sering dianggap sebagai lemak jahat karena mudah menempel di dinding pembuluh darah dan menyebabkan penyumbatan pada pembuluh darah (aterosklerosis). Akibatnya, berisiko menimbulkan stroke dan serangan jantung.\n" +
                "\n" +
                "Komposisi obat\n" +
                "Paracetamol 650 mg.\n" +
                "Guaiphenesin 50 mg.\n" +
                "Phenylpropanolamine hydrochloride 15 mg.\n" +
                "Chlorpheniramine maleate 2 mg.");
        values.put("img", R.drawable.teraf);
        db.insert("meg", "_id", values);

        values.put("_id", "6");
        values.put("nama", "Sangobion");
        values.put("penyebab", "mengatasi kurang darah atau anemia. Sebagai suplemen penambah darah, Sangobion berisi zat besi yang dapat mencegah dan mengatasi anemia defisiensi besi.");
        values.put("gejala", "Dosis Sangobion sebagai suplemen penambah darah adalah sebagai berikut:\n" +
                "\n" +
                "Sangobion Kapsul\n" +
                "Dewasa: 1 kapsul, sekali sehari.\n" +
                "\n" +
                "Sangobion Vita-Tonik\n" +
                "Dewasa: 30 ml, sekali sehari.\n" +
                "\n" +
                "Sangobion Fizz\n" +
                "Dewasa: 1 tablet, sekali sehari.\n" +
                "\n" +
                "Sangobion Baby\n" +
                "Anak usia di bawah 6 bulan: dosis berdasarkan rekemondasi dokter.\n" +
                "Anak usia 6-12 bulan: 1 ml, sekali sehari.\n" +
                "Anak usia di atas 1 tahun: 1,2 ml, sekali sehari.\n" +
                "\n" +
                "Sangobion Kids\n" +
                "Anak usia di atas 2 tahun: 5 ml, sekali sehari.");
        values.put("description", "Sangobion terdiri dari berbagai macam varian produk, baik untuk orang dewasa maupun untuk anak-anak. Selain zat besi, masing-masing produk Sangobion juga mengandung bahan vitamin dan mineral lainnya, misalnya manganese sulfate, copper sulfate, vitamin C, asam folat, dan vitamin B12.\n" +
                "\n" +
                "Berikut ini merupakan varian produk Sangobion, yang merupakan suplemen zat besi:\n" +
                "\n" +
                "Sangobion Kapsul\n" +
                "Tiap kapsul Sangobion Kapsul mengandung zat besi jenis ferrous gluconate 250 mg (setara dengan 30 mg elemen zat besi).\n" +
                "\n" +
                "Sangobion Vita-Tonik\n" +
                "Sangobion Vita-Tonik berbentuk sirup dengan rasa buah cranberry. Tiap 15 ml Sangobion Vita-Tonik mengandung zat besi jenis ferrazone 113 mg (setara dengan 15 mg elemen zat besi).\n" +
                "\n" +
                "Sangobion Fizz\n" +
                "Sangobion Fizz merupakan produk Sangobion dengan bentuk effervescent dan rasa buah cranberry. Tiap tablet Sangobion Fizz mengandung zat besi jenis ferrazone 215 mg (yang setara dengan 28 mg elemen zat besi).\n" +
                "\n" +
                "Sangobion Baby\n" +
                "Sangobion Baby berbentuk sirup dan diberikan dengan cara diteteskan. Produk ini ditujukan untuk anak berusia 0-2 tahun. Tiap ml Sangobion Baby mengandung 23,53 mg zat besi jenis iron polymaltose complex (setara dengan 8 mg elemen zat besi).\n" +
                "\n" +
                "Sangobion Kids\n" +
                "Sangobion Kids juga berbentuk sirup, yang ditujukan untuk anak-anak berusia di atas 2 tahun. Tiap 5 ml Sangobion Kids mengandung 113 ferrazone (setara dengan 15 mg elemen zat besi).\n" +
                "\n" +
                "Selain 5 produk Sangobion di atas, Sangobion juga memiliki 2 produk herbal yang tidak mengandung zat besi. Dua produk tersebut adalah Sangobion Menstrupain yang digunakan untuk meredakan nyeri haid, dan Sangibion Fit yang digunakan untuk mempertahankan stamina.");
        values.put("img", R.drawable.sangobion);
        db.insert("meg", "_id", values);

        values.put("_id", "7");
        values.put("nama", "Bodrex Migra");
        values.put("penyebab", "mengatasi sakit kepala sebelah (migrain) yang berdenyut. ");
        values.put("gejala", "Penggunaan obat harus sesuai petunjuk pada kemasan dan anjuran dokter\n" +
                "Dewasa:  3x1 kaplet/hari");
        values.put("description", "Bodrex Migra adalah obat yang mengandung paracetamol, caffeine dan propyphenazone yang berfungsi untuk meringankan sakit kepala pada migrain dan dapat digunakan untuk menurunkan demam. Efek samping penggunaan Bodrex Migra adalah rasa kantuk dan mual.\n" +
                "\n" +
                "Komposisi obat\n" +
                "Paracetamol 350 mg, caffeine 50 mg, propyphenazone 150 mg");
        values.put("img", R.drawable.bodrexmigra);
        db.insert("meg", "_id", values);

        values.put("_id", "8");
        values.put("nama", "Isprinol");
        values.put("penyebab", "INFORMASI OBAT INI HANYA UNTUK KALANGAN MEDIS. Penyakit yang disebabkan oleh virus pada saluran nafas, penyakit-penyakit eksantem, penyakit hati, dan beberapa penyakit sistem saraf\n");
        values.put("gejala", "PENGGUNAAN OBAT INI HARUS SESUAI DENGAN PETUNJUK DOKTER.    \"\\n\" +" +
                "Dewasa dan anak: 50 mg/kg bb/hr dalam 3-4 dosis terbagi. Dapat ditingkatkan sampai dengan 100 mg/kg bb/hr dalam 4- 6 dosis terbagi. Pengobatan dilanjutkan 1-2 hari sesudah gejala penyakit mereda.\n");
        values.put("description", "ISPRINOL SIRUP adalah obat yang mengandung methisoprinol yang di gunakan untuk meningkatkan daya tahan tubuh dan menyembuhkan penyakit-penyakit akibat infeksi yang di sebabkan oleh virus atau penyakit yang menyebabkan lemahnya sistem kekebalan tubuh seperti kanker. Obat ini di gunakan untuk mempercepat penyembuhan cacar air, gondongan, herpes, kutil kelamin, hepatitis B, influenza pada orang dewasa dan anak, bronkhitis, rinofaringitis, campak. Dalam penggunaan obat ini HARUS SESUAI DENGAN PETUNJUK DOKTER.\n" +
                "\n" +
                "Kategori\n" +
                "Anti Virus\n" +
                "\n" +
                "Komposisi\n" +
                "Per 5 mL : Methisoprinol 250 mg.");
        values.put("img", R.drawable.isprinol);
        db.insert("meg", "_id", values);

        values.put("_id", "9");
        values.put("nama", "Promag");
        values.put("penyebab", "mengatasi sakit maag, penyakit asam lambung naik, dan perut kembung. Obat ini dijual secara bebas. Promag tersedia dalam bentuk tablet kunyah dan suspensi cair dengan kandungan bahan aktif yang bervariasi di tiap jenisnya.");
        values.put("gejala", "Dosis Promag dapat berbeda-beda, tergantung usia pasien atau jenis produknya. Berikut ini adalah dosis penggunaan Promag secara umum:\n" +
                "\n" +
                "Promag Tablet dan Promag Fruity\n" +
                "Dewasa: 1–2 tablet kunyah, 3–4 kali sehari.\n" +
                "Anak-anak 6–12 tahun: ½–1 tablet kunyah, 3–4 kali sehari.\n" +
                "\n" +
                "Promag Cair\n" +
                "Dewasa: 1–2 sachet, 3–4 kali sehari.\n" +
                "Anak-anak 6–12 tahun: ½–1 sachet, 3–4 kali sehari\n" +
                "\n" +
                "Promag Double Action\n" +
                "Dewasa dan anak >12 tahun: 1 tablet kunyah, 2 kali sehari. Konsumsi maksimal adalah 2 tablet per hari.\n" +
                "\n" +
                "Promag Gazero Herbal\n" +
                "Dewasa: 1 sachet, 3 kali sehari");
        values.put("description", "Ada 5 produk Promag yang tersedia di Indonesia, yaitu:\n" +
                "\n" +
                "1. Promag Tablet\n" +
                "Tiap 1 dus Promag Tablet berisi 3 blister, 1 blister berisi 12 tablet kunyah. Dalam 1 tablet, terkandung 200 mg hydrotalcite, 150 mg magnesium hidroksida, dan 50 mg simethicone.          \n" +
                "\n" +
                "2. Promag Cair\n" +
                "Tiap 1 dus Promag Cair berisi 3 sachet, 1 sachet berisi 7 ml. Dalam 1 sachet, terkandung 200 mg hydrotalcite, 150 mg magnesium hydroxide, dan 50 mg simethicone.\n" +
                "\n" +
                "3. Promag Fruity\n" +
                "Tiap 1 strip Promag Fruity berisi 4 tablet kunyah rasa anggur. Dalam 1 tablet, terkandung 200 mg hydrotalcite, 150 mg magnesium hydroxide, dan 50 mg simethicone.\n" +
                "\n" +
                "4. Promag Double Action\n" +
                "Tiap 1 dus Promag Double Action berisi 12 blister, 1 blister berisi 6 tablet kunyah. Dalam 1 tablet, terkandung 165 mg magnesium hidroksida, 800 mg kalsium karbonat, dan 10 mg famotidine.\n" +
                "\n" +
                "5. Promag Gazero Herbal\n" +
                "Tiap 1 dus promag Gazero Herbal berisi 6 sachet, 1 sachet berisi 10 ml. Dalam 1 sachet, terkandung:\n" +
                "Jahe merah (zingiber officinale rosch rhizome) 50 mg\n" +
                "Adas (foeniculi fructus) 10 mg\n" +
                "Peppermint (menthae piperitae herba) 12,5 mg\n" +
                "Akar manis (licorice root) 300 mg\n" +
                "Kunyit (curcuma domesticae) 50 mg\n" +
                "Akar nanas (ananas comosus stem) 50 mg\n" +
                "Royal jelly 10 mg\n" +
                "Madu 1 g.");
        values.put("img", R.drawable.promag);
        db.insert("meg", "_id", values);

        values.put("_id", "10");
        values.put("nama", "Dextamine");
        values.put("penyebab", "Mengatasi Alergi");
        values.put("gejala", "Dosis PENGGUNAAN OBAT INI HARUS SESUAI DENGAN PETUNJUK DOKTER.\n" +
                "Dewasa : 1 tablet, 3 kali per hari. \n" +
                "Anak : 0.5 tablet, 3 kali per hari.");
        values.put("description", "DEXTAMINE merupakan obat dengan kandungan Dextamethasone (glukokortikoid) dan Dexchlorpheniramine Maleate. Obat ini bekerja sebagai antiinflamasi, antirematik, serta antialergi/antihistamin. Dalam penggunaan obat ini harus SESUAI DENGAN PETUNJUK DOKTER.\n" +
                "\n" +
                "Kategori : \n" +
                "Alergi\n" +
                "\n" +
                "Aturan Pakai : \n" +
                "Sesudah makan\n" +
                "\n" +
                "Kemasan : \n" +
                "Dus, 30 Blister @ 10 kaplet\n" +
                "\n" +
                "Kontra Indikasi : \n" +
                "hipersensitif\n" +
                "\n" +
                "Perhatian\n" +
                "HARUS DENGAN RESEP DOKTER. Hati-hati pada penderita gagal jantung kongestif, hipertensi, diabetes melitus, infeksi, gagal ginjal kronik, uremia, stres, usia lanjut, glaukoma sudut sempit, hipertrofi prostat. Jangan mengemudi kendaraan atau menjalankan mesin. Wanita hamil.");
        values.put("img", R.drawable.dextamine);
        db.insert("meg", "_id", values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS meg");
        onCreate(db);

    }

}
