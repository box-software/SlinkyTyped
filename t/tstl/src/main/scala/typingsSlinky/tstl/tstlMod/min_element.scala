package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.functionalIPointerMod.IPointer.ValueType
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "min_element")
@js.native
object min_element extends js.Object {
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
}

