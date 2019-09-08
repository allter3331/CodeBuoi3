package ChuaBaiTapBuoi1;

public class Song extends Audio {
    String artis;
    String album;

    @Override
    void play() {
        System.out.println("Play Song ....");
    }
    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Artis: " + artis);
        System.out.println("Album: " + album);
    }
}
