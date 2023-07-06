package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence26Request
import evaluatetestperformance.dependence.model.Dependence26Response

class Dependence26Class {

    fun getName(request: Dependence26Request): Dependence26Response = Dependence26Response(name26 = "${request.index26}")
}
