package com.example.done_this;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    private EditText nombreEvento, ubicacion, fechadesde, horadesde, fechahasta, horahasta;
    private EditText descripcion;
    private Button guardar, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        nombreEvento = findViewById(R.id.edtNombreEvento);
        ubicacion = findViewById(R.id.edtUbicacion);
        fechadesde = findViewById(R.id.edtFechaDesde);
        fechahasta = findViewById(R.id.edtFechaHasta);
        horadesde = findViewById(R.id.edtHoraInicio);
        horahasta = findViewById(R.id.edtHoraHasta);
        descripcion = findViewById(R.id.edtDescripcion);

        guardar =  (Button)findViewById(R.id.btnGuardar);
        cancelar =  (Button)findViewById(R.id.btnCancelar);

        guardar.setOnClickListener(this);
        cancelar.setOnClickListener(this);


    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
