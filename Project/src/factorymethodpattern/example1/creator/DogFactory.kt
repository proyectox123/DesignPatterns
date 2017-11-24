package factorymethodpattern.example1.creator

import factorymethodpattern.example1.product.Dog
import factorymethodpattern.example1.concretecreate.SiberianHusky
import factorymethodpattern.example1.concretecreate.Poodle
import factorymethodpattern.example1.concretecreate.Rottweiler


class DogFactory {
    companion object {
        fun getDog(criteria:String ) : Dog {
            return when {
                criteria.equals("small") -> Poodle()
                criteria.equals("big") -> Rottweiler()
                criteria.equals("working") -> SiberianHusky()
                else -> throw Exception("There are no dogs with this criteria!")
            }
        }
    }
}