package hambrouck.wim.hogerlogerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNumber: TextView = findViewById(R.id.txt_number)
        txtNumber.text = "5"
    }

    fun buttonClicked(view: View)
    {
        if (view.id == R.id.btn_lower)
        {
            Toast.makeText(this, "You clicked lower", Toast.LENGTH_SHORT).show()

        } else if (view.id == R.id.btn_equal) {
            Toast.makeText(this, "You clicked equal", Toast.LENGTH_SHORT).show()
        } else if (view.id == R.id.btn_higher) {
            Log.d("buttonClicked", "Knop higher ingedrukt")
        }
    }
}