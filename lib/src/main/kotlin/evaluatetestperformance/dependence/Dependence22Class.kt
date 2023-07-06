package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence22Request
import evaluatetestperformance.dependence.model.Dependence22Response

class Dependence22Class {

    fun getName(request: Dependence22Request): Dependence22Response = Dependence22Response(name22 = "${request.index22}")
}
