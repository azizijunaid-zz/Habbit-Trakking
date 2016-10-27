package com.example.junaid.habittrakking;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class habitEntry extends Fragment {

    RadioButton mon;
    RadioButton tue;
    RadioButton wed;
    RadioButton thu;
    RadioButton fri;
    RadioButton sat;
    RadioButton sun;
    Button btn;
    EditText et;
    SQLiteDatabase db;
    HabitEntryDB hDB;
    ContentValues values;



    public habitEntry() {
        // Required empty public constructor
    }

    public void insertDb (ContentValues cv, SQLiteDatabase db){
        long flag = db.insert(HabitEntryDB.TABLE_NAME, null, cv);
        if(flag==-1){
            Toast.makeText(getContext(), "Not inserted", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(), "Inserted", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_habit_entry, container, false);

        btn = (Button) view.findViewById(R.id.submit);
        final EditText  edt= (EditText) view.findViewById(R.id.edit_text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "called", Toast.LENGTH_SHORT).show();

                try{
                    mon = (RadioButton) view.findViewById(R.id.mon);
                    tue = (RadioButton) view.findViewById(R.id.tues);
                    wed = (RadioButton) view.findViewById(R.id.wed);
                    thu = (RadioButton) view.findViewById(R.id.thur);
                    fri = (RadioButton) view.findViewById(R.id.fri);
                    sat = (RadioButton) view.findViewById(R.id.sat);
                    sun = (RadioButton) view.findViewById(R.id.sun);
                    values = new ContentValues();

                    hDB = new HabitEntryDB(getContext());
                    db = hDB.getWritableDatabase();

                    if(mon.isChecked()){
                        values.put(HabitEntryDB.MONDAY,1);
                        values.put(HabitEntryDB.HABIT,edt.getText().toString());
                        insertDb(values,db);


                    }
                    else if(tue.isChecked()){
                        values.put(HabitEntryDB.TUESDAY,1);
                        values.put(HabitEntryDB.HABIT,edt.getText().toString());
                        insertDb(values,db);

                    }
                    else if(wed.isChecked()){
                        values.put(HabitEntryDB.WEDNESDAY,1);
                        values.put(HabitEntryDB.HABIT,edt.getText().toString());
                        insertDb(values,db);

                    }
                    else if(thu.isChecked()){
                        values.put(HabitEntryDB.THURSDAY,1);
                        values.put(HabitEntryDB.HABIT,edt.getText().toString());
                        insertDb(values,db);

                    }
                    else if(fri.isChecked()){
                        values.put(HabitEntryDB.FRIDAY,1);
                        values.put(HabitEntryDB.HABIT,edt.getText().toString());
                        insertDb(values,db);

                    }
                    else if(sat.isChecked()){
                        values.put(HabitEntryDB.SATURDAY,1);
                        values.put(HabitEntryDB.HABIT,edt.getText().toString());
                        insertDb(values,db);

                    }
                    else if(sun.isChecked()){
                        values.put(HabitEntryDB.SUNDAY,1);
                        values.put(HabitEntryDB.HABIT,edt.getText().toString());
                        insertDb(values,db);

                    }
                    else {
                        Toast.makeText(getContext(), "Insert Habit", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception e){
                    Log.d("error", e.toString());
                }

            }
        });
                return view;
    }


}
