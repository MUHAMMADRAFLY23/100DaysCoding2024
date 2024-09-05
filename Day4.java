public class Main {
	public static void main(String[] args) {
        int d = 4;
        String c ="Printf";
        String h ="print";
        int b = 100;
        float j = 99.9f;
        
        //penggunaan printah print menampilkan teks tanpa garis baru maksudnya teks akan ditampilkan secara berturut turut
        System.out.print("Hari ke-"+d);
        System.out.print(",materi: "+h);
        System.out.print(",Jumlah hari: "+b);
        System.out.print(",Tahun dalam kesendirian: "+j);
        
        //printf dimaksud untuk mencetak format string yang lebih flexibel dan mendukung format khusus
        //untuk penggunaan printf kita bebas memberikan specifier pada hasil print yang akan dikeluarkan
        //simbol %d mengacu pada integer, simbol %.1f mengacu pada float dan %s pada String
        System.out.printf("\nHari ke-:%d\nMateri:%s\nJumlah Hari:%d\nTahun menjomblo:%.1f",d,c,b,j);
	}
}
