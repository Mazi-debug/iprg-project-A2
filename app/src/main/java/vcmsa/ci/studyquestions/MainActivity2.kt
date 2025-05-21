package vcmsa.ci.studyquestions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val question1 = findViewById<TextView>(R.id.questiontext)
        val true1 = findViewById<Button>(R.id.trueclick)
        val false1 = findViewById<Button>(R.id.falseclick)
        val nextpage1 = findViewById<Button>(R.id.nextpage)
        val feedback = findViewById<TextView>(R.id.feedbacktext)

        val strQuestions = arrayOf<String>("Is Darth Vader Luke Skywalker's father ?","Is the Falcon Captain America's successor ?",
            "Is Adonis Creed the boxing feather weight champion ?", "The original Spider Man is better than the Tom Holland remake ?",
            "Pacific Rim is all about giant manlike robots that fight monsters ?")

        val Answers = arrayOf<Boolean>(true, true, false, false, true)
        val numScore =  0
        val numIndex = 0

        true1.setOnClickListener{
            feedback1.text = "Correct !"
            score1 = score + 1
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