package react.bootstrap.layout

import react.RBuilder
import react.RComponent
import react.RElementBuilder
import react.RProps
import react.RState
import react.ReactElement
import react.bootstrap.appendClass
import react.bootstrap.lib.ClassNameEnum
import react.bootstrap.lib.ClassNames
import react.dom.div

fun RBuilder.container(
    viscosity: Container.Viscosities? = null,
    classes: String? = null,
    block: RElementBuilder<Container.Props>.() -> Unit
): ReactElement = child(Container::class) {
    attrs {
        this.viscosity = viscosity
        this.classes = classes
    }
    block()
}

class Container : RComponent<Container.Props, RState>() {
    enum class Viscosities(override val className: ClassNames) : ClassNameEnum {
        FLUID(ClassNames.CONTAINER_FLUID),
        SM(ClassNames.CONTAINER_SM),
        MD(ClassNames.CONTAINER_MD),
        LG(ClassNames.CONTAINER_LG),
        XL(ClassNames.CONTAINER_XL);
    }

    interface Props : RProps {
        var viscosity: Viscosities?
        var classes: String?
    }

    override fun RBuilder.render() {
        val className: ClassNames = props.viscosity?.className ?: ClassNames.CONTAINER

        div(classes = props.classes.appendClass(className)) {
            children()
        }
    }
}
