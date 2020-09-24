
package quizup;

import java.util.TimerTask;
import javax.swing.JLabel;

public class MyTimer extends TimerTask{

    QuestionFrame2 frame2;
    QuestionFrame3 frame3;
    final JLabel timer1;
    int counter =20 ;
    
    MyTimer(JLabel timer1, QuestionFrame2 frame) {
        this.timer1 = timer1;
        frame2 = frame;
    }
    MyTimer(JLabel timer1, QuestionFrame3 frame) {
        this.timer1 = timer1;
        frame3 = frame;
    }


    @Override
    public void run() {
        timer1.setText("   "+(counter--));
        if(frame2 != null && counter==0 && frame2.isVisible()){
            frame2.clickSubmit();
        }
        if(frame3 != null && counter==0 && frame3.isVisible()){
            frame3.clickSubmit();
        }
    }
    
}
