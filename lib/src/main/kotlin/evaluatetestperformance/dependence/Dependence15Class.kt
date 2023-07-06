package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence15Request
import evaluatetestperformance.dependence.model.Dependence15Response

class Dependence15Class {

    fun getName(request: Dependence15Request): Dependence15Response = Dependence15Response(name15 = "${request.index15}")
}
