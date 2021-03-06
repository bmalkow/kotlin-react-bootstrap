package react.bootstrap.content.tables

import kotlinx.html.TR
import react.RBuilder
import react.ReactElement
import react.bootstrap.appendClass
import react.dom.RDOMBuilder
import react.dom.tr

fun RBuilder.tr(
    contextualStyle: ContextualStyle? = null,
    classes: String? = null,
    block: RDOMBuilder<TR>.() -> Unit
): ReactElement =
    tr(
        classes = contextualStyle?.let { classes.appendClass(it.className) } ?: classes,
        block = block
    )
