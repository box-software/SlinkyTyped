package typingsSlinky.rdfDashJs.rdfDashJsMod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sink[Q /* <: BaseQuad */] extends js.Object {
  /**
    * Consumes the given stream.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * Depending on the use case, subtypes of EventEmitter or Stream are used.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  def `import`(stream: Stream[Q]): EventEmitter
}

object Sink {
  @scala.inline
  def apply[Q /* <: BaseQuad */](`import`: Stream[Q] => EventEmitter): Sink[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[Sink[Q]]
  }
}

