package uz.silence.mathgamepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import uz.silence.mathgamepractice.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var javob = 0
    var randomOne = 0
    var randomTwo = 0
    var randomThree = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        random()
        randomSonSaqla()
        radEkranYoz()


        binding.refreshB.setOnClickListener{
            random()
            randomSonSaqla()
            radEkranYoz()
            binding.radGroup.clearCheck()
        }

        binding.btnNext.setOnClickListener {

            if(binding.radA.isChecked){
                if (binding.radA.text.toString() == javob.toString()){
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                    random()
                    randomSonSaqla()
                    radEkranYoz()
                    binding.radGroup.clearCheck()
                }else{
                    Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
                }
            }

            if(binding.radB.isChecked){
                if (binding.radB.text.toString() == javob.toString()){
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                    random()
                    randomSonSaqla()
                    radEkranYoz()
                    binding.radGroup.clearCheck()
                }else{
                    Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
                }
            }

            if(binding.radC.isChecked){
                if (binding.radC.text.toString() == javob.toString()){
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                    random()
                    randomSonSaqla()
                    radEkranYoz()
                    binding.radGroup.clearCheck()
                }else{
                    Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
                }
            }

            if(binding.radD.isChecked){
                if (binding.radD.text.toString() == javob.toString()){
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                    random()
                    randomSonSaqla()
                    radEkranYoz()
                    binding.radGroup.clearCheck()
                }else{
                    Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
                }
            }

        }

    }

    private fun random() {

        var numberOne = Random().nextInt(20)
        var numberTwo = Random().nextInt(20)

        var amal = Random().nextInt(4)

        when (amal) {

            0 -> {
                binding.txtMisol.text = "$numberOne + $numberTwo = "
                javob = numberOne + numberTwo
            }

            1 -> {
                binding.txtMisol.text = "$numberOne - $numberTwo = "
                javob = numberOne - numberTwo
            }

            2 -> {
                binding.txtMisol.text = "$numberOne * $numberTwo = "
                javob = numberOne * numberTwo
            }

            3 -> {
                try {

                    if (numberOne % numberTwo != 0) throw Exception()

                    binding.txtMisol.text = "$numberOne / $numberTwo"
                    javob = numberOne / numberTwo

                } catch (e: Exception) {
                    random()
                }
            }
        }
    }

    fun randomSonSaqla(){

        randomOne = Random().nextInt(20)
        randomTwo = Random().nextInt(20)
        randomThree = Random().nextInt(20)

        if(randomOne == randomTwo || randomTwo == randomThree || randomOne == randomThree){
            randomSonSaqla()
        }

    }

    fun radEkranYoz(){

        var tj = Random().nextInt(4)

        when(tj){

            0 -> {

                binding.radA.text = javob.toString()

                binding.radB.text = randomOne.toString()
                binding.radC.text = randomTwo.toString()
                binding.radD.text = randomThree.toString()

            }

            1 -> {

                binding.radB.text = javob.toString()

                binding.radA.text = randomOne.toString()
                binding.radC.text = randomTwo.toString()
                binding.radD.text = randomThree.toString()

            }

            2 -> {

                binding.radC.text = javob.toString()

                binding.radB.text = randomOne.toString()
                binding.radA.text = randomTwo.toString()
                binding.radD.text = randomThree.toString()

            }

            3 -> {

                binding.radD.text = javob.toString()

                binding.radB.text = randomOne.toString()
                binding.radC.text = randomTwo.toString()
                binding.radA.text = randomThree.toString()

            }

        }

    }

}