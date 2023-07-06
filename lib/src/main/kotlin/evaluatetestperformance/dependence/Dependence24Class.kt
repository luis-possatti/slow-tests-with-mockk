package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence24Request
import evaluatetestperformance.dependence.model.Dependence24Response

class Dependence24Class {

    fun getName(request: Dependence24Request): Dependence24Response = Dependence24Response(name24 = "${request.index24}")
}
