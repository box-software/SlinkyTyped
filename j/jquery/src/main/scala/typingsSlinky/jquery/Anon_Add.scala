package typingsSlinky.jquery

import typingsSlinky.jquery.JQuery.HandleObject
import typingsSlinky.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * Each time an event handler is added to an element through an API such as `.on()`, jQuery calls this hook. The `this` keyword will be the element to which the event handler is being added, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#add-function-handleobj }\`
    */
  def add(handleObj: HandleObject[TTarget, TData]): Unit
}

object Anon_Add {
  @scala.inline
  def apply[TTarget, TData](add: HandleObject[TTarget, TData] => Unit): Anon_Add[TTarget, TData] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
  
    __obj.asInstanceOf[Anon_Add[TTarget, TData]]
  }
}

