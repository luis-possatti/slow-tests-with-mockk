package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence27Request
import evaluatetestperformance.dependence.model.Dependence27Response

class Dependence27Class {

    fun getName(request: Dependence27Request): Dependence27Response = Dependence27Response(name27 = "${request.index27}")
}
