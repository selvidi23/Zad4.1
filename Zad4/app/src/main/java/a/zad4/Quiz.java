package a.zad4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Hubert on 04.04.2017.
 */

public class Quiz extends Activity {


    Intent intent;
    Context context;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        //radioGroup1 = (RadioGroup) findViewById(R.id.rGroup1);

    }

    public void q1(View v) {
       /* int zaznaczonyId1 = radioGroup1.getCheckedRadioButtonId();
        radiobron1 = (RadioButton) findViewById(zaznaczonyId1);
        int zaznaczonyId2 = radioGroup2.getCheckedRadioButtonId();
        radiobron2 = (RadioButton) findViewById(zaznaczonyId2);
        int zaznaczonyId3 = radioGroup3.getCheckedRadioButtonId();
        radiobron3 = (RadioButton) findViewById(zaznaczonyId3);
        int zaznaczonyId4 = radioGroup4.getCheckedRadioButtonId();
        radiobron4 = (RadioButton) findViewById(zaznaczonyId4);
        int zaznaczonyId5 = radioGroup5.getCheckedRadioButtonId();
        radiobron5 = (RadioButton) findViewById(zaznaczonyId5);
*/






        RadioButton radiobron6 = (RadioButton) findViewById(R.id.rButton11);
        RadioButton radiobron7 = (RadioButton) findViewById(R.id.rButton21);
        RadioButton radiobron8 = (RadioButton) findViewById(R.id.rButton31);
        RadioButton radiobron9 = (RadioButton) findViewById(R.id.rButton41);
        RadioButton radiobron10 = (RadioButton) findViewById(R.id.rButton51);
        int pkt = 0;
        if(radiobron6.isChecked())
        {
            pkt++;
        }
        if(radiobron7.isChecked())
        {
            pkt++;
        }
        if(radiobron8.isChecked())
        {
            pkt++;
        }
        if(radiobron9.isChecked())
        {
            pkt++;
        }
        if(radiobron10.isChecked())
        {
            pkt++;
        }
        Toast.makeText(getApplicationContext(),"wynik: "+pkt, Toast.LENGTH_LONG).show();

        context = getApplicationContext();
        intent = new Intent(context,MainActivity.class);
        startActivity(intent);



    }



    }








