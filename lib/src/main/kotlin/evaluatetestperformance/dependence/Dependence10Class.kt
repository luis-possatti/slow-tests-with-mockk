package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence10Request
import evaluatetestperformance.dependence.model.Dependence10Response

class Dependence10Class {

    fun getName(request: Dependence10Request): Dependence10Response = Dependence10Response(name10 = "${request.index10}")
}
