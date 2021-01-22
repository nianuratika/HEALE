package com.example.user.HealeApps.disease;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.user.HealeApps.R;

public class Databasepenyakit extends SQLiteOpenHelper {
    final static String DB_NAME = "db_sony";

    public Databasepenyakit(Context context) {
        super(context, DB_NAME, null, 3);
// TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS sam(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, penyebab TEXT, gejala TEXT, description TEXT, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("_id", "1");
        values.put("nama", "Diare");
        values.put("penyebab", "Makanan dan minuman yang terpapar virus, bakteri, atau parasit.");
        values.put("gejala", "Perut terasa mulas.");
        values.put("description","Biasanya diare hanya berlangsung beberapa hari (akut), namun pada sebagian kasus dapat memanjang hingga berminggu-minggu (kronis). Pada umumnya, diare tidak berbahaya jika tidak terjadi dehidrasi. Namun, jika disertai dehidrasi, penyakit ini bisa menjadi fatal, dan penderitanya perlu segera mendapat pertolongan medis.\n" +
                "\n" +
                "Patut diketahui, diare juga dapat menjadi gejala COVID-19. Maka dari itu, jika Anda atau anak Anda mengalami diare, sebaiknya periksakan ke dokter untuk memastikan kondisi. Klik tautan di bawah ini agar Anda dapat diarahkan ke fasilitas kesehatan");
        values.put("img", R.drawable.diare);
        db.insert("sam", "_id", values);

        values.put("_id", "2");
        values.put("nama", "HIV");
        values.put("penyebab", "By blood products (unclean needles or unscreened blood).\n" +
                "By having unprotected vaginal, anal, or oral sex.\n" +
                "By mother to baby by pregnancy, labor, or nursing.");
        values.put("gejala", "Demam\n" +
                "Tenggorokan sakit\n" +
                "Muncul ruam\n" +
                "Pembengkakan noda limfa\n" +
                "Diare\n" +
                "Kelelahan\n" +
                "Nyeri otot dan sendi");
        values.put("description", "Umumnya, penyebaran virus HIV yang terjadi di negara Indonesia adalah melalui hubungan seksual yang tidak aman dan bergantian menggunakan jarum suntik saat memakai narkoba. Seseorang yang terinfeksi HIV bisa menularkannya kepada orang lain, bahkan sejak beberapa minggu sejak tertular.\n" +
                "\n" +
                "Semua orang berisiko terinfeksi HIV. Namun, beberapa penyebab HIV, antara lain:\n" +
                "\n" +
                "Hubungan seks tanpa kondom, baik sesama jenis kelamin maupun heteroseksual.\n" +
                "Sering membuat tato atau melakukan tindik, dengan alat yang tidak steril.\n" +
                "Berhubungan seksual dengan pasangan yang memiliki penyakit kelamin\n" +
                "Suntikan Narkoba\n" +
                "Berhubungan seksual dengan pengguna narkotika. Belum ada obat HIV, tetapi ada pengobatan HIV yang bisa memperlambat perkembangan penyakit HIV. Perawatan ini bisa membuat orang yang terinfeksi untuk hidup lebih lama dan bisa menjalani pola hidup sehat. Ada berbagai macam jenis obat HIV yang dikombinasikan untuk mengendalikan virus.");
        values.put("img", R.drawable.hiv);
        db.insert("sam", "_id", values);

        values.put("_id", "3");
        values.put("nama", "DBD");
        values.put("penyebab", "virus dengue yang ditularkan oleh nyamuk Aedes aegypti dan Aedes albopictus. Kedua nyamuk dapat menggigit di pagi hari sampai sore menjelang petang.");
        values.put("gejala", "Gejala umumnya timbul 4-7 hari sejak gigitan nyamuk, dan dapat berlangsung selama 10 hari. Beberapa gejala demam berdarah, yaitu:\n" +
                "\n" +
                "Demam tinggi mencapai 40 derajat Celsius;\n" +
                "Nyeri kepala berat;\n" +
                "Nyeri pada sendi, otot, dan tulang;\n" +
                "Nyeri pada bagian belakang mata;\n" +
                "Nafsu makan menurun;\n" +
                "Mual dan muntah;\n" +
                "Pembengkakan kelenjar getah bening;\n" +
                "Ruam kemerahan sekitar 2-5 hari setelah demam;\n" +
                "Kerusakan pada pembuluh darah dan getah bening; dan\n" +
                "Perdarahan dari hidung, gusi, atau di bawah kulit.");
        values.put("description","DBD atau demam berdarah dengue adalah penyakit yang disebabkan oleh salah satu dari empat virus dengue. Demam berdarah merupakan penyakit yang mudah menular. Sarana penularan demam berdarah sendiri berasal dari gigitan nyamuk Aedes aegypti dan Aedes albocpictus.\n" +
                "\n" +
                "Demam berdarah dapat dipicu oleh faktor risiko tertentu. Beberapa faktor risiko demam berdarah, yaitu: \n" +
                "Pernah mengalami infeksi virus dengue sebelumnya. \n" +
                "Tinggal atau bepergian ke daerah tropis. \n" +
                "Bayi, anak-anak, orang lanjut usia, dan orang dengan kekebalan tubuh yang lemah.\n" +
                "\n" +
                "Diagnosis penyakit demam berdarah akan dilakukan dengan melakukan pemeriksaan fisik dan wawancara medis. Selain itu pemeriksaan penunjang, seperti pemeriksaan darah di laboratorium juga harus dilakukan. Sebaiknya, setelah merasakan ada gejala-gejala demam berdarah, segera konsultasi dokter di Halodoc atau langsung kunjungi rumah sakit terdekat, agar bisa langsung dilakukan diagnosis. ");
        values.put("img", R.drawable.dbd);
        db.insert("sam", "_id", values);

        values.put("_id", "4");
        values.put("nama", "Hepatitis");
        values.put("penyebab", "Hepatitis bisa disebabkan oleh beragam kondisi dan penyakit. Namun, penyebab yang paling sering adalah infeksi virus. Berikut adalah beberapa jenis hepatitis yang disebabkan oleh infeksi virus:\n" +
                "\n" +
                "Hepatitis A\n" +
                "Hepatitis A disebabkan oleh infeksi virus hepatitis A (HAV). Hepatitis A ditularkan melalui makanan atau minuman yang terkontaminasi feses penderita hepatitis A yang mengandung virus hepatitis A.\n" +
                "\n" +
                "Hepatitis B\n" +
                "Hepatitis B disebabkan oleh infeksi virus hepatitis B (HBV). Hepatitis B dapat  ditularkan melalui kontak langsung dengan cairan tubuh penderita hepatitis B. Cairan tubuh yang dapat menjadi sarana penularan hepatitis B adalah darah, cairan vagina, dan air mani.\n" +
                "\n" +
                "Hepatitis C\n" +
                "Hepatitis C disebabkan oleh infeksi virus hepatitis C (HCV). Hepatitis C juga ditularkan melalui cairan tubuh. Penularan bisa terjadi saat berhubungan seksual tanpa kondom atau menggunakan jarum suntik bekas penderita hepatitis C. Jika ibu hamil menderita hepatitis C, bayinya dapat tertular penyakit ini saat melewati jalan lahir ketika persalinan.\n" +
                "\n" +
                "Hepatitis D\n" +
                "Hepatitis D disebabkan oleh infeksi virus hepatitis D (HDV). Hepatitis D merupakan jenis hepatitis yang jarang terjadi, tetapi bisa bersifat serius. Virus hepatitis D tidak bisa berkembang biak di dalam tubuh manusia tanpa adanya hepatitis B. Hepatitis D ditularkan melalui darah dan cairan tubuh lainnya.\n" +
                "\n" +
                "Hepatitis E\n" +
                "Hepatitis E disebabkan oleh infeksi virus hepatitis E (HEV). Hepatitis E mudah menular pada lingkungan yang memiliki sanitasi yang buruk. Salah satunya melalui kontaminasinya pada sumber air.\n" +
                "\n" +
                "Selain disebabkan oleh virus, hepatitis juga dapat disebabkan oleh beberapa hal kondisi berikut:\n" +
                "\n" +
                "Konsumsi alkohol secara berlebihan\n" +
                "Konsumsi alkohol secara berlebihan bisa menyebabkan peradangan pada hati (hepatitis) dan menimbulkan kerusakan permanen pada sel-sel hati, sehingga fungsi hati akan terganggu. Jika dibiarkan, kondisi ini dapat berkembang menjadi gagal hati dan sirosis.\n" +
                "\n" +
                "Obat-obatan tertentu\n" +
                "Penggunaan obat-obatan melebihi dosis dan paparan racun juga dapat menyebabkan peradangan pada hati. Kondisi ini disebut toxic hepatitis.\n" +
                "\n" +
                "Penyakit autoimun\n" +
                "Pada hepatitis yang disebabkan oleh penyakit autoimun, sistem imun tubuh secara keliru menyerang sel-sel hati sehingga menimbulkan peradangan dan kerusakan sel.");
        values.put("gejala", "Berikut adalah beberapa gejala umum yang muncul pada penderita hepatitis:\n" +
                "\n" +
                "Mual\n" +
                "Muntah\n" +
                "Demam\n" +
                "Kelelahan\n" +
                "Feses berwarna pucat\n" +
                "Urine berwarna gelap\n" +
                "Nyeri perut\n" +
                "Nyeri sendi\n" +
                "Kehilangan nafsu makan\n" +
                "Penurunan berat badan\n" +
                "Mata dan kulit berubah menjadi kekuningan atau penyakit kuning");
        values.put("description","Hepatitis adalah peradangan pada hati atau liver. Hepatitis bisa disebabkan oleh infeksi virus, bisa juga disebabkan oleh kondisi atau penyakit lain, seperti kebiasaan mengonsumsi alkohol, penggunaan obat-obatan tertentu, atau penyakit autoimun. Jika disebabkan oleh infeksi virus, hepatitis bisa menular.\n" +
                "\n" +
                "Hepatitis ditandai dengan munculnya gejala berupa demam, nyeri sendi, nyeri perut, dan penyakit kuning. Hepatitis dapat bersifat akut (cepat dan tiba-tiba) maupun kronis (perlahan dan bertahap). Jika tidak ditangani dengan baik, hepatitis dapat menimbulkan komplikasi, seperti gagal hati, sirosis, atau kanker hati (hepatocellular carcinoma).");
        values.put("img", R.drawable.hepatitis);
        db.insert("sam", "_id", values);

        values.put("_id", "5");
        values.put("nama", "Tifus");
        values.put("penyebab", "Makanan dan air yang terkontaminasi.");
        values.put("gejala", "Gejala tifus umumnya mulai muncul pada 1 hingga 3 minggu setelah tubuh terinfeksi dengan ciri-ciri berupa demam tinggi, diare atau konstipasi, sakit kepala, dan sakit perut. Kondisi ini dapat memburuk dalam beberapa minggu.");
        values.put("description","Tifus (tipes) atau demam tifoid adalah penyakit yang terjadi karena infeksi bakteri Salmonella typhi yang menyebar melalui makanan dan minuman yang telah terontaminasi. Penyakit yang banyak terjadi di negara-negara berkembang dan dialami oleh anak-anak ini dapat membahayakan nyawa jika tidak ditangani dengan baik dan secepatnya.\n" +
                "\n" +
                "Tifus dapat menular dengan cepat. Infeksi demam tifoid terjadi ketika seseorang mengonsumsi makanan atau minuman yang telah terkontaminasi sejumlah kecil tinja yang mengandung bakteri. Pada kasus yang jarang terjadi, penularan juga bisa terjadi akibat terkena urine yang terinfeksi bakteri.\n" +
                "\n" +
                "Beberapa faktor dapat meningkatkan risiko seseorang terserang tifus, antara lain:\n" +
                "Sanitasi buruk.\n" +
                "Tidak membersihkan tangan sebelum makan, atau kurang bersih dalam mencuci makanan.\n" +
                "Mengonsumsi sayur-sayuran yang menggunakan pupuk dari kotoran manusia yang terinfeksi.\n" +
                "Mengonsumsi produk susu atau olahannya yang telah terkontaminasi.\n" +
                "Menggunakan toilet yang sudah terkontaminasi bakteri.\n" +
                "Melakukan seks oral dengan mereka yang membawa bakteri Salmonella typhii.");
        values.put("img", R.drawable.tipes);
        db.insert("sam", "_id", values);

        values.put("_id", "6");
        values.put("nama", "Tumor");
        values.put("penyebab", "Tumor terbentuk akibat ketidakseimbangan antara jumlah sel baru yang tumbuh dengan jumlah sel lama yang mati. Kondisi ini bisa terjadi bila sel baru terbentuk secara berlebihan, atau sel lama yang seharusnya mati tetap hidup.");
        values.put("gejala", "Demam\n" +
                "Lemas\n" +
                "Tidak nafsu makan\n" +
                "Berkeringat di malam hari\n" +
                "Nyeri dada\n" +
                "Perubahan warna kulit, misalnya menjadi kuning, kemerahan, atau menjadi lebih gelap\n" +
                "Perdarahan atau memar yang tidak jelas sebabnya\n" +
                "Penurunan berat badan.");
        values.put("description","Tumor adalah benjolan yang muncul akibat sel yang memperbanyak diri secara berlebihan, atau akibat sel lama yang seharusnya mati masih terus bertahan hidup, sementara pembentukan sel baru terus terjadi.\n" +
                "\n" +
                "Tumor dapat terjadi di bagian tubuh mana pun, semisal di tulang, rahang, mulut, dan kulit, dan ada yang bersifat jinak maupun ganas. Yang dimaksud dengan tumor jinak adalah tumor yang tidak menyerang sel normal di sekitarnya dan tidak menyebar ke bagian tubuh lain. Sedangkan tumor ganas bersifat sebaliknya, dan disebut dengan kanker.");
        values.put("img", R.drawable.tumor);
        db.insert("sam", "_id", values);

        values.put("_id", "7");
        values.put("nama", "Osteoporosis");
        values.put("penyebab", "menurunnya kemampuan tubuh untuk meregenerasi tulang. Hal ini berdampak pada berkurangnya kepadatan tulang. Penurunan kemampuan regenerasi ini biasanya akan dimulai saat seseorang memasuki usia 35 tahun.");
        values.put("gejala", "Mudah mengalami patah tulang, walau hanya karena benturan yang ringan\n" +
                "Nyeri punggung, biasanya disebabkan oleh patah tulang belakang\n" +
                "Postur badan membungkuk\n" +
                "Tinggi badan berkurang");
        values.put("description","Osteoporosis adalah kondisi berkurangnya kepadatan tulang. Hal ini menyebabkan tulang menjadi keropos dan mudah patah. Osteoporosis jarang menimbulkan gejala dan biasanya baru diketahui ketika penderitanya jatuh atau mengalami cedera yang menyebabkan patah tulang.\n" +
                "\n" +
                "Osteoporosis bisa dialami oleh siapa saja, termasuk anak-anak dan orang dewasa. Namun, kondisi ini lebih sering terjadi pada wanita yang telah memasuki masa menopause. Hal ini disebabkan oleh berkurangnya kadar estrogen yang berperan penting dalam menjaga kepadatan tulang.");
        values.put("img", R.drawable.osteoporosis);
        db.insert("sam", "_id", values);

        values.put("_id", "8");
        values.put("nama", "Leukimia");
        values.put("penyebab", " kelainan sel darah putih di dalam tubuh dan tumbuh secara tidak terkendali.");
        values.put("gejala", "Demam dan menggigil.\n" +
                "Tubuh terasa lelah dan rasa lelah tidak hilang meski sudah beristirahat.\n" +
                "Berat badan turun drastis.\n" +
                "Gejala anemia.\n" +
                "Bintik merah pada kulit.\n" +
                "Mimisan.\n" +
                "Tubuh mudah memar.\n" +
                "Keringan berlebihan (terutama pada malam hari).\n" +
                "Mudah terkena infeksi.\n" +
                "Muncul benjolan di leher akibat pembengkakan kelenjar getah bening.\n" +
                "Perut terasa tidak nyaman akibat organ hati dan limpa membengkak.");
        values.put("description","Penyakit leukimia atau lebih tepatnya leukemia adalah kanker darah akibat tubuh terlalu banyak memproduksi sel darah putih abnormal. Leukemia dapat terjadi pada orang dewasa dan anak-anak.\n" +
                "\n" +
                "Sel darah putih merupakan bagian dari sistem kekebalan tubuh yang diproduksi di dalam sumsum tulang. Ketika fungsi sumsum tulang terganggu, maka sel darah putih yang dihasilkan akan mengalami perubahan dan tidak lagi menjalani perannya secara efektif.");
        values.put("img", R.drawable.leukimia);
        db.insert("sam", "_id", values);

        values.put("_id", "9");
        values.put("nama", "Herpes");
        values.put("penyebab", "Terdapat delapan jenis virus herpes yang dapat menyerang manusia, yaitu herpes simplex virus type 1 (HSV 1), herpes simplex virus type 2 (HSV 2), varicella-zoster virus (VZV), Epstein-Barr virus (EBV), cytomegalovirus (CMV), herpesvirus 6 (HBLV), herpesvirus 7, dan herpesvirus 8 sarkoma kaposi.");
        values.put("gejala", "Demam\n" +
                "Kelelahan\n" +
                "Sakit kepala\n" +
                "Nyeri otot\n" +
                "Penurunan nafsu makan\n" +
                "Pembengkakan kelenjar getah bening.");
        values.put("description","Herpes adalah kelompok virus yang dapat menyebabkan infeksi pada manusia. Infeksi virus herpes umumnya ditandai dengan kulit kering, luka lepuh, atau luka terbuka yang berair. Herpes simplex virus (HSV) dan varicella- zoster virus adalah dua jenis virus herpes yang cukup sering menyerang manusia.\n" +
                "\n" +
                "Virus ini dapat menyerang siapa saja. Adanya riwayat kontak dengan penderita infeksi virus ini dan memiliki sistem kekebalan tubuh yang sedang lemah adalah faktor yang bisa meningkatkan risiko seseorang terinfeksi virus herpes.\n" +
                "\n" +
                "Secara keseluruhan, virus herpes terbagi ke dalam tiga kelompok. Pembagian kelompok virus herpes adalah sebagai berikut:\n" +
                "\n" +
                "Alfa herpesvirus\n" +
                "Kelompok virus ini memiliki siklus berkembang biak yang cepat, memiliki fase infeksi laten (tersembunyi tanpa gejala), dan bisa kambuh. Contoh alfa herpesvirus adalah HSV tipe 1 dan 2, serta varicella-zoster virus.\n" +
                "\n" +
                "Beta herpesvirus\n" +
                "Kelompok virus ini memiliki siklus berkembang biak yang panjang. Sel yang terinfeksi sering kali membengkak dan virus dapat tersembunyi di dalam tubuh. Beberapa sel yang sering terinfeksi virus ini adalah sel darah merah, ginjal, dan kelenjar sekretori. Contoh beta herpesvirus adalah cytomegalovirus, herpesvirus 6, dan herpesvirus 7.\n" +
                "\n" +
                "Gamma herpesvirus\n" +
                "Kelompok virus ini khusus menyerang bagian sel atau limfosit T atau B pada tubuh manusia. Contoh gamma herpesvirus adalah Epstein-Barr virus dan human herpesvirus 8. ");
        values.put("img", R.drawable.herpes);
        db.insert("sam", "_id", values);

        values.put("_id", "10");
        values.put("nama", "Kista");
        values.put("penyebab", " infeksi, penyumbatan, radang yang terjadi dalam jangka panjang, atau karena penyakit keturunan.");
        values.put("gejala", "Kemerahan di kulit sekitar area kista.\n" +
                "Keluar darah atau nanah berbau tidak sedap dari benjolan.\n" +
                "Infeksi yang memicu nyeri pada kista.\n" +
                "Kaku atau kesemutan, terutama pada bagian tubuh yang ditumbuhi kista.\n" +
                "Mual dan muntah.\n" +
                "Demam.\n" +
                "Pusing.");
        values.put("description","Kista adalah benjolan di bawah kulit yang berisi cairan, udara, atau zat padat seperti rambut. Benjolan ini dapat tumbuh di bagian tubuh mana pun, dan diakibatkan oleh berbagai faktor, seperti infeksi, radang, atau keturunan.");
        values.put("img", R.drawable.kista);
        db.insert("sam", "_id", values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS sam");
        onCreate(db);

    }

}
