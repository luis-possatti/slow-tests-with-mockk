package evaluatetestperformance

import io.kotest.core.spec.style.FreeSpec
import io.mockk.MockKAnnotations

abstract class BaseSpec(body: (FreeSpec.() -> Unit)? = null) : FreeSpec({
    beforeTest { MockKAnnotations.init(this) }
    body?.invoke(this)
})
