package evaluatetestperformance.dependence

import evaluatetestperformance.dependence.model.Dependence13Request
import evaluatetestperformance.dependence.model.Dependence13Response

class Dependence13Class {

    fun getName(request: Dependence13Request): Dependence13Response = Dependence13Response(name13 = "${request.index13}")
}
