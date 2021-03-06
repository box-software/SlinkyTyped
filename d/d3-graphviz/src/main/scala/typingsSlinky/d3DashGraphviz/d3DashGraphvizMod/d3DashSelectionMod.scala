package typingsSlinky.d3DashGraphviz.d3DashGraphvizMod

import typingsSlinky.d3DashSelection.d3DashSelectionMod.BaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("d3-selection", JSImport.Namespace)
@js.native
object d3DashSelectionMod extends js.Object {
  @js.native
  trait Selection[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends js.Object {
    /**
      * Returns a new graphviz renderer instance on the first element in the given selection. If a graphviz renderer instance already exists
      * on that element, instead returns the existing graphviz renderer instance.
      * @param options either a GraphvizOptions object representing the options of the graphviz renderer or a boolean representing the
      *                  useWorker option.
      */
    def graphviz(): Graphviz[GElement, Datum, PElement, PDatum] = js.native
    def graphviz(options: Boolean): Graphviz[GElement, Datum, PElement, PDatum] = js.native
    def graphviz(options: GraphvizOptions): Graphviz[GElement, Datum, PElement, PDatum] = js.native
    /**
      * For each selected element, selects the first descendant element that matches the specified selector string in the same ways as
      * d3-selection.select, but does not propagate any associated data from the current element to the corresponding selected element.
      */
    def selectWithoutDataPropagation(name: String): Selection[BaseType, Datum, PElement, PDatum] = js.native
  }
  
}

