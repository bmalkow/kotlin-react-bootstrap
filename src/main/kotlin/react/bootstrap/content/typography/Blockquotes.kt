package react.bootstrap.content.typography

import kotlinx.html.BLOCKQUOTE
import kotlinx.html.DIV
import react.RBuilder
import react.RComponent
import react.RState
import react.ReactElement
import react.bootstrap.appendClass
import react.bootstrap.lib.ClassNames
import react.bootstrap.lib.WithRDOMBuilderBlock
import react.dom.RDOMBuilder
import react.dom.WithClassName
import react.dom.blockQuote
import react.dom.div

fun RBuilder.blockQuote(classes: String? = null, block: RDOMBuilder<BLOCKQUOTE>.() -> Unit): ReactElement =
    blockQuote(classes = classes.appendClass(ClassNames.BLOCKQUOTE), block = block)

fun RBuilder.blockQuoteFooter(classes: String? = null, block: RDOMBuilder<DIV>.() -> Unit): ReactElement =
    child(BlockQuoteFooter::class) {
        attrs {
            this.className = classes
            this.block = block
        }
    }

class BlockQuoteFooter : RComponent<BlockQuoteFooter.Props, RState>() {
    override fun RBuilder.render() {
        div(classes = props.className.appendClass(ClassNames.BLOCKQUOTE_FOOTER), block = props.block)
    }

    interface Props : WithClassName, WithRDOMBuilderBlock<DIV>
}
