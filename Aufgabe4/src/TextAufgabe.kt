



class GameCharacter {
    var name: String
    var hasWeapon: Boolean
    var level: Int

    constructor(name: String, hasWeapon: Boolean, level: Int) {
        this.name = name
        this.hasWeapon = hasWeapon
        this.level = level
    }

}
   //Schreibe hier deine Antwort auf:


var gameCharacter1: GameCharacter = GameCharacter("Legolas", false, 20)
var gameCharacter2: GameCharacter = GameCharacter("Frodo", true, 3)

println(gameCharacter1.name + " ist Level " + gameCharacter1.level +
". Hat er eine Waffe? " + gameCharacter1.hasWeapon)
println(gameCharacter2.name + " ist Level " + gameCharacter2.level +
". Hat er eine Waffe? " + gameCharacter2.hasWeapon)


  //Schreibe hier deine Antwort auf:


// Frodo findet ein magisches Amulett
gameCharacter2.level = 5
// Legolas baut sich einen Bogen aus Zweigen
gameCharacter1.hasWeapon = true
// Legolas besiegt eine Armee Orks
gameCharacter1.level = 50
// Legolas Bogen ist kaputtgegangen
gameCharacter1.hasWeapon = false
// Frodo kaempft in einer Hoelle
gameCharacter2.level = 7
// Frodo muss fliehen und verliert sein Schwert
gameCharacter2.hasWeapon = false

println(gameCharacter1.name + " ist Level " + gameCharacter1.level +
". Hat er eine Waffe? " + gameCharacter1.hasWeapon)
println(gameCharacter2.name + " ist Level " + gameCharacter2.level +
". Hat er eine Waffe? " + gameCharacter2.hasWeapon)