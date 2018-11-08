package bg.rf.chiraggada.encrypt;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView output;
    Button Encrypt, copy, send;
//    ClipboardManager myClipboard;
//    ClipData myClip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.message);
        Encrypt = findViewById(R.id.encrypt_this);
        copy = findViewById(R.id.copy);
        send = findViewById(R.id.send);
        output = findViewById(R.id.out_put);

        //myClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);


        Encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Message cannot be empty", Toast.LENGTH_LONG).show();
                } else {
                    String msg = editText.getText().toString();
                    StringBuffer buffer = new StringBuffer(msg);
                    buffer.reverse();
                    output.setText(buffer);
                    Toast.makeText(getApplicationContext(), buffer, Toast.LENGTH_SHORT).show();

                }
            }
        });

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here copy code will come
//                myClip = ClipData.newPlainText("text",buffer );
//                myClipboard.setPrimaryClip(myClip);

//                Toast.makeText(getApplicationContext(), "Text Copied",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //intent to whatsapp
//                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
//                whatsappIntent.setType("text/plain");
//                whatsappIntent.setPackage("com.whatsapp");
//                whatsappIntent.putExtra(Intent.EXTRA_TEXT, buffer);
            }
        });
    }


}
