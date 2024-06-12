package Constructor;
public class MusicAlbum {
    String songname;
    String singer;
    double duration;

    MusicAlbum(String x, String y){
        songname = x;
        singer = y;
    }


    MusicAlbum(String ganakanam, String gayak, double samay){ //constructor overload
        songname = ganakanam;
        singer = gayak;
        duration = samay;

    }
    void display(){
        System.out.println(songname + "" + singer + "" + duration);
    }

    public static void main(String[]args){
        MusicAlbum s1 = new MusicAlbum("Linkin park", "Chester" , 3.10);
        MusicAlbum s2 = new MusicAlbum("Calvin Harris", "Adam Richard ",4.50);

        s1.display();
        s2.display();
    }
}
