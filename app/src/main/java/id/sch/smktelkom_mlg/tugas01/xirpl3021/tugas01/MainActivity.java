package id.sch.smktelkom_mlg.tugas01.xirpl3021.tugas01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etUmur;
    Button bDaftar;
    TextView tvHasil;
    Spinner spKelas;
    RadioGroup rgStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etUmur = (EditText) findViewById(R.id.editTextUmur);
        bDaftar = (Button) findViewById(R.id.buttonDaftar);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        rgStatus = (RadioGroup) findViewById(R.id.radioGroupStatus);

        bDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();


            }
        });

    }

    private void doProcess() {
        String hasil = null;
        if (rgStatus.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton)
                    findViewById(rgStatus.getCheckedRadioButtonId());
            hasil = rb.getText().toString();
        }
        if (hasil == null) {
            tvHasil.setText("Anda belum memilih divisi");
        }
        String nama = etNama.getText().toString();
        int umur = Integer.parseInt(etUmur.getText().toString());


        tvHasil.setText(nama + " " + umur + " tahun" + " kelas" + spKelas.getSelectedItem().toString() + "\n" + "Siap mengikuti palwaga divisi");
    }
}
