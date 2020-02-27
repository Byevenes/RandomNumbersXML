package cl.ubb.randomnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instanciar los elementos a utilizar

        Button botonRandomico = (Button) findViewById(R.id.botonRandom);

        final ImageView primerNumero = (ImageView) findViewById(R.id.primerNumero);
        final ImageView segundoNumero = (ImageView) findViewById(R.id.segundoNumero);

        // Obtener los identificadores que estan en draw que son enteros
        final int [] numerosId = {
                R.drawable.cero,
                R.drawable.uno,
                R.drawable.dos,
                R.drawable.tres,
                R.drawable.cuatro,
                R.drawable.cinco,
                R.drawable.seis,
                R.drawable.siete,
                R.drawable.ocho,
                R.drawable.nueve
        };



        // funcion randomica para ir cambiando de imagenes
        botonRandomico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int numeroUno = random.nextInt(10);
                int numeroDos = random.nextInt(10);

                primerNumero.setImageResource(numerosId[numeroUno]);
                segundoNumero.setImageResource(numerosId[numeroDos]);

            }
        });

    }
}
