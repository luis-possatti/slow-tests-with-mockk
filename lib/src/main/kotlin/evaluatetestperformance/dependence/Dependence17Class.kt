package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence17Request
import evaluatetestperformance.dependence.model.Dependence17Response

class Dependence17Class {

    fun getName(request: Dependence17Request): Dependence17Response = Dependence17Response(name17 = "${request.index17}")
}
