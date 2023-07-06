package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence23Request
import evaluatetestperformance.dependence.model.Dependence23Response

class Dependence23Class {

    fun getName(request: Dependence23Request): Dependence23Response = Dependence23Response(name23 = "${request.index23}")
}
