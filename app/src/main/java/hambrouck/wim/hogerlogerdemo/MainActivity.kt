package hambrouck.wim.hogerlogerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNumber: TextView = findViewById(R.id.txt_number)
        txtNumber.text = "5"


        val edtNumber: EditText = findViewById(R.id.editTextNumber)

        // invoer opvragen
        val tekst = edtNumber.text.toString()

        // tekst converteren naar getal
        var getal: Int
        getal = tekst.toInt()


    }

    fun buttonClicked(view: View)
    {
        if (view.id == R.id.btn_lower)
        {
            Toast.makeText(this, getString(R.string.lower_clicked), Toast.LENGTH_SHORT).show()

        } else if (view.id == R.id.btn_equal) {
            Toast.makeText(this, getString(R.string.equal_clicked), Toast.LENGTH_SHORT).show()
        } else if (view.id == R.id.btn_higher) {
            Log.d("buttonClicked", "Knop higher ingedrukt")
        }
    }
}