package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence16Request
import evaluatetestperformance.dependence.model.Dependence16Response

class Dependence16Class {

    fun getName(request: Dependence16Request): Dependence16Response = Dependence16Response(name16 = "${request.index16}")
}
