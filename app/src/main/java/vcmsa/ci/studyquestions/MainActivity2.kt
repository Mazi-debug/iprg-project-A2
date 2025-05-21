package vcmsa.ci.studyquestions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

                val question1 = findViewById<TextView>(R.id.questiontext)
                val true1 = findViewById<Button>(R.id.true1)
                val false1 = findViewById<Button>(R.id.false1)
                val nextpage1 = findViewById<Button>(R.id.nextpage1)
                val feedback1 = findViewById<TextView>(R.id.feedback1)

                var score1 = 0

                true1.setOnClickListener{
                    feedback1.text = "Correct !"
                    score1 = score1 + 1
                }

                false1.setOnClickListener {
                    feedback1.text = "Incorrect !"
                    score1 = score1 + 0
                }

                nextpage1.setOnClickListener{
                    val intent = Intent (this, MainActivity3::class.java)

                    startActivity(intent)
                }
            }
        }

        val moviequestions = arrayOf<String>("Is Darth Vader Luke Skywalker's father ?","Is the Falcon Captain America's successor ?",
            "Is Adonis Creed the boxing feather weight champion ?", "The original Spider Man is better than the Tom Holland remake ?",
            "Pacific Rim is all about giant manlike robots that fight monsters ?")

        val movieanswers = arrayOf<Boolean>(true, true, false, false, true)
    }
}