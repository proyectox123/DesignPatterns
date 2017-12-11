package behavioralpatterns.statepattern

class Microwave {

    private var state: State = State.TURN_OFF

    fun turnOff(){
        state = state.turnOff()
    }

    fun openDoor(){
        state = state.openDoor()
    }

    fun setMinPower(){
        state = state.setMinPower()
    }

    fun setMaxPower(){
        state = state.setMaxPower()
    }

    fun cooking(){
        state = state.cooking()
    }
}