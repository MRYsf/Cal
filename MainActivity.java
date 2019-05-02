package com.example.artoperations;
// By RKAISSI YOUSSEF
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    EditText n1,n2;
    Button resultat;

    int x,y,r,i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.editText);
        n1=(EditText)findViewById(R.id.editText2);
        resultat=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);
        radioGroup = findViewById(R.id.radioGroup);





        resultat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                x=Integer.parseInt(n1.getText().toString());
                y=Integer.parseInt(n2.getText().toString());
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                if (radioButton=="radio_add"){i=1;}
                else if (radioButton=="radio_so"){i=2;}
                else if (radioButton="radio_mul"){i=3;}
                else if (radioButton="radio_div"){i=4;}
                }
                switch (i){
                case 1:
                    r=x+y;
                    textView.setText("Result"+r);
                    Toast.makeText(getApplicationContext(),"Addition="+r,Toast.LENGTH_LONG).show();
                    break;
                case 2 :
                    r=x-y;
                    textView.setText("Result"+r);
                    Toast.makeText(getApplicationContext(),"Soustraction="+r,Toast.LENGTH_LONG).show();
                    break;
                case 3 :
                    r=x*y;
                    textView.setText("Result"+r);
                    Toast.makeText(getApplicationContext(),"Multiplication="+r,Toast.LENGTH_LONG).show();
                    break;
                case 4:
                    r=x/y;
                    textView.setText("Result"+r);
                    Toast.makeText(getApplicationContext(),"Division="+r,Toast.LENGTH_LONG).show();
                    break;



            }

            }
        });

        public void checkButton(View v ) {
            int radioId = radioGroup.getCheckedRadioButtonId();

            radioButton = findViewById(radioId);

            Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(),
                    Toast.LENGTH_SHORT).show();
        }

    }
}
