package a.zad4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends AppCompatActivity {

    Intent intent;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void start(View v)
    {
        context = getApplicationContext();
        intent = new Intent(context,Quiz.class);
        startActivity(intent);

    }


}