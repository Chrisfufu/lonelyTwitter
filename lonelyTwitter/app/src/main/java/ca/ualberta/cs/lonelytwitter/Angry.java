package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by zuofuli on 2017-09-14.
 */

public class Angry extends Mood {
    public Angry(){
        super();
        super.setMyMood("Angry Face!!!");

    }
    public Angry(Date date){
        super(date);
        super.setMyMood("Angry Face!!!");
    }
}
