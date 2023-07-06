package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence21Request
import evaluatetestperformance.dependence.model.Dependence21Response

class Dependence21Class {

    fun getName(request: Dependence21Request): Dependence21Response = Dependence21Response(name21 = "${request.index21}")
}
