
public class Main {

    public static void main(String[] args) {

        //Liga
        Liga indonesia = new Liga("ISL");
        Liga turki = new Liga("Turkey League");

        //Divisi
        Divisi ISL = new Divisi("ISL",indonesia);
        Divisi Divisi_Utama = new Divisi("Divisi Utama",indonesia);
        Divisi Kejayaanleague = new Divisi("Kejayaan League",turki);
        Divisi Huremleague = new Divisi("Hurem League",turki);

        //Klub
        Klub Persebaya = new Klub("Persebaya",ISL,indonesia);
        Klub Persekapas = new Klub("Persekapas",Divisi_Utama,indonesia);
        Klub Galatasaray = new Klub("Galatasaray",Kejayaanleague,turki);
        Klub Fenerbache = new Klub("Fenerbache",Huremleague,turki);

        indonesia.setDaftarDivisi(ISL);
        indonesia.setDaftarDivisi(Divisi_Utama);
        turki.setDaftarDivisi(Kejayaanleague);
        turki.setDaftarDivisi(Huremleague);

        ISL.setDaftarKlub(Persebaya);
        Divisi_Utama.setDaftarKlub(Persekapas);
        Kejayaanleague.setDaftarKlub(Galatasaray);
        Huremleague.setDaftarKlub(Fenerbache);


        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga Indonesia : ");
        indonesia.getDaftarDivisi("Indonesia");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga Indonesia : ");
        ISL.getDaftarKlubLiga("Indonesia");
        System.out.println("Klub Liga Turki : ");
        Kejayaanleague.getDaftarKlubLiga("Turki");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("ISL : ");
        ISL.getDaftarKlubDivisi("ISL");
        System.out.println("Divisi Utama : ");
        Divisi_Utama.getDaftarKlubDivisi("Divisi Utama");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        Persebaya.getDivisi("Persebaya");
        Galatasaray.getDivisi("Galatasaray");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        Fenerbache.getLiga("Fenerbache");
    }
}

