//author Alex Dapoz

public class BeerSong {
    public static void main(String args[]){//main method calls Ninety_Nine_Bottles_of_Beer() method
        Ninety_Nine_Bottles_of_Beer();
    }

    public static void Ninety_Nine_Bottles_of_Beer(){//writes out the Ninety Nine Bottles of Beer song to console
        int Beer = 99;
        while(Beer > 0){
            System.out.println(Beer + " bottles of beer on the wall, " + Beer + " bottles of beer ");
            Beer--;
            if(Beer > 0)
                System.out.println("take one down, pass it around, " + Beer + " bottles of beer on the wall.");
            else
                System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
        }
    }
}
