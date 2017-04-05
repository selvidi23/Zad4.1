package a.zad4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Hubert on 04.04.2017.
 */

public class Quiz extends Activity {

    RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.rGroup1);
    RadioButton radiobron1 = (RadioButton)findViewById(R.id.rButton11);
    RadioButton radiobron2 = (RadioButton)findViewById(R.id.rButton12);
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }


}

