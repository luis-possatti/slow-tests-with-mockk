package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence1Request
import evaluatetestperformance.dependence.model.Dependence1Response

class Dependence1Class {

    fun getName(request: Dependence1Request): Dependence1Response = Dependence1Response(name1 = "${request.index1}")
}
