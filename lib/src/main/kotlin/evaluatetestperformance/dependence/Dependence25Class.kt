package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence25Request
import evaluatetestperformance.dependence.model.Dependence25Response

class Dependence25Class {

    fun getName(request: Dependence25Request): Dependence25Response = Dependence25Response(name25 = "${request.index25}")
}
