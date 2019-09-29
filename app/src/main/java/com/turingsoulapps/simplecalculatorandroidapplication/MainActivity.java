package com.turingsoulapps.simplecalculatorandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultDisplay;
    TextView inputDisplay;
    TextView totalInputDisplay;

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMul;
    Button buttonDiv;
    Button buttonDot;
    Button buttonPower;
    Button buttonSqrt;
    Button buttonMod;
    Button buttonC;
    Button buttonEqual;

    ImageButton imgButtonDlt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputDisplay=(TextView) findViewById(R.id.input);
        resultDisplay=(TextView)findViewById(R.id.result);
        totalInputDisplay=(TextView) findViewById(R.id.totalinput);

        button0=(Button) findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        buttonDot=(Button)findViewById(R.id.buttondot);
        buttonAdd=(Button)findViewById(R.id.buttonadd);
        buttonSub=(Button)findViewById(R.id.buttonsub);
        buttonDiv=(Button)findViewById(R.id.buttondiv);
        buttonMul=(Button)findViewById(R.id.buttonmul);
        buttonEqual=(Button)findViewById(R.id.buttonequal);
        buttonMod=(Button)findViewById(R.id.buttonmod);
        buttonPower=(Button)findViewById(R.id.buttonpower);
        buttonSqrt=(Button)findViewById(R.id.buttonroot);
        buttonC=(Button)findViewById(R.id.buttonclear);
        imgButtonDlt=(ImageButton) findViewById(R.id.imgbuttondlt);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("0"));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("1"));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("2"));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("3"));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("4"));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("5"));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("6"));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("7"));
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("8"));
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("9"));
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("+"));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("-"));
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("*"));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("/"));
            }
        });

        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("^"));
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("%"));
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("."));
            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("Sqrt of "));
            }
        });

        imgButtonDlt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String clearAll = SimpleCalculatorController.setOperation("clear");
                inputDisplay.setText(clearAll);
                resultDisplay.setText(clearAll);
                return true;
            }
        });

        imgButtonDlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(SimpleCalculatorController.setOperation("delete"));
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String clearAll = SimpleCalculatorController.setOperation("clear");
                inputDisplay.setText(clearAll);
                resultDisplay.setText(clearAll);
                totalInputDisplay.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultDisplay.setText(SimpleCalculatorController.setOperation("="));
                totalInputDisplay.setText(inputDisplay.getText());
                inputDisplay.setText("");
            }
        });
    }
}
