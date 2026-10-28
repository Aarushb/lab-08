package com.example.lab_8

// models a wizard's mana and spell power, and the spells it can cast at a mana cost
class Wizard(val name: String, var mana: Int, var spellPower: Int) {
    // casts the named spell if there is enough mana, returning the damage dealt or 0 if the spell is unknown or unaffordable
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0 // not enough mana
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0 // not enough mana
            }
            else -> {
                return 0 // invalid spell
            }
        }
    }
}