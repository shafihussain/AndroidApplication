package com.midterm.lasalle.project_android.Controller.DaycareController;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import Model.Meal;
import com.midterm.lasalle.project_android.R;

public class DaycareSchedule extends AppCompatActivity implements View.OnClickListener {

    TextView listOfTextViews[];

    int xmlWidgets[] = {R.id.textViewMTBreakfast, R.id.textViewWBreakfast,
                        R.id.textViewTHFBreakfast, R.id.textViewMLunch,
                        R.id.textViewTLunch, R.id.textViewWLunch, R.id.textViewTHLunch,
                        R.id.textViewFLunch, R.id.textViewMSnack,
                        R.id.textViewTWSnack, R.id.textViewTHFSnack};

    TextView clickedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daycare_schedule);
        initialize();
    }

    private void initialize() {

        listOfTextViews = new TextView[xmlWidgets.length];

        Meal listOfMeals[] = new Meal[xmlWidgets.length];

        listOfMeals[0] = new Meal (0, "Cheerios Banana Milk");
        listOfMeals[1] = new Meal (1, "Pancakes Blueberries Milk");
        listOfMeals[2] = new Meal (2, "Scrambled Eggs & Toast Potatoes 100% Juice");
        listOfMeals[3] = new Meal (3, "Mashed Potatoes Peas & Corn Bread & Butter Milk");
        listOfMeals[4] = new Meal (4, "Tuna Fish Sandwich Applesauce Carrot Sticks Milk");
        listOfMeals[5] = new Meal (5, "Rice & Chicken Stew Carrots & Potatoes Milk");
        listOfMeals[6] = new Meal (6, "Macaroni & cheese Fish Sticks Green Beans Milk");
        listOfMeals[7] = new Meal (7, "Whole Wheat Pizza Spinach Orange Slices Milk");
        listOfMeals[8] = new Meal (8, "Crackers with Peanut Butter 100% Juice");
        listOfMeals[9] = new Meal (9, "Yogurt Raisins / Peaches 100% Juices");
        listOfMeals[10] = new Meal (10, "Home-made blueberry Muffin 100% Juice");

        for (int i=0;i<xmlWidgets.length;i++){
            listOfTextViews[i]=(TextView)findViewById(xmlWidgets[i]);
            listOfTextViews[i].setText(listOfMeals[i].toString());
            listOfTextViews[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {

        clickedTextView = ((TextView)view);
        String text = clickedTextView.getText().toString();
        Toast.makeText(this," text view " + text + " is clicked", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this,ModifyDaycareSchedule.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==1)
            if (resultCode==RESULT_OK){
            String newMeal = (String)data.getExtras().getSerializable("tag");
            clickedTextView.setText(newMeal);
            }
    }
}
