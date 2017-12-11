package behavioralpatterns.statepattern

enum class State{
    TURN_OFF{
        override fun openDoor() : State{
            println("Turn Off -> Open Door")
            return OPEN_DOOR
        }

        override fun setMinPower() : State{
            println("Turn Off -> Set Min Power")
            return MIN_POWER
        }

        override fun setMaxPower() : State{
            println("Turn Off -> Set Max Power")
            return MAX_POWER
        }
    },
    OPEN_DOOR{
        override fun turnOff() : State{
            println("Open Door -> Turn Off")
            return TURN_OFF
        }
    },
    MAX_POWER{
        override fun openDoor() : State{
            println("Set Max Power -> Open Door")
            return OPEN_DOOR
        }

        override fun setMinPower() : State{
            println("Set Max Power -> Set Min Power")
            return MIN_POWER
        }

        override fun cooking() : State{
            println("Set Max Power -> Cooking")
            return COOKING
        }
    },
    MIN_POWER{
        override fun openDoor() : State{
            println("Set Min Power -> Open Door")
            return OPEN_DOOR
        }

        override fun setMaxPower() : State{
            println("Set Min Power -> Set Max Power")
            return MAX_POWER
        }

        override fun cooking() : State{
            println("Set Min Power -> Cooking")
            return COOKING
        }
    },
    COOKING{
        override fun turnOff() : State{
            println("Cooking -> Turn Off")
            return TURN_OFF
        }
    };

    open fun turnOff() : State {
        println("It is not allowed operate from $this")
        return this
    }

    open fun openDoor() : State {
        println("It is not allowed operate from $this")
        return this
    }

    open fun setMaxPower() : State {
        println("It is not allowed operate from $this")
        return this
    }

    open fun setMinPower() : State {
        println("It is not allowed operate from $this")
        return this
    }

    open fun cooking() : State {
        println("It is not allowed operate from $this")
        return this
    }
}

//enum class State{
//    TURN_OFF{
//        override fun openDoor() : State{
//            println("Turn Off -> Open Door")
//            return OPEN_DOOR
//        }
//
//        override fun setMinPower() : State{
//            println("Turn Off -> Set Min Power")
//            return MIN_POWER
//        }
//
//        override fun setMaxPower() : State{
//            println("Turn Off -> Set Max Power")
//            return MAX_POWER
//        }
//    },
//    OPEN_DOOR{
//        override fun turnOff() : State{
//            println("Open Door -> Turn Off")
//            return TURN_OFF
//        }
//    },
//    MAX_POWER{
//        override fun openDoor() : State{
//            println("Set Max Power -> Open Door")
//            return OPEN_DOOR
//        }
//
//        override fun setMinPower() : State{
//            println("Set Max Power -> Set Min Power")
//            return MIN_POWER
//        }
//
//        override fun cooking() : State{
//            println("Set Max Power -> Cooking")
//            return COOKING
//        }
//    },
//    MIN_POWER{
//        override fun openDoor() : State{
//            println("Set Min Power -> Open Door")
//            return OPEN_DOOR
//        }
//
//        override fun setMaxPower() : State{
//            println("Set Min Power -> Set Max Power")
//            return MAX_POWER
//        }
//
//        override fun cooking() : State{
//            println("Set Min Power -> Cooking")
//            return COOKING
//        }
//    },
//    COOKING{
//        override fun turnOff() : State{
//            println("Cooking -> Turn Off")
//            return TURN_OFF
//        }
//    };
//
//    open fun turnOff() : State {
//        println("It is not allowed operate from $this")
//        return this
//    }
//
//    open fun openDoor() : State {
//        println("It is not allowed operate from $this")
//        return this
//    }
//
//    open fun setMaxPower() : State {
//        println("It is not allowed operate from $this")
//        return this
//    }
//
//    open fun setMinPower() : State {
//        println("It is not allowed operate from $this")
//        return this
//    }
//
//    open fun cooking() : State {
//        println("It is not allowed operate from $this")
//        return this
//    }
//}