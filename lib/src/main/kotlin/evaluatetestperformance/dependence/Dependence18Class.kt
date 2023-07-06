package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence18Request
import evaluatetestperformance.dependence.model.Dependence18Response

class Dependence18Class {

    fun getName(request: Dependence18Request): Dependence18Response = Dependence18Response(name18 = "${request.index18}")
}
