@file:Suppress("NAME_SHADOWING")

package react.bootstrap.site.components.docs.layout.grid

import react.RBuilder
import react.bootstrap.layout.container
import react.bootstrap.layout.grid.Alignments
import react.bootstrap.layout.grid.ColAttributes
import react.bootstrap.layout.grid.OffsetAlignmentPair
import react.bootstrap.layout.grid.OffsetOrderAlignmentTriple
import react.bootstrap.layout.grid.OffsetOrderPair
import react.bootstrap.layout.grid.Offsets
import react.bootstrap.layout.grid.OrderAlignmentPair
import react.bootstrap.layout.grid.Orderings
import react.bootstrap.layout.grid.SizeAlignmentPair
import react.bootstrap.layout.grid.SizeOffsetAlignmentTriple
import react.bootstrap.layout.grid.SizeOffsetOrderAlignmentQuadruple
import react.bootstrap.layout.grid.SizeOffsetOrderTriple
import react.bootstrap.layout.grid.SizeOffsetPair
import react.bootstrap.layout.grid.SizeOrderAlignmentTriple
import react.bootstrap.layout.grid.SizeOrderPair
import react.bootstrap.layout.grid.Sizes
import react.bootstrap.layout.grid.col
import react.bootstrap.layout.grid.row
import react.bootstrap.site.components.docs.fixings.codeBox
import react.bootstrap.site.components.docs.fixings.contentTitle
import react.bootstrap.site.components.docs.fixings.example
import react.bootstrap.site.components.docs.fixings.flexColsExampleRow
import react.bootstrap.site.components.docs.formattedText
import react.bootstrap.site.components.docs.kt
import react.bootstrap.site.components.docs.ln
import react.dom.h3
import react.dom.h4
import react.dom.p
import kotlin.reflect.KFunction2

