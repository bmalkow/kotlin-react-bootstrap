package react.bootstrap.site.components.docs.layout.grid

import react.RBuilder
import react.bootstrap.layout.container
import react.bootstrap.layout.grid.Offsets
import react.bootstrap.layout.grid.Orderings
import react.bootstrap.layout.grid.Sizes
import react.bootstrap.layout.grid.col
import react.bootstrap.layout.grid.row
import react.bootstrap.site.components.docs.colFun
import react.bootstrap.site.components.docs.containerFun
import react.bootstrap.site.components.docs.fixings.contentTitle
import react.bootstrap.site.components.docs.fixings.example
import react.bootstrap.site.components.docs.fixings.exampleRow
import react.bootstrap.site.components.docs.fixings.kotlinExample
import react.bootstrap.site.components.docs.kt
import react.bootstrap.site.components.docs.rowFun
import react.dom.a
import react.dom.br
import react.dom.code
import react.dom.h3
import react.dom.h4
import react.dom.p
import react.dom.strong

fun RBuilder.reordering() {
    val offsetsName = Offsets::class.simpleName
    val orderingsName = Orderings::class.simpleName

    contentTitle("Reordering") { }
    contentTitle(RBuilder::h3, "$orderingsName enum") { }
    p {
        +"Use "; code { +"$orderingsName" }; +" values for controlling the "; strong { +"visual order" }
        +" of your content. The classes are responsive, so you can set the "; code { +"order" }; +" by breakpoint "
        +"(e.g., "; "" + code { +"all = ${Orderings.ORD_1.kt}, md = ${Orderings.ORD_2.kt}" }; +"). Includes support for"
        +" 1 through 12 across all five grid tiers."
    }
    exampleRow {
        example {
            container {
                row {
                    col { +"First in DOM, no order applied" }
                    col(all = Orderings.ORD_12) { +" Second in DOM, with a larger order" }
                    col(all = Orderings.ORD_1) { +"Third in DOM, with an order of 1" }
                }
            }
        }
        kotlinExample {
            +"$containerFun {"; br { }
            +"    $rowFun {"; br { }
            +"        $colFun { +\"First in DOM, no order applied\" }"; br { }
            +"        $colFun(all = ${Orderings.ORD_12.kt}) { +\" Second in DOM, with a larger order\" }"; br { }
            +"        $colFun(all = ${Orderings.ORD_1.kt}) { +\"Third in DOM, with an order of 1\" }"; br { }
            +"    }"; br { }
            +"}"
        }
    }
    contentTitle(RBuilder::h3, "Offsetting columns") { }
    p {
        +"You can offset grid columns in two ways: our "; code { +"$offsetsName" }; +" values and Bootstrap's "
        a("https://getbootstrap.com/docs/4.4/utilities/spacing/") { +"margin utilities" }; +". Grid classes are "
        +"sized to match columns while margins are more useful for quick layouts where the width of the offset is "
        +"variable."
    }
    contentTitle(RBuilder::h4, "$offsetsName enum") { }
    p {
        +"Move columns to the right by setting "; code { +"$offsetsName" }; +" enum values. These increase the left "
        +"margin of a column by "; code { +"*" }; +" columns. For example, "
        code {
            +"md = ${Sizes.SZ_4.kt} off ${Offsets.OFF_4.kt}"
        }
        +" moves "; code { +"$colFun(md = ${Sizes.SZ_4.kt}) { }" }; +" over four columns."
    }
    val off = Sizes::off.name
    exampleRow {
        example {
            container {
                row {
                    col(md = Sizes.SZ_4) { +"md = ${Sizes.SZ_4.kt}" }
                    col(md = Sizes.SZ_4 off Offsets.OFF_4) { +"md = ${Sizes.SZ_4.kt} $off ${Offsets.OFF_4.kt}" }
                }
                row {
                    for (x in 1..2) {
                        col(md = Sizes.SZ_3 off Offsets.OFF_3) { +"md = ${Sizes.SZ_3.kt} $off ${Offsets.OFF_3.kt}" }
                    }
                }
                row {
                    col(md = Sizes.SZ_6 off Offsets.OFF_3) { +"md = ${Sizes.SZ_6.kt} $off ${Offsets.OFF_3.kt}" }
                }
            }
        }
        kotlinExample {
            +"$containerFun {"; br { }
            +"    $rowFun {"; br { }
            +"        $colFun(md = ${Sizes.SZ_4.kt}) { +\"md = ${Sizes.SZ_4.kt}\" }"; br { }
            +"        $colFun(md = ${Sizes.SZ_4.kt} $off ${Offsets.OFF_4.kt}) { +\"md = ${Sizes.SZ_4.kt} $off "
            +"${Offsets.OFF_4.kt}\" } "; br { }
            +"    }"; br { }

            +"    $rowFun {"; br { }
            for (x in 1..2) {
                +"        $colFun(md = ${Sizes.SZ_3.kt} $off ${Offsets.OFF_3.kt}) { +\"md = ${Sizes.SZ_3.kt} $off "
                +"${Offsets.OFF_3.kt}\" } "; br { }
            }
            +"    }"; br { }

            +"    $rowFun {"; br { }
            +"        $colFun(md = ${Sizes.SZ_6.kt} $off ${Offsets.OFF_3.kt}) { +\"md = ${Sizes.SZ_6.kt} $off "
            +"${Offsets.OFF_3.kt}\" }"; br { }
            +"    }"; br { }
            +"}"
        }
    }
}
