import javax.naming.Name

class Hund {
   var rasse="Beegle"
    var name= "Name"
    var alter= 10

    constructor(name:String,alter:Int,Rasse:String){
        this.rasse=Rasse
        this.name=name
        this.alter=alter

    }

    fun bellen(){
        println("Woof")

    }
    fun altern(){
        alter=+ 1
    }


}