internal fun RBuilder.combining() {
    val sz = Offsets::sz.name
    val ord = Sizes::ord.name
    val off = Sizes::off.name
    val align = Sizes::align.name

    val sizes = Sizes::class.simpleName
    val sz4 = Sizes.SZ_4.kt

    val offsets = Offsets::class.simpleName
    val off1 = Offsets.OFF_1.kt

    val orderings = Orderings::class.simpleName
    val ord3 = Orderings.ORD_3.kt

    val alignments = Alignments::class.simpleName
    val end = Alignments.END.kt

    contentTitle("$sizes, $offsets, $orderings, $alignments")
    p {
        +"""
            As you can see in the examples above, all col attributes are set using the same arguments. Custom pairing
            functions are used to combine the values.
        """.trimIndent()
    }
    contentTitle(RBuilder::h3, "Combine with $sizes")
    formattedText {
        "Combine other attributes with <$sizes|code> by using <$sz|code>."
    }
    flexColsExampleRow {
        example {
            container {
                row {
                    col(all = Offsets.OFF_1 sz Sizes.SZ_4) { +"all = $off1 $sz $sz4" }
                    col { +"Reference" }
                }
                row {
                    col(all = Orderings.ORD_3 sz Sizes.SZ_4) { +"all = $ord3 $sz $sz4" }
                    col { +"Reference" }
                }
                row {
                    col(all = Alignments.END sz Sizes.SZ_4) { +"all = $end $sz $sz4" }
                    col { +"Reference" }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(Offsets::class)
            gridEnumImport(Orderings::class)
            gridEnumImport(Sizes::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $off1 $sz $sz4) { +\"all = $off1 $sz $sz4\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $ord3 $sz $sz4) { +\"all = $ord3 $sz $sz4\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $end $sz $sz4) { +\"all = $end $sz $sz4\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
            }
        }
    }

    contentTitle(RBuilder::h3, "Combine with $offsets")
    formattedText {
        "Combine other attributes with <$offsets|code> by using <$off|code>."
    }
    flexColsExampleRow {
        example {
            container {
                row {
                    col(all = Sizes.SZ_4 off Offsets.OFF_1) { +"all = $sz4 $off $off1" }
                    col { +"Reference" }
                }
                row {
                    col(all = Orderings.ORD_3 off Offsets.OFF_1) { +"all = $ord3 $off $off1" }
                    col { +"Reference" }
                }
                row {
                    col(all = Alignments.END off Offsets.OFF_1) { +"all = $end $off $off1" }
                    col { +"Reference" }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(Offsets::class)
            gridEnumImport(Orderings::class)
            gridEnumImport(Sizes::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $sz4 $off $off1) { +\"all = $sz4 $off $off1\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $ord3 $off $off1) { +\"all = $ord3 $off $off1\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $end $off $off1) { +\"all = $end $off $off1\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
            }
        }
    }

    contentTitle(RBuilder::h3, "Combine with $orderings")
    formattedText {
        "Combine other attributes with <$orderings|code> by using <$ord|code>."
    }
    flexColsExampleRow {
        example {
            container {
                row {
                    col(all = Sizes.SZ_4 ord Orderings.ORD_3) { +"all = $sz4 $ord $ord3" }
                    col { +"Reference" }
                }
                row {
                    col(all = Offsets.OFF_1 ord Orderings.ORD_3) { +"all = $off1 $ord $ord3" }
                    col { +"Reference" }
                }
                row {
                    col(all = Alignments.END ord Orderings.ORD_3) { +"all = $end $ord $ord3" }
                    col { +"Reference" }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(Offsets::class)
            gridEnumImport(Orderings::class)
            gridEnumImport(Sizes::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $sz4 $ord $ord3) { +\"all = $sz4 $ord $ord3\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $off1 $ord $ord3) { +\"all = $off1 $ord $ord3\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $end $ord $ord3) { +\"all = $end $ord $ord3\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
            }
        }
    }

    contentTitle(RBuilder::h3, "Combine with $alignments")
    formattedText {
        "Combine other attributes with <$alignments|code> by using <$align|code>."
    }
    flexColsExampleRow {
        example {
            container {
                row {
                    col(all = Sizes.SZ_4 align Alignments.END) { +"all = $sz4 $align $end" }
                    col { +"Reference" }
                }
                row {
                    col(all = Offsets.OFF_1 align Alignments.END) { +"all = $off1 $align $end" }
                    col { +"Reference" }
                }
                row {
                    col(all = Orderings.ORD_3 align Alignments.END) { +"all = $ord3 $align $end" }
                    col { +"Reference" }
                }
            }
        }
        codeBox {
            containerFunImport()
            gridEnumImport(Offsets::class)
            gridEnumImport(Orderings::class)
            gridEnumImport(Sizes::class)
            colFunImport()
            rowFunImport()
            ln { }
            ktContainer { il ->
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $sz4 $align $end) { +\"all = $sz4 $align $end\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $off1 $align $end) { +\"all = $off1 $align $end\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
                ktRow(il) { il ->
                    ln(il) { +"$colFun(all = $ord3 $align $end) { +\"all = $ord3 $align $end\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
            }
        }
    }

    contentTitle(RBuilder::h3, "Combine all")
    p {
        +"You can use the same pairing functions in any order to combine all attributes."
    }
    allPossibleCombinations()
}

private fun RBuilder.allPossibleCombinations() {
    val sizeToOffset = Pairing(Sizes.SZ_4, Offsets.OFF_1, Sizes::off)
    val sizeToOrder = Pairing(Sizes.SZ_4, Orderings.ORD_3, Sizes::ord)
    val sizeToAlignment = Pairing(Sizes.SZ_4, Alignments.END, Sizes::align)

    val offsetToOrder = Pairing(Offsets.OFF_1, Orderings.ORD_3, Offsets::ord)
    val offsetToAlignment = Pairing(Offsets.OFF_1, Alignments.END, Offsets::align)
    val offsetToSize = Pairing(Offsets.OFF_1, Sizes.SZ_4, Offsets::sz)

    val orderToSize = Pairing(Orderings.ORD_3, Sizes.SZ_4, Orderings::sz)
    val orderToOffset = Pairing(Orderings.ORD_3, Offsets.OFF_1, Orderings::off)
    val orderToAlignment = Pairing(Orderings.ORD_3, Alignments.END, Orderings::align)

    val alignmentToSize = Pairing(Alignments.END, Sizes.SZ_4, Alignments::sz)
    val alignmentToOffset = Pairing(Alignments.END, Offsets.OFF_1, Alignments::off)
    val alignmentToOrder = Pairing(Alignments.END, Orderings.ORD_3, Alignments::ord)

    val sizeOffsetOrderFun = SizeOffsetPair::ord
    val sizeOffsetAlignmentFun = SizeOffsetPair::align

    val sizeOrderOffsetFun = SizeOrderPair::off
    val sizeOrderAlignmentFun = SizeOrderPair::align

    val sizeAlignmentOffsetFun = SizeAlignmentPair::off
    val sizeAlignmentOrderFun = SizeAlignmentPair::ord

    val offsetOrderSizeFun = OffsetOrderPair::sz
    val offsetOrderAlignmentFun = OffsetOrderPair::align

    val offsetAlignmentSizeFun = OffsetAlignmentPair::sz
    val offsetAlignmentOrderFun = OffsetAlignmentPair::ord

    val orderAlignmentSizeFun = OrderAlignmentPair::sz
    val orderAlignmentOffsetFun = OrderAlignmentPair::off

    val sizeOffsetToOrder = Tripling(Orderings.ORD_3, sizeToOffset, offsetToSize, sizeOffsetOrderFun)
    val sizeOffsetToAlignment = Tripling(Alignments.END, sizeToOffset, offsetToSize, sizeOffsetAlignmentFun)

    val sizeOrderToOffset = Tripling(Offsets.OFF_1, sizeToOrder, orderToSize, sizeOrderOffsetFun)
    val sizeOrderToAlignment = Tripling(Alignments.END, sizeToOrder, orderToSize, sizeOrderAlignmentFun)

    val sizeAlignmentToOffset = Tripling(Offsets.OFF_1, sizeToAlignment, alignmentToSize, sizeAlignmentOffsetFun)
    val sizeAlignmentToOrder = Tripling(Orderings.ORD_3, sizeToAlignment, alignmentToSize, sizeAlignmentOrderFun)

    val offsetSizeToOrder = Tripling(Orderings.ORD_3, offsetToSize, sizeToOffset, sizeOffsetOrderFun)
    val offsetSizeToAlignment = Tripling(Alignments.END, offsetToSize, sizeToOffset, sizeOffsetAlignmentFun)

    val offsetOrderToSize = Tripling(Sizes.SZ_4, offsetToOrder, orderToOffset, offsetOrderSizeFun)
    val offsetOrderToAlignment = Tripling(Alignments.END, offsetToOrder, orderToOffset, offsetOrderAlignmentFun)

    val offsetAlignmentToSize = Tripling(Sizes.SZ_4, offsetToAlignment, alignmentToOffset, offsetAlignmentSizeFun)
    val offsetAlignmentToOrder =
        Tripling(Orderings.ORD_3, offsetToAlignment, alignmentToOffset, offsetAlignmentOrderFun)

    val orderSizeToOffset = Tripling(Offsets.OFF_1, orderToSize, sizeToOrder, sizeOrderOffsetFun)
    val orderSizeToAlignment = Tripling(Alignments.END, orderToSize, sizeToOrder, sizeOrderAlignmentFun)

    val orderOffsetToSize = Tripling(Sizes.SZ_4, orderToOffset, offsetToOrder, offsetOrderSizeFun)
    val orderOffsetToAlignment = Tripling(Alignments.END, orderToOffset, offsetToOrder, offsetOrderAlignmentFun)

    val orderAlignmentToSize = Tripling(Sizes.SZ_4, orderToAlignment, alignmentToOrder, orderAlignmentSizeFun)
    val orderAlignmentToOffset = Tripling(Offsets.OFF_1, orderToAlignment, alignmentToOrder, orderAlignmentOffsetFun)

    val alignmentSizeToOffset = Tripling(Offsets.OFF_1, alignmentToSize, sizeToAlignment, sizeAlignmentOffsetFun)
    val alignmentSizeToOrder = Tripling(Orderings.ORD_3, alignmentToSize, sizeToAlignment, sizeAlignmentOrderFun)

    val alignmentOffsetToSize = Tripling(Sizes.SZ_4, alignmentToOffset, offsetToAlignment, offsetAlignmentSizeFun)
    val alignmentOffsetToOrder =
        Tripling(Orderings.ORD_3, alignmentToOffset, offsetToAlignment, offsetAlignmentOrderFun)

    val alignmentOrderToSize = Tripling(Sizes.SZ_4, alignmentToOrder, orderToAlignment, orderAlignmentSizeFun)
    val alignmentOrderToOffset = Tripling(Offsets.OFF_1, alignmentToOrder, orderToAlignment, orderAlignmentOffsetFun)

    val sizeQuadruple = Quadruple(
        quadrupleThis = Sizes.SZ_4,
        quadrupleWith1 = offsetOrderToAlignment,
        quadrupleWith2 = offsetAlignmentToOrder,
        quadrupleWith3 = orderAlignmentToOffset,
        quadrupleWith4 = orderOffsetToAlignment,
        quadrupleWith5 = alignmentOffsetToOrder,
        quadrupleWith6 = alignmentOrderToOffset,
        quadrupleUsing = OffsetOrderAlignmentTriple::sz
    )

    val offsetQuadruple = Quadruple(
        quadrupleThis = Offsets.OFF_1,
        quadrupleWith1 = sizeOrderToAlignment,
        quadrupleWith2 = sizeAlignmentToOrder,
        quadrupleWith3 = orderAlignmentToSize,
        quadrupleWith4 = orderSizeToAlignment,
        quadrupleWith5 = alignmentSizeToOrder,
        quadrupleWith6 = alignmentOrderToSize,
        quadrupleUsing = SizeOrderAlignmentTriple::off
    )

    val orderQuadruple = Quadruple(
        quadrupleThis = Orderings.ORD_3,
        quadrupleWith1 = sizeOffsetToAlignment,
        quadrupleWith2 = sizeAlignmentToOffset,
        quadrupleWith3 = offsetAlignmentToSize,
        quadrupleWith4 = offsetSizeToAlignment,
        quadrupleWith5 = alignmentSizeToOffset,
        quadrupleWith6 = alignmentOffsetToSize,
        quadrupleUsing = SizeOffsetAlignmentTriple::ord
    )

    val alignmentQuadruple = Quadruple(
        quadrupleThis = Alignments.END,
        quadrupleWith1 = sizeOffsetToOrder,
        quadrupleWith2 = sizeOrderToOffset,
        quadrupleWith3 = offsetOrderToSize,
        quadrupleWith4 = offsetSizeToOrder,
        quadrupleWith5 = orderSizeToOffset,
        quadrupleWith6 = orderOffsetToSize,
        quadrupleUsing = SizeOffsetOrderTriple::align
    )

    val quadruples = listOf(sizeQuadruple, offsetQuadruple, orderQuadruple, alignmentQuadruple)

    val allTriplings = mutableListOf<Tripling<*, *, *, *, *>>()
    val allPairings = mutableListOf<Pairing<*, *, *>>()

    quadruples.forEach { quadruple ->
        quadruple.withList.forEach { tripling ->
            allTriplings.add(tripling)
            tripling.withList.forEach { pairing ->
                allPairings.add(pairing)
            }
        }
    }

    allPairings.toSet().forEach { pairing ->
        contentTitle(RBuilder::h4, "${pairing.thisClassName} + ${pairing.withClassName}")
        flexColsExampleRow {
            example {
                container {
                    row {
                        col(all = pairing.getPair()) { +"all = ${pairing.argString}" }
                        col { +"Reference" }
                    }
                }
            }
            val imports = listOf(pairing.thisClassName, pairing.withClassName).sortedBy { it }
            codeBox {
                containerFunImport()
                imports.forEach {
                    gridImport(it!!)
                }
                colFunImport()
                rowFunImport()
                ln { }
                ktConRow { il ->
                    ln(il) { +"$colFun(all = ${pairing.argString}) { +\"all = ${pairing.argString}\" }" }
                    ln(il) { +"$colFun { +\"Reference\" }" }
                }
            }
        }
    }

    val shownTriplings = mutableListOf<String>()
    allTriplings.toSet().forEach { tripling ->
        tripling.withList.forEach next@{ pairing ->
            val enumNames = listOf(pairing.thisClassName, pairing.withClassName, tripling.thisClassName)
            val combination = enumNames.joinToString(" + ")
            if (shownTriplings.contains(combination)) {
                return@next
            }
            shownTriplings.add(combination)

            val argString = "${pairing.argString} ${tripling.tripleUsing.name} ${tripling.thisString}"

            contentTitle(RBuilder::h4, combination) { }
            flexColsExampleRow {
                example {
                    container {
                        row {
                            col(all = tripling.getTriple()) { +"all = $argString" }
                            col { +"Reference" }
                        }
                    }
                }
                codeBox {
                    containerFunImport()
                    enumNames.sortedBy { it }.forEach {
                        gridImport(it!!)
                    }
                    colFunImport()
                    rowFunImport()
                    ln { }
                    ktConRow { il ->
                        ln(il) { +"$colFun(all = $argString) { +\"all = $argString\" }" }
                        ln(il) { +"$colFun { +\"Reference\" }" }
                    }
                }
            }
        }
    }

    val shownQuadruples = mutableListOf<String>()
    quadruples.forEach { quadruple ->
        quadruple.withList.forEach { tripling ->
            tripling.withList.forEach next@{ pairing ->
                val combination =
                    "${pairing.thisClassName} + ${pairing.withClassName} + ${tripling.thisClassName} + " +
                        "${quadruple.thisClassName}"
                if (shownQuadruples.contains(combination)) {
                    return@next
                }
                shownQuadruples.add(combination)

                val argString =
                    "${pairing.argString} ${tripling.tripleUsing.name} ${tripling.thisString} " +
                        "${quadruple.quadrupleUsing.name} ${quadruple.thisString}"

                contentTitle(RBuilder::h4, combination)
                flexColsExampleRow {
                    example {
                        container {
                            row {
                                col(all = quadruple.getQuadruple()) { +"all = $argString" }
                                col { +"Reference" }
                            }
                        }
                    }
                }
                codeBox {
                    containerFunImport()
                    gridEnumImport(Alignments::class)
                    gridEnumImport(Offsets::class)
                    gridEnumImport(Orderings::class)
                    gridEnumImport(Sizes::class)
                    colFunImport()
                    rowFunImport()
                    ln { }
                    ktConRow { il ->
                        ln(il) { +"$colFun(all = $argString) { +\"all = $argString\" }" }
                        ln(il) { +"$colFun { +\"Reference\" }" }
                    }
                }
            }
        }
    }
}

private data class Pairing<TA : ColAttributes, TB : ColAttributes, TP : ColAttributes>(
    val pairThis: TA,
    val pairWith: TB,
    val pairUsing: KFunction2<TA, TB, TP>
) {
    val thisClassName = when (pairThis) {
        is Sizes -> Sizes::class.simpleName
        is Offsets -> Offsets::class.simpleName
        is Orderings -> Orderings::class.simpleName
        is Alignments -> Alignments::class.simpleName
        else -> error("will never happen")
    }

    private val thisValueName = when (pairThis) {
        is Sizes -> pairThis.name
        is Offsets -> pairThis.name
        is Orderings -> pairThis.name
        is Alignments -> pairThis.name
        else -> error("will never happen")
    }

    val withClassName = when (pairWith) {
        is Sizes -> Sizes::class.simpleName
        is Offsets -> Offsets::class.simpleName
        is Orderings -> Orderings::class.simpleName
        is Alignments -> Alignments::class.simpleName
        else -> error("will never happen")
    }

    private val withValueName = when (pairWith) {
        is Sizes -> pairWith.name
        is Offsets -> pairWith.name
        is Orderings -> pairWith.name
        is Alignments -> pairWith.name
        else -> error("will never happen")
    }

    val thisString = "$thisClassName.$thisValueName"
    val withString = "$withClassName.$withValueName"

    val argString = "$thisString ${pairUsing.name} $withString"

    fun getPair() = pairUsing(pairThis, pairWith)
}

private data class Tripling<
    TA : ColAttributes,
    TB : ColAttributes,
    TC : ColAttributes,
    TP : ColAttributes,
    TT : ColAttributes
    >(
        val tripleThis: TA,
        val tripleWith1: Pairing<TB, TC, TP>,
        val tripleWith2: Pairing<TC, TB, TP>,
        val tripleUsing: KFunction2<TP, TA, TT>
    ) {
    val withList = listOf(
        tripleWith1,
        tripleWith2
    )

    val thisClassName = when (tripleThis) {
        is Sizes -> Sizes::class.simpleName
        is Offsets -> Offsets::class.simpleName
        is Orderings -> Orderings::class.simpleName
        is Alignments -> Alignments::class.simpleName
        else -> error("will never happen")
    }

    private val thisValueName = when (tripleThis) {
        is Sizes -> tripleThis.name
        is Offsets -> tripleThis.name
        is Orderings -> tripleThis.name
        is Alignments -> tripleThis.name
        else -> error("will never happen")
    }

    val thisString = "$thisClassName.$thisValueName"

    fun getTriple() = tripleUsing(tripleWith1.getPair(), tripleThis)
}

private data class Quadruple<
    TA : ColAttributes,
    TB : ColAttributes,
    TC : ColAttributes,
    TD : ColAttributes,
    TP1 : ColAttributes,
    TP2 : ColAttributes,
    TP3 : ColAttributes,
    TTT : ColAttributes
    >(
        val quadrupleThis: TA,
        val quadrupleWith1: Tripling<TD, TB, TC, TP1, TTT>,
        val quadrupleWith2: Tripling<TC, TB, TD, TP2, TTT>,
        val quadrupleWith3: Tripling<TB, TC, TD, TP3, TTT>,
        val quadrupleWith4: Tripling<TD, TC, TB, TP1, TTT>,
        val quadrupleWith5: Tripling<TC, TD, TB, TP2, TTT>,
        val quadrupleWith6: Tripling<TB, TD, TC, TP3, TTT>,
        val quadrupleUsing: KFunction2<TTT, TA, SizeOffsetOrderAlignmentQuadruple>
    ) {
    val withList = listOf(
        quadrupleWith1,
        quadrupleWith2,
        quadrupleWith3,
        quadrupleWith4,
        quadrupleWith5,
        quadrupleWith6
    )

    val thisClassName = when (quadrupleThis) {
        is Sizes -> Sizes::class.simpleName
        is Offsets -> Offsets::class.simpleName
        is Orderings -> Orderings::class.simpleName
        is Alignments -> Alignments::class.simpleName
        else -> error("will never happen")
    }

    private val thisValueName = when (quadrupleThis) {
        is Sizes -> quadrupleThis.name
        is Offsets -> quadrupleThis.name
        is Orderings -> quadrupleThis.name
        is Alignments -> quadrupleThis.name
        else -> error("will never happen")
    }

    val thisString = "$thisClassName.$thisValueName"

    fun getQuadruple() = quadrupleUsing(quadrupleWith1.getTriple(), quadrupleThis)
}
