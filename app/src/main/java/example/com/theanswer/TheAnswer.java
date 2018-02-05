package example.com.theanswer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class TheAnswer extends AppCompatActivity {

    public static final int[] answers = { 42, -10, 0, 100, 1000 };
    public static final int answer = 42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_answer);


        // Get a reference to a TextView in the content view
        TextView answerView = (TextView) findViewById(R.id.answerView);

        int val = findAnswer();
        String output = (val == answer) ? "42" : "We may never know";

        // Set desired text in answerView TextView
        answerView
                .setText("The answer to life, the universe and everything is:\n\n"
                        + output);



    }

    private int findAnswer() {
        for (int val : answers) {
            if (val == answer)
                return val;
        }
        return -1;
    }
}
