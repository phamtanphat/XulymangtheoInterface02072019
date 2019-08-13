package khoapham.ptp.phamtanphat.baitapinterface02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Duyệt từ 0 - 100
        // 1 : trả số chẳn
        // 2 : trả về số lẻ
        // 3: trả về số chia 3 dư 1
        // 4 : trả về số chính phương
//        insole();
        insotheodieukien(new HandleArray() {
            @Override
            public boolean xulydieukien(int value) {
                if (Math.sqrt(value) % 1 == 0) return true;
                return false;
            }
        });
    }
    private void insole(){
        for (int i = 0 ; i <= 100 ; i++){
            if (i % 2 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insochan(){
        for (int i = 0 ; i <= 100 ; i++){
            if (i % 2 == 0){
                Log.d("BBB",i + "");
            }
        }
    }
    private void inchia3du1(){
        for (int i = 0 ; i <= 100 ; i++){
            if (i % 3 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
    private void inchinhphuong(){
        for (int i = 0 ; i <= 100 ; i++){
            if (Math.sqrt(i) % 1 == 0){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insotheodieukien(HandleArray handleArray){
        for (int i = 0 ; i <= 100 ; i++){
            boolean dk = handleArray.xulydieukien(i);
            if (dk){
                Log.d("BBB",i + "");
            }
        }
    }
}
