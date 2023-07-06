package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence7Request
import evaluatetestperformance.dependence.model.Dependence7Response

class Dependence7Class {

    fun getName(request: Dependence7Request): Dependence7Response = Dependence7Response(name7 = "${request.index7}")
}
