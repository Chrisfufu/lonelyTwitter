package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by zuofuli on 2017-09-14.
 */

public class Smile extends Mood{
    public Smile(){
        super();
        super.setMyMood("Angry Face!!!");

    }
    public Smile(Date date){
        super(date);
        super.setMyMood("Angry Face!!!");
    }
}
