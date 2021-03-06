@file:Suppress("NAME_SHADOWING")

package react.bootstrap.site.components.docs.layout.grid

import react.RBuilder
import react.bootstrap.layout.container
import react.bootstrap.layout.grid.ColAttributes
import react.bootstrap.layout.grid.ColCounts
import react.bootstrap.layout.grid.Sizes
import react.bootstrap.layout.grid.col
import react.bootstrap.layout.grid.row
import react.bootstrap.site.components.docs.fixings.codeBox
import react.bootstrap.site.components.docs.fixings.contentTitle
import react.bootstrap.site.components.docs.fixings.example
import react.bootstrap.site.components.docs.fixings.exampleRow
import react.bootstrap.site.components.docs.formattedText
import react.bootstrap.site.components.docs.kt
import react.bootstrap.site.components.docs.ln
import react.dom.em
import react.dom.h3
import react.dom.p

internal fun RBuilder.responsiveClasses() {
    contentTitle("Responsive classes")
    p {
        +"""
            Bootstrap’s grid includes five tiers of predefined classes for building complex responsive layouts.
            Customize the size of your columns on extra small, small, medium, large, or extra large devices however you
            see fit.
        """.trimIndent()
    }
    contentTitle(RBuilder::h3, "All breakpoints")
    formattedText {
        """
            For grids that are the same from the smallest of devices to the largest, set the <all =
            ${ColAttributes::class.simpleName}?|code>-argument. Specify a numbered <${Sizes::class.simpleName}|code>
            enum value when you need a particularly sized column; otherwise, feel free to not set the argument at all,
            which defaults to <all = ${Sizes.EQ.kt}|code>.
        """.trimIndent()
    }
    exampleRow {
        example {
            container {
                row {
                    for (x in 1..4) {
                        col { em { +"all = ${Sizes.EQ.kt}" } }
                    }
                }
                row {
                    col(all = Sizes.SZ_8) { +"all = ${Sizes.SZ_8.kt}" }
                    col(all = Sizes.SZ_4) { +"all = ${Sizes.SZ_4.kt}" }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(Sizes::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktRow(il) { il ->
                    for (x in 1..4) {
                        ln(il) { +"$colFun { em { +\"all = ${Sizes.EQ.kt}\" } }" }
                    }
                }
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = ${Sizes.SZ_8.kt}) { +\"all = ${Sizes.SZ_8.kt}\" }" }
                    ln(il) { +"$colFun(all = ${Sizes.SZ_4.kt}) { +\"all = ${Sizes.SZ_4.kt}\" }" }
                }
            }
        }
    }
    contentTitle(RBuilder::h3, "Stacked to horizontal")
    formattedText {
        """
            By setting the <sm = ${ColAttributes::class.simpleName}?|code>-argument, you can create a basic grid system
            that starts out stacked and becomes horizontal at the small breakpoint (<sm|code>).
        """.trimIndent()
    }
    exampleRow {
        example {
            container {
                row {
                    col(sm = Sizes.SZ_8) { +"sm = ${Sizes.SZ_8.kt}" }
                    col(sm = Sizes.SZ_4) { +"sm = ${Sizes.SZ_4.kt}" }
                }
                row {
                    for (x in 1..3) {
                        col(sm = Sizes.EQ) { +"sm = ${Sizes.EQ.kt}" }
                    }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(Sizes::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktRow(il) { il ->
                    ln(il) { +"$colFun(sm = ${Sizes.SZ_8.kt}) { +\"sm = ${Sizes.SZ_8.kt}\" }" }
                    ln(il) { +"$colFun(sm = ${Sizes.SZ_4.kt}) { +\"sm = ${Sizes.SZ_4.kt}\" }" }
                }
                ktRow(il) { il ->
                    for (x in 1..3) {
                        ln(il) { +"$colFun(sm = ${Sizes.EQ.kt}) { +\"sm = ${Sizes.EQ.kt}\" }" }
                    }
                }
            }
        }
    }
    contentTitle(RBuilder::h3, "Mix and match")
    p {
        +"""
            Don’t want your columns to simply stack in some grid tiers? Use a combination of different classes for each
            tier as needed. See the example below for a better idea of how it all works.
        """.trimIndent()
    }
    exampleRow {
        example {
            container {
                row {
                    col(md = Sizes.SZ_8) { +"md = ${Sizes.SZ_8.kt}" }
                    col(all = Sizes.SZ_6, md = Sizes.SZ_4) { +"all = ${Sizes.SZ_6.kt}, md = ${Sizes.SZ_4.kt}" }
                }
                row {
                    for (x in 1..3) {
                        col(all = Sizes.SZ_6, md = Sizes.SZ_4) { +"all = ${Sizes.SZ_6.kt}, md = ${Sizes.SZ_4.kt}" }
                    }
                }
                row {
                    for (x in 1..2) {
                        col(all = Sizes.SZ_6) { +"all = ${Sizes.SZ_6.kt}" }
                    }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(Sizes::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktRow(il) { il ->
                    ln(il) { +"// Stack the columns on mobile by making one full-width and the other half-width" }
                    ln(il) { +"$colFun(md = ${Sizes.SZ_8.kt}) { +\"md = ${Sizes.SZ_8.kt}\" }" }
                    ln(il) {
                        +"$colFun(all = ${Sizes.SZ_6.kt}, md = ${Sizes.SZ_4.kt}) { +\"all = ${Sizes.SZ_6.kt}, "
                        +"md = ${Sizes.SZ_4.kt}\" }"
                    }
                }
                ktRow(il) { il ->
                    ln(il) { +"// Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop" }
                    for (x in 1..3) {
                        ln(il) {
                            +"$colFun(all = ${Sizes.SZ_6.kt}, md = ${Sizes.SZ_4.kt}) { +\"all = ${Sizes.SZ_6.kt}, md = "
                            +"${Sizes.SZ_4.kt}\" }"
                        }
                    }
                }
                ktRow(il) { il ->
                    ln(2) { +"// Columns are always 50% wide, on mobile and desktop" }
                    for (x in 1..2) {
                        ln(il) { +"$colFun(all = ${Sizes.SZ_6.kt}) { +\"all = ${Sizes.SZ_6.kt}\" }" }
                    }
                }
            }
        }
    }
    contentTitle(RBuilder::h3, "Row columns")
    formattedText {
        """
            Set the <${ColCounts::class.simpleName}|code>-argument to quickly set the number of columns that best render
            your content and layout. The row columns classes are set on the parent <$rowFun { }|code> as a shortcut.
        """.trimIndent()
    }
    exampleRow {
        example {
            container {
                row(all = ColCounts.CNT_2) {
                    for (x in 1..4) {
                        col { +"Column" }
                    }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(ColCounts::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktBlock(il, "$rowFun(all = ${ColCounts.CNT_2.kt})") { il ->
                    for (x in 1..4) {
                        ln(il) { +"$colFun { +\"Column\" }" }
                    }
                }
            }
        }
    }
    exampleRow {
        example {
            container {
                row(all = ColCounts.CNT_3) {
                    for (x in 1..4) {
                        col { +"Column" }
                    }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(ColCounts::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktBlock(il, "$rowFun(all = ${ColCounts.CNT_3.kt})") { il ->
                    for (x in 1..4) {
                        ln(il) { +"$colFun { +\"Column\" }" }
                    }
                }
            }
        }
    }
    exampleRow {
        example {
            container {
                row(all = ColCounts.CNT_4) {
                    for (x in 1..4) {
                        col { +"Column" }
                    }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(ColCounts::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktBlock(il, "$rowFun(all = ${ColCounts.CNT_4.kt})") { il ->
                    for (x in 1..4) {
                        ln(il) { +"$colFun { +\"Column\" }" }
                    }
                }
            }
        }
    }
    exampleRow {
        example {
            container {
                row(all = ColCounts.CNT_4) {
                    for (x in 1..2) {
                        col { +"Column" }
                    }
                    col(all = Sizes.SZ_6) { +"Colum" }
                    col { +"Column" }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(ColCounts::class)
            gridEnumImport(Sizes::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktBlock(il, "$rowFun(all = ${ColCounts.CNT_4.kt})") { il ->
                    for (x in 1..2) {
                        ln(il) { +"$colFun { +\"Column\" }" }
                    }
                }
                ktBlock(il, "$rowFun(all = ${ColCounts.CNT_4.kt})") { il ->
                    ln(il) { +"$colFun(all = ${Sizes.SZ_6.kt}) { +\"Column\" }" }
                }
            }
        }
    }
    exampleRow {
        example {
            container {
                row(all = ColCounts.CNT_1, sm = ColCounts.CNT_2, md = ColCounts.CNT_4) {
                    for (x in 1..4) {
                        col { +"Column" }
                    }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(ColCounts::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktBlock(
                    il,
                    "$rowFun(all = ${ColCounts.CNT_1.kt}, sm = ${ColCounts.CNT_2.kt}, md = ${ColCounts.CNT_4.kt})"
                ) { il ->
                    for (x in 1..4) {
                        ln(il) { +"$colFun { +\"Column\" }" }
                    }
                }
            }
        }
    }
    contentTitle(RBuilder::h3, "No gutters")
    formattedText {
        """
            The gutters between columns in Bootstrap's predefined grid classes can be removed by setting <gutters =
            false|code>. This removes the negative <margin|code>s from <$rowFun { }|code> and the horizontal
            <padding|code> from all immediate children columns.
        """.trimIndent()
    }
    p {
        +"""
            In practice, here’s how it looks. Note you can continue to use this with all other predefined grid settings
            (including column widths, responsive tiers, reorders, and more).
        """.trimIndent()
    }
    exampleRow {
        example {
            container {
                row(gutters = false) {
                    col(sm = Sizes.SZ_6, md = Sizes.SZ_8) { +"sm = ${Sizes.SZ_6.kt}, md = ${Sizes.SZ_8.kt}" }
                    col(all = Sizes.SZ_6, md = Sizes.SZ_4) { +"all = ${Sizes.SZ_6.kt}, md = ${Sizes.SZ_4.kt}" }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(Sizes::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktBlock(il, "$rowFun(gutters = false)") { il ->
                    ln(il) {
                        +"$colFun(sm = ${Sizes.SZ_6.kt}, md = ${Sizes.SZ_8.kt}) { +\"sm = ${Sizes.SZ_6.kt}, md"
                        +" = ${Sizes.SZ_8.kt}\" }"
                    }
                    ln(il) {
                        +"$colFun(all = ${Sizes.SZ_6.kt}, md = ${Sizes.SZ_4.kt}) { +\"all = ${Sizes.SZ_6.kt}, "
                        +"md = ${Sizes.SZ_4.kt}\" }"
                    }
                }
            }
        }
    }
}
