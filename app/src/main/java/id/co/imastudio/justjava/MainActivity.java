package id.co.imastudio.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    //deklrasi variable
    Integer b = 11 ;
    String name = "nando septian husni";
    Boolean bn = false;
    Double NM = 12.0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ini manggil id button untuk button bisa ada event kalau di klik
       Button button =  findViewById(R.id.iniButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //aksi event kalau button di klik
                Log.e("ini klik button","hei");
            }
        });


        //ini untuk cetak variable bisa pake log
        Log.d("nilai 1",name);
        Log.d("nilai 3" , NM.toString());


    }


}
