package ChuaBaiTapBuoi1;

import java.util.ArrayList;
import java.util.List;

public class SongMaster {
    List<Song> songs = new ArrayList<>();
    void addSong(Song song){
        System.out.println("addSong ...");
    }
    void timKiem(){
        System.out.println("tim kiem...");
    }
    void next(){
        System.out.println("next");
    }
    void delete(){
        System.out.println("Delete");
    }
    void previous(){
        System.out.println("previous");
    }
}
