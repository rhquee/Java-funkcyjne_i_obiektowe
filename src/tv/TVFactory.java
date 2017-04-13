package tv;

/**
 * Created by RENT on 2017-04-13.
 */
public class TVFactory { //new hotelTV, newRegularTV

    public TV create(String TVtype){
        //tu tworzymy regulare lub hotele, if taki
        if(TVtype.equals("Regular")) {
            TV tv = new RegularTV();
            System.out.println("U created Regular TV");
            return tv;
        }
        else if (TVtype.equals("Hotel")){
            System.out.println("U created Hotel");
            TV tv = new HotelTV();
        }
        return null;
    }
}
