package com.example.done_this;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity implements CalendarView.OnDateChangeListener {

    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView= findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(this);
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        CharSequence []items =  new CharSequence[3];
        items[0] = "Agregar evento";
        items[1] = "Ver evento";
        items[2] = "Cancelar";

        final int dia, mes, anio;

        dia = d;
        mes = m+1;
        anio = a;


        builder.setTitle("Seleccione una Tarea").setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                if (i==0){
                    //Agregar Evento
                    Intent intent = new Intent(getApplication(), AddActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("dia",dia);
                    bundle.putInt("mes",mes);
                    bundle.putInt("anio",anio);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if(i==1){
                    // Ver Eventos
                    Intent intent = new Intent(getApplication(), ViewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("dia",dia);
                    bundle.putInt("mes",mes);
                    bundle.putInt("anio",anio);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    return;
                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
