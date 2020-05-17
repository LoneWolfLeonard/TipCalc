package com.perfectseowebsites.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     TextView tipTotalTextView;
    TextView TotalTextView;
    EditText BillEditView;
    Button TenPercent;
    Button FifteenPercent;
    Button TwentyPercent;
    double tipPercentage;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipTotalTextView = (TextView) findViewById(R.id.TipView);
         TotalTextView = (TextView) findViewById(R.id.TotalView);

         BillEditView = (EditText) findViewById(R.id.BillEditView);



         TenPercent = (Button) findViewById(R.id.tenbutton);
         FifteenPercent = (Button) findViewById(R.id.fifteenbutton);
         TwentyPercent = (Button) findViewById(R.id.twentybutton);


         TenPercent.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //10%
                 calcTheTip(0.10);
             }
         });
         FifteenPercent.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //15%
                 calcTheTip(0.15);
             }
         });
         TwentyPercent.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //20%
            calcTheTip(0.2);
             }
         });
     }
         void calcTheTip(Double tipPercentage)
         {

            //calc the tip
             Double BillTotal = Double.valueOf(BillEditView.getText().toString());

             Double TipTotal = BillTotal * tipPercentage;
             tipTotalTextView.setText(String.format("%.2f", TipTotal));

             Double TotalTotal = TipTotal + BillTotal;
             TotalTextView.setText(String.format("%.2f", TotalTotal));
         }
}