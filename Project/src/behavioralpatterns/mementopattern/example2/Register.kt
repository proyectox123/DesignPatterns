package behavioralpatterns.mementopattern.example2

class Register(private val name: String, private val age: Int, private val isActive: Boolean) {

    fun getRegister(){
        println("Register -> name: $name age: $age isActive: $isActive")
    }
}