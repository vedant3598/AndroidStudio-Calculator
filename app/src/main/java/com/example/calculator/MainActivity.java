package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    //Developer: Vedant Shah

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnClear, btnBackSpace, btnDecimal, btnAddition,
        btnSubtraction, btnDivision, btnMultiplication, btnBracket, btnEqual, btnPercentage;
    TextView calculatorResult, process;
    String processor;
    Boolean isBracketOpen;
    int developedCounter;
    static String clearScreen = "clear";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isBracketOpen = false;
        developedCounter = 0;

        //Assigning values to all variables
        btnClear = (Button) findViewById(R.id.btnDelete);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);

        process = (TextView) findViewById(R.id.process);
        calculatorResult = (TextView) findViewById(R.id.calculatedResult);

        process.setText("");
        calculatorResult.setText("");

        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnDivision = (Button) findViewById(R.id.btnDivision);

        btnDecimal = (Button)findViewById(R.id.btnDecimal);
        btnBackSpace = (Button)findViewById(R.id.btnBack);

        btnBracket = (Button)findViewById(R.id.btnBracket);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnPercentage = (Button) findViewById(R.id.btnPercentage);

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                process.setText("");
                calculatorResult.setText("");
                }
        });

        //Number Buttons
        btnOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "0");
            }
        });

        //Functional Buttons
        btnMultiplication.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "*");
            }
        });
        btnSubtraction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "-");
            }
        });
        btnAddition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "+");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "/");
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + ".");
            }
        });

        btnBackSpace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                if(processor.length() > 0){
                    processor = processor.substring(0, processor.length()-1);
                    process.setText(processor);
                }else{
                    calculatorResult.setText("");
                }
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                process.setText(processor + "%");
            }
        });

        btnBracket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                if(isBracketOpen){
                    processor = process.getText().toString();
                    process.setText(processor + ")");
                    isBracketOpen = false;
                }else{
                    processor = process.getText().toString();
                    process.setText(processor + "(");
                    isBracketOpen = true;
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clearScreen();
                processor = process.getText().toString();
                processor = processor.replaceAll("%", "/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String result = "";

                try{
                    Scriptable scope = rhino.initStandardObjects();
                    result = rhino.evaluateString(scope, processor, "JavaScript", 1, null).toString();
                }catch (Exception e){
                    result = "Math Error";
                }
                calculatorResult.setText(result);
            }
        });
    }

    //Clears Screen
    private void clearScreen(){
        processor = process.getText().toString();
        if(processor.contains(clearScreen)){
            process.setText("");
            calculatorResult.setText("");
        }
        developedCounter = 0;
    }
}
