package site.ufsj.calculadoraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){

        EditText t1 = (EditText) findViewById(R.id.editText1);
        EditText t2 = (EditText) findViewById(R.id.editText2);
        Integer soma = Integer.parseInt(t1.getText().toString()) +
                Integer.parseInt(t2.getText().toString()) ;

        Toast.makeText(MainActivity.this,
                "O resultado é " + soma.toString(),
                Toast.LENGTH_LONG).show();

    }

    public void onClickSub(View v){

        EditText t1 = (EditText) findViewById(R.id.editText1);
        EditText t2 = (EditText) findViewById(R.id.editText2);
        Integer soma = Integer.parseInt(t1.getText().toString()) -
                Integer.parseInt(t2.getText().toString()) ;

        Toast.makeText(MainActivity.this,
                "O resultado é " + soma.toString(),
                Toast.LENGTH_LONG).show();

    }

    public void onClickMult(View v){

        EditText t1 = (EditText) findViewById(R.id.editText1);
        EditText t2 = (EditText) findViewById(R.id.editText2);
        Integer soma = Integer.parseInt(t1.getText().toString()) *
                Integer.parseInt(t2.getText().toString()) ;

        Toast.makeText(MainActivity.this,
                "O resultado é " + soma.toString(),
                Toast.LENGTH_LONG).show();

    }

    public void onClickDiv(View v){

        try {
            EditText t1 = (EditText) findViewById(R.id.editText1);
            EditText t2 = (EditText) findViewById(R.id.editText2);
            Integer soma = Integer.parseInt(t1.getText().toString()) /
                    Integer.parseInt(t2.getText().toString());

            Toast.makeText(getBaseContext(),
                    "O resultado é " + soma.toString(),
                    Toast.LENGTH_SHORT).show();
        } catch (Exception E){
            Toast.makeText(getBaseContext(),
                    "O resultado é " + "Erro",
                    Toast.LENGTH_SHORT).show();
        }


    }
}
