package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence20Request
import evaluatetestperformance.dependence.model.Dependence20Response

class Dependence20Class {

    fun getName(request: Dependence20Request): Dependence20Response = Dependence20Response(name20 = "${request.index20}")
}
