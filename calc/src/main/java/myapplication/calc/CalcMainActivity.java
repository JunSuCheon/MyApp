package myapplication.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcMainActivity extends Activity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);

        textResult = (TextView) findViewById(R.id.TextResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });


        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if (Double.parseDouble(num2) == 0)
                    Toast.makeText(getApplicationContext(), "0으로 나누었습니다.", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if( Double.parseDouble(num2) == 0)
                    Toast.makeText(getApplicationContext(), "0으로 나누었습니다.", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }

            }
        });


    }
}