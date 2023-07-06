package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence11Request
import evaluatetestperformance.dependence.model.Dependence11Response

class Dependence11Class {

    fun getName(request: Dependence11Request): Dependence11Response = Dependence11Response(name11 = "${request.index11}")
}
