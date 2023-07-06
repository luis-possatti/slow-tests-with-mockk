package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence14Request
import evaluatetestperformance.dependence.model.Dependence14Response

class Dependence14Class {

    fun getName(request: Dependence14Request): Dependence14Response = Dependence14Response(name14 = "${request.index14}")
}
